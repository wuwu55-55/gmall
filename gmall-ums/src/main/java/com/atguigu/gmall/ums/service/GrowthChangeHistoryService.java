package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.GrowthChangeHistoryEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 成长值变化历史记录
 *
 * @author yuanyuanyuan
 * @email wu-5-50@qq.com
 * @date 2019-09-23 18:13:38
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

