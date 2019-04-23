// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk;

import kotlin.jvm.internal.DefaultConstructorMarker;

// Referenced classes of package io.radar.sdk:
//			Radar

public static final class Radar$RadarTrackingOffline$Companion
{

	public final Radar.RadarTrackingOffline fromInt(int i)
	{
		Radar.RadarTrackingOffline aradartrackingoffline[] = Radar.RadarTrackingOffline.values();
	//    0    0:invokestatic    #40  <Method Radar$RadarTrackingOffline[] Radar$RadarTrackingOffline.values()>
	//    1    3:astore          4
		int k = aradartrackingoffline.length;
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
			Radar.RadarTrackingOffline radartrackingoffline = aradartrackingoffline[j];
	//   10   16:aload           4
	//   11   18:iload_2         
	//   12   19:aaload          
	//   13   20:astore          5
			if(radartrackingoffline.getMode$sdk_release() == i)
	//*  14   22:aload           5
	//*  15   24:invokevirtual   #44  <Method int Radar$RadarTrackingOffline.getMode$sdk_release()>
	//*  16   27:iload_1         
	//*  17   28:icmpne          34
				return radartrackingoffline;
	//   18   31:aload           5
	//   19   33:areturn         
		}

	//   20   34:iload_2         
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:istore_2        
	//*  24   38:goto            11
		return Radar.RadarTrackingOffline.REPLAY_STOPPED;
	//   25   41:getstatic       #47  <Field Radar$RadarTrackingOffline Radar$RadarTrackingOffline.REPLAY_STOPPED>
	//   26   44:areturn         
	}

	private Radar$RadarTrackingOffline$Companion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	public Radar$RadarTrackingOffline$Companion(DefaultConstructorMarker defaultconstructormarker)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Radar$RadarTrackingOffline$Companion()>
	//    2    4:return          
	}
}
