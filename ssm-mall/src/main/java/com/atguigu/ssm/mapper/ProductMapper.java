package com.atguigu.ssm.mapper;

import com.atguigu.ssm.pojo.Product;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    public Product getProductByName(@Param("name") String name) ;
}
