// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.fetcher;

import com.apollographql.apollo.internal.fetcher.*;

// Referenced classes of package com.apollographql.apollo.fetcher:
//			ResponseFetcher

public final class ApolloResponseFetchers
{

	public static final ResponseFetcher CACHE_AND_NETWORK = new CacheAndNetworkFetcher();
	public static final ResponseFetcher CACHE_FIRST = new CacheFirstFetcher();
	public static final ResponseFetcher CACHE_ONLY = new CacheOnlyFetcher();
	public static final ResponseFetcher NETWORK_FIRST = new NetworkFirstFetcher();
	public static final ResponseFetcher NETWORK_ONLY = new NetworkOnlyFetcher();

	static 
	{
	//    0    0:new             #14  <Class CacheOnlyFetcher>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void CacheOnlyFetcher()>
	//    3    7:putstatic       #19  <Field ResponseFetcher CACHE_ONLY>
	//    4   10:new             #21  <Class NetworkOnlyFetcher>
	//    5   13:dup             
	//    6   14:invokespecial   #22  <Method void NetworkOnlyFetcher()>
	//    7   17:putstatic       #24  <Field ResponseFetcher NETWORK_ONLY>
	//    8   20:new             #26  <Class CacheFirstFetcher>
	//    9   23:dup             
	//   10   24:invokespecial   #27  <Method void CacheFirstFetcher()>
	//   11   27:putstatic       #29  <Field ResponseFetcher CACHE_FIRST>
	//   12   30:new             #31  <Class NetworkFirstFetcher>
	//   13   33:dup             
	//   14   34:invokespecial   #32  <Method void NetworkFirstFetcher()>
	//   15   37:putstatic       #34  <Field ResponseFetcher NETWORK_FIRST>
	//   16   40:new             #36  <Class CacheAndNetworkFetcher>
	//   17   43:dup             
	//   18   44:invokespecial   #37  <Method void CacheAndNetworkFetcher()>
	//   19   47:putstatic       #39  <Field ResponseFetcher CACHE_AND_NETWORK>
	//*  20   50:return          
	}
}
