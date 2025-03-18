package com.entity.view;

import com.entity.RukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 入库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-06 01:19:54
 */
@TableName("ruku")
public class RukuView  extends RukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RukuView(){
	}
 
 	public RukuView(RukuEntity rukuEntity){
 	try {
			BeanUtils.copyProperties(this, rukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
