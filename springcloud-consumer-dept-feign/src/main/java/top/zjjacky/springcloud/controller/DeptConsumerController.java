package top.zjjacky.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zjjacky.springcloud.api.pojo.Dept;
import top.zjjacky.springcloud.api.service.DeptClientService;

import java.util.List;

@RestController
public class DeptConsumerController {

    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";//访问eureka配置中心里面的application.name

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping("/dept/addition")
    public boolean add(Dept dept) {
        return this.deptClientService.add(dept);
    }

    @RequestMapping("/dept/queryDeptById/{id}")
    public Dept queryDeptById(@PathVariable("id") Long id) {
        return this.deptClientService.queryDeptById(id);
    }

    @RequestMapping("/dept/queryAll")
    public List<Dept> queryAll() {
        return this.deptClientService.queryAll();
    }
}
