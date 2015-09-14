package com.onedeveloperstudio.dotalaborexchange.common.user;

import com.onedeveloperstudio.dotalaborexchange.common.dto.BaseDto;
import com.onedeveloperstudio.dotalaborexchange.common.dto.LinkedAccount;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 * User: y.zakharov
 * Date: 08.09.2015
 */
public class UserDto extends BaseDto implements UserDetails {
  private String fio;
  private String nickname;
  private String address;
  private List<LinkedAccount> linkedAccounts;
  private String information;


  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return null;
  }

  @Override
  public String getPassword() {
    return null;
  }

  @Override
  public String getUsername() {
    return getNickname();
  }

  @Override
  public boolean isAccountNonExpired() {
    return false;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return false;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  public String getFio() {
    return fio;
  }

  public void setFio(String fio) {
    this.fio = fio;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public List<LinkedAccount> getLinkedAccounts() {
    return linkedAccounts;
  }

  public void setLinkedAccounts(List<LinkedAccount> linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }

  public String getInformation() {
    return information;
  }

  public void setInformation(String information) {
    this.information = information;
  }
}
