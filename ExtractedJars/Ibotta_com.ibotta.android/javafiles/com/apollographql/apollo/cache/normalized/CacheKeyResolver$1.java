// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;

import com.apollographql.apollo.api.ResponseField;
import java.util.Map;

// Referenced classes of package com.apollographql.apollo.cache.normalized:
//			CacheKeyResolver, CacheKey

class CacheKeyResolver$1 extends CacheKeyResolver
{

	public CacheKey fromFieldArguments(ResponseField responsefield, com.apollographql.apollo.api. )
	{
		return CacheKey.NO_KEY;
	//    0    0:getstatic       #18  <Field CacheKey CacheKey.NO_KEY>
	//    1    3:areturn         
	}

	public CacheKey fromFieldRecordSet(ResponseField responsefield, Map map)
	{
		return CacheKey.NO_KEY;
	//    0    0:getstatic       #18  <Field CacheKey CacheKey.NO_KEY>
	//    1    3:areturn         
	}

	CacheKeyResolver$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void CacheKeyResolver()>
	//    2    4:return          
	}
}
