// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package example;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import net.sqlcipher.database.SQLiteDatabase;

// Referenced classes of package example:
//			EventDataSQLHelper

public class SQLDemoActivity extends Activity
{

	public SQLDemoActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Activity()>
	//    2    4:return          
	}

	private void addEvent(String s, SQLiteDatabase sqlitedatabase)
	{
		ContentValues contentvalues = new ContentValues();
	//    0    0:new             #15  <Class ContentValues>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void ContentValues()>
	//    3    7:astore_3        
		contentvalues.put("time", Long.valueOf(System.currentTimeMillis()));
	//    4    8:aload_3         
	//    5    9:ldc1            #18  <String "time">
	//    6   11:invokestatic    #24  <Method long System.currentTimeMillis()>
	//    7   14:invokestatic    #30  <Method Long Long.valueOf(long)>
	//    8   17:invokevirtual   #34  <Method void ContentValues.put(String, Long)>
		contentvalues.put("title", s);
	//    9   20:aload_3         
	//   10   21:ldc1            #36  <String "title">
	//   11   23:aload_1         
	//   12   24:invokevirtual   #39  <Method void ContentValues.put(String, String)>
		sqlitedatabase.insert("events", ((String) (null)), contentvalues);
	//   13   27:aload_2         
	//   14   28:ldc1            #41  <String "events">
	//   15   30:aconst_null     
	//   16   31:aload_3         
	//   17   32:invokevirtual   #47  <Method long SQLiteDatabase.insert(String, String, ContentValues)>
	//   18   35:pop2            
	//   19   36:return          
	}

	private Cursor getEvents(SQLiteDatabase sqlitedatabase)
	{
		sqlitedatabase = ((SQLiteDatabase) (sqlitedatabase.query("events", ((String []) (null)), ((String) (null)), ((String []) (null)), ((String) (null)), ((String) (null)), ((String) (null)))));
	//    0    0:aload_1         
	//    1    1:ldc1            #41  <String "events">
	//    2    3:aconst_null     
	//    3    4:aconst_null     
	//    4    5:aconst_null     
	//    5    6:aconst_null     
	//    6    7:aconst_null     
	//    7    8:aconst_null     
	//    8    9:invokevirtual   #53  <Method net.sqlcipher.Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//    9   12:astore_1        
		startManagingCursor(((Cursor) (sqlitedatabase)));
	//   10   13:aload_0         
	//   11   14:aload_1         
	//   12   15:invokevirtual   #57  <Method void startManagingCursor(Cursor)>
		return ((Cursor) (sqlitedatabase));
	//   13   18:aload_1         
	//   14   19:areturn         
	}

	private void showEvents(Cursor cursor)
	{
		StringBuilder stringbuilder = new StringBuilder("Saved Events:\n\n");
	//    0    0:new             #60  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #62  <String "Saved Events:\n\n">
	//    3    6:invokespecial   #65  <Method void StringBuilder(String)>
	//    4    9:astore          6
		long l;
		long l1;
		String s;
		for(; cursor.moveToNext(); stringbuilder.append((new StringBuilder()).append(l).append(": ").append(l1).append(": ").append(s).append("\n").toString()))
	//*   5   11:aload_1         
	//*   6   12:invokeinterface #71  <Method boolean Cursor.moveToNext()>
	//*   7   17:ifeq            94
		{
			l = cursor.getLong(0);
	//    8   20:aload_1         
	//    9   21:iconst_0        
	//   10   22:invokeinterface #75  <Method long Cursor.getLong(int)>
	//   11   27:lstore_2        
			l1 = cursor.getLong(1);
	//   12   28:aload_1         
	//   13   29:iconst_1        
	//   14   30:invokeinterface #75  <Method long Cursor.getLong(int)>
	//   15   35:lstore          4
			s = cursor.getString(2);
	//   16   37:aload_1         
	//   17   38:iconst_2        
	//   18   39:invokeinterface #79  <Method String Cursor.getString(int)>
	//   19   44:astore          7
		}

	//   20   46:aload           6
	//   21   48:new             #60  <Class StringBuilder>
	//   22   51:dup             
	//   23   52:invokespecial   #80  <Method void StringBuilder()>
	//   24   55:lload_2         
	//   25   56:invokevirtual   #84  <Method StringBuilder StringBuilder.append(long)>
	//   26   59:ldc1            #86  <String ": ">
	//   27   61:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   28   64:lload           4
	//   29   66:invokevirtual   #84  <Method StringBuilder StringBuilder.append(long)>
	//   30   69:ldc1            #86  <String ": ">
	//   31   71:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   32   74:aload           7
	//   33   76:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   34   79:ldc1            #91  <String "\n">
	//   35   81:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   36   84:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   37   87:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   38   90:pop             
	//*  39   91:goto            11
		Log.i("sqldemo", stringbuilder.toString());
	//   40   94:ldc1            #97  <String "sqldemo">
	//   41   96:aload           6
	//   42   98:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   43  101:invokestatic    #103 <Method int Log.i(String, String)>
	//   44  104:pop             
	//   45  105:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #107 <Method void Activity.onCreate(Bundle)>
		SQLiteDatabase.loadLibs(((android.content.Context) (this)));
	//    3    5:aload_0         
	//    4    6:invokestatic    #111 <Method void SQLiteDatabase.loadLibs(android.content.Context)>
		eventsData = new EventDataSQLHelper(((android.content.Context) (this)));
	//    5    9:aload_0         
	//    6   10:new             #113 <Class EventDataSQLHelper>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #115 <Method void EventDataSQLHelper(android.content.Context)>
	//   10   18:putfield        #117 <Field EventDataSQLHelper eventsData>
		bundle = ((Bundle) (eventsData.getWritableDatabase("foo123")));
	//   11   21:aload_0         
	//   12   22:getfield        #117 <Field EventDataSQLHelper eventsData>
	//   13   25:ldc1            #119 <String "foo123">
	//   14   27:invokevirtual   #123 <Method SQLiteDatabase EventDataSQLHelper.getWritableDatabase(String)>
	//   15   30:astore_1        
		for(int i = 1; i < 100; i++)
	//*  16   31:iconst_1        
	//*  17   32:istore_2        
	//*  18   33:iload_2         
	//*  19   34:bipush          100
	//*  20   36:icmpge          70
			addEvent((new StringBuilder()).append("Hello Android Event: ").append(i).toString(), ((SQLiteDatabase) (bundle)));
	//   21   39:aload_0         
	//   22   40:new             #60  <Class StringBuilder>
	//   23   43:dup             
	//   24   44:invokespecial   #80  <Method void StringBuilder()>
	//   25   47:ldc1            #125 <String "Hello Android Event: ">
	//   26   49:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   27   52:iload_2         
	//   28   53:invokevirtual   #128 <Method StringBuilder StringBuilder.append(int)>
	//   29   56:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   30   59:aload_1         
	//   31   60:invokespecial   #130 <Method void addEvent(String, SQLiteDatabase)>

	//   32   63:iload_2         
	//   33   64:iconst_1        
	//   34   65:iadd            
	//   35   66:istore_2        
	//*  36   67:goto            33
		((SQLiteDatabase) (bundle)).close();
	//   37   70:aload_1         
	//   38   71:invokevirtual   #133 <Method void SQLiteDatabase.close()>
		bundle = ((Bundle) (eventsData.getReadableDatabase("foo123")));
	//   39   74:aload_0         
	//   40   75:getfield        #117 <Field EventDataSQLHelper eventsData>
	//   41   78:ldc1            #119 <String "foo123">
	//   42   80:invokevirtual   #136 <Method SQLiteDatabase EventDataSQLHelper.getReadableDatabase(String)>
	//   43   83:astore_1        
		showEvents(getEvents(((SQLiteDatabase) (bundle))));
	//   44   84:aload_0         
	//   45   85:aload_0         
	//   46   86:aload_1         
	//   47   87:invokespecial   #138 <Method Cursor getEvents(SQLiteDatabase)>
	//   48   90:invokespecial   #140 <Method void showEvents(Cursor)>
		((SQLiteDatabase) (bundle)).close();
	//   49   93:aload_1         
	//   50   94:invokevirtual   #133 <Method void SQLiteDatabase.close()>
	//   51   97:return          
	}

	public void onDestroy()
	{
		eventsData.close();
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field EventDataSQLHelper eventsData>
	//    2    4:invokevirtual   #142 <Method void EventDataSQLHelper.close()>
	//    3    7:return          
	}

	EventDataSQLHelper eventsData;
}
