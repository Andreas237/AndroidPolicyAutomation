// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.bc;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$21
	implements Runnable
{

	public void run()
	{
		try
		{
			if(a.e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field Appboy a>
	//*   2    4:getfield        #26  <Field bc Appboy.e>
	//*   3    7:ifnull          21
			{
				a.e.a();
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field Appboy a>
	//    6   14:getfield        #26  <Field bc Appboy.e>
	//    7   17:invokevirtual   #29  <Method void bc.a()>
				return;
	//    8   20:return          
			}
		}
	//*   9   21:invokestatic    #33  <Method String Appboy.b()>
	//*  10   24:ldc1            #35  <String "Geofence manager was null. Not initializing geofences.">
	//*  11   26:invokestatic    #41  <Method int AppboyLogger.d(String, String)>
	//*  12   29:pop             
	//*  13   30:return          
		catch(Exception exception)
	//*  14   31:astore_1        
		{
			AppboyLogger.w(Appboy.b(), "Failed to initialize geofences with the geofence manager.", ((Throwable) (exception)));
	//   15   32:invokestatic    #33  <Method String Appboy.b()>
	//   16   35:ldc1            #43  <String "Failed to initialize geofences with the geofence manager.">
	//   17   37:aload_1         
	//   18   38:invokestatic    #47  <Method int AppboyLogger.w(String, String, Throwable)>
	//   19   41:pop             
			Appboy.a(a, ((Throwable) (exception)));
	//   20   42:aload_0         
	//   21   43:getfield        #16  <Field Appboy a>
	//   22   46:aload_1         
	//   23   47:invokestatic    #50  <Method void Appboy.a(Appboy, Throwable)>
			return;
	//   24   50:return          
		}
		AppboyLogger.d(Appboy.b(), "Geofence manager was null. Not initializing geofences.");
		return;
	}

	final Appboy a;

	Appboy$21(Appboy appboy)
	{
		a = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Appboy a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
