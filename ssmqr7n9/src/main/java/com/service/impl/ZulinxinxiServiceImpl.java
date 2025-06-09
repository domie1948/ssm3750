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


import com.dao.ZulinxinxiDao;
import com.entity.ZulinxinxiEntity;
import com.service.ZulinxinxiService;
import com.entity.vo.ZulinxinxiVO;
import com.entity.view.ZulinxinxiView;

@Service("zulinxinxiService")
public class ZulinxinxiServiceImpl extends ServiceImpl<ZulinxinxiDao, ZulinxinxiEntity> implements ZulinxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZulinxinxiEntity> page = this.selectPage(
                new Query<ZulinxinxiEntity>(params).getPage(),
                new EntityWrapper<ZulinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZulinxinxiEntity> wrapper) {
		  Page<ZulinxinxiView> page =new Query<ZulinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZulinxinxiVO> selectListVO(Wrapper<ZulinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZulinxinxiVO selectVO(Wrapper<ZulinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZulinxinxiView> selectListView(Wrapper<ZulinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZulinxinxiView selectView(Wrapper<ZulinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
