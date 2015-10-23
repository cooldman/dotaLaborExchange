package com.onedeveloperstudio.dotalaborexchange.server.service;

import com.lukaspradel.steamapi.core.exception.SteamApiException;
import com.lukaspradel.steamapi.data.json.playersummaries.GetPlayerSummaries;
import com.lukaspradel.steamapi.data.json.playersummaries.Player;
import com.lukaspradel.steamapi.webapi.client.SteamWebApiClient;
import com.lukaspradel.steamapi.webapi.request.GetPlayerSummariesRequest;
import com.lukaspradel.steamapi.webapi.request.SteamWebApiRequest;

import java.util.Arrays;

/**
 * User: y.zakharov
 * Date: 15.09.2015
 */
public class SteamInfoLoader {
  private static final Integer DOTA_ID = 570;
  public static final String API_KEY = "50D7DE7BE3ACF91938D1DBB7DB5E5DAF";
  private SteamWebApiClient client = new SteamWebApiClient.SteamWebApiClientBuilder(API_KEY).build();
  private String accountId;


  public SteamInfoLoader(String accountId) {
    this.accountId = accountId;
  }


  public GetPlayerSummaries getPlayerSummaries() {
    SteamWebApiRequest request
        = new GetPlayerSummariesRequest.GetPlayerSummariesRequestBuilder(Arrays.asList(accountId)).buildRequest();
    try {
      GetPlayerSummaries obj = client.processRequest(request);
      Player player = obj.getResponse().getPlayers().get(0);

      return obj;
    } catch (SteamApiException e) {
      e.printStackTrace();
    }
    return null;
  }



}
