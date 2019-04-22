// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;

import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.SharedSQLiteStatement;

// Referenced classes of package androidx.work.impl.model:
//			SystemIdInfoDao_Impl

class SystemIdInfoDao_Impl$2 extends SharedSQLiteStatement
{

	public String createQuery()
	{
		return "DELETE FROM SystemIdInfo where work_spec_id=?";
	//    0    0:ldc1            #20  <String "DELETE FROM SystemIdInfo where work_spec_id=?">
	//    1    2:areturn         
	}

	final SystemIdInfoDao_Impl this$0;

	SystemIdInfoDao_Impl$2(RoomDatabase roomdatabase)
	{
		this$0 = SystemIdInfoDao_Impl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field SystemIdInfoDao_Impl this$0>
		super(roomdatabase);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #15  <Method void SharedSQLiteStatement(RoomDatabase)>
	//    6   10:return          
	}
}
