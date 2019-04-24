// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.widget.CompoundButton;

// Referenced classes of package com.pactforcure.app.ui:
//			SettingsActivity

final class SettingsActivity$$Lambda$1
	implements android.widget.ngeListener
{

	public static android.widget.ngeListener lambdaFactory$(SettingsActivity settingsactivity)
	{
		return ((android.widget.ngeListener) (new SettingsActivity$$Lambda$1(settingsactivity)));
	//    0    0:new             #2   <Class SettingsActivity$$Lambda$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void SettingsActivity$$Lambda$1(SettingsActivity)>
	//    4    8:areturn         
	}

	public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
	{
		SettingsActivity.lambda$new$47(arg$1, compoundbutton, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SettingsActivity arg$1>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #28  <Method void SettingsActivity.lambda$new$47(SettingsActivity, CompoundButton, boolean)>
	//    5    9:return          
	}

	private final SettingsActivity arg$1;

	private SettingsActivity$$Lambda$1(SettingsActivity settingsactivity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		arg$1 = settingsactivity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field SettingsActivity arg$1>
	//    5    9:return          
	}
}
