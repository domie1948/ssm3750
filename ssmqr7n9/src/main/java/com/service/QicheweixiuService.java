package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QicheweixiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QicheweixiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QicheweixiuView;


/**
 * 汽车维修
 *
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
public interface QicheweixiuService extends IService<QicheweixiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QicheweixiuVO> selectListVO(Wrapper<QicheweixiuEntity> wrapper);
   	
   	QicheweixiuVO selectVO(@Param("ew") Wrapper<QicheweixiuEntity> wrapper);
   	
   	List<QicheweixiuView> selectListView(Wrapper<QicheweixiuEntity> wrapper);
   	
   	QicheweixiuView selectView(@Param("ew") Wrapper<QicheweixiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QicheweixiuEntity> wrapper);
   	
}

