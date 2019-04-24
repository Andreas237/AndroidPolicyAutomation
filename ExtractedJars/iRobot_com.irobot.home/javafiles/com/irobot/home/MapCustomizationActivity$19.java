// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity

class MapCustomizationActivity$19
	implements android.content.ner
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		dialoginterface = ((DialogInterface) (MapsUIServiceData.create()));
	//    0    0:invokestatic    #32  <Method MapsUIServiceData MapsUIServiceData.create()>
	//    1    3:astore_1        
		((MapsUIServiceData) (dialoginterface)).setErrorDismissed(a);
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field MapCustomizationErrors a>
	//    5    9:invokevirtual   #35  <Method void MapsUIServiceData.setErrorDismissed(MapCustomizationErrors)>
		MapCustomizationActivity.e(b).sendCommand(MapsUIServiceCommand.ErrorDismissed, ((MapsUIServiceData) (dialoginterface)));
	//    6   12:aload_0         
	//    7   13:getfield        #18  <Field MapCustomizationActivity b>
	//    8   16:invokestatic    #39  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
	//    9   19:getstatic       #45  <Field MapsUIServiceCommand MapsUIServiceCommand.ErrorDismissed>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #51  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
	//   12   26:return          
	}

	final MapCustomizationErrors a;
	final MapCustomizationActivity b;

	MapCustomizationActivity$19(MapCustomizationActivity mapcustomizationactivity, MapCustomizationErrors mapcustomizationerrors)
	{
		b = mapcustomizationactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field MapCustomizationActivity b>
		a = mapcustomizationerrors;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field MapCustomizationErrors a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
