// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.messaging.Message;
import com.birbit.android.jobqueue.messaging.MessageQueueConsumer;
import com.birbit.android.jobqueue.messaging.SafeMessageQueue;
import com.birbit.android.jobqueue.messaging.Type;
import com.birbit.android.jobqueue.messaging.message.CallbackMessage;
import com.birbit.android.jobqueue.messaging.message.CancelResultMessage;
import com.birbit.android.jobqueue.messaging.message.CommandMessage;
import com.birbit.android.jobqueue.messaging.message.PublicQueryMessage;
import com.birbit.android.jobqueue.timer.Timer;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.birbit.android.jobqueue:
//			CallbackManager, IntCallback

class CallbackManager$2
	implements Runnable
{

	public void run()
	{
		messageQueue.consume(((MessageQueueConsumer) (new MessageQueueConsumer() {

			public void handleMessage(Message message)
			{
				if(message.type != Type.CALLBACK) goto _L2; else goto _L1
			//    0    0:aload_1         
			//    1    1:getfield        #32  <Field Type Message.type>
			//    2    4:getstatic       #37  <Field Type Type.CALLBACK>
			//    3    7:if_acmpne       46
_L1:
				message = ((Message) ((CallbackMessage)message));
			//    4   10:aload_1         
			//    5   11:checkcast       #39  <Class CallbackMessage>
			//    6   14:astore_1        
				CallbackManager.access$000(this$0, ((CallbackMessage) (message)));
			//    7   15:aload_0         
			//    8   16:getfield        #17  <Field CallbackManager$2 this$1>
			//    9   19:getfield        #43  <Field CallbackManager CallbackManager$2.this$0>
			//   10   22:aload_1         
			//   11   23:invokestatic    #49  <Method void CallbackManager.access$000(CallbackManager, CallbackMessage)>
				lastDelivery = CallbackManager.access$100(this$0).nanoTime();
			//   12   26:aload_0         
			//   13   27:aload_0         
			//   14   28:getfield        #17  <Field CallbackManager$2 this$1>
			//   15   31:getfield        #43  <Field CallbackManager CallbackManager$2.this$0>
			//   16   34:invokestatic    #53  <Method Timer CallbackManager.access$100(CallbackManager)>
			//   17   37:invokeinterface #59  <Method long Timer.nanoTime()>
			//   18   42:putfield        #23  <Field long lastDelivery>
_L4:
				return;
			//   19   45:return          
_L2:
				int i;
				if(message.type == Type.CANCEL_RESULT_CALLBACK)
			//*  20   46:aload_1         
			//*  21   47:getfield        #32  <Field Type Message.type>
			//*  22   50:getstatic       #62  <Field Type Type.CANCEL_RESULT_CALLBACK>
			//*  23   53:if_acmpne       90
				{
					CallbackManager.access$200(this$0, (CancelResultMessage)message);
			//   24   56:aload_0         
			//   25   57:getfield        #17  <Field CallbackManager$2 this$1>
			//   26   60:getfield        #43  <Field CallbackManager CallbackManager$2.this$0>
			//   27   63:aload_1         
			//   28   64:checkcast       #64  <Class CancelResultMessage>
			//   29   67:invokestatic    #68  <Method void CallbackManager.access$200(CallbackManager, CancelResultMessage)>
					lastDelivery = CallbackManager.access$100(this$0).nanoTime();
			//   30   70:aload_0         
			//   31   71:aload_0         
			//   32   72:getfield        #17  <Field CallbackManager$2 this$1>
			//   33   75:getfield        #43  <Field CallbackManager CallbackManager$2.this$0>
			//   34   78:invokestatic    #53  <Method Timer CallbackManager.access$100(CallbackManager)>
			//   35   81:invokeinterface #59  <Method long Timer.nanoTime()>
			//   36   86:putfield        #23  <Field long lastDelivery>
					return;
			//   37   89:return          
				}
				if(message.type != Type.COMMAND)
					continue; /* Loop/switch isn't completed */
			//   38   90:aload_1         
			//   39   91:getfield        #32  <Field Type Message.type>
			//   40   94:getstatic       #71  <Field Type Type.COMMAND>
			//   41   97:if_acmpne       158
				message = ((Message) ((CommandMessage)message));
			//   42  100:aload_1         
			//   43  101:checkcast       #73  <Class CommandMessage>
			//   44  104:astore_1        
				i = ((CommandMessage) (message)).getWhat();
			//   45  105:aload_1         
			//   46  106:invokevirtual   #77  <Method int CommandMessage.getWhat()>
			//   47  109:istore_2        
				if(i == 1)
			//*  48  110:iload_2         
			//*  49  111:iconst_1        
			//*  50  112:icmpne          143
				{
					messageQueue.stop();
			//   51  115:aload_0         
			//   52  116:getfield        #17  <Field CallbackManager$2 this$1>
			//   53  119:getfield        #43  <Field CallbackManager CallbackManager$2.this$0>
			//   54  122:getfield        #81  <Field SafeMessageQueue CallbackManager.messageQueue>
			//   55  125:invokevirtual   #86  <Method void SafeMessageQueue.stop()>
					CallbackManager.access$300(this$0).set(false);
			//   56  128:aload_0         
			//   57  129:getfield        #17  <Field CallbackManager$2 this$1>
			//   58  132:getfield        #43  <Field CallbackManager CallbackManager$2.this$0>
			//   59  135:invokestatic    #90  <Method AtomicBoolean CallbackManager.access$300(CallbackManager)>
			//   60  138:iconst_0        
			//   61  139:invokevirtual   #96  <Method void AtomicBoolean.set(boolean)>
					return;
			//   62  142:return          
				}
				if(i != 3) goto _L4; else goto _L3
			//   63  143:iload_2         
			//   64  144:iconst_3        
			//   65  145:icmpne          45
_L3:
				((CommandMessage) (message)).getRunnable().run();
			//   66  148:aload_1         
			//   67  149:invokevirtual   #100 <Method Runnable CommandMessage.getRunnable()>
			//   68  152:invokeinterface #103 <Method void Runnable.run()>
				return;
			//   69  157:return          
				if(message.type != Type.PUBLIC_QUERY) goto _L4; else goto _L5
			//   70  158:aload_1         
			//   71  159:getfield        #32  <Field Type Message.type>
			//   72  162:getstatic       #106 <Field Type Type.PUBLIC_QUERY>
			//   73  165:if_acmpne       45
_L5:
				((PublicQueryMessage)message).getCallback().onResult(0);
			//   74  168:aload_1         
			//   75  169:checkcast       #108 <Class PublicQueryMessage>
			//   76  172:invokevirtual   #112 <Method IntCallback PublicQueryMessage.getCallback()>
			//   77  175:iconst_0        
			//   78  176:invokeinterface #118 <Method void IntCallback.onResult(int)>
				return;
			//   79  181:return          
			}

			public void onIdle()
			{
			//    0    0:return          
			}

			public void onStart()
			{
			//    0    0:return          
			}

			long lastDelivery;
			final CallbackManager._cls2 this$1;

			
			{
				this$1 = CallbackManager._cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CallbackManager$2 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void MessageQueueConsumer()>
				lastDelivery = 0x0L;
			//    5    9:aload_0         
			//    6   10:ldc2w           #20  <Long 0x0L>
			//    7   13:putfield        #23  <Field long lastDelivery>
			//    8   16:return          
			}
		}
)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CallbackManager this$0>
	//    2    4:getfield        #27  <Field SafeMessageQueue CallbackManager.messageQueue>
	//    3    7:new             #13  <Class CallbackManager$2$1>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #30  <Method void CallbackManager$2$1(CallbackManager$2)>
	//    7   15:invokevirtual   #36  <Method void SafeMessageQueue.consume(MessageQueueConsumer)>
	//    8   18:return          
	}

	final CallbackManager this$0;

	CallbackManager$2()
	{
		this$0 = CallbackManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CallbackManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
