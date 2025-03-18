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
 * 药材信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-06 01:19:54
 */
@TableName("yaocaixinxi")
public class YaocaixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YaocaixinxiEntity() {
		
	}
	
	public YaocaixinxiEntity(T t) {
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
	 * 药材名称
	 */
					
	private String yaocaimingcheng;
	
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
	 * 设置：药材名称
	 */
	public void setYaocaimingcheng(String yaocaimingcheng) {
		this.yaocaimingcheng = yaocaimingcheng;
	}
	/**
	 * 获取：药材名称
	 */
	public String getYaocaimingcheng() {
		return yaocaimingcheng;
	}
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
