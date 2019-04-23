// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;

// Referenced classes of package android.arch.persistence.db:
//			SupportSQLiteStatement, SupportSQLiteQuery

public interface SupportSQLiteDatabase
	extends Closeable
{

	public abstract void beginTransaction();

	public abstract void beginTransactionNonExclusive();

	public abstract void beginTransactionWithListener(SQLiteTransactionListener sqlitetransactionlistener);

	public abstract void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sqlitetransactionlistener);

	public abstract SupportSQLiteStatement compileStatement(String s);

	public abstract int delete(String s, String s1, Object aobj[]);

	public abstract void disableWriteAheadLogging();

	public abstract boolean enableWriteAheadLogging();

	public abstract void endTransaction();

	public abstract void execSQL(String s)
		throws SQLException;

	public abstract void execSQL(String s, Object aobj[])
		throws SQLException;

	public abstract List getAttachedDbs();

	public abstract long getMaximumSize();

	public abstract long getPageSize();

	public abstract String getPath();

	public abstract int getVersion();

	public abstract boolean inTransaction();

	public abstract long insert(String s, int i, ContentValues contentvalues)
		throws SQLException;

	public abstract boolean isDatabaseIntegrityOk();

	public abstract boolean isDbLockedByCurrentThread();

	public abstract boolean isOpen();

	public abstract boolean isReadOnly();

	public abstract boolean isWriteAheadLoggingEnabled();

	public abstract boolean needUpgrade(int i);

	public abstract Cursor query(SupportSQLiteQuery supportsqlitequery);

	public abstract Cursor query(SupportSQLiteQuery supportsqlitequery, CancellationSignal cancellationsignal);

	public abstract Cursor query(String s);

	public abstract Cursor query(String s, Object aobj[]);

	public abstract void setForeignKeyConstraintsEnabled(boolean flag);

	public abstract void setLocale(Locale locale);

	public abstract void setMaxSqlCacheSize(int i);

	public abstract long setMaximumSize(long l);

	public abstract void setPageSize(long l);

	public abstract void setTransactionSuccessful();

	public abstract void setVersion(int i);

	public abstract int update(String s, int i, ContentValues contentvalues, String s1, Object aobj[]);

	public abstract boolean yieldIfContendedSafely();

	public abstract boolean yieldIfContendedSafely(long l);
}
