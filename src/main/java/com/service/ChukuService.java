package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChukuView;


/**
 * 出库
 *
 * @author 
 * @email 
 * @date 2021-03-06 01:19:54
 */
public interface ChukuService extends IService<ChukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChukuVO> selectListVO(Wrapper<ChukuEntity> wrapper);
   	
   	ChukuVO selectVO(@Param("ew") Wrapper<ChukuEntity> wrapper);
   	
   	List<ChukuView> selectListView(Wrapper<ChukuEntity> wrapper);
   	
   	ChukuView selectView(@Param("ew") Wrapper<ChukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChukuEntity> wrapper);
   	
}

