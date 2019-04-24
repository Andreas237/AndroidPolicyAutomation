// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.messaging.message;

import com.birbit.android.jobqueue.Job;
import com.birbit.android.jobqueue.messaging.Message;
import com.birbit.android.jobqueue.messaging.Type;

public class AddJobMessage extends Message
{

	public AddJobMessage()
	{
		super(Type.ADD_JOB);
	//    0    0:aload_0         
	//    1    1:getstatic       #14  <Field Type Type.ADD_JOB>
	//    2    4:invokespecial   #17  <Method void Message(Type)>
	//    3    7:return          
	}

	public Job getJob()
	{
		return job;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Job job>
	//    2    4:areturn         
	}

	protected void onRecycled()
	{
		job = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #22  <Field Job job>
	//    3    5:return          
	}

	public void setJob(Job job1)
	{
		job = job1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field Job job>
	//    3    5:return          
	}

	private Job job;
}
