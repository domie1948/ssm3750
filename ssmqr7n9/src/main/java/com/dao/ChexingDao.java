package com.dao;

import com.entity.ChexingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChexingVO;
import com.entity.view.ChexingView;


/**
 * 车型
 * 
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
public interface ChexingDao extends BaseMapper<ChexingEntity> {
	
	List<ChexingVO> selectListVO(@Param("ew") Wrapper<ChexingEntity> wrapper);
	
	ChexingVO selectVO(@Param("ew") Wrapper<ChexingEntity> wrapper);
	
	List<ChexingView> selectListView(@Param("ew") Wrapper<ChexingEntity> wrapper);

	List<ChexingView> selectListView(Pagination page,@Param("ew") Wrapper<ChexingEntity> wrapper);
	
	ChexingView selectView(@Param("ew") Wrapper<ChexingEntity> wrapper);
	
}
