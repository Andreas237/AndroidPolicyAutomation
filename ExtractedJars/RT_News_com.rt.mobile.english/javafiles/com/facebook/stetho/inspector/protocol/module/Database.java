// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.database.DatabasePeerManager;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.json.ObjectMapper;
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

	private static class ExecuteSQLRequest
	{

		public String databaseId;
		public String query;

		private ExecuteSQLRequest()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class ExecuteSQLResponse
		implements JsonRpcResult
	{

		public List columnNames;
		public Error sqlError;
		public List values;

		private ExecuteSQLResponse()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
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


	public Database(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		mDatabasePeerManager = new DatabasePeerManager(context);
	//    2    4:aload_0         
	//    3    5:new             #46  <Class DatabasePeerManager>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #48  <Method void DatabasePeerManager(Context)>
	//    7   13:putfield        #50  <Field DatabasePeerManager mDatabasePeerManager>
	//    8   16:aload_0         
	//    9   17:new             #52  <Class ObjectMapper>
	//   10   20:dup             
	//   11   21:invokespecial   #53  <Method void ObjectMapper()>
	//   12   24:putfield        #55  <Field ObjectMapper mObjectMapper>
	//   13   27:return          
	}

	private List flattenRows(Cursor cursor, int i)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		boolean flag1;
		if(i >= 0)
	//*   2    3:iload_2         
	//*   3    4:iflt            13
			flag1 = true;
	//    4    7:iconst_1        
	//    5    8:istore          8
		else
	//*   6   10:goto            16
			flag1 = false;
	//    7   13:iconst_0        
	//    8   14:istore          8
		Util.throwIfNot(flag1);
	//    9   16:iload           8
	//   10   18:invokestatic    #68  <Method void Util.throwIfNot(boolean)>
		ArrayList arraylist = new ArrayList();
	//   11   21:new             #70  <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #71  <Method void ArrayList()>
	//   14   28:astore          9
		int l = cursor.getColumnCount();
	//   15   30:aload_1         
	//   16   31:invokeinterface #77  <Method int Cursor.getColumnCount()>
	//   17   36:istore          6
		for(int j = 0; j < i && cursor.moveToNext(); j++)
	//*  18   38:iconst_0        
	//*  19   39:istore_3        
	//*  20   40:iload_3         
	//*  21   41:iload_2         
	//*  22   42:icmpge          215
	//*  23   45:aload_1         
	//*  24   46:invokeinterface #81  <Method boolean Cursor.moveToNext()>
	//*  25   51:ifeq            215
		{
			for(int k = 0; k < l; k++)
	//*  26   54:iconst_0        
	//*  27   55:istore          4
	//*  28   57:iload           4
	//*  29   59:iload           6
	//*  30   61:icmpge          208
			{
				int i1 = cursor.getType(k);
	//   31   64:aload_1         
	//   32   65:iload           4
	//   33   67:invokeinterface #85  <Method int Cursor.getType(int)>
	//   34   72:istore          7
				if(i1 != 4)
	//*  35   74:iload           7
	//*  36   76:iconst_4        
	//*  37   77:icmpeq          183
					switch(i1)
	//*  38   80:iload           7
					{
	//*  39   82:tableswitch     0 2: default 108
	//	               0 171
	//	               1 149
	//	               2 127
					default:
						((List) (arraylist)).add(((Object) (cursor.getString(k))));
	//   40  108:aload           9
	//   41  110:aload_1         
	//   42  111:iload           4
	//   43  113:invokeinterface #89  <Method String Cursor.getString(int)>
	//   44  118:invokeinterface #95  <Method boolean List.add(Object)>
	//   45  123:pop             
						break;

	//*  46  124:goto            199
					case 2: // '\002'
						((List) (arraylist)).add(((Object) (Double.valueOf(cursor.getDouble(k)))));
	//   47  127:aload           9
	//   48  129:aload_1         
	//   49  130:iload           4
	//   50  132:invokeinterface #99  <Method double Cursor.getDouble(int)>
	//   51  137:invokestatic    #105 <Method Double Double.valueOf(double)>
	//   52  140:invokeinterface #95  <Method boolean List.add(Object)>
	//   53  145:pop             
						break;

	//*  54  146:goto            199
					case 1: // '\001'
						((List) (arraylist)).add(((Object) (Long.valueOf(cursor.getLong(k)))));
	//   55  149:aload           9
	//   56  151:aload_1         
	//   57  152:iload           4
	//   58  154:invokeinterface #109 <Method long Cursor.getLong(int)>
	//   59  159:invokestatic    #114 <Method Long Long.valueOf(long)>
	//   60  162:invokeinterface #95  <Method boolean List.add(Object)>
	//   61  167:pop             
						break;

	//*  62  168:goto            199
					case 0: // '\0'
						((List) (arraylist)).add(((Object) (null)));
	//   63  171:aload           9
	//   64  173:aconst_null     
	//   65  174:invokeinterface #95  <Method boolean List.add(Object)>
	//   66  179:pop             
						break;
					}
				else
	//*  67  180:goto            199
					((List) (arraylist)).add(((Object) (cursor.getBlob(k))));
	//   68  183:aload           9
	//   69  185:aload_1         
	//   70  186:iload           4
	//   71  188:invokeinterface #118 <Method byte[] Cursor.getBlob(int)>
	//   72  193:invokeinterface #95  <Method boolean List.add(Object)>
	//   73  198:pop             
			}

	//   74  199:iload           4
	//   75  201:iconst_1        
	//   76  202:iadd            
	//   77  203:istore          4
		}

	//   78  205:goto            57
	//   79  208:iload_3         
	//   80  209:iconst_1        
	//   81  210:iadd            
	//   82  211:istore_3        
	//*  83  212:goto            40
		if(!cursor.isAfterLast())
	//*  84  215:aload_1         
	//*  85  216:invokeinterface #121 <Method boolean Cursor.isAfterLast()>
	//*  86  221:ifne            250
			for(i = ((int) (flag)); i < l; i++)
	//*  87  224:iload           5
	//*  88  226:istore_2        
	//*  89  227:iload_2         
	//*  90  228:iload           6
	//*  91  230:icmpge          250
				((List) (arraylist)).add("{truncated}");
	//   92  233:aload           9
	//   93  235:ldc1            #123 <String "{truncated}">
	//   94  237:invokeinterface #95  <Method boolean List.add(Object)>
	//   95  242:pop             

	//   96  243:iload_2         
	//   97  244:iconst_1        
	//   98  245:iadd            
	//   99  246:istore_2        
	//* 100  247:goto            227
		return ((List) (arraylist));
	//  101  250:aload           9
	//  102  252:areturn         
	}

	public void disable(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		mDatabasePeerManager.removePeer(jsonrpcpeer);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field DatabasePeerManager mDatabasePeerManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #132 <Method void DatabasePeerManager.removePeer(JsonRpcPeer)>
	//    4    8:return          
	}

	public void enable(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		mDatabasePeerManager.addPeer(jsonrpcpeer);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field DatabasePeerManager mDatabasePeerManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #138 <Method boolean DatabasePeerManager.addPeer(JsonRpcPeer)>
	//    4    8:pop             
	//    5    9:return          
	}

	public JsonRpcResult executeSQL(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		jsonrpcpeer = ((JsonRpcPeer) ((ExecuteSQLRequest)mObjectMapper.convertValue(((Object) (jsonobject)), com/facebook/stetho/inspector/protocol/module/Database$ExecuteSQLRequest)));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc1            #19  <Class Database$ExecuteSQLRequest>
	//    4    7:invokevirtual   #146 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    5   10:checkcast       #19  <Class Database$ExecuteSQLRequest>
	//    6   13:astore_1        
		try
		{
			jsonrpcpeer = ((JsonRpcPeer) ((JsonRpcResult)mDatabasePeerManager.executeSQL(((ExecuteSQLRequest) (jsonrpcpeer)).databaseId, ((ExecuteSQLRequest) (jsonrpcpeer)).query, new com.facebook.stetho.inspector.database.DatabasePeerManager.ExecuteResultHandler() {

				public ExecuteSQLResponse handleResult(Cursor cursor)
					throws SQLiteException
				{
					ExecuteSQLResponse executesqlresponse = new ExecuteSQLResponse();
				//    0    0:new             #28  <Class Database$ExecuteSQLResponse>
				//    1    3:dup             
				//    2    4:aconst_null     
				//    3    5:invokespecial   #31  <Method void Database$ExecuteSQLResponse(Database$1)>
				//    4    8:astore_2        
					executesqlresponse.columnNames = Arrays.asList(((Object []) (cursor.getColumnNames())));
				//    5    9:aload_2         
				//    6   10:aload_1         
				//    7   11:invokeinterface #37  <Method String[] Cursor.getColumnNames()>
				//    8   16:invokestatic    #43  <Method List Arrays.asList(Object[])>
				//    9   19:putfield        #47  <Field List Database$ExecuteSQLResponse.columnNames>
					executesqlresponse.values = flattenRows(cursor, 250);
				//   10   22:aload_2         
				//   11   23:aload_0         
				//   12   24:getfield        #18  <Field Database this$0>
				//   13   27:aload_1         
				//   14   28:sipush          250
				//   15   31:invokestatic    #51  <Method List Database.access$200(Database, Cursor, int)>
				//   16   34:putfield        #54  <Field List Database$ExecuteSQLResponse.values>
					return executesqlresponse;
				//   17   37:aload_2         
				//   18   38:areturn         
				}

				public volatile Object handleResult(Cursor cursor)
					throws SQLiteException
				{
					return ((Object) (handleResult(cursor)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:invokevirtual   #58  <Method Database$ExecuteSQLResponse handleResult(Cursor)>
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
	//    7   14:aload_0         
	//    8   15:getfield        #50  <Field DatabasePeerManager mDatabasePeerManager>
	//    9   18:aload_1         
	//   10   19:getfield        #150 <Field String Database$ExecuteSQLRequest.databaseId>
	//   11   22:aload_1         
	//   12   23:getfield        #153 <Field String Database$ExecuteSQLRequest.query>
	//   13   26:new             #8   <Class Database$1>
	//   14   29:dup             
	//   15   30:aload_0         
	//   16   31:invokespecial   #156 <Method void Database$1(Database)>
	//   17   34:invokevirtual   #159 <Method Object DatabasePeerManager.executeSQL(String, String, com.facebook.stetho.inspector.database.DatabasePeerManager$ExecuteResultHandler)>
	//   18   37:checkcast       #161 <Class JsonRpcResult>
	//   19   40:astore_1        
		}
	//*  20   41:aload_1         
	//*  21   42:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  22   43:astore_2        
		{
			jsonrpcpeer = ((JsonRpcPeer) (new Error()));
	//   23   44:new             #16  <Class Database$Error>
	//   24   47:dup             
	//   25   48:invokespecial   #162 <Method void Database$Error()>
	//   26   51:astore_1        
			jsonrpcpeer.code = 0;
	//   27   52:aload_1         
	//   28   53:iconst_0        
	//   29   54:putfield        #165 <Field int Database$Error.code>
			jsonrpcpeer.message = ((SQLiteException) (jsonobject)).getMessage();
	//   30   57:aload_1         
	//   31   58:aload_2         
	//   32   59:invokevirtual   #169 <Method String SQLiteException.getMessage()>
	//   33   62:putfield        #172 <Field String Database$Error.message>
			jsonobject = ((JSONObject) (new ExecuteSQLResponse()));
	//   34   65:new             #22  <Class Database$ExecuteSQLResponse>
	//   35   68:dup             
	//   36   69:aconst_null     
	//   37   70:invokespecial   #175 <Method void Database$ExecuteSQLResponse(Database$1)>
	//   38   73:astore_2        
			jsonobject.sqlError = ((Error) (jsonrpcpeer));
	//   39   74:aload_2         
	//   40   75:aload_1         
	//   41   76:putfield        #179 <Field Database$Error Database$ExecuteSQLResponse.sqlError>
			return ((JsonRpcResult) (jsonobject));
	//   42   79:aload_2         
	//   43   80:areturn         
		}
		return ((JsonRpcResult) (jsonrpcpeer));
	}

	public JsonRpcResult getDatabaseTableNames(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		jsonrpcpeer = ((JsonRpcPeer) ((GetDatabaseTableNamesRequest)mObjectMapper.convertValue(((Object) (jsonobject)), com/facebook/stetho/inspector/protocol/module/Database$GetDatabaseTableNamesRequest)));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc1            #25  <Class Database$GetDatabaseTableNamesRequest>
	//    4    7:invokevirtual   #146 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    5   10:checkcast       #25  <Class Database$GetDatabaseTableNamesRequest>
	//    6   13:astore_1        
		jsonobject = ((JSONObject) (new GetDatabaseTableNamesResponse()));
	//    7   14:new             #28  <Class Database$GetDatabaseTableNamesResponse>
	//    8   17:dup             
	//    9   18:aconst_null     
	//   10   19:invokespecial   #181 <Method void Database$GetDatabaseTableNamesResponse(Database$1)>
	//   11   22:astore_2        
		jsonobject.tableNames = mDatabasePeerManager.getDatabaseTableNames(((GetDatabaseTableNamesRequest) (jsonrpcpeer)).databaseId);
	//   12   23:aload_2         
	//   13   24:aload_0         
	//   14   25:getfield        #50  <Field DatabasePeerManager mDatabasePeerManager>
	//   15   28:aload_1         
	//   16   29:getfield        #182 <Field String Database$GetDatabaseTableNamesRequest.databaseId>
	//   17   32:invokevirtual   #185 <Method List DatabasePeerManager.getDatabaseTableNames(String)>
	//   18   35:putfield        #189 <Field List Database$GetDatabaseTableNamesResponse.tableNames>
		return ((JsonRpcResult) (jsonobject));
	//   19   38:aload_2         
	//   20   39:areturn         
	}

	private static final int MAX_EXECUTE_RESULTS = 250;
	private final DatabasePeerManager mDatabasePeerManager;
	private final ObjectMapper mObjectMapper = new ObjectMapper();


/*
	static List access$200(Database database, Cursor cursor, int i)
	{
		return database.flattenRows(cursor, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #62  <Method List flattenRows(Cursor, int)>
	//    4    6:areturn         
	}

*/
}
