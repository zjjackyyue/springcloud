package top.zjjacky.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.zjjacky.springcloud.api.pojo.Dept;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept queryDeptById(Long id);

    public List<Dept> queryAll();
}
