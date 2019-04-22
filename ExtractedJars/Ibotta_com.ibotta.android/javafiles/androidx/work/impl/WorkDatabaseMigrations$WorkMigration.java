// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.migration.Migration;
import android.content.Context;
import androidx.work.impl.utils.Preferences;

// Referenced classes of package androidx.work.impl:
//			WorkDatabaseMigrations

public static class WorkDatabaseMigrations$WorkMigration extends Migration
{

	public void migrate(SupportSQLiteDatabase supportsqlitedatabase)
	{
		(new Preferences(mContext)).setNeedsReschedule(true);
	//    0    0:new             #23  <Class Preferences>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field Context mContext>
	//    4    8:invokespecial   #26  <Method void Preferences(Context)>
	//    5   11:iconst_1        
	//    6   12:invokevirtual   #30  <Method void Preferences.setNeedsReschedule(boolean)>
	//    7   15:return          
	}

	final Context mContext;

	public WorkDatabaseMigrations$WorkMigration(Context context, int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokespecial   #15  <Method void Migration(int, int)>
		mContext = context;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #17  <Field Context mContext>
	//    7   11:return          
	}
}
