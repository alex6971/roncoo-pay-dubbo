/*
 *
 * 陈德元：



 *
 */
package com.roncoo.utils.httpclient;

import javax.net.ssl.TrustManagerFactory;

public class TrustKeyStore {
	private TrustManagerFactory trustManagerFactory;
	
	TrustKeyStore(TrustManagerFactory trustManagerFactory){
		this.trustManagerFactory = trustManagerFactory;
	}
	
	TrustManagerFactory getTrustManagerFactory(){
		return trustManagerFactory;
	}
}
