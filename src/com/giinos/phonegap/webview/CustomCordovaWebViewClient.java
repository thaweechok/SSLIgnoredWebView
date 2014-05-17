package com.giinos.phonegap.webview;

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebViewClient;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

public class CustomCordovaWebViewClient extends CordovaWebViewClient {

	public CustomCordovaWebViewClient(CordovaInterface cordova){
		super(cordova);
	}
	
	@Override
	public void onReceivedSslError(WebView view, SslErrorHandler handler,
			SslError error) {
		//super.onReceivedSslError(view, handler, error);
		handler.proceed();
	}
}
