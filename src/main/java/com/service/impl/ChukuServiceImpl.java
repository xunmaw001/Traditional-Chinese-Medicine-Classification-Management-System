package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChukuDao;
import com.entity.ChukuEntity;
import com.service.ChukuService;
import com.entity.vo.ChukuVO;
import com.entity.view.ChukuView;

@Service("chukuService")
public class ChukuServiceImpl extends ServiceImpl<ChukuDao, ChukuEntity> implements ChukuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChukuEntity> page = this.selectPage(
                new Query<ChukuEntity>(params).getPage(),
                new EntityWrapper<ChukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChukuEntity> wrapper) {
		  Page<ChukuView> page =new Query<ChukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChukuVO> selectListVO(Wrapper<ChukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChukuVO selectVO(Wrapper<ChukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChukuView> selectListView(Wrapper<ChukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChukuView selectView(Wrapper<ChukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
