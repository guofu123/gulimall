package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author guguofu
 * @email 3165177264@qq.com
 * @date 2023-02-12 10:50:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
