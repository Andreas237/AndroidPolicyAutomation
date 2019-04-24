// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Process;

class zzadd
	implements Runnable
{

	public zzadd(Runnable runnable, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzw = runnable;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Runnable zzw>
		mPriority = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int mPriority>
	//    8   14:return          
	}

	public void run()
	{
		Process.setThreadPriority(mPriority);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int mPriority>
	//    2    4:invokestatic    #27  <Method void Process.setThreadPriority(int)>
		zzw.run();
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Runnable zzw>
	//    5   11:invokeinterface #29  <Method void Runnable.run()>
	//    6   16:return          
	}

	private final int mPriority;
	private final Runnable zzw;
}
