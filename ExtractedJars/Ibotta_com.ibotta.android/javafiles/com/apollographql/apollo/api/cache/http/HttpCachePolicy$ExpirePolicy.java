// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api.cache.http;


// Referenced classes of package com.apollographql.apollo.api.cache.http:
//			HttpCachePolicy

public static final class HttpCachePolicy$ExpirePolicy extends HttpCachePolicy.Policy
{

	HttpCachePolicy$ExpirePolicy( )
	{
		super(, 0L, ((java.util.concurrent.TimeUnit) (null)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lconst_0        
	//    3    3:aconst_null     
	//    4    4:iconst_0        
	//    5    5:invokespecial   #12  <Method void HttpCachePolicy$Policy(HttpCachePolicy$FetchStrategy, long, java.util.concurrent.TimeUnit, boolean)>
	//    6    8:return          
	}
}
