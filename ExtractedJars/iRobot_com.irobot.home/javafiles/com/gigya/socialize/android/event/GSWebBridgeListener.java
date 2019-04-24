// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.event;

import android.webkit.WebView;
import com.gigya.socialize.GSObject;
import com.gigya.socialize.GSResponse;

public abstract class GSWebBridgeListener
{

	public GSWebBridgeListener()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public void beforeLogin(WebView webview, com.gigya.socialize.android.GSLoginRequest.LoginRequestType loginrequesttype, GSObject gsobject)
	{
	//    0    0:return          
	}

	public void onLoginResponse(WebView webview, GSResponse gsresponse)
	{
	//    0    0:return          
	}

	public abstract void onPluginEvent(WebView webview, GSObject gsobject, String s);
}
