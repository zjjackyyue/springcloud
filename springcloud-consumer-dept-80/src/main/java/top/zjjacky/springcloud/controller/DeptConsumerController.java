package top.zjjacky.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.zjjacky.springcloud.api.pojo.Dept;

import java.util.List;

@RestController
public class DeptConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT ";

    @RequestMapping("/consumer/dept/addition")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @RequestMapping("/consumer/dept/queryDeptById/{id}")
    public Dept queryDeptById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "//dept/queryDeptById/{id}", Dept.class, id);
    }

    @RequestMapping("/consumer/dept/queryAll")
    public List<Dept> queryAll() {
        return restTemplate.getForObject(REST_URL_PREFIX + "//dept/queryAll", List.class);
    }
}
