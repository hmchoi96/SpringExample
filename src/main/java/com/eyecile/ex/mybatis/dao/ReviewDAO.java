package com.eyecile.ex.mybatis.dao;

import org.springframework.stereotype.Repository;

import com.eyecile.ex.mybatis.model.Review;

@Repository
public interface ReviewDAO {

	//new_review 테이블에서 id가 3인 데이터 가져오기
	public Review selectReview() {
		
	}
}
