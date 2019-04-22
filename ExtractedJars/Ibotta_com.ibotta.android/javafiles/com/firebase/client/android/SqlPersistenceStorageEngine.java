// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.android;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.firebase.client.collection.ImmutableSortedMap;
import com.firebase.client.core.CompoundWrite;
import com.firebase.client.core.Context;
import com.firebase.client.core.Path;
import com.firebase.client.core.UserWriteRecord;
import com.firebase.client.core.persistence.PersistenceStorageEngine;
import com.firebase.client.core.persistence.PruneForest;
import com.firebase.client.core.persistence.TrackedQuery;
import com.firebase.client.core.utilities.ImmutableTree;
import com.firebase.client.core.view.QueryParams;
import com.firebase.client.core.view.QuerySpec;
import com.firebase.client.snapshot.ChildKey;
import com.firebase.client.snapshot.ChildrenNode;
import com.firebase.client.snapshot.EmptyNode;
import com.firebase.client.snapshot.NamedNode;
import com.firebase.client.snapshot.Node;
import com.firebase.client.snapshot.NodeUtilities;
import com.firebase.client.utilities.LogWrapper;
import com.firebase.client.utilities.NodeSizeEstimator;
import com.firebase.client.utilities.Pair;
import com.firebase.client.utilities.Utilities;
import com.newrelic.agent.android.instrumentation.SQLiteInstrumentation;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SqlPersistenceStorageEngine
	implements PersistenceStorageEngine
{
	private static class PersistentCacheOpenHelper extends SQLiteOpenHelper
	{

		private void dropTable(SQLiteDatabase sqlitedatabase, String s)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #26  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #28  <Method void StringBuilder()>
		//    3    7:astore_3        
			stringbuilder.append("DROP TABLE IF EXISTS ");
		//    4    8:aload_3         
		//    5    9:ldc1            #30  <String "DROP TABLE IF EXISTS ">
		//    6   11:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(s);
		//    8   15:aload_3         
		//    9   16:aload_2         
		//   10   17:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
		//   11   20:pop             
			s = stringbuilder.toString();
		//   12   21:aload_3         
		//   13   22:invokevirtual   #38  <Method String StringBuilder.toString()>
		//   14   25:astore_2        
			if(!(sqlitedatabase instanceof SQLiteDatabase))
		//*  15   26:aload_1         
		//*  16   27:instanceof      #40  <Class SQLiteDatabase>
		//*  17   30:ifne            39
			{
				sqlitedatabase.execSQL(s);
		//   18   33:aload_1         
		//   19   34:aload_2         
		//   20   35:invokevirtual   #44  <Method void SQLiteDatabase.execSQL(String)>
				return;
		//   21   38:return          
			} else
			{
				SQLiteInstrumentation.execSQL((SQLiteDatabase)sqlitedatabase, s);
		//   22   39:aload_1         
		//   23   40:checkcast       #40  <Class SQLiteDatabase>
		//   24   43:aload_2         
		//   25   44:invokestatic    #48  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				return;
		//   26   47:return          
			}
		}

		public void onCreate(SQLiteDatabase sqlitedatabase)
		{
			boolean flag = sqlitedatabase instanceof SQLiteDatabase;
		//    0    0:aload_1         
		//    1    1:instanceof      #40  <Class SQLiteDatabase>
		//    2    4:istore_2        
			if(!flag)
		//*   3    5:iload_2         
		//*   4    6:ifne            18
				sqlitedatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
		//    5    9:aload_1         
		//    6   10:ldc1            #52  <String "CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);">
		//    7   12:invokevirtual   #44  <Method void SQLiteDatabase.execSQL(String)>
			else
		//*   8   15:goto            27
				SQLiteInstrumentation.execSQL((SQLiteDatabase)sqlitedatabase, "CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
		//    9   18:aload_1         
		//   10   19:checkcast       #40  <Class SQLiteDatabase>
		//   11   22:ldc1            #52  <String "CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);">
		//   12   24:invokestatic    #48  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
			if(!flag)
		//*  13   27:iload_2         
		//*  14   28:ifne            40
				sqlitedatabase.execSQL("CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));");
		//   15   31:aload_1         
		//   16   32:ldc1            #54  <String "CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));">
		//   17   34:invokevirtual   #44  <Method void SQLiteDatabase.execSQL(String)>
			else
		//*  18   37:goto            49
				SQLiteInstrumentation.execSQL((SQLiteDatabase)sqlitedatabase, "CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));");
		//   19   40:aload_1         
		//   20   41:checkcast       #40  <Class SQLiteDatabase>
		//   21   44:ldc1            #54  <String "CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));">
		//   22   46:invokestatic    #48  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
			if(!flag)
		//*  23   49:iload_2         
		//*  24   50:ifne            62
				sqlitedatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
		//   25   53:aload_1         
		//   26   54:ldc1            #56  <String "CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);">
		//   27   56:invokevirtual   #44  <Method void SQLiteDatabase.execSQL(String)>
			else
		//*  28   59:goto            71
				SQLiteInstrumentation.execSQL((SQLiteDatabase)sqlitedatabase, "CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
		//   29   62:aload_1         
		//   30   63:checkcast       #40  <Class SQLiteDatabase>
		//   31   66:ldc1            #56  <String "CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);">
		//   32   68:invokestatic    #48  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
			if(!flag)
		//*  33   71:iload_2         
		//*  34   72:ifne            82
			{
				sqlitedatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
		//   35   75:aload_1         
		//   36   76:ldc1            #58  <String "CREATE TABLE trackedKeys (id INTEGER, key TEXT);">
		//   37   78:invokevirtual   #44  <Method void SQLiteDatabase.execSQL(String)>
				return;
		//   38   81:return          
			} else
			{
				SQLiteInstrumentation.execSQL((SQLiteDatabase)sqlitedatabase, "CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
		//   39   82:aload_1         
		//   40   83:checkcast       #40  <Class SQLiteDatabase>
		//   41   86:ldc1            #58  <String "CREATE TABLE trackedKeys (id INTEGER, key TEXT);">
		//   42   88:invokestatic    #48  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				return;
		//   43   91:return          
			}
		}

		public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
		{
			if(i <= 1)
		//*   0    0:iload_2         
		//*   1    1:iconst_1        
		//*   2    2:icmpgt          93
			{
				dropTable(sqlitedatabase, "serverCache");
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:ldc1            #62  <String "serverCache">
		//    6    9:invokespecial   #64  <Method void dropTable(SQLiteDatabase, String)>
				boolean flag = sqlitedatabase instanceof SQLiteDatabase;
		//    7   12:aload_1         
		//    8   13:instanceof      #40  <Class SQLiteDatabase>
		//    9   16:istore          4
				if(!flag)
		//*  10   18:iload           4
		//*  11   20:ifne            32
					sqlitedatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
		//   12   23:aload_1         
		//   13   24:ldc1            #52  <String "CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);">
		//   14   26:invokevirtual   #44  <Method void SQLiteDatabase.execSQL(String)>
				else
		//*  15   29:goto            41
					SQLiteInstrumentation.execSQL((SQLiteDatabase)sqlitedatabase, "CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
		//   16   32:aload_1         
		//   17   33:checkcast       #40  <Class SQLiteDatabase>
		//   18   36:ldc1            #52  <String "CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);">
		//   19   38:invokestatic    #48  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				dropTable(sqlitedatabase, "complete");
		//   20   41:aload_0         
		//   21   42:aload_1         
		//   22   43:ldc1            #66  <String "complete">
		//   23   45:invokespecial   #64  <Method void dropTable(SQLiteDatabase, String)>
				if(!flag)
		//*  24   48:iload           4
		//*  25   50:ifne            62
					sqlitedatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
		//   26   53:aload_1         
		//   27   54:ldc1            #58  <String "CREATE TABLE trackedKeys (id INTEGER, key TEXT);">
		//   28   56:invokevirtual   #44  <Method void SQLiteDatabase.execSQL(String)>
				else
		//*  29   59:goto            71
					SQLiteInstrumentation.execSQL((SQLiteDatabase)sqlitedatabase, "CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
		//   30   62:aload_1         
		//   31   63:checkcast       #40  <Class SQLiteDatabase>
		//   32   66:ldc1            #58  <String "CREATE TABLE trackedKeys (id INTEGER, key TEXT);">
		//   33   68:invokestatic    #48  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
				if(!flag)
		//*  34   71:iload           4
		//*  35   73:ifne            83
				{
					sqlitedatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
		//   36   76:aload_1         
		//   37   77:ldc1            #56  <String "CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);">
		//   38   79:invokevirtual   #44  <Method void SQLiteDatabase.execSQL(String)>
					return;
		//   39   82:return          
				} else
				{
					SQLiteInstrumentation.execSQL((SQLiteDatabase)sqlitedatabase, "CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
		//   40   83:aload_1         
		//   41   84:checkcast       #40  <Class SQLiteDatabase>
		//   42   87:ldc1            #56  <String "CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);">
		//   43   89:invokestatic    #48  <Method void SQLiteInstrumentation.execSQL(SQLiteDatabase, String)>
					return;
		//   44   92:return          
				}
			} else
			{
				sqlitedatabase = ((SQLiteDatabase) (new StringBuilder()));
		//   45   93:new             #26  <Class StringBuilder>
		//   46   96:dup             
		//   47   97:invokespecial   #28  <Method void StringBuilder()>
		//   48  100:astore_1        
				((StringBuilder) (sqlitedatabase)).append("We don't handle upgrading to ");
		//   49  101:aload_1         
		//   50  102:ldc1            #68  <String "We don't handle upgrading to ">
		//   51  104:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
		//   52  107:pop             
				((StringBuilder) (sqlitedatabase)).append(j);
		//   53  108:aload_1         
		//   54  109:iload_3         
		//   55  110:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
		//   56  113:pop             
				throw new AssertionError(((Object) (((StringBuilder) (sqlitedatabase)).toString())));
		//   57  114:new             #73  <Class AssertionError>
		//   58  117:dup             
		//   59  118:aload_1         
		//   60  119:invokevirtual   #38  <Method String StringBuilder.toString()>
		//   61  122:invokespecial   #76  <Method void AssertionError(Object)>
		//   62  125:athrow          
			}
		}

		static final boolean $assertionsDisabled = false;
		private static final int DATABASE_VERSION = 2;

		static 
		{
		//    0    0:return          
		}

		public PersistentCacheOpenHelper(android.content.Context context, String s)
		{
			super(context, s, ((android.database.sqlite.SQLiteDatabase.CursorFactory) (null)), 2);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aconst_null     
		//    4    4:iconst_2        
		//    5    5:invokespecial   #22  <Method void SQLiteOpenHelper(android.content.Context, String, android.database.sqlite.SQLiteDatabase$CursorFactory, int)>
		//    6    8:return          
		}
	}


	public SqlPersistenceStorageEngine(android.content.Context context, Context context1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #121 <Method void Object()>
		transactionStart = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #123 <Field long transactionStart>
		try
		{
			s = URLEncoder.encode(s, "utf-8");
	//    5    9:aload_3         
	//    6   10:ldc1            #125 <String "utf-8">
	//    7   12:invokestatic    #131 <Method String URLEncoder.encode(String, String)>
	//    8   15:astore_3        
		}
	//*   9   16:aload_0         
	//*  10   17:new             #12  <Class SqlPersistenceStorageEngine$PersistentCacheOpenHelper>
	//*  11   20:dup             
	//*  12   21:aload_1         
	//*  13   22:aload_3         
	//*  14   23:invokespecial   #134 <Method void SqlPersistenceStorageEngine$PersistentCacheOpenHelper(android.content.Context, String)>
	//*  15   26:invokevirtual   #138 <Method SQLiteDatabase SqlPersistenceStorageEngine$PersistentCacheOpenHelper.getWritableDatabase()>
	//*  16   29:putfield        #140 <Field SQLiteDatabase database>
	//*  17   32:aload_0         
	//*  18   33:new             #142 <Class ObjectMapper>
	//*  19   36:dup             
	//*  20   37:invokespecial   #143 <Method void ObjectMapper()>
	//*  21   40:putfield        #145 <Field ObjectMapper jsonMapper>
	//*  22   43:aload_0         
	//*  23   44:aload_2         
	//*  24   45:ldc1            #27  <String "Persistence">
	//*  25   47:invokevirtual   #151 <Method LogWrapper Context.getLogger(String)>
	//*  26   50:putfield        #153 <Field LogWrapper logger>
	//*  27   53:return          
		// Misplaced declaration of an exception variable
		catch(android.content.Context context)
	//*  28   54:astore_1        
		{
			throw new RuntimeException(((Throwable) (context)));
	//   29   55:new             #155 <Class RuntimeException>
	//   30   58:dup             
	//   31   59:aload_1         
	//   32   60:invokespecial   #158 <Method void RuntimeException(Throwable)>
	//   33   63:athrow          
		}
		database = (new PersistentCacheOpenHelper(context, s)).getWritableDatabase();
		logger = context1.getLogger("Persistence");
	}

	private static String buildAncestorWhereClause(Path path, String as[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		StringBuilder stringbuilder = new StringBuilder("(");
	//    2    2:new             #162 <Class StringBuilder>
	//    3    5:dup             
	//    4    6:ldc1            #164 <String "(">
	//    5    8:invokespecial   #167 <Method void StringBuilder(String)>
	//    6   11:astore_3        
		while(!path.isEmpty()) 
	//*   7   12:aload_0         
	//*   8   13:invokevirtual   #173 <Method boolean Path.isEmpty()>
	//*   9   16:ifne            52
		{
			stringbuilder.append("path");
	//   10   19:aload_3         
	//   11   20:ldc1            #36  <String "path">
	//   12   22:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
			stringbuilder.append(" = ? OR ");
	//   14   26:aload_3         
	//   15   27:ldc1            #179 <String " = ? OR ">
	//   16   29:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
			as[i] = pathToKey(path);
	//   18   33:aload_1         
	//   19   34:iload_2         
	//   20   35:aload_0         
	//   21   36:invokestatic    #183 <Method String pathToKey(Path)>
	//   22   39:aastore         
			path = path.getParent();
	//   23   40:aload_0         
	//   24   41:invokevirtual   #187 <Method Path Path.getParent()>
	//   25   44:astore_0        
			i++;
	//   26   45:iload_2         
	//   27   46:iconst_1        
	//   28   47:iadd            
	//   29   48:istore_2        
		}
	//*  30   49:goto            12
		stringbuilder.append("path");
	//   31   52:aload_3         
	//   32   53:ldc1            #36  <String "path">
	//   33   55:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   34   58:pop             
		stringbuilder.append(" = ?)");
	//   35   59:aload_3         
	//   36   60:ldc1            #189 <String " = ?)">
	//   37   62:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   38   65:pop             
		as[i] = pathToKey(Path.getEmptyPath());
	//   39   66:aload_1         
	//   40   67:iload_2         
	//   41   68:invokestatic    #192 <Method Path Path.getEmptyPath()>
	//   42   71:invokestatic    #183 <Method String pathToKey(Path)>
	//   43   74:aastore         
		return stringbuilder.toString();
	//   44   75:aload_3         
	//   45   76:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   46   79:areturn         
	}

	private String commaSeparatedList(Collection collection)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #162 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #199 <Method void StringBuilder()>
	//    3    7:astore          5
		collection = ((Collection) (collection.iterator()));
	//    4    9:aload_1         
	//    5   10:invokeinterface #205 <Method Iterator Collection.iterator()>
	//    6   15:astore_1        
		boolean flag = true;
	//    7   16:iconst_1        
	//    8   17:istore_2        
		long l;
		for(; ((Iterator) (collection)).hasNext(); stringbuilder.append(l))
	//*   9   18:aload_1         
	//*  10   19:invokeinterface #210 <Method boolean Iterator.hasNext()>
	//*  11   24:ifeq            64
		{
			l = ((Long)((Iterator) (collection)).next()).longValue();
	//   12   27:aload_1         
	//   13   28:invokeinterface #214 <Method Object Iterator.next()>
	//   14   33:checkcast       #216 <Class Long>
	//   15   36:invokevirtual   #220 <Method long Long.longValue()>
	//   16   39:lstore_3        
			if(!flag)
	//*  17   40:iload_2         
	//*  18   41:ifne            52
				stringbuilder.append(",");
	//   19   44:aload           5
	//   20   46:ldc1            #222 <String ",">
	//   21   48:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   22   51:pop             
			flag = false;
	//   23   52:iconst_0        
	//   24   53:istore_2        
		}

	//   25   54:aload           5
	//   26   56:lload_3         
	//   27   57:invokevirtual   #225 <Method StringBuilder StringBuilder.append(long)>
	//   28   60:pop             
	//*  29   61:goto            18
		return stringbuilder.toString();
	//   30   64:aload           5
	//   31   66:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   32   69:areturn         
	}

	private Node deserializeNode(byte abyte0[])
	{
		UnsupportedEncodingException unsupportedencodingexception;
		Node node;
		try
		{
			node = NodeUtilities.NodeFromJSON(jsonMapper.readValue(abyte0, java/lang/Object));
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field ObjectMapper jsonMapper>
	//    2    4:aload_1         
	//    3    5:ldc1            #4   <Class Object>
	//    4    7:invokevirtual   #235 <Method Object ObjectMapper.readValue(byte[], Class)>
	//    5   10:invokestatic    #241 <Method Node NodeUtilities.NodeFromJSON(Object)>
	//    6   13:astore_2        
		}
	//*   7   14:aload_2         
	//*   8   15:areturn         
		catch(IOException ioexception)
	//*   9   16:astore_2        
		{
			StringBuilder stringbuilder;
			try
			{
				String s = new String(abyte0, "UTF-8");
	//   10   17:new             #243 <Class String>
	//   11   20:dup             
	//   12   21:aload_1         
	//   13   22:ldc1            #245 <String "UTF-8">
	//   14   24:invokespecial   #248 <Method void String(byte[], String)>
	//   15   27:astore_3        
				StringBuilder stringbuilder1 = new StringBuilder();
	//   16   28:new             #162 <Class StringBuilder>
	//   17   31:dup             
	//   18   32:invokespecial   #199 <Method void StringBuilder()>
	//   19   35:astore          4
				stringbuilder1.append("Could not deserialize node: ");
	//   20   37:aload           4
	//   21   39:ldc1            #250 <String "Could not deserialize node: ">
	//   22   41:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
				stringbuilder1.append(s);
	//   24   45:aload           4
	//   25   47:aload_3         
	//   26   48:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
				throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (ioexception)));
	//   28   52:new             #155 <Class RuntimeException>
	//   29   55:dup             
	//   30   56:aload           4
	//   31   58:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   32   61:aload_2         
	//   33   62:invokespecial   #253 <Method void RuntimeException(String, Throwable)>
	//   34   65:athrow          
			}
	//*  35   66:new             #162 <Class StringBuilder>
	//*  36   69:dup             
	//*  37   70:invokespecial   #199 <Method void StringBuilder()>
	//*  38   73:astore_3        
	//*  39   74:aload_3         
	//*  40   75:ldc1            #255 <String "Failed to serialize values to utf-8: ">
	//*  41   77:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//*  42   80:pop             
	//*  43   81:aload_3         
	//*  44   82:aload_1         
	//*  45   83:invokestatic    #260 <Method String Arrays.toString(byte[])>
	//*  46   86:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//*  47   89:pop             
	//*  48   90:new             #155 <Class RuntimeException>
	//*  49   93:dup             
	//*  50   94:aload_3         
	//*  51   95:invokevirtual   #196 <Method String StringBuilder.toString()>
	//*  52   98:aload_2         
	//*  53   99:invokespecial   #253 <Method void RuntimeException(String, Throwable)>
	//*  54  102:athrow          
			// Misplaced declaration of an exception variable
			catch(UnsupportedEncodingException unsupportedencodingexception)
			{
				stringbuilder = new StringBuilder();
			}
			stringbuilder.append("Failed to serialize values to utf-8: ");
			stringbuilder.append(Arrays.toString(abyte0));
			throw new RuntimeException(stringbuilder.toString(), ((Throwable) (ioexception)));
		}
		return node;
	//*  55  103:astore_3        
	//*  56  104:goto            66
	}

	private byte[] joinBytes(List list)
	{
		Iterator iterator = list.iterator();
	//    0    0:aload_1         
	//    1    1:invokeinterface #265 <Method Iterator List.iterator()>
	//    2    6:astore_3        
		int i;
		for(i = 0; iterator.hasNext(); i += ((byte[])iterator.next()).length);
	//    3    7:iconst_0        
	//    4    8:istore_2        
	//    5    9:aload_3         
	//    6   10:invokeinterface #210 <Method boolean Iterator.hasNext()>
	//    7   15:ifeq            34
	//    8   18:iload_2         
	//    9   19:aload_3         
	//   10   20:invokeinterface #214 <Method Object Iterator.next()>
	//   11   25:checkcast       #267 <Class byte[]>
	//   12   28:arraylength     
	//   13   29:iadd            
	//   14   30:istore_2        
	//*  15   31:goto            9
		byte abyte0[] = new byte[i];
	//   16   34:iload_2         
	//   17   35:newarray        byte[]
	//   18   37:astore_3        
		list = ((List) (list.iterator()));
	//   19   38:aload_1         
	//   20   39:invokeinterface #265 <Method Iterator List.iterator()>
	//   21   44:astore_1        
		byte abyte1[];
		for(int j = 0; ((Iterator) (list)).hasNext(); j += abyte1.length)
	//*  22   45:iconst_0        
	//*  23   46:istore_2        
	//*  24   47:aload_1         
	//*  25   48:invokeinterface #210 <Method boolean Iterator.hasNext()>
	//*  26   53:ifeq            87
		{
			abyte1 = (byte[])((Iterator) (list)).next();
	//   27   56:aload_1         
	//   28   57:invokeinterface #214 <Method Object Iterator.next()>
	//   29   62:checkcast       #267 <Class byte[]>
	//   30   65:astore          4
			System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte0)), j, abyte1.length);
	//   31   67:aload           4
	//   32   69:iconst_0        
	//   33   70:aload_3         
	//   34   71:iload_2         
	//   35   72:aload           4
	//   36   74:arraylength     
	//   37   75:invokestatic    #273 <Method void System.arraycopy(Object, int, Object, int, int)>
		}

	//   38   78:iload_2         
	//   39   79:aload           4
	//   40   81:arraylength     
	//   41   82:iadd            
	//   42   83:istore_2        
	//*  43   84:goto            47
		return abyte0;
	//   44   87:aload_3         
	//   45   88:areturn         
	}

	private Node loadNested(Path path)
	{
		long l;
		long l1;
		long l2;
		Object obj;
		ArrayList arraylist;
		ArrayList arraylist1;
		arraylist1 = new ArrayList();
	//    0    0:new             #278 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #279 <Method void ArrayList()>
	//    3    7:astore          22
		arraylist = new ArrayList();
	//    4    9:new             #278 <Class ArrayList>
	//    5   12:dup             
	//    6   13:invokespecial   #279 <Method void ArrayList()>
	//    7   16:astore          21
		l1 = System.currentTimeMillis();
	//    8   18:invokestatic    #282 <Method long System.currentTimeMillis()>
	//    9   21:lstore          7
		obj = ((Object) (loadNestedQuery(path, new String[] {
			"path", "value"
		})));
	//   10   23:aload_0         
	//   11   24:aload_1         
	//   12   25:iconst_2        
	//   13   26:anewarray       String[]
	//   14   29:dup             
	//   15   30:iconst_0        
	//   16   31:ldc1            #36  <String "path">
	//   17   33:aastore         
	//   18   34:dup             
	//   19   35:iconst_1        
	//   20   36:ldc1            #73  <String "value">
	//   21   38:aastore         
	//   22   39:invokespecial   #286 <Method Cursor loadNestedQuery(Path, String[])>
	//   23   42:astore          17
		l2 = System.currentTimeMillis();
	//   24   44:invokestatic    #282 <Method long System.currentTimeMillis()>
	//   25   47:lstore          9
		l = System.currentTimeMillis();
	//   26   49:invokestatic    #282 <Method long System.currentTimeMillis()>
	//   27   52:lstore          5
		for(; ((Cursor) (obj)).moveToNext(); ((List) (arraylist)).add(((Object) (((Cursor) (obj)).getBlob(1)))))
	//*  28   54:aload           17
	//*  29   56:invokeinterface #291 <Method boolean Cursor.moveToNext()>
	//*  30   61:ifeq            99
			((List) (arraylist1)).add(((Object) (((Cursor) (obj)).getString(0))));
	//   31   64:aload           22
	//   32   66:aload           17
	//   33   68:iconst_0        
	//   34   69:invokeinterface #295 <Method String Cursor.getString(int)>
	//   35   74:invokeinterface #299 <Method boolean List.add(Object)>
	//   36   79:pop             

	//   37   80:aload           21
	//   38   82:aload           17
	//   39   84:iconst_1        
	//   40   85:invokeinterface #303 <Method byte[] Cursor.getBlob(int)>
	//   41   90:invokeinterface #299 <Method boolean List.add(Object)>
	//   42   95:pop             
	//*  43   96:goto            54
		long l3;
		HashMap hashmap;
label0:
		{
			((Cursor) (obj)).close();
	//   44   99:aload           17
	//   45  101:invokeinterface #306 <Method void Cursor.close()>
			l = System.currentTimeMillis() - l;
	//   46  106:invokestatic    #282 <Method long System.currentTimeMillis()>
	//   47  109:lload           5
	//   48  111:lsub            
	//   49  112:lstore          5
			l3 = System.currentTimeMillis();
	//   50  114:invokestatic    #282 <Method long System.currentTimeMillis()>
	//   51  117:lstore          11
			obj = ((Object) (EmptyNode.Empty()));
	//   52  119:invokestatic    #312 <Method EmptyNode EmptyNode.Empty()>
	//   53  122:astore          17
			hashmap = new HashMap();
	//   54  124:new             #314 <Class HashMap>
	//   55  127:dup             
	//   56  128:invokespecial   #315 <Method void HashMap()>
	//   57  131:astore          23
			int i = 0;
	//   58  133:iconst_0        
	//   59  134:istore_2        
			boolean flag = false;
	//   60  135:iconst_0        
	//   61  136:istore_3        
			Path path1;
			do
			{
				if(i >= ((List) (arraylist)).size())
					break label0;
	//   62  137:iload_2         
	//   63  138:aload           21
	//   64  140:invokeinterface #319 <Method int List.size()>
	//   65  145:icmpge          489
				Node node1;
				if(((String)((List) (arraylist1)).get(i)).endsWith(".part-0000"))
	//*  66  148:aload           22
	//*  67  150:iload_2         
	//*  68  151:invokeinterface #323 <Method Object List.get(int)>
	//*  69  156:checkcast       #243 <Class String>
	//*  70  159:ldc1            #24  <String ".part-0000">
	//*  71  161:invokevirtual   #327 <Method boolean String.endsWith(String)>
	//*  72  164:ifeq            316
				{
					Object obj1 = ((Object) ((String)((List) (arraylist1)).get(i)));
	//   73  167:aload           22
	//   74  169:iload_2         
	//   75  170:invokeinterface #323 <Method Object List.get(int)>
	//   76  175:checkcast       #243 <Class String>
	//   77  178:astore          18
					obj1 = ((Object) (new Path(((String) (obj1)).substring(0, ((String) (obj1)).length() - 10))));
	//   78  180:new             #169 <Class Path>
	//   79  183:dup             
	//   80  184:aload           18
	//   81  186:iconst_0        
	//   82  187:aload           18
	//   83  189:invokevirtual   #330 <Method int String.length()>
	//   84  192:bipush          10
	//   85  194:isub            
	//   86  195:invokevirtual   #334 <Method String String.substring(int, int)>
	//   87  198:invokespecial   #335 <Method void Path(String)>
	//   88  201:astore          18
					int j = splitNodeRunLength(((Path) (obj1)), ((List) (arraylist1)), i);
	//   89  203:aload_0         
	//   90  204:aload           18
	//   91  206:aload           22
	//   92  208:iload_2         
	//   93  209:invokespecial   #339 <Method int splitNodeRunLength(Path, List, int)>
	//   94  212:istore          4
					if(logger.logsDebug())
	//*  95  214:aload_0         
	//*  96  215:getfield        #153 <Field LogWrapper logger>
	//*  97  218:invokevirtual   #344 <Method boolean LogWrapper.logsDebug()>
	//*  98  221:ifeq            278
					{
						LogWrapper logwrapper = logger;
	//   99  224:aload_0         
	//  100  225:getfield        #153 <Field LogWrapper logger>
	//  101  228:astore          19
						StringBuilder stringbuilder = new StringBuilder();
	//  102  230:new             #162 <Class StringBuilder>
	//  103  233:dup             
	//  104  234:invokespecial   #199 <Method void StringBuilder()>
	//  105  237:astore          20
						stringbuilder.append("Loading split node with ");
	//  106  239:aload           20
	//  107  241:ldc2            #346 <String "Loading split node with ">
	//  108  244:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//  109  247:pop             
						stringbuilder.append(j);
	//  110  248:aload           20
	//  111  250:iload           4
	//  112  252:invokevirtual   #349 <Method StringBuilder StringBuilder.append(int)>
	//  113  255:pop             
						stringbuilder.append(" parts.");
	//  114  256:aload           20
	//  115  258:ldc2            #351 <String " parts.">
	//  116  261:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//  117  264:pop             
						logwrapper.debug(stringbuilder.toString());
	//  118  265:aload           19
	//  119  267:aload           20
	//  120  269:invokevirtual   #196 <Method String StringBuilder.toString()>
	//  121  272:invokevirtual   #354 <Method void LogWrapper.debug(String)>
					}
	//* 122  275:goto            278
					j += i;
	//  123  278:iload           4
	//  124  280:iload_2         
	//  125  281:iadd            
	//  126  282:istore          4
					node1 = deserializeNode(joinBytes(((List) (arraylist)).subList(i, j)));
	//  127  284:aload_0         
	//  128  285:aload_0         
	//  129  286:aload           21
	//  130  288:iload_2         
	//  131  289:iload           4
	//  132  291:invokeinterface #358 <Method List List.subList(int, int)>
	//  133  296:invokespecial   #360 <Method byte[] joinBytes(List)>
	//  134  299:invokespecial   #362 <Method Node deserializeNode(byte[])>
	//  135  302:astore          19
					i = j - 1;
	//  136  304:iload           4
	//  137  306:iconst_1        
	//  138  307:isub            
	//  139  308:istore_2        
					path1 = ((Path) (obj1));
	//  140  309:aload           18
	//  141  311:astore          20
				} else
	//* 142  313:goto            357
				{
					Node node = deserializeNode((byte[])((List) (arraylist)).get(i));
	//  143  316:aload_0         
	//  144  317:aload           21
	//  145  319:iload_2         
	//  146  320:invokeinterface #323 <Method Object List.get(int)>
	//  147  325:checkcast       #267 <Class byte[]>
	//  148  328:invokespecial   #362 <Method Node deserializeNode(byte[])>
	//  149  331:astore          18
					path1 = new Path((String)((List) (arraylist1)).get(i));
	//  150  333:new             #169 <Class Path>
	//  151  336:dup             
	//  152  337:aload           22
	//  153  339:iload_2         
	//  154  340:invokeinterface #323 <Method Object List.get(int)>
	//  155  345:checkcast       #243 <Class String>
	//  156  348:invokespecial   #335 <Method void Path(String)>
	//  157  351:astore          20
					node1 = node;
	//  158  353:aload           18
	//  159  355:astore          19
				}
				if(path1.getBack() != null && path1.getBack().isPriorityChildName())
	//* 160  357:aload           20
	//* 161  359:invokevirtual   #366 <Method ChildKey Path.getBack()>
	//* 162  362:ifnull          391
	//* 163  365:aload           20
	//* 164  367:invokevirtual   #366 <Method ChildKey Path.getBack()>
	//* 165  370:invokevirtual   #371 <Method boolean ChildKey.isPriorityChildName()>
	//* 166  373:ifeq            391
					((Map) (hashmap)).put(((Object) (path1)), ((Object) (node1)));
	//  167  376:aload           23
	//  168  378:aload           20
	//  169  380:aload           19
	//  170  382:invokeinterface #377 <Method Object Map.put(Object, Object)>
	//  171  387:pop             
				else
	//* 172  388:goto            455
				if(path1.contains(path))
	//* 173  391:aload           20
	//* 174  393:aload_1         
	//* 175  394:invokevirtual   #381 <Method boolean Path.contains(Path)>
	//* 176  397:ifeq            427
				{
					Utilities.hardAssert(flag ^ true, "Descendants of path must come after ancestors.");
	//  177  400:iload_3         
	//  178  401:iconst_1        
	//  179  402:ixor            
	//  180  403:ldc2            #383 <String "Descendants of path must come after ancestors.">
	//  181  406:invokestatic    #389 <Method void Utilities.hardAssert(boolean, String)>
					obj = ((Object) (node1.getChild(Path.getRelative(path1, path))));
	//  182  409:aload           19
	//  183  411:aload           20
	//  184  413:aload_1         
	//  185  414:invokestatic    #393 <Method Path Path.getRelative(Path, Path)>
	//  186  417:invokeinterface #398 <Method Node Node.getChild(Path)>
	//  187  422:astore          17
				} else
	//* 188  424:goto            455
				{
					if(!path.contains(path1))
						break;
	//  189  427:aload_1         
	//  190  428:aload           20
	//  191  430:invokevirtual   #381 <Method boolean Path.contains(Path)>
	//  192  433:ifeq            462
					obj = ((Object) (((Node) (obj)).updateChild(Path.getRelative(path, path1), node1)));
	//  193  436:aload           17
	//  194  438:aload_1         
	//  195  439:aload           20
	//  196  441:invokestatic    #393 <Method Path Path.getRelative(Path, Path)>
	//  197  444:aload           19
	//  198  446:invokeinterface #402 <Method Node Node.updateChild(Path, Node)>
	//  199  451:astore          17
					flag = true;
	//  200  453:iconst_1        
	//  201  454:istore_3        
				}
				i++;
	//  202  455:iload_2         
	//  203  456:iconst_1        
	//  204  457:iadd            
	//  205  458:istore_2        
			} while(true);
	//  206  459:goto            137
			throw new IllegalStateException(String.format("Loading an unrelated row with path %s for %s", new Object[] {
				path1, path
			}));
	//  207  462:new             #404 <Class IllegalStateException>
	//  208  465:dup             
	//  209  466:ldc2            #406 <String "Loading an unrelated row with path %s for %s">
	//  210  469:iconst_2        
	//  211  470:anewarray       Object[]
	//  212  473:dup             
	//  213  474:iconst_0        
	//  214  475:aload           20
	//  215  477:aastore         
	//  216  478:dup             
	//  217  479:iconst_1        
	//  218  480:aload_1         
	//  219  481:aastore         
	//  220  482:invokestatic    #410 <Method String String.format(String, Object[])>
	//  221  485:invokespecial   #411 <Method void IllegalStateException(String)>
	//  222  488:athrow          
		}
		for(Iterator iterator = ((Map) (hashmap)).entrySet().iterator(); iterator.hasNext();)
	//* 223  489:aload           23
	//* 224  491:invokeinterface #415 <Method Set Map.entrySet()>
	//* 225  496:invokeinterface #418 <Method Iterator Set.iterator()>
	//* 226  501:astore          18
	//* 227  503:aload           18
	//* 228  505:invokeinterface #210 <Method boolean Iterator.hasNext()>
	//* 229  510:ifeq            561
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//  230  513:aload           18
	//  231  515:invokeinterface #214 <Method Object Iterator.next()>
	//  232  520:checkcast       #420 <Class java.util.Map$Entry>
	//  233  523:astore          19
			obj = ((Object) (((Node) (obj)).updateChild(Path.getRelative(path, (Path)entry.getKey()), (Node)entry.getValue())));
	//  234  525:aload           17
	//  235  527:aload_1         
	//  236  528:aload           19
	//  237  530:invokeinterface #423 <Method Object java.util.Map$Entry.getKey()>
	//  238  535:checkcast       #169 <Class Path>
	//  239  538:invokestatic    #393 <Method Path Path.getRelative(Path, Path)>
	//  240  541:aload           19
	//  241  543:invokeinterface #426 <Method Object java.util.Map$Entry.getValue()>
	//  242  548:checkcast       #395 <Class Node>
	//  243  551:invokeinterface #402 <Method Node Node.updateChild(Path, Node)>
	//  244  556:astore          17
		}

	//* 245  558:goto            503
		long l4 = System.currentTimeMillis();
	//  246  561:invokestatic    #282 <Method long System.currentTimeMillis()>
	//  247  564:lstore          13
		long l5 = System.currentTimeMillis();
	//  248  566:invokestatic    #282 <Method long System.currentTimeMillis()>
	//  249  569:lstore          15
		if(logger.logsDebug())
	//* 250  571:aload_0         
	//* 251  572:getfield        #153 <Field LogWrapper logger>
	//* 252  575:invokevirtual   #344 <Method boolean LogWrapper.logsDebug()>
	//* 253  578:ifeq            669
			logger.debug(String.format("Loaded a total of %d rows for a total of %d nodes at %s in %dms (Query: %dms, Loading: %dms, Serializing: %dms)", new Object[] {
				Integer.valueOf(((List) (arraylist)).size()), Integer.valueOf(NodeSizeEstimator.nodeCount(((Node) (obj)))), path, Long.valueOf(l5 - l1), Long.valueOf(l2 - l1), Long.valueOf(l), Long.valueOf(l4 - l3)
			}));
	//  254  581:aload_0         
	//  255  582:getfield        #153 <Field LogWrapper logger>
	//  256  585:ldc2            #428 <String "Loaded a total of %d rows for a total of %d nodes at %s in %dms (Query: %dms, Loading: %dms, Serializing: %dms)">
	//  257  588:bipush          7
	//  258  590:anewarray       Object[]
	//  259  593:dup             
	//  260  594:iconst_0        
	//  261  595:aload           21
	//  262  597:invokeinterface #319 <Method int List.size()>
	//  263  602:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//  264  605:aastore         
	//  265  606:dup             
	//  266  607:iconst_1        
	//  267  608:aload           17
	//  268  610:invokestatic    #440 <Method int NodeSizeEstimator.nodeCount(Node)>
	//  269  613:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//  270  616:aastore         
	//  271  617:dup             
	//  272  618:iconst_2        
	//  273  619:aload_1         
	//  274  620:aastore         
	//  275  621:dup             
	//  276  622:iconst_3        
	//  277  623:lload           15
	//  278  625:lload           7
	//  279  627:lsub            
	//  280  628:invokestatic    #443 <Method Long Long.valueOf(long)>
	//  281  631:aastore         
	//  282  632:dup             
	//  283  633:iconst_4        
	//  284  634:lload           9
	//  285  636:lload           7
	//  286  638:lsub            
	//  287  639:invokestatic    #443 <Method Long Long.valueOf(long)>
	//  288  642:aastore         
	//  289  643:dup             
	//  290  644:iconst_5        
	//  291  645:lload           5
	//  292  647:invokestatic    #443 <Method Long Long.valueOf(long)>
	//  293  650:aastore         
	//  294  651:dup             
	//  295  652:bipush          6
	//  296  654:lload           13
	//  297  656:lload           11
	//  298  658:lsub            
	//  299  659:invokestatic    #443 <Method Long Long.valueOf(long)>
	//  300  662:aastore         
	//  301  663:invokestatic    #410 <Method String String.format(String, Object[])>
	//  302  666:invokevirtual   #354 <Method void LogWrapper.debug(String)>
		return ((Node) (obj));
	//  303  669:aload           17
	//  304  671:areturn         
		path;
	//  305  672:astore_1        
		((Cursor) (obj)).close();
	//  306  673:aload           17
	//  307  675:invokeinterface #306 <Method void Cursor.close()>
		throw path;
	//  308  680:aload_1         
	//  309  681:athrow          
	}

	private Cursor loadNestedQuery(Path path, String as[])
	{
		String s = pathToKey(path);
	//    0    0:aload_1         
	//    1    1:invokestatic    #183 <Method String pathToKey(Path)>
	//    2    4:astore          4
		String s1 = pathPrefixStartToPrefixEnd(s);
	//    3    6:aload           4
	//    4    8:invokestatic    #447 <Method String pathPrefixStartToPrefixEnd(String)>
	//    5   11:astore          5
		String as1[] = new String[path.size() + 3];
	//    6   13:aload_1         
	//    7   14:invokevirtual   #448 <Method int Path.size()>
	//    8   17:iconst_3        
	//    9   18:iadd            
	//   10   19:anewarray       String[]
	//   11   22:astore_3        
		String s2 = buildAncestorWhereClause(path, as1);
	//   12   23:aload_1         
	//   13   24:aload_3         
	//   14   25:invokestatic    #450 <Method String buildAncestorWhereClause(Path, String[])>
	//   15   28:astore          6
		StringBuilder stringbuilder = new StringBuilder();
	//   16   30:new             #162 <Class StringBuilder>
	//   17   33:dup             
	//   18   34:invokespecial   #199 <Method void StringBuilder()>
	//   19   37:astore          7
		stringbuilder.append(s2);
	//   20   39:aload           7
	//   21   41:aload           6
	//   22   43:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
		stringbuilder.append(" OR (path > ? AND path < ?)");
	//   24   47:aload           7
	//   25   49:ldc2            #452 <String " OR (path > ? AND path < ?)">
	//   26   52:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   27   55:pop             
		s2 = stringbuilder.toString();
	//   28   56:aload           7
	//   29   58:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   30   61:astore          6
		as1[path.size() + 1] = s;
	//   31   63:aload_3         
	//   32   64:aload_1         
	//   33   65:invokevirtual   #448 <Method int Path.size()>
	//   34   68:iconst_1        
	//   35   69:iadd            
	//   36   70:aload           4
	//   37   72:aastore         
		as1[path.size() + 2] = s1;
	//   38   73:aload_3         
	//   39   74:aload_1         
	//   40   75:invokevirtual   #448 <Method int Path.size()>
	//   41   78:iconst_2        
	//   42   79:iadd            
	//   43   80:aload           5
	//   44   82:aastore         
		path = ((Path) (database));
	//   45   83:aload_0         
	//   46   84:getfield        #140 <Field SQLiteDatabase database>
	//   47   87:astore_1        
		if(!(path instanceof SQLiteDatabase))
	//*  48   88:aload_1         
	//*  49   89:instanceof      #454 <Class SQLiteDatabase>
	//*  50   92:ifne            110
			return ((SQLiteDatabase) (path)).query("serverCache", as, s2, as1, ((String) (null)), ((String) (null)), "path");
	//   51   95:aload_1         
	//   52   96:ldc1            #44  <String "serverCache">
	//   53   98:aload_2         
	//   54   99:aload           6
	//   55  101:aload_3         
	//   56  102:aconst_null     
	//   57  103:aconst_null     
	//   58  104:ldc1            #36  <String "path">
	//   59  106:invokevirtual   #458 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   60  109:areturn         
		else
			return SQLiteInstrumentation.query((SQLiteDatabase)path, "serverCache", as, s2, as1, ((String) (null)), ((String) (null)), "path");
	//   61  110:aload_1         
	//   62  111:checkcast       #454 <Class SQLiteDatabase>
	//   63  114:ldc1            #44  <String "serverCache">
	//   64  116:aload_2         
	//   65  117:aload           6
	//   66  119:aload_3         
	//   67  120:aconst_null     
	//   68  121:aconst_null     
	//   69  122:ldc1            #36  <String "path">
	//   70  124:invokestatic    #463 <Method Cursor SQLiteInstrumentation.query(SQLiteDatabase, String, String[], String, String[], String, String, String)>
	//   71  127:areturn         
	}

	private String partKey(Path path, int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #162 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #199 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(pathToKey(path));
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokestatic    #183 <Method String pathToKey(Path)>
	//    7   13:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(String.format(".part-%04d", new Object[] {
			Integer.valueOf(i)
		}));
	//    9   17:aload_3         
	//   10   18:ldc1            #30  <String ".part-%04d">
	//   11   20:iconst_1        
	//   12   21:anewarray       Object[]
	//   13   24:dup             
	//   14   25:iconst_0        
	//   15   26:iload_2         
	//   16   27:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//   17   30:aastore         
	//   18   31:invokestatic    #410 <Method String String.format(String, Object[])>
	//   19   34:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		return stringbuilder.toString();
	//   21   38:aload_3         
	//   22   39:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   23   42:areturn         
	}

	private static String pathPrefixStartToPrefixEnd(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #162 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #199 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(s.substring(0, s.length() - 1));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:aload_0         
	//    8   12:invokevirtual   #330 <Method int String.length()>
	//    9   15:iconst_1        
	//   10   16:isub            
	//   11   17:invokevirtual   #334 <Method String String.substring(int, int)>
	//   12   20:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   13   23:pop             
		stringbuilder.append('0');
	//   14   24:aload_1         
	//   15   25:bipush          48
	//   16   27:invokevirtual   #468 <Method StringBuilder StringBuilder.append(char)>
	//   17   30:pop             
		return stringbuilder.toString();
	//   18   31:aload_1         
	//   19   32:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   20   35:areturn         
	}

	private static String pathToKey(Path path)
	{
		if(path.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #173 <Method boolean Path.isEmpty()>
	//*   2    4:ifeq            11
		{
			return "/";
	//    3    7:ldc2            #470 <String "/">
	//    4   10:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #162 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #199 <Method void StringBuilder()>
	//    8   18:astore_1        
			stringbuilder.append(path.toString());
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokevirtual   #471 <Method String Path.toString()>
	//   12   24:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
			stringbuilder.append("/");
	//   14   28:aload_1         
	//   15   29:ldc2            #470 <String "/">
	//   16   32:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			return stringbuilder.toString();
	//   18   36:aload_1         
	//   19   37:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   20   40:areturn         
		}
	}

	private void pruneTreeRecursive(Path path, final Path relativePath, ImmutableTree immutabletree, final ImmutableTree rowIdsToKeep, PruneForest pruneforest, final List rowsToResaveAccumulator)
	{
		if(immutabletree.getValue() != null)
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #476 <Method Object ImmutableTree.getValue()>
	//*   2    4:ifnull          110
		{
			int i = ((Integer)pruneforest.foldKeptNodes(((Object) (Integer.valueOf(0))), new com.firebase.client.core.utilities.ImmutableTree.TreeVisitor() {

				public Integer onNodeValue(Path path1, Void void1, Integer integer)
				{
					int j;
					if(rowIdsToKeep.get(path1) == null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #22  <Field ImmutableTree val$rowIdsToKeep>
				//*   2    4:aload_1         
				//*   3    5:invokevirtual   #34  <Method Object ImmutableTree.get(Path)>
				//*   4    8:ifnonnull       22
						j = integer.intValue() + 1;
				//    5   11:aload_3         
				//    6   12:invokevirtual   #40  <Method int Integer.intValue()>
				//    7   15:iconst_1        
				//    8   16:iadd            
				//    9   17:istore          4
					else
				//*  10   19:goto            28
						j = integer.intValue();
				//   11   22:aload_3         
				//   12   23:invokevirtual   #40  <Method int Integer.intValue()>
				//   13   26:istore          4
					return Integer.valueOf(j);
				//   14   28:iload           4
				//   15   30:invokestatic    #44  <Method Integer Integer.valueOf(int)>
				//   16   33:areturn         
				}

				public volatile Object onNodeValue(Path path1, Object obj, Object obj1)
				{
					return ((Object) (onNodeValue(path1, (Void)obj, (Integer)obj1)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:aload_2         
				//    3    3:checkcast       #47  <Class Void>
				//    4    6:aload_3         
				//    5    7:checkcast       #36  <Class Integer>
				//    6   10:invokevirtual   #49  <Method Integer onNodeValue(Path, Void, Integer)>
				//    7   13:areturn         
				}

				final SqlPersistenceStorageEngine this$0;
				final ImmutableTree val$rowIdsToKeep;

			
			{
				this$0 = SqlPersistenceStorageEngine.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field SqlPersistenceStorageEngine this$0>
				rowIdsToKeep = immutabletree;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field ImmutableTree val$rowIdsToKeep>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
			}
)).intValue();
	//    3    7:aload           5
	//    4    9:iconst_0        
	//    5   10:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//    6   13:new             #8   <Class SqlPersistenceStorageEngine$1>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:aload           4
	//   10   20:invokespecial   #479 <Method void SqlPersistenceStorageEngine$1(SqlPersistenceStorageEngine, ImmutableTree)>
	//   11   23:invokevirtual   #485 <Method Object PruneForest.foldKeptNodes(Object, com.firebase.client.core.utilities.ImmutableTree$TreeVisitor)>
	//   12   26:checkcast       #430 <Class Integer>
	//   13   29:invokevirtual   #488 <Method int Integer.intValue()>
	//   14   32:istore          7
			if(i > 0)
	//*  15   34:iload           7
	//*  16   36:ifle            202
			{
				path = path.child(relativePath);
	//   17   39:aload_1         
	//   18   40:aload_2         
	//   19   41:invokevirtual   #492 <Method Path Path.child(Path)>
	//   20   44:astore_1        
				if(logger.logsDebug())
	//*  21   45:aload_0         
	//*  22   46:getfield        #153 <Field LogWrapper logger>
	//*  23   49:invokevirtual   #344 <Method boolean LogWrapper.logsDebug()>
	//*  24   52:ifeq            84
					logger.debug(String.format("Need to rewrite %d nodes below path %s", new Object[] {
						Integer.valueOf(i), path
					}));
	//   25   55:aload_0         
	//   26   56:getfield        #153 <Field LogWrapper logger>
	//   27   59:ldc2            #494 <String "Need to rewrite %d nodes below path %s">
	//   28   62:iconst_2        
	//   29   63:anewarray       Object[]
	//   30   66:dup             
	//   31   67:iconst_0        
	//   32   68:iload           7
	//   33   70:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//   34   73:aastore         
	//   35   74:dup             
	//   36   75:iconst_1        
	//   37   76:aload_1         
	//   38   77:aastore         
	//   39   78:invokestatic    #410 <Method String String.format(String, Object[])>
	//   40   81:invokevirtual   #354 <Method void LogWrapper.debug(String)>
				pruneforest.foldKeptNodes(((Object) (null)), new com.firebase.client.core.utilities.ImmutableTree.TreeVisitor() {

					public volatile Object onNodeValue(Path path1, Object obj, Object obj1)
					{
						return ((Object) (onNodeValue(path1, (Void)obj, (Void)obj1)));
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:aload_2         
					//    3    3:checkcast       #42  <Class Void>
					//    4    6:aload_3         
					//    5    7:checkcast       #42  <Class Void>
					//    6   10:invokevirtual   #45  <Method Void onNodeValue(Path, Void, Void)>
					//    7   13:areturn         
					}

					public Void onNodeValue(Path path1, Void void1, Void void2)
					{
						if(rowIdsToKeep.get(path1) == null)
					//*   0    0:aload_0         
					//*   1    1:getfield        #28  <Field ImmutableTree val$rowIdsToKeep>
					//*   2    4:aload_1         
					//*   3    5:invokevirtual   #51  <Method Object ImmutableTree.get(Path)>
					//*   4    8:ifnonnull       46
							rowsToResaveAccumulator.add(((Object) (new Pair(((Object) (relativePath.child(path1))), ((Object) (currentNode.getChild(path1)))))));
					//    5   11:aload_0         
					//    6   12:getfield        #30  <Field List val$rowsToResaveAccumulator>
					//    7   15:new             #53  <Class Pair>
					//    8   18:dup             
					//    9   19:aload_0         
					//   10   20:getfield        #32  <Field Path val$relativePath>
					//   11   23:aload_1         
					//   12   24:invokevirtual   #59  <Method Path Path.child(Path)>
					//   13   27:aload_0         
					//   14   28:getfield        #34  <Field Node val$currentNode>
					//   15   31:aload_1         
					//   16   32:invokeinterface #65  <Method Node Node.getChild(Path)>
					//   17   37:invokespecial   #68  <Method void Pair(Object, Object)>
					//   18   40:invokeinterface #74  <Method boolean List.add(Object)>
					//   19   45:pop             
						return null;
					//   20   46:aconst_null     
					//   21   47:areturn         
					}

					final SqlPersistenceStorageEngine this$0;
					final Node val$currentNode;
					final Path val$relativePath;
					final ImmutableTree val$rowIdsToKeep;
					final List val$rowsToResaveAccumulator;

			
			{
				this$0 = SqlPersistenceStorageEngine.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field SqlPersistenceStorageEngine this$0>
				rowIdsToKeep = immutabletree;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field ImmutableTree val$rowIdsToKeep>
				rowsToResaveAccumulator = list;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field List val$rowsToResaveAccumulator>
				relativePath = path;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field Path val$relativePath>
				currentNode = node;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #34  <Field Node val$currentNode>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #37  <Method void Object()>
			//   17   31:return          
			}
				}
);
	//   41   84:aload           5
	//   42   86:aconst_null     
	//   43   87:new             #10  <Class SqlPersistenceStorageEngine$2>
	//   44   90:dup             
	//   45   91:aload_0         
	//   46   92:aload           4
	//   47   94:aload           6
	//   48   96:aload_2         
	//   49   97:aload_0         
	//   50   98:aload_1         
	//   51   99:invokespecial   #496 <Method Node loadNested(Path)>
	//   52  102:invokespecial   #499 <Method void SqlPersistenceStorageEngine$2(SqlPersistenceStorageEngine, ImmutableTree, List, Path, Node)>
	//   53  105:invokevirtual   #485 <Method Object PruneForest.foldKeptNodes(Object, com.firebase.client.core.utilities.ImmutableTree$TreeVisitor)>
	//   54  108:pop             
				return;
	//   55  109:return          
			}
		} else
		{
			java.util.Map.Entry entry;
			ChildKey childkey;
			PruneForest pruneforest1;
			for(immutabletree = ((ImmutableTree) (immutabletree.getChildren().iterator())); ((Iterator) (immutabletree)).hasNext(); pruneTreeRecursive(path, relativePath.child(childkey), (ImmutableTree)entry.getValue(), rowIdsToKeep.getChild(childkey), pruneforest1, rowsToResaveAccumulator))
	//*  56  110:aload_3         
	//*  57  111:invokevirtual   #503 <Method ImmutableSortedMap ImmutableTree.getChildren()>
	//*  58  114:invokevirtual   #506 <Method Iterator ImmutableSortedMap.iterator()>
	//*  59  117:astore_3        
	//*  60  118:aload_3         
	//*  61  119:invokeinterface #210 <Method boolean Iterator.hasNext()>
	//*  62  124:ifeq            202
			{
				entry = (java.util.Map.Entry)((Iterator) (immutabletree)).next();
	//   63  127:aload_3         
	//   64  128:invokeinterface #214 <Method Object Iterator.next()>
	//   65  133:checkcast       #420 <Class java.util.Map$Entry>
	//   66  136:astore          8
				childkey = (ChildKey)entry.getKey();
	//   67  138:aload           8
	//   68  140:invokeinterface #423 <Method Object java.util.Map$Entry.getKey()>
	//   69  145:checkcast       #368 <Class ChildKey>
	//   70  148:astore          9
				pruneforest1 = pruneforest.child((ChildKey)entry.getKey());
	//   71  150:aload           5
	//   72  152:aload           8
	//   73  154:invokeinterface #423 <Method Object java.util.Map$Entry.getKey()>
	//   74  159:checkcast       #368 <Class ChildKey>
	//   75  162:invokevirtual   #509 <Method PruneForest PruneForest.child(ChildKey)>
	//   76  165:astore          10
			}

	//   77  167:aload_0         
	//   78  168:aload_1         
	//   79  169:aload_2         
	//   80  170:aload           9
	//   81  172:invokevirtual   #512 <Method Path Path.child(ChildKey)>
	//   82  175:aload           8
	//   83  177:invokeinterface #426 <Method Object java.util.Map$Entry.getValue()>
	//   84  182:checkcast       #475 <Class ImmutableTree>
	//   85  185:aload           4
	//   86  187:aload           9
	//   87  189:invokevirtual   #515 <Method ImmutableTree ImmutableTree.getChild(ChildKey)>
	//   88  192:aload           10
	//   89  194:aload           6
	//   90  196:invokespecial   #517 <Method void pruneTreeRecursive(Path, Path, ImmutableTree, ImmutableTree, PruneForest, List)>
		}
	//*  91  199:goto            118
	//   92  202:return          
	}

	private int removeNested(String s, Path path)
	{
		path = ((Path) (pathToKey(path)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #183 <Method String pathToKey(Path)>
	//    2    4:astore_2        
		String s1 = pathPrefixStartToPrefixEnd(((String) (path)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #447 <Method String pathPrefixStartToPrefixEnd(String)>
	//    5    9:astore_3        
		SQLiteDatabase sqlitedatabase = database;
	//    6   10:aload_0         
	//    7   11:getfield        #140 <Field SQLiteDatabase database>
	//    8   14:astore          4
		String as[] = new String[2];
	//    9   16:iconst_2        
	//   10   17:anewarray       String[]
	//   11   20:astore          5
		as[0] = ((String) (path));
	//   12   22:aload           5
	//   13   24:iconst_0        
	//   14   25:aload_2         
	//   15   26:aastore         
		as[1] = s1;
	//   16   27:aload           5
	//   17   29:iconst_1        
	//   18   30:aload_3         
	//   19   31:aastore         
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*  20   32:aload           4
	//*  21   34:instanceof      #454 <Class SQLiteDatabase>
	//*  22   37:ifne            52
			return sqlitedatabase.delete(s, "path >= ? AND path < ?", as);
	//   23   40:aload           4
	//   24   42:aload_1         
	//   25   43:ldc2            #522 <String "path >= ? AND path < ?">
	//   26   46:aload           5
	//   27   48:invokevirtual   #526 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   28   51:ireturn         
		else
			return SQLiteInstrumentation.delete((SQLiteDatabase)sqlitedatabase, s, "path >= ? AND path < ?", as);
	//   29   52:aload           4
	//   30   54:checkcast       #454 <Class SQLiteDatabase>
	//   31   57:aload_1         
	//   32   58:ldc2            #522 <String "path >= ? AND path < ?">
	//   33   61:aload           5
	//   34   63:invokestatic    #529 <Method int SQLiteInstrumentation.delete(SQLiteDatabase, String, String, String[])>
	//   35   66:ireturn         
	}

	private int saveNested(Path path, Node node)
	{
		long l = NodeSizeEstimator.estimateSerializedNodeSize(node);
	//    0    0:aload_2         
	//    1    1:invokestatic    #535 <Method long NodeSizeEstimator.estimateSerializedNodeSize(Node)>
	//    2    4:lstore          5
		if((node instanceof ChildrenNode) && l > 16384L)
	//*   3    6:aload_2         
	//*   4    7:instanceof      #537 <Class ChildrenNode>
	//*   5   10:ifeq            182
	//*   6   13:lload           5
	//*   7   15:ldc2w           #538 <Long 16384L>
	//*   8   18:lcmp            
	//*   9   19:ifle            182
		{
			boolean flag = logger.logsDebug();
	//   10   22:aload_0         
	//   11   23:getfield        #153 <Field LogWrapper logger>
	//   12   26:invokevirtual   #344 <Method boolean LogWrapper.logsDebug()>
	//   13   29:istore          7
			int i = 0;
	//   14   31:iconst_0        
	//   15   32:istore_3        
			if(flag)
	//*  16   33:iload           7
	//*  17   35:ifeq            76
				logger.debug(String.format("Node estimated serialized size at path %s of %d bytes exceeds limit of %d bytes. Splitting up.", new Object[] {
					path, Long.valueOf(l), Integer.valueOf(16384)
				}));
	//   18   38:aload_0         
	//   19   39:getfield        #153 <Field LogWrapper logger>
	//   20   42:ldc2            #541 <String "Node estimated serialized size at path %s of %d bytes exceeds limit of %d bytes. Splitting up.">
	//   21   45:iconst_3        
	//   22   46:anewarray       Object[]
	//   23   49:dup             
	//   24   50:iconst_0        
	//   25   51:aload_1         
	//   26   52:aastore         
	//   27   53:dup             
	//   28   54:iconst_1        
	//   29   55:lload           5
	//   30   57:invokestatic    #443 <Method Long Long.valueOf(long)>
	//   31   60:aastore         
	//   32   61:dup             
	//   33   62:iconst_2        
	//   34   63:sipush          16384
	//   35   66:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//   36   69:aastore         
	//   37   70:invokestatic    #410 <Method String String.format(String, Object[])>
	//   38   73:invokevirtual   #354 <Method void LogWrapper.debug(String)>
			for(Iterator iterator = node.iterator(); iterator.hasNext();)
	//*  39   76:aload_2         
	//*  40   77:invokeinterface #542 <Method Iterator Node.iterator()>
	//*  41   82:astore          8
	//*  42   84:aload           8
	//*  43   86:invokeinterface #210 <Method boolean Iterator.hasNext()>
	//*  44   91:ifeq            130
			{
				NamedNode namednode = (NamedNode)iterator.next();
	//   45   94:aload           8
	//   46   96:invokeinterface #214 <Method Object Iterator.next()>
	//   47  101:checkcast       #544 <Class NamedNode>
	//   48  104:astore          9
				i += saveNested(path.child(namednode.getName()), namednode.getNode());
	//   49  106:iload_3         
	//   50  107:aload_0         
	//   51  108:aload_1         
	//   52  109:aload           9
	//   53  111:invokevirtual   #547 <Method ChildKey NamedNode.getName()>
	//   54  114:invokevirtual   #512 <Method Path Path.child(ChildKey)>
	//   55  117:aload           9
	//   56  119:invokevirtual   #551 <Method Node NamedNode.getNode()>
	//   57  122:invokespecial   #553 <Method int saveNested(Path, Node)>
	//   58  125:iadd            
	//   59  126:istore_3        
			}

	//*  60  127:goto            84
			int j = i;
	//   61  130:iload_3         
	//   62  131:istore          4
			if(!node.getPriority().isEmpty())
	//*  63  133:aload_2         
	//*  64  134:invokeinterface #556 <Method Node Node.getPriority()>
	//*  65  139:invokeinterface #557 <Method boolean Node.isEmpty()>
	//*  66  144:ifne            169
			{
				saveNode(path.child(ChildKey.getPriorityKey()), node.getPriority());
	//   67  147:aload_0         
	//   68  148:aload_1         
	//   69  149:invokestatic    #560 <Method ChildKey ChildKey.getPriorityKey()>
	//   70  152:invokevirtual   #512 <Method Path Path.child(ChildKey)>
	//   71  155:aload_2         
	//   72  156:invokeinterface #556 <Method Node Node.getPriority()>
	//   73  161:invokespecial   #564 <Method void saveNode(Path, Node)>
				j = i + 1;
	//   74  164:iload_3         
	//   75  165:iconst_1        
	//   76  166:iadd            
	//   77  167:istore          4
			}
			saveNode(path, ((Node) (EmptyNode.Empty())));
	//   78  169:aload_0         
	//   79  170:aload_1         
	//   80  171:invokestatic    #312 <Method EmptyNode EmptyNode.Empty()>
	//   81  174:invokespecial   #564 <Method void saveNode(Path, Node)>
			return j + 1;
	//   82  177:iload           4
	//   83  179:iconst_1        
	//   84  180:iadd            
	//   85  181:ireturn         
		} else
		{
			saveNode(path, node);
	//   86  182:aload_0         
	//   87  183:aload_1         
	//   88  184:aload_2         
	//   89  185:invokespecial   #564 <Method void saveNode(Path, Node)>
			return 1;
	//   90  188:iconst_1        
	//   91  189:ireturn         
		}
	}

	private void saveNode(Path path, Node node)
	{
		byte abyte0[] = serializeObject(node.getValue(true));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:iconst_1        
	//    3    3:invokeinterface #567 <Method Object Node.getValue(boolean)>
	//    4    8:invokespecial   #571 <Method byte[] serializeObject(Object)>
	//    5   11:astore          4
		if(abyte0.length >= 0x40000)
	//*   6   13:aload           4
	//*   7   15:arraylength     
	//*   8   16:ldc1            #41  <Int 0x40000>
	//*   9   18:icmplt          196
		{
			node = ((Node) (splitBytes(abyte0, 0x40000)));
	//   10   21:aload           4
	//   11   23:ldc1            #41  <Int 0x40000>
	//   12   25:invokestatic    #575 <Method List splitBytes(byte[], int)>
	//   13   28:astore_2        
			if(logger.logsDebug())
	//*  14   29:aload_0         
	//*  15   30:getfield        #153 <Field LogWrapper logger>
	//*  16   33:invokevirtual   #344 <Method boolean LogWrapper.logsDebug()>
	//*  17   36:ifeq            94
			{
				abyte0 = ((byte []) (logger));
	//   18   39:aload_0         
	//   19   40:getfield        #153 <Field LogWrapper logger>
	//   20   43:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   21   45:new             #162 <Class StringBuilder>
	//   22   48:dup             
	//   23   49:invokespecial   #199 <Method void StringBuilder()>
	//   24   52:astore          5
				stringbuilder.append("Saving huge leaf node with ");
	//   25   54:aload           5
	//   26   56:ldc2            #577 <String "Saving huge leaf node with ">
	//   27   59:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   28   62:pop             
				stringbuilder.append(((List) (node)).size());
	//   29   63:aload           5
	//   30   65:aload_2         
	//   31   66:invokeinterface #319 <Method int List.size()>
	//   32   71:invokevirtual   #349 <Method StringBuilder StringBuilder.append(int)>
	//   33   74:pop             
				stringbuilder.append(" parts.");
	//   34   75:aload           5
	//   35   77:ldc2            #351 <String " parts.">
	//   36   80:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   37   83:pop             
				((LogWrapper) (abyte0)).debug(stringbuilder.toString());
	//   38   84:aload           4
	//   39   86:aload           5
	//   40   88:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   41   91:invokevirtual   #354 <Method void LogWrapper.debug(String)>
			}
			for(int i = 0; i < ((List) (node)).size(); i++)
	//*  42   94:iconst_0        
	//*  43   95:istore_3        
	//*  44   96:iload_3         
	//*  45   97:aload_2         
	//*  46   98:invokeinterface #319 <Method int List.size()>
	//*  47  103:icmpge          258
			{
				abyte0 = ((byte []) (new ContentValues()));
	//   48  106:new             #579 <Class ContentValues>
	//   49  109:dup             
	//   50  110:invokespecial   #580 <Method void ContentValues()>
	//   51  113:astore          4
				((ContentValues) (abyte0)).put("path", partKey(path, i));
	//   52  115:aload           4
	//   53  117:ldc1            #36  <String "path">
	//   54  119:aload_0         
	//   55  120:aload_1         
	//   56  121:iload_3         
	//   57  122:invokespecial   #582 <Method String partKey(Path, int)>
	//   58  125:invokevirtual   #585 <Method void ContentValues.put(String, String)>
				((ContentValues) (abyte0)).put("value", (byte[])((List) (node)).get(i));
	//   59  128:aload           4
	//   60  130:ldc1            #73  <String "value">
	//   61  132:aload_2         
	//   62  133:iload_3         
	//   63  134:invokeinterface #323 <Method Object List.get(int)>
	//   64  139:checkcast       #267 <Class byte[]>
	//   65  142:invokevirtual   #588 <Method void ContentValues.put(String, byte[])>
				SQLiteDatabase sqlitedatabase = database;
	//   66  145:aload_0         
	//   67  146:getfield        #140 <Field SQLiteDatabase database>
	//   68  149:astore          5
				if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*  69  151:aload           5
	//*  70  153:instanceof      #454 <Class SQLiteDatabase>
	//*  71  156:ifne            174
					sqlitedatabase.insertWithOnConflict("serverCache", ((String) (null)), ((ContentValues) (abyte0)), 5);
	//   72  159:aload           5
	//   73  161:ldc1            #44  <String "serverCache">
	//   74  163:aconst_null     
	//   75  164:aload           4
	//   76  166:iconst_5        
	//   77  167:invokevirtual   #592 <Method long SQLiteDatabase.insertWithOnConflict(String, String, ContentValues, int)>
	//   78  170:pop2            
				else
	//*  79  171:goto            189
					SQLiteInstrumentation.insertWithOnConflict((SQLiteDatabase)sqlitedatabase, "serverCache", ((String) (null)), ((ContentValues) (abyte0)), 5);
	//   80  174:aload           5
	//   81  176:checkcast       #454 <Class SQLiteDatabase>
	//   82  179:ldc1            #44  <String "serverCache">
	//   83  181:aconst_null     
	//   84  182:aload           4
	//   85  184:iconst_5        
	//   86  185:invokestatic    #595 <Method long SQLiteInstrumentation.insertWithOnConflict(SQLiteDatabase, String, String, ContentValues, int)>
	//   87  188:pop2            
			}

	//   88  189:iload_3         
	//   89  190:iconst_1        
	//   90  191:iadd            
	//   91  192:istore_3        
		} else
	//*  92  193:goto            96
		{
			node = ((Node) (new ContentValues()));
	//   93  196:new             #579 <Class ContentValues>
	//   94  199:dup             
	//   95  200:invokespecial   #580 <Method void ContentValues()>
	//   96  203:astore_2        
			((ContentValues) (node)).put("path", pathToKey(path));
	//   97  204:aload_2         
	//   98  205:ldc1            #36  <String "path">
	//   99  207:aload_1         
	//  100  208:invokestatic    #183 <Method String pathToKey(Path)>
	//  101  211:invokevirtual   #585 <Method void ContentValues.put(String, String)>
			((ContentValues) (node)).put("value", abyte0);
	//  102  214:aload_2         
	//  103  215:ldc1            #73  <String "value">
	//  104  217:aload           4
	//  105  219:invokevirtual   #588 <Method void ContentValues.put(String, byte[])>
			path = ((Path) (database));
	//  106  222:aload_0         
	//  107  223:getfield        #140 <Field SQLiteDatabase database>
	//  108  226:astore_1        
			if(!(path instanceof SQLiteDatabase))
	//* 109  227:aload_1         
	//* 110  228:instanceof      #454 <Class SQLiteDatabase>
	//* 111  231:ifne            245
			{
				((SQLiteDatabase) (path)).insertWithOnConflict("serverCache", ((String) (null)), ((ContentValues) (node)), 5);
	//  112  234:aload_1         
	//  113  235:ldc1            #44  <String "serverCache">
	//  114  237:aconst_null     
	//  115  238:aload_2         
	//  116  239:iconst_5        
	//  117  240:invokevirtual   #592 <Method long SQLiteDatabase.insertWithOnConflict(String, String, ContentValues, int)>
	//  118  243:pop2            
				return;
	//  119  244:return          
			}
			SQLiteInstrumentation.insertWithOnConflict((SQLiteDatabase)path, "serverCache", ((String) (null)), ((ContentValues) (node)), 5);
	//  120  245:aload_1         
	//  121  246:checkcast       #454 <Class SQLiteDatabase>
	//  122  249:ldc1            #44  <String "serverCache">
	//  123  251:aconst_null     
	//  124  252:aload_2         
	//  125  253:iconst_5        
	//  126  254:invokestatic    #595 <Method long SQLiteInstrumentation.insertWithOnConflict(SQLiteDatabase, String, String, ContentValues, int)>
	//  127  257:pop2            
		}
	//  128  258:return          
	}

	private void saveWrite(Path path, long l, String s, byte abyte0[])
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #600 <Method void verifyInsideTransaction()>
		SQLiteDatabase sqlitedatabase = database;
	//    2    4:aload_0         
	//    3    5:getfield        #140 <Field SQLiteDatabase database>
	//    4    8:astore          7
		String as[] = new String[1];
	//    5   10:iconst_1        
	//    6   11:anewarray       String[]
	//    7   14:astore          8
		int i = 0;
	//    8   16:iconst_0        
	//    9   17:istore          6
		as[0] = String.valueOf(l);
	//   10   19:aload           8
	//   11   21:iconst_0        
	//   12   22:lload_2         
	//   13   23:invokestatic    #603 <Method String String.valueOf(long)>
	//   14   26:aastore         
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*  15   27:aload           7
	//*  16   29:instanceof      #454 <Class SQLiteDatabase>
	//*  17   32:ifne            51
			sqlitedatabase.delete("writes", "id = ?", as);
	//   18   35:aload           7
	//   19   37:ldc1            #76  <String "writes">
	//   20   39:ldc2            #605 <String "id = ?">
	//   21   42:aload           8
	//   22   44:invokevirtual   #526 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   23   47:pop             
		else
	//*  24   48:goto            67
			SQLiteInstrumentation.delete((SQLiteDatabase)sqlitedatabase, "writes", "id = ?", as);
	//   25   51:aload           7
	//   26   53:checkcast       #454 <Class SQLiteDatabase>
	//   27   56:ldc1            #76  <String "writes">
	//   28   58:ldc2            #605 <String "id = ?">
	//   29   61:aload           8
	//   30   63:invokestatic    #529 <Method int SQLiteInstrumentation.delete(SQLiteDatabase, String, String, String[])>
	//   31   66:pop             
		if(abyte0.length >= 0x40000)
	//*  32   67:aload           5
	//*  33   69:arraylength     
	//*  34   70:ldc1            #41  <Int 0x40000>
	//*  35   72:icmplt          220
		{
			for(abyte0 = ((byte []) (splitBytes(abyte0, 0x40000))); i < ((List) (abyte0)).size(); i++)
	//*  36   75:aload           5
	//*  37   77:ldc1            #41  <Int 0x40000>
	//*  38   79:invokestatic    #575 <Method List splitBytes(byte[], int)>
	//*  39   82:astore          5
	//*  40   84:iload           6
	//*  41   86:aload           5
	//*  42   88:invokeinterface #319 <Method int List.size()>
	//*  43   93:icmpge          318
			{
				ContentValues contentvalues = new ContentValues();
	//   44   96:new             #579 <Class ContentValues>
	//   45   99:dup             
	//   46  100:invokespecial   #580 <Method void ContentValues()>
	//   47  103:astore          7
				contentvalues.put("id", Long.valueOf(l));
	//   48  105:aload           7
	//   49  107:ldc1            #47  <String "id">
	//   50  109:lload_2         
	//   51  110:invokestatic    #443 <Method Long Long.valueOf(long)>
	//   52  113:invokevirtual   #608 <Method void ContentValues.put(String, Long)>
				contentvalues.put("path", pathToKey(path));
	//   53  116:aload           7
	//   54  118:ldc1            #36  <String "path">
	//   55  120:aload_1         
	//   56  121:invokestatic    #183 <Method String pathToKey(Path)>
	//   57  124:invokevirtual   #585 <Method void ContentValues.put(String, String)>
				contentvalues.put("type", s);
	//   58  127:aload           7
	//   59  129:ldc1            #86  <String "type">
	//   60  131:aload           4
	//   61  133:invokevirtual   #585 <Method void ContentValues.put(String, String)>
				contentvalues.put("part", Integer.valueOf(i));
	//   62  136:aload           7
	//   63  138:ldc1            #83  <String "part">
	//   64  140:iload           6
	//   65  142:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//   66  145:invokevirtual   #611 <Method void ContentValues.put(String, Integer)>
				contentvalues.put("node", (byte[])((List) (abyte0)).get(i));
	//   67  148:aload           7
	//   68  150:ldc1            #80  <String "node">
	//   69  152:aload           5
	//   70  154:iload           6
	//   71  156:invokeinterface #323 <Method Object List.get(int)>
	//   72  161:checkcast       #267 <Class byte[]>
	//   73  164:invokevirtual   #588 <Method void ContentValues.put(String, byte[])>
				SQLiteDatabase sqlitedatabase1 = database;
	//   74  167:aload_0         
	//   75  168:getfield        #140 <Field SQLiteDatabase database>
	//   76  171:astore          8
				if(!(sqlitedatabase1 instanceof SQLiteDatabase))
	//*  77  173:aload           8
	//*  78  175:instanceof      #454 <Class SQLiteDatabase>
	//*  79  178:ifne            196
					sqlitedatabase1.insertWithOnConflict("writes", ((String) (null)), contentvalues, 5);
	//   80  181:aload           8
	//   81  183:ldc1            #76  <String "writes">
	//   82  185:aconst_null     
	//   83  186:aload           7
	//   84  188:iconst_5        
	//   85  189:invokevirtual   #592 <Method long SQLiteDatabase.insertWithOnConflict(String, String, ContentValues, int)>
	//   86  192:pop2            
				else
	//*  87  193:goto            211
					SQLiteInstrumentation.insertWithOnConflict((SQLiteDatabase)sqlitedatabase1, "writes", ((String) (null)), contentvalues, 5);
	//   88  196:aload           8
	//   89  198:checkcast       #454 <Class SQLiteDatabase>
	//   90  201:ldc1            #76  <String "writes">
	//   91  203:aconst_null     
	//   92  204:aload           7
	//   93  206:iconst_5        
	//   94  207:invokestatic    #595 <Method long SQLiteInstrumentation.insertWithOnConflict(SQLiteDatabase, String, String, ContentValues, int)>
	//   95  210:pop2            
			}

	//   96  211:iload           6
	//   97  213:iconst_1        
	//   98  214:iadd            
	//   99  215:istore          6
		} else
	//* 100  217:goto            84
		{
			ContentValues contentvalues1 = new ContentValues();
	//  101  220:new             #579 <Class ContentValues>
	//  102  223:dup             
	//  103  224:invokespecial   #580 <Method void ContentValues()>
	//  104  227:astore          7
			contentvalues1.put("id", Long.valueOf(l));
	//  105  229:aload           7
	//  106  231:ldc1            #47  <String "id">
	//  107  233:lload_2         
	//  108  234:invokestatic    #443 <Method Long Long.valueOf(long)>
	//  109  237:invokevirtual   #608 <Method void ContentValues.put(String, Long)>
			contentvalues1.put("path", pathToKey(path));
	//  110  240:aload           7
	//  111  242:ldc1            #36  <String "path">
	//  112  244:aload_1         
	//  113  245:invokestatic    #183 <Method String pathToKey(Path)>
	//  114  248:invokevirtual   #585 <Method void ContentValues.put(String, String)>
			contentvalues1.put("type", s);
	//  115  251:aload           7
	//  116  253:ldc1            #86  <String "type">
	//  117  255:aload           4
	//  118  257:invokevirtual   #585 <Method void ContentValues.put(String, String)>
			contentvalues1.put("part", (Integer)null);
	//  119  260:aload           7
	//  120  262:ldc1            #83  <String "part">
	//  121  264:aconst_null     
	//  122  265:checkcast       #430 <Class Integer>
	//  123  268:invokevirtual   #611 <Method void ContentValues.put(String, Integer)>
			contentvalues1.put("node", abyte0);
	//  124  271:aload           7
	//  125  273:ldc1            #80  <String "node">
	//  126  275:aload           5
	//  127  277:invokevirtual   #588 <Method void ContentValues.put(String, byte[])>
			path = ((Path) (database));
	//  128  280:aload_0         
	//  129  281:getfield        #140 <Field SQLiteDatabase database>
	//  130  284:astore_1        
			if(!(path instanceof SQLiteDatabase))
	//* 131  285:aload_1         
	//* 132  286:instanceof      #454 <Class SQLiteDatabase>
	//* 133  289:ifne            304
			{
				((SQLiteDatabase) (path)).insertWithOnConflict("writes", ((String) (null)), contentvalues1, 5);
	//  134  292:aload_1         
	//  135  293:ldc1            #76  <String "writes">
	//  136  295:aconst_null     
	//  137  296:aload           7
	//  138  298:iconst_5        
	//  139  299:invokevirtual   #592 <Method long SQLiteDatabase.insertWithOnConflict(String, String, ContentValues, int)>
	//  140  302:pop2            
				return;
	//  141  303:return          
			}
			SQLiteInstrumentation.insertWithOnConflict((SQLiteDatabase)path, "writes", ((String) (null)), contentvalues1, 5);
	//  142  304:aload_1         
	//  143  305:checkcast       #454 <Class SQLiteDatabase>
	//  144  308:ldc1            #76  <String "writes">
	//  145  310:aconst_null     
	//  146  311:aload           7
	//  147  313:iconst_5        
	//  148  314:invokestatic    #595 <Method long SQLiteInstrumentation.insertWithOnConflict(SQLiteDatabase, String, String, ContentValues, int)>
	//  149  317:pop2            
		}
	//  150  318:return          
	}

	private byte[] serializeObject(Object obj)
	{
		try
		{
			obj = ((Object) (jsonMapper.writeValueAsBytes(obj)));
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field ObjectMapper jsonMapper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #614 <Method byte[] ObjectMapper.writeValueAsBytes(Object)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   7   11:astore_1        
		{
			throw new RuntimeException("Could not serialize leaf node", ((Throwable) (obj)));
	//    8   12:new             #155 <Class RuntimeException>
	//    9   15:dup             
	//   10   16:ldc2            #616 <String "Could not serialize leaf node">
	//   11   19:aload_1         
	//   12   20:invokespecial   #253 <Method void RuntimeException(String, Throwable)>
	//   13   23:athrow          
		}
		return ((byte []) (obj));
	}

	private static List splitBytes(byte abyte0[], int i)
	{
		int k = (abyte0.length - 1) / i + 1;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:iconst_1        
	//    3    3:isub            
	//    4    4:iload_1         
	//    5    5:idiv            
	//    6    6:iconst_1        
	//    7    7:iadd            
	//    8    8:istore_3        
		ArrayList arraylist = new ArrayList(k);
	//    9    9:new             #278 <Class ArrayList>
	//   10   12:dup             
	//   11   13:iload_3         
	//   12   14:invokespecial   #619 <Method void ArrayList(int)>
	//   13   17:astore          6
		for(int j = 0; j < k; j++)
	//*  14   19:iconst_0        
	//*  15   20:istore_2        
	//*  16   21:iload_2         
	//*  17   22:iload_3         
	//*  18   23:icmpge          80
		{
			int i1 = abyte0.length;
	//   19   26:aload_0         
	//   20   27:arraylength     
	//   21   28:istore          5
			int l = j * i;
	//   22   30:iload_2         
	//   23   31:iload_1         
	//   24   32:imul            
	//   25   33:istore          4
			i1 = Math.min(i, i1 - l);
	//   26   35:iload_1         
	//   27   36:iload           5
	//   28   38:iload           4
	//   29   40:isub            
	//   30   41:invokestatic    #625 <Method int Math.min(int, int)>
	//   31   44:istore          5
			byte abyte1[] = new byte[i1];
	//   32   46:iload           5
	//   33   48:newarray        byte[]
	//   34   50:astore          7
			System.arraycopy(((Object) (abyte0)), l, ((Object) (abyte1)), 0, i1);
	//   35   52:aload_0         
	//   36   53:iload           4
	//   37   55:aload           7
	//   38   57:iconst_0        
	//   39   58:iload           5
	//   40   60:invokestatic    #273 <Method void System.arraycopy(Object, int, Object, int, int)>
			((List) (arraylist)).add(((Object) (abyte1)));
	//   41   63:aload           6
	//   42   65:aload           7
	//   43   67:invokeinterface #299 <Method boolean List.add(Object)>
	//   44   72:pop             
		}

	//   45   73:iload_2         
	//   46   74:iconst_1        
	//   47   75:iadd            
	//   48   76:istore_2        
	//*  49   77:goto            21
		return ((List) (arraylist));
	//   50   80:aload           6
	//   51   82:areturn         
	}

	private int splitNodeRunLength(Path path, List list, int i)
	{
		int j = i + 1;
	//    0    0:iload_3         
	//    1    1:iconst_1        
	//    2    2:iadd            
	//    3    3:istore          4
		String s = pathToKey(path);
	//    4    5:aload_1         
	//    5    6:invokestatic    #183 <Method String pathToKey(Path)>
	//    6    9:astore          5
		if(((String)list.get(i)).startsWith(s))
	//*   7   11:aload_2         
	//*   8   12:iload_3         
	//*   9   13:invokeinterface #323 <Method Object List.get(int)>
	//*  10   18:checkcast       #243 <Class String>
	//*  11   21:aload           5
	//*  12   23:invokevirtual   #629 <Method boolean String.startsWith(String)>
	//*  13   26:ifeq            150
		{
			for(; j < list.size() && ((String)list.get(j)).equals(((Object) (partKey(path, j - i)))); j++);
	//   14   29:iload           4
	//   15   31:aload_2         
	//   16   32:invokeinterface #319 <Method int List.size()>
	//   17   37:icmpge          75
	//   18   40:aload_2         
	//   19   41:iload           4
	//   20   43:invokeinterface #323 <Method Object List.get(int)>
	//   21   48:checkcast       #243 <Class String>
	//   22   51:aload_0         
	//   23   52:aload_1         
	//   24   53:iload           4
	//   25   55:iload_3         
	//   26   56:isub            
	//   27   57:invokespecial   #582 <Method String partKey(Path, int)>
	//   28   60:invokevirtual   #632 <Method boolean String.equals(Object)>
	//   29   63:ifeq            75
	//   30   66:iload           4
	//   31   68:iconst_1        
	//   32   69:iadd            
	//   33   70:istore          4
	//*  34   72:goto            29
			if(j < list.size())
	//*  35   75:iload           4
	//*  36   77:aload_2         
	//*  37   78:invokeinterface #319 <Method int List.size()>
	//*  38   83:icmpge          145
			{
				path = ((Path) ((String)list.get(j)));
	//   39   86:aload_2         
	//   40   87:iload           4
	//   41   89:invokeinterface #323 <Method Object List.get(int)>
	//   42   94:checkcast       #243 <Class String>
	//   43   97:astore_1        
				list = ((List) (new StringBuilder()));
	//   44   98:new             #162 <Class StringBuilder>
	//   45  101:dup             
	//   46  102:invokespecial   #199 <Method void StringBuilder()>
	//   47  105:astore_2        
				((StringBuilder) (list)).append(s);
	//   48  106:aload_2         
	//   49  107:aload           5
	//   50  109:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   51  112:pop             
				((StringBuilder) (list)).append(".part-");
	//   52  113:aload_2         
	//   53  114:ldc1            #33  <String ".part-">
	//   54  116:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   55  119:pop             
				if(((String) (path)).startsWith(((StringBuilder) (list)).toString()))
	//*  56  120:aload_1         
	//*  57  121:aload_2         
	//*  58  122:invokevirtual   #196 <Method String StringBuilder.toString()>
	//*  59  125:invokevirtual   #629 <Method boolean String.startsWith(String)>
	//*  60  128:ifne            134
	//*  61  131:goto            145
					throw new IllegalStateException("Run did not finish with all parts");
	//   62  134:new             #404 <Class IllegalStateException>
	//   63  137:dup             
	//   64  138:ldc2            #634 <String "Run did not finish with all parts">
	//   65  141:invokespecial   #411 <Method void IllegalStateException(String)>
	//   66  144:athrow          
			}
			return j - i;
	//   67  145:iload           4
	//   68  147:iload_3         
	//   69  148:isub            
	//   70  149:ireturn         
		} else
		{
			throw new IllegalStateException("Extracting split nodes needs to start with path prefix");
	//   71  150:new             #404 <Class IllegalStateException>
	//   72  153:dup             
	//   73  154:ldc2            #636 <String "Extracting split nodes needs to start with path prefix">
	//   74  157:invokespecial   #411 <Method void IllegalStateException(String)>
	//   75  160:athrow          
		}
	}

	private void updateServerCache(Path path, Node node, boolean flag)
	{
		long l = System.currentTimeMillis();
	//    0    0:invokestatic    #282 <Method long System.currentTimeMillis()>
	//    1    3:lstore          6
		int i;
		int j;
		if(!flag)
	//*   2    5:iload_3         
	//*   3    6:ifne            29
		{
			i = removeNested("serverCache", path);
	//    4    9:aload_0         
	//    5   10:ldc1            #44  <String "serverCache">
	//    6   12:aload_1         
	//    7   13:invokespecial   #641 <Method int removeNested(String, Path)>
	//    8   16:istore          4
			j = saveNested(path, node);
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:invokespecial   #553 <Method int saveNested(Path, Node)>
	//   13   24:istore          5
		} else
	//*  14   26:goto            108
		{
			node = ((Node) (node.iterator()));
	//   15   29:aload_2         
	//   16   30:invokeinterface #542 <Method Iterator Node.iterator()>
	//   17   35:astore_2        
			i = 0;
	//   18   36:iconst_0        
	//   19   37:istore          4
			NamedNode namednode;
			for(j = 0; ((Iterator) (node)).hasNext(); j += saveNested(path.child(namednode.getName()), namednode.getNode()))
	//*  20   39:iconst_0        
	//*  21   40:istore          5
	//*  22   42:aload_2         
	//*  23   43:invokeinterface #210 <Method boolean Iterator.hasNext()>
	//*  24   48:ifeq            108
			{
				namednode = (NamedNode)((Iterator) (node)).next();
	//   25   51:aload_2         
	//   26   52:invokeinterface #214 <Method Object Iterator.next()>
	//   27   57:checkcast       #544 <Class NamedNode>
	//   28   60:astore          10
				i += removeNested("serverCache", path.child(namednode.getName()));
	//   29   62:iload           4
	//   30   64:aload_0         
	//   31   65:ldc1            #44  <String "serverCache">
	//   32   67:aload_1         
	//   33   68:aload           10
	//   34   70:invokevirtual   #547 <Method ChildKey NamedNode.getName()>
	//   35   73:invokevirtual   #512 <Method Path Path.child(ChildKey)>
	//   36   76:invokespecial   #641 <Method int removeNested(String, Path)>
	//   37   79:iadd            
	//   38   80:istore          4
			}

	//   39   82:iload           5
	//   40   84:aload_0         
	//   41   85:aload_1         
	//   42   86:aload           10
	//   43   88:invokevirtual   #547 <Method ChildKey NamedNode.getName()>
	//   44   91:invokevirtual   #512 <Method Path Path.child(ChildKey)>
	//   45   94:aload           10
	//   46   96:invokevirtual   #551 <Method Node NamedNode.getNode()>
	//   47   99:invokespecial   #553 <Method int saveNested(Path, Node)>
	//   48  102:iadd            
	//   49  103:istore          5
		}
	//*  50  105:goto            42
		long l1 = System.currentTimeMillis();
	//   51  108:invokestatic    #282 <Method long System.currentTimeMillis()>
	//   52  111:lstore          8
		if(logger.logsDebug())
	//*  53  113:aload_0         
	//*  54  114:getfield        #153 <Field LogWrapper logger>
	//*  55  117:invokevirtual   #344 <Method boolean LogWrapper.logsDebug()>
	//*  56  120:ifeq            174
			logger.debug(String.format("Persisted a total of %d rows and deleted %d rows for a set at %s in %dms", new Object[] {
				Integer.valueOf(j), Integer.valueOf(i), path.toString(), Long.valueOf(l1 - l)
			}));
	//   57  123:aload_0         
	//   58  124:getfield        #153 <Field LogWrapper logger>
	//   59  127:ldc2            #643 <String "Persisted a total of %d rows and deleted %d rows for a set at %s in %dms">
	//   60  130:iconst_4        
	//   61  131:anewarray       Object[]
	//   62  134:dup             
	//   63  135:iconst_0        
	//   64  136:iload           5
	//   65  138:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//   66  141:aastore         
	//   67  142:dup             
	//   68  143:iconst_1        
	//   69  144:iload           4
	//   70  146:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//   71  149:aastore         
	//   72  150:dup             
	//   73  151:iconst_2        
	//   74  152:aload_1         
	//   75  153:invokevirtual   #471 <Method String Path.toString()>
	//   76  156:aastore         
	//   77  157:dup             
	//   78  158:iconst_3        
	//   79  159:lload           8
	//   80  161:lload           6
	//   81  163:lsub            
	//   82  164:invokestatic    #443 <Method Long Long.valueOf(long)>
	//   83  167:aastore         
	//   84  168:invokestatic    #410 <Method String String.format(String, Object[])>
	//   85  171:invokevirtual   #354 <Method void LogWrapper.debug(String)>
	//   86  174:return          
	}

	private void verifyInsideTransaction()
	{
		Utilities.hardAssert(database.inTransaction(), "Transaction expected to already be in progress.");
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field SQLiteDatabase database>
	//    2    4:invokevirtual   #646 <Method boolean SQLiteDatabase.inTransaction()>
	//    3    7:ldc2            #648 <String "Transaction expected to already be in progress.">
	//    4   10:invokestatic    #389 <Method void Utilities.hardAssert(boolean, String)>
	//    5   13:return          
	}

	public void beginTransaction()
	{
		Utilities.hardAssert(database.inTransaction() ^ true, "runInTransaction called when an existing transaction is already in progress.");
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field SQLiteDatabase database>
	//    2    4:invokevirtual   #646 <Method boolean SQLiteDatabase.inTransaction()>
	//    3    7:iconst_1        
	//    4    8:ixor            
	//    5    9:ldc2            #651 <String "runInTransaction called when an existing transaction is already in progress.">
	//    6   12:invokestatic    #389 <Method void Utilities.hardAssert(boolean, String)>
		if(logger.logsDebug())
	//*   7   15:aload_0         
	//*   8   16:getfield        #153 <Field LogWrapper logger>
	//*   9   19:invokevirtual   #344 <Method boolean LogWrapper.logsDebug()>
	//*  10   22:ifeq            35
			logger.debug("Starting transaction.");
	//   11   25:aload_0         
	//   12   26:getfield        #153 <Field LogWrapper logger>
	//   13   29:ldc2            #653 <String "Starting transaction.">
	//   14   32:invokevirtual   #354 <Method void LogWrapper.debug(String)>
		transactionStart = System.currentTimeMillis();
	//   15   35:aload_0         
	//   16   36:invokestatic    #282 <Method long System.currentTimeMillis()>
	//   17   39:putfield        #123 <Field long transactionStart>
		database.beginTransaction();
	//   18   42:aload_0         
	//   19   43:getfield        #140 <Field SQLiteDatabase database>
	//   20   46:invokevirtual   #655 <Method void SQLiteDatabase.beginTransaction()>
	//   21   49:return          
	}

	public void deleteTrackedQuery(long l)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #600 <Method void verifyInsideTransaction()>
		String s = String.valueOf(l);
	//    2    4:lload_1         
	//    3    5:invokestatic    #603 <Method String String.valueOf(long)>
	//    4    8:astore_3        
		SQLiteDatabase sqlitedatabase = database;
	//    5    9:aload_0         
	//    6   10:getfield        #140 <Field SQLiteDatabase database>
	//    7   13:astore          4
		String as[] = new String[1];
	//    8   15:iconst_1        
	//    9   16:anewarray       String[]
	//   10   19:astore          5
		as[0] = s;
	//   11   21:aload           5
	//   12   23:iconst_0        
	//   13   24:aload_3         
	//   14   25:aastore         
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*  15   26:aload           4
	//*  16   28:instanceof      #454 <Class SQLiteDatabase>
	//*  17   31:ifne            50
			sqlitedatabase.delete("trackedQueries", "id = ?", as);
	//   18   34:aload           4
	//   19   36:ldc1            #70  <String "trackedQueries">
	//   20   38:ldc2            #605 <String "id = ?">
	//   21   41:aload           5
	//   22   43:invokevirtual   #526 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   23   46:pop             
		else
	//*  24   47:goto            66
			SQLiteInstrumentation.delete((SQLiteDatabase)sqlitedatabase, "trackedQueries", "id = ?", as);
	//   25   50:aload           4
	//   26   52:checkcast       #454 <Class SQLiteDatabase>
	//   27   55:ldc1            #70  <String "trackedQueries">
	//   28   57:ldc2            #605 <String "id = ?">
	//   29   60:aload           5
	//   30   62:invokestatic    #529 <Method int SQLiteInstrumentation.delete(SQLiteDatabase, String, String, String[])>
	//   31   65:pop             
		sqlitedatabase = database;
	//   32   66:aload_0         
	//   33   67:getfield        #140 <Field SQLiteDatabase database>
	//   34   70:astore          4
		as = new String[1];
	//   35   72:iconst_1        
	//   36   73:anewarray       String[]
	//   37   76:astore          5
		as[0] = s;
	//   38   78:aload           5
	//   39   80:iconst_0        
	//   40   81:aload_3         
	//   41   82:aastore         
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*  42   83:aload           4
	//*  43   85:instanceof      #454 <Class SQLiteDatabase>
	//*  44   88:ifne            105
		{
			sqlitedatabase.delete("trackedKeys", "id = ?", as);
	//   45   91:aload           4
	//   46   93:ldc1            #53  <String "trackedKeys">
	//   47   95:ldc2            #605 <String "id = ?">
	//   48   98:aload           5
	//   49  100:invokevirtual   #526 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   50  103:pop             
			return;
	//   51  104:return          
		} else
		{
			SQLiteInstrumentation.delete((SQLiteDatabase)sqlitedatabase, "trackedKeys", "id = ?", as);
	//   52  105:aload           4
	//   53  107:checkcast       #454 <Class SQLiteDatabase>
	//   54  110:ldc1            #53  <String "trackedKeys">
	//   55  112:ldc2            #605 <String "id = ?">
	//   56  115:aload           5
	//   57  117:invokestatic    #529 <Method int SQLiteInstrumentation.delete(SQLiteDatabase, String, String, String[])>
	//   58  120:pop             
			return;
	//   59  121:return          
		}
	}

	public void endTransaction()
	{
		Utilities.hardAssert(database.inTransaction(), "endTransaction called when there is no existing transaction");
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field SQLiteDatabase database>
	//    2    4:invokevirtual   #646 <Method boolean SQLiteDatabase.inTransaction()>
	//    3    7:ldc2            #660 <String "endTransaction called when there is no existing transaction">
	//    4   10:invokestatic    #389 <Method void Utilities.hardAssert(boolean, String)>
		database.endTransaction();
	//    5   13:aload_0         
	//    6   14:getfield        #140 <Field SQLiteDatabase database>
	//    7   17:invokevirtual   #662 <Method void SQLiteDatabase.endTransaction()>
		long l = System.currentTimeMillis();
	//    8   20:invokestatic    #282 <Method long System.currentTimeMillis()>
	//    9   23:lstore_1        
		long l1 = transactionStart;
	//   10   24:aload_0         
	//   11   25:getfield        #123 <Field long transactionStart>
	//   12   28:lstore_3        
		if(logger.logsDebug())
	//*  13   29:aload_0         
	//*  14   30:getfield        #153 <Field LogWrapper logger>
	//*  15   33:invokevirtual   #344 <Method boolean LogWrapper.logsDebug()>
	//*  16   36:ifeq            65
			logger.debug(String.format("Transaction completed. Elapsed: %dms", new Object[] {
				Long.valueOf(l - l1)
			}));
	//   17   39:aload_0         
	//   18   40:getfield        #153 <Field LogWrapper logger>
	//   19   43:ldc2            #664 <String "Transaction completed. Elapsed: %dms">
	//   20   46:iconst_1        
	//   21   47:anewarray       Object[]
	//   22   50:dup             
	//   23   51:iconst_0        
	//   24   52:lload_1         
	//   25   53:lload_3         
	//   26   54:lsub            
	//   27   55:invokestatic    #443 <Method Long Long.valueOf(long)>
	//   28   58:aastore         
	//   29   59:invokestatic    #410 <Method String String.format(String, Object[])>
	//   30   62:invokevirtual   #354 <Method void LogWrapper.debug(String)>
	//   31   65:return          
	}

	public List loadTrackedQueries()
	{
		long l;
		Object obj;
		Object obj1;
		obj = ((Object) (new String[6]));
	//    0    0:bipush          6
	//    1    2:anewarray       String[]
	//    2    5:astore          9
		obj[0] = "id";
	//    3    7:aload           9
	//    4    9:iconst_0        
	//    5   10:ldc1            #47  <String "id">
	//    6   12:aastore         
		obj[1] = "path";
	//    7   13:aload           9
	//    8   15:iconst_1        
	//    9   16:ldc1            #36  <String "path">
	//   10   18:aastore         
		obj[2] = "queryParams";
	//   11   19:aload           9
	//   12   21:iconst_2        
	//   13   22:ldc1            #66  <String "queryParams">
	//   14   24:aastore         
		obj[3] = "lastUse";
	//   15   25:aload           9
	//   16   27:iconst_3        
	//   17   28:ldc1            #63  <String "lastUse">
	//   18   30:aastore         
		obj[4] = "complete";
	//   19   31:aload           9
	//   20   33:iconst_4        
	//   21   34:ldc1            #59  <String "complete">
	//   22   36:aastore         
		obj[5] = "active";
	//   23   37:aload           9
	//   24   39:iconst_5        
	//   25   40:ldc1            #56  <String "active">
	//   26   42:aastore         
		l = System.currentTimeMillis();
	//   27   43:invokestatic    #282 <Method long System.currentTimeMillis()>
	//   28   46:lstore_1        
		obj1 = ((Object) (database));
	//   29   47:aload_0         
	//   30   48:getfield        #140 <Field SQLiteDatabase database>
	//   31   51:astore          10
		if(!(obj1 instanceof SQLiteDatabase))
	//*  32   53:aload           10
	//*  33   55:instanceof      #454 <Class SQLiteDatabase>
	//*  34   58:ifne            81
			obj = ((Object) (((SQLiteDatabase) (obj1)).query("trackedQueries", ((String []) (obj)), ((String) (null)), ((String []) (null)), ((String) (null)), ((String) (null)), "id")));
	//   35   61:aload           10
	//   36   63:ldc1            #70  <String "trackedQueries">
	//   37   65:aload           9
	//   38   67:aconst_null     
	//   39   68:aconst_null     
	//   40   69:aconst_null     
	//   41   70:aconst_null     
	//   42   71:ldc1            #47  <String "id">
	//   43   73:invokevirtual   #458 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   44   76:astore          9
		else
	//*  45   78:goto            101
			obj = ((Object) (SQLiteInstrumentation.query((SQLiteDatabase)obj1, "trackedQueries", ((String []) (obj)), ((String) (null)), ((String []) (null)), ((String) (null)), ((String) (null)), "id")));
	//   46   81:aload           10
	//   47   83:checkcast       #454 <Class SQLiteDatabase>
	//   48   86:ldc1            #70  <String "trackedQueries">
	//   49   88:aload           9
	//   50   90:aconst_null     
	//   51   91:aconst_null     
	//   52   92:aconst_null     
	//   53   93:aconst_null     
	//   54   94:ldc1            #47  <String "id">
	//   55   96:invokestatic    #463 <Method Cursor SQLiteInstrumentation.query(SQLiteDatabase, String, String[], String, String[], String, String, String)>
	//   56   99:astore          9
		obj1 = ((Object) (new ArrayList()));
	//   57  101:new             #278 <Class ArrayList>
	//   58  104:dup             
	//   59  105:invokespecial   #279 <Method void ArrayList()>
	//   60  108:astore          10
_L2:
		long l1;
		Object obj2;
		Object obj3;
		if(!((Cursor) (obj)).moveToNext())
			break; /* Loop/switch isn't completed */
	//   61  110:aload           9
	//   62  112:invokeinterface #291 <Method boolean Cursor.moveToNext()>
	//   63  117:ifeq            264
		l1 = ((Cursor) (obj)).getLong(0);
	//   64  120:aload           9
	//   65  122:iconst_0        
	//   66  123:invokeinterface #670 <Method long Cursor.getLong(int)>
	//   67  128:lstore_3        
		obj2 = ((Object) (new Path(((Cursor) (obj)).getString(1))));
	//   68  129:new             #169 <Class Path>
	//   69  132:dup             
	//   70  133:aload           9
	//   71  135:iconst_1        
	//   72  136:invokeinterface #295 <Method String Cursor.getString(int)>
	//   73  141:invokespecial   #335 <Method void Path(String)>
	//   74  144:astore          11
		obj3 = ((Object) (((Cursor) (obj)).getString(2)));
	//   75  146:aload           9
	//   76  148:iconst_2        
	//   77  149:invokeinterface #295 <Method String Cursor.getString(int)>
	//   78  154:astore          12
		obj3 = jsonMapper.readValue(((String) (obj3)), java/lang/Object);
	//   79  156:aload_0         
	//   80  157:getfield        #145 <Field ObjectMapper jsonMapper>
	//   81  160:aload           12
	//   82  162:ldc1            #4   <Class Object>
	//   83  164:invokevirtual   #673 <Method Object ObjectMapper.readValue(String, Class)>
	//   84  167:astore          12
		long l3;
		obj2 = ((Object) (QuerySpec.fromPathAndQueryObject(((Path) (obj2)), (Map)obj3)));
	//   85  169:aload           11
	//   86  171:aload           12
	//   87  173:checkcast       #373 <Class Map>
	//   88  176:invokestatic    #679 <Method QuerySpec QuerySpec.fromPathAndQueryObject(Path, Map)>
	//   89  179:astore          11
		l3 = ((Cursor) (obj)).getLong(3);
	//   90  181:aload           9
	//   91  183:iconst_3        
	//   92  184:invokeinterface #670 <Method long Cursor.getLong(int)>
	//   93  189:lstore          5
		boolean flag;
		boolean flag1;
		Exception exception;
		if(((Cursor) (obj)).getInt(4) != 0)
	//*  94  191:aload           9
	//*  95  193:iconst_4        
	//*  96  194:invokeinterface #683 <Method int Cursor.getInt(int)>
	//*  97  199:ifeq            339
			flag = true;
	//   98  202:iconst_1        
	//   99  203:istore          7
		else
	//* 100  205:goto            208
	//* 101  208:aload           9
	//* 102  210:iconst_5        
	//* 103  211:invokeinterface #683 <Method int Cursor.getInt(int)>
	//* 104  216:ifeq            345
	//* 105  219:iconst_1        
	//* 106  220:istore          8
	//* 107  222:goto            225
	//* 108  225:aload           10
	//* 109  227:new             #685 <Class TrackedQuery>
	//* 110  230:dup             
	//* 111  231:lload_3         
	//* 112  232:aload           11
	//* 113  234:lload           5
	//* 114  236:iload           7
	//* 115  238:iload           8
	//* 116  240:invokespecial   #688 <Method void TrackedQuery(long, QuerySpec, long, boolean, boolean)>
	//* 117  243:invokeinterface #299 <Method boolean List.add(Object)>
	//* 118  248:pop             
	//* 119  249:goto            110
	//* 120  252:astore          10
	//* 121  254:new             #155 <Class RuntimeException>
	//* 122  257:dup             
	//* 123  258:aload           10
	//* 124  260:invokespecial   #158 <Method void RuntimeException(Throwable)>
	//* 125  263:athrow          
	//* 126  264:invokestatic    #282 <Method long System.currentTimeMillis()>
	//* 127  267:lstore_3        
	//* 128  268:aload_0         
	//* 129  269:getfield        #153 <Field LogWrapper logger>
	//* 130  272:invokevirtual   #344 <Method boolean LogWrapper.logsDebug()>
	//* 131  275:ifeq            317
	//* 132  278:aload_0         
	//* 133  279:getfield        #153 <Field LogWrapper logger>
	//* 134  282:ldc2            #690 <String "Loaded %d tracked queries in %dms">
	//* 135  285:iconst_2        
	//* 136  286:anewarray       Object[]
	//* 137  289:dup             
	//* 138  290:iconst_0        
	//* 139  291:aload           10
	//* 140  293:invokeinterface #319 <Method int List.size()>
	//* 141  298:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//* 142  301:aastore         
	//* 143  302:dup             
	//* 144  303:iconst_1        
	//* 145  304:lload_3         
	//* 146  305:lload_1         
	//* 147  306:lsub            
	//* 148  307:invokestatic    #443 <Method Long Long.valueOf(long)>
	//* 149  310:aastore         
	//* 150  311:invokestatic    #410 <Method String String.format(String, Object[])>
	//* 151  314:invokevirtual   #354 <Method void LogWrapper.debug(String)>
	//* 152  317:aload           9
	//* 153  319:invokeinterface #306 <Method void Cursor.close()>
	//* 154  324:aload           10
	//* 155  326:areturn         
	//* 156  327:astore          10
	//* 157  329:aload           9
	//* 158  331:invokeinterface #306 <Method void Cursor.close()>
	//* 159  336:aload           10
	//* 160  338:athrow          
			flag = false;
	//  161  339:iconst_0        
	//  162  340:istore          7
		if(((Cursor) (obj)).getInt(5) != 0)
			flag1 = true;
		else
	//* 163  342:goto            208
			flag1 = false;
	//  164  345:iconst_0        
	//  165  346:istore          8
		((List) (obj1)).add(((Object) (new TrackedQuery(l1, ((QuerySpec) (obj2)), l3, flag, flag1))));
		if(true) goto _L2; else goto _L1
		obj1;
		throw new RuntimeException(((Throwable) (obj1)));
_L1:
		long l2 = System.currentTimeMillis();
		if(logger.logsDebug())
			logger.debug(String.format("Loaded %d tracked queries in %dms", new Object[] {
				Integer.valueOf(((List) (obj1)).size()), Long.valueOf(l2 - l)
			}));
		((Cursor) (obj)).close();
		return ((List) (obj1));
		exception;
		((Cursor) (obj)).close();
		throw exception;
	//* 166  348:goto            225
	}

	public Set loadTrackedQueryKeys(long l)
	{
		return loadTrackedQueryKeys(Collections.singleton(((Object) (Long.valueOf(l)))));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #443 <Method Long Long.valueOf(long)>
	//    3    5:invokestatic    #699 <Method Set Collections.singleton(Object)>
	//    4    8:invokevirtual   #702 <Method Set loadTrackedQueryKeys(Set)>
	//    5   11:areturn         
	}

	public Set loadTrackedQueryKeys(Set set)
	{
		long l;
		Object obj;
		Object obj1;
		obj = ((Object) (new String[1]));
	//    0    0:iconst_1        
	//    1    1:anewarray       String[]
	//    2    4:astore          6
		obj[0] = "key";
	//    3    6:aload           6
	//    4    8:iconst_0        
	//    5    9:ldc1            #50  <String "key">
	//    6   11:aastore         
		l = System.currentTimeMillis();
	//    7   12:invokestatic    #282 <Method long System.currentTimeMillis()>
	//    8   15:lstore_2        
		obj1 = ((Object) (new StringBuilder()));
	//    9   16:new             #162 <Class StringBuilder>
	//   10   19:dup             
	//   11   20:invokespecial   #199 <Method void StringBuilder()>
	//   12   23:astore          7
		((StringBuilder) (obj1)).append("id IN (");
	//   13   25:aload           7
	//   14   27:ldc2            #705 <String "id IN (">
	//   15   30:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
		((StringBuilder) (obj1)).append(commaSeparatedList(((Collection) (set))));
	//   17   34:aload           7
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokespecial   #707 <Method String commaSeparatedList(Collection)>
	//   21   41:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
		((StringBuilder) (obj1)).append(")");
	//   23   45:aload           7
	//   24   47:ldc2            #709 <String ")">
	//   25   50:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   26   53:pop             
		obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   27   54:aload           7
	//   28   56:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   29   59:astore          7
		SQLiteDatabase sqlitedatabase = database;
	//   30   61:aload_0         
	//   31   62:getfield        #140 <Field SQLiteDatabase database>
	//   32   65:astore          8
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*  33   67:aload           8
	//*  34   69:instanceof      #454 <Class SQLiteDatabase>
	//*  35   72:ifne            97
			obj = ((Object) (sqlitedatabase.query(true, "trackedKeys", ((String []) (obj)), ((String) (obj1)), ((String []) (null)), ((String) (null)), ((String) (null)), ((String) (null)), ((String) (null)))));
	//   36   75:aload           8
	//   37   77:iconst_1        
	//   38   78:ldc1            #53  <String "trackedKeys">
	//   39   80:aload           6
	//   40   82:aload           7
	//   41   84:aconst_null     
	//   42   85:aconst_null     
	//   43   86:aconst_null     
	//   44   87:aconst_null     
	//   45   88:aconst_null     
	//   46   89:invokevirtual   #712 <Method Cursor SQLiteDatabase.query(boolean, String, String[], String, String[], String, String, String, String)>
	//   47   92:astore          6
		else
	//*  48   94:goto            119
			obj = ((Object) (SQLiteInstrumentation.query((SQLiteDatabase)sqlitedatabase, true, "trackedKeys", ((String []) (obj)), ((String) (obj1)), ((String []) (null)), ((String) (null)), ((String) (null)), ((String) (null)), ((String) (null)))));
	//   49   97:aload           8
	//   50   99:checkcast       #454 <Class SQLiteDatabase>
	//   51  102:iconst_1        
	//   52  103:ldc1            #53  <String "trackedKeys">
	//   53  105:aload           6
	//   54  107:aload           7
	//   55  109:aconst_null     
	//   56  110:aconst_null     
	//   57  111:aconst_null     
	//   58  112:aconst_null     
	//   59  113:aconst_null     
	//   60  114:invokestatic    #715 <Method Cursor SQLiteInstrumentation.query(SQLiteDatabase, boolean, String, String[], String, String[], String, String, String, String)>
	//   61  117:astore          6
		obj1 = ((Object) (new HashSet()));
	//   62  119:new             #717 <Class HashSet>
	//   63  122:dup             
	//   64  123:invokespecial   #718 <Method void HashSet()>
	//   65  126:astore          7
		for(; ((Cursor) (obj)).moveToNext(); ((Set) (obj1)).add(((Object) (ChildKey.fromString(((Cursor) (obj)).getString(0))))));
	//   66  128:aload           6
	//   67  130:invokeinterface #291 <Method boolean Cursor.moveToNext()>
	//   68  135:ifeq            160
	//   69  138:aload           7
	//   70  140:aload           6
	//   71  142:iconst_0        
	//   72  143:invokeinterface #295 <Method String Cursor.getString(int)>
	//   73  148:invokestatic    #722 <Method ChildKey ChildKey.fromString(String)>
	//   74  151:invokeinterface #723 <Method boolean Set.add(Object)>
	//   75  156:pop             
	//*  76  157:goto            128
		long l1 = System.currentTimeMillis();
	//   77  160:invokestatic    #282 <Method long System.currentTimeMillis()>
	//   78  163:lstore          4
		if(logger.logsDebug())
	//*  79  165:aload_0         
	//*  80  166:getfield        #153 <Field LogWrapper logger>
	//*  81  169:invokevirtual   #344 <Method boolean LogWrapper.logsDebug()>
	//*  82  172:ifeq            222
			logger.debug(String.format("Loaded %d tracked queries keys for tracked queries %s in %dms", new Object[] {
				Integer.valueOf(((Set) (obj1)).size()), ((Object) (set)).toString(), Long.valueOf(l1 - l)
			}));
	//   83  175:aload_0         
	//   84  176:getfield        #153 <Field LogWrapper logger>
	//   85  179:ldc2            #725 <String "Loaded %d tracked queries keys for tracked queries %s in %dms">
	//   86  182:iconst_3        
	//   87  183:anewarray       Object[]
	//   88  186:dup             
	//   89  187:iconst_0        
	//   90  188:aload           7
	//   91  190:invokeinterface #726 <Method int Set.size()>
	//   92  195:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//   93  198:aastore         
	//   94  199:dup             
	//   95  200:iconst_1        
	//   96  201:aload_1         
	//   97  202:invokevirtual   #727 <Method String Object.toString()>
	//   98  205:aastore         
	//   99  206:dup             
	//  100  207:iconst_2        
	//  101  208:lload           4
	//  102  210:lload_2         
	//  103  211:lsub            
	//  104  212:invokestatic    #443 <Method Long Long.valueOf(long)>
	//  105  215:aastore         
	//  106  216:invokestatic    #410 <Method String String.format(String, Object[])>
	//  107  219:invokevirtual   #354 <Method void LogWrapper.debug(String)>
		((Cursor) (obj)).close();
	//  108  222:aload           6
	//  109  224:invokeinterface #306 <Method void Cursor.close()>
		return ((Set) (obj1));
	//  110  229:aload           7
	//  111  231:areturn         
		set;
	//  112  232:astore_1        
		((Cursor) (obj)).close();
	//  113  233:aload           6
	//  114  235:invokeinterface #306 <Method void Cursor.close()>
		throw set;
	//  115  240:aload_1         
	//  116  241:athrow          
	}

	public List loadUserWrites()
	{
		long l;
		Object obj;
		ArrayList arraylist;
		obj = ((Object) (new String[5]));
	//    0    0:iconst_5        
	//    1    1:anewarray       String[]
	//    2    4:astore          5
		obj[0] = "id";
	//    3    6:aload           5
	//    4    8:iconst_0        
	//    5    9:ldc1            #47  <String "id">
	//    6   11:aastore         
		obj[1] = "path";
	//    7   12:aload           5
	//    8   14:iconst_1        
	//    9   15:ldc1            #36  <String "path">
	//   10   17:aastore         
		obj[2] = "type";
	//   11   18:aload           5
	//   12   20:iconst_2        
	//   13   21:ldc1            #86  <String "type">
	//   14   23:aastore         
		obj[3] = "part";
	//   15   24:aload           5
	//   16   26:iconst_3        
	//   17   27:ldc1            #83  <String "part">
	//   18   29:aastore         
		obj[4] = "node";
	//   19   30:aload           5
	//   20   32:iconst_4        
	//   21   33:ldc1            #80  <String "node">
	//   22   35:aastore         
		l = System.currentTimeMillis();
	//   23   36:invokestatic    #282 <Method long System.currentTimeMillis()>
	//   24   39:lstore_1        
		SQLiteDatabase sqlitedatabase = database;
	//   25   40:aload_0         
	//   26   41:getfield        #140 <Field SQLiteDatabase database>
	//   27   44:astore          6
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*  28   46:aload           6
	//*  29   48:instanceof      #454 <Class SQLiteDatabase>
	//*  30   51:ifne            75
			obj = ((Object) (sqlitedatabase.query("writes", ((String []) (obj)), ((String) (null)), ((String []) (null)), ((String) (null)), ((String) (null)), "id, part")));
	//   31   54:aload           6
	//   32   56:ldc1            #76  <String "writes">
	//   33   58:aload           5
	//   34   60:aconst_null     
	//   35   61:aconst_null     
	//   36   62:aconst_null     
	//   37   63:aconst_null     
	//   38   64:ldc2            #731 <String "id, part">
	//   39   67:invokevirtual   #458 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   40   70:astore          5
		else
	//*  41   72:goto            96
			obj = ((Object) (SQLiteInstrumentation.query((SQLiteDatabase)sqlitedatabase, "writes", ((String []) (obj)), ((String) (null)), ((String []) (null)), ((String) (null)), ((String) (null)), "id, part")));
	//   42   75:aload           6
	//   43   77:checkcast       #454 <Class SQLiteDatabase>
	//   44   80:ldc1            #76  <String "writes">
	//   45   82:aload           5
	//   46   84:aconst_null     
	//   47   85:aconst_null     
	//   48   86:aconst_null     
	//   49   87:aconst_null     
	//   50   88:ldc2            #731 <String "id, part">
	//   51   91:invokestatic    #463 <Method Cursor SQLiteInstrumentation.query(SQLiteDatabase, String, String[], String, String[], String, String, String)>
	//   52   94:astore          5
		arraylist = new ArrayList();
	//   53   96:new             #278 <Class ArrayList>
	//   54   99:dup             
	//   55  100:invokespecial   #279 <Method void ArrayList()>
	//   56  103:astore          7
_L1:
		long l1;
		byte abyte0[];
		String s;
		Path path;
		if(!((Cursor) (obj)).moveToNext())
			break MISSING_BLOCK_LABEL_365;
	//   57  105:aload           5
	//   58  107:invokeinterface #291 <Method boolean Cursor.moveToNext()>
	//   59  112:ifeq            365
		l1 = ((Cursor) (obj)).getLong(0);
	//   60  115:aload           5
	//   61  117:iconst_0        
	//   62  118:invokeinterface #670 <Method long Cursor.getLong(int)>
	//   63  123:lstore_3        
		path = new Path(((Cursor) (obj)).getString(1));
	//   64  124:new             #169 <Class Path>
	//   65  127:dup             
	//   66  128:aload           5
	//   67  130:iconst_1        
	//   68  131:invokeinterface #295 <Method String Cursor.getString(int)>
	//   69  136:invokespecial   #335 <Method void Path(String)>
	//   70  139:astore          9
		s = ((Cursor) (obj)).getString(2);
	//   71  141:aload           5
	//   72  143:iconst_2        
	//   73  144:invokeinterface #295 <Method String Cursor.getString(int)>
	//   74  149:astore          8
		if(((Cursor) (obj)).isNull(3))
	//*  75  151:aload           5
	//*  76  153:iconst_3        
	//*  77  154:invokeinterface #735 <Method boolean Cursor.isNull(int)>
	//*  78  159:ifeq            175
		{
			abyte0 = ((Cursor) (obj)).getBlob(4);
	//   79  162:aload           5
	//   80  164:iconst_4        
	//   81  165:invokeinterface #303 <Method byte[] Cursor.getBlob(int)>
	//   82  170:astore          6
			break MISSING_BLOCK_LABEL_239;
	//   83  172:goto            239
		}
		abyte0 = ((byte []) (new ArrayList()));
	//   84  175:new             #278 <Class ArrayList>
	//   85  178:dup             
	//   86  179:invokespecial   #279 <Method void ArrayList()>
	//   87  182:astore          6
		do
			((List) (abyte0)).add(((Object) (((Cursor) (obj)).getBlob(4))));
	//   88  184:aload           6
	//   89  186:aload           5
	//   90  188:iconst_4        
	//   91  189:invokeinterface #303 <Method byte[] Cursor.getBlob(int)>
	//   92  194:invokeinterface #299 <Method boolean List.add(Object)>
	//   93  199:pop             
		while(((Cursor) (obj)).moveToNext() && ((Cursor) (obj)).getLong(0) == l1);
	//   94  200:aload           5
	//   95  202:invokeinterface #291 <Method boolean Cursor.moveToNext()>
	//   96  207:ifeq            223
	//   97  210:aload           5
	//   98  212:iconst_0        
	//   99  213:invokeinterface #670 <Method long Cursor.getLong(int)>
	//  100  218:lload_3         
	//  101  219:lcmp            
	//  102  220:ifeq            184
		((Cursor) (obj)).moveToPrevious();
	//  103  223:aload           5
	//  104  225:invokeinterface #738 <Method boolean Cursor.moveToPrevious()>
	//  105  230:pop             
		abyte0 = joinBytes(((List) (abyte0)));
	//  106  231:aload_0         
	//  107  232:aload           6
	//  108  234:invokespecial   #360 <Method byte[] joinBytes(List)>
	//  109  237:astore          6
		Object obj1;
		obj1 = jsonMapper.readValue(abyte0, java/lang/Object);
	//  110  239:aload_0         
	//  111  240:getfield        #145 <Field ObjectMapper jsonMapper>
	//  112  243:aload           6
	//  113  245:ldc1            #4   <Class Object>
	//  114  247:invokevirtual   #235 <Method Object ObjectMapper.readValue(byte[], Class)>
	//  115  250:astore          6
		if("o".equals(((Object) (s))))
	//* 116  252:ldc1            #92  <String "o">
	//* 117  254:aload           8
	//* 118  256:invokevirtual   #632 <Method boolean String.equals(Object)>
	//* 119  259:ifeq            283
		{
			obj1 = ((Object) (new UserWriteRecord(l1, path, NodeUtilities.NodeFromJSON(obj1), true)));
	//  120  262:new             #740 <Class UserWriteRecord>
	//  121  265:dup             
	//  122  266:lload_3         
	//  123  267:aload           9
	//  124  269:aload           6
	//  125  271:invokestatic    #241 <Method Node NodeUtilities.NodeFromJSON(Object)>
	//  126  274:iconst_1        
	//  127  275:invokespecial   #743 <Method void UserWriteRecord(long, Path, Node, boolean)>
	//  128  278:astore          6
			break MISSING_BLOCK_LABEL_313;
	//  129  280:goto            313
		}
		if(!"m".equals(((Object) (s))))
			break MISSING_BLOCK_LABEL_326;
	//  130  283:ldc1            #89  <String "m">
	//  131  285:aload           8
	//  132  287:invokevirtual   #632 <Method boolean String.equals(Object)>
	//  133  290:ifeq            326
		obj1 = ((Object) (new UserWriteRecord(l1, path, CompoundWrite.fromValue((Map)obj1))));
	//  134  293:new             #740 <Class UserWriteRecord>
	//  135  296:dup             
	//  136  297:lload_3         
	//  137  298:aload           9
	//  138  300:aload           6
	//  139  302:checkcast       #373 <Class Map>
	//  140  305:invokestatic    #749 <Method CompoundWrite CompoundWrite.fromValue(Map)>
	//  141  308:invokespecial   #752 <Method void UserWriteRecord(long, Path, CompoundWrite)>
	//  142  311:astore          6
		((List) (arraylist)).add(obj1);
	//  143  313:aload           7
	//  144  315:aload           6
	//  145  317:invokeinterface #299 <Method boolean List.add(Object)>
	//  146  322:pop             
		  goto _L1
	//* 147  323:goto            105
		StringBuilder stringbuilder = new StringBuilder();
	//  148  326:new             #162 <Class StringBuilder>
	//  149  329:dup             
	//  150  330:invokespecial   #199 <Method void StringBuilder()>
	//  151  333:astore          6
		stringbuilder.append("Got invalid write type: ");
	//  152  335:aload           6
	//  153  337:ldc2            #754 <String "Got invalid write type: ">
	//  154  340:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//  155  343:pop             
		stringbuilder.append(s);
	//  156  344:aload           6
	//  157  346:aload           8
	//  158  348:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//  159  351:pop             
		throw new IllegalStateException(stringbuilder.toString());
	//  160  352:new             #404 <Class IllegalStateException>
	//  161  355:dup             
	//  162  356:aload           6
	//  163  358:invokevirtual   #196 <Method String StringBuilder.toString()>
	//  164  361:invokespecial   #411 <Method void IllegalStateException(String)>
	//  165  364:athrow          
		long l2 = System.currentTimeMillis();
	//  166  365:invokestatic    #282 <Method long System.currentTimeMillis()>
	//  167  368:lstore_3        
		if(logger.logsDebug())
	//* 168  369:aload_0         
	//* 169  370:getfield        #153 <Field LogWrapper logger>
	//* 170  373:invokevirtual   #344 <Method boolean LogWrapper.logsDebug()>
	//* 171  376:ifeq            418
			logger.debug(String.format("Loaded %d writes in %dms", new Object[] {
				Integer.valueOf(((List) (arraylist)).size()), Long.valueOf(l2 - l)
			}));
	//  172  379:aload_0         
	//  173  380:getfield        #153 <Field LogWrapper logger>
	//  174  383:ldc2            #756 <String "Loaded %d writes in %dms">
	//  175  386:iconst_2        
	//  176  387:anewarray       Object[]
	//  177  390:dup             
	//  178  391:iconst_0        
	//  179  392:aload           7
	//  180  394:invokeinterface #319 <Method int List.size()>
	//  181  399:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//  182  402:aastore         
	//  183  403:dup             
	//  184  404:iconst_1        
	//  185  405:lload_3         
	//  186  406:lload_1         
	//  187  407:lsub            
	//  188  408:invokestatic    #443 <Method Long Long.valueOf(long)>
	//  189  411:aastore         
	//  190  412:invokestatic    #410 <Method String String.format(String, Object[])>
	//  191  415:invokevirtual   #354 <Method void LogWrapper.debug(String)>
		((Cursor) (obj)).close();
	//  192  418:aload           5
	//  193  420:invokeinterface #306 <Method void Cursor.close()>
		return ((List) (arraylist));
	//  194  425:aload           7
	//  195  427:areturn         
		Object obj2;
		obj2;
	//  196  428:astore          6
		break MISSING_BLOCK_LABEL_448;
	//  197  430:goto            448
		obj2;
	//  198  433:astore          6
		throw new RuntimeException("Failed to load writes", ((Throwable) (obj2)));
	//  199  435:new             #155 <Class RuntimeException>
	//  200  438:dup             
	//  201  439:ldc2            #758 <String "Failed to load writes">
	//  202  442:aload           6
	//  203  444:invokespecial   #253 <Method void RuntimeException(String, Throwable)>
	//  204  447:athrow          
		((Cursor) (obj)).close();
	//  205  448:aload           5
	//  206  450:invokeinterface #306 <Method void Cursor.close()>
		throw obj2;
	//  207  455:aload           6
	//  208  457:athrow          
	}

	public void mergeIntoServerCache(Path path, CompoundWrite compoundwrite)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #600 <Method void verifyInsideTransaction()>
		long l = System.currentTimeMillis();
	//    2    4:invokestatic    #282 <Method long System.currentTimeMillis()>
	//    3    7:lstore          5
		compoundwrite = ((CompoundWrite) (compoundwrite.iterator()));
	//    4    9:aload_2         
	//    5   10:invokevirtual   #762 <Method Iterator CompoundWrite.iterator()>
	//    6   13:astore_2        
		int j = 0;
	//    7   14:iconst_0        
	//    8   15:istore          4
		int i;
		java.util.Map.Entry entry;
		for(i = 0; ((Iterator) (compoundwrite)).hasNext(); i += saveNested(path.child((Path)entry.getKey()), (Node)entry.getValue()))
	//*   9   17:iconst_0        
	//*  10   18:istore_3        
	//*  11   19:aload_2         
	//*  12   20:invokeinterface #210 <Method boolean Iterator.hasNext()>
	//*  13   25:ifeq            98
		{
			entry = (java.util.Map.Entry)((Iterator) (compoundwrite)).next();
	//   14   28:aload_2         
	//   15   29:invokeinterface #214 <Method Object Iterator.next()>
	//   16   34:checkcast       #420 <Class java.util.Map$Entry>
	//   17   37:astore          9
			j += removeNested("serverCache", path.child((Path)entry.getKey()));
	//   18   39:iload           4
	//   19   41:aload_0         
	//   20   42:ldc1            #44  <String "serverCache">
	//   21   44:aload_1         
	//   22   45:aload           9
	//   23   47:invokeinterface #423 <Method Object java.util.Map$Entry.getKey()>
	//   24   52:checkcast       #169 <Class Path>
	//   25   55:invokevirtual   #492 <Method Path Path.child(Path)>
	//   26   58:invokespecial   #641 <Method int removeNested(String, Path)>
	//   27   61:iadd            
	//   28   62:istore          4
		}

	//   29   64:iload_3         
	//   30   65:aload_0         
	//   31   66:aload_1         
	//   32   67:aload           9
	//   33   69:invokeinterface #423 <Method Object java.util.Map$Entry.getKey()>
	//   34   74:checkcast       #169 <Class Path>
	//   35   77:invokevirtual   #492 <Method Path Path.child(Path)>
	//   36   80:aload           9
	//   37   82:invokeinterface #426 <Method Object java.util.Map$Entry.getValue()>
	//   38   87:checkcast       #395 <Class Node>
	//   39   90:invokespecial   #553 <Method int saveNested(Path, Node)>
	//   40   93:iadd            
	//   41   94:istore_3        
	//*  42   95:goto            19
		long l1 = System.currentTimeMillis();
	//   43   98:invokestatic    #282 <Method long System.currentTimeMillis()>
	//   44  101:lstore          7
		if(logger.logsDebug())
	//*  45  103:aload_0         
	//*  46  104:getfield        #153 <Field LogWrapper logger>
	//*  47  107:invokevirtual   #344 <Method boolean LogWrapper.logsDebug()>
	//*  48  110:ifeq            163
			logger.debug(String.format("Persisted a total of %d rows and deleted %d rows for a merge at %s in %dms", new Object[] {
				Integer.valueOf(i), Integer.valueOf(j), path.toString(), Long.valueOf(l1 - l)
			}));
	//   49  113:aload_0         
	//   50  114:getfield        #153 <Field LogWrapper logger>
	//   51  117:ldc2            #764 <String "Persisted a total of %d rows and deleted %d rows for a merge at %s in %dms">
	//   52  120:iconst_4        
	//   53  121:anewarray       Object[]
	//   54  124:dup             
	//   55  125:iconst_0        
	//   56  126:iload_3         
	//   57  127:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//   58  130:aastore         
	//   59  131:dup             
	//   60  132:iconst_1        
	//   61  133:iload           4
	//   62  135:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//   63  138:aastore         
	//   64  139:dup             
	//   65  140:iconst_2        
	//   66  141:aload_1         
	//   67  142:invokevirtual   #471 <Method String Path.toString()>
	//   68  145:aastore         
	//   69  146:dup             
	//   70  147:iconst_3        
	//   71  148:lload           7
	//   72  150:lload           5
	//   73  152:lsub            
	//   74  153:invokestatic    #443 <Method Long Long.valueOf(long)>
	//   75  156:aastore         
	//   76  157:invokestatic    #410 <Method String String.format(String, Object[])>
	//   77  160:invokevirtual   #354 <Method void LogWrapper.debug(String)>
	//   78  163:return          
	}

	public void mergeIntoServerCache(Path path, Node node)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #600 <Method void verifyInsideTransaction()>
		updateServerCache(path, node, true);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iconst_1        
	//    6    8:invokespecial   #766 <Method void updateServerCache(Path, Node, boolean)>
	//    7   11:return          
	}

	public void overwriteServerCache(Path path, Node node)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #600 <Method void verifyInsideTransaction()>
		updateServerCache(path, node, false);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iconst_0        
	//    6    8:invokespecial   #766 <Method void updateServerCache(Path, Node, boolean)>
	//    7   11:return          
	}

	public void pruneCache(Path path, PruneForest pruneforest)
	{
		if(!pruneforest.prunesAnything())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #772 <Method boolean PruneForest.prunesAnything()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		verifyInsideTransaction();
	//    4    8:aload_0         
	//    5    9:invokespecial   #600 <Method void verifyInsideTransaction()>
		long l = System.currentTimeMillis();
	//    6   12:invokestatic    #282 <Method long System.currentTimeMillis()>
	//    7   15:lstore          5
		Cursor cursor = loadNestedQuery(path, new String[] {
			"rowid", "path"
		});
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:iconst_2        
	//   11   20:anewarray       String[]
	//   12   23:dup             
	//   13   24:iconst_0        
	//   14   25:ldc1            #39  <String "rowid">
	//   15   27:aastore         
	//   16   28:dup             
	//   17   29:iconst_1        
	//   18   30:ldc1            #36  <String "path">
	//   19   32:aastore         
	//   20   33:invokespecial   #286 <Method Cursor loadNestedQuery(Path, String[])>
	//   21   36:astore          11
		Object obj = ((Object) (new ImmutableTree(((Object) (null)))));
	//   22   38:new             #475 <Class ImmutableTree>
	//   23   41:dup             
	//   24   42:aconst_null     
	//   25   43:invokespecial   #775 <Method void ImmutableTree(Object)>
	//   26   46:astore          9
		Object obj1 = ((Object) (new ImmutableTree(((Object) (null)))));
	//   27   48:new             #475 <Class ImmutableTree>
	//   28   51:dup             
	//   29   52:aconst_null     
	//   30   53:invokespecial   #775 <Method void ImmutableTree(Object)>
	//   31   56:astore          10
		while(cursor.moveToNext()) 
	//*  32   58:aload           11
	//*  33   60:invokeinterface #291 <Method boolean Cursor.moveToNext()>
	//*  34   65:ifeq            304
		{
			long l1 = cursor.getLong(0);
	//   35   68:aload           11
	//   36   70:iconst_0        
	//   37   71:invokeinterface #670 <Method long Cursor.getLong(int)>
	//   38   76:lstore          7
			Path path1 = new Path(cursor.getString(1));
	//   39   78:new             #169 <Class Path>
	//   40   81:dup             
	//   41   82:aload           11
	//   42   84:iconst_1        
	//   43   85:invokeinterface #295 <Method String Cursor.getString(int)>
	//   44   90:invokespecial   #335 <Method void Path(String)>
	//   45   93:astore          12
			if(!path.contains(path1))
	//*  46   95:aload_1         
	//*  47   96:aload           12
	//*  48   98:invokevirtual   #381 <Method boolean Path.contains(Path)>
	//*  49  101:ifne            174
			{
				LogWrapper logwrapper = logger;
	//   50  104:aload_0         
	//   51  105:getfield        #153 <Field LogWrapper logger>
	//   52  108:astore          13
				StringBuilder stringbuilder = new StringBuilder();
	//   53  110:new             #162 <Class StringBuilder>
	//   54  113:dup             
	//   55  114:invokespecial   #199 <Method void StringBuilder()>
	//   56  117:astore          14
				stringbuilder.append("We are pruning at ");
	//   57  119:aload           14
	//   58  121:ldc2            #777 <String "We are pruning at ">
	//   59  124:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   60  127:pop             
				stringbuilder.append(((Object) (path)));
	//   61  128:aload           14
	//   62  130:aload_1         
	//   63  131:invokevirtual   #780 <Method StringBuilder StringBuilder.append(Object)>
	//   64  134:pop             
				stringbuilder.append(" but we have data stored higher up at ");
	//   65  135:aload           14
	//   66  137:ldc2            #782 <String " but we have data stored higher up at ">
	//   67  140:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   68  143:pop             
				stringbuilder.append(((Object) (path1)));
	//   69  144:aload           14
	//   70  146:aload           12
	//   71  148:invokevirtual   #780 <Method StringBuilder StringBuilder.append(Object)>
	//   72  151:pop             
				stringbuilder.append(". Ignoring.");
	//   73  152:aload           14
	//   74  154:ldc2            #784 <String ". Ignoring.">
	//   75  157:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   76  160:pop             
				logwrapper.warn(stringbuilder.toString());
	//   77  161:aload           13
	//   78  163:aload           14
	//   79  165:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   80  168:invokevirtual   #787 <Method void LogWrapper.warn(String)>
			} else
	//*  81  171:goto            58
			{
				Path path2 = Path.getRelative(path, path1);
	//   82  174:aload_1         
	//   83  175:aload           12
	//   84  177:invokestatic    #393 <Method Path Path.getRelative(Path, Path)>
	//   85  180:astore          13
				if(pruneforest.shouldPruneUnkeptDescendants(path2))
	//*  86  182:aload_2         
	//*  87  183:aload           13
	//*  88  185:invokevirtual   #790 <Method boolean PruneForest.shouldPruneUnkeptDescendants(Path)>
	//*  89  188:ifeq            208
					obj = ((Object) (((ImmutableTree) (obj)).set(path2, ((Object) (Long.valueOf(l1))))));
	//   90  191:aload           9
	//   91  193:aload           13
	//   92  195:lload           7
	//   93  197:invokestatic    #443 <Method Long Long.valueOf(long)>
	//   94  200:invokevirtual   #794 <Method ImmutableTree ImmutableTree.set(Path, Object)>
	//   95  203:astore          9
				else
	//*  96  205:goto            58
				if(pruneforest.shouldKeep(path2))
	//*  97  208:aload_2         
	//*  98  209:aload           13
	//*  99  211:invokevirtual   #797 <Method boolean PruneForest.shouldKeep(Path)>
	//* 100  214:ifeq            234
				{
					obj1 = ((Object) (((ImmutableTree) (obj1)).set(path2, ((Object) (Long.valueOf(l1))))));
	//  101  217:aload           10
	//  102  219:aload           13
	//  103  221:lload           7
	//  104  223:invokestatic    #443 <Method Long Long.valueOf(long)>
	//  105  226:invokevirtual   #794 <Method ImmutableTree ImmutableTree.set(Path, Object)>
	//  106  229:astore          10
				} else
	//* 107  231:goto            58
				{
					LogWrapper logwrapper1 = logger;
	//  108  234:aload_0         
	//  109  235:getfield        #153 <Field LogWrapper logger>
	//  110  238:astore          13
					StringBuilder stringbuilder1 = new StringBuilder();
	//  111  240:new             #162 <Class StringBuilder>
	//  112  243:dup             
	//  113  244:invokespecial   #199 <Method void StringBuilder()>
	//  114  247:astore          14
					stringbuilder1.append("We are pruning at ");
	//  115  249:aload           14
	//  116  251:ldc2            #777 <String "We are pruning at ">
	//  117  254:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//  118  257:pop             
					stringbuilder1.append(((Object) (path)));
	//  119  258:aload           14
	//  120  260:aload_1         
	//  121  261:invokevirtual   #780 <Method StringBuilder StringBuilder.append(Object)>
	//  122  264:pop             
					stringbuilder1.append(" and have data at ");
	//  123  265:aload           14
	//  124  267:ldc2            #799 <String " and have data at ">
	//  125  270:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//  126  273:pop             
					stringbuilder1.append(((Object) (path1)));
	//  127  274:aload           14
	//  128  276:aload           12
	//  129  278:invokevirtual   #780 <Method StringBuilder StringBuilder.append(Object)>
	//  130  281:pop             
					stringbuilder1.append(" that isn't marked for pruning or keeping. Ignoring.");
	//  131  282:aload           14
	//  132  284:ldc2            #801 <String " that isn't marked for pruning or keeping. Ignoring.">
	//  133  287:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//  134  290:pop             
					logwrapper1.warn(stringbuilder1.toString());
	//  135  291:aload           13
	//  136  293:aload           14
	//  137  295:invokevirtual   #196 <Method String StringBuilder.toString()>
	//  138  298:invokevirtual   #787 <Method void LogWrapper.warn(String)>
				}
			}
		}
	//* 139  301:goto            58
		int i;
		int j;
		if(!((ImmutableTree) (obj)).isEmpty())
	//* 140  304:aload           9
	//* 141  306:invokevirtual   #802 <Method boolean ImmutableTree.isEmpty()>
	//* 142  309:ifne            507
		{
			ArrayList arraylist = new ArrayList();
	//  143  312:new             #278 <Class ArrayList>
	//  144  315:dup             
	//  145  316:invokespecial   #279 <Method void ArrayList()>
	//  146  319:astore          11
			pruneTreeRecursive(path, Path.getEmptyPath(), ((ImmutableTree) (obj)), ((ImmutableTree) (obj1)), pruneforest, ((List) (arraylist)));
	//  147  321:aload_0         
	//  148  322:aload_1         
	//  149  323:invokestatic    #192 <Method Path Path.getEmptyPath()>
	//  150  326:aload           9
	//  151  328:aload           10
	//  152  330:aload_2         
	//  153  331:aload           11
	//  154  333:invokespecial   #517 <Method void pruneTreeRecursive(Path, Path, ImmutableTree, ImmutableTree, PruneForest, List)>
			pruneforest = ((PruneForest) (((ImmutableTree) (obj)).values()));
	//  155  336:aload           9
	//  156  338:invokevirtual   #806 <Method Collection ImmutableTree.values()>
	//  157  341:astore_2        
			obj = ((Object) (new StringBuilder()));
	//  158  342:new             #162 <Class StringBuilder>
	//  159  345:dup             
	//  160  346:invokespecial   #199 <Method void StringBuilder()>
	//  161  349:astore          9
			((StringBuilder) (obj)).append("rowid IN (");
	//  162  351:aload           9
	//  163  353:ldc2            #808 <String "rowid IN (">
	//  164  356:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//  165  359:pop             
			((StringBuilder) (obj)).append(commaSeparatedList(((Collection) (pruneforest))));
	//  166  360:aload           9
	//  167  362:aload_0         
	//  168  363:aload_2         
	//  169  364:invokespecial   #707 <Method String commaSeparatedList(Collection)>
	//  170  367:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//  171  370:pop             
			((StringBuilder) (obj)).append(")");
	//  172  371:aload           9
	//  173  373:ldc2            #709 <String ")">
	//  174  376:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//  175  379:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  176  380:aload           9
	//  177  382:invokevirtual   #196 <Method String StringBuilder.toString()>
	//  178  385:astore          9
			obj1 = ((Object) (database));
	//  179  387:aload_0         
	//  180  388:getfield        #140 <Field SQLiteDatabase database>
	//  181  391:astore          10
			if(!(obj1 instanceof SQLiteDatabase))
	//* 182  393:aload           10
	//* 183  395:instanceof      #454 <Class SQLiteDatabase>
	//* 184  398:ifne            415
				((SQLiteDatabase) (obj1)).delete("serverCache", ((String) (obj)), ((String []) (null)));
	//  185  401:aload           10
	//  186  403:ldc1            #44  <String "serverCache">
	//  187  405:aload           9
	//  188  407:aconst_null     
	//  189  408:invokevirtual   #526 <Method int SQLiteDatabase.delete(String, String, String[])>
	//  190  411:pop             
			else
	//* 191  412:goto            429
				SQLiteInstrumentation.delete((SQLiteDatabase)obj1, "serverCache", ((String) (obj)), ((String []) (null)));
	//  192  415:aload           10
	//  193  417:checkcast       #454 <Class SQLiteDatabase>
	//  194  420:ldc1            #44  <String "serverCache">
	//  195  422:aload           9
	//  196  424:aconst_null     
	//  197  425:invokestatic    #529 <Method int SQLiteInstrumentation.delete(SQLiteDatabase, String, String, String[])>
	//  198  428:pop             
			Pair pair;
			for(Iterator iterator = ((List) (arraylist)).iterator(); iterator.hasNext(); saveNested(path.child((Path)pair.getFirst()), (Node)pair.getSecond()))
	//* 199  429:aload           11
	//* 200  431:invokeinterface #265 <Method Iterator List.iterator()>
	//* 201  436:astore          9
	//* 202  438:aload           9
	//* 203  440:invokeinterface #210 <Method boolean Iterator.hasNext()>
	//* 204  445:ifeq            488
				pair = (Pair)iterator.next();
	//  205  448:aload           9
	//  206  450:invokeinterface #214 <Method Object Iterator.next()>
	//  207  455:checkcast       #810 <Class Pair>
	//  208  458:astore          10

	//  209  460:aload_0         
	//  210  461:aload_1         
	//  211  462:aload           10
	//  212  464:invokevirtual   #813 <Method Object Pair.getFirst()>
	//  213  467:checkcast       #169 <Class Path>
	//  214  470:invokevirtual   #492 <Method Path Path.child(Path)>
	//  215  473:aload           10
	//  216  475:invokevirtual   #816 <Method Object Pair.getSecond()>
	//  217  478:checkcast       #395 <Class Node>
	//  218  481:invokespecial   #553 <Method int saveNested(Path, Node)>
	//  219  484:pop             
	//* 220  485:goto            438
			i = ((Collection) (pruneforest)).size();
	//  221  488:aload_2         
	//  222  489:invokeinterface #817 <Method int Collection.size()>
	//  223  494:istore_3        
			j = ((List) (arraylist)).size();
	//  224  495:aload           11
	//  225  497:invokeinterface #319 <Method int List.size()>
	//  226  502:istore          4
		} else
	//* 227  504:goto            512
		{
			i = 0;
	//  228  507:iconst_0        
	//  229  508:istore_3        
			j = 0;
	//  230  509:iconst_0        
	//  231  510:istore          4
		}
		long l2 = System.currentTimeMillis();
	//  232  512:invokestatic    #282 <Method long System.currentTimeMillis()>
	//  233  515:lstore          7
		if(logger.logsDebug())
	//* 234  517:aload_0         
	//* 235  518:getfield        #153 <Field LogWrapper logger>
	//* 236  521:invokevirtual   #344 <Method boolean LogWrapper.logsDebug()>
	//* 237  524:ifeq            570
			logger.debug(String.format("Pruned %d rows with %d nodes resaved in %dms", new Object[] {
				Integer.valueOf(i), Integer.valueOf(j), Long.valueOf(l2 - l)
			}));
	//  238  527:aload_0         
	//  239  528:getfield        #153 <Field LogWrapper logger>
	//  240  531:ldc2            #819 <String "Pruned %d rows with %d nodes resaved in %dms">
	//  241  534:iconst_3        
	//  242  535:anewarray       Object[]
	//  243  538:dup             
	//  244  539:iconst_0        
	//  245  540:iload_3         
	//  246  541:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//  247  544:aastore         
	//  248  545:dup             
	//  249  546:iconst_1        
	//  250  547:iload           4
	//  251  549:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//  252  552:aastore         
	//  253  553:dup             
	//  254  554:iconst_2        
	//  255  555:lload           7
	//  256  557:lload           5
	//  257  559:lsub            
	//  258  560:invokestatic    #443 <Method Long Long.valueOf(long)>
	//  259  563:aastore         
	//  260  564:invokestatic    #410 <Method String String.format(String, Object[])>
	//  261  567:invokevirtual   #354 <Method void LogWrapper.debug(String)>
	//  262  570:return          
	}

	public void purgeCache()
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #600 <Method void verifyInsideTransaction()>
		SQLiteDatabase sqlitedatabase = database;
	//    2    4:aload_0         
	//    3    5:getfield        #140 <Field SQLiteDatabase database>
	//    4    8:astore_1        
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*   5    9:aload_1         
	//*   6   10:instanceof      #454 <Class SQLiteDatabase>
	//*   7   13:ifne            28
			sqlitedatabase.delete("serverCache", ((String) (null)), ((String []) (null)));
	//    8   16:aload_1         
	//    9   17:ldc1            #44  <String "serverCache">
	//   10   19:aconst_null     
	//   11   20:aconst_null     
	//   12   21:invokevirtual   #526 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   13   24:pop             
		else
	//*  14   25:goto            40
			SQLiteInstrumentation.delete((SQLiteDatabase)sqlitedatabase, "serverCache", ((String) (null)), ((String []) (null)));
	//   15   28:aload_1         
	//   16   29:checkcast       #454 <Class SQLiteDatabase>
	//   17   32:ldc1            #44  <String "serverCache">
	//   18   34:aconst_null     
	//   19   35:aconst_null     
	//   20   36:invokestatic    #529 <Method int SQLiteInstrumentation.delete(SQLiteDatabase, String, String, String[])>
	//   21   39:pop             
		sqlitedatabase = database;
	//   22   40:aload_0         
	//   23   41:getfield        #140 <Field SQLiteDatabase database>
	//   24   44:astore_1        
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*  25   45:aload_1         
	//*  26   46:instanceof      #454 <Class SQLiteDatabase>
	//*  27   49:ifne            64
			sqlitedatabase.delete("writes", ((String) (null)), ((String []) (null)));
	//   28   52:aload_1         
	//   29   53:ldc1            #76  <String "writes">
	//   30   55:aconst_null     
	//   31   56:aconst_null     
	//   32   57:invokevirtual   #526 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   33   60:pop             
		else
	//*  34   61:goto            76
			SQLiteInstrumentation.delete((SQLiteDatabase)sqlitedatabase, "writes", ((String) (null)), ((String []) (null)));
	//   35   64:aload_1         
	//   36   65:checkcast       #454 <Class SQLiteDatabase>
	//   37   68:ldc1            #76  <String "writes">
	//   38   70:aconst_null     
	//   39   71:aconst_null     
	//   40   72:invokestatic    #529 <Method int SQLiteInstrumentation.delete(SQLiteDatabase, String, String, String[])>
	//   41   75:pop             
		sqlitedatabase = database;
	//   42   76:aload_0         
	//   43   77:getfield        #140 <Field SQLiteDatabase database>
	//   44   80:astore_1        
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*  45   81:aload_1         
	//*  46   82:instanceof      #454 <Class SQLiteDatabase>
	//*  47   85:ifne            100
			sqlitedatabase.delete("trackedQueries", ((String) (null)), ((String []) (null)));
	//   48   88:aload_1         
	//   49   89:ldc1            #70  <String "trackedQueries">
	//   50   91:aconst_null     
	//   51   92:aconst_null     
	//   52   93:invokevirtual   #526 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   53   96:pop             
		else
	//*  54   97:goto            112
			SQLiteInstrumentation.delete((SQLiteDatabase)sqlitedatabase, "trackedQueries", ((String) (null)), ((String []) (null)));
	//   55  100:aload_1         
	//   56  101:checkcast       #454 <Class SQLiteDatabase>
	//   57  104:ldc1            #70  <String "trackedQueries">
	//   58  106:aconst_null     
	//   59  107:aconst_null     
	//   60  108:invokestatic    #529 <Method int SQLiteInstrumentation.delete(SQLiteDatabase, String, String, String[])>
	//   61  111:pop             
		sqlitedatabase = database;
	//   62  112:aload_0         
	//   63  113:getfield        #140 <Field SQLiteDatabase database>
	//   64  116:astore_1        
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*  65  117:aload_1         
	//*  66  118:instanceof      #454 <Class SQLiteDatabase>
	//*  67  121:ifne            134
		{
			sqlitedatabase.delete("trackedKeys", ((String) (null)), ((String []) (null)));
	//   68  124:aload_1         
	//   69  125:ldc1            #53  <String "trackedKeys">
	//   70  127:aconst_null     
	//   71  128:aconst_null     
	//   72  129:invokevirtual   #526 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   73  132:pop             
			return;
	//   74  133:return          
		} else
		{
			SQLiteInstrumentation.delete((SQLiteDatabase)sqlitedatabase, "trackedKeys", ((String) (null)), ((String []) (null)));
	//   75  134:aload_1         
	//   76  135:checkcast       #454 <Class SQLiteDatabase>
	//   77  138:ldc1            #53  <String "trackedKeys">
	//   78  140:aconst_null     
	//   79  141:aconst_null     
	//   80  142:invokestatic    #529 <Method int SQLiteInstrumentation.delete(SQLiteDatabase, String, String, String[])>
	//   81  145:pop             
			return;
	//   82  146:return          
		}
	}

	public void removeAllUserWrites()
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #600 <Method void verifyInsideTransaction()>
		long l = System.currentTimeMillis();
	//    2    4:invokestatic    #282 <Method long System.currentTimeMillis()>
	//    3    7:lstore_2        
		SQLiteDatabase sqlitedatabase = database;
	//    4    8:aload_0         
	//    5    9:getfield        #140 <Field SQLiteDatabase database>
	//    6   12:astore          6
		int i;
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*   7   14:aload           6
	//*   8   16:instanceof      #454 <Class SQLiteDatabase>
	//*   9   19:ifne            35
			i = sqlitedatabase.delete("writes", ((String) (null)), ((String []) (null)));
	//   10   22:aload           6
	//   11   24:ldc1            #76  <String "writes">
	//   12   26:aconst_null     
	//   13   27:aconst_null     
	//   14   28:invokevirtual   #526 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   15   31:istore_1        
		else
	//*  16   32:goto            48
			i = SQLiteInstrumentation.delete((SQLiteDatabase)sqlitedatabase, "writes", ((String) (null)), ((String []) (null)));
	//   17   35:aload           6
	//   18   37:checkcast       #454 <Class SQLiteDatabase>
	//   19   40:ldc1            #76  <String "writes">
	//   20   42:aconst_null     
	//   21   43:aconst_null     
	//   22   44:invokestatic    #529 <Method int SQLiteInstrumentation.delete(SQLiteDatabase, String, String, String[])>
	//   23   47:istore_1        
		long l1 = System.currentTimeMillis();
	//   24   48:invokestatic    #282 <Method long System.currentTimeMillis()>
	//   25   51:lstore          4
		if(logger.logsDebug())
	//*  26   53:aload_0         
	//*  27   54:getfield        #153 <Field LogWrapper logger>
	//*  28   57:invokevirtual   #344 <Method boolean LogWrapper.logsDebug()>
	//*  29   60:ifeq            97
			logger.debug(String.format("Deleted %d (all) write(s) in %dms", new Object[] {
				Integer.valueOf(i), Long.valueOf(l1 - l)
			}));
	//   30   63:aload_0         
	//   31   64:getfield        #153 <Field LogWrapper logger>
	//   32   67:ldc2            #823 <String "Deleted %d (all) write(s) in %dms">
	//   33   70:iconst_2        
	//   34   71:anewarray       Object[]
	//   35   74:dup             
	//   36   75:iconst_0        
	//   37   76:iload_1         
	//   38   77:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_1        
	//   42   83:lload           4
	//   43   85:lload_2         
	//   44   86:lsub            
	//   45   87:invokestatic    #443 <Method Long Long.valueOf(long)>
	//   46   90:aastore         
	//   47   91:invokestatic    #410 <Method String String.format(String, Object[])>
	//   48   94:invokevirtual   #354 <Method void LogWrapper.debug(String)>
	//   49   97:return          
	}

	public void removeUserWrite(long l)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #600 <Method void verifyInsideTransaction()>
		long l1 = System.currentTimeMillis();
	//    2    4:invokestatic    #282 <Method long System.currentTimeMillis()>
	//    3    7:lstore          4
		SQLiteDatabase sqlitedatabase = database;
	//    4    9:aload_0         
	//    5   10:getfield        #140 <Field SQLiteDatabase database>
	//    6   13:astore          8
		String as[] = new String[1];
	//    7   15:iconst_1        
	//    8   16:anewarray       String[]
	//    9   19:astore          9
		as[0] = String.valueOf(l);
	//   10   21:aload           9
	//   11   23:iconst_0        
	//   12   24:lload_1         
	//   13   25:invokestatic    #603 <Method String String.valueOf(long)>
	//   14   28:aastore         
		int i;
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*  15   29:aload           8
	//*  16   31:instanceof      #454 <Class SQLiteDatabase>
	//*  17   34:ifne            53
			i = sqlitedatabase.delete("writes", "id = ?", as);
	//   18   37:aload           8
	//   19   39:ldc1            #76  <String "writes">
	//   20   41:ldc2            #605 <String "id = ?">
	//   21   44:aload           9
	//   22   46:invokevirtual   #526 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   23   49:istore_3        
		else
	//*  24   50:goto            69
			i = SQLiteInstrumentation.delete((SQLiteDatabase)sqlitedatabase, "writes", "id = ?", as);
	//   25   53:aload           8
	//   26   55:checkcast       #454 <Class SQLiteDatabase>
	//   27   58:ldc1            #76  <String "writes">
	//   28   60:ldc2            #605 <String "id = ?">
	//   29   63:aload           9
	//   30   65:invokestatic    #529 <Method int SQLiteInstrumentation.delete(SQLiteDatabase, String, String, String[])>
	//   31   68:istore_3        
		long l2 = System.currentTimeMillis();
	//   32   69:invokestatic    #282 <Method long System.currentTimeMillis()>
	//   33   72:lstore          6
		if(logger.logsDebug())
	//*  34   74:aload_0         
	//*  35   75:getfield        #153 <Field LogWrapper logger>
	//*  36   78:invokevirtual   #344 <Method boolean LogWrapper.logsDebug()>
	//*  37   81:ifeq            126
			logger.debug(String.format("Deleted %d write(s) with writeId %d in %dms", new Object[] {
				Integer.valueOf(i), Long.valueOf(l), Long.valueOf(l2 - l1)
			}));
	//   38   84:aload_0         
	//   39   85:getfield        #153 <Field LogWrapper logger>
	//   40   88:ldc2            #826 <String "Deleted %d write(s) with writeId %d in %dms">
	//   41   91:iconst_3        
	//   42   92:anewarray       Object[]
	//   43   95:dup             
	//   44   96:iconst_0        
	//   45   97:iload_3         
	//   46   98:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//   47  101:aastore         
	//   48  102:dup             
	//   49  103:iconst_1        
	//   50  104:lload_1         
	//   51  105:invokestatic    #443 <Method Long Long.valueOf(long)>
	//   52  108:aastore         
	//   53  109:dup             
	//   54  110:iconst_2        
	//   55  111:lload           6
	//   56  113:lload           4
	//   57  115:lsub            
	//   58  116:invokestatic    #443 <Method Long Long.valueOf(long)>
	//   59  119:aastore         
	//   60  120:invokestatic    #410 <Method String String.format(String, Object[])>
	//   61  123:invokevirtual   #354 <Method void LogWrapper.debug(String)>
	//   62  126:return          
	}

	public void resetPreviouslyActiveTrackedQueries(long l)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #600 <Method void verifyInsideTransaction()>
		long l1 = System.currentTimeMillis();
	//    2    4:invokestatic    #282 <Method long System.currentTimeMillis()>
	//    3    7:lstore_3        
		ContentValues contentvalues = new ContentValues();
	//    4    8:new             #579 <Class ContentValues>
	//    5   11:dup             
	//    6   12:invokespecial   #580 <Method void ContentValues()>
	//    7   15:astore          5
		contentvalues.put("active", Boolean.valueOf(false));
	//    8   17:aload           5
	//    9   19:ldc1            #56  <String "active">
	//   10   21:iconst_0        
	//   11   22:invokestatic    #832 <Method Boolean Boolean.valueOf(boolean)>
	//   12   25:invokevirtual   #835 <Method void ContentValues.put(String, Boolean)>
		contentvalues.put("lastUse", Long.valueOf(l));
	//   13   28:aload           5
	//   14   30:ldc1            #63  <String "lastUse">
	//   15   32:lload_1         
	//   16   33:invokestatic    #443 <Method Long Long.valueOf(long)>
	//   17   36:invokevirtual   #608 <Method void ContentValues.put(String, Long)>
		SQLiteDatabase sqlitedatabase = database;
	//   18   39:aload_0         
	//   19   40:getfield        #140 <Field SQLiteDatabase database>
	//   20   43:astore          6
		String as[] = new String[0];
	//   21   45:iconst_0        
	//   22   46:anewarray       String[]
	//   23   49:astore          7
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*  24   51:aload           6
	//*  25   53:instanceof      #454 <Class SQLiteDatabase>
	//*  26   56:ifne            78
			sqlitedatabase.updateWithOnConflict("trackedQueries", contentvalues, "active = 1", as, 5);
	//   27   59:aload           6
	//   28   61:ldc1            #70  <String "trackedQueries">
	//   29   63:aload           5
	//   30   65:ldc2            #837 <String "active = 1">
	//   31   68:aload           7
	//   32   70:iconst_5        
	//   33   71:invokevirtual   #841 <Method int SQLiteDatabase.updateWithOnConflict(String, ContentValues, String, String[], int)>
	//   34   74:pop             
		else
	//*  35   75:goto            97
			SQLiteInstrumentation.updateWithOnConflict((SQLiteDatabase)sqlitedatabase, "trackedQueries", contentvalues, "active = 1", as, 5);
	//   36   78:aload           6
	//   37   80:checkcast       #454 <Class SQLiteDatabase>
	//   38   83:ldc1            #70  <String "trackedQueries">
	//   39   85:aload           5
	//   40   87:ldc2            #837 <String "active = 1">
	//   41   90:aload           7
	//   42   92:iconst_5        
	//   43   93:invokestatic    #844 <Method int SQLiteInstrumentation.updateWithOnConflict(SQLiteDatabase, String, ContentValues, String, String[], int)>
	//   44   96:pop             
		l = System.currentTimeMillis();
	//   45   97:invokestatic    #282 <Method long System.currentTimeMillis()>
	//   46  100:lstore_1        
		if(logger.logsDebug())
	//*  47  101:aload_0         
	//*  48  102:getfield        #153 <Field LogWrapper logger>
	//*  49  105:invokevirtual   #344 <Method boolean LogWrapper.logsDebug()>
	//*  50  108:ifeq            137
			logger.debug(String.format("Reset active tracked queries in %dms", new Object[] {
				Long.valueOf(l - l1)
			}));
	//   51  111:aload_0         
	//   52  112:getfield        #153 <Field LogWrapper logger>
	//   53  115:ldc2            #846 <String "Reset active tracked queries in %dms">
	//   54  118:iconst_1        
	//   55  119:anewarray       Object[]
	//   56  122:dup             
	//   57  123:iconst_0        
	//   58  124:lload_1         
	//   59  125:lload_3         
	//   60  126:lsub            
	//   61  127:invokestatic    #443 <Method Long Long.valueOf(long)>
	//   62  130:aastore         
	//   63  131:invokestatic    #410 <Method String String.format(String, Object[])>
	//   64  134:invokevirtual   #354 <Method void LogWrapper.debug(String)>
	//   65  137:return          
	}

	public void saveTrackedQuery(TrackedQuery trackedquery)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #600 <Method void verifyInsideTransaction()>
		long l = System.currentTimeMillis();
	//    2    4:invokestatic    #282 <Method long System.currentTimeMillis()>
	//    3    7:lstore_2        
		ContentValues contentvalues = new ContentValues();
	//    4    8:new             #579 <Class ContentValues>
	//    5   11:dup             
	//    6   12:invokespecial   #580 <Method void ContentValues()>
	//    7   15:astore          6
		contentvalues.put("id", Long.valueOf(trackedquery.id));
	//    8   17:aload           6
	//    9   19:ldc1            #47  <String "id">
	//   10   21:aload_1         
	//   11   22:getfield        #850 <Field long TrackedQuery.id>
	//   12   25:invokestatic    #443 <Method Long Long.valueOf(long)>
	//   13   28:invokevirtual   #608 <Method void ContentValues.put(String, Long)>
		contentvalues.put("path", pathToKey(trackedquery.querySpec.getPath()));
	//   14   31:aload           6
	//   15   33:ldc1            #36  <String "path">
	//   16   35:aload_1         
	//   17   36:getfield        #854 <Field QuerySpec TrackedQuery.querySpec>
	//   18   39:invokevirtual   #857 <Method Path QuerySpec.getPath()>
	//   19   42:invokestatic    #183 <Method String pathToKey(Path)>
	//   20   45:invokevirtual   #585 <Method void ContentValues.put(String, String)>
		contentvalues.put("queryParams", trackedquery.querySpec.getParams().toJSON());
	//   21   48:aload           6
	//   22   50:ldc1            #66  <String "queryParams">
	//   23   52:aload_1         
	//   24   53:getfield        #854 <Field QuerySpec TrackedQuery.querySpec>
	//   25   56:invokevirtual   #861 <Method QueryParams QuerySpec.getParams()>
	//   26   59:invokevirtual   #866 <Method String QueryParams.toJSON()>
	//   27   62:invokevirtual   #585 <Method void ContentValues.put(String, String)>
		contentvalues.put("lastUse", Long.valueOf(trackedquery.lastUse));
	//   28   65:aload           6
	//   29   67:ldc1            #63  <String "lastUse">
	//   30   69:aload_1         
	//   31   70:getfield        #868 <Field long TrackedQuery.lastUse>
	//   32   73:invokestatic    #443 <Method Long Long.valueOf(long)>
	//   33   76:invokevirtual   #608 <Method void ContentValues.put(String, Long)>
		contentvalues.put("complete", Boolean.valueOf(trackedquery.complete));
	//   34   79:aload           6
	//   35   81:ldc1            #59  <String "complete">
	//   36   83:aload_1         
	//   37   84:getfield        #870 <Field boolean TrackedQuery.complete>
	//   38   87:invokestatic    #832 <Method Boolean Boolean.valueOf(boolean)>
	//   39   90:invokevirtual   #835 <Method void ContentValues.put(String, Boolean)>
		contentvalues.put("active", Boolean.valueOf(trackedquery.active));
	//   40   93:aload           6
	//   41   95:ldc1            #56  <String "active">
	//   42   97:aload_1         
	//   43   98:getfield        #872 <Field boolean TrackedQuery.active>
	//   44  101:invokestatic    #832 <Method Boolean Boolean.valueOf(boolean)>
	//   45  104:invokevirtual   #835 <Method void ContentValues.put(String, Boolean)>
		trackedquery = ((TrackedQuery) (database));
	//   46  107:aload_0         
	//   47  108:getfield        #140 <Field SQLiteDatabase database>
	//   48  111:astore_1        
		if(!(trackedquery instanceof SQLiteDatabase))
	//*  49  112:aload_1         
	//*  50  113:instanceof      #454 <Class SQLiteDatabase>
	//*  51  116:ifne            133
			((SQLiteDatabase) (trackedquery)).insertWithOnConflict("trackedQueries", ((String) (null)), contentvalues, 5);
	//   52  119:aload_1         
	//   53  120:ldc1            #70  <String "trackedQueries">
	//   54  122:aconst_null     
	//   55  123:aload           6
	//   56  125:iconst_5        
	//   57  126:invokevirtual   #592 <Method long SQLiteDatabase.insertWithOnConflict(String, String, ContentValues, int)>
	//   58  129:pop2            
		else
	//*  59  130:goto            147
			SQLiteInstrumentation.insertWithOnConflict((SQLiteDatabase)trackedquery, "trackedQueries", ((String) (null)), contentvalues, 5);
	//   60  133:aload_1         
	//   61  134:checkcast       #454 <Class SQLiteDatabase>
	//   62  137:ldc1            #70  <String "trackedQueries">
	//   63  139:aconst_null     
	//   64  140:aload           6
	//   65  142:iconst_5        
	//   66  143:invokestatic    #595 <Method long SQLiteInstrumentation.insertWithOnConflict(SQLiteDatabase, String, String, ContentValues, int)>
	//   67  146:pop2            
		long l1 = System.currentTimeMillis();
	//   68  147:invokestatic    #282 <Method long System.currentTimeMillis()>
	//   69  150:lstore          4
		if(logger.logsDebug())
	//*  70  152:aload_0         
	//*  71  153:getfield        #153 <Field LogWrapper logger>
	//*  72  156:invokevirtual   #344 <Method boolean LogWrapper.logsDebug()>
	//*  73  159:ifeq            189
			logger.debug(String.format("Saved new tracked query in %dms", new Object[] {
				Long.valueOf(l1 - l)
			}));
	//   74  162:aload_0         
	//   75  163:getfield        #153 <Field LogWrapper logger>
	//   76  166:ldc2            #874 <String "Saved new tracked query in %dms">
	//   77  169:iconst_1        
	//   78  170:anewarray       Object[]
	//   79  173:dup             
	//   80  174:iconst_0        
	//   81  175:lload           4
	//   82  177:lload_2         
	//   83  178:lsub            
	//   84  179:invokestatic    #443 <Method Long Long.valueOf(long)>
	//   85  182:aastore         
	//   86  183:invokestatic    #410 <Method String String.format(String, Object[])>
	//   87  186:invokevirtual   #354 <Method void LogWrapper.debug(String)>
	//   88  189:return          
	}

	public void saveTrackedQueryKeys(long l, Set set)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #600 <Method void verifyInsideTransaction()>
		long l1 = System.currentTimeMillis();
	//    2    4:invokestatic    #282 <Method long System.currentTimeMillis()>
	//    3    7:lstore          4
		SQLiteDatabase sqlitedatabase = database;
	//    4    9:aload_0         
	//    5   10:getfield        #140 <Field SQLiteDatabase database>
	//    6   13:astore          8
		String as[] = new String[1];
	//    7   15:iconst_1        
	//    8   16:anewarray       String[]
	//    9   19:astore          9
		as[0] = String.valueOf(l);
	//   10   21:aload           9
	//   11   23:iconst_0        
	//   12   24:lload_1         
	//   13   25:invokestatic    #603 <Method String String.valueOf(long)>
	//   14   28:aastore         
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*  15   29:aload           8
	//*  16   31:instanceof      #454 <Class SQLiteDatabase>
	//*  17   34:ifne            53
			sqlitedatabase.delete("trackedKeys", "id = ?", as);
	//   18   37:aload           8
	//   19   39:ldc1            #53  <String "trackedKeys">
	//   20   41:ldc2            #605 <String "id = ?">
	//   21   44:aload           9
	//   22   46:invokevirtual   #526 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   23   49:pop             
		else
	//*  24   50:goto            69
			SQLiteInstrumentation.delete((SQLiteDatabase)sqlitedatabase, "trackedKeys", "id = ?", as);
	//   25   53:aload           8
	//   26   55:checkcast       #454 <Class SQLiteDatabase>
	//   27   58:ldc1            #53  <String "trackedKeys">
	//   28   60:ldc2            #605 <String "id = ?">
	//   29   63:aload           9
	//   30   65:invokestatic    #529 <Method int SQLiteInstrumentation.delete(SQLiteDatabase, String, String, String[])>
	//   31   68:pop             
		for(Iterator iterator = set.iterator(); iterator.hasNext();)
	//*  32   69:aload_3         
	//*  33   70:invokeinterface #418 <Method Iterator Set.iterator()>
	//*  34   75:astore          8
	//*  35   77:aload           8
	//*  36   79:invokeinterface #210 <Method boolean Iterator.hasNext()>
	//*  37   84:ifeq            178
		{
			Object obj = ((Object) ((ChildKey)iterator.next()));
	//   38   87:aload           8
	//   39   89:invokeinterface #214 <Method Object Iterator.next()>
	//   40   94:checkcast       #368 <Class ChildKey>
	//   41   97:astore          10
			ContentValues contentvalues = new ContentValues();
	//   42   99:new             #579 <Class ContentValues>
	//   43  102:dup             
	//   44  103:invokespecial   #580 <Method void ContentValues()>
	//   45  106:astore          9
			contentvalues.put("id", Long.valueOf(l));
	//   46  108:aload           9
	//   47  110:ldc1            #47  <String "id">
	//   48  112:lload_1         
	//   49  113:invokestatic    #443 <Method Long Long.valueOf(long)>
	//   50  116:invokevirtual   #608 <Method void ContentValues.put(String, Long)>
			contentvalues.put("key", ((ChildKey) (obj)).asString());
	//   51  119:aload           9
	//   52  121:ldc1            #50  <String "key">
	//   53  123:aload           10
	//   54  125:invokevirtual   #879 <Method String ChildKey.asString()>
	//   55  128:invokevirtual   #585 <Method void ContentValues.put(String, String)>
			obj = ((Object) (database));
	//   56  131:aload_0         
	//   57  132:getfield        #140 <Field SQLiteDatabase database>
	//   58  135:astore          10
			if(!(obj instanceof SQLiteDatabase))
	//*  59  137:aload           10
	//*  60  139:instanceof      #454 <Class SQLiteDatabase>
	//*  61  142:ifne            160
				((SQLiteDatabase) (obj)).insertWithOnConflict("trackedKeys", ((String) (null)), contentvalues, 5);
	//   62  145:aload           10
	//   63  147:ldc1            #53  <String "trackedKeys">
	//   64  149:aconst_null     
	//   65  150:aload           9
	//   66  152:iconst_5        
	//   67  153:invokevirtual   #592 <Method long SQLiteDatabase.insertWithOnConflict(String, String, ContentValues, int)>
	//   68  156:pop2            
			else
	//*  69  157:goto            77
				SQLiteInstrumentation.insertWithOnConflict((SQLiteDatabase)obj, "trackedKeys", ((String) (null)), contentvalues, 5);
	//   70  160:aload           10
	//   71  162:checkcast       #454 <Class SQLiteDatabase>
	//   72  165:ldc1            #53  <String "trackedKeys">
	//   73  167:aconst_null     
	//   74  168:aload           9
	//   75  170:iconst_5        
	//   76  171:invokestatic    #595 <Method long SQLiteInstrumentation.insertWithOnConflict(SQLiteDatabase, String, String, ContentValues, int)>
	//   77  174:pop2            
		}

	//*  78  175:goto            77
		long l2 = System.currentTimeMillis();
	//   79  178:invokestatic    #282 <Method long System.currentTimeMillis()>
	//   80  181:lstore          6
		if(logger.logsDebug())
	//*  81  183:aload_0         
	//*  82  184:getfield        #153 <Field LogWrapper logger>
	//*  83  187:invokevirtual   #344 <Method boolean LogWrapper.logsDebug()>
	//*  84  190:ifeq            240
			logger.debug(String.format("Set %d tracked query keys for tracked query %d in %dms", new Object[] {
				Integer.valueOf(set.size()), Long.valueOf(l), Long.valueOf(l2 - l1)
			}));
	//   85  193:aload_0         
	//   86  194:getfield        #153 <Field LogWrapper logger>
	//   87  197:ldc2            #881 <String "Set %d tracked query keys for tracked query %d in %dms">
	//   88  200:iconst_3        
	//   89  201:anewarray       Object[]
	//   90  204:dup             
	//   91  205:iconst_0        
	//   92  206:aload_3         
	//   93  207:invokeinterface #726 <Method int Set.size()>
	//   94  212:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//   95  215:aastore         
	//   96  216:dup             
	//   97  217:iconst_1        
	//   98  218:lload_1         
	//   99  219:invokestatic    #443 <Method Long Long.valueOf(long)>
	//  100  222:aastore         
	//  101  223:dup             
	//  102  224:iconst_2        
	//  103  225:lload           6
	//  104  227:lload           4
	//  105  229:lsub            
	//  106  230:invokestatic    #443 <Method Long Long.valueOf(long)>
	//  107  233:aastore         
	//  108  234:invokestatic    #410 <Method String String.format(String, Object[])>
	//  109  237:invokevirtual   #354 <Method void LogWrapper.debug(String)>
	//  110  240:return          
	}

	public void saveUserMerge(Path path, CompoundWrite compoundwrite, long l)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #600 <Method void verifyInsideTransaction()>
		long l1 = System.currentTimeMillis();
	//    2    4:invokestatic    #282 <Method long System.currentTimeMillis()>
	//    3    7:lstore          5
		saveWrite(path, l, "m", serializeObject(((Object) (compoundwrite.getValue(true)))));
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:lload_3         
	//    7   12:ldc1            #89  <String "m">
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:iconst_1        
	//   11   17:invokevirtual   #887 <Method Map CompoundWrite.getValue(boolean)>
	//   12   20:invokespecial   #571 <Method byte[] serializeObject(Object)>
	//   13   23:invokespecial   #889 <Method void saveWrite(Path, long, String, byte[])>
		l = System.currentTimeMillis();
	//   14   26:invokestatic    #282 <Method long System.currentTimeMillis()>
	//   15   29:lstore_3        
		if(logger.logsDebug())
	//*  16   30:aload_0         
	//*  17   31:getfield        #153 <Field LogWrapper logger>
	//*  18   34:invokevirtual   #344 <Method boolean LogWrapper.logsDebug()>
	//*  19   37:ifeq            67
			logger.debug(String.format("Persisted user merge in %dms", new Object[] {
				Long.valueOf(l - l1)
			}));
	//   20   40:aload_0         
	//   21   41:getfield        #153 <Field LogWrapper logger>
	//   22   44:ldc2            #891 <String "Persisted user merge in %dms">
	//   23   47:iconst_1        
	//   24   48:anewarray       Object[]
	//   25   51:dup             
	//   26   52:iconst_0        
	//   27   53:lload_3         
	//   28   54:lload           5
	//   29   56:lsub            
	//   30   57:invokestatic    #443 <Method Long Long.valueOf(long)>
	//   31   60:aastore         
	//   32   61:invokestatic    #410 <Method String String.format(String, Object[])>
	//   33   64:invokevirtual   #354 <Method void LogWrapper.debug(String)>
	//   34   67:return          
	}

	public void saveUserOverwrite(Path path, Node node, long l)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #600 <Method void verifyInsideTransaction()>
		long l1 = System.currentTimeMillis();
	//    2    4:invokestatic    #282 <Method long System.currentTimeMillis()>
	//    3    7:lstore          5
		saveWrite(path, l, "o", serializeObject(node.getValue(true)));
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:lload_3         
	//    7   12:ldc1            #92  <String "o">
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:iconst_1        
	//   11   17:invokeinterface #567 <Method Object Node.getValue(boolean)>
	//   12   22:invokespecial   #571 <Method byte[] serializeObject(Object)>
	//   13   25:invokespecial   #889 <Method void saveWrite(Path, long, String, byte[])>
		l = System.currentTimeMillis();
	//   14   28:invokestatic    #282 <Method long System.currentTimeMillis()>
	//   15   31:lstore_3        
		if(logger.logsDebug())
	//*  16   32:aload_0         
	//*  17   33:getfield        #153 <Field LogWrapper logger>
	//*  18   36:invokevirtual   #344 <Method boolean LogWrapper.logsDebug()>
	//*  19   39:ifeq            69
			logger.debug(String.format("Persisted user overwrite in %dms", new Object[] {
				Long.valueOf(l - l1)
			}));
	//   20   42:aload_0         
	//   21   43:getfield        #153 <Field LogWrapper logger>
	//   22   46:ldc2            #895 <String "Persisted user overwrite in %dms">
	//   23   49:iconst_1        
	//   24   50:anewarray       Object[]
	//   25   53:dup             
	//   26   54:iconst_0        
	//   27   55:lload_3         
	//   28   56:lload           5
	//   29   58:lsub            
	//   30   59:invokestatic    #443 <Method Long Long.valueOf(long)>
	//   31   62:aastore         
	//   32   63:invokestatic    #410 <Method String String.format(String, Object[])>
	//   33   66:invokevirtual   #354 <Method void LogWrapper.debug(String)>
	//   34   69:return          
	}

	public Node serverCache(Path path)
	{
		return loadNested(path);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #496 <Method Node loadNested(Path)>
	//    3    5:areturn         
	}

	public long serverCacheEstimatedSizeInBytes()
	{
		Object obj;
		obj = ((Object) (String.format("SELECT sum(length(%s) + length(%s)) FROM %s", new Object[] {
			"value", "path", "serverCache"
		})));
	//    0    0:ldc2            #898 <String "SELECT sum(length(%s) + length(%s)) FROM %s">
	//    1    3:iconst_3        
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:ldc1            #73  <String "value">
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:ldc1            #36  <String "path">
	//   10   16:aastore         
	//   11   17:dup             
	//   12   18:iconst_2        
	//   13   19:ldc1            #44  <String "serverCache">
	//   14   21:aastore         
	//   15   22:invokestatic    #410 <Method String String.format(String, Object[])>
	//   16   25:astore_3        
		SQLiteDatabase sqlitedatabase = database;
	//   17   26:aload_0         
	//   18   27:getfield        #140 <Field SQLiteDatabase database>
	//   19   30:astore          4
		if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*  20   32:aload           4
	//*  21   34:instanceof      #454 <Class SQLiteDatabase>
	//*  22   37:ifne            51
			obj = ((Object) (sqlitedatabase.rawQuery(((String) (obj)), ((String []) (null)))));
	//   23   40:aload           4
	//   24   42:aload_3         
	//   25   43:aconst_null     
	//   26   44:invokevirtual   #902 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   27   47:astore_3        
		else
	//*  28   48:goto            62
			obj = ((Object) (SQLiteInstrumentation.rawQuery((SQLiteDatabase)sqlitedatabase, ((String) (obj)), ((String []) (null)))));
	//   29   51:aload           4
	//   30   53:checkcast       #454 <Class SQLiteDatabase>
	//   31   56:aload_3         
	//   32   57:aconst_null     
	//   33   58:invokestatic    #905 <Method Cursor SQLiteInstrumentation.rawQuery(SQLiteDatabase, String, String[])>
	//   34   61:astore_3        
		long l;
		if(!((Cursor) (obj)).moveToFirst())
			break MISSING_BLOCK_LABEL_87;
	//   35   62:aload_3         
	//   36   63:invokeinterface #908 <Method boolean Cursor.moveToFirst()>
	//   37   68:ifeq            87
		l = ((Cursor) (obj)).getLong(0);
	//   38   71:aload_3         
	//   39   72:iconst_0        
	//   40   73:invokeinterface #670 <Method long Cursor.getLong(int)>
	//   41   78:lstore_1        
		((Cursor) (obj)).close();
	//   42   79:aload_3         
	//   43   80:invokeinterface #306 <Method void Cursor.close()>
		return l;
	//   44   85:lload_1         
	//   45   86:lreturn         
		throw new IllegalStateException("Couldn't read database result!");
	//   46   87:new             #404 <Class IllegalStateException>
	//   47   90:dup             
	//   48   91:ldc2            #910 <String "Couldn't read database result!">
	//   49   94:invokespecial   #411 <Method void IllegalStateException(String)>
	//   50   97:athrow          
		Exception exception;
		exception;
	//   51   98:astore          4
		((Cursor) (obj)).close();
	//   52  100:aload_3         
	//   53  101:invokeinterface #306 <Method void Cursor.close()>
		throw exception;
	//   54  106:aload           4
	//   55  108:athrow          
	}

	public void setTransactionSuccessful()
	{
		database.setTransactionSuccessful();
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field SQLiteDatabase database>
	//    2    4:invokevirtual   #913 <Method void SQLiteDatabase.setTransactionSuccessful()>
	//    3    7:return          
	}

	public void updateTrackedQueryKeys(long l, Set set, Set set1)
	{
		verifyInsideTransaction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #600 <Method void verifyInsideTransaction()>
		long l1 = System.currentTimeMillis();
	//    2    4:invokestatic    #282 <Method long System.currentTimeMillis()>
	//    3    7:lstore          5
		for(Iterator iterator = set1.iterator(); iterator.hasNext();)
	//*   4    9:aload           4
	//*   5   11:invokeinterface #418 <Method Iterator Set.iterator()>
	//*   6   16:astore          9
	//*   7   18:aload           9
	//*   8   20:invokeinterface #210 <Method boolean Iterator.hasNext()>
	//*   9   25:ifeq            112
		{
			ChildKey childkey = (ChildKey)iterator.next();
	//   10   28:aload           9
	//   11   30:invokeinterface #214 <Method Object Iterator.next()>
	//   12   35:checkcast       #368 <Class ChildKey>
	//   13   38:astore          10
			SQLiteDatabase sqlitedatabase = database;
	//   14   40:aload_0         
	//   15   41:getfield        #140 <Field SQLiteDatabase database>
	//   16   44:astore          11
			String as[] = new String[2];
	//   17   46:iconst_2        
	//   18   47:anewarray       String[]
	//   19   50:astore          12
			as[0] = String.valueOf(l);
	//   20   52:aload           12
	//   21   54:iconst_0        
	//   22   55:lload_1         
	//   23   56:invokestatic    #603 <Method String String.valueOf(long)>
	//   24   59:aastore         
			as[1] = childkey.asString();
	//   25   60:aload           12
	//   26   62:iconst_1        
	//   27   63:aload           10
	//   28   65:invokevirtual   #879 <Method String ChildKey.asString()>
	//   29   68:aastore         
			if(!(sqlitedatabase instanceof SQLiteDatabase))
	//*  30   69:aload           11
	//*  31   71:instanceof      #454 <Class SQLiteDatabase>
	//*  32   74:ifne            93
				sqlitedatabase.delete("trackedKeys", "id = ? AND key = ?", as);
	//   33   77:aload           11
	//   34   79:ldc1            #53  <String "trackedKeys">
	//   35   81:ldc2            #917 <String "id = ? AND key = ?">
	//   36   84:aload           12
	//   37   86:invokevirtual   #526 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   38   89:pop             
			else
	//*  39   90:goto            18
				SQLiteInstrumentation.delete((SQLiteDatabase)sqlitedatabase, "trackedKeys", "id = ? AND key = ?", as);
	//   40   93:aload           11
	//   41   95:checkcast       #454 <Class SQLiteDatabase>
	//   42   98:ldc1            #53  <String "trackedKeys">
	//   43  100:ldc2            #917 <String "id = ? AND key = ?">
	//   44  103:aload           12
	//   45  105:invokestatic    #529 <Method int SQLiteInstrumentation.delete(SQLiteDatabase, String, String, String[])>
	//   46  108:pop             
		}

	//*  47  109:goto            18
		for(Iterator iterator1 = set.iterator(); iterator1.hasNext();)
	//*  48  112:aload_3         
	//*  49  113:invokeinterface #418 <Method Iterator Set.iterator()>
	//*  50  118:astore          9
	//*  51  120:aload           9
	//*  52  122:invokeinterface #210 <Method boolean Iterator.hasNext()>
	//*  53  127:ifeq            221
		{
			Object obj = ((Object) ((ChildKey)iterator1.next()));
	//   54  130:aload           9
	//   55  132:invokeinterface #214 <Method Object Iterator.next()>
	//   56  137:checkcast       #368 <Class ChildKey>
	//   57  140:astore          11
			ContentValues contentvalues = new ContentValues();
	//   58  142:new             #579 <Class ContentValues>
	//   59  145:dup             
	//   60  146:invokespecial   #580 <Method void ContentValues()>
	//   61  149:astore          10
			contentvalues.put("id", Long.valueOf(l));
	//   62  151:aload           10
	//   63  153:ldc1            #47  <String "id">
	//   64  155:lload_1         
	//   65  156:invokestatic    #443 <Method Long Long.valueOf(long)>
	//   66  159:invokevirtual   #608 <Method void ContentValues.put(String, Long)>
			contentvalues.put("key", ((ChildKey) (obj)).asString());
	//   67  162:aload           10
	//   68  164:ldc1            #50  <String "key">
	//   69  166:aload           11
	//   70  168:invokevirtual   #879 <Method String ChildKey.asString()>
	//   71  171:invokevirtual   #585 <Method void ContentValues.put(String, String)>
			obj = ((Object) (database));
	//   72  174:aload_0         
	//   73  175:getfield        #140 <Field SQLiteDatabase database>
	//   74  178:astore          11
			if(!(obj instanceof SQLiteDatabase))
	//*  75  180:aload           11
	//*  76  182:instanceof      #454 <Class SQLiteDatabase>
	//*  77  185:ifne            203
				((SQLiteDatabase) (obj)).insertWithOnConflict("trackedKeys", ((String) (null)), contentvalues, 5);
	//   78  188:aload           11
	//   79  190:ldc1            #53  <String "trackedKeys">
	//   80  192:aconst_null     
	//   81  193:aload           10
	//   82  195:iconst_5        
	//   83  196:invokevirtual   #592 <Method long SQLiteDatabase.insertWithOnConflict(String, String, ContentValues, int)>
	//   84  199:pop2            
			else
	//*  85  200:goto            120
				SQLiteInstrumentation.insertWithOnConflict((SQLiteDatabase)obj, "trackedKeys", ((String) (null)), contentvalues, 5);
	//   86  203:aload           11
	//   87  205:checkcast       #454 <Class SQLiteDatabase>
	//   88  208:ldc1            #53  <String "trackedKeys">
	//   89  210:aconst_null     
	//   90  211:aload           10
	//   91  213:iconst_5        
	//   92  214:invokestatic    #595 <Method long SQLiteInstrumentation.insertWithOnConflict(SQLiteDatabase, String, String, ContentValues, int)>
	//   93  217:pop2            
		}

	//*  94  218:goto            120
		long l2 = System.currentTimeMillis();
	//   95  221:invokestatic    #282 <Method long System.currentTimeMillis()>
	//   96  224:lstore          7
		if(logger.logsDebug())
	//*  97  226:aload_0         
	//*  98  227:getfield        #153 <Field LogWrapper logger>
	//*  99  230:invokevirtual   #344 <Method boolean LogWrapper.logsDebug()>
	//* 100  233:ifeq            296
			logger.debug(String.format("Updated tracked query keys (%d added, %d removed) for tracked query id %d in %dms", new Object[] {
				Integer.valueOf(set.size()), Integer.valueOf(set1.size()), Long.valueOf(l), Long.valueOf(l2 - l1)
			}));
	//  101  236:aload_0         
	//  102  237:getfield        #153 <Field LogWrapper logger>
	//  103  240:ldc2            #919 <String "Updated tracked query keys (%d added, %d removed) for tracked query id %d in %dms">
	//  104  243:iconst_4        
	//  105  244:anewarray       Object[]
	//  106  247:dup             
	//  107  248:iconst_0        
	//  108  249:aload_3         
	//  109  250:invokeinterface #726 <Method int Set.size()>
	//  110  255:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//  111  258:aastore         
	//  112  259:dup             
	//  113  260:iconst_1        
	//  114  261:aload           4
	//  115  263:invokeinterface #726 <Method int Set.size()>
	//  116  268:invokestatic    #434 <Method Integer Integer.valueOf(int)>
	//  117  271:aastore         
	//  118  272:dup             
	//  119  273:iconst_2        
	//  120  274:lload_1         
	//  121  275:invokestatic    #443 <Method Long Long.valueOf(long)>
	//  122  278:aastore         
	//  123  279:dup             
	//  124  280:iconst_3        
	//  125  281:lload           7
	//  126  283:lload           5
	//  127  285:lsub            
	//  128  286:invokestatic    #443 <Method Long Long.valueOf(long)>
	//  129  289:aastore         
	//  130  290:invokestatic    #410 <Method String String.format(String, Object[])>
	//  131  293:invokevirtual   #354 <Method void LogWrapper.debug(String)>
	//  132  296:return          
	}

	static final boolean $assertionsDisabled = false;
	private static final int CHILDREN_NODE_SPLIT_SIZE_THRESHOLD = 16384;
	private static final String FIRST_PART_KEY = ".part-0000";
	private static final String LOGGER_COMPONENT = "Persistence";
	private static final String PART_KEY_FORMAT = ".part-%04d";
	private static final String PART_KEY_PREFIX = ".part-";
	private static final String PATH_COLUMN_NAME = "path";
	private static final String ROW_ID_COLUMN_NAME = "rowid";
	private static final int ROW_SPLIT_SIZE = 0x40000;
	private static final String SERVER_CACHE_TABLE = "serverCache";
	private static final String TRACKED_KEYS_ID_COLUMN_NAME = "id";
	private static final String TRACKED_KEYS_KEY_COLUMN_NAME = "key";
	private static final String TRACKED_KEYS_TABLE = "trackedKeys";
	private static final String TRACKED_QUERY_ACTIVE_COLUMN_NAME = "active";
	private static final String TRACKED_QUERY_COMPLETE_COLUMN_NAME = "complete";
	private static final String TRACKED_QUERY_ID_COLUMN_NAME = "id";
	private static final String TRACKED_QUERY_LAST_USE_COLUMN_NAME = "lastUse";
	private static final String TRACKED_QUERY_PARAMS_COLUMN_NAME = "queryParams";
	private static final String TRACKED_QUERY_PATH_COLUMN_NAME = "path";
	private static final String TRACKED_QUERY_TABLE = "trackedQueries";
	private static final String VALUE_COLUMN_NAME = "value";
	private static final String WRITES_TABLE = "writes";
	private static final String WRITE_ID_COLUMN_NAME = "id";
	private static final String WRITE_NODE_COLUMN_NAME = "node";
	private static final String WRITE_PART_COLUMN_NAME = "part";
	private static final String WRITE_TYPE_COLUMN_NAME = "type";
	private static final String WRITE_TYPE_MERGE = "m";
	private static final String WRITE_TYPE_OVERWRITE = "o";
	private static final String createServerCache = "CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);";
	private static final String createTrackedKeys = "CREATE TABLE trackedKeys (id INTEGER, key TEXT);";
	private static final String createTrackedQueries = "CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);";
	private static final String createWrites = "CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));";
	private final SQLiteDatabase database;
	private final ObjectMapper jsonMapper = new ObjectMapper();
	private final LogWrapper logger;
	private long transactionStart;

	static 
	{
	//    0    0:return          
	}
}
