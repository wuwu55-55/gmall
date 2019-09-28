package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.AttrAttrgroupRelationEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;

import java.util.List;


/**
 * 属性&属性分组关联
 *
 * @author yuanyuanyuan
 * @email wu-5-50@qq.com
 * @date 2019-09-24 17:08:58
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageVo queryPage(QueryCondition params);

    void delete(List<AttrAttrgroupRelationEntity> relationEntities);
}

