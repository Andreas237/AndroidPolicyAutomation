// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.exception.*;
import okhttp3.Response;

// Referenced classes of package com.apollographql.apollo.internal:
//			RealApolloPrefetch, ApolloLogger

class RealApolloPrefetch$1
	implements com.apollographql.apollo.interceptor.lBack
{

	public void onCompleted()
	{
	//    0    0:return          
	}

	public void onFailure(ApolloException apolloexception)
	{
		Optional optional = terminate();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RealApolloPrefetch this$0>
	//    2    4:invokevirtual   #29  <Method Optional RealApolloPrefetch.terminate()>
	//    3    7:astore_2        
		if(!optional.isPresent())
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #35  <Method boolean Optional.isPresent()>
	//*   6   12:ifne            53
		{
			logger.e(((Throwable) (apolloexception)), "onFailure for prefetch operation: %s. No callback present.", new Object[] {
				operation().name().name()
			});
	//    7   15:aload_0         
	//    8   16:getfield        #17  <Field RealApolloPrefetch this$0>
	//    9   19:getfield        #39  <Field ApolloLogger RealApolloPrefetch.logger>
	//   10   22:aload_1         
	//   11   23:ldc1            #41  <String "onFailure for prefetch operation: %s. No callback present.">
	//   12   25:iconst_1        
	//   13   26:anewarray       Object[]
	//   14   29:dup             
	//   15   30:iconst_0        
	//   16   31:aload_0         
	//   17   32:getfield        #17  <Field RealApolloPrefetch this$0>
	//   18   35:invokevirtual   #45  <Method Operation RealApolloPrefetch.operation()>
	//   19   38:invokeinterface #51  <Method OperationName Operation.name()>
	//   20   43:invokeinterface #56  <Method String OperationName.name()>
	//   21   48:aastore         
	//   22   49:invokevirtual   #62  <Method void ApolloLogger.e(Throwable, String, Object[])>
			return;
	//   23   52:return          
		}
		if(apolloexception instanceof ApolloHttpException)
	//*  24   53:aload_1         
	//*  25   54:instanceof      #64  <Class ApolloHttpException>
	//*  26   57:ifeq            75
		{
			((com.apollographql.apollo.ck)optional.get()).onHttpError((ApolloHttpException)apolloexception);
	//   27   60:aload_2         
	//   28   61:invokevirtual   #68  <Method Object Optional.get()>
	//   29   64:checkcast       #70  <Class com.apollographql.apollo.ApolloPrefetch$Callback>
	//   30   67:aload_1         
	//   31   68:checkcast       #64  <Class ApolloHttpException>
	//   32   71:invokevirtual   #74  <Method void com.apollographql.apollo.ApolloPrefetch$Callback.onHttpError(ApolloHttpException)>
			return;
	//   33   74:return          
		}
		if(apolloexception instanceof ApolloNetworkException)
	//*  34   75:aload_1         
	//*  35   76:instanceof      #76  <Class ApolloNetworkException>
	//*  36   79:ifeq            97
		{
			((com.apollographql.apollo.ck)optional.get()).onNetworkError((ApolloNetworkException)apolloexception);
	//   37   82:aload_2         
	//   38   83:invokevirtual   #68  <Method Object Optional.get()>
	//   39   86:checkcast       #70  <Class com.apollographql.apollo.ApolloPrefetch$Callback>
	//   40   89:aload_1         
	//   41   90:checkcast       #76  <Class ApolloNetworkException>
	//   42   93:invokevirtual   #80  <Method void com.apollographql.apollo.ApolloPrefetch$Callback.onNetworkError(ApolloNetworkException)>
			return;
	//   43   96:return          
		} else
		{
			((com.apollographql.apollo.ck)optional.get()).onFailure(apolloexception);
	//   44   97:aload_2         
	//   45   98:invokevirtual   #68  <Method Object Optional.get()>
	//   46  101:checkcast       #70  <Class com.apollographql.apollo.ApolloPrefetch$Callback>
	//   47  104:aload_1         
	//   48  105:invokevirtual   #82  <Method void com.apollographql.apollo.ApolloPrefetch$Callback.onFailure(ApolloException)>
			return;
	//   49  108:return          
		}
	}

	public void onFetch(com.apollographql.apollo.interceptor.chSourceType chsourcetype)
	{
	//    0    0:return          
	}

	public void onResponse(com.apollographql.apollo.interceptor.erceptorResponse erceptorresponse)
	{
		erceptorresponse = ((com.apollographql.apollo.interceptor.erceptorResponse) ((Response)erceptorresponse.httpResponse.get()));
	//    0    0:aload_1         
	//    1    1:getfield        #93  <Field Optional com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse.httpResponse>
	//    2    4:invokevirtual   #68  <Method Object Optional.get()>
	//    3    7:checkcast       #95  <Class Response>
	//    4   10:astore_1        
		Optional optional;
		optional = terminate();
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field RealApolloPrefetch this$0>
	//    7   15:invokevirtual   #29  <Method Optional RealApolloPrefetch.terminate()>
	//    8   18:astore_2        
		if(optional.isPresent())
			break MISSING_BLOCK_LABEL_67;
	//    9   19:aload_2         
	//   10   20:invokevirtual   #35  <Method boolean Optional.isPresent()>
	//   11   23:ifne            67
		logger.d("onResponse for prefetch operation: %s. No callback present.", new Object[] {
			operation().name().name()
		});
	//   12   26:aload_0         
	//   13   27:getfield        #17  <Field RealApolloPrefetch this$0>
	//   14   30:getfield        #39  <Field ApolloLogger RealApolloPrefetch.logger>
	//   15   33:ldc1            #97  <String "onResponse for prefetch operation: %s. No callback present.">
	//   16   35:iconst_1        
	//   17   36:anewarray       Object[]
	//   18   39:dup             
	//   19   40:iconst_0        
	//   20   41:aload_0         
	//   21   42:getfield        #17  <Field RealApolloPrefetch this$0>
	//   22   45:invokevirtual   #45  <Method Operation RealApolloPrefetch.operation()>
	//   23   48:invokeinterface #51  <Method OperationName Operation.name()>
	//   24   53:invokeinterface #56  <Method String OperationName.name()>
	//   25   58:aastore         
	//   26   59:invokevirtual   #101 <Method void ApolloLogger.d(String, Object[])>
		((Response) (erceptorresponse)).close();
	//   27   62:aload_1         
	//   28   63:invokevirtual   #104 <Method void Response.close()>
		return;
	//   29   66:return          
		if(((Response) (erceptorresponse)).isSuccessful())
	//*  30   67:aload_1         
	//*  31   68:invokevirtual   #107 <Method boolean Response.isSuccessful()>
	//*  32   71:ifeq            87
		{
			((com.apollographql.apollo.ck)optional.get()).onSuccess();
	//   33   74:aload_2         
	//   34   75:invokevirtual   #68  <Method Object Optional.get()>
	//   35   78:checkcast       #70  <Class com.apollographql.apollo.ApolloPrefetch$Callback>
	//   36   81:invokevirtual   #110 <Method void com.apollographql.apollo.ApolloPrefetch$Callback.onSuccess()>
			break MISSING_BLOCK_LABEL_105;
	//   37   84:goto            105
		}
		((com.apollographql.apollo.ck)optional.get()).onHttpError(new ApolloHttpException(((Response) (erceptorresponse))));
	//   38   87:aload_2         
	//   39   88:invokevirtual   #68  <Method Object Optional.get()>
	//   40   91:checkcast       #70  <Class com.apollographql.apollo.ApolloPrefetch$Callback>
	//   41   94:new             #64  <Class ApolloHttpException>
	//   42   97:dup             
	//   43   98:aload_1         
	//   44   99:invokespecial   #113 <Method void ApolloHttpException(Response)>
	//   45  102:invokevirtual   #74  <Method void com.apollographql.apollo.ApolloPrefetch$Callback.onHttpError(ApolloHttpException)>
		((Response) (erceptorresponse)).close();
	//   46  105:aload_1         
	//   47  106:invokevirtual   #104 <Method void Response.close()>
		return;
	//   48  109:return          
		Exception exception;
		exception;
	//   49  110:astore_2        
		((Response) (erceptorresponse)).close();
	//   50  111:aload_1         
	//   51  112:invokevirtual   #104 <Method void Response.close()>
		throw exception;
	//   52  115:aload_2         
	//   53  116:athrow          
	}

	final RealApolloPrefetch this$0;

	RealApolloPrefetch$1()
	{
		this$0 = RealApolloPrefetch.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field RealApolloPrefetch this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
