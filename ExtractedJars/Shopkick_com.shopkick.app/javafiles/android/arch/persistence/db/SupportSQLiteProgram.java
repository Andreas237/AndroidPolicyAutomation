// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.db;

import java.io.Closeable;

public interface SupportSQLiteProgram
	extends Closeable
{

	public abstract void bindBlob(int i, byte abyte0[]);

	public abstract void bindDouble(int i, double d);

	public abstract void bindLong(int i, long l);

	public abstract void bindNull(int i);

	public abstract void bindString(int i, String s);

	public abstract void clearBindings();
}
