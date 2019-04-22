// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal;

import com.apollographql.apollo.ApolloPrefetch;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.cache.http.HttpCachePolicy;
import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.exception.*;
import com.apollographql.apollo.interceptor.ApolloInterceptorChain;
import com.apollographql.apollo.internal.interceptor.ApolloServerInterceptor;
import com.apollographql.apollo.internal.interceptor.RealApolloInterceptorChain;
import com.apollographql.apollo.response.ScalarTypeAdapters;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import okhttp3.Response;

// Referenced classes of package com.apollographql.apollo.internal:
//			CallState, ApolloCallTracker, ApolloLogger

public final class RealApolloPrefetch
	implements ApolloPrefetch
{

	public RealApolloPrefetch(Operation operation1, HttpUrl httpurl, okhttp3.Call.Factory factory, ScalarTypeAdapters scalartypeadapters, Executor executor, ApolloLogger apollologger, ApolloCallTracker apollocalltracker, 
			boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		state = new AtomicReference(((Object) (CallState.IDLE)));
	//    2    4:aload_0         
	//    3    5:new             #40  <Class AtomicReference>
	//    4    8:dup             
	//    5    9:getstatic       #46  <Field CallState CallState.IDLE>
	//    6   12:invokespecial   #49  <Method void AtomicReference(Object)>
	//    7   15:putfield        #51  <Field AtomicReference state>
	//    8   18:aload_0         
	//    9   19:new             #40  <Class AtomicReference>
	//   10   22:dup             
	//   11   23:invokespecial   #52  <Method void AtomicReference()>
	//   12   26:putfield        #54  <Field AtomicReference originalCallback>
		operation = operation1;
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:putfield        #56  <Field Operation operation>
		serverUrl = httpurl;
	//   16   34:aload_0         
	//   17   35:aload_2         
	//   18   36:putfield        #58  <Field HttpUrl serverUrl>
		httpCallFactory = factory;
	//   19   39:aload_0         
	//   20   40:aload_3         
	//   21   41:putfield        #60  <Field okhttp3.Call$Factory httpCallFactory>
		scalarTypeAdapters = scalartypeadapters;
	//   22   44:aload_0         
	//   23   45:aload           4
	//   24   47:putfield        #62  <Field ScalarTypeAdapters scalarTypeAdapters>
		dispatcher = executor;
	//   25   50:aload_0         
	//   26   51:aload           5
	//   27   53:putfield        #64  <Field Executor dispatcher>
		logger = apollologger;
	//   28   56:aload_0         
	//   29   57:aload           6
	//   30   59:putfield        #66  <Field ApolloLogger logger>
		tracker = apollocalltracker;
	//   31   62:aload_0         
	//   32   63:aload           7
	//   33   65:putfield        #68  <Field ApolloCallTracker tracker>
		sendOperationIds = flag;
	//   34   68:aload_0         
	//   35   69:iload           8
	//   36   71:putfield        #70  <Field boolean sendOperationIds>
		interceptorChain = ((ApolloInterceptorChain) (new RealApolloInterceptorChain(Collections.singletonList(((Object) (new ApolloServerInterceptor(httpurl, factory, HttpCachePolicy.NETWORK_ONLY, true, scalartypeadapters, apollologger, flag)))))));
	//   37   74:aload_0         
	//   38   75:new             #72  <Class RealApolloInterceptorChain>
	//   39   78:dup             
	//   40   79:new             #74  <Class ApolloServerInterceptor>
	//   41   82:dup             
	//   42   83:aload_2         
	//   43   84:aload_3         
	//   44   85:getstatic       #80  <Field com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy HttpCachePolicy.NETWORK_ONLY>
	//   45   88:iconst_1        
	//   46   89:aload           4
	//   47   91:aload           6
	//   48   93:iload           8
	//   49   95:invokespecial   #83  <Method void ApolloServerInterceptor(HttpUrl, okhttp3.Call$Factory, com.apollographql.apollo.api.cache.http.HttpCachePolicy$Policy, boolean, ScalarTypeAdapters, ApolloLogger, boolean)>
	//   50   98:invokestatic    #89  <Method java.util.List Collections.singletonList(Object)>
	//   51  101:invokespecial   #92  <Method void RealApolloInterceptorChain(java.util.List)>
	//   52  104:putfield        #94  <Field ApolloInterceptorChain interceptorChain>
	//   53  107:return          
	}

	private void activate(Optional optional)
		throws ApolloCanceledException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		static class _cls2
		{

			static final int $SwitchMap$com$apollographql$apollo$internal$CallState[];

			static 
			{
				$SwitchMap$com$apollographql$apollo$internal$CallState = new int[CallState.values().length];
			//    0    0:invokestatic    #18  <Method CallState[] CallState.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
				try
				{
					$SwitchMap$com$apollographql$apollo$internal$CallState[CallState.ACTIVE.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
			//    5   12:getstatic       #24  <Field CallState CallState.ACTIVE>
			//    6   15:invokevirtual   #28  <Method int CallState.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
			//*  10   23:getstatic       #31  <Field CallState CallState.IDLE>
			//*  11   26:invokevirtual   #28  <Method int CallState.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
			//*  15   34:getstatic       #34  <Field CallState CallState.CANCELED>
			//*  16   37:invokevirtual   #28  <Method int CallState.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
			//*  20   45:getstatic       #37  <Field CallState CallState.TERMINATED>
			//*  21   48:invokevirtual   #28  <Method int CallState.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   25   54:astore_0        
				try
				{
					$SwitchMap$com$apollographql$apollo$internal$CallState[CallState.IDLE.ordinal()] = 2;
				}
			//*  26   55:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   27   58:astore_0        
				try
				{
					$SwitchMap$com$apollographql$apollo$internal$CallState[CallState.CANCELED.ordinal()] = 3;
				}
			//*  28   59:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   29   62:astore_0        
				try
				{
					$SwitchMap$com$apollographql$apollo$internal$CallState[CallState.TERMINATED.ordinal()] = 4;
				}
			//*  30   63:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   66:astore_0        
			//*  32   67:return          
			}
		}

		_cls2..SwitchMap.com.apollographql.apollo.internal.CallState[((CallState)state.get()).ordinal()];
	//    2    2:getstatic       #103 <Field int[] RealApolloPrefetch$2.$SwitchMap$com$apollographql$apollo$internal$CallState>
	//    3    5:aload_0         
	//    4    6:getfield        #51  <Field AtomicReference state>
	//    5    9:invokevirtual   #107 <Method Object AtomicReference.get()>
	//    6   12:checkcast       #42  <Class CallState>
	//    7   15:invokevirtual   #111 <Method int CallState.ordinal()>
	//    8   18:iaload          
		JVM INSTR tableswitch 1 4: default 118
	//	               1 93
	//	               2 61
	//	               3 51
	//	               4 93;
	//    9   19:tableswitch     1 4: default 118
	//	               1 93
	//	               2 61
	//	               3 51
	//	               4 93
		   goto _L1 _L2 _L3 _L4 _L2
	//*  10   48:goto            103
_L4:
		throw new ApolloCanceledException("Call is cancelled.");
	//   11   51:new             #99  <Class ApolloCanceledException>
	//   12   54:dup             
	//   13   55:ldc1            #113 <String "Call is cancelled.">
	//   14   57:invokespecial   #116 <Method void ApolloCanceledException(String)>
	//   15   60:athrow          
_L3:
		originalCallback.set(optional.orNull());
	//   16   61:aload_0         
	//   17   62:getfield        #54  <Field AtomicReference originalCallback>
	//   18   65:aload_1         
	//   19   66:invokevirtual   #121 <Method Object Optional.orNull()>
	//   20   69:invokevirtual   #124 <Method void AtomicReference.set(Object)>
		tracker.registerPrefetchCall(((ApolloPrefetch) (this)));
	//   21   72:aload_0         
	//   22   73:getfield        #68  <Field ApolloCallTracker tracker>
	//   23   76:aload_0         
	//   24   77:invokevirtual   #130 <Method void ApolloCallTracker.registerPrefetchCall(ApolloPrefetch)>
		state.set(((Object) (CallState.ACTIVE)));
	//   25   80:aload_0         
	//   26   81:getfield        #51  <Field AtomicReference state>
	//   27   84:getstatic       #133 <Field CallState CallState.ACTIVE>
	//   28   87:invokevirtual   #124 <Method void AtomicReference.set(Object)>
		this;
	//   29   90:aload_0         
		JVM INSTR monitorexit ;
	//   30   91:monitorexit     
		return;
	//   31   92:return          
_L2:
		throw new IllegalStateException("Already Executed");
	//   32   93:new             #135 <Class IllegalStateException>
	//   33   96:dup             
	//   34   97:ldc1            #137 <String "Already Executed">
	//   35   99:invokespecial   #138 <Method void IllegalStateException(String)>
	//   36  102:athrow          
_L1:
		throw new IllegalStateException("Unknown state");
	//   37  103:new             #135 <Class IllegalStateException>
	//   38  106:dup             
	//   39  107:ldc1            #140 <String "Unknown state">
	//   40  109:invokespecial   #138 <Method void IllegalStateException(String)>
	//   41  112:athrow          
		optional;
	//   42  113:astore_1        
		this;
	//   43  114:aload_0         
		JVM INSTR monitorexit ;
	//   44  115:monitorexit     
		throw optional;
	//   45  116:aload_1         
	//   46  117:athrow          
	//*  47  118:goto            48
	}

	private com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack interceptorCallbackProxy()
	{
		return new com.apollographql.apollo.interceptor.ApolloInterceptor.CallBack() {

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
					((com.apollographql.apollo.ApolloPrefetch.Callback)optional.get()).onHttpError((ApolloHttpException)apolloexception);
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
					((com.apollographql.apollo.ApolloPrefetch.Callback)optional.get()).onNetworkError((ApolloNetworkException)apolloexception);
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
					((com.apollographql.apollo.ApolloPrefetch.Callback)optional.get()).onFailure(apolloexception);
			//   44   97:aload_2         
			//   45   98:invokevirtual   #68  <Method Object Optional.get()>
			//   46  101:checkcast       #70  <Class com.apollographql.apollo.ApolloPrefetch$Callback>
			//   47  104:aload_1         
			//   48  105:invokevirtual   #82  <Method void com.apollographql.apollo.ApolloPrefetch$Callback.onFailure(ApolloException)>
					return;
			//   49  108:return          
				}
			}

			public void onFetch(com.apollographql.apollo.interceptor.ApolloInterceptor.FetchSourceType fetchsourcetype)
			{
			//    0    0:return          
			}

			public void onResponse(com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse interceptorresponse)
			{
				interceptorresponse = ((com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorResponse) ((Response)interceptorresponse.httpResponse.get()));
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
				((Response) (interceptorresponse)).close();
			//   27   62:aload_1         
			//   28   63:invokevirtual   #104 <Method void Response.close()>
				return;
			//   29   66:return          
				if(((Response) (interceptorresponse)).isSuccessful())
			//*  30   67:aload_1         
			//*  31   68:invokevirtual   #107 <Method boolean Response.isSuccessful()>
			//*  32   71:ifeq            87
				{
					((com.apollographql.apollo.ApolloPrefetch.Callback)optional.get()).onSuccess();
			//   33   74:aload_2         
			//   34   75:invokevirtual   #68  <Method Object Optional.get()>
			//   35   78:checkcast       #70  <Class com.apollographql.apollo.ApolloPrefetch$Callback>
			//   36   81:invokevirtual   #110 <Method void com.apollographql.apollo.ApolloPrefetch$Callback.onSuccess()>
					break MISSING_BLOCK_LABEL_105;
			//   37   84:goto            105
				}
				((com.apollographql.apollo.ApolloPrefetch.Callback)optional.get()).onHttpError(new ApolloHttpException(((Response) (interceptorresponse))));
			//   38   87:aload_2         
			//   39   88:invokevirtual   #68  <Method Object Optional.get()>
			//   40   91:checkcast       #70  <Class com.apollographql.apollo.ApolloPrefetch$Callback>
			//   41   94:new             #64  <Class ApolloHttpException>
			//   42   97:dup             
			//   43   98:aload_1         
			//   44   99:invokespecial   #113 <Method void ApolloHttpException(Response)>
			//   45  102:invokevirtual   #74  <Method void com.apollographql.apollo.ApolloPrefetch$Callback.onHttpError(ApolloHttpException)>
				((Response) (interceptorresponse)).close();
			//   46  105:aload_1         
			//   47  106:invokevirtual   #104 <Method void Response.close()>
				return;
			//   48  109:return          
				Exception exception;
				exception;
			//   49  110:astore_2        
				((Response) (interceptorresponse)).close();
			//   50  111:aload_1         
			//   51  112:invokevirtual   #104 <Method void Response.close()>
				throw exception;
			//   52  115:aload_2         
			//   53  116:athrow          
			}

			final RealApolloPrefetch this$0;

			
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
;
	//    0    0:new             #8   <Class RealApolloPrefetch$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #148 <Method void RealApolloPrefetch$1(RealApolloPrefetch)>
	//    4    8:areturn         
	}

	public void cancel()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		_cls2..SwitchMap.com.apollographql.apollo.internal.CallState[((CallState)state.get()).ordinal()];
	//    2    2:getstatic       #103 <Field int[] RealApolloPrefetch$2.$SwitchMap$com$apollographql$apollo$internal$CallState>
	//    3    5:aload_0         
	//    4    6:getfield        #51  <Field AtomicReference state>
	//    5    9:invokevirtual   #107 <Method Object AtomicReference.get()>
	//    6   12:checkcast       #42  <Class CallState>
	//    7   15:invokevirtual   #111 <Method int CallState.ordinal()>
	//    8   18:iaload          
		JVM INSTR tableswitch 1 4: default 146
	//	               1 64
	//	               2 51
	//	               3 99
	//	               4 99;
	//    9   19:tableswitch     1 4: default 146
	//	               1 64
	//	               2 51
	//	               3 99
	//	               4 99
		   goto _L1 _L2 _L3 _L4 _L4
	//*  10   48:goto            131
_L3:
		state.set(((Object) (CallState.CANCELED)));
	//   11   51:aload_0         
	//   12   52:getfield        #51  <Field AtomicReference state>
	//   13   55:getstatic       #152 <Field CallState CallState.CANCELED>
	//   14   58:invokevirtual   #124 <Method void AtomicReference.set(Object)>
		  goto _L4
	//*  15   61:goto            99
_L2:
		interceptorChain.dispose();
	//   16   64:aload_0         
	//   17   65:getfield        #94  <Field ApolloInterceptorChain interceptorChain>
	//   18   68:invokeinterface #157 <Method void ApolloInterceptorChain.dispose()>
		tracker.unregisterPrefetchCall(((ApolloPrefetch) (this)));
	//   19   73:aload_0         
	//   20   74:getfield        #68  <Field ApolloCallTracker tracker>
	//   21   77:aload_0         
	//   22   78:invokevirtual   #160 <Method void ApolloCallTracker.unregisterPrefetchCall(ApolloPrefetch)>
		originalCallback.set(((Object) (null)));
	//   23   81:aload_0         
	//   24   82:getfield        #54  <Field AtomicReference originalCallback>
	//   25   85:aconst_null     
	//   26   86:invokevirtual   #124 <Method void AtomicReference.set(Object)>
		state.set(((Object) (CallState.CANCELED)));
	//   27   89:aload_0         
	//   28   90:getfield        #51  <Field AtomicReference state>
	//   29   93:getstatic       #152 <Field CallState CallState.CANCELED>
	//   30   96:invokevirtual   #124 <Method void AtomicReference.set(Object)>
_L4:
		this;
	//   31   99:aload_0         
		JVM INSTR monitorexit ;
	//   32  100:monitorexit     
		return;
	//   33  101:return          
		Exception exception;
		exception;
	//   34  102:astore_1        
		tracker.unregisterPrefetchCall(((ApolloPrefetch) (this)));
	//   35  103:aload_0         
	//   36  104:getfield        #68  <Field ApolloCallTracker tracker>
	//   37  107:aload_0         
	//   38  108:invokevirtual   #160 <Method void ApolloCallTracker.unregisterPrefetchCall(ApolloPrefetch)>
		originalCallback.set(((Object) (null)));
	//   39  111:aload_0         
	//   40  112:getfield        #54  <Field AtomicReference originalCallback>
	//   41  115:aconst_null     
	//   42  116:invokevirtual   #124 <Method void AtomicReference.set(Object)>
		state.set(((Object) (CallState.CANCELED)));
	//   43  119:aload_0         
	//   44  120:getfield        #51  <Field AtomicReference state>
	//   45  123:getstatic       #152 <Field CallState CallState.CANCELED>
	//   46  126:invokevirtual   #124 <Method void AtomicReference.set(Object)>
		throw exception;
	//   47  129:aload_1         
	//   48  130:athrow          
_L1:
		throw new IllegalStateException("Unknown state");
	//   49  131:new             #135 <Class IllegalStateException>
	//   50  134:dup             
	//   51  135:ldc1            #140 <String "Unknown state">
	//   52  137:invokespecial   #138 <Method void IllegalStateException(String)>
	//   53  140:athrow          
		exception;
	//   54  141:astore_1        
		this;
	//   55  142:aload_0         
		JVM INSTR monitorexit ;
	//   56  143:monitorexit     
		throw exception;
	//   57  144:aload_1         
	//   58  145:athrow          
	//*  59  146:goto            48
	}

	public ApolloPrefetch clone()
	{
		return ((ApolloPrefetch) (new RealApolloPrefetch(operation, serverUrl, httpCallFactory, scalarTypeAdapters, dispatcher, logger, tracker, sendOperationIds)));
	//    0    0:new             #2   <Class RealApolloPrefetch>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field Operation operation>
	//    4    8:aload_0         
	//    5    9:getfield        #58  <Field HttpUrl serverUrl>
	//    6   12:aload_0         
	//    7   13:getfield        #60  <Field okhttp3.Call$Factory httpCallFactory>
	//    8   16:aload_0         
	//    9   17:getfield        #62  <Field ScalarTypeAdapters scalarTypeAdapters>
	//   10   20:aload_0         
	//   11   21:getfield        #64  <Field Executor dispatcher>
	//   12   24:aload_0         
	//   13   25:getfield        #66  <Field ApolloLogger logger>
	//   14   28:aload_0         
	//   15   29:getfield        #68  <Field ApolloCallTracker tracker>
	//   16   32:aload_0         
	//   17   33:getfield        #70  <Field boolean sendOperationIds>
	//   18   36:invokespecial   #164 <Method void RealApolloPrefetch(Operation, HttpUrl, okhttp3.Call$Factory, ScalarTypeAdapters, Executor, ApolloLogger, ApolloCallTracker, boolean)>
	//   19   39:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method ApolloPrefetch clone()>
	//    2    4:areturn         
	}

	public void enqueue(com.apollographql.apollo.ApolloPrefetch.Callback callback)
	{
		try
		{
			activate(Optional.fromNullable(((Object) (callback))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #175 <Method Optional Optional.fromNullable(Object)>
	//    3    5:invokespecial   #177 <Method void activate(Optional)>
		}
	//*   4    8:aload_0         
	//*   5    9:getfield        #56  <Field Operation operation>
	//*   6   12:invokestatic    #183 <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest.builder(Operation)>
	//*   7   15:invokevirtual   #189 <Method com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest$Builder.build()>
	//*   8   18:astore_1        
	//*   9   19:aload_0         
	//*  10   20:getfield        #94  <Field ApolloInterceptorChain interceptorChain>
	//*  11   23:aload_1         
	//*  12   24:aload_0         
	//*  13   25:getfield        #64  <Field Executor dispatcher>
	//*  14   28:aload_0         
	//*  15   29:invokespecial   #191 <Method com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack interceptorCallbackProxy()>
	//*  16   32:invokeinterface #195 <Method void ApolloInterceptorChain.proceedAsync(com.apollographql.apollo.interceptor.ApolloInterceptor$InterceptorRequest, Executor, com.apollographql.apollo.interceptor.ApolloInterceptor$CallBack)>
	//*  17   37:return          
		catch(ApolloCanceledException apollocanceledexception)
	//*  18   38:astore_2        
		{
			if(callback != null)
	//*  19   39:aload_1         
	//*  20   40:ifnull          49
			{
				callback.onFailure(((ApolloException) (apollocanceledexception)));
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:invokevirtual   #201 <Method void com.apollographql.apollo.ApolloPrefetch$Callback.onFailure(ApolloException)>
				return;
	//   24   48:return          
			} else
			{
				logger.e(((Throwable) (apollocanceledexception)), "Operation: %s was canceled", new Object[] {
					operation().name().name()
				});
	//   25   49:aload_0         
	//   26   50:getfield        #66  <Field ApolloLogger logger>
	//   27   53:aload_2         
	//   28   54:ldc1            #203 <String "Operation: %s was canceled">
	//   29   56:iconst_1        
	//   30   57:anewarray       Object[]
	//   31   60:dup             
	//   32   61:iconst_0        
	//   33   62:aload_0         
	//   34   63:invokevirtual   #206 <Method Operation operation()>
	//   35   66:invokeinterface #212 <Method OperationName Operation.name()>
	//   36   71:invokeinterface #217 <Method String OperationName.name()>
	//   37   76:aastore         
	//   38   77:invokevirtual   #223 <Method void ApolloLogger.e(Throwable, String, Object[])>
				return;
	//   39   80:return          
			}
		}
		callback = ((com.apollographql.apollo.ApolloPrefetch.Callback) (com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest.builder(operation).build()));
		interceptorChain.proceedAsync(((com.apollographql.apollo.interceptor.ApolloInterceptor.InterceptorRequest) (callback)), dispatcher, interceptorCallbackProxy());
	}

	public boolean isCanceled()
	{
		return state.get() == CallState.CANCELED;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field AtomicReference state>
	//    2    4:invokevirtual   #107 <Method Object AtomicReference.get()>
	//    3    7:getstatic       #152 <Field CallState CallState.CANCELED>
	//    4   10:if_acmpne       15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public Operation operation()
	{
		return operation;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Operation operation>
	//    2    4:areturn         
	}

	Optional terminate()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		_cls2..SwitchMap.com.apollographql.apollo.internal.CallState[((CallState)state.get()).ordinal()];
	//    2    2:getstatic       #103 <Field int[] RealApolloPrefetch$2.$SwitchMap$com$apollographql$apollo$internal$CallState>
	//    3    5:aload_0         
	//    4    6:getfield        #51  <Field AtomicReference state>
	//    5    9:invokevirtual   #107 <Method Object AtomicReference.get()>
	//    6   12:checkcast       #42  <Class CallState>
	//    7   15:invokevirtual   #111 <Method int CallState.ordinal()>
	//    8   18:iaload          
		JVM INSTR tableswitch 1 4: default 156
	//	               1 107
	//	               2 67
	//	               3 51
	//	               4 67;
	//    9   19:tableswitch     1 4: default 156
	//	               1 107
	//	               2 67
	//	               3 51
	//	               4 67
		   goto _L1 _L2 _L3 _L4 _L3
	//*  10   48:goto            141
_L4:
		Optional optional = Optional.fromNullable(originalCallback.getAndSet(((Object) (null))));
	//   11   51:aload_0         
	//   12   52:getfield        #54  <Field AtomicReference originalCallback>
	//   13   55:aconst_null     
	//   14   56:invokevirtual   #234 <Method Object AtomicReference.getAndSet(Object)>
	//   15   59:invokestatic    #175 <Method Optional Optional.fromNullable(Object)>
	//   16   62:astore_1        
		this;
	//   17   63:aload_0         
		JVM INSTR monitorexit ;
	//   18   64:monitorexit     
		return optional;
	//   19   65:aload_1         
	//   20   66:areturn         
_L3:
		throw new IllegalStateException(CallState.IllegalStateMessage.forCurrentState((CallState)state.get()).expected(new CallState[] {
			CallState.ACTIVE, CallState.CANCELED
		}));
	//   21   67:new             #135 <Class IllegalStateException>
	//   22   70:dup             
	//   23   71:aload_0         
	//   24   72:getfield        #51  <Field AtomicReference state>
	//   25   75:invokevirtual   #107 <Method Object AtomicReference.get()>
	//   26   78:checkcast       #42  <Class CallState>
	//   27   81:invokestatic    #240 <Method CallState$IllegalStateMessage CallState$IllegalStateMessage.forCurrentState(CallState)>
	//   28   84:iconst_2        
	//   29   85:anewarray       CallState[]
	//   30   88:dup             
	//   31   89:iconst_0        
	//   32   90:getstatic       #133 <Field CallState CallState.ACTIVE>
	//   33   93:aastore         
	//   34   94:dup             
	//   35   95:iconst_1        
	//   36   96:getstatic       #152 <Field CallState CallState.CANCELED>
	//   37   99:aastore         
	//   38  100:invokevirtual   #244 <Method String CallState$IllegalStateMessage.expected(CallState[])>
	//   39  103:invokespecial   #138 <Method void IllegalStateException(String)>
	//   40  106:athrow          
_L2:
		tracker.unregisterPrefetchCall(((ApolloPrefetch) (this)));
	//   41  107:aload_0         
	//   42  108:getfield        #68  <Field ApolloCallTracker tracker>
	//   43  111:aload_0         
	//   44  112:invokevirtual   #160 <Method void ApolloCallTracker.unregisterPrefetchCall(ApolloPrefetch)>
		state.set(((Object) (CallState.TERMINATED)));
	//   45  115:aload_0         
	//   46  116:getfield        #51  <Field AtomicReference state>
	//   47  119:getstatic       #247 <Field CallState CallState.TERMINATED>
	//   48  122:invokevirtual   #124 <Method void AtomicReference.set(Object)>
		optional = Optional.fromNullable(originalCallback.getAndSet(((Object) (null))));
	//   49  125:aload_0         
	//   50  126:getfield        #54  <Field AtomicReference originalCallback>
	//   51  129:aconst_null     
	//   52  130:invokevirtual   #234 <Method Object AtomicReference.getAndSet(Object)>
	//   53  133:invokestatic    #175 <Method Optional Optional.fromNullable(Object)>
	//   54  136:astore_1        
		this;
	//   55  137:aload_0         
		JVM INSTR monitorexit ;
	//   56  138:monitorexit     
		return optional;
	//   57  139:aload_1         
	//   58  140:areturn         
_L1:
		throw new IllegalStateException("Unknown state");
	//   59  141:new             #135 <Class IllegalStateException>
	//   60  144:dup             
	//   61  145:ldc1            #140 <String "Unknown state">
	//   62  147:invokespecial   #138 <Method void IllegalStateException(String)>
	//   63  150:athrow          
		Exception exception;
		exception;
	//   64  151:astore_1        
		this;
	//   65  152:aload_0         
		JVM INSTR monitorexit ;
	//   66  153:monitorexit     
		throw exception;
	//   67  154:aload_1         
	//   68  155:athrow          
	//*  69  156:goto            48
	}

	final Executor dispatcher;
	final okhttp3.Call.Factory httpCallFactory;
	final ApolloInterceptorChain interceptorChain;
	final ApolloLogger logger;
	final Operation operation;
	final AtomicReference originalCallback = new AtomicReference();
	final ScalarTypeAdapters scalarTypeAdapters;
	final boolean sendOperationIds;
	final HttpUrl serverUrl;
	final AtomicReference state;
	final ApolloCallTracker tracker;
}
