package com.atguigu.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.product.dao.CategoryDao;
import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 获取多级菜单组合
     * @return
     */
    @Override
    public List<CategoryEntity> getCategoryMenu(){
        List<CategoryEntity> categories = this.list();
        List<CategoryEntity> levelV1 = new ArrayList<>();
        for (CategoryEntity cate : categories) {
            if (cate.getParentCid().intValue() == 0) {
                cate.setChildCategory(getChildCategoryMenu(cate.getCatId(), categories));
                levelV1.add(cate);
            }
        }
        return  levelV1;
    }

    public List<CategoryEntity> getChildCategoryMenu(Long cid, List<CategoryEntity> categories){
        ArrayList<CategoryEntity> categoryEntities = new ArrayList<>();
        for (CategoryEntity cate : categories) {
            if (cate.getParentCid().equals(cid)){
                cate.setChildCategory(getChildCategoryMenu(cate.getCatId(),categories));
                categoryEntities.add(cate);
            }
        }
        if (categoryEntities.size()==0){
            return null;
        }else {
            return categoryEntities;
        }
    }

}