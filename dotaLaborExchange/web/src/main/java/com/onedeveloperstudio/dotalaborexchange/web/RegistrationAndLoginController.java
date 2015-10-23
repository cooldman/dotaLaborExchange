package com.onedeveloperstudio.dotalaborexchange.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * User: y.zakharov
 * Date: 20.08.14
 */
@Controller
public class RegistrationAndLoginController {

  @RequestMapping("/example.php")
  public String exmplePage(HttpServletRequest request) {
    String openIdIdentity = (String) request.getParameterMap().get("openid.identity");

    return "/login";
  }

  @RequestMapping("/login")
  public String loginPage(HttpServletRequest request) {
    return "/login";
  }

}
