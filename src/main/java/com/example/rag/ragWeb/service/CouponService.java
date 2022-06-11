package com.example.rag.ragWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rag.ragWeb.domain.Coupon;
import com.example.rag.ragWeb.repository.CouponRepository;
import com.google.common.collect.Lists;

@Service
public class CouponService {

	@Autowired
	CouponRepository couponRepositoryObj;
	
	public  Coupon couponUsers(int userId) {
		Coupon cpn=couponRepositoryObj.findById(Long.valueOf(userId)).get();
		return cpn;
		
	}

	public  Coupon replaceUsers(Coupon newCoupon) {
		Coupon excpn=couponRepositoryObj.findById(Long.valueOf(newCoupon.getId())).get();
		excpn.setName(newCoupon.getName());
		Coupon CouponObj=couponRepositoryObj.save(excpn);
	 
	   return CouponObj;
		
		
	}
	public  List<Coupon> placeUsers() {
		List<Coupon> excpn=  Lists.newArrayList(couponRepositoryObj.findAll());
		
		
	   return excpn;
		
		
	}
	public  Coupon couponUsers(Coupon cpnName) {
		Coupon cpn=couponRepositoryObj.save(cpnName);
		return cpn;
		
	}

	public  List<Coupon> couponUsers2(String cpnName) {
		List<Coupon> cpn=couponRepositoryObj.findByName(cpnName);
		return cpn;
		
	}

}
