// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api.cache.http;


// Referenced classes of package com.apollographql.apollo.api.cache.http:
//			HttpCachePolicy

public static final class HttpCachePolicy$FetchStrategy extends Enum
{

	public static HttpCachePolicy$FetchStrategy valueOf(String s)
	{
		return (HttpCachePolicy$FetchStrategy)Enum.valueOf(com/apollographql/apollo/api/cache/http/HttpCachePolicy$FetchStrategy, s);
	//    0    0:ldc1            #2   <Class HttpCachePolicy$FetchStrategy>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class HttpCachePolicy$FetchStrategy>
	//    4    9:areturn         
	}

	public static HttpCachePolicy$FetchStrategy[] values()
	{
		return (HttpCachePolicy$FetchStrategy[])((HttpCachePolicy$FetchStrategy []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field HttpCachePolicy$FetchStrategy[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.apollographql.apollo.api.cache.http.HttpCachePolicy$FetchStrategy_3B_.clone()>
	//    2    6:checkcast       #46  <Class HttpCachePolicy$FetchStrategy[]>
	//    3    9:areturn         
	}

	private static final HttpCachePolicy$FetchStrategy $VALUES[];
	public static final HttpCachePolicy$FetchStrategy CACHE_FIRST;
	public static final HttpCachePolicy$FetchStrategy CACHE_ONLY;
	public static final HttpCachePolicy$FetchStrategy NETWORK_FIRST;
	public static final HttpCachePolicy$FetchStrategy NETWORK_ONLY;

	static 
	{
		CACHE_ONLY = new HttpCachePolicy$FetchStrategy("CACHE_ONLY", 0);
	//    0    0:new             #2   <Class HttpCachePolicy$FetchStrategy>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "CACHE_ONLY">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void HttpCachePolicy$FetchStrategy(String, int)>
	//    5   10:putstatic       #24  <Field HttpCachePolicy$FetchStrategy CACHE_ONLY>
		NETWORK_ONLY = new HttpCachePolicy$FetchStrategy("NETWORK_ONLY", 1);
	//    6   13:new             #2   <Class HttpCachePolicy$FetchStrategy>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "NETWORK_ONLY">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void HttpCachePolicy$FetchStrategy(String, int)>
	//   11   23:putstatic       #27  <Field HttpCachePolicy$FetchStrategy NETWORK_ONLY>
		CACHE_FIRST = new HttpCachePolicy$FetchStrategy("CACHE_FIRST", 2);
	//   12   26:new             #2   <Class HttpCachePolicy$FetchStrategy>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "CACHE_FIRST">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void HttpCachePolicy$FetchStrategy(String, int)>
	//   17   36:putstatic       #30  <Field HttpCachePolicy$FetchStrategy CACHE_FIRST>
		NETWORK_FIRST = new HttpCachePolicy$FetchStrategy("NETWORK_FIRST", 3);
	//   18   39:new             #2   <Class HttpCachePolicy$FetchStrategy>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "NETWORK_FIRST">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void HttpCachePolicy$FetchStrategy(String, int)>
	//   23   49:putstatic       #33  <Field HttpCachePolicy$FetchStrategy NETWORK_FIRST>
		$VALUES = (new HttpCachePolicy$FetchStrategy[] {
			CACHE_ONLY, NETWORK_ONLY, CACHE_FIRST, NETWORK_FIRST
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       HttpCachePolicy$FetchStrategy[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field HttpCachePolicy$FetchStrategy CACHE_ONLY>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field HttpCachePolicy$FetchStrategy NETWORK_ONLY>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field HttpCachePolicy$FetchStrategy CACHE_FIRST>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field HttpCachePolicy$FetchStrategy NETWORK_FIRST>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field HttpCachePolicy$FetchStrategy[] $VALUES>
	//*  43   83:return          
	}

	private HttpCachePolicy$FetchStrategy(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
