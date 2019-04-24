// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.home.model.rest.LanguagePack;

// Referenced classes of package com.irobot.home:
//			BaseRobotLanguageListActivity_

class BaseRobotLanguageListActivity_$8 extends org.androidannotations.api.a.a
{

	public void a()
	{
		try
		{
			BaseRobotLanguageListActivity_.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field BaseRobotLanguageListActivity_ b>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field LanguagePack a>
	//    4    8:invokestatic    #28  <Method void BaseRobotLanguageListActivity_.a(BaseRobotLanguageListActivity_, LanguagePack)>
			return;
	//    5   11:return          
		}
		catch(Throwable throwable)
	//*   6   12:astore_1        
		{
			Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
	//    7   13:invokestatic    #34  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//    8   16:invokestatic    #38  <Method Thread Thread.currentThread()>
	//    9   19:aload_1         
	//   10   20:invokeinterface #44  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		}
	//   11   25:return          
	}

	final LanguagePack a;
	final BaseRobotLanguageListActivity_ b;

	BaseRobotLanguageListActivity_$8(BaseRobotLanguageListActivity_ baserobotlanguagelistactivity_, String s, long l, String s1, LanguagePack languagepack)
	{
		b = baserobotlanguagelistactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field BaseRobotLanguageListActivity_ b>
		a = languagepack;
	//    3    5:aload_0         
	//    4    6:aload           6
	//    5    8:putfield        #18  <Field LanguagePack a>
		super(s, l, s1);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:lload_3         
	//    9   14:aload           5
	//   10   16:invokespecial   #21  <Method void org.androidannotations.api.a$a(String, long, String)>
	//   11   19:return          
	}
}
