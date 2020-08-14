package com.marksandspencer;

import com.marksandspencer.test.GitRetrieval;
import com.marksandspencer.test.ProductSerializationTest;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Application {

  private static Logger LOGGER = LoggerFactory.getLogger(Application.class);

  private final ProductSerializationTest productSerializationTest;
  private final GitRetrieval gitRetrieval;

  public Application(ProductSerializationTest productSerializationTest,
      GitRetrieval gitRetrieval) {
    this.productSerializationTest = productSerializationTest;
    this.gitRetrieval = gitRetrieval;
  }

  public static void main(String[] args) {

    SpringApplication.run(Application.class, args);

  }

  @Bean
  public CommandLineRunner commandLineRunner() {
    return args -> {
      Arrays.stream(args).forEach(this::testOption);
    };
  }

  public void testOption(String arg) {

    switch (arg) {
      case "mapSerialization":
        LOGGER.info("Running option : MapSerialization");
        productSerializationTest.run();
        break;
      case "GitRetrieval":
        LOGGER.info("Running option : GitRetrieval");
        gitRetrieval.run();
        break;
      default:
        LOGGER.error("UNKNOWN option : {}", arg);
    }
  }


}
