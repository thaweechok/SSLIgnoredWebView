package com.giinos.phonegap.webview;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaChromeClient;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

public class SSLIgnoredWebView extends CordovaPlugin {

	
	@Override
	public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext) throws JSONException {
		// TODO Auto-generated method stub
		
		//this.webView.setWebViewClient(new CustomCordovaWebViewClient(cordova));
		callbackContext.success("set webview success. ");
		return true;
	}
	
	@Override
	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
		webView.setWebViewClient(new CustomCordovaWebViewClient(cordova));
	
	}
}
