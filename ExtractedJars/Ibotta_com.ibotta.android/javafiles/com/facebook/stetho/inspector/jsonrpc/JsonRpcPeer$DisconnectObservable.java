// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.jsonrpc;

import android.database.Observable;
import java.util.ArrayList;

// Referenced classes of package com.facebook.stetho.inspector.jsonrpc:
//			JsonRpcPeer, DisconnectReceiver

private static class JsonRpcPeer$DisconnectObservable extends Observable
{

	public void onDisconnect()
	{
		int j = mObservers.size();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ArrayList mObservers>
	//    2    4:invokevirtual   #26  <Method int ArrayList.size()>
	//    3    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          38
			((DisconnectReceiver)mObservers.get(i)).onDisconnect();
	//    9   15:aload_0         
	//   10   16:getfield        #20  <Field ArrayList mObservers>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #30  <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #32  <Class DisconnectReceiver>
	//   14   26:invokeinterface #34  <Method void DisconnectReceiver.onDisconnect()>

	//   15   31:iload_1         
	//   16   32:iconst_1        
	//   17   33:iadd            
	//   18   34:istore_1        
	//*  19   35:goto            10
	//   20   38:return          
	}

	private JsonRpcPeer$DisconnectObservable()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Observable()>
	//    2    4:return          
	}

	JsonRpcPeer$DisconnectObservable(JsonRpcPeer._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void JsonRpcPeer$DisconnectObservable()>
	//    2    4:return          
	}
}
