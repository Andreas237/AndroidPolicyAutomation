// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.timer;

import com.birbit.android.jobqueue.log.JqLog;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.birbit.android.jobqueue.timer:
//			Timer

public class SystemTimer
	implements Timer
{

	public SystemTimer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		JqLog.d("creating system timer", new Object[0]);
	//    2    4:ldc1            #15  <String "creating system timer">
	//    3    6:iconst_0        
	//    4    7:anewarray       Object[]
	//    5   10:invokestatic    #21  <Method void JqLog.d(String, Object[])>
		startWallClock = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
	//    6   13:aload_0         
	//    7   14:getstatic       #27  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    8   17:invokestatic    #33  <Method long System.currentTimeMillis()>
	//    9   20:invokevirtual   #37  <Method long TimeUnit.toNanos(long)>
	//   10   23:putfield        #39  <Field long startWallClock>
	//   11   26:aload_0         
	//   12   27:invokestatic    #42  <Method long System.nanoTime()>
	//   13   30:putfield        #44  <Field long startNs>
	//   14   33:return          
	}

	public long nanoTime()
	{
		return (System.nanoTime() - startNs) + startWallClock;
	//    0    0:invokestatic    #42  <Method long System.nanoTime()>
	//    1    3:aload_0         
	//    2    4:getfield        #44  <Field long startNs>
	//    3    7:lsub            
	//    4    8:aload_0         
	//    5    9:getfield        #39  <Field long startWallClock>
	//    6   12:ladd            
	//    7   13:lreturn         
	}

	public void notifyObject(Object obj)
	{
		obj.notifyAll();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #50  <Method void Object.notifyAll()>
	//    2    4:return          
	}

	public void waitOnObject(Object obj)
		throws InterruptedException
	{
		obj.wait();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #56  <Method void Object.wait()>
	//    2    4:return          
	}

	public void waitOnObjectUntilNs(Object obj, long l)
		throws InterruptedException
	{
		long l1 = nanoTime();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method long nanoTime()>
	//    2    4:lstore          4
		if(l1 > l)
	//*   3    6:lload           4
	//*   4    8:lload_2         
	//*   5    9:lcmp            
	//*   6   10:ifle            19
		{
			obj.wait(1L);
	//    7   13:aload_1         
	//    8   14:lconst_1        
	//    9   15:invokevirtual   #63  <Method void Object.wait(long)>
			return;
	//   10   18:return          
		} else
		{
			TimeUnit.NANOSECONDS.timedWait(obj, l - l1);
	//   11   19:getstatic       #66  <Field TimeUnit TimeUnit.NANOSECONDS>
	//   12   22:aload_1         
	//   13   23:lload_2         
	//   14   24:lload           4
	//   15   26:lsub            
	//   16   27:invokevirtual   #69  <Method void TimeUnit.timedWait(Object, long)>
			return;
	//   17   30:return          
		}
	}

	final long startNs = System.nanoTime();
	final long startWallClock;
}
