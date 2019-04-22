// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.helper.PeerRegistrationListener;
import com.facebook.stetho.inspector.jsonrpc.*;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.json.ObjectMapper;
import java.io.UnsupportedEncodingException;
import java.util.*;
import org.json.JSONObject;

public class Database
	implements ChromeDevtoolsDomain
{
	public static class AddDatabaseEvent
	{

		public DatabaseObject database;

		public AddDatabaseEvent()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}

	public static abstract class DatabaseDriver
	{

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
				DatabaseObject databaseobject = new DatabaseObject();
		//   11   30:new             #54  <Class Database$DatabaseObject>
		//   12   33:dup             
		//   13   34:invokespecial   #55  <Method void Database$DatabaseObject()>
		//   14   37:astore_3        
				databaseobject.id = ((String) (obj));
		//   15   38:aload_3         
		//   16   39:aload           4
		//   17   41:putfield        #59  <Field String Database$DatabaseObject.id>
				databaseobject.name = ((String) (obj));
		//   18   44:aload_3         
		//   19   45:aload           4
		//   20   47:putfield        #62  <Field String Database$DatabaseObject.name>
				databaseobject.domain = mContext.getPackageName();
		//   21   50:aload_3         
		//   22   51:aload_0         
		//   23   52:getfield        #19  <Field Context mContext>
		//   24   55:invokevirtual   #68  <Method String Context.getPackageName()>
		//   25   58:putfield        #71  <Field String Database$DatabaseObject.domain>
				databaseobject.version = "N/A";
		//   26   61:aload_3         
		//   27   62:ldc1            #73  <String "N/A">
		//   28   64:putfield        #76  <Field String Database$DatabaseObject.version>
				obj = ((Object) (new AddDatabaseEvent()));
		//   29   67:new             #78  <Class Database$AddDatabaseEvent>
		//   30   70:dup             
		//   31   71:invokespecial   #79  <Method void Database$AddDatabaseEvent()>
		//   32   74:astore          4
				obj.database = databaseobject;
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

		public abstract ExecuteSQLResponse executeSQL(String s, String s1, ExecuteResultHandler executeresulthandler)
			throws SQLiteException;

		public abstract List getDatabaseNames();

		public abstract List getTableNames(String s);

		protected Context mContext;


/*
		static void access$300(DatabaseDriver databasedriver, JsonRpcPeer jsonrpcpeer)
		{
			databasedriver.onRegistered(jsonrpcpeer);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #26  <Method void onRegistered(JsonRpcPeer)>
			return;
		//    3    5:return          
		}

*/


/*
		static void access$400(DatabaseDriver databasedriver, JsonRpcPeer jsonrpcpeer)
		{
			databasedriver.onUnregistered(jsonrpcpeer);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #30  <Method void onUnregistered(JsonRpcPeer)>
			return;
		//    3    5:return          
		}

*/

		public DatabaseDriver(Context context)
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

	public static interface DatabaseDriver.ExecuteResultHandler
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

	public static class DatabaseObject
	{

		public String domain;
		public String id;
		public String name;
		public String version;

		public DatabaseObject()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class DatabasePeerRegistrationListener
		implements PeerRegistrationListener
	{

		public void onPeerRegistered(JsonRpcPeer jsonrpcpeer)
		{
			for(Iterator iterator = mDatabaseDrivers.iterator(); iterator.hasNext(); ((DatabaseDriver)iterator.next()).onRegistered(jsonrpcpeer));
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
			for(Iterator iterator = mDatabaseDrivers.iterator(); iterator.hasNext(); ((DatabaseDriver)iterator.next()).onUnregistered(jsonrpcpeer));
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

		private DatabasePeerRegistrationListener(List list)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mDatabaseDrivers = list;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field List mDatabaseDrivers>
		//    5    9:return          
		}

	}

	public static class Error
	{

		public int code;
		public String message;

		public Error()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class ExecuteSQLRequest
	{

		public String databaseId;
		public String query;

		public ExecuteSQLRequest()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class ExecuteSQLResponse
		implements JsonRpcResult
	{

		public List columnNames;
		public Error sqlError;
		public List values;

		public ExecuteSQLResponse()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class GetDatabaseTableNamesRequest
	{

		public String databaseId;

		private GetDatabaseTableNamesRequest()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class GetDatabaseTableNamesResponse
		implements JsonRpcResult
	{

		public List tableNames;

		private GetDatabaseTableNamesResponse()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}

	}


	public Database()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Object()>
		mDatabaseDrivers = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #65  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #66  <Method void ArrayList()>
	//    6   12:putfield        #68  <Field List mDatabaseDrivers>
	//    7   15:aload_0         
	//    8   16:new             #70  <Class ChromePeerManager>
	//    9   19:dup             
	//   10   20:invokespecial   #71  <Method void ChromePeerManager()>
	//   11   23:putfield        #73  <Field ChromePeerManager mChromePeerManager>
		mPeerListener = new DatabasePeerRegistrationListener(mDatabaseDrivers);
	//   12   26:aload_0         
	//   13   27:new             #22  <Class Database$DatabasePeerRegistrationListener>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:getfield        #68  <Field List mDatabaseDrivers>
	//   17   35:aconst_null     
	//   18   36:invokespecial   #76  <Method void Database$DatabasePeerRegistrationListener(List, Database$1)>
	//   19   39:putfield        #78  <Field Database$DatabasePeerRegistrationListener mPeerListener>
		mChromePeerManager.setListener(((PeerRegistrationListener) (mPeerListener)));
	//   20   42:aload_0         
	//   21   43:getfield        #73  <Field ChromePeerManager mChromePeerManager>
	//   22   46:aload_0         
	//   23   47:getfield        #78  <Field Database$DatabasePeerRegistrationListener mPeerListener>
	//   24   50:invokevirtual   #82  <Method void ChromePeerManager.setListener(PeerRegistrationListener)>
	//   25   53:aload_0         
	//   26   54:new             #84  <Class ObjectMapper>
	//   27   57:dup             
	//   28   58:invokespecial   #85  <Method void ObjectMapper()>
	//   29   61:putfield        #87  <Field ObjectMapper mObjectMapper>
	//   30   64:return          
	}

	private static String blobToString(byte abyte0[])
	{
		if(abyte0.length > 512 || !fastIsAscii(abyte0))
			break MISSING_BLOCK_LABEL_28;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:sipush          512
	//    3    5:icmpgt          28
	//    4    8:aload_0         
	//    5    9:invokestatic    #101 <Method boolean fastIsAscii(byte[])>
	//    6   12:ifeq            28
		abyte0 = ((byte []) (new String(abyte0, "US-ASCII")));
	//    7   15:new             #103 <Class String>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:ldc1            #105 <String "US-ASCII">
	//   11   22:invokespecial   #108 <Method void String(byte[], String)>
	//   12   25:astore_0        
		return ((String) (abyte0));
	//   13   26:aload_0         
	//   14   27:areturn         
_L2:
		return "{blob}";
	//   15   28:ldc1            #50  <String "{blob}">
	//   16   30:areturn         
		abyte0;
	//   17   31:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  18   32:goto            28
	}

	private static boolean fastIsAscii(byte abyte0[])
	{
		int j = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_2        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_1        
	//*   5    5:iload_1         
	//*   6    6:iload_2         
	//*   7    7:icmpge          28
			if((abyte0[i] & 0xffffff80) != 0)
	//*   8   10:aload_0         
	//*   9   11:iload_1         
	//*  10   12:baload          
	//*  11   13:bipush          -128
	//*  12   15:iand            
	//*  13   16:ifeq            21
				return false;
	//   14   19:iconst_0        
	//   15   20:ireturn         

	//   16   21:iload_1         
	//   17   22:iconst_1        
	//   18   23:iadd            
	//   19   24:istore_1        
	//*  20   25:goto            5
		return true;
	//   21   28:iconst_1        
	//   22   29:ireturn         
	}

	private static ArrayList flattenRows(Cursor cursor, int i)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		boolean flag1;
		if(i >= 0)
	//*   2    3:iload_1         
	//*   3    4:iflt            13
			flag1 = true;
	//    4    7:iconst_1        
	//    5    8:istore          7
		else
	//*   6   10:goto            16
			flag1 = false;
	//    7   13:iconst_0        
	//    8   14:istore          7
		Util.throwIfNot(flag1);
	//    9   16:iload           7
	//   10   18:invokestatic    #114 <Method void Util.throwIfNot(boolean)>
		ArrayList arraylist = new ArrayList();
	//   11   21:new             #65  <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #66  <Method void ArrayList()>
	//   14   28:astore          8
		int l = cursor.getColumnCount();
	//   15   30:aload_0         
	//   16   31:invokeinterface #120 <Method int Cursor.getColumnCount()>
	//   17   36:istore          5
		for(int j = 0; j < i && cursor.moveToNext(); j++)
	//*  18   38:iconst_0        
	//*  19   39:istore_2        
	//*  20   40:iload_2         
	//*  21   41:iload_1         
	//*  22   42:icmpge          198
	//*  23   45:aload_0         
	//*  24   46:invokeinterface #124 <Method boolean Cursor.moveToNext()>
	//*  25   51:ifeq            198
		{
			for(int k = 0; k < l; k++)
	//*  26   54:iconst_0        
	//*  27   55:istore_3        
	//*  28   56:iload_3         
	//*  29   57:iload           5
	//*  30   59:icmpge          191
			{
				int i1 = cursor.getType(k);
	//   31   62:aload_0         
	//   32   63:iload_3         
	//   33   64:invokeinterface #128 <Method int Cursor.getType(int)>
	//   34   69:istore          6
				if(i1 != 4)
	//*  35   71:iload           6
	//*  36   73:iconst_4        
	//*  37   74:icmpeq          168
					switch(i1)
	//*  38   77:iload           6
					{
	//*  39   79:tableswitch     0 2: default 104
	//	               0 158
	//	               1 139
	//	               2 120
					default:
						arraylist.add(((Object) (cursor.getString(k))));
	//   40  104:aload           8
	//   41  106:aload_0         
	//   42  107:iload_3         
	//   43  108:invokeinterface #132 <Method String Cursor.getString(int)>
	//   44  113:invokevirtual   #136 <Method boolean ArrayList.add(Object)>
	//   45  116:pop             
						break;

	//*  46  117:goto            184
					case 2: // '\002'
						arraylist.add(((Object) (String.valueOf(cursor.getDouble(k)))));
	//   47  120:aload           8
	//   48  122:aload_0         
	//   49  123:iload_3         
	//   50  124:invokeinterface #140 <Method double Cursor.getDouble(int)>
	//   51  129:invokestatic    #144 <Method String String.valueOf(double)>
	//   52  132:invokevirtual   #136 <Method boolean ArrayList.add(Object)>
	//   53  135:pop             
						break;

	//*  54  136:goto            184
					case 1: // '\001'
						arraylist.add(((Object) (String.valueOf(cursor.getLong(k)))));
	//   55  139:aload           8
	//   56  141:aload_0         
	//   57  142:iload_3         
	//   58  143:invokeinterface #148 <Method long Cursor.getLong(int)>
	//   59  148:invokestatic    #151 <Method String String.valueOf(long)>
	//   60  151:invokevirtual   #136 <Method boolean ArrayList.add(Object)>
	//   61  154:pop             
						break;

	//*  62  155:goto            184
					case 0: // '\0'
						arraylist.add(((Object) (null)));
	//   63  158:aload           8
	//   64  160:aconst_null     
	//   65  161:invokevirtual   #136 <Method boolean ArrayList.add(Object)>
	//   66  164:pop             
						break;
					}
				else
	//*  67  165:goto            184
					arraylist.add(((Object) (blobToString(cursor.getBlob(k)))));
	//   68  168:aload           8
	//   69  170:aload_0         
	//   70  171:iload_3         
	//   71  172:invokeinterface #155 <Method byte[] Cursor.getBlob(int)>
	//   72  177:invokestatic    #157 <Method String blobToString(byte[])>
	//   73  180:invokevirtual   #136 <Method boolean ArrayList.add(Object)>
	//   74  183:pop             
			}

	//   75  184:iload_3         
	//   76  185:iconst_1        
	//   77  186:iadd            
	//   78  187:istore_3        
		}

	//   79  188:goto            56
	//   80  191:iload_2         
	//   81  192:iconst_1        
	//   82  193:iadd            
	//   83  194:istore_2        
	//*  84  195:goto            40
		if(!cursor.isAfterLast())
	//*  85  198:aload_0         
	//*  86  199:invokeinterface #160 <Method boolean Cursor.isAfterLast()>
	//*  87  204:ifne            231
			for(i = ((int) (flag)); i < l; i++)
	//*  88  207:iload           4
	//*  89  209:istore_1        
	//*  90  210:iload_1         
	//*  91  211:iload           5
	//*  92  213:icmpge          231
				arraylist.add("{truncated}");
	//   93  216:aload           8
	//   94  218:ldc1            #162 <String "{truncated}">
	//   95  220:invokevirtual   #136 <Method boolean ArrayList.add(Object)>
	//   96  223:pop             

	//   97  224:iload_1         
	//   98  225:iconst_1        
	//   99  226:iadd            
	//  100  227:istore_1        
	//* 101  228:goto            210
		return arraylist;
	//  102  231:aload           8
	//  103  233:areturn         
	}

	private DatabaseDriver getDatabasePeer(String s)
	{
		for(Iterator iterator = mDatabaseDrivers.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field List mDatabaseDrivers>
	//*   2    4:invokeinterface #172 <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            53
		{
			DatabaseDriver databasedriver = (DatabaseDriver)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #181 <Method Object Iterator.next()>
	//    9   25:checkcast       #13  <Class Database$DatabaseDriver>
	//   10   28:astore_3        
			List list = databasedriver.getDatabaseNames();
	//   11   29:aload_3         
	//   12   30:invokevirtual   #185 <Method List Database$DatabaseDriver.getDatabaseNames()>
	//   13   33:astore          4
			if(list != null && list.contains(((Object) (s))))
	//*  14   35:aload           4
	//*  15   37:ifnull          10
	//*  16   40:aload           4
	//*  17   42:aload_1         
	//*  18   43:invokeinterface #188 <Method boolean List.contains(Object)>
	//*  19   48:ifeq            10
				return databasedriver;
	//   20   51:aload_3         
	//   21   52:areturn         
		}

		return null;
	//   22   53:aconst_null     
	//   23   54:areturn         
	}

	public void add(DatabaseDriver databasedriver)
	{
		mDatabaseDrivers.add(((Object) (databasedriver)));
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field List mDatabaseDrivers>
	//    2    4:aload_1         
	//    3    5:invokeinterface #190 <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void disable(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		mChromePeerManager.removePeer(jsonrpcpeer);
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field ChromePeerManager mChromePeerManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #197 <Method void ChromePeerManager.removePeer(JsonRpcPeer)>
	//    4    8:return          
	}

	public void enable(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		mChromePeerManager.addPeer(jsonrpcpeer);
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field ChromePeerManager mChromePeerManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #203 <Method boolean ChromePeerManager.addPeer(JsonRpcPeer)>
	//    4    8:pop             
	//    5    9:return          
	}

	public JsonRpcResult executeSQL(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		jsonrpcpeer = ((JsonRpcPeer) ((ExecuteSQLRequest)mObjectMapper.convertValue(((Object) (jsonobject)), com/facebook/stetho/inspector/protocol/module/Database$ExecuteSQLRequest)));
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc1            #28  <Class Database$ExecuteSQLRequest>
	//    4    7:invokevirtual   #211 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    5   10:checkcast       #28  <Class Database$ExecuteSQLRequest>
	//    6   13:astore_1        
		jsonobject = ((JSONObject) (((ExecuteSQLRequest) (jsonrpcpeer)).databaseId));
	//    7   14:aload_1         
	//    8   15:getfield        #214 <Field String Database$ExecuteSQLRequest.databaseId>
	//    9   18:astore_2        
		String s = ((ExecuteSQLRequest) (jsonrpcpeer)).query;
	//   10   19:aload_1         
	//   11   20:getfield        #217 <Field String Database$ExecuteSQLRequest.query>
	//   12   23:astore_3        
		jsonobject = ((JSONObject) (getDatabasePeer(((String) (jsonobject)))));
	//   13   24:aload_0         
	//   14   25:aload_2         
	//   15   26:invokespecial   #219 <Method Database$DatabaseDriver getDatabasePeer(String)>
	//   16   29:astore_2        
		try
		{
			jsonrpcpeer = ((JsonRpcPeer) (((DatabaseDriver) (jsonobject)).executeSQL(((ExecuteSQLRequest) (jsonrpcpeer)).databaseId, ((ExecuteSQLRequest) (jsonrpcpeer)).query, new DatabaseDriver.ExecuteResultHandler() {

				public ExecuteSQLResponse handleInsert(long l)
					throws SQLiteException
				{
					ExecuteSQLResponse executesqlresponse = new ExecuteSQLResponse();
				//    0    0:new             #28  <Class Database$ExecuteSQLResponse>
				//    1    3:dup             
				//    2    4:invokespecial   #29  <Method void Database$ExecuteSQLResponse()>
				//    3    7:astore_3        
					executesqlresponse.columnNames = Collections.singletonList("ID of last inserted row");
				//    4    8:aload_3         
				//    5    9:ldc1            #31  <String "ID of last inserted row">
				//    6   11:invokestatic    #37  <Method List Collections.singletonList(Object)>
				//    7   14:putfield        #41  <Field List Database$ExecuteSQLResponse.columnNames>
					executesqlresponse.values = Collections.singletonList(((Object) (String.valueOf(l))));
				//    8   17:aload_3         
				//    9   18:lload_1         
				//   10   19:invokestatic    #47  <Method String String.valueOf(long)>
				//   11   22:invokestatic    #37  <Method List Collections.singletonList(Object)>
				//   12   25:putfield        #50  <Field List Database$ExecuteSQLResponse.values>
					return executesqlresponse;
				//   13   28:aload_3         
				//   14   29:areturn         
				}

				public volatile Object handleInsert(long l)
					throws SQLiteException
				{
					return ((Object) (handleInsert(l)));
				//    0    0:aload_0         
				//    1    1:lload_1         
				//    2    2:invokevirtual   #54  <Method Database$ExecuteSQLResponse handleInsert(long)>
				//    3    5:areturn         
				}

				public ExecuteSQLResponse handleRawQuery()
					throws SQLiteException
				{
					ExecuteSQLResponse executesqlresponse = new ExecuteSQLResponse();
				//    0    0:new             #28  <Class Database$ExecuteSQLResponse>
				//    1    3:dup             
				//    2    4:invokespecial   #29  <Method void Database$ExecuteSQLResponse()>
				//    3    7:astore_1        
					executesqlresponse.columnNames = Collections.singletonList("success");
				//    4    8:aload_1         
				//    5    9:ldc1            #58  <String "success">
				//    6   11:invokestatic    #37  <Method List Collections.singletonList(Object)>
				//    7   14:putfield        #41  <Field List Database$ExecuteSQLResponse.columnNames>
					executesqlresponse.values = Collections.singletonList("true");
				//    8   17:aload_1         
				//    9   18:ldc1            #60  <String "true">
				//   10   20:invokestatic    #37  <Method List Collections.singletonList(Object)>
				//   11   23:putfield        #50  <Field List Database$ExecuteSQLResponse.values>
					return executesqlresponse;
				//   12   26:aload_1         
				//   13   27:areturn         
				}

				public volatile Object handleRawQuery()
					throws SQLiteException
				{
					return ((Object) (handleRawQuery()));
				//    0    0:aload_0         
				//    1    1:invokevirtual   #63  <Method Database$ExecuteSQLResponse handleRawQuery()>
				//    2    4:areturn         
				}

				public ExecuteSQLResponse handleSelect(Cursor cursor)
					throws SQLiteException
				{
					ExecuteSQLResponse executesqlresponse = new ExecuteSQLResponse();
				//    0    0:new             #28  <Class Database$ExecuteSQLResponse>
				//    1    3:dup             
				//    2    4:invokespecial   #29  <Method void Database$ExecuteSQLResponse()>
				//    3    7:astore_2        
					executesqlresponse.columnNames = Arrays.asList(((Object []) (cursor.getColumnNames())));
				//    4    8:aload_2         
				//    5    9:aload_1         
				//    6   10:invokeinterface #71  <Method String[] Cursor.getColumnNames()>
				//    7   15:invokestatic    #77  <Method List Arrays.asList(Object[])>
				//    8   18:putfield        #41  <Field List Database$ExecuteSQLResponse.columnNames>
					executesqlresponse.values = ((List) (Database.flattenRows(cursor, 250)));
				//    9   21:aload_2         
				//   10   22:aload_1         
				//   11   23:sipush          250
				//   12   26:invokestatic    #81  <Method ArrayList Database.access$200(Cursor, int)>
				//   13   29:putfield        #50  <Field List Database$ExecuteSQLResponse.values>
					return executesqlresponse;
				//   14   32:aload_2         
				//   15   33:areturn         
				}

				public volatile Object handleSelect(Cursor cursor)
					throws SQLiteException
				{
					return ((Object) (handleSelect(cursor)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:invokevirtual   #84  <Method Database$ExecuteSQLResponse handleSelect(Cursor)>
				//    3    5:areturn         
				}

				public ExecuteSQLResponse handleUpdateDelete(int i)
					throws SQLiteException
				{
					ExecuteSQLResponse executesqlresponse = new ExecuteSQLResponse();
				//    0    0:new             #28  <Class Database$ExecuteSQLResponse>
				//    1    3:dup             
				//    2    4:invokespecial   #29  <Method void Database$ExecuteSQLResponse()>
				//    3    7:astore_2        
					executesqlresponse.columnNames = Collections.singletonList("Modified rows");
				//    4    8:aload_2         
				//    5    9:ldc1            #88  <String "Modified rows">
				//    6   11:invokestatic    #37  <Method List Collections.singletonList(Object)>
				//    7   14:putfield        #41  <Field List Database$ExecuteSQLResponse.columnNames>
					executesqlresponse.values = Collections.singletonList(((Object) (String.valueOf(i))));
				//    8   17:aload_2         
				//    9   18:iload_1         
				//   10   19:invokestatic    #91  <Method String String.valueOf(int)>
				//   11   22:invokestatic    #37  <Method List Collections.singletonList(Object)>
				//   12   25:putfield        #50  <Field List Database$ExecuteSQLResponse.values>
					return executesqlresponse;
				//   13   28:aload_2         
				//   14   29:areturn         
				}

				public volatile Object handleUpdateDelete(int i)
					throws SQLiteException
				{
					return ((Object) (handleUpdateDelete(i)));
				//    0    0:aload_0         
				//    1    1:iload_1         
				//    2    2:invokevirtual   #94  <Method Database$ExecuteSQLResponse handleUpdateDelete(int)>
				//    3    5:areturn         
				}

				final Database this$0;

			
			{
				this$0 = Database.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Database this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
			}
)));
	//   17   30:aload_2         
	//   18   31:aload_1         
	//   19   32:getfield        #214 <Field String Database$ExecuteSQLRequest.databaseId>
	//   20   35:aload_1         
	//   21   36:getfield        #217 <Field String Database$ExecuteSQLRequest.query>
	//   22   39:new             #8   <Class Database$1>
	//   23   42:dup             
	//   24   43:aload_0         
	//   25   44:invokespecial   #222 <Method void Database$1(Database)>
	//   26   47:invokevirtual   #225 <Method Database$ExecuteSQLResponse Database$DatabaseDriver.executeSQL(String, String, Database$DatabaseDriver$ExecuteResultHandler)>
	//   27   50:astore_1        
		}
	//*  28   51:aload_1         
	//*  29   52:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  30   53:astore_2        
		{
			jsonrpcpeer = ((JsonRpcPeer) (new Error()));
	//   31   54:new             #25  <Class Database$Error>
	//   32   57:dup             
	//   33   58:invokespecial   #226 <Method void Database$Error()>
	//   34   61:astore_1        
			jsonrpcpeer.code = 0;
	//   35   62:aload_1         
	//   36   63:iconst_0        
	//   37   64:putfield        #229 <Field int Database$Error.code>
			jsonrpcpeer.message = ((SQLiteException) (jsonobject)).getMessage();
	//   38   67:aload_1         
	//   39   68:aload_2         
	//   40   69:invokevirtual   #233 <Method String SQLiteException.getMessage()>
	//   41   72:putfield        #236 <Field String Database$Error.message>
			jsonobject = ((JSONObject) (new ExecuteSQLResponse()));
	//   42   75:new             #31  <Class Database$ExecuteSQLResponse>
	//   43   78:dup             
	//   44   79:invokespecial   #237 <Method void Database$ExecuteSQLResponse()>
	//   45   82:astore_2        
			jsonobject.sqlError = ((Error) (jsonrpcpeer));
	//   46   83:aload_2         
	//   47   84:aload_1         
	//   48   85:putfield        #241 <Field Database$Error Database$ExecuteSQLResponse.sqlError>
			return ((JsonRpcResult) (jsonobject));
	//   49   88:aload_2         
	//   50   89:areturn         
		}
		return ((JsonRpcResult) (jsonrpcpeer));
	}

	public JsonRpcResult getDatabaseTableNames(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
		throws JsonRpcException
	{
		jsonrpcpeer = ((JsonRpcPeer) ((GetDatabaseTableNamesRequest)mObjectMapper.convertValue(((Object) (jsonobject)), com/facebook/stetho/inspector/protocol/module/Database$GetDatabaseTableNamesRequest)));
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc1            #34  <Class Database$GetDatabaseTableNamesRequest>
	//    4    7:invokevirtual   #211 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    5   10:checkcast       #34  <Class Database$GetDatabaseTableNamesRequest>
	//    6   13:astore_1        
		jsonobject = ((JSONObject) (getDatabasePeer(((GetDatabaseTableNamesRequest) (jsonrpcpeer)).databaseId)));
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:getfield        #245 <Field String Database$GetDatabaseTableNamesRequest.databaseId>
	//   10   19:invokespecial   #219 <Method Database$DatabaseDriver getDatabasePeer(String)>
	//   11   22:astore_2        
		GetDatabaseTableNamesResponse getdatabasetablenamesresponse;
		try
		{
			getdatabasetablenamesresponse = new GetDatabaseTableNamesResponse();
	//   12   23:new             #37  <Class Database$GetDatabaseTableNamesResponse>
	//   13   26:dup             
	//   14   27:aconst_null     
	//   15   28:invokespecial   #248 <Method void Database$GetDatabaseTableNamesResponse(Database$1)>
	//   16   31:astore_3        
			getdatabasetablenamesresponse.tableNames = ((DatabaseDriver) (jsonobject)).getTableNames(((GetDatabaseTableNamesRequest) (jsonrpcpeer)).databaseId);
	//   17   32:aload_3         
	//   18   33:aload_2         
	//   19   34:aload_1         
	//   20   35:getfield        #245 <Field String Database$GetDatabaseTableNamesRequest.databaseId>
	//   21   38:invokevirtual   #252 <Method List Database$DatabaseDriver.getTableNames(String)>
	//   22   41:putfield        #255 <Field List Database$GetDatabaseTableNamesResponse.tableNames>
		}
	//*  23   44:aload_3         
	//*  24   45:areturn         
		// Misplaced declaration of an exception variable
		catch(JsonRpcPeer jsonrpcpeer)
	//*  25   46:astore_1        
		{
			throw new JsonRpcException(new JsonRpcError(com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError.ErrorCode.INVALID_REQUEST, ((SQLiteException) (jsonrpcpeer)).toString(), ((JSONObject) (null))));
	//   26   47:new             #244 <Class JsonRpcException>
	//   27   50:dup             
	//   28   51:new             #257 <Class JsonRpcError>
	//   29   54:dup             
	//   30   55:getstatic       #263 <Field com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode.INVALID_REQUEST>
	//   31   58:aload_1         
	//   32   59:invokevirtual   #266 <Method String SQLiteException.toString()>
	//   33   62:aconst_null     
	//   34   63:invokespecial   #269 <Method void JsonRpcError(com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode, String, JSONObject)>
	//   35   66:invokespecial   #272 <Method void JsonRpcException(JsonRpcError)>
	//   36   69:athrow          
		}
		return ((JsonRpcResult) (getdatabasetablenamesresponse));
	}

	private static final int MAX_BLOB_LENGTH = 512;
	private static final int MAX_EXECUTE_RESULTS = 250;
	private static final String UNKNOWN_BLOB_LABEL = "{blob}";
	private final ChromePeerManager mChromePeerManager = new ChromePeerManager();
	private List mDatabaseDrivers;
	private final ObjectMapper mObjectMapper = new ObjectMapper();
	private final DatabasePeerRegistrationListener mPeerListener;


/*
	static ArrayList access$200(Cursor cursor, int i)
	{
		return flattenRows(cursor, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #93  <Method ArrayList flattenRows(Cursor, int)>
	//    3    5:areturn         
	}

*/
}
