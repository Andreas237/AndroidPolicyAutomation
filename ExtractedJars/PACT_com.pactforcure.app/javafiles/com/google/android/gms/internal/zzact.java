// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public class zzact
	implements Executor
{

	public zzact(Looper looper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mHandler = new Handler(looper);
	//    2    4:aload_0         
	//    3    5:new             #15  <Class Handler>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #17  <Method void Handler(Looper)>
	//    7   13:putfield        #19  <Field Handler mHandler>
	//    8   16:return          
	}

	public void execute(Runnable runnable)
	{
		mHandler.post(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Handler mHandler>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #27  <Method boolean Handler.post(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	private final Handler mHandler;
}
