package com.example.rag.ragWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rag.ragWeb.domain.Coupon;
import com.example.rag.ragWeb.repository.CouponRepository;
import com.example.rag.ragWeb.service.CouponService;

@RestController
public class CouponController {

	@Autowired
	CouponService cpnsvc;
	
	@Autowired
	CouponRepository couponRepo;
	
	@GetMapping("/coupon")
	public Coupon couponBook(@RequestParam int userId) {

		Coupon cpnObj = cpnsvc.couponUsers(userId);
		return cpnObj;

	}

	@PostMapping("/coupon")
	public Coupon createCoupon( @RequestBody Coupon couponObject) {
	 return couponRepo.save(couponObject);
	}

	
	@PutMapping("/coupon")
	public Coupon replaceUsers(@RequestBody Coupon newCoupon) {
		Coupon CouponObject = cpnsvc.replaceUsers(newCoupon);
		return CouponObject;
	}
	@GetMapping("/Coupon")
	public List <Coupon> placeUsers() {

		List <Coupon> excpn  = cpnsvc.placeUsers();
		return excpn ;

	}
	@PostMapping("/Coupon")
	public Coupon couponUsers( @RequestBody Coupon cpnName) {
		Coupon cpn=cpnsvc.couponUsers(cpnName);
	 return cpn;
	}
	@GetMapping("/soupon")
	public List <Coupon>couponUsers2 (@RequestBody String cpnName) {

		List <Coupon> cpn  = cpnsvc.couponUsers2(cpnName);
		return cpn ;

	}

	
} 


