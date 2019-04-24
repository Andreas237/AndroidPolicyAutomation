// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;


// Referenced classes of package com.irobot.home:
//			CleaningPassSettingsActivity

class CleaningPassSettingsActivity$1
	implements Runnable
{

	public void run()
	{
		if(CleaningPassSettingsActivity.a(a) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field CleaningPassSettingsActivity a>
	//*   2    4:invokestatic    #22  <Method com.irobot.core.MultiPassMode CleaningPassSettingsActivity.a(CleaningPassSettingsActivity)>
	//*   3    7:ifnull          18
			CleaningPassSettingsActivity.a(a, ((com.irobot.core.MultiPassMode) (null)));
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field CleaningPassSettingsActivity a>
	//    6   14:aconst_null     
	//    7   15:invokestatic    #25  <Method void CleaningPassSettingsActivity.a(CleaningPassSettingsActivity, com.irobot.core.MultiPassMode)>
	//    8   18:return          
	}

	final CleaningPassSettingsActivity a;

	CleaningPassSettingsActivity$1(CleaningPassSettingsActivity cleaningpasssettingsactivity)
	{
		a = cleaningpasssettingsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field CleaningPassSettingsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
