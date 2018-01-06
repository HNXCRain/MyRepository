package cn.e2.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e2.manager.mapper.TbItemMapper;
import cn.e2.manager.service.ItemService;
import cn.e2.pojo.TbItem;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper tbItemMapper;
	
	@Override
	public TbItem findItemById(String itemId) {
		// TODO Auto-generated method stub
		return tbItemMapper.selectByPrimaryKey(Long.parseLong(itemId));
	}
	
	
}
