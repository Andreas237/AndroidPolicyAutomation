// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api.cache.http;

import java.util.concurrent.TimeUnit;

public final class HttpCachePolicy
{
	public static final class ExpirePolicy extends Policy
	{

		ExpirePolicy(FetchStrategy fetchstrategy)
		{
			super(fetchstrategy, 0L, ((TimeUnit) (null)), false);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:lconst_0        
		//    3    3:aconst_null     
		//    4    4:iconst_0        
		//    5    5:invokespecial   #12  <Method void HttpCachePolicy$Policy(HttpCachePolicy$FetchStrategy, long, TimeUnit, boolean)>
		//    6    8:return          
		}
	}

	public static final class FetchStrategy extends Enum
	{

		public static FetchStrategy valueOf(String s)
		{
			return (FetchStrategy)Enum.valueOf(com/apollographql/apollo/api/cache/http/HttpCachePolicy$FetchStrategy, s);
		//    0    0:ldc1            #2   <Class HttpCachePolicy$FetchStrategy>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class HttpCachePolicy$FetchStrategy>
		//    4    9:areturn         
		}

		public static FetchStrategy[] values()
		{
			return (FetchStrategy[])((FetchStrategy []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field HttpCachePolicy$FetchStrategy[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.apollographql.apollo.api.cache.http.HttpCachePolicy$FetchStrategy_3B_.clone()>
		//    2    6:checkcast       #46  <Class HttpCachePolicy$FetchStrategy[]>
		//    3    9:areturn         
		}

		private static final FetchStrategy $VALUES[];
		public static final FetchStrategy CACHE_FIRST;
		public static final FetchStrategy CACHE_ONLY;
		public static final FetchStrategy NETWORK_FIRST;
		public static final FetchStrategy NETWORK_ONLY;

		static 
		{
			CACHE_ONLY = new FetchStrategy("CACHE_ONLY", 0);
		//    0    0:new             #2   <Class HttpCachePolicy$FetchStrategy>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "CACHE_ONLY">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void HttpCachePolicy$FetchStrategy(String, int)>
		//    5   10:putstatic       #24  <Field HttpCachePolicy$FetchStrategy CACHE_ONLY>
			NETWORK_ONLY = new FetchStrategy("NETWORK_ONLY", 1);
		//    6   13:new             #2   <Class HttpCachePolicy$FetchStrategy>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "NETWORK_ONLY">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void HttpCachePolicy$FetchStrategy(String, int)>
		//   11   23:putstatic       #27  <Field HttpCachePolicy$FetchStrategy NETWORK_ONLY>
			CACHE_FIRST = new FetchStrategy("CACHE_FIRST", 2);
		//   12   26:new             #2   <Class HttpCachePolicy$FetchStrategy>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "CACHE_FIRST">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void HttpCachePolicy$FetchStrategy(String, int)>
		//   17   36:putstatic       #30  <Field HttpCachePolicy$FetchStrategy CACHE_FIRST>
			NETWORK_FIRST = new FetchStrategy("NETWORK_FIRST", 3);
		//   18   39:new             #2   <Class HttpCachePolicy$FetchStrategy>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "NETWORK_FIRST">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void HttpCachePolicy$FetchStrategy(String, int)>
		//   23   49:putstatic       #33  <Field HttpCachePolicy$FetchStrategy NETWORK_FIRST>
			$VALUES = (new FetchStrategy[] {
				CACHE_ONLY, NETWORK_ONLY, CACHE_FIRST, NETWORK_FIRST
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       FetchStrategy[]
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

		private FetchStrategy(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static class Policy
	{

		public long expireTimeoutMs()
		{
			TimeUnit timeunit = expireTimeUnit;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field TimeUnit expireTimeUnit>
		//    2    4:astore_1        
			if(timeunit == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       11
				return 0L;
		//    5    9:lconst_0        
		//    6   10:lreturn         
			else
				return timeunit.toMillis(expireTimeout);
		//    7   11:aload_1         
		//    8   12:aload_0         
		//    9   13:getfield        #24  <Field long expireTimeout>
		//   10   16:invokevirtual   #37  <Method long TimeUnit.toMillis(long)>
		//   11   19:lreturn         
		}

		public final boolean expireAfterRead;
		public final TimeUnit expireTimeUnit;
		public final long expireTimeout;
		public final FetchStrategy fetchStrategy;

		Policy(FetchStrategy fetchstrategy, long l, TimeUnit timeunit, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			fetchStrategy = fetchstrategy;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field HttpCachePolicy$FetchStrategy fetchStrategy>
			expireTimeout = l;
		//    5    9:aload_0         
		//    6   10:lload_2         
		//    7   11:putfield        #24  <Field long expireTimeout>
			expireTimeUnit = timeunit;
		//    8   14:aload_0         
		//    9   15:aload           4
		//   10   17:putfield        #26  <Field TimeUnit expireTimeUnit>
			expireAfterRead = flag;
		//   11   20:aload_0         
		//   12   21:iload           5
		//   13   23:putfield        #28  <Field boolean expireAfterRead>
		//   14   26:return          
		}
	}


	public static final ExpirePolicy CACHE_FIRST;
	public static final ExpirePolicy CACHE_ONLY;
	public static final ExpirePolicy NETWORK_FIRST;
	public static final Policy NETWORK_ONLY;

	static 
	{
		CACHE_ONLY = new ExpirePolicy(FetchStrategy.CACHE_ONLY);
	//    0    0:new             #6   <Class HttpCachePolicy$ExpirePolicy>
	//    1    3:dup             
	//    2    4:getstatic       #24  <Field HttpCachePolicy$FetchStrategy HttpCachePolicy$FetchStrategy.CACHE_ONLY>
	//    3    7:invokespecial   #28  <Method void HttpCachePolicy$ExpirePolicy(HttpCachePolicy$FetchStrategy)>
	//    4   10:putstatic       #30  <Field HttpCachePolicy$ExpirePolicy CACHE_ONLY>
		NETWORK_ONLY = new Policy(FetchStrategy.NETWORK_ONLY, 0L, ((TimeUnit) (null)), false);
	//    5   13:new             #12  <Class HttpCachePolicy$Policy>
	//    6   16:dup             
	//    7   17:getstatic       #32  <Field HttpCachePolicy$FetchStrategy HttpCachePolicy$FetchStrategy.NETWORK_ONLY>
	//    8   20:lconst_0        
	//    9   21:aconst_null     
	//   10   22:iconst_0        
	//   11   23:invokespecial   #35  <Method void HttpCachePolicy$Policy(HttpCachePolicy$FetchStrategy, long, TimeUnit, boolean)>
	//   12   26:putstatic       #37  <Field HttpCachePolicy$Policy NETWORK_ONLY>
		CACHE_FIRST = new ExpirePolicy(FetchStrategy.CACHE_FIRST);
	//   13   29:new             #6   <Class HttpCachePolicy$ExpirePolicy>
	//   14   32:dup             
	//   15   33:getstatic       #39  <Field HttpCachePolicy$FetchStrategy HttpCachePolicy$FetchStrategy.CACHE_FIRST>
	//   16   36:invokespecial   #28  <Method void HttpCachePolicy$ExpirePolicy(HttpCachePolicy$FetchStrategy)>
	//   17   39:putstatic       #41  <Field HttpCachePolicy$ExpirePolicy CACHE_FIRST>
		NETWORK_FIRST = new ExpirePolicy(FetchStrategy.NETWORK_FIRST);
	//   18   42:new             #6   <Class HttpCachePolicy$ExpirePolicy>
	//   19   45:dup             
	//   20   46:getstatic       #43  <Field HttpCachePolicy$FetchStrategy HttpCachePolicy$FetchStrategy.NETWORK_FIRST>
	//   21   49:invokespecial   #28  <Method void HttpCachePolicy$ExpirePolicy(HttpCachePolicy$FetchStrategy)>
	//   22   52:putstatic       #45  <Field HttpCachePolicy$ExpirePolicy NETWORK_FIRST>
	//*  23   55:return          
	}
}
