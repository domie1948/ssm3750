package com.entity.view;

import com.entity.QicheweixiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 汽车维修
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-27 19:09:02
 */
@TableName("qicheweixiu")
public class QicheweixiuView  extends QicheweixiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QicheweixiuView(){
	}
 
 	public QicheweixiuView(QicheweixiuEntity qicheweixiuEntity){
 	try {
			BeanUtils.copyProperties(this, qicheweixiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
