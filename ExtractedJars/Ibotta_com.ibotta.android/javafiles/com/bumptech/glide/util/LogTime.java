// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util;

import android.os.SystemClock;

public final class LogTime
{

	public static double getElapsedMillis(long l)
	{
		return (double)(getLogTime() - l) * MILLIS_MULTIPLIER;
	//    0    0:invokestatic    #33  <Method long getLogTime()>
	//    1    3:lload_0         
	//    2    4:lsub            
	//    3    5:l2d             
	//    4    6:getstatic       #26  <Field double MILLIS_MULTIPLIER>
	//    5    9:dmul            
	//    6   10:dreturn         
	}

	public static long getLogTime()
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          12
			return SystemClock.elapsedRealtimeNanos();
	//    3    8:invokestatic    #41  <Method long SystemClock.elapsedRealtimeNanos()>
	//    4   11:lreturn         
		else
			return SystemClock.uptimeMillis();
	//    5   12:invokestatic    #44  <Method long SystemClock.uptimeMillis()>
	//    6   15:lreturn         
	}

	private static final double MILLIS_MULTIPLIER;

	static 
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_2        
		double d = 1.0D;
	//    2    4:dconst_1        
	//    3    5:dstore_0        
		if(i >= 17)
	//*   4    6:iload_2         
	//*   5    7:bipush          17
	//*   6    9:icmplt          24
			d = 1.0D / Math.pow(10D, 6D);
	//    7   12:dconst_1        
	//    8   13:ldc2w           #15  <Double 10D>
	//    9   16:ldc2w           #17  <Double 6D>
	//   10   19:invokestatic    #24  <Method double Math.pow(double, double)>
	//   11   22:ddiv            
	//   12   23:dstore_0        
		MILLIS_MULTIPLIER = d;
	//   13   24:dload_0         
	//   14   25:putstatic       #26  <Field double MILLIS_MULTIPLIER>
	//*  15   28:return          
	}
}
