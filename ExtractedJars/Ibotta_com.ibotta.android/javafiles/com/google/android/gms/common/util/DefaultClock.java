// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.common.util:
//			Clock

public class DefaultClock
	implements Clock
{

	private DefaultClock()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static Clock getInstance()
	{
		return ((Clock) (zzzk));
	//    0    0:getstatic       #15  <Field DefaultClock zzzk>
	//    1    3:areturn         
	}

	public long currentThreadTimeMillis()
	{
		return SystemClock.currentThreadTimeMillis();
	//    0    0:invokestatic    #25  <Method long SystemClock.currentThreadTimeMillis()>
	//    1    3:lreturn         
	}

	public long currentTimeMillis()
	{
		return System.currentTimeMillis();
	//    0    0:invokestatic    #30  <Method long System.currentTimeMillis()>
	//    1    3:lreturn         
	}

	public long elapsedRealtime()
	{
		return SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #33  <Method long SystemClock.elapsedRealtime()>
	//    1    3:lreturn         
	}

	public long nanoTime()
	{
		return System.nanoTime();
	//    0    0:invokestatic    #36  <Method long System.nanoTime()>
	//    1    3:lreturn         
	}

	private static final DefaultClock zzzk = new DefaultClock();

	static 
	{
	//    0    0:new             #2   <Class DefaultClock>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void DefaultClock()>
	//    3    7:putstatic       #15  <Field DefaultClock zzzk>
	//*   4   10:return          
	}
}
