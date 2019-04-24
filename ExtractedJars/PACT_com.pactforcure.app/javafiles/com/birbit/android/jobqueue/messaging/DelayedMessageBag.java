// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.messaging;

import com.birbit.android.jobqueue.log.JqLog;

// Referenced classes of package com.birbit.android.jobqueue.messaging:
//			Message, MessageFactory, MessageQueue, MessagePredicate

class DelayedMessageBag
{

	DelayedMessageBag(MessageFactory messagefactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		queue = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #15  <Field Message queue>
		factory = messagefactory;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #17  <Field MessageFactory factory>
	//    8   14:return          
	}

	void add(Message message, long l)
	{
		JqLog.d("add delayed message %s at time %s", new Object[] {
			message, Long.valueOf(l)
		});
	//    0    0:ldc1            #22  <String "add delayed message %s at time %s">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_1         
	//    6    9:aastore         
	//    7   10:dup             
	//    8   11:iconst_1        
	//    9   12:lload_2         
	//   10   13:invokestatic    #28  <Method Long Long.valueOf(long)>
	//   11   16:aastore         
	//   12   17:invokestatic    #34  <Method void JqLog.d(String, Object[])>
		message.readyNs = l;
	//   13   20:aload_1         
	//   14   21:lload_2         
	//   15   22:putfield        #40  <Field long Message.readyNs>
		if(queue == null)
	//*  16   25:aload_0         
	//*  17   26:getfield        #15  <Field Message queue>
	//*  18   29:ifnonnull       38
		{
			queue = message;
	//   19   32:aload_0         
	//   20   33:aload_1         
	//   21   34:putfield        #15  <Field Message queue>
			return;
	//   22   37:return          
		}
		Message message2 = null;
	//   23   38:aconst_null     
	//   24   39:astore          5
		Message message1;
		for(message1 = queue; message1 != null && message1.readyNs <= l; message1 = message1.next)
	//*  25   41:aload_0         
	//*  26   42:getfield        #15  <Field Message queue>
	//*  27   45:astore          4
	//*  28   47:aload           4
	//*  29   49:ifnull          76
	//*  30   52:aload           4
	//*  31   54:getfield        #40  <Field long Message.readyNs>
	//*  32   57:lload_2         
	//*  33   58:lcmp            
	//*  34   59:ifgt            76
			message2 = message1;
	//   35   62:aload           4
	//   36   64:astore          5

	//   37   66:aload           4
	//   38   68:getfield        #43  <Field Message Message.next>
	//   39   71:astore          4
	//*  40   73:goto            47
		if(message2 == null)
	//*  41   76:aload           5
	//*  42   78:ifnonnull       95
		{
			message.next = queue;
	//   43   81:aload_1         
	//   44   82:aload_0         
	//   45   83:getfield        #15  <Field Message queue>
	//   46   86:putfield        #43  <Field Message Message.next>
			queue = message;
	//   47   89:aload_0         
	//   48   90:aload_1         
	//   49   91:putfield        #15  <Field Message queue>
			return;
	//   50   94:return          
		} else
		{
			message2.next = message;
	//   51   95:aload           5
	//   52   97:aload_1         
	//   53   98:putfield        #43  <Field Message Message.next>
			message.next = message1;
	//   54  101:aload_1         
	//   55  102:aload           4
	//   56  104:putfield        #43  <Field Message Message.next>
			return;
	//   57  107:return          
		}
	}

	public void clear()
	{
		while(queue != null) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field Message queue>
	//*   2    4:ifnull          31
		{
			Message message = queue;
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field Message queue>
	//    5   11:astore_1        
			queue = message.next;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #43  <Field Message Message.next>
	//    9   17:putfield        #15  <Field Message queue>
			factory.release(message);
	//   10   20:aload_0         
	//   11   21:getfield        #17  <Field MessageFactory factory>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #50  <Method void MessageFactory.release(Message)>
		}
	//*  14   28:goto            0
		queue = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #15  <Field Message queue>
	//   18   36:return          
	}

	Long flushReadyMessages(long l, MessageQueue messagequeue)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		JqLog.d("flushing messages at time %s", new Object[] {
			Long.valueOf(l)
		});
	//    2    3:ldc1            #54  <String "flushing messages at time %s">
	//    3    5:iconst_1        
	//    4    6:anewarray       Object[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:lload_1         
	//    8   12:invokestatic    #28  <Method Long Long.valueOf(long)>
	//    9   15:aastore         
	//   10   16:invokestatic    #34  <Method void JqLog.d(String, Object[])>
		while(queue != null && queue.readyNs <= l) 
	//*  11   19:aload_0         
	//*  12   20:getfield        #15  <Field Message queue>
	//*  13   23:ifnull          70
	//*  14   26:aload_0         
	//*  15   27:getfield        #15  <Field Message queue>
	//*  16   30:getfield        #40  <Field long Message.readyNs>
	//*  17   33:lload_1         
	//*  18   34:lcmp            
	//*  19   35:ifgt            70
		{
			Message message = queue;
	//   20   38:aload_0         
	//   21   39:getfield        #15  <Field Message queue>
	//   22   42:astore          5
			queue = message.next;
	//   23   44:aload_0         
	//   24   45:aload           5
	//   25   47:getfield        #43  <Field Message Message.next>
	//   26   50:putfield        #15  <Field Message queue>
			message.next = null;
	//   27   53:aload           5
	//   28   55:aconst_null     
	//   29   56:putfield        #43  <Field Message Message.next>
			messagequeue.post(message);
	//   30   59:aload_3         
	//   31   60:aload           5
	//   32   62:invokeinterface #59  <Method void MessageQueue.post(Message)>
		}
	//*  33   67:goto            19
		messagequeue = ((MessageQueue) (obj));
	//   34   70:aload           4
	//   35   72:astore_3        
		if(queue != null)
	//*  36   73:aload_0         
	//*  37   74:getfield        #15  <Field Message queue>
	//*  38   77:ifnull          115
		{
			JqLog.d("returning next ready at %d ns", new Object[] {
				Long.valueOf(queue.readyNs - l)
			});
	//   39   80:ldc1            #61  <String "returning next ready at %d ns">
	//   40   82:iconst_1        
	//   41   83:anewarray       Object[]
	//   42   86:dup             
	//   43   87:iconst_0        
	//   44   88:aload_0         
	//   45   89:getfield        #15  <Field Message queue>
	//   46   92:getfield        #40  <Field long Message.readyNs>
	//   47   95:lload_1         
	//   48   96:lsub            
	//   49   97:invokestatic    #28  <Method Long Long.valueOf(long)>
	//   50  100:aastore         
	//   51  101:invokestatic    #34  <Method void JqLog.d(String, Object[])>
			messagequeue = ((MessageQueue) (Long.valueOf(queue.readyNs)));
	//   52  104:aload_0         
	//   53  105:getfield        #15  <Field Message queue>
	//   54  108:getfield        #40  <Field long Message.readyNs>
	//   55  111:invokestatic    #28  <Method Long Long.valueOf(long)>
	//   56  114:astore_3        
		}
		return ((Long) (messagequeue));
	//   57  115:aload_3         
	//   58  116:areturn         
	}

	public void removeMessages(MessagePredicate messagepredicate)
	{
		Message message1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		Message message = queue;
	//    2    3:aload_0         
	//    3    4:getfield        #15  <Field Message queue>
	//    4    7:astore_3        
		while(message != null) 
	//*   5    8:aload_3         
	//*   6    9:ifnull          75
		{
			boolean flag = messagepredicate.onMessage(message);
	//    7   12:aload_1         
	//    8   13:aload_3         
	//    9   14:invokeinterface #69  <Method boolean MessagePredicate.onMessage(Message)>
	//   10   19:istore_2        
			Message message2 = message.next;
	//   11   20:aload_3         
	//   12   21:getfield        #43  <Field Message Message.next>
	//   13   24:astore          5
			if(flag)
	//*  14   26:iload_2         
	//*  15   27:ifeq            69
			{
				if(message1 == null)
	//*  16   30:aload           4
	//*  17   32:ifnonnull       57
					queue = message.next;
	//   18   35:aload_0         
	//   19   36:aload_3         
	//   20   37:getfield        #43  <Field Message Message.next>
	//   21   40:putfield        #15  <Field Message queue>
				else
	//*  22   43:aload_0         
	//*  23   44:getfield        #17  <Field MessageFactory factory>
	//*  24   47:aload_3         
	//*  25   48:invokevirtual   #50  <Method void MessageFactory.release(Message)>
	//*  26   51:aload           5
	//*  27   53:astore_3        
	//*  28   54:goto            8
					message1.next = message.next;
	//   29   57:aload           4
	//   30   59:aload_3         
	//   31   60:getfield        #43  <Field Message Message.next>
	//   32   63:putfield        #43  <Field Message Message.next>
				factory.release(message);
			} else
	//*  33   66:goto            43
			{
				message1 = message;
	//   34   69:aload_3         
	//   35   70:astore          4
			}
			message = message2;
		}
	//*  36   72:goto            51
	//   37   75:return          
	}

	final MessageFactory factory;
	Message queue;
}
