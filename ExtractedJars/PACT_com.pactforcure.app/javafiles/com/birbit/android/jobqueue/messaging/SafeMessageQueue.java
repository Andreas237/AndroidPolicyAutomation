// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.messaging;

import com.birbit.android.jobqueue.log.JqLog;
import com.birbit.android.jobqueue.timer.Timer;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.birbit.android.jobqueue.messaging:
//			UnsafeMessageQueue, MessageQueue, DelayedMessageBag, MessageQueueConsumer, 
//			MessageFactory, MessagePredicate, Message

public class SafeMessageQueue extends UnsafeMessageQueue
	implements MessageQueue
{

	public SafeMessageQueue(Timer timer1, MessageFactory messagefactory, String s)
	{
		super(messagefactory, s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #23  <Method void UnsafeMessageQueue(MessageFactory, String)>
	//    4    6:aload_0         
	//    5    7:new             #25  <Class Object>
	//    6   10:dup             
	//    7   11:invokespecial   #28  <Method void Object()>
	//    8   14:putfield        #30  <Field Object LOCK>
	//    9   17:aload_0         
	//   10   18:new             #32  <Class AtomicBoolean>
	//   11   21:dup             
	//   12   22:iconst_0        
	//   13   23:invokespecial   #35  <Method void AtomicBoolean(boolean)>
	//   14   26:putfield        #37  <Field AtomicBoolean running>
		postMessageTick = false;
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:putfield        #39  <Field boolean postMessageTick>
		factory = messagefactory;
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #41  <Field MessageFactory factory>
		timer = timer1;
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:putfield        #43  <Field Timer timer>
		delayedBag = new DelayedMessageBag(messagefactory);
	//   24   44:aload_0         
	//   25   45:new             #45  <Class DelayedMessageBag>
	//   26   48:dup             
	//   27   49:aload_2         
	//   28   50:invokespecial   #48  <Method void DelayedMessageBag(MessageFactory)>
	//   29   53:putfield        #50  <Field DelayedMessageBag delayedBag>
	//   30   56:return          
	}

	public void cancelMessages(MessagePredicate messagepredicate)
	{
		synchronized(LOCK)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field Object LOCK>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			super.removeMessages(messagepredicate);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokespecial   #56  <Method void UnsafeMessageQueue.removeMessages(MessagePredicate)>
			delayedBag.removeMessages(messagepredicate);
	//    8   12:aload_0         
	//    9   13:getfield        #50  <Field DelayedMessageBag delayedBag>
	//   10   16:aload_1         
	//   11   17:invokevirtual   #57  <Method void DelayedMessageBag.removeMessages(MessagePredicate)>
		}
	//   12   20:aload_2         
	//   13   21:monitorexit     
		return;
	//   14   22:return          
		messagepredicate;
	//   15   23:astore_1        
		obj;
	//   16   24:aload_2         
		JVM INSTR monitorexit ;
	//   17   25:monitorexit     
		throw messagepredicate;
	//   18   26:aload_1         
	//   19   27:athrow          
	}

	public void clear()
	{
		synchronized(LOCK)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field Object LOCK>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			super.clear();
	//    5    7:aload_0         
	//    6    8:invokespecial   #60  <Method void UnsafeMessageQueue.clear()>
		}
	//    7   11:aload_1         
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		exception;
	//   10   14:astore_2        
		obj;
	//   11   15:aload_1         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		throw exception;
	//   13   17:aload_2         
	//   14   18:athrow          
	}

	public void consume(MessageQueueConsumer messagequeueconsumer)
	{
		if(running.getAndSet(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field AtomicBoolean running>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #66  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifeq            21
			throw new IllegalStateException("only 1 consumer per MQ");
	//    5   11:new             #68  <Class IllegalStateException>
	//    6   14:dup             
	//    7   15:ldc1            #70  <String "only 1 consumer per MQ">
	//    8   17:invokespecial   #73  <Method void IllegalStateException(String)>
	//    9   20:athrow          
		messagequeueconsumer.onStart();
	//   10   21:aload_1         
	//   11   22:invokevirtual   #78  <Method void MessageQueueConsumer.onStart()>
		do
		{
			if(!running.get())
				break;
	//   12   25:aload_0         
	//   13   26:getfield        #37  <Field AtomicBoolean running>
	//   14   29:invokevirtual   #82  <Method boolean AtomicBoolean.get()>
	//   15   32:ifeq            61
			Message message = next(messagequeueconsumer);
	//   16   35:aload_0         
	//   17   36:aload_1         
	//   18   37:invokevirtual   #86  <Method Message next(MessageQueueConsumer)>
	//   19   40:astore_2        
			if(message != null)
	//*  20   41:aload_2         
	//*  21   42:ifnull          25
			{
				messagequeueconsumer.handleMessage(message);
	//   22   45:aload_1         
	//   23   46:aload_2         
	//   24   47:invokevirtual   #90  <Method void MessageQueueConsumer.handleMessage(Message)>
				factory.release(message);
	//   25   50:aload_0         
	//   26   51:getfield        #41  <Field MessageFactory factory>
	//   27   54:aload_2         
	//   28   55:invokevirtual   #95  <Method void MessageFactory.release(Message)>
			}
		} while(true);
	//   29   58:goto            25
		JqLog.d("[%s] finished queue", new Object[] {
			logTag
		});
	//   30   61:ldc1            #97  <String "[%s] finished queue">
	//   31   63:iconst_1        
	//   32   64:anewarray       Object[]
	//   33   67:dup             
	//   34   68:iconst_0        
	//   35   69:aload_0         
	//   36   70:getfield        #101 <Field String logTag>
	//   37   73:aastore         
	//   38   74:invokestatic    #107 <Method void JqLog.d(String, Object[])>
	//   39   77:return          
	}

	public boolean isRunning()
	{
		return running.get();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field AtomicBoolean running>
	//    2    4:invokevirtual   #82  <Method boolean AtomicBoolean.get()>
	//    3    7:ireturn         
	}

	Message next(MessageQueueConsumer messagequeueconsumer)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
_L2:
		if(!running.get())
			break MISSING_BLOCK_LABEL_260;
	//    2    2:aload_0         
	//    3    3:getfield        #37  <Field AtomicBoolean running>
	//    4    6:invokevirtual   #82  <Method boolean AtomicBoolean.get()>
	//    5    9:ifeq            260
		obj = LOCK;
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field Object LOCK>
	//    8   16:astore          7
		obj;
	//    9   18:aload           7
		JVM INSTR monitorenter ;
	//   10   20:monitorenter    
		long l;
		Long long1;
		Message message;
		l = timer.nanoTime();
	//   11   21:aload_0         
	//   12   22:getfield        #43  <Field Timer timer>
	//   13   25:invokeinterface #116 <Method long Timer.nanoTime()>
	//   14   30:lstore          4
		long1 = delayedBag.flushReadyMessages(l, ((MessageQueue) (this)));
	//   15   32:aload_0         
	//   16   33:getfield        #50  <Field DelayedMessageBag delayedBag>
	//   17   36:lload           4
	//   18   38:aload_0         
	//   19   39:invokevirtual   #120 <Method Long DelayedMessageBag.flushReadyMessages(long, MessageQueue)>
	//   20   42:astore          8
		message = super.next();
	//   21   44:aload_0         
	//   22   45:invokespecial   #123 <Method Message UnsafeMessageQueue.next()>
	//   23   48:astore          9
		if(message == null)
			break MISSING_BLOCK_LABEL_61;
	//   24   50:aload           9
	//   25   52:ifnull          61
		obj;
	//   26   55:aload           7
		JVM INSTR monitorexit ;
	//   27   57:monitorexit     
		return message;
	//   28   58:aload           9
	//   29   60:areturn         
		postMessageTick = false;
	//   30   61:aload_0         
	//   31   62:iconst_0        
	//   32   63:putfield        #39  <Field boolean postMessageTick>
		obj;
	//   33   66:aload           7
		JVM INSTR monitorexit ;
	//   34   68:monitorexit     
		boolean flag1;
		flag1 = flag;
	//   35   69:iload_2         
	//   36   70:istore_3        
		if(!flag)
	//*  37   71:iload_2         
	//*  38   72:ifne            81
		{
			messagequeueconsumer.onIdle();
	//   39   75:aload_1         
	//   40   76:invokevirtual   #126 <Method void MessageQueueConsumer.onIdle()>
			flag1 = true;
	//   41   79:iconst_1        
	//   42   80:istore_3        
		}
		synchronized(LOCK)
	//*  43   81:aload_0         
	//*  44   82:getfield        #30  <Field Object LOCK>
	//*  45   85:astore          7
	//*  46   87:aload           7
	//*  47   89:monitorenter    
		{
			if(!postMessageTick)
				break MISSING_BLOCK_LABEL_117;
	//   48   90:aload_0         
	//   49   91:getfield        #39  <Field boolean postMessageTick>
	//   50   94:ifeq            117
		}
	//   51   97:aload           7
	//   52   99:monitorexit     
		flag = flag1;
	//   53  100:iload_3         
	//   54  101:istore_2        
		continue; /* Loop/switch isn't completed */
	//   55  102:goto            2
		messagequeueconsumer;
	//   56  105:astore_1        
		obj;
	//   57  106:aload           7
		JVM INSTR monitorexit ;
	//   58  108:monitorexit     
		throw messagequeueconsumer;
	//   59  109:aload_1         
	//   60  110:athrow          
		messagequeueconsumer;
	//   61  111:astore_1        
		obj;
	//   62  112:aload           7
		JVM INSTR monitorexit ;
	//   63  114:monitorexit     
		throw messagequeueconsumer;
	//   64  115:aload_1         
	//   65  116:athrow          
		if(long1 == null)
			break MISSING_BLOCK_LABEL_157;
	//   66  117:aload           8
	//   67  119:ifnull          157
		if(long1.longValue() > l)
			break MISSING_BLOCK_LABEL_157;
	//   68  122:aload           8
	//   69  124:invokevirtual   #131 <Method long Long.longValue()>
	//   70  127:lload           4
	//   71  129:lcmp            
	//   72  130:ifgt            157
		JqLog.d("[%s] next message is ready, requery", new Object[] {
			logTag
		});
	//   73  133:ldc1            #133 <String "[%s] next message is ready, requery">
	//   74  135:iconst_1        
	//   75  136:anewarray       Object[]
	//   76  139:dup             
	//   77  140:iconst_0        
	//   78  141:aload_0         
	//   79  142:getfield        #101 <Field String logTag>
	//   80  145:aastore         
	//   81  146:invokestatic    #107 <Method void JqLog.d(String, Object[])>
		obj;
	//   82  149:aload           7
		JVM INSTR monitorexit ;
	//   83  151:monitorexit     
		flag = flag1;
	//   84  152:iload_3         
	//   85  153:istore_2        
		continue; /* Loop/switch isn't completed */
	//   86  154:goto            2
		boolean flag2 = running.get();
	//   87  157:aload_0         
	//   88  158:getfield        #37  <Field AtomicBoolean running>
	//   89  161:invokevirtual   #82  <Method boolean AtomicBoolean.get()>
	//   90  164:istore          6
		if(!flag2)
			break MISSING_BLOCK_LABEL_205;
	//   91  166:iload           6
	//   92  168:ifeq            205
		if(long1 != null)
			break MISSING_BLOCK_LABEL_213;
	//   93  171:aload           8
	//   94  173:ifnonnull       213
		try
		{
			JqLog.d("[%s] will wait on the lock forever", new Object[] {
				logTag
			});
	//   95  176:ldc1            #135 <String "[%s] will wait on the lock forever">
	//   96  178:iconst_1        
	//   97  179:anewarray       Object[]
	//   98  182:dup             
	//   99  183:iconst_0        
	//  100  184:aload_0         
	//  101  185:getfield        #101 <Field String logTag>
	//  102  188:aastore         
	//  103  189:invokestatic    #107 <Method void JqLog.d(String, Object[])>
			timer.waitOnObject(LOCK);
	//  104  192:aload_0         
	//  105  193:getfield        #43  <Field Timer timer>
	//  106  196:aload_0         
	//  107  197:getfield        #30  <Field Object LOCK>
	//  108  200:invokeinterface #139 <Method void Timer.waitOnObject(Object)>
		}
	//* 109  205:aload           7
	//* 110  207:monitorexit     
	//* 111  208:iload_3         
	//* 112  209:istore_2        
	//* 113  210:goto            2
	//* 114  213:ldc1            #141 <String "[%s] will wait on the lock until %d">
	//* 115  215:iconst_2        
	//* 116  216:anewarray       Object[]
	//* 117  219:dup             
	//* 118  220:iconst_0        
	//* 119  221:aload_0         
	//* 120  222:getfield        #101 <Field String logTag>
	//* 121  225:aastore         
	//* 122  226:dup             
	//* 123  227:iconst_1        
	//* 124  228:aload           8
	//* 125  230:aastore         
	//* 126  231:invokestatic    #107 <Method void JqLog.d(String, Object[])>
	//* 127  234:aload_0         
	//* 128  235:getfield        #43  <Field Timer timer>
	//* 129  238:aload_0         
	//* 130  239:getfield        #30  <Field Object LOCK>
	//* 131  242:aload           8
	//* 132  244:invokevirtual   #131 <Method long Long.longValue()>
	//* 133  247:invokeinterface #145 <Method void Timer.waitOnObjectUntilNs(Object, long)>
	//* 134  252:goto            205
		catch(InterruptedException interruptedexception) { }
	//  135  255:astore          8
		obj;
		JVM INSTR monitorexit ;
		flag = flag1;
		continue; /* Loop/switch isn't completed */
		JqLog.d("[%s] will wait on the lock until %d", new Object[] {
			logTag, long1
		});
		timer.waitOnObjectUntilNs(LOCK, long1.longValue());
		break MISSING_BLOCK_LABEL_205;
	//* 136  257:goto            205
		return null;
	//  137  260:aconst_null     
	//  138  261:areturn         
		if(true) goto _L2; else goto _L1
_L1:
	}

	public void post(Message message)
	{
		synchronized(LOCK)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field Object LOCK>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			postMessageTick = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #39  <Field boolean postMessageTick>
			super.post(message);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokespecial   #148 <Method void UnsafeMessageQueue.post(Message)>
			timer.notifyObject(LOCK);
	//   11   17:aload_0         
	//   12   18:getfield        #43  <Field Timer timer>
	//   13   21:aload_0         
	//   14   22:getfield        #30  <Field Object LOCK>
	//   15   25:invokeinterface #151 <Method void Timer.notifyObject(Object)>
		}
	//   16   30:aload_2         
	//   17   31:monitorexit     
		return;
	//   18   32:return          
		message;
	//   19   33:astore_1        
		obj;
	//   20   34:aload_2         
		JVM INSTR monitorexit ;
	//   21   35:monitorexit     
		throw message;
	//   22   36:aload_1         
	//   23   37:athrow          
	}

	public void postAt(Message message, long l)
	{
		synchronized(LOCK)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field Object LOCK>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			postMessageTick = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #39  <Field boolean postMessageTick>
			delayedBag.add(message, l);
	//    8   14:aload_0         
	//    9   15:getfield        #50  <Field DelayedMessageBag delayedBag>
	//   10   18:aload_1         
	//   11   19:lload_2         
	//   12   20:invokevirtual   #156 <Method void DelayedMessageBag.add(Message, long)>
			timer.notifyObject(LOCK);
	//   13   23:aload_0         
	//   14   24:getfield        #43  <Field Timer timer>
	//   15   27:aload_0         
	//   16   28:getfield        #30  <Field Object LOCK>
	//   17   31:invokeinterface #151 <Method void Timer.notifyObject(Object)>
		}
	//   18   36:aload           4
	//   19   38:monitorexit     
		return;
	//   20   39:return          
		message;
	//   21   40:astore_1        
		obj;
	//   22   41:aload           4
		JVM INSTR monitorexit ;
	//   23   43:monitorexit     
		throw message;
	//   24   44:aload_1         
	//   25   45:athrow          
	}

	public void postAtFront(Message message)
	{
		synchronized(LOCK)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field Object LOCK>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			postMessageTick = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #39  <Field boolean postMessageTick>
			super.postAtFront(message);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokespecial   #159 <Method void UnsafeMessageQueue.postAtFront(Message)>
			timer.notifyObject(LOCK);
	//   11   17:aload_0         
	//   12   18:getfield        #43  <Field Timer timer>
	//   13   21:aload_0         
	//   14   22:getfield        #30  <Field Object LOCK>
	//   15   25:invokeinterface #151 <Method void Timer.notifyObject(Object)>
		}
	//   16   30:aload_2         
	//   17   31:monitorexit     
		return;
	//   18   32:return          
		message;
	//   19   33:astore_1        
		obj;
	//   20   34:aload_2         
		JVM INSTR monitorexit ;
	//   21   35:monitorexit     
		throw message;
	//   22   36:aload_1         
	//   23   37:athrow          
	}

	public void stop()
	{
		running.set(false);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field AtomicBoolean running>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #163 <Method void AtomicBoolean.set(boolean)>
		synchronized(LOCK)
	//*   4    8:aload_0         
	//*   5    9:getfield        #30  <Field Object LOCK>
	//*   6   12:astore_1        
	//*   7   13:aload_1         
	//*   8   14:monitorenter    
		{
			timer.notifyObject(LOCK);
	//    9   15:aload_0         
	//   10   16:getfield        #43  <Field Timer timer>
	//   11   19:aload_0         
	//   12   20:getfield        #30  <Field Object LOCK>
	//   13   23:invokeinterface #151 <Method void Timer.notifyObject(Object)>
		}
	//   14   28:aload_1         
	//   15   29:monitorexit     
		return;
	//   16   30:return          
		exception;
	//   17   31:astore_2        
		obj;
	//   18   32:aload_1         
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		throw exception;
	//   20   34:aload_2         
	//   21   35:athrow          
	}

	private final Object LOCK = new Object();
	private final DelayedMessageBag delayedBag;
	private final MessageFactory factory;
	private boolean postMessageTick;
	private final AtomicBoolean running = new AtomicBoolean(false);
	private final Timer timer;
}
