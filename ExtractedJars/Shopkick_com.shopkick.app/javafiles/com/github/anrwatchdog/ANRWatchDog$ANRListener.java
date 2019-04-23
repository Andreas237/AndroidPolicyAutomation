// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.anrwatchdog;


// Referenced classes of package com.github.anrwatchdog:
//			ANRWatchDog, ANRError

public static interface ANRWatchDog$ANRListener
{

	public abstract void onAppNotResponding(ANRError anrerror);
}
