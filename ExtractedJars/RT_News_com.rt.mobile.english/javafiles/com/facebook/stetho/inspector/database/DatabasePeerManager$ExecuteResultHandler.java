// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;

// Referenced classes of package com.facebook.stetho.inspector.database:
//			DatabasePeerManager

public static interface DatabasePeerManager$ExecuteResultHandler
{

	public abstract Object handleResult(Cursor cursor)
		throws SQLiteException;
}
