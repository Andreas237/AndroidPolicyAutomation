// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;

// Referenced classes of package com.irobot.home:
//			AccountSettingsActivity

class AccountSettingsActivity$1
	implements android.content.istener
{

	public void onDismiss(DialogInterface dialoginterface)
	{
		AccountSettingsActivity.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AccountSettingsActivity a>
	//    2    4:invokestatic    #24  <Method void AccountSettingsActivity.a(AccountSettingsActivity)>
	//    3    7:return          
	}

	final AccountSettingsActivity a;

	AccountSettingsActivity$1(AccountSettingsActivity accountsettingsactivity)
	{
		a = accountsettingsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AccountSettingsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
