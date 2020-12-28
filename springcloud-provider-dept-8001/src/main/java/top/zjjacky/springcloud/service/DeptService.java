package top.zjjacky.springcloud.service;

import org.springframework.stereotype.Service;
import top.zjjacky.springcloud.api.pojo.Dept;

import java.util.List;

public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept queryDeptById(Long id);

    public List<Dept> queryAll();
}
