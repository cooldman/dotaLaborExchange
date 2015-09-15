package com.onedeveloperstudio.dotalaborexchange.server.service;

import com.lukaspradel.steamapi.webapi.client.SteamWebApiClient;

/**
 * User: y.zakharov
 * Date: 15.09.2015
 */
public class SteamInfoLoader {
  SteamWebApiClient client = new SteamWebApiClient.SteamWebApiClientBuilder("Your-Web-API-Key").build();
}
