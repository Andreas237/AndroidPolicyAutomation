// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import android.arch.core.internal.SafeIterableMap;
import android.arch.persistence.db.*;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

// Referenced classes of package android.arch.persistence.room:
//			InvalidationTracker, RoomDatabase

class InvalidationTracker$1
	implements Runnable
{

	private boolean checkUpdatedTable()
	{
		boolean flag;
		Cursor cursor;
		cursor = InvalidationTracker.access$000(InvalidationTracker.this).query("SELECT * FROM room_table_modification_log WHERE version  > ? ORDER BY version ASC;", InvalidationTracker.access$300(InvalidationTracker.this));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field InvalidationTracker this$0>
	//    2    4:invokestatic    #24  <Method RoomDatabase InvalidationTracker.access$000(InvalidationTracker)>
	//    3    7:ldc1            #26  <String "SELECT * FROM room_table_modification_log WHERE version  > ? ORDER BY version ASC;">
	//    4    9:aload_0         
	//    5   10:getfield        #14  <Field InvalidationTracker this$0>
	//    6   13:invokestatic    #30  <Method Object[] InvalidationTracker.access$300(InvalidationTracker)>
	//    7   16:invokevirtual   #36  <Method Cursor RoomDatabase.query(String, Object[])>
	//    8   19:astore          5
		flag = false;
	//    9   21:iconst_0        
	//   10   22:istore_2        
_L2:
		if(!cursor.moveToNext())
			break; /* Loop/switch isn't completed */
	//   11   23:aload           5
	//   12   25:invokeinterface #41  <Method boolean Cursor.moveToNext()>
	//   13   30:ifeq            75
		long l = cursor.getLong(0);
	//   14   33:aload           5
	//   15   35:iconst_0        
	//   16   36:invokeinterface #45  <Method long Cursor.getLong(int)>
	//   17   41:lstore_3        
		int i = cursor.getInt(1);
	//   18   42:aload           5
	//   19   44:iconst_1        
	//   20   45:invokeinterface #49  <Method int Cursor.getInt(int)>
	//   21   50:istore_1        
		mTableVersions[i] = l;
	//   22   51:aload_0         
	//   23   52:getfield        #14  <Field InvalidationTracker this$0>
	//   24   55:getfield        #53  <Field long[] InvalidationTracker.mTableVersions>
	//   25   58:iload_1         
	//   26   59:lload_3         
	//   27   60:lastore         
		InvalidationTracker.access$402(InvalidationTracker.this, l);
	//   28   61:aload_0         
	//   29   62:getfield        #14  <Field InvalidationTracker this$0>
	//   30   65:lload_3         
	//   31   66:invokestatic    #57  <Method long InvalidationTracker.access$402(InvalidationTracker, long)>
	//   32   69:pop2            
		flag = true;
	//   33   70:iconst_1        
	//   34   71:istore_2        
		if(true) goto _L2; else goto _L1
	//   35   72:goto            23
_L1:
		cursor.close();
	//   36   75:aload           5
	//   37   77:invokeinterface #60  <Method void Cursor.close()>
		return flag;
	//   38   82:iload_2         
	//   39   83:ireturn         
		Exception exception;
		exception;
	//   40   84:astore          6
		cursor.close();
	//   41   86:aload           5
	//   42   88:invokeinterface #60  <Method void Cursor.close()>
		throw exception;
	//   43   93:aload           6
	//   44   95:athrow          
	}

	public void run()
	{
		boolean flag;
		boolean flag1;
		boolean flag2;
		boolean flag3;
		boolean flag4;
		Object obj2;
		obj2 = ((Object) (InvalidationTracker.access$000(InvalidationTracker.this).getCloseLock()));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field InvalidationTracker this$0>
	//    2    4:invokestatic    #24  <Method RoomDatabase InvalidationTracker.access$000(InvalidationTracker)>
	//    3    7:invokevirtual   #69  <Method Lock RoomDatabase.getCloseLock()>
	//    4   10:astore          8
		flag2 = false;
	//    5   12:iconst_0        
	//    6   13:istore_3        
		flag4 = false;
	//    7   14:iconst_0        
	//    8   15:istore          5
		flag3 = false;
	//    9   17:iconst_0        
	//   10   18:istore          4
		flag = flag2;
	//   11   20:iload_3         
	//   12   21:istore_1        
		flag1 = flag4;
	//   13   22:iload           5
	//   14   24:istore_2        
		((Lock) (obj2)).lock();
	//   15   25:aload           8
	//   16   27:invokeinterface #74  <Method void Lock.lock()>
		flag = flag2;
	//   17   32:iload_3         
	//   18   33:istore_1        
		flag1 = flag4;
	//   19   34:iload           5
	//   20   36:istore_2        
		boolean flag5 = InvalidationTracker.access$100(InvalidationTracker.this);
	//   21   37:aload_0         
	//   22   38:getfield        #14  <Field InvalidationTracker this$0>
	//   23   41:invokestatic    #78  <Method boolean InvalidationTracker.access$100(InvalidationTracker)>
	//   24   44:istore          6
		if(!flag5)
	//*  25   46:iload           6
	//*  26   48:ifne            59
		{
			((Lock) (obj2)).unlock();
	//   27   51:aload           8
	//   28   53:invokeinterface #81  <Method void Lock.unlock()>
			return;
	//   29   58:return          
		}
		flag = flag2;
	//   30   59:iload_3         
	//   31   60:istore_1        
		flag1 = flag4;
	//   32   61:iload           5
	//   33   63:istore_2        
		flag5 = mPendingRefresh.compareAndSet(true, false);
	//   34   64:aload_0         
	//   35   65:getfield        #14  <Field InvalidationTracker this$0>
	//   36   68:getfield        #85  <Field AtomicBoolean InvalidationTracker.mPendingRefresh>
	//   37   71:iconst_1        
	//   38   72:iconst_0        
	//   39   73:invokevirtual   #91  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//   40   76:istore          6
		if(!flag5)
	//*  41   78:iload           6
	//*  42   80:ifne            91
		{
			((Lock) (obj2)).unlock();
	//   43   83:aload           8
	//   44   85:invokeinterface #81  <Method void Lock.unlock()>
			return;
	//   45   90:return          
		}
		flag = flag2;
	//   46   91:iload_3         
	//   47   92:istore_1        
		flag1 = flag4;
	//   48   93:iload           5
	//   49   95:istore_2        
		flag5 = InvalidationTracker.access$000(InvalidationTracker.this).inTransaction();
	//   50   96:aload_0         
	//   51   97:getfield        #14  <Field InvalidationTracker this$0>
	//   52  100:invokestatic    #24  <Method RoomDatabase InvalidationTracker.access$000(InvalidationTracker)>
	//   53  103:invokevirtual   #94  <Method boolean RoomDatabase.inTransaction()>
	//   54  106:istore          6
		if(flag5)
	//*  55  108:iload           6
	//*  56  110:ifeq            121
		{
			((Lock) (obj2)).unlock();
	//   57  113:aload           8
	//   58  115:invokeinterface #81  <Method void Lock.unlock()>
			return;
	//   59  120:return          
		}
		flag = flag2;
	//   60  121:iload_3         
	//   61  122:istore_1        
		flag1 = flag4;
	//   62  123:iload           5
	//   63  125:istore_2        
		InvalidationTracker.access$200(InvalidationTracker.this).executeUpdateDelete();
	//   64  126:aload_0         
	//   65  127:getfield        #14  <Field InvalidationTracker this$0>
	//   66  130:invokestatic    #98  <Method SupportSQLiteStatement InvalidationTracker.access$200(InvalidationTracker)>
	//   67  133:invokeinterface #104 <Method int SupportSQLiteStatement.executeUpdateDelete()>
	//   68  138:pop             
		flag = flag2;
	//   69  139:iload_3         
	//   70  140:istore_1        
		flag1 = flag4;
	//   71  141:iload           5
	//   72  143:istore_2        
		InvalidationTracker.access$300(InvalidationTracker.this)[0] = ((Object) (Long.valueOf(InvalidationTracker.access$400(InvalidationTracker.this))));
	//   73  144:aload_0         
	//   74  145:getfield        #14  <Field InvalidationTracker this$0>
	//   75  148:invokestatic    #30  <Method Object[] InvalidationTracker.access$300(InvalidationTracker)>
	//   76  151:iconst_0        
	//   77  152:aload_0         
	//   78  153:getfield        #14  <Field InvalidationTracker this$0>
	//   79  156:invokestatic    #108 <Method long InvalidationTracker.access$400(InvalidationTracker)>
	//   80  159:invokestatic    #114 <Method Long Long.valueOf(long)>
	//   81  162:aastore         
		flag = flag2;
	//   82  163:iload_3         
	//   83  164:istore_1        
		flag1 = flag4;
	//   84  165:iload           5
	//   85  167:istore_2        
		if(!InvalidationTracker.access$000(InvalidationTracker.this).mWriteAheadLoggingEnabled)
			break MISSING_BLOCK_LABEL_271;
	//   86  168:aload_0         
	//   87  169:getfield        #14  <Field InvalidationTracker this$0>
	//   88  172:invokestatic    #24  <Method RoomDatabase InvalidationTracker.access$000(InvalidationTracker)>
	//   89  175:getfield        #118 <Field boolean RoomDatabase.mWriteAheadLoggingEnabled>
	//   90  178:ifeq            271
		flag = flag2;
	//   91  181:iload_3         
	//   92  182:istore_1        
		flag1 = flag4;
	//   93  183:iload           5
	//   94  185:istore_2        
		Object obj = ((Object) (InvalidationTracker.access$000(InvalidationTracker.this).getOpenHelper().getWritableDatabase()));
	//   95  186:aload_0         
	//   96  187:getfield        #14  <Field InvalidationTracker this$0>
	//   97  190:invokestatic    #24  <Method RoomDatabase InvalidationTracker.access$000(InvalidationTracker)>
	//   98  193:invokevirtual   #122 <Method SupportSQLiteOpenHelper RoomDatabase.getOpenHelper()>
	//   99  196:invokeinterface #128 <Method SupportSQLiteDatabase SupportSQLiteOpenHelper.getWritableDatabase()>
	//  100  201:astore          7
		flag2 = flag3;
	//  101  203:iload           4
	//  102  205:istore_3        
		((SupportSQLiteDatabase) (obj)).beginTransaction();
	//  103  206:aload           7
	//  104  208:invokeinterface #133 <Method void SupportSQLiteDatabase.beginTransaction()>
		flag2 = flag3;
	//  105  213:iload           4
	//  106  215:istore_3        
		flag3 = checkUpdatedTable();
	//  107  216:aload_0         
	//  108  217:invokespecial   #135 <Method boolean checkUpdatedTable()>
	//  109  220:istore          4
		flag2 = flag3;
	//  110  222:iload           4
	//  111  224:istore_3        
		((SupportSQLiteDatabase) (obj)).setTransactionSuccessful();
	//  112  225:aload           7
	//  113  227:invokeinterface #138 <Method void SupportSQLiteDatabase.setTransactionSuccessful()>
		flag = flag3;
	//  114  232:iload           4
	//  115  234:istore_1        
		flag1 = flag3;
	//  116  235:iload           4
	//  117  237:istore_2        
		((SupportSQLiteDatabase) (obj)).endTransaction();
	//  118  238:aload           7
	//  119  240:invokeinterface #141 <Method void SupportSQLiteDatabase.endTransaction()>
		flag = flag3;
	//  120  245:iload           4
	//  121  247:istore_1        
		break MISSING_BLOCK_LABEL_310;
	//  122  248:goto            310
		Exception exception;
		exception;
	//  123  251:astore          9
		flag = flag2;
	//  124  253:iload_3         
	//  125  254:istore_1        
		flag1 = flag2;
	//  126  255:iload_3         
	//  127  256:istore_2        
		((SupportSQLiteDatabase) (obj)).endTransaction();
	//  128  257:aload           7
	//  129  259:invokeinterface #141 <Method void SupportSQLiteDatabase.endTransaction()>
		flag = flag2;
	//  130  264:iload_3         
	//  131  265:istore_1        
		flag1 = flag2;
	//  132  266:iload_3         
	//  133  267:istore_2        
		Object obj1;
		try
		{
			throw exception;
	//  134  268:aload           9
	//  135  270:athrow          
		}
	//* 136  271:iload_3         
	//* 137  272:istore_1        
	//* 138  273:iload           5
	//* 139  275:istore_2        
	//* 140  276:aload_0         
	//* 141  277:invokespecial   #135 <Method boolean checkUpdatedTable()>
	//* 142  280:istore_3        
	//* 143  281:iload_3         
	//* 144  282:istore_1        
	//* 145  283:goto            310
	//* 146  286:astore          7
	//* 147  288:goto            399
	//* 148  291:astore          7
	//* 149  293:goto            300
		// Misplaced declaration of an exception variable
		catch(Object obj1)
	//* 150  296:astore          7
		{
			flag = flag1;
	//  151  298:iload_2         
	//  152  299:istore_1        
		}
		// Misplaced declaration of an exception variable
		catch(Object obj1) { }
		break MISSING_BLOCK_LABEL_300;
		flag = flag2;
		flag1 = flag4;
		flag2 = checkUpdatedTable();
		flag = flag2;
		break MISSING_BLOCK_LABEL_310;
		obj1;
		break MISSING_BLOCK_LABEL_399;
		Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", ((Throwable) (obj1)));
	//  153  300:ldc1            #143 <String "ROOM">
	//  154  302:ldc1            #145 <String "Cannot run invalidation tracker. Is the db closed?">
	//  155  304:aload           7
	//  156  306:invokestatic    #151 <Method int Log.e(String, String, Throwable)>
	//  157  309:pop             
		((Lock) (obj2)).unlock();
	//  158  310:aload           8
	//  159  312:invokeinterface #81  <Method void Lock.unlock()>
		if(!flag)
			break MISSING_BLOCK_LABEL_398;
	//  160  317:iload_1         
	//  161  318:ifeq            398
		obj1 = ((Object) (mObserverMap));
	//  162  321:aload_0         
	//  163  322:getfield        #14  <Field InvalidationTracker this$0>
	//  164  325:getfield        #155 <Field SafeIterableMap InvalidationTracker.mObserverMap>
	//  165  328:astore          7
		obj1;
	//  166  330:aload           7
		JVM INSTR monitorenter ;
	//  167  332:monitorenter    
		for(obj2 = ((Object) (mObserverMap.iterator())); ((Iterator) (obj2)).hasNext(); ((serverWrapper)((java.util.Map.Entry)((Iterator) (obj2)).next()).getValue()).checkForInvalidation(mTableVersions));
	//  168  333:aload_0         
	//  169  334:getfield        #14  <Field InvalidationTracker this$0>
	//  170  337:getfield        #155 <Field SafeIterableMap InvalidationTracker.mObserverMap>
	//  171  340:invokevirtual   #161 <Method Iterator SafeIterableMap.iterator()>
	//  172  343:astore          8
	//  173  345:aload           8
	//  174  347:invokeinterface #166 <Method boolean Iterator.hasNext()>
	//  175  352:ifeq            386
	//  176  355:aload           8
	//  177  357:invokeinterface #170 <Method Object Iterator.next()>
	//  178  362:checkcast       #172 <Class java.util.Map$Entry>
	//  179  365:invokeinterface #175 <Method Object java.util.Map$Entry.getValue()>
	//  180  370:checkcast       #177 <Class InvalidationTracker$ObserverWrapper>
	//  181  373:aload_0         
	//  182  374:getfield        #14  <Field InvalidationTracker this$0>
	//  183  377:getfield        #53  <Field long[] InvalidationTracker.mTableVersions>
	//  184  380:invokevirtual   #181 <Method void InvalidationTracker$ObserverWrapper.checkForInvalidation(long[])>
	//* 185  383:goto            345
		obj1;
	//  186  386:aload           7
		JVM INSTR monitorexit ;
	//  187  388:monitorexit     
		return;
	//  188  389:return          
		obj2;
	//  189  390:astore          8
		obj1;
	//  190  392:aload           7
		JVM INSTR monitorexit ;
	//  191  394:monitorexit     
		throw obj2;
	//  192  395:aload           8
	//  193  397:athrow          
		return;
	//  194  398:return          
		((Lock) (obj2)).unlock();
	//  195  399:aload           8
	//  196  401:invokeinterface #81  <Method void Lock.unlock()>
		throw obj1;
	//  197  406:aload           7
	//  198  408:athrow          
	}

	final InvalidationTracker this$0;

	InvalidationTracker$1()
	{
		this$0 = InvalidationTracker.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field InvalidationTracker this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
