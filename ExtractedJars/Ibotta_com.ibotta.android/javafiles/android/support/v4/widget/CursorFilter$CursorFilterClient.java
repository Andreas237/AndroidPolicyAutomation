// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.database.Cursor;

// Referenced classes of package android.support.v4.widget:
//			CursorFilter

static interface CursorFilter$CursorFilterClient
{

	public abstract void changeCursor(Cursor cursor);

	public abstract CharSequence convertToString(Cursor cursor);

	public abstract Cursor getCursor();

	public abstract Cursor runQueryOnBackgroundThread(CharSequence charsequence);
}
