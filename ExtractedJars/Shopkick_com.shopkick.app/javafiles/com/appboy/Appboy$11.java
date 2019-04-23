// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.bf;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$11
	implements Runnable
{

	public void run()
	{
		try
		{
			a.g.d();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Appboy a>
	//    2    4:getfield        #27  <Field bf Appboy.g>
	//    3    7:invokevirtual   #32  <Method void bf.d()>
			return;
	//    4   10:return          
		}
		catch(Exception exception)
	//*   5   11:astore_1        
		{
			AppboyLogger.w(Appboy.b(), "Failed to request data flush.", ((Throwable) (exception)));
	//    6   12:invokestatic    #36  <Method String Appboy.b()>
	//    7   15:ldc1            #38  <String "Failed to request data flush.">
	//    8   17:aload_1         
	//    9   18:invokestatic    #44  <Method int AppboyLogger.w(String, String, Throwable)>
	//   10   21:pop             
			Appboy.a(a, ((Throwable) (exception)));
	//   11   22:aload_0         
	//   12   23:getfield        #17  <Field Appboy a>
	//   13   26:aload_1         
	//   14   27:invokestatic    #47  <Method void Appboy.a(Appboy, Throwable)>
			return;
	//   15   30:return          
		}
	}

	final Appboy a;

	Appboy$11(Appboy appboy)
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
