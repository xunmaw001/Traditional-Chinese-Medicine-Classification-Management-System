package com.entity.view;

import com.entity.YichangbaogaodanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 异常报告单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-06 01:19:54
 */
@TableName("yichangbaogaodan")
public class YichangbaogaodanView  extends YichangbaogaodanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YichangbaogaodanView(){
	}
 
 	public YichangbaogaodanView(YichangbaogaodanEntity yichangbaogaodanEntity){
 	try {
			BeanUtils.copyProperties(this, yichangbaogaodanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
