package com.onedeveloperstudio.dotalaborexchange.server.service;

import com.onedeveloperstudio.dotalaborexchange.common.user.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * User: y.zakharov
 * Date: 08.09.2015
 */
public class AuthorizedUserDetailsService implements UserDetailsService {
  @Override
  public UserDto loadUserByUsername(String username) throws UsernameNotFoundException {
    return null;
  }
}
