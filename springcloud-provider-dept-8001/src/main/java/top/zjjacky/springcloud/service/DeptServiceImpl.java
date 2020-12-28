package top.zjjacky.springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zjjacky.springcloud.api.pojo.Dept;
import top.zjjacky.springcloud.dao.DeptDao;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryDeptById(Long id) {
        return deptDao.queryDeptById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
