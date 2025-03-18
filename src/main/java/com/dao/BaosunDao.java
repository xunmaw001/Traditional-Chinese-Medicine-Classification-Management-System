package com.dao;

import com.entity.BaosunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaosunVO;
import com.entity.view.BaosunView;


/**
 * 报损
 * 
 * @author 
 * @email 
 * @date 2021-03-06 01:19:54
 */
public interface BaosunDao extends BaseMapper<BaosunEntity> {
	
	List<BaosunVO> selectListVO(@Param("ew") Wrapper<BaosunEntity> wrapper);
	
	BaosunVO selectVO(@Param("ew") Wrapper<BaosunEntity> wrapper);
	
	List<BaosunView> selectListView(@Param("ew") Wrapper<BaosunEntity> wrapper);

	List<BaosunView> selectListView(Pagination page,@Param("ew") Wrapper<BaosunEntity> wrapper);
	
	BaosunView selectView(@Param("ew") Wrapper<BaosunEntity> wrapper);
	
}
