// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk;

import kotlin.jvm.internal.DefaultConstructorMarker;

// Referenced classes of package io.radar.sdk:
//			Radar

public static final class Radar$RadarTrackingSync extends Enum
{
	public static final class Companion
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

		private Companion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
		//    2    4:return          
		}

		public Companion(DefaultConstructorMarker defaultconstructormarker)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #34  <Method void Radar$RadarTrackingSync$Companion()>
		//    2    4:return          
		}
	}


	public static Radar$RadarTrackingSync valueOf(String s)
	{
		return (Radar$RadarTrackingSync)Enum.valueOf(io/radar/sdk/Radar$RadarTrackingSync, s);
	//    0    0:ldc1            #2   <Class Radar$RadarTrackingSync>
	//    1    2:aload_0         
	//    2    3:invokestatic    #66  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Radar$RadarTrackingSync>
	//    4    9:areturn         
	}

	public static Radar$RadarTrackingSync[] values()
	{
		return (Radar$RadarTrackingSync[])((Radar$RadarTrackingSync []) ($VALUES)).clone();
	//    0    0:getstatic       #48  <Field Radar$RadarTrackingSync[] $VALUES>
	//    1    3:invokevirtual   #73  <Method Object _5B_Lio.radar.sdk.Radar$RadarTrackingSync_3B_.clone()>
	//    2    6:checkcast       #69  <Class Radar$RadarTrackingSync[]>
	//    3    9:areturn         
	}

	public final int getMode$sdk_release()
	{
		return mode;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int mode>
	//    2    4:ireturn         
	}

	private static final Radar$RadarTrackingSync $VALUES[];
	public static final Radar$RadarTrackingSync ALL;
	public static final Companion Companion = new Companion(((DefaultConstructorMarker) (null)));
	public static final Radar$RadarTrackingSync POSSIBLE_STATE_CHANGES;
	private final int mode;

	static 
	{
		Radar$RadarTrackingSync radar$radartrackingsync = new Radar$RadarTrackingSync("POSSIBLE_STATE_CHANGES", 0, 1);
	//    0    0:new             #2   <Class Radar$RadarTrackingSync>
	//    1    3:dup             
	//    2    4:ldc1            #38  <String "POSSIBLE_STATE_CHANGES">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:invokespecial   #41  <Method void Radar$RadarTrackingSync(String, int, int)>
	//    6   11:astore_0        
		POSSIBLE_STATE_CHANGES = radar$radartrackingsync;
	//    7   12:aload_0         
	//    8   13:putstatic       #43  <Field Radar$RadarTrackingSync POSSIBLE_STATE_CHANGES>
		Radar$RadarTrackingSync radar$radartrackingsync1 = new Radar$RadarTrackingSync("ALL", 1, -1);
	//    9   16:new             #2   <Class Radar$RadarTrackingSync>
	//   10   19:dup             
	//   11   20:ldc1            #44  <String "ALL">
	//   12   22:iconst_1        
	//   13   23:iconst_m1       
	//   14   24:invokespecial   #41  <Method void Radar$RadarTrackingSync(String, int, int)>
	//   15   27:astore_1        
		ALL = radar$radartrackingsync1;
	//   16   28:aload_1         
	//   17   29:putstatic       #46  <Field Radar$RadarTrackingSync ALL>
		$VALUES = (new Radar$RadarTrackingSync[] {
			radar$radartrackingsync, radar$radartrackingsync1
		});
	//   18   32:iconst_2        
	//   19   33:anewarray       Radar$RadarTrackingSync[]
	//   20   36:dup             
	//   21   37:iconst_0        
	//   22   38:aload_0         
	//   23   39:aastore         
	//   24   40:dup             
	//   25   41:iconst_1        
	//   26   42:aload_1         
	//   27   43:aastore         
	//   28   44:putstatic       #48  <Field Radar$RadarTrackingSync[] $VALUES>
	//   29   47:new             #10  <Class Radar$RadarTrackingSync$Companion>
	//   30   50:dup             
	//   31   51:aconst_null     
	//   32   52:invokespecial   #51  <Method void Radar$RadarTrackingSync$Companion(DefaultConstructorMarker)>
	//   33   55:putstatic       #53  <Field Radar$RadarTrackingSync$Companion Companion>
	//*  34   58:return          
	}

	protected Radar$RadarTrackingSync(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #57  <Method void Enum(String, int)>
		mode = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #59  <Field int mode>
	//    7   11:return          
	}
}
