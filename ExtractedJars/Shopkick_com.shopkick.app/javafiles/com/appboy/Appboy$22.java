// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.ea;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$22
	implements Runnable
{

	public void run()
	{
		AppboyLogger.v(Appboy.b(), "Starting up a new user dependency manager");
	//    0    0:invokestatic    #25  <Method String Appboy.b()>
	//    1    3:ldc1            #27  <String "Starting up a new user dependency manager">
	//    2    5:invokestatic    #33  <Method int AppboyLogger.v(String, String)>
	//    3    8:pop             
		ea ea1 = new ea(Appboy.a(a), Appboy.b(a), a.h, ((bo.app.aa) (Appboy.c(a))), Appboy.d(a), a.i, Appboy.c(), Appboy.d(), Appboy.e(a));
	//    4    9:new             #35  <Class ea>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:getfield        #16  <Field Appboy a>
	//    8   17:invokestatic    #38  <Method android.content.Context Appboy.a(Appboy)>
	//    9   20:aload_0         
	//   10   21:getfield        #16  <Field Appboy a>
	//   11   24:invokestatic    #41  <Method bo.app.i Appboy.b(Appboy)>
	//   12   27:aload_0         
	//   13   28:getfield        #16  <Field Appboy a>
	//   14   31:getfield        #45  <Field com.appboy.configuration.AppboyConfigurationProvider Appboy.h>
	//   15   34:aload_0         
	//   16   35:getfield        #16  <Field Appboy a>
	//   17   38:invokestatic    #49  <Method bo.app.z Appboy.c(Appboy)>
	//   18   41:aload_0         
	//   19   42:getfield        #16  <Field Appboy a>
	//   20   45:invokestatic    #53  <Method bo.app.ba Appboy.d(Appboy)>
	//   21   48:aload_0         
	//   22   49:getfield        #16  <Field Appboy a>
	//   23   52:getfield        #57  <Field bo.app.bp Appboy.i>
	//   24   55:invokestatic    #60  <Method boolean Appboy.c()>
	//   25   58:invokestatic    #62  <Method boolean Appboy.d()>
	//   26   61:aload_0         
	//   27   62:getfield        #16  <Field Appboy a>
	//   28   65:invokestatic    #66  <Method bo.app.br Appboy.e(Appboy)>
	//   29   68:invokespecial   #69  <Method void ea(android.content.Context, bo.app.i, com.appboy.configuration.AppboyConfigurationProvider, bo.app.aa, bo.app.ba, bo.app.bp, boolean, boolean, bo.app.br)>
	//   30   71:astore_1        
		Appboy.a(a, ea1);
	//   31   72:aload_0         
	//   32   73:getfield        #16  <Field Appboy a>
	//   33   76:aload_1         
	//   34   77:invokestatic    #72  <Method void Appboy.a(Appboy, ea)>
	//   35   80:return          
	}

	final Appboy a;

	Appboy$22(Appboy appboy)
	{
		a = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Appboy a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
