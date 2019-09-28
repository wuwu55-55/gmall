package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.MemberStatisticsInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 会员统计信息
 *
 * @author yuanyuanyuan
 * @email wu-5-50@qq.com
 * @date 2019-09-23 18:13:38
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

