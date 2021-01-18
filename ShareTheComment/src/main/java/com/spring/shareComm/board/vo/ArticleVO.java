package com.spring.shareComm.board.vo;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("boardVO")
public class ArticleVO {
	int articleNO;
	int parentNO;
	String title;
	String content;
	Date writtenDate;
	String id;
	int level;
	int likeCount;
	
	public ArticleVO() {}

	public ArticleVO(int articleNO, int parentNO, String title, String content, Date writtenDate, String id, int likeCount) {
		super();
		this.articleNO = articleNO;
		this.parentNO = parentNO;
		this.title = title;
		this.content = content;
		this.writtenDate = writtenDate;
		this.id = id;
		this.likeCount = likeCount;
	}

	public int getArticleNO() {
		return articleNO;
	}
	public void setArticleNO(int articleNO) {
		this.articleNO = articleNO;
	}
	public int getParentNO() {
		return parentNO;
	}
	public void setParentNO(int parentNO) {
		this.parentNO = parentNO;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWrittenDate() {
		return writtenDate;
	}
	public void setWrittenDate(Date writtenDate) {
		this.writtenDate = writtenDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	
	
}
