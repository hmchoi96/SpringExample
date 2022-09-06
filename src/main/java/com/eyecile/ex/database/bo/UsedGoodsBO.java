 package com.eyecile.ex.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eyecile.ex.database.dao.UsedGoodsDAO;
import com.eyecile.ex.database.model.UsedGoods;

@Service
//BO 는 데이터를 "조작"함 / 컨트롤러가 직접적으로 접근할수 있는건 BO 뿐이다.
public class UsedGoodsBO {

	@Autowired
	private UsedGoodsDAO usedGoodsDAO;
	
	
	
	//used_goods 데이터를 모두 가져오는 메소
	public List<UsedGoods> getUsedGoodsList() {
		
		List<UsedGoods> list = usedGoodsDAO.selectUsedGoodsList();
		//데이터 조작 후 리턴
		
		return list;
		}
	
	
}
