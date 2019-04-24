// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.dao;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.Iterator;

public interface CloseableIterator
	extends Iterator, Closeable
{

	public abstract void closeQuietly();

	public abstract Object current()
		throws SQLException;

	public abstract Object first()
		throws SQLException;

	public abstract Object moveRelative(int i)
		throws SQLException;

	public abstract void moveToNext();

	public abstract Object nextThrow()
		throws SQLException;

	public abstract Object previous()
		throws SQLException;
}
