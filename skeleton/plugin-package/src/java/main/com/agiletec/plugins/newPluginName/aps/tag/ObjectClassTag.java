package com.agiletec.plugins.${newPluginName}.aps.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import com.agiletec.aps.system.ApsSystemUtils;
import com.agiletec.aps.util.ApsWebApplicationUtils;
import com.agiletec.plugins.${newPluginName}.aps.system.${newPluginNameClass}SystemConstants;
import com.agiletec.plugins.${newPluginName}.aps.system.services.${Object}.I${ObjectClass}Manager;

public class ${ObjectClass}Tag extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		try {
			I${ObjectClass}Manager ${Object}manager = (I${ObjectClass}Manager) ApsWebApplicationUtils.getBean(${newPluginNameClass}SystemConstants.${ObjectClass}_MANAGER, this.pageContext);
			String ${Object}config = "ok";
			this.pageContext.setAttribute(this.getVar(), ${Object}config);
		} catch (Throwable t) {
			ApsSystemUtils.logThrowable(t, this, "doStartTag");
			throw new JspException("Error in ${ObjectClass}Tag", t);
		}
		return super.doStartTag();
	}	
	
	@Override
	public void release() {
		super.release();
		this.setVar(null);
	}

	public String getVar() {
		return _var;
	}
	
	public void setVar(String var) {
		this._var = var;
	}
	
	private String _var;

}
