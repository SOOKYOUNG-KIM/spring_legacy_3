package com.hani.s3.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/**")	//value 속성명이 하나만 있을경우 생략 가능
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("test")
	public void test() {
		memberService.test();
	}
	
	
	
	//로그인
	
	//회원가입
	
	
	
}
