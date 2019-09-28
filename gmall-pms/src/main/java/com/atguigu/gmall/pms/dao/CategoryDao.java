package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yuanyuanyuan
 * @email wu-5-50@qq.com
 * @date 2019-09-24 17:08:58
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
