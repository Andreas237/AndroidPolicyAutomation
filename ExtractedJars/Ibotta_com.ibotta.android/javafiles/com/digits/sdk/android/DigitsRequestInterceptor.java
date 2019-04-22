// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import retrofit.RequestInterceptor;

// Referenced classes of package com.digits.sdk.android:
//			DigitsUserAgent

class DigitsRequestInterceptor
	implements RequestInterceptor
{

	public DigitsRequestInterceptor(DigitsUserAgent digitsuseragent)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		userAgent = digitsuseragent;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field DigitsUserAgent userAgent>
	//    5    9:return          
	}

	public void intercept(retrofit.RequestInterceptor.RequestFacade requestfacade)
	{
		requestfacade.addHeader("User-Agent", userAgent.toString());
	//    0    0:aload_1         
	//    1    1:ldc1            #20  <String "User-Agent">
	//    2    3:aload_0         
	//    3    4:getfield        #15  <Field DigitsUserAgent userAgent>
	//    4    7:invokevirtual   #26  <Method String DigitsUserAgent.toString()>
	//    5   10:invokeinterface #32  <Method void retrofit.RequestInterceptor$RequestFacade.addHeader(String, String)>
	//    6   15:return          
	}

	private final DigitsUserAgent userAgent;
}
