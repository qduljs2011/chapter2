package com.baobaotao.util;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer{
	private String[] encryptPropNames={"color"};

	@Override
	protected String convertProperty(String propertyName, String propertyValue) {
		if(isEncryptProp(propertyName)){
			String decryptvalue=DESUtil.getDecryptString(propertyValue);
			return decryptvalue;
		}else{
			return propertyValue;
		}
		
	}
	
	private boolean isEncryptProp(String propertyName){
		for(int i=0;i<encryptPropNames.length;i++){
			if(encryptPropNames[i].equals(propertyName)){
				return true;
			}
		}
		return false;
	}
}
