// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity

class MapCustomizationActivity$34
	implements Runnable
{

	public void run()
	{
label0:
		{
			MapsUIService mapsuiservice;
			MapsUIServiceCommand mapsuiservicecommand;
			if(MapCustomizationActivity.h(a) != MapCustomizationViewState.DoorEditHasPendingValidSave && MapCustomizationActivity.h(a) != MapCustomizationViewState.DoorEditHasPendingInvalidSave)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field MapCustomizationActivity a>
	//*   2    4:invokestatic    #25  <Method MapCustomizationViewState MapCustomizationActivity.h(MapCustomizationActivity)>
	//*   3    7:getstatic       #31  <Field MapCustomizationViewState MapCustomizationViewState.DoorEditHasPendingValidSave>
	//*   4   10:if_acmpeq       57
	//*   5   13:aload_0         
	//*   6   14:getfield        #17  <Field MapCustomizationActivity a>
	//*   7   17:invokestatic    #25  <Method MapCustomizationViewState MapCustomizationActivity.h(MapCustomizationActivity)>
	//*   8   20:getstatic       #34  <Field MapCustomizationViewState MapCustomizationViewState.DoorEditHasPendingInvalidSave>
	//*   9   23:if_acmpne       29
	//*  10   26:goto            57
			{
				if(MapCustomizationActivity.h(a) != MapCustomizationViewState.KeepOutZoneSelected)
					break label0;
	//   11   29:aload_0         
	//   12   30:getfield        #17  <Field MapCustomizationActivity a>
	//   13   33:invokestatic    #25  <Method MapCustomizationViewState MapCustomizationActivity.h(MapCustomizationActivity)>
	//   14   36:getstatic       #37  <Field MapCustomizationViewState MapCustomizationViewState.KeepOutZoneSelected>
	//   15   39:if_acmpne       75
				mapsuiservice = MapCustomizationActivity.e(a);
	//   16   42:aload_0         
	//   17   43:getfield        #17  <Field MapCustomizationActivity a>
	//   18   46:invokestatic    #41  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
	//   19   49:astore_1        
				mapsuiservicecommand = MapsUIServiceCommand.RemoveKeepOutZone;
	//   20   50:getstatic       #47  <Field MapsUIServiceCommand MapsUIServiceCommand.RemoveKeepOutZone>
	//   21   53:astore_2        
			} else
	//*  22   54:goto            69
			{
				mapsuiservice = MapCustomizationActivity.e(a);
	//   23   57:aload_0         
	//   24   58:getfield        #17  <Field MapCustomizationActivity a>
	//   25   61:invokestatic    #41  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
	//   26   64:astore_1        
				mapsuiservicecommand = MapsUIServiceCommand.RemoveDoor;
	//   27   65:getstatic       #50  <Field MapsUIServiceCommand MapsUIServiceCommand.RemoveDoor>
	//   28   68:astore_2        
			}
			mapsuiservice.sendCommand(mapsuiservicecommand, ((com.irobot.core.MapsUIServiceData) (null)));
	//   29   69:aload_1         
	//   30   70:aload_2         
	//   31   71:aconst_null     
	//   32   72:invokevirtual   #56  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, com.irobot.core.MapsUIServiceData)>
		}
	//   33   75:return          
	}

	final MapCustomizationActivity a;

	MapCustomizationActivity$34(MapCustomizationActivity mapcustomizationactivity)
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
