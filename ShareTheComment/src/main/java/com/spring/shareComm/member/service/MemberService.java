package com.spring.shareComm.member.service;

import java.util.List;

import com.spring.shareComm.member.vo.MemberVO;

public interface MemberService {
	public List<MemberVO> selectAll();
	public MemberVO select(String id);
	public MemberVO select(MemberVO memberVO);
	public void addMember(MemberVO memberVO);
	public void removeMember(String id);
	public void modMember(MemberVO memberVO);
	public MemberVO login(MemberVO memberVO);
}
