// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;

// Referenced classes of package androidx.work.impl.model:
//			DependencyDao_Impl, Dependency

class DependencyDao_Impl$1 extends EntityInsertionAdapter
{

	public void bind(SupportSQLiteStatement supportsqlitestatement, Dependency dependency)
	{
		if(dependency.workSpecId == null)
	//*   0    0:aload_2         
	//*   1    1:getfield        #25  <Field String Dependency.workSpecId>
	//*   2    4:ifnonnull       17
			supportsqlitestatement.bindNull(1);
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:invokeinterface #31  <Method void SupportSQLiteStatement.bindNull(int)>
		else
	//*   6   14:goto            28
			supportsqlitestatement.bindString(1, dependency.workSpecId);
	//    7   17:aload_1         
	//    8   18:iconst_1        
	//    9   19:aload_2         
	//   10   20:getfield        #25  <Field String Dependency.workSpecId>
	//   11   23:invokeinterface #35  <Method void SupportSQLiteStatement.bindString(int, String)>
		if(dependency.prerequisiteId == null)
	//*  12   28:aload_2         
	//*  13   29:getfield        #38  <Field String Dependency.prerequisiteId>
	//*  14   32:ifnonnull       43
		{
			supportsqlitestatement.bindNull(2);
	//   15   35:aload_1         
	//   16   36:iconst_2        
	//   17   37:invokeinterface #31  <Method void SupportSQLiteStatement.bindNull(int)>
			return;
	//   18   42:return          
		} else
		{
			supportsqlitestatement.bindString(2, dependency.prerequisiteId);
	//   19   43:aload_1         
	//   20   44:iconst_2        
	//   21   45:aload_2         
	//   22   46:getfield        #38  <Field String Dependency.prerequisiteId>
	//   23   49:invokeinterface #35  <Method void SupportSQLiteStatement.bindString(int, String)>
			return;
	//   24   54:return          
		}
	}

	public volatile void bind(SupportSQLiteStatement supportsqlitestatement, Object obj)
	{
		bind(supportsqlitestatement, (Dependency)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #21  <Class Dependency>
	//    4    6:invokevirtual   #41  <Method void bind(SupportSQLiteStatement, Dependency)>
	//    5    9:return          
	}

	public String createQuery()
	{
		return "INSERT OR IGNORE INTO `Dependency`(`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
	//    0    0:ldc1            #45  <String "INSERT OR IGNORE INTO `Dependency`(`work_spec_id`,`prerequisite_id`) VALUES (?,?)">
	//    1    2:areturn         
	}

	final DependencyDao_Impl this$0;

	DependencyDao_Impl$1(RoomDatabase roomdatabase)
	{
		this$0 = DependencyDao_Impl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field DependencyDao_Impl this$0>
		super(roomdatabase);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void EntityInsertionAdapter(RoomDatabase)>
	//    6   10:return          
	}
}
