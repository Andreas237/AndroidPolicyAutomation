// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.cache.CacheHeaders;
import com.apollographql.apollo.exception.ApolloException;
import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.Executor;
import okhttp3.Response;

// Referenced classes of package com.apollographql.apollo.interceptor:
//			ApolloInterceptorChain

public interface ApolloInterceptor
{
	public static interface CallBack
	{

		public abstract void onCompleted();

		public abstract void onFailure(ApolloException apolloexception);

		public abstract void onFetch(FetchSourceType fetchsourcetype);

		public abstract void onResponse(InterceptorResponse interceptorresponse);
	}

	public static final class FetchSourceType extends Enum
	{

		public static FetchSourceType valueOf(String s)
		{
			return (FetchSourceType)Enum.valueOf(com/apollographql/apollo/interceptor/ApolloInterceptor$FetchSourceType, s);
		//    0    0:ldc1            #2   <Class ApolloInterceptor$FetchSourceType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ApolloInterceptor$FetchSourceType>
		//    4    9:areturn         
		}

		public static FetchSourceType[] values()
		{
			return (FetchSourceType[])((FetchSourceType []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field ApolloInterceptor$FetchSourceType[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType_3B_.clone()>
		//    2    6:checkcast       #38  <Class ApolloInterceptor$FetchSourceType[]>
		//    3    9:areturn         
		}

		private static final FetchSourceType $VALUES[];
		public static final FetchSourceType CACHE;
		public static final FetchSourceType NETWORK;

		static 
		{
			CACHE = new FetchSourceType("CACHE", 0);
		//    0    0:new             #2   <Class ApolloInterceptor$FetchSourceType>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "CACHE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void ApolloInterceptor$FetchSourceType(String, int)>
		//    5   10:putstatic       #22  <Field ApolloInterceptor$FetchSourceType CACHE>
			NETWORK = new FetchSourceType("NETWORK", 1);
		//    6   13:new             #2   <Class ApolloInterceptor$FetchSourceType>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "NETWORK">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void ApolloInterceptor$FetchSourceType(String, int)>
		//   11   23:putstatic       #25  <Field ApolloInterceptor$FetchSourceType NETWORK>
			$VALUES = (new FetchSourceType[] {
				CACHE, NETWORK
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       FetchSourceType[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field ApolloInterceptor$FetchSourceType CACHE>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field ApolloInterceptor$FetchSourceType NETWORK>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field ApolloInterceptor$FetchSourceType[] $VALUES>
		//*  23   45:return          
		}

		private FetchSourceType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class InterceptorRequest
	{

		public static Builder builder(Operation operation1)
		{
			return new Builder(operation1);
		//    0    0:new             #9   <Class ApolloInterceptor$InterceptorRequest$Builder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #51  <Method void ApolloInterceptor$InterceptorRequest$Builder(Operation)>
		//    4    8:areturn         
		}

		public Builder toBuilder()
		{
			return (new Builder(operation)).cacheHeaders(cacheHeaders).fetchFromCache(fetchFromCache).optimisticUpdates((com.apollographql.apollo.api.Operation.Data)optimisticUpdates.orNull());
		//    0    0:new             #9   <Class ApolloInterceptor$InterceptorRequest$Builder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #36  <Field Operation operation>
		//    4    8:invokespecial   #51  <Method void ApolloInterceptor$InterceptorRequest$Builder(Operation)>
		//    5   11:aload_0         
		//    6   12:getfield        #38  <Field CacheHeaders cacheHeaders>
		//    7   15:invokevirtual   #57  <Method ApolloInterceptor$InterceptorRequest$Builder ApolloInterceptor$InterceptorRequest$Builder.cacheHeaders(CacheHeaders)>
		//    8   18:aload_0         
		//    9   19:getfield        #42  <Field boolean fetchFromCache>
		//   10   22:invokevirtual   #60  <Method ApolloInterceptor$InterceptorRequest$Builder ApolloInterceptor$InterceptorRequest$Builder.fetchFromCache(boolean)>
		//   11   25:aload_0         
		//   12   26:getfield        #40  <Field Optional optimisticUpdates>
		//   13   29:invokevirtual   #66  <Method Object Optional.orNull()>
		//   14   32:checkcast       #68  <Class com.apollographql.apollo.api.Operation$Data>
		//   15   35:invokevirtual   #71  <Method ApolloInterceptor$InterceptorRequest$Builder ApolloInterceptor$InterceptorRequest$Builder.optimisticUpdates(com.apollographql.apollo.api.Operation$Data)>
		//   16   38:areturn         
		}

		public final CacheHeaders cacheHeaders;
		public final boolean fetchFromCache;
		public final Operation operation;
		public final Optional optimisticUpdates;
		public final UUID uniqueId = UUID.randomUUID();

		InterceptorRequest(Operation operation1, CacheHeaders cacheheaders, Optional optional, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:invokestatic    #32  <Method UUID UUID.randomUUID()>
		//    4    8:putfield        #34  <Field UUID uniqueId>
			operation = operation1;
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:putfield        #36  <Field Operation operation>
			cacheHeaders = cacheheaders;
		//    8   16:aload_0         
		//    9   17:aload_2         
		//   10   18:putfield        #38  <Field CacheHeaders cacheHeaders>
			optimisticUpdates = optional;
		//   11   21:aload_0         
		//   12   22:aload_3         
		//   13   23:putfield        #40  <Field Optional optimisticUpdates>
			fetchFromCache = flag;
		//   14   26:aload_0         
		//   15   27:iload           4
		//   16   29:putfield        #42  <Field boolean fetchFromCache>
		//   17   32:return          
		}
	}

	public static final class InterceptorRequest.Builder
	{

		public InterceptorRequest build()
		{
			return new InterceptorRequest(operation, cacheHeaders, optimisticUpdates, fetchFromCache);
		//    0    0:new             #6   <Class ApolloInterceptor$InterceptorRequest>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #52  <Field Operation operation>
		//    4    8:aload_0         
		//    5    9:getfield        #32  <Field CacheHeaders cacheHeaders>
		//    6   12:aload_0         
		//    7   13:getfield        #40  <Field Optional optimisticUpdates>
		//    8   16:aload_0         
		//    9   17:getfield        #58  <Field boolean fetchFromCache>
		//   10   20:invokespecial   #61  <Method void ApolloInterceptor$InterceptorRequest(Operation, CacheHeaders, Optional, boolean)>
		//   11   23:areturn         
		}

		public InterceptorRequest.Builder cacheHeaders(CacheHeaders cacheheaders)
		{
			cacheHeaders = (CacheHeaders)Utils.checkNotNull(((Object) (cacheheaders)), "cacheHeaders == null");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #64  <String "cacheHeaders == null">
		//    3    4:invokestatic    #48  <Method Object Utils.checkNotNull(Object, Object)>
		//    4    7:checkcast       #27  <Class CacheHeaders>
		//    5   10:putfield        #32  <Field CacheHeaders cacheHeaders>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		public InterceptorRequest.Builder fetchFromCache(boolean flag)
		{
			fetchFromCache = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #58  <Field boolean fetchFromCache>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public InterceptorRequest.Builder optimisticUpdates(com.apollographql.apollo.api.Operation.Data data)
		{
			optimisticUpdates = Optional.fromNullable(((Object) (data)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #70  <Method Optional Optional.fromNullable(Object)>
		//    3    5:putfield        #40  <Field Optional optimisticUpdates>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public InterceptorRequest.Builder optimisticUpdates(Optional optional)
		{
			optimisticUpdates = (Optional)Utils.checkNotNull(((Object) (optional)), "optimisticUpdates == null");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #73  <String "optimisticUpdates == null">
		//    3    4:invokestatic    #48  <Method Object Utils.checkNotNull(Object, Object)>
		//    4    7:checkcast       #34  <Class Optional>
		//    5   10:putfield        #40  <Field Optional optimisticUpdates>
			return this;
		//    6   13:aload_0         
		//    7   14:areturn         
		}

		private CacheHeaders cacheHeaders;
		private boolean fetchFromCache;
		private final Operation operation;
		private Optional optimisticUpdates;

		InterceptorRequest.Builder(Operation operation1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			cacheHeaders = CacheHeaders.NONE;
		//    2    4:aload_0         
		//    3    5:getstatic       #30  <Field CacheHeaders CacheHeaders.NONE>
		//    4    8:putfield        #32  <Field CacheHeaders cacheHeaders>
			optimisticUpdates = Optional.absent();
		//    5   11:aload_0         
		//    6   12:invokestatic    #38  <Method Optional Optional.absent()>
		//    7   15:putfield        #40  <Field Optional optimisticUpdates>
			operation = (Operation)Utils.checkNotNull(((Object) (operation1)), "operation == null");
		//    8   18:aload_0         
		//    9   19:aload_1         
		//   10   20:ldc1            #42  <String "operation == null">
		//   11   22:invokestatic    #48  <Method Object Utils.checkNotNull(Object, Object)>
		//   12   25:checkcast       #50  <Class Operation>
		//   13   28:putfield        #52  <Field Operation operation>
		//   14   31:return          
		}
	}

	public static final class InterceptorResponse
	{

		public final Optional cacheRecords;
		public final Optional httpResponse;
		public final Optional parsedResponse;

		public InterceptorResponse(Response response)
		{
			this(response, ((com.apollographql.apollo.api.Response) (null)), ((Collection) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:aconst_null     
		//    4    4:invokespecial   #19  <Method void ApolloInterceptor$InterceptorResponse(Response, com.apollographql.apollo.api.Response, Collection)>
		//    5    7:return          
		}

		public InterceptorResponse(Response response, com.apollographql.apollo.api.Response response1, Collection collection)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			httpResponse = Optional.fromNullable(((Object) (response)));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #29  <Method Optional Optional.fromNullable(Object)>
		//    5    9:putfield        #31  <Field Optional httpResponse>
			parsedResponse = Optional.fromNullable(((Object) (response1)));
		//    6   12:aload_0         
		//    7   13:aload_2         
		//    8   14:invokestatic    #29  <Method Optional Optional.fromNullable(Object)>
		//    9   17:putfield        #33  <Field Optional parsedResponse>
			cacheRecords = Optional.fromNullable(((Object) (collection)));
		//   10   20:aload_0         
		//   11   21:aload_3         
		//   12   22:invokestatic    #29  <Method Optional Optional.fromNullable(Object)>
		//   13   25:putfield        #35  <Field Optional cacheRecords>
		//   14   28:return          
		}
	}


	public abstract void dispose();

	public abstract void interceptAsync(InterceptorRequest interceptorrequest, ApolloInterceptorChain apollointerceptorchain, Executor executor, CallBack callback);
}
