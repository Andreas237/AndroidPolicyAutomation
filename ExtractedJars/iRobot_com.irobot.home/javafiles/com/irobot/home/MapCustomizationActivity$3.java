// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity

class MapCustomizationActivity$3
	implements Runnable
{

	public void run()
	{
		MapsUIService mapsuiservice;
		MapsUIServiceCommand mapsuiservicecommand;
		if(MapCustomizationActivity.h(a) == MapCustomizationViewState.DoorEditHasPendingValidSave)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field MapCustomizationActivity a>
	//*   2    4:invokestatic    #25  <Method MapCustomizationViewState MapCustomizationActivity.h(MapCustomizationActivity)>
	//*   3    7:getstatic       #31  <Field MapCustomizationViewState MapCustomizationViewState.DoorEditHasPendingValidSave>
	//*   4   10:if_acmpne       32
		{
			mapsuiservice = MapCustomizationActivity.e(a);
	//    5   13:aload_0         
	//    6   14:getfield        #17  <Field MapCustomizationActivity a>
	//    7   17:invokestatic    #35  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
	//    8   20:astore_1        
			mapsuiservicecommand = MapsUIServiceCommand.PlaceDoor;
	//    9   21:getstatic       #41  <Field MapsUIServiceCommand MapsUIServiceCommand.PlaceDoor>
	//   10   24:astore_2        
		} else
	//*  11   25:aload_1         
	//*  12   26:aload_2         
	//*  13   27:aconst_null     
	//*  14   28:invokevirtual   #47  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, com.irobot.core.MapsUIServiceData)>
	//*  15   31:return          
		if(MapCustomizationActivity.h(a) == MapCustomizationViewState.KeepOutZoneSelected)
	//*  16   32:aload_0         
	//*  17   33:getfield        #17  <Field MapCustomizationActivity a>
	//*  18   36:invokestatic    #25  <Method MapCustomizationViewState MapCustomizationActivity.h(MapCustomizationActivity)>
	//*  19   39:getstatic       #50  <Field MapCustomizationViewState MapCustomizationViewState.KeepOutZoneSelected>
	//*  20   42:if_acmpne       60
		{
			mapsuiservice = MapCustomizationActivity.e(a);
	//   21   45:aload_0         
	//   22   46:getfield        #17  <Field MapCustomizationActivity a>
	//   23   49:invokestatic    #35  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
	//   24   52:astore_1        
			mapsuiservicecommand = MapsUIServiceCommand.PlaceKeepOutZone;
	//   25   53:getstatic       #53  <Field MapsUIServiceCommand MapsUIServiceCommand.PlaceKeepOutZone>
	//   26   56:astore_2        
		} else
	//*  27   57:goto            25
		{
			return;
	//   28   60:return          
		}
		mapsuiservice.sendCommand(mapsuiservicecommand, ((com.irobot.core.MapsUIServiceData) (null)));
	}

	final MapCustomizationActivity a;

	MapCustomizationActivity$3(MapCustomizationActivity mapcustomizationactivity)
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
