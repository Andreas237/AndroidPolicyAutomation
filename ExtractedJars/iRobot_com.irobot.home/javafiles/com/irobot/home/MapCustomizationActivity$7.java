// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.MapsUIService;
import com.irobot.core.MapsUIServiceCommand;

// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity

class MapCustomizationActivity$7
	implements Runnable
{

	public void run()
	{
		MapCustomizationActivity.d(a, false);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MapCustomizationActivity a>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #25  <Method boolean MapCustomizationActivity.d(MapCustomizationActivity, boolean)>
	//    4    8:pop             
		MapCustomizationActivity.e(a).sendCommand(MapsUIServiceCommand.DoneCustomization, ((com.irobot.core.MapsUIServiceData) (null)));
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field MapCustomizationActivity a>
	//    7   13:invokestatic    #29  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
	//    8   16:getstatic       #35  <Field MapsUIServiceCommand MapsUIServiceCommand.DoneCustomization>
	//    9   19:aconst_null     
	//   10   20:invokevirtual   #41  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, com.irobot.core.MapsUIServiceData)>
	//   11   23:return          
	}

	final MapCustomizationActivity a;

	MapCustomizationActivity$7(MapCustomizationActivity mapcustomizationactivity)
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
