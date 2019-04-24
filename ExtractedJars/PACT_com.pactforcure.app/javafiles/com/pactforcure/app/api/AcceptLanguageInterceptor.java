// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api;

import com.pactforcure.app.util.LanguageUtils;
import java.io.IOException;
import java.util.Locale;
import okhttp3.*;

class AcceptLanguageInterceptor
	implements Interceptor
{

	public AcceptLanguageInterceptor(Locale locale)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		languageTag = LanguageUtils.toBcp47Language(locale);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #19  <Method String LanguageUtils.toBcp47Language(Locale)>
	//    5    9:putfield        #21  <Field String languageTag>
	//    6   12:return          
	}

	public Response intercept(okhttp3.Interceptor.Chain chain)
		throws IOException
	{
		return chain.proceed(chain.request().newBuilder().addHeader("Accept-Language", languageTag).build());
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:invokeinterface #32  <Method Request okhttp3.Interceptor$Chain.request()>
	//    3    7:invokevirtual   #38  <Method okhttp3.Request$Builder Request.newBuilder()>
	//    4   10:ldc1            #40  <String "Accept-Language">
	//    5   12:aload_0         
	//    6   13:getfield        #21  <Field String languageTag>
	//    7   16:invokevirtual   #46  <Method okhttp3.Request$Builder okhttp3.Request$Builder.addHeader(String, String)>
	//    8   19:invokevirtual   #49  <Method Request okhttp3.Request$Builder.build()>
	//    9   22:invokeinterface #53  <Method Response okhttp3.Interceptor$Chain.proceed(Request)>
	//   10   27:areturn         
	}

	private final String languageTag;
}
