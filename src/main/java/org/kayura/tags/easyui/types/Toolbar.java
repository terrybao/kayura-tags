/**
 * Copyright 2015-2016 the original author or authors.
 * HomePage: http://www.kayura.org
 */
package org.kayura.tags.easyui.types;

/**
 * Toolbar
 *
 * @author liangxia@live.com
 */
public class Toolbar {

	private String iconCls;
	private String handler;

	public Toolbar(String iconCls, String handler) {
		this.iconCls = iconCls;
		this.handler = handler;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public String getHandler() {
		return handler;
	}

	public void setHandler(String handler) {
		this.handler = handler;
	}

}
