// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;


// Referenced classes of package com.irobot.home:
//			BraavaAboutRobotActivity_

class BraavaAboutRobotActivity_$6 extends org.androidannotations.api.a.a
{

	public void a()
	{
		try
		{
			BraavaAboutRobotActivity_.c(a);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field BraavaAboutRobotActivity_ a>
	//    2    4:invokestatic    #25  <Method void BraavaAboutRobotActivity_.c(BraavaAboutRobotActivity_)>
			return;
	//    3    7:return          
		}
		catch(Throwable throwable)
	//*   4    8:astore_1        
		{
			Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
	//    5    9:invokestatic    #31  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//    6   12:invokestatic    #35  <Method Thread Thread.currentThread()>
	//    7   15:aload_1         
	//    8   16:invokeinterface #41  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		}
	//    9   21:return          
	}

	final BraavaAboutRobotActivity_ a;

	BraavaAboutRobotActivity_$6(BraavaAboutRobotActivity_ braavaaboutrobotactivity_, String s, long l, String s1)
	{
		a = braavaaboutrobotactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field BraavaAboutRobotActivity_ a>
		super(s, l, s1);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:lload_3         
	//    6    8:aload           5
	//    7   10:invokespecial   #18  <Method void org.androidannotations.api.a$a(String, long, String)>
	//    8   13:return          
	}
}
