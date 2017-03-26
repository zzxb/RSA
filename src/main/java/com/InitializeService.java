package com;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
public class InitializeService implements InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		//服务初始化时生成公钥密钥对
		RSAUtils.generateKeyPair();	//生成公钥密钥对
		System.out.println("GenerateKeyPair OK !");
	}

}
