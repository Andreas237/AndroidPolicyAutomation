// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal;

import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.internal.subscription.ApolloSubscriptionException;

// Referenced classes of package com.apollographql.apollo.internal:
//			RealApolloSubscriptionCall

private static final class RealApolloSubscriptionCall$SubscriptionManagerCallback
	implements com.apollographql.apollo.internal.subscription.SubscriptionManager.Callback
{

	public void onCompleted()
	{
		Object obj = ((Object) (originalCallback));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field com.apollographql.apollo.ApolloSubscriptionCall$Callback originalCallback>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			((com.apollographql.apollo.ApolloSubscriptionCall.Callback) (obj)).onCompleted();
	//    5    9:aload_1         
	//    6   10:invokeinterface #33  <Method void com.apollographql.apollo.ApolloSubscriptionCall$Callback.onCompleted()>
		obj = ((Object) (_flddelegate));
	//    7   15:aload_0         
	//    8   16:getfield        #25  <Field RealApolloSubscriptionCall _flddelegate>
	//    9   19:astore_1        
		if(obj != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          28
			RealApolloSubscriptionCall.access$000(((RealApolloSubscriptionCall) (obj)));
	//   12   24:aload_1         
	//   13   25:invokestatic    #37  <Method void RealApolloSubscriptionCall.access$000(RealApolloSubscriptionCall)>
	//   14   28:return          
	}

	public void onError(ApolloSubscriptionException apollosubscriptionexception)
	{
		com.apollographql.apollo.ApolloSubscriptionCall.Callback callback = originalCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field com.apollographql.apollo.ApolloSubscriptionCall$Callback originalCallback>
	//    2    4:astore_2        
		if(callback != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			callback.onFailure(((com.apollographql.apollo.exception.ApolloException) (apollosubscriptionexception)));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #44  <Method void com.apollographql.apollo.ApolloSubscriptionCall$Callback.onFailure(com.apollographql.apollo.exception.ApolloException)>
		apollosubscriptionexception = ((ApolloSubscriptionException) (_flddelegate));
	//    8   16:aload_0         
	//    9   17:getfield        #25  <Field RealApolloSubscriptionCall _flddelegate>
	//   10   20:astore_1        
		if(apollosubscriptionexception != null)
	//*  11   21:aload_1         
	//*  12   22:ifnull          29
			RealApolloSubscriptionCall.access$000(((RealApolloSubscriptionCall) (apollosubscriptionexception)));
	//   13   25:aload_1         
	//   14   26:invokestatic    #37  <Method void RealApolloSubscriptionCall.access$000(RealApolloSubscriptionCall)>
	//   15   29:return          
	}

	public void onNetworkError(Throwable throwable)
	{
		com.apollographql.apollo.ApolloSubscriptionCall.Callback callback = originalCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field com.apollographql.apollo.ApolloSubscriptionCall$Callback originalCallback>
	//    2    4:astore_2        
		if(callback != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          25
			callback.onFailure(((com.apollographql.apollo.exception.ApolloException) (new ApolloNetworkException("Subscription failed", throwable))));
	//    5    9:aload_2         
	//    6   10:new             #49  <Class ApolloNetworkException>
	//    7   13:dup             
	//    8   14:ldc1            #51  <String "Subscription failed">
	//    9   16:aload_1         
	//   10   17:invokespecial   #54  <Method void ApolloNetworkException(String, Throwable)>
	//   11   20:invokeinterface #44  <Method void com.apollographql.apollo.ApolloSubscriptionCall$Callback.onFailure(com.apollographql.apollo.exception.ApolloException)>
		throwable = ((Throwable) (_flddelegate));
	//   12   25:aload_0         
	//   13   26:getfield        #25  <Field RealApolloSubscriptionCall _flddelegate>
	//   14   29:astore_1        
		if(throwable != null)
	//*  15   30:aload_1         
	//*  16   31:ifnull          38
			RealApolloSubscriptionCall.access$000(((RealApolloSubscriptionCall) (throwable)));
	//   17   34:aload_1         
	//   18   35:invokestatic    #37  <Method void RealApolloSubscriptionCall.access$000(RealApolloSubscriptionCall)>
	//   19   38:return          
	}

	public void onResponse(Response response)
	{
		com.apollographql.apollo.ApolloSubscriptionCall.Callback callback = originalCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field com.apollographql.apollo.ApolloSubscriptionCall$Callback originalCallback>
	//    2    4:astore_2        
		if(callback != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			callback.onResponse(response);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #58  <Method void com.apollographql.apollo.ApolloSubscriptionCall$Callback.onResponse(Response)>
	//    8   16:return          
	}

	void release()
	{
		originalCallback = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #23  <Field com.apollographql.apollo.ApolloSubscriptionCall$Callback originalCallback>
		_flddelegate = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #25  <Field RealApolloSubscriptionCall _flddelegate>
	//    6   10:return          
	}

	private RealApolloSubscriptionCall _flddelegate;
	private com.apollographql.apollo.ApolloSubscriptionCall.Callback originalCallback;

	RealApolloSubscriptionCall$SubscriptionManagerCallback(com.apollographql.apollo.ApolloSubscriptionCall.Callback callback, RealApolloSubscriptionCall realapollosubscriptioncall)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		originalCallback = callback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field com.apollographql.apollo.ApolloSubscriptionCall$Callback originalCallback>
		_flddelegate = realapollosubscriptioncall;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field RealApolloSubscriptionCall _flddelegate>
	//    8   14:return          
	}
}
