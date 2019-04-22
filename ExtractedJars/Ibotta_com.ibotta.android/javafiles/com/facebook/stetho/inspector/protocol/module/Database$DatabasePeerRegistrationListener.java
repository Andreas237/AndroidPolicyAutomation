// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.helper.PeerRegistrationListener;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			Database

private static class Database$DatabasePeerRegistrationListener
	implements PeerRegistrationListener
{

	public void onPeerRegistered(JsonRpcPeer jsonrpcpeer)
	{
		for(Iterator iterator = mDatabaseDrivers.iterator(); iterator.hasNext(); Database.DatabaseDriver.access$300((Database.DatabaseDriver)iterator.next(), jsonrpcpeer));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List mDatabaseDrivers>
	//    2    4:invokeinterface #33  <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #39  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            35
	//    7   19:aload_2         
	//    8   20:invokeinterface #43  <Method Object Iterator.next()>
	//    9   25:checkcast       #45  <Class Database$DatabaseDriver>
	//   10   28:aload_1         
	//   11   29:invokestatic    #49  <Method void Database$DatabaseDriver.access$300(Database$DatabaseDriver, JsonRpcPeer)>
	//*  12   32:goto            10
	//   13   35:return          
	}

	public void onPeerUnregistered(JsonRpcPeer jsonrpcpeer)
	{
		for(Iterator iterator = mDatabaseDrivers.iterator(); iterator.hasNext(); Database.DatabaseDriver.access$400((Database.DatabaseDriver)iterator.next(), jsonrpcpeer));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List mDatabaseDrivers>
	//    2    4:invokeinterface #33  <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #39  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            35
	//    7   19:aload_2         
	//    8   20:invokeinterface #43  <Method Object Iterator.next()>
	//    9   25:checkcast       #45  <Class Database$DatabaseDriver>
	//   10   28:aload_1         
	//   11   29:invokestatic    #53  <Method void Database$DatabaseDriver.access$400(Database$DatabaseDriver, JsonRpcPeer)>
	//*  12   32:goto            10
	//   13   35:return          
	}

	private final List mDatabaseDrivers;

	private Database$DatabasePeerRegistrationListener(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mDatabaseDrivers = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field List mDatabaseDrivers>
	//    5    9:return          
	}

	Database$DatabasePeerRegistrationListener(List list, Database._cls1 _pcls1)
	{
		this(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void Database$DatabasePeerRegistrationListener(List)>
	//    3    5:return          
	}
}
