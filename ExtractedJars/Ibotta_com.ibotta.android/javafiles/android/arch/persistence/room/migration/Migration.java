// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room.migration;

import android.arch.persistence.db.SupportSQLiteDatabase;

public abstract class Migration
{

	public Migration(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		startVersion = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #14  <Field int startVersion>
		endVersion = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #16  <Field int endVersion>
	//    8   14:return          
	}

	public abstract void migrate(SupportSQLiteDatabase supportsqlitedatabase);

	public final int endVersion;
	public final int startVersion;
}
