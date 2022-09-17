package com.velociter.hibernate.componentmapping.socialmedia;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SOCIAL_MEDIA")
public class SocialMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="USER_ID")
	private long userId;
    @Column(name="PASSWORD")
	private String password;
    @Column(name="CONFIRM_PASSWORD")
	private String confirmPassword;
	
  /*  @Embedded
	private Post post = new Post();*/
    @Embedded
	private Profile profile = new Profile();

	public SocialMedia() {
	}

	public SocialMedia(String password, String confirmPassword, Profile profile) {
		super();
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.profile = profile;
	}



	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	/*public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}*/

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}
