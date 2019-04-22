// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.db.framework;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;

// Referenced classes of package android.arch.persistence.db.framework:
//			FrameworkSQLiteOpenHelper, FrameworkSQLiteDatabase

class FrameworkSQLiteOpenHelper$OpenHelper$1
	implements DatabaseErrorHandler
{

	public void onCorruption(SQLiteDatabase sqlitedatabase)
	{
		sqlitedatabase = ((SQLiteDatabase) (val$dbRef[0]));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field FrameworkSQLiteDatabase[] val$dbRef>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:astore_1        
		if(sqlitedatabase != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          19
			val$callback.onCorruption(((android.arch.persistence.db.SupportSQLiteDatabase) (sqlitedatabase)));
	//    7   11:aload_0         
	//    8   12:getfield        #23  <Field android.arch.persistence.db.SupportSQLiteOpenHelper$Callback val$callback>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #34  <Method void android.arch.persistence.db.SupportSQLiteOpenHelper$Callback.onCorruption(android.arch.persistence.db.SupportSQLiteDatabase)>
	//   11   19:return          
	}

	final android.arch.persistence.db.SupportSQLiteOpenHelper.Callback val$callback;
	final FrameworkSQLiteDatabase val$dbRef[];

	FrameworkSQLiteOpenHelper$OpenHelper$1()
	{
		val$dbRef = aframeworksqlitedatabase;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field FrameworkSQLiteDatabase[] val$dbRef>
		val$callback = callback1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field android.arch.persistence.db.SupportSQLiteOpenHelper$Callback val$callback>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
	//    8   14:return          
	}
}
