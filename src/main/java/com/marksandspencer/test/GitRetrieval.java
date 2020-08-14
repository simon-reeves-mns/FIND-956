package com.marksandspencer.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GitRetrieval implements Runnable{

  private static final Logger LOGGER = LoggerFactory.getLogger(GitRetrieval.class);

  private final RestTemplate restTemplate;

  public GitRetrieval(RestTemplate restTemplate){
    this.restTemplate = restTemplate;

  }

  public void run(){

    LOGGER.info("GitRetrieval starting");



    LOGGER.info("GitRetrieval ends");

  }

}
