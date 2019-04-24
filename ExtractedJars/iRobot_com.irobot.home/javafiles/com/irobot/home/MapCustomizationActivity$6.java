// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.MapsUIService;
import com.irobot.core.MapsUIServiceCommand;

// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity

class MapCustomizationActivity$6
	implements Runnable
{

	public void run()
	{
		MapCustomizationActivity.e(a).sendCommand(MapsUIServiceCommand.CancelCustomization, ((com.irobot.core.MapsUIServiceData) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MapCustomizationActivity a>
	//    2    4:invokestatic    #25  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
	//    3    7:getstatic       #31  <Field MapsUIServiceCommand MapsUIServiceCommand.CancelCustomization>
	//    4   10:aconst_null     
	//    5   11:invokevirtual   #37  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, com.irobot.core.MapsUIServiceData)>
	//    6   14:return          
	}

	final MapCustomizationActivity a;

	MapCustomizationActivity$6(MapCustomizationActivity mapcustomizationactivity)
	{
		a = mapcustomizationactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MapCustomizationActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
