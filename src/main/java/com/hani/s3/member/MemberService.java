package com.hani.s3.member;

public class MemberService {

	private MemberDAO memberDAO;
	
	public MemberService() {
		// TODO Auto-generated constructor stub
	}
	
	
	public MemberService(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	public void test(){
		memberDAO.test();
		System.out.println("MemberService");
	}
	
}
