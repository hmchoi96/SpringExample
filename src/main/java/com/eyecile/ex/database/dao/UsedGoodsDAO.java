package com.eyecile.ex.database.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.eyecile.ex.database.model.UsedGoods;

@Repository //mvc 에서의 모델
public interface UsedGoodsDAO {

	//used_goods에서 모든 데이터 "조회"
	// 얘는 진짜 쿼리 수행에서 실제 데이터베이스를 조작하는 녀석이라 최대한 쿼리 이름과 비슷하게 만들어야 이해하기 편함
	//인터페이스라 구현하지 않으므로 이렇게 끝냄
	
	//데이터 저장할게 하나가 아니기때문에 리스트 형태로 함
	public List<UsedGoods> selectUsedGoodsList();
	
	
	
}
 