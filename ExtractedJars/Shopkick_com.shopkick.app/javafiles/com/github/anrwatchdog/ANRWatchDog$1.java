// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.anrwatchdog;


// Referenced classes of package com.github.anrwatchdog:
//			ANRWatchDog, ANRError

static final class ANRWatchDog$1
	implements RListener
{

	public void onAppNotResponding(ANRError anrerror)
	{
		throw anrerror;
	//    0    0:aload_1         
	//    1    1:athrow          
	}

	ANRWatchDog$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
