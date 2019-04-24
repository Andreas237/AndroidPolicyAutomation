// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			km

static final class km$1
{

	static final int a[];

	static 
	{
		a = new int[com.autonavi.amap.mapcore._3dMap_locationOption.Inner_3dMap_Enum_LocationMode.values().length];
	//    0    0:invokestatic    #18  <Method com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode[] com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] a>
		try
		{
			a[com.autonavi.amap.mapcore._3dMap_locationOption.Inner_3dMap_Enum_LocationMode.Battery_Saving.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] a>
	//    5   12:getstatic       #24  <Field com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode.Battery_Saving>
	//    6   15:invokevirtual   #28  <Method int com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] a>
	//*  10   23:getstatic       #31  <Field com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode.Device_Sensors>
	//*  11   26:invokevirtual   #28  <Method int com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] a>
	//*  15   34:getstatic       #34  <Field com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode.Hight_Accuracy>
	//*  16   37:invokevirtual   #28  <Method int com.autonavi.amap.mapcore.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationMode.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   20   43:astore_0        
		try
		{
			a[com.autonavi.amap.mapcore._3dMap_locationOption.Inner_3dMap_Enum_LocationMode.Device_Sensors.ordinal()] = 2;
		}
	//*  21   44:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   22   47:astore_0        
		try
		{
			a[com.autonavi.amap.mapcore._3dMap_locationOption.Inner_3dMap_Enum_LocationMode.Hight_Accuracy.ordinal()] = 3;
		}
	//*  23   48:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   51:astore_0        
	//*  25   52:return          
	}
}
