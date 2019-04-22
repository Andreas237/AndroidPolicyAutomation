// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			dh, bt, db

class dh$1
	implements Runnable
{

	public void run()
	{
		AppboyLogger.d(dh.n(), "Adding request to dispatch");
	//    0    0:invokestatic    #29  <Method String dh.n()>
	//    1    3:ldc1            #31  <String "Adding request to dispatch">
	//    2    5:invokestatic    #37  <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		dh.a(b).a(a);
	//    4    9:aload_0         
	//    5   10:getfield        #18  <Field dh b>
	//    6   13:invokestatic    #40  <Method bt dh.a(dh)>
	//    7   16:aload_0         
	//    8   17:getfield        #20  <Field db a>
	//    9   20:invokeinterface #45  <Method void bt.a(db)>
	//   10   25:return          
	}

	final db a;
	final dh b;

	dh$1(dh dh1, db db)
	{
		b = dh1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field dh b>
		a = db;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field db a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
