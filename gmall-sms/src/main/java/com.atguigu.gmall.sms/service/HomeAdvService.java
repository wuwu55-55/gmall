package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.HomeAdvEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 首页轮播广告
 *
 * @author yuanyuanyuan
 * @email wu-5-50@qq.com
 * @date 2019-09-24 07:51:13
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageVo queryPage(QueryCondition params);
}

