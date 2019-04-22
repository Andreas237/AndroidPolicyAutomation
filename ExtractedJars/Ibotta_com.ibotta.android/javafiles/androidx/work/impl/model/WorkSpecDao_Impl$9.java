// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;

import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.SharedSQLiteStatement;

// Referenced classes of package androidx.work.impl.model:
//			WorkSpecDao_Impl

class WorkSpecDao_Impl$9 extends SharedSQLiteStatement
{

	public String createQuery()
	{
		return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
	//    0    0:ldc1            #20  <String "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))">
	//    1    2:areturn         
	}

	final WorkSpecDao_Impl this$0;

	WorkSpecDao_Impl$9(RoomDatabase roomdatabase)
	{
		this$0 = WorkSpecDao_Impl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field WorkSpecDao_Impl this$0>
		super(roomdatabase);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #15  <Method void SharedSQLiteStatement(RoomDatabase)>
	//    6   10:return          
	}
}
