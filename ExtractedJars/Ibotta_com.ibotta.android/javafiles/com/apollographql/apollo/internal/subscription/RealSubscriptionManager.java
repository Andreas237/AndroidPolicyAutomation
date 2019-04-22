// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.subscription;

import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.internal.ResponseFieldMapperFactory;
import com.apollographql.apollo.response.OperationResponseParser;
import com.apollographql.apollo.response.ScalarTypeAdapters;
import com.apollographql.apollo.subscription.OperationServerMessage;
import com.apollographql.apollo.subscription.SubscriptionTransport;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.apollographql.apollo.internal.subscription:
//			SubscriptionManager, ApolloSubscriptionServerException, ApolloSubscriptionException

public final class RealSubscriptionManager
	implements SubscriptionManager
{
	static final class AutoReleaseTimer
	{

		void cancelTask(int i)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			TimerTask timertask = (TimerTask)tasks.remove(((Object) (Integer.valueOf(i))));
		//    2    2:aload_0         
		//    3    3:getfield        #23  <Field Map tasks>
		//    4    6:iload_1         
		//    5    7:invokestatic    #32  <Method Integer Integer.valueOf(int)>
		//    6   10:invokeinterface #38  <Method Object Map.remove(Object)>
		//    7   15:checkcast       #40  <Class TimerTask>
		//    8   18:astore_2        
			if(timertask == null)
				break MISSING_BLOCK_LABEL_28;
		//    9   19:aload_2         
		//   10   20:ifnull          28
			timertask.cancel();
		//   11   23:aload_2         
		//   12   24:invokevirtual   #44  <Method boolean TimerTask.cancel()>
		//   13   27:pop             
			if(tasks.isEmpty() && timer != null)
		//*  14   28:aload_0         
		//*  15   29:getfield        #23  <Field Map tasks>
		//*  16   32:invokeinterface #47  <Method boolean Map.isEmpty()>
		//*  17   37:ifeq            59
		//*  18   40:aload_0         
		//*  19   41:getfield        #49  <Field Timer timer>
		//*  20   44:ifnull          59
			{
				timer.cancel();
		//   21   47:aload_0         
		//   22   48:getfield        #49  <Field Timer timer>
		//   23   51:invokevirtual   #53  <Method void Timer.cancel()>
				timer = null;
		//   24   54:aload_0         
		//   25   55:aconst_null     
		//   26   56:putfield        #49  <Field Timer timer>
			}
			this;
		//   27   59:aload_0         
			JVM INSTR monitorexit ;
		//   28   60:monitorexit     
			return;
		//   29   61:return          
			Exception exception;
			exception;
		//   30   62:astore_2        
			this;
		//   31   63:aload_0         
			JVM INSTR monitorexit ;
		//   32   64:monitorexit     
			throw exception;
		//   33   65:aload_2         
		//   34   66:athrow          
		}

		void schedule(int i, final Runnable task, long l)
		{
			task = ((Runnable) (((_cls1) (i)). new TimerTask() {

				public void run()
				{
					task.run();
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field Runnable val$task>
				//    2    4:invokeinterface #35  <Method void Runnable.run()>
					cancelTask(taskId);
				//    3    9:aload_0         
				//    4   10:getfield        #22  <Field RealSubscriptionManager$AutoReleaseTimer this$0>
				//    5   13:aload_0         
				//    6   14:getfield        #26  <Field int val$taskId>
				//    7   17:invokevirtual   #39  <Method void RealSubscriptionManager$AutoReleaseTimer.cancelTask(int)>
					return;
				//    8   20:return          
					Exception exception;
					exception;
				//    9   21:astore_1        
					cancelTask(taskId);
				//   10   22:aload_0         
				//   11   23:getfield        #22  <Field RealSubscriptionManager$AutoReleaseTimer this$0>
				//   12   26:aload_0         
				//   13   27:getfield        #26  <Field int val$taskId>
				//   14   30:invokevirtual   #39  <Method void RealSubscriptionManager$AutoReleaseTimer.cancelTask(int)>
					throw exception;
				//   15   33:aload_1         
				//   16   34:athrow          
				}

				final AutoReleaseTimer this$0;
				final Runnable val$task;
				final int val$taskId;

			
			{
				this$0 = final_autoreleasetimer;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field RealSubscriptionManager$AutoReleaseTimer this$0>
				task = runnable;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Runnable val$task>
				taskId = I.this;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #26  <Field int val$taskId>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void TimerTask()>
			//   11   19:return          
			}
			}
));
		//    0    0:new             #9   <Class RealSubscriptionManager$AutoReleaseTimer$1>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_2         
		//    4    6:iload_1         
		//    5    7:invokespecial   #58  <Method void RealSubscriptionManager$AutoReleaseTimer$1(RealSubscriptionManager$AutoReleaseTimer, Runnable, int)>
		//    6   10:astore_2        
			this;
		//    7   11:aload_0         
			JVM INSTR monitorenter ;
		//    8   12:monitorenter    
			TimerTask timertask = (TimerTask)tasks.put(((Object) (Integer.valueOf(i))), ((Object) (task)));
		//    9   13:aload_0         
		//   10   14:getfield        #23  <Field Map tasks>
		//   11   17:iload_1         
		//   12   18:invokestatic    #32  <Method Integer Integer.valueOf(int)>
		//   13   21:aload_2         
		//   14   22:invokeinterface #62  <Method Object Map.put(Object, Object)>
		//   15   27:checkcast       #40  <Class TimerTask>
		//   16   30:astore          5
			if(timertask == null)
				break MISSING_BLOCK_LABEL_43;
		//   17   32:aload           5
		//   18   34:ifnull          43
			timertask.cancel();
		//   19   37:aload           5
		//   20   39:invokevirtual   #44  <Method boolean TimerTask.cancel()>
		//   21   42:pop             
			if(timer == null)
		//*  22   43:aload_0         
		//*  23   44:getfield        #49  <Field Timer timer>
		//*  24   47:ifnonnull       64
				timer = new Timer("Subscription SmartTimer", true);
		//   25   50:aload_0         
		//   26   51:new             #51  <Class Timer>
		//   27   54:dup             
		//   28   55:ldc1            #64  <String "Subscription SmartTimer">
		//   29   57:iconst_1        
		//   30   58:invokespecial   #67  <Method void Timer(String, boolean)>
		//   31   61:putfield        #49  <Field Timer timer>
			this;
		//   32   64:aload_0         
			JVM INSTR monitorexit ;
		//   33   65:monitorexit     
			timer.schedule(((TimerTask) (task)), l);
		//   34   66:aload_0         
		//   35   67:getfield        #49  <Field Timer timer>
		//   36   70:aload_2         
		//   37   71:lload_3         
		//   38   72:invokevirtual   #70  <Method void Timer.schedule(TimerTask, long)>
			return;
		//   39   75:return          
			task;
		//   40   76:astore_2        
			this;
		//   41   77:aload_0         
			JVM INSTR monitorexit ;
		//   42   78:monitorexit     
			throw task;
		//   43   79:aload_2         
		//   44   80:athrow          
		}

		final Map tasks = new LinkedHashMap();
		Timer timer;

		AutoReleaseTimer()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #20  <Class LinkedHashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #21  <Method void LinkedHashMap()>
		//    6   12:putfield        #23  <Field Map tasks>
		//    7   15:return          
		}
	}

	static final class State extends Enum
	{

		public static State valueOf(String s)
		{
			return (State)Enum.valueOf(com/apollographql/apollo/internal/subscription/RealSubscriptionManager$State, s);
		//    0    0:ldc1            #2   <Class RealSubscriptionManager$State>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class RealSubscriptionManager$State>
		//    4    9:areturn         
		}

		public static State[] values()
		{
			return (State[])((State []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field RealSubscriptionManager$State[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.apollographql.apollo.internal.subscription.RealSubscriptionManager$State_3B_.clone()>
		//    2    6:checkcast       #46  <Class RealSubscriptionManager$State[]>
		//    3    9:areturn         
		}

		private static final State $VALUES[];
		public static final State ACTIVE;
		public static final State CONNECTED;
		public static final State CONNECTING;
		public static final State DISCONNECTED;

		static 
		{
			DISCONNECTED = new State("DISCONNECTED", 0);
		//    0    0:new             #2   <Class RealSubscriptionManager$State>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "DISCONNECTED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void RealSubscriptionManager$State(String, int)>
		//    5   10:putstatic       #24  <Field RealSubscriptionManager$State DISCONNECTED>
			CONNECTING = new State("CONNECTING", 1);
		//    6   13:new             #2   <Class RealSubscriptionManager$State>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "CONNECTING">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void RealSubscriptionManager$State(String, int)>
		//   11   23:putstatic       #27  <Field RealSubscriptionManager$State CONNECTING>
			CONNECTED = new State("CONNECTED", 2);
		//   12   26:new             #2   <Class RealSubscriptionManager$State>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "CONNECTED">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void RealSubscriptionManager$State(String, int)>
		//   17   36:putstatic       #30  <Field RealSubscriptionManager$State CONNECTED>
			ACTIVE = new State("ACTIVE", 3);
		//   18   39:new             #2   <Class RealSubscriptionManager$State>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "ACTIVE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void RealSubscriptionManager$State(String, int)>
		//   23   49:putstatic       #33  <Field RealSubscriptionManager$State ACTIVE>
			$VALUES = (new State[] {
				DISCONNECTED, CONNECTING, CONNECTED, ACTIVE
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       State[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field RealSubscriptionManager$State DISCONNECTED>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field RealSubscriptionManager$State CONNECTING>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field RealSubscriptionManager$State CONNECTED>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field RealSubscriptionManager$State ACTIVE>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field RealSubscriptionManager$State[] $VALUES>
		//*  43   83:return          
		}

		private State(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	private static class SubscriptionRecord
	{

		void notifyOnCompleted()
		{
			callback.onCompleted();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field SubscriptionManager$Callback callback>
		//    2    4:invokeinterface #31  <Method void SubscriptionManager$Callback.onCompleted()>
		//    3    9:return          
		}

		void notifyOnError(ApolloSubscriptionException apollosubscriptionexception)
		{
			callback.onError(apollosubscriptionexception);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field SubscriptionManager$Callback callback>
		//    2    4:aload_1         
		//    3    5:invokeinterface #36  <Method void SubscriptionManager$Callback.onError(ApolloSubscriptionException)>
		//    4   10:return          
		}

		void notifyOnNetworkError(Throwable throwable)
		{
			callback.onNetworkError(throwable);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field SubscriptionManager$Callback callback>
		//    2    4:aload_1         
		//    3    5:invokeinterface #41  <Method void SubscriptionManager$Callback.onNetworkError(Throwable)>
		//    4   10:return          
		}

		void notifyOnResponse(Response response)
		{
			callback.onResponse(response);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field SubscriptionManager$Callback callback>
		//    2    4:aload_1         
		//    3    5:invokeinterface #46  <Method void SubscriptionManager$Callback.onResponse(Response)>
		//    4   10:return          
		}

		final SubscriptionManager.Callback callback;
		final Subscription subscription;

		SubscriptionRecord(Subscription subscription1, SubscriptionManager.Callback callback1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			subscription = subscription1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field Subscription subscription>
			callback = callback1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field SubscriptionManager$Callback callback>
		//    8   14:return          
		}
	}

	private static final class SubscriptionTransportCallback
		implements com.apollographql.apollo.subscription.SubscriptionTransport.Callback
	{

		public void onConnected()
		{
			dispatcher.execute(new Runnable() {

				public void run()
				{
					_flddelegate.onTransportConnected();
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field RealSubscriptionManager$SubscriptionTransportCallback this$0>
				//    2    4:invokestatic    #28  <Method RealSubscriptionManager RealSubscriptionManager$SubscriptionTransportCallback.access$000(RealSubscriptionManager$SubscriptionTransportCallback)>
				//    3    7:invokevirtual   #31  <Method void RealSubscriptionManager.onTransportConnected()>
				//    4   10:return          
				}

				final SubscriptionTransportCallback this$0;

			
			{
				this$0 = SubscriptionTransportCallback.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field RealSubscriptionManager$SubscriptionTransportCallback this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Executor dispatcher>
		//    2    4:new             #11  <Class RealSubscriptionManager$SubscriptionTransportCallback$1>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:invokespecial   #35  <Method void RealSubscriptionManager$SubscriptionTransportCallback$1(RealSubscriptionManager$SubscriptionTransportCallback)>
		//    6   12:invokeinterface #41  <Method void Executor.execute(Runnable)>
		//    7   17:return          
		}

		public void onFailure(Throwable throwable)
		{
			dispatcher.execute(((_cls2) (throwable)). new Runnable() {

				public void run()
				{
					_flddelegate.onTransportFailure(t);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field RealSubscriptionManager$SubscriptionTransportCallback this$0>
				//    2    4:invokestatic    #33  <Method RealSubscriptionManager RealSubscriptionManager$SubscriptionTransportCallback.access$000(RealSubscriptionManager$SubscriptionTransportCallback)>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field Throwable val$t>
				//    5   11:invokevirtual   #36  <Method void RealSubscriptionManager.onTransportFailure(Throwable)>
				//    6   14:return          
				}

				final SubscriptionTransportCallback this$0;
				final Throwable val$t;

			
			{
				this$0 = final_subscriptiontransportcallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field RealSubscriptionManager$SubscriptionTransportCallback this$0>
				t = Throwable.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Throwable val$t>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Executor dispatcher>
		//    2    4:new             #13  <Class RealSubscriptionManager$SubscriptionTransportCallback$2>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokespecial   #46  <Method void RealSubscriptionManager$SubscriptionTransportCallback$2(RealSubscriptionManager$SubscriptionTransportCallback, Throwable)>
		//    7   13:invokeinterface #41  <Method void Executor.execute(Runnable)>
		//    8   18:return          
		}

		public void onMessage(OperationServerMessage operationservermessage)
		{
			dispatcher.execute(((_cls3) (operationservermessage)). new Runnable() {

				public void run()
				{
					_flddelegate.onOperationServerMessage(message);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field RealSubscriptionManager$SubscriptionTransportCallback this$0>
				//    2    4:invokestatic    #33  <Method RealSubscriptionManager RealSubscriptionManager$SubscriptionTransportCallback.access$000(RealSubscriptionManager$SubscriptionTransportCallback)>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field OperationServerMessage val$message>
				//    5   11:invokevirtual   #36  <Method void RealSubscriptionManager.onOperationServerMessage(OperationServerMessage)>
				//    6   14:return          
				}

				final SubscriptionTransportCallback this$0;
				final OperationServerMessage val$message;

			
			{
				this$0 = final_subscriptiontransportcallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field RealSubscriptionManager$SubscriptionTransportCallback this$0>
				message = OperationServerMessage.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field OperationServerMessage val$message>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Executor dispatcher>
		//    2    4:new             #15  <Class RealSubscriptionManager$SubscriptionTransportCallback$3>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokespecial   #51  <Method void RealSubscriptionManager$SubscriptionTransportCallback$3(RealSubscriptionManager$SubscriptionTransportCallback, OperationServerMessage)>
		//    7   13:invokeinterface #41  <Method void Executor.execute(Runnable)>
		//    8   18:return          
		}

		private final RealSubscriptionManager _flddelegate;
		private final Executor dispatcher;


/*
		static RealSubscriptionManager access$000(SubscriptionTransportCallback subscriptiontransportcallback)
		{
			return subscriptiontransportcallback._flddelegate;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field RealSubscriptionManager _flddelegate>
		//    2    4:areturn         
		}

*/

		SubscriptionTransportCallback(RealSubscriptionManager realsubscriptionmanager, Executor executor)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			_flddelegate = realsubscriptionmanager;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #26  <Field RealSubscriptionManager _flddelegate>
			dispatcher = executor;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #28  <Field Executor dispatcher>
		//    8   14:return          
		}
	}


	public RealSubscriptionManager(ScalarTypeAdapters scalartypeadapters, com.apollographql.apollo.subscription.SubscriptionTransport.Factory factory, Executor executor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void Object()>
		subscriptions = ((Map) (new LinkedHashMap()));
	//    2    4:aload_0         
	//    3    5:new             #87  <Class LinkedHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #88  <Method void LinkedHashMap()>
	//    6   12:putfield        #90  <Field Map subscriptions>
		state = State.DISCONNECTED;
	//    7   15:aload_0         
	//    8   16:getstatic       #93  <Field RealSubscriptionManager$State RealSubscriptionManager$State.DISCONNECTED>
	//    9   19:putfield        #95  <Field RealSubscriptionManager$State state>
	//   10   22:aload_0         
	//   11   23:new             #20  <Class RealSubscriptionManager$AutoReleaseTimer>
	//   12   26:dup             
	//   13   27:invokespecial   #96  <Method void RealSubscriptionManager$AutoReleaseTimer()>
	//   14   30:putfield        #98  <Field RealSubscriptionManager$AutoReleaseTimer timer>
	//   15   33:aload_0         
	//   16   34:new             #100 <Class ResponseFieldMapperFactory>
	//   17   37:dup             
	//   18   38:invokespecial   #101 <Method void ResponseFieldMapperFactory()>
	//   19   41:putfield        #103 <Field ResponseFieldMapperFactory responseFieldMapperFactory>
	//   20   44:aload_0         
	//   21   45:new             #8   <Class RealSubscriptionManager$1>
	//   22   48:dup             
	//   23   49:aload_0         
	//   24   50:invokespecial   #106 <Method void RealSubscriptionManager$1(RealSubscriptionManager)>
	//   25   53:putfield        #108 <Field Runnable connectionAcknowledgeTimeoutTimerTask>
	//   26   56:aload_0         
	//   27   57:new             #10  <Class RealSubscriptionManager$2>
	//   28   60:dup             
	//   29   61:aload_0         
	//   30   62:invokespecial   #109 <Method void RealSubscriptionManager$2(RealSubscriptionManager)>
	//   31   65:putfield        #111 <Field Runnable inactivityTimeoutTimerTask>
		Utils.checkNotNull(((Object) (scalartypeadapters)), "scalarTypeAdapters == null");
	//   32   68:aload_1         
	//   33   69:ldc1            #113 <String "scalarTypeAdapters == null">
	//   34   71:invokestatic    #119 <Method Object Utils.checkNotNull(Object, Object)>
	//   35   74:pop             
		Utils.checkNotNull(((Object) (factory)), "transportFactory == null");
	//   36   75:aload_2         
	//   37   76:ldc1            #121 <String "transportFactory == null">
	//   38   78:invokestatic    #119 <Method Object Utils.checkNotNull(Object, Object)>
	//   39   81:pop             
		Utils.checkNotNull(((Object) (executor)), "dispatcher == null");
	//   40   82:aload_3         
	//   41   83:ldc1            #123 <String "dispatcher == null">
	//   42   85:invokestatic    #119 <Method Object Utils.checkNotNull(Object, Object)>
	//   43   88:pop             
		scalarTypeAdapters = (ScalarTypeAdapters)Utils.checkNotNull(((Object) (scalartypeadapters)), "scalarTypeAdapters == null");
	//   44   89:aload_0         
	//   45   90:aload_1         
	//   46   91:ldc1            #113 <String "scalarTypeAdapters == null">
	//   47   93:invokestatic    #119 <Method Object Utils.checkNotNull(Object, Object)>
	//   48   96:checkcast       #125 <Class ScalarTypeAdapters>
	//   49   99:putfield        #127 <Field ScalarTypeAdapters scalarTypeAdapters>
		transport = factory.create(((com.apollographql.apollo.subscription.SubscriptionTransport.Callback) (new SubscriptionTransportCallback(this, executor))));
	//   50  102:aload_0         
	//   51  103:aload_2         
	//   52  104:new             #31  <Class RealSubscriptionManager$SubscriptionTransportCallback>
	//   53  107:dup             
	//   54  108:aload_0         
	//   55  109:aload_3         
	//   56  110:invokespecial   #130 <Method void RealSubscriptionManager$SubscriptionTransportCallback(RealSubscriptionManager, Executor)>
	//   57  113:invokeinterface #136 <Method SubscriptionTransport com.apollographql.apollo.subscription.SubscriptionTransport$Factory.create(com.apollographql.apollo.subscription.SubscriptionTransport$Callback)>
	//   58  118:putfield        #138 <Field SubscriptionTransport transport>
		dispatcher = executor;
	//   59  121:aload_0         
	//   60  122:aload_3         
	//   61  123:putfield        #140 <Field Executor dispatcher>
	//   62  126:return          
	}

	static String idForSubscription(Subscription subscription)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #145 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #146 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(subscription.operationId());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokeinterface #152 <Method String Subscription.operationId()>
	//    7   15:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append("$");
	//    9   19:aload_1         
	//   10   20:ldc1            #158 <String "$">
	//   11   22:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		stringbuilder.append(subscription.variables().valueMap().hashCode());
	//   13   26:aload_1         
	//   14   27:aload_0         
	//   15   28:invokeinterface #162 <Method com.apollographql.apollo.api.Operation$Variables Subscription.variables()>
	//   16   33:invokevirtual   #168 <Method Map com.apollographql.apollo.api.Operation$Variables.valueMap()>
	//   17   36:invokeinterface #174 <Method int Map.hashCode()>
	//   18   41:invokevirtual   #177 <Method StringBuilder StringBuilder.append(int)>
	//   19   44:pop             
		return stringbuilder.toString();
	//   20   45:aload_1         
	//   21   46:invokevirtual   #180 <Method String StringBuilder.toString()>
	//   22   49:areturn         
	}

	private void onCompleteServerMessage(com.apollographql.apollo.subscription.OperationServerMessage.Complete complete)
	{
		if(complete.id != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #190 <Field String com.apollographql.apollo.subscription.OperationServerMessage$Complete.id>
	//*   2    4:ifnull          15
			complete = ((com.apollographql.apollo.subscription.OperationServerMessage.Complete) (complete.id));
	//    3    7:aload_1         
	//    4    8:getfield        #190 <Field String com.apollographql.apollo.subscription.OperationServerMessage$Complete.id>
	//    5   11:astore_1        
		else
	//*   6   12:goto            18
			complete = "";
	//    7   15:ldc1            #192 <String "">
	//    8   17:astore_1        
		complete = ((com.apollographql.apollo.subscription.OperationServerMessage.Complete) (removeSubscriptionById(((String) (complete)))));
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:invokespecial   #196 <Method RealSubscriptionManager$SubscriptionRecord removeSubscriptionById(String)>
	//   12   23:astore_1        
		if(complete != null)
	//*  13   24:aload_1         
	//*  14   25:ifnull          32
			((SubscriptionRecord) (complete)).notifyOnCompleted();
	//   15   28:aload_1         
	//   16   29:invokevirtual   #199 <Method void RealSubscriptionManager$SubscriptionRecord.notifyOnCompleted()>
	//   17   32:return          
	}

	private void onConnectionAcknowledgeServerMessage()
	{
		timer.cancelTask(1);
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field RealSubscriptionManager$AutoReleaseTimer timer>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #204 <Method void RealSubscriptionManager$AutoReleaseTimer.cancelTask(int)>
		this;
	//    4    8:aload_0         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		state = State.ACTIVE;
	//    6   10:aload_0         
	//    7   11:getstatic       #207 <Field RealSubscriptionManager$State RealSubscriptionManager$State.ACTIVE>
	//    8   14:putfield        #95  <Field RealSubscriptionManager$State state>
		String s;
		Object obj;
		for(Iterator iterator = subscriptions.entrySet().iterator(); iterator.hasNext(); transport.send(((com.apollographql.apollo.subscription.OperationClientMessage) (new com.apollographql.apollo.subscription.OperationClientMessage.Start(s, ((Subscription) (obj)), scalarTypeAdapters)))))
	//*   9   17:aload_0         
	//*  10   18:getfield        #90  <Field Map subscriptions>
	//*  11   21:invokeinterface #211 <Method Set Map.entrySet()>
	//*  12   26:invokeinterface #217 <Method Iterator Set.iterator()>
	//*  13   31:astore_1        
	//*  14   32:aload_1         
	//*  15   33:invokeinterface #223 <Method boolean Iterator.hasNext()>
	//*  16   38:ifeq            99
		{
			obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   17   41:aload_1         
	//   18   42:invokeinterface #227 <Method Object Iterator.next()>
	//   19   47:checkcast       #229 <Class java.util.Map$Entry>
	//   20   50:astore_3        
			s = (String)((java.util.Map.Entry) (obj)).getKey();
	//   21   51:aload_3         
	//   22   52:invokeinterface #232 <Method Object java.util.Map$Entry.getKey()>
	//   23   57:checkcast       #234 <Class String>
	//   24   60:astore_2        
			obj = ((Object) (((SubscriptionRecord)((java.util.Map.Entry) (obj)).getValue()).subscription));
	//   25   61:aload_3         
	//   26   62:invokeinterface #237 <Method Object java.util.Map$Entry.getValue()>
	//   27   67:checkcast       #28  <Class RealSubscriptionManager$SubscriptionRecord>
	//   28   70:getfield        #241 <Field Subscription RealSubscriptionManager$SubscriptionRecord.subscription>
	//   29   73:astore_3        
		}

	//   30   74:aload_0         
	//   31   75:getfield        #138 <Field SubscriptionTransport transport>
	//   32   78:new             #243 <Class com.apollographql.apollo.subscription.OperationClientMessage$Start>
	//   33   81:dup             
	//   34   82:aload_2         
	//   35   83:aload_3         
	//   36   84:aload_0         
	//   37   85:getfield        #127 <Field ScalarTypeAdapters scalarTypeAdapters>
	//   38   88:invokespecial   #246 <Method void com.apollographql.apollo.subscription.OperationClientMessage$Start(String, Subscription, ScalarTypeAdapters)>
	//   39   91:invokeinterface #252 <Method void SubscriptionTransport.send(com.apollographql.apollo.subscription.OperationClientMessage)>
	//*  40   96:goto            32
		this;
	//   41   99:aload_0         
		JVM INSTR monitorexit ;
	//   42  100:monitorexit     
		return;
	//   43  101:return          
		Exception exception;
		exception;
	//   44  102:astore_1        
		this;
	//   45  103:aload_0         
		JVM INSTR monitorexit ;
	//   46  104:monitorexit     
		throw exception;
	//   47  105:aload_1         
	//   48  106:athrow          
	}

	private void onErrorServerMessage(com.apollographql.apollo.subscription.OperationServerMessage.Error error)
	{
		Object obj;
		if(error.id != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #257 <Field String com.apollographql.apollo.subscription.OperationServerMessage$Error.id>
	//*   2    4:ifnull          15
			obj = ((Object) (error.id));
	//    3    7:aload_1         
	//    4    8:getfield        #257 <Field String com.apollographql.apollo.subscription.OperationServerMessage$Error.id>
	//    5   11:astore_2        
		else
	//*   6   12:goto            18
			obj = "";
	//    7   15:ldc1            #192 <String "">
	//    8   17:astore_2        
		obj = ((Object) (removeSubscriptionById(((String) (obj)))));
	//    9   18:aload_0         
	//   10   19:aload_2         
	//   11   20:invokespecial   #196 <Method RealSubscriptionManager$SubscriptionRecord removeSubscriptionById(String)>
	//   12   23:astore_2        
		if(obj != null)
	//*  13   24:aload_2         
	//*  14   25:ifnull          43
			((SubscriptionRecord) (obj)).notifyOnError(((ApolloSubscriptionException) (new ApolloSubscriptionServerException(error.payload))));
	//   15   28:aload_2         
	//   16   29:new             #259 <Class ApolloSubscriptionServerException>
	//   17   32:dup             
	//   18   33:aload_1         
	//   19   34:getfield        #262 <Field Map com.apollographql.apollo.subscription.OperationServerMessage$Error.payload>
	//   20   37:invokespecial   #265 <Method void ApolloSubscriptionServerException(Map)>
	//   21   40:invokevirtual   #269 <Method void RealSubscriptionManager$SubscriptionRecord.notifyOnError(ApolloSubscriptionException)>
	//   22   43:return          
	}

	private void onOperationDataServerMessage(com.apollographql.apollo.subscription.OperationServerMessage.Data data)
	{
		Object obj;
		if(data.id != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #276 <Field String com.apollographql.apollo.subscription.OperationServerMessage$Data.id>
	//*   2    4:ifnull          15
			obj = ((Object) (data.id));
	//    3    7:aload_1         
	//    4    8:getfield        #276 <Field String com.apollographql.apollo.subscription.OperationServerMessage$Data.id>
	//    5   11:astore_2        
		else
	//*   6   12:goto            18
			obj = "";
	//    7   15:ldc1            #192 <String "">
	//    8   17:astore_2        
		this;
	//    9   18:aload_0         
		JVM INSTR monitorenter ;
	//   10   19:monitorenter    
		SubscriptionRecord subscriptionrecord = (SubscriptionRecord)subscriptions.get(obj);
	//   11   20:aload_0         
	//   12   21:getfield        #90  <Field Map subscriptions>
	//   13   24:aload_2         
	//   14   25:invokeinterface #280 <Method Object Map.get(Object)>
	//   15   30:checkcast       #28  <Class RealSubscriptionManager$SubscriptionRecord>
	//   16   33:astore_3        
		this;
	//   17   34:aload_0         
		JVM INSTR monitorexit ;
	//   18   35:monitorexit     
		if(subscriptionrecord != null)
	//*  19   36:aload_3         
	//*  20   37:ifnull          115
		{
			Object obj1 = ((Object) (responseFieldMapperFactory.create(((com.apollographql.apollo.api.Operation) (subscriptionrecord.subscription)))));
	//   21   40:aload_0         
	//   22   41:getfield        #103 <Field ResponseFieldMapperFactory responseFieldMapperFactory>
	//   23   44:aload_3         
	//   24   45:getfield        #241 <Field Subscription RealSubscriptionManager$SubscriptionRecord.subscription>
	//   25   48:invokevirtual   #283 <Method com.apollographql.apollo.api.ResponseFieldMapper ResponseFieldMapperFactory.create(com.apollographql.apollo.api.Operation)>
	//   26   51:astore          4
			obj1 = ((Object) (new OperationResponseParser(((com.apollographql.apollo.api.Operation) (subscriptionrecord.subscription)), ((com.apollographql.apollo.api.ResponseFieldMapper) (obj1)), scalarTypeAdapters)));
	//   27   53:new             #285 <Class OperationResponseParser>
	//   28   56:dup             
	//   29   57:aload_3         
	//   30   58:getfield        #241 <Field Subscription RealSubscriptionManager$SubscriptionRecord.subscription>
	//   31   61:aload           4
	//   32   63:aload_0         
	//   33   64:getfield        #127 <Field ScalarTypeAdapters scalarTypeAdapters>
	//   34   67:invokespecial   #288 <Method void OperationResponseParser(com.apollographql.apollo.api.Operation, com.apollographql.apollo.api.ResponseFieldMapper, ScalarTypeAdapters)>
	//   35   70:astore          4
			try
			{
				data = ((com.apollographql.apollo.subscription.OperationServerMessage.Data) (((OperationResponseParser) (obj1)).parse(data.payload)));
	//   36   72:aload           4
	//   37   74:aload_1         
	//   38   75:getfield        #289 <Field Map com.apollographql.apollo.subscription.OperationServerMessage$Data.payload>
	//   39   78:invokevirtual   #293 <Method Response OperationResponseParser.parse(Map)>
	//   40   81:astore_1        
			}
	//*  41   82:aload_3         
	//*  42   83:aload_1         
	//*  43   84:invokevirtual   #297 <Method void RealSubscriptionManager$SubscriptionRecord.notifyOnResponse(Response)>
	//*  44   87:return          
			// Misplaced declaration of an exception variable
			catch(com.apollographql.apollo.subscription.OperationServerMessage.Data data)
	//*  45   88:astore_1        
			{
				obj = ((Object) (removeSubscriptionById(((String) (obj)))));
	//   46   89:aload_0         
	//   47   90:aload_2         
	//   48   91:invokespecial   #196 <Method RealSubscriptionManager$SubscriptionRecord removeSubscriptionById(String)>
	//   49   94:astore_2        
				if(obj != null)
	//*  50   95:aload_2         
	//*  51   96:ifnull          114
					((SubscriptionRecord) (obj)).notifyOnError(new ApolloSubscriptionException("Failed to parse server message", ((Throwable) (data))));
	//   52   99:aload_2         
	//   53  100:new             #299 <Class ApolloSubscriptionException>
	//   54  103:dup             
	//   55  104:ldc2            #301 <String "Failed to parse server message">
	//   56  107:aload_1         
	//   57  108:invokespecial   #304 <Method void ApolloSubscriptionException(String, Throwable)>
	//   58  111:invokevirtual   #269 <Method void RealSubscriptionManager$SubscriptionRecord.notifyOnError(ApolloSubscriptionException)>
				return;
	//   59  114:return          
			}
			subscriptionrecord.notifyOnResponse(((Response) (data)));
			return;
		} else
		{
			return;
	//   60  115:return          
		}
		data;
	//   61  116:astore_1        
		this;
	//   62  117:aload_0         
		JVM INSTR monitorexit ;
	//   63  118:monitorexit     
		throw data;
	//   64  119:aload_1         
	//   65  120:athrow          
	}

	private SubscriptionRecord removeSubscriptionById(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		s = ((String) ((SubscriptionRecord)subscriptions.remove(((Object) (s)))));
	//    2    2:aload_0         
	//    3    3:getfield        #90  <Field Map subscriptions>
	//    4    6:aload_1         
	//    5    7:invokeinterface #307 <Method Object Map.remove(Object)>
	//    6   12:checkcast       #28  <Class RealSubscriptionManager$SubscriptionRecord>
	//    7   15:astore_1        
		if(subscriptions.isEmpty())
	//*   8   16:aload_0         
	//*   9   17:getfield        #90  <Field Map subscriptions>
	//*  10   20:invokeinterface #310 <Method boolean Map.isEmpty()>
	//*  11   25:ifeq            32
			startInactivityTimer();
	//   12   28:aload_0         
	//   13   29:invokespecial   #313 <Method void startInactivityTimer()>
		this;
	//   14   32:aload_0         
		JVM INSTR monitorexit ;
	//   15   33:monitorexit     
		return ((SubscriptionRecord) (s));
	//   16   34:aload_1         
	//   17   35:areturn         
		s;
	//   18   36:astore_1        
		this;
	//   19   37:aload_0         
		JVM INSTR monitorexit ;
	//   20   38:monitorexit     
		throw s;
	//   21   39:aload_1         
	//   22   40:athrow          
	}

	private void startInactivityTimer()
	{
		timer.schedule(2, inactivityTimeoutTimerTask, INACTIVITY_TIMEOUT);
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field RealSubscriptionManager$AutoReleaseTimer timer>
	//    2    4:iconst_2        
	//    3    5:aload_0         
	//    4    6:getfield        #111 <Field Runnable inactivityTimeoutTimerTask>
	//    5    9:getstatic       #79  <Field long INACTIVITY_TIMEOUT>
	//    6   12:invokevirtual   #317 <Method void RealSubscriptionManager$AutoReleaseTimer.schedule(int, Runnable, long)>
	//    7   15:return          
	}

	void disconnect(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(flag)
			break MISSING_BLOCK_LABEL_18;
	//    2    2:iload_1         
	//    3    3:ifne            18
		if(!subscriptions.isEmpty())
			break MISSING_BLOCK_LABEL_52;
	//    4    6:aload_0         
	//    5    7:getfield        #90  <Field Map subscriptions>
	//    6   10:invokeinterface #310 <Method boolean Map.isEmpty()>
	//    7   15:ifeq            52
		transport.disconnect(((com.apollographql.apollo.subscription.OperationClientMessage) (new com.apollographql.apollo.subscription.OperationClientMessage.Terminate())));
	//    8   18:aload_0         
	//    9   19:getfield        #138 <Field SubscriptionTransport transport>
	//   10   22:new             #321 <Class com.apollographql.apollo.subscription.OperationClientMessage$Terminate>
	//   11   25:dup             
	//   12   26:invokespecial   #322 <Method void com.apollographql.apollo.subscription.OperationClientMessage$Terminate()>
	//   13   29:invokeinterface #324 <Method void SubscriptionTransport.disconnect(com.apollographql.apollo.subscription.OperationClientMessage)>
		state = State.DISCONNECTED;
	//   14   34:aload_0         
	//   15   35:getstatic       #93  <Field RealSubscriptionManager$State RealSubscriptionManager$State.DISCONNECTED>
	//   16   38:putfield        #95  <Field RealSubscriptionManager$State state>
		subscriptions = ((Map) (new LinkedHashMap()));
	//   17   41:aload_0         
	//   18   42:new             #87  <Class LinkedHashMap>
	//   19   45:dup             
	//   20   46:invokespecial   #88  <Method void LinkedHashMap()>
	//   21   49:putfield        #90  <Field Map subscriptions>
		this;
	//   22   52:aload_0         
		JVM INSTR monitorexit ;
	//   23   53:monitorexit     
		return;
	//   24   54:return          
		Exception exception;
		exception;
	//   25   55:astore_2        
		this;
	//   26   56:aload_0         
		JVM INSTR monitorexit ;
	//   27   57:monitorexit     
		throw exception;
	//   28   58:aload_2         
	//   29   59:athrow          
	}

	void doSubscribe(Subscription subscription, SubscriptionManager.Callback callback)
	{
		timer.cancelTask(2);
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field RealSubscriptionManager$AutoReleaseTimer timer>
	//    2    4:iconst_2        
	//    3    5:invokevirtual   #204 <Method void RealSubscriptionManager$AutoReleaseTimer.cancelTask(int)>
		String s = idForSubscription(subscription);
	//    4    8:aload_1         
	//    5    9:invokestatic    #328 <Method String idForSubscription(Subscription)>
	//    6   12:astore_3        
		this;
	//    7   13:aload_0         
		JVM INSTR monitorenter ;
	//    8   14:monitorenter    
		if(!subscriptions.containsKey(((Object) (s))))
			break MISSING_BLOCK_LABEL_47;
	//    9   15:aload_0         
	//   10   16:getfield        #90  <Field Map subscriptions>
	//   11   19:aload_3         
	//   12   20:invokeinterface #332 <Method boolean Map.containsKey(Object)>
	//   13   25:ifeq            47
		callback.onError(new ApolloSubscriptionException("Already subscribed"));
	//   14   28:aload_2         
	//   15   29:new             #299 <Class ApolloSubscriptionException>
	//   16   32:dup             
	//   17   33:ldc2            #334 <String "Already subscribed">
	//   18   36:invokespecial   #337 <Method void ApolloSubscriptionException(String)>
	//   19   39:invokeinterface #342 <Method void SubscriptionManager$Callback.onError(ApolloSubscriptionException)>
		this;
	//   20   44:aload_0         
		JVM INSTR monitorexit ;
	//   21   45:monitorexit     
		return;
	//   22   46:return          
		subscriptions.put(((Object) (s)), ((Object) (new SubscriptionRecord(subscription, callback))));
	//   23   47:aload_0         
	//   24   48:getfield        #90  <Field Map subscriptions>
	//   25   51:aload_3         
	//   26   52:new             #28  <Class RealSubscriptionManager$SubscriptionRecord>
	//   27   55:dup             
	//   28   56:aload_1         
	//   29   57:aload_2         
	//   30   58:invokespecial   #344 <Method void RealSubscriptionManager$SubscriptionRecord(Subscription, SubscriptionManager$Callback)>
	//   31   61:invokeinterface #347 <Method Object Map.put(Object, Object)>
	//   32   66:pop             
		if(state == State.DISCONNECTED)
	//*  33   67:aload_0         
	//*  34   68:getfield        #95  <Field RealSubscriptionManager$State state>
	//*  35   71:getstatic       #93  <Field RealSubscriptionManager$State RealSubscriptionManager$State.DISCONNECTED>
	//*  36   74:if_acmpne       96
		{
			state = State.CONNECTING;
	//   37   77:aload_0         
	//   38   78:getstatic       #350 <Field RealSubscriptionManager$State RealSubscriptionManager$State.CONNECTING>
	//   39   81:putfield        #95  <Field RealSubscriptionManager$State state>
			transport.connect();
	//   40   84:aload_0         
	//   41   85:getfield        #138 <Field SubscriptionTransport transport>
	//   42   88:invokeinterface #353 <Method void SubscriptionTransport.connect()>
			break MISSING_BLOCK_LABEL_128;
	//   43   93:goto            128
		}
		if(state == State.ACTIVE)
	//*  44   96:aload_0         
	//*  45   97:getfield        #95  <Field RealSubscriptionManager$State state>
	//*  46  100:getstatic       #207 <Field RealSubscriptionManager$State RealSubscriptionManager$State.ACTIVE>
	//*  47  103:if_acmpne       128
			transport.send(((com.apollographql.apollo.subscription.OperationClientMessage) (new com.apollographql.apollo.subscription.OperationClientMessage.Start(s, subscription, scalarTypeAdapters))));
	//   48  106:aload_0         
	//   49  107:getfield        #138 <Field SubscriptionTransport transport>
	//   50  110:new             #243 <Class com.apollographql.apollo.subscription.OperationClientMessage$Start>
	//   51  113:dup             
	//   52  114:aload_3         
	//   53  115:aload_1         
	//   54  116:aload_0         
	//   55  117:getfield        #127 <Field ScalarTypeAdapters scalarTypeAdapters>
	//   56  120:invokespecial   #246 <Method void com.apollographql.apollo.subscription.OperationClientMessage$Start(String, Subscription, ScalarTypeAdapters)>
	//   57  123:invokeinterface #252 <Method void SubscriptionTransport.send(com.apollographql.apollo.subscription.OperationClientMessage)>
		this;
	//   58  128:aload_0         
		JVM INSTR monitorexit ;
	//   59  129:monitorexit     
		return;
	//   60  130:return          
		subscription;
	//   61  131:astore_1        
		this;
	//   62  132:aload_0         
		JVM INSTR monitorexit ;
	//   63  133:monitorexit     
		throw subscription;
	//   64  134:aload_1         
	//   65  135:athrow          
	}

	void doUnsubscribe(Subscription subscription)
	{
		subscription = ((Subscription) (idForSubscription(subscription)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #328 <Method String idForSubscription(Subscription)>
	//    2    4:astore_1        
		this;
	//    3    5:aload_0         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if((SubscriptionRecord)subscriptions.remove(((Object) (subscription))) != null && state == State.ACTIVE)
	//*   5    7:aload_0         
	//*   6    8:getfield        #90  <Field Map subscriptions>
	//*   7   11:aload_1         
	//*   8   12:invokeinterface #307 <Method Object Map.remove(Object)>
	//*   9   17:checkcast       #28  <Class RealSubscriptionManager$SubscriptionRecord>
	//*  10   20:ifnull          50
	//*  11   23:aload_0         
	//*  12   24:getfield        #95  <Field RealSubscriptionManager$State state>
	//*  13   27:getstatic       #207 <Field RealSubscriptionManager$State RealSubscriptionManager$State.ACTIVE>
	//*  14   30:if_acmpne       50
			transport.send(((com.apollographql.apollo.subscription.OperationClientMessage) (new com.apollographql.apollo.subscription.OperationClientMessage.Stop(((String) (subscription))))));
	//   15   33:aload_0         
	//   16   34:getfield        #138 <Field SubscriptionTransport transport>
	//   17   37:new             #357 <Class com.apollographql.apollo.subscription.OperationClientMessage$Stop>
	//   18   40:dup             
	//   19   41:aload_1         
	//   20   42:invokespecial   #358 <Method void com.apollographql.apollo.subscription.OperationClientMessage$Stop(String)>
	//   21   45:invokeinterface #252 <Method void SubscriptionTransport.send(com.apollographql.apollo.subscription.OperationClientMessage)>
		if(subscriptions.isEmpty())
	//*  22   50:aload_0         
	//*  23   51:getfield        #90  <Field Map subscriptions>
	//*  24   54:invokeinterface #310 <Method boolean Map.isEmpty()>
	//*  25   59:ifeq            66
			startInactivityTimer();
	//   26   62:aload_0         
	//   27   63:invokespecial   #313 <Method void startInactivityTimer()>
		this;
	//   28   66:aload_0         
		JVM INSTR monitorexit ;
	//   29   67:monitorexit     
		return;
	//   30   68:return          
		subscription;
	//   31   69:astore_1        
		this;
	//   32   70:aload_0         
		JVM INSTR monitorexit ;
	//   33   71:monitorexit     
		throw subscription;
	//   34   72:aload_1         
	//   35   73:athrow          
	}

	void onConnectionAcknowledgeTimeout()
	{
		timer.cancelTask(1);
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field RealSubscriptionManager$AutoReleaseTimer timer>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #204 <Method void RealSubscriptionManager$AutoReleaseTimer.cancelTask(int)>
		dispatcher.execute(new Runnable() {

			public void run()
			{
				onTransportFailure(((Throwable) (new ApolloNetworkException("Subscription server is not responding"))));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RealSubscriptionManager this$0>
			//    2    4:new             #23  <Class ApolloNetworkException>
			//    3    7:dup             
			//    4    8:ldc1            #25  <String "Subscription server is not responding">
			//    5   10:invokespecial   #28  <Method void ApolloNetworkException(String)>
			//    6   13:invokevirtual   #32  <Method void RealSubscriptionManager.onTransportFailure(Throwable)>
			//    7   16:return          
			}

			final RealSubscriptionManager this$0;

			
			{
				this$0 = RealSubscriptionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RealSubscriptionManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    4    8:aload_0         
	//    5    9:getfield        #140 <Field Executor dispatcher>
	//    6   12:new             #16  <Class RealSubscriptionManager$5>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #360 <Method void RealSubscriptionManager$5(RealSubscriptionManager)>
	//   10   20:invokeinterface #366 <Method void Executor.execute(Runnable)>
	//   11   25:return          
	}

	void onInactivityTimeout()
	{
		timer.cancelTask(2);
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field RealSubscriptionManager$AutoReleaseTimer timer>
	//    2    4:iconst_2        
	//    3    5:invokevirtual   #204 <Method void RealSubscriptionManager$AutoReleaseTimer.cancelTask(int)>
		dispatcher.execute(new Runnable() {

			public void run()
			{
				disconnect(false);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RealSubscriptionManager this$0>
			//    2    4:iconst_0        
			//    3    5:invokevirtual   #25  <Method void RealSubscriptionManager.disconnect(boolean)>
			//    4    8:return          
			}

			final RealSubscriptionManager this$0;

			
			{
				this$0 = RealSubscriptionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RealSubscriptionManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    4    8:aload_0         
	//    5    9:getfield        #140 <Field Executor dispatcher>
	//    6   12:new             #18  <Class RealSubscriptionManager$6>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #368 <Method void RealSubscriptionManager$6(RealSubscriptionManager)>
	//   10   20:invokeinterface #366 <Method void Executor.execute(Runnable)>
	//   11   25:return          
	}

	void onOperationServerMessage(OperationServerMessage operationservermessage)
	{
		if(operationservermessage instanceof com.apollographql.apollo.subscription.OperationServerMessage.ConnectionAcknowledge)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #372 <Class com.apollographql.apollo.subscription.OperationServerMessage$ConnectionAcknowledge>
	//*   2    4:ifeq            12
		{
			onConnectionAcknowledgeServerMessage();
	//    3    7:aload_0         
	//    4    8:invokespecial   #374 <Method void onConnectionAcknowledgeServerMessage()>
			return;
	//    5   11:return          
		}
		if(operationservermessage instanceof com.apollographql.apollo.subscription.OperationServerMessage.Data)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #275 <Class com.apollographql.apollo.subscription.OperationServerMessage$Data>
	//*   8   16:ifeq            28
		{
			onOperationDataServerMessage((com.apollographql.apollo.subscription.OperationServerMessage.Data)operationservermessage);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:checkcast       #275 <Class com.apollographql.apollo.subscription.OperationServerMessage$Data>
	//   12   24:invokespecial   #376 <Method void onOperationDataServerMessage(com.apollographql.apollo.subscription.OperationServerMessage$Data)>
			return;
	//   13   27:return          
		}
		if(operationservermessage instanceof com.apollographql.apollo.subscription.OperationServerMessage.Error)
	//*  14   28:aload_1         
	//*  15   29:instanceof      #256 <Class com.apollographql.apollo.subscription.OperationServerMessage$Error>
	//*  16   32:ifeq            44
		{
			onErrorServerMessage((com.apollographql.apollo.subscription.OperationServerMessage.Error)operationservermessage);
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:checkcast       #256 <Class com.apollographql.apollo.subscription.OperationServerMessage$Error>
	//   20   40:invokespecial   #378 <Method void onErrorServerMessage(com.apollographql.apollo.subscription.OperationServerMessage$Error)>
			return;
	//   21   43:return          
		}
		if(operationservermessage instanceof com.apollographql.apollo.subscription.OperationServerMessage.Complete)
	//*  22   44:aload_1         
	//*  23   45:instanceof      #186 <Class com.apollographql.apollo.subscription.OperationServerMessage$Complete>
	//*  24   48:ifeq            60
		{
			onCompleteServerMessage((com.apollographql.apollo.subscription.OperationServerMessage.Complete)operationservermessage);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:checkcast       #186 <Class com.apollographql.apollo.subscription.OperationServerMessage$Complete>
	//   28   56:invokespecial   #380 <Method void onCompleteServerMessage(com.apollographql.apollo.subscription.OperationServerMessage$Complete)>
			return;
	//   29   59:return          
		}
		if(operationservermessage instanceof com.apollographql.apollo.subscription.OperationServerMessage.ConnectionError)
	//*  30   60:aload_1         
	//*  31   61:instanceof      #382 <Class com.apollographql.apollo.subscription.OperationServerMessage$ConnectionError>
	//*  32   64:ifeq            72
			disconnect(true);
	//   33   67:aload_0         
	//   34   68:iconst_1        
	//   35   69:invokevirtual   #384 <Method void disconnect(boolean)>
	//   36   72:return          
	}

	void onTransportConnected()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		state = State.CONNECTED;
	//    2    2:aload_0         
	//    3    3:getstatic       #388 <Field RealSubscriptionManager$State RealSubscriptionManager$State.CONNECTED>
	//    4    6:putfield        #95  <Field RealSubscriptionManager$State state>
		transport.send(((com.apollographql.apollo.subscription.OperationClientMessage) (new com.apollographql.apollo.subscription.OperationClientMessage.Init())));
	//    5    9:aload_0         
	//    6   10:getfield        #138 <Field SubscriptionTransport transport>
	//    7   13:new             #390 <Class com.apollographql.apollo.subscription.OperationClientMessage$Init>
	//    8   16:dup             
	//    9   17:invokespecial   #391 <Method void com.apollographql.apollo.subscription.OperationClientMessage$Init()>
	//   10   20:invokeinterface #252 <Method void SubscriptionTransport.send(com.apollographql.apollo.subscription.OperationClientMessage)>
		this;
	//   11   25:aload_0         
		JVM INSTR monitorexit ;
	//   12   26:monitorexit     
		timer.schedule(1, connectionAcknowledgeTimeoutTimerTask, CONNECTION_ACKNOWLEDGE_TIMEOUT);
	//   13   27:aload_0         
	//   14   28:getfield        #98  <Field RealSubscriptionManager$AutoReleaseTimer timer>
	//   15   31:iconst_1        
	//   16   32:aload_0         
	//   17   33:getfield        #108 <Field Runnable connectionAcknowledgeTimeoutTimerTask>
	//   18   36:getstatic       #75  <Field long CONNECTION_ACKNOWLEDGE_TIMEOUT>
	//   19   39:invokevirtual   #317 <Method void RealSubscriptionManager$AutoReleaseTimer.schedule(int, Runnable, long)>
		return;
	//   20   42:return          
		Exception exception;
		exception;
	//   21   43:astore_1        
		this;
	//   22   44:aload_0         
		JVM INSTR monitorexit ;
	//   23   45:monitorexit     
		throw exception;
	//   24   46:aload_1         
	//   25   47:athrow          
	}

	void onTransportFailure(Throwable throwable)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj;
		obj = ((Object) (subscriptions));
	//    2    2:aload_0         
	//    3    3:getfield        #90  <Field Map subscriptions>
	//    4    6:astore_2        
		disconnect(true);
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:invokevirtual   #384 <Method void disconnect(boolean)>
		this;
	//    8   12:aload_0         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		for(obj = ((Object) (((Map) (obj)).values().iterator())); ((Iterator) (obj)).hasNext(); ((SubscriptionRecord)((Iterator) (obj)).next()).notifyOnNetworkError(throwable));
	//   10   14:aload_2         
	//   11   15:invokeinterface #397 <Method Collection Map.values()>
	//   12   20:invokeinterface #400 <Method Iterator Collection.iterator()>
	//   13   25:astore_2        
	//   14   26:aload_2         
	//   15   27:invokeinterface #223 <Method boolean Iterator.hasNext()>
	//   16   32:ifeq            51
	//   17   35:aload_2         
	//   18   36:invokeinterface #227 <Method Object Iterator.next()>
	//   19   41:checkcast       #28  <Class RealSubscriptionManager$SubscriptionRecord>
	//   20   44:aload_1         
	//   21   45:invokevirtual   #403 <Method void RealSubscriptionManager$SubscriptionRecord.notifyOnNetworkError(Throwable)>
	//*  22   48:goto            26
		return;
	//   23   51:return          
		throwable;
	//   24   52:astore_1        
		this;
	//   25   53:aload_0         
		JVM INSTR monitorexit ;
	//   26   54:monitorexit     
		throw throwable;
	//   27   55:aload_1         
	//   28   56:athrow          
	}

	public void subscribe(final Subscription subscription, final SubscriptionManager.Callback callback)
	{
		Utils.checkNotNull(((Object) (subscription)), "subscription == null");
	//    0    0:aload_1         
	//    1    1:ldc2            #406 <String "subscription == null">
	//    2    4:invokestatic    #119 <Method Object Utils.checkNotNull(Object, Object)>
	//    3    7:pop             
		Utils.checkNotNull(((Object) (callback)), "callback == null");
	//    4    8:aload_2         
	//    5    9:ldc2            #408 <String "callback == null">
	//    6   12:invokestatic    #119 <Method Object Utils.checkNotNull(Object, Object)>
	//    7   15:pop             
		dispatcher.execute(new Runnable() {

			public void run()
			{
				doSubscribe(subscription, callback);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field RealSubscriptionManager this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #23  <Field Subscription val$subscription>
			//    4    8:aload_0         
			//    5    9:getfield        #25  <Field SubscriptionManager$Callback val$callback>
			//    6   12:invokevirtual   #33  <Method void RealSubscriptionManager.doSubscribe(Subscription, SubscriptionManager$Callback)>
			//    7   15:return          
			}

			final RealSubscriptionManager this$0;
			final SubscriptionManager.Callback val$callback;
			final Subscription val$subscription;

			
			{
				this$0 = RealSubscriptionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field RealSubscriptionManager this$0>
				subscription = subscription1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Subscription val$subscription>
				callback = callback1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field SubscriptionManager$Callback val$callback>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    8   16:aload_0         
	//    9   17:getfield        #140 <Field Executor dispatcher>
	//   10   20:new             #12  <Class RealSubscriptionManager$3>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:invokespecial   #411 <Method void RealSubscriptionManager$3(RealSubscriptionManager, Subscription, SubscriptionManager$Callback)>
	//   16   30:invokeinterface #366 <Method void Executor.execute(Runnable)>
	//   17   35:return          
	}

	public void unsubscribe(final Subscription subscription)
	{
		Utils.checkNotNull(((Object) (subscription)), "subscription == null");
	//    0    0:aload_1         
	//    1    1:ldc2            #406 <String "subscription == null">
	//    2    4:invokestatic    #119 <Method Object Utils.checkNotNull(Object, Object)>
	//    3    7:pop             
		dispatcher.execute(new Runnable() {

			public void run()
			{
				doUnsubscribe(subscription);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field RealSubscriptionManager this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field Subscription val$subscription>
			//    4    8:invokevirtual   #29  <Method void RealSubscriptionManager.doUnsubscribe(Subscription)>
			//    5   11:return          
			}

			final RealSubscriptionManager this$0;
			final Subscription val$subscription;

			
			{
				this$0 = RealSubscriptionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RealSubscriptionManager this$0>
				subscription = subscription1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Subscription val$subscription>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    4    8:aload_0         
	//    5    9:getfield        #140 <Field Executor dispatcher>
	//    6   12:new             #14  <Class RealSubscriptionManager$4>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #416 <Method void RealSubscriptionManager$4(RealSubscriptionManager, Subscription)>
	//   11   21:invokeinterface #366 <Method void Executor.execute(Runnable)>
	//   12   26:return          
	}

	static final long CONNECTION_ACKNOWLEDGE_TIMEOUT;
	static final long INACTIVITY_TIMEOUT;
	private final Runnable connectionAcknowledgeTimeoutTimerTask = new Runnable() {

		public void run()
		{
			onConnectionAcknowledgeTimeout();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field RealSubscriptionManager this$0>
		//    2    4:invokevirtual   #22  <Method void RealSubscriptionManager.onConnectionAcknowledgeTimeout()>
		//    3    7:return          
		}

		final RealSubscriptionManager this$0;

			
			{
				this$0 = RealSubscriptionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field RealSubscriptionManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final Executor dispatcher;
	private final Runnable inactivityTimeoutTimerTask = new Runnable() {

		public void run()
		{
			onInactivityTimeout();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field RealSubscriptionManager this$0>
		//    2    4:invokevirtual   #22  <Method void RealSubscriptionManager.onInactivityTimeout()>
		//    3    7:return          
		}

		final RealSubscriptionManager this$0;

			
			{
				this$0 = RealSubscriptionManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field RealSubscriptionManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final ResponseFieldMapperFactory responseFieldMapperFactory = new ResponseFieldMapperFactory();
	private final ScalarTypeAdapters scalarTypeAdapters;
	State state;
	Map subscriptions;
	final AutoReleaseTimer timer = new AutoReleaseTimer();
	private final SubscriptionTransport transport;

	static 
	{
		CONNECTION_ACKNOWLEDGE_TIMEOUT = TimeUnit.SECONDS.toMillis(5L);
	//    0    0:getstatic       #67  <Field TimeUnit TimeUnit.SECONDS>
	//    1    3:ldc2w           #68  <Long 5L>
	//    2    6:invokevirtual   #73  <Method long TimeUnit.toMillis(long)>
	//    3    9:putstatic       #75  <Field long CONNECTION_ACKNOWLEDGE_TIMEOUT>
		INACTIVITY_TIMEOUT = TimeUnit.SECONDS.toMillis(10L);
	//    4   12:getstatic       #67  <Field TimeUnit TimeUnit.SECONDS>
	//    5   15:ldc2w           #76  <Long 10L>
	//    6   18:invokevirtual   #73  <Method long TimeUnit.toMillis(long)>
	//    7   21:putstatic       #79  <Field long INACTIVITY_TIMEOUT>
	//*   8   24:return          
	}
}
