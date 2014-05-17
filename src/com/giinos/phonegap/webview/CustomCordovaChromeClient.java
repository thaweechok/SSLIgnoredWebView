package com.giinos.phonegap.webview;

import org.apache.cordova.CordovaChromeClient;
import org.apache.cordova.CordovaInterface;

public class CustomCordovaChromeClient extends CordovaChromeClient {

	public CustomCordovaChromeClient(CordovaInterface cordova){
		super(cordova);
	}
	
	
}
