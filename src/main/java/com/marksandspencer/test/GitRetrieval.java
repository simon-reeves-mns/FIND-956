package com.marksandspencer.test;

import java.io.IOException;
import org.kohsuke.github.GHBranch;
import org.kohsuke.github.GHContent;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GitRetrieval implements Runnable{

  private static final Logger LOGGER = LoggerFactory.getLogger(GitRetrieval.class);

  private final RestTemplate restTemplate;

  private final String gitToken;
  private final String repository;
  private final String gitUser;
  private final String gitBranch;
  private final String gitPath;

  public GitRetrieval(RestTemplate restTemplate,
      @Value("${git.token}")
      String gitToken,
      @Value("${git.repository}")
      String gitRepo,
      @Value("${git.user}")
      String gitUser,
      @Value("${git.branch}")
      String gitBranch,
      @Value("${git.path}")
      String gitPath){
    this.restTemplate = restTemplate;

    this.gitToken = gitToken;
    this.repository = gitRepo;
    this.gitUser = gitUser;
    this.gitBranch = gitBranch;
    this.gitPath = gitPath;
  }

  public void run(){

    LOGGER.info("GitRetrieval starting");

    try {

      // Try Personal Access Token(PAT)
      GitHub gitHub = new GitHubBuilder().withOAuthToken(gitToken, gitUser).build();

      GHRepository repo = gitHub.getRepository(repository);

      LOGGER.info("Got GHRepo : {}", repo);

      GHBranch ghBranch = repo.getBranch(gitBranch);

      LOGGER.info("Got GHBrnach : {}", ghBranch);

      GHContent fileContents = repo.getFileContent(gitPath);

      String content = new String(fileContents.read().readAllBytes());

      LOGGER.info(content);

    } catch (IOException e) {
      LOGGER.error("Exception ",e);
    }

    LOGGER.info("GitRetrieval ends");

  }

}
