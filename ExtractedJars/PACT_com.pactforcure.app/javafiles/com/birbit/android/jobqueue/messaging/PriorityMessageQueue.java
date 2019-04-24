// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.messaging;

import com.birbit.android.jobqueue.log.JqLog;
import com.birbit.android.jobqueue.timer.Timer;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.birbit.android.jobqueue.messaging:
//			MessageQueue, DelayedMessageBag, Type, UnsafeMessageQueue, 
//			Message, MessageQueueConsumer, MessageFactory, MessagePredicate

public class PriorityMessageQueue
	implements MessageQueue
{

	public PriorityMessageQueue(Timer timer1, MessageFactory messagefactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void Object()>
	//    6   12:putfield        #31  <Field Object LOCK>
	//    7   15:aload_0         
	//    8   16:new             #33  <Class AtomicBoolean>
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:invokespecial   #36  <Method void AtomicBoolean(boolean)>
	//   12   24:putfield        #38  <Field AtomicBoolean running>
		postJobTick = false;
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:putfield        #40  <Field boolean postJobTick>
		delayedBag = new DelayedMessageBag(messagefactory);
	//   16   32:aload_0         
	//   17   33:new             #42  <Class DelayedMessageBag>
	//   18   36:dup             
	//   19   37:aload_2         
	//   20   38:invokespecial   #45  <Method void DelayedMessageBag(MessageFactory)>
	//   21   41:putfield        #47  <Field DelayedMessageBag delayedBag>
		factory = messagefactory;
	//   22   44:aload_0         
	//   23   45:aload_2         
	//   24   46:putfield        #49  <Field MessageFactory factory>
		queues = new UnsafeMessageQueue[Type.MAX_PRIORITY + 1];
	//   25   49:aload_0         
	//   26   50:getstatic       #55  <Field int Type.MAX_PRIORITY>
	//   27   53:iconst_1        
	//   28   54:iadd            
	//   29   55:anewarray       UnsafeMessageQueue[]
	//   30   58:putfield        #59  <Field UnsafeMessageQueue[] queues>
		timer = timer1;
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:putfield        #61  <Field Timer timer>
	//   34   66:return          
	}

	public void cancelMessages(MessagePredicate messagepredicate)
	{
		Object obj = LOCK;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Object LOCK>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		int i = 0;
	//    5    7:iconst_0        
	//    6    8:istore_2        
_L2:
		UnsafeMessageQueue unsafemessagequeue;
		if(i > Type.MAX_PRIORITY)
			break MISSING_BLOCK_LABEL_46;
	//    7    9:iload_2         
	//    8   10:getstatic       #55  <Field int Type.MAX_PRIORITY>
	//    9   13:icmpgt          46
		unsafemessagequeue = queues[i];
	//   10   16:aload_0         
	//   11   17:getfield        #59  <Field UnsafeMessageQueue[] queues>
	//   12   20:iload_2         
	//   13   21:aaload          
	//   14   22:astore          4
		if(unsafemessagequeue == null)
	//*  15   24:aload           4
	//*  16   26:ifnonnull       32
			break MISSING_BLOCK_LABEL_57;
	//   17   29:goto            57
		unsafemessagequeue.removeMessages(messagepredicate);
	//   18   32:aload           4
	//   19   34:aload_1         
	//   20   35:invokevirtual   #67  <Method void UnsafeMessageQueue.removeMessages(MessagePredicate)>
		break MISSING_BLOCK_LABEL_57;
	//   21   38:goto            57
		messagepredicate;
	//   22   41:astore_1        
		obj;
	//   23   42:aload_3         
		JVM INSTR monitorexit ;
	//   24   43:monitorexit     
		throw messagepredicate;
	//   25   44:aload_1         
	//   26   45:athrow          
		delayedBag.removeMessages(messagepredicate);
	//   27   46:aload_0         
	//   28   47:getfield        #47  <Field DelayedMessageBag delayedBag>
	//   29   50:aload_1         
	//   30   51:invokevirtual   #68  <Method void DelayedMessageBag.removeMessages(MessagePredicate)>
		obj;
	//   31   54:aload_3         
		JVM INSTR monitorexit ;
	//   32   55:monitorexit     
		return;
	//   33   56:return          
		i++;
	//   34   57:iload_2         
	//   35   58:iconst_1        
	//   36   59:iadd            
	//   37   60:istore_2        
		if(true) goto _L2; else goto _L1
	//   38   61:goto            9
_L1:
	}

	public void clear()
	{
		Object obj = LOCK;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Object LOCK>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		int i = Type.MAX_PRIORITY;
	//    5    7:getstatic       #55  <Field int Type.MAX_PRIORITY>
	//    6   10:istore_1        
_L2:
		if(i < 0)
			break MISSING_BLOCK_LABEL_41;
	//    7   11:iload_1         
	//    8   12:iflt            41
		UnsafeMessageQueue unsafemessagequeue = queues[i];
	//    9   15:aload_0         
	//   10   16:getfield        #59  <Field UnsafeMessageQueue[] queues>
	//   11   19:iload_1         
	//   12   20:aaload          
	//   13   21:astore_3        
		if(unsafemessagequeue == null)
	//*  14   22:aload_3         
	//*  15   23:ifnonnull       29
			break MISSING_BLOCK_LABEL_44;
	//   16   26:goto            44
		unsafemessagequeue.clear();
	//   17   29:aload_3         
	//   18   30:invokevirtual   #71  <Method void UnsafeMessageQueue.clear()>
		break MISSING_BLOCK_LABEL_44;
	//   19   33:goto            44
		Exception exception;
		exception;
	//   20   36:astore_3        
		obj;
	//   21   37:aload_2         
		JVM INSTR monitorexit ;
	//   22   38:monitorexit     
		throw exception;
	//   23   39:aload_3         
	//   24   40:athrow          
		obj;
	//   25   41:aload_2         
		JVM INSTR monitorexit ;
	//   26   42:monitorexit     
		return;
	//   27   43:return          
		i--;
	//   28   44:iload_1         
	//   29   45:iconst_1        
	//   30   46:isub            
	//   31   47:istore_1        
		if(true) goto _L2; else goto _L1
	//   32   48:goto            11
_L1:
	}

	public void consume(MessageQueueConsumer messagequeueconsumer)
	{
		if(running.getAndSet(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field AtomicBoolean running>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #77  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifeq            21
			throw new IllegalStateException("only 1 consumer per MQ");
	//    5   11:new             #79  <Class IllegalStateException>
	//    6   14:dup             
	//    7   15:ldc1            #81  <String "only 1 consumer per MQ">
	//    8   17:invokespecial   #84  <Method void IllegalStateException(String)>
	//    9   20:athrow          
		do
		{
			if(!running.get())
				break;
	//   10   21:aload_0         
	//   11   22:getfield        #38  <Field AtomicBoolean running>
	//   12   25:invokevirtual   #88  <Method boolean AtomicBoolean.get()>
	//   13   28:ifeq            78
			Message message = next(messagequeueconsumer);
	//   14   31:aload_0         
	//   15   32:aload_1         
	//   16   33:invokevirtual   #92  <Method Message next(MessageQueueConsumer)>
	//   17   36:astore_2        
			if(message != null)
	//*  18   37:aload_2         
	//*  19   38:ifnull          21
			{
				JqLog.d("[%s] consuming message of type %s", new Object[] {
					"priority_mq", message.type
				});
	//   20   41:ldc1            #94  <String "[%s] consuming message of type %s">
	//   21   43:iconst_2        
	//   22   44:anewarray       Object[]
	//   23   47:dup             
	//   24   48:iconst_0        
	//   25   49:ldc1            #10  <String "priority_mq">
	//   26   51:aastore         
	//   27   52:dup             
	//   28   53:iconst_1        
	//   29   54:aload_2         
	//   30   55:getfield        #100 <Field Type Message.type>
	//   31   58:aastore         
	//   32   59:invokestatic    #106 <Method void JqLog.d(String, Object[])>
				messagequeueconsumer.handleMessage(message);
	//   33   62:aload_1         
	//   34   63:aload_2         
	//   35   64:invokevirtual   #112 <Method void MessageQueueConsumer.handleMessage(Message)>
				factory.release(message);
	//   36   67:aload_0         
	//   37   68:getfield        #49  <Field MessageFactory factory>
	//   38   71:aload_2         
	//   39   72:invokevirtual   #117 <Method void MessageFactory.release(Message)>
			}
		} while(true);
	//   40   75:goto            21
	//   41   78:return          
	}

	public Message next(MessageQueueConsumer messagequeueconsumer)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
_L3:
		if(!running.get()) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #38  <Field AtomicBoolean running>
	//    4    6:invokevirtual   #88  <Method boolean AtomicBoolean.get()>
	//    5    9:ifeq            297
_L1:
		obj = LOCK;
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field Object LOCK>
	//    8   16:astore          7
		obj;
	//    9   18:aload           7
		JVM INSTR monitorenter ;
	//   10   20:monitorenter    
		int j;
		long l;
		Long long1;
		l = timer.nanoTime();
	//   11   21:aload_0         
	//   12   22:getfield        #61  <Field Timer timer>
	//   13   25:invokeinterface #125 <Method long Timer.nanoTime()>
	//   14   30:lstore          4
		JqLog.d("[%s] looking for next message at time %s", new Object[] {
			"priority_mq", Long.valueOf(l)
		});
	//   15   32:ldc1            #127 <String "[%s] looking for next message at time %s">
	//   16   34:iconst_2        
	//   17   35:anewarray       Object[]
	//   18   38:dup             
	//   19   39:iconst_0        
	//   20   40:ldc1            #10  <String "priority_mq">
	//   21   42:aastore         
	//   22   43:dup             
	//   23   44:iconst_1        
	//   24   45:lload           4
	//   25   47:invokestatic    #133 <Method Long Long.valueOf(long)>
	//   26   50:aastore         
	//   27   51:invokestatic    #106 <Method void JqLog.d(String, Object[])>
		long1 = delayedBag.flushReadyMessages(l, ((MessageQueue) (this)));
	//   28   54:aload_0         
	//   29   55:getfield        #47  <Field DelayedMessageBag delayedBag>
	//   30   58:lload           4
	//   31   60:aload_0         
	//   32   61:invokevirtual   #137 <Method Long DelayedMessageBag.flushReadyMessages(long, MessageQueue)>
	//   33   64:astore          8
		JqLog.d("[%s] next delayed job %s", new Object[] {
			"priority_mq", long1
		});
	//   34   66:ldc1            #139 <String "[%s] next delayed job %s">
	//   35   68:iconst_2        
	//   36   69:anewarray       Object[]
	//   37   72:dup             
	//   38   73:iconst_0        
	//   39   74:ldc1            #10  <String "priority_mq">
	//   40   76:aastore         
	//   41   77:dup             
	//   42   78:iconst_1        
	//   43   79:aload           8
	//   44   81:aastore         
	//   45   82:invokestatic    #106 <Method void JqLog.d(String, Object[])>
		j = Type.MAX_PRIORITY;
	//   46   85:getstatic       #55  <Field int Type.MAX_PRIORITY>
	//   47   88:istore_3        
_L4:
		if(j < 0)
			break MISSING_BLOCK_LABEL_127;
	//   48   89:iload_3         
	//   49   90:iflt            127
		Object obj1 = ((Object) (queues[j]));
	//   50   93:aload_0         
	//   51   94:getfield        #59  <Field UnsafeMessageQueue[] queues>
	//   52   97:iload_3         
	//   53   98:aaload          
	//   54   99:astore          9
		if(obj1 == null)
	//*  55  101:aload           9
	//*  56  103:ifnonnull       109
			break MISSING_BLOCK_LABEL_299;
	//   57  106:goto            299
		obj1 = ((Object) (((UnsafeMessageQueue) (obj1)).next()));
	//   58  109:aload           9
	//   59  111:invokevirtual   #142 <Method Message UnsafeMessageQueue.next()>
	//   60  114:astore          9
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_299;
	//   61  116:aload           9
	//   62  118:ifnull          299
		obj;
	//   63  121:aload           7
		JVM INSTR monitorexit ;
	//   64  123:monitorexit     
		return ((Message) (obj1));
	//   65  124:aload           9
	//   66  126:areturn         
		postJobTick = false;
	//   67  127:aload_0         
	//   68  128:iconst_0        
	//   69  129:putfield        #40  <Field boolean postJobTick>
		obj;
	//   70  132:aload           7
		JVM INSTR monitorexit ;
	//   71  134:monitorexit     
		j = i;
	//   72  135:iload_2         
	//   73  136:istore_3        
		if(i == 0)
	//*  74  137:iload_2         
	//*  75  138:ifne            147
		{
			messagequeueconsumer.onIdle();
	//   76  141:aload_1         
	//   77  142:invokevirtual   #145 <Method void MessageQueueConsumer.onIdle()>
			j = 1;
	//   78  145:iconst_1        
	//   79  146:istore_3        
		}
		synchronized(LOCK)
	//*  80  147:aload_0         
	//*  81  148:getfield        #31  <Field Object LOCK>
	//*  82  151:astore          7
	//*  83  153:aload           7
	//*  84  155:monitorenter    
		{
			JqLog.d("[%s] did on idle post a message? %s", new Object[] {
				"priority_mq", Boolean.valueOf(postJobTick)
			});
	//   85  156:ldc1            #147 <String "[%s] did on idle post a message? %s">
	//   86  158:iconst_2        
	//   87  159:anewarray       Object[]
	//   88  162:dup             
	//   89  163:iconst_0        
	//   90  164:ldc1            #10  <String "priority_mq">
	//   91  166:aastore         
	//   92  167:dup             
	//   93  168:iconst_1        
	//   94  169:aload_0         
	//   95  170:getfield        #40  <Field boolean postJobTick>
	//   96  173:invokestatic    #152 <Method Boolean Boolean.valueOf(boolean)>
	//   97  176:aastore         
	//   98  177:invokestatic    #106 <Method void JqLog.d(String, Object[])>
			if(!postJobTick)
				break MISSING_BLOCK_LABEL_207;
	//   99  180:aload_0         
	//  100  181:getfield        #40  <Field boolean postJobTick>
	//  101  184:ifeq            207
		}
	//  102  187:aload           7
	//  103  189:monitorexit     
		i = j;
	//  104  190:iload_3         
	//  105  191:istore_2        
		  goto _L3
	//* 106  192:goto            2
		messagequeueconsumer;
	//  107  195:astore_1        
		obj;
	//  108  196:aload           7
		JVM INSTR monitorexit ;
	//  109  198:monitorexit     
		throw messagequeueconsumer;
	//  110  199:aload_1         
	//  111  200:athrow          
		messagequeueconsumer;
	//  112  201:astore_1        
		obj;
	//  113  202:aload           7
		JVM INSTR monitorexit ;
	//  114  204:monitorexit     
		throw messagequeueconsumer;
	//  115  205:aload_1         
	//  116  206:athrow          
		if(long1 == null)
			break MISSING_BLOCK_LABEL_231;
	//  117  207:aload           8
	//  118  209:ifnull          231
		if(long1.longValue() > l)
			break MISSING_BLOCK_LABEL_231;
	//  119  212:aload           8
	//  120  214:invokevirtual   #155 <Method long Long.longValue()>
	//  121  217:lload           4
	//  122  219:lcmp            
	//  123  220:ifgt            231
		obj;
	//  124  223:aload           7
		JVM INSTR monitorexit ;
	//  125  225:monitorexit     
		i = j;
	//  126  226:iload_3         
	//  127  227:istore_2        
		  goto _L3
	//* 128  228:goto            2
		boolean flag = running.get();
	//  129  231:aload_0         
	//  130  232:getfield        #38  <Field AtomicBoolean running>
	//  131  235:invokevirtual   #88  <Method boolean AtomicBoolean.get()>
	//  132  238:istore          6
		if(!flag)
			break MISSING_BLOCK_LABEL_263;
	//  133  240:iload           6
	//  134  242:ifeq            263
		if(long1 != null)
			break MISSING_BLOCK_LABEL_271;
	//  135  245:aload           8
	//  136  247:ifnonnull       271
		try
		{
			timer.waitOnObject(LOCK);
	//  137  250:aload_0         
	//  138  251:getfield        #61  <Field Timer timer>
	//  139  254:aload_0         
	//  140  255:getfield        #31  <Field Object LOCK>
	//  141  258:invokeinterface #159 <Method void Timer.waitOnObject(Object)>
		}
	//* 142  263:aload           7
	//* 143  265:monitorexit     
	//* 144  266:iload_3         
	//* 145  267:istore_2        
	//* 146  268:goto            2
	//* 147  271:aload_0         
	//* 148  272:getfield        #61  <Field Timer timer>
	//* 149  275:aload_0         
	//* 150  276:getfield        #31  <Field Object LOCK>
	//* 151  279:aload           8
	//* 152  281:invokevirtual   #155 <Method long Long.longValue()>
	//* 153  284:invokeinterface #163 <Method void Timer.waitOnObjectUntilNs(Object, long)>
	//* 154  289:goto            263
		catch(InterruptedException interruptedexception) { }
	//  155  292:astore          8
		obj;
		JVM INSTR monitorexit ;
		i = j;
		  goto _L3
		timer.waitOnObjectUntilNs(LOCK, long1.longValue());
		break MISSING_BLOCK_LABEL_263;
	//* 156  294:goto            263
_L2:
		return null;
	//  157  297:aconst_null     
	//  158  298:areturn         
		  goto _L3
		j--;
	//  159  299:iload_3         
	//  160  300:iconst_1        
	//  161  301:isub            
	//  162  302:istore_3        
		  goto _L4
	//* 163  303:goto            89
	}

	public void post(Message message)
	{
		synchronized(LOCK)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Object LOCK>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			postJobTick = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #40  <Field boolean postJobTick>
			int i = message.type.priority;
	//    8   12:aload_1         
	//    9   13:getfield        #100 <Field Type Message.type>
	//   10   16:getfield        #167 <Field int Type.priority>
	//   11   19:istore_2        
			if(queues[i] == null)
	//*  12   20:aload_0         
	//*  13   21:getfield        #59  <Field UnsafeMessageQueue[] queues>
	//*  14   24:iload_2         
	//*  15   25:aaload          
	//*  16   26:ifnonnull       71
				queues[i] = new UnsafeMessageQueue(factory, (new StringBuilder()).append("queue_").append(message.type.name()).toString());
	//   17   29:aload_0         
	//   18   30:getfield        #59  <Field UnsafeMessageQueue[] queues>
	//   19   33:iload_2         
	//   20   34:new             #57  <Class UnsafeMessageQueue>
	//   21   37:dup             
	//   22   38:aload_0         
	//   23   39:getfield        #49  <Field MessageFactory factory>
	//   24   42:new             #169 <Class StringBuilder>
	//   25   45:dup             
	//   26   46:invokespecial   #170 <Method void StringBuilder()>
	//   27   49:ldc1            #172 <String "queue_">
	//   28   51:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   29   54:aload_1         
	//   30   55:getfield        #100 <Field Type Message.type>
	//   31   58:invokevirtual   #180 <Method String Type.name()>
	//   32   61:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   33   64:invokevirtual   #183 <Method String StringBuilder.toString()>
	//   34   67:invokespecial   #186 <Method void UnsafeMessageQueue(MessageFactory, String)>
	//   35   70:aastore         
			queues[i].post(message);
	//   36   71:aload_0         
	//   37   72:getfield        #59  <Field UnsafeMessageQueue[] queues>
	//   38   75:iload_2         
	//   39   76:aaload          
	//   40   77:aload_1         
	//   41   78:invokevirtual   #188 <Method void UnsafeMessageQueue.post(Message)>
			timer.notifyObject(LOCK);
	//   42   81:aload_0         
	//   43   82:getfield        #61  <Field Timer timer>
	//   44   85:aload_0         
	//   45   86:getfield        #31  <Field Object LOCK>
	//   46   89:invokeinterface #191 <Method void Timer.notifyObject(Object)>
		}
	//   47   94:aload_3         
	//   48   95:monitorexit     
		return;
	//   49   96:return          
		message;
	//   50   97:astore_1        
		obj;
	//   51   98:aload_3         
		JVM INSTR monitorexit ;
	//   52   99:monitorexit     
		throw message;
	//   53  100:aload_1         
	//   54  101:athrow          
	}

	public void postAt(Message message, long l)
	{
		synchronized(LOCK)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Object LOCK>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			postJobTick = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #40  <Field boolean postJobTick>
			delayedBag.add(message, l);
	//    8   14:aload_0         
	//    9   15:getfield        #47  <Field DelayedMessageBag delayedBag>
	//   10   18:aload_1         
	//   11   19:lload_2         
	//   12   20:invokevirtual   #196 <Method void DelayedMessageBag.add(Message, long)>
			timer.notifyObject(LOCK);
	//   13   23:aload_0         
	//   14   24:getfield        #61  <Field Timer timer>
	//   15   27:aload_0         
	//   16   28:getfield        #31  <Field Object LOCK>
	//   17   31:invokeinterface #191 <Method void Timer.notifyObject(Object)>
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

	public void stop()
	{
		running.set(false);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field AtomicBoolean running>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #200 <Method void AtomicBoolean.set(boolean)>
		synchronized(LOCK)
	//*   4    8:aload_0         
	//*   5    9:getfield        #31  <Field Object LOCK>
	//*   6   12:astore_1        
	//*   7   13:aload_1         
	//*   8   14:monitorenter    
		{
			timer.notifyObject(LOCK);
	//    9   15:aload_0         
	//   10   16:getfield        #61  <Field Timer timer>
	//   11   19:aload_0         
	//   12   20:getfield        #31  <Field Object LOCK>
	//   13   23:invokeinterface #191 <Method void Timer.notifyObject(Object)>
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

	private static final String LOG_TAG = "priority_mq";
	private final Object LOCK = new Object();
	private final DelayedMessageBag delayedBag;
	private final MessageFactory factory;
	private boolean postJobTick;
	private final UnsafeMessageQueue queues[];
	private final AtomicBoolean running = new AtomicBoolean(false);
	private final Timer timer;
}
