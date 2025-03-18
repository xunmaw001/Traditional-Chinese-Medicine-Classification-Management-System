package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YichangbaogaodanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YichangbaogaodanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YichangbaogaodanView;


/**
 * 异常报告单
 *
 * @author 
 * @email 
 * @date 2021-03-06 01:19:54
 */
public interface YichangbaogaodanService extends IService<YichangbaogaodanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YichangbaogaodanVO> selectListVO(Wrapper<YichangbaogaodanEntity> wrapper);
   	
   	YichangbaogaodanVO selectVO(@Param("ew") Wrapper<YichangbaogaodanEntity> wrapper);
   	
   	List<YichangbaogaodanView> selectListView(Wrapper<YichangbaogaodanEntity> wrapper);
   	
   	YichangbaogaodanView selectView(@Param("ew") Wrapper<YichangbaogaodanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YichangbaogaodanEntity> wrapper);
   	
}

