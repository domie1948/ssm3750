package com.dao;

import com.entity.QichechuzuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QichechuzuVO;
import com.entity.view.QichechuzuView;


/**
 * 汽车出租
 * 
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
public interface QichechuzuDao extends BaseMapper<QichechuzuEntity> {
	
	List<QichechuzuVO> selectListVO(@Param("ew") Wrapper<QichechuzuEntity> wrapper);
	
	QichechuzuVO selectVO(@Param("ew") Wrapper<QichechuzuEntity> wrapper);
	
	List<QichechuzuView> selectListView(@Param("ew") Wrapper<QichechuzuEntity> wrapper);

	List<QichechuzuView> selectListView(Pagination page,@Param("ew") Wrapper<QichechuzuEntity> wrapper);
	
	QichechuzuView selectView(@Param("ew") Wrapper<QichechuzuEntity> wrapper);
	
}
