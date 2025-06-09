package com.dao;

import com.entity.QichejiayouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QichejiayouVO;
import com.entity.view.QichejiayouView;


/**
 * 汽车加油
 * 
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
public interface QichejiayouDao extends BaseMapper<QichejiayouEntity> {
	
	List<QichejiayouVO> selectListVO(@Param("ew") Wrapper<QichejiayouEntity> wrapper);
	
	QichejiayouVO selectVO(@Param("ew") Wrapper<QichejiayouEntity> wrapper);
	
	List<QichejiayouView> selectListView(@Param("ew") Wrapper<QichejiayouEntity> wrapper);

	List<QichejiayouView> selectListView(Pagination page,@Param("ew") Wrapper<QichejiayouEntity> wrapper);
	
	QichejiayouView selectView(@Param("ew") Wrapper<QichejiayouEntity> wrapper);
	
}
