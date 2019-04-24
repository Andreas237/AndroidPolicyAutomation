// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.home.model.rest.LanguagePack;

// Referenced classes of package com.irobot.home:
//			BaseRobotLanguageListActivity

private class BaseRobotLanguageListActivity$a
	implements android.content.DialogInterface$OnClickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		if(a.h())
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field BaseRobotLanguageListActivity a>
	//*   2    4:invokevirtual   #28  <Method boolean BaseRobotLanguageListActivity.h()>
	//*   3    7:ifeq            22
		{
			a.a(b);
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field BaseRobotLanguageListActivity a>
	//    6   14:aload_0         
	//    7   15:getfield        #21  <Field LanguagePack b>
	//    8   18:invokevirtual   #31  <Method void BaseRobotLanguageListActivity.a(LanguagePack)>
			return;
	//    9   21:return          
		} else
		{
			a.g(0x7f0f043f);
	//   10   22:aload_0         
	//   11   23:getfield        #16  <Field BaseRobotLanguageListActivity a>
	//   12   26:ldc1            #32  <Int 0x7f0f043f>
	//   13   28:invokevirtual   #36  <Method void BaseRobotLanguageListActivity.g(int)>
			return;
	//   14   31:return          
		}
	}

	final BaseRobotLanguageListActivity a;
	private LanguagePack b;

	public BaseRobotLanguageListActivity$a(BaseRobotLanguageListActivity baserobotlanguagelistactivity, LanguagePack languagepack)
	{
		a = baserobotlanguagelistactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field BaseRobotLanguageListActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
		b = languagepack;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field LanguagePack b>
	//    8   14:return          
	}
}
