// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import android.arch.persistence.db.SupportSQLiteDatabase;

// Referenced classes of package android.arch.persistence.room:
//			RoomOpenHelper

public static abstract class RoomOpenHelper$Delegate
{

	protected abstract void createAllTables(SupportSQLiteDatabase supportsqlitedatabase);

	protected abstract void dropAllTables(SupportSQLiteDatabase supportsqlitedatabase);

	protected abstract void onCreate(SupportSQLiteDatabase supportsqlitedatabase);

	protected abstract void onOpen(SupportSQLiteDatabase supportsqlitedatabase);

	protected abstract void validateMigration(SupportSQLiteDatabase supportsqlitedatabase);

	public final int version;

	public RoomOpenHelper$Delegate(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		version = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #20  <Field int version>
	//    5    9:return          
	}
}
