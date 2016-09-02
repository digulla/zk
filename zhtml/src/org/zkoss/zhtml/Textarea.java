/* Textarea.java

	Purpose:
		
	Description:
		
	History:
		Tue Dec 13 15:05:13     2005, Created by tomyeh

Copyright (C) 2005 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under LGPL Version 2.1 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.zhtml;

import java.lang.Object;

import org.zkoss.lang.Objects;
import org.zkoss.zhtml.impl.PageRenderer;
import org.zkoss.zhtml.impl.TagRenderContext;
import org.zkoss.zk.ui.Execution;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.ext.AfterCompose;

/**
 * The TEXTAREA tag.
 *
 * <p>
 * If you instantiate {@link Textarea} directly, you shall use {@link #setValue} to set up the
 * value. You shall not add children to it.
 * 
 * @author tomyeh
 */
public class Textarea extends Input implements AfterCompose {
	private String _value = "";

	static {
		addClientEvent(Textarea.class, Events.ON_CHANGE, 0);
		// don't declare as CE_IMPORTANT since it is not applicable
		// (all zhtml components share the same widget class)
	}

	public Textarea() {
		super("textarea");
	}

	public Textarea(String value) {
		super("textarea");
		_value = value != null ? value : "";
	}

	/**
	 * Returns the autofocus of this textarea tag.
	 * @since 8.0.3
	 */
	public String getAutofocus() {
		return (String) getDynamicProperty("autofocus");
	}

	/**
	 * Sets the autofocus of this textarea tag.
	 * @since 8.0.3
	 */
	public void setAutofocus(String autofocus) throws WrongValueException {
		setDynamicProperty("autofocus", autofocus);
	};
	/**
	 * Returns the cols of this textarea tag.
	 * @since 8.0.3
	 */
	public String getCols() {
		return (String) getDynamicProperty("cols");
	}

	/**
	 * Sets the cols of this textarea tag.
	 * @since 8.0.3
	 */
	public void setCols(String cols) throws WrongValueException {
		setDynamicProperty("cols", cols);
	};
	/**
	 * Returns the dirname of this textarea tag.
	 * @since 8.0.3
	 */
	public String getDirname() {
		return (String) getDynamicProperty("dirname");
	}

	/**
	 * Sets the dirname of this textarea tag.
	 * @since 8.0.3
	 */
	public void setDirname(String dirname) throws WrongValueException {
		setDynamicProperty("dirname", dirname);
	};
	/**
	 * Returns the disabled of this textarea tag.
	 * @since 8.0.3
	 */
	public String getDisabled() {
		return (String) getDynamicProperty("disabled");
	}

	/**
	 * Sets the disabled of this textarea tag.
	 * @since 8.0.3
	 */
	public void setDisabled(String disabled) throws WrongValueException {
		setDynamicProperty("disabled", disabled);
	};
	/**
	 * Returns the maxlength of this textarea tag.
	 * @since 8.0.3
	 */
	public String getMaxlength() {
		return (String) getDynamicProperty("maxlength");
	}

	/**
	 * Sets the maxlength of this textarea tag.
	 * @since 8.0.3
	 */
	public void setMaxlength(String maxlength) throws WrongValueException {
		setDynamicProperty("maxlength", maxlength);
	};
	/**
	 * Returns the name of this textarea tag.
	 * @since 8.0.3
	 */
	public String getName() {
		return (String) getDynamicProperty("name");
	}

	/**
	 * Sets the name of this textarea tag.
	 * @since 8.0.3
	 */
	public void setName(String name) throws WrongValueException {
		setDynamicProperty("name", name);
	};
	/**
	 * Returns the placeholder of this textarea tag.
	 * @since 8.0.3
	 */
	public String getPlaceholder() {
		return (String) getDynamicProperty("placeholder");
	}

	/**
	 * Sets the placeholder of this textarea tag.
	 * @since 8.0.3
	 */
	public void setPlaceholder(String placeholder) throws WrongValueException {
		setDynamicProperty("placeholder", placeholder);
	};
	/**
	 * Returns the readonly of this textarea tag.
	 * @since 8.0.3
	 */
	public String getReadonly() {
		return (String) getDynamicProperty("readonly");
	}

	/**
	 * Sets the readonly of this textarea tag.
	 * @since 8.0.3
	 */
	public void setReadonly(String readonly) throws WrongValueException {
		setDynamicProperty("readonly", readonly);
	};
	/**
	 * Returns the required of this textarea tag.
	 * @since 8.0.3
	 */
	public String getRequired() {
		return (String) getDynamicProperty("required");
	}

	/**
	 * Sets the required of this textarea tag.
	 * @since 8.0.3
	 */
	public void setRequired(String required) throws WrongValueException {
		setDynamicProperty("required", required);
	};
	/**
	 * Returns the rows of this textarea tag.
	 * @since 8.0.3
	 */
	public String getRows() {
		return (String) getDynamicProperty("rows");
	}

	/**
	 * Sets the rows of this textarea tag.
	 * @since 8.0.3
	 */
	public void setRows(String rows) throws WrongValueException {
		setDynamicProperty("rows", rows);
	};
	/**
	 * Returns the wrap of this textarea tag.
	 * @since 8.0.3
	 */
	public String getWrap() {
		return (String) getDynamicProperty("wrap");
	}

	/**
	 * Sets the wrap of this textarea tag.
	 * @since 8.0.3
	 */
	public void setWrap(String wrap) throws WrongValueException {
		setDynamicProperty("wrap", wrap);
	};

	public void afterCompose() {
		String content = PageRenderer.childrenToContent(this);
		if (content != null)
			setValue(content);
	}

	public void setDynamicProperty(String name, Object value) throws WrongValueException {
		if ("value".equals(name)) {
			_value = Objects.toString(value);
			if (_value == null)
				_value = "";
		} else {
			super.setDynamicProperty(name, value);
		}
	}

	public Object getDynamicProperty(String name) {
		return "value".equals(name) ? _value : super.getDynamicProperty(name);
	}

	// -- Component --//
	/**
	 * Returns the widget class, "zhtml.Input".
	 * 
	 * @since 8.0.0
	 */
	public String getWidgetClass() {
		return "zhtml.Input";
	}

	protected void renderProperties(org.zkoss.zk.ui.sys.ContentRenderer renderer)
			throws java.io.IOException {
		super.renderProperties(renderer);
		render(renderer, "value", _value);
	}

	protected void redrawChildrenDirectly(TagRenderContext rc, Execution exec, java.io.Writer out)
			throws java.io.IOException {
		out.write(_value);
		super.redrawChildrenDirectly(rc, exec, out);
	}
}
