package com.agiletec.plugins.${newPluginName}.aps.system.services.${Object};

import com.agiletec.aps.system.common.AbstractService;

public class ${ObjectClass}Manager extends AbstractService implements I${ObjectClass}Manager {
	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	protected I${ObjectClass}DAO get${ObjectClass}DAO() {
		return _${Object}Dao;
	}
	
	public void set${ObjectClass}DAO(I${ObjectClass}DAO ${Object}Dao) {
		this._${Object}Dao = ${Object}Dao;
	}

	private I${ObjectClass}DAO _${Object}Dao;
	
}
