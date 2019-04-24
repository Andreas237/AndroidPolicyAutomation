// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.messaging;


// Referenced classes of package com.birbit.android.jobqueue.messaging:
//			Message

public abstract class MessageQueueConsumer
{

	public MessageQueueConsumer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract void handleMessage(Message message);

	public abstract void onIdle();

	public void onStart()
	{
	//    0    0:return          
	}
}
