package com.entity.view;

import com.entity.BaosunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报损
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-06 01:19:54
 */
@TableName("baosun")
public class BaosunView  extends BaosunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaosunView(){
	}
 
 	public BaosunView(BaosunEntity baosunEntity){
 	try {
			BeanUtils.copyProperties(this, baosunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
