// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.*;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package androidx.work.impl.model:
//			WorkNameDao, WorkName

public class WorkNameDao_Impl
	implements WorkNameDao
{

	public WorkNameDao_Impl(RoomDatabase roomdatabase)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		__db = roomdatabase;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field RoomDatabase __db>
		__insertionAdapterOfWorkName = ((EntityInsertionAdapter) (new EntityInsertionAdapter(roomdatabase) {

			public void bind(SupportSQLiteStatement supportsqlitestatement, WorkName workname)
			{
				if(workname.name == null)
			//*   0    0:aload_2         
			//*   1    1:getfield        #25  <Field String WorkName.name>
			//*   2    4:ifnonnull       17
					supportsqlitestatement.bindNull(1);
			//    3    7:aload_1         
			//    4    8:iconst_1        
			//    5    9:invokeinterface #31  <Method void SupportSQLiteStatement.bindNull(int)>
				else
			//*   6   14:goto            28
					supportsqlitestatement.bindString(1, workname.name);
			//    7   17:aload_1         
			//    8   18:iconst_1        
			//    9   19:aload_2         
			//   10   20:getfield        #25  <Field String WorkName.name>
			//   11   23:invokeinterface #35  <Method void SupportSQLiteStatement.bindString(int, String)>
				if(workname.workSpecId == null)
			//*  12   28:aload_2         
			//*  13   29:getfield        #38  <Field String WorkName.workSpecId>
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
					supportsqlitestatement.bindString(2, workname.workSpecId);
			//   19   43:aload_1         
			//   20   44:iconst_2        
			//   21   45:aload_2         
			//   22   46:getfield        #38  <Field String WorkName.workSpecId>
			//   23   49:invokeinterface #35  <Method void SupportSQLiteStatement.bindString(int, String)>
					return;
			//   24   54:return          
				}
			}

			public volatile void bind(SupportSQLiteStatement supportsqlitestatement, Object obj)
			{
				bind(supportsqlitestatement, (WorkName)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #21  <Class WorkName>
			//    4    6:invokevirtual   #41  <Method void bind(SupportSQLiteStatement, WorkName)>
			//    5    9:return          
			}

			public String createQuery()
			{
				return "INSERT OR IGNORE INTO `WorkName`(`name`,`work_spec_id`) VALUES (?,?)";
			//    0    0:ldc1            #45  <String "INSERT OR IGNORE INTO `WorkName`(`name`,`work_spec_id`) VALUES (?,?)">
			//    1    2:areturn         
			}

			final WorkNameDao_Impl this$0;

			
			{
				this$0 = WorkNameDao_Impl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field WorkNameDao_Impl this$0>
				super(roomdatabase);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #16  <Method void EntityInsertionAdapter(RoomDatabase)>
			//    6   10:return          
			}
		}
));
	//    5    9:aload_0         
	//    6   10:new             #8   <Class WorkNameDao_Impl$1>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #22  <Method void WorkNameDao_Impl$1(WorkNameDao_Impl, RoomDatabase)>
	//   11   19:putfield        #24  <Field EntityInsertionAdapter __insertionAdapterOfWorkName>
	//   12   22:return          
	}

	public List getWorkSpecIdsWithName(String s)
	{
		RoomSQLiteQuery roomsqlitequery;
		roomsqlitequery = RoomSQLiteQuery.acquire("SELECT work_spec_id FROM workname WHERE name=?", 1);
	//    0    0:ldc1            #29  <String "SELECT work_spec_id FROM workname WHERE name=?">
	//    1    2:iconst_1        
	//    2    3:invokestatic    #35  <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//    3    6:astore_2        
		if(s == null)
	//*   4    7:aload_1         
	//*   5    8:ifnonnull       19
			roomsqlitequery.bindNull(1);
	//    6   11:aload_2         
	//    7   12:iconst_1        
	//    8   13:invokevirtual   #39  <Method void RoomSQLiteQuery.bindNull(int)>
		else
	//*   9   16:goto            25
			roomsqlitequery.bindString(1, s);
	//   10   19:aload_2         
	//   11   20:iconst_1        
	//   12   21:aload_1         
	//   13   22:invokevirtual   #43  <Method void RoomSQLiteQuery.bindString(int, String)>
		s = ((String) (__db.query(((android.arch.persistence.db.SupportSQLiteQuery) (roomsqlitequery)))));
	//   14   25:aload_0         
	//   15   26:getfield        #19  <Field RoomDatabase __db>
	//   16   29:aload_2         
	//   17   30:invokevirtual   #49  <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
	//   18   33:astore_1        
		ArrayList arraylist;
		arraylist = new ArrayList(((Cursor) (s)).getCount());
	//   19   34:new             #51  <Class ArrayList>
	//   20   37:dup             
	//   21   38:aload_1         
	//   22   39:invokeinterface #57  <Method int Cursor.getCount()>
	//   23   44:invokespecial   #59  <Method void ArrayList(int)>
	//   24   47:astore_3        
		for(; ((Cursor) (s)).moveToNext(); ((List) (arraylist)).add(((Object) (((Cursor) (s)).getString(0)))));
	//   25   48:aload_1         
	//   26   49:invokeinterface #63  <Method boolean Cursor.moveToNext()>
	//   27   54:ifeq            74
	//   28   57:aload_3         
	//   29   58:aload_1         
	//   30   59:iconst_0        
	//   31   60:invokeinterface #67  <Method String Cursor.getString(int)>
	//   32   65:invokeinterface #73  <Method boolean List.add(Object)>
	//   33   70:pop             
	//*  34   71:goto            48
		((Cursor) (s)).close();
	//   35   74:aload_1         
	//   36   75:invokeinterface #76  <Method void Cursor.close()>
		roomsqlitequery.release();
	//   37   80:aload_2         
	//   38   81:invokevirtual   #79  <Method void RoomSQLiteQuery.release()>
		return ((List) (arraylist));
	//   39   84:aload_3         
	//   40   85:areturn         
		Exception exception;
		exception;
	//   41   86:astore_3        
		((Cursor) (s)).close();
	//   42   87:aload_1         
	//   43   88:invokeinterface #76  <Method void Cursor.close()>
		roomsqlitequery.release();
	//   44   93:aload_2         
	//   45   94:invokevirtual   #79  <Method void RoomSQLiteQuery.release()>
		throw exception;
	//   46   97:aload_3         
	//   47   98:athrow          
	}

	public void insert(WorkName workname)
	{
		__db.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RoomDatabase __db>
	//    2    4:invokevirtual   #86  <Method void RoomDatabase.beginTransaction()>
		__insertionAdapterOfWorkName.insert(((Object) (workname)));
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field EntityInsertionAdapter __insertionAdapterOfWorkName>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #91  <Method void EntityInsertionAdapter.insert(Object)>
		__db.setTransactionSuccessful();
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field RoomDatabase __db>
	//    9   19:invokevirtual   #94  <Method void RoomDatabase.setTransactionSuccessful()>
		__db.endTransaction();
	//   10   22:aload_0         
	//   11   23:getfield        #19  <Field RoomDatabase __db>
	//   12   26:invokevirtual   #97  <Method void RoomDatabase.endTransaction()>
		return;
	//   13   29:return          
		workname;
	//   14   30:astore_1        
		__db.endTransaction();
	//   15   31:aload_0         
	//   16   32:getfield        #19  <Field RoomDatabase __db>
	//   17   35:invokevirtual   #97  <Method void RoomDatabase.endTransaction()>
		throw workname;
	//   18   38:aload_1         
	//   19   39:athrow          
	}

	private final RoomDatabase __db;
	private final EntityInsertionAdapter __insertionAdapterOfWorkName;
}
