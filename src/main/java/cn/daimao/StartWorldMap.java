package cn.daimao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("cn.daimao.mapper")
public class StartWorldMap {
    public static void main(String[] args) {
        SpringApplication.run(StartWorldMap.class,args);
    }
}
