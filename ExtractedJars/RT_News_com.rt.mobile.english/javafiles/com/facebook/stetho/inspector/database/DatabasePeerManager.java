// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.helper.PeerRegistrationListener;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import java.io.File;
import java.util.*;

public class DatabasePeerManager extends ChromePeerManager
{
	public static interface ExecuteResultHandler
	{

		public abstract Object handleResult(Cursor cursor)
			throws SQLiteException;
	}


	public DatabasePeerManager(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void ChromePeerManager()>
	//    2    4:aload_0         
	//    3    5:new             #6   <Class DatabasePeerManager$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #34  <Method void DatabasePeerManager$1(DatabasePeerManager)>
	//    7   13:putfield        #36  <Field PeerRegistrationListener mPeerRegistrationListener>
		mContext = context;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #38  <Field Context mContext>
		setListener(mPeerRegistrationListener);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #36  <Field PeerRegistrationListener mPeerRegistrationListener>
	//   14   26:invokevirtual   #42  <Method void setListener(PeerRegistrationListener)>
	//   15   29:return          
	}

	private void bootstrapNewPeer(JsonRpcPeer jsonrpcpeer)
	{
		Object obj;
		for(Iterator iterator = ((Iterable) (tidyDatabaseList(mContext.databaseList()))).iterator(); iterator.hasNext(); jsonrpcpeer.invokeMethod("Database.addDatabase", obj, ((com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback) (null))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field Context mContext>
	//*   2    4:invokevirtual   #54  <Method String[] Context.databaseList()>
	//*   3    7:invokestatic    #58  <Method List tidyDatabaseList(String[])>
	//*   4   10:invokeinterface #64  <Method Iterator Iterable.iterator()>
	//*   5   15:astore_2        
	//*   6   16:aload_2         
	//*   7   17:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//*   8   22:ifeq            100
		{
			obj = ((Object) ((String)iterator.next()));
	//    9   25:aload_2         
	//   10   26:invokeinterface #74  <Method Object Iterator.next()>
	//   11   31:checkcast       #20  <Class String>
	//   12   34:astore          4
			com.facebook.stetho.inspector.protocol.module.Database.DatabaseObject databaseobject = new com.facebook.stetho.inspector.protocol.module.Database.DatabaseObject();
	//   13   36:new             #76  <Class com.facebook.stetho.inspector.protocol.module.Database$DatabaseObject>
	//   14   39:dup             
	//   15   40:invokespecial   #77  <Method void com.facebook.stetho.inspector.protocol.module.Database$DatabaseObject()>
	//   16   43:astore_3        
			databaseobject.id = ((String) (obj));
	//   17   44:aload_3         
	//   18   45:aload           4
	//   19   47:putfield        #81  <Field String com.facebook.stetho.inspector.protocol.module.Database$DatabaseObject.id>
			databaseobject.name = ((String) (obj));
	//   20   50:aload_3         
	//   21   51:aload           4
	//   22   53:putfield        #84  <Field String com.facebook.stetho.inspector.protocol.module.Database$DatabaseObject.name>
			databaseobject.domain = mContext.getPackageName();
	//   23   56:aload_3         
	//   24   57:aload_0         
	//   25   58:getfield        #38  <Field Context mContext>
	//   26   61:invokevirtual   #88  <Method String Context.getPackageName()>
	//   27   64:putfield        #91  <Field String com.facebook.stetho.inspector.protocol.module.Database$DatabaseObject.domain>
			databaseobject.version = "N/A";
	//   28   67:aload_3         
	//   29   68:ldc1            #93  <String "N/A">
	//   30   70:putfield        #96  <Field String com.facebook.stetho.inspector.protocol.module.Database$DatabaseObject.version>
			obj = ((Object) (new com.facebook.stetho.inspector.protocol.module.Database.AddDatabaseEvent()));
	//   31   73:new             #98  <Class com.facebook.stetho.inspector.protocol.module.Database$AddDatabaseEvent>
	//   32   76:dup             
	//   33   77:invokespecial   #99  <Method void com.facebook.stetho.inspector.protocol.module.Database$AddDatabaseEvent()>
	//   34   80:astore          4
			obj.database = databaseobject;
	//   35   82:aload           4
	//   36   84:aload_3         
	//   37   85:putfield        #103 <Field com.facebook.stetho.inspector.protocol.module.Database$DatabaseObject com.facebook.stetho.inspector.protocol.module.Database$AddDatabaseEvent.database>
		}

	//   38   88:aload_1         
	//   39   89:ldc1            #105 <String "Database.addDatabase">
	//   40   91:aload           4
	//   41   93:aconst_null     
	//   42   94:invokevirtual   #111 <Method void JsonRpcPeer.invokeMethod(String, Object, com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback)>
	//*  43   97:goto            16
	//   44  100:return          
	}

	private SQLiteDatabase openDatabase(String s)
		throws SQLiteException
	{
		Util.throwIfNull(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #121 <Method Object Util.throwIfNull(Object)>
	//    2    4:pop             
		return SQLiteDatabase.openDatabase(mContext.getDatabasePath(s).getAbsolutePath(), ((android.database.sqlite.SQLiteDatabase.CursorFactory) (null)), 0);
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field Context mContext>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #125 <Method File Context.getDatabasePath(String)>
	//    7   13:invokevirtual   #130 <Method String File.getAbsolutePath()>
	//    8   16:aconst_null     
	//    9   17:iconst_0        
	//   10   18:invokestatic    #135 <Method SQLiteDatabase SQLiteDatabase.openDatabase(String, android.database.sqlite.SQLiteDatabase$CursorFactory, int)>
	//   11   21:areturn         
	}

	private static String removeSuffix(String s, String as[])
	{
		int j = as.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          47
		{
			String s1 = as[i];
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:aaload          
	//   11   13:astore          4
			if(s.endsWith(s1))
	//*  12   15:aload_0         
	//*  13   16:aload           4
	//*  14   18:invokevirtual   #142 <Method boolean String.endsWith(String)>
	//*  15   21:ifeq            40
				return s.substring(0, s.length() - s1.length());
	//   16   24:aload_0         
	//   17   25:iconst_0        
	//   18   26:aload_0         
	//   19   27:invokevirtual   #146 <Method int String.length()>
	//   20   30:aload           4
	//   21   32:invokevirtual   #146 <Method int String.length()>
	//   22   35:isub            
	//   23   36:invokevirtual   #150 <Method String String.substring(int, int)>
	//   24   39:areturn         
		}

	//   25   40:iload_2         
	//   26   41:iconst_1        
	//   27   42:iadd            
	//   28   43:istore_2        
	//*  29   44:goto            5
		return s;
	//   30   47:aload_0         
	//   31   48:areturn         
	}

	static List tidyDatabaseList(String as[])
	{
		HashSet hashset = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (as))))));
	//    0    0:new             #152 <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #158 <Method List Arrays.asList(Object[])>
	//    4    8:invokespecial   #161 <Method void HashSet(java.util.Collection)>
	//    5   11:astore_3        
		ArrayList arraylist = new ArrayList();
	//    6   12:new             #163 <Class ArrayList>
	//    7   15:dup             
	//    8   16:invokespecial   #164 <Method void ArrayList()>
	//    9   19:astore          4
		int i = 0;
	//   10   21:iconst_0        
	//   11   22:istore_1        
		for(int j = as.length; i < j; i++)
	//*  12   23:aload_0         
	//*  13   24:arraylength     
	//*  14   25:istore_2        
	//*  15   26:iload_1         
	//*  16   27:iload_2         
	//*  17   28:icmpge          84
		{
			String s = as[i];
	//   18   31:aload_0         
	//   19   32:iload_1         
	//   20   33:aaload          
	//   21   34:astore          5
			String s1 = removeSuffix(s, UNINTERESTING_FILENAME_SUFFIXES);
	//   22   36:aload           5
	//   23   38:getstatic       #26  <Field String[] UNINTERESTING_FILENAME_SUFFIXES>
	//   24   41:invokestatic    #166 <Method String removeSuffix(String, String[])>
	//   25   44:astore          6
			if(s1.equals(((Object) (s))) || !((Set) (hashset)).contains(((Object) (s1))))
	//*  26   46:aload           6
	//*  27   48:aload           5
	//*  28   50:invokevirtual   #170 <Method boolean String.equals(Object)>
	//*  29   53:ifne            67
	//*  30   56:aload_3         
	//*  31   57:aload           6
	//*  32   59:invokeinterface #175 <Method boolean Set.contains(Object)>
	//*  33   64:ifne            77
				((List) (arraylist)).add(((Object) (s)));
	//   34   67:aload           4
	//   35   69:aload           5
	//   36   71:invokeinterface #180 <Method boolean List.add(Object)>
	//   37   76:pop             
		}

	//   38   77:iload_1         
	//   39   78:iconst_1        
	//   40   79:iadd            
	//   41   80:istore_1        
	//*  42   81:goto            26
		return ((List) (arraylist));
	//   43   84:aload           4
	//   44   86:areturn         
	}

	public Object executeSQL(String s, String s1, ExecuteResultHandler executeresulthandler)
		throws SQLiteException
	{
		Util.throwIfNull(((Object) (s1)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #121 <Method Object Util.throwIfNull(Object)>
	//    2    4:pop             
		Util.throwIfNull(((Object) (executeresulthandler)));
	//    3    5:aload_3         
	//    4    6:invokestatic    #121 <Method Object Util.throwIfNull(Object)>
	//    5    9:pop             
		s = ((String) (openDatabase(s)));
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #186 <Method SQLiteDatabase openDatabase(String)>
	//    9   15:astore_1        
		s1 = ((String) (((SQLiteDatabase) (s)).rawQuery(s1, ((String []) (null)))));
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:aconst_null     
	//   13   19:invokevirtual   #190 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   14   22:astore_2        
		executeresulthandler = ((ExecuteResultHandler) (executeresulthandler.handleResult(((Cursor) (s1)))));
	//   15   23:aload_3         
	//   16   24:aload_2         
	//   17   25:invokeinterface #194 <Method Object DatabasePeerManager$ExecuteResultHandler.handleResult(Cursor)>
	//   18   30:astore_3        
		((Cursor) (s1)).close();
	//   19   31:aload_2         
	//   20   32:invokeinterface #199 <Method void Cursor.close()>
		((SQLiteDatabase) (s)).close();
	//   21   37:aload_1         
	//   22   38:invokevirtual   #200 <Method void SQLiteDatabase.close()>
		return ((Object) (executeresulthandler));
	//   23   41:aload_3         
	//   24   42:areturn         
		executeresulthandler;
	//   25   43:astore_3        
		((Cursor) (s1)).close();
	//   26   44:aload_2         
	//   27   45:invokeinterface #199 <Method void Cursor.close()>
		throw executeresulthandler;
	//   28   50:aload_3         
	//   29   51:athrow          
		s1;
	//   30   52:astore_2        
		((SQLiteDatabase) (s)).close();
	//   31   53:aload_1         
	//   32   54:invokevirtual   #200 <Method void SQLiteDatabase.close()>
		throw s1;
	//   33   57:aload_2         
	//   34   58:athrow          
	}

	public List getDatabaseTableNames(String s)
		throws SQLiteException
	{
		s = ((String) (openDatabase(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #186 <Method SQLiteDatabase openDatabase(String)>
	//    3    5:astore_1        
		Cursor cursor = ((SQLiteDatabase) (s)).rawQuery("SELECT name FROM sqlite_master WHERE type=?", new String[] {
			"table"
		});
	//    4    6:aload_1         
	//    5    7:ldc1            #205 <String "SELECT name FROM sqlite_master WHERE type=?">
	//    6    9:iconst_1        
	//    7   10:anewarray       String[]
	//    8   13:dup             
	//    9   14:iconst_0        
	//   10   15:ldc1            #207 <String "table">
	//   11   17:aastore         
	//   12   18:invokevirtual   #190 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   13   21:astore_2        
		ArrayList arraylist;
		arraylist = new ArrayList();
	//   14   22:new             #163 <Class ArrayList>
	//   15   25:dup             
	//   16   26:invokespecial   #164 <Method void ArrayList()>
	//   17   29:astore_3        
		for(; cursor.moveToNext(); ((List) (arraylist)).add(((Object) (cursor.getString(0)))));
	//   18   30:aload_2         
	//   19   31:invokeinterface #210 <Method boolean Cursor.moveToNext()>
	//   20   36:ifeq            56
	//   21   39:aload_3         
	//   22   40:aload_2         
	//   23   41:iconst_0        
	//   24   42:invokeinterface #214 <Method String Cursor.getString(int)>
	//   25   47:invokeinterface #180 <Method boolean List.add(Object)>
	//   26   52:pop             
	//*  27   53:goto            30
		cursor.close();
	//   28   56:aload_2         
	//   29   57:invokeinterface #199 <Method void Cursor.close()>
		((SQLiteDatabase) (s)).close();
	//   30   62:aload_1         
	//   31   63:invokevirtual   #200 <Method void SQLiteDatabase.close()>
		return ((List) (arraylist));
	//   32   66:aload_3         
	//   33   67:areturn         
		Exception exception1;
		exception1;
	//   34   68:astore_3        
		cursor.close();
	//   35   69:aload_2         
	//   36   70:invokeinterface #199 <Method void Cursor.close()>
		throw exception1;
	//   37   75:aload_3         
	//   38   76:athrow          
		Exception exception;
		exception;
	//   39   77:astore_2        
		((SQLiteDatabase) (s)).close();
	//   40   78:aload_1         
	//   41   79:invokevirtual   #200 <Method void SQLiteDatabase.close()>
		throw exception;
	//   42   82:aload_2         
	//   43   83:athrow          
	}

	private static final String UNINTERESTING_FILENAME_SUFFIXES[] = {
		"-journal", "-uid"
	};
	private final Context mContext;
	private final PeerRegistrationListener mPeerRegistrationListener = new PeerRegistrationListener() {

		public void onPeerRegistered(JsonRpcPeer jsonrpcpeer)
		{
			bootstrapNewPeer(jsonrpcpeer);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field DatabasePeerManager this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #24  <Method void DatabasePeerManager.access$000(DatabasePeerManager, JsonRpcPeer)>
		//    4    8:return          
		}

		public void onPeerUnregistered(JsonRpcPeer jsonrpcpeer)
		{
		//    0    0:return          
		}

		final DatabasePeerManager this$0;

			
			{
				this$0 = DatabasePeerManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field DatabasePeerManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #22  <String "-journal">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #24  <String "-uid">
	//    9   13:aastore         
	//   10   14:putstatic       #26  <Field String[] UNINTERESTING_FILENAME_SUFFIXES>
	//*  11   17:return          
	}


/*
	static void access$000(DatabasePeerManager databasepeermanager, JsonRpcPeer jsonrpcpeer)
	{
		databasepeermanager.bootstrapNewPeer(jsonrpcpeer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method void bootstrapNewPeer(JsonRpcPeer)>
		return;
	//    3    5:return          
	}

*/
}
