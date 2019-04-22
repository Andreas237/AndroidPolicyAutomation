// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.db;


// Referenced classes of package android.arch.persistence.db:
//			SupportSQLiteProgram

public interface SupportSQLiteQuery
{

	public abstract void bindTo(SupportSQLiteProgram supportsqliteprogram);

	public abstract int getArgCount();

	public abstract String getSql();
}
