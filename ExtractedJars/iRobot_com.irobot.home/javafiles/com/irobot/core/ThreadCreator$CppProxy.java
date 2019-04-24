// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			ThreadCreator, ThreadRunner

private static final class ThreadCreator$CppProxy extends ThreadCreator
{

	private native void nativeDestroy(long l);

	private native boolean native_isRunningOnMainThread(long l);

	private native void native_postOnMainThread(long l, String s, ThreadRunner threadrunner);

	private native void native_postOnMainThreadAfterDelay(long l, String s, ThreadRunner threadrunner, long l1);

	private native void native_startThread(long l, String s, ThreadRunner threadrunner);

	public void destroy()
	{
		if(!destroyed.getAndSet(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #48  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            19
			nativeDestroy(nativeRef);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field long nativeRef>
	//    8   16:invokespecial   #50  <Method void nativeDestroy(long)>
	//    9   19:return          
	}

	protected void finalize()
	{
		destroy();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method void destroy()>
		((Object)this).finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #57  <Method void Object.finalize()>
	//    4    8:return          
	}

	public boolean isRunningOnMainThread()
	{
		return native_isRunningOnMainThread(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #61  <Method boolean native_isRunningOnMainThread(long)>
	//    4    8:ireturn         
	}

	public void postOnMainThread(String s, ThreadRunner threadrunner)
	{
		native_postOnMainThread(nativeRef, s, threadrunner);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #65  <Method void native_postOnMainThread(long, String, ThreadRunner)>
	//    6   10:return          
	}

	public void postOnMainThreadAfterDelay(String s, ThreadRunner threadrunner, long l)
	{
		native_postOnMainThreadAfterDelay(nativeRef, s, threadrunner, l);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:lload_3         
	//    6    8:invokespecial   #69  <Method void native_postOnMainThreadAfterDelay(long, String, ThreadRunner, long)>
	//    7   11:return          
	}

	public void startThread(String s, ThreadRunner threadrunner)
	{
		native_startThread(nativeRef, s, threadrunner);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #72  <Method void native_startThread(long, String, ThreadRunner)>
	//    6   10:return          
	}

	static final boolean $assertionsDisabled = false;
	private final AtomicBoolean destroyed = new AtomicBoolean(false);
	private final long nativeRef;

	static 
	{
	//    0    0:return          
	}

	private ThreadCreator$CppProxy(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void ThreadCreator()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #24  <Method void AtomicBoolean(boolean)>
	//    7   13:putfield        #26  <Field AtomicBoolean destroyed>
		if(l == 0L)
	//*   8   16:lload_1         
	//*   9   17:lconst_0        
	//*  10   18:lcmp            
	//*  11   19:ifne            32
		{
			throw new RuntimeException("nativeRef is zero");
	//   12   22:new             #28  <Class RuntimeException>
	//   13   25:dup             
	//   14   26:ldc1            #30  <String "nativeRef is zero">
	//   15   28:invokespecial   #33  <Method void RuntimeException(String)>
	//   16   31:athrow          
		} else
		{
			nativeRef = l;
	//   17   32:aload_0         
	//   18   33:lload_1         
	//   19   34:putfield        #35  <Field long nativeRef>
			return;
	//   20   37:return          
		}
	}
}
