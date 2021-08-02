package by.learning.roomclr;

import by.learning.roomclr.model.Room;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

@Slf4j

@SpringBootApplication
public class RoomClrApplication {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.build();
    }

    @Bean
    public CommandLineRunner commandLineRunner(RestTemplate restTemplate) {
        return args -> {
            log.info("Starting CLR application");

            ResponseEntity<List<Room>> rooms =
                    restTemplate.exchange("http://localhost:8080/api/rooms",
                                          HttpMethod.GET, null, new ParameterizedTypeReference<List<Room>>() {
                            });

            rooms.getBody().forEach(room -> {
                log.info(room.toString());
            });

            log.info("Finishing CLR application");
        };
    }

    @Bean
    public CommandLineRunner fizzBuzz() {
        return args -> {
            log.info("Starting FizzBuzz application");

            IntStream.rangeClosed(1, 100)
                    .mapToObj(value -> {
                        String result = Strings.EMPTY;
                        result += value % 3 == 0 ? "Fizz" : Strings.EMPTY;
                        result += value % 5 == 0 ? "Buzz" : Strings.EMPTY;
                        return result.isEmpty() ? String.valueOf(value) : result;
                    })
                    .forEach(log::info);

            log.info("Finishing FizzBuzz application");
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(RoomClrApplication.class, args);
    }

}
