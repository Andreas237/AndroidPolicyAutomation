// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import com.facebook.stetho.inspector.helper.PeersRegisteredListener;

// Referenced classes of package com.facebook.stetho.inspector.network:
//			NetworkPeerManager, ResponseBodyFileManager

class NetworkPeerManager$1 extends PeersRegisteredListener
{

	protected void onFirstPeerRegistered()
	{
		NetworkPeerManager.access$000(NetworkPeerManager.this).cleanupFiles();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field NetworkPeerManager this$0>
	//    2    4:invokestatic    #21  <Method ResponseBodyFileManager NetworkPeerManager.access$000(NetworkPeerManager)>
	//    3    7:invokevirtual   #26  <Method void ResponseBodyFileManager.cleanupFiles()>
	//    4   10:return          
	}

	protected void onLastPeerUnregistered()
	{
		NetworkPeerManager.access$000(NetworkPeerManager.this).cleanupFiles();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field NetworkPeerManager this$0>
	//    2    4:invokestatic    #21  <Method ResponseBodyFileManager NetworkPeerManager.access$000(NetworkPeerManager)>
	//    3    7:invokevirtual   #26  <Method void ResponseBodyFileManager.cleanupFiles()>
	//    4   10:return          
	}

	final NetworkPeerManager this$0;

	NetworkPeerManager$1()
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
