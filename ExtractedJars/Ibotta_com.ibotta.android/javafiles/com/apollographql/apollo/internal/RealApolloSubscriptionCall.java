// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal;

import com.apollographql.apollo.ApolloSubscriptionCall;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.exception.ApolloCanceledException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.internal.subscription.ApolloSubscriptionException;
import com.apollographql.apollo.internal.subscription.SubscriptionManager;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.apollographql.apollo.internal:
//			CallState

public class RealApolloSubscriptionCall
	implements ApolloSubscriptionCall
{
	private static final class SubscriptionManagerCallback
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
				((RealApolloSubscriptionCall) (obj)).terminate();
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
				((RealApolloSubscriptionCall) (apollosubscriptionexception)).terminate();
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
				((RealApolloSubscriptionCall) (throwable)).terminate();
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

		SubscriptionManagerCallback(com.apollographql.apollo.ApolloSubscriptionCall.Callback callback, RealApolloSubscriptionCall realapollosubscriptioncall)
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


	public RealApolloSubscriptionCall(Subscription subscription1, SubscriptionManager subscriptionmanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		state = new AtomicReference(((Object) (CallState.IDLE)));
	//    2    4:aload_0         
	//    3    5:new             #30  <Class AtomicReference>
	//    4    8:dup             
	//    5    9:getstatic       #36  <Field CallState CallState.IDLE>
	//    6   12:invokespecial   #39  <Method void AtomicReference(Object)>
	//    7   15:putfield        #41  <Field AtomicReference state>
		subscription = subscription1;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #43  <Field Subscription subscription>
		subscriptionManager = subscriptionmanager;
	//   11   23:aload_0         
	//   12   24:aload_2         
	//   13   25:putfield        #45  <Field SubscriptionManager subscriptionManager>
	//   14   28:return          
	}

	private void terminate()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		static class _cls1
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
					$SwitchMap$com$apollographql$apollo$internal$CallState[CallState.IDLE.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
			//    5   12:getstatic       #24  <Field CallState CallState.IDLE>
			//    6   15:invokevirtual   #28  <Method int CallState.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
			//*  10   23:getstatic       #31  <Field CallState CallState.CANCELED>
			//*  11   26:invokevirtual   #28  <Method int CallState.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
			//*  15   34:getstatic       #34  <Field CallState CallState.TERMINATED>
			//*  16   37:invokevirtual   #28  <Method int CallState.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$internal$CallState>
			//*  20   45:getstatic       #37  <Field CallState CallState.ACTIVE>
			//*  21   48:invokevirtual   #28  <Method int CallState.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   25   54:astore_0        
				try
				{
					$SwitchMap$com$apollographql$apollo$internal$CallState[CallState.CANCELED.ordinal()] = 2;
				}
			//*  26   55:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   27   58:astore_0        
				try
				{
					$SwitchMap$com$apollographql$apollo$internal$CallState[CallState.TERMINATED.ordinal()] = 3;
				}
			//*  28   59:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   29   62:astore_0        
				try
				{
					$SwitchMap$com$apollographql$apollo$internal$CallState[CallState.ACTIVE.ordinal()] = 4;
				}
			//*  30   63:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   66:astore_0        
			//*  32   67:return          
			}
		}

		_cls1..SwitchMap.com.apollographql.apollo.internal.CallState[((CallState)state.get()).ordinal()];
	//    2    2:getstatic       #57  <Field int[] RealApolloSubscriptionCall$1.$SwitchMap$com$apollographql$apollo$internal$CallState>
	//    3    5:aload_0         
	//    4    6:getfield        #41  <Field AtomicReference state>
	//    5    9:invokevirtual   #61  <Method Object AtomicReference.get()>
	//    6   12:checkcast       #32  <Class CallState>
	//    7   15:invokevirtual   #65  <Method int CallState.ordinal()>
	//    8   18:iaload          
		JVM INSTR tableswitch 1 4: default 126
	//	               1 71
	//	               2 68
	//	               3 71
	//	               4 51;
	//    9   19:tableswitch     1 4: default 126
	//	               1 71
	//	               2 68
	//	               3 71
	//	               4 51
		   goto _L1 _L2 _L3 _L2 _L4
	//*  10   48:goto            111
_L4:
		state.set(((Object) (CallState.TERMINATED)));
	//   11   51:aload_0         
	//   12   52:getfield        #41  <Field AtomicReference state>
	//   13   55:getstatic       #68  <Field CallState CallState.TERMINATED>
	//   14   58:invokevirtual   #71  <Method void AtomicReference.set(Object)>
		subscriptionCallback.release();
	//   15   61:aload_0         
	//   16   62:getfield        #73  <Field RealApolloSubscriptionCall$SubscriptionManagerCallback subscriptionCallback>
	//   17   65:invokevirtual   #76  <Method void RealApolloSubscriptionCall$SubscriptionManagerCallback.release()>
_L3:
		this;
	//   18   68:aload_0         
		JVM INSTR monitorexit ;
	//   19   69:monitorexit     
		return;
	//   20   70:return          
_L2:
		throw new IllegalStateException(CallState.IllegalStateMessage.forCurrentState((CallState)state.get()).expected(new CallState[] {
			CallState.ACTIVE, CallState.CANCELED
		}));
	//   21   71:new             #78  <Class IllegalStateException>
	//   22   74:dup             
	//   23   75:aload_0         
	//   24   76:getfield        #41  <Field AtomicReference state>
	//   25   79:invokevirtual   #61  <Method Object AtomicReference.get()>
	//   26   82:checkcast       #32  <Class CallState>
	//   27   85:invokestatic    #84  <Method CallState$IllegalStateMessage CallState$IllegalStateMessage.forCurrentState(CallState)>
	//   28   88:iconst_2        
	//   29   89:anewarray       CallState[]
	//   30   92:dup             
	//   31   93:iconst_0        
	//   32   94:getstatic       #87  <Field CallState CallState.ACTIVE>
	//   33   97:aastore         
	//   34   98:dup             
	//   35   99:iconst_1        
	//   36  100:getstatic       #90  <Field CallState CallState.CANCELED>
	//   37  103:aastore         
	//   38  104:invokevirtual   #94  <Method String CallState$IllegalStateMessage.expected(CallState[])>
	//   39  107:invokespecial   #97  <Method void IllegalStateException(String)>
	//   40  110:athrow          
_L1:
		throw new IllegalStateException("Unknown state");
	//   41  111:new             #78  <Class IllegalStateException>
	//   42  114:dup             
	//   43  115:ldc1            #99  <String "Unknown state">
	//   44  117:invokespecial   #97  <Method void IllegalStateException(String)>
	//   45  120:athrow          
		Exception exception;
		exception;
	//   46  121:astore_1        
		this;
	//   47  122:aload_0         
		JVM INSTR monitorexit ;
	//   48  123:monitorexit     
		throw exception;
	//   49  124:aload_1         
	//   50  125:athrow          
	//*  51  126:goto            48
	}

	public void cancel()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		_cls1..SwitchMap.com.apollographql.apollo.internal.CallState[((CallState)state.get()).ordinal()];
	//    2    2:getstatic       #57  <Field int[] RealApolloSubscriptionCall$1.$SwitchMap$com$apollographql$apollo$internal$CallState>
	//    3    5:aload_0         
	//    4    6:getfield        #41  <Field AtomicReference state>
	//    5    9:invokevirtual   #61  <Method Object AtomicReference.get()>
	//    6   12:checkcast       #32  <Class CallState>
	//    7   15:invokevirtual   #65  <Method int CallState.ordinal()>
	//    8   18:iaload          
		JVM INSTR tableswitch 1 4: default 132
	//	               1 104
	//	               2 114
	//	               3 114
	//	               4 51;
	//    9   19:tableswitch     1 4: default 132
	//	               1 104
	//	               2 114
	//	               3 114
	//	               4 51
		   goto _L1 _L2 _L3 _L3 _L4
	//*  10   48:goto            117
_L4:
		subscriptionManager.unsubscribe(subscription);
	//   11   51:aload_0         
	//   12   52:getfield        #45  <Field SubscriptionManager subscriptionManager>
	//   13   55:aload_0         
	//   14   56:getfield        #43  <Field Subscription subscription>
	//   15   59:invokeinterface #106 <Method void SubscriptionManager.unsubscribe(Subscription)>
		state.set(((Object) (CallState.CANCELED)));
	//   16   64:aload_0         
	//   17   65:getfield        #41  <Field AtomicReference state>
	//   18   68:getstatic       #90  <Field CallState CallState.CANCELED>
	//   19   71:invokevirtual   #71  <Method void AtomicReference.set(Object)>
		subscriptionCallback.release();
	//   20   74:aload_0         
	//   21   75:getfield        #73  <Field RealApolloSubscriptionCall$SubscriptionManagerCallback subscriptionCallback>
	//   22   78:invokevirtual   #76  <Method void RealApolloSubscriptionCall$SubscriptionManagerCallback.release()>
		  goto _L3
	//*  23   81:goto            114
		Exception exception;
		exception;
	//   24   84:astore_1        
		state.set(((Object) (CallState.CANCELED)));
	//   25   85:aload_0         
	//   26   86:getfield        #41  <Field AtomicReference state>
	//   27   89:getstatic       #90  <Field CallState CallState.CANCELED>
	//   28   92:invokevirtual   #71  <Method void AtomicReference.set(Object)>
		subscriptionCallback.release();
	//   29   95:aload_0         
	//   30   96:getfield        #73  <Field RealApolloSubscriptionCall$SubscriptionManagerCallback subscriptionCallback>
	//   31   99:invokevirtual   #76  <Method void RealApolloSubscriptionCall$SubscriptionManagerCallback.release()>
		throw exception;
	//   32  102:aload_1         
	//   33  103:athrow          
_L2:
		state.set(((Object) (CallState.CANCELED)));
	//   34  104:aload_0         
	//   35  105:getfield        #41  <Field AtomicReference state>
	//   36  108:getstatic       #90  <Field CallState CallState.CANCELED>
	//   37  111:invokevirtual   #71  <Method void AtomicReference.set(Object)>
_L3:
		this;
	//   38  114:aload_0         
		JVM INSTR monitorexit ;
	//   39  115:monitorexit     
		return;
	//   40  116:return          
_L1:
		throw new IllegalStateException("Unknown state");
	//   41  117:new             #78  <Class IllegalStateException>
	//   42  120:dup             
	//   43  121:ldc1            #99  <String "Unknown state">
	//   44  123:invokespecial   #97  <Method void IllegalStateException(String)>
	//   45  126:athrow          
		exception;
	//   46  127:astore_1        
		this;
	//   47  128:aload_0         
		JVM INSTR monitorexit ;
	//   48  129:monitorexit     
		throw exception;
	//   49  130:aload_1         
	//   50  131:athrow          
	//*  51  132:goto            48
	}

	public ApolloSubscriptionCall clone()
	{
		return ((ApolloSubscriptionCall) (new RealApolloSubscriptionCall(subscription, subscriptionManager)));
	//    0    0:new             #2   <Class RealApolloSubscriptionCall>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field Subscription subscription>
	//    4    8:aload_0         
	//    5    9:getfield        #45  <Field SubscriptionManager subscriptionManager>
	//    6   12:invokespecial   #110 <Method void RealApolloSubscriptionCall(Subscription, SubscriptionManager)>
	//    7   15:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #115 <Method ApolloSubscriptionCall clone()>
	//    2    4:areturn         
	}

	public void execute(com.apollographql.apollo.ApolloSubscriptionCall.Callback callback)
		throws ApolloCanceledException
	{
		Utils.checkNotNull(((Object) (callback)), "callback == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #123 <String "callback == null">
	//    2    3:invokestatic    #129 <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		this;
	//    4    7:aload_0         
		JVM INSTR monitorenter ;
	//    5    8:monitorenter    
		_cls1..SwitchMap.com.apollographql.apollo.internal.CallState[((CallState)state.get()).ordinal()];
	//    6    9:getstatic       #57  <Field int[] RealApolloSubscriptionCall$1.$SwitchMap$com$apollographql$apollo$internal$CallState>
	//    7   12:aload_0         
	//    8   13:getfield        #41  <Field AtomicReference state>
	//    9   16:invokevirtual   #61  <Method Object AtomicReference.get()>
	//   10   19:checkcast       #32  <Class CallState>
	//   11   22:invokevirtual   #65  <Method int CallState.ordinal()>
	//   12   25:iaload          
		JVM INSTR tableswitch 1 4: default 137
	//	               1 79
	//	               2 69
	//	               3 59
	//	               4 59;
	//   13   26:tableswitch     1 4: default 137
	//	               1 79
	//	               2 69
	//	               3 59
	//	               4 59
		   goto _L1 _L2 _L3 _L4 _L4
	//*  14   56:goto            122
_L4:
		throw new IllegalStateException("Already Executed");
	//   15   59:new             #78  <Class IllegalStateException>
	//   16   62:dup             
	//   17   63:ldc1            #131 <String "Already Executed">
	//   18   65:invokespecial   #97  <Method void IllegalStateException(String)>
	//   19   68:athrow          
_L3:
		throw new ApolloCanceledException("Call is cancelled.");
	//   20   69:new             #120 <Class ApolloCanceledException>
	//   21   72:dup             
	//   22   73:ldc1            #133 <String "Call is cancelled.">
	//   23   75:invokespecial   #134 <Method void ApolloCanceledException(String)>
	//   24   78:athrow          
_L2:
		state.set(((Object) (CallState.ACTIVE)));
	//   25   79:aload_0         
	//   26   80:getfield        #41  <Field AtomicReference state>
	//   27   83:getstatic       #87  <Field CallState CallState.ACTIVE>
	//   28   86:invokevirtual   #71  <Method void AtomicReference.set(Object)>
		subscriptionCallback = new SubscriptionManagerCallback(callback, this);
	//   29   89:aload_0         
	//   30   90:new             #11  <Class RealApolloSubscriptionCall$SubscriptionManagerCallback>
	//   31   93:dup             
	//   32   94:aload_1         
	//   33   95:aload_0         
	//   34   96:invokespecial   #137 <Method void RealApolloSubscriptionCall$SubscriptionManagerCallback(com.apollographql.apollo.ApolloSubscriptionCall$Callback, RealApolloSubscriptionCall)>
	//   35   99:putfield        #73  <Field RealApolloSubscriptionCall$SubscriptionManagerCallback subscriptionCallback>
		subscriptionManager.subscribe(subscription, ((com.apollographql.apollo.internal.subscription.SubscriptionManager.Callback) (subscriptionCallback)));
	//   36  102:aload_0         
	//   37  103:getfield        #45  <Field SubscriptionManager subscriptionManager>
	//   38  106:aload_0         
	//   39  107:getfield        #43  <Field Subscription subscription>
	//   40  110:aload_0         
	//   41  111:getfield        #73  <Field RealApolloSubscriptionCall$SubscriptionManagerCallback subscriptionCallback>
	//   42  114:invokeinterface #141 <Method void SubscriptionManager.subscribe(Subscription, com.apollographql.apollo.internal.subscription.SubscriptionManager$Callback)>
		this;
	//   43  119:aload_0         
		JVM INSTR monitorexit ;
	//   44  120:monitorexit     
		return;
	//   45  121:return          
_L1:
		throw new IllegalStateException("Unknown state");
	//   46  122:new             #78  <Class IllegalStateException>
	//   47  125:dup             
	//   48  126:ldc1            #99  <String "Unknown state">
	//   49  128:invokespecial   #97  <Method void IllegalStateException(String)>
	//   50  131:athrow          
		callback;
	//   51  132:astore_1        
		this;
	//   52  133:aload_0         
		JVM INSTR monitorexit ;
	//   53  134:monitorexit     
		throw callback;
	//   54  135:aload_1         
	//   55  136:athrow          
	//*  56  137:goto            56
	}

	public boolean isCanceled()
	{
		return state.get() == CallState.CANCELED;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field AtomicReference state>
	//    2    4:invokevirtual   #61  <Method Object AtomicReference.get()>
	//    3    7:getstatic       #90  <Field CallState CallState.CANCELED>
	//    4   10:if_acmpne       15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	private final AtomicReference state;
	private final Subscription subscription;
	private SubscriptionManagerCallback subscriptionCallback;
	private final SubscriptionManager subscriptionManager;


/*
	static void access$000(RealApolloSubscriptionCall realapollosubscriptioncall)
	{
		realapollosubscriptioncall.terminate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void terminate()>
		return;
	//    2    4:return          
	}

*/
}
