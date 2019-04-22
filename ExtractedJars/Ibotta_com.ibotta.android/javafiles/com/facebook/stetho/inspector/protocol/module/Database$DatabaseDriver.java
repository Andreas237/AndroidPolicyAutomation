// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			Database

public static abstract class Database$DatabaseDriver
{
	public static interface ExecuteResultHandler
	{

		public abstract Object handleInsert(long l)
			throws SQLiteException;

		public abstract Object handleRawQuery()
			throws SQLiteException;

		public abstract Object handleSelect(Cursor cursor)
			throws SQLiteException;

		public abstract Object handleUpdateDelete(int i)
			throws SQLiteException;
	}


	private final void onRegistered(JsonRpcPeer jsonrpcpeer)
	{
		Object obj;
		for(Iterator iterator = getDatabaseNames().iterator(); iterator.hasNext(); jsonrpcpeer.invokeMethod("Database.addDatabase", obj, ((com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback) (null))))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #34  <Method List getDatabaseNames()>
	//*   2    4:invokeinterface #40  <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            94
		{
			obj = ((Object) ((String)iterator.next()));
	//    7   19:aload_2         
	//    8   20:invokeinterface #50  <Method Object Iterator.next()>
	//    9   25:checkcast       #52  <Class String>
	//   10   28:astore          4
			Database$DatabaseObject database$databaseobject = new Database$DatabaseObject();
	//   11   30:new             #54  <Class Database$DatabaseObject>
	//   12   33:dup             
	//   13   34:invokespecial   #55  <Method void Database$DatabaseObject()>
	//   14   37:astore_3        
			database$databaseobject.id = ((String) (obj));
	//   15   38:aload_3         
	//   16   39:aload           4
	//   17   41:putfield        #59  <Field String Database$DatabaseObject.id>
			database$databaseobject.name = ((String) (obj));
	//   18   44:aload_3         
	//   19   45:aload           4
	//   20   47:putfield        #62  <Field String Database$DatabaseObject.name>
			database$databaseobject.domain = mContext.getPackageName();
	//   21   50:aload_3         
	//   22   51:aload_0         
	//   23   52:getfield        #19  <Field Context mContext>
	//   24   55:invokevirtual   #68  <Method String Context.getPackageName()>
	//   25   58:putfield        #71  <Field String Database$DatabaseObject.domain>
			database$databaseobject.version = "N/A";
	//   26   61:aload_3         
	//   27   62:ldc1            #73  <String "N/A">
	//   28   64:putfield        #76  <Field String Database$DatabaseObject.version>
			obj = ((Object) (new t()));
	//   29   67:new             #78  <Class Database$AddDatabaseEvent>
	//   30   70:dup             
	//   31   71:invokespecial   #79  <Method void Database$AddDatabaseEvent()>
	//   32   74:astore          4
			obj.database = database$databaseobject;
	//   33   76:aload           4
	//   34   78:aload_3         
	//   35   79:putfield        #83  <Field Database$DatabaseObject Database$AddDatabaseEvent.database>
		}

	//   36   82:aload_1         
	//   37   83:ldc1            #85  <String "Database.addDatabase">
	//   38   85:aload           4
	//   39   87:aconst_null     
	//   40   88:invokevirtual   #91  <Method void JsonRpcPeer.invokeMethod(String, Object, com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback)>
	//*  41   91:goto            10
	//   42   94:return          
	}

	private final void onUnregistered(JsonRpcPeer jsonrpcpeer)
	{
	//    0    0:return          
	}

	public abstract nse executeSQL(String s, String s1, ExecuteResultHandler executeresulthandler)
		throws SQLiteException;

	public abstract List getDatabaseNames();

	public abstract List getTableNames(String s);

	protected Context mContext;


/*
	static void access$300(Database$DatabaseDriver database$databasedriver, JsonRpcPeer jsonrpcpeer)
	{
		database$databasedriver.onRegistered(jsonrpcpeer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void onRegistered(JsonRpcPeer)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$400(Database$DatabaseDriver database$databasedriver, JsonRpcPeer jsonrpcpeer)
	{
		database$databasedriver.onUnregistered(jsonrpcpeer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void onUnregistered(JsonRpcPeer)>
		return;
	//    3    5:return          
	}

*/

	public Database$DatabaseDriver(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Context mContext>
	//    5    9:return          
	}
}
