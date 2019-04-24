// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zze;
import java.util.concurrent.Executor;

public class HandlerExecutor
	implements Executor
{

	public HandlerExecutor(Looper looper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		handler = ((Handler) (new zze(looper)));
	//    2    4:aload_0         
	//    3    5:new             #16  <Class zze>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #18  <Method void zze(Looper)>
	//    7   13:putfield        #20  <Field Handler handler>
	//    8   16:return          
	}

	public void execute(Runnable runnable)
	{
		handler.post(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Handler handler>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #30  <Method boolean Handler.post(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	private final Handler handler;
}
