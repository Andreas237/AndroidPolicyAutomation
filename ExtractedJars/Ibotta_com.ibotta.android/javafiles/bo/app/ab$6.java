// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			ab, bt, ax

class ab$6
	implements IEventSubscriber
{

	public void a(ax ax1)
	{
		try
		{
			ab.f(a).b(((Throwable) (ax1)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ab a>
	//    2    4:invokestatic    #29  <Method bt ab.f(ab)>
	//    3    7:aload_1         
	//    4    8:invokeinterface #35  <Method void bt.b(Throwable)>
			return;
	//    5   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(ax ax1)
	//*   6   14:astore_1        
		{
			AppboyLogger.e(ab.q(), "Failed to log the storage exception.", ((Throwable) (ax1)));
	//    7   15:invokestatic    #39  <Method String ab.q()>
	//    8   18:ldc1            #41  <String "Failed to log the storage exception.">
	//    9   20:aload_1         
	//   10   21:invokestatic    #47  <Method int AppboyLogger.e(String, String, Throwable)>
	//   11   24:pop             
		}
	//   12   25:return          
	}

	public void trigger(Object obj)
	{
		a((ax)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #51  <Class ax>
	//    3    5:invokevirtual   #53  <Method void a(ax)>
	//    4    8:return          
	}

	final ab a;

	ab$6(ab ab1)
	{
		a = ab1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ab a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
