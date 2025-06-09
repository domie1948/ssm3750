package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QicheweixiuDao;
import com.entity.QicheweixiuEntity;
import com.service.QicheweixiuService;
import com.entity.vo.QicheweixiuVO;
import com.entity.view.QicheweixiuView;

@Service("qicheweixiuService")
public class QicheweixiuServiceImpl extends ServiceImpl<QicheweixiuDao, QicheweixiuEntity> implements QicheweixiuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QicheweixiuEntity> page = this.selectPage(
                new Query<QicheweixiuEntity>(params).getPage(),
                new EntityWrapper<QicheweixiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QicheweixiuEntity> wrapper) {
		  Page<QicheweixiuView> page =new Query<QicheweixiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QicheweixiuVO> selectListVO(Wrapper<QicheweixiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QicheweixiuVO selectVO(Wrapper<QicheweixiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QicheweixiuView> selectListView(Wrapper<QicheweixiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QicheweixiuView selectView(Wrapper<QicheweixiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
