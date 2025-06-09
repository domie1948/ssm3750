package com.entity.view;

import com.entity.QichechuzuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 汽车出租
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
@TableName("qichechuzu")
public class QichechuzuView  extends QichechuzuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QichechuzuView(){
	}
 
 	public QichechuzuView(QichechuzuEntity qichechuzuEntity){
 	try {
			BeanUtils.copyProperties(this, qichechuzuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
