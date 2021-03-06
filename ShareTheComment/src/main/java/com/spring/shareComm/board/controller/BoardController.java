package com.spring.shareComm.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.spring.shareComm.board.vo.ArticleVO;
import com.spring.shareComm.common.paging.Criteria;

public interface BoardController {
	public ModelAndView allArticles(HttpServletRequest request, Criteria criteria) throws Exception;
	public ModelAndView removeArticle(@RequestParam("articleNO") int no, HttpServletRequest request) throws Exception;
	ResponseEntity addArticle(MultipartHttpServletRequest multipartRequest, HttpServletResponse response)
			throws Exception;
}
