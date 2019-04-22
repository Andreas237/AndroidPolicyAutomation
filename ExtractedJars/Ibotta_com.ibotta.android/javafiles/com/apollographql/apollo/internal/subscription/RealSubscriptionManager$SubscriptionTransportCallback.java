// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.subscription;

import com.apollographql.apollo.subscription.OperationServerMessage;
import java.util.concurrent.Executor;

// Referenced classes of package com.apollographql.apollo.internal.subscription:
//			RealSubscriptionManager

private static final class RealSubscriptionManager$SubscriptionTransportCallback
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

			final RealSubscriptionManager.SubscriptionTransportCallback this$0;

			
			{
				this$0 = RealSubscriptionManager.SubscriptionTransportCallback.this;
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

	public void onFailure(final Throwable t)
	{
		dispatcher.execute(new Runnable() {

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

			final RealSubscriptionManager.SubscriptionTransportCallback this$0;
			final Throwable val$t;

			
			{
				this$0 = RealSubscriptionManager.SubscriptionTransportCallback.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field RealSubscriptionManager$SubscriptionTransportCallback this$0>
				t = throwable;
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

	public void onMessage(final OperationServerMessage message)
	{
		dispatcher.execute(new Runnable() {

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

			final RealSubscriptionManager.SubscriptionTransportCallback this$0;
			final OperationServerMessage val$message;

			
			{
				this$0 = RealSubscriptionManager.SubscriptionTransportCallback.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field RealSubscriptionManager$SubscriptionTransportCallback this$0>
				message = operationservermessage;
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
	static RealSubscriptionManager access$000(RealSubscriptionManager$SubscriptionTransportCallback realsubscriptionmanager$subscriptiontransportcallback)
	{
		return realsubscriptionmanager$subscriptiontransportcallback._flddelegate;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field RealSubscriptionManager _flddelegate>
	//    2    4:areturn         
	}

*/

	RealSubscriptionManager$SubscriptionTransportCallback(RealSubscriptionManager realsubscriptionmanager, Executor executor)
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
