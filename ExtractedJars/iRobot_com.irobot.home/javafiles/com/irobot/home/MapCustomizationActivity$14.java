// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.MapsUIService;
import com.irobot.core.MapsUIServiceCommand;

// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity

class MapCustomizationActivity$14
	implements android.content.ner
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		MapCustomizationActivity.e(a).sendCommand(MapsUIServiceCommand.ArchiveMap, ((com.irobot.core.MapsUIServiceData) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MapCustomizationActivity a>
	//    2    4:invokestatic    #26  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
	//    3    7:getstatic       #32  <Field MapsUIServiceCommand MapsUIServiceCommand.ArchiveMap>
	//    4   10:aconst_null     
	//    5   11:invokevirtual   #38  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, com.irobot.core.MapsUIServiceData)>
		a.onBackPressed();
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field MapCustomizationActivity a>
	//    8   18:invokevirtual   #41  <Method void MapCustomizationActivity.onBackPressed()>
	//    9   21:return          
	}

	final MapCustomizationActivity a;

	MapCustomizationActivity$14(MapCustomizationActivity mapcustomizationactivity)
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
