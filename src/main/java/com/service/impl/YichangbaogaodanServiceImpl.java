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


import com.dao.YichangbaogaodanDao;
import com.entity.YichangbaogaodanEntity;
import com.service.YichangbaogaodanService;
import com.entity.vo.YichangbaogaodanVO;
import com.entity.view.YichangbaogaodanView;

@Service("yichangbaogaodanService")
public class YichangbaogaodanServiceImpl extends ServiceImpl<YichangbaogaodanDao, YichangbaogaodanEntity> implements YichangbaogaodanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YichangbaogaodanEntity> page = this.selectPage(
                new Query<YichangbaogaodanEntity>(params).getPage(),
                new EntityWrapper<YichangbaogaodanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YichangbaogaodanEntity> wrapper) {
		  Page<YichangbaogaodanView> page =new Query<YichangbaogaodanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YichangbaogaodanVO> selectListVO(Wrapper<YichangbaogaodanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YichangbaogaodanVO selectVO(Wrapper<YichangbaogaodanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YichangbaogaodanView> selectListView(Wrapper<YichangbaogaodanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YichangbaogaodanView selectView(Wrapper<YichangbaogaodanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
