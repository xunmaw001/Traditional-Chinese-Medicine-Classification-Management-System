package com.dao;

import com.entity.ChukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChukuVO;
import com.entity.view.ChukuView;


/**
 * 出库
 * 
 * @author 
 * @email 
 * @date 2021-03-06 01:19:54
 */
public interface ChukuDao extends BaseMapper<ChukuEntity> {
	
	List<ChukuVO> selectListVO(@Param("ew") Wrapper<ChukuEntity> wrapper);
	
	ChukuVO selectVO(@Param("ew") Wrapper<ChukuEntity> wrapper);
	
	List<ChukuView> selectListView(@Param("ew") Wrapper<ChukuEntity> wrapper);

	List<ChukuView> selectListView(Pagination page,@Param("ew") Wrapper<ChukuEntity> wrapper);
	
	ChukuView selectView(@Param("ew") Wrapper<ChukuEntity> wrapper);
	
}
