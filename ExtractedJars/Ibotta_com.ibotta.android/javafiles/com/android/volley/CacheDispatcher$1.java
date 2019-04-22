// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;

import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.volley:
//			CacheDispatcher, Request

class CacheDispatcher$1
	implements Runnable
{

	public void run()
	{
		InterruptedException interruptedexception;
		try
		{
			CacheDispatcher.access$100(CacheDispatcher.this).put(((Object) (val$request)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CacheDispatcher this$0>
	//    2    4:invokestatic    #31  <Method BlockingQueue CacheDispatcher.access$100(CacheDispatcher)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Request val$request>
	//    5   11:invokeinterface #37  <Method void BlockingQueue.put(Object)>
			return;
	//    6   16:return          
		}
	//*   7   17:invokestatic    #43  <Method Thread Thread.currentThread()>
	//*   8   20:invokevirtual   #46  <Method void Thread.interrupt()>
	//*   9   23:return          
		// Misplaced declaration of an exception variable
		catch(InterruptedException interruptedexception)
		{
			Thread.currentThread().interrupt();
		}
	//*  10   24:astore_1        
	//*  11   25:goto            17
	}

	final CacheDispatcher this$0;
	final Request val$request;

	CacheDispatcher$1()
	{
		this$0 = final_cachedispatcher;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CacheDispatcher this$0>
		val$request = Request.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Request val$request>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
