package com.dao;

import com.entity.CangkujianchaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CangkujianchaVO;
import com.entity.view.CangkujianchaView;


/**
 * 仓库检查
 * 
 * @author 
 * @email 
 * @date 2021-03-06 01:19:54
 */
public interface CangkujianchaDao extends BaseMapper<CangkujianchaEntity> {
	
	List<CangkujianchaVO> selectListVO(@Param("ew") Wrapper<CangkujianchaEntity> wrapper);
	
	CangkujianchaVO selectVO(@Param("ew") Wrapper<CangkujianchaEntity> wrapper);
	
	List<CangkujianchaView> selectListView(@Param("ew") Wrapper<CangkujianchaEntity> wrapper);

	List<CangkujianchaView> selectListView(Pagination page,@Param("ew") Wrapper<CangkujianchaEntity> wrapper);
	
	CangkujianchaView selectView(@Param("ew") Wrapper<CangkujianchaEntity> wrapper);
	
}
