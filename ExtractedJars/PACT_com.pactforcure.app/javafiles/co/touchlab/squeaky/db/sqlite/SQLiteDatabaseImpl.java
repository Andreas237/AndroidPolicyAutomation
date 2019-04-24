// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.db.sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteException;
import co.touchlab.squeaky.dao.Query;
import co.touchlab.squeaky.db.SQLiteDatabase;
import co.touchlab.squeaky.db.SQLiteStatement;
import java.sql.SQLException;

// Referenced classes of package co.touchlab.squeaky.db.sqlite:
//			SQLiteStatementImpl

public class SQLiteDatabaseImpl
	implements SQLiteDatabase
{

	public SQLiteDatabaseImpl(android.database.sqlite.SQLiteDatabase sqlitedatabase)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		db = sqlitedatabase;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field android.database.sqlite.SQLiteDatabase db>
	//    5    9:return          
	}

	public void beginTransaction()
	{
		db.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field android.database.sqlite.SQLiteDatabase db>
	//    2    4:invokevirtual   #21  <Method void android.database.sqlite.SQLiteDatabase.beginTransaction()>
	//    3    7:return          
	}

	public SQLiteStatement compileStatement(String s)
		throws SQLiteException
	{
		return ((SQLiteStatement) (new SQLiteStatementImpl(db.compileStatement(s))));
	//    0    0:new             #27  <Class SQLiteStatementImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field android.database.sqlite.SQLiteDatabase db>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #30  <Method android.database.sqlite.SQLiteStatement android.database.sqlite.SQLiteDatabase.compileStatement(String)>
	//    6   12:invokespecial   #33  <Method void SQLiteStatementImpl(android.database.sqlite.SQLiteStatement)>
	//    7   15:areturn         
	}

	public long countOf(Query query)
		throws SQLException
	{
		return DatabaseUtils.longForQuery(db, (new StringBuilder()).append("select count(*) from ").append(query.getFromStatement(true)).append(" where ").append(query.getWhereStatement(true)).toString(), query.getParameters());
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field android.database.sqlite.SQLiteDatabase db>
	//    2    4:new             #40  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #41  <Method void StringBuilder()>
	//    5   11:ldc1            #43  <String "select count(*) from ">
	//    6   13:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_1         
	//    8   17:iconst_1        
	//    9   18:invokeinterface #53  <Method String Query.getFromStatement(boolean)>
	//   10   23:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:ldc1            #55  <String " where ">
	//   12   28:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:aload_1         
	//   14   32:iconst_1        
	//   15   33:invokeinterface #58  <Method String Query.getWhereStatement(boolean)>
	//   16   38:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   17   41:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   18   44:aload_1         
	//   19   45:invokeinterface #66  <Method String[] Query.getParameters()>
	//   20   50:invokestatic    #72  <Method long DatabaseUtils.longForQuery(android.database.sqlite.SQLiteDatabase, String, String[])>
	//   21   53:lreturn         
	}

	public long countOf(String s)
	{
		return DatabaseUtils.queryNumEntries(db, s);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field android.database.sqlite.SQLiteDatabase db>
	//    2    4:aload_1         
	//    3    5:invokestatic    #77  <Method long DatabaseUtils.queryNumEntries(android.database.sqlite.SQLiteDatabase, String)>
	//    4    8:lreturn         
	}

	public int delete(String s, String s1, String as[])
	{
		return db.delete(s, s1, as);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field android.database.sqlite.SQLiteDatabase db>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #81  <Method int android.database.sqlite.SQLiteDatabase.delete(String, String, String[])>
	//    6   10:ireturn         
	}

	public void endTransaction()
	{
		db.endTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field android.database.sqlite.SQLiteDatabase db>
	//    2    4:invokevirtual   #84  <Method void android.database.sqlite.SQLiteDatabase.endTransaction()>
	//    3    7:return          
	}

	public void execSQL(String s)
	{
		db.execSQL(s);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field android.database.sqlite.SQLiteDatabase db>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #88  <Method void android.database.sqlite.SQLiteDatabase.execSQL(String)>
	//    4    8:return          
	}

	public transient long longForQuery(String s, String as[])
	{
		return DatabaseUtils.longForQuery(db, s, as);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field android.database.sqlite.SQLiteDatabase db>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #72  <Method long DatabaseUtils.longForQuery(android.database.sqlite.SQLiteDatabase, String, String[])>
	//    5    9:lreturn         
	}

	public Cursor rawQuery(String s, String as[])
	{
		return db.rawQuery(s, as);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field android.database.sqlite.SQLiteDatabase db>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #93  <Method Cursor android.database.sqlite.SQLiteDatabase.rawQuery(String, String[])>
	//    5    9:areturn         
	}

	public void setTransactionSuccessful()
	{
		db.setTransactionSuccessful();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field android.database.sqlite.SQLiteDatabase db>
	//    2    4:invokevirtual   #96  <Method void android.database.sqlite.SQLiteDatabase.setTransactionSuccessful()>
	//    3    7:return          
	}

	public int update(String s, ContentValues contentvalues, String s1, String as[])
		throws SQLiteException
	{
		return db.update(s, contentvalues, s1, as);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field android.database.sqlite.SQLiteDatabase db>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #100 <Method int android.database.sqlite.SQLiteDatabase.update(String, ContentValues, String, String[])>
	//    7   12:ireturn         
	}

	private final android.database.sqlite.SQLiteDatabase db;
}
