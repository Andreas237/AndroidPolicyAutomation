// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database:
//			DatabaseWrapper, AndroidDatabaseStatement, DatabaseStatement

public class AndroidDatabase
	implements DatabaseWrapper
{

	AndroidDatabase(SQLiteDatabase sqlitedatabase)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		database = sqlitedatabase;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field SQLiteDatabase database>
	//    5    9:return          
	}

	public static AndroidDatabase from(SQLiteDatabase sqlitedatabase)
	{
		return new AndroidDatabase(sqlitedatabase);
	//    0    0:new             #2   <Class AndroidDatabase>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #22  <Method void AndroidDatabase(SQLiteDatabase)>
	//    4    8:areturn         
	}

	public void beginTransaction()
	{
		database.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SQLiteDatabase database>
	//    2    4:invokevirtual   #27  <Method void SQLiteDatabase.beginTransaction()>
	//    3    7:return          
	}

	public DatabaseStatement compileStatement(String s)
	{
		return ((DatabaseStatement) (AndroidDatabaseStatement.from(database.compileStatement(s), database)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SQLiteDatabase database>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #32  <Method android.database.sqlite.SQLiteStatement SQLiteDatabase.compileStatement(String)>
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field SQLiteDatabase database>
	//    6   12:invokestatic    #37  <Method AndroidDatabaseStatement AndroidDatabaseStatement.from(android.database.sqlite.SQLiteStatement, SQLiteDatabase)>
	//    7   15:areturn         
	}

	public int delete(String s, String s1, String as[])
	{
		return database.delete(s, s1, as);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SQLiteDatabase database>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #42  <Method int SQLiteDatabase.delete(String, String, String[])>
	//    6   10:ireturn         
	}

	public void endTransaction()
	{
		database.endTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SQLiteDatabase database>
	//    2    4:invokevirtual   #45  <Method void SQLiteDatabase.endTransaction()>
	//    3    7:return          
	}

	public void execSQL(String s)
	{
		database.execSQL(s);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SQLiteDatabase database>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #49  <Method void SQLiteDatabase.execSQL(String)>
	//    4    8:return          
	}

	public SQLiteDatabase getDatabase()
	{
		return database;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SQLiteDatabase database>
	//    2    4:areturn         
	}

	public int getVersion()
	{
		return database.getVersion();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SQLiteDatabase database>
	//    2    4:invokevirtual   #55  <Method int SQLiteDatabase.getVersion()>
	//    3    7:ireturn         
	}

	public long insertWithOnConflict(String s, String s1, ContentValues contentvalues, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 8)
	//*   0    0:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          8
	//*   2    5:icmplt          21
			return database.insertWithOnConflict(s, s1, contentvalues, i);
	//    3    8:aload_0         
	//    4    9:getfield        #16  <Field SQLiteDatabase database>
	//    5   12:aload_1         
	//    6   13:aload_2         
	//    7   14:aload_3         
	//    8   15:iload           4
	//    9   17:invokevirtual   #65  <Method long SQLiteDatabase.insertWithOnConflict(String, String, ContentValues, int)>
	//   10   20:lreturn         
		else
			return database.insert(s, s1, contentvalues);
	//   11   21:aload_0         
	//   12   22:getfield        #16  <Field SQLiteDatabase database>
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:aload_3         
	//   16   28:invokevirtual   #69  <Method long SQLiteDatabase.insert(String, String, ContentValues)>
	//   17   31:lreturn         
	}

	public Cursor query(String s, String as[], String s1, String as1[], String s2, String s3, String s4)
	{
		return database.query(s, as, s1, as1, s2, s3, s4);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SQLiteDatabase database>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:aload           7
	//    9   15:invokevirtual   #73  <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   10   18:areturn         
	}

	public Cursor rawQuery(String s, String as[])
	{
		return database.rawQuery(s, as);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SQLiteDatabase database>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #77  <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//    5    9:areturn         
	}

	public void setTransactionSuccessful()
	{
		database.setTransactionSuccessful();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SQLiteDatabase database>
	//    2    4:invokevirtual   #80  <Method void SQLiteDatabase.setTransactionSuccessful()>
	//    3    7:return          
	}

	public long updateWithOnConflict(String s, ContentValues contentvalues, String s1, String as[], int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 8)
	//*   0    0:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          8
	//*   2    5:icmplt          24
			return (long)database.updateWithOnConflict(s, contentvalues, s1, as, i);
	//    3    8:aload_0         
	//    4    9:getfield        #16  <Field SQLiteDatabase database>
	//    5   12:aload_1         
	//    6   13:aload_2         
	//    7   14:aload_3         
	//    8   15:aload           4
	//    9   17:iload           5
	//   10   19:invokevirtual   #85  <Method int SQLiteDatabase.updateWithOnConflict(String, ContentValues, String, String[], int)>
	//   11   22:i2l             
	//   12   23:lreturn         
		else
			return (long)database.update(s, contentvalues, s1, as);
	//   13   24:aload_0         
	//   14   25:getfield        #16  <Field SQLiteDatabase database>
	//   15   28:aload_1         
	//   16   29:aload_2         
	//   17   30:aload_3         
	//   18   31:aload           4
	//   19   33:invokevirtual   #89  <Method int SQLiteDatabase.update(String, ContentValues, String, String[])>
	//   20   36:i2l             
	//   21   37:lreturn         
	}

	private final SQLiteDatabase database;
}
