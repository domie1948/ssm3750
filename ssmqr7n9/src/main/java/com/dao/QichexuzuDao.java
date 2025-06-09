package com.dao;

import com.entity.QichexuzuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QichexuzuVO;
import com.entity.view.QichexuzuView;


/**
 * 汽车续租
 * 
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
public interface QichexuzuDao extends BaseMapper<QichexuzuEntity> {
	
	List<QichexuzuVO> selectListVO(@Param("ew") Wrapper<QichexuzuEntity> wrapper);
	
	QichexuzuVO selectVO(@Param("ew") Wrapper<QichexuzuEntity> wrapper);
	
	List<QichexuzuView> selectListView(@Param("ew") Wrapper<QichexuzuEntity> wrapper);

	List<QichexuzuView> selectListView(Pagination page,@Param("ew") Wrapper<QichexuzuEntity> wrapper);
	
	QichexuzuView selectView(@Param("ew") Wrapper<QichexuzuEntity> wrapper);
	
}
