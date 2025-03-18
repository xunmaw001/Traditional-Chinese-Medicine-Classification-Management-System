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


import com.dao.YaocaizhongleiDao;
import com.entity.YaocaizhongleiEntity;
import com.service.YaocaizhongleiService;
import com.entity.vo.YaocaizhongleiVO;
import com.entity.view.YaocaizhongleiView;

@Service("yaocaizhongleiService")
public class YaocaizhongleiServiceImpl extends ServiceImpl<YaocaizhongleiDao, YaocaizhongleiEntity> implements YaocaizhongleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaocaizhongleiEntity> page = this.selectPage(
                new Query<YaocaizhongleiEntity>(params).getPage(),
                new EntityWrapper<YaocaizhongleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaocaizhongleiEntity> wrapper) {
		  Page<YaocaizhongleiView> page =new Query<YaocaizhongleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YaocaizhongleiVO> selectListVO(Wrapper<YaocaizhongleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaocaizhongleiVO selectVO(Wrapper<YaocaizhongleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaocaizhongleiView> selectListView(Wrapper<YaocaizhongleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaocaizhongleiView selectView(Wrapper<YaocaizhongleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
