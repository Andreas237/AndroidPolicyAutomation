// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.android;

import android.database.sqlite.SQLiteDatabase;
import ch.qos.logback.core.util.Duration;

public interface SQLiteLogCleaner
{

	public abstract void performLogCleanup(SQLiteDatabase sqlitedatabase, Duration duration);
}
