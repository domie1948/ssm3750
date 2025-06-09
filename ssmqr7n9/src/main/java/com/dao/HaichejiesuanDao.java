package com.dao;

import com.entity.HaichejiesuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HaichejiesuanVO;
import com.entity.view.HaichejiesuanView;


/**
 * 还车结算
 * 
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
public interface HaichejiesuanDao extends BaseMapper<HaichejiesuanEntity> {
	
	List<HaichejiesuanVO> selectListVO(@Param("ew") Wrapper<HaichejiesuanEntity> wrapper);
	
	HaichejiesuanVO selectVO(@Param("ew") Wrapper<HaichejiesuanEntity> wrapper);
	
	List<HaichejiesuanView> selectListView(@Param("ew") Wrapper<HaichejiesuanEntity> wrapper);

	List<HaichejiesuanView> selectListView(Pagination page,@Param("ew") Wrapper<HaichejiesuanEntity> wrapper);
	
	HaichejiesuanView selectView(@Param("ew") Wrapper<HaichejiesuanEntity> wrapper);
	
}
