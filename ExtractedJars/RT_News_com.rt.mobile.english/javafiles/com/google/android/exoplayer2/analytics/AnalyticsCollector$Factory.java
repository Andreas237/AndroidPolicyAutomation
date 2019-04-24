// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.Clock;

// Referenced classes of package com.google.android.exoplayer2.analytics:
//			AnalyticsCollector

public static class AnalyticsCollector$Factory
{

	public AnalyticsCollector createAnalyticsCollector(Player player, Clock clock)
	{
		return new AnalyticsCollector(player, clock);
	//    0    0:new             #6   <Class AnalyticsCollector>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #18  <Method void AnalyticsCollector(Player, Clock)>
	//    5    9:areturn         
	}

	public AnalyticsCollector$Factory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
