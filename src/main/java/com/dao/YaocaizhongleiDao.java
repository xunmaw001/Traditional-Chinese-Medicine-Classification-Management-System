package com.dao;

import com.entity.YaocaizhongleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaocaizhongleiVO;
import com.entity.view.YaocaizhongleiView;


/**
 * 药材种类
 * 
 * @author 
 * @email 
 * @date 2021-03-06 01:19:54
 */
public interface YaocaizhongleiDao extends BaseMapper<YaocaizhongleiEntity> {
	
	List<YaocaizhongleiVO> selectListVO(@Param("ew") Wrapper<YaocaizhongleiEntity> wrapper);
	
	YaocaizhongleiVO selectVO(@Param("ew") Wrapper<YaocaizhongleiEntity> wrapper);
	
	List<YaocaizhongleiView> selectListView(@Param("ew") Wrapper<YaocaizhongleiEntity> wrapper);

	List<YaocaizhongleiView> selectListView(Pagination page,@Param("ew") Wrapper<YaocaizhongleiEntity> wrapper);
	
	YaocaizhongleiView selectView(@Param("ew") Wrapper<YaocaizhongleiEntity> wrapper);
	
}
