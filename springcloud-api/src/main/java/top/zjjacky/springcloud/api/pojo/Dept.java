package top.zjjacky.springcloud.api.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.OutputStream;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true) //链式写法
public class Dept implements Serializable {

    private Long dnum;//主键
    private String dname;//部门名字
    private String db_source;//当前所用数据库

    public Dept(String dname) {
        this.dname = dname;
    }
}
