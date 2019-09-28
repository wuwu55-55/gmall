package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author yuanyuanyuan
 * @email wu-5-50@qq.com
 * @date 2019-09-24 07:51:13
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
