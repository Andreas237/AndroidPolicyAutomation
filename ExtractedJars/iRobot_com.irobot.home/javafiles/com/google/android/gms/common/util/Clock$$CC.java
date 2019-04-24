// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.common.util:
//			Clock

public class Clock$$CC
{

	public static long currentThreadTimeMillis(Clock clock)
	{
		return SystemClock.currentThreadTimeMillis();
	//    0    0:invokestatic    #12  <Method long SystemClock.currentThreadTimeMillis()>
	//    1    3:lreturn         
	}
}
