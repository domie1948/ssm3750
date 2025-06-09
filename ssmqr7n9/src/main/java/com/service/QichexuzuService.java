package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QichexuzuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QichexuzuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QichexuzuView;


/**
 * 汽车续租
 *
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
public interface QichexuzuService extends IService<QichexuzuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QichexuzuVO> selectListVO(Wrapper<QichexuzuEntity> wrapper);
   	
   	QichexuzuVO selectVO(@Param("ew") Wrapper<QichexuzuEntity> wrapper);
   	
   	List<QichexuzuView> selectListView(Wrapper<QichexuzuEntity> wrapper);
   	
   	QichexuzuView selectView(@Param("ew") Wrapper<QichexuzuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QichexuzuEntity> wrapper);
   	
}

