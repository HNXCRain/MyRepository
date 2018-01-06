package cn.e2.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e2.manager.service.ItemService;
import cn.e2.pojo.TbItem;

@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem findItemById(@PathVariable String itemId) {
		// TODO Auto-generated method stub
		TbItem tbItem=itemService.findItemById(itemId);
		return tbItem;
	}
	
}
