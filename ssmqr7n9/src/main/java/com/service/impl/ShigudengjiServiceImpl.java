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


import com.dao.ShigudengjiDao;
import com.entity.ShigudengjiEntity;
import com.service.ShigudengjiService;
import com.entity.vo.ShigudengjiVO;
import com.entity.view.ShigudengjiView;

@Service("shigudengjiService")
public class ShigudengjiServiceImpl extends ServiceImpl<ShigudengjiDao, ShigudengjiEntity> implements ShigudengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShigudengjiEntity> page = this.selectPage(
                new Query<ShigudengjiEntity>(params).getPage(),
                new EntityWrapper<ShigudengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShigudengjiEntity> wrapper) {
		  Page<ShigudengjiView> page =new Query<ShigudengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShigudengjiVO> selectListVO(Wrapper<ShigudengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShigudengjiVO selectVO(Wrapper<ShigudengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShigudengjiView> selectListView(Wrapper<ShigudengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShigudengjiView selectView(Wrapper<ShigudengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
