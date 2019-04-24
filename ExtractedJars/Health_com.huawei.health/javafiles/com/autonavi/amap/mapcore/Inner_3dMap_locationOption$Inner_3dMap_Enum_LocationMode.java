// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;


// Referenced classes of package com.autonavi.amap.mapcore:
//			Inner_3dMap_locationOption

public static final class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode extends Enum
{

	public static Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode valueOf(String s)
	{
		return (Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode)Enum.valueOf(com/autonavi/amap/mapcore/Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode, s);
	//    0    0:ldc1            #2   <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode>
	//    4    9:areturn         
	}

	public static Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode[] values()
	{
		return (Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode[])((Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode_3B_.clone()>
	//    2    6:checkcast       #42  <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode[]>
	//    3    9:areturn         
	}

	private static final Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode $VALUES[];
	public static final Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode Battery_Saving;
	public static final Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode Device_Sensors;
	public static final Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode Hight_Accuracy;

	static 
	{
		Battery_Saving = new Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode("Battery_Saving", 0);
	//    0    0:new             #2   <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "Battery_Saving">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode(String, int)>
	//    5   10:putstatic       #23  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode Battery_Saving>
		Device_Sensors = new Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode("Device_Sensors", 1);
	//    6   13:new             #2   <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "Device_Sensors">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode(String, int)>
	//   11   23:putstatic       #26  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode Device_Sensors>
		Hight_Accuracy = new Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode("Hight_Accuracy", 2);
	//   12   26:new             #2   <Class Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "Hight_Accuracy">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode(String, int)>
	//   17   36:putstatic       #29  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode Hight_Accuracy>
		$VALUES = (new Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode[] {
			Battery_Saving, Device_Sensors, Hight_Accuracy
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode Battery_Saving>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode Device_Sensors>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode Hight_Accuracy>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode[] $VALUES>
	//*  33   64:return          
	}

	private Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
