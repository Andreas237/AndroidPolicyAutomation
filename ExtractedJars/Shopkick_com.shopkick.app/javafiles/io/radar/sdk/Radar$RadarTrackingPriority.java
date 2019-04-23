// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk;


// Referenced classes of package io.radar.sdk:
//			Radar

public static final class Radar$RadarTrackingPriority extends Enum
{

	public static Radar$RadarTrackingPriority valueOf(String s)
	{
		return (Radar$RadarTrackingPriority)Enum.valueOf(io/radar/sdk/Radar$RadarTrackingPriority, s);
	//    0    0:ldc1            #2   <Class Radar$RadarTrackingPriority>
	//    1    2:aload_0         
	//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Radar$RadarTrackingPriority>
	//    4    9:areturn         
	}

	public static Radar$RadarTrackingPriority[] values()
	{
		return (Radar$RadarTrackingPriority[])((Radar$RadarTrackingPriority []) ($VALUES)).clone();
	//    0    0:getstatic       #40  <Field Radar$RadarTrackingPriority[] $VALUES>
	//    1    3:invokevirtual   #55  <Method Object _5B_Lio.radar.sdk.Radar$RadarTrackingPriority_3B_.clone()>
	//    2    6:checkcast       #51  <Class Radar$RadarTrackingPriority[]>
	//    3    9:areturn         
	}

	private static final Radar$RadarTrackingPriority $VALUES[];
	public static final Radar$RadarTrackingPriority EFFICIENCY;
	public static final Radar$RadarTrackingPriority RESPONSIVENESS;

	static 
	{
		Radar$RadarTrackingPriority radar$radartrackingpriority = new Radar$RadarTrackingPriority("RESPONSIVENESS", 0);
	//    0    0:new             #2   <Class Radar$RadarTrackingPriority>
	//    1    3:dup             
	//    2    4:ldc1            #30  <String "RESPONSIVENESS">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #33  <Method void Radar$RadarTrackingPriority(String, int)>
	//    5   10:astore_0        
		RESPONSIVENESS = radar$radartrackingpriority;
	//    6   11:aload_0         
	//    7   12:putstatic       #35  <Field Radar$RadarTrackingPriority RESPONSIVENESS>
		Radar$RadarTrackingPriority radar$radartrackingpriority1 = new Radar$RadarTrackingPriority("EFFICIENCY", 1);
	//    8   15:new             #2   <Class Radar$RadarTrackingPriority>
	//    9   18:dup             
	//   10   19:ldc1            #36  <String "EFFICIENCY">
	//   11   21:iconst_1        
	//   12   22:invokespecial   #33  <Method void Radar$RadarTrackingPriority(String, int)>
	//   13   25:astore_1        
		EFFICIENCY = radar$radartrackingpriority1;
	//   14   26:aload_1         
	//   15   27:putstatic       #38  <Field Radar$RadarTrackingPriority EFFICIENCY>
		$VALUES = (new Radar$RadarTrackingPriority[] {
			radar$radartrackingpriority, radar$radartrackingpriority1
		});
	//   16   30:iconst_2        
	//   17   31:anewarray       Radar$RadarTrackingPriority[]
	//   18   34:dup             
	//   19   35:iconst_0        
	//   20   36:aload_0         
	//   21   37:aastore         
	//   22   38:dup             
	//   23   39:iconst_1        
	//   24   40:aload_1         
	//   25   41:aastore         
	//   26   42:putstatic       #40  <Field Radar$RadarTrackingPriority[] $VALUES>
	//*  27   45:return          
	}

	protected Radar$RadarTrackingPriority(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #42  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
