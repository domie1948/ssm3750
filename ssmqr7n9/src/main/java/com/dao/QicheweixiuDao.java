package com.dao;

import com.entity.QicheweixiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QicheweixiuVO;
import com.entity.view.QicheweixiuView;


/**
 * 汽车维修
 * 
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
public interface QicheweixiuDao extends BaseMapper<QicheweixiuEntity> {
	
	List<QicheweixiuVO> selectListVO(@Param("ew") Wrapper<QicheweixiuEntity> wrapper);
	
	QicheweixiuVO selectVO(@Param("ew") Wrapper<QicheweixiuEntity> wrapper);
	
	List<QicheweixiuView> selectListView(@Param("ew") Wrapper<QicheweixiuEntity> wrapper);

	List<QicheweixiuView> selectListView(Pagination page,@Param("ew") Wrapper<QicheweixiuEntity> wrapper);
	
	QicheweixiuView selectView(@Param("ew") Wrapper<QicheweixiuEntity> wrapper);
	
}
