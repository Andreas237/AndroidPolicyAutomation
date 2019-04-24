// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database.transaction;

import com.raizlabs.android.dbflow.sql.language.CursorResult;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database.transaction:
//			QueryTransaction

public static interface QueryTransaction$QueryResultCallback
{

	public abstract void onQueryResult(QueryTransaction querytransaction, CursorResult cursorresult);
}
