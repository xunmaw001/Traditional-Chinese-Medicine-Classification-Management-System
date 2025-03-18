package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaosunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaosunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaosunView;


/**
 * 报损
 *
 * @author 
 * @email 
 * @date 2021-03-06 01:19:54
 */
public interface BaosunService extends IService<BaosunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaosunVO> selectListVO(Wrapper<BaosunEntity> wrapper);
   	
   	BaosunVO selectVO(@Param("ew") Wrapper<BaosunEntity> wrapper);
   	
   	List<BaosunView> selectListView(Wrapper<BaosunEntity> wrapper);
   	
   	BaosunView selectView(@Param("ew") Wrapper<BaosunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaosunEntity> wrapper);
   	
}

