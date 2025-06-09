package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.HaichejiesuanEntity;
import com.entity.view.HaichejiesuanView;

import com.service.HaichejiesuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 还车结算
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
@RestController
@RequestMapping("/haichejiesuan")
public class HaichejiesuanController {
    @Autowired
    private HaichejiesuanService haichejiesuanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HaichejiesuanEntity haichejiesuan, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			haichejiesuan.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HaichejiesuanEntity> ew = new EntityWrapper<HaichejiesuanEntity>();
		PageUtils page = haichejiesuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, haichejiesuan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HaichejiesuanEntity haichejiesuan, 
		HttpServletRequest request){
        EntityWrapper<HaichejiesuanEntity> ew = new EntityWrapper<HaichejiesuanEntity>();
		PageUtils page = haichejiesuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, haichejiesuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HaichejiesuanEntity haichejiesuan){
       	EntityWrapper<HaichejiesuanEntity> ew = new EntityWrapper<HaichejiesuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( haichejiesuan, "haichejiesuan")); 
        return R.ok().put("data", haichejiesuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HaichejiesuanEntity haichejiesuan){
        EntityWrapper< HaichejiesuanEntity> ew = new EntityWrapper< HaichejiesuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( haichejiesuan, "haichejiesuan")); 
		HaichejiesuanView haichejiesuanView =  haichejiesuanService.selectView(ew);
		return R.ok("查询还车结算成功").put("data", haichejiesuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HaichejiesuanEntity haichejiesuan = haichejiesuanService.selectById(id);
        return R.ok().put("data", haichejiesuan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HaichejiesuanEntity haichejiesuan = haichejiesuanService.selectById(id);
        return R.ok().put("data", haichejiesuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HaichejiesuanEntity haichejiesuan, HttpServletRequest request){
    	haichejiesuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(haichejiesuan);

        haichejiesuanService.insert(haichejiesuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody HaichejiesuanEntity haichejiesuan, HttpServletRequest request){
    	haichejiesuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(haichejiesuan);

        haichejiesuanService.insert(haichejiesuan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HaichejiesuanEntity haichejiesuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(haichejiesuan);
        haichejiesuanService.updateById(haichejiesuan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        haichejiesuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<HaichejiesuanEntity> wrapper = new EntityWrapper<HaichejiesuanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = haichejiesuanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
