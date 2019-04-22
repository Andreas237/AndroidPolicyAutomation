// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.stats;


// Referenced classes of package com.google.android.gms.common.stats:
//			ConnectionEvent, WakeLockEvent

public interface StatisticsTracker
{

	public abstract void registerEvent(ConnectionEvent connectionevent);

	public abstract void registerEvent(WakeLockEvent wakelockevent);
}
