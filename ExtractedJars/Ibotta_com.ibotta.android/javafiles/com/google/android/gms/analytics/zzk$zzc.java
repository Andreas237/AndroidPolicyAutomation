// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;

import android.os.Process;

// Referenced classes of package com.google.android.gms.analytics:
//			zzk

static final class zzk$zzc extends Thread
{

	public final void run()
	{
		Process.setThreadPriority(10);
	//    0    0:bipush          10
	//    1    2:invokestatic    #20  <Method void Process.setThreadPriority(int)>
		super.run();
	//    2    5:aload_0         
	//    3    6:invokespecial   #22  <Method void Thread.run()>
	//    4    9:return          
	}

	zzk$zzc(Runnable runnable, String s)
	{
		super(runnable, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void Thread(Runnable, String)>
	//    4    6:return          
	}
}
