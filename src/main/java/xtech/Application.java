package xtech;

import com.orbitz.consul.Consul;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableRetry
public class Application {

    @Bean
    public Consul consul(@Value("${consul.host:192.168.99.100}") String host) {
        return Consul.builder().withUrl(String.format("http://%s:8500", host))
                .build();
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }
}
