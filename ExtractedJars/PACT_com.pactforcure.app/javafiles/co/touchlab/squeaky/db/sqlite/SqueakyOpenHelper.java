// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.db.sqlite;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteOpenHelper;
import co.touchlab.squeaky.dao.Dao;
import co.touchlab.squeaky.dao.SqueakyContext;
import co.touchlab.squeaky.db.SQLiteDatabase;
import co.touchlab.squeaky.table.GeneratedTableMapper;

// Referenced classes of package co.touchlab.squeaky.db.sqlite:
//			SQLiteDatabaseImpl

public abstract class SqueakyOpenHelper extends SQLiteOpenHelper
	implements co.touchlab.squeaky.db.SQLiteOpenHelper
{

	public SqueakyOpenHelper(Context context, String s, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory, int i)
	{
		super(context, s, cursorfactory, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #14  <Method void SQLiteOpenHelper(Context, String, android.database.sqlite.SQLiteDatabase$CursorFactory, int)>
		squeakyContext = new SqueakyContext(((co.touchlab.squeaky.db.SQLiteOpenHelper) (this)));
	//    6    9:aload_0         
	//    7   10:new             #16  <Class SqueakyContext>
	//    8   13:dup             
	//    9   14:aload_0         
	//   10   15:invokespecial   #19  <Method void SqueakyContext(co.touchlab.squeaky.db.SQLiteOpenHelper)>
	//   11   18:putfield        #21  <Field SqueakyContext squeakyContext>
	//   12   21:return          
	}

	public SqueakyOpenHelper(Context context, String s, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory, int i, DatabaseErrorHandler databaseerrorhandler)
	{
		super(context, s, cursorfactory, i, databaseerrorhandler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #25  <Method void SQLiteOpenHelper(Context, String, android.database.sqlite.SQLiteDatabase$CursorFactory, int, DatabaseErrorHandler)>
		squeakyContext = new SqueakyContext(((co.touchlab.squeaky.db.SQLiteOpenHelper) (this)));
	//    7   11:aload_0         
	//    8   12:new             #16  <Class SqueakyContext>
	//    9   15:dup             
	//   10   16:aload_0         
	//   11   17:invokespecial   #19  <Method void SqueakyContext(co.touchlab.squeaky.db.SQLiteOpenHelper)>
	//   12   20:putfield        #21  <Field SqueakyContext squeakyContext>
	//   13   23:return          
	}

	public void close()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		squeakyContext.close();
	//    2    2:aload_0         
	//    3    3:getfield        #21  <Field SqueakyContext squeakyContext>
	//    4    6:invokevirtual   #29  <Method void SqueakyContext.close()>
		super.close();
	//    5    9:aload_0         
	//    6   10:invokespecial   #30  <Method void SQLiteOpenHelper.close()>
		this;
	//    7   13:aload_0         
		JVM INSTR monitorexit ;
	//    8   14:monitorexit     
		return;
	//    9   15:return          
		Exception exception;
		exception;
	//   10   16:astore_1        
	//*  11   17:aload_0         
		throw exception;
	//   12   18:monitorexit     
	//   13   19:aload_1         
	//   14   20:athrow          
	}

	public Dao getDao(Class class1)
	{
		return squeakyContext.getDao(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SqueakyContext squeakyContext>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method Dao SqueakyContext.getDao(Class)>
	//    4    8:areturn         
	}

	public GeneratedTableMapper getGeneratedTableMapper(Class class1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		class1 = ((Class) (squeakyContext.getGeneratedTableMapper(class1)));
	//    2    2:aload_0         
	//    3    3:getfield        #21  <Field SqueakyContext squeakyContext>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #40  <Method GeneratedTableMapper SqueakyContext.getGeneratedTableMapper(Class)>
	//    6   10:astore_1        
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return ((GeneratedTableMapper) (class1));
	//    9   13:aload_1         
	//   10   14:areturn         
		class1;
	//   11   15:astore_1        
	//*  12   16:aload_0         
		throw class1;
	//   13   17:monitorexit     
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public SqueakyContext getSqueakyContext()
	{
		return squeakyContext;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SqueakyContext squeakyContext>
	//    2    4:areturn         
	}

	public SQLiteDatabase getWrappedDatabase()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		SQLiteDatabaseImpl sqlitedatabaseimpl;
		if(sqLiteDatabase == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #46  <Field SQLiteDatabaseImpl sqLiteDatabase>
	//*   4    6:ifnonnull       24
			sqLiteDatabase = new SQLiteDatabaseImpl(getWritableDatabase());
	//    5    9:aload_0         
	//    6   10:new             #48  <Class SQLiteDatabaseImpl>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokevirtual   #52  <Method android.database.sqlite.SQLiteDatabase getWritableDatabase()>
	//   10   18:invokespecial   #55  <Method void SQLiteDatabaseImpl(android.database.sqlite.SQLiteDatabase)>
	//   11   21:putfield        #46  <Field SQLiteDatabaseImpl sqLiteDatabase>
		sqlitedatabaseimpl = sqLiteDatabase;
	//   12   24:aload_0         
	//   13   25:getfield        #46  <Field SQLiteDatabaseImpl sqLiteDatabase>
	//   14   28:astore_1        
		this;
	//   15   29:aload_0         
		JVM INSTR monitorexit ;
	//   16   30:monitorexit     
		return ((SQLiteDatabase) (sqlitedatabaseimpl));
	//   17   31:aload_1         
	//   18   32:areturn         
		Exception exception;
		exception;
	//   19   33:astore_1        
	//*  20   34:aload_0         
		throw exception;
	//   21   35:monitorexit     
	//   22   36:aload_1         
	//   23   37:athrow          
	}

	private SQLiteDatabaseImpl sqLiteDatabase;
	private final SqueakyContext squeakyContext;
}
