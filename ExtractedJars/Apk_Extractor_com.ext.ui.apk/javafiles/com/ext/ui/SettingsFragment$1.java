// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.content.*;

// Referenced classes of package com.ext.ui:
//			SettingsFragment

class SettingsFragment$1 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field SettingsFragment a>
	//    2    4:invokevirtual   #20  <Method void SettingsFragment.a()>
	//    3    7:return          
	}

	final SettingsFragment a;

	SettingsFragment$1(SettingsFragment settingsfragment)
	{
		a = settingsfragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field SettingsFragment a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
