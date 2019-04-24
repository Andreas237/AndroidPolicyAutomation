// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.database.Cursor;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//			SimpleCursorAdapter

public static interface SimpleCursorAdapter$ViewBinder
{

	public abstract boolean setViewValue(View view, Cursor cursor, int i);
}
