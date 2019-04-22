// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.bo;
import bo.app.ci;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$8
	implements Runnable
{

	public void run()
	{
		try
		{
			a.g.a(((bo.app.cc) (ci.j())));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Appboy a>
	//    2    4:getfield        #27  <Field bo Appboy.g>
	//    3    7:invokestatic    #33  <Method ci ci.j()>
	//    4   10:invokevirtual   #38  <Method boolean bo.a(bo.app.cc)>
	//    5   13:pop             
			return;
	//    6   14:return          
		}
		catch(Exception exception)
	//*   7   15:astore_1        
		{
			AppboyLogger.w(Appboy.b(), "Failed to log that the feed was displayed.", ((Throwable) (exception)));
	//    8   16:invokestatic    #42  <Method String Appboy.b()>
	//    9   19:ldc1            #44  <String "Failed to log that the feed was displayed.">
	//   10   21:aload_1         
	//   11   22:invokestatic    #50  <Method int AppboyLogger.w(String, String, Throwable)>
	//   12   25:pop             
			Appboy.a(a, ((Throwable) (exception)));
	//   13   26:aload_0         
	//   14   27:getfield        #17  <Field Appboy a>
	//   15   30:aload_1         
	//   16   31:invokestatic    #53  <Method void Appboy.a(Appboy, Throwable)>
			return;
	//   17   34:return          
		}
	}

	final Appboy a;

	Appboy$8(Appboy appboy)
	{
		a = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Appboy a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
