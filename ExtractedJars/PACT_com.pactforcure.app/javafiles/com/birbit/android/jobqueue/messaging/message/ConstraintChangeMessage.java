// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.messaging.message;

import com.birbit.android.jobqueue.messaging.Message;
import com.birbit.android.jobqueue.messaging.Type;

public class ConstraintChangeMessage extends Message
{

	public ConstraintChangeMessage()
	{
		super(Type.CONSTRAINT_CHANGE);
	//    0    0:aload_0         
	//    1    1:getstatic       #14  <Field Type Type.CONSTRAINT_CHANGE>
	//    2    4:invokespecial   #17  <Method void Message(Type)>
	//    3    7:return          
	}

	public boolean isForNextJob()
	{
		return forNextJob;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean forNextJob>
	//    2    4:ireturn         
	}

	protected void onRecycled()
	{
		forNextJob = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #22  <Field boolean forNextJob>
	//    3    5:return          
	}

	public void setForNextJob(boolean flag)
	{
		forNextJob = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field boolean forNextJob>
	//    3    5:return          
	}

	private boolean forNextJob;
}
