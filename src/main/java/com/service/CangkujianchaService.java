package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CangkujianchaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CangkujianchaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CangkujianchaView;


/**
 * 仓库检查
 *
 * @author 
 * @email 
 * @date 2021-03-06 01:19:54
 */
public interface CangkujianchaService extends IService<CangkujianchaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CangkujianchaVO> selectListVO(Wrapper<CangkujianchaEntity> wrapper);
   	
   	CangkujianchaVO selectVO(@Param("ew") Wrapper<CangkujianchaEntity> wrapper);
   	
   	List<CangkujianchaView> selectListView(Wrapper<CangkujianchaEntity> wrapper);
   	
   	CangkujianchaView selectView(@Param("ew") Wrapper<CangkujianchaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CangkujianchaEntity> wrapper);
   	
}

