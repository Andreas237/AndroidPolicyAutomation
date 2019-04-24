// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.db.sqlite;

import android.database.sqlite.SQLiteException;
import co.touchlab.squeaky.db.SQLiteStatement;

public class SQLiteStatementImpl
	implements SQLiteStatement
{

	public SQLiteStatementImpl(android.database.sqlite.SQLiteStatement sqlitestatement)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		stmt = sqlitestatement;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field android.database.sqlite.SQLiteStatement stmt>
	//    5    9:return          
	}

	public void bindBlob(int i, byte abyte0[])
	{
		stmt.bindBlob(i, abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field android.database.sqlite.SQLiteStatement stmt>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #22  <Method void android.database.sqlite.SQLiteStatement.bindBlob(int, byte[])>
	//    5    9:return          
	}

	public void bindDouble(int i, double d)
	{
		stmt.bindDouble(i, d);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field android.database.sqlite.SQLiteStatement stmt>
	//    2    4:iload_1         
	//    3    5:dload_2         
	//    4    6:invokevirtual   #26  <Method void android.database.sqlite.SQLiteStatement.bindDouble(int, double)>
	//    5    9:return          
	}

	public void bindLong(int i, long l)
	{
		stmt.bindLong(i, l);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field android.database.sqlite.SQLiteStatement stmt>
	//    2    4:iload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #30  <Method void android.database.sqlite.SQLiteStatement.bindLong(int, long)>
	//    5    9:return          
	}

	public void bindNull(int i)
	{
		stmt.bindNull(i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field android.database.sqlite.SQLiteStatement stmt>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #34  <Method void android.database.sqlite.SQLiteStatement.bindNull(int)>
	//    4    8:return          
	}

	public void bindString(int i, String s)
	{
		stmt.bindString(i, s);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field android.database.sqlite.SQLiteStatement stmt>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #38  <Method void android.database.sqlite.SQLiteStatement.bindString(int, String)>
	//    5    9:return          
	}

	public void clearBindings()
	{
		stmt.clearBindings();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field android.database.sqlite.SQLiteStatement stmt>
	//    2    4:invokevirtual   #41  <Method void android.database.sqlite.SQLiteStatement.clearBindings()>
	//    3    7:return          
	}

	public void close()
	{
		stmt.close();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field android.database.sqlite.SQLiteStatement stmt>
	//    2    4:invokevirtual   #44  <Method void android.database.sqlite.SQLiteStatement.close()>
	//    3    7:return          
	}

	public long executeInsert()
		throws SQLiteException
	{
		return stmt.executeInsert();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field android.database.sqlite.SQLiteStatement stmt>
	//    2    4:invokevirtual   #50  <Method long android.database.sqlite.SQLiteStatement.executeInsert()>
	//    3    7:lreturn         
	}

	public long executeUpdateDelete()
		throws SQLiteException
	{
		return (long)stmt.executeUpdateDelete();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field android.database.sqlite.SQLiteStatement stmt>
	//    2    4:invokevirtual   #55  <Method int android.database.sqlite.SQLiteStatement.executeUpdateDelete()>
	//    3    7:i2l             
	//    4    8:lreturn         
	}

	private final android.database.sqlite.SQLiteStatement stmt;
}
