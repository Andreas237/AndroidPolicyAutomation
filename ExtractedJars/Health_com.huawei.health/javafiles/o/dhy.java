// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.os.*;

public class dhy
{

	public dhy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	public static Looper a()
	{
		return e.getLooper();
	//    0    0:getstatic       #10  <Field HandlerThread e>
	//    1    3:invokevirtual   #29  <Method Looper HandlerThread.getLooper()>
	//    2    6:areturn         
	}

	public static Handler e()
	{
		return new Handler(a());
	//    0    0:new             #32  <Class Handler>
	//    1    3:dup             
	//    2    4:invokestatic    #34  <Method Looper a()>
	//    3    7:invokespecial   #37  <Method void Handler(Looper)>
	//    4   10:areturn         
	}

	private static HandlerThread e;

	static 
	{
		e = null;
	//    0    0:aconst_null     
	//    1    1:putstatic       #10  <Field HandlerThread e>
		e = new HandlerThread("logfile_thread");
	//    2    4:new             #12  <Class HandlerThread>
	//    3    7:dup             
	//    4    8:ldc1            #14  <String "logfile_thread">
	//    5   10:invokespecial   #18  <Method void HandlerThread(String)>
	//    6   13:putstatic       #10  <Field HandlerThread e>
		e.start();
	//    7   16:getstatic       #10  <Field HandlerThread e>
	//    8   19:invokevirtual   #21  <Method void HandlerThread.start()>
	//*   9   22:return          
	}
}
