// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;


// Referenced classes of package com.google.android.exoplayer.util:
//			Clock

public final class SystemClock
	implements Clock
{

	public SystemClock()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public long elapsedRealtime()
	{
		return android.os.SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #17  <Method long android.os.SystemClock.elapsedRealtime()>
	//    1    3:lreturn         
	}
}
