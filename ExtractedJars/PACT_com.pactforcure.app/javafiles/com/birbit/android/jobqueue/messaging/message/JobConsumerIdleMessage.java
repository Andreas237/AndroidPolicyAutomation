// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.messaging.message;

import com.birbit.android.jobqueue.messaging.Message;
import com.birbit.android.jobqueue.messaging.Type;

public class JobConsumerIdleMessage extends Message
{

	public JobConsumerIdleMessage()
	{
		super(Type.JOB_CONSUMER_IDLE);
	//    0    0:aload_0         
	//    1    1:getstatic       #16  <Field Type Type.JOB_CONSUMER_IDLE>
	//    2    4:invokespecial   #19  <Method void Message(Type)>
	//    3    7:return          
	}

	public long getLastJobCompleted()
	{
		return lastJobCompleted;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field long lastJobCompleted>
	//    2    4:lreturn         
	}

	public Object getWorker()
	{
		return worker;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Object worker>
	//    2    4:areturn         
	}

	protected void onRecycled()
	{
		worker = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #28  <Field Object worker>
	//    3    5:return          
	}

	public void setLastJobCompleted(long l)
	{
		lastJobCompleted = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #24  <Field long lastJobCompleted>
	//    3    5:return          
	}

	public void setWorker(Object obj)
	{
		worker = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field Object worker>
	//    3    5:return          
	}

	private long lastJobCompleted;
	private Object worker;
}
