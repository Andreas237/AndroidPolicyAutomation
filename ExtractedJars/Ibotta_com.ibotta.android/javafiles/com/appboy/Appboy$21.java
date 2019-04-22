// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.bl;
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
			if(b.e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Appboy b>
	//*   2    4:getfield        #31  <Field bl Appboy.e>
	//*   3    7:ifnull          25
			{
				b.e.b(a);
	//    4   10:aload_0         
	//    5   11:getfield        #18  <Field Appboy b>
	//    6   14:getfield        #31  <Field bl Appboy.e>
	//    7   17:aload_0         
	//    8   18:getfield        #20  <Field boolean a>
	//    9   21:invokevirtual   #35  <Method void bl.b(boolean)>
				return;
	//   10   24:return          
			}
		}
	//*  11   25:invokestatic    #38  <Method String Appboy.b()>
	//*  12   28:ldc1            #40  <String "Geofence manager was null. Not requesting geofence refresh.">
	//*  13   30:invokestatic    #46  <Method int AppboyLogger.d(String, String)>
	//*  14   33:pop             
	//*  15   34:return          
		catch(Exception exception)
	//*  16   35:astore_1        
		{
			String s = Appboy.b();
	//   17   36:invokestatic    #38  <Method String Appboy.b()>
	//   18   39:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   19   40:new             #48  <Class StringBuilder>
	//   20   43:dup             
	//   21   44:invokespecial   #49  <Method void StringBuilder()>
	//   22   47:astore_3        
			stringbuilder.append("Failed to request geofence refresh with rate limit ignore: ");
	//   23   48:aload_3         
	//   24   49:ldc1            #51  <String "Failed to request geofence refresh with rate limit ignore: ">
	//   25   51:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
			stringbuilder.append(a);
	//   27   55:aload_3         
	//   28   56:aload_0         
	//   29   57:getfield        #20  <Field boolean a>
	//   30   60:invokevirtual   #58  <Method StringBuilder StringBuilder.append(boolean)>
	//   31   63:pop             
			AppboyLogger.w(s, stringbuilder.toString(), ((Throwable) (exception)));
	//   32   64:aload_2         
	//   33   65:aload_3         
	//   34   66:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   35   69:aload_1         
	//   36   70:invokestatic    #65  <Method int AppboyLogger.w(String, String, Throwable)>
	//   37   73:pop             
			Appboy.a(b, ((Throwable) (exception)));
	//   38   74:aload_0         
	//   39   75:getfield        #18  <Field Appboy b>
	//   40   78:aload_1         
	//   41   79:invokestatic    #68  <Method void Appboy.a(Appboy, Throwable)>
			return;
	//   42   82:return          
		}
		AppboyLogger.d(Appboy.b(), "Geofence manager was null. Not requesting geofence refresh.");
		return;
	}

	final boolean a;
	final Appboy b;

	Appboy$21(Appboy appboy, boolean flag)
	{
		b = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Appboy b>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #20  <Field boolean a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
