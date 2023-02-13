package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.atguigu.gulimall.product.service.AttrService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class GulimallProductApplicationTests {

    @Autowired
    AttrService attrService;

    @Test
    void contextLoads() {
//        AttrEntity entity = new AttrEntity();
//        entity.setAttrName("计算机");
//        attrService.save(entity);
//        System.out.println("执行成功");
    }

}
