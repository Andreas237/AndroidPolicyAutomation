// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.messaging.Message;
import com.birbit.android.jobqueue.messaging.MessagePredicate;
import com.birbit.android.jobqueue.messaging.Type;
import com.birbit.android.jobqueue.messaging.message.CommandMessage;

// Referenced classes of package com.birbit.android.jobqueue:
//			ConsumerManager

static final class ConsumerManager$Consumer$1
	implements MessagePredicate
{

	public boolean onMessage(Message message)
	{
		return message.type == Type.COMMAND && ((CommandMessage)message).getWhat() == 2;
	//    0    0:aload_1         
	//    1    1:getfield        #24  <Field Type Message.type>
	//    2    4:getstatic       #29  <Field Type Type.COMMAND>
	//    3    7:if_acmpne       23
	//    4   10:aload_1         
	//    5   11:checkcast       #31  <Class CommandMessage>
	//    6   14:invokevirtual   #35  <Method int CommandMessage.getWhat()>
	//    7   17:iconst_2        
	//    8   18:icmpne          23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	ConsumerManager$Consumer$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
