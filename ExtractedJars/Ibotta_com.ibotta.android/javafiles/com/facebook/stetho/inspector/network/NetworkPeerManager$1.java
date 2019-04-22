// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import com.facebook.stetho.inspector.helper.PeersRegisteredListener;

// Referenced classes of package com.facebook.stetho.inspector.network:
//			NetworkPeerManager, AsyncPrettyPrinterExecutorHolder, AsyncPrettyPrinterRegistry, AsyncPrettyPrinterInitializer, 
//			ResponseBodyFileManager

class NetworkPeerManager$1 extends PeersRegisteredListener
{

	protected void onFirstPeerRegistered()
	{
		AsyncPrettyPrinterExecutorHolder.ensureInitialized();
	//    0    0:invokestatic    #22  <Method void AsyncPrettyPrinterExecutorHolder.ensureInitialized()>
		if(NetworkPeerManager.access$000(NetworkPeerManager.this) == null && NetworkPeerManager.access$100(NetworkPeerManager.this) != null)
	//*   1    3:aload_0         
	//*   2    4:getfield        #12  <Field NetworkPeerManager this$0>
	//*   3    7:invokestatic    #26  <Method AsyncPrettyPrinterRegistry NetworkPeerManager.access$000(NetworkPeerManager)>
	//*   4   10:ifnonnull       57
	//*   5   13:aload_0         
	//*   6   14:getfield        #12  <Field NetworkPeerManager this$0>
	//*   7   17:invokestatic    #30  <Method AsyncPrettyPrinterInitializer NetworkPeerManager.access$100(NetworkPeerManager)>
	//*   8   20:ifnull          57
		{
			NetworkPeerManager.access$002(NetworkPeerManager.this, new AsyncPrettyPrinterRegistry());
	//    9   23:aload_0         
	//   10   24:getfield        #12  <Field NetworkPeerManager this$0>
	//   11   27:new             #32  <Class AsyncPrettyPrinterRegistry>
	//   12   30:dup             
	//   13   31:invokespecial   #33  <Method void AsyncPrettyPrinterRegistry()>
	//   14   34:invokestatic    #37  <Method AsyncPrettyPrinterRegistry NetworkPeerManager.access$002(NetworkPeerManager, AsyncPrettyPrinterRegistry)>
	//   15   37:pop             
			NetworkPeerManager.access$100(NetworkPeerManager.this).populatePrettyPrinters(NetworkPeerManager.access$000(NetworkPeerManager.this));
	//   16   38:aload_0         
	//   17   39:getfield        #12  <Field NetworkPeerManager this$0>
	//   18   42:invokestatic    #30  <Method AsyncPrettyPrinterInitializer NetworkPeerManager.access$100(NetworkPeerManager)>
	//   19   45:aload_0         
	//   20   46:getfield        #12  <Field NetworkPeerManager this$0>
	//   21   49:invokestatic    #26  <Method AsyncPrettyPrinterRegistry NetworkPeerManager.access$000(NetworkPeerManager)>
	//   22   52:invokeinterface #43  <Method void AsyncPrettyPrinterInitializer.populatePrettyPrinters(AsyncPrettyPrinterRegistry)>
		}
		NetworkPeerManager.access$200(NetworkPeerManager.this).cleanupFiles();
	//   23   57:aload_0         
	//   24   58:getfield        #12  <Field NetworkPeerManager this$0>
	//   25   61:invokestatic    #47  <Method ResponseBodyFileManager NetworkPeerManager.access$200(NetworkPeerManager)>
	//   26   64:invokevirtual   #52  <Method void ResponseBodyFileManager.cleanupFiles()>
	//   27   67:return          
	}

	protected void onLastPeerUnregistered()
	{
		NetworkPeerManager.access$200(NetworkPeerManager.this).cleanupFiles();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field NetworkPeerManager this$0>
	//    2    4:invokestatic    #47  <Method ResponseBodyFileManager NetworkPeerManager.access$200(NetworkPeerManager)>
	//    3    7:invokevirtual   #52  <Method void ResponseBodyFileManager.cleanupFiles()>
		AsyncPrettyPrinterExecutorHolder.shutdown();
	//    4   10:invokestatic    #56  <Method void AsyncPrettyPrinterExecutorHolder.shutdown()>
	//    5   13:return          
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
