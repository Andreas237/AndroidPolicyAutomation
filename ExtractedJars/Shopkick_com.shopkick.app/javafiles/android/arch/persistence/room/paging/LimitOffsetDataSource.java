// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room.paging;

import android.arch.paging.PositionalDataSource;
import android.arch.persistence.db.SupportSQLiteQuery;
import android.arch.persistence.room.*;
import android.database.Cursor;
import java.util.*;

public abstract class LimitOffsetDataSource extends PositionalDataSource
{

	protected transient LimitOffsetDataSource(RoomDatabase roomdatabase, SupportSQLiteQuery supportsqlitequery, boolean flag, String as[])
	{
		this(roomdatabase, RoomSQLiteQuery.copyFrom(supportsqlitequery), flag, as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #30  <Method RoomSQLiteQuery RoomSQLiteQuery.copyFrom(SupportSQLiteQuery)>
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #33  <Method void LimitOffsetDataSource(RoomDatabase, RoomSQLiteQuery, boolean, String[])>
	//    7   12:return          
	}

	protected transient LimitOffsetDataSource(RoomDatabase roomdatabase, RoomSQLiteQuery roomsqlitequery, boolean flag, String as[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void PositionalDataSource()>
		mDb = roomdatabase;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field RoomDatabase mDb>
		mSourceQuery = roomsqlitequery;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #41  <Field RoomSQLiteQuery mSourceQuery>
		mInTransaction = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #43  <Field boolean mInTransaction>
		roomsqlitequery = ((RoomSQLiteQuery) (new StringBuilder()));
	//   11   19:new             #45  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #46  <Method void StringBuilder()>
	//   14   26:astore_2        
		((StringBuilder) (roomsqlitequery)).append("SELECT COUNT(*) FROM ( ");
	//   15   27:aload_2         
	//   16   28:ldc1            #48  <String "SELECT COUNT(*) FROM ( ">
	//   17   30:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
		((StringBuilder) (roomsqlitequery)).append(mSourceQuery.getSql());
	//   19   34:aload_2         
	//   20   35:aload_0         
	//   21   36:getfield        #41  <Field RoomSQLiteQuery mSourceQuery>
	//   22   39:invokevirtual   #56  <Method String RoomSQLiteQuery.getSql()>
	//   23   42:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
		((StringBuilder) (roomsqlitequery)).append(" )");
	//   25   46:aload_2         
	//   26   47:ldc1            #58  <String " )">
	//   27   49:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
		mCountQuery = ((StringBuilder) (roomsqlitequery)).toString();
	//   29   53:aload_0         
	//   30   54:aload_2         
	//   31   55:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   32   58:putfield        #63  <Field String mCountQuery>
		roomsqlitequery = ((RoomSQLiteQuery) (new StringBuilder()));
	//   33   61:new             #45  <Class StringBuilder>
	//   34   64:dup             
	//   35   65:invokespecial   #46  <Method void StringBuilder()>
	//   36   68:astore_2        
		((StringBuilder) (roomsqlitequery)).append("SELECT * FROM ( ");
	//   37   69:aload_2         
	//   38   70:ldc1            #65  <String "SELECT * FROM ( ">
	//   39   72:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   40   75:pop             
		((StringBuilder) (roomsqlitequery)).append(mSourceQuery.getSql());
	//   41   76:aload_2         
	//   42   77:aload_0         
	//   43   78:getfield        #41  <Field RoomSQLiteQuery mSourceQuery>
	//   44   81:invokevirtual   #56  <Method String RoomSQLiteQuery.getSql()>
	//   45   84:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   46   87:pop             
		((StringBuilder) (roomsqlitequery)).append(" ) LIMIT ? OFFSET ?");
	//   47   88:aload_2         
	//   48   89:ldc1            #67  <String " ) LIMIT ? OFFSET ?">
	//   49   91:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   50   94:pop             
		mLimitOffsetQuery = ((StringBuilder) (roomsqlitequery)).toString();
	//   51   95:aload_0         
	//   52   96:aload_2         
	//   53   97:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   54  100:putfield        #69  <Field String mLimitOffsetQuery>
		mObserver = ((android.arch.persistence.room.InvalidationTracker.Observer) (new android.arch.persistence.room.InvalidationTracker.Observer(as) {

			public void onInvalidated(Set set)
			{
				invalidate();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field LimitOffsetDataSource this$0>
			//    2    4:invokevirtual   #25  <Method void LimitOffsetDataSource.invalidate()>
			//    3    7:return          
			}

			final LimitOffsetDataSource this$0;

			
			{
				this$0 = LimitOffsetDataSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field LimitOffsetDataSource this$0>
				super(as);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #17  <Method void android.arch.persistence.room.InvalidationTracker$Observer(String[])>
			//    6   10:return          
			}
		}
));
	//   55  103:aload_0         
	//   56  104:new             #7   <Class LimitOffsetDataSource$1>
	//   57  107:dup             
	//   58  108:aload_0         
	//   59  109:aload           4
	//   60  111:invokespecial   #72  <Method void LimitOffsetDataSource$1(LimitOffsetDataSource, String[])>
	//   61  114:putfield        #74  <Field android.arch.persistence.room.InvalidationTracker$Observer mObserver>
		roomdatabase.getInvalidationTracker().addWeakObserver(mObserver);
	//   62  117:aload_1         
	//   63  118:invokevirtual   #80  <Method InvalidationTracker RoomDatabase.getInvalidationTracker()>
	//   64  121:aload_0         
	//   65  122:getfield        #74  <Field android.arch.persistence.room.InvalidationTracker$Observer mObserver>
	//   66  125:invokevirtual   #86  <Method void InvalidationTracker.addWeakObserver(android.arch.persistence.room.InvalidationTracker$Observer)>
	//   67  128:return          
	}

	protected abstract List convertRows(Cursor cursor);

	public int countItems()
	{
		RoomSQLiteQuery roomsqlitequery;
		Cursor cursor;
		roomsqlitequery = RoomSQLiteQuery.acquire(mCountQuery, mSourceQuery.getArgCount());
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String mCountQuery>
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field RoomSQLiteQuery mSourceQuery>
	//    4    8:invokevirtual   #93  <Method int RoomSQLiteQuery.getArgCount()>
	//    5   11:invokestatic    #97  <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//    6   14:astore_2        
		roomsqlitequery.copyArgumentsFrom(mSourceQuery);
	//    7   15:aload_2         
	//    8   16:aload_0         
	//    9   17:getfield        #41  <Field RoomSQLiteQuery mSourceQuery>
	//   10   20:invokevirtual   #101 <Method void RoomSQLiteQuery.copyArgumentsFrom(RoomSQLiteQuery)>
		cursor = mDb.query(((SupportSQLiteQuery) (roomsqlitequery)));
	//   11   23:aload_0         
	//   12   24:getfield        #39  <Field RoomDatabase mDb>
	//   13   27:aload_2         
	//   14   28:invokevirtual   #105 <Method Cursor RoomDatabase.query(SupportSQLiteQuery)>
	//   15   31:astore_3        
		int i;
		if(!cursor.moveToFirst())
			break MISSING_BLOCK_LABEL_61;
	//   16   32:aload_3         
	//   17   33:invokeinterface #111 <Method boolean Cursor.moveToFirst()>
	//   18   38:ifeq            61
		i = cursor.getInt(0);
	//   19   41:aload_3         
	//   20   42:iconst_0        
	//   21   43:invokeinterface #115 <Method int Cursor.getInt(int)>
	//   22   48:istore_1        
		cursor.close();
	//   23   49:aload_3         
	//   24   50:invokeinterface #118 <Method void Cursor.close()>
		roomsqlitequery.release();
	//   25   55:aload_2         
	//   26   56:invokevirtual   #121 <Method void RoomSQLiteQuery.release()>
		return i;
	//   27   59:iload_1         
	//   28   60:ireturn         
		cursor.close();
	//   29   61:aload_3         
	//   30   62:invokeinterface #118 <Method void Cursor.close()>
		roomsqlitequery.release();
	//   31   67:aload_2         
	//   32   68:invokevirtual   #121 <Method void RoomSQLiteQuery.release()>
		return 0;
	//   33   71:iconst_0        
	//   34   72:ireturn         
		Exception exception;
		exception;
	//   35   73:astore          4
		cursor.close();
	//   36   75:aload_3         
	//   37   76:invokeinterface #118 <Method void Cursor.close()>
		roomsqlitequery.release();
	//   38   81:aload_2         
	//   39   82:invokevirtual   #121 <Method void RoomSQLiteQuery.release()>
		throw exception;
	//   40   85:aload           4
	//   41   87:athrow          
	}

	public boolean isInvalid()
	{
		mDb.getInvalidationTracker().refreshVersionsSync();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field RoomDatabase mDb>
	//    2    4:invokevirtual   #80  <Method InvalidationTracker RoomDatabase.getInvalidationTracker()>
	//    3    7:invokevirtual   #125 <Method void InvalidationTracker.refreshVersionsSync()>
		return super.isInvalid();
	//    4   10:aload_0         
	//    5   11:invokespecial   #127 <Method boolean PositionalDataSource.isInvalid()>
	//    6   14:ireturn         
	}

	public void loadInitial(android.arch.paging.PositionalDataSource.LoadInitialParams loadinitialparams, android.arch.paging.PositionalDataSource.LoadInitialCallback loadinitialcallback)
	{
		int i = countItems();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #132 <Method int countItems()>
	//    2    4:istore_3        
		if(i == 0)
	//*   3    5:iload_3         
	//*   4    6:ifne            19
		{
			loadinitialcallback.onResult(Collections.emptyList(), 0, 0);
	//    5    9:aload_2         
	//    6   10:invokestatic    #138 <Method List Collections.emptyList()>
	//    7   13:iconst_0        
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #144 <Method void android.arch.paging.PositionalDataSource$LoadInitialCallback.onResult(List, int, int)>
			return;
	//   10   18:return          
		}
		int j = computeInitialLoadPosition(loadinitialparams, i);
	//   11   19:aload_1         
	//   12   20:iload_3         
	//   13   21:invokestatic    #148 <Method int computeInitialLoadPosition(android.arch.paging.PositionalDataSource$LoadInitialParams, int)>
	//   14   24:istore          4
		int k = computeInitialLoadSize(loadinitialparams, j, i);
	//   15   26:aload_1         
	//   16   27:iload           4
	//   17   29:iload_3         
	//   18   30:invokestatic    #152 <Method int computeInitialLoadSize(android.arch.paging.PositionalDataSource$LoadInitialParams, int, int)>
	//   19   33:istore          5
		loadinitialparams = ((android.arch.paging.PositionalDataSource.LoadInitialParams) (loadRange(j, k)));
	//   20   35:aload_0         
	//   21   36:iload           4
	//   22   38:iload           5
	//   23   40:invokevirtual   #156 <Method List loadRange(int, int)>
	//   24   43:astore_1        
		if(loadinitialparams != null && ((List) (loadinitialparams)).size() == k)
	//*  25   44:aload_1         
	//*  26   45:ifnull          68
	//*  27   48:aload_1         
	//*  28   49:invokeinterface #161 <Method int List.size()>
	//*  29   54:iload           5
	//*  30   56:icmpne          68
		{
			loadinitialcallback.onResult(((List) (loadinitialparams)), j, i);
	//   31   59:aload_2         
	//   32   60:aload_1         
	//   33   61:iload           4
	//   34   63:iload_3         
	//   35   64:invokevirtual   #144 <Method void android.arch.paging.PositionalDataSource$LoadInitialCallback.onResult(List, int, int)>
			return;
	//   36   67:return          
		} else
		{
			invalidate();
	//   37   68:aload_0         
	//   38   69:invokevirtual   #164 <Method void invalidate()>
			return;
	//   39   72:return          
		}
	}

	public List loadRange(int i, int j)
	{
		Cursor cursor;
		RoomSQLiteQuery roomsqlitequery;
		roomsqlitequery = RoomSQLiteQuery.acquire(mLimitOffsetQuery, mSourceQuery.getArgCount() + 2);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field String mLimitOffsetQuery>
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field RoomSQLiteQuery mSourceQuery>
	//    4    8:invokevirtual   #93  <Method int RoomSQLiteQuery.getArgCount()>
	//    5   11:iconst_2        
	//    6   12:iadd            
	//    7   13:invokestatic    #97  <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//    8   16:astore          5
		roomsqlitequery.copyArgumentsFrom(mSourceQuery);
	//    9   18:aload           5
	//   10   20:aload_0         
	//   11   21:getfield        #41  <Field RoomSQLiteQuery mSourceQuery>
	//   12   24:invokevirtual   #101 <Method void RoomSQLiteQuery.copyArgumentsFrom(RoomSQLiteQuery)>
		roomsqlitequery.bindLong(roomsqlitequery.getArgCount() - 1, j);
	//   13   27:aload           5
	//   14   29:aload           5
	//   15   31:invokevirtual   #93  <Method int RoomSQLiteQuery.getArgCount()>
	//   16   34:iconst_1        
	//   17   35:isub            
	//   18   36:iload_2         
	//   19   37:i2l             
	//   20   38:invokevirtual   #172 <Method void RoomSQLiteQuery.bindLong(int, long)>
		roomsqlitequery.bindLong(roomsqlitequery.getArgCount(), i);
	//   21   41:aload           5
	//   22   43:aload           5
	//   23   45:invokevirtual   #93  <Method int RoomSQLiteQuery.getArgCount()>
	//   24   48:iload_1         
	//   25   49:i2l             
	//   26   50:invokevirtual   #172 <Method void RoomSQLiteQuery.bindLong(int, long)>
		if(!mInTransaction)
			break MISSING_BLOCK_LABEL_155;
	//   27   53:aload_0         
	//   28   54:getfield        #43  <Field boolean mInTransaction>
	//   29   57:ifeq            155
		mDb.beginTransaction();
	//   30   60:aload_0         
	//   31   61:getfield        #39  <Field RoomDatabase mDb>
	//   32   64:invokevirtual   #175 <Method void RoomDatabase.beginTransaction()>
		cursor = null;
	//   33   67:aconst_null     
	//   34   68:astore_3        
		Object obj = ((Object) (mDb.query(((SupportSQLiteQuery) (roomsqlitequery)))));
	//   35   69:aload_0         
	//   36   70:getfield        #39  <Field RoomDatabase mDb>
	//   37   73:aload           5
	//   38   75:invokevirtual   #105 <Method Cursor RoomDatabase.query(SupportSQLiteQuery)>
	//   39   78:astore          4
		cursor = ((Cursor) (obj));
	//   40   80:aload           4
	//   41   82:astore_3        
		List list = convertRows(((Cursor) (obj)));
	//   42   83:aload_0         
	//   43   84:aload           4
	//   44   86:invokevirtual   #177 <Method List convertRows(Cursor)>
	//   45   89:astore          6
		cursor = ((Cursor) (obj));
	//   46   91:aload           4
	//   47   93:astore_3        
		mDb.setTransactionSuccessful();
	//   48   94:aload_0         
	//   49   95:getfield        #39  <Field RoomDatabase mDb>
	//   50   98:invokevirtual   #180 <Method void RoomDatabase.setTransactionSuccessful()>
		if(obj != null)
	//*  51  101:aload           4
	//*  52  103:ifnull          113
			((Cursor) (obj)).close();
	//   53  106:aload           4
	//   54  108:invokeinterface #118 <Method void Cursor.close()>
		mDb.endTransaction();
	//   55  113:aload_0         
	//   56  114:getfield        #39  <Field RoomDatabase mDb>
	//   57  117:invokevirtual   #183 <Method void RoomDatabase.endTransaction()>
		roomsqlitequery.release();
	//   58  120:aload           5
	//   59  122:invokevirtual   #121 <Method void RoomSQLiteQuery.release()>
		return list;
	//   60  125:aload           6
	//   61  127:areturn         
		Exception exception;
		exception;
	//   62  128:astore          4
		if(cursor != null)
	//*  63  130:aload_3         
	//*  64  131:ifnull          140
			cursor.close();
	//   65  134:aload_3         
	//   66  135:invokeinterface #118 <Method void Cursor.close()>
		mDb.endTransaction();
	//   67  140:aload_0         
	//   68  141:getfield        #39  <Field RoomDatabase mDb>
	//   69  144:invokevirtual   #183 <Method void RoomDatabase.endTransaction()>
		roomsqlitequery.release();
	//   70  147:aload           5
	//   71  149:invokevirtual   #121 <Method void RoomSQLiteQuery.release()>
		throw exception;
	//   72  152:aload           4
	//   73  154:athrow          
		cursor = mDb.query(((SupportSQLiteQuery) (roomsqlitequery)));
	//   74  155:aload_0         
	//   75  156:getfield        #39  <Field RoomDatabase mDb>
	//   76  159:aload           5
	//   77  161:invokevirtual   #105 <Method Cursor RoomDatabase.query(SupportSQLiteQuery)>
	//   78  164:astore_3        
		exception = ((Exception) (convertRows(cursor)));
	//   79  165:aload_0         
	//   80  166:aload_3         
	//   81  167:invokevirtual   #177 <Method List convertRows(Cursor)>
	//   82  170:astore          4
		cursor.close();
	//   83  172:aload_3         
	//   84  173:invokeinterface #118 <Method void Cursor.close()>
		roomsqlitequery.release();
	//   85  178:aload           5
	//   86  180:invokevirtual   #121 <Method void RoomSQLiteQuery.release()>
		return ((List) (exception));
	//   87  183:aload           4
	//   88  185:areturn         
		exception;
	//   89  186:astore          4
		cursor.close();
	//   90  188:aload_3         
	//   91  189:invokeinterface #118 <Method void Cursor.close()>
		roomsqlitequery.release();
	//   92  194:aload           5
	//   93  196:invokevirtual   #121 <Method void RoomSQLiteQuery.release()>
		throw exception;
	//   94  199:aload           4
	//   95  201:athrow          
	}

	public void loadRange(android.arch.paging.PositionalDataSource.LoadRangeParams loadrangeparams, android.arch.paging.PositionalDataSource.LoadRangeCallback loadrangecallback)
	{
		loadrangeparams = ((android.arch.paging.PositionalDataSource.LoadRangeParams) (loadRange(loadrangeparams.startPosition, loadrangeparams.loadSize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #192 <Field int android.arch.paging.PositionalDataSource$LoadRangeParams.startPosition>
	//    3    5:aload_1         
	//    4    6:getfield        #195 <Field int android.arch.paging.PositionalDataSource$LoadRangeParams.loadSize>
	//    5    9:invokevirtual   #156 <Method List loadRange(int, int)>
	//    6   12:astore_1        
		if(loadrangeparams != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          23
		{
			loadrangecallback.onResult(((List) (loadrangeparams)));
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #200 <Method void android.arch.paging.PositionalDataSource$LoadRangeCallback.onResult(List)>
			return;
	//   12   22:return          
		} else
		{
			invalidate();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #164 <Method void invalidate()>
			return;
	//   15   27:return          
		}
	}

	private final String mCountQuery;
	private final RoomDatabase mDb;
	private final boolean mInTransaction;
	private final String mLimitOffsetQuery;
	private final android.arch.persistence.room.InvalidationTracker.Observer mObserver;
	private final RoomSQLiteQuery mSourceQuery;
}
