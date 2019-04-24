// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.messaging;


// Referenced classes of package com.birbit.android.jobqueue.messaging:
//			MessagePredicate, MessageQueueConsumer, Message

public interface MessageQueue
{

	public abstract void cancelMessages(MessagePredicate messagepredicate);

	public abstract void clear();

	public abstract void consume(MessageQueueConsumer messagequeueconsumer);

	public abstract void post(Message message);

	public abstract void postAt(Message message, long l);

	public abstract void stop();
}
