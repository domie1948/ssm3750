package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZulinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZulinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZulinxinxiView;


/**
 * 租赁信息
 *
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
public interface ZulinxinxiService extends IService<ZulinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZulinxinxiVO> selectListVO(Wrapper<ZulinxinxiEntity> wrapper);
   	
   	ZulinxinxiVO selectVO(@Param("ew") Wrapper<ZulinxinxiEntity> wrapper);
   	
   	List<ZulinxinxiView> selectListView(Wrapper<ZulinxinxiEntity> wrapper);
   	
   	ZulinxinxiView selectView(@Param("ew") Wrapper<ZulinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZulinxinxiEntity> wrapper);
   	
}

