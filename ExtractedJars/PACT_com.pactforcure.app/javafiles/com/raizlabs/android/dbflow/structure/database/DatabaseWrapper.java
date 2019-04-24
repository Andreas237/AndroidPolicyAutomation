// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database;

import android.content.ContentValues;
import android.database.Cursor;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database:
//			DatabaseStatement

public interface DatabaseWrapper
{

	public abstract void beginTransaction();

	public abstract DatabaseStatement compileStatement(String s);

	public abstract int delete(String s, String s1, String as[]);

	public abstract void endTransaction();

	public abstract void execSQL(String s);

	public abstract int getVersion();

	public abstract long insertWithOnConflict(String s, String s1, ContentValues contentvalues, int i);

	public abstract Cursor query(String s, String as[], String s1, String as1[], String s2, String s3, String s4);

	public abstract Cursor rawQuery(String s, String as[]);

	public abstract void setTransactionSuccessful();

	public abstract long updateWithOnConflict(String s, ContentValues contentvalues, String s1, String as[], int i);
}
