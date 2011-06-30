package com.agiletec.plugins.${newPluginName}.apsadmin.${Object};

import com.agiletec.apsadmin.system.BaseAction;
import com.agiletec.plugins.${newPluginName}.aps.system.services.${Object}.I${ObjectClass}Manager;


public class ${ObjectClass}Action extends BaseAction implements I${ObjectClass}Action {
	
	public I${ObjectClass}Manager get${newPluginNameClass}${ObjectClass}Manager() {
		return _${newPluginName}${ObjectClass}Manager;
	}

	public void set${newPluginNameClass}${ObjectClass}Manager(I${ObjectClass}Manager ${newPluginName}${ObjectClass}Manager) {
		this._${newPluginName}${ObjectClass}Manager = ${newPluginName}${ObjectClass}Manager;
	}

	private I${ObjectClass}Manager _${newPluginName}${ObjectClass}Manager;

}
