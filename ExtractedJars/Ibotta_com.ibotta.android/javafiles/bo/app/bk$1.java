// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			bk, t

class bk$1
	implements Runnable
{

	public void run()
	{
		AppboyLogger.d(bk.b(), "Started offline AppboyEvent recovery task.");
	//    0    0:invokestatic    #28  <Method String bk.b()>
	//    1    3:ldc1            #30  <String "Started offline AppboyEvent recovery task.">
	//    2    5:invokestatic    #36  <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		bk.a(a, bk.a(b), bk.b(b));
	//    4    9:aload_0         
	//    5   10:getfield        #20  <Field t a>
	//    6   13:aload_0         
	//    7   14:getfield        #18  <Field bk b>
	//    8   17:invokestatic    #39  <Method ds bk.a(bk)>
	//    9   20:aload_0         
	//   10   21:getfield        #18  <Field bk b>
	//   11   24:invokestatic    #41  <Method ds bk.b(bk)>
	//   12   27:invokestatic    #44  <Method void bk.a(t, ds, ds)>
	//   13   30:return          
	}

	final t a;
	final bk b;

	bk$1(bk bk1, t t)
	{
		b = bk1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field bk b>
		a = t;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field t a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
