package com.example.user.gcm_demo;

public interface Config {

	// used to share GCM regId with application server - using php app server
	//static final String APP_SERVER_URL = "http://192.168.0.29/android/gcm.php?shareRegId=1";

	// GCM server using java
	static final String APP_SERVER_URL = "http://192.168.0.29:8080/GcmServer/GCMNotification?shareRegId=1";
	//static final String APP_SERVER_URL = "http://192.168.0.29:8080/ServletDemo/SecondServlet?shareRegId=1";
	// Google Project Number
	static final String GOOGLE_PROJECT_ID = "86198817585";
	static final String MESSAGE_KEY = "message";

}
