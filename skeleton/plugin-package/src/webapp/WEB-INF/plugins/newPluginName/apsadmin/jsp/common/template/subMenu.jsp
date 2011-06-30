<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="apsadmin-core.tld" prefix="wpsa" %>
<%@ taglib prefix="wp" uri="aps-core.tld" %>
<wp:ifauthorized permission="superuser">
	<li><a href="<s:url action="intro" namespace="/do/${newPluginName}/${ObjectClass}" />" id="menu_${newPluginName}" tabindex="<wpsa:counter />"><s:text name="${newPluginName}.admin.menu" /></a></li>
</wp:ifauthorized>
