// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal;

import com.apollographql.apollo.api.*;
import com.apollographql.apollo.api.internal.Action;
import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.exception.*;

// Referenced classes of package com.apollographql.apollo.internal:
//			RealApolloCall, QueryReFetcher, ApolloLogger

class RealApolloCall$1
	implements com.apollographql.apollo.interceptor..CallBack
{

	public void onCompleted()
	{
		Optional optional = terminate();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RealApolloCall this$0>
	//    2    4:invokevirtual   #28  <Method Optional RealApolloCall.terminate()>
	//    3    7:astore_1        
		if(queryReFetcher.isPresent())
	//*   4    8:aload_0         
	//*   5    9:getfield        #19  <Field RealApolloCall this$0>
	//*   6   12:getfield        #32  <Field Optional RealApolloCall.queryReFetcher>
	//*   7   15:invokevirtual   #38  <Method boolean Optional.isPresent()>
	//*   8   18:ifeq            37
			((QueryReFetcher)queryReFetcher.get()).refetch();
	//    9   21:aload_0         
	//   10   22:getfield        #19  <Field RealApolloCall this$0>
	//   11   25:getfield        #32  <Field Optional RealApolloCall.queryReFetcher>
	//   12   28:invokevirtual   #42  <Method Object Optional.get()>
	//   13   31:checkcast       #44  <Class QueryReFetcher>
	//   14   34:invokevirtual   #47  <Method void QueryReFetcher.refetch()>
		if(!optional.isPresent())
	//*  15   37:aload_1         
	//*  16   38:invokevirtual   #38  <Method boolean Optional.isPresent()>
	//*  17   41:ifne            81
		{
			logger.d("onCompleted for operation: %s. No callback present.", new Object[] {
				operation().name().name()
			});
	//   18   44:aload_0         
	//   19   45:getfield        #19  <Field RealApolloCall this$0>
	//   20   48:getfield        #51  <Field ApolloLogger RealApolloCall.logger>
	//   21   51:ldc1            #53  <String "onCompleted for operation: %s. No callback present.">
	//   22   53:iconst_1        
	//   23   54:anewarray       Object[]
	//   24   57:dup             
	//   25   58:iconst_0        
	//   26   59:aload_0         
	//   27   60:getfield        #19  <Field RealApolloCall this$0>
	//   28   63:invokevirtual   #57  <Method Operation RealApolloCall.operation()>
	//   29   66:invokeinterface #63  <Method OperationName Operation.name()>
	//   30   71:invokeinterface #68  <Method String OperationName.name()>
	//   31   76:aastore         
	//   32   77:invokevirtual   #74  <Method void ApolloLogger.d(String, Object[])>
			return;
	//   33   80:return          
		} else
		{
			((com.apollographql.apollo.ck)optional.get()).onStatusEvent(com.apollographql.apollo.Event.COMPLETED);
	//   34   81:aload_1         
	//   35   82:invokevirtual   #42  <Method Object Optional.get()>
	//   36   85:checkcast       #76  <Class com.apollographql.apollo.ApolloCall$Callback>
	//   37   88:getstatic       #82  <Field com.apollographql.apollo.ApolloCall$StatusEvent com.apollographql.apollo.ApolloCall$StatusEvent.COMPLETED>
	//   38   91:invokevirtual   #86  <Method void com.apollographql.apollo.ApolloCall$Callback.onStatusEvent(com.apollographql.apollo.ApolloCall$StatusEvent)>
			return;
	//   39   94:return          
		}
	}

	public void onFailure(ApolloException apolloexception)
	{
		Optional optional = terminate();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RealApolloCall this$0>
	//    2    4:invokevirtual   #28  <Method Optional RealApolloCall.terminate()>
	//    3    7:astore_2        
		if(!optional.isPresent())
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #38  <Method boolean Optional.isPresent()>
	//*   6   12:ifne            53
		{
			logger.d(((Throwable) (apolloexception)), "onFailure for operation: %s. No callback present.", new Object[] {
				operation().name().name()
			});
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field RealApolloCall this$0>
	//    9   19:getfield        #51  <Field ApolloLogger RealApolloCall.logger>
	//   10   22:aload_1         
	//   11   23:ldc1            #91  <String "onFailure for operation: %s. No callback present.">
	//   12   25:iconst_1        
	//   13   26:anewarray       Object[]
	//   14   29:dup             
	//   15   30:iconst_0        
	//   16   31:aload_0         
	//   17   32:getfield        #19  <Field RealApolloCall this$0>
	//   18   35:invokevirtual   #57  <Method Operation RealApolloCall.operation()>
	//   19   38:invokeinterface #63  <Method OperationName Operation.name()>
	//   20   43:invokeinterface #68  <Method String OperationName.name()>
	//   21   48:aastore         
	//   22   49:invokevirtual   #94  <Method void ApolloLogger.d(Throwable, String, Object[])>
			return;
	//   23   52:return          
		}
		if(apolloexception instanceof ApolloHttpException)
	//*  24   53:aload_1         
	//*  25   54:instanceof      #96  <Class ApolloHttpException>
	//*  26   57:ifeq            75
		{
			((com.apollographql.apollo.ck)optional.get()).onHttpError((ApolloHttpException)apolloexception);
	//   27   60:aload_2         
	//   28   61:invokevirtual   #42  <Method Object Optional.get()>
	//   29   64:checkcast       #76  <Class com.apollographql.apollo.ApolloCall$Callback>
	//   30   67:aload_1         
	//   31   68:checkcast       #96  <Class ApolloHttpException>
	//   32   71:invokevirtual   #100 <Method void com.apollographql.apollo.ApolloCall$Callback.onHttpError(ApolloHttpException)>
			return;
	//   33   74:return          
		}
		if(apolloexception instanceof ApolloParseException)
	//*  34   75:aload_1         
	//*  35   76:instanceof      #102 <Class ApolloParseException>
	//*  36   79:ifeq            97
		{
			((com.apollographql.apollo.ck)optional.get()).onParseError((ApolloParseException)apolloexception);
	//   37   82:aload_2         
	//   38   83:invokevirtual   #42  <Method Object Optional.get()>
	//   39   86:checkcast       #76  <Class com.apollographql.apollo.ApolloCall$Callback>
	//   40   89:aload_1         
	//   41   90:checkcast       #102 <Class ApolloParseException>
	//   42   93:invokevirtual   #106 <Method void com.apollographql.apollo.ApolloCall$Callback.onParseError(ApolloParseException)>
			return;
	//   43   96:return          
		}
		if(apolloexception instanceof ApolloNetworkException)
	//*  44   97:aload_1         
	//*  45   98:instanceof      #108 <Class ApolloNetworkException>
	//*  46  101:ifeq            119
		{
			((com.apollographql.apollo.ck)optional.get()).onNetworkError((ApolloNetworkException)apolloexception);
	//   47  104:aload_2         
	//   48  105:invokevirtual   #42  <Method Object Optional.get()>
	//   49  108:checkcast       #76  <Class com.apollographql.apollo.ApolloCall$Callback>
	//   50  111:aload_1         
	//   51  112:checkcast       #108 <Class ApolloNetworkException>
	//   52  115:invokevirtual   #112 <Method void com.apollographql.apollo.ApolloCall$Callback.onNetworkError(ApolloNetworkException)>
			return;
	//   53  118:return          
		} else
		{
			((com.apollographql.apollo.ck)optional.get()).onFailure(apolloexception);
	//   54  119:aload_2         
	//   55  120:invokevirtual   #42  <Method Object Optional.get()>
	//   56  123:checkcast       #76  <Class com.apollographql.apollo.ApolloCall$Callback>
	//   57  126:aload_1         
	//   58  127:invokevirtual   #114 <Method void com.apollographql.apollo.ApolloCall$Callback.onFailure(ApolloException)>
			return;
	//   59  130:return          
		}
	}

	public void onFetch(final com.apollographql.apollo.interceptor..FetchSourceType sourceType)
	{
		responseCallback().apply(new Action() {

			public void apply(com.apollographql.apollo.ApolloCall.Callback callback)
			{
				switch(RealApolloCall._cls3.$SwitchMap$com$apollographql$apollo$interceptor$ApolloInterceptor$FetchSourceType[sourceType.ordinal()])
			//*   0    0:getstatic       #35  <Field int[] RealApolloCall$3.$SwitchMap$com$apollographql$apollo$interceptor$ApolloInterceptor$FetchSourceType>
			//*   1    3:aload_0         
			//*   2    4:getfield        #22  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType val$sourceType>
			//*   3    7:invokevirtual   #41  <Method int com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType.ordinal()>
			//*   4   10:iaload          
				{
			//*   5   11:tableswitch     1 2: default 32
			//			               1 41
			//			               2 33
				default:
					return;
			//    6   32:return          

				case 2: // '\002'
					callback.onStatusEvent(com.apollographql.apollo.ApolloCall.StatusEvent.FETCH_NETWORK);
			//    7   33:aload_1         
			//    8   34:getstatic       #47  <Field com.apollographql.apollo.ApolloCall$StatusEvent com.apollographql.apollo.ApolloCall$StatusEvent.FETCH_NETWORK>
			//    9   37:invokevirtual   #53  <Method void com.apollographql.apollo.ApolloCall$Callback.onStatusEvent(com.apollographql.apollo.ApolloCall$StatusEvent)>
					return;
			//   10   40:return          

				case 1: // '\001'
					callback.onStatusEvent(com.apollographql.apollo.ApolloCall.StatusEvent.FETCH_CACHE);
			//   11   41:aload_1         
			//   12   42:getstatic       #56  <Field com.apollographql.apollo.ApolloCall$StatusEvent com.apollographql.apollo.ApolloCall$StatusEvent.FETCH_CACHE>
			//   13   45:invokevirtual   #53  <Method void com.apollographql.apollo.ApolloCall$Callback.onStatusEvent(com.apollographql.apollo.ApolloCall$StatusEvent)>
					return;
			//   14   48:return          
				}
			}

			public volatile void apply(Object obj)
			{
				apply((com.apollographql.apollo.ApolloCall.Callback)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #49  <Class com.apollographql.apollo.ApolloCall$Callback>
			//    3    5:invokevirtual   #62  <Method void apply(com.apollographql.apollo.ApolloCall$Callback)>
			//    4    8:return          
			}

			final RealApolloCall._cls1 this$1;
			final com.apollographql.apollo.interceptor.ApolloInterceptor.FetchSourceType val$sourceType;

			
			{
				this$1 = RealApolloCall._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field RealApolloCall$1 this$1>
				sourceType = fetchsourcetype;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType val$sourceType>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RealApolloCall this$0>
	//    2    4:invokevirtual   #120 <Method Optional RealApolloCall.responseCallback()>
	//    3    7:new             #13  <Class RealApolloCall$1$1>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #123 <Method void RealApolloCall$1$1(RealApolloCall$1, com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType)>
	//    8   16:invokevirtual   #127 <Method Optional Optional.apply(Action)>
	//    9   19:pop             
	//   10   20:return          
	}

	public void onResponse(com.apollographql.apollo.interceptor..InterceptorResponse interceptorresponse)
	{
		Optional optional = responseCallback();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RealApolloCall this$0>
	//    2    4:invokevirtual   #120 <Method Optional RealApolloCall.responseCallback()>
	//    3    7:astore_2        
		if(!optional.isPresent())
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #38  <Method boolean Optional.isPresent()>
	//*   6   12:ifne            52
		{
			logger.d("onResponse for operation: %s. No callback present.", new Object[] {
				operation().name().name()
			});
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field RealApolloCall this$0>
	//    9   19:getfield        #51  <Field ApolloLogger RealApolloCall.logger>
	//   10   22:ldc1            #131 <String "onResponse for operation: %s. No callback present.">
	//   11   24:iconst_1        
	//   12   25:anewarray       Object[]
	//   13   28:dup             
	//   14   29:iconst_0        
	//   15   30:aload_0         
	//   16   31:getfield        #19  <Field RealApolloCall this$0>
	//   17   34:invokevirtual   #57  <Method Operation RealApolloCall.operation()>
	//   18   37:invokeinterface #63  <Method OperationName Operation.name()>
	//   19   42:invokeinterface #68  <Method String OperationName.name()>
	//   20   47:aastore         
	//   21   48:invokevirtual   #74  <Method void ApolloLogger.d(String, Object[])>
			return;
	//   22   51:return          
		} else
		{
			((com.apollographql.apollo.ck)optional.get()).onResponse((Response)interceptorresponse.parsedResponse.get());
	//   23   52:aload_2         
	//   24   53:invokevirtual   #42  <Method Object Optional.get()>
	//   25   56:checkcast       #76  <Class com.apollographql.apollo.ApolloCall$Callback>
	//   26   59:aload_1         
	//   27   60:getfield        #136 <Field Optional com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse.parsedResponse>
	//   28   63:invokevirtual   #42  <Method Object Optional.get()>
	//   29   66:checkcast       #138 <Class Response>
	//   30   69:invokevirtual   #141 <Method void com.apollographql.apollo.ApolloCall$Callback.onResponse(Response)>
			return;
	//   31   72:return          
		}
	}

	final RealApolloCall this$0;

	RealApolloCall$1()
	{
		this$0 = RealApolloCall.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field RealApolloCall this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
	//    5    9:return          
	}
}
