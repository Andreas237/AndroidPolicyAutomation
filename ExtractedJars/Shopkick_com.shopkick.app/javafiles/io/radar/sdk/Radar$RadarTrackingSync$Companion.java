// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk;

import kotlin.jvm.internal.DefaultConstructorMarker;

// Referenced classes of package io.radar.sdk:
//			Radar

public static final class Radar$RadarTrackingSync$Companion
{

	public final Radar.RadarTrackingSync fromInt(int i)
	{
		Radar.RadarTrackingSync aradartrackingsync[] = Radar.RadarTrackingSync.values();
	//    0    0:invokestatic    #40  <Method Radar$RadarTrackingSync[] Radar$RadarTrackingSync.values()>
	//    1    3:astore          4
		int k = aradartrackingsync.length;
	//    2    5:aload           4
	//    3    7:arraylength     
	//    4    8:istore_3        
		for(int j = 0; j < k; j++)
	//*   5    9:iconst_0        
	//*   6   10:istore_2        
	//*   7   11:iload_2         
	//*   8   12:iload_3         
	//*   9   13:icmpge          41
		{
			Radar.RadarTrackingSync radartrackingsync = aradartrackingsync[j];
	//   10   16:aload           4
	//   11   18:iload_2         
	//   12   19:aaload          
	//   13   20:astore          5
			if(radartrackingsync.getMode$sdk_release() == i)
	//*  14   22:aload           5
	//*  15   24:invokevirtual   #44  <Method int Radar$RadarTrackingSync.getMode$sdk_release()>
	//*  16   27:iload_1         
	//*  17   28:icmpne          34
				return radartrackingsync;
	//   18   31:aload           5
	//   19   33:areturn         
		}

	//   20   34:iload_2         
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:istore_2        
	//*  24   38:goto            11
		return Radar.RadarTrackingSync.POSSIBLE_STATE_CHANGES;
	//   25   41:getstatic       #47  <Field Radar$RadarTrackingSync Radar$RadarTrackingSync.POSSIBLE_STATE_CHANGES>
	//   26   44:areturn         
	}

	private Radar$RadarTrackingSync$Companion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	public Radar$RadarTrackingSync$Companion(DefaultConstructorMarker defaultconstructormarker)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Radar$RadarTrackingSync$Companion()>
	//    2    4:return          
	}
}
