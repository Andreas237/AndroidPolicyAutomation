// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import com.facebook.stetho.common.LogUtil;
import java.io.IOException;

// Referenced classes of package com.facebook.stetho.server:
//			LocalSocketServer

public class ServerManager
{

	public ServerManager(LocalSocketServer localsocketserver)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mServer = localsocketserver;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field LocalSocketServer mServer>
	//    5    9:return          
	}

	private void startServer(LocalSocketServer localsocketserver)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #25  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("StethoListener-");
	//    4    8:aload_2         
	//    5    9:ldc1            #28  <String "StethoListener-">
	//    6   11:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(localsocketserver.getName());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #38  <Method String LocalSocketServer.getName()>
	//   11   20:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		((Thread) (new Thread(localsocketserver) {

			public void run()
			{
				try
				{
					server.run();
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
						server.getName()
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

			
			{
				this$0 = ServerManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ServerManager this$0>
				server = localsocketserver;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #19  <Field LocalSocketServer val$server>
				super(final_s);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #22  <Method void Thread(String)>
			//    9   15:return          
			}
		}
)).start();
	//   13   24:new             #6   <Class ServerManager$1>
	//   14   27:dup             
	//   15   28:aload_0         
	//   16   29:aload_2         
	//   17   30:invokevirtual   #41  <Method String StringBuilder.toString()>
	//   18   33:aload_1         
	//   19   34:invokespecial   #44  <Method void ServerManager$1(ServerManager, String, LocalSocketServer)>
	//   20   37:invokevirtual   #49  <Method void Thread.start()>
	//   21   40:return          
	}

	public void start()
	{
		if(!mStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field boolean mStarted>
	//*   2    4:ifne            21
		{
			mStarted = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #51  <Field boolean mStarted>
			startServer(mServer);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field LocalSocketServer mServer>
	//    9   17:invokespecial   #53  <Method void startServer(LocalSocketServer)>
			return;
	//   10   20:return          
		} else
		{
			throw new IllegalStateException("Already started");
	//   11   21:new             #55  <Class IllegalStateException>
	//   12   24:dup             
	//   13   25:ldc1            #57  <String "Already started">
	//   14   27:invokespecial   #60  <Method void IllegalStateException(String)>
	//   15   30:athrow          
		}
	}

	private static final String THREAD_PREFIX = "StethoListener";
	private final LocalSocketServer mServer;
	private volatile boolean mStarted;
}
