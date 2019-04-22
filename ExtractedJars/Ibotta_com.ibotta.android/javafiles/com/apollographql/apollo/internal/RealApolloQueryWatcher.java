// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal;

import com.apollographql.apollo.ApolloQueryWatcher;
import com.apollographql.apollo.api.*;
import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.cache.normalized.ApolloStore;
import com.apollographql.apollo.exception.*;
import com.apollographql.apollo.fetcher.ApolloResponseFetchers;
import com.apollographql.apollo.fetcher.ResponseFetcher;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.apollographql.apollo.internal:
//			CallState, ApolloCallTracker, RealApolloCall, ApolloLogger

final class RealApolloQueryWatcher
	implements ApolloQueryWatcher
{

	RealApolloQueryWatcher(RealApolloCall realapollocall, ApolloStore apollostore, ApolloLogger apollologger, ApolloCallTracker apollocalltracker)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		refetchResponseFetcher = ApolloResponseFetchers.CACHE_FIRST;
	//    2    4:aload_0         
	//    3    5:getstatic       #44  <Field ResponseFetcher ApolloResponseFetchers.CACHE_FIRST>
	//    4    8:putfield        #46  <Field ResponseFetcher refetchResponseFetcher>
		dependentKeys = Collections.emptySet();
	//    5   11:aload_0         
	//    6   12:invokestatic    #52  <Method Set Collections.emptySet()>
	//    7   15:putfield        #54  <Field Set dependentKeys>
	//    8   18:aload_0         
	//    9   19:new             #9   <Class RealApolloQueryWatcher$1>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #57  <Method void RealApolloQueryWatcher$1(RealApolloQueryWatcher)>
	//   13   27:putfield        #59  <Field com.apollographql.apollo.cache.normalized.ApolloStore$RecordChangeSubscriber recordChangeSubscriber>
		state = new AtomicReference(((Object) (CallState.IDLE)));
	//   14   30:aload_0         
	//   15   31:new             #61  <Class AtomicReference>
	//   16   34:dup             
	//   17   35:getstatic       #67  <Field CallState CallState.IDLE>
	//   18   38:invokespecial   #70  <Method void AtomicReference(Object)>
	//   19   41:putfield        #72  <Field AtomicReference state>
	//   20   44:aload_0         
	//   21   45:new             #61  <Class AtomicReference>
	//   22   48:dup             
	//   23   49:invokespecial   #73  <Method void AtomicReference()>
	//   24   52:putfield        #75  <Field AtomicReference originalCallback>
		activeCall = realapollocall;
	//   25   55:aload_0         
	//   26   56:aload_1         
	//   27   57:putfield        #77  <Field RealApolloCall activeCall>
		apolloStore = apollostore;
	//   28   60:aload_0         
	//   29   61:aload_2         
	//   30   62:putfield        #79  <Field ApolloStore apolloStore>
		logger = apollologger;
	//   31   65:aload_0         
	//   32   66:aload_3         
	//   33   67:putfield        #81  <Field ApolloLogger logger>
		tracker = apollocalltracker;
	//   34   70:aload_0         
	//   35   71:aload           4
	//   36   73:putfield        #83  <Field ApolloCallTracker tracker>
	//   37   76:return          
	}

	private void activate(Optional optional)
		throws ApolloCanceledException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		static class _cls3
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

		_cls3..SwitchMap.com.apollographql.apollo.internal.CallState[((CallState)state.get()).ordinal()];
	//    2    2:getstatic       #94  <Field int[] RealApolloQueryWatcher$3.$SwitchMap$com$apollographql$apollo$internal$CallState>
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field AtomicReference state>
	//    5    9:invokevirtual   #98  <Method Object AtomicReference.get()>
	//    6   12:checkcast       #63  <Class CallState>
	//    7   15:invokevirtual   #102 <Method int CallState.ordinal()>
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
	//   11   51:new             #90  <Class ApolloCanceledException>
	//   12   54:dup             
	//   13   55:ldc1            #104 <String "Call is cancelled.">
	//   14   57:invokespecial   #107 <Method void ApolloCanceledException(String)>
	//   15   60:athrow          
_L3:
		originalCallback.set(optional.orNull());
	//   16   61:aload_0         
	//   17   62:getfield        #75  <Field AtomicReference originalCallback>
	//   18   65:aload_1         
	//   19   66:invokevirtual   #112 <Method Object Optional.orNull()>
	//   20   69:invokevirtual   #115 <Method void AtomicReference.set(Object)>
		tracker.registerQueryWatcher(((ApolloQueryWatcher) (this)));
	//   21   72:aload_0         
	//   22   73:getfield        #83  <Field ApolloCallTracker tracker>
	//   23   76:aload_0         
	//   24   77:invokevirtual   #121 <Method void ApolloCallTracker.registerQueryWatcher(ApolloQueryWatcher)>
		state.set(((Object) (CallState.ACTIVE)));
	//   25   80:aload_0         
	//   26   81:getfield        #72  <Field AtomicReference state>
	//   27   84:getstatic       #124 <Field CallState CallState.ACTIVE>
	//   28   87:invokevirtual   #115 <Method void AtomicReference.set(Object)>
		this;
	//   29   90:aload_0         
		JVM INSTR monitorexit ;
	//   30   91:monitorexit     
		return;
	//   31   92:return          
_L2:
		throw new IllegalStateException("Already Executed");
	//   32   93:new             #126 <Class IllegalStateException>
	//   33   96:dup             
	//   34   97:ldc1            #128 <String "Already Executed">
	//   35   99:invokespecial   #129 <Method void IllegalStateException(String)>
	//   36  102:athrow          
_L1:
		throw new IllegalStateException("Unknown state");
	//   37  103:new             #126 <Class IllegalStateException>
	//   38  106:dup             
	//   39  107:ldc1            #131 <String "Unknown state">
	//   40  109:invokespecial   #129 <Method void IllegalStateException(String)>
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

	private com.apollographql.apollo.ApolloCall.Callback callbackProxy()
	{
		return ((com.apollographql.apollo.ApolloCall.Callback) (new com.apollographql.apollo.ApolloCall.Callback() {

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
			//   26   57:invokevirtual   #103 <Method Set Response.dependentKeys()>
			//   27   60:putfield        #106 <Field Set RealApolloQueryWatcher.dependentKeys>
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
));
	//    0    0:new             #11  <Class RealApolloQueryWatcher$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #136 <Method void RealApolloQueryWatcher$2(RealApolloQueryWatcher)>
	//    4    8:areturn         
	}

	public void cancel()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		_cls3..SwitchMap.com.apollographql.apollo.internal.CallState[((CallState)state.get()).ordinal()];
	//    2    2:getstatic       #94  <Field int[] RealApolloQueryWatcher$3.$SwitchMap$com$apollographql$apollo$internal$CallState>
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field AtomicReference state>
	//    5    9:invokevirtual   #98  <Method Object AtomicReference.get()>
	//    6   12:checkcast       #63  <Class CallState>
	//    7   15:invokevirtual   #102 <Method int CallState.ordinal()>
	//    8   18:iaload          
		JVM INSTR tableswitch 1 4: default 157
	//	               1 64
	//	               2 51
	//	               3 110
	//	               4 110;
	//    9   19:tableswitch     1 4: default 157
	//	               1 64
	//	               2 51
	//	               3 110
	//	               4 110
		   goto _L1 _L2 _L3 _L4 _L4
	//*  10   48:goto            142
_L3:
		state.set(((Object) (CallState.CANCELED)));
	//   11   51:aload_0         
	//   12   52:getfield        #72  <Field AtomicReference state>
	//   13   55:getstatic       #141 <Field CallState CallState.CANCELED>
	//   14   58:invokevirtual   #115 <Method void AtomicReference.set(Object)>
		  goto _L4
	//*  15   61:goto            110
_L2:
		activeCall.cancel();
	//   16   64:aload_0         
	//   17   65:getfield        #77  <Field RealApolloCall activeCall>
	//   18   68:invokevirtual   #145 <Method void RealApolloCall.cancel()>
		apolloStore.unsubscribe(recordChangeSubscriber);
	//   19   71:aload_0         
	//   20   72:getfield        #79  <Field ApolloStore apolloStore>
	//   21   75:aload_0         
	//   22   76:getfield        #59  <Field com.apollographql.apollo.cache.normalized.ApolloStore$RecordChangeSubscriber recordChangeSubscriber>
	//   23   79:invokeinterface #151 <Method void ApolloStore.unsubscribe(com.apollographql.apollo.cache.normalized.ApolloStore$RecordChangeSubscriber)>
		tracker.unregisterQueryWatcher(((ApolloQueryWatcher) (this)));
	//   24   84:aload_0         
	//   25   85:getfield        #83  <Field ApolloCallTracker tracker>
	//   26   88:aload_0         
	//   27   89:invokevirtual   #154 <Method void ApolloCallTracker.unregisterQueryWatcher(ApolloQueryWatcher)>
		originalCallback.set(((Object) (null)));
	//   28   92:aload_0         
	//   29   93:getfield        #75  <Field AtomicReference originalCallback>
	//   30   96:aconst_null     
	//   31   97:invokevirtual   #115 <Method void AtomicReference.set(Object)>
		state.set(((Object) (CallState.CANCELED)));
	//   32  100:aload_0         
	//   33  101:getfield        #72  <Field AtomicReference state>
	//   34  104:getstatic       #141 <Field CallState CallState.CANCELED>
	//   35  107:invokevirtual   #115 <Method void AtomicReference.set(Object)>
_L4:
		this;
	//   36  110:aload_0         
		JVM INSTR monitorexit ;
	//   37  111:monitorexit     
		return;
	//   38  112:return          
		Exception exception;
		exception;
	//   39  113:astore_1        
		tracker.unregisterQueryWatcher(((ApolloQueryWatcher) (this)));
	//   40  114:aload_0         
	//   41  115:getfield        #83  <Field ApolloCallTracker tracker>
	//   42  118:aload_0         
	//   43  119:invokevirtual   #154 <Method void ApolloCallTracker.unregisterQueryWatcher(ApolloQueryWatcher)>
		originalCallback.set(((Object) (null)));
	//   44  122:aload_0         
	//   45  123:getfield        #75  <Field AtomicReference originalCallback>
	//   46  126:aconst_null     
	//   47  127:invokevirtual   #115 <Method void AtomicReference.set(Object)>
		state.set(((Object) (CallState.CANCELED)));
	//   48  130:aload_0         
	//   49  131:getfield        #72  <Field AtomicReference state>
	//   50  134:getstatic       #141 <Field CallState CallState.CANCELED>
	//   51  137:invokevirtual   #115 <Method void AtomicReference.set(Object)>
		throw exception;
	//   52  140:aload_1         
	//   53  141:athrow          
_L1:
		throw new IllegalStateException("Unknown state");
	//   54  142:new             #126 <Class IllegalStateException>
	//   55  145:dup             
	//   56  146:ldc1            #131 <String "Unknown state">
	//   57  148:invokespecial   #129 <Method void IllegalStateException(String)>
	//   58  151:athrow          
		exception;
	//   59  152:astore_1        
		this;
	//   60  153:aload_0         
		JVM INSTR monitorexit ;
	//   61  154:monitorexit     
		throw exception;
	//   62  155:aload_1         
	//   63  156:athrow          
	//*  64  157:goto            48
	}

	public ApolloQueryWatcher enqueueAndWatch(com.apollographql.apollo.ApolloCall.Callback callback)
	{
		try
		{
			activate(Optional.fromNullable(((Object) (callback))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #161 <Method Optional Optional.fromNullable(Object)>
	//    3    5:invokespecial   #163 <Method void activate(Optional)>
		}
	//*   4    8:aload_0         
	//*   5    9:getfield        #77  <Field RealApolloCall activeCall>
	//*   6   12:aload_0         
	//*   7   13:invokespecial   #165 <Method com.apollographql.apollo.ApolloCall$Callback callbackProxy()>
	//*   8   16:invokevirtual   #169 <Method void RealApolloCall.enqueue(com.apollographql.apollo.ApolloCall$Callback)>
	//*   9   19:aload_0         
	//*  10   20:areturn         
		catch(ApolloCanceledException apollocanceledexception)
	//*  11   21:astore_2        
		{
			if(callback != null)
	//*  12   22:aload_1         
	//*  13   23:ifnull          33
			{
				callback.onCanceledError(apollocanceledexception);
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:invokevirtual   #175 <Method void com.apollographql.apollo.ApolloCall$Callback.onCanceledError(ApolloCanceledException)>
				return ((ApolloQueryWatcher) (this));
	//   17   31:aload_0         
	//   18   32:areturn         
			} else
			{
				logger.e(((Throwable) (apollocanceledexception)), "Operation: %s was canceled", new Object[] {
					operation().name().name()
				});
	//   19   33:aload_0         
	//   20   34:getfield        #81  <Field ApolloLogger logger>
	//   21   37:aload_2         
	//   22   38:ldc1            #177 <String "Operation: %s was canceled">
	//   23   40:iconst_1        
	//   24   41:anewarray       Object[]
	//   25   44:dup             
	//   26   45:iconst_0        
	//   27   46:aload_0         
	//   28   47:invokevirtual   #181 <Method Operation operation()>
	//   29   50:invokeinterface #187 <Method OperationName Operation.name()>
	//   30   55:invokeinterface #192 <Method String OperationName.name()>
	//   31   60:aastore         
	//   32   61:invokevirtual   #198 <Method void ApolloLogger.e(Throwable, String, Object[])>
				return ((ApolloQueryWatcher) (this));
	//   33   64:aload_0         
	//   34   65:areturn         
			}
		}
		activeCall.enqueue(callbackProxy());
		return ((ApolloQueryWatcher) (this));
	}

	public boolean isCanceled()
	{
		return state.get() == CallState.CANCELED;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field AtomicReference state>
	//    2    4:invokevirtual   #98  <Method Object AtomicReference.get()>
	//    3    7:getstatic       #141 <Field CallState CallState.CANCELED>
	//    4   10:if_acmpne       15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public Operation operation()
	{
		return activeCall.operation();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field RealApolloCall activeCall>
	//    2    4:invokevirtual   #204 <Method Operation RealApolloCall.operation()>
	//    3    7:areturn         
	}

	public void refetch()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		_cls3..SwitchMap.com.apollographql.apollo.internal.CallState[((CallState)state.get()).ordinal()];
	//    2    2:getstatic       #94  <Field int[] RealApolloQueryWatcher$3.$SwitchMap$com$apollographql$apollo$internal$CallState>
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field AtomicReference state>
	//    5    9:invokevirtual   #98  <Method Object AtomicReference.get()>
	//    6   12:checkcast       #63  <Class CallState>
	//    7   15:invokevirtual   #102 <Method int CallState.ordinal()>
	//    8   18:iaload          
		JVM INSTR tableswitch 1 4: default 148
	//	               1 81
	//	               2 71
	//	               3 61
	//	               4 51;
	//    9   19:tableswitch     1 4: default 148
	//	               1 81
	//	               2 71
	//	               3 61
	//	               4 51
		   goto _L1 _L2 _L3 _L4 _L5
	//*  10   48:goto            133
_L5:
		throw new IllegalStateException("Cannot refetch a watcher which has experienced an error.");
	//   11   51:new             #126 <Class IllegalStateException>
	//   12   54:dup             
	//   13   55:ldc1            #208 <String "Cannot refetch a watcher which has experienced an error.">
	//   14   57:invokespecial   #129 <Method void IllegalStateException(String)>
	//   15   60:athrow          
_L4:
		throw new IllegalStateException("Cannot refetch a canceled watcher,");
	//   16   61:new             #126 <Class IllegalStateException>
	//   17   64:dup             
	//   18   65:ldc1            #210 <String "Cannot refetch a canceled watcher,">
	//   19   67:invokespecial   #129 <Method void IllegalStateException(String)>
	//   20   70:athrow          
_L3:
		throw new IllegalStateException("Cannot refetch a watcher which has not first called enqueueAndWatch.");
	//   21   71:new             #126 <Class IllegalStateException>
	//   22   74:dup             
	//   23   75:ldc1            #212 <String "Cannot refetch a watcher which has not first called enqueueAndWatch.">
	//   24   77:invokespecial   #129 <Method void IllegalStateException(String)>
	//   25   80:athrow          
_L2:
		apolloStore.unsubscribe(recordChangeSubscriber);
	//   26   81:aload_0         
	//   27   82:getfield        #79  <Field ApolloStore apolloStore>
	//   28   85:aload_0         
	//   29   86:getfield        #59  <Field com.apollographql.apollo.cache.normalized.ApolloStore$RecordChangeSubscriber recordChangeSubscriber>
	//   30   89:invokeinterface #151 <Method void ApolloStore.unsubscribe(com.apollographql.apollo.cache.normalized.ApolloStore$RecordChangeSubscriber)>
		activeCall.cancel();
	//   31   94:aload_0         
	//   32   95:getfield        #77  <Field RealApolloCall activeCall>
	//   33   98:invokevirtual   #145 <Method void RealApolloCall.cancel()>
		activeCall = activeCall.clone().responseFetcher(refetchResponseFetcher);
	//   34  101:aload_0         
	//   35  102:aload_0         
	//   36  103:getfield        #77  <Field RealApolloCall activeCall>
	//   37  106:invokevirtual   #216 <Method RealApolloCall RealApolloCall.clone()>
	//   38  109:aload_0         
	//   39  110:getfield        #46  <Field ResponseFetcher refetchResponseFetcher>
	//   40  113:invokevirtual   #220 <Method RealApolloCall RealApolloCall.responseFetcher(ResponseFetcher)>
	//   41  116:putfield        #77  <Field RealApolloCall activeCall>
		activeCall.enqueue(callbackProxy());
	//   42  119:aload_0         
	//   43  120:getfield        #77  <Field RealApolloCall activeCall>
	//   44  123:aload_0         
	//   45  124:invokespecial   #165 <Method com.apollographql.apollo.ApolloCall$Callback callbackProxy()>
	//   46  127:invokevirtual   #169 <Method void RealApolloCall.enqueue(com.apollographql.apollo.ApolloCall$Callback)>
		this;
	//   47  130:aload_0         
		JVM INSTR monitorexit ;
	//   48  131:monitorexit     
		return;
	//   49  132:return          
_L1:
		throw new IllegalStateException("Unknown state");
	//   50  133:new             #126 <Class IllegalStateException>
	//   51  136:dup             
	//   52  137:ldc1            #131 <String "Unknown state">
	//   53  139:invokespecial   #129 <Method void IllegalStateException(String)>
	//   54  142:athrow          
		Exception exception;
		exception;
	//   55  143:astore_1        
		this;
	//   56  144:aload_0         
		JVM INSTR monitorexit ;
	//   57  145:monitorexit     
		throw exception;
	//   58  146:aload_1         
	//   59  147:athrow          
	//*  60  148:goto            48
	}

	public volatile ApolloQueryWatcher refetchResponseFetcher(ResponseFetcher responsefetcher)
	{
		return ((ApolloQueryWatcher) (refetchResponseFetcher(responsefetcher)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #224 <Method RealApolloQueryWatcher refetchResponseFetcher(ResponseFetcher)>
	//    3    5:areturn         
	}

	public RealApolloQueryWatcher refetchResponseFetcher(ResponseFetcher responsefetcher)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(state.get() != CallState.IDLE)
			break MISSING_BLOCK_LABEL_31;
	//    2    2:aload_0         
	//    3    3:getfield        #72  <Field AtomicReference state>
	//    4    6:invokevirtual   #98  <Method Object AtomicReference.get()>
	//    5    9:getstatic       #67  <Field CallState CallState.IDLE>
	//    6   12:if_acmpne       31
		Utils.checkNotNull(((Object) (responsefetcher)), "responseFetcher == null");
	//    7   15:aload_1         
	//    8   16:ldc1            #226 <String "responseFetcher == null">
	//    9   18:invokestatic    #232 <Method Object Utils.checkNotNull(Object, Object)>
	//   10   21:pop             
		refetchResponseFetcher = responsefetcher;
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:putfield        #46  <Field ResponseFetcher refetchResponseFetcher>
		this;
	//   14   27:aload_0         
		JVM INSTR monitorexit ;
	//   15   28:monitorexit     
		return this;
	//   16   29:aload_0         
	//   17   30:areturn         
		throw new IllegalStateException("Already Executed");
	//   18   31:new             #126 <Class IllegalStateException>
	//   19   34:dup             
	//   20   35:ldc1            #128 <String "Already Executed">
	//   21   37:invokespecial   #129 <Method void IllegalStateException(String)>
	//   22   40:athrow          
		responsefetcher;
	//   23   41:astore_1        
		this;
	//   24   42:aload_0         
		JVM INSTR monitorexit ;
	//   25   43:monitorexit     
		throw responsefetcher;
	//   26   44:aload_1         
	//   27   45:athrow          
	}

	Optional responseCallback()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		_cls3..SwitchMap.com.apollographql.apollo.internal.CallState[((CallState)state.get()).ordinal()];
	//    2    2:getstatic       #94  <Field int[] RealApolloQueryWatcher$3.$SwitchMap$com$apollographql$apollo$internal$CallState>
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field AtomicReference state>
	//    5    9:invokevirtual   #98  <Method Object AtomicReference.get()>
	//    6   12:checkcast       #63  <Class CallState>
	//    7   15:invokevirtual   #102 <Method int CallState.ordinal()>
	//    8   18:iaload          
		JVM INSTR tableswitch 1 4: default 121
	//	               1 91
	//	               2 51
	//	               3 91
	//	               4 51;
	//    9   19:tableswitch     1 4: default 121
	//	               1 91
	//	               2 51
	//	               3 91
	//	               4 51
		   goto _L1 _L2 _L3 _L2 _L3
	//*  10   48:goto            106
_L3:
		throw new IllegalStateException(CallState.IllegalStateMessage.forCurrentState((CallState)state.get()).expected(new CallState[] {
			CallState.ACTIVE, CallState.CANCELED
		}));
	//   11   51:new             #126 <Class IllegalStateException>
	//   12   54:dup             
	//   13   55:aload_0         
	//   14   56:getfield        #72  <Field AtomicReference state>
	//   15   59:invokevirtual   #98  <Method Object AtomicReference.get()>
	//   16   62:checkcast       #63  <Class CallState>
	//   17   65:invokestatic    #241 <Method CallState$IllegalStateMessage CallState$IllegalStateMessage.forCurrentState(CallState)>
	//   18   68:iconst_2        
	//   19   69:anewarray       CallState[]
	//   20   72:dup             
	//   21   73:iconst_0        
	//   22   74:getstatic       #124 <Field CallState CallState.ACTIVE>
	//   23   77:aastore         
	//   24   78:dup             
	//   25   79:iconst_1        
	//   26   80:getstatic       #141 <Field CallState CallState.CANCELED>
	//   27   83:aastore         
	//   28   84:invokevirtual   #245 <Method String CallState$IllegalStateMessage.expected(CallState[])>
	//   29   87:invokespecial   #129 <Method void IllegalStateException(String)>
	//   30   90:athrow          
_L2:
		Optional optional = Optional.fromNullable(originalCallback.get());
	//   31   91:aload_0         
	//   32   92:getfield        #75  <Field AtomicReference originalCallback>
	//   33   95:invokevirtual   #98  <Method Object AtomicReference.get()>
	//   34   98:invokestatic    #161 <Method Optional Optional.fromNullable(Object)>
	//   35  101:astore_1        
		this;
	//   36  102:aload_0         
		JVM INSTR monitorexit ;
	//   37  103:monitorexit     
		return optional;
	//   38  104:aload_1         
	//   39  105:areturn         
_L1:
		throw new IllegalStateException("Unknown state");
	//   40  106:new             #126 <Class IllegalStateException>
	//   41  109:dup             
	//   42  110:ldc1            #131 <String "Unknown state">
	//   43  112:invokespecial   #129 <Method void IllegalStateException(String)>
	//   44  115:athrow          
		Exception exception;
		exception;
	//   45  116:astore_1        
		this;
	//   46  117:aload_0         
		JVM INSTR monitorexit ;
	//   47  118:monitorexit     
		throw exception;
	//   48  119:aload_1         
	//   49  120:athrow          
	//*  50  121:goto            48
	}

	Optional terminate()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		_cls3..SwitchMap.com.apollographql.apollo.internal.CallState[((CallState)state.get()).ordinal()];
	//    2    2:getstatic       #94  <Field int[] RealApolloQueryWatcher$3.$SwitchMap$com$apollographql$apollo$internal$CallState>
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field AtomicReference state>
	//    5    9:invokevirtual   #98  <Method Object AtomicReference.get()>
	//    6   12:checkcast       #63  <Class CallState>
	//    7   15:invokevirtual   #102 <Method int CallState.ordinal()>
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
	//   12   52:getfield        #75  <Field AtomicReference originalCallback>
	//   13   55:aconst_null     
	//   14   56:invokevirtual   #251 <Method Object AtomicReference.getAndSet(Object)>
	//   15   59:invokestatic    #161 <Method Optional Optional.fromNullable(Object)>
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
	//   21   67:new             #126 <Class IllegalStateException>
	//   22   70:dup             
	//   23   71:aload_0         
	//   24   72:getfield        #72  <Field AtomicReference state>
	//   25   75:invokevirtual   #98  <Method Object AtomicReference.get()>
	//   26   78:checkcast       #63  <Class CallState>
	//   27   81:invokestatic    #241 <Method CallState$IllegalStateMessage CallState$IllegalStateMessage.forCurrentState(CallState)>
	//   28   84:iconst_2        
	//   29   85:anewarray       CallState[]
	//   30   88:dup             
	//   31   89:iconst_0        
	//   32   90:getstatic       #124 <Field CallState CallState.ACTIVE>
	//   33   93:aastore         
	//   34   94:dup             
	//   35   95:iconst_1        
	//   36   96:getstatic       #141 <Field CallState CallState.CANCELED>
	//   37   99:aastore         
	//   38  100:invokevirtual   #245 <Method String CallState$IllegalStateMessage.expected(CallState[])>
	//   39  103:invokespecial   #129 <Method void IllegalStateException(String)>
	//   40  106:athrow          
_L2:
		tracker.unregisterQueryWatcher(((ApolloQueryWatcher) (this)));
	//   41  107:aload_0         
	//   42  108:getfield        #83  <Field ApolloCallTracker tracker>
	//   43  111:aload_0         
	//   44  112:invokevirtual   #154 <Method void ApolloCallTracker.unregisterQueryWatcher(ApolloQueryWatcher)>
		state.set(((Object) (CallState.TERMINATED)));
	//   45  115:aload_0         
	//   46  116:getfield        #72  <Field AtomicReference state>
	//   47  119:getstatic       #254 <Field CallState CallState.TERMINATED>
	//   48  122:invokevirtual   #115 <Method void AtomicReference.set(Object)>
		optional = Optional.fromNullable(originalCallback.getAndSet(((Object) (null))));
	//   49  125:aload_0         
	//   50  126:getfield        #75  <Field AtomicReference originalCallback>
	//   51  129:aconst_null     
	//   52  130:invokevirtual   #251 <Method Object AtomicReference.getAndSet(Object)>
	//   53  133:invokestatic    #161 <Method Optional Optional.fromNullable(Object)>
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
	//   59  141:new             #126 <Class IllegalStateException>
	//   60  144:dup             
	//   61  145:ldc1            #131 <String "Unknown state">
	//   62  147:invokespecial   #129 <Method void IllegalStateException(String)>
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

	private RealApolloCall activeCall;
	final ApolloStore apolloStore;
	Set dependentKeys;
	final ApolloLogger logger;
	private final AtomicReference originalCallback = new AtomicReference();
	final com.apollographql.apollo.cache.normalized.ApolloStore.RecordChangeSubscriber recordChangeSubscriber = new com.apollographql.apollo.cache.normalized.ApolloStore.RecordChangeSubscriber() {

		public void onCacheRecordsChanged(Set set)
		{
			if(!Utils.areDisjoint(dependentKeys, set))
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field RealApolloQueryWatcher this$0>
		//*   2    4:getfield        #24  <Field Set RealApolloQueryWatcher.dependentKeys>
		//*   3    7:aload_1         
		//*   4    8:invokestatic    #30  <Method boolean Utils.areDisjoint(Set, Set)>
		//*   5   11:ifne            21
				refetch();
		//    6   14:aload_0         
		//    7   15:getfield        #14  <Field RealApolloQueryWatcher this$0>
		//    8   18:invokevirtual   #33  <Method void RealApolloQueryWatcher.refetch()>
		//    9   21:return          
		}

		final RealApolloQueryWatcher this$0;

			
			{
				this$0 = RealApolloQueryWatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field RealApolloQueryWatcher this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private ResponseFetcher refetchResponseFetcher;
	private final AtomicReference state;
	private final ApolloCallTracker tracker;
}
