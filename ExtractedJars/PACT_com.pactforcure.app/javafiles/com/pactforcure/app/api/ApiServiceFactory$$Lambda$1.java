// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api;

import okhttp3.Interceptor;
import okhttp3.Response;

// Referenced classes of package com.pactforcure.app.api:
//			ApiServiceFactory

final class ApiServiceFactory$$Lambda$1
	implements Interceptor
{

	public static Interceptor lambdaFactory$()
	{
		return ((Interceptor) (instance));
	//    0    0:getstatic       #15  <Field ApiServiceFactory$$Lambda$1 instance>
	//    1    3:areturn         
	}

	public Response intercept(okhttp3.Interceptor.Chain chain)
	{
		return ApiServiceFactory.lambda$newAuthorizedApiService$0(chain);
	//    0    0:aload_1         
	//    1    1:invokestatic    #26  <Method Response ApiServiceFactory.lambda$newAuthorizedApiService$0(okhttp3.Interceptor$Chain)>
	//    2    4:areturn         
	}

	private static final ApiServiceFactory$$Lambda$1 instance = new ApiServiceFactory$$Lambda$1();

	static 
	{
	//    0    0:new             #2   <Class ApiServiceFactory$$Lambda$1>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void ApiServiceFactory$$Lambda$1()>
	//    3    7:putstatic       #15  <Field ApiServiceFactory$$Lambda$1 instance>
	//*   4   10:return          
	}

	private ApiServiceFactory$$Lambda$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}
}
