// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;

// Referenced classes of package androidx.work.impl.model:
//			SystemIdInfoDao_Impl, SystemIdInfo

class SystemIdInfoDao_Impl$1 extends EntityInsertionAdapter
{

	public void bind(SupportSQLiteStatement supportsqlitestatement, SystemIdInfo systemidinfo)
	{
		if(systemidinfo.workSpecId == null)
	//*   0    0:aload_2         
	//*   1    1:getfield        #25  <Field String SystemIdInfo.workSpecId>
	//*   2    4:ifnonnull       17
			supportsqlitestatement.bindNull(1);
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:invokeinterface #31  <Method void SupportSQLiteStatement.bindNull(int)>
		else
	//*   6   14:goto            28
			supportsqlitestatement.bindString(1, systemidinfo.workSpecId);
	//    7   17:aload_1         
	//    8   18:iconst_1        
	//    9   19:aload_2         
	//   10   20:getfield        #25  <Field String SystemIdInfo.workSpecId>
	//   11   23:invokeinterface #35  <Method void SupportSQLiteStatement.bindString(int, String)>
		supportsqlitestatement.bindLong(2, systemidinfo.systemId);
	//   12   28:aload_1         
	//   13   29:iconst_2        
	//   14   30:aload_2         
	//   15   31:getfield        #39  <Field int SystemIdInfo.systemId>
	//   16   34:i2l             
	//   17   35:invokeinterface #43  <Method void SupportSQLiteStatement.bindLong(int, long)>
	//   18   40:return          
	}

	public volatile void bind(SupportSQLiteStatement supportsqlitestatement, Object obj)
	{
		bind(supportsqlitestatement, (SystemIdInfo)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #21  <Class SystemIdInfo>
	//    4    6:invokevirtual   #46  <Method void bind(SupportSQLiteStatement, SystemIdInfo)>
	//    5    9:return          
	}

	public String createQuery()
	{
		return "INSERT OR REPLACE INTO `SystemIdInfo`(`work_spec_id`,`system_id`) VALUES (?,?)";
	//    0    0:ldc1            #50  <String "INSERT OR REPLACE INTO `SystemIdInfo`(`work_spec_id`,`system_id`) VALUES (?,?)">
	//    1    2:areturn         
	}

	final SystemIdInfoDao_Impl this$0;

	SystemIdInfoDao_Impl$1(RoomDatabase roomdatabase)
	{
		this$0 = SystemIdInfoDao_Impl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field SystemIdInfoDao_Impl this$0>
		super(roomdatabase);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void EntityInsertionAdapter(RoomDatabase)>
	//    6   10:return          
	}
}
