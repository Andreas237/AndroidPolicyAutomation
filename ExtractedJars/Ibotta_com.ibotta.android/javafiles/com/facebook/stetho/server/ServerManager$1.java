// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import com.facebook.stetho.common.LogUtil;
import java.io.IOException;

// Referenced classes of package com.facebook.stetho.server:
//			ServerManager, LocalSocketServer

class ServerManager$1 extends Thread
{

	public void run()
	{
		try
		{
			val$server.run();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field LocalSocketServer val$server>
	//    2    4:invokevirtual   #31  <Method void LocalSocketServer.run()>
			return;
	//    3    7:return          
		}
		catch(IOException ioexception)
	//*   4    8:astore_1        
		{
			LogUtil.e(((Throwable) (ioexception)), "Could not start Stetho server: %s", new Object[] {
				val$server.getName()
			});
	//    5    9:aload_1         
	//    6   10:ldc1            #33  <String "Could not start Stetho server: %s">
	//    7   12:iconst_1        
	//    8   13:anewarray       Object[]
	//    9   16:dup             
	//   10   17:iconst_0        
	//   11   18:aload_0         
	//   12   19:getfield        #19  <Field LocalSocketServer val$server>
	//   13   22:invokevirtual   #39  <Method String LocalSocketServer.getName()>
	//   14   25:aastore         
	//   15   26:invokestatic    #45  <Method void LogUtil.e(Throwable, String, Object[])>
		}
	//   16   29:return          
	}

	final ServerManager this$0;
	final LocalSocketServer val$server;

	ServerManager$1(LocalSocketServer localsocketserver)
	{
		this$0 = final_servermanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ServerManager this$0>
		val$server = localsocketserver;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #19  <Field LocalSocketServer val$server>
		super(String.this);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #22  <Method void Thread(String)>
	//    9   15:return          
	}
}
