// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.db.framework;

import android.arch.persistence.db.SupportSQLiteQuery;
import android.database.Cursor;
import android.database.sqlite.*;

// Referenced classes of package android.arch.persistence.db.framework:
//			FrameworkSQLiteDatabase, FrameworkSQLiteProgram

class FrameworkSQLiteDatabase$1
	implements android.database.sqlite.ry
{

	public Cursor newCursor(SQLiteDatabase sqlitedatabase, SQLiteCursorDriver sqlitecursordriver, String s, SQLiteQuery sqlitequery)
	{
		val$supportQuery.bindTo(((android.arch.persistence.db.SupportSQLiteProgram) (new FrameworkSQLiteProgram(((android.database.sqlite.SQLiteProgram) (sqlitequery))))));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SupportSQLiteQuery val$supportQuery>
	//    2    4:new             #29  <Class FrameworkSQLiteProgram>
	//    3    7:dup             
	//    4    8:aload           4
	//    5   10:invokespecial   #32  <Method void FrameworkSQLiteProgram(android.database.sqlite.SQLiteProgram)>
	//    6   13:invokeinterface #38  <Method void SupportSQLiteQuery.bindTo(android.arch.persistence.db.SupportSQLiteProgram)>
		return ((Cursor) (new SQLiteCursor(sqlitecursordriver, s, sqlitequery)));
	//    7   18:new             #40  <Class SQLiteCursor>
	//    8   21:dup             
	//    9   22:aload_2         
	//   10   23:aload_3         
	//   11   24:aload           4
	//   12   26:invokespecial   #43  <Method void SQLiteCursor(SQLiteCursorDriver, String, SQLiteQuery)>
	//   13   29:areturn         
	}

	final FrameworkSQLiteDatabase this$0;
	final SupportSQLiteQuery val$supportQuery;

	FrameworkSQLiteDatabase$1()
	{
		this$0 = final_frameworksqlitedatabase;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field FrameworkSQLiteDatabase this$0>
		val$supportQuery = SupportSQLiteQuery.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field SupportSQLiteQuery val$supportQuery>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
