// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.stats;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.common.stats:
//			StatisticalEventTrackerProvider, ConnectionEvent, StatsEvent, WakeLockEvent

public static interface StatisticalEventTrackerProvider$StatisticalEventTracker
{

	public abstract int getLogLevel(int i);

	public abstract Bundle getOptions();

	public abstract boolean isEnabled();

	public abstract void registerEvent(ConnectionEvent connectionevent);

	public abstract void registerEvent(StatsEvent statsevent);

	public abstract void registerEvent(WakeLockEvent wakelockevent);
}
