// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal;

import com.apollographql.apollo.api.*;
import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.cache.normalized.ApolloStore;
import com.apollographql.apollo.exception.*;

// Referenced classes of package com.apollographql.apollo.internal:
//			RealApolloQueryWatcher, ApolloLogger

class RealApolloQueryWatcher$2 extends com.apollographql.apollo.ApolloCall.Callback
{

	public void onFailure(ApolloException apolloexception)
	{
		Optional optional = terminate();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field RealApolloQueryWatcher this$0>
	//    2    4:invokevirtual   #27  <Method Optional RealApolloQueryWatcher.terminate()>
	//    3    7:astore_2        
		if(!optional.isPresent())
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #33  <Method boolean Optional.isPresent()>
	//*   6   12:ifne            53
		{
			logger.d(((Throwable) (apolloexception)), "onFailure for operation: %s. No callback present.", new Object[] {
				operation().name().name()
			});
	//    7   15:aload_0         
	//    8   16:getfield        #16  <Field RealApolloQueryWatcher this$0>
	//    9   19:getfield        #37  <Field ApolloLogger RealApolloQueryWatcher.logger>
	//   10   22:aload_1         
	//   11   23:ldc1            #39  <String "onFailure for operation: %s. No callback present.">
	//   12   25:iconst_1        
	//   13   26:anewarray       Object[]
	//   14   29:dup             
	//   15   30:iconst_0        
	//   16   31:aload_0         
	//   17   32:getfield        #16  <Field RealApolloQueryWatcher this$0>
	//   18   35:invokevirtual   #45  <Method Operation RealApolloQueryWatcher.operation()>
	//   19   38:invokeinterface #51  <Method OperationName Operation.name()>
	//   20   43:invokeinterface #56  <Method String OperationName.name()>
	//   21   48:aastore         
	//   22   49:invokevirtual   #62  <Method void ApolloLogger.d(Throwable, String, Object[])>
			return;
	//   23   52:return          
		}
		if(apolloexception instanceof ApolloHttpException)
	//*  24   53:aload_1         
	//*  25   54:instanceof      #64  <Class ApolloHttpException>
	//*  26   57:ifeq            75
		{
			((com.apollographql.apollo.ApolloCall.Callback)optional.get()).onHttpError((ApolloHttpException)apolloexception);
	//   27   60:aload_2         
	//   28   61:invokevirtual   #68  <Method Object Optional.get()>
	//   29   64:checkcast       #5   <Class com.apollographql.apollo.ApolloCall$Callback>
	//   30   67:aload_1         
	//   31   68:checkcast       #64  <Class ApolloHttpException>
	//   32   71:invokevirtual   #72  <Method void com.apollographql.apollo.ApolloCall$Callback.onHttpError(ApolloHttpException)>
			return;
	//   33   74:return          
		}
		if(apolloexception instanceof ApolloParseException)
	//*  34   75:aload_1         
	//*  35   76:instanceof      #74  <Class ApolloParseException>
	//*  36   79:ifeq            97
		{
			((com.apollographql.apollo.ApolloCall.Callback)optional.get()).onParseError((ApolloParseException)apolloexception);
	//   37   82:aload_2         
	//   38   83:invokevirtual   #68  <Method Object Optional.get()>
	//   39   86:checkcast       #5   <Class com.apollographql.apollo.ApolloCall$Callback>
	//   40   89:aload_1         
	//   41   90:checkcast       #74  <Class ApolloParseException>
	//   42   93:invokevirtual   #78  <Method void com.apollographql.apollo.ApolloCall$Callback.onParseError(ApolloParseException)>
			return;
	//   43   96:return          
		}
		if(apolloexception instanceof ApolloNetworkException)
	//*  44   97:aload_1         
	//*  45   98:instanceof      #80  <Class ApolloNetworkException>
	//*  46  101:ifeq            119
		{
			((com.apollographql.apollo.ApolloCall.Callback)optional.get()).onNetworkError((ApolloNetworkException)apolloexception);
	//   47  104:aload_2         
	//   48  105:invokevirtual   #68  <Method Object Optional.get()>
	//   49  108:checkcast       #5   <Class com.apollographql.apollo.ApolloCall$Callback>
	//   50  111:aload_1         
	//   51  112:checkcast       #80  <Class ApolloNetworkException>
	//   52  115:invokevirtual   #84  <Method void com.apollographql.apollo.ApolloCall$Callback.onNetworkError(ApolloNetworkException)>
			return;
	//   53  118:return          
		} else
		{
			((com.apollographql.apollo.ApolloCall.Callback)optional.get()).onFailure(apolloexception);
	//   54  119:aload_2         
	//   55  120:invokevirtual   #68  <Method Object Optional.get()>
	//   56  123:checkcast       #5   <Class com.apollographql.apollo.ApolloCall$Callback>
	//   57  126:aload_1         
	//   58  127:invokevirtual   #86  <Method void com.apollographql.apollo.ApolloCall$Callback.onFailure(ApolloException)>
			return;
	//   59  130:return          
		}
	}

	public void onResponse(Response response)
	{
		Optional optional = responseCallback();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field RealApolloQueryWatcher this$0>
	//    2    4:invokevirtual   #92  <Method Optional RealApolloQueryWatcher.responseCallback()>
	//    3    7:astore_2        
		if(!optional.isPresent())
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #33  <Method boolean Optional.isPresent()>
	//*   6   12:ifne            52
		{
			logger.d("onResponse for watched operation: %s. No callback present.", new Object[] {
				operation().name().name()
			});
	//    7   15:aload_0         
	//    8   16:getfield        #16  <Field RealApolloQueryWatcher this$0>
	//    9   19:getfield        #37  <Field ApolloLogger RealApolloQueryWatcher.logger>
	//   10   22:ldc1            #94  <String "onResponse for watched operation: %s. No callback present.">
	//   11   24:iconst_1        
	//   12   25:anewarray       Object[]
	//   13   28:dup             
	//   14   29:iconst_0        
	//   15   30:aload_0         
	//   16   31:getfield        #16  <Field RealApolloQueryWatcher this$0>
	//   17   34:invokevirtual   #45  <Method Operation RealApolloQueryWatcher.operation()>
	//   18   37:invokeinterface #51  <Method OperationName Operation.name()>
	//   19   42:invokeinterface #56  <Method String OperationName.name()>
	//   20   47:aastore         
	//   21   48:invokevirtual   #97  <Method void ApolloLogger.d(String, Object[])>
			return;
	//   22   51:return          
		} else
		{
			dependentKeys = response.dependentKeys();
	//   23   52:aload_0         
	//   24   53:getfield        #16  <Field RealApolloQueryWatcher this$0>
	//   25   56:aload_1         
	//   26   57:invokevirtual   #103 <Method java.util.Set Response.dependentKeys()>
	//   27   60:putfield        #106 <Field java.util.Set RealApolloQueryWatcher.dependentKeys>
			apolloStore.subscribe(recordChangeSubscriber);
	//   28   63:aload_0         
	//   29   64:getfield        #16  <Field RealApolloQueryWatcher this$0>
	//   30   67:getfield        #110 <Field ApolloStore RealApolloQueryWatcher.apolloStore>
	//   31   70:aload_0         
	//   32   71:getfield        #16  <Field RealApolloQueryWatcher this$0>
	//   33   74:getfield        #114 <Field com.apollographql.apollo.cache.normalized.ApolloStore$RecordChangeSubscriber RealApolloQueryWatcher.recordChangeSubscriber>
	//   34   77:invokeinterface #120 <Method void ApolloStore.subscribe(com.apollographql.apollo.cache.normalized.ApolloStore$RecordChangeSubscriber)>
			((com.apollographql.apollo.ApolloCall.Callback)optional.get()).onResponse(response);
	//   35   82:aload_2         
	//   36   83:invokevirtual   #68  <Method Object Optional.get()>
	//   37   86:checkcast       #5   <Class com.apollographql.apollo.ApolloCall$Callback>
	//   38   89:aload_1         
	//   39   90:invokevirtual   #122 <Method void com.apollographql.apollo.ApolloCall$Callback.onResponse(Response)>
			return;
	//   40   93:return          
		}
	}

	final RealApolloQueryWatcher this$0;

	RealApolloQueryWatcher$2()
	{
		this$0 = RealApolloQueryWatcher.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field RealApolloQueryWatcher this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void com.apollographql.apollo.ApolloCall$Callback()>
	//    5    9:return          
	}
}
