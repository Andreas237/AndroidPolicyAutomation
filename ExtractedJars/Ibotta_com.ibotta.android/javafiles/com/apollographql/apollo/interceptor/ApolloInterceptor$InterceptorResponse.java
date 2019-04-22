// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.internal.Optional;
import java.util.Collection;
import okhttp3.Response;

// Referenced classes of package com.apollographql.apollo.interceptor:
//			ApolloInterceptor

public static final class ApolloInterceptor$InterceptorResponse
{

	public final Optional cacheRecords;
	public final Optional httpResponse;
	public final Optional parsedResponse;

	public ApolloInterceptor$InterceptorResponse(Response response)
	{
		this(response, ((com.apollographql.apollo.api.Response) (null)), ((Collection) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #19  <Method void ApolloInterceptor$InterceptorResponse(Response, com.apollographql.apollo.api.Response, Collection)>
	//    5    7:return          
	}

	public ApolloInterceptor$InterceptorResponse(Response response, com.apollographql.apollo.api.Response response1, Collection collection)
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
