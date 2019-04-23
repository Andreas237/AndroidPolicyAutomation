// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.os.*;
import android.view.Choreographer;

// Referenced classes of package com.google.android.exoplayer:
//			VideoFrameReleaseTimeHelper

private static final class VideoFrameReleaseTimeHelper$VSyncSampler
	implements android.view.Choreographer.FrameCallback, android.os.Handler.Callback
{

	private void addObserverInternal()
	{
		observerCount = observerCount + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #68  <Field int observerCount>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #68  <Field int observerCount>
		if(observerCount == 1)
	//*   6   10:aload_0         
	//*   7   11:getfield        #68  <Field int observerCount>
	//*   8   14:iconst_1        
	//*   9   15:icmpne          26
			choreographer.postFrameCallback(((android.view.Choreographer.FrameCallback) (this)));
	//   10   18:aload_0         
	//   11   19:getfield        #70  <Field Choreographer choreographer>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #76  <Method void Choreographer.postFrameCallback(android.view.Choreographer$FrameCallback)>
	//   14   26:return          
	}

	private void createChoreographerInstanceInternal()
	{
		choreographer = Choreographer.getInstance();
	//    0    0:aload_0         
	//    1    1:invokestatic    #81  <Method Choreographer Choreographer.getInstance()>
	//    2    4:putfield        #70  <Field Choreographer choreographer>
	//    3    7:return          
	}

	public static VideoFrameReleaseTimeHelper$VSyncSampler getInstance()
	{
		return INSTANCE;
	//    0    0:getstatic       #36  <Field VideoFrameReleaseTimeHelper$VSyncSampler INSTANCE>
	//    1    3:areturn         
	}

	private void removeObserverInternal()
	{
		observerCount = observerCount - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #68  <Field int observerCount>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #68  <Field int observerCount>
		if(observerCount == 0)
	//*   6   10:aload_0         
	//*   7   11:getfield        #68  <Field int observerCount>
	//*   8   14:ifne            30
		{
			choreographer.removeFrameCallback(((android.view.Choreographer.FrameCallback) (this)));
	//    9   17:aload_0         
	//   10   18:getfield        #70  <Field Choreographer choreographer>
	//   11   21:aload_0         
	//   12   22:invokevirtual   #86  <Method void Choreographer.removeFrameCallback(android.view.Choreographer$FrameCallback)>
			sampledVsyncTimeNs = 0L;
	//   13   25:aload_0         
	//   14   26:lconst_0        
	//   15   27:putfield        #88  <Field long sampledVsyncTimeNs>
		}
	//   16   30:return          
	}

	public void addObserver()
	{
		handler.sendEmptyMessage(1);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Handler handler>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #65  <Method boolean Handler.sendEmptyMessage(int)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void doFrame(long l)
	{
		sampledVsyncTimeNs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #88  <Field long sampledVsyncTimeNs>
		choreographer.postFrameCallbackDelayed(((android.view.Choreographer.FrameCallback) (this)), 500L);
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field Choreographer choreographer>
	//    5    9:aload_0         
	//    6   10:ldc2w           #92  <Long 500L>
	//    7   13:invokevirtual   #97  <Method void Choreographer.postFrameCallbackDelayed(android.view.Choreographer$FrameCallback, long)>
	//    8   16:return          
	}

	public boolean handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #104 <Field int Message.what>
		{
	//*   2    4:tableswitch     0 2: default 32
	//	               0 46
	//	               1 40
	//	               2 34
		default:
			return false;
	//    3   32:iconst_0        
	//    4   33:ireturn         

		case 2: // '\002'
			removeObserverInternal();
	//    5   34:aload_0         
	//    6   35:invokespecial   #106 <Method void removeObserverInternal()>
			return true;
	//    7   38:iconst_1        
	//    8   39:ireturn         

		case 1: // '\001'
			addObserverInternal();
	//    9   40:aload_0         
	//   10   41:invokespecial   #108 <Method void addObserverInternal()>
			return true;
	//   11   44:iconst_1        
	//   12   45:ireturn         

		case 0: // '\0'
			createChoreographerInstanceInternal();
	//   13   46:aload_0         
	//   14   47:invokespecial   #110 <Method void createChoreographerInstanceInternal()>
			return true;
	//   15   50:iconst_1        
	//   16   51:ireturn         
		}
	}

	public void removeObserver()
	{
		handler.sendEmptyMessage(2);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Handler handler>
	//    2    4:iconst_2        
	//    3    5:invokevirtual   #65  <Method boolean Handler.sendEmptyMessage(int)>
	//    4    8:pop             
	//    5    9:return          
	}

	private static final int CREATE_CHOREOGRAPHER = 0;
	private static final VideoFrameReleaseTimeHelper$VSyncSampler INSTANCE = new VideoFrameReleaseTimeHelper$VSyncSampler();
	private static final int MSG_ADD_OBSERVER = 1;
	private static final int MSG_REMOVE_OBSERVER = 2;
	private Choreographer choreographer;
	private final HandlerThread choreographerOwnerThread = new HandlerThread("ChoreographerOwner:Handler");
	private final Handler handler;
	private int observerCount;
	public volatile long sampledVsyncTimeNs;

	static 
	{
	//    0    0:new             #2   <Class VideoFrameReleaseTimeHelper$VSyncSampler>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void VideoFrameReleaseTimeHelper$VSyncSampler()>
	//    3    7:putstatic       #36  <Field VideoFrameReleaseTimeHelper$VSyncSampler INSTANCE>
	//*   4   10:return          
	}

	private VideoFrameReleaseTimeHelper$VSyncSampler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #40  <Class HandlerThread>
	//    4    8:dup             
	//    5    9:ldc1            #42  <String "ChoreographerOwner:Handler">
	//    6   11:invokespecial   #45  <Method void HandlerThread(String)>
	//    7   14:putfield        #47  <Field HandlerThread choreographerOwnerThread>
		choreographerOwnerThread.start();
	//    8   17:aload_0         
	//    9   18:getfield        #47  <Field HandlerThread choreographerOwnerThread>
	//   10   21:invokevirtual   #50  <Method void HandlerThread.start()>
		handler = new Handler(choreographerOwnerThread.getLooper(), ((android.os.Handler.Callback) (this)));
	//   11   24:aload_0         
	//   12   25:new             #52  <Class Handler>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:getfield        #47  <Field HandlerThread choreographerOwnerThread>
	//   16   33:invokevirtual   #56  <Method android.os.Looper HandlerThread.getLooper()>
	//   17   36:aload_0         
	//   18   37:invokespecial   #59  <Method void Handler(android.os.Looper, android.os.Handler$Callback)>
	//   19   40:putfield        #61  <Field Handler handler>
		handler.sendEmptyMessage(0);
	//   20   43:aload_0         
	//   21   44:getfield        #61  <Field Handler handler>
	//   22   47:iconst_0        
	//   23   48:invokevirtual   #65  <Method boolean Handler.sendEmptyMessage(int)>
	//   24   51:pop             
	//   25   52:return          
	}
}
