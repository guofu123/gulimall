package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author guguofu
 * @email 3165177264@qq.com
 * @date 2023-02-12 13:27:05
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
