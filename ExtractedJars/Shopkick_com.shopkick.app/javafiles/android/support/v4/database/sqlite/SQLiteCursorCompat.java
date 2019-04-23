// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.database.sqlite;

import android.database.sqlite.SQLiteCursor;

public final class SQLiteCursorCompat
{

	private SQLiteCursorCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void setFillWindowForwardOnly(SQLiteCursor sqlitecursor, boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          13
			sqlitecursor.setFillWindowForwardOnly(flag);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #23  <Method void SQLiteCursor.setFillWindowForwardOnly(boolean)>
	//    6   13:return          
	}
}
