// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package example;

import android.content.Context;
import android.util.Log;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteOpenHelper;

public class EventDataSQLHelper extends SQLiteOpenHelper
{

	public EventDataSQLHelper(Context context)
	{
		super(context, "events.db", ((net.sqlcipher.database.SQLiteDatabase.CursorFactory) (null)), 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #8   <String "events.db">
	//    3    4:aconst_null     
	//    4    5:iconst_1        
	//    5    6:invokespecial   #25  <Method void SQLiteOpenHelper(Context, String, net.sqlcipher.database.SQLiteDatabase$CursorFactory, int)>
	//    6    9:return          
	}

	public void onCreate(SQLiteDatabase sqlitedatabase)
	{
		Log.d("EventsData", (new StringBuilder()).append("onCreate: ").append("create table events( _id integer primary key autoincrement, time integer, title text not null);").toString());
	//    0    0:ldc1            #30  <String "EventsData">
	//    1    2:new             #32  <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #35  <Method void StringBuilder()>
	//    4    9:ldc1            #37  <String "onCreate: ">
	//    5   11:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc1            #43  <String "create table events( _id integer primary key autoincrement, time integer, title text not null);">
	//    7   16:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #47  <Method String StringBuilder.toString()>
	//    9   22:invokestatic    #53  <Method int Log.d(String, String)>
	//   10   25:pop             
		sqlitedatabase.execSQL("create table events( _id integer primary key autoincrement, time integer, title text not null);");
	//   11   26:aload_1         
	//   12   27:ldc1            #43  <String "create table events( _id integer primary key autoincrement, time integer, title text not null);">
	//   13   29:invokevirtual   #59  <Method void SQLiteDatabase.execSQL(String)>
	//   14   32:return          
	}

	public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
	{
		if(i < j)
	//*   0    0:iload_2         
	//*   1    1:iload_3         
	//*   2    2:icmplt          6
	//*   3    5:return          
		{
			String s = null;
	//    4    6:aconst_null     
	//    5    7:astore          4
			if(i == 1)
	//*   6    9:iload_2         
	//*   7   10:iconst_1        
	//*   8   11:icmpne          18
				s = "alter table events add note text;";
	//    9   14:ldc1            #63  <String "alter table events add note text;">
	//   10   16:astore          4
			if(i == 2)
	//*  11   18:iload_2         
	//*  12   19:iconst_2        
	//*  13   20:icmpne          27
				s = "";
	//   14   23:ldc1            #65  <String "">
	//   15   25:astore          4
			Log.d("EventsData", (new StringBuilder()).append("onUpgrade\t: ").append(s).toString());
	//   16   27:ldc1            #30  <String "EventsData">
	//   17   29:new             #32  <Class StringBuilder>
	//   18   32:dup             
	//   19   33:invokespecial   #35  <Method void StringBuilder()>
	//   20   36:ldc1            #67  <String "onUpgrade\t: ">
	//   21   38:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   22   41:aload           4
	//   23   43:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   24   46:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   25   49:invokestatic    #53  <Method int Log.d(String, String)>
	//   26   52:pop             
			if(s != null)
	//*  27   53:aload           4
	//*  28   55:ifnull          5
			{
				sqlitedatabase.execSQL(s);
	//   29   58:aload_1         
	//   30   59:aload           4
	//   31   61:invokevirtual   #59  <Method void SQLiteDatabase.execSQL(String)>
				return;
	//   32   64:return          
			}
		}
	}

	private static final String DATABASE_NAME = "events.db";
	private static final int DATABASE_VERSION = 1;
	public static final String TABLE = "events";
	public static final String TIME = "time";
	public static final String TITLE = "title";
}
