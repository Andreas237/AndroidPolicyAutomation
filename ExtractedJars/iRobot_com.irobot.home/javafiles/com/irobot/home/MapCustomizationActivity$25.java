// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.irobot.core.*;

// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity

class MapCustomizationActivity$25
	implements android.content.ner
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		dialoginterface = ((DialogInterface) (MapsUIServiceData.create()));
	//    0    0:invokestatic    #36  <Method MapsUIServiceData MapsUIServiceData.create()>
	//    1    3:astore_1        
		((MapsUIServiceData) (dialoginterface)).setNewMapName(((Object) (a.getText())).toString());
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field EditText a>
	//    5    9:invokevirtual   #42  <Method android.text.Editable EditText.getText()>
	//    6   12:invokevirtual   #46  <Method String Object.toString()>
	//    7   15:invokevirtual   #50  <Method void MapsUIServiceData.setNewMapName(String)>
		MapCustomizationActivity.e(c).sendCommand(MapsUIServiceCommand.NewMapName, ((MapsUIServiceData) (dialoginterface)));
	//    8   18:aload_0         
	//    9   19:getfield        #21  <Field MapCustomizationActivity c>
	//   10   22:invokestatic    #54  <Method MapsUIService MapCustomizationActivity.e(MapCustomizationActivity)>
	//   11   25:getstatic       #60  <Field MapsUIServiceCommand MapsUIServiceCommand.NewMapName>
	//   12   28:aload_1         
	//   13   29:invokevirtual   #66  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		dialoginterface = ((DialogInterface) ((InputMethodManager)c.getSystemService("input_method")));
	//   14   32:aload_0         
	//   15   33:getfield        #21  <Field MapCustomizationActivity c>
	//   16   36:ldc1            #68  <String "input_method">
	//   17   38:invokevirtual   #72  <Method Object MapCustomizationActivity.getSystemService(String)>
	//   18   41:checkcast       #74  <Class InputMethodManager>
	//   19   44:astore_1        
		if(dialoginterface != null)
	//*  20   45:aload_1         
	//*  21   46:ifnull          62
			((InputMethodManager) (dialoginterface)).hideSoftInputFromWindow(b.getWindowToken(), 2);
	//   22   49:aload_1         
	//   23   50:aload_0         
	//   24   51:getfield        #25  <Field View b>
	//   25   54:invokevirtual   #80  <Method android.os.IBinder View.getWindowToken()>
	//   26   57:iconst_2        
	//   27   58:invokevirtual   #84  <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
	//   28   61:pop             
	//   29   62:return          
	}

	final EditText a;
	final View b;
	final MapCustomizationActivity c;

	MapCustomizationActivity$25(MapCustomizationActivity mapcustomizationactivity, EditText edittext, View view)
	{
		c = mapcustomizationactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field MapCustomizationActivity c>
		a = edittext;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field EditText a>
		b = view;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field View b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
