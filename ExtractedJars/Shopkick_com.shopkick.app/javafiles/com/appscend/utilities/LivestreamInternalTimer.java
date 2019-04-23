// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.utilities;

import android.os.Handler;
import android.os.SystemClock;

public class LivestreamInternalTimer
{

	public LivestreamInternalTimer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mHandler = new Handler();
	//    2    4:aload_0         
	//    3    5:new             #27  <Class Handler>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void Handler()>
	//    6   12:putfield        #30  <Field Handler mHandler>
		currentTime = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #32  <Field int currentTime>
		stopped = true;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #34  <Field boolean stopped>
		mExecutorTask = new Runnable() {

			public void run()
			{
				LivestreamInternalTimer livestreaminternaltimer = LivestreamInternalTimer.this;
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field LivestreamInternalTimer this$0>
			//    2    4:astore_1        
				livestreaminternaltimer.currentTime = livestreaminternaltimer.currentTime + 800;
			//    3    5:aload_1         
			//    4    6:aload_1         
			//    5    7:invokestatic    #23  <Method int LivestreamInternalTimer.access$000(LivestreamInternalTimer)>
			//    6   10:sipush          800
			//    7   13:iadd            
			//    8   14:invokestatic    #27  <Method int LivestreamInternalTimer.access$002(LivestreamInternalTimer, int)>
			//    9   17:pop             
				if(!stopped)
			//*  10   18:aload_0         
			//*  11   19:getfield        #14  <Field LivestreamInternalTimer this$0>
			//*  12   22:invokestatic    #31  <Method boolean LivestreamInternalTimer.access$100(LivestreamInternalTimer)>
			//*  13   25:ifne            47
					mHandler.postAtTime(((Runnable) (this)), SystemClock.uptimeMillis() + 800L);
			//   14   28:aload_0         
			//   15   29:getfield        #14  <Field LivestreamInternalTimer this$0>
			//   16   32:getfield        #35  <Field Handler LivestreamInternalTimer.mHandler>
			//   17   35:aload_0         
			//   18   36:invokestatic    #41  <Method long SystemClock.uptimeMillis()>
			//   19   39:ldc2w           #42  <Long 800L>
			//   20   42:ladd            
			//   21   43:invokevirtual   #49  <Method boolean Handler.postAtTime(Runnable, long)>
			//   22   46:pop             
			//   23   47:return          
			}

			final LivestreamInternalTimer this$0;

			
			{
				this$0 = LivestreamInternalTimer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field LivestreamInternalTimer this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   13   25:aload_0         
	//   14   26:new             #6   <Class LivestreamInternalTimer$1>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:invokespecial   #37  <Method void LivestreamInternalTimer$1(LivestreamInternalTimer)>
	//   18   34:putfield        #39  <Field Runnable mExecutorTask>
	//   19   37:return          
	}

	public int getCurrentTime()
	{
		return currentTime;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int currentTime>
	//    2    4:ireturn         
	}

	public void reset()
	{
		currentTime = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #32  <Field int currentTime>
	//    3    5:return          
	}

	public void start()
	{
		mHandler.removeCallbacks(mExecutorTask);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Handler mHandler>
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field Runnable mExecutorTask>
	//    4    8:invokevirtual   #53  <Method void Handler.removeCallbacks(Runnable)>
		stopped = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #34  <Field boolean stopped>
		mHandler.postDelayed(mExecutorTask, 800L);
	//    8   16:aload_0         
	//    9   17:getfield        #30  <Field Handler mHandler>
	//   10   20:aload_0         
	//   11   21:getfield        #39  <Field Runnable mExecutorTask>
	//   12   24:ldc2w           #54  <Long 800L>
	//   13   27:invokevirtual   #59  <Method boolean Handler.postDelayed(Runnable, long)>
	//   14   30:pop             
	//   15   31:return          
	}

	public void start(int i)
	{
		currentTime = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #32  <Field int currentTime>
		start();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #62  <Method void start()>
	//    5    9:return          
	}

	public void stop()
	{
		stopped = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #34  <Field boolean stopped>
		mHandler.removeCallbacks(mExecutorTask);
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field Handler mHandler>
	//    5    9:aload_0         
	//    6   10:getfield        #39  <Field Runnable mExecutorTask>
	//    7   13:invokevirtual   #53  <Method void Handler.removeCallbacks(Runnable)>
	//    8   16:return          
	}

	public static LivestreamInternalTimer INSTANCE = new LivestreamInternalTimer();
	private int currentTime;
	private Runnable mExecutorTask;
	Handler mHandler;
	private boolean stopped;

	static 
	{
	//    0    0:new             #2   <Class LivestreamInternalTimer>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void LivestreamInternalTimer()>
	//    3    7:putstatic       #23  <Field LivestreamInternalTimer INSTANCE>
	//*   4   10:return          
	}


/*
	static int access$000(LivestreamInternalTimer livestreaminternaltimer)
	{
		return livestreaminternaltimer.currentTime;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int currentTime>
	//    2    4:ireturn         
	}

*/


/*
	static int access$002(LivestreamInternalTimer livestreaminternaltimer, int i)
	{
		livestreaminternaltimer.currentTime = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #32  <Field int currentTime>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$100(LivestreamInternalTimer livestreaminternaltimer)
	{
		return livestreaminternaltimer.stopped;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean stopped>
	//    2    4:ireturn         
	}

*/
}
