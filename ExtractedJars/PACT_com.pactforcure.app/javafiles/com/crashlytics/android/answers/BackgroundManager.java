// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

class BackgroundManager
{
	public static interface Listener
	{

		public abstract void onBackground();
	}


	public BackgroundManager(ScheduledExecutorService scheduledexecutorservice)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #30  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #31  <Method void ArrayList()>
	//    6   12:putfield        #33  <Field List listeners>
		flushOnBackground = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #35  <Field boolean flushOnBackground>
	//   10   20:aload_0         
	//   11   21:new             #37  <Class AtomicReference>
	//   12   24:dup             
	//   13   25:invokespecial   #38  <Method void AtomicReference()>
	//   14   28:putfield        #40  <Field AtomicReference backgroundFutureRef>
		inBackground = true;
	//   15   31:aload_0         
	//   16   32:iconst_1        
	//   17   33:putfield        #42  <Field boolean inBackground>
		executorService = scheduledexecutorservice;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:putfield        #44  <Field ScheduledExecutorService executorService>
	//   21   41:return          
	}

	private void notifyBackground()
	{
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((Listener)iterator.next()).onBackground());
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field List listeners>
	//    2    4:invokeinterface #56  <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #62  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            36
	//    7   19:aload_1         
	//    8   20:invokeinterface #66  <Method Object Iterator.next()>
	//    9   25:checkcast       #8   <Class BackgroundManager$Listener>
	//   10   28:invokeinterface #69  <Method void BackgroundManager$Listener.onBackground()>
	//*  11   33:goto            10
	//   12   36:return          
	}

	public void onActivityPaused()
	{
		if(!flushOnBackground || inBackground)
			break MISSING_BLOCK_LABEL_51;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean flushOnBackground>
	//    2    4:ifeq            51
	//    3    7:aload_0         
	//    4    8:getfield        #42  <Field boolean inBackground>
	//    5   11:ifne            51
		inBackground = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #42  <Field boolean inBackground>
		backgroundFutureRef.compareAndSet(((Object) (null)), ((Object) (executorService.schedule(new Runnable() {

			public void run()
			{
				backgroundFutureRef.set(((Object) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BackgroundManager this$0>
			//    2    4:getfield        #25  <Field AtomicReference BackgroundManager.backgroundFutureRef>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #31  <Method void AtomicReference.set(Object)>
				notifyBackground();
			//    5   11:aload_0         
			//    6   12:getfield        #17  <Field BackgroundManager this$0>
			//    7   15:invokestatic    #34  <Method void BackgroundManager.access$000(BackgroundManager)>
			//    8   18:return          
			}

			final BackgroundManager this$0;

			
			{
				this$0 = BackgroundManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BackgroundManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 5000L, TimeUnit.MILLISECONDS))));
	//    9   19:aload_0         
	//   10   20:getfield        #40  <Field AtomicReference backgroundFutureRef>
	//   11   23:aconst_null     
	//   12   24:aload_0         
	//   13   25:getfield        #44  <Field ScheduledExecutorService executorService>
	//   14   28:new             #6   <Class BackgroundManager$1>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #74  <Method void BackgroundManager$1(BackgroundManager)>
	//   18   36:ldc2w           #75  <Long 5000L>
	//   19   39:getstatic       #82  <Field TimeUnit TimeUnit.MILLISECONDS>
	//   20   42:invokeinterface #88  <Method ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
	//   21   47:invokevirtual   #92  <Method boolean AtomicReference.compareAndSet(Object, Object)>
	//   22   50:pop             
		return;
	//   23   51:return          
		RejectedExecutionException rejectedexecutionexception;
		rejectedexecutionexception;
	//   24   52:astore_1        
		Fabric.getLogger().d("Answers", "Failed to schedule background detector", ((Throwable) (rejectedexecutionexception)));
	//   25   53:invokestatic    #98  <Method Logger Fabric.getLogger()>
	//   26   56:ldc1            #100 <String "Answers">
	//   27   58:ldc1            #102 <String "Failed to schedule background detector">
	//   28   60:aload_1         
	//   29   61:invokeinterface #108 <Method void Logger.d(String, String, Throwable)>
		return;
	//   30   66:return          
	}

	public void onActivityResumed()
	{
		inBackground = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #42  <Field boolean inBackground>
		ScheduledFuture scheduledfuture = (ScheduledFuture)backgroundFutureRef.getAndSet(((Object) (null)));
	//    3    5:aload_0         
	//    4    6:getfield        #40  <Field AtomicReference backgroundFutureRef>
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #113 <Method Object AtomicReference.getAndSet(Object)>
	//    7   13:checkcast       #115 <Class ScheduledFuture>
	//    8   16:astore_1        
		if(scheduledfuture != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          29
			scheduledfuture.cancel(false);
	//   11   21:aload_1         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #119 <Method boolean ScheduledFuture.cancel(boolean)>
	//   14   28:pop             
	//   15   29:return          
	}

	public void registerListener(Listener listener)
	{
		listeners.add(((Object) (listener)));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field List listeners>
	//    2    4:aload_1         
	//    3    5:invokeinterface #125 <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void setFlushOnBackground(boolean flag)
	{
		flushOnBackground = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field boolean flushOnBackground>
	//    3    5:return          
	}

	private static final int BACKGROUND_DELAY = 5000;
	final AtomicReference backgroundFutureRef = new AtomicReference();
	private final ScheduledExecutorService executorService;
	private volatile boolean flushOnBackground;
	boolean inBackground;
	private final List listeners = new ArrayList();


/*
	static void access$000(BackgroundManager backgroundmanager)
	{
		backgroundmanager.notifyBackground();
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void notifyBackground()>
		return;
	//    2    4:return          
	}

*/
}
