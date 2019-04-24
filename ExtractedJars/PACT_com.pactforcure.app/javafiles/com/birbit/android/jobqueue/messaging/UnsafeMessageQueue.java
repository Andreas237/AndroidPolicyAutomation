// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.messaging;

import com.birbit.android.jobqueue.log.JqLog;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.birbit.android.jobqueue.messaging:
//			Message, MessageFactory, MessagePredicate

class UnsafeMessageQueue
{

	public UnsafeMessageQueue(MessageFactory messagefactory, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		queue = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #29  <Field Message queue>
		tail = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #31  <Field Message tail>
		factory = messagefactory;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #33  <Field MessageFactory factory>
		logTag = (new StringBuilder()).append(s).append("_").append(idCounter.incrementAndGet()).toString();
	//   11   19:aload_0         
	//   12   20:new             #35  <Class StringBuilder>
	//   13   23:dup             
	//   14   24:invokespecial   #36  <Method void StringBuilder()>
	//   15   27:aload_2         
	//   16   28:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   17   31:ldc1            #42  <String "_">
	//   18   33:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   19   36:getstatic       #23  <Field AtomicInteger idCounter>
	//   20   39:invokevirtual   #46  <Method int AtomicInteger.incrementAndGet()>
	//   21   42:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   22   45:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   23   48:putfield        #55  <Field String logTag>
	//   24   51:return          
	}

	private void remove(Message message, Message message1)
	{
		if(tail == message1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Message tail>
	//*   2    4:aload_2         
	//*   3    5:if_acmpne       13
			tail = message;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #31  <Field Message tail>
		if(message == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       34
			queue = message1.next;
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:getfield        #62  <Field Message Message.next>
	//   12   22:putfield        #29  <Field Message queue>
		else
	//*  13   25:aload_0         
	//*  14   26:getfield        #33  <Field MessageFactory factory>
	//*  15   29:aload_2         
	//*  16   30:invokevirtual   #68  <Method void MessageFactory.release(Message)>
	//*  17   33:return          
			message.next = message1.next;
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:getfield        #62  <Field Message Message.next>
	//   21   39:putfield        #62  <Field Message Message.next>
		factory.release(message1);
	//*  22   42:goto            25
	}

	public void clear()
	{
		while(queue != null) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field Message queue>
	//*   2    4:ifnull          31
		{
			Message message = queue;
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field Message queue>
	//    5   11:astore_1        
			queue = message.next;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #62  <Field Message Message.next>
	//    9   17:putfield        #29  <Field Message queue>
			factory.release(message);
	//   10   20:aload_0         
	//   11   21:getfield        #33  <Field MessageFactory factory>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #68  <Method void MessageFactory.release(Message)>
		}
	//*  14   28:goto            0
		tail = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #31  <Field Message tail>
	//   18   36:return          
	}

	Message next()
	{
		Message message = queue;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Message queue>
	//    2    4:astore_1        
		JqLog.d("[%s] remove message %s", new Object[] {
			logTag, message
		});
	//    3    5:ldc1            #72  <String "[%s] remove message %s">
	//    4    7:iconst_2        
	//    5    8:anewarray       Object[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:aload_0         
	//    9   14:getfield        #55  <Field String logTag>
	//   10   17:aastore         
	//   11   18:dup             
	//   12   19:iconst_1        
	//   13   20:aload_1         
	//   14   21:aastore         
	//   15   22:invokestatic    #78  <Method void JqLog.d(String, Object[])>
		if(message != null)
	//*  16   25:aload_1         
	//*  17   26:ifnull          50
		{
			queue = message.next;
	//   18   29:aload_0         
	//   19   30:aload_1         
	//   20   31:getfield        #62  <Field Message Message.next>
	//   21   34:putfield        #29  <Field Message queue>
			if(tail == message)
	//*  22   37:aload_0         
	//*  23   38:getfield        #31  <Field Message tail>
	//*  24   41:aload_1         
	//*  25   42:if_acmpne       50
				tail = null;
	//   26   45:aload_0         
	//   27   46:aconst_null     
	//   28   47:putfield        #31  <Field Message tail>
		}
		return message;
	//   29   50:aload_1         
	//   30   51:areturn         
	}

	protected void post(Message message)
	{
		JqLog.d("[%s] post message %s", new Object[] {
			logTag, message
		});
	//    0    0:ldc1            #81  <String "[%s] post message %s">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #55  <Field String logTag>
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:aload_1         
	//   11   16:aastore         
	//   12   17:invokestatic    #78  <Method void JqLog.d(String, Object[])>
		if(tail == null)
	//*  13   20:aload_0         
	//*  14   21:getfield        #31  <Field Message tail>
	//*  15   24:ifnonnull       38
		{
			queue = message;
	//   16   27:aload_0         
	//   17   28:aload_1         
	//   18   29:putfield        #29  <Field Message queue>
			tail = message;
	//   19   32:aload_0         
	//   20   33:aload_1         
	//   21   34:putfield        #31  <Field Message tail>
			return;
	//   22   37:return          
		} else
		{
			tail.next = message;
	//   23   38:aload_0         
	//   24   39:getfield        #31  <Field Message tail>
	//   25   42:aload_1         
	//   26   43:putfield        #62  <Field Message Message.next>
			tail = message;
	//   27   46:aload_0         
	//   28   47:aload_1         
	//   29   48:putfield        #31  <Field Message tail>
			return;
	//   30   51:return          
		}
	}

	protected void postAtFront(Message message)
	{
		message.next = queue;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #29  <Field Message queue>
	//    3    5:putfield        #62  <Field Message Message.next>
		if(tail == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #31  <Field Message tail>
	//*   6   12:ifnonnull       20
			tail = message;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #31  <Field Message tail>
		queue = message;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #29  <Field Message queue>
	//   13   25:return          
	}

	protected void removeMessages(MessagePredicate messagepredicate)
	{
		Message message1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		for(Message message = queue; message != null;)
	//*   2    2:aload_0         
	//*   3    3:getfield        #29  <Field Message queue>
	//*   4    6:astore_2        
	//*   5    7:aload_2         
	//*   6    8:ifnull          49
			if(messagepredicate.onMessage(message))
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:invokeinterface #90  <Method boolean MessagePredicate.onMessage(Message)>
	//*  10   18:ifeq            39
			{
				Message message2 = message.next;
	//   11   21:aload_2         
	//   12   22:getfield        #62  <Field Message Message.next>
	//   13   25:astore          4
				remove(message1, message);
	//   14   27:aload_0         
	//   15   28:aload_3         
	//   16   29:aload_2         
	//   17   30:invokespecial   #92  <Method void remove(Message, Message)>
				message = message2;
	//   18   33:aload           4
	//   19   35:astore_2        
			} else
	//*  20   36:goto            7
			{
				message1 = message;
	//   21   39:aload_2         
	//   22   40:astore_3        
				message = message.next;
	//   23   41:aload_2         
	//   24   42:getfield        #62  <Field Message Message.next>
	//   25   45:astore_2        
			}

	//*  26   46:goto            7
	//   27   49:return          
	}

	private static final AtomicInteger idCounter = new AtomicInteger(0);
	private final MessageFactory factory;
	public final String logTag;
	private Message queue;
	private Message tail;

	static 
	{
	//    0    0:new             #17  <Class AtomicInteger>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #21  <Method void AtomicInteger(int)>
	//    4    8:putstatic       #23  <Field AtomicInteger idCounter>
	//*   5   11:return          
	}
}
