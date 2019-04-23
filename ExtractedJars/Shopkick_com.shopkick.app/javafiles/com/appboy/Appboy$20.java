// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.bc;
import bo.app.u;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$20
	implements Runnable
{

	public void run()
	{
		try
		{
			if(c.e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field Appboy c>
	//*   2    4:getfield        #35  <Field bc Appboy.e>
	//*   3    7:ifnull          29
			{
				c.e.b(a, b);
	//    4   10:aload_0         
	//    5   11:getfield        #20  <Field Appboy c>
	//    6   14:getfield        #35  <Field bc Appboy.e>
	//    7   17:aload_0         
	//    8   18:getfield        #22  <Field String a>
	//    9   21:aload_0         
	//   10   22:getfield        #24  <Field u b>
	//   11   25:invokevirtual   #39  <Method void bc.b(String, u)>
				return;
	//   12   28:return          
			}
		}
	//*  13   29:invokestatic    #42  <Method String Appboy.b()>
	//*  14   32:ldc1            #44  <String "Geofence manager was null. Not posting geofence report">
	//*  15   34:invokestatic    #50  <Method int AppboyLogger.d(String, String)>
	//*  16   37:pop             
	//*  17   38:return          
		catch(Exception exception)
	//*  18   39:astore_1        
		{
			AppboyLogger.w(Appboy.b(), "Failed to post geofence report.", ((Throwable) (exception)));
	//   19   40:invokestatic    #42  <Method String Appboy.b()>
	//   20   43:ldc1            #52  <String "Failed to post geofence report.">
	//   21   45:aload_1         
	//   22   46:invokestatic    #56  <Method int AppboyLogger.w(String, String, Throwable)>
	//   23   49:pop             
			Appboy.a(c, ((Throwable) (exception)));
	//   24   50:aload_0         
	//   25   51:getfield        #20  <Field Appboy c>
	//   26   54:aload_1         
	//   27   55:invokestatic    #59  <Method void Appboy.a(Appboy, Throwable)>
			return;
	//   28   58:return          
		}
		AppboyLogger.d(Appboy.b(), "Geofence manager was null. Not posting geofence report");
		return;
	}

	final String a;
	final u b;
	final Appboy c;

	Appboy$20(Appboy appboy, String s, u u)
	{
		c = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Appboy c>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field String a>
		b = u;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field u b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
