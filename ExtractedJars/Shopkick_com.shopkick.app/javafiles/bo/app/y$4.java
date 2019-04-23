// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			y, bl, ap

class y$4
	implements IEventSubscriber
{

	public void a(ap ap1)
	{
		try
		{
			y.f(a).a(ap1);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field y a>
	//    2    4:invokestatic    #29  <Method bl y.f(y)>
	//    3    7:aload_1         
	//    4    8:invokeinterface #33  <Method void bl.a(ap)>
			return;
	//    5   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(ap ap1)
	//*   6   14:astore_1        
		{
			AppboyLogger.e(y.o(), "Failed to log the database exception.", ((Throwable) (ap1)));
	//    7   15:invokestatic    #37  <Method String y.o()>
	//    8   18:ldc1            #39  <String "Failed to log the database exception.">
	//    9   20:aload_1         
	//   10   21:invokestatic    #45  <Method int AppboyLogger.e(String, String, Throwable)>
	//   11   24:pop             
		}
	//   12   25:return          
	}

	public void trigger(Object obj)
	{
		a((ap)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #49  <Class ap>
	//    3    5:invokevirtual   #50  <Method void a(ap)>
	//    4    8:return          
	}

	final y a;

	y$4(y y1)
	{
		a = y1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field y a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
