package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QichejiayouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QichejiayouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QichejiayouView;


/**
 * 汽车加油
 *
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
public interface QichejiayouService extends IService<QichejiayouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QichejiayouVO> selectListVO(Wrapper<QichejiayouEntity> wrapper);
   	
   	QichejiayouVO selectVO(@Param("ew") Wrapper<QichejiayouEntity> wrapper);
   	
   	List<QichejiayouView> selectListView(Wrapper<QichejiayouEntity> wrapper);
   	
   	QichejiayouView selectView(@Param("ew") Wrapper<QichejiayouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QichejiayouEntity> wrapper);
   	
}

