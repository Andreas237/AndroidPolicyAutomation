// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			ad

public class ba
	implements Thread.UncaughtExceptionHandler
{

	public ba(ad ad1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		b = ad1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field ad b>
	//    5    9:return          
	}

	public void a(ad ad1)
	{
		b = ad1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field ad b>
	//    3    5:return          
	}

	public void uncaughtException(Thread thread, Throwable throwable)
	{
		try
		{
			if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field ad b>
	//*   2    4:ifnull          41
			{
				AppboyLogger.w(a, "Uncaught exception from thread. Publishing as Throwable event.", throwable);
	//    3    7:getstatic       #20  <Field String a>
	//    4   10:ldc1            #33  <String "Uncaught exception from thread. Publishing as Throwable event.">
	//    5   12:aload_2         
	//    6   13:invokestatic    #37  <Method int AppboyLogger.w(String, String, Throwable)>
	//    7   16:pop             
				b.a(((Object) (throwable)), java/lang/Throwable);
	//    8   17:aload_0         
	//    9   18:getfield        #27  <Field ad b>
	//   10   21:aload_2         
	//   11   22:ldc1            #39  <Class Throwable>
	//   12   24:invokeinterface #44  <Method void ad.a(Object, Class)>
				return;
	//   13   29:return          
			}
		}
		// Misplaced declaration of an exception variable
		catch(Thread thread)
	//*  14   30:astore_1        
		{
			AppboyLogger.w(a, "Failed to log throwable.", ((Throwable) (thread)));
	//   15   31:getstatic       #20  <Field String a>
	//   16   34:ldc1            #46  <String "Failed to log throwable.">
	//   17   36:aload_1         
	//   18   37:invokestatic    #37  <Method int AppboyLogger.w(String, String, Throwable)>
	//   19   40:pop             
		}
	//   20   41:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/ba);
	private ad b;

	static 
	{
	//    0    0:ldc1            #2   <Class ba>
	//    1    2:invokestatic    #18  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #20  <Field String a>
	//*   3    8:return          
	}
}
