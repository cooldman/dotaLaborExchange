package com.onedeveloperstudio.dotalaborexchange.web;

import com.onedeveloperstudio.dotalaborexchange.common.user.ULoginUser;
import flexjson.JSONDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.authentication.dao.SaltSource;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * User: y.zakharov
 * Date: 20.08.14
 */
@Controller
public class RegistrationAndLoginController {
  private final String USER_AGENT = "Mozilla/5.0";
  private final String DUMMY_PASSWORD = "DUMMY_PASSWORD";

/*  @Autowired
  private UserDetailsService service;*/

/*  @Autowired
  private SysUserService sysUserService;*/

/*  @Autowired
  private PasswordEncoder passwordEncoder;
  @Autowired
  private SaltSource saltSource;*/
  private JSONDeserializer<ULoginUser> serializer = new JSONDeserializer<>();

/*
  @Qualifier("authenticationProvider")
  @Autowired
  private DaoAuthenticationProvider provider;
*/

  @RequestMapping("/example.php")
  public String exmplePage(HttpServletRequest request) {
    request.getParameterMap().get("openid.identity");
    return "/login";
  }

  @RequestMapping("/login")
  public String loginPage(HttpServletRequest request) {
    return "/login";
  }

  /**
   * коллбэк при авторизации пользователя
   *
   * @param request
   * @throws Exception
   */
  @RequestMapping("/login_callback")
  public String loginCallback(HttpServletRequest request) {
    String token = request.getParameter("token");
    try {
      String answer = sendGet(token);
      InputStream stream = new ByteArrayInputStream(answer.getBytes());
      Reader reader = new InputStreamReader(stream);
      ULoginUser user = serializer.deserialize(reader, ULoginUser.class);
      System.out.println(123);
      //user.setPassword(passwordEncoder.encodePassword(DUMMY_PASSWORD, saltSource.getSalt(new User(user.getEmail(), DUMMY_PASSWORD, "", null))));
/*      SysUserDto sysUserDto = MappingUtils.fromULoginUserToDto(user);
      SysUserDto dto = sysUserService.loadByEmail(user.getEmail());
      if (dto != null && dto.getId()!=null) {
        sysUserDto.setId(dto.getId());
        sysUserService.update(sysUserDto);
      } else {
        sysUserDto.setRegdate(new Date().getTime());
        sysUserService.insert(sysUserDto);
      }*/
      //Authentication auth = provider.authenticate(new UsernamePasswordAuthenticationToken(user.getEmail(), DUMMY_PASSWORD));
      //SecurityContextHolder.getContext().setAuthentication(auth);
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Не удалось получить данные о пользователе");
    }
    return "redirect:/";
  }

  /**
   * Отправляем запрос на получение данных о пользователе
   *
   * @param token - токен, полученный от ulogin
   * @return json - ответ-информация о пользователе
   * @throws Exception
   */
  private String sendGet(String token) throws Exception {
    String url = "http://ulogin.ru/token.php?token=" + token + "&host=" + "localhost:8080/jobSkills";
    URL obj = new URL(url);
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
    con.setRequestMethod("GET");
    con.setRequestProperty("User-Agent", USER_AGENT);
    int responseCode = con.getResponseCode();
    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
    String inputLine;
    StringBuffer response = new StringBuffer();
    while ((inputLine = in.readLine()) != null) {
      response.append(inputLine);
    }
    in.close();
    return response.toString();
  }
}