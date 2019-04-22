// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.bo;
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
			a.g.a((new bo.app.cm.a()).a());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Appboy a>
	//    2    4:getfield        #27  <Field bo Appboy.g>
	//    3    7:new             #29  <Class bo.app.cm$a>
	//    4   10:dup             
	//    5   11:invokespecial   #30  <Method void bo.app.cm$a()>
	//    6   14:invokevirtual   #33  <Method bo.app.cm$a bo.app.cm$a.a()>
	//    7   17:invokevirtual   #38  <Method void bo.a(bo.app.cm$a)>
			return;
	//    8   20:return          
		}
		catch(Exception exception)
	//*   9   21:astore_1        
		{
			AppboyLogger.w(Appboy.b(), "Failed to request refresh of feed.", ((Throwable) (exception)));
	//   10   22:invokestatic    #42  <Method String Appboy.b()>
	//   11   25:ldc1            #44  <String "Failed to request refresh of feed.">
	//   12   27:aload_1         
	//   13   28:invokestatic    #50  <Method int AppboyLogger.w(String, String, Throwable)>
	//   14   31:pop             
			Appboy.a(a, ((Throwable) (exception)));
	//   15   32:aload_0         
	//   16   33:getfield        #17  <Field Appboy a>
	//   17   36:aload_1         
	//   18   37:invokestatic    #53  <Method void Appboy.a(Appboy, Throwable)>
			return;
	//   19   40:return          
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
