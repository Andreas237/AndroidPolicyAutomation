// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public class HandlerExecutor
	implements Executor
{

	public HandlerExecutor(Handler handler1)
	{
		this(handler1.getLooper());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #16  <Method Looper Handler.getLooper()>
	//    3    5:invokespecial   #19  <Method void HandlerExecutor(Looper)>
	//    4    8:return          
	}

	public HandlerExecutor(Looper looper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		handler = new Handler(looper);
	//    2    4:aload_0         
	//    3    5:new             #12  <Class Handler>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #24  <Method void Handler(Looper)>
	//    7   13:putfield        #26  <Field Handler handler>
	//    8   16:return          
	}

	public void execute(Runnable runnable)
	{
		handler.post(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Handler handler>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #33  <Method boolean Handler.post(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	private final Handler handler;
}
