// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;


// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			Transaction

public interface ITransactionQueue
{

	public abstract void add(Transaction transaction);

	public abstract void cancel(Transaction transaction);

	public abstract void cancel(String s);

	public abstract void quit();

	public abstract void startIfNotAlive();
}
