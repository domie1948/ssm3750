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


import com.dao.QichejiayouDao;
import com.entity.QichejiayouEntity;
import com.service.QichejiayouService;
import com.entity.vo.QichejiayouVO;
import com.entity.view.QichejiayouView;

@Service("qichejiayouService")
public class QichejiayouServiceImpl extends ServiceImpl<QichejiayouDao, QichejiayouEntity> implements QichejiayouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QichejiayouEntity> page = this.selectPage(
                new Query<QichejiayouEntity>(params).getPage(),
                new EntityWrapper<QichejiayouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QichejiayouEntity> wrapper) {
		  Page<QichejiayouView> page =new Query<QichejiayouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QichejiayouVO> selectListVO(Wrapper<QichejiayouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QichejiayouVO selectVO(Wrapper<QichejiayouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QichejiayouView> selectListView(Wrapper<QichejiayouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QichejiayouView selectView(Wrapper<QichejiayouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
