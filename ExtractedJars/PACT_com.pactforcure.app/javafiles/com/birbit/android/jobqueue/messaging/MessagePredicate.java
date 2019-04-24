// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.messaging;


// Referenced classes of package com.birbit.android.jobqueue.messaging:
//			Message

public interface MessagePredicate
{

	public abstract boolean onMessage(Message message);
}
