// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import android.content.Context;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.helper.PeersRegisteredListener;

// Referenced classes of package com.facebook.stetho.inspector.network:
//			ResponseBodyFileManager

public class NetworkPeerManager extends ChromePeerManager
{

	public NetworkPeerManager(ResponseBodyFileManager responsebodyfilemanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void ChromePeerManager()>
	//    2    4:aload_0         
	//    3    5:new             #6   <Class NetworkPeerManager$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #20  <Method void NetworkPeerManager$1(NetworkPeerManager)>
	//    7   13:putfield        #22  <Field PeersRegisteredListener mTempFileCleanup>
		mResponseBodyFileManager = responsebodyfilemanager;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #24  <Field ResponseBodyFileManager mResponseBodyFileManager>
		setListener(((com.facebook.stetho.inspector.helper.PeerRegistrationListener) (mTempFileCleanup)));
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #22  <Field PeersRegisteredListener mTempFileCleanup>
	//   14   26:invokevirtual   #28  <Method void setListener(com.facebook.stetho.inspector.helper.PeerRegistrationListener)>
	//   15   29:return          
	}

	public static NetworkPeerManager getInstanceOrNull()
	{
		com/facebook/stetho/inspector/network/NetworkPeerManager;
	//    0    0:ldc1            #2   <Class NetworkPeerManager>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		NetworkPeerManager networkpeermanager = sInstance;
	//    2    3:getstatic       #36  <Field NetworkPeerManager sInstance>
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
	//*   2    3:getstatic       #36  <Field NetworkPeerManager sInstance>
	//*   3    6:ifnonnull       30
			sInstance = new NetworkPeerManager(new ResponseBodyFileManager(context.getApplicationContext()));
	//    4    9:new             #2   <Class NetworkPeerManager>
	//    5   12:dup             
	//    6   13:new             #41  <Class ResponseBodyFileManager>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokevirtual   #47  <Method Context Context.getApplicationContext()>
	//   10   21:invokespecial   #50  <Method void ResponseBodyFileManager(Context)>
	//   11   24:invokespecial   #52  <Method void NetworkPeerManager(ResponseBodyFileManager)>
	//   12   27:putstatic       #36  <Field NetworkPeerManager sInstance>
		context = ((Context) (sInstance));
	//   13   30:getstatic       #36  <Field NetworkPeerManager sInstance>
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

	public ResponseBodyFileManager getResponseBodyFileManager()
	{
		return mResponseBodyFileManager;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ResponseBodyFileManager mResponseBodyFileManager>
	//    2    4:areturn         
	}

	private static NetworkPeerManager sInstance;
	private final ResponseBodyFileManager mResponseBodyFileManager;
	private final PeersRegisteredListener mTempFileCleanup = new PeersRegisteredListener() {

		protected void onFirstPeerRegistered()
		{
			mResponseBodyFileManager.cleanupFiles();
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field NetworkPeerManager this$0>
		//    2    4:invokestatic    #21  <Method ResponseBodyFileManager NetworkPeerManager.access$000(NetworkPeerManager)>
		//    3    7:invokevirtual   #26  <Method void ResponseBodyFileManager.cleanupFiles()>
		//    4   10:return          
		}

		protected void onLastPeerUnregistered()
		{
			mResponseBodyFileManager.cleanupFiles();
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field NetworkPeerManager this$0>
		//    2    4:invokestatic    #21  <Method ResponseBodyFileManager NetworkPeerManager.access$000(NetworkPeerManager)>
		//    3    7:invokevirtual   #26  <Method void ResponseBodyFileManager.cleanupFiles()>
		//    4   10:return          
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
	static ResponseBodyFileManager access$000(NetworkPeerManager networkpeermanager)
	{
		return networkpeermanager.mResponseBodyFileManager;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ResponseBodyFileManager mResponseBodyFileManager>
	//    2    4:areturn         
	}

*/
}
