// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.bc;
import bo.app.bv;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$18
	implements Runnable
{

	public void run()
	{
		try
		{
			if(b.e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Appboy b>
	//*   2    4:getfield        #31  <Field bc Appboy.e>
	//*   3    7:ifnull          25
			{
				b.e.a(a);
	//    4   10:aload_0         
	//    5   11:getfield        #18  <Field Appboy b>
	//    6   14:getfield        #31  <Field bc Appboy.e>
	//    7   17:aload_0         
	//    8   18:getfield        #20  <Field bv a>
	//    9   21:invokevirtual   #34  <Method void bc.a(bv)>
				return;
	//   10   24:return          
			}
		}
	//*  11   25:invokestatic    #37  <Method String Appboy.b()>
	//*  12   28:ldc1            #39  <String "Geofence manager was null. Not requesting geofence refresh.">
	//*  13   30:invokestatic    #45  <Method int AppboyLogger.d(String, String)>
	//*  14   33:pop             
	//*  15   34:return          
		catch(Exception exception)
	//*  16   35:astore_1        
		{
			AppboyLogger.w(Appboy.b(), "Failed to request geofence refresh.", ((Throwable) (exception)));
	//   17   36:invokestatic    #37  <Method String Appboy.b()>
	//   18   39:ldc1            #47  <String "Failed to request geofence refresh.">
	//   19   41:aload_1         
	//   20   42:invokestatic    #51  <Method int AppboyLogger.w(String, String, Throwable)>
	//   21   45:pop             
			Appboy.a(b, ((Throwable) (exception)));
	//   22   46:aload_0         
	//   23   47:getfield        #18  <Field Appboy b>
	//   24   50:aload_1         
	//   25   51:invokestatic    #54  <Method void Appboy.a(Appboy, Throwable)>
			return;
	//   26   54:return          
		}
		AppboyLogger.d(Appboy.b(), "Geofence manager was null. Not requesting geofence refresh.");
		return;
	}

	final bv a;
	final Appboy b;

	Appboy$18(Appboy appboy, bv bv)
	{
		b = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Appboy b>
		a = bv;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field bv a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
