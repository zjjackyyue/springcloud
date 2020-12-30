package top.zjjacky.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    //IRule
    //RoundRobinRule 轮询
    //RandomRule 随机
    //AvailabilityFilteringRule:过滤，跳闸，访问故障服务，轮询
    //RetryRule:会先按照轮询获取服务，如果获取失败，则会在指定时间内重试
    @Bean
    @LoadBalanced //Ribbon
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
