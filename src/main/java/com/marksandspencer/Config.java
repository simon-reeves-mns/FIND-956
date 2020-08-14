package com.marksandspencer;

import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

  @Value("${http.maxPerRoute:100}")
  private int maxPerRoute;
  @Value("${http.maxTotal:100}")
  private int maxTotal;
  @Value("${http.connectionRequestTimeout:5000}")
  private int connectionRequestTimeout;
  @Value("${http.connectTimeout:5000}")
  private int connectTimeout;
  @Value("${http.socketTimeout:5000}")
  private int socketTimeout;


  @Bean
  public RestTemplate getRestTemplate(HttpClient httpClient) {
    HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory(
        HttpClients.createDefault());

    httpRequestFactory.setHttpClient(httpClient);
    RestTemplate restTemplate = new RestTemplate(httpRequestFactory);

    return restTemplate;
  }

  @Bean
  public PoolingHttpClientConnectionManager poolingHttpClientConnectionManager() {
    PoolingHttpClientConnectionManager result = new PoolingHttpClientConnectionManager();
    result.setDefaultMaxPerRoute(maxPerRoute);
    result.setMaxTotal(maxTotal);
    return result;
  }

  @Bean
  public CloseableHttpClient httpClient(
      PoolingHttpClientConnectionManager poolingHttpClientConnectionManager,
      RequestConfig requestConfig) {
    CloseableHttpClient result = HttpClientBuilder.create().setConnectionManager(poolingHttpClientConnectionManager)
        .setDefaultRequestConfig(requestConfig).build();
    return result;
  }

  @Bean
  public RequestConfig requestConfig() {
    RequestConfig result = RequestConfig.custom().setConnectionRequestTimeout(connectionRequestTimeout)
        .setConnectTimeout(connectTimeout).setSocketTimeout(socketTimeout).build();
    return result;
  }
}
