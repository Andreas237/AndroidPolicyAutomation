// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import android.content.Context;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.helper.PeersRegisteredListener;

// Referenced classes of package com.facebook.stetho.inspector.network:
//			ResponseBodyFileManager, AsyncPrettyPrinterInitializer, AsyncPrettyPrinterRegistry, AsyncPrettyPrinterExecutorHolder

public class NetworkPeerManager extends ChromePeerManager
{

	public NetworkPeerManager(ResponseBodyFileManager responsebodyfilemanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void ChromePeerManager()>
	//    2    4:aload_0         
	//    3    5:new             #6   <Class NetworkPeerManager$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #24  <Method void NetworkPeerManager$1(NetworkPeerManager)>
	//    7   13:putfield        #26  <Field PeersRegisteredListener mTempFileCleanup>
		mResponseBodyFileManager = responsebodyfilemanager;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #28  <Field ResponseBodyFileManager mResponseBodyFileManager>
		setListener(((com.facebook.stetho.inspector.helper.PeerRegistrationListener) (mTempFileCleanup)));
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #26  <Field PeersRegisteredListener mTempFileCleanup>
	//   14   26:invokevirtual   #32  <Method void setListener(com.facebook.stetho.inspector.helper.PeerRegistrationListener)>
	//   15   29:return          
	}

	public static NetworkPeerManager getInstanceOrNull()
	{
		com/facebook/stetho/inspector/network/NetworkPeerManager;
	//    0    0:ldc1            #2   <Class NetworkPeerManager>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		NetworkPeerManager networkpeermanager = sInstance;
	//    2    3:getstatic       #50  <Field NetworkPeerManager sInstance>
	//    3    6:astore_0        
		com/facebook/stetho/inspector/network/NetworkPeerManager;
	//    4    7:ldc1            #2   <Class NetworkPeerManager>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return networkpeermanager;
	//    6   10:aload_0         
	//    7   11:areturn         
		Exception exception;
		exception;
	//    8   12:astore_0        
	//*   9   13:ldc1            #2   <Class NetworkPeerManager>
		throw exception;
	//   10   15:monitorexit     
	//   11   16:aload_0         
	//   12   17:athrow          
	}

	public static NetworkPeerManager getOrCreateInstance(Context context)
	{
		com/facebook/stetho/inspector/network/NetworkPeerManager;
	//    0    0:ldc1            #2   <Class NetworkPeerManager>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(sInstance == null)
	//*   2    3:getstatic       #50  <Field NetworkPeerManager sInstance>
	//*   3    6:ifnonnull       30
			sInstance = new NetworkPeerManager(new ResponseBodyFileManager(context.getApplicationContext()));
	//    4    9:new             #2   <Class NetworkPeerManager>
	//    5   12:dup             
	//    6   13:new             #55  <Class ResponseBodyFileManager>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokevirtual   #61  <Method Context Context.getApplicationContext()>
	//   10   21:invokespecial   #64  <Method void ResponseBodyFileManager(Context)>
	//   11   24:invokespecial   #66  <Method void NetworkPeerManager(ResponseBodyFileManager)>
	//   12   27:putstatic       #50  <Field NetworkPeerManager sInstance>
		context = ((Context) (sInstance));
	//   13   30:getstatic       #50  <Field NetworkPeerManager sInstance>
	//   14   33:astore_0        
		com/facebook/stetho/inspector/network/NetworkPeerManager;
	//   15   34:ldc1            #2   <Class NetworkPeerManager>
		JVM INSTR monitorexit ;
	//   16   36:monitorexit     
		return ((NetworkPeerManager) (context));
	//   17   37:aload_0         
	//   18   38:areturn         
		context;
	//   19   39:astore_0        
	//*  20   40:ldc1            #2   <Class NetworkPeerManager>
		throw context;
	//   21   42:monitorexit     
	//   22   43:aload_0         
	//   23   44:athrow          
	}

	public AsyncPrettyPrinterRegistry getAsyncPrettyPrinterRegistry()
	{
		return mAsyncPrettyPrinterRegistry;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field AsyncPrettyPrinterRegistry mAsyncPrettyPrinterRegistry>
	//    2    4:areturn         
	}

	public ResponseBodyFileManager getResponseBodyFileManager()
	{
		return mResponseBodyFileManager;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ResponseBodyFileManager mResponseBodyFileManager>
	//    2    4:areturn         
	}

	public void setPrettyPrinterInitializer(AsyncPrettyPrinterInitializer asyncprettyprinterinitializer)
	{
		Util.throwIfNotNull(((Object) (mPrettyPrinterInitializer)));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field AsyncPrettyPrinterInitializer mPrettyPrinterInitializer>
	//    2    4:invokestatic    #78  <Method void Util.throwIfNotNull(Object)>
		mPrettyPrinterInitializer = (AsyncPrettyPrinterInitializer)Util.throwIfNull(((Object) (asyncprettyprinterinitializer)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokestatic    #82  <Method Object Util.throwIfNull(Object)>
	//    6   12:checkcast       #84  <Class AsyncPrettyPrinterInitializer>
	//    7   15:putfield        #43  <Field AsyncPrettyPrinterInitializer mPrettyPrinterInitializer>
	//    8   18:return          
	}

	private static NetworkPeerManager sInstance;
	private AsyncPrettyPrinterRegistry mAsyncPrettyPrinterRegistry;
	private AsyncPrettyPrinterInitializer mPrettyPrinterInitializer;
	private final ResponseBodyFileManager mResponseBodyFileManager;
	private final PeersRegisteredListener mTempFileCleanup = new PeersRegisteredListener() {

		protected void onFirstPeerRegistered()
		{
			AsyncPrettyPrinterExecutorHolder.ensureInitialized();
		//    0    0:invokestatic    #22  <Method void AsyncPrettyPrinterExecutorHolder.ensureInitialized()>
			if(mAsyncPrettyPrinterRegistry == null && mPrettyPrinterInitializer != null)
		//*   1    3:aload_0         
		//*   2    4:getfield        #12  <Field NetworkPeerManager this$0>
		//*   3    7:invokestatic    #26  <Method AsyncPrettyPrinterRegistry NetworkPeerManager.access$000(NetworkPeerManager)>
		//*   4   10:ifnonnull       57
		//*   5   13:aload_0         
		//*   6   14:getfield        #12  <Field NetworkPeerManager this$0>
		//*   7   17:invokestatic    #30  <Method AsyncPrettyPrinterInitializer NetworkPeerManager.access$100(NetworkPeerManager)>
		//*   8   20:ifnull          57
			{
				mAsyncPrettyPrinterRegistry = new AsyncPrettyPrinterRegistry();
		//    9   23:aload_0         
		//   10   24:getfield        #12  <Field NetworkPeerManager this$0>
		//   11   27:new             #32  <Class AsyncPrettyPrinterRegistry>
		//   12   30:dup             
		//   13   31:invokespecial   #33  <Method void AsyncPrettyPrinterRegistry()>
		//   14   34:invokestatic    #37  <Method AsyncPrettyPrinterRegistry NetworkPeerManager.access$002(NetworkPeerManager, AsyncPrettyPrinterRegistry)>
		//   15   37:pop             
				mPrettyPrinterInitializer.populatePrettyPrinters(mAsyncPrettyPrinterRegistry);
		//   16   38:aload_0         
		//   17   39:getfield        #12  <Field NetworkPeerManager this$0>
		//   18   42:invokestatic    #30  <Method AsyncPrettyPrinterInitializer NetworkPeerManager.access$100(NetworkPeerManager)>
		//   19   45:aload_0         
		//   20   46:getfield        #12  <Field NetworkPeerManager this$0>
		//   21   49:invokestatic    #26  <Method AsyncPrettyPrinterRegistry NetworkPeerManager.access$000(NetworkPeerManager)>
		//   22   52:invokeinterface #43  <Method void AsyncPrettyPrinterInitializer.populatePrettyPrinters(AsyncPrettyPrinterRegistry)>
			}
			mResponseBodyFileManager.cleanupFiles();
		//   23   57:aload_0         
		//   24   58:getfield        #12  <Field NetworkPeerManager this$0>
		//   25   61:invokestatic    #47  <Method ResponseBodyFileManager NetworkPeerManager.access$200(NetworkPeerManager)>
		//   26   64:invokevirtual   #52  <Method void ResponseBodyFileManager.cleanupFiles()>
		//   27   67:return          
		}

		protected void onLastPeerUnregistered()
		{
			mResponseBodyFileManager.cleanupFiles();
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field NetworkPeerManager this$0>
		//    2    4:invokestatic    #47  <Method ResponseBodyFileManager NetworkPeerManager.access$200(NetworkPeerManager)>
		//    3    7:invokevirtual   #52  <Method void ResponseBodyFileManager.cleanupFiles()>
			AsyncPrettyPrinterExecutorHolder.shutdown();
		//    4   10:invokestatic    #56  <Method void AsyncPrettyPrinterExecutorHolder.shutdown()>
		//    5   13:return          
		}

		final NetworkPeerManager this$0;

			
			{
				this$0 = NetworkPeerManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field NetworkPeerManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void PeersRegisteredListener()>
			//    5    9:return          
			}
	}
;


/*
	static AsyncPrettyPrinterRegistry access$000(NetworkPeerManager networkpeermanager)
	{
		return networkpeermanager.mAsyncPrettyPrinterRegistry;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field AsyncPrettyPrinterRegistry mAsyncPrettyPrinterRegistry>
	//    2    4:areturn         
	}

*/


/*
	static AsyncPrettyPrinterRegistry access$002(NetworkPeerManager networkpeermanager, AsyncPrettyPrinterRegistry asyncprettyprinterregistry)
	{
		networkpeermanager.mAsyncPrettyPrinterRegistry = asyncprettyprinterregistry;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field AsyncPrettyPrinterRegistry mAsyncPrettyPrinterRegistry>
		return asyncprettyprinterregistry;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static AsyncPrettyPrinterInitializer access$100(NetworkPeerManager networkpeermanager)
	{
		return networkpeermanager.mPrettyPrinterInitializer;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field AsyncPrettyPrinterInitializer mPrettyPrinterInitializer>
	//    2    4:areturn         
	}

*/


/*
	static ResponseBodyFileManager access$200(NetworkPeerManager networkpeermanager)
	{
		return networkpeermanager.mResponseBodyFileManager;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ResponseBodyFileManager mResponseBodyFileManager>
	//    2    4:areturn         
	}

*/
}
