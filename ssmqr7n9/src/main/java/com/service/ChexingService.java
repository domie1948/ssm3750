package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChexingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChexingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChexingView;


/**
 * 车型
 *
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
public interface ChexingService extends IService<ChexingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChexingVO> selectListVO(Wrapper<ChexingEntity> wrapper);
   	
   	ChexingVO selectVO(@Param("ew") Wrapper<ChexingEntity> wrapper);
   	
   	List<ChexingView> selectListView(Wrapper<ChexingEntity> wrapper);
   	
   	ChexingView selectView(@Param("ew") Wrapper<ChexingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChexingEntity> wrapper);
   	
}

