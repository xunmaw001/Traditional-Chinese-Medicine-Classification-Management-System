package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RukuView;


/**
 * 入库
 *
 * @author 
 * @email 
 * @date 2021-03-06 01:19:54
 */
public interface RukuService extends IService<RukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RukuVO> selectListVO(Wrapper<RukuEntity> wrapper);
   	
   	RukuVO selectVO(@Param("ew") Wrapper<RukuEntity> wrapper);
   	
   	List<RukuView> selectListView(Wrapper<RukuEntity> wrapper);
   	
   	RukuView selectView(@Param("ew") Wrapper<RukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RukuEntity> wrapper);
   	
}

