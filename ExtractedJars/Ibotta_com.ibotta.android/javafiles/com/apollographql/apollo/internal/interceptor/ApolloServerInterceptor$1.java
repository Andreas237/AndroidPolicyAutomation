// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.interceptor;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.internal.ApolloLogger;
import java.io.IOException;
import okhttp3.*;

// Referenced classes of package com.apollographql.apollo.internal.interceptor:
//			ApolloServerInterceptor

class ApolloServerInterceptor$1
	implements Runnable
{

	public void run()
	{
		val$callBack.onFetch(com.apollographql.apollo.interceptor.rceType.NETWORK);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
	//    2    4:getstatic       #40  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType.NETWORK>
	//    3    7:invokeinterface #46  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType)>
		try
		{
			httpCall = httpCall(val$request.operation);
	//    4   12:aload_0         
	//    5   13:getfield        #23  <Field ApolloServerInterceptor this$0>
	//    6   16:aload_0         
	//    7   17:getfield        #23  <Field ApolloServerInterceptor this$0>
	//    8   20:aload_0         
	//    9   21:getfield        #27  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
	//   10   24:getfield        #52  <Field Operation com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.operation>
	//   11   27:invokevirtual   #56  <Method Call ApolloServerInterceptor.httpCall(Operation)>
	//   12   30:putfield        #59  <Field Call ApolloServerInterceptor.httpCall>
		}
	//*  13   33:aload_0         
	//*  14   34:getfield        #23  <Field ApolloServerInterceptor this$0>
	//*  15   37:getfield        #59  <Field Call ApolloServerInterceptor.httpCall>
	//*  16   40:new             #13  <Class ApolloServerInterceptor$1$1>
	//*  17   43:dup             
	//*  18   44:aload_0         
	//*  19   45:invokespecial   #62  <Method void ApolloServerInterceptor$1$1(ApolloServerInterceptor$1)>
	//*  20   48:invokeinterface #68  <Method void Call.enqueue(Callback)>
	//*  21   53:return          
		catch(IOException ioexception)
	//*  22   54:astore_1        
		{
			logger.e(((Throwable) (ioexception)), "Failed to prepare http call for operation %s", new Object[] {
				val$request.operation.name().name()
			});
	//   23   55:aload_0         
	//   24   56:getfield        #23  <Field ApolloServerInterceptor this$0>
	//   25   59:getfield        #72  <Field ApolloLogger ApolloServerInterceptor.logger>
	//   26   62:aload_1         
	//   27   63:ldc1            #74  <String "Failed to prepare http call for operation %s">
	//   28   65:iconst_1        
	//   29   66:anewarray       Object[]
	//   30   69:dup             
	//   31   70:iconst_0        
	//   32   71:aload_0         
	//   33   72:getfield        #27  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
	//   34   75:getfield        #52  <Field Operation com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.operation>
	//   35   78:invokeinterface #80  <Method OperationName Operation.name()>
	//   36   83:invokeinterface #85  <Method String OperationName.name()>
	//   37   88:aastore         
	//   38   89:invokevirtual   #91  <Method void ApolloLogger.e(Throwable, String, Object[])>
			val$callBack.onFailure(((com.apollographql.apollo.exception.ApolloException) (new ApolloNetworkException("Failed to prepare http call", ((Throwable) (ioexception))))));
	//   39   92:aload_0         
	//   40   93:getfield        #25  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
	//   41   96:new             #93  <Class ApolloNetworkException>
	//   42   99:dup             
	//   43  100:ldc1            #95  <String "Failed to prepare http call">
	//   44  102:aload_1         
	//   45  103:invokespecial   #98  <Method void ApolloNetworkException(String, Throwable)>
	//   46  106:invokeinterface #102 <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFailure(com.apollographql.apollo.exception.ApolloException)>
			return;
	//   47  111:return          
		}
		httpCall.enqueue(new Callback() {

			public void onFailure(Call call, IOException ioexception1)
			{
				if(disposed)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field ApolloServerInterceptor$1 this$1>
			//*   2    4:getfield        #27  <Field ApolloServerInterceptor ApolloServerInterceptor$1.this$0>
			//*   3    7:getfield        #33  <Field boolean ApolloServerInterceptor.disposed>
			//*   4   10:ifeq            14
				{
					return;
			//    5   13:return          
				} else
				{
					logger.e(((Throwable) (ioexception1)), "Failed to execute http call for operation %s", new Object[] {
						request.operation.name().name()
					});
			//    6   14:aload_0         
			//    7   15:getfield        #17  <Field ApolloServerInterceptor$1 this$1>
			//    8   18:getfield        #27  <Field ApolloServerInterceptor ApolloServerInterceptor$1.this$0>
			//    9   21:getfield        #37  <Field ApolloLogger ApolloServerInterceptor.logger>
			//   10   24:aload_2         
			//   11   25:ldc1            #39  <String "Failed to execute http call for operation %s">
			//   12   27:iconst_1        
			//   13   28:anewarray       Object[]
			//   14   31:dup             
			//   15   32:iconst_0        
			//   16   33:aload_0         
			//   17   34:getfield        #17  <Field ApolloServerInterceptor$1 this$1>
			//   18   37:getfield        #43  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest ApolloServerInterceptor$1.val$request>
			//   19   40:getfield        #49  <Field Operation com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.operation>
			//   20   43:invokeinterface #55  <Method OperationName Operation.name()>
			//   21   48:invokeinterface #60  <Method String OperationName.name()>
			//   22   53:aastore         
			//   23   54:invokevirtual   #66  <Method void ApolloLogger.e(Throwable, String, Object[])>
					callBack.onFailure(((com.apollographql.apollo.exception.ApolloException) (new ApolloNetworkException("Failed to execute http call", ((Throwable) (ioexception1))))));
			//   24   57:aload_0         
			//   25   58:getfield        #17  <Field ApolloServerInterceptor$1 this$1>
			//   26   61:getfield        #70  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack ApolloServerInterceptor$1.val$callBack>
			//   27   64:new             #72  <Class ApolloNetworkException>
			//   28   67:dup             
			//   29   68:ldc1            #74  <String "Failed to execute http call">
			//   30   70:aload_2         
			//   31   71:invokespecial   #77  <Method void ApolloNetworkException(String, Throwable)>
			//   32   74:invokeinterface #82  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onFailure(com.apollographql.apollo.exception.ApolloException)>
					return;
			//   33   79:return          
				}
			}

			public void onResponse(Call call, Response response)
				throws IOException
			{
				if(disposed)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field ApolloServerInterceptor$1 this$1>
			//*   2    4:getfield        #27  <Field ApolloServerInterceptor ApolloServerInterceptor$1.this$0>
			//*   3    7:getfield        #33  <Field boolean ApolloServerInterceptor.disposed>
			//*   4   10:ifeq            14
				{
					return;
			//    5   13:return          
				} else
				{
					callBack.onResponse(new com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse(response));
			//    6   14:aload_0         
			//    7   15:getfield        #17  <Field ApolloServerInterceptor$1 this$1>
			//    8   18:getfield        #70  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack ApolloServerInterceptor$1.val$callBack>
			//    9   21:new             #89  <Class com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse>
			//   10   24:dup             
			//   11   25:aload_2         
			//   12   26:invokespecial   #92  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse(Response)>
			//   13   29:invokeinterface #95  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorResponse)>
					callBack.onCompleted();
			//   14   34:aload_0         
			//   15   35:getfield        #17  <Field ApolloServerInterceptor$1 this$1>
			//   16   38:getfield        #70  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack ApolloServerInterceptor$1.val$callBack>
			//   17   41:invokeinterface #98  <Method void com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack.onCompleted()>
					return;
			//   18   46:return          
				}
			}

			final ApolloServerInterceptor._cls1 this$1;

			
			{
				this$1 = ApolloServerInterceptor._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ApolloServerInterceptor$1 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	}

	final ApolloServerInterceptor this$0;
	final com.apollographql.apollo.interceptor. val$callBack;
	final com.apollographql.apollo.interceptor.torRequest val$request;

	ApolloServerInterceptor$1()
	{
		this$0 = final_apolloserverinterceptor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field ApolloServerInterceptor this$0>
		val$callBack = ;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack val$callBack>
		val$request = com.apollographql.apollo.interceptor.torRequest.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest val$request>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #30  <Method void Object()>
	//   11   19:return          
	}
}
