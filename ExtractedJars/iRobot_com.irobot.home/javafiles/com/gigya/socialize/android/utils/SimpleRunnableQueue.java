// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.utils;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class SimpleRunnableQueue
{

	public SimpleRunnableQueue()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		released = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #15  <Field boolean released>
		queue = ((Queue) (new LinkedBlockingQueue()));
	//    5    9:aload_0         
	//    6   10:new             #17  <Class LinkedBlockingQueue>
	//    7   13:dup             
	//    8   14:invokespecial   #18  <Method void LinkedBlockingQueue()>
	//    9   17:putfield        #20  <Field Queue queue>
	//   10   20:return          
	}

	public void enqueue(Runnable runnable)
	{
		if(!released)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field boolean released>
	//*   2    4:ifne            19
		{
			queue.add(((Object) (runnable)));
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field Queue queue>
	//    5   11:aload_1         
	//    6   12:invokeinterface #29  <Method boolean Queue.add(Object)>
	//    7   17:pop             
			return;
	//    8   18:return          
		} else
		{
			runnable.run();
	//    9   19:aload_1         
	//   10   20:invokeinterface #34  <Method void Runnable.run()>
			return;
	//   11   25:return          
		}
	}

	public void release()
	{
		released = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #15  <Field boolean released>
		do
		{
			Runnable runnable = (Runnable)queue.poll();
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field Queue queue>
	//    5    9:invokeinterface #39  <Method Object Queue.poll()>
	//    6   14:checkcast       #31  <Class Runnable>
	//    7   17:astore_1        
			if(runnable != null)
	//*   8   18:aload_1         
	//*   9   19:ifnull          31
				runnable.run();
	//   10   22:aload_1         
	//   11   23:invokeinterface #34  <Method void Runnable.run()>
			else
	//*  12   28:goto            5
				return;
	//   13   31:return          
		} while(true);
	}

	private Queue queue;
	private boolean released;
}
