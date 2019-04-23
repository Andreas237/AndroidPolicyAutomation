// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.db;


// Referenced classes of package android.arch.persistence.db:
//			SupportSQLiteProgram

public interface SupportSQLiteStatement
	extends SupportSQLiteProgram
{

	public abstract void execute();

	public abstract long executeInsert();

	public abstract int executeUpdateDelete();

	public abstract long simpleQueryForLong();

	public abstract String simpleQueryForString();
}
