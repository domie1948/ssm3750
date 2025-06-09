package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QichechuzuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QichechuzuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QichechuzuView;


/**
 * 汽车出租
 *
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
public interface QichechuzuService extends IService<QichechuzuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QichechuzuVO> selectListVO(Wrapper<QichechuzuEntity> wrapper);
   	
   	QichechuzuVO selectVO(@Param("ew") Wrapper<QichechuzuEntity> wrapper);
   	
   	List<QichechuzuView> selectListView(Wrapper<QichechuzuEntity> wrapper);
   	
   	QichechuzuView selectView(@Param("ew") Wrapper<QichechuzuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QichechuzuEntity> wrapper);
   	
}

