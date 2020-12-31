package top.zjjacky.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Config_Server_3344 {

    public static void main(String[] args) {
        SpringApplication.run(Config_Server_3344.class, args);
    }
}
