package com.entity.model;

import com.entity.ZulinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 租赁信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
public class ZulinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车型
	 */
	
	private String chexing;
		
	/**
	 * 车辆颜色
	 */
	
	private String cheliangyanse;
		
	/**
	 * 车辆押金
	 */
	
	private Integer cheliangyajin;
		
	/**
	 * 日租金
	 */
	
	private Integer rizujin;
		
	/**
	 * 出租状态
	 */
	
	private String chuzuzhuangtai;
		
	/**
	 * 车辆描述
	 */
	
	private String cheliangmiaoshu;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：车型
	 */
	 
	public void setChexing(String chexing) {
		this.chexing = chexing;
	}
	
	/**
	 * 获取：车型
	 */
	public String getChexing() {
		return chexing;
	}
				
	
	/**
	 * 设置：车辆颜色
	 */
	 
	public void setCheliangyanse(String cheliangyanse) {
		this.cheliangyanse = cheliangyanse;
	}
	
	/**
	 * 获取：车辆颜色
	 */
	public String getCheliangyanse() {
		return cheliangyanse;
	}
				
	
	/**
	 * 设置：车辆押金
	 */
	 
	public void setCheliangyajin(Integer cheliangyajin) {
		this.cheliangyajin = cheliangyajin;
	}
	
	/**
	 * 获取：车辆押金
	 */
	public Integer getCheliangyajin() {
		return cheliangyajin;
	}
				
	
	/**
	 * 设置：日租金
	 */
	 
	public void setRizujin(Integer rizujin) {
		this.rizujin = rizujin;
	}
	
	/**
	 * 获取：日租金
	 */
	public Integer getRizujin() {
		return rizujin;
	}
				
	
	/**
	 * 设置：出租状态
	 */
	 
	public void setChuzuzhuangtai(String chuzuzhuangtai) {
		this.chuzuzhuangtai = chuzuzhuangtai;
	}
	
	/**
	 * 获取：出租状态
	 */
	public String getChuzuzhuangtai() {
		return chuzuzhuangtai;
	}
				
	
	/**
	 * 设置：车辆描述
	 */
	 
	public void setCheliangmiaoshu(String cheliangmiaoshu) {
		this.cheliangmiaoshu = cheliangmiaoshu;
	}
	
	/**
	 * 获取：车辆描述
	 */
	public String getCheliangmiaoshu() {
		return cheliangmiaoshu;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
