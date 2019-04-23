// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.db.framework;

import android.arch.persistence.db.*;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.*;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.io.IOException;
import java.util.*;

// Referenced classes of package android.arch.persistence.db.framework:
//			FrameworkSQLiteStatement, FrameworkSQLiteProgram

class FrameworkSQLiteDatabase
	implements SupportSQLiteDatabase
{

	FrameworkSQLiteDatabase(SQLiteDatabase sqlitedatabase)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		mDelegate = sqlitedatabase;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #42  <Field SQLiteDatabase mDelegate>
	//    5    9:return          
	}

	public void beginTransaction()
	{
		mDelegate.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:invokevirtual   #47  <Method void SQLiteDatabase.beginTransaction()>
	//    3    7:return          
	}

	public void beginTransactionNonExclusive()
	{
		mDelegate.beginTransactionNonExclusive();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:invokevirtual   #50  <Method void SQLiteDatabase.beginTransactionNonExclusive()>
	//    3    7:return          
	}

	public void beginTransactionWithListener(SQLiteTransactionListener sqlitetransactionlistener)
	{
		mDelegate.beginTransactionWithListener(sqlitetransactionlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #54  <Method void SQLiteDatabase.beginTransactionWithListener(SQLiteTransactionListener)>
	//    4    8:return          
	}

	public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sqlitetransactionlistener)
	{
		mDelegate.beginTransactionWithListenerNonExclusive(sqlitetransactionlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #57  <Method void SQLiteDatabase.beginTransactionWithListenerNonExclusive(SQLiteTransactionListener)>
	//    4    8:return          
	}

	public void close()
		throws IOException
	{
		mDelegate.close();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:invokevirtual   #62  <Method void SQLiteDatabase.close()>
	//    3    7:return          
	}

	public SupportSQLiteStatement compileStatement(String s)
	{
		return ((SupportSQLiteStatement) (new FrameworkSQLiteStatement(mDelegate.compileStatement(s))));
	//    0    0:new             #67  <Class FrameworkSQLiteStatement>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #70  <Method android.database.sqlite.SQLiteStatement SQLiteDatabase.compileStatement(String)>
	//    6   12:invokespecial   #73  <Method void FrameworkSQLiteStatement(android.database.sqlite.SQLiteStatement)>
	//    7   15:areturn         
	}

	public int delete(String s, String s1, Object aobj[])
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #77  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #78  <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append("DELETE FROM ");
	//    4    9:aload           4
	//    5   11:ldc1            #80  <String "DELETE FROM ">
	//    6   13:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(s);
	//    8   17:aload           4
	//    9   19:aload_1         
	//   10   20:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*  12   24:aload_2         
	//*  13   25:invokestatic    #90  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  14   28:ifeq            37
		{
			s = "";
	//   15   31:ldc1            #21  <String "">
	//   16   33:astore_1        
		} else
	//*  17   34:goto            63
		{
			s = ((String) (new StringBuilder()));
	//   18   37:new             #77  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #78  <Method void StringBuilder()>
	//   21   44:astore_1        
			((StringBuilder) (s)).append(" WHERE ");
	//   22   45:aload_1         
	//   23   46:ldc1            #92  <String " WHERE ">
	//   24   48:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
			((StringBuilder) (s)).append(s1);
	//   26   52:aload_1         
	//   27   53:aload_2         
	//   28   54:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
			s = ((StringBuilder) (s)).toString();
	//   30   58:aload_1         
	//   31   59:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   32   62:astore_1        
		}
		stringbuilder.append(s);
	//   33   63:aload           4
	//   34   65:aload_1         
	//   35   66:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   36   69:pop             
		s = ((String) (compileStatement(stringbuilder.toString())));
	//   37   70:aload_0         
	//   38   71:aload           4
	//   39   73:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   40   76:invokevirtual   #98  <Method SupportSQLiteStatement compileStatement(String)>
	//   41   79:astore_1        
		SimpleSQLiteQuery.bind(((android.arch.persistence.db.SupportSQLiteProgram) (s)), aobj);
	//   42   80:aload_1         
	//   43   81:aload_3         
	//   44   82:invokestatic    #104 <Method void SimpleSQLiteQuery.bind(android.arch.persistence.db.SupportSQLiteProgram, Object[])>
		return ((SupportSQLiteStatement) (s)).executeUpdateDelete();
	//   45   85:aload_1         
	//   46   86:invokeinterface #110 <Method int SupportSQLiteStatement.executeUpdateDelete()>
	//   47   91:ireturn         
	}

	public void disableWriteAheadLogging()
	{
		mDelegate.disableWriteAheadLogging();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:invokevirtual   #116 <Method void SQLiteDatabase.disableWriteAheadLogging()>
	//    3    7:return          
	}

	public boolean enableWriteAheadLogging()
	{
		return mDelegate.enableWriteAheadLogging();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:invokevirtual   #121 <Method boolean SQLiteDatabase.enableWriteAheadLogging()>
	//    3    7:ireturn         
	}

	public void endTransaction()
	{
		mDelegate.endTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:invokevirtual   #124 <Method void SQLiteDatabase.endTransaction()>
	//    3    7:return          
	}

	public void execSQL(String s)
		throws SQLException
	{
		mDelegate.execSQL(s);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #130 <Method void SQLiteDatabase.execSQL(String)>
	//    4    8:return          
	}

	public void execSQL(String s, Object aobj[])
		throws SQLException
	{
		mDelegate.execSQL(s, aobj);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #133 <Method void SQLiteDatabase.execSQL(String, Object[])>
	//    5    9:return          
	}

	public List getAttachedDbs()
	{
		return mDelegate.getAttachedDbs();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:invokevirtual   #137 <Method List SQLiteDatabase.getAttachedDbs()>
	//    3    7:areturn         
	}

	public long getMaximumSize()
	{
		return mDelegate.getMaximumSize();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:invokevirtual   #143 <Method long SQLiteDatabase.getMaximumSize()>
	//    3    7:lreturn         
	}

	public long getPageSize()
	{
		return mDelegate.getPageSize();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:invokevirtual   #146 <Method long SQLiteDatabase.getPageSize()>
	//    3    7:lreturn         
	}

	public String getPath()
	{
		return mDelegate.getPath();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:invokevirtual   #149 <Method String SQLiteDatabase.getPath()>
	//    3    7:areturn         
	}

	public int getVersion()
	{
		return mDelegate.getVersion();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:invokevirtual   #152 <Method int SQLiteDatabase.getVersion()>
	//    3    7:ireturn         
	}

	public boolean inTransaction()
	{
		return mDelegate.inTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:invokevirtual   #155 <Method boolean SQLiteDatabase.inTransaction()>
	//    3    7:ireturn         
	}

	public long insert(String s, int i, ContentValues contentvalues)
		throws SQLException
	{
		return mDelegate.insertWithOnConflict(s, ((String) (null)), contentvalues, i);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:aload_3         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #161 <Method long SQLiteDatabase.insertWithOnConflict(String, String, ContentValues, int)>
	//    7   11:lreturn         
	}

	public boolean isDatabaseIntegrityOk()
	{
		return mDelegate.isDatabaseIntegrityOk();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:invokevirtual   #164 <Method boolean SQLiteDatabase.isDatabaseIntegrityOk()>
	//    3    7:ireturn         
	}

	public boolean isDbLockedByCurrentThread()
	{
		return mDelegate.isDbLockedByCurrentThread();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:invokevirtual   #167 <Method boolean SQLiteDatabase.isDbLockedByCurrentThread()>
	//    3    7:ireturn         
	}

	public boolean isOpen()
	{
		return mDelegate.isOpen();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:invokevirtual   #170 <Method boolean SQLiteDatabase.isOpen()>
	//    3    7:ireturn         
	}

	public boolean isReadOnly()
	{
		return mDelegate.isReadOnly();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:invokevirtual   #173 <Method boolean SQLiteDatabase.isReadOnly()>
	//    3    7:ireturn         
	}

	public boolean isWriteAheadLoggingEnabled()
	{
		return mDelegate.isWriteAheadLoggingEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:invokevirtual   #176 <Method boolean SQLiteDatabase.isWriteAheadLoggingEnabled()>
	//    3    7:ireturn         
	}

	public boolean needUpgrade(int i)
	{
		return mDelegate.needUpgrade(i);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #180 <Method boolean SQLiteDatabase.needUpgrade(int)>
	//    4    8:ireturn         
	}

	public Cursor query(final SupportSQLiteQuery supportQuery)
	{
		return mDelegate.rawQueryWithFactory(new android.database.sqlite.SQLiteDatabase.CursorFactory() {

			public Cursor newCursor(SQLiteDatabase sqlitedatabase, SQLiteCursorDriver sqlitecursordriver, String s, SQLiteQuery sqlitequery)
			{
				supportQuery.bindTo(((android.arch.persistence.db.SupportSQLiteProgram) (new FrameworkSQLiteProgram(((android.database.sqlite.SQLiteProgram) (sqlitequery))))));
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

			
			{
				this$0 = FrameworkSQLiteDatabase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field FrameworkSQLiteDatabase this$0>
				supportQuery = supportsqlitequery;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field SupportSQLiteQuery val$supportQuery>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, supportQuery.getSql(), EMPTY_STRING_ARRAY, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:new             #8   <Class FrameworkSQLiteDatabase$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #185 <Method void FrameworkSQLiteDatabase$1(FrameworkSQLiteDatabase, SupportSQLiteQuery)>
	//    7   13:aload_1         
	//    8   14:invokeinterface #190 <Method String SupportSQLiteQuery.getSql()>
	//    9   19:getstatic       #35  <Field String[] EMPTY_STRING_ARRAY>
	//   10   22:aconst_null     
	//   11   23:invokevirtual   #194 <Method Cursor SQLiteDatabase.rawQueryWithFactory(android.database.sqlite.SQLiteDatabase$CursorFactory, String, String[], String)>
	//   12   26:areturn         
	}

	public Cursor query(final SupportSQLiteQuery supportQuery, CancellationSignal cancellationsignal)
	{
		return mDelegate.rawQueryWithFactory(new android.database.sqlite.SQLiteDatabase.CursorFactory() {

			public Cursor newCursor(SQLiteDatabase sqlitedatabase, SQLiteCursorDriver sqlitecursordriver, String s, SQLiteQuery sqlitequery)
			{
				supportQuery.bindTo(((android.arch.persistence.db.SupportSQLiteProgram) (new FrameworkSQLiteProgram(((android.database.sqlite.SQLiteProgram) (sqlitequery))))));
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

			
			{
				this$0 = FrameworkSQLiteDatabase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field FrameworkSQLiteDatabase this$0>
				supportQuery = supportsqlitequery;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field SupportSQLiteQuery val$supportQuery>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, supportQuery.getSql(), EMPTY_STRING_ARRAY, ((String) (null)), cancellationsignal);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:new             #10  <Class FrameworkSQLiteDatabase$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #196 <Method void FrameworkSQLiteDatabase$2(FrameworkSQLiteDatabase, SupportSQLiteQuery)>
	//    7   13:aload_1         
	//    8   14:invokeinterface #190 <Method String SupportSQLiteQuery.getSql()>
	//    9   19:getstatic       #35  <Field String[] EMPTY_STRING_ARRAY>
	//   10   22:aconst_null     
	//   11   23:aload_2         
	//   12   24:invokevirtual   #199 <Method Cursor SQLiteDatabase.rawQueryWithFactory(android.database.sqlite.SQLiteDatabase$CursorFactory, String, String[], String, CancellationSignal)>
	//   13   27:areturn         
	}

	public Cursor query(String s)
	{
		return query(((SupportSQLiteQuery) (new SimpleSQLiteQuery(s))));
	//    0    0:aload_0         
	//    1    1:new             #100 <Class SimpleSQLiteQuery>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #202 <Method void SimpleSQLiteQuery(String)>
	//    5    9:invokevirtual   #204 <Method Cursor query(SupportSQLiteQuery)>
	//    6   12:areturn         
	}

	public Cursor query(String s, Object aobj[])
	{
		return query(((SupportSQLiteQuery) (new SimpleSQLiteQuery(s, aobj))));
	//    0    0:aload_0         
	//    1    1:new             #100 <Class SimpleSQLiteQuery>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #207 <Method void SimpleSQLiteQuery(String, Object[])>
	//    6   10:invokevirtual   #204 <Method Cursor query(SupportSQLiteQuery)>
	//    7   13:areturn         
	}

	public void setForeignKeyConstraintsEnabled(boolean flag)
	{
		mDelegate.setForeignKeyConstraintsEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #211 <Method void SQLiteDatabase.setForeignKeyConstraintsEnabled(boolean)>
	//    4    8:return          
	}

	public void setLocale(Locale locale)
	{
		mDelegate.setLocale(locale);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #215 <Method void SQLiteDatabase.setLocale(Locale)>
	//    4    8:return          
	}

	public void setMaxSqlCacheSize(int i)
	{
		mDelegate.setMaxSqlCacheSize(i);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #219 <Method void SQLiteDatabase.setMaxSqlCacheSize(int)>
	//    4    8:return          
	}

	public long setMaximumSize(long l)
	{
		return mDelegate.setMaximumSize(l);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #223 <Method long SQLiteDatabase.setMaximumSize(long)>
	//    4    8:lreturn         
	}

	public void setPageSize(long l)
	{
		mDelegate.setPageSize(l);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #227 <Method void SQLiteDatabase.setPageSize(long)>
	//    4    8:return          
	}

	public void setTransactionSuccessful()
	{
		mDelegate.setTransactionSuccessful();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:invokevirtual   #230 <Method void SQLiteDatabase.setTransactionSuccessful()>
	//    3    7:return          
	}

	public void setVersion(int i)
	{
		mDelegate.setVersion(i);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #233 <Method void SQLiteDatabase.setVersion(int)>
	//    4    8:return          
	}

	public int update(String s, int i, ContentValues contentvalues, String s1, Object aobj[])
	{
		if(contentvalues != null && contentvalues.size() != 0)
	//*   0    0:aload_3         
	//*   1    1:ifnull          264
	//*   2    4:aload_3         
	//*   3    5:invokevirtual   #240 <Method int ContentValues.size()>
	//*   4    8:ifeq            264
		{
			StringBuilder stringbuilder = new StringBuilder(120);
	//    5   11:new             #77  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:bipush          120
	//    8   17:invokespecial   #242 <Method void StringBuilder(int)>
	//    9   20:astore          8
			stringbuilder.append("UPDATE ");
	//   10   22:aload           8
	//   11   24:ldc1            #244 <String "UPDATE ">
	//   12   26:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
			stringbuilder.append(CONFLICT_VALUES[i]);
	//   14   30:aload           8
	//   15   32:getstatic       #33  <Field String[] CONFLICT_VALUES>
	//   16   35:iload_2         
	//   17   36:aaload          
	//   18   37:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
			stringbuilder.append(s);
	//   20   41:aload           8
	//   21   43:aload_1         
	//   22   44:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
			stringbuilder.append(" SET ");
	//   24   48:aload           8
	//   25   50:ldc1            #246 <String " SET ">
	//   26   52:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   27   55:pop             
			i = contentvalues.size();
	//   28   56:aload_3         
	//   29   57:invokevirtual   #240 <Method int ContentValues.size()>
	//   30   60:istore_2        
			int j;
			if(aobj == null)
	//*  31   61:aload           5
	//*  32   63:ifnonnull       72
				j = i;
	//   33   66:iload_2         
	//   34   67:istore          6
			else
	//*  35   69:goto            79
				j = aobj.length + i;
	//   36   72:aload           5
	//   37   74:arraylength     
	//   38   75:iload_2         
	//   39   76:iadd            
	//   40   77:istore          6
			Object aobj1[] = new Object[j];
	//   41   79:iload           6
	//   42   81:anewarray       Object[]
	//   43   84:astore          9
			int k = 0;
	//   44   86:iconst_0        
	//   45   87:istore          7
			for(Iterator iterator = contentvalues.keySet().iterator(); iterator.hasNext();)
	//*  46   89:aload_3         
	//*  47   90:invokevirtual   #250 <Method Set ContentValues.keySet()>
	//*  48   93:invokeinterface #256 <Method Iterator Set.iterator()>
	//*  49   98:astore          10
	//*  50  100:aload           10
	//*  51  102:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//*  52  107:ifeq            181
			{
				String s2 = (String)iterator.next();
	//   53  110:aload           10
	//   54  112:invokeinterface #265 <Method Object Iterator.next()>
	//   55  117:checkcast       #19  <Class String>
	//   56  120:astore          11
				if(k > 0)
	//*  57  122:iload           7
	//*  58  124:ifle            134
					s = ",";
	//   59  127:ldc2            #267 <String ",">
	//   60  130:astore_1        
				else
	//*  61  131:goto            137
					s = "";
	//   62  134:ldc1            #21  <String "">
	//   63  136:astore_1        
				stringbuilder.append(s);
	//   64  137:aload           8
	//   65  139:aload_1         
	//   66  140:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   67  143:pop             
				stringbuilder.append(s2);
	//   68  144:aload           8
	//   69  146:aload           11
	//   70  148:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   71  151:pop             
				aobj1[k] = contentvalues.get(s2);
	//   72  152:aload           9
	//   73  154:iload           7
	//   74  156:aload_3         
	//   75  157:aload           11
	//   76  159:invokevirtual   #271 <Method Object ContentValues.get(String)>
	//   77  162:aastore         
				stringbuilder.append("=?");
	//   78  163:aload           8
	//   79  165:ldc2            #273 <String "=?">
	//   80  168:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   81  171:pop             
				k++;
	//   82  172:iload           7
	//   83  174:iconst_1        
	//   84  175:iadd            
	//   85  176:istore          7
			}

	//*  86  178:goto            100
			if(aobj != null)
	//*  87  181:aload           5
	//*  88  183:ifnull          217
			{
				for(int l = i; l < j; l++)
	//*  89  186:iload_2         
	//*  90  187:istore          7
	//*  91  189:iload           7
	//*  92  191:iload           6
	//*  93  193:icmpge          217
					aobj1[l] = aobj[l - i];
	//   94  196:aload           9
	//   95  198:iload           7
	//   96  200:aload           5
	//   97  202:iload           7
	//   98  204:iload_2         
	//   99  205:isub            
	//  100  206:aaload          
	//  101  207:aastore         

	//  102  208:iload           7
	//  103  210:iconst_1        
	//  104  211:iadd            
	//  105  212:istore          7
			}
	//* 106  214:goto            189
			if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//* 107  217:aload           4
	//* 108  219:invokestatic    #90  <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 109  222:ifne            241
			{
				stringbuilder.append(" WHERE ");
	//  110  225:aload           8
	//  111  227:ldc1            #92  <String " WHERE ">
	//  112  229:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//  113  232:pop             
				stringbuilder.append(s1);
	//  114  233:aload           8
	//  115  235:aload           4
	//  116  237:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//  117  240:pop             
			}
			s = ((String) (compileStatement(stringbuilder.toString())));
	//  118  241:aload_0         
	//  119  242:aload           8
	//  120  244:invokevirtual   #96  <Method String StringBuilder.toString()>
	//  121  247:invokevirtual   #98  <Method SupportSQLiteStatement compileStatement(String)>
	//  122  250:astore_1        
			SimpleSQLiteQuery.bind(((android.arch.persistence.db.SupportSQLiteProgram) (s)), aobj1);
	//  123  251:aload_1         
	//  124  252:aload           9
	//  125  254:invokestatic    #104 <Method void SimpleSQLiteQuery.bind(android.arch.persistence.db.SupportSQLiteProgram, Object[])>
			return ((SupportSQLiteStatement) (s)).executeUpdateDelete();
	//  126  257:aload_1         
	//  127  258:invokeinterface #110 <Method int SupportSQLiteStatement.executeUpdateDelete()>
	//  128  263:ireturn         
		} else
		{
			throw new IllegalArgumentException("Empty values");
	//  129  264:new             #275 <Class IllegalArgumentException>
	//  130  267:dup             
	//  131  268:ldc2            #277 <String "Empty values">
	//  132  271:invokespecial   #278 <Method void IllegalArgumentException(String)>
	//  133  274:athrow          
		}
	}

	public boolean yieldIfContendedSafely()
	{
		return mDelegate.yieldIfContendedSafely();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:invokevirtual   #281 <Method boolean SQLiteDatabase.yieldIfContendedSafely()>
	//    3    7:ireturn         
	}

	public boolean yieldIfContendedSafely(long l)
	{
		return mDelegate.yieldIfContendedSafely(l);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SQLiteDatabase mDelegate>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #284 <Method boolean SQLiteDatabase.yieldIfContendedSafely(long)>
	//    4    8:ireturn         
	}

	private static final String CONFLICT_VALUES[] = {
		"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "
	};
	private static final String EMPTY_STRING_ARRAY[] = new String[0];
	private final SQLiteDatabase mDelegate;

	static 
	{
	//    0    0:bipush          6
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #21  <String "">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #23  <String " OR ROLLBACK ">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #25  <String " OR ABORT ">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #27  <String " OR FAIL ">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #29  <String " OR IGNORE ">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #31  <String " OR REPLACE ">
	//   25   34:aastore         
	//   26   35:putstatic       #33  <Field String[] CONFLICT_VALUES>
	//   27   38:iconst_0        
	//   28   39:anewarray       String[]
	//   29   42:putstatic       #35  <Field String[] EMPTY_STRING_ARRAY>
	//*  30   45:return          
	}
}
