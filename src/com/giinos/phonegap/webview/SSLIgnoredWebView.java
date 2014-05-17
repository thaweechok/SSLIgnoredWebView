package com.giinos.phonegap.webview;

import org.apache.cordova.CordovaChromeClient;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;

public class SSLIgnoredWebView extends CordovaPlugin {

	
	@Override
	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
		webView.setWebViewClient(new CustomCordovaWebViewClient(cordova));
	
	}
}
