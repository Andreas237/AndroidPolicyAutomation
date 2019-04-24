// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity

class MapCustomizationActivity$22
	implements android.content.ner
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		a.runOnUiThread(new Runnable() {

			public void run()
			{
				MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
			//    0    0:invokestatic    #28  <Method MapsUIServiceData MapsUIServiceData.create()>
			//    1    3:astore_1        
				mapsuiservicedata.setErrorDismissed(MapCustomizationErrors.SaveTimedOut);
			//    2    4:aload_1         
			//    3    5:getstatic       #34  <Field MapCustomizationErrors MapCustomizationErrors.SaveTimedOut>
			//    4    8:invokevirtual   #38  <Method void MapsUIServiceData.setErrorDismissed(MapCustomizationErrors)>
				MapCustomizationActivity.e(a.a).sendCommand(MapsUIServiceCommand.ErrorDismissed, mapsuiservicedata);
			//    5   11:aload_0         
			//    6   12:getfield        #17  <Field MapCustomizationActivity$22 a>
			//    7   15:getfield        #41  <Field MapCustomizationActivity MapCustomizationActivity$22.a>
			//    8   18:invokestatic    #47  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
			//    9   21:getstatic       #53  <Field MapsUIServiceCommand MapsUIServiceCommand.ErrorDismissed>
			//   10   24:aload_1         
			//   11   25:invokevirtual   #59  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
				MapCustomizationActivity.i(a.a);
			//   12   28:aload_0         
			//   13   29:getfield        #17  <Field MapCustomizationActivity$22 a>
			//   14   32:getfield        #41  <Field MapCustomizationActivity MapCustomizationActivity$22.a>
			//   15   35:invokestatic    #63  <Method void MapCustomizationActivity.i(MapCustomizationActivity)>
			//   16   38:return          
			}

			final MapCustomizationActivity._cls22 a;

			
			{
				a = MapCustomizationActivity._cls22.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MapCustomizationActivity$22 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MapCustomizationActivity a>
	//    2    4:new             #13  <Class MapCustomizationActivity$22$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #27  <Method void MapCustomizationActivity$22$1(MapCustomizationActivity$22)>
	//    6   12:invokevirtual   #31  <Method void MapCustomizationActivity.runOnUiThread(Runnable)>
	//    7   15:return          
	}

	final MapCustomizationActivity a;

	MapCustomizationActivity$22(MapCustomizationActivity mapcustomizationactivity)
	{
		a = mapcustomizationactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field MapCustomizationActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
