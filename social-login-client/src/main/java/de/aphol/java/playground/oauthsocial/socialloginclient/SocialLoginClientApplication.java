package de.aphol.java.playground.oauthsocial.socialloginclient;

import de.aphol.java.playground.oauthsocial.socialloginclient.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class SocialLoginClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocialLoginClientApplication.class, args);
    }

}
