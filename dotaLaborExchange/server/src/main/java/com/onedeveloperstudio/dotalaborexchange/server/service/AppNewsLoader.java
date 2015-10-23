package com.onedeveloperstudio.dotalaborexchange.server.service;

import com.lukaspradel.steamapi.core.exception.SteamApiException;
import com.lukaspradel.steamapi.data.json.appnews.GetNewsForApp;
import com.lukaspradel.steamapi.webapi.client.SteamWebApiClient;
import com.lukaspradel.steamapi.webapi.request.GetNewsForAppRequest;
import com.lukaspradel.steamapi.webapi.request.SteamWebApiRequest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * User: y.zakharov
 * Date: 15.10.2015
 */
public class AppNewsLoader {
  private Map<String, GetNewsForApp> map;
  public static final String API_KEY = "50D7DE7BE3ACF91938D1DBB7DB5E5DAF";
  private SteamWebApiClient client;
  private SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

  public AppNewsLoader() {
    map = new HashMap<>();
    client = new SteamWebApiClient.SteamWebApiClientBuilder(API_KEY).build();
  }

  private GetNewsForApp getNews(Integer appId) {
    GetNewsForApp result = map.get(appId + sdf.format(new Date()));
    if (result == null) {
      SteamWebApiRequest request = new GetNewsForAppRequest.GetNewsForAppRequestBuilder(appId).buildRequest();
      try {
        result = client.processRequest(request);
        map.keySet().stream().filter(key -> key.startsWith(String.valueOf(appId))).forEach(map::remove);
        map.put(appId + sdf.format(new Date()), result);
      } catch (SteamApiException e) {
        e.printStackTrace();
      }
    }
    return result;
  }
}
