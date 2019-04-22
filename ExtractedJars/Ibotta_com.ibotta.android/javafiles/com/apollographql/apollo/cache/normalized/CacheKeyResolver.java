// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.ResponseField;
import java.util.Map;

// Referenced classes of package com.apollographql.apollo.cache.normalized:
//			CacheKey

public abstract class CacheKeyResolver
{

	public CacheKeyResolver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}

	public static CacheKey rootKeyForOperation(Operation operation)
	{
		return ROOT_CACHE_KEY;
	//    0    0:getstatic       #22  <Field CacheKey ROOT_CACHE_KEY>
	//    1    3:areturn         
	}

	public abstract CacheKey fromFieldArguments(ResponseField responsefield, com.apollographql.apollo.api.Operation.Variables variables);

	public abstract CacheKey fromFieldRecordSet(ResponseField responsefield, Map map);

	public static final CacheKeyResolver DEFAULT = new CacheKeyResolver() {

		public CacheKey fromFieldArguments(ResponseField responsefield, com.apollographql.apollo.api.Operation.Variables variables)
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

	}
;
	private static final CacheKey ROOT_CACHE_KEY = CacheKey.from("QUERY_ROOT");

	static 
	{
	//    0    0:ldc1            #14  <String "QUERY_ROOT">
	//    1    2:invokestatic    #20  <Method CacheKey CacheKey.from(String)>
	//    2    5:putstatic       #22  <Field CacheKey ROOT_CACHE_KEY>
	//    3    8:new             #6   <Class CacheKeyResolver$1>
	//    4   11:dup             
	//    5   12:invokespecial   #25  <Method void CacheKeyResolver$1()>
	//    6   15:putstatic       #27  <Field CacheKeyResolver DEFAULT>
	//*   7   18:return          
	}
}
