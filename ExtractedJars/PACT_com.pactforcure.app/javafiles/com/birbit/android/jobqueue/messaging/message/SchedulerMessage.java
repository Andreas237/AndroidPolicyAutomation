// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.messaging.message;

import com.birbit.android.jobqueue.messaging.Message;
import com.birbit.android.jobqueue.messaging.Type;
import com.birbit.android.jobqueue.scheduling.SchedulerConstraint;

public class SchedulerMessage extends Message
{

	public SchedulerMessage()
	{
		super(Type.SCHEDULER);
	//    0    0:aload_0         
	//    1    1:getstatic       #21  <Field Type Type.SCHEDULER>
	//    2    4:invokespecial   #24  <Method void Message(Type)>
	//    3    7:return          
	}

	public SchedulerConstraint getConstraint()
	{
		return constraint;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field SchedulerConstraint constraint>
	//    2    4:areturn         
	}

	public int getWhat()
	{
		return what;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int what>
	//    2    4:ireturn         
	}

	protected void onRecycled()
	{
		constraint = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #29  <Field SchedulerConstraint constraint>
	//    3    5:return          
	}

	public void set(int i, SchedulerConstraint schedulerconstraint)
	{
		what = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field int what>
		constraint = schedulerconstraint;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #29  <Field SchedulerConstraint constraint>
	//    6   10:return          
	}

	public static final int START = 1;
	public static final int STOP = 2;
	private SchedulerConstraint constraint;
	private int what;
}
