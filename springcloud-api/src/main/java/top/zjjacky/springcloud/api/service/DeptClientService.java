package top.zjjacky.springcloud.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import top.zjjacky.springcloud.api.pojo.Dept;

import java.util.List;

@Service
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @GetMapping("/consumer/dept/queryDeptById/{id}")
    public Dept queryDeptById(@PathVariable("id") Long id);

    @GetMapping("/consumer/dept/queryAll")
    public List<Dept> queryAll();

    @PostMapping("/consumer/dept/addition")
    public Boolean add(Dept dept);
}
