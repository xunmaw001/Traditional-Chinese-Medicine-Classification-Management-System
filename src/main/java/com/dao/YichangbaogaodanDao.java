package com.dao;

import com.entity.YichangbaogaodanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YichangbaogaodanVO;
import com.entity.view.YichangbaogaodanView;


/**
 * 异常报告单
 * 
 * @author 
 * @email 
 * @date 2021-03-06 01:19:54
 */
public interface YichangbaogaodanDao extends BaseMapper<YichangbaogaodanEntity> {
	
	List<YichangbaogaodanVO> selectListVO(@Param("ew") Wrapper<YichangbaogaodanEntity> wrapper);
	
	YichangbaogaodanVO selectVO(@Param("ew") Wrapper<YichangbaogaodanEntity> wrapper);
	
	List<YichangbaogaodanView> selectListView(@Param("ew") Wrapper<YichangbaogaodanEntity> wrapper);

	List<YichangbaogaodanView> selectListView(Pagination page,@Param("ew") Wrapper<YichangbaogaodanEntity> wrapper);
	
	YichangbaogaodanView selectView(@Param("ew") Wrapper<YichangbaogaodanEntity> wrapper);
	
}
