// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.android;

import android.os.Handler;
import android.os.Looper;
import com.firebase.client.EventTarget;

public class AndroidEventTarget
	implements EventTarget
{

	public AndroidEventTarget()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class Handler>
	//    4    8:dup             
	//    5    9:invokestatic    #20  <Method Looper Looper.getMainLooper()>
	//    6   12:invokespecial   #23  <Method void Handler(Looper)>
	//    7   15:putfield        #25  <Field Handler handler>
	//    8   18:return          
	}

	public void postEvent(Runnable runnable)
	{
		handler.post(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Handler handler>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #32  <Method boolean Handler.post(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void restart()
	{
	//    0    0:return          
	}

	public void shutdown()
	{
	//    0    0:return          
	}

	private final Handler handler = new Handler(Looper.getMainLooper());
}
