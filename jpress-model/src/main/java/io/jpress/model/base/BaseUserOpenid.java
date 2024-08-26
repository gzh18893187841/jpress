package io.jpress.model.base;

import com.jfinal.plugin.activerecord.IBean;
import io.jpress.base.BaseOptionsModel;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserOpenid<M extends BaseUserOpenid<M>> extends BaseOptionsModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

	public void setId(Long id) {
		set("id", id);
	}

	public Long getId() {
		return getLong("id");
	}

    /**
     * 用户ID
     */
	public void setUserId(Long userId) {
		set("user_id", userId);
	}

    /**
     * 用户ID
     */
	public Long getUserId() {
		return getLong("user_id");
	}

    /**
     * 第三方类型：wechat，dingding，qq...
     */
	public void setType(String type) {
		set("type", type);
	}

    /**
     * 第三方类型：wechat，dingding，qq...
     */
	public String getType() {
		return getStr("type");
	}

    /**
     * 第三方的openId的值
     */
	public void setValue(String value) {
		set("value", value);
	}

    /**
     * 第三方的openId的值
     */
	public String getValue() {
		return getStr("value");
	}

    /**
     * 可能用不到
     */
	public void setAccessToken(String accessToken) {
		set("access_token", accessToken);
	}

    /**
     * 可能用不到
     */
	public String getAccessToken() {
		return getStr("access_token");
	}

    /**
     * access_token的过期时间
     */
	public void setExpiredTime(java.util.Date expiredTime) {
		set("expired_time", expiredTime);
	}

    /**
     * access_token的过期时间
     */
	public java.util.Date getExpiredTime() {
		return getDate("expired_time");
	}

    /**
     * 昵称
     */
	public void setNickname(String nickname) {
		set("nickname", nickname);
	}

    /**
     * 昵称
     */
	public String getNickname() {
		return getStr("nickname");
	}

    /**
     * 头像
     */
	public void setAvatar(String avatar) {
		set("avatar", avatar);
	}

    /**
     * 头像
     */
	public String getAvatar() {
		return getStr("avatar");
	}

	public void setOptions(String options) {
		set("options", options);
	}

	public String getOptions() {
		return getStr("options");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}

	public java.util.Date getCreated() {
		return getDate("created");
	}

	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}

	public java.util.Date getModified() {
		return getDate("modified");
	}

}

