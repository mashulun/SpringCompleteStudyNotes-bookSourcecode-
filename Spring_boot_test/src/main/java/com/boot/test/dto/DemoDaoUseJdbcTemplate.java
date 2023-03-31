package com.boot.test.dto;

import com.boot.test.po.DemoPO;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * 使用 JPA jdbc 模板操作数据
 *
 * @author masl
 * @version 1.0
 * @data 2023-03-19
 */
@Repository("demoDao1")
public class DemoDaoUseJdbcTemplate {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    /**
     * 根据主键获取数据
     *
     * @param id 主键
     * @return 实体对象
     */
    public DemoPO getById(Long id) {
        String sql = "select * from demo where id = ?";
        //获取数据映射
        RowMapper<DemoPO> mapper = new BeanPropertyRowMapper<>(DemoPO.class);
        return jdbcTemplate.queryForObject(sql, mapper, id);
    }


}
