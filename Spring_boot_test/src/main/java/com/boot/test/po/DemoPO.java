package com.boot.test.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
/**
 * 测试实体类
 * @author Msl
 * @create 2022-04-28 16:39
 */
@Table(name = "demo",schema = "Springboottest")
@Entity
public class DemoPO {

    //主键id
    @javax.persistence.Id
    @GeneratedValue
    private Long Id;

    //测试名称
    private String name;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public DemoPO(){
        super();
    }

    public  DemoPO (Long id , String name ){
        super();
        this.Id = id;
        this.name = name;
    }

}
