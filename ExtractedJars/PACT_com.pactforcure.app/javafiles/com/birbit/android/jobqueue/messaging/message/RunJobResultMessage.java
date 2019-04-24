// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.messaging.message;

import com.birbit.android.jobqueue.JobHolder;
import com.birbit.android.jobqueue.messaging.Message;
import com.birbit.android.jobqueue.messaging.Type;

public class RunJobResultMessage extends Message
{

	public RunJobResultMessage()
	{
		super(Type.RUN_JOB_RESULT);
	//    0    0:aload_0         
	//    1    1:getstatic       #18  <Field Type Type.RUN_JOB_RESULT>
	//    2    4:invokespecial   #21  <Method void Message(Type)>
	//    3    7:return          
	}

	public JobHolder getJobHolder()
	{
		return jobHolder;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field JobHolder jobHolder>
	//    2    4:areturn         
	}

	public int getResult()
	{
		return result;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int result>
	//    2    4:ireturn         
	}

	public Object getWorker()
	{
		return worker;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Object worker>
	//    2    4:areturn         
	}

	protected void onRecycled()
	{
		jobHolder = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #26  <Field JobHolder jobHolder>
	//    3    5:return          
	}

	public void setJobHolder(JobHolder jobholder)
	{
		jobHolder = jobholder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field JobHolder jobHolder>
	//    3    5:return          
	}

	public void setResult(int i)
	{
		result = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int result>
	//    3    5:return          
	}

	public void setWorker(Object obj)
	{
		worker = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field Object worker>
	//    3    5:return          
	}

	private JobHolder jobHolder;
	private int result;
	private Object worker;
}
