package com.marksandspencer;

import com.marksandspencer.test.GitRetrieval;
import com.marksandspencer.test.ProductSerializationTest;
import com.marksandspencer.test.SchemaCombine;
import java.util.Arrays;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@AllArgsConstructor
public class Application {

  private static Logger LOGGER = LoggerFactory.getLogger(Application.class);

  private final ProductSerializationTest productSerializationTest;
  private final GitRetrieval gitRetrieval;
  private final SchemaCombine schemaCombine;

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
        LOGGER.info("Running option : {}",arg);
        productSerializationTest.run();
        break;
      case "GitRetrieval":
        LOGGER.info("Running option : {}",arg);
        gitRetrieval.run();
        break;

      case "SchemaCombine":
        LOGGER.info("Running option : {}",arg);
        schemaCombine.run();
        break;
      default:
        LOGGER.error("UNKNOWN option : {}", arg);
    }
  }


}
