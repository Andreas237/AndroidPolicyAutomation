// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity

class MapCustomizationActivity$9
	implements Runnable
{

	public void run()
	{
		MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
	//    0    0:invokestatic    #35  <Method MapsUIServiceData MapsUIServiceData.create()>
	//    1    3:astore_1        
		mapsuiservicedata.setRegionTypeChange(a, b);
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field RegionType a>
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field String b>
	//    7   13:invokevirtual   #38  <Method void MapsUIServiceData.setRegionTypeChange(RegionType, String)>
		MapCustomizationActivity.e(c).sendCommand(MapsUIServiceCommand.RegionTypeChange, mapsuiservicedata);
	//    8   16:aload_0         
	//    9   17:getfield        #20  <Field MapCustomizationActivity c>
	//   10   20:invokestatic    #42  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
	//   11   23:getstatic       #48  <Field MapsUIServiceCommand MapsUIServiceCommand.RegionTypeChange>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #54  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
	//   14   30:return          
	}

	final RegionType a;
	final String b;
	final MapCustomizationActivity c;

	MapCustomizationActivity$9(MapCustomizationActivity mapcustomizationactivity, RegionType regiontype, String s)
	{
		c = mapcustomizationactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field MapCustomizationActivity c>
		a = regiontype;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field RegionType a>
		b = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field String b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
