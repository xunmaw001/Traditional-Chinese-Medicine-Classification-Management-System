package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaocaizhongleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaocaizhongleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaocaizhongleiView;


/**
 * 药材种类
 *
 * @author 
 * @email 
 * @date 2021-03-06 01:19:54
 */
public interface YaocaizhongleiService extends IService<YaocaizhongleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaocaizhongleiVO> selectListVO(Wrapper<YaocaizhongleiEntity> wrapper);
   	
   	YaocaizhongleiVO selectVO(@Param("ew") Wrapper<YaocaizhongleiEntity> wrapper);
   	
   	List<YaocaizhongleiView> selectListView(Wrapper<YaocaizhongleiEntity> wrapper);
   	
   	YaocaizhongleiView selectView(@Param("ew") Wrapper<YaocaizhongleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaocaizhongleiEntity> wrapper);
   	
}

