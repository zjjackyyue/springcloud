package top.zjjacky.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.zjjacky.springcloud.api.pojo.Dept;
import top.zjjacky.springcloud.service.DeptService;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/queryDeptById/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGet")//如果这个方法调用失败，那么调用下面的hystrixGet方法
    public Dept queryDeptById(@PathVariable("id") Long id) {
        Dept dept = deptService.queryDeptById(id);

        if (dept == null) {
            throw new RuntimeException("id=>" + id + "不存在该用户，或者信息无法找到");
        }

        return dept;
    }

    //备选方案
    public Dept hystrixGet(@PathVariable("id") Long id) {
        return new Dept()
                .setDnum(id)
                .setDname("id=>" + id + "，没有对应的信息, null--@Hystrix")
                .setDb_source("database is doesn't exsist");
    }
}
