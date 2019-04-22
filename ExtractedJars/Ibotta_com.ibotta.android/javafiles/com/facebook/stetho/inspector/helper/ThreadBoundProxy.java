// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.helper;

import com.facebook.stetho.common.*;

public abstract class ThreadBoundProxy
	implements ThreadBound
{

	public ThreadBoundProxy(ThreadBound threadbound)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mEnforcer = (ThreadBound)Util.throwIfNull(((Object) (threadbound)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #19  <Method Object Util.throwIfNull(Object)>
	//    5    9:checkcast       #6   <Class ThreadBound>
	//    6   12:putfield        #21  <Field ThreadBound mEnforcer>
	//    7   15:return          
	}

	public final boolean checkThreadAccess()
	{
		return mEnforcer.checkThreadAccess();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ThreadBound mEnforcer>
	//    2    4:invokeinterface #26  <Method boolean ThreadBound.checkThreadAccess()>
	//    3    9:ireturn         
	}

	public final Object postAndWait(UncheckedCallable uncheckedcallable)
	{
		return mEnforcer.postAndWait(uncheckedcallable);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ThreadBound mEnforcer>
	//    2    4:aload_1         
	//    3    5:invokeinterface #30  <Method Object ThreadBound.postAndWait(UncheckedCallable)>
	//    4   10:areturn         
	}

	public final void postAndWait(Runnable runnable)
	{
		mEnforcer.postAndWait(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ThreadBound mEnforcer>
	//    2    4:aload_1         
	//    3    5:invokeinterface #35  <Method void ThreadBound.postAndWait(Runnable)>
	//    4   10:return          
	}

	public final void postDelayed(Runnable runnable, long l)
	{
		mEnforcer.postDelayed(runnable, l);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ThreadBound mEnforcer>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokeinterface #39  <Method void ThreadBound.postDelayed(Runnable, long)>
	//    5   11:return          
	}

	public final void removeCallbacks(Runnable runnable)
	{
		mEnforcer.removeCallbacks(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ThreadBound mEnforcer>
	//    2    4:aload_1         
	//    3    5:invokeinterface #42  <Method void ThreadBound.removeCallbacks(Runnable)>
	//    4   10:return          
	}

	public final void verifyThreadAccess()
	{
		mEnforcer.verifyThreadAccess();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ThreadBound mEnforcer>
	//    2    4:invokeinterface #45  <Method void ThreadBound.verifyThreadAccess()>
	//    3    9:return          
	}

	private final ThreadBound mEnforcer;
}
