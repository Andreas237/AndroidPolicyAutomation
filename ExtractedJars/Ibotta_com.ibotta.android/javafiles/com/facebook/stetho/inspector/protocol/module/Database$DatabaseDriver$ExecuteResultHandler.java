// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			Database

public static interface Database$DatabaseDriver$ExecuteResultHandler
{

	public abstract Object handleInsert(long l)
		throws SQLiteException;

	public abstract Object handleRawQuery()
		throws SQLiteException;

	public abstract Object handleSelect(Cursor cursor)
		throws SQLiteException;

	public abstract Object handleUpdateDelete(int i)
		throws SQLiteException;
}
