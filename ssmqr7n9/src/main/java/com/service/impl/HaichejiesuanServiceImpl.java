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


import com.dao.HaichejiesuanDao;
import com.entity.HaichejiesuanEntity;
import com.service.HaichejiesuanService;
import com.entity.vo.HaichejiesuanVO;
import com.entity.view.HaichejiesuanView;

@Service("haichejiesuanService")
public class HaichejiesuanServiceImpl extends ServiceImpl<HaichejiesuanDao, HaichejiesuanEntity> implements HaichejiesuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HaichejiesuanEntity> page = this.selectPage(
                new Query<HaichejiesuanEntity>(params).getPage(),
                new EntityWrapper<HaichejiesuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HaichejiesuanEntity> wrapper) {
		  Page<HaichejiesuanView> page =new Query<HaichejiesuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HaichejiesuanVO> selectListVO(Wrapper<HaichejiesuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HaichejiesuanVO selectVO(Wrapper<HaichejiesuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HaichejiesuanView> selectListView(Wrapper<HaichejiesuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HaichejiesuanView selectView(Wrapper<HaichejiesuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
