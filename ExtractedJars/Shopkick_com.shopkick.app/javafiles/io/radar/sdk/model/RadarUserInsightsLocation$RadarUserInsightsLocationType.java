// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.model;


// Referenced classes of package io.radar.sdk.model:
//			RadarUserInsightsLocation

public static final class RadarUserInsightsLocation$RadarUserInsightsLocationType extends Enum
{

	public static RadarUserInsightsLocation$RadarUserInsightsLocationType valueOf(String s)
	{
		return (RadarUserInsightsLocation$RadarUserInsightsLocationType)Enum.valueOf(io/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType, s);
	//    0    0:ldc1            #2   <Class RadarUserInsightsLocation$RadarUserInsightsLocationType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class RadarUserInsightsLocation$RadarUserInsightsLocationType>
	//    4    9:areturn         
	}

	public static RadarUserInsightsLocation$RadarUserInsightsLocationType[] values()
	{
		return (RadarUserInsightsLocation$RadarUserInsightsLocationType[])((RadarUserInsightsLocation$RadarUserInsightsLocationType []) ($VALUES)).clone();
	//    0    0:getstatic       #44  <Field RadarUserInsightsLocation$RadarUserInsightsLocationType[] $VALUES>
	//    1    3:invokevirtual   #59  <Method Object _5B_Lio.radar.sdk.model.RadarUserInsightsLocation$RadarUserInsightsLocationType_3B_.clone()>
	//    2    6:checkcast       #55  <Class RadarUserInsightsLocation$RadarUserInsightsLocationType[]>
	//    3    9:areturn         
	}

	private static final RadarUserInsightsLocation$RadarUserInsightsLocationType $VALUES[];
	public static final RadarUserInsightsLocation$RadarUserInsightsLocationType HOME;
	public static final RadarUserInsightsLocation$RadarUserInsightsLocationType OFFICE;
	public static final RadarUserInsightsLocation$RadarUserInsightsLocationType UNKNOWN;

	static 
	{
		RadarUserInsightsLocation$RadarUserInsightsLocationType radaruserinsightslocation$radaruserinsightslocationtype = new RadarUserInsightsLocation$RadarUserInsightsLocationType("UNKNOWN", 0);
	//    0    0:new             #2   <Class RadarUserInsightsLocation$RadarUserInsightsLocationType>
	//    1    3:dup             
	//    2    4:ldc1            #31  <String "UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #34  <Method void RadarUserInsightsLocation$RadarUserInsightsLocationType(String, int)>
	//    5   10:astore_0        
		UNKNOWN = radaruserinsightslocation$radaruserinsightslocationtype;
	//    6   11:aload_0         
	//    7   12:putstatic       #36  <Field RadarUserInsightsLocation$RadarUserInsightsLocationType UNKNOWN>
		RadarUserInsightsLocation$RadarUserInsightsLocationType radaruserinsightslocation$radaruserinsightslocationtype1 = new RadarUserInsightsLocation$RadarUserInsightsLocationType("HOME", 1);
	//    8   15:new             #2   <Class RadarUserInsightsLocation$RadarUserInsightsLocationType>
	//    9   18:dup             
	//   10   19:ldc1            #37  <String "HOME">
	//   11   21:iconst_1        
	//   12   22:invokespecial   #34  <Method void RadarUserInsightsLocation$RadarUserInsightsLocationType(String, int)>
	//   13   25:astore_1        
		HOME = radaruserinsightslocation$radaruserinsightslocationtype1;
	//   14   26:aload_1         
	//   15   27:putstatic       #39  <Field RadarUserInsightsLocation$RadarUserInsightsLocationType HOME>
		RadarUserInsightsLocation$RadarUserInsightsLocationType radaruserinsightslocation$radaruserinsightslocationtype2 = new RadarUserInsightsLocation$RadarUserInsightsLocationType("OFFICE", 2);
	//   16   30:new             #2   <Class RadarUserInsightsLocation$RadarUserInsightsLocationType>
	//   17   33:dup             
	//   18   34:ldc1            #40  <String "OFFICE">
	//   19   36:iconst_2        
	//   20   37:invokespecial   #34  <Method void RadarUserInsightsLocation$RadarUserInsightsLocationType(String, int)>
	//   21   40:astore_2        
		OFFICE = radaruserinsightslocation$radaruserinsightslocationtype2;
	//   22   41:aload_2         
	//   23   42:putstatic       #42  <Field RadarUserInsightsLocation$RadarUserInsightsLocationType OFFICE>
		$VALUES = (new RadarUserInsightsLocation$RadarUserInsightsLocationType[] {
			radaruserinsightslocation$radaruserinsightslocationtype, radaruserinsightslocation$radaruserinsightslocationtype1, radaruserinsightslocation$radaruserinsightslocationtype2
		});
	//   24   45:iconst_3        
	//   25   46:anewarray       RadarUserInsightsLocation$RadarUserInsightsLocationType[]
	//   26   49:dup             
	//   27   50:iconst_0        
	//   28   51:aload_0         
	//   29   52:aastore         
	//   30   53:dup             
	//   31   54:iconst_1        
	//   32   55:aload_1         
	//   33   56:aastore         
	//   34   57:dup             
	//   35   58:iconst_2        
	//   36   59:aload_2         
	//   37   60:aastore         
	//   38   61:putstatic       #44  <Field RadarUserInsightsLocation$RadarUserInsightsLocationType[] $VALUES>
	//*  39   64:return          
	}

	protected RadarUserInsightsLocation$RadarUserInsightsLocationType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #46  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
