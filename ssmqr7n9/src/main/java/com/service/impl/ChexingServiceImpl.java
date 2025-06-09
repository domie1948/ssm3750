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


import com.dao.ChexingDao;
import com.entity.ChexingEntity;
import com.service.ChexingService;
import com.entity.vo.ChexingVO;
import com.entity.view.ChexingView;

@Service("chexingService")
public class ChexingServiceImpl extends ServiceImpl<ChexingDao, ChexingEntity> implements ChexingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChexingEntity> page = this.selectPage(
                new Query<ChexingEntity>(params).getPage(),
                new EntityWrapper<ChexingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChexingEntity> wrapper) {
		  Page<ChexingView> page =new Query<ChexingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChexingVO> selectListVO(Wrapper<ChexingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChexingVO selectVO(Wrapper<ChexingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChexingView> selectListView(Wrapper<ChexingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChexingView selectView(Wrapper<ChexingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
