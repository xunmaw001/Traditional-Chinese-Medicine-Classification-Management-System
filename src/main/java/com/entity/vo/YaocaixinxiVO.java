package com.entity.vo;

import com.entity.YaocaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 药材信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-06 01:19:54
 */
public class YaocaixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 药材种类
	 */
	
	private String yaocaizhonglei;
		
	/**
	 * 供应商名称
	 */
	
	private String gongyingshangmingcheng;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 存储仓位
	 */
	
	private String cunchucangwei;
		
	/**
	 * 药材图片
	 */
	
	private String yaocaitupian;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
				
	
	/**
	 * 设置：药材种类
	 */
	 
	public void setYaocaizhonglei(String yaocaizhonglei) {
		this.yaocaizhonglei = yaocaizhonglei;
	}
	
	/**
	 * 获取：药材种类
	 */
	public String getYaocaizhonglei() {
		return yaocaizhonglei;
	}
				
	
	/**
	 * 设置：供应商名称
	 */
	 
	public void setGongyingshangmingcheng(String gongyingshangmingcheng) {
		this.gongyingshangmingcheng = gongyingshangmingcheng;
	}
	
	/**
	 * 获取：供应商名称
	 */
	public String getGongyingshangmingcheng() {
		return gongyingshangmingcheng;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：存储仓位
	 */
	 
	public void setCunchucangwei(String cunchucangwei) {
		this.cunchucangwei = cunchucangwei;
	}
	
	/**
	 * 获取：存储仓位
	 */
	public String getCunchucangwei() {
		return cunchucangwei;
	}
				
	
	/**
	 * 设置：药材图片
	 */
	 
	public void setYaocaitupian(String yaocaitupian) {
		this.yaocaitupian = yaocaitupian;
	}
	
	/**
	 * 获取：药材图片
	 */
	public String getYaocaitupian() {
		return yaocaitupian;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
			
}
