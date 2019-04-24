// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.RobotPadCategory;

// Referenced classes of package com.irobot.home:
//			BraavaPadSettingsActivity_

class BraavaPadSettingsActivity_$2 extends org.androidannotations.api.a.a
{

	public void a()
	{
		try
		{
			BraavaPadSettingsActivity_.a(c, a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field BraavaPadSettingsActivity_ c>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field RobotPadCategory a>
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field int b>
	//    6   12:invokestatic    #32  <Method void BraavaPadSettingsActivity_.a(BraavaPadSettingsActivity_, RobotPadCategory, int)>
			return;
	//    7   15:return          
		}
		catch(Throwable throwable)
	//*   8   16:astore_1        
		{
			Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
	//    9   17:invokestatic    #38  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//   10   20:invokestatic    #42  <Method Thread Thread.currentThread()>
	//   11   23:aload_1         
	//   12   24:invokeinterface #48  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		}
	//   13   29:return          
	}

	final RobotPadCategory a;
	final int b;
	final BraavaPadSettingsActivity_ c;

	BraavaPadSettingsActivity_$2(BraavaPadSettingsActivity_ braavapadsettingsactivity_, String s, long l, String s1, RobotPadCategory robotpadcategory, int i)
	{
		c = braavapadsettingsactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field BraavaPadSettingsActivity_ c>
		a = robotpadcategory;
	//    3    5:aload_0         
	//    4    6:aload           6
	//    5    8:putfield        #20  <Field RobotPadCategory a>
		b = i;
	//    6   11:aload_0         
	//    7   12:iload           7
	//    8   14:putfield        #22  <Field int b>
		super(s, l, s1);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:lload_3         
	//   12   20:aload           5
	//   13   22:invokespecial   #25  <Method void org.androidannotations.api.a$a(String, long, String)>
	//   14   25:return          
	}
}
