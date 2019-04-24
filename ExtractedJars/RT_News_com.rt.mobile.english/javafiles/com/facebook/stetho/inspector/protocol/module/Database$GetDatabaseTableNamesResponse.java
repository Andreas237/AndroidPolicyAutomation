// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import java.util.List;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			Database

private static class Database$GetDatabaseTableNamesResponse
	implements JsonRpcResult
{

	public List tableNames;

	private Database$GetDatabaseTableNamesResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	Database$GetDatabaseTableNamesResponse(Database._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Database$GetDatabaseTableNamesResponse()>
	//    2    4:return          
	}
}
