package com.entity.vo;

import com.entity.CaigouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 采购
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-06 01:19:54
 */
public class CaigouVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shijian;
		
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 处理状态
	 */
	
	private String chulizhuangtai;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
	 * 设置：员工工号
	 */
	 
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：处理状态
	 */
	 
	public void setChulizhuangtai(String chulizhuangtai) {
		this.chulizhuangtai = chulizhuangtai;
	}
	
	/**
	 * 获取：处理状态
	 */
	public String getChulizhuangtai() {
		return chulizhuangtai;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
