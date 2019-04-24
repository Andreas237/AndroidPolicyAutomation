// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Context;
import android.content.DialogInterface;
import android.net.wifi.WifiManager;

// Referenced classes of package com.irobot.home:
//			BaseDetectedSetupActivity

class BaseDetectedSetupActivity$1
	implements android.content.ner
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		((WifiManager)a.getApplicationContext().getSystemService("wifi")).setWifiEnabled(true);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BaseDetectedSetupActivity a>
	//    2    4:invokevirtual   #26  <Method Context BaseDetectedSetupActivity.getApplicationContext()>
	//    3    7:ldc1            #28  <String "wifi">
	//    4    9:invokevirtual   #34  <Method Object Context.getSystemService(String)>
	//    5   12:checkcast       #36  <Class WifiManager>
	//    6   15:iconst_1        
	//    7   16:invokevirtual   #40  <Method boolean WifiManager.setWifiEnabled(boolean)>
	//    8   19:pop             
		a.f();
	//    9   20:aload_0         
	//   10   21:getfield        #17  <Field BaseDetectedSetupActivity a>
	//   11   24:invokevirtual   #43  <Method void BaseDetectedSetupActivity.f()>
	//   12   27:return          
	}

	final BaseDetectedSetupActivity a;

	BaseDetectedSetupActivity$1(BaseDetectedSetupActivity basedetectedsetupactivity)
	{
		a = basedetectedsetupactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BaseDetectedSetupActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
