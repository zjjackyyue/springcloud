package top.zjjacky.myRule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.zjjacky.springcloud.config.ZjjackyRandomRule;

@Configuration
public class ZjjackyRule {

    @Bean
    public IRule myRule() {
        return new ZjjackyRandomRule();
    }
}
