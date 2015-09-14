package com.onedeveloperstudio.dotalaborexchange.common.dto;

import com.onedeveloperstudio.dotalaborexchange.common.SocialMedia;
import com.onedeveloperstudio.dotalaborexchange.common.user.UserDto;

/**
 * User: y.zakharov
 * Date: 08.09.2015
 */
public class LinkedAccount extends BaseDto{
  private UserDto user;
  private SocialMedia media;
  private String link;

  public UserDto getUser() {
    return user;
  }

  public void setUser(UserDto user) {
    this.user = user;
  }

  public SocialMedia getMedia() {
    return media;
  }

  public void setMedia(SocialMedia media) {
    this.media = media;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }
}
