// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.jsonrpc;

import android.database.Observable;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.facebook.stetho.inspector.jsonrpc:
//			JsonRpcPeer, DisconnectReceiver

private static class JsonRpcPeer$DisconnectObservable extends Observable
{

	public void onDisconnect()
	{
		for(Iterator iterator = mObservers.iterator(); iterator.hasNext(); ((DisconnectReceiver)iterator.next()).onDisconnect());
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ArrayList mObservers>
	//    2    4:invokevirtual   #26  <Method Iterator ArrayList.iterator()>
	//    3    7:astore_1        
	//    4    8:aload_1         
	//    5    9:invokeinterface #32  <Method boolean Iterator.hasNext()>
	//    6   14:ifeq            34
	//    7   17:aload_1         
	//    8   18:invokeinterface #36  <Method Object Iterator.next()>
	//    9   23:checkcast       #38  <Class DisconnectReceiver>
	//   10   26:invokeinterface #40  <Method void DisconnectReceiver.onDisconnect()>
	//*  11   31:goto            8
	//   12   34:return          
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
