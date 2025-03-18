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


import com.dao.CangkujianchaDao;
import com.entity.CangkujianchaEntity;
import com.service.CangkujianchaService;
import com.entity.vo.CangkujianchaVO;
import com.entity.view.CangkujianchaView;

@Service("cangkujianchaService")
public class CangkujianchaServiceImpl extends ServiceImpl<CangkujianchaDao, CangkujianchaEntity> implements CangkujianchaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CangkujianchaEntity> page = this.selectPage(
                new Query<CangkujianchaEntity>(params).getPage(),
                new EntityWrapper<CangkujianchaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CangkujianchaEntity> wrapper) {
		  Page<CangkujianchaView> page =new Query<CangkujianchaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CangkujianchaVO> selectListVO(Wrapper<CangkujianchaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CangkujianchaVO selectVO(Wrapper<CangkujianchaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CangkujianchaView> selectListView(Wrapper<CangkujianchaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CangkujianchaView selectView(Wrapper<CangkujianchaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
