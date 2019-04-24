// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.internal.AppCall;

public abstract class ResultProcessor
{

	public ResultProcessor(FacebookCallback facebookcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		appCallback = facebookcallback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field FacebookCallback appCallback>
	//    5    9:return          
	}

	public void onCancel(AppCall appcall)
	{
		if(appCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field FacebookCallback appCallback>
	//*   2    4:ifnull          16
			appCallback.onCancel();
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field FacebookCallback appCallback>
	//    5   11:invokeinterface #20  <Method void FacebookCallback.onCancel()>
	//    6   16:return          
	}

	public void onError(AppCall appcall, FacebookException facebookexception)
	{
		if(appCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field FacebookCallback appCallback>
	//*   2    4:ifnull          17
			appCallback.onError(facebookexception);
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field FacebookCallback appCallback>
	//    5   11:aload_2         
	//    6   12:invokeinterface #25  <Method void FacebookCallback.onError(FacebookException)>
	//    7   17:return          
	}

	public abstract void onSuccess(AppCall appcall, Bundle bundle);

	private FacebookCallback appCallback;
}
