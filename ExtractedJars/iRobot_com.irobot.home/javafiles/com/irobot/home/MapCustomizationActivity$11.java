// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity

class MapCustomizationActivity$11
	implements Runnable
{

	public void run()
	{
		MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
	//    0    0:invokestatic    #34  <Method MapsUIServiceData MapsUIServiceData.create()>
	//    1    3:astore_1        
		mapsuiservicedata.setRenameRegion(a, b);
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field String a>
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field String b>
	//    7   13:invokevirtual   #37  <Method void MapsUIServiceData.setRenameRegion(String, String)>
		MapCustomizationActivity.e(c).sendCommand(MapsUIServiceCommand.RenameRegion, mapsuiservicedata);
	//    8   16:aload_0         
	//    9   17:getfield        #19  <Field MapCustomizationActivity c>
	//   10   20:invokestatic    #41  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
	//   11   23:getstatic       #47  <Field MapsUIServiceCommand MapsUIServiceCommand.RenameRegion>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #53  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
	//   14   30:return          
	}

	final String a;
	final String b;
	final MapCustomizationActivity c;

	MapCustomizationActivity$11(MapCustomizationActivity mapcustomizationactivity, String s, String s1)
	{
		c = mapcustomizationactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field MapCustomizationActivity c>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String a>
		b = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field String b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void Object()>
	//   11   19:return          
	}
}
