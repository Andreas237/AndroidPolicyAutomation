// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.scheduler;


public abstract class PeriodicTask
{

	public PeriodicTask(String s, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		interval = l;
	//    2    4:aload_0         
	//    3    5:lload_2         
	//    4    6:putfield        #15  <Field long interval>
		id = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #17  <Field String id>
	//    8   14:return          
	}

	public String getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String id>
	//    2    4:areturn         
	}

	public long getInterval()
	{
		return interval;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field long interval>
	//    2    4:lreturn         
	}

	public abstract void run();

	private String id;
	private long interval;
}
