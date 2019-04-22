// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.cache.normalized.CacheKey;
import java.util.*;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			ResponseNormalizer

class ResponseNormalizer$1 extends ResponseNormalizer
{

	public Set dependentKeys()
	{
		return Collections.emptySet();
	//    0    0:invokestatic    #16  <Method Set Collections.emptySet()>
	//    1    3:areturn         
	}

	public void didResolve(ResponseField responsefield, com.apollographql.apollo.api.Operation.Variables variables)
	{
	//    0    0:return          
	}

	public void didResolveElement(int i)
	{
	//    0    0:return          
	}

	public void didResolveList(List list)
	{
	//    0    0:return          
	}

	public void didResolveNull()
	{
	//    0    0:return          
	}

	public void didResolveObject(ResponseField responsefield, Optional optional)
	{
	//    0    0:return          
	}

	public void didResolveScalar(Object obj)
	{
	//    0    0:return          
	}

	public Collection records()
	{
		return ((Collection) (Collections.emptyList()));
	//    0    0:invokestatic    #35  <Method List Collections.emptyList()>
	//    1    3:areturn         
	}

	public CacheKey resolveCacheKey(ResponseField responsefield, Object obj)
	{
		return CacheKey.NO_KEY;
	//    0    0:getstatic       #45  <Field CacheKey CacheKey.NO_KEY>
	//    1    3:areturn         
	}

	public void willResolve(ResponseField responsefield, com.apollographql.apollo.api.Operation.Variables variables)
	{
	//    0    0:return          
	}

	public void willResolveElement(int i)
	{
	//    0    0:return          
	}

	public void willResolveObject(ResponseField responsefield, Optional optional)
	{
	//    0    0:return          
	}

	public void willResolveRootQuery(Operation operation)
	{
	//    0    0:return          
	}

	ResponseNormalizer$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void ResponseNormalizer()>
	//    2    4:return          
	}
}
