// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.net.wifi.WifiManager;

// Referenced classes of package com.irobot.home:
//			WizardFragmentActivity

class WizardFragmentActivity$3
	implements android.content.stener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		a.C.setWifiEnabled(true);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field WizardFragmentActivity a>
	//    2    4:getfield        #26  <Field WifiManager WizardFragmentActivity.C>
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #32  <Method boolean WifiManager.setWifiEnabled(boolean)>
	//    5   11:pop             
		WizardFragmentActivity.b(a);
	//    6   12:aload_0         
	//    7   13:getfield        #17  <Field WizardFragmentActivity a>
	//    8   16:invokestatic    #35  <Method void WizardFragmentActivity.b(WizardFragmentActivity)>
	//    9   19:return          
	}

	final WizardFragmentActivity a;

	WizardFragmentActivity$3(WizardFragmentActivity wizardfragmentactivity)
	{
		a = wizardfragmentactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field WizardFragmentActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
