// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho;

import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.server.LocalSocketHttpServer;
import java.io.IOException;

// Referenced classes of package com.facebook.stetho:
//			Stetho

static final class Stetho$1 extends Thread
{

	public void run()
	{
		LocalSocketHttpServer localsockethttpserver = new LocalSocketHttpServer(((com.facebook.stetho.server.RegistryInitializer) (val$initializer)));
	//    0    0:new             #25  <Class LocalSocketHttpServer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field Stetho$Initializer val$initializer>
	//    4    8:invokespecial   #28  <Method void LocalSocketHttpServer(com.facebook.stetho.server.RegistryInitializer)>
	//    5   11:astore_1        
		try
		{
			localsockethttpserver.run();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #30  <Method void LocalSocketHttpServer.run()>
			return;
	//    8   16:return          
		}
		catch(IOException ioexception)
	//*   9   17:astore_1        
		{
			LogUtil.e(((Throwable) (ioexception)), "Could not start Stetho");
	//   10   18:aload_1         
	//   11   19:ldc1            #32  <String "Could not start Stetho">
	//   12   21:invokestatic    #38  <Method void LogUtil.e(Throwable, String)>
		}
	//   13   24:return          
	}

	final itializer val$initializer;

	Stetho$1(String s, itializer itializer)
	{
		val$initializer = itializer;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field Stetho$Initializer val$initializer>
		super(s);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #18  <Method void Thread(String)>
	//    6   10:return          
	}
}
