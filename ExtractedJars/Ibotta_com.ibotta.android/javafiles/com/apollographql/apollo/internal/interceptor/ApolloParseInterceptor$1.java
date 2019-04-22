// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.interceptor;

import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.exception.ApolloException;
import okhttp3.Response;

// Referenced classes of package com.apollographql.apollo.internal.interceptor:
//			ApolloParseInterceptor

class ApolloParseInterceptor$1
	implements com.apollographql.apollo.interceptor.k
{

	public void onCompleted()
	{
	//    0    0:return          
	}

	public void onFailure(ApolloException apolloexception)
	{
		if(disposed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field ApolloParseInterceptor this$0>
	//*   2    4:getfield        #37  <Field boolean ApolloParseInterceptor.disposed>
	//*   3    7:ifeq            11
		{
			return;
	//    4   10:return          
		} else
		{
			val$callBack.onFailure(apolloexception);
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
	//    7   15:aload_1         
	//    8   16:invokeinterface #39  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFailure(ApolloException)>
			return;
	//    9   21:return          
		}
	}

	public void onFetch(com.apollographql.apollo.interceptor.urceType urcetype)
	{
		val$callBack.onFetch(urcetype);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
	//    2    4:aload_1         
	//    3    5:invokeinterface #44  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType)>
	//    4   10:return          
	}

	public void onResponse(com.apollographql.apollo.interceptor.ptorResponse ptorresponse)
	{
		if(disposed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field ApolloParseInterceptor this$0>
	//*   2    4:getfield        #37  <Field boolean ApolloParseInterceptor.disposed>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		try
		{
			ptorresponse = parse(val$request.operation, (Response)ptorresponse.httpResponse.get());
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field ApolloParseInterceptor this$0>
	//    7   15:aload_0         
	//    8   16:getfield        #23  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
	//    9   19:getfield        #54  <Field com.apollographql.apollo.api.Operation com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.operation>
	//   10   22:aload_1         
	//   11   23:getfield        #60  <Field Optional com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse.httpResponse>
	//   12   26:invokevirtual   #66  <Method Object Optional.get()>
	//   13   29:checkcast       #68  <Class Response>
	//   14   32:invokevirtual   #72  <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse ApolloParseInterceptor.parse(com.apollographql.apollo.api.Operation, Response)>
	//   15   35:astore_1        
			val$callBack.onResponse(ptorresponse);
	//   16   36:aload_0         
	//   17   37:getfield        #25  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
	//   18   40:aload_1         
	//   19   41:invokeinterface #74  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse)>
			val$callBack.onCompleted();
	//   20   46:aload_0         
	//   21   47:getfield        #25  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
	//   22   50:invokeinterface #76  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onCompleted()>
			return;
	//   23   55:return          
		}
		// Misplaced declaration of an exception variable
		catch(com.apollographql.apollo.interceptor.ptorResponse ptorresponse)
	//*  24   56:astore_1        
		{
			onFailure(((ApolloException) (ptorresponse)));
	//   25   57:aload_0         
	//   26   58:aload_1         
	//   27   59:invokevirtual   #77  <Method void onFailure(ApolloException)>
		}
		return;
	//   28   62:return          
	}

	final ApolloParseInterceptor this$0;
	final com.apollographql.apollo.interceptor.k val$callBack;
	final com.apollographql.apollo.interceptor.ptorRequest val$request;

	ApolloParseInterceptor$1()
	{
		this$0 = final_apolloparseinterceptor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field ApolloParseInterceptor this$0>
		val$request = ptorrequest;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
		val$callBack = com.apollographql.apollo.interceptor.k.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
