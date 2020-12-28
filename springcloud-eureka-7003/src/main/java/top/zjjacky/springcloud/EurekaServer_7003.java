package top.zjjacky.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//启动之后，访问localhost:7003
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer_7003 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7003.class, args);
    }
}
