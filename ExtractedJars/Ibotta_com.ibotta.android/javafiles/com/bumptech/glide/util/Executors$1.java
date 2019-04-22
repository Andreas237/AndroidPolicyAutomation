// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

// Referenced classes of package com.bumptech.glide.util:
//			Executors

class Executors$1
	implements Executor
{

	public void execute(Runnable runnable)
	{
		handler.post(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Handler handler>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #35  <Method boolean Handler.post(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	private final Handler handler = new Handler(Looper.getMainLooper());

	Executors$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class Handler>
	//    4    8:dup             
	//    5    9:invokestatic    #22  <Method Looper Looper.getMainLooper()>
	//    6   12:invokespecial   #25  <Method void Handler(Looper)>
	//    7   15:putfield        #27  <Field Handler handler>
	//    8   18:return          
	}
}
