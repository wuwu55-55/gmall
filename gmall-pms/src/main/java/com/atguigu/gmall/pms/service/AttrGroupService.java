package com.atguigu.gmall.pms.service;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.gmall.pms.entity.AttrGroupEntity;
import com.atguigu.gmall.pms.vo.AttrGroupVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


/**
 * 属性分组
 *
 * @author yuanyuanyuan
 * @email wu-5-50@qq.com
 * @date 2019-09-24 17:08:58
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageVo queryPage(QueryCondition params);

    PageVo queryByCidPage(Long cid, QueryCondition queryCondition);

    AttrGroupVO queryById(Long gid);

    List<AttrGroupVO> queryByCid(Long cid);
}

