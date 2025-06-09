package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HaichejiesuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HaichejiesuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HaichejiesuanView;


/**
 * 还车结算
 *
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
public interface HaichejiesuanService extends IService<HaichejiesuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HaichejiesuanVO> selectListVO(Wrapper<HaichejiesuanEntity> wrapper);
   	
   	HaichejiesuanVO selectVO(@Param("ew") Wrapper<HaichejiesuanEntity> wrapper);
   	
   	List<HaichejiesuanView> selectListView(Wrapper<HaichejiesuanEntity> wrapper);
   	
   	HaichejiesuanView selectView(@Param("ew") Wrapper<HaichejiesuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HaichejiesuanEntity> wrapper);
   	
}

