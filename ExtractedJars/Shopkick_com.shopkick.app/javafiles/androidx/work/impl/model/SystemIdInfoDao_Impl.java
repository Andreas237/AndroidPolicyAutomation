// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.*;
import android.database.Cursor;

// Referenced classes of package androidx.work.impl.model:
//			SystemIdInfoDao, SystemIdInfo

public class SystemIdInfoDao_Impl
	implements SystemIdInfoDao
{

	public SystemIdInfoDao_Impl(RoomDatabase roomdatabase)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		__db = roomdatabase;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field RoomDatabase __db>
		__insertionAdapterOfSystemIdInfo = ((EntityInsertionAdapter) (new EntityInsertionAdapter(roomdatabase) {

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
));
	//    5    9:aload_0         
	//    6   10:new             #8   <Class SystemIdInfoDao_Impl$1>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #26  <Method void SystemIdInfoDao_Impl$1(SystemIdInfoDao_Impl, RoomDatabase)>
	//   11   19:putfield        #28  <Field EntityInsertionAdapter __insertionAdapterOfSystemIdInfo>
		__preparedStmtOfRemoveSystemIdInfo = ((SharedSQLiteStatement) (new SharedSQLiteStatement(roomdatabase) {

			public String createQuery()
			{
				return "DELETE FROM SystemIdInfo where work_spec_id=?";
			//    0    0:ldc1            #20  <String "DELETE FROM SystemIdInfo where work_spec_id=?">
			//    1    2:areturn         
			}

			final SystemIdInfoDao_Impl this$0;

			
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
));
	//   12   22:aload_0         
	//   13   23:new             #10  <Class SystemIdInfoDao_Impl$2>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokespecial   #29  <Method void SystemIdInfoDao_Impl$2(SystemIdInfoDao_Impl, RoomDatabase)>
	//   18   32:putfield        #31  <Field SharedSQLiteStatement __preparedStmtOfRemoveSystemIdInfo>
	//   19   35:return          
	}

	public SystemIdInfo getSystemIdInfo(String s)
	{
		RoomSQLiteQuery roomsqlitequery;
		Cursor cursor;
		roomsqlitequery = RoomSQLiteQuery.acquire("SELECT * FROM SystemIdInfo WHERE work_spec_id=?", 1);
	//    0    0:ldc1            #36  <String "SELECT * FROM SystemIdInfo WHERE work_spec_id=?">
	//    1    2:iconst_1        
	//    2    3:invokestatic    #42  <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//    3    6:astore          4
		if(s == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       21
			roomsqlitequery.bindNull(1);
	//    6   12:aload           4
	//    7   14:iconst_1        
	//    8   15:invokevirtual   #46  <Method void RoomSQLiteQuery.bindNull(int)>
		else
	//*   9   18:goto            28
			roomsqlitequery.bindString(1, s);
	//   10   21:aload           4
	//   11   23:iconst_1        
	//   12   24:aload_1         
	//   13   25:invokevirtual   #50  <Method void RoomSQLiteQuery.bindString(int, String)>
		cursor = __db.query(((android.arch.persistence.db.SupportSQLiteQuery) (roomsqlitequery)));
	//   14   28:aload_0         
	//   15   29:getfield        #23  <Field RoomDatabase __db>
	//   16   32:aload           4
	//   17   34:invokevirtual   #56  <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
	//   18   37:astore          5
label0:
		{
			int i = cursor.getColumnIndexOrThrow("work_spec_id");
	//   19   39:aload           5
	//   20   41:ldc1            #58  <String "work_spec_id">
	//   21   43:invokeinterface #64  <Method int Cursor.getColumnIndexOrThrow(String)>
	//   22   48:istore_2        
			int j = cursor.getColumnIndexOrThrow("system_id");
	//   23   49:aload           5
	//   24   51:ldc1            #66  <String "system_id">
	//   25   53:invokeinterface #64  <Method int Cursor.getColumnIndexOrThrow(String)>
	//   26   58:istore_3        
			if(cursor.moveToFirst())
	//*  27   59:aload           5
	//*  28   61:invokeinterface #70  <Method boolean Cursor.moveToFirst()>
	//*  29   66:ifeq            96
			{
				s = ((String) (new SystemIdInfo(cursor.getString(i), cursor.getInt(j))));
	//   30   69:new             #72  <Class SystemIdInfo>
	//   31   72:dup             
	//   32   73:aload           5
	//   33   75:iload_2         
	//   34   76:invokeinterface #76  <Method String Cursor.getString(int)>
	//   35   81:aload           5
	//   36   83:iload_3         
	//   37   84:invokeinterface #80  <Method int Cursor.getInt(int)>
	//   38   89:invokespecial   #83  <Method void SystemIdInfo(String, int)>
	//   39   92:astore_1        
				break label0;
	//   40   93:goto            98
			}
			s = null;
	//   41   96:aconst_null     
	//   42   97:astore_1        
		}
		cursor.close();
	//   43   98:aload           5
	//   44  100:invokeinterface #86  <Method void Cursor.close()>
		roomsqlitequery.release();
	//   45  105:aload           4
	//   46  107:invokevirtual   #89  <Method void RoomSQLiteQuery.release()>
		return ((SystemIdInfo) (s));
	//   47  110:aload_1         
	//   48  111:areturn         
		s;
	//   49  112:astore_1        
		cursor.close();
	//   50  113:aload           5
	//   51  115:invokeinterface #86  <Method void Cursor.close()>
		roomsqlitequery.release();
	//   52  120:aload           4
	//   53  122:invokevirtual   #89  <Method void RoomSQLiteQuery.release()>
		throw s;
	//   54  125:aload_1         
	//   55  126:athrow          
	}

	public void insertSystemIdInfo(SystemIdInfo systemidinfo)
	{
		__db.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field RoomDatabase __db>
	//    2    4:invokevirtual   #94  <Method void RoomDatabase.beginTransaction()>
		__insertionAdapterOfSystemIdInfo.insert(((Object) (systemidinfo)));
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field EntityInsertionAdapter __insertionAdapterOfSystemIdInfo>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #100 <Method void EntityInsertionAdapter.insert(Object)>
		__db.setTransactionSuccessful();
	//    7   15:aload_0         
	//    8   16:getfield        #23  <Field RoomDatabase __db>
	//    9   19:invokevirtual   #103 <Method void RoomDatabase.setTransactionSuccessful()>
		__db.endTransaction();
	//   10   22:aload_0         
	//   11   23:getfield        #23  <Field RoomDatabase __db>
	//   12   26:invokevirtual   #106 <Method void RoomDatabase.endTransaction()>
		return;
	//   13   29:return          
		systemidinfo;
	//   14   30:astore_1        
		__db.endTransaction();
	//   15   31:aload_0         
	//   16   32:getfield        #23  <Field RoomDatabase __db>
	//   17   35:invokevirtual   #106 <Method void RoomDatabase.endTransaction()>
		throw systemidinfo;
	//   18   38:aload_1         
	//   19   39:athrow          
	}

	public void removeSystemIdInfo(String s)
	{
		SupportSQLiteStatement supportsqlitestatement;
		supportsqlitestatement = __preparedStmtOfRemoveSystemIdInfo.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field SharedSQLiteStatement __preparedStmtOfRemoveSystemIdInfo>
	//    2    4:invokevirtual   #113 <Method SupportSQLiteStatement SharedSQLiteStatement.acquire()>
	//    3    7:astore_2        
		__db.beginTransaction();
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field RoomDatabase __db>
	//    6   12:invokevirtual   #94  <Method void RoomDatabase.beginTransaction()>
		if(s != null)
			break MISSING_BLOCK_LABEL_29;
	//    7   15:aload_1         
	//    8   16:ifnonnull       29
		supportsqlitestatement.bindNull(1);
	//    9   19:aload_2         
	//   10   20:iconst_1        
	//   11   21:invokeinterface #116 <Method void SupportSQLiteStatement.bindNull(int)>
		break MISSING_BLOCK_LABEL_37;
	//   12   26:goto            37
		supportsqlitestatement.bindString(1, s);
	//   13   29:aload_2         
	//   14   30:iconst_1        
	//   15   31:aload_1         
	//   16   32:invokeinterface #117 <Method void SupportSQLiteStatement.bindString(int, String)>
		supportsqlitestatement.executeUpdateDelete();
	//   17   37:aload_2         
	//   18   38:invokeinterface #121 <Method int SupportSQLiteStatement.executeUpdateDelete()>
	//   19   43:pop             
		__db.setTransactionSuccessful();
	//   20   44:aload_0         
	//   21   45:getfield        #23  <Field RoomDatabase __db>
	//   22   48:invokevirtual   #103 <Method void RoomDatabase.setTransactionSuccessful()>
		__db.endTransaction();
	//   23   51:aload_0         
	//   24   52:getfield        #23  <Field RoomDatabase __db>
	//   25   55:invokevirtual   #106 <Method void RoomDatabase.endTransaction()>
		__preparedStmtOfRemoveSystemIdInfo.release(supportsqlitestatement);
	//   26   58:aload_0         
	//   27   59:getfield        #31  <Field SharedSQLiteStatement __preparedStmtOfRemoveSystemIdInfo>
	//   28   62:aload_2         
	//   29   63:invokevirtual   #124 <Method void SharedSQLiteStatement.release(SupportSQLiteStatement)>
		return;
	//   30   66:return          
		s;
	//   31   67:astore_1        
		__db.endTransaction();
	//   32   68:aload_0         
	//   33   69:getfield        #23  <Field RoomDatabase __db>
	//   34   72:invokevirtual   #106 <Method void RoomDatabase.endTransaction()>
		__preparedStmtOfRemoveSystemIdInfo.release(supportsqlitestatement);
	//   35   75:aload_0         
	//   36   76:getfield        #31  <Field SharedSQLiteStatement __preparedStmtOfRemoveSystemIdInfo>
	//   37   79:aload_2         
	//   38   80:invokevirtual   #124 <Method void SharedSQLiteStatement.release(SupportSQLiteStatement)>
		throw s;
	//   39   83:aload_1         
	//   40   84:athrow          
	}

	private final RoomDatabase __db;
	private final EntityInsertionAdapter __insertionAdapterOfSystemIdInfo;
	private final SharedSQLiteStatement __preparedStmtOfRemoveSystemIdInfo;
}
