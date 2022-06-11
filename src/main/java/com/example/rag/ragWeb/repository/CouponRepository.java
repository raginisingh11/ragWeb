package com.example.rag.ragWeb.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.rag.ragWeb.domain.Coupon;

@Repository
public interface CouponRepository  extends CrudRepository<Coupon, Long> {
	
	public List<Coupon> findByName(String cpn);

}
