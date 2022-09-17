package com.velociter.hibernate.componentmapping.socialmedia;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Embeddable
public class Post {
	@Column(name="POST_TYPE")
	private String postType;
	@Column(name="LIKE_COUNT")
	private String likeCount;
	@Column(name="DISLIKE_COUNT")
	private String dislikeCount;
	@Column(name="COMMENT_COUNT")
	private String commentCount;
	
	public Post() {}

	public Post(String postType, String likeCount, String dislikeCount, String commentCount) {
		super();
		this.postType = postType;
		this.likeCount = likeCount;
		this.dislikeCount = dislikeCount;
		this.commentCount = commentCount;
	}

	public String getPostType() {
		return postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	public String getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(String likeCount) {
		this.likeCount = likeCount;
	}

	public String getDislikeCount() {
		return dislikeCount;
	}

	public void setDislikeCount(String dislikeCount) {
		this.dislikeCount = dislikeCount;
	}

	public String getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(String commentCount) {
		this.commentCount = commentCount;
	}


	

}
