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


import com.dao.BaosunDao;
import com.entity.BaosunEntity;
import com.service.BaosunService;
import com.entity.vo.BaosunVO;
import com.entity.view.BaosunView;

@Service("baosunService")
public class BaosunServiceImpl extends ServiceImpl<BaosunDao, BaosunEntity> implements BaosunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaosunEntity> page = this.selectPage(
                new Query<BaosunEntity>(params).getPage(),
                new EntityWrapper<BaosunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaosunEntity> wrapper) {
		  Page<BaosunView> page =new Query<BaosunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaosunVO> selectListVO(Wrapper<BaosunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaosunVO selectVO(Wrapper<BaosunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaosunView> selectListView(Wrapper<BaosunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaosunView selectView(Wrapper<BaosunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
