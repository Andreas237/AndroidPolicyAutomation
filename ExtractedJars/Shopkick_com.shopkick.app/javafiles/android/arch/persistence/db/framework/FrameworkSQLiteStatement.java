// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.db.framework;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.database.sqlite.SQLiteStatement;

// Referenced classes of package android.arch.persistence.db.framework:
//			FrameworkSQLiteProgram

class FrameworkSQLiteStatement extends FrameworkSQLiteProgram
	implements SupportSQLiteStatement
{

	FrameworkSQLiteStatement(SQLiteStatement sqlitestatement)
	{
		super(((android.database.sqlite.SQLiteProgram) (sqlitestatement)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void FrameworkSQLiteProgram(android.database.sqlite.SQLiteProgram)>
		mDelegate = sqlitestatement;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #15  <Field SQLiteStatement mDelegate>
	//    6   10:return          
	}

	public void execute()
	{
		mDelegate.execute();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SQLiteStatement mDelegate>
	//    2    4:invokevirtual   #22  <Method void SQLiteStatement.execute()>
	//    3    7:return          
	}

	public long executeInsert()
	{
		return mDelegate.executeInsert();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SQLiteStatement mDelegate>
	//    2    4:invokevirtual   #26  <Method long SQLiteStatement.executeInsert()>
	//    3    7:lreturn         
	}

	public int executeUpdateDelete()
	{
		return mDelegate.executeUpdateDelete();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SQLiteStatement mDelegate>
	//    2    4:invokevirtual   #30  <Method int SQLiteStatement.executeUpdateDelete()>
	//    3    7:ireturn         
	}

	public long simpleQueryForLong()
	{
		return mDelegate.simpleQueryForLong();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SQLiteStatement mDelegate>
	//    2    4:invokevirtual   #33  <Method long SQLiteStatement.simpleQueryForLong()>
	//    3    7:lreturn         
	}

	public String simpleQueryForString()
	{
		return mDelegate.simpleQueryForString();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SQLiteStatement mDelegate>
	//    2    4:invokevirtual   #37  <Method String SQLiteStatement.simpleQueryForString()>
	//    3    7:areturn         
	}

	private final SQLiteStatement mDelegate;
}
