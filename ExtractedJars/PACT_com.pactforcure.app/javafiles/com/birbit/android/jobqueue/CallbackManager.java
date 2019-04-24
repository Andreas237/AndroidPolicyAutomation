// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.callback.JobManagerCallback;
import com.birbit.android.jobqueue.messaging.Message;
import com.birbit.android.jobqueue.messaging.MessageFactory;
import com.birbit.android.jobqueue.messaging.MessageQueueConsumer;
import com.birbit.android.jobqueue.messaging.SafeMessageQueue;
import com.birbit.android.jobqueue.messaging.Type;
import com.birbit.android.jobqueue.messaging.message.CallbackMessage;
import com.birbit.android.jobqueue.messaging.message.CancelResultMessage;
import com.birbit.android.jobqueue.messaging.message.CommandMessage;
import com.birbit.android.jobqueue.messaging.message.PublicQueryMessage;
import com.birbit.android.jobqueue.timer.Timer;
import java.util.Iterator;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.birbit.android.jobqueue:
//			Job, CancelResult, IntCallback

public class CallbackManager
{

	public CallbackManager(MessageFactory messagefactory, Timer timer1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #30  <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #33  <Method void AtomicInteger(int)>
	//    7   13:putfield        #35  <Field AtomicInteger callbacksSize>
	//    8   16:aload_0         
	//    9   17:new             #37  <Class AtomicBoolean>
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:invokespecial   #40  <Method void AtomicBoolean(boolean)>
	//   13   25:putfield        #42  <Field AtomicBoolean started>
		timer = timer1;
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:putfield        #44  <Field Timer timer>
		messageQueue = new SafeMessageQueue(timer1, messagefactory, "jq_callback");
	//   17   33:aload_0         
	//   18   34:new             #46  <Class SafeMessageQueue>
	//   19   37:dup             
	//   20   38:aload_2         
	//   21   39:aload_1         
	//   22   40:ldc1            #48  <String "jq_callback">
	//   23   42:invokespecial   #51  <Method void SafeMessageQueue(Timer, MessageFactory, String)>
	//   24   45:putfield        #53  <Field SafeMessageQueue messageQueue>
	//   25   48:aload_0         
	//   26   49:new             #55  <Class CopyOnWriteArrayList>
	//   27   52:dup             
	//   28   53:invokespecial   #56  <Method void CopyOnWriteArrayList()>
	//   29   56:putfield        #58  <Field CopyOnWriteArrayList callbacks>
		factory = messagefactory;
	//   30   59:aload_0         
	//   31   60:aload_1         
	//   32   61:putfield        #60  <Field MessageFactory factory>
	//   33   64:return          
	}

	private void deliverCancelResult(CancelResultMessage cancelresultmessage)
	{
		cancelresultmessage.getCallback().onCancelled(cancelresultmessage.getResult());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #84  <Method CancelResult$AsyncCancelCallback CancelResultMessage.getCallback()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #88  <Method CancelResult CancelResultMessage.getResult()>
	//    4    8:invokeinterface #94  <Method void CancelResult$AsyncCancelCallback.onCancelled(CancelResult)>
		startIfNeeded();
	//    5   13:aload_0         
	//    6   14:invokespecial   #97  <Method void startIfNeeded()>
	//    7   17:return          
	}

	private void deliverMessage(CallbackMessage callbackmessage)
	{
		switch(callbackmessage.getWhat())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #104 <Method int CallbackMessage.getWhat()>
		{
	//*   2    4:tableswitch     1 5: default 40
	//	               1 41
	//	               2 89
	//	               3 63
	//	               4 80
	//	               5 50
		default:
			return;
	//    3   40:return          

		case 1: // '\001'
			notifyOnAddedListeners(callbackmessage.getJob());
	//    4   41:aload_0         
	//    5   42:aload_1         
	//    6   43:invokevirtual   #108 <Method Job CallbackMessage.getJob()>
	//    7   46:invokespecial   #112 <Method void notifyOnAddedListeners(Job)>
			return;
	//    8   49:return          

		case 5: // '\005'
			notifyAfterRunListeners(callbackmessage.getJob(), callbackmessage.getResultCode());
	//    9   50:aload_0         
	//   10   51:aload_1         
	//   11   52:invokevirtual   #108 <Method Job CallbackMessage.getJob()>
	//   12   55:aload_1         
	//   13   56:invokevirtual   #115 <Method int CallbackMessage.getResultCode()>
	//   14   59:invokespecial   #119 <Method void notifyAfterRunListeners(Job, int)>
			return;
	//   15   62:return          

		case 3: // '\003'
			notifyOnCancelListeners(callbackmessage.getJob(), callbackmessage.isByUserRequest(), callbackmessage.getThrowable());
	//   16   63:aload_0         
	//   17   64:aload_1         
	//   18   65:invokevirtual   #108 <Method Job CallbackMessage.getJob()>
	//   19   68:aload_1         
	//   20   69:invokevirtual   #123 <Method boolean CallbackMessage.isByUserRequest()>
	//   21   72:aload_1         
	//   22   73:invokevirtual   #127 <Method Throwable CallbackMessage.getThrowable()>
	//   23   76:invokespecial   #131 <Method void notifyOnCancelListeners(Job, boolean, Throwable)>
			return;
	//   24   79:return          

		case 4: // '\004'
			notifyOnDoneListeners(callbackmessage.getJob());
	//   25   80:aload_0         
	//   26   81:aload_1         
	//   27   82:invokevirtual   #108 <Method Job CallbackMessage.getJob()>
	//   28   85:invokespecial   #134 <Method void notifyOnDoneListeners(Job)>
			return;
	//   29   88:return          

		case 2: // '\002'
			notifyOnRunListeners(callbackmessage.getJob(), callbackmessage.getResultCode());
	//   30   89:aload_0         
	//   31   90:aload_1         
	//   32   91:invokevirtual   #108 <Method Job CallbackMessage.getJob()>
	//   33   94:aload_1         
	//   34   95:invokevirtual   #115 <Method int CallbackMessage.getResultCode()>
	//   35   98:invokespecial   #137 <Method void notifyOnRunListeners(Job, int)>
			return;
	//   36  101:return          
		}
	}

	private boolean hasAnyCallbacks()
	{
		return callbacksSize.get() > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field AtomicInteger callbacksSize>
	//    2    4:invokevirtual   #141 <Method int AtomicInteger.get()>
	//    3    7:ifle            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	private void notifyAfterRunListeners(Job job, int i)
	{
		for(Iterator iterator = callbacks.iterator(); iterator.hasNext(); ((JobManagerCallback)iterator.next()).onAfterJobRun(job, i));
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field CopyOnWriteArrayList callbacks>
	//    2    4:invokevirtual   #145 <Method Iterator CopyOnWriteArrayList.iterator()>
	//    3    7:astore_3        
	//    4    8:aload_3         
	//    5    9:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            36
	//    7   17:aload_3         
	//    8   18:invokeinterface #154 <Method Object Iterator.next()>
	//    9   23:checkcast       #156 <Class JobManagerCallback>
	//   10   26:aload_1         
	//   11   27:iload_2         
	//   12   28:invokeinterface #159 <Method void JobManagerCallback.onAfterJobRun(Job, int)>
	//*  13   33:goto            8
	//   14   36:return          
	}

	private void notifyOnAddedListeners(Job job)
	{
		for(Iterator iterator = callbacks.iterator(); iterator.hasNext(); ((JobManagerCallback)iterator.next()).onJobAdded(job));
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field CopyOnWriteArrayList callbacks>
	//    2    4:invokevirtual   #145 <Method Iterator CopyOnWriteArrayList.iterator()>
	//    3    7:astore_2        
	//    4    8:aload_2         
	//    5    9:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            35
	//    7   17:aload_2         
	//    8   18:invokeinterface #154 <Method Object Iterator.next()>
	//    9   23:checkcast       #156 <Class JobManagerCallback>
	//   10   26:aload_1         
	//   11   27:invokeinterface #162 <Method void JobManagerCallback.onJobAdded(Job)>
	//*  12   32:goto            8
	//   13   35:return          
	}

	private void notifyOnCancelListeners(Job job, boolean flag, Throwable throwable)
	{
		for(Iterator iterator = callbacks.iterator(); iterator.hasNext(); ((JobManagerCallback)iterator.next()).onJobCancelled(job, flag, throwable));
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field CopyOnWriteArrayList callbacks>
	//    2    4:invokevirtual   #145 <Method Iterator CopyOnWriteArrayList.iterator()>
	//    3    7:astore          4
	//    4    9:aload           4
	//    5   11:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            40
	//    7   19:aload           4
	//    8   21:invokeinterface #154 <Method Object Iterator.next()>
	//    9   26:checkcast       #156 <Class JobManagerCallback>
	//   10   29:aload_1         
	//   11   30:iload_2         
	//   12   31:aload_3         
	//   13   32:invokeinterface #166 <Method void JobManagerCallback.onJobCancelled(Job, boolean, Throwable)>
	//*  14   37:goto            9
	//   15   40:return          
	}

	private void notifyOnDoneListeners(Job job)
	{
		for(Iterator iterator = callbacks.iterator(); iterator.hasNext(); ((JobManagerCallback)iterator.next()).onDone(job));
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field CopyOnWriteArrayList callbacks>
	//    2    4:invokevirtual   #145 <Method Iterator CopyOnWriteArrayList.iterator()>
	//    3    7:astore_2        
	//    4    8:aload_2         
	//    5    9:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            35
	//    7   17:aload_2         
	//    8   18:invokeinterface #154 <Method Object Iterator.next()>
	//    9   23:checkcast       #156 <Class JobManagerCallback>
	//   10   26:aload_1         
	//   11   27:invokeinterface #169 <Method void JobManagerCallback.onDone(Job)>
	//*  12   32:goto            8
	//   13   35:return          
	}

	private void notifyOnRunListeners(Job job, int i)
	{
		for(Iterator iterator = callbacks.iterator(); iterator.hasNext(); ((JobManagerCallback)iterator.next()).onJobRun(job, i));
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field CopyOnWriteArrayList callbacks>
	//    2    4:invokevirtual   #145 <Method Iterator CopyOnWriteArrayList.iterator()>
	//    3    7:astore_3        
	//    4    8:aload_3         
	//    5    9:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            36
	//    7   17:aload_3         
	//    8   18:invokeinterface #154 <Method Object Iterator.next()>
	//    9   23:checkcast       #156 <Class JobManagerCallback>
	//   10   26:aload_1         
	//   11   27:iload_2         
	//   12   28:invokeinterface #172 <Method void JobManagerCallback.onJobRun(Job, int)>
	//*  13   33:goto            8
	//   14   36:return          
	}

	private void start()
	{
		(new Thread(new Runnable() {

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
						deliverMessage(((CallbackMessage) (message)));
					//    7   15:aload_0         
					//    8   16:getfield        #17  <Field CallbackManager$2 this$1>
					//    9   19:getfield        #43  <Field CallbackManager CallbackManager$2.this$0>
					//   10   22:aload_1         
					//   11   23:invokestatic    #49  <Method void CallbackManager.access$000(CallbackManager, CallbackMessage)>
						lastDelivery = timer.nanoTime();
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
							deliverCancelResult((CancelResultMessage)message);
					//   24   56:aload_0         
					//   25   57:getfield        #17  <Field CallbackManager$2 this$1>
					//   26   60:getfield        #43  <Field CallbackManager CallbackManager$2.this$0>
					//   27   63:aload_1         
					//   28   64:checkcast       #64  <Class CancelResultMessage>
					//   29   67:invokestatic    #68  <Method void CallbackManager.access$200(CallbackManager, CancelResultMessage)>
							lastDelivery = timer.nanoTime();
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
							started.set(false);
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
					final _cls2 this$1;

			
			{
				this$1 = _cls2.this;
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
, "job-manager-callbacks")).start();
	//    0    0:new             #175 <Class Thread>
	//    1    3:dup             
	//    2    4:new             #8   <Class CallbackManager$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #178 <Method void CallbackManager$2(CallbackManager)>
	//    6   12:ldc1            #180 <String "job-manager-callbacks">
	//    7   14:invokespecial   #183 <Method void Thread(Runnable, String)>
	//    8   17:invokevirtual   #185 <Method void Thread.start()>
	//    9   20:return          
	}

	private void startIfNeeded()
	{
		if(!started.getAndSet(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field AtomicBoolean started>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #189 <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            15
			start();
	//    5   11:aload_0         
	//    6   12:invokespecial   #190 <Method void start()>
	//    7   15:return          
	}

	void addCallback(JobManagerCallback jobmanagercallback)
	{
		callbacks.add(((Object) (jobmanagercallback)));
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field CopyOnWriteArrayList callbacks>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #196 <Method boolean CopyOnWriteArrayList.add(Object)>
	//    4    8:pop             
		callbacksSize.incrementAndGet();
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field AtomicInteger callbacksSize>
	//    7   13:invokevirtual   #199 <Method int AtomicInteger.incrementAndGet()>
	//    8   16:pop             
		startIfNeeded();
	//    9   17:aload_0         
	//   10   18:invokespecial   #97  <Method void startIfNeeded()>
	//   11   21:return          
	}

	public void destroy()
	{
		if(!started.get())
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field AtomicBoolean started>
	//*   2    4:invokevirtual   #202 <Method boolean AtomicBoolean.get()>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			CommandMessage commandmessage = (CommandMessage)factory.obtain(com/birbit/android/jobqueue/messaging/message/CommandMessage);
	//    5   11:aload_0         
	//    6   12:getfield        #60  <Field MessageFactory factory>
	//    7   15:ldc1            #204 <Class CommandMessage>
	//    8   17:invokevirtual   #210 <Method Message MessageFactory.obtain(Class)>
	//    9   20:checkcast       #204 <Class CommandMessage>
	//   10   23:astore_1        
			commandmessage.set(1);
	//   11   24:aload_1         
	//   12   25:iconst_1        
	//   13   26:invokevirtual   #213 <Method void CommandMessage.set(int)>
			messageQueue.post(((Message) (commandmessage)));
	//   14   29:aload_0         
	//   15   30:getfield        #53  <Field SafeMessageQueue messageQueue>
	//   16   33:aload_1         
	//   17   34:invokevirtual   #217 <Method void SafeMessageQueue.post(Message)>
			return;
	//   18   37:return          
		}
	}

	public void notifyAfterRun(Job job, int i)
	{
		if(!hasAnyCallbacks())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #220 <Method boolean hasAnyCallbacks()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			CallbackMessage callbackmessage = (CallbackMessage)factory.obtain(com/birbit/android/jobqueue/messaging/message/CallbackMessage);
	//    4    8:aload_0         
	//    5    9:getfield        #60  <Field MessageFactory factory>
	//    6   12:ldc1            #100 <Class CallbackMessage>
	//    7   14:invokevirtual   #210 <Method Message MessageFactory.obtain(Class)>
	//    8   17:checkcast       #100 <Class CallbackMessage>
	//    9   20:astore_3        
			callbackmessage.set(job, 5, i);
	//   10   21:aload_3         
	//   11   22:aload_1         
	//   12   23:iconst_5        
	//   13   24:iload_2         
	//   14   25:invokevirtual   #223 <Method void CallbackMessage.set(Job, int, int)>
			messageQueue.post(((Message) (callbackmessage)));
	//   15   28:aload_0         
	//   16   29:getfield        #53  <Field SafeMessageQueue messageQueue>
	//   17   32:aload_3         
	//   18   33:invokevirtual   #217 <Method void SafeMessageQueue.post(Message)>
			return;
	//   19   36:return          
		}
	}

	public void notifyCancelResult(CancelResult cancelresult, CancelResult.AsyncCancelCallback asynccancelcallback)
	{
		CancelResultMessage cancelresultmessage = (CancelResultMessage)factory.obtain(com/birbit/android/jobqueue/messaging/message/CancelResultMessage);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field MessageFactory factory>
	//    2    4:ldc1            #80  <Class CancelResultMessage>
	//    3    6:invokevirtual   #210 <Method Message MessageFactory.obtain(Class)>
	//    4    9:checkcast       #80  <Class CancelResultMessage>
	//    5   12:astore_3        
		cancelresultmessage.set(asynccancelcallback, cancelresult);
	//    6   13:aload_3         
	//    7   14:aload_2         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #228 <Method void CancelResultMessage.set(CancelResult$AsyncCancelCallback, CancelResult)>
		messageQueue.post(((Message) (cancelresultmessage)));
	//   10   19:aload_0         
	//   11   20:getfield        #53  <Field SafeMessageQueue messageQueue>
	//   12   23:aload_3         
	//   13   24:invokevirtual   #217 <Method void SafeMessageQueue.post(Message)>
		startIfNeeded();
	//   14   27:aload_0         
	//   15   28:invokespecial   #97  <Method void startIfNeeded()>
	//   16   31:return          
	}

	public void notifyOnAdded(Job job)
	{
		if(!hasAnyCallbacks())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #220 <Method boolean hasAnyCallbacks()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			CallbackMessage callbackmessage = (CallbackMessage)factory.obtain(com/birbit/android/jobqueue/messaging/message/CallbackMessage);
	//    4    8:aload_0         
	//    5    9:getfield        #60  <Field MessageFactory factory>
	//    6   12:ldc1            #100 <Class CallbackMessage>
	//    7   14:invokevirtual   #210 <Method Message MessageFactory.obtain(Class)>
	//    8   17:checkcast       #100 <Class CallbackMessage>
	//    9   20:astore_2        
			callbackmessage.set(job, 1);
	//   10   21:aload_2         
	//   11   22:aload_1         
	//   12   23:iconst_1        
	//   13   24:invokevirtual   #231 <Method void CallbackMessage.set(Job, int)>
			messageQueue.post(((Message) (callbackmessage)));
	//   14   27:aload_0         
	//   15   28:getfield        #53  <Field SafeMessageQueue messageQueue>
	//   16   31:aload_2         
	//   17   32:invokevirtual   #217 <Method void SafeMessageQueue.post(Message)>
			return;
	//   18   35:return          
		}
	}

	public void notifyOnCancel(Job job, boolean flag, Throwable throwable)
	{
		if(!hasAnyCallbacks())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #220 <Method boolean hasAnyCallbacks()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			CallbackMessage callbackmessage = (CallbackMessage)factory.obtain(com/birbit/android/jobqueue/messaging/message/CallbackMessage);
	//    4    8:aload_0         
	//    5    9:getfield        #60  <Field MessageFactory factory>
	//    6   12:ldc1            #100 <Class CallbackMessage>
	//    7   14:invokevirtual   #210 <Method Message MessageFactory.obtain(Class)>
	//    8   17:checkcast       #100 <Class CallbackMessage>
	//    9   20:astore          4
			callbackmessage.set(job, 3, flag, throwable);
	//   10   22:aload           4
	//   11   24:aload_1         
	//   12   25:iconst_3        
	//   13   26:iload_2         
	//   14   27:aload_3         
	//   15   28:invokevirtual   #235 <Method void CallbackMessage.set(Job, int, boolean, Throwable)>
			messageQueue.post(((Message) (callbackmessage)));
	//   16   31:aload_0         
	//   17   32:getfield        #53  <Field SafeMessageQueue messageQueue>
	//   18   35:aload           4
	//   19   37:invokevirtual   #217 <Method void SafeMessageQueue.post(Message)>
			return;
	//   20   40:return          
		}
	}

	public void notifyOnDone(Job job)
	{
		if(!hasAnyCallbacks())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #220 <Method boolean hasAnyCallbacks()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			CallbackMessage callbackmessage = (CallbackMessage)factory.obtain(com/birbit/android/jobqueue/messaging/message/CallbackMessage);
	//    4    8:aload_0         
	//    5    9:getfield        #60  <Field MessageFactory factory>
	//    6   12:ldc1            #100 <Class CallbackMessage>
	//    7   14:invokevirtual   #210 <Method Message MessageFactory.obtain(Class)>
	//    8   17:checkcast       #100 <Class CallbackMessage>
	//    9   20:astore_2        
			callbackmessage.set(job, 4);
	//   10   21:aload_2         
	//   11   22:aload_1         
	//   12   23:iconst_4        
	//   13   24:invokevirtual   #231 <Method void CallbackMessage.set(Job, int)>
			messageQueue.post(((Message) (callbackmessage)));
	//   14   27:aload_0         
	//   15   28:getfield        #53  <Field SafeMessageQueue messageQueue>
	//   16   31:aload_2         
	//   17   32:invokevirtual   #217 <Method void SafeMessageQueue.post(Message)>
			return;
	//   18   35:return          
		}
	}

	public void notifyOnRun(Job job, int i)
	{
		if(!hasAnyCallbacks())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #220 <Method boolean hasAnyCallbacks()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			CallbackMessage callbackmessage = (CallbackMessage)factory.obtain(com/birbit/android/jobqueue/messaging/message/CallbackMessage);
	//    4    8:aload_0         
	//    5    9:getfield        #60  <Field MessageFactory factory>
	//    6   12:ldc1            #100 <Class CallbackMessage>
	//    7   14:invokevirtual   #210 <Method Message MessageFactory.obtain(Class)>
	//    8   17:checkcast       #100 <Class CallbackMessage>
	//    9   20:astore_3        
			callbackmessage.set(job, 2, i);
	//   10   21:aload_3         
	//   11   22:aload_1         
	//   12   23:iconst_2        
	//   13   24:iload_2         
	//   14   25:invokevirtual   #223 <Method void CallbackMessage.set(Job, int, int)>
			messageQueue.post(((Message) (callbackmessage)));
	//   15   28:aload_0         
	//   16   29:getfield        #53  <Field SafeMessageQueue messageQueue>
	//   17   32:aload_3         
	//   18   33:invokevirtual   #217 <Method void SafeMessageQueue.post(Message)>
			return;
	//   19   36:return          
		}
	}

	boolean removeCallback(JobManagerCallback jobmanagercallback)
	{
		boolean flag = callbacks.remove(((Object) (jobmanagercallback)));
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field CopyOnWriteArrayList callbacks>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #242 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//    4    8:istore_2        
		if(flag)
	//*   5    9:iload_2         
	//*   6   10:ifeq            21
			callbacksSize.decrementAndGet();
	//    7   13:aload_0         
	//    8   14:getfield        #35  <Field AtomicInteger callbacksSize>
	//    9   17:invokevirtual   #245 <Method int AtomicInteger.decrementAndGet()>
	//   10   20:pop             
		return flag;
	//   11   21:iload_2         
	//   12   22:ireturn         
	}

	public boolean waitUntilAllMessagesAreConsumed(int i)
	{
		final CountDownLatch latch = new CountDownLatch(1);
	//    0    0:new             #251 <Class CountDownLatch>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #252 <Method void CountDownLatch(int)>
	//    4    8:astore          5
		CommandMessage commandmessage = (CommandMessage)factory.obtain(com/birbit/android/jobqueue/messaging/message/CommandMessage);
	//    5   10:aload_0         
	//    6   11:getfield        #60  <Field MessageFactory factory>
	//    7   14:ldc1            #204 <Class CommandMessage>
	//    8   16:invokevirtual   #210 <Method Message MessageFactory.obtain(Class)>
	//    9   19:checkcast       #204 <Class CommandMessage>
	//   10   22:astore          6
		commandmessage.set(3);
	//   11   24:aload           6
	//   12   26:iconst_3        
	//   13   27:invokevirtual   #213 <Method void CommandMessage.set(int)>
		commandmessage.setRunnable(new Runnable() {

			public void run()
			{
				latch.countDown();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field CountDownLatch val$latch>
			//    2    4:invokevirtual   #31  <Method void CountDownLatch.countDown()>
			//    3    7:return          
			}

			final CallbackManager this$0;
			final CountDownLatch val$latch;

			
			{
				this$0 = CallbackManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CallbackManager this$0>
				latch = countdownlatch;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CountDownLatch val$latch>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   14   30:aload           6
	//   15   32:new             #6   <Class CallbackManager$1>
	//   16   35:dup             
	//   17   36:aload_0         
	//   18   37:aload           5
	//   19   39:invokespecial   #255 <Method void CallbackManager$1(CallbackManager, CountDownLatch)>
	//   20   42:invokevirtual   #259 <Method void CommandMessage.setRunnable(Runnable)>
		messageQueue.post(((Message) (commandmessage)));
	//   21   45:aload_0         
	//   22   46:getfield        #53  <Field SafeMessageQueue messageQueue>
	//   23   49:aload           6
	//   24   51:invokevirtual   #217 <Method void SafeMessageQueue.post(Message)>
		long l = i;
	//   25   54:iload_1         
	//   26   55:i2l             
	//   27   56:lstore_2        
		boolean flag;
		try
		{
			flag = latch.await(l, TimeUnit.SECONDS);
	//   28   57:aload           5
	//   29   59:lload_2         
	//   30   60:getstatic       #265 <Field TimeUnit TimeUnit.SECONDS>
	//   31   63:invokevirtual   #269 <Method boolean CountDownLatch.await(long, TimeUnit)>
	//   32   66:istore          4
		}
	//*  33   68:iload           4
	//*  34   70:ireturn         
		catch(InterruptedException interruptedexception)
	//*  35   71:astore          5
		{
			return false;
	//   36   73:iconst_0        
	//   37   74:ireturn         
		}
		return flag;
	}

	private final CopyOnWriteArrayList callbacks = new CopyOnWriteArrayList();
	private final AtomicInteger callbacksSize = new AtomicInteger(0);
	private final MessageFactory factory;
	final SafeMessageQueue messageQueue;
	private final AtomicBoolean started = new AtomicBoolean(false);
	private final Timer timer;


/*
	static void access$000(CallbackManager callbackmanager, CallbackMessage callbackmessage)
	{
		callbackmanager.deliverMessage(callbackmessage);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void deliverMessage(CallbackMessage)>
		return;
	//    3    5:return          
	}

*/


/*
	static Timer access$100(CallbackManager callbackmanager)
	{
		return callbackmanager.timer;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Timer timer>
	//    2    4:areturn         
	}

*/


/*
	static void access$200(CallbackManager callbackmanager, CancelResultMessage cancelresultmessage)
	{
		callbackmanager.deliverCancelResult(cancelresultmessage);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #75  <Method void deliverCancelResult(CancelResultMessage)>
		return;
	//    3    5:return          
	}

*/


/*
	static AtomicBoolean access$300(CallbackManager callbackmanager)
	{
		return callbackmanager.started;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AtomicBoolean started>
	//    2    4:areturn         
	}

*/
}
