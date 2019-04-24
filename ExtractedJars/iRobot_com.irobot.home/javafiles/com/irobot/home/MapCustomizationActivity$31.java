// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity

class MapCustomizationActivity$31
	implements android.content.ner
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		MapCustomizationActivity.e(a).sendCommand(MapsUIServiceCommand.CancelCustomization, ((MapsUIServiceData) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MapCustomizationActivity a>
	//    2    4:invokestatic    #26  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
	//    3    7:getstatic       #32  <Field MapsUIServiceCommand MapsUIServiceCommand.CancelCustomization>
	//    4   10:aconst_null     
	//    5   11:invokevirtual   #38  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		if(MapCustomizationActivity.e(a).getServiceData().getIsCustomizationCancelled())
	//*   6   14:aload_0         
	//*   7   15:getfield        #17  <Field MapCustomizationActivity a>
	//*   8   18:invokestatic    #26  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
	//*   9   21:invokevirtual   #42  <Method MapsUIServiceData MapsUIService.getServiceData()>
	//*  10   24:invokevirtual   #48  <Method boolean MapsUIServiceData.getIsCustomizationCancelled()>
	//*  11   27:ifeq            63
		{
			a.setResult(0);
	//   12   30:aload_0         
	//   13   31:getfield        #17  <Field MapCustomizationActivity a>
	//   14   34:iconst_0        
	//   15   35:invokevirtual   #52  <Method void MapCustomizationActivity.setResult(int)>
			MapCustomizationActivity.e(a).unregisterSubscriber(((com.irobot.core.MapsUIServiceDataCallback) (MapCustomizationActivity.f(a))));
	//   16   38:aload_0         
	//   17   39:getfield        #17  <Field MapCustomizationActivity a>
	//   18   42:invokestatic    #26  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
	//   19   45:aload_0         
	//   20   46:getfield        #17  <Field MapCustomizationActivity a>
	//   21   49:invokestatic    #56  <Method MapCustomizationActivity$a MapCustomizationActivity.f(MapCustomizationActivity)>
	//   22   52:invokevirtual   #60  <Method boolean MapsUIService.unregisterSubscriber(com.irobot.core.MapsUIServiceDataCallback)>
	//   23   55:pop             
			MapCustomizationActivity.g(a);
	//   24   56:aload_0         
	//   25   57:getfield        #17  <Field MapCustomizationActivity a>
	//   26   60:invokestatic    #63  <Method void MapCustomizationActivity.g(MapCustomizationActivity)>
		}
	//   27   63:return          
	}

	final MapCustomizationActivity a;

	MapCustomizationActivity$31(MapCustomizationActivity mapcustomizationactivity)
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
