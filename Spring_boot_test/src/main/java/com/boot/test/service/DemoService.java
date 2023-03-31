package com.boot.test.service;

import com.boot.test.dto.DemoDaoUseJdbcTemplate;
import com.boot.test.po.DemoPO;
import com.boot.test.repository.IDemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 *  简单业务逻辑层
 * @author masl
 * @version 1.0
 * @data 2023-03-19
 */
@Service("DemoService")
public class DemoService {

    @Autowired  //自动装配DAO
    private IDemoRepository demoRepository;

    @Autowired
    private DemoDaoUseJdbcTemplate daoUseJdbcTemplate;


    @Transactional     //事务机制
    public void save(DemoPO po) {
        demoRepository.save(po);
    }


    public DemoPO getById(Long id){
        return  daoUseJdbcTemplate.getById(id);
    }







}
