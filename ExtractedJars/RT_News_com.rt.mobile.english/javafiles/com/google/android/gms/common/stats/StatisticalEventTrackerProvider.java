// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.stats;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.common.stats:
//			ConnectionEvent, StatsEvent, WakeLockEvent

public class StatisticalEventTrackerProvider
{
	public static interface StatisticalEventTracker
	{

		public abstract int getLogLevel(int i);

		public abstract Bundle getOptions();

		public abstract boolean isEnabled();

		public abstract void registerEvent(ConnectionEvent connectionevent);

		public abstract void registerEvent(StatsEvent statsevent);

		public abstract void registerEvent(WakeLockEvent wakelockevent);
	}


	private StatisticalEventTrackerProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public static StatisticalEventTracker getImpl()
	{
		return zzyp;
	//    0    0:getstatic       #18  <Field StatisticalEventTrackerProvider$StatisticalEventTracker zzyp>
	//    1    3:areturn         
	}

	public static void setImpl(StatisticalEventTracker statisticaleventtracker)
	{
		zzyp = statisticaleventtracker;
	//    0    0:aload_0         
	//    1    1:putstatic       #18  <Field StatisticalEventTrackerProvider$StatisticalEventTracker zzyp>
	//    2    4:return          
	}

	private static StatisticalEventTracker zzyp;
}
