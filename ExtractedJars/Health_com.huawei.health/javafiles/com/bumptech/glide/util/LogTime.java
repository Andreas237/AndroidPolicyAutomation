// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util;

import android.os.SystemClock;

public final class LogTime
{

	private LogTime()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	public static double getElapsedMillis(long l)
	{
		return (double)(getLogTime() - l) * MILLIS_MULTIPLIER;
	//    0    0:invokestatic    #36  <Method long getLogTime()>
	//    1    3:lload_0         
	//    2    4:lsub            
	//    3    5:l2d             
	//    4    6:getstatic       #26  <Field double MILLIS_MULTIPLIER>
	//    5    9:dmul            
	//    6   10:dreturn         
	}

	public static long getLogTime()
	{
		if(17 <= android.os.Build.VERSION.SDK_INT)
	//*   0    0:bipush          17
	//*   1    2:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//*   2    5:icmpgt          12
			return SystemClock.elapsedRealtimeNanos();
	//    3    8:invokestatic    #44  <Method long SystemClock.elapsedRealtimeNanos()>
	//    4   11:lreturn         
		else
			return System.currentTimeMillis();
	//    5   12:invokestatic    #49  <Method long System.currentTimeMillis()>
	//    6   15:lreturn         
	}

	private static final double MILLIS_MULTIPLIER;

	static 
	{
		double d;
		if(17 <= android.os.Build.VERSION.SDK_INT)
	//*   0    0:bipush          17
	//*   1    2:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//*   2    5:icmpgt          23
			d = 1.0D / Math.pow(10D, 6D);
	//    3    8:dconst_1        
	//    4    9:ldc2w           #15  <Double 10D>
	//    5   12:ldc2w           #17  <Double 6D>
	//    6   15:invokestatic    #24  <Method double Math.pow(double, double)>
	//    7   18:ddiv            
	//    8   19:dstore_0        
		else
	//*   9   20:goto            25
			d = 1.0D;
	//   10   23:dconst_1        
	//   11   24:dstore_0        
		MILLIS_MULTIPLIER = d;
	//   12   25:dload_0         
	//   13   26:putstatic       #26  <Field double MILLIS_MULTIPLIER>
	//*  14   29:return          
	}
}
