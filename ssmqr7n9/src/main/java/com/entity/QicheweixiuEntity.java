package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 汽车维修
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
@TableName("qicheweixiu")
public class QicheweixiuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QicheweixiuEntity() {
		
	}
	
	public QicheweixiuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 车牌号
	 */
					
	private String chepaihao;
	
	/**
	 * 车型
	 */
					
	private String chexing;
	
	/**
	 * 车辆颜色
	 */
					
	private String cheliangyanse;
	
	/**
	 * 维修内容
	 */
					
	private String weixiuneirong;
	
	/**
	 * 维修人员
	 */
					
	private String weixiurenyuan;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：车牌号
	 */
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
	}
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
	 * 设置：维修内容
	 */
	public void setWeixiuneirong(String weixiuneirong) {
		this.weixiuneirong = weixiuneirong;
	}
	/**
	 * 获取：维修内容
	 */
	public String getWeixiuneirong() {
		return weixiuneirong;
	}
	/**
	 * 设置：维修人员
	 */
	public void setWeixiurenyuan(String weixiurenyuan) {
		this.weixiurenyuan = weixiurenyuan;
	}
	/**
	 * 获取：维修人员
	 */
	public String getWeixiurenyuan() {
		return weixiurenyuan;
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
	/**
	 * 设置：时间
	 */
	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}
	/**
	 * 获取：时间
	 */
	public Date getShijian() {
		return shijian;
	}

}
