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


import com.dao.QichechuzuDao;
import com.entity.QichechuzuEntity;
import com.service.QichechuzuService;
import com.entity.vo.QichechuzuVO;
import com.entity.view.QichechuzuView;

@Service("qichechuzuService")
public class QichechuzuServiceImpl extends ServiceImpl<QichechuzuDao, QichechuzuEntity> implements QichechuzuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QichechuzuEntity> page = this.selectPage(
                new Query<QichechuzuEntity>(params).getPage(),
                new EntityWrapper<QichechuzuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QichechuzuEntity> wrapper) {
		  Page<QichechuzuView> page =new Query<QichechuzuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QichechuzuVO> selectListVO(Wrapper<QichechuzuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QichechuzuVO selectVO(Wrapper<QichechuzuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QichechuzuView> selectListView(Wrapper<QichechuzuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QichechuzuView selectView(Wrapper<QichechuzuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
