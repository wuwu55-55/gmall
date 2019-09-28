package com.atguigu.gmall.pms.service;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


/**
 * 商品三级分类
 *
 * @author yuanyuanyuan
 * @email wu-5-50@qq.com
 * @date 2019-09-24 17:08:58
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageVo queryPage(QueryCondition params);

    /**
     * 根据分类等级或者分类的父id查询分类信息
     * @param level
     * @param parentCid
     * @return
     */
    List<CategoryEntity> queryCategory(Integer level, Long parentCid);
}

