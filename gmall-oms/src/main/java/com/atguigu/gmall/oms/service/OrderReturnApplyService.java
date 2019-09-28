package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.oms.entity.OrderReturnApplyEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 订单退货申请
 *
 * @author yuanyuanyuan
 * @email wu-5-50@qq.com
 * @date 2019-09-23 18:34:38
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageVo queryPage(QueryCondition params);
}

