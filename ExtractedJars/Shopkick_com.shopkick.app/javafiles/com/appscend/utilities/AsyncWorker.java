// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.utilities;

import android.os.Handler;
import android.os.HandlerThread;

public class AsyncWorker
{

	public AsyncWorker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static AsyncWorker getInstance()
	{
		if(instance == null)
	//*   0    0:getstatic       #20  <Field AsyncWorker instance>
	//*   1    3:ifnonnull       16
			instance = new AsyncWorker();
	//    2    6:new             #2   <Class AsyncWorker>
	//    3    9:dup             
	//    4   10:invokespecial   #21  <Method void AsyncWorker()>
	//    5   13:putstatic       #20  <Field AsyncWorker instance>
		return instance;
	//    6   16:getstatic       #20  <Field AsyncWorker instance>
	//    7   19:areturn         
	}

	public void init()
	{
		handlerThread = new HandlerThread("VeesoAsyncWorker");
	//    0    0:aload_0         
	//    1    1:new             #24  <Class HandlerThread>
	//    2    4:dup             
	//    3    5:ldc1            #26  <String "VeesoAsyncWorker">
	//    4    7:invokespecial   #29  <Method void HandlerThread(String)>
	//    5   10:putfield        #31  <Field HandlerThread handlerThread>
		handlerThread.start();
	//    6   13:aload_0         
	//    7   14:getfield        #31  <Field HandlerThread handlerThread>
	//    8   17:invokevirtual   #34  <Method void HandlerThread.start()>
		handler = new Handler(handlerThread.getLooper());
	//    9   20:aload_0         
	//   10   21:new             #36  <Class Handler>
	//   11   24:dup             
	//   12   25:aload_0         
	//   13   26:getfield        #31  <Field HandlerThread handlerThread>
	//   14   29:invokevirtual   #40  <Method android.os.Looper HandlerThread.getLooper()>
	//   15   32:invokespecial   #43  <Method void Handler(android.os.Looper)>
	//   16   35:putfield        #45  <Field Handler handler>
	//   17   38:return          
	}

	public void post(Runnable runnable)
	{
		handler.post(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Handler handler>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #50  <Method boolean Handler.post(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void stop()
	{
		handlerThread.quit();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field HandlerThread handlerThread>
	//    2    4:invokevirtual   #55  <Method boolean HandlerThread.quit()>
	//    3    7:pop             
	//    4    8:return          
	}

	private static AsyncWorker instance;
	private Handler handler;
	private HandlerThread handlerThread;

	static 
	{
	//    0    0:return          
	}
}
