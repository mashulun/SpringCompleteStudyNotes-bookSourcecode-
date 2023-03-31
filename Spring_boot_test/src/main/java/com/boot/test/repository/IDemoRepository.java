package com.boot.test.repository;

import com.boot.test.po.DemoPO;
import org.springframework.data.repository.CrudRepository;

/**
 *
 *  Demo表的DAO层接口 ,并没具体实现,继承基础的CRUD
 * @author masl
 * @version 1.0
 * @data 2023-03-19
 */
public interface IDemoRepository extends CrudRepository<DemoPO,Integer> {
}
