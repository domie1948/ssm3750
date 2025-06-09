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
 * 汽车出租
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
@TableName("qichechuzu")
public class QichechuzuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QichechuzuEntity() {
		
	}
	
	public QichechuzuEntity(T t) {
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
	 * 车辆押金
	 */
					
	private Integer cheliangyajin;
	
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
	 * 合同
	 */
					
	private String hetong;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shijian;
	
	/**
	 * 日租金
	 */
					
	private Integer rizujin;
	
	/**
	 * 使用天数
	 */
					
	private Integer shiyongtianshu;
	
	/**
	 * 出租价格
	 */
					
	private Integer chuzujiage;
	
	
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
	/**
	 * 设置：合同
	 */
	public void setHetong(String hetong) {
		this.hetong = hetong;
	}
	/**
	 * 获取：合同
	 */
	public String getHetong() {
		return hetong;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
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
	 * 设置：使用天数
	 */
	public void setShiyongtianshu(Integer shiyongtianshu) {
		this.shiyongtianshu = shiyongtianshu;
	}
	/**
	 * 获取：使用天数
	 */
	public Integer getShiyongtianshu() {
		return shiyongtianshu;
	}
	/**
	 * 设置：出租价格
	 */
	public void setChuzujiage(Integer chuzujiage) {
		this.chuzujiage = chuzujiage;
	}
	/**
	 * 获取：出租价格
	 */
	public Integer getChuzujiage() {
		return chuzujiage;
	}

}
