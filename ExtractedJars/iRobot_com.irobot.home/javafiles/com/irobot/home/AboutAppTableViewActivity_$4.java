// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;


// Referenced classes of package com.irobot.home:
//			AboutAppTableViewActivity_

class AboutAppTableViewActivity_$4 extends org.androidannotations.api.a.a
{

	public void a()
	{
		try
		{
			AboutAppTableViewActivity_.b(a);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AboutAppTableViewActivity_ a>
	//    2    4:invokestatic    #25  <Method void AboutAppTableViewActivity_.b(AboutAppTableViewActivity_)>
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

	final AboutAppTableViewActivity_ a;

	AboutAppTableViewActivity_$4(AboutAppTableViewActivity_ aboutapptableviewactivity_, String s, long l, String s1)
	{
		a = aboutapptableviewactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AboutAppTableViewActivity_ a>
		super(s, l, s1);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:lload_3         
	//    6    8:aload           5
	//    7   10:invokespecial   #18  <Method void org.androidannotations.api.a$a(String, long, String)>
	//    8   13:return          
	}
}