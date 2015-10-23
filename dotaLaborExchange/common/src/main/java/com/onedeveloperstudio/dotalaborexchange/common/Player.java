package com.onedeveloperstudio.dotalaborexchange.common;

import com.onedeveloperstudio.dotalaborexchange.common.dto.BaseDto;

/**
 * User: y.zakharov
 * Date: 14.10.2015
 */
public class Player extends BaseDto{
  private String login;
  private String realName;
  private String steamId;
  private Integer timeCreated;
  private String avatarUrl;
  private String avatarFullUrl;
  private String avatarMediumUrl;
  private Integer lastLogOff;

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }

  public String getSteamId() {
    return steamId;
  }

  public void setSteamId(String steamId) {
    this.steamId = steamId;
  }

  public Integer getTimeCreated() {
    return timeCreated;
  }

  public void setTimeCreated(Integer timeCreated) {
    this.timeCreated = timeCreated;
  }

  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public String getAvatarFullUrl() {
    return avatarFullUrl;
  }

  public void setAvatarFullUrl(String avatarFullUrl) {
    this.avatarFullUrl = avatarFullUrl;
  }

  public String getAvatarMediumUrl() {
    return avatarMediumUrl;
  }

  public void setAvatarMediumUrl(String avatarMediumUrl) {
    this.avatarMediumUrl = avatarMediumUrl;
  }

  public Integer getLastLogOff() {
    return lastLogOff;
  }

  public void setLastLogOff(Integer lastLogOff) {
    this.lastLogOff = lastLogOff;
  }
}
