package com.atguigu.gmall.pms.service.impl;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.gmall.pms.dao.AttrAttrgroupRelationDao;
import com.atguigu.gmall.pms.dao.AttrDao;
import com.atguigu.gmall.pms.dao.AttrGroupDao;
import com.atguigu.gmall.pms.entity.AttrAttrgroupRelationEntity;
import com.atguigu.gmall.pms.entity.AttrEntity;
import com.atguigu.gmall.pms.entity.AttrGroupEntity;
import com.atguigu.gmall.pms.service.AttrGroupService;
import com.atguigu.gmall.pms.vo.AttrGroupVO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AttrGroupEntity> page = this.page(
                new Query<AttrGroupEntity>().getPage(params),
                new QueryWrapper<AttrGroupEntity>()
        );

        return new PageVo(page);
    }

    @Override
    public PageVo queryByCidPage(Long cid, QueryCondition queryCondition) {
        IPage<AttrGroupEntity> page=this.page(new Query<AttrGroupEntity>().getPage(queryCondition),
                new QueryWrapper<AttrGroupEntity>().eq("catelog_id",cid));
        return new PageVo(page);
    }
    @Autowired
    private AttrGroupDao attrGroupDao;

    @Autowired
    private AttrAttrgroupRelationDao relationDao;

    @Autowired
    private AttrDao attrDao;

    @Override
    public AttrGroupVO queryById(Long gid) {
        AttrGroupVO attrGroupVO = new AttrGroupVO();
        AttrGroupEntity attrGroupEntity = this.attrGroupDao.selectById(gid);
        BeanUtils.copyProperties(attrGroupEntity,attrGroupVO);

        List<AttrAttrgroupRelationEntity> relations=
        this.relationDao.selectList(new QueryWrapper<AttrAttrgroupRelationEntity>().eq("attr_group_id",gid));

        if (CollectionUtils.isEmpty(relations)) {
            return attrGroupVO;
        }
        attrGroupVO.setRelations(relations);

        List<Long> attrIds=relations.stream().map(relation -> relation.getAttrId()).collect(Collectors.toList());

        List<AttrEntity> attrEntities=this.attrDao.selectBatchIds(attrIds);
        attrGroupVO.setAttrEntities(attrEntities);
        return attrGroupVO;
    }

}