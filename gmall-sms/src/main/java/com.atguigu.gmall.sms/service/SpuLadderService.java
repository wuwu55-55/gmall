package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.SpuLadderEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品阶梯价格
 *
 * @author yuanyuanyuan
 * @email wu-5-50@qq.com
 * @date 2019-09-24 07:51:13
 */
public interface SpuLadderService extends IService<SpuLadderEntity> {

    PageVo queryPage(QueryCondition params);
}

