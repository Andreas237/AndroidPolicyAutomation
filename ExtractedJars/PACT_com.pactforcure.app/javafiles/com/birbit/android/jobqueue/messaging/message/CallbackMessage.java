// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.messaging.message;

import com.birbit.android.jobqueue.Job;
import com.birbit.android.jobqueue.messaging.Message;
import com.birbit.android.jobqueue.messaging.Type;

public class CallbackMessage extends Message
{

	public CallbackMessage()
	{
		super(Type.CALLBACK);
	//    0    0:aload_0         
	//    1    1:getstatic       #32  <Field Type Type.CALLBACK>
	//    2    4:invokespecial   #35  <Method void Message(Type)>
	//    3    7:return          
	}

	public Job getJob()
	{
		return job;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Job job>
	//    2    4:areturn         
	}

	public int getResultCode()
	{
		return resultCode;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int resultCode>
	//    2    4:ireturn         
	}

	public Throwable getThrowable()
	{
		return throwable;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Throwable throwable>
	//    2    4:areturn         
	}

	public int getWhat()
	{
		return what;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int what>
	//    2    4:ireturn         
	}

	public boolean isByUserRequest()
	{
		return byUserRequest;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field boolean byUserRequest>
	//    2    4:ireturn         
	}

	protected void onRecycled()
	{
		job = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #40  <Field Job job>
		throwable = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #48  <Field Throwable throwable>
	//    6   10:return          
	}

	public void set(Job job1, int i)
	{
		what = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #52  <Field int what>
		job = job1;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #40  <Field Job job>
	//    6   10:return          
	}

	public void set(Job job1, int i, int j)
	{
		what = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #52  <Field int what>
		resultCode = j;
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:putfield        #44  <Field int resultCode>
		job = job1;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #40  <Field Job job>
	//    9   15:return          
	}

	public void set(Job job1, int i, boolean flag, Throwable throwable1)
	{
		what = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #52  <Field int what>
		byUserRequest = flag;
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:putfield        #56  <Field boolean byUserRequest>
		job = job1;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #40  <Field Job job>
		throwable = throwable1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #48  <Field Throwable throwable>
	//   12   21:return          
	}

	public static final int ON_ADDED = 1;
	public static final int ON_AFTER_RUN = 5;
	public static final int ON_CANCEL = 3;
	public static final int ON_DONE = 4;
	public static final int ON_RUN = 2;
	private boolean byUserRequest;
	private Job job;
	private int resultCode;
	private Throwable throwable;
	private int what;
}
