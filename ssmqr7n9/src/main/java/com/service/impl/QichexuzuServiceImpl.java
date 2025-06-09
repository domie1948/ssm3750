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


import com.dao.QichexuzuDao;
import com.entity.QichexuzuEntity;
import com.service.QichexuzuService;
import com.entity.vo.QichexuzuVO;
import com.entity.view.QichexuzuView;

@Service("qichexuzuService")
public class QichexuzuServiceImpl extends ServiceImpl<QichexuzuDao, QichexuzuEntity> implements QichexuzuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QichexuzuEntity> page = this.selectPage(
                new Query<QichexuzuEntity>(params).getPage(),
                new EntityWrapper<QichexuzuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QichexuzuEntity> wrapper) {
		  Page<QichexuzuView> page =new Query<QichexuzuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QichexuzuVO> selectListVO(Wrapper<QichexuzuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QichexuzuVO selectVO(Wrapper<QichexuzuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QichexuzuView> selectListView(Wrapper<QichexuzuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QichexuzuView selectView(Wrapper<QichexuzuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
