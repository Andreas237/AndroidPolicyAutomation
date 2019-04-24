// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package net.sqlcipher.database;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Debug;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipInputStream;
import net.sqlcipher.*;

// Referenced classes of package net.sqlcipher.database:
//			SQLiteClosable, DatabaseObjectNotClosedException, SQLiteDebug, SQLiteCompiledSql, 
//			SQLiteStatement, SQLiteDatabaseCorruptException, SQLiteDatabaseHook, SQLiteTransactionListener, 
//			SQLiteException, SQLiteQueryBuilder, SQLiteCursor, SQLiteDirectCursorDriver, 
//			SQLiteCursorDriver

public class SQLiteDatabase extends SQLiteClosable
{

	private SQLiteDatabase(String s, CursorFactory cursorfactory, int i, DatabaseErrorHandler databaseerrorhandler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #153 <Method void SQLiteClosable()>
		mLock = new ReentrantLock(true);
	//    2    4:aload_0         
	//    3    5:new             #155 <Class ReentrantLock>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:invokespecial   #158 <Method void ReentrantLock(boolean)>
	//    7   13:putfield        #160 <Field ReentrantLock mLock>
		mLockAcquiredWallTime = 0L;
	//    8   16:aload_0         
	//    9   17:lconst_0        
	//   10   18:putfield        #162 <Field long mLockAcquiredWallTime>
		mLockAcquiredThreadTime = 0L;
	//   11   21:aload_0         
	//   12   22:lconst_0        
	//   13   23:putfield        #164 <Field long mLockAcquiredThreadTime>
		mLastLockMessageTime = 0L;
	//   14   26:aload_0         
	//   15   27:lconst_0        
	//   16   28:putfield        #166 <Field long mLastLockMessageTime>
		mRandom = new Random();
	//   17   31:aload_0         
	//   18   32:new             #168 <Class Random>
	//   19   35:dup             
	//   20   36:invokespecial   #169 <Method void Random()>
	//   21   39:putfield        #171 <Field Random mRandom>
		mLastSqlStatement = null;
	//   22   42:aload_0         
	//   23   43:aconst_null     
	//   24   44:putfield        #173 <Field String mLastSqlStatement>
		mNativeHandle = 0;
	//   25   47:aload_0         
	//   26   48:iconst_0        
	//   27   49:putfield        #175 <Field int mNativeHandle>
		mTempTableSequence = 0;
	//   28   52:aload_0         
	//   29   53:iconst_0        
	//   30   54:putfield        #177 <Field int mTempTableSequence>
		mPathForLogs = null;
	//   31   57:aload_0         
	//   32   58:aconst_null     
	//   33   59:putfield        #179 <Field String mPathForLogs>
		mCompiledQueries = ((Map) (new HashMap()));
	//   34   62:aload_0         
	//   35   63:new             #181 <Class HashMap>
	//   36   66:dup             
	//   37   67:invokespecial   #182 <Method void HashMap()>
	//   38   70:putfield        #184 <Field Map mCompiledQueries>
		mMaxSqlCacheSize = 250;
	//   39   73:aload_0         
	//   40   74:sipush          250
	//   41   77:putfield        #186 <Field int mMaxSqlCacheSize>
		mTimeOpened = null;
	//   42   80:aload_0         
	//   43   81:aconst_null     
	//   44   82:putfield        #188 <Field String mTimeOpened>
		mTimeClosed = null;
	//   45   85:aload_0         
	//   46   86:aconst_null     
	//   47   87:putfield        #190 <Field String mTimeClosed>
		mStackTrace = null;
	//   48   90:aload_0         
	//   49   91:aconst_null     
	//   50   92:putfield        #192 <Field Throwable mStackTrace>
		mLockingEnabled = true;
	//   51   95:aload_0         
	//   52   96:iconst_1        
	//   53   97:putfield        #194 <Field boolean mLockingEnabled>
		mSyncUpdateInfo = ((Map) (new HashMap()));
	//   54  100:aload_0         
	//   55  101:new             #181 <Class HashMap>
	//   56  104:dup             
	//   57  105:invokespecial   #182 <Method void HashMap()>
	//   58  108:putfield        #196 <Field Map mSyncUpdateInfo>
		if(s == null)
	//*  59  111:aload_1         
	//*  60  112:ifnonnull       125
		{
			throw new IllegalArgumentException("path should not be null");
	//   61  115:new             #198 <Class IllegalArgumentException>
	//   62  118:dup             
	//   63  119:ldc1            #200 <String "path should not be null">
	//   64  121:invokespecial   #203 <Method void IllegalArgumentException(String)>
	//   65  124:athrow          
		} else
		{
			mFlags = i;
	//   66  125:aload_0         
	//   67  126:iload_3         
	//   68  127:putfield        #205 <Field int mFlags>
			mPath = s;
	//   69  130:aload_0         
	//   70  131:aload_1         
	//   71  132:putfield        #207 <Field String mPath>
			mSlowQueryThreshold = -1;
	//   72  135:aload_0         
	//   73  136:iconst_m1       
	//   74  137:putfield        #209 <Field int mSlowQueryThreshold>
			mStackTrace = (new DatabaseObjectNotClosedException()).fillInStackTrace();
	//   75  140:aload_0         
	//   76  141:new             #211 <Class DatabaseObjectNotClosedException>
	//   77  144:dup             
	//   78  145:invokespecial   #212 <Method void DatabaseObjectNotClosedException()>
	//   79  148:invokevirtual   #216 <Method Throwable DatabaseObjectNotClosedException.fillInStackTrace()>
	//   80  151:putfield        #192 <Field Throwable mStackTrace>
			mFactory = cursorfactory;
	//   81  154:aload_0         
	//   82  155:aload_2         
	//   83  156:putfield        #218 <Field SQLiteDatabase$CursorFactory mFactory>
			mPrograms = new WeakHashMap();
	//   84  159:aload_0         
	//   85  160:new             #117 <Class WeakHashMap>
	//   86  163:dup             
	//   87  164:invokespecial   #120 <Method void WeakHashMap()>
	//   88  167:putfield        #220 <Field WeakHashMap mPrograms>
			mErrorHandler = databaseerrorhandler;
	//   89  170:aload_0         
	//   90  171:aload           4
	//   91  173:putfield        #222 <Field DatabaseErrorHandler mErrorHandler>
			return;
	//   92  176:return          
		}
	}

	public SQLiteDatabase(String s, char ac[], CursorFactory cursorfactory, int i)
	{
		this(s, cursorfactory, i, ((DatabaseErrorHandler) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:iload           4
	//    4    5:aconst_null     
	//    5    6:invokespecial   #225 <Method void SQLiteDatabase(String, SQLiteDatabase$CursorFactory, int, DatabaseErrorHandler)>
		openDatabaseInternal(ac, ((SQLiteDatabaseHook) (null)));
	//    6    9:aload_0         
	//    7   10:aload_2         
	//    8   11:aconst_null     
	//    9   12:invokespecial   #229 <Method void openDatabaseInternal(char[], SQLiteDatabaseHook)>
	//   10   15:return          
	}

	public SQLiteDatabase(String s, char ac[], CursorFactory cursorfactory, int i, SQLiteDatabaseHook sqlitedatabasehook)
	{
		this(s, cursorfactory, i, ((DatabaseErrorHandler) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:iload           4
	//    4    5:aconst_null     
	//    5    6:invokespecial   #225 <Method void SQLiteDatabase(String, SQLiteDatabase$CursorFactory, int, DatabaseErrorHandler)>
		openDatabaseInternal(ac, sqlitedatabasehook);
	//    6    9:aload_0         
	//    7   10:aload_2         
	//    8   11:aload           5
	//    9   13:invokespecial   #229 <Method void openDatabaseInternal(char[], SQLiteDatabaseHook)>
	//   10   16:return          
	}

	private void checkLockHoldTime()
	{
		long l;
		long l1;
		l = SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #237 <Method long SystemClock.elapsedRealtime()>
	//    1    3:lstore_2        
		l1 = l - mLockAcquiredWallTime;
	//    2    4:lload_2         
	//    3    5:aload_0         
	//    4    6:getfield        #162 <Field long mLockAcquiredWallTime>
	//    5    9:lsub            
	//    6   10:lstore          4
		break MISSING_BLOCK_LABEL_12;
		if((l1 >= 2000L || Log.isLoggable("Database", 2) || l - mLastLockMessageTime >= 20000L) && l1 > 300L)
	//*   7   12:lload           4
	//*   8   14:ldc2w           #238 <Long 2000L>
	//*   9   17:lcmp            
	//*  10   18:ifge            44
	//*  11   21:ldc1            #69  <String "Database">
	//*  12   23:iconst_2        
	//*  13   24:invokestatic    #245 <Method boolean Log.isLoggable(String, int)>
	//*  14   27:ifne            44
	//*  15   30:lload_2         
	//*  16   31:aload_0         
	//*  17   32:getfield        #166 <Field long mLastLockMessageTime>
	//*  18   35:lsub            
	//*  19   36:ldc2w           #246 <Long 20000L>
	//*  20   39:lcmp            
	//*  21   40:ifge            44
	//*  22   43:return          
	//*  23   44:lload           4
	//*  24   46:ldc2w           #248 <Long 300L>
	//*  25   49:lcmp            
	//*  26   50:ifle            43
		{
			int i = (int)((Debug.threadCpuTimeNanos() - mLockAcquiredThreadTime) / 0xf4240L);
	//   27   53:invokestatic    #254 <Method long Debug.threadCpuTimeNanos()>
	//   28   56:aload_0         
	//   29   57:getfield        #164 <Field long mLockAcquiredThreadTime>
	//   30   60:lsub            
	//   31   61:ldc2w           #255 <Long 0xf4240L>
	//   32   64:ldiv            
	//   33   65:l2i             
	//   34   66:istore_1        
			if(i > 100 || l1 > 2000L)
	//*  35   67:iload_1         
	//*  36   68:bipush          100
	//*  37   70:icmpgt          82
	//*  38   73:lload           4
	//*  39   75:ldc2w           #238 <Long 2000L>
	//*  40   78:lcmp            
	//*  41   79:ifle            43
			{
				mLastLockMessageTime = l;
	//   42   82:aload_0         
	//   43   83:lload_2         
	//   44   84:putfield        #166 <Field long mLastLockMessageTime>
				String s = (new StringBuilder()).append("lock held on ").append(mPath).append(" for ").append(l1).append("ms. Thread time was ").append(i).append("ms").toString();
	//   45   87:new             #258 <Class StringBuilder>
	//   46   90:dup             
	//   47   91:invokespecial   #259 <Method void StringBuilder()>
	//   48   94:ldc2            #261 <String "lock held on ">
	//   49   97:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   50  100:aload_0         
	//   51  101:getfield        #207 <Field String mPath>
	//   52  104:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   53  107:ldc2            #267 <String " for ">
	//   54  110:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   55  113:lload           4
	//   56  115:invokevirtual   #270 <Method StringBuilder StringBuilder.append(long)>
	//   57  118:ldc2            #272 <String "ms. Thread time was ">
	//   58  121:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   59  124:iload_1         
	//   60  125:invokevirtual   #275 <Method StringBuilder StringBuilder.append(int)>
	//   61  128:ldc2            #277 <String "ms">
	//   62  131:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   63  134:invokevirtual   #281 <Method String StringBuilder.toString()>
	//   64  137:astore          6
				if(SQLiteDebug.DEBUG_LOCK_TIME_TRACKING_STACK_TRACE)
	//*  65  139:getstatic       #286 <Field boolean SQLiteDebug.DEBUG_LOCK_TIME_TRACKING_STACK_TRACE>
	//*  66  142:ifeq            161
				{
					Log.d("Database", s, ((Throwable) (new Exception())));
	//   67  145:ldc1            #69  <String "Database">
	//   68  147:aload           6
	//   69  149:new             #288 <Class Exception>
	//   70  152:dup             
	//   71  153:invokespecial   #289 <Method void Exception()>
	//   72  156:invokestatic    #293 <Method int Log.d(String, String, Throwable)>
	//   73  159:pop             
					return;
	//   74  160:return          
				} else
				{
					Log.d("Database", s);
	//   75  161:ldc1            #69  <String "Database">
	//   76  163:aload           6
	//   77  165:invokestatic    #296 <Method int Log.d(String, String)>
	//   78  168:pop             
					return;
	//   79  169:return          
				}
			}
		}
		return;
	}

	private void closeClosable()
	{
		deallocCachedSqlStatements();
	//    0    0:aload_0         
	//    1    1:invokespecial   #300 <Method void deallocCachedSqlStatements()>
		Iterator iterator = mPrograms.entrySet().iterator();
	//    2    4:aload_0         
	//    3    5:getfield        #220 <Field WeakHashMap mPrograms>
	//    4    8:invokevirtual   #304 <Method Set WeakHashMap.entrySet()>
	//    5   11:invokeinterface #310 <Method Iterator Set.iterator()>
	//    6   16:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    7   17:aload_1         
	//    8   18:invokeinterface #316 <Method boolean Iterator.hasNext()>
	//    9   23:ifeq            55
			SQLiteClosable sqliteclosable = (SQLiteClosable)((java.util.Map.Entry)iterator.next()).getKey();
	//   10   26:aload_1         
	//   11   27:invokeinterface #320 <Method Object Iterator.next()>
	//   12   32:checkcast       #322 <Class java.util.Map$Entry>
	//   13   35:invokeinterface #325 <Method Object java.util.Map$Entry.getKey()>
	//   14   40:checkcast       #4   <Class SQLiteClosable>
	//   15   43:astore_2        
			if(sqliteclosable != null)
	//*  16   44:aload_2         
	//*  17   45:ifnull          17
				sqliteclosable.onAllReferencesReleasedFromContainer();
	//   18   48:aload_2         
	//   19   49:invokevirtual   #328 <Method void SQLiteClosable.onAllReferencesReleasedFromContainer()>
		} while(true);
	//   20   52:goto            17
	//   21   55:return          
	}

	public static SQLiteDatabase create(CursorFactory cursorfactory, String s)
	{
		return openDatabase(":memory:", s.toCharArray(), cursorfactory, 0x10000000);
	//    0    0:ldc2            #332 <String ":memory:">
	//    1    3:aload_1         
	//    2    4:invokevirtual   #336 <Method char[] String.toCharArray()>
	//    3    7:aload_0         
	//    4    8:ldc1            #29  <Int 0x10000000>
	//    5   10:invokestatic    #340 <Method SQLiteDatabase openDatabase(String, char[], SQLiteDatabase$CursorFactory, int)>
	//    6   13:areturn         
	}

	public static SQLiteDatabase create(CursorFactory cursorfactory, char ac[])
	{
		return openDatabase(":memory:", ac, cursorfactory, 0x10000000);
	//    0    0:ldc2            #332 <String ":memory:">
	//    1    3:aload_1         
	//    2    4:aload_0         
	//    3    5:ldc1            #29  <Int 0x10000000>
	//    4    7:invokestatic    #340 <Method SQLiteDatabase openDatabase(String, char[], SQLiteDatabase$CursorFactory, int)>
	//    5   10:areturn         
	}

	private native void dbclose();

	private native void dbopen(String s, int i);

	private void deallocCachedSqlStatements()
	{
		Map map = mCompiledQueries;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field Map mCompiledQueries>
	//    2    4:astore_1        
		map;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		for(Iterator iterator = mCompiledQueries.values().iterator(); iterator.hasNext(); ((SQLiteCompiledSql)iterator.next()).releaseSqlStatement());
	//    5    7:aload_0         
	//    6    8:getfield        #184 <Field Map mCompiledQueries>
	//    7   11:invokeinterface #350 <Method Collection Map.values()>
	//    8   16:invokeinterface #353 <Method Iterator Collection.iterator()>
	//    9   21:astore_2        
	//   10   22:aload_2         
	//   11   23:invokeinterface #316 <Method boolean Iterator.hasNext()>
	//   12   28:ifeq            51
	//   13   31:aload_2         
	//   14   32:invokeinterface #320 <Method Object Iterator.next()>
	//   15   37:checkcast       #355 <Class SQLiteCompiledSql>
	//   16   40:invokevirtual   #358 <Method void SQLiteCompiledSql.releaseSqlStatement()>
		break MISSING_BLOCK_LABEL_51;
	//   17   43:goto            22
		Exception exception;
		exception;
	//   18   46:astore_2        
		map;
	//   19   47:aload_1         
		JVM INSTR monitorexit ;
	//   20   48:monitorexit     
		throw exception;
	//   21   49:aload_2         
	//   22   50:athrow          
		mCompiledQueries.clear();
	//   23   51:aload_0         
	//   24   52:getfield        #184 <Field Map mCompiledQueries>
	//   25   55:invokeinterface #361 <Method void Map.clear()>
		map;
	//   26   60:aload_1         
		JVM INSTR monitorexit ;
	//   27   61:monitorexit     
	//   28   62:return          
	}

	private native void enableSqlProfiling(String s);

	private native void enableSqlTracing(String s);

	public static String findEditTable(String s)
	{
		int i;
		int j;
		if(TextUtils.isEmpty(((CharSequence) (s))))
			break MISSING_BLOCK_LABEL_67;
	//    0    0:aload_0         
	//    1    1:invokestatic    #371 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    2    4:ifne            67
		i = s.indexOf(' ');
	//    3    7:aload_0         
	//    4    8:bipush          32
	//    5   10:invokevirtual   #375 <Method int String.indexOf(int)>
	//    6   13:istore_1        
		j = s.indexOf(',');
	//    7   14:aload_0         
	//    8   15:bipush          44
	//    9   17:invokevirtual   #375 <Method int String.indexOf(int)>
	//   10   20:istore_2        
		if(i <= 0 || i >= j && j >= 0) goto _L2; else goto _L1
	//   11   21:iload_1         
	//   12   22:ifle            43
	//   13   25:iload_1         
	//   14   26:iload_2         
	//   15   27:icmplt          34
	//   16   30:iload_2         
	//   17   31:ifge            43
_L1:
		String s1 = s.substring(0, i);
	//   18   34:aload_0         
	//   19   35:iconst_0        
	//   20   36:iload_1         
	//   21   37:invokevirtual   #379 <Method String String.substring(int, int)>
	//   22   40:astore_3        
_L4:
		return s1;
	//   23   41:aload_3         
	//   24   42:areturn         
_L2:
		s1 = s;
	//   25   43:aload_0         
	//   26   44:astore_3        
		if(j <= 0) goto _L4; else goto _L3
	//   27   45:iload_2         
	//   28   46:ifle            41
_L3:
		if(j < i)
			break; /* Loop/switch isn't completed */
	//   29   49:iload_2         
	//   30   50:iload_1         
	//   31   51:icmplt          60
		s1 = s;
	//   32   54:aload_0         
	//   33   55:astore_3        
		if(i >= 0) goto _L4; else goto _L5
	//   34   56:iload_1         
	//   35   57:ifge            41
_L5:
		return s.substring(0, j);
	//   36   60:aload_0         
	//   37   61:iconst_0        
	//   38   62:iload_2         
	//   39   63:invokevirtual   #379 <Method String String.substring(int, int)>
	//   40   66:areturn         
		throw new IllegalStateException("Invalid tables");
	//   41   67:new             #381 <Class IllegalStateException>
	//   42   70:dup             
	//   43   71:ldc2            #383 <String "Invalid tables">
	//   44   74:invokespecial   #384 <Method void IllegalStateException(String)>
	//   45   77:athrow          
	}

	private static ArrayList getActiveDatabases()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #388 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #389 <Method void ArrayList()>
	//    3    7:astore_1        
		synchronized(sActiveDatabases)
	//*   4    8:getstatic       #122 <Field WeakHashMap sActiveDatabases>
	//*   5   11:astore_0        
	//*   6   12:aload_0         
	//*   7   13:monitorenter    
		{
			arraylist.addAll(((Collection) (sActiveDatabases.keySet())));
	//    8   14:aload_1         
	//    9   15:getstatic       #122 <Field WeakHashMap sActiveDatabases>
	//   10   18:invokevirtual   #392 <Method Set WeakHashMap.keySet()>
	//   11   21:invokevirtual   #396 <Method boolean ArrayList.addAll(Collection)>
	//   12   24:pop             
		}
	//   13   25:aload_0         
	//   14   26:monitorexit     
		return arraylist;
	//   15   27:aload_1         
	//   16   28:areturn         
		exception;
	//   17   29:astore_1        
		weakhashmap;
	//   18   30:aload_0         
		JVM INSTR monitorexit ;
	//   19   31:monitorexit     
		throw exception;
	//   20   32:aload_1         
	//   21   33:athrow          
	}

	private static ArrayList getAttachedDbs(SQLiteDatabase sqlitedatabase)
	{
		if(!sqlitedatabase.isOpen())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #403 <Method boolean isOpen()>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		ArrayList arraylist = new ArrayList();
	//    5    9:new             #388 <Class ArrayList>
	//    6   12:dup             
	//    7   13:invokespecial   #389 <Method void ArrayList()>
	//    8   16:astore_1        
		for(sqlitedatabase = ((SQLiteDatabase) (sqlitedatabase.rawQuery("pragma database_list;", ((String []) (null))))); ((Cursor) (sqlitedatabase)).moveToNext(); arraylist.add(((Object) (new Pair(((Object) (((Cursor) (sqlitedatabase)).getString(1))), ((Object) (((Cursor) (sqlitedatabase)).getString(2))))))));
	//    9   17:aload_0         
	//   10   18:ldc2            #405 <String "pragma database_list;">
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #409 <Method Cursor rawQuery(String, String[])>
	//   13   25:astore_0        
	//   14   26:aload_0         
	//   15   27:invokeinterface #414 <Method boolean Cursor.moveToNext()>
	//   16   32:ifeq            64
	//   17   35:aload_1         
	//   18   36:new             #416 <Class Pair>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:iconst_1        
	//   22   42:invokeinterface #420 <Method String Cursor.getString(int)>
	//   23   47:aload_0         
	//   24   48:iconst_2        
	//   25   49:invokeinterface #420 <Method String Cursor.getString(int)>
	//   26   54:invokespecial   #423 <Method void Pair(Object, Object)>
	//   27   57:invokevirtual   #427 <Method boolean ArrayList.add(Object)>
	//   28   60:pop             
	//*  29   61:goto            26
		((Cursor) (sqlitedatabase)).close();
	//   30   64:aload_0         
	//   31   65:invokeinterface #430 <Method void Cursor.close()>
		return arraylist;
	//   32   70:aload_1         
	//   33   71:areturn         
	}

	static ArrayList getDbStats()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #388 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #389 <Method void ArrayList()>
	//    3    7:astore          8
		for(Iterator iterator = getActiveDatabases().iterator(); iterator.hasNext();)
	//*   4    9:invokestatic    #434 <Method ArrayList getActiveDatabases()>
	//*   5   12:invokevirtual   #435 <Method Iterator ArrayList.iterator()>
	//*   6   15:astore          9
	//*   7   17:aload           9
	//*   8   19:invokeinterface #316 <Method boolean Iterator.hasNext()>
	//*   9   24:ifeq            340
		{
			SQLiteDatabase sqlitedatabase = (SQLiteDatabase)iterator.next();
	//   10   27:aload           9
	//   11   29:invokeinterface #320 <Method Object Iterator.next()>
	//   12   34:checkcast       #2   <Class SQLiteDatabase>
	//   13   37:astore          10
			if(sqlitedatabase != null && sqlitedatabase.isOpen())
	//*  14   39:aload           10
	//*  15   41:ifnull          17
	//*  16   44:aload           10
	//*  17   46:invokevirtual   #403 <Method boolean isOpen()>
	//*  18   49:ifeq            17
			{
				int j = sqlitedatabase.native_getDbLookaside();
	//   19   52:aload           10
	//   20   54:invokespecial   #439 <Method int native_getDbLookaside()>
	//   21   57:istore_1        
				String s = sqlitedatabase.getPath();
	//   22   58:aload           10
	//   23   60:invokevirtual   #442 <Method String getPath()>
	//   24   63:astore          5
				int i = s.lastIndexOf("/");
	//   25   65:aload           5
	//   26   67:ldc2            #444 <String "/">
	//   27   70:invokevirtual   #448 <Method int String.lastIndexOf(String)>
	//   28   73:istore_0        
				String s1;
				ArrayList arraylist1;
				if(i != -1)
	//*  29   74:iload_0         
	//*  30   75:iconst_m1       
	//*  31   76:icmpeq          201
					i++;
	//   32   79:iload_0         
	//   33   80:iconst_1        
	//   34   81:iadd            
	//   35   82:istore_0        
				else
	//*  36   83:aload           5
	//*  37   85:iload_0         
	//*  38   86:invokevirtual   #450 <Method String String.substring(int)>
	//*  39   89:astore          6
	//*  40   91:aload           10
	//*  41   93:invokestatic    #452 <Method ArrayList getAttachedDbs(SQLiteDatabase)>
	//*  42   96:astore          11
	//*  43   98:aload           11
	//*  44  100:ifnull          17
	//*  45  103:iconst_0        
	//*  46  104:istore_0        
	//*  47  105:iload_0         
	//*  48  106:aload           11
	//*  49  108:invokevirtual   #455 <Method int ArrayList.size()>
	//*  50  111:icmpge          17
	//*  51  114:aload           11
	//*  52  116:iload_0         
	//*  53  117:invokevirtual   #459 <Method Object ArrayList.get(int)>
	//*  54  120:checkcast       #416 <Class Pair>
	//*  55  123:astore          12
	//*  56  125:aload           10
	//*  57  127:new             #258 <Class StringBuilder>
	//*  58  130:dup             
	//*  59  131:invokespecial   #259 <Method void StringBuilder()>
	//*  60  134:aload           12
	//*  61  136:getfield        #463 <Field Object Pair.first>
	//*  62  139:checkcast       #124 <Class String>
	//*  63  142:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//*  64  145:ldc2            #465 <String ".page_count;">
	//*  65  148:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//*  66  151:invokevirtual   #281 <Method String StringBuilder.toString()>
	//*  67  154:invokestatic    #469 <Method long getPragmaVal(SQLiteDatabase, String)>
	//*  68  157:lstore_3        
	//*  69  158:iload_0         
	//*  70  159:ifne            206
	//*  71  162:aload           6
	//*  72  164:astore          5
	//*  73  166:lload_3         
	//*  74  167:lconst_0        
	//*  75  168:lcmp            
	//*  76  169:ifle            194
	//*  77  172:aload           8
	//*  78  174:new             #471 <Class SQLiteDebug$DbStats>
	//*  79  177:dup             
	//*  80  178:aload           5
	//*  81  180:lload_3         
	//*  82  181:aload           10
	//*  83  183:invokevirtual   #474 <Method long getPageSize()>
	//*  84  186:iload_1         
	//*  85  187:invokespecial   #477 <Method void SQLiteDebug$DbStats(String, long, long, int)>
	//*  86  190:invokevirtual   #427 <Method boolean ArrayList.add(Object)>
	//*  87  193:pop             
	//*  88  194:iload_0         
	//*  89  195:iconst_1        
	//*  90  196:iadd            
	//*  91  197:istore_0        
	//*  92  198:goto            105
					i = 0;
	//   93  201:iconst_0        
	//   94  202:istore_0        
				s1 = s.substring(i);
				arraylist1 = getAttachedDbs(sqlitedatabase);
				if(arraylist1 != null)
				{
					i = 0;
					while(i < arraylist1.size()) 
					{
						Pair pair = (Pair)arraylist1.get(i);
						long l = getPragmaVal(sqlitedatabase, (new StringBuilder()).append((String)pair.first).append(".page_count;").toString());
						Object obj;
						if(i == 0)
						{
							obj = ((Object) (s1));
						} else
	//*  95  203:goto            83
						{
							boolean flag = false;
	//   96  206:iconst_0        
	//   97  207:istore_2        
							String s2 = (new StringBuilder()).append("  (attached) ").append((String)pair.first).toString();
	//   98  208:new             #258 <Class StringBuilder>
	//   99  211:dup             
	//  100  212:invokespecial   #259 <Method void StringBuilder()>
	//  101  215:ldc2            #479 <String "  (attached) ">
	//  102  218:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  103  221:aload           12
	//  104  223:getfield        #463 <Field Object Pair.first>
	//  105  226:checkcast       #124 <Class String>
	//  106  229:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  107  232:invokevirtual   #281 <Method String StringBuilder.toString()>
	//  108  235:astore          7
							obj = ((Object) (s2));
	//  109  237:aload           7
	//  110  239:astore          5
							j = ((int) (flag));
	//  111  241:iload_2         
	//  112  242:istore_1        
							if(((String)pair.second).trim().length() > 0)
	//* 113  243:aload           12
	//* 114  245:getfield        #482 <Field Object Pair.second>
	//* 115  248:checkcast       #124 <Class String>
	//* 116  251:invokevirtual   #485 <Method String String.trim()>
	//* 117  254:invokevirtual   #488 <Method int String.length()>
	//* 118  257:ifle            166
							{
								j = ((String)pair.second).lastIndexOf("/");
	//  119  260:aload           12
	//  120  262:getfield        #482 <Field Object Pair.second>
	//  121  265:checkcast       #124 <Class String>
	//  122  268:ldc2            #444 <String "/">
	//  123  271:invokevirtual   #448 <Method int String.lastIndexOf(String)>
	//  124  274:istore_1        
								obj = ((Object) ((new StringBuilder()).append(s2).append(" : ")));
	//  125  275:new             #258 <Class StringBuilder>
	//  126  278:dup             
	//  127  279:invokespecial   #259 <Method void StringBuilder()>
	//  128  282:aload           7
	//  129  284:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  130  287:ldc2            #490 <String " : ">
	//  131  290:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  132  293:astore          5
								s2 = (String)pair.second;
	//  133  295:aload           12
	//  134  297:getfield        #482 <Field Object Pair.second>
	//  135  300:checkcast       #124 <Class String>
	//  136  303:astore          7
								if(j != -1)
	//* 137  305:iload_1         
	//* 138  306:iconst_m1       
	//* 139  307:icmpeq          335
									j++;
	//  140  310:iload_1         
	//  141  311:iconst_1        
	//  142  312:iadd            
	//  143  313:istore_1        
								else
	//* 144  314:aload           5
	//* 145  316:aload           7
	//* 146  318:iload_1         
	//* 147  319:invokevirtual   #450 <Method String String.substring(int)>
	//* 148  322:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//* 149  325:invokevirtual   #281 <Method String StringBuilder.toString()>
	//* 150  328:astore          5
	//* 151  330:iload_2         
	//* 152  331:istore_1        
	//* 153  332:goto            166
									j = 0;
	//  154  335:iconst_0        
	//  155  336:istore_1        
								obj = ((Object) (((StringBuilder) (obj)).append(s2.substring(j)).toString()));
								j = ((int) (flag));
							}
						}
						if(l > 0L)
							arraylist.add(((Object) (new SQLiteDebug.DbStats(((String) (obj)), l, sqlitedatabase.getPageSize(), j))));
						i++;
					}
				}
			}
		}

	//* 156  337:goto            314
		return arraylist;
	//  157  340:aload           8
	//  158  342:areturn         
	}

	private String getPathForLogs()
	{
		if(mPathForLogs != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field String mPathForLogs>
	//*   2    4:ifnull          12
			return mPathForLogs;
	//    3    7:aload_0         
	//    4    8:getfield        #179 <Field String mPathForLogs>
	//    5   11:areturn         
		if(mPath == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #207 <Field String mPath>
	//*   8   16:ifnonnull       21
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
		if(mPath.indexOf('@') == -1)
	//*  11   21:aload_0         
	//*  12   22:getfield        #207 <Field String mPath>
	//*  13   25:bipush          64
	//*  14   27:invokevirtual   #375 <Method int String.indexOf(int)>
	//*  15   30:iconst_m1       
	//*  16   31:icmpne          47
			mPathForLogs = mPath;
	//   17   34:aload_0         
	//   18   35:aload_0         
	//   19   36:getfield        #207 <Field String mPath>
	//   20   39:putfield        #179 <Field String mPathForLogs>
		else
	//*  21   42:aload_0         
	//*  22   43:getfield        #179 <Field String mPathForLogs>
	//*  23   46:areturn         
			mPathForLogs = EMAIL_IN_DB_PATTERN.matcher(((CharSequence) (mPath))).replaceAll("XX@YY");
	//   24   47:aload_0         
	//   25   48:getstatic       #148 <Field Pattern EMAIL_IN_DB_PATTERN>
	//   26   51:aload_0         
	//   27   52:getfield        #207 <Field String mPath>
	//   28   55:invokevirtual   #496 <Method Matcher Pattern.matcher(CharSequence)>
	//   29   58:ldc2            #498 <String "XX@YY">
	//   30   61:invokevirtual   #503 <Method String Matcher.replaceAll(String)>
	//   31   64:putfield        #179 <Field String mPathForLogs>
		return mPathForLogs;
	//*  32   67:goto            42
	}

	private static long getPragmaVal(SQLiteDatabase sqlitedatabase, String s)
	{
		if(sqlitedatabase.isOpen()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokevirtual   #403 <Method boolean isOpen()>
	//    2    4:ifne            11
_L1:
		long l = 0L;
	//    3    7:lconst_0        
	//    4    8:lstore_2        
_L4:
		return l;
	//    5    9:lload_2         
	//    6   10:lreturn         
_L2:
		Object obj = null;
	//    7   11:aconst_null     
	//    8   12:astore          6
		sqlitedatabase = ((SQLiteDatabase) (new SQLiteStatement(sqlitedatabase, (new StringBuilder()).append("PRAGMA ").append(s).toString())));
	//    9   14:new             #505 <Class SQLiteStatement>
	//   10   17:dup             
	//   11   18:aload_0         
	//   12   19:new             #258 <Class StringBuilder>
	//   13   22:dup             
	//   14   23:invokespecial   #259 <Method void StringBuilder()>
	//   15   26:ldc2            #507 <String "PRAGMA ">
	//   16   29:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   17   32:aload_1         
	//   18   33:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   19   36:invokevirtual   #281 <Method String StringBuilder.toString()>
	//   20   39:invokespecial   #510 <Method void SQLiteStatement(SQLiteDatabase, String)>
	//   21   42:astore_0        
		long l1 = ((SQLiteStatement) (sqlitedatabase)).simpleQueryForLong();
	//   22   43:aload_0         
	//   23   44:invokevirtual   #513 <Method long SQLiteStatement.simpleQueryForLong()>
	//   24   47:lstore          4
		l = l1;
	//   25   49:lload           4
	//   26   51:lstore_2        
		if(sqlitedatabase == null) goto _L4; else goto _L3
	//   27   52:aload_0         
	//   28   53:ifnull          9
_L3:
		((SQLiteStatement) (sqlitedatabase)).close();
	//   29   56:aload_0         
	//   30   57:invokevirtual   #514 <Method void SQLiteStatement.close()>
		return l1;
	//   31   60:lload           4
	//   32   62:lreturn         
		s;
	//   33   63:astore_1        
		sqlitedatabase = ((SQLiteDatabase) (obj));
	//   34   64:aload           6
	//   35   66:astore_0        
_L6:
		if(sqlitedatabase != null)
	//*  36   67:aload_0         
	//*  37   68:ifnull          75
			((SQLiteStatement) (sqlitedatabase)).close();
	//   38   71:aload_0         
	//   39   72:invokevirtual   #514 <Method void SQLiteStatement.close()>
		throw s;
	//   40   75:aload_1         
	//   41   76:athrow          
		s;
	//   42   77:astore_1        
		if(true) goto _L6; else goto _L5
_L5:
	//*  43   78:goto            67
	}

	private String getTime()
	{
		return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS ")).format(((Object) (Long.valueOf(System.currentTimeMillis()))));
	//    0    0:new             #517 <Class SimpleDateFormat>
	//    1    3:dup             
	//    2    4:ldc2            #519 <String "yyyy-MM-dd HH:mm:ss.SSS ">
	//    3    7:invokespecial   #520 <Method void SimpleDateFormat(String)>
	//    4   10:invokestatic    #525 <Method long System.currentTimeMillis()>
	//    5   13:invokestatic    #531 <Method Long Long.valueOf(long)>
	//    6   16:invokevirtual   #535 <Method String SimpleDateFormat.format(Object)>
	//    7   19:areturn         
	}

	private static void loadICUData(Context context, File file)
	{
		Object obj;
		Object obj1;
		File file1;
		Object obj2;
		Object obj3;
		Object obj4;
		Object obj5;
		Object obj6;
		File file2;
		File file3;
		obj5 = null;
	//    0    0:aconst_null     
	//    1    1:astore          9
		obj3 = null;
	//    2    3:aconst_null     
	//    3    4:astore          7
		file1 = null;
	//    4    6:aconst_null     
	//    5    7:astore          5
		obj2 = null;
	//    6    9:aconst_null     
	//    7   10:astore          6
		obj6 = null;
	//    8   12:aconst_null     
	//    9   13:astore          10
		obj1 = null;
	//   10   15:aconst_null     
	//   11   16:astore          4
		obj4 = null;
	//   12   18:aconst_null     
	//   13   19:astore          8
		file3 = new File(file, "icu");
	//   14   21:new             #541 <Class File>
	//   15   24:dup             
	//   16   25:aload_1         
	//   17   26:ldc2            #543 <String "icu">
	//   18   29:invokespecial   #546 <Method void File(File, String)>
	//   19   32:astore          12
		file2 = new File(file3, "icudt46l.dat");
	//   20   34:new             #541 <Class File>
	//   21   37:dup             
	//   22   38:aload           12
	//   23   40:ldc2            #548 <String "icudt46l.dat">
	//   24   43:invokespecial   #546 <Method void File(File, String)>
	//   25   46:astore          11
		file = ((File) (obj6));
	//   26   48:aload           10
	//   27   50:astore_1        
		obj = ((Object) (obj5));
	//   28   51:aload           9
	//   29   53:astore_3        
		if(file3.exists())
			break MISSING_BLOCK_LABEL_74;
	//   30   54:aload           12
	//   31   56:invokevirtual   #551 <Method boolean File.exists()>
	//   32   59:ifne            74
		file = ((File) (obj6));
	//   33   62:aload           10
	//   34   64:astore_1        
		obj = ((Object) (obj5));
	//   35   65:aload           9
	//   36   67:astore_3        
		int i;
		try
		{
			file3.mkdirs();
	//   37   68:aload           12
	//   38   70:invokevirtual   #554 <Method boolean File.mkdirs()>
	//   39   73:pop             
		}
	//*  40   74:aload           10
	//*  41   76:astore_1        
	//*  42   77:aload           9
	//*  43   79:astore_3        
	//*  44   80:aload           11
	//*  45   82:invokevirtual   #551 <Method boolean File.exists()>
	//*  46   85:ifne            242
	//*  47   88:aload           10
	//*  48   90:astore_1        
	//*  49   91:aload           9
	//*  50   93:astore_3        
	//*  51   94:new             #556 <Class ZipInputStream>
	//*  52   97:dup             
	//*  53   98:aload_0         
	//*  54   99:invokevirtual   #562 <Method AssetManager Context.getAssets()>
	//*  55  102:ldc2            #564 <String "icudt46l.zip">
	//*  56  105:invokevirtual   #570 <Method java.io.InputStream AssetManager.open(String)>
	//*  57  108:invokespecial   #573 <Method void ZipInputStream(java.io.InputStream)>
	//*  58  111:astore_0        
	//*  59  112:aload_0         
	//*  60  113:invokevirtual   #577 <Method java.util.zip.ZipEntry ZipInputStream.getNextEntry()>
	//*  61  116:pop             
	//*  62  117:new             #579 <Class FileOutputStream>
	//*  63  120:dup             
	//*  64  121:aload           11
	//*  65  123:invokespecial   #582 <Method void FileOutputStream(File)>
	//*  66  126:astore_1        
	//*  67  127:sipush          1024
	//*  68  130:newarray        byte[]
	//*  69  132:astore_3        
	//*  70  133:aload_0         
	//*  71  134:aload_3         
	//*  72  135:invokevirtual   #586 <Method int ZipInputStream.read(byte[])>
	//*  73  138:istore_2        
	//*  74  139:iload_2         
	//*  75  140:ifle            236
	//*  76  143:aload_1         
	//*  77  144:aload_3         
	//*  78  145:iconst_0        
	//*  79  146:iload_2         
	//*  80  147:invokevirtual   #592 <Method void OutputStream.write(byte[], int, int)>
	//*  81  150:goto            133
	//*  82  153:astore          4
	//*  83  155:aload_1         
	//*  84  156:astore          5
	//*  85  158:aload_0         
	//*  86  159:astore_1        
	//*  87  160:aload           5
	//*  88  162:astore_3        
	//*  89  163:ldc1            #69  <String "Database">
	//*  90  165:ldc2            #594 <String "Error copying icu dat file">
	//*  91  168:aload           4
	//*  92  170:invokestatic    #597 <Method int Log.e(String, String, Throwable)>
	//*  93  173:pop             
	//*  94  174:aload_0         
	//*  95  175:astore_1        
	//*  96  176:aload           5
	//*  97  178:astore_3        
	//*  98  179:aload           11
	//*  99  181:invokevirtual   #551 <Method boolean File.exists()>
	//* 100  184:ifeq            198
	//* 101  187:aload_0         
	//* 102  188:astore_1        
	//* 103  189:aload           5
	//* 104  191:astore_3        
	//* 105  192:aload           11
	//* 106  194:invokevirtual   #600 <Method boolean File.delete()>
	//* 107  197:pop             
	//* 108  198:aload_0         
	//* 109  199:astore_1        
	//* 110  200:aload           5
	//* 111  202:astore_3        
	//* 112  203:new             #602 <Class RuntimeException>
	//* 113  206:dup             
	//* 114  207:aload           4
	//* 115  209:invokespecial   #605 <Method void RuntimeException(Throwable)>
	//* 116  212:athrow          
	//* 117  213:astore_0        
	//* 118  214:aload_1         
	//* 119  215:ifnull          222
	//* 120  218:aload_1         
	//* 121  219:invokevirtual   #606 <Method void ZipInputStream.close()>
	//* 122  222:aload_3         
	//* 123  223:ifnull          234
	//* 124  226:aload_3         
	//* 125  227:invokevirtual   #609 <Method void OutputStream.flush()>
	//* 126  230:aload_3         
	//* 127  231:invokevirtual   #610 <Method void OutputStream.close()>
	//* 128  234:aload_0         
	//* 129  235:athrow          
	//* 130  236:aload_1         
	//* 131  237:astore          5
	//* 132  239:aload_0         
	//* 133  240:astore          4
	//* 134  242:aload           4
	//* 135  244:ifnull          252
	//* 136  247:aload           4
	//* 137  249:invokevirtual   #606 <Method void ZipInputStream.close()>
	//* 138  252:aload           5
	//* 139  254:ifnull          267
	//* 140  257:aload           5
	//* 141  259:invokevirtual   #609 <Method void OutputStream.flush()>
	//* 142  262:aload           5
	//* 143  264:invokevirtual   #610 <Method void OutputStream.close()>
	//* 144  267:return          
	//* 145  268:astore_0        
	//* 146  269:ldc1            #69  <String "Database">
	//* 147  271:ldc2            #612 <String "Error in closing streams IO streams after expanding ICU dat file">
	//* 148  274:aload_0         
	//* 149  275:invokestatic    #597 <Method int Log.e(String, String, Throwable)>
	//* 150  278:pop             
	//* 151  279:new             #602 <Class RuntimeException>
	//* 152  282:dup             
	//* 153  283:aload_0         
	//* 154  284:invokespecial   #605 <Method void RuntimeException(Throwable)>
	//* 155  287:athrow          
	//* 156  288:astore_0        
	//* 157  289:ldc1            #69  <String "Database">
	//* 158  291:ldc2            #612 <String "Error in closing streams IO streams after expanding ICU dat file">
	//* 159  294:aload_0         
	//* 160  295:invokestatic    #597 <Method int Log.e(String, String, Throwable)>
	//* 161  298:pop             
	//* 162  299:new             #602 <Class RuntimeException>
	//* 163  302:dup             
	//* 164  303:aload_0         
	//* 165  304:invokespecial   #605 <Method void RuntimeException(Throwable)>
	//* 166  307:athrow          
	//* 167  308:astore          4
	//* 168  310:aload_0         
	//* 169  311:astore_1        
	//* 170  312:aload           7
	//* 171  314:astore_3        
	//* 172  315:aload           4
	//* 173  317:astore_0        
	//* 174  318:goto            214
	//* 175  321:astore          4
	//* 176  323:aload_1         
	//* 177  324:astore_3        
	//* 178  325:aload_0         
	//* 179  326:astore_1        
	//* 180  327:aload           4
	//* 181  329:astore_0        
	//* 182  330:goto            214
		// Misplaced declaration of an exception variable
		catch(Object obj1)
	//* 183  333:astore          4
		{
			context = ((Context) (obj4));
	//  184  335:aload           8
	//  185  337:astore_0        
			file1 = ((File) (obj2));
	//  186  338:aload           6
	//  187  340:astore          5
			continue; /* Loop/switch isn't completed */
	//  188  342:goto            158
		}
		file = ((File) (obj6));
		obj = ((Object) (obj5));
		if(file2.exists()) goto _L2; else goto _L1
_L1:
		file = ((File) (obj6));
		obj = ((Object) (obj5));
		context = ((Context) (new ZipInputStream(context.getAssets().open("icudt46l.zip"))));
		((ZipInputStream) (context)).getNextEntry();
		file = ((File) (new FileOutputStream(file2)));
		obj = ((Object) (new byte[1024]));
_L5:
		i = ((ZipInputStream) (context)).read(((byte []) (obj)));
		if(i <= 0) goto _L4; else goto _L3
_L3:
		((OutputStream) (file)).write(((byte []) (obj)), 0, i);
		  goto _L5
		obj1;
		file1 = file;
_L9:
		file = ((File) (context));
		obj = ((Object) (file1));
		Log.e("Database", "Error copying icu dat file", ((Throwable) (obj1)));
		file = ((File) (context));
		obj = ((Object) (file1));
		if(!file2.exists())
			break MISSING_BLOCK_LABEL_198;
		file = ((File) (context));
		obj = ((Object) (file1));
		file2.delete();
		file = ((File) (context));
		obj = ((Object) (file1));
		throw new RuntimeException(((Throwable) (obj1)));
		context;
_L7:
		if(file != null)
			try
			{
				((ZipInputStream) (file)).close();
			}
			// Misplaced declaration of an exception variable
			catch(Context context)
			{
				Log.e("Database", "Error in closing streams IO streams after expanding ICU dat file", ((Throwable) (context)));
				throw new RuntimeException(((Throwable) (context)));
			}
		if(obj == null)
			break MISSING_BLOCK_LABEL_234;
		((OutputStream) (obj)).flush();
		((OutputStream) (obj)).close();
		throw context;
_L4:
		file1 = file;
		obj1 = ((Object) (context));
_L2:
		if(obj1 != null)
			try
			{
				((ZipInputStream) (obj1)).close();
			}
			// Misplaced declaration of an exception variable
			catch(Context context)
			{
				Log.e("Database", "Error in closing streams IO streams after expanding ICU dat file", ((Throwable) (context)));
				throw new RuntimeException(((Throwable) (context)));
			}
		if(file1 == null)
			break MISSING_BLOCK_LABEL_267;
		((OutputStream) (file1)).flush();
		((OutputStream) (file1)).close();
		return;
		obj1;
		file = ((File) (context));
		obj = ((Object) (obj3));
		context = ((Context) (obj1));
		continue; /* Loop/switch isn't completed */
		obj1;
		obj = ((Object) (file));
		file = ((File) (context));
		context = ((Context) (obj1));
		if(true) goto _L7; else goto _L6
_L6:
		break MISSING_BLOCK_LABEL_74;
		obj1;
	//  189  345:astore          4
		file1 = ((File) (obj2));
	//  190  347:aload           6
	//  191  349:astore          5
		if(true) goto _L9; else goto _L8
	//  192  351:goto            158
_L8:
	}

	public static void loadLibs(Context context)
	{
		net/sqlcipher/database/SQLiteDatabase;
	//    0    0:ldc1            #2   <Class SQLiteDatabase>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		loadLibs(context, context.getFilesDir());
	//    2    3:aload_0         
	//    3    4:aload_0         
	//    4    5:invokevirtual   #618 <Method File Context.getFilesDir()>
	//    5    8:invokestatic    #620 <Method void loadLibs(Context, File)>
		net/sqlcipher/database/SQLiteDatabase;
	//    6   11:ldc1            #2   <Class SQLiteDatabase>
		JVM INSTR monitorexit ;
	//    7   13:monitorexit     
		return;
	//    8   14:return          
		context;
	//    9   15:astore_0        
	//*  10   16:ldc1            #2   <Class SQLiteDatabase>
		throw context;
	//   11   18:monitorexit     
	//   12   19:aload_0         
	//   13   20:athrow          
	}

	public static void loadLibs(Context context, File file)
	{
		net/sqlcipher/database/SQLiteDatabase;
	//    0    0:ldc1            #2   <Class SQLiteDatabase>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag;
		System.loadLibrary("stlport_shared");
	//    2    3:ldc2            #622 <String "stlport_shared">
	//    3    6:invokestatic    #625 <Method void System.loadLibrary(String)>
		System.loadLibrary("sqlcipher_android");
	//    4    9:ldc2            #627 <String "sqlcipher_android">
	//    5   12:invokestatic    #625 <Method void System.loadLibrary(String)>
		System.loadLibrary("database_sqlcipher");
	//    6   15:ldc2            #629 <String "database_sqlcipher">
	//    7   18:invokestatic    #625 <Method void System.loadLibrary(String)>
		flag = (new File("/system/usr/icu/icudt46l.dat")).exists();
	//    8   21:new             #541 <Class File>
	//    9   24:dup             
	//   10   25:ldc2            #631 <String "/system/usr/icu/icudt46l.dat">
	//   11   28:invokespecial   #632 <Method void File(String)>
	//   12   31:invokevirtual   #551 <Method boolean File.exists()>
	//   13   34:istore_2        
		if(!flag) goto _L2; else goto _L1
	//   14   35:iload_2         
	//   15   36:ifeq            60
_L1:
		String s = "/system/usr";
	//   16   39:ldc2            #634 <String "/system/usr">
	//   17   42:astore_3        
_L4:
		setICURoot(s);
	//   18   43:aload_3         
	//   19   44:invokestatic    #637 <Method void setICURoot(String)>
		if(flag)
			break MISSING_BLOCK_LABEL_56;
	//   20   47:iload_2         
	//   21   48:ifne            56
		loadICUData(context, file);
	//   22   51:aload_0         
	//   23   52:aload_1         
	//   24   53:invokestatic    #639 <Method void loadICUData(Context, File)>
		net/sqlcipher/database/SQLiteDatabase;
	//   25   56:ldc1            #2   <Class SQLiteDatabase>
		JVM INSTR monitorexit ;
	//   26   58:monitorexit     
		return;
	//   27   59:return          
_L2:
		s = file.getAbsolutePath();
	//   28   60:aload_1         
	//   29   61:invokevirtual   #642 <Method String File.getAbsolutePath()>
	//   30   64:astore_3        
		if(true) goto _L4; else goto _L3
	//   31   65:goto            43
_L3:
		context;
	//   32   68:astore_0        
	//*  33   69:ldc1            #2   <Class SQLiteDatabase>
		throw context;
	//   34   71:monitorexit     
	//   35   72:aload_0         
	//   36   73:athrow          
	}

	private void lockForced()
	{
		mLock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field ReentrantLock mLock>
	//    2    4:invokevirtual   #646 <Method void ReentrantLock.lock()>
		if(SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && mLock.getHoldCount() == 1)
	//*   3    7:getstatic       #649 <Field boolean SQLiteDebug.DEBUG_LOCK_TIME_TRACKING>
	//*   4   10:ifeq            38
	//*   5   13:aload_0         
	//*   6   14:getfield        #160 <Field ReentrantLock mLock>
	//*   7   17:invokevirtual   #652 <Method int ReentrantLock.getHoldCount()>
	//*   8   20:iconst_1        
	//*   9   21:icmpne          38
		{
			mLockAcquiredWallTime = SystemClock.elapsedRealtime();
	//   10   24:aload_0         
	//   11   25:invokestatic    #237 <Method long SystemClock.elapsedRealtime()>
	//   12   28:putfield        #162 <Field long mLockAcquiredWallTime>
			mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
	//   13   31:aload_0         
	//   14   32:invokestatic    #254 <Method long Debug.threadCpuTimeNanos()>
	//   15   35:putfield        #164 <Field long mLockAcquiredThreadTime>
		}
	//   16   38:return          
	}

	private void markTableSyncable(String s, String s1, String s2, String s3)
	{
		lock();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #655 <Method void lock()>
		native_execSQL((new StringBuilder()).append("SELECT _sync_dirty FROM ").append(s2).append(" LIMIT 0").toString());
	//    2    4:aload_0         
	//    3    5:new             #258 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #259 <Method void StringBuilder()>
	//    6   12:ldc2            #657 <String "SELECT _sync_dirty FROM ">
	//    7   15:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:aload_3         
	//    9   19:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:ldc2            #659 <String " LIMIT 0">
	//   11   25:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:invokevirtual   #281 <Method String StringBuilder.toString()>
	//   13   31:invokevirtual   #662 <Method void native_execSQL(String)>
		native_execSQL((new StringBuilder()).append("SELECT ").append(s1).append(" FROM ").append(s).append(" LIMIT 0").toString());
	//   14   34:aload_0         
	//   15   35:new             #258 <Class StringBuilder>
	//   16   38:dup             
	//   17   39:invokespecial   #259 <Method void StringBuilder()>
	//   18   42:ldc2            #664 <String "SELECT ">
	//   19   45:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_2         
	//   21   49:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   22   52:ldc2            #666 <String " FROM ">
	//   23   55:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   24   58:aload_1         
	//   25   59:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   26   62:ldc2            #659 <String " LIMIT 0">
	//   27   65:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   28   68:invokevirtual   #281 <Method String StringBuilder.toString()>
	//   29   71:invokevirtual   #662 <Method void native_execSQL(String)>
		unlock();
	//   30   74:aload_0         
	//   31   75:invokevirtual   #669 <Method void unlock()>
	/* block-local class not found */
	class SyncUpdateInfo {}

		s2 = ((String) (new SyncUpdateInfo(s2, s3, s1)));
	//   32   78:new             #8   <Class SQLiteDatabase$SyncUpdateInfo>
	//   33   81:dup             
	//   34   82:aload_3         
	//   35   83:aload           4
	//   36   85:aload_2         
	//   37   86:invokespecial   #672 <Method void SQLiteDatabase$SyncUpdateInfo(String, String, String)>
	//   38   89:astore_3        
		synchronized(mSyncUpdateInfo)
	//*  39   90:aload_0         
	//*  40   91:getfield        #196 <Field Map mSyncUpdateInfo>
	//*  41   94:astore_2        
	//*  42   95:aload_2         
	//*  43   96:monitorenter    
		{
			mSyncUpdateInfo.put(((Object) (s)), ((Object) (s2)));
	//   44   97:aload_0         
	//   45   98:getfield        #196 <Field Map mSyncUpdateInfo>
	//   46  101:aload_1         
	//   47  102:aload_3         
	//   48  103:invokeinterface #676 <Method Object Map.put(Object, Object)>
	//   49  108:pop             
		}
	//   50  109:aload_2         
	//   51  110:monitorexit     
		return;
	//   52  111:return          
		s;
	//   53  112:astore_1        
		unlock();
	//   54  113:aload_0         
	//   55  114:invokevirtual   #669 <Method void unlock()>
		throw s;
	//   56  117:aload_1         
	//   57  118:athrow          
		s;
	//   58  119:astore_1        
		s1;
	//   59  120:aload_2         
		JVM INSTR monitorexit ;
	//   60  121:monitorexit     
		throw s;
	//   61  122:aload_1         
	//   62  123:athrow          
	}

	private native int native_getDbLookaside();

	private native void native_key(String s)
		throws SQLException;

	private native void native_key(char ac[])
		throws SQLException;

	private native void native_rawExecSQL(String s);

	private native void native_rekey(String s)
		throws SQLException;

	private native void native_rekey(char ac[])
		throws SQLException;

	private native int native_status(int i, boolean flag);

	public static SQLiteDatabase openDatabase(String s, String s1, CursorFactory cursorfactory, int i)
	{
		return openDatabase(s, s1.toCharArray(), cursorfactory, i, ((SQLiteDatabaseHook) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #336 <Method char[] String.toCharArray()>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:aconst_null     
	//    6    8:invokestatic    #688 <Method SQLiteDatabase openDatabase(String, char[], SQLiteDatabase$CursorFactory, int, SQLiteDatabaseHook)>
	//    7   11:areturn         
	}

	public static SQLiteDatabase openDatabase(String s, String s1, CursorFactory cursorfactory, int i, SQLiteDatabaseHook sqlitedatabasehook)
	{
		return openDatabase(s, s1.toCharArray(), cursorfactory, i, sqlitedatabasehook);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #336 <Method char[] String.toCharArray()>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokestatic    #688 <Method SQLiteDatabase openDatabase(String, char[], SQLiteDatabase$CursorFactory, int, SQLiteDatabaseHook)>
	//    7   12:areturn         
	}

	public static SQLiteDatabase openDatabase(String s, String s1, CursorFactory cursorfactory, int i, SQLiteDatabaseHook sqlitedatabasehook, DatabaseErrorHandler databaseerrorhandler)
	{
		return openDatabase(s, s1.toCharArray(), cursorfactory, i, sqlitedatabasehook, databaseerrorhandler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #336 <Method char[] String.toCharArray()>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:invokestatic    #693 <Method SQLiteDatabase openDatabase(String, char[], SQLiteDatabase$CursorFactory, int, SQLiteDatabaseHook, DatabaseErrorHandler)>
	//    8   14:areturn         
	}

	public static SQLiteDatabase openDatabase(String s, char ac[], CursorFactory cursorfactory, int i)
	{
		return openDatabase(s, ac, cursorfactory, i, ((SQLiteDatabaseHook) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aconst_null     
	//    5    5:invokestatic    #688 <Method SQLiteDatabase openDatabase(String, char[], SQLiteDatabase$CursorFactory, int, SQLiteDatabaseHook)>
	//    6    8:areturn         
	}

	public static SQLiteDatabase openDatabase(String s, char ac[], CursorFactory cursorfactory, int i, SQLiteDatabaseHook sqlitedatabasehook)
	{
		return openDatabase(s, ac, cursorfactory, i, sqlitedatabasehook, ((DatabaseErrorHandler) (new DefaultDatabaseErrorHandler())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:new             #695 <Class DefaultDatabaseErrorHandler>
	//    6    9:dup             
	//    7   10:invokespecial   #696 <Method void DefaultDatabaseErrorHandler()>
	//    8   13:invokestatic    #693 <Method SQLiteDatabase openDatabase(String, char[], SQLiteDatabase$CursorFactory, int, SQLiteDatabaseHook, DatabaseErrorHandler)>
	//    9   16:areturn         
	}

	public static SQLiteDatabase openDatabase(String s, char ac[], CursorFactory cursorfactory, int i, SQLiteDatabaseHook sqlitedatabasehook, DatabaseErrorHandler databaseerrorhandler)
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		Object obj = ((Object) (new SQLiteDatabase(s, cursorfactory, i, databaseerrorhandler)));
	//    2    3:new             #2   <Class SQLiteDatabase>
	//    3    6:dup             
	//    4    7:aload_0         
	//    5    8:aload_2         
	//    6    9:iload_3         
	//    7   10:aload           5
	//    8   12:invokespecial   #225 <Method void SQLiteDatabase(String, SQLiteDatabase$CursorFactory, int, DatabaseErrorHandler)>
	//    9   15:astore          6
		((SQLiteDatabase) (obj)).openDatabaseInternal(ac, sqlitedatabasehook);
	//   10   17:aload           6
	//   11   19:aload_1         
	//   12   20:aload           4
	//   13   22:invokespecial   #229 <Method void openDatabaseInternal(char[], SQLiteDatabaseHook)>
		ac = ((char []) (obj));
	//   14   25:aload           6
	//   15   27:astore_1        
_L2:
		if(SQLiteDebug.DEBUG_SQL_STATEMENTS)
	//*  16   28:getstatic       #701 <Field boolean SQLiteDebug.DEBUG_SQL_STATEMENTS>
	//*  17   31:ifeq            39
			((SQLiteDatabase) (ac)).enableSqlTracing(s);
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:invokespecial   #703 <Method void enableSqlTracing(String)>
		if(SQLiteDebug.DEBUG_SQL_TIME)
	//*  21   39:getstatic       #706 <Field boolean SQLiteDebug.DEBUG_SQL_TIME>
	//*  22   42:ifeq            50
			((SQLiteDatabase) (ac)).enableSqlProfiling(s);
	//   23   45:aload_1         
	//   24   46:aload_0         
	//   25   47:invokespecial   #708 <Method void enableSqlProfiling(String)>
		synchronized(sActiveDatabases)
	//*  26   50:getstatic       #122 <Field WeakHashMap sActiveDatabases>
	//*  27   53:astore_0        
	//*  28   54:aload_0         
	//*  29   55:monitorenter    
		{
			sActiveDatabases.put(((Object) (ac)), ((Object) (null)));
	//   30   56:getstatic       #122 <Field WeakHashMap sActiveDatabases>
	//   31   59:aload_1         
	//   32   60:aconst_null     
	//   33   61:invokevirtual   #709 <Method Object WeakHashMap.put(Object, Object)>
	//   34   64:pop             
		}
	//   35   65:aload_0         
	//   36   66:monitorexit     
		return ((SQLiteDatabase) (ac));
	//   37   67:aload_1         
	//   38   68:areturn         
		obj;
	//   39   69:astore          6
_L3:
		Log.e("Database", (new StringBuilder()).append("Calling error handler for corrupt database ").append(s).toString(), ((Throwable) (obj)));
	//   40   71:ldc1            #69  <String "Database">
	//   41   73:new             #258 <Class StringBuilder>
	//   42   76:dup             
	//   43   77:invokespecial   #259 <Method void StringBuilder()>
	//   44   80:ldc2            #711 <String "Calling error handler for corrupt database ">
	//   45   83:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   46   86:aload_0         
	//   47   87:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   48   90:invokevirtual   #281 <Method String StringBuilder.toString()>
	//   49   93:aload           6
	//   50   95:invokestatic    #597 <Method int Log.e(String, String, Throwable)>
	//   51   98:pop             
		databaseerrorhandler.onCorruption(((SQLiteDatabase) (obj1)));
	//   52   99:aload           5
	//   53  101:aload           7
	//   54  103:invokeinterface #717 <Method void DatabaseErrorHandler.onCorruption(SQLiteDatabase)>
		cursorfactory = ((CursorFactory) (new SQLiteDatabase(s, cursorfactory, i, databaseerrorhandler)));
	//   55  108:new             #2   <Class SQLiteDatabase>
	//   56  111:dup             
	//   57  112:aload_0         
	//   58  113:aload_2         
	//   59  114:iload_3         
	//   60  115:aload           5
	//   61  117:invokespecial   #225 <Method void SQLiteDatabase(String, SQLiteDatabase$CursorFactory, int, DatabaseErrorHandler)>
	//   62  120:astore_2        
		((SQLiteDatabase) (cursorfactory)).openDatabaseInternal(ac, sqlitedatabasehook);
	//   63  121:aload_2         
	//   64  122:aload_1         
	//   65  123:aload           4
	//   66  125:invokespecial   #229 <Method void openDatabaseInternal(char[], SQLiteDatabaseHook)>
		ac = ((char []) (cursorfactory));
	//   67  128:aload_2         
	//   68  129:astore_1        
		if(true) goto _L2; else goto _L1
	//   69  130:goto            28
_L1:
		ac;
	//   70  133:astore_1        
		s;
	//   71  134:aload_0         
		JVM INSTR monitorexit ;
	//   72  135:monitorexit     
		throw ac;
	//   73  136:aload_1         
	//   74  137:athrow          
		SQLiteDatabaseCorruptException sqlitedatabasecorruptexception;
		sqlitedatabasecorruptexception;
	//   75  138:astore          8
		obj1 = obj;
	//   76  140:aload           6
	//   77  142:astore          7
		obj = ((Object) (sqlitedatabasecorruptexception));
	//   78  144:aload           8
	//   79  146:astore          6
		  goto _L3
	//*  80  148:goto            71
	}

	private void openDatabaseInternal(char ac[], SQLiteDatabaseHook sqlitedatabasehook)
	{
		dbopen(mPath, mFlags);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #207 <Field String mPath>
	//    3    5:aload_0         
	//    4    6:getfield        #205 <Field int mFlags>
	//    5    9:invokespecial   #719 <Method void dbopen(String, int)>
		if(sqlitedatabasehook != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          23
			sqlitedatabasehook.preKey(this);
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:invokeinterface #724 <Method void SQLiteDatabaseHook.preKey(SQLiteDatabase)>
		native_key(ac);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokespecial   #726 <Method void native_key(char[])>
		if(sqlitedatabasehook != null)
	//*  14   28:aload_2         
	//*  15   29:ifnull          39
			sqlitedatabasehook.postKey(this);
	//   16   32:aload_2         
	//   17   33:aload_0         
	//   18   34:invokeinterface #729 <Method void SQLiteDatabaseHook.postKey(SQLiteDatabase)>
		if(SQLiteDebug.DEBUG_SQL_CACHE)
	//*  19   39:getstatic       #732 <Field boolean SQLiteDebug.DEBUG_SQL_CACHE>
	//*  20   42:ifeq            53
			mTimeOpened = getTime();
	//   21   45:aload_0         
	//   22   46:aload_0         
	//   23   47:invokespecial   #734 <Method String getTime()>
	//   24   50:putfield        #188 <Field String mTimeOpened>
		try
		{
			setLocale(Locale.getDefault());
	//   25   53:aload_0         
	//   26   54:invokestatic    #740 <Method Locale Locale.getDefault()>
	//   27   57:invokevirtual   #744 <Method void setLocale(Locale)>
			return;
	//   28   60:return          
		}
		// Misplaced declaration of an exception variable
		catch(char ac[])
	//*  29   61:astore_1        
		{
			Log.e("Database", "Failed to setLocale() when constructing, closing the database", ((Throwable) (ac)));
	//   30   62:ldc1            #69  <String "Database">
	//   31   64:ldc2            #746 <String "Failed to setLocale() when constructing, closing the database">
	//   32   67:aload_1         
	//   33   68:invokestatic    #597 <Method int Log.e(String, String, Throwable)>
	//   34   71:pop             
		}
		dbclose();
	//   35   72:aload_0         
	//   36   73:invokespecial   #748 <Method void dbclose()>
		if(SQLiteDebug.DEBUG_SQL_CACHE)
	//*  37   76:getstatic       #732 <Field boolean SQLiteDebug.DEBUG_SQL_CACHE>
	//*  38   79:ifeq            90
			mTimeClosed = getTime();
	//   39   82:aload_0         
	//   40   83:aload_0         
	//   41   84:invokespecial   #734 <Method String getTime()>
	//   42   87:putfield        #190 <Field String mTimeClosed>
		throw ac;
	//   43   90:aload_1         
	//   44   91:athrow          
	}

	public static SQLiteDatabase openOrCreateDatabase(File file, String s, CursorFactory cursorfactory)
	{
		return openOrCreateDatabase(file.getPath(), s, cursorfactory, ((SQLiteDatabaseHook) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #751 <Method String File.getPath()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aconst_null     
	//    5    7:invokestatic    #754 <Method SQLiteDatabase openOrCreateDatabase(String, String, SQLiteDatabase$CursorFactory, SQLiteDatabaseHook)>
	//    6   10:areturn         
	}

	public static SQLiteDatabase openOrCreateDatabase(File file, String s, CursorFactory cursorfactory, SQLiteDatabaseHook sqlitedatabasehook)
	{
		return openOrCreateDatabase(file.getPath(), s, cursorfactory, sqlitedatabasehook);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #751 <Method String File.getPath()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokestatic    #754 <Method SQLiteDatabase openOrCreateDatabase(String, String, SQLiteDatabase$CursorFactory, SQLiteDatabaseHook)>
	//    6   10:areturn         
	}

	public static SQLiteDatabase openOrCreateDatabase(File file, String s, CursorFactory cursorfactory, SQLiteDatabaseHook sqlitedatabasehook, DatabaseErrorHandler databaseerrorhandler)
	{
		return openDatabase(file.getPath(), s.toCharArray(), cursorfactory, 0x10000000, sqlitedatabasehook, databaseerrorhandler);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #751 <Method String File.getPath()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #336 <Method char[] String.toCharArray()>
	//    4    8:aload_2         
	//    5    9:ldc1            #29  <Int 0x10000000>
	//    6   11:aload_3         
	//    7   12:aload           4
	//    8   14:invokestatic    #693 <Method SQLiteDatabase openDatabase(String, char[], SQLiteDatabase$CursorFactory, int, SQLiteDatabaseHook, DatabaseErrorHandler)>
	//    9   17:areturn         
	}

	public static SQLiteDatabase openOrCreateDatabase(String s, String s1, CursorFactory cursorfactory)
	{
		return openDatabase(s, s1.toCharArray(), cursorfactory, 0x10000000, ((SQLiteDatabaseHook) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #336 <Method char[] String.toCharArray()>
	//    3    5:aload_2         
	//    4    6:ldc1            #29  <Int 0x10000000>
	//    5    8:aconst_null     
	//    6    9:invokestatic    #688 <Method SQLiteDatabase openDatabase(String, char[], SQLiteDatabase$CursorFactory, int, SQLiteDatabaseHook)>
	//    7   12:areturn         
	}

	public static SQLiteDatabase openOrCreateDatabase(String s, String s1, CursorFactory cursorfactory, SQLiteDatabaseHook sqlitedatabasehook)
	{
		return openDatabase(s, s1, cursorfactory, 0x10000000, sqlitedatabasehook);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #29  <Int 0x10000000>
	//    4    5:aload_3         
	//    5    6:invokestatic    #759 <Method SQLiteDatabase openDatabase(String, String, SQLiteDatabase$CursorFactory, int, SQLiteDatabaseHook)>
	//    6    9:areturn         
	}

	public static SQLiteDatabase openOrCreateDatabase(String s, String s1, CursorFactory cursorfactory, SQLiteDatabaseHook sqlitedatabasehook, DatabaseErrorHandler databaseerrorhandler)
	{
		return openDatabase(s, s1.toCharArray(), cursorfactory, 0x10000000, sqlitedatabasehook, databaseerrorhandler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #336 <Method char[] String.toCharArray()>
	//    3    5:aload_2         
	//    4    6:ldc1            #29  <Int 0x10000000>
	//    5    8:aload_3         
	//    6    9:aload           4
	//    7   11:invokestatic    #693 <Method SQLiteDatabase openDatabase(String, char[], SQLiteDatabase$CursorFactory, int, SQLiteDatabaseHook, DatabaseErrorHandler)>
	//    8   14:areturn         
	}

	public static SQLiteDatabase openOrCreateDatabase(String s, char ac[], CursorFactory cursorfactory)
	{
		return openDatabase(s, ac, cursorfactory, 0x10000000, ((SQLiteDatabaseHook) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #29  <Int 0x10000000>
	//    4    5:aconst_null     
	//    5    6:invokestatic    #688 <Method SQLiteDatabase openDatabase(String, char[], SQLiteDatabase$CursorFactory, int, SQLiteDatabaseHook)>
	//    6    9:areturn         
	}

	public static SQLiteDatabase openOrCreateDatabase(String s, char ac[], CursorFactory cursorfactory, SQLiteDatabaseHook sqlitedatabasehook)
	{
		return openDatabase(s, ac, cursorfactory, 0x10000000, sqlitedatabasehook);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #29  <Int 0x10000000>
	//    4    5:aload_3         
	//    5    6:invokestatic    #688 <Method SQLiteDatabase openDatabase(String, char[], SQLiteDatabase$CursorFactory, int, SQLiteDatabaseHook)>
	//    6    9:areturn         
	}

	public static SQLiteDatabase openOrCreateDatabase(String s, char ac[], CursorFactory cursorfactory, SQLiteDatabaseHook sqlitedatabasehook, DatabaseErrorHandler databaseerrorhandler)
	{
		return openDatabase(s, ac, cursorfactory, 0x10000000, sqlitedatabasehook, databaseerrorhandler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #29  <Int 0x10000000>
	//    4    5:aload_3         
	//    5    6:aload           4
	//    6    8:invokestatic    #693 <Method SQLiteDatabase openDatabase(String, char[], SQLiteDatabase$CursorFactory, int, SQLiteDatabaseHook, DatabaseErrorHandler)>
	//    7   11:areturn         
	}

	public static native int releaseMemory();

	public static native void setICURoot(String s);

	private void unlockForced()
	{
		if(SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && mLock.getHoldCount() == 1)
	//*   0    0:getstatic       #649 <Field boolean SQLiteDebug.DEBUG_LOCK_TIME_TRACKING>
	//*   1    3:ifeq            21
	//*   2    6:aload_0         
	//*   3    7:getfield        #160 <Field ReentrantLock mLock>
	//*   4   10:invokevirtual   #652 <Method int ReentrantLock.getHoldCount()>
	//*   5   13:iconst_1        
	//*   6   14:icmpne          21
			checkLockHoldTime();
	//    7   17:aload_0         
	//    8   18:invokespecial   #767 <Method void checkLockHoldTime()>
		mLock.unlock();
	//    9   21:aload_0         
	//   10   22:getfield        #160 <Field ReentrantLock mLock>
	//   11   25:invokevirtual   #768 <Method void ReentrantLock.unlock()>
	//   12   28:return          
	}

	private boolean yieldIfContendedHelper(boolean flag, long l)
	{
		if(mLock.getQueueLength() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field ReentrantLock mLock>
	//*   2    4:invokevirtual   #775 <Method int ReentrantLock.getQueueLength()>
	//*   3    7:ifne            26
		{
			mLockAcquiredWallTime = SystemClock.elapsedRealtime();
	//    4   10:aload_0         
	//    5   11:invokestatic    #237 <Method long SystemClock.elapsedRealtime()>
	//    6   14:putfield        #162 <Field long mLockAcquiredWallTime>
			mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
	//    7   17:aload_0         
	//    8   18:invokestatic    #254 <Method long Debug.threadCpuTimeNanos()>
	//    9   21:putfield        #164 <Field long mLockAcquiredThreadTime>
			return false;
	//   10   24:iconst_0        
	//   11   25:ireturn         
		}
		setTransactionSuccessful();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #778 <Method void setTransactionSuccessful()>
		SQLiteTransactionListener sqlitetransactionlistener = mTransactionListener;
	//   14   30:aload_0         
	//   15   31:getfield        #780 <Field SQLiteTransactionListener mTransactionListener>
	//   16   34:astore          6
		endTransaction();
	//   17   36:aload_0         
	//   18   37:invokevirtual   #783 <Method void endTransaction()>
		if(flag && isDbLockedByCurrentThread())
	//*  19   40:iload_1         
	//*  20   41:ifeq            62
	//*  21   44:aload_0         
	//*  22   45:invokevirtual   #786 <Method boolean isDbLockedByCurrentThread()>
	//*  23   48:ifeq            62
			throw new IllegalStateException("Db locked more than once. yielfIfContended cannot yield");
	//   24   51:new             #381 <Class IllegalStateException>
	//   25   54:dup             
	//   26   55:ldc2            #788 <String "Db locked more than once. yielfIfContended cannot yield">
	//   27   58:invokespecial   #384 <Method void IllegalStateException(String)>
	//   28   61:athrow          
		if(l > 0L)
	//*  29   62:lload_2         
	//*  30   63:lconst_0        
	//*  31   64:lcmp            
	//*  32   65:ifle            106
			do
			{
				if(l <= 0L)
					break;
	//   33   68:lload_2         
	//   34   69:lconst_0        
	//   35   70:lcmp            
	//   36   71:ifle            106
				long l1;
				if(l < 1000L)
	//*  37   74:lload_2         
	//*  38   75:ldc2w           #789 <Long 1000L>
	//*  39   78:lcmp            
	//*  40   79:ifge            114
					l1 = l;
	//   41   82:lload_2         
	//   42   83:lstore          4
				else
	//*  43   85:lload           4
	//*  44   87:invokestatic    #796 <Method void Thread.sleep(long)>
	//*  45   90:lload_2         
	//*  46   91:ldc2w           #789 <Long 1000L>
	//*  47   94:lsub            
	//*  48   95:lstore_2        
	//*  49   96:aload_0         
	//*  50   97:getfield        #160 <Field ReentrantLock mLock>
	//*  51  100:invokevirtual   #775 <Method int ReentrantLock.getQueueLength()>
	//*  52  103:ifne            68
	//*  53  106:aload_0         
	//*  54  107:aload           6
	//*  55  109:invokevirtual   #800 <Method void beginTransactionWithListener(SQLiteTransactionListener)>
	//*  56  112:iconst_1        
	//*  57  113:ireturn         
					l1 = 1000L;
	//   58  114:ldc2w           #789 <Long 1000L>
	//   59  117:lstore          4
				try
				{
					Thread.sleep(l1);
				}
	//*  60  119:goto            85
				catch(InterruptedException interruptedexception)
	//*  61  122:astore          7
				{
					Thread.interrupted();
	//   62  124:invokestatic    #803 <Method boolean Thread.interrupted()>
	//   63  127:pop             
				}
				l -= 1000L;
			} while(mLock.getQueueLength() != 0);
		beginTransactionWithListener(sqlitetransactionlistener);
		return true;
	//*  64  128:goto            90
	}

	void addSQLiteClosable(SQLiteClosable sqliteclosable)
	{
		lock();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #655 <Method void lock()>
		mPrograms.put(((Object) (sqliteclosable)), ((Object) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #220 <Field WeakHashMap mPrograms>
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #709 <Method Object WeakHashMap.put(Object, Object)>
	//    7   13:pop             
		unlock();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #669 <Method void unlock()>
		return;
	//   10   18:return          
		sqliteclosable;
	//   11   19:astore_1        
		unlock();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #669 <Method void unlock()>
		throw sqliteclosable;
	//   14   24:aload_1         
	//   15   25:athrow          
	}

	void addToCompiledQueries(String s, SQLiteCompiledSql sqlitecompiledsql)
	{
		if(mMaxSqlCacheSize == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #186 <Field int mMaxSqlCacheSize>
	//*   2    4:ifne            53
		{
			if(SQLiteDebug.DEBUG_SQL_CACHE)
	//*   3    7:getstatic       #732 <Field boolean SQLiteDebug.DEBUG_SQL_CACHE>
	//*   4   10:ifeq            52
				Log.v("Database", (new StringBuilder()).append("|NOT adding_sql_to_cache|").append(getPath()).append("|").append(s).toString());
	//    5   13:ldc1            #69  <String "Database">
	//    6   15:new             #258 <Class StringBuilder>
	//    7   18:dup             
	//    8   19:invokespecial   #259 <Method void StringBuilder()>
	//    9   22:ldc2            #809 <String "|NOT adding_sql_to_cache|">
	//   10   25:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   11   28:aload_0         
	//   12   29:invokevirtual   #442 <Method String getPath()>
	//   13   32:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   14   35:ldc2            #811 <String "|">
	//   15   38:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   16   41:aload_1         
	//   17   42:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   18   45:invokevirtual   #281 <Method String StringBuilder.toString()>
	//   19   48:invokestatic    #814 <Method int Log.v(String, String)>
	//   20   51:pop             
			return;
	//   21   52:return          
		}
		synchronized(mCompiledQueries)
	//*  22   53:aload_0         
	//*  23   54:getfield        #184 <Field Map mCompiledQueries>
	//*  24   57:astore          4
	//*  25   59:aload           4
	//*  26   61:monitorenter    
		{
			if((SQLiteCompiledSql)mCompiledQueries.get(((Object) (s))) == null)
				break MISSING_BLOCK_LABEL_88;
	//   27   62:aload_0         
	//   28   63:getfield        #184 <Field Map mCompiledQueries>
	//   29   66:aload_1         
	//   30   67:invokeinterface #817 <Method Object Map.get(Object)>
	//   31   72:checkcast       #355 <Class SQLiteCompiledSql>
	//   32   75:ifnull          88
		}
	//   33   78:aload           4
	//   34   80:monitorexit     
		return;
	//   35   81:return          
		s;
	//   36   82:astore_1        
		map;
	//   37   83:aload           4
		JVM INSTR monitorexit ;
	//   38   85:monitorexit     
		throw s;
	//   39   86:aload_1         
	//   40   87:athrow          
		int i;
		if(mCompiledQueries.size() != mMaxSqlCacheSize)
			break MISSING_BLOCK_LABEL_176;
	//   41   88:aload_0         
	//   42   89:getfield        #184 <Field Map mCompiledQueries>
	//   43   92:invokeinterface #818 <Method int Map.size()>
	//   44   97:aload_0         
	//   45   98:getfield        #186 <Field int mMaxSqlCacheSize>
	//   46  101:icmpne          176
		i = mCacheFullWarnings + 1;
	//   47  104:aload_0         
	//   48  105:getfield        #820 <Field int mCacheFullWarnings>
	//   49  108:iconst_1        
	//   50  109:iadd            
	//   51  110:istore_3        
		mCacheFullWarnings = i;
	//   52  111:aload_0         
	//   53  112:iload_3         
	//   54  113:putfield        #820 <Field int mCacheFullWarnings>
		if(i != 1)
			break MISSING_BLOCK_LABEL_172;
	//   55  116:iload_3         
	//   56  117:iconst_1        
	//   57  118:icmpne          172
		Log.w("Database", (new StringBuilder()).append("Reached MAX size for compiled-sql statement cache for database ").append(getPath()).append("; i.e., NO space for this sql statement in cache: ").append(s).append(". Please change your sql statements to use '?' for ").append("bindargs, instead of using actual values").toString());
	//   58  121:ldc1            #69  <String "Database">
	//   59  123:new             #258 <Class StringBuilder>
	//   60  126:dup             
	//   61  127:invokespecial   #259 <Method void StringBuilder()>
	//   62  130:ldc2            #822 <String "Reached MAX size for compiled-sql statement cache for database ">
	//   63  133:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   64  136:aload_0         
	//   65  137:invokevirtual   #442 <Method String getPath()>
	//   66  140:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   67  143:ldc2            #824 <String "; i.e., NO space for this sql statement in cache: ">
	//   68  146:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   69  149:aload_1         
	//   70  150:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   71  153:ldc2            #826 <String ". Please change your sql statements to use '?' for ">
	//   72  156:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   73  159:ldc2            #828 <String "bindargs, instead of using actual values">
	//   74  162:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   75  165:invokevirtual   #281 <Method String StringBuilder.toString()>
	//   76  168:invokestatic    #831 <Method int Log.w(String, String)>
	//   77  171:pop             
_L2:
		map;
	//   78  172:aload           4
		JVM INSTR monitorexit ;
	//   79  174:monitorexit     
		return;
	//   80  175:return          
		mCompiledQueries.put(((Object) (s)), ((Object) (sqlitecompiledsql)));
	//   81  176:aload_0         
	//   82  177:getfield        #184 <Field Map mCompiledQueries>
	//   83  180:aload_1         
	//   84  181:aload_2         
	//   85  182:invokeinterface #676 <Method Object Map.put(Object, Object)>
	//   86  187:pop             
		if(SQLiteDebug.DEBUG_SQL_CACHE)
	//*  87  188:getstatic       #732 <Field boolean SQLiteDebug.DEBUG_SQL_CACHE>
	//*  88  191:ifeq            172
			Log.v("Database", (new StringBuilder()).append("|adding_sql_to_cache|").append(getPath()).append("|").append(mCompiledQueries.size()).append("|").append(s).toString());
	//   89  194:ldc1            #69  <String "Database">
	//   90  196:new             #258 <Class StringBuilder>
	//   91  199:dup             
	//   92  200:invokespecial   #259 <Method void StringBuilder()>
	//   93  203:ldc2            #833 <String "|adding_sql_to_cache|">
	//   94  206:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   95  209:aload_0         
	//   96  210:invokevirtual   #442 <Method String getPath()>
	//   97  213:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   98  216:ldc2            #811 <String "|">
	//   99  219:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  100  222:aload_0         
	//  101  223:getfield        #184 <Field Map mCompiledQueries>
	//  102  226:invokeinterface #818 <Method int Map.size()>
	//  103  231:invokevirtual   #275 <Method StringBuilder StringBuilder.append(int)>
	//  104  234:ldc2            #811 <String "|">
	//  105  237:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  106  240:aload_1         
	//  107  241:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  108  244:invokevirtual   #281 <Method String StringBuilder.toString()>
	//  109  247:invokestatic    #814 <Method int Log.v(String, String)>
	//  110  250:pop             
		if(true) goto _L2; else goto _L1
	//  111  251:goto            172
_L1:
	}

	public void beginTransaction()
	{
		beginTransactionWithListener(((SQLiteTransactionListener) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #800 <Method void beginTransactionWithListener(SQLiteTransactionListener)>
	//    3    5:return          
	}

	public void beginTransactionWithListener(SQLiteTransactionListener sqlitetransactionlistener)
	{
		lockForced();
	//    0    0:aload_0         
	//    1    1:invokespecial   #836 <Method void lockForced()>
		if(!isOpen())
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #403 <Method boolean isOpen()>
	//*   4    8:ifne            22
			throw new IllegalStateException("database not open");
	//    5   11:new             #381 <Class IllegalStateException>
	//    6   14:dup             
	//    7   15:ldc2            #838 <String "database not open">
	//    8   18:invokespecial   #384 <Method void IllegalStateException(String)>
	//    9   21:athrow          
		if(mLock.getHoldCount() > 1)
	//*  10   22:aload_0         
	//*  11   23:getfield        #160 <Field ReentrantLock mLock>
	//*  12   26:invokevirtual   #652 <Method int ReentrantLock.getHoldCount()>
	//*  13   29:iconst_1        
	//*  14   30:icmple          83
		{
			if(mInnerTransactionIsSuccessful)
	//*  15   33:aload_0         
	//*  16   34:getfield        #840 <Field boolean mInnerTransactionIsSuccessful>
	//*  17   37:ifeq            74
			{
				sqlitetransactionlistener = ((SQLiteTransactionListener) (new IllegalStateException("Cannot call beginTransaction between calling setTransactionSuccessful and endTransaction")));
	//   18   40:new             #381 <Class IllegalStateException>
	//   19   43:dup             
	//   20   44:ldc2            #842 <String "Cannot call beginTransaction between calling setTransactionSuccessful and endTransaction">
	//   21   47:invokespecial   #384 <Method void IllegalStateException(String)>
	//   22   50:astore_1        
				Log.e("Database", "beginTransaction() failed", ((Throwable) (sqlitetransactionlistener)));
	//   23   51:ldc1            #69  <String "Database">
	//   24   53:ldc2            #844 <String "beginTransaction() failed">
	//   25   56:aload_1         
	//   26   57:invokestatic    #597 <Method int Log.e(String, String, Throwable)>
	//   27   60:pop             
				throw sqlitetransactionlistener;
	//   28   61:aload_1         
	//   29   62:athrow          
			}
			break MISSING_BLOCK_LABEL_74;
		}
		  goto _L1
		sqlitetransactionlistener;
	//   30   63:astore_1        
		if(true)
	//*  31   64:iconst_0        
	//*  32   65:ifne            72
			unlockForced();
	//   33   68:aload_0         
	//   34   69:invokespecial   #846 <Method void unlockForced()>
		throw sqlitetransactionlistener;
	//   35   72:aload_1         
	//   36   73:athrow          
		if(false)
	//*  37   74:iconst_1        
	//*  38   75:ifne            82
			unlockForced();
	//   39   78:aload_0         
	//   40   79:invokespecial   #846 <Method void unlockForced()>
_L3:
		return;
	//   41   82:return          
_L1:
		execSQL("BEGIN EXCLUSIVE;");
	//   42   83:aload_0         
	//   43   84:ldc2            #848 <String "BEGIN EXCLUSIVE;">
	//   44   87:invokevirtual   #851 <Method void execSQL(String)>
		mTransactionListener = sqlitetransactionlistener;
	//   45   90:aload_0         
	//   46   91:aload_1         
	//   47   92:putfield        #780 <Field SQLiteTransactionListener mTransactionListener>
		mTransactionIsSuccessful = true;
	//   48   95:aload_0         
	//   49   96:iconst_1        
	//   50   97:putfield        #853 <Field boolean mTransactionIsSuccessful>
		mInnerTransactionIsSuccessful = false;
	//   51  100:aload_0         
	//   52  101:iconst_0        
	//   53  102:putfield        #840 <Field boolean mInnerTransactionIsSuccessful>
		if(sqlitetransactionlistener == null)
			continue; /* Loop/switch isn't completed */
	//   54  105:aload_1         
	//   55  106:ifnull          115
		sqlitetransactionlistener.onBegin();
	//   56  109:aload_1         
	//   57  110:invokeinterface #858 <Method void SQLiteTransactionListener.onBegin()>
		if(true) goto _L3; else goto _L2
	//   58  115:iconst_1        
	//   59  116:ifne            82
_L2:
		unlockForced();
	//   60  119:aload_0         
	//   61  120:invokespecial   #846 <Method void unlockForced()>
		return;
	//   62  123:return          
		sqlitetransactionlistener;
	//   63  124:astore_1        
		execSQL("ROLLBACK;");
	//   64  125:aload_0         
	//   65  126:ldc2            #860 <String "ROLLBACK;">
	//   66  129:invokevirtual   #851 <Method void execSQL(String)>
		throw sqlitetransactionlistener;
	//   67  132:aload_1         
	//   68  133:athrow          
	}

	public void changePassword(String s)
		throws SQLiteException
	{
		if(!isOpen())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #403 <Method boolean isOpen()>
	//*   2    4:ifne            18
		{
			throw new SQLiteException("database not open");
	//    3    7:new             #863 <Class SQLiteException>
	//    4   10:dup             
	//    5   11:ldc2            #838 <String "database not open">
	//    6   14:invokespecial   #864 <Method void SQLiteException(String)>
	//    7   17:athrow          
		} else
		{
			native_rekey(s);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokespecial   #866 <Method void native_rekey(String)>
			return;
	//   11   23:return          
		}
	}

	public void changePassword(char ac[])
		throws SQLiteException
	{
		if(!isOpen())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #403 <Method boolean isOpen()>
	//*   2    4:ifne            18
		{
			throw new SQLiteException("database not open");
	//    3    7:new             #863 <Class SQLiteException>
	//    4   10:dup             
	//    5   11:ldc2            #838 <String "database not open">
	//    6   14:invokespecial   #864 <Method void SQLiteException(String)>
	//    7   17:athrow          
		} else
		{
			native_rekey(ac);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokespecial   #869 <Method void native_rekey(char[])>
			return;
	//   11   23:return          
		}
	}

	public void close()
	{
		if(!isOpen())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #403 <Method boolean isOpen()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		lock();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #655 <Method void lock()>
		closeClosable();
	//    6   12:aload_0         
	//    7   13:invokespecial   #871 <Method void closeClosable()>
		onAllReferencesReleased();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #874 <Method void onAllReferencesReleased()>
		unlock();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #669 <Method void unlock()>
		return;
	//   12   24:return          
		Exception exception;
		exception;
	//   13   25:astore_1        
		unlock();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #669 <Method void unlock()>
		throw exception;
	//   16   30:aload_1         
	//   17   31:athrow          
	}

	public SQLiteStatement compileStatement(String s)
		throws SQLException
	{
		lock();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #655 <Method void lock()>
		if(!isOpen())
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #403 <Method boolean isOpen()>
	//*   4    8:ifne            22
			throw new IllegalStateException("database not open");
	//    5   11:new             #381 <Class IllegalStateException>
	//    6   14:dup             
	//    7   15:ldc2            #838 <String "database not open">
	//    8   18:invokespecial   #384 <Method void IllegalStateException(String)>
	//    9   21:athrow          
		s = ((String) (new SQLiteStatement(this, s)));
	//   10   22:new             #505 <Class SQLiteStatement>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokespecial   #510 <Method void SQLiteStatement(SQLiteDatabase, String)>
	//   15   31:astore_1        
		unlock();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #669 <Method void unlock()>
		return ((SQLiteStatement) (s));
	//   18   36:aload_1         
	//   19   37:areturn         
		s;
	//   20   38:astore_1        
		unlock();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #669 <Method void unlock()>
		throw s;
	//   23   43:aload_1         
	//   24   44:athrow          
	}

	public int delete(String s, String s1, String as[])
	{
		String s2;
		String s3;
		Object obj;
		Object obj1;
		lock();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #655 <Method void lock()>
		if(!isOpen())
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #403 <Method boolean isOpen()>
	//*   4    8:ifne            22
			throw new IllegalStateException("database not open");
	//    5   11:new             #381 <Class IllegalStateException>
	//    6   14:dup             
	//    7   15:ldc2            #838 <String "database not open">
	//    8   18:invokespecial   #384 <Method void IllegalStateException(String)>
	//    9   21:athrow          
		obj1 = null;
	//   10   22:aconst_null     
	//   11   23:astore          9
		obj = null;
	//   12   25:aconst_null     
	//   13   26:astore          8
		s3 = ((String) (obj));
	//   14   28:aload           8
	//   15   30:astore          7
		s2 = ((String) (obj1));
	//   16   32:aload           9
	//   17   34:astore          6
		StringBuilder stringbuilder = (new StringBuilder()).append("DELETE FROM ").append(s);
	//   18   36:new             #258 <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #259 <Method void StringBuilder()>
	//   21   43:ldc2            #879 <String "DELETE FROM ">
	//   22   46:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   23   49:aload_1         
	//   24   50:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   25   53:astore          10
		s3 = ((String) (obj));
	//   26   55:aload           8
	//   27   57:astore          7
		s2 = ((String) (obj1));
	//   28   59:aload           9
	//   29   61:astore          6
		if(TextUtils.isEmpty(((CharSequence) (s1)))) goto _L2; else goto _L1
	//   30   63:aload_2         
	//   31   64:invokestatic    #371 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   32   67:ifne            241
_L1:
		s3 = ((String) (obj));
	//   33   70:aload           8
	//   34   72:astore          7
		s2 = ((String) (obj1));
	//   35   74:aload           9
	//   36   76:astore          6
		s = (new StringBuilder()).append(" WHERE ").append(s1).toString();
	//   37   78:new             #258 <Class StringBuilder>
	//   38   81:dup             
	//   39   82:invokespecial   #259 <Method void StringBuilder()>
	//   40   85:ldc2            #881 <String " WHERE ">
	//   41   88:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   42   91:aload_2         
	//   43   92:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   44   95:invokevirtual   #281 <Method String StringBuilder.toString()>
	//   45   98:astore_1        
_L7:
		s3 = ((String) (obj));
	//   46   99:aload           8
	//   47  101:astore          7
		s2 = ((String) (obj1));
	//   48  103:aload           9
	//   49  105:astore          6
		s = ((String) (compileStatement(stringbuilder.append(s).toString())));
	//   50  107:aload_0         
	//   51  108:aload           10
	//   52  110:aload_1         
	//   53  111:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   54  114:invokevirtual   #281 <Method String StringBuilder.toString()>
	//   55  117:invokevirtual   #883 <Method SQLiteStatement compileStatement(String)>
	//   56  120:astore_1        
		if(as == null) goto _L4; else goto _L3
	//   57  121:aload_3         
	//   58  122:ifnull          172
_L3:
		s3 = s;
	//   59  125:aload_1         
	//   60  126:astore          7
		s2 = s;
	//   61  128:aload_1         
	//   62  129:astore          6
		int j = as.length;
	//   63  131:aload_3         
	//   64  132:arraylength     
	//   65  133:istore          5
		int i = 0;
	//   66  135:iconst_0        
	//   67  136:istore          4
_L5:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   68  138:iload           4
	//   69  140:iload           5
	//   70  142:icmpge          172
		s3 = s;
	//   71  145:aload_1         
	//   72  146:astore          7
		s2 = s;
	//   73  148:aload_1         
	//   74  149:astore          6
		DatabaseUtils.bindObjectToProgram(((SQLiteProgram) (s)), i + 1, ((Object) (as[i])));
	//   75  151:aload_1         
	//   76  152:iload           4
	//   77  154:iconst_1        
	//   78  155:iadd            
	//   79  156:aload_3         
	//   80  157:iload           4
	//   81  159:aaload          
	//   82  160:invokestatic    #889 <Method void DatabaseUtils.bindObjectToProgram(SQLiteProgram, int, Object)>
		i++;
	//   83  163:iload           4
	//   84  165:iconst_1        
	//   85  166:iadd            
	//   86  167:istore          4
		if(true) goto _L5; else goto _L4
	//   87  169:goto            138
_L4:
		s3 = s;
	//   88  172:aload_1         
	//   89  173:astore          7
		s2 = s;
	//   90  175:aload_1         
	//   91  176:astore          6
		((SQLiteStatement) (s)).execute();
	//   92  178:aload_1         
	//   93  179:invokevirtual   #892 <Method void SQLiteStatement.execute()>
		s3 = s;
	//   94  182:aload_1         
	//   95  183:astore          7
		s2 = s;
	//   96  185:aload_1         
	//   97  186:astore          6
		i = lastChangeCount();
	//   98  188:aload_0         
	//   99  189:invokevirtual   #895 <Method int lastChangeCount()>
	//  100  192:istore          4
		if(s != null)
	//* 101  194:aload_1         
	//* 102  195:ifnull          202
			((SQLiteStatement) (s)).close();
	//  103  198:aload_1         
	//  104  199:invokevirtual   #514 <Method void SQLiteStatement.close()>
		unlock();
	//  105  202:aload_0         
	//  106  203:invokevirtual   #669 <Method void unlock()>
		return i;
	//  107  206:iload           4
	//  108  208:ireturn         
		s;
	//  109  209:astore_1        
		s2 = s3;
	//  110  210:aload           7
	//  111  212:astore          6
		onCorruption();
	//  112  214:aload_0         
	//  113  215:invokevirtual   #897 <Method void onCorruption()>
		s2 = s3;
	//  114  218:aload           7
	//  115  220:astore          6
		throw s;
	//  116  222:aload_1         
	//  117  223:athrow          
		s;
	//  118  224:astore_1        
		if(s2 != null)
	//* 119  225:aload           6
	//* 120  227:ifnull          235
			((SQLiteStatement) (s2)).close();
	//  121  230:aload           6
	//  122  232:invokevirtual   #514 <Method void SQLiteStatement.close()>
		unlock();
	//  123  235:aload_0         
	//  124  236:invokevirtual   #669 <Method void unlock()>
		throw s;
	//  125  239:aload_1         
	//  126  240:athrow          
_L2:
		s = "";
	//  127  241:ldc1            #126 <String "">
	//  128  243:astore_1        
		if(true) goto _L7; else goto _L6
	//  129  244:goto            99
_L6:
	}

	public void endTransaction()
	{
		if(!isOpen())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #403 <Method boolean isOpen()>
	//*   2    4:ifne            18
			throw new IllegalStateException("database not open");
	//    3    7:new             #381 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #838 <String "database not open">
	//    6   14:invokespecial   #384 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(!mLock.isHeldByCurrentThread())
	//*   8   18:aload_0         
	//*   9   19:getfield        #160 <Field ReentrantLock mLock>
	//*  10   22:invokevirtual   #900 <Method boolean ReentrantLock.isHeldByCurrentThread()>
	//*  11   25:ifne            39
			throw new IllegalStateException("no transaction pending");
	//   12   28:new             #381 <Class IllegalStateException>
	//   13   31:dup             
	//   14   32:ldc2            #902 <String "no transaction pending">
	//   15   35:invokespecial   #384 <Method void IllegalStateException(String)>
	//   16   38:athrow          
		if(!mInnerTransactionIsSuccessful)
			break MISSING_BLOCK_LABEL_74;
	//   17   39:aload_0         
	//   18   40:getfield        #840 <Field boolean mInnerTransactionIsSuccessful>
	//   19   43:ifeq            74
		mInnerTransactionIsSuccessful = false;
	//   20   46:aload_0         
	//   21   47:iconst_0        
	//   22   48:putfield        #840 <Field boolean mInnerTransactionIsSuccessful>
_L1:
		int i = mLock.getHoldCount();
	//   23   51:aload_0         
	//   24   52:getfield        #160 <Field ReentrantLock mLock>
	//   25   55:invokevirtual   #652 <Method int ReentrantLock.getHoldCount()>
	//   26   58:istore_1        
		if(i != 1)
	//*  27   59:iload_1         
	//*  28   60:iconst_1        
	//*  29   61:icmpeq          94
		{
			mTransactionListener = null;
	//   30   64:aload_0         
	//   31   65:aconst_null     
	//   32   66:putfield        #780 <Field SQLiteTransactionListener mTransactionListener>
			unlockForced();
	//   33   69:aload_0         
	//   34   70:invokespecial   #846 <Method void unlockForced()>
			return;
	//   35   73:return          
		}
		break MISSING_BLOCK_LABEL_94;
		mTransactionIsSuccessful = false;
	//   36   74:aload_0         
	//   37   75:iconst_0        
	//   38   76:putfield        #853 <Field boolean mTransactionIsSuccessful>
		  goto _L1
	//*  39   79:goto            51
		Exception exception;
		exception;
	//   40   82:astore_2        
		mTransactionListener = null;
	//   41   83:aload_0         
	//   42   84:aconst_null     
	//   43   85:putfield        #780 <Field SQLiteTransactionListener mTransactionListener>
		unlockForced();
	//   44   88:aload_0         
	//   45   89:invokespecial   #846 <Method void unlockForced()>
		throw exception;
	//   46   92:aload_2         
	//   47   93:athrow          
		Object obj = null;
	//   48   94:aconst_null     
	//   49   95:astore_3        
		SQLiteTransactionListener sqlitetransactionlistener = mTransactionListener;
	//   50   96:aload_0         
	//   51   97:getfield        #780 <Field SQLiteTransactionListener mTransactionListener>
	//   52  100:astore          4
		RuntimeException runtimeexception = ((RuntimeException) (obj));
	//   53  102:aload_3         
	//   54  103:astore_2        
		if(sqlitetransactionlistener == null) goto _L3; else goto _L2
	//   55  104:aload           4
	//   56  106:ifnull          127
_L2:
		if(!mTransactionIsSuccessful) goto _L5; else goto _L4
	//   57  109:aload_0         
	//   58  110:getfield        #853 <Field boolean mTransactionIsSuccessful>
	//   59  113:ifeq            150
_L4:
		mTransactionListener.onCommit();
	//   60  116:aload_0         
	//   61  117:getfield        #780 <Field SQLiteTransactionListener mTransactionListener>
	//   62  120:invokeinterface #905 <Method void SQLiteTransactionListener.onCommit()>
		runtimeexception = ((RuntimeException) (obj));
	//   63  125:aload_3         
	//   64  126:astore_2        
_L3:
		if(!mTransactionIsSuccessful) goto _L7; else goto _L6
	//   65  127:aload_0         
	//   66  128:getfield        #853 <Field boolean mTransactionIsSuccessful>
	//   67  131:ifeq            173
_L6:
		execSQL("COMMIT;");
	//   68  134:aload_0         
	//   69  135:ldc1            #12  <String "COMMIT;">
	//   70  137:invokevirtual   #851 <Method void execSQL(String)>
_L9:
		mTransactionListener = null;
	//   71  140:aload_0         
	//   72  141:aconst_null     
	//   73  142:putfield        #780 <Field SQLiteTransactionListener mTransactionListener>
		unlockForced();
	//   74  145:aload_0         
	//   75  146:invokespecial   #846 <Method void unlockForced()>
		return;
	//   76  149:return          
_L5:
		mTransactionListener.onRollback();
	//   77  150:aload_0         
	//   78  151:getfield        #780 <Field SQLiteTransactionListener mTransactionListener>
	//   79  154:invokeinterface #908 <Method void SQLiteTransactionListener.onRollback()>
		runtimeexception = ((RuntimeException) (obj));
	//   80  159:aload_3         
	//   81  160:astore_2        
		  goto _L3
	//*  82  161:goto            127
		runtimeexception;
	//   83  164:astore_2        
		mTransactionIsSuccessful = false;
	//   84  165:aload_0         
	//   85  166:iconst_0        
	//   86  167:putfield        #853 <Field boolean mTransactionIsSuccessful>
		  goto _L3
	//*  87  170:goto            127
_L7:
		execSQL("ROLLBACK;");
	//   88  173:aload_0         
	//   89  174:ldc2            #860 <String "ROLLBACK;">
	//   90  177:invokevirtual   #851 <Method void execSQL(String)>
		if(runtimeexception == null) goto _L9; else goto _L8
	//   91  180:aload_2         
	//   92  181:ifnull          140
_L8:
		try
		{
			throw runtimeexception;
	//   93  184:aload_2         
	//   94  185:athrow          
		}
		catch(SQLException sqlexception) { }
	//   95  186:astore_2        
		Log.d("Database", "exception during rollback, maybe the DB previously performed an auto-rollback");
	//   96  187:ldc1            #69  <String "Database">
	//   97  189:ldc2            #910 <String "exception during rollback, maybe the DB previously performed an auto-rollback">
	//   98  192:invokestatic    #296 <Method int Log.d(String, String)>
	//   99  195:pop             
		  goto _L9
	//* 100  196:goto            140
	}

	public void execSQL(String s)
		throws SQLException
	{
		long l;
		l = SystemClock.uptimeMillis();
	//    0    0:invokestatic    #913 <Method long SystemClock.uptimeMillis()>
	//    1    3:lstore_2        
		lock();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #655 <Method void lock()>
		if(!isOpen())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #403 <Method boolean isOpen()>
	//*   6   12:ifne            26
			throw new IllegalStateException("database not open");
	//    7   15:new             #381 <Class IllegalStateException>
	//    8   18:dup             
	//    9   19:ldc2            #838 <String "database not open">
	//   10   22:invokespecial   #384 <Method void IllegalStateException(String)>
	//   11   25:athrow          
		logTimeStat(mLastSqlStatement, l, "GETLOCK:");
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #173 <Field String mLastSqlStatement>
	//   15   31:lload_2         
	//   16   32:ldc1            #38  <String "GETLOCK:">
	//   17   34:invokevirtual   #917 <Method void logTimeStat(String, long, String)>
		native_execSQL(s);
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:invokevirtual   #662 <Method void native_execSQL(String)>
		unlock();
	//   21   42:aload_0         
	//   22   43:invokevirtual   #669 <Method void unlock()>
		if(s == "COMMIT;")
	//*  23   46:aload_1         
	//*  24   47:ldc1            #12  <String "COMMIT;">
	//*  25   49:if_acmpne       78
		{
			logTimeStat(mLastSqlStatement, l, "COMMIT;");
	//   26   52:aload_0         
	//   27   53:aload_0         
	//   28   54:getfield        #173 <Field String mLastSqlStatement>
	//   29   57:lload_2         
	//   30   58:ldc1            #12  <String "COMMIT;">
	//   31   60:invokevirtual   #917 <Method void logTimeStat(String, long, String)>
			return;
	//   32   63:return          
		} else
	//*  33   64:astore_1        
	//*  34   65:aload_0         
	//*  35   66:invokevirtual   #897 <Method void onCorruption()>
	//*  36   69:aload_1         
	//*  37   70:athrow          
	//*  38   71:astore_1        
	//*  39   72:aload_0         
	//*  40   73:invokevirtual   #669 <Method void unlock()>
	//*  41   76:aload_1         
	//*  42   77:athrow          
		{
			logTimeStat(s, l, ((String) (null)));
	//   43   78:aload_0         
	//   44   79:aload_1         
	//   45   80:lload_2         
	//   46   81:aconst_null     
	//   47   82:invokevirtual   #917 <Method void logTimeStat(String, long, String)>
			return;
	//   48   85:return          
		}
		s;
		onCorruption();
		throw s;
		s;
		unlock();
		throw s;
	}

	public void execSQL(String s, Object aobj[])
		throws SQLException
	{
		long l;
		SQLiteStatement sqlitestatement;
		SQLiteStatement sqlitestatement1;
		if(aobj == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("Empty bindArgs");
	//    2    4:new             #198 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #920 <String "Empty bindArgs">
	//    5   11:invokespecial   #203 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		l = SystemClock.uptimeMillis();
	//    7   15:invokestatic    #913 <Method long SystemClock.uptimeMillis()>
	//    8   18:lstore          5
		lock();
	//    9   20:aload_0         
	//   10   21:invokevirtual   #655 <Method void lock()>
		if(!isOpen())
	//*  11   24:aload_0         
	//*  12   25:invokevirtual   #403 <Method boolean isOpen()>
	//*  13   28:ifne            42
			throw new IllegalStateException("database not open");
	//   14   31:new             #381 <Class IllegalStateException>
	//   15   34:dup             
	//   16   35:ldc2            #838 <String "database not open">
	//   17   38:invokespecial   #384 <Method void IllegalStateException(String)>
	//   18   41:athrow          
		sqlitestatement1 = null;
	//   19   42:aconst_null     
	//   20   43:astore          8
		sqlitestatement = null;
	//   21   45:aconst_null     
	//   22   46:astore          7
		SQLiteStatement sqlitestatement2 = compileStatement(s);
	//   23   48:aload_0         
	//   24   49:aload_1         
	//   25   50:invokevirtual   #883 <Method SQLiteStatement compileStatement(String)>
	//   26   53:astore          9
		if(aobj == null) goto _L2; else goto _L1
	//   27   55:aload_2         
	//   28   56:ifnull          105
_L1:
		sqlitestatement = sqlitestatement2;
	//   29   59:aload           9
	//   30   61:astore          7
		sqlitestatement1 = sqlitestatement2;
	//   31   63:aload           9
	//   32   65:astore          8
		int j = aobj.length;
	//   33   67:aload_2         
	//   34   68:arraylength     
	//   35   69:istore          4
		int i = 0;
	//   36   71:iconst_0        
	//   37   72:istore_3        
_L3:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   38   73:iload_3         
	//   39   74:iload           4
	//   40   76:icmpge          105
		sqlitestatement = sqlitestatement2;
	//   41   79:aload           9
	//   42   81:astore          7
		sqlitestatement1 = sqlitestatement2;
	//   43   83:aload           9
	//   44   85:astore          8
		DatabaseUtils.bindObjectToProgram(((SQLiteProgram) (sqlitestatement2)), i + 1, aobj[i]);
	//   45   87:aload           9
	//   46   89:iload_3         
	//   47   90:iconst_1        
	//   48   91:iadd            
	//   49   92:aload_2         
	//   50   93:iload_3         
	//   51   94:aaload          
	//   52   95:invokestatic    #889 <Method void DatabaseUtils.bindObjectToProgram(SQLiteProgram, int, Object)>
		i++;
	//   53   98:iload_3         
	//   54   99:iconst_1        
	//   55  100:iadd            
	//   56  101:istore_3        
		if(true) goto _L3; else goto _L2
	//   57  102:goto            73
_L2:
		sqlitestatement = sqlitestatement2;
	//   58  105:aload           9
	//   59  107:astore          7
		sqlitestatement1 = sqlitestatement2;
	//   60  109:aload           9
	//   61  111:astore          8
		sqlitestatement2.execute();
	//   62  113:aload           9
	//   63  115:invokevirtual   #892 <Method void SQLiteStatement.execute()>
		if(sqlitestatement2 != null)
	//*  64  118:aload           9
	//*  65  120:ifnull          128
			sqlitestatement2.close();
	//   66  123:aload           9
	//   67  125:invokevirtual   #514 <Method void SQLiteStatement.close()>
		unlock();
	//   68  128:aload_0         
	//   69  129:invokevirtual   #669 <Method void unlock()>
		logTimeStat(s, l);
	//   70  132:aload_0         
	//   71  133:aload_1         
	//   72  134:lload           5
	//   73  136:invokevirtual   #923 <Method void logTimeStat(String, long)>
		return;
	//   74  139:return          
		s;
	//   75  140:astore_1        
		sqlitestatement1 = sqlitestatement;
	//   76  141:aload           7
	//   77  143:astore          8
		onCorruption();
	//   78  145:aload_0         
	//   79  146:invokevirtual   #897 <Method void onCorruption()>
		sqlitestatement1 = sqlitestatement;
	//   80  149:aload           7
	//   81  151:astore          8
		throw s;
	//   82  153:aload_1         
	//   83  154:athrow          
		s;
	//   84  155:astore_1        
		if(sqlitestatement1 != null)
	//*  85  156:aload           8
	//*  86  158:ifnull          166
			sqlitestatement1.close();
	//   87  161:aload           8
	//   88  163:invokevirtual   #514 <Method void SQLiteStatement.close()>
		unlock();
	//   89  166:aload_0         
	//   90  167:invokevirtual   #669 <Method void unlock()>
		throw s;
	//   91  170:aload_1         
	//   92  171:athrow          
	}

	protected void finalize()
	{
		if(isOpen())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #403 <Method boolean isOpen()>
	//*   2    4:ifeq            54
		{
			Log.e("Database", (new StringBuilder()).append("close() was never explicitly called on database '").append(mPath).append("' ").toString(), mStackTrace);
	//    3    7:ldc1            #69  <String "Database">
	//    4    9:new             #258 <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #259 <Method void StringBuilder()>
	//    7   16:ldc2            #926 <String "close() was never explicitly called on database '">
	//    8   19:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:aload_0         
	//   10   23:getfield        #207 <Field String mPath>
	//   11   26:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   12   29:ldc2            #928 <String "' ">
	//   13   32:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   14   35:invokevirtual   #281 <Method String StringBuilder.toString()>
	//   15   38:aload_0         
	//   16   39:getfield        #192 <Field Throwable mStackTrace>
	//   17   42:invokestatic    #597 <Method int Log.e(String, String, Throwable)>
	//   18   45:pop             
			closeClosable();
	//   19   46:aload_0         
	//   20   47:invokespecial   #871 <Method void closeClosable()>
			onAllReferencesReleased();
	//   21   50:aload_0         
	//   22   51:invokevirtual   #874 <Method void onAllReferencesReleased()>
		}
	//   23   54:return          
	}

	SQLiteCompiledSql getCompiledStatementForSql(String s)
	{
label0:
		{
			synchronized(mCompiledQueries)
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field Map mCompiledQueries>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
			{
				if(mMaxSqlCacheSize != 0)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #186 <Field int mMaxSqlCacheSize>
	//    7   11:ifne            53
				if(SQLiteDebug.DEBUG_SQL_CACHE)
	//*   8   14:getstatic       #732 <Field boolean SQLiteDebug.DEBUG_SQL_CACHE>
	//*   9   17:ifeq            49
					Log.v("Database", (new StringBuilder()).append("|cache NOT found|").append(getPath()).toString());
	//   10   20:ldc1            #69  <String "Database">
	//   11   22:new             #258 <Class StringBuilder>
	//   12   25:dup             
	//   13   26:invokespecial   #259 <Method void StringBuilder()>
	//   14   29:ldc2            #932 <String "|cache NOT found|">
	//   15   32:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   16   35:aload_0         
	//   17   36:invokevirtual   #442 <Method String getPath()>
	//   18   39:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   19   42:invokevirtual   #281 <Method String StringBuilder.toString()>
	//   20   45:invokestatic    #814 <Method int Log.v(String, String)>
	//   21   48:pop             
			}
	//   22   49:aload_3         
	//   23   50:monitorexit     
			return null;
	//   24   51:aconst_null     
	//   25   52:areturn         
		}
		SQLiteCompiledSql sqlitecompiledsql = (SQLiteCompiledSql)mCompiledQueries.get(((Object) (s)));
	//   26   53:aload_0         
	//   27   54:getfield        #184 <Field Map mCompiledQueries>
	//   28   57:aload_1         
	//   29   58:invokeinterface #817 <Method Object Map.get(Object)>
	//   30   63:checkcast       #355 <Class SQLiteCompiledSql>
	//   31   66:astore          4
		boolean flag;
		if(sqlitecompiledsql != null)
	//*  32   68:aload           4
	//*  33   70:ifnull          219
			flag = true;
	//   34   73:iconst_1        
	//   35   74:istore_2        
		else
	//*  36   75:aload_3         
	//*  37   76:monitorexit     
	//*  38   77:iload_2         
	//*  39   78:ifeq            229
	//*  40   81:aload_0         
	//*  41   82:aload_0         
	//*  42   83:getfield        #934 <Field int mNumCacheHits>
	//*  43   86:iconst_1        
	//*  44   87:iadd            
	//*  45   88:putfield        #934 <Field int mNumCacheHits>
	//*  46   91:getstatic       #732 <Field boolean SQLiteDebug.DEBUG_SQL_CACHE>
	//*  47   94:ifeq            216
	//*  48   97:ldc1            #69  <String "Database">
	//*  49   99:new             #258 <Class StringBuilder>
	//*  50  102:dup             
	//*  51  103:invokespecial   #259 <Method void StringBuilder()>
	//*  52  106:ldc2            #936 <String "|cache_stats|">
	//*  53  109:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//*  54  112:aload_0         
	//*  55  113:invokevirtual   #442 <Method String getPath()>
	//*  56  116:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//*  57  119:ldc2            #811 <String "|">
	//*  58  122:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//*  59  125:aload_0         
	//*  60  126:getfield        #184 <Field Map mCompiledQueries>
	//*  61  129:invokeinterface #818 <Method int Map.size()>
	//*  62  134:invokevirtual   #275 <Method StringBuilder StringBuilder.append(int)>
	//*  63  137:ldc2            #811 <String "|">
	//*  64  140:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//*  65  143:aload_0         
	//*  66  144:getfield        #934 <Field int mNumCacheHits>
	//*  67  147:invokevirtual   #275 <Method StringBuilder StringBuilder.append(int)>
	//*  68  150:ldc2            #811 <String "|">
	//*  69  153:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//*  70  156:aload_0         
	//*  71  157:getfield        #938 <Field int mNumCacheMisses>
	//*  72  160:invokevirtual   #275 <Method StringBuilder StringBuilder.append(int)>
	//*  73  163:ldc2            #811 <String "|">
	//*  74  166:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//*  75  169:iload_2         
	//*  76  170:invokevirtual   #941 <Method StringBuilder StringBuilder.append(boolean)>
	//*  77  173:ldc2            #811 <String "|">
	//*  78  176:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//*  79  179:aload_0         
	//*  80  180:getfield        #188 <Field String mTimeOpened>
	//*  81  183:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//*  82  186:ldc2            #811 <String "|">
	//*  83  189:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//*  84  192:aload_0         
	//*  85  193:getfield        #190 <Field String mTimeClosed>
	//*  86  196:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//*  87  199:ldc2            #811 <String "|">
	//*  88  202:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//*  89  205:aload_1         
	//*  90  206:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//*  91  209:invokevirtual   #281 <Method String StringBuilder.toString()>
	//*  92  212:invokestatic    #814 <Method int Log.v(String, String)>
	//*  93  215:pop             
	//*  94  216:aload           4
	//*  95  218:areturn         
			flag = false;
	//   96  219:iconst_0        
	//   97  220:istore_2        
		map;
		JVM INSTR monitorexit ;
		if(flag)
			mNumCacheHits = mNumCacheHits + 1;
		else
	//*  98  221:goto            75
	//*  99  224:astore_1        
	//* 100  225:aload_3         
	//* 101  226:monitorexit     
	//* 102  227:aload_1         
	//* 103  228:athrow          
			mNumCacheMisses = mNumCacheMisses + 1;
	//  104  229:aload_0         
	//  105  230:aload_0         
	//  106  231:getfield        #938 <Field int mNumCacheMisses>
	//  107  234:iconst_1        
	//  108  235:iadd            
	//  109  236:putfield        #938 <Field int mNumCacheMisses>
		if(SQLiteDebug.DEBUG_SQL_CACHE)
			Log.v("Database", (new StringBuilder()).append("|cache_stats|").append(getPath()).append("|").append(mCompiledQueries.size()).append("|").append(mNumCacheHits).append("|").append(mNumCacheMisses).append("|").append(flag).append("|").append(mTimeOpened).append("|").append(mTimeClosed).append("|").append(s).toString());
		return sqlitecompiledsql;
		s;
		map;
		JVM INSTR monitorexit ;
		throw s;
	//* 110  239:goto            91
	}

	public int getMaxSqlCacheSize()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = mMaxSqlCacheSize;
	//    2    2:aload_0         
	//    3    3:getfield        #186 <Field int mMaxSqlCacheSize>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return i;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public long getMaximumSize()
	{
		SQLiteStatement sqlitestatement;
		sqlitestatement = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		lock();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #655 <Method void lock()>
		if(!isOpen())
	//*   4    7:aload_0         
	//*   5    8:invokevirtual   #403 <Method boolean isOpen()>
	//*   6   11:ifne            25
			throw new IllegalStateException("database not open");
	//    7   14:new             #381 <Class IllegalStateException>
	//    8   17:dup             
	//    9   18:ldc2            #838 <String "database not open">
	//   10   21:invokespecial   #384 <Method void IllegalStateException(String)>
	//   11   24:athrow          
		SQLiteStatement sqlitestatement1 = new SQLiteStatement(this, "PRAGMA max_page_count;");
	//   12   25:new             #505 <Class SQLiteStatement>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:ldc2            #945 <String "PRAGMA max_page_count;">
	//   16   33:invokespecial   #510 <Method void SQLiteStatement(SQLiteDatabase, String)>
	//   17   36:astore          7
		long l;
		long l1;
		l = sqlitestatement1.simpleQueryForLong();
	//   18   38:aload           7
	//   19   40:invokevirtual   #513 <Method long SQLiteStatement.simpleQueryForLong()>
	//   20   43:lstore_1        
		l1 = getPageSize();
	//   21   44:aload_0         
	//   22   45:invokevirtual   #474 <Method long getPageSize()>
	//   23   48:lstore_3        
		if(sqlitestatement1 != null)
	//*  24   49:aload           7
	//*  25   51:ifnull          59
			sqlitestatement1.close();
	//   26   54:aload           7
	//   27   56:invokevirtual   #514 <Method void SQLiteStatement.close()>
		unlock();
	//   28   59:aload_0         
	//   29   60:invokevirtual   #669 <Method void unlock()>
		return l1 * l;
	//   30   63:lload_3         
	//   31   64:lload_1         
	//   32   65:lmul            
	//   33   66:lreturn         
		Exception exception;
		exception;
	//   34   67:astore          6
_L2:
		if(sqlitestatement != null)
	//*  35   69:aload           5
	//*  36   71:ifnull          79
			sqlitestatement.close();
	//   37   74:aload           5
	//   38   76:invokevirtual   #514 <Method void SQLiteStatement.close()>
		unlock();
	//   39   79:aload_0         
	//   40   80:invokevirtual   #669 <Method void unlock()>
		throw exception;
	//   41   83:aload           6
	//   42   85:athrow          
		exception;
	//   43   86:astore          6
		sqlitestatement = sqlitestatement1;
	//   44   88:aload           7
	//   45   90:astore          5
		if(true) goto _L2; else goto _L1
	//   46   92:goto            69
_L1:
	}

	public long getPageSize()
	{
		SQLiteStatement sqlitestatement;
		sqlitestatement = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		lock();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #655 <Method void lock()>
		if(!isOpen())
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #403 <Method boolean isOpen()>
	//*   6   10:ifne            24
			throw new IllegalStateException("database not open");
	//    7   13:new             #381 <Class IllegalStateException>
	//    8   16:dup             
	//    9   17:ldc2            #838 <String "database not open">
	//   10   20:invokespecial   #384 <Method void IllegalStateException(String)>
	//   11   23:athrow          
		SQLiteStatement sqlitestatement1 = new SQLiteStatement(this, "PRAGMA page_size;");
	//   12   24:new             #505 <Class SQLiteStatement>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:ldc2            #947 <String "PRAGMA page_size;">
	//   16   32:invokespecial   #510 <Method void SQLiteStatement(SQLiteDatabase, String)>
	//   17   35:astore          5
		long l = sqlitestatement1.simpleQueryForLong();
	//   18   37:aload           5
	//   19   39:invokevirtual   #513 <Method long SQLiteStatement.simpleQueryForLong()>
	//   20   42:lstore_1        
		if(sqlitestatement1 != null)
	//*  21   43:aload           5
	//*  22   45:ifnull          53
			sqlitestatement1.close();
	//   23   48:aload           5
	//   24   50:invokevirtual   #514 <Method void SQLiteStatement.close()>
		unlock();
	//   25   53:aload_0         
	//   26   54:invokevirtual   #669 <Method void unlock()>
		return l;
	//   27   57:lload_1         
	//   28   58:lreturn         
		Exception exception;
		exception;
	//   29   59:astore          4
_L2:
		if(sqlitestatement != null)
	//*  30   61:aload_3         
	//*  31   62:ifnull          69
			sqlitestatement.close();
	//   32   65:aload_3         
	//   33   66:invokevirtual   #514 <Method void SQLiteStatement.close()>
		unlock();
	//   34   69:aload_0         
	//   35   70:invokevirtual   #669 <Method void unlock()>
		throw exception;
	//   36   73:aload           4
	//   37   75:athrow          
		exception;
	//   38   76:astore          4
		sqlitestatement = sqlitestatement1;
	//   39   78:aload           5
	//   40   80:astore_3        
		if(true) goto _L2; else goto _L1
	//   41   81:goto            61
_L1:
	}

	public final String getPath()
	{
		return mPath;
	//    0    0:aload_0         
	//    1    1:getfield        #207 <Field String mPath>
	//    2    4:areturn         
	}

	public Map getSyncedTables()
	{
		Map map = mSyncUpdateInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #196 <Field Map mSyncUpdateInfo>
	//    2    4:astore_1        
		map;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj;
		obj = ((Object) (new HashMap()));
	//    5    7:new             #181 <Class HashMap>
	//    6   10:dup             
	//    7   11:invokespecial   #182 <Method void HashMap()>
	//    8   14:astore_2        
		Iterator iterator = mSyncUpdateInfo.keySet().iterator();
	//    9   15:aload_0         
	//   10   16:getfield        #196 <Field Map mSyncUpdateInfo>
	//   11   19:invokeinterface #950 <Method Set Map.keySet()>
	//   12   24:invokeinterface #310 <Method Iterator Set.iterator()>
	//   13   29:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   14   30:aload_3         
	//   15   31:invokeinterface #316 <Method boolean Iterator.hasNext()>
	//   16   36:ifeq            94
			String s = (String)iterator.next();
	//   17   39:aload_3         
	//   18   40:invokeinterface #320 <Method Object Iterator.next()>
	//   19   45:checkcast       #124 <Class String>
	//   20   48:astore          4
			SyncUpdateInfo syncupdateinfo = (SyncUpdateInfo)mSyncUpdateInfo.get(((Object) (s)));
	//   21   50:aload_0         
	//   22   51:getfield        #196 <Field Map mSyncUpdateInfo>
	//   23   54:aload           4
	//   24   56:invokeinterface #817 <Method Object Map.get(Object)>
	//   25   61:checkcast       #8   <Class SQLiteDatabase$SyncUpdateInfo>
	//   26   64:astore          5
			if(syncupdateinfo.deletedTable != null)
	//*  27   66:aload           5
	//*  28   68:getfield        #953 <Field String SQLiteDatabase$SyncUpdateInfo.deletedTable>
	//*  29   71:ifnull          30
				((HashMap) (obj)).put(((Object) (s)), ((Object) (syncupdateinfo.deletedTable)));
	//   30   74:aload_2         
	//   31   75:aload           4
	//   32   77:aload           5
	//   33   79:getfield        #953 <Field String SQLiteDatabase$SyncUpdateInfo.deletedTable>
	//   34   82:invokevirtual   #954 <Method Object HashMap.put(Object, Object)>
	//   35   85:pop             
		} while(true);
	//   36   86:goto            30
		break MISSING_BLOCK_LABEL_94;
		obj;
	//   37   89:astore_2        
		map;
	//   38   90:aload_1         
		JVM INSTR monitorexit ;
	//   39   91:monitorexit     
		throw obj;
	//   40   92:aload_2         
	//   41   93:athrow          
		map;
	//   42   94:aload_1         
		JVM INSTR monitorexit ;
	//   43   95:monitorexit     
		return ((Map) (obj));
	//   44   96:aload_2         
	//   45   97:areturn         
	}

	public int getVersion()
	{
		SQLiteStatement sqlitestatement;
		sqlitestatement = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		lock();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #655 <Method void lock()>
		if(!isOpen())
	//*   4    7:aload_0         
	//*   5    8:invokevirtual   #403 <Method boolean isOpen()>
	//*   6   11:ifne            25
			throw new IllegalStateException("database not open");
	//    7   14:new             #381 <Class IllegalStateException>
	//    8   17:dup             
	//    9   18:ldc2            #838 <String "database not open">
	//   10   21:invokespecial   #384 <Method void IllegalStateException(String)>
	//   11   24:athrow          
		SQLiteStatement sqlitestatement1 = new SQLiteStatement(this, "PRAGMA user_version;");
	//   12   25:new             #505 <Class SQLiteStatement>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:ldc2            #958 <String "PRAGMA user_version;">
	//   16   33:invokespecial   #510 <Method void SQLiteStatement(SQLiteDatabase, String)>
	//   17   36:astore          6
		long l = sqlitestatement1.simpleQueryForLong();
	//   18   38:aload           6
	//   19   40:invokevirtual   #513 <Method long SQLiteStatement.simpleQueryForLong()>
	//   20   43:lstore_2        
		int i = (int)l;
	//   21   44:lload_2         
	//   22   45:l2i             
	//   23   46:istore_1        
		if(sqlitestatement1 != null)
	//*  24   47:aload           6
	//*  25   49:ifnull          57
			sqlitestatement1.close();
	//   26   52:aload           6
	//   27   54:invokevirtual   #514 <Method void SQLiteStatement.close()>
		unlock();
	//   28   57:aload_0         
	//   29   58:invokevirtual   #669 <Method void unlock()>
		return i;
	//   30   61:iload_1         
	//   31   62:ireturn         
		Exception exception;
		exception;
	//   32   63:astore          5
_L2:
		if(sqlitestatement != null)
	//*  33   65:aload           4
	//*  34   67:ifnull          75
			sqlitestatement.close();
	//   35   70:aload           4
	//   36   72:invokevirtual   #514 <Method void SQLiteStatement.close()>
		unlock();
	//   37   75:aload_0         
	//   38   76:invokevirtual   #669 <Method void unlock()>
		throw exception;
	//   39   79:aload           5
	//   40   81:athrow          
		exception;
	//   41   82:astore          5
		sqlitestatement = sqlitestatement1;
	//   42   84:aload           6
	//   43   86:astore          4
		if(true) goto _L2; else goto _L1
	//   44   88:goto            65
_L1:
	}

	public boolean inTransaction()
	{
		return mLock.getHoldCount() > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field ReentrantLock mLock>
	//    2    4:invokevirtual   #652 <Method int ReentrantLock.getHoldCount()>
	//    3    7:ifle            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public long insert(String s, String s1, ContentValues contentvalues)
	{
		long l;
		try
		{
			l = insertWithOnConflict(s, s1, contentvalues, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #965 <Method long insertWithOnConflict(String, String, ContentValues, int)>
	//    6    8:lstore          4
		}
	//*   7   10:lload           4
	//*   8   12:lreturn         
		// Misplaced declaration of an exception variable
		catch(String s1)
	//*   9   13:astore_2        
		{
			Log.e("Database", (new StringBuilder()).append("Error inserting <redacted values> into ").append(s).toString(), ((Throwable) (s1)));
	//   10   14:ldc1            #69  <String "Database">
	//   11   16:new             #258 <Class StringBuilder>
	//   12   19:dup             
	//   13   20:invokespecial   #259 <Method void StringBuilder()>
	//   14   23:ldc2            #967 <String "Error inserting <redacted values> into ">
	//   15   26:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   16   29:aload_1         
	//   17   30:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   18   33:invokevirtual   #281 <Method String StringBuilder.toString()>
	//   19   36:aload_2         
	//   20   37:invokestatic    #597 <Method int Log.e(String, String, Throwable)>
	//   21   40:pop             
			return -1L;
	//   22   41:ldc2w           #968 <Long -1L>
	//   23   44:lreturn         
		}
		return l;
	}

	public long insertOrThrow(String s, String s1, ContentValues contentvalues)
		throws SQLException
	{
		return insertWithOnConflict(s, s1, contentvalues, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #965 <Method long insertWithOnConflict(String, String, ContentValues, int)>
	//    6    8:lreturn         
	}

	public long insertWithOnConflict(String s, String s1, ContentValues contentvalues, int i)
	{
		Object obj1;
		if(!isOpen())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #403 <Method boolean isOpen()>
	//*   2    4:ifne            18
			throw new IllegalStateException("database not open");
	//    3    7:new             #381 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #838 <String "database not open">
	//    6   14:invokespecial   #384 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		obj1 = ((Object) (new StringBuilder(152)));
	//    8   18:new             #258 <Class StringBuilder>
	//    9   21:dup             
	//   10   22:sipush          152
	//   11   25:invokespecial   #973 <Method void StringBuilder(int)>
	//   12   28:astore          9
		((StringBuilder) (obj1)).append("INSERT");
	//   13   30:aload           9
	//   14   32:ldc2            #975 <String "INSERT">
	//   15   35:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   16   38:pop             
		((StringBuilder) (obj1)).append(CONFLICT_VALUES[i]);
	//   17   39:aload           9
	//   18   41:getstatic       #138 <Field String[] CONFLICT_VALUES>
	//   19   44:iload           4
	//   20   46:aaload          
	//   21   47:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   22   50:pop             
		((StringBuilder) (obj1)).append(" INTO ");
	//   23   51:aload           9
	//   24   53:ldc2            #977 <String " INTO ">
	//   25   56:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   26   59:pop             
		((StringBuilder) (obj1)).append(s);
	//   27   60:aload           9
	//   28   62:aload_1         
	//   29   63:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   30   66:pop             
		StringBuilder stringbuilder = new StringBuilder(40);
	//   31   67:new             #258 <Class StringBuilder>
	//   32   70:dup             
	//   33   71:bipush          40
	//   34   73:invokespecial   #973 <Method void StringBuilder(int)>
	//   35   76:astore          10
		Object obj = null;
	//   36   78:aconst_null     
	//   37   79:astore          8
		int j;
		if(contentvalues != null && contentvalues.size() > 0)
	//*  38   81:aload_3         
	//*  39   82:ifnull          323
	//*  40   85:aload_3         
	//*  41   86:invokevirtual   #980 <Method int ContentValues.size()>
	//*  42   89:ifle            323
		{
			obj = ((Object) (contentvalues.valueSet()));
	//   43   92:aload_3         
	//   44   93:invokevirtual   #983 <Method Set ContentValues.valueSet()>
	//   45   96:astore          8
			s1 = ((String) (((Set) (obj)).iterator()));
	//   46   98:aload           8
	//   47  100:invokeinterface #310 <Method Iterator Set.iterator()>
	//   48  105:astore_2        
			((StringBuilder) (obj1)).append('(');
	//   49  106:aload           9
	//   50  108:bipush          40
	//   51  110:invokevirtual   #986 <Method StringBuilder StringBuilder.append(char)>
	//   52  113:pop             
			i = 0;
	//   53  114:iconst_0        
	//   54  115:istore          4
			for(; ((Iterator) (s1)).hasNext(); stringbuilder.append('?'))
	//*  55  117:aload_2         
	//*  56  118:invokeinterface #316 <Method boolean Iterator.hasNext()>
	//*  57  123:ifeq            186
			{
				if(i != 0)
	//*  58  126:iload           4
	//*  59  128:ifeq            149
				{
					((StringBuilder) (obj1)).append(", ");
	//   60  131:aload           9
	//   61  133:ldc2            #988 <String ", ">
	//   62  136:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   63  139:pop             
					stringbuilder.append(", ");
	//   64  140:aload           10
	//   65  142:ldc2            #988 <String ", ">
	//   66  145:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   67  148:pop             
				}
				i = 1;
	//   68  149:iconst_1        
	//   69  150:istore          4
				((StringBuilder) (obj1)).append((String)((java.util.Map.Entry)((Iterator) (s1)).next()).getKey());
	//   70  152:aload           9
	//   71  154:aload_2         
	//   72  155:invokeinterface #320 <Method Object Iterator.next()>
	//   73  160:checkcast       #322 <Class java.util.Map$Entry>
	//   74  163:invokeinterface #325 <Method Object java.util.Map$Entry.getKey()>
	//   75  168:checkcast       #124 <Class String>
	//   76  171:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   77  174:pop             
			}

	//   78  175:aload           10
	//   79  177:bipush          63
	//   80  179:invokevirtual   #986 <Method StringBuilder StringBuilder.append(char)>
	//   81  182:pop             
	//*  82  183:goto            117
			((StringBuilder) (obj1)).append(')');
	//   83  186:aload           9
	//   84  188:bipush          41
	//   85  190:invokevirtual   #986 <Method StringBuilder StringBuilder.append(char)>
	//   86  193:pop             
		} else
	//*  87  194:aload           9
	//*  88  196:ldc2            #990 <String " VALUES(">
	//*  89  199:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//*  90  202:pop             
	//*  91  203:aload           9
	//*  92  205:aload           10
	//*  93  207:invokevirtual   #993 <Method StringBuilder StringBuilder.append(CharSequence)>
	//*  94  210:pop             
	//*  95  211:aload           9
	//*  96  213:ldc2            #995 <String ");">
	//*  97  216:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//*  98  219:pop             
	//*  99  220:aload_0         
	//* 100  221:invokevirtual   #655 <Method void lock()>
	//* 101  224:aconst_null     
	//* 102  225:astore_3        
	//* 103  226:aconst_null     
	//* 104  227:astore_2        
	//* 105  228:aload_0         
	//* 106  229:aload           9
	//* 107  231:invokevirtual   #281 <Method String StringBuilder.toString()>
	//* 108  234:invokevirtual   #883 <Method SQLiteStatement compileStatement(String)>
	//* 109  237:astore          9
	//* 110  239:aload           8
	//* 111  241:ifnull          367
	//* 112  244:aload           9
	//* 113  246:astore_2        
	//* 114  247:aload           9
	//* 115  249:astore_3        
	//* 116  250:aload           8
	//* 117  252:invokeinterface #996 <Method int Set.size()>
	//* 118  257:istore          5
	//* 119  259:aload           9
	//* 120  261:astore_2        
	//* 121  262:aload           9
	//* 122  264:astore_3        
	//* 123  265:aload           8
	//* 124  267:invokeinterface #310 <Method Iterator Set.iterator()>
	//* 125  272:astore          8
	//* 126  274:iconst_0        
	//* 127  275:istore          4
	//* 128  277:iload           4
	//* 129  279:iload           5
	//* 130  281:icmpge          367
	//* 131  284:aload           9
	//* 132  286:astore_2        
	//* 133  287:aload           9
	//* 134  289:astore_3        
	//* 135  290:aload           9
	//* 136  292:iload           4
	//* 137  294:iconst_1        
	//* 138  295:iadd            
	//* 139  296:aload           8
	//* 140  298:invokeinterface #320 <Method Object Iterator.next()>
	//* 141  303:checkcast       #322 <Class java.util.Map$Entry>
	//* 142  306:invokeinterface #999 <Method Object java.util.Map$Entry.getValue()>
	//* 143  311:invokestatic    #889 <Method void DatabaseUtils.bindObjectToProgram(SQLiteProgram, int, Object)>
	//* 144  314:iload           4
	//* 145  316:iconst_1        
	//* 146  317:iadd            
	//* 147  318:istore          4
	//* 148  320:goto            277
		{
			((StringBuilder) (obj1)).append((new StringBuilder()).append("(").append(s1).append(") ").toString());
	//  149  323:aload           9
	//  150  325:new             #258 <Class StringBuilder>
	//  151  328:dup             
	//  152  329:invokespecial   #259 <Method void StringBuilder()>
	//  153  332:ldc2            #1001 <String "(">
	//  154  335:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  155  338:aload_2         
	//  156  339:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  157  342:ldc2            #1003 <String ") ">
	//  158  345:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  159  348:invokevirtual   #281 <Method String StringBuilder.toString()>
	//  160  351:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  161  354:pop             
			stringbuilder.append("NULL");
	//  162  355:aload           10
	//  163  357:ldc2            #1005 <String "NULL">
	//  164  360:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  165  363:pop             
		}
		((StringBuilder) (obj1)).append(" VALUES(");
		((StringBuilder) (obj1)).append(((CharSequence) (stringbuilder)));
		((StringBuilder) (obj1)).append(");");
		lock();
		contentvalues = null;
		s1 = null;
		obj1 = ((Object) (compileStatement(((StringBuilder) (obj1)).toString())));
		if(obj == null) goto _L2; else goto _L1
_L1:
		s1 = ((String) (obj1));
		contentvalues = ((ContentValues) (obj1));
		j = ((Set) (obj)).size();
		s1 = ((String) (obj1));
		contentvalues = ((ContentValues) (obj1));
		obj = ((Object) (((Set) (obj)).iterator()));
		i = 0;
_L3:
		if(i >= j)
			break; /* Loop/switch isn't completed */
		s1 = ((String) (obj1));
		contentvalues = ((ContentValues) (obj1));
		DatabaseUtils.bindObjectToProgram(((SQLiteProgram) (obj1)), i + 1, ((java.util.Map.Entry)((Iterator) (obj)).next()).getValue());
		i++;
		if(true) goto _L3; else goto _L2
	//* 166  364:goto            194
_L2:
		s1 = ((String) (obj1));
	//  167  367:aload           9
	//  168  369:astore_2        
		contentvalues = ((ContentValues) (obj1));
	//  169  370:aload           9
	//  170  372:astore_3        
		((SQLiteStatement) (obj1)).execute();
	//  171  373:aload           9
	//  172  375:invokevirtual   #892 <Method void SQLiteStatement.execute()>
		s1 = ((String) (obj1));
	//  173  378:aload           9
	//  174  380:astore_2        
		contentvalues = ((ContentValues) (obj1));
	//  175  381:aload           9
	//  176  383:astore_3        
		long l = lastInsertRow();
	//  177  384:aload_0         
	//  178  385:invokevirtual   #1008 <Method long lastInsertRow()>
	//  179  388:lstore          6
		if(l != -1L) goto _L5; else goto _L4
	//  180  390:lload           6
	//  181  392:ldc2w           #968 <Long -1L>
	//  182  395:lcmp            
	//  183  396:ifne            448
_L4:
		s1 = ((String) (obj1));
	//  184  399:aload           9
	//  185  401:astore_2        
		contentvalues = ((ContentValues) (obj1));
	//  186  402:aload           9
	//  187  404:astore_3        
		Log.e("Database", (new StringBuilder()).append("Error inserting <redacted values> using <redacted sql> into ").append(s).toString());
	//  188  405:ldc1            #69  <String "Database">
	//  189  407:new             #258 <Class StringBuilder>
	//  190  410:dup             
	//  191  411:invokespecial   #259 <Method void StringBuilder()>
	//  192  414:ldc2            #1010 <String "Error inserting <redacted values> using <redacted sql> into ">
	//  193  417:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  194  420:aload_1         
	//  195  421:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  196  424:invokevirtual   #281 <Method String StringBuilder.toString()>
	//  197  427:invokestatic    #1012 <Method int Log.e(String, String)>
	//  198  430:pop             
_L7:
		if(obj1 != null)
	//* 199  431:aload           9
	//* 200  433:ifnull          441
			((SQLiteStatement) (obj1)).close();
	//  201  436:aload           9
	//  202  438:invokevirtual   #514 <Method void SQLiteStatement.close()>
		unlock();
	//  203  441:aload_0         
	//  204  442:invokevirtual   #669 <Method void unlock()>
		return l;
	//  205  445:lload           6
	//  206  447:lreturn         
_L5:
		s1 = ((String) (obj1));
	//  207  448:aload           9
	//  208  450:astore_2        
		contentvalues = ((ContentValues) (obj1));
	//  209  451:aload           9
	//  210  453:astore_3        
		if(!Log.isLoggable("Database", 2)) goto _L7; else goto _L6
	//  211  454:ldc1            #69  <String "Database">
	//  212  456:iconst_2        
	//  213  457:invokestatic    #245 <Method boolean Log.isLoggable(String, int)>
	//  214  460:ifeq            431
_L6:
		s1 = ((String) (obj1));
	//  215  463:aload           9
	//  216  465:astore_2        
		contentvalues = ((ContentValues) (obj1));
	//  217  466:aload           9
	//  218  468:astore_3        
		Log.v("Database", (new StringBuilder()).append("Inserting row ").append(l).append(" from <redacted values> using <redacted sql> into ").append(s).toString());
	//  219  469:ldc1            #69  <String "Database">
	//  220  471:new             #258 <Class StringBuilder>
	//  221  474:dup             
	//  222  475:invokespecial   #259 <Method void StringBuilder()>
	//  223  478:ldc2            #1014 <String "Inserting row ">
	//  224  481:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  225  484:lload           6
	//  226  486:invokevirtual   #270 <Method StringBuilder StringBuilder.append(long)>
	//  227  489:ldc2            #1016 <String " from <redacted values> using <redacted sql> into ">
	//  228  492:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  229  495:aload_1         
	//  230  496:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  231  499:invokevirtual   #281 <Method String StringBuilder.toString()>
	//  232  502:invokestatic    #814 <Method int Log.v(String, String)>
	//  233  505:pop             
		  goto _L7
	//* 234  506:goto            431
		s;
	//  235  509:astore_1        
		contentvalues = ((ContentValues) (s1));
	//  236  510:aload_2         
	//  237  511:astore_3        
		onCorruption();
	//  238  512:aload_0         
	//  239  513:invokevirtual   #897 <Method void onCorruption()>
		contentvalues = ((ContentValues) (s1));
	//  240  516:aload_2         
	//  241  517:astore_3        
		throw s;
	//  242  518:aload_1         
	//  243  519:athrow          
		s;
	//  244  520:astore_1        
		if(contentvalues != null)
	//* 245  521:aload_3         
	//* 246  522:ifnull          529
			((SQLiteStatement) (contentvalues)).close();
	//  247  525:aload_3         
	//  248  526:invokevirtual   #514 <Method void SQLiteStatement.close()>
		unlock();
	//  249  529:aload_0         
	//  250  530:invokevirtual   #669 <Method void unlock()>
		throw s;
	//  251  533:aload_1         
	//  252  534:athrow          
	}

	public boolean isDbLockedByCurrentThread()
	{
		return mLock.isHeldByCurrentThread();
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field ReentrantLock mLock>
	//    2    4:invokevirtual   #900 <Method boolean ReentrantLock.isHeldByCurrentThread()>
	//    3    7:ireturn         
	}

	public boolean isDbLockedByOtherThreads()
	{
		return !mLock.isHeldByCurrentThread() && mLock.isLocked();
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field ReentrantLock mLock>
	//    2    4:invokevirtual   #900 <Method boolean ReentrantLock.isHeldByCurrentThread()>
	//    3    7:ifne            22
	//    4   10:aload_0         
	//    5   11:getfield        #160 <Field ReentrantLock mLock>
	//    6   14:invokevirtual   #1020 <Method boolean ReentrantLock.isLocked()>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public boolean isInCompiledSqlCache(String s)
	{
		boolean flag;
		synchronized(mCompiledQueries)
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field Map mCompiledQueries>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			flag = mCompiledQueries.containsKey(((Object) (s)));
	//    5    7:aload_0         
	//    6    8:getfield        #184 <Field Map mCompiledQueries>
	//    7   11:aload_1         
	//    8   12:invokeinterface #1025 <Method boolean Map.containsKey(Object)>
	//    9   17:istore_2        
		}
	//   10   18:aload_3         
	//   11   19:monitorexit     
		return flag;
	//   12   20:iload_2         
	//   13   21:ireturn         
		s;
	//   14   22:astore_1        
		map;
	//   15   23:aload_3         
		JVM INSTR monitorexit ;
	//   16   24:monitorexit     
		throw s;
	//   17   25:aload_1         
	//   18   26:athrow          
	}

	public boolean isOpen()
	{
		return mNativeHandle != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field int mNativeHandle>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isReadOnly()
	{
		return (mFlags & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field int mFlags>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	native int lastChangeCount();

	native long lastInsertRow();

	void lock()
	{
		if(mLockingEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #194 <Field boolean mLockingEnabled>
	//*   2    4:ifne            8
	//*   3    7:return          
		{
			mLock.lock();
	//    4    8:aload_0         
	//    5    9:getfield        #160 <Field ReentrantLock mLock>
	//    6   12:invokevirtual   #646 <Method void ReentrantLock.lock()>
			if(SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && mLock.getHoldCount() == 1)
	//*   7   15:getstatic       #649 <Field boolean SQLiteDebug.DEBUG_LOCK_TIME_TRACKING>
	//*   8   18:ifeq            7
	//*   9   21:aload_0         
	//*  10   22:getfield        #160 <Field ReentrantLock mLock>
	//*  11   25:invokevirtual   #652 <Method int ReentrantLock.getHoldCount()>
	//*  12   28:iconst_1        
	//*  13   29:icmpne          7
			{
				mLockAcquiredWallTime = SystemClock.elapsedRealtime();
	//   14   32:aload_0         
	//   15   33:invokestatic    #237 <Method long SystemClock.elapsedRealtime()>
	//   16   36:putfield        #162 <Field long mLockAcquiredWallTime>
				mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
	//   17   39:aload_0         
	//   18   40:invokestatic    #254 <Method long Debug.threadCpuTimeNanos()>
	//   19   43:putfield        #164 <Field long mLockAcquiredThreadTime>
				return;
	//   20   46:return          
			}
		}
	}

	void logTimeStat(String s, long l)
	{
		logTimeStat(s, l, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #917 <Method void logTimeStat(String, long, String)>
	//    5    7:return          
	}

	void logTimeStat(String s, long l, String s1)
	{
		mLastSqlStatement = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #173 <Field String mLastSqlStatement>
		l = SystemClock.uptimeMillis() - l;
	//    3    5:invokestatic    #913 <Method long SystemClock.uptimeMillis()>
	//    4    8:lload_2         
	//    5    9:lsub            
	//    6   10:lstore_2        
		if(l != 0L || s1 != "GETLOCK:")
	//*   7   11:lload_2         
	//*   8   12:lconst_0        
	//*   9   13:lcmp            
	//*  10   14:ifne            25
	//*  11   17:aload           4
	//*  12   19:ldc1            #38  <String "GETLOCK:">
	//*  13   21:if_acmpne       25
	//*  14   24:return          
		{
			if(sQueryLogTimeInMillis == 0)
	//*  15   25:getstatic       #150 <Field int sQueryLogTimeInMillis>
	//*  16   28:ifne            37
				sQueryLogTimeInMillis = 500;
	//   17   31:sipush          500
	//   18   34:putstatic       #150 <Field int sQueryLogTimeInMillis>
			int i;
			String s2;
			if(l < (long)sQueryLogTimeInMillis)
	//*  19   37:lload_2         
	//*  20   38:getstatic       #150 <Field int sQueryLogTimeInMillis>
	//*  21   41:i2l             
	//*  22   42:lcmp            
	//*  23   43:iflt            101
	//*  24   46:aload_1         
	//*  25   47:astore          6
	//*  26   49:aload           4
	//*  27   51:ifnull          75
	//*  28   54:new             #258 <Class StringBuilder>
	//*  29   57:dup             
	//*  30   58:invokespecial   #259 <Method void StringBuilder()>
	//*  31   61:aload           4
	//*  32   63:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//*  33   66:aload_1         
	//*  34   67:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//*  35   70:invokevirtual   #281 <Method String StringBuilder.toString()>
	//*  36   73:astore          6
	//*  37   75:aload           6
	//*  38   77:invokevirtual   #488 <Method int String.length()>
	//*  39   80:bipush          64
	//*  40   82:icmple          94
	//*  41   85:aload           6
	//*  42   87:iconst_0        
	//*  43   88:bipush          64
	//*  44   90:invokevirtual   #379 <Method String String.substring(int, int)>
	//*  45   93:pop             
	//*  46   94:ldc2            #1028 <String "unknown">
	//*  47   97:ifnonnull       24
	//*  48  100:return          
	//*  49  101:ldc2w           #1029 <Long 100L>
	//*  50  104:lload_2         
	//*  51  105:lmul            
	//*  52  106:getstatic       #150 <Field int sQueryLogTimeInMillis>
	//*  53  109:i2l             
	//*  54  110:ldiv            
	//*  55  111:l2i             
	//*  56  112:istore          5
				if(mRandom.nextInt(100) >= (i = (int)((100L * l) / (long)sQueryLogTimeInMillis)) + 1)
	//*  57  114:aload_0         
	//*  58  115:getfield        #171 <Field Random mRandom>
	//*  59  118:bipush          100
	//*  60  120:invokevirtual   #1033 <Method int Random.nextInt(int)>
	//*  61  123:iload           5
	//*  62  125:iconst_1        
	//*  63  126:iadd            
	//*  64  127:icmplt          46
					return;
	//   65  130:return          
			s2 = s;
			if(s1 != null)
				s2 = (new StringBuilder()).append(s1).append(s).toString();
			if(s2.length() > 64)
				s2.substring(0, 64);
			if("unknown" == null)
				return;
		}
	}

	public void markTableSyncable(String s, String s1)
	{
		if(!isOpen())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #403 <Method boolean isOpen()>
	//*   2    4:ifne            18
		{
			throw new SQLiteException("database not open");
	//    3    7:new             #863 <Class SQLiteException>
	//    4   10:dup             
	//    5   11:ldc2            #838 <String "database not open">
	//    6   14:invokespecial   #864 <Method void SQLiteException(String)>
	//    7   17:athrow          
		} else
		{
			markTableSyncable(s, "_id", s, s1);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:ldc2            #1036 <String "_id">
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokespecial   #1038 <Method void markTableSyncable(String, String, String, String)>
			return;
	//   14   28:return          
		}
	}

	public void markTableSyncable(String s, String s1, String s2)
	{
		if(!isOpen())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #403 <Method boolean isOpen()>
	//*   2    4:ifne            18
		{
			throw new SQLiteException("database not open");
	//    3    7:new             #863 <Class SQLiteException>
	//    4   10:dup             
	//    5   11:ldc2            #838 <String "database not open">
	//    6   14:invokespecial   #864 <Method void SQLiteException(String)>
	//    7   17:athrow          
		} else
		{
			markTableSyncable(s, s1, s2, ((String) (null)));
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:aconst_null     
	//   13   23:invokespecial   #1038 <Method void markTableSyncable(String, String, String, String)>
			return;
	//   14   26:return          
		}
	}

	native void native_execSQL(String s)
		throws SQLException;

	native void native_setLocale(String s, int i);

	public boolean needUpgrade(int i)
	{
		return i > getVersion();
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #1043 <Method int getVersion()>
	//    3    5:icmple          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	protected void onAllReferencesReleased()
	{
		if(isOpen())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #403 <Method boolean isOpen()>
	//*   2    4:ifeq            47
		{
			if(SQLiteDebug.DEBUG_SQL_CACHE)
	//*   3    7:getstatic       #732 <Field boolean SQLiteDebug.DEBUG_SQL_CACHE>
	//*   4   10:ifeq            21
				mTimeClosed = getTime();
	//    5   13:aload_0         
	//    6   14:aload_0         
	//    7   15:invokespecial   #734 <Method String getTime()>
	//    8   18:putfield        #190 <Field String mTimeClosed>
			dbclose();
	//    9   21:aload_0         
	//   10   22:invokespecial   #748 <Method void dbclose()>
			synchronized(sActiveDatabases)
	//*  11   25:getstatic       #122 <Field WeakHashMap sActiveDatabases>
	//*  12   28:astore_1        
	//*  13   29:aload_1         
	//*  14   30:monitorenter    
			{
				sActiveDatabases.remove(((Object) (this)));
	//   15   31:getstatic       #122 <Field WeakHashMap sActiveDatabases>
	//   16   34:aload_0         
	//   17   35:invokevirtual   #1046 <Method Object WeakHashMap.remove(Object)>
	//   18   38:pop             
			}
	//   19   39:aload_1         
	//   20   40:monitorexit     
			return;
	//   21   41:return          
		} else
	//*  22   42:astore_2        
	//*  23   43:aload_1         
	//*  24   44:monitorexit     
	//*  25   45:aload_2         
	//*  26   46:athrow          
		{
			return;
	//   27   47:return          
		}
		exception;
		weakhashmap;
		JVM INSTR monitorexit ;
		throw exception;
	}

	void onCorruption()
	{
		Log.e("Database", (new StringBuilder()).append("Calling error handler for corrupt database (detected) ").append(mPath).toString());
	//    0    0:ldc1            #69  <String "Database">
	//    1    2:new             #258 <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #259 <Method void StringBuilder()>
	//    4    9:ldc2            #1048 <String "Calling error handler for corrupt database (detected) ">
	//    5   12:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_0         
	//    7   16:getfield        #207 <Field String mPath>
	//    8   19:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:invokevirtual   #281 <Method String StringBuilder.toString()>
	//   10   25:invokestatic    #1012 <Method int Log.e(String, String)>
	//   11   28:pop             
		mErrorHandler.onCorruption(this);
	//   12   29:aload_0         
	//   13   30:getfield        #222 <Field DatabaseErrorHandler mErrorHandler>
	//   14   33:aload_0         
	//   15   34:invokeinterface #717 <Method void DatabaseErrorHandler.onCorruption(SQLiteDatabase)>
	//   16   39:return          
	}

	public void purgeFromCompiledSqlCache(String s)
	{
		synchronized(mCompiledQueries)
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field Map mCompiledQueries>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			mCompiledQueries.remove(((Object) (s)));
	//    5    7:aload_0         
	//    6    8:getfield        #184 <Field Map mCompiledQueries>
	//    7   11:aload_1         
	//    8   12:invokeinterface #1050 <Method Object Map.remove(Object)>
	//    9   17:pop             
		}
	//   10   18:aload_2         
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		s;
	//   13   21:astore_1        
		map;
	//   14   22:aload_2         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		throw s;
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	public Cursor query(String s, String as[], String s1, String as1[], String s2, String s3, String s4)
	{
		return query(false, s, as, s1, as1, s2, s3, s4, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:aload           5
	//    7    9:aload           6
	//    8   11:aload           7
	//    9   13:aconst_null     
	//   10   14:invokevirtual   #1055 <Method Cursor query(boolean, String, String[], String, String[], String, String, String, String)>
	//   11   17:areturn         
	}

	public Cursor query(String s, String as[], String s1, String as1[], String s2, String s3, String s4, 
			String s5)
	{
		return query(false, s, as, s1, as1, s2, s3, s4, s5);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:aload           5
	//    7    9:aload           6
	//    8   11:aload           7
	//    9   13:aload           8
	//   10   15:invokevirtual   #1055 <Method Cursor query(boolean, String, String[], String, String[], String, String, String, String)>
	//   11   18:areturn         
	}

	public Cursor query(boolean flag, String s, String as[], String s1, String as1[], String s2, String s3, 
			String s4, String s5)
	{
		return queryWithFactory(((CursorFactory) (null)), flag, s, as, s1, as1, s2, s3, s4, s5);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:aload           5
	//    7    9:aload           6
	//    8   11:aload           7
	//    9   13:aload           8
	//   10   15:aload           9
	//   11   17:invokevirtual   #1060 <Method Cursor queryWithFactory(SQLiteDatabase$CursorFactory, boolean, String, String[], String, String[], String, String, String, String)>
	//   12   20:areturn         
	}

	public Cursor queryWithFactory(CursorFactory cursorfactory, boolean flag, String s, String as[], String s1, String as1[], String s2, 
			String s3, String s4, String s5)
	{
		if(!isOpen())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #403 <Method boolean isOpen()>
	//*   2    4:ifne            18
			throw new IllegalStateException("database not open");
	//    3    7:new             #381 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #838 <String "database not open">
	//    6   14:invokespecial   #384 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		else
			return rawQueryWithFactory(cursorfactory, SQLiteQueryBuilder.buildQueryString(flag, s, as, s1, s2, s3, s4, s5), as1, findEditTable(s));
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:iload_2         
	//   11   21:aload_3         
	//   12   22:aload           4
	//   13   24:aload           5
	//   14   26:aload           7
	//   15   28:aload           8
	//   16   30:aload           9
	//   17   32:aload           10
	//   18   34:invokestatic    #1066 <Method String SQLiteQueryBuilder.buildQueryString(boolean, String, String[], String, String, String, String, String)>
	//   19   37:aload           6
	//   20   39:aload_3         
	//   21   40:invokestatic    #1068 <Method String findEditTable(String)>
	//   22   43:invokevirtual   #1072 <Method Cursor rawQueryWithFactory(SQLiteDatabase$CursorFactory, String, String[], String)>
	//   23   46:areturn         
	}

	public void rawExecSQL(String s)
	{
		long l;
		l = SystemClock.uptimeMillis();
	//    0    0:invokestatic    #913 <Method long SystemClock.uptimeMillis()>
	//    1    3:lstore_2        
		lock();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #655 <Method void lock()>
		if(!isOpen())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #403 <Method boolean isOpen()>
	//*   6   12:ifne            26
			throw new IllegalStateException("database not open");
	//    7   15:new             #381 <Class IllegalStateException>
	//    8   18:dup             
	//    9   19:ldc2            #838 <String "database not open">
	//   10   22:invokespecial   #384 <Method void IllegalStateException(String)>
	//   11   25:athrow          
		logTimeStat(mLastSqlStatement, l, "GETLOCK:");
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #173 <Field String mLastSqlStatement>
	//   15   31:lload_2         
	//   16   32:ldc1            #38  <String "GETLOCK:">
	//   17   34:invokevirtual   #917 <Method void logTimeStat(String, long, String)>
		native_rawExecSQL(s);
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:invokespecial   #1075 <Method void native_rawExecSQL(String)>
		unlock();
	//   21   42:aload_0         
	//   22   43:invokevirtual   #669 <Method void unlock()>
		if(s == "COMMIT;")
	//*  23   46:aload_1         
	//*  24   47:ldc1            #12  <String "COMMIT;">
	//*  25   49:if_acmpne       78
		{
			logTimeStat(mLastSqlStatement, l, "COMMIT;");
	//   26   52:aload_0         
	//   27   53:aload_0         
	//   28   54:getfield        #173 <Field String mLastSqlStatement>
	//   29   57:lload_2         
	//   30   58:ldc1            #12  <String "COMMIT;">
	//   31   60:invokevirtual   #917 <Method void logTimeStat(String, long, String)>
			return;
	//   32   63:return          
		} else
	//*  33   64:astore_1        
	//*  34   65:aload_0         
	//*  35   66:invokevirtual   #897 <Method void onCorruption()>
	//*  36   69:aload_1         
	//*  37   70:athrow          
	//*  38   71:astore_1        
	//*  39   72:aload_0         
	//*  40   73:invokevirtual   #669 <Method void unlock()>
	//*  41   76:aload_1         
	//*  42   77:athrow          
		{
			logTimeStat(s, l, ((String) (null)));
	//   43   78:aload_0         
	//   44   79:aload_1         
	//   45   80:lload_2         
	//   46   81:aconst_null     
	//   47   82:invokevirtual   #917 <Method void logTimeStat(String, long, String)>
			return;
	//   48   85:return          
		}
		s;
		onCorruption();
		throw s;
		s;
		unlock();
		throw s;
	}

	public Cursor rawQuery(String s, String as[])
	{
		return rawQueryWithFactory(((CursorFactory) (null)), s, as, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #1072 <Method Cursor rawQueryWithFactory(SQLiteDatabase$CursorFactory, String, String[], String)>
	//    6    8:areturn         
	}

	public Cursor rawQuery(String s, String as[], int i, int j)
	{
		s = ((String) ((CursorWrapper)rawQueryWithFactory(((CursorFactory) (null)), s, as, ((String) (null)))));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #1072 <Method Cursor rawQueryWithFactory(SQLiteDatabase$CursorFactory, String, String[], String)>
	//    6    8:checkcast       #1078 <Class CursorWrapper>
	//    7   11:astore_1        
		((SQLiteCursor)((CursorWrapper) (s)).getWrappedCursor()).setLoadStyle(i, j);
	//    8   12:aload_1         
	//    9   13:invokevirtual   #1082 <Method Cursor CursorWrapper.getWrappedCursor()>
	//   10   16:checkcast       #1084 <Class SQLiteCursor>
	//   11   19:iload_3         
	//   12   20:iload           4
	//   13   22:invokevirtual   #1088 <Method void SQLiteCursor.setLoadStyle(int, int)>
		return ((Cursor) (s));
	//   14   25:aload_1         
	//   15   26:areturn         
	}

	public Cursor rawQueryWithFactory(CursorFactory cursorfactory, String s, String as[], String s1)
	{
		long l;
		if(!isOpen())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #403 <Method boolean isOpen()>
	//*   2    4:ifne            18
			throw new IllegalStateException("database not open");
	//    3    7:new             #381 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #838 <String "database not open">
	//    6   14:invokespecial   #384 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		l = 0L;
	//    8   18:lconst_0        
	//    9   19:lstore          6
		if(mSlowQueryThreshold != -1)
	//*  10   21:aload_0         
	//*  11   22:getfield        #209 <Field int mSlowQueryThreshold>
	//*  12   25:iconst_m1       
	//*  13   26:icmpeq          34
			l = System.currentTimeMillis();
	//   14   29:invokestatic    #525 <Method long System.currentTimeMillis()>
	//   15   32:lstore          6
		s = ((String) (new SQLiteDirectCursorDriver(this, s, s1)));
	//   16   34:new             #1090 <Class SQLiteDirectCursorDriver>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:aload_2         
	//   20   40:aload           4
	//   21   42:invokespecial   #1093 <Method void SQLiteDirectCursorDriver(SQLiteDatabase, String, String)>
	//   22   45:astore_2        
		if(cursorfactory == null)
			break MISSING_BLOCK_LABEL_161;
	//   23   46:aload_1         
	//   24   47:ifnull          161
_L1:
		cursorfactory = ((CursorFactory) (((SQLiteCursorDriver) (s)).query(cursorfactory, as)));
	//   25   50:aload_2         
	//   26   51:aload_1         
	//   27   52:aload_3         
	//   28   53:invokeinterface #1098 <Method Cursor SQLiteCursorDriver.query(SQLiteDatabase$CursorFactory, String[])>
	//   29   58:astore_1        
		if(mSlowQueryThreshold != -1)
	//*  30   59:aload_0         
	//*  31   60:getfield        #209 <Field int mSlowQueryThreshold>
	//*  32   63:iconst_m1       
	//*  33   64:icmpeq          152
		{
			int i = -1;
	//   34   67:iconst_m1       
	//   35   68:istore          5
			if(cursorfactory != null)
	//*  36   70:aload_1         
	//*  37   71:ifnull          82
				i = ((Cursor) (cursorfactory)).getCount();
	//   38   74:aload_1         
	//   39   75:invokeinterface #1101 <Method int Cursor.getCount()>
	//   40   80:istore          5
			l = System.currentTimeMillis() - l;
	//   41   82:invokestatic    #525 <Method long System.currentTimeMillis()>
	//   42   85:lload           6
	//   43   87:lsub            
	//   44   88:lstore          6
			if(l >= (long)mSlowQueryThreshold)
	//*  45   90:lload           6
	//*  46   92:aload_0         
	//*  47   93:getfield        #209 <Field int mSlowQueryThreshold>
	//*  48   96:i2l             
	//*  49   97:lcmp            
	//*  50   98:iflt            152
				Log.v("Database", (new StringBuilder()).append("query (").append(l).append(" ms): ").append(((Object) (s)).toString()).append(", args are <redacted>, count is ").append(i).toString());
	//   51  101:ldc1            #69  <String "Database">
	//   52  103:new             #258 <Class StringBuilder>
	//   53  106:dup             
	//   54  107:invokespecial   #259 <Method void StringBuilder()>
	//   55  110:ldc2            #1103 <String "query (">
	//   56  113:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   57  116:lload           6
	//   58  118:invokevirtual   #270 <Method StringBuilder StringBuilder.append(long)>
	//   59  121:ldc2            #1105 <String " ms): ">
	//   60  124:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   61  127:aload_2         
	//   62  128:invokevirtual   #1108 <Method String Object.toString()>
	//   63  131:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   64  134:ldc2            #1110 <String ", args are <redacted>, count is ">
	//   65  137:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   66  140:iload           5
	//   67  142:invokevirtual   #275 <Method StringBuilder StringBuilder.append(int)>
	//   68  145:invokevirtual   #281 <Method String StringBuilder.toString()>
	//   69  148:invokestatic    #814 <Method int Log.v(String, String)>
	//   70  151:pop             
		}
		return ((Cursor) (new CrossProcessCursorWrapper(((Cursor) (cursorfactory)))));
	//   71  152:new             #1112 <Class CrossProcessCursorWrapper>
	//   72  155:dup             
	//   73  156:aload_1         
	//   74  157:invokespecial   #1115 <Method void CrossProcessCursorWrapper(Cursor)>
	//   75  160:areturn         
		cursorfactory = mFactory;
	//   76  161:aload_0         
	//   77  162:getfield        #218 <Field SQLiteDatabase$CursorFactory mFactory>
	//   78  165:astore_1        
		  goto _L1
	//*  79  166:goto            50
		cursorfactory;
	//   80  169:astore_1        
		if(mSlowQueryThreshold != -1)
	//*  81  170:aload_0         
	//*  82  171:getfield        #209 <Field int mSlowQueryThreshold>
	//*  83  174:iconst_m1       
	//*  84  175:icmpeq          259
		{
			if(false)
	//*  85  178:iconst_0        
	//*  86  179:ifeq            190
				throw new NullPointerException();
	//   87  182:new             #1117 <Class NullPointerException>
	//   88  185:dup             
	//   89  186:invokespecial   #1118 <Method void NullPointerException()>
	//   90  189:athrow          
			l = System.currentTimeMillis() - l;
	//   91  190:invokestatic    #525 <Method long System.currentTimeMillis()>
	//   92  193:lload           6
	//   93  195:lsub            
	//   94  196:lstore          6
			if(l >= (long)mSlowQueryThreshold)
	//*  95  198:lload           6
	//*  96  200:aload_0         
	//*  97  201:getfield        #209 <Field int mSlowQueryThreshold>
	//*  98  204:i2l             
	//*  99  205:lcmp            
	//* 100  206:iflt            259
				Log.v("Database", (new StringBuilder()).append("query (").append(l).append(" ms): ").append(((Object) (s)).toString()).append(", args are <redacted>, count is ").append(-1).toString());
	//  101  209:ldc1            #69  <String "Database">
	//  102  211:new             #258 <Class StringBuilder>
	//  103  214:dup             
	//  104  215:invokespecial   #259 <Method void StringBuilder()>
	//  105  218:ldc2            #1103 <String "query (">
	//  106  221:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  107  224:lload           6
	//  108  226:invokevirtual   #270 <Method StringBuilder StringBuilder.append(long)>
	//  109  229:ldc2            #1105 <String " ms): ">
	//  110  232:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  111  235:aload_2         
	//  112  236:invokevirtual   #1108 <Method String Object.toString()>
	//  113  239:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  114  242:ldc2            #1110 <String ", args are <redacted>, count is ">
	//  115  245:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  116  248:iconst_m1       
	//  117  249:invokevirtual   #275 <Method StringBuilder StringBuilder.append(int)>
	//  118  252:invokevirtual   #281 <Method String StringBuilder.toString()>
	//  119  255:invokestatic    #814 <Method int Log.v(String, String)>
	//  120  258:pop             
		}
		throw cursorfactory;
	//  121  259:aload_1         
	//  122  260:athrow          
	}

	void removeSQLiteClosable(SQLiteClosable sqliteclosable)
	{
		lock();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #655 <Method void lock()>
		mPrograms.remove(((Object) (sqliteclosable)));
	//    2    4:aload_0         
	//    3    5:getfield        #220 <Field WeakHashMap mPrograms>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #1046 <Method Object WeakHashMap.remove(Object)>
	//    6   12:pop             
		unlock();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #669 <Method void unlock()>
		return;
	//    9   17:return          
		sqliteclosable;
	//   10   18:astore_1        
		unlock();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #669 <Method void unlock()>
		throw sqliteclosable;
	//   13   23:aload_1         
	//   14   24:athrow          
	}

	public long replace(String s, String s1, ContentValues contentvalues)
	{
		long l;
		try
		{
			l = insertWithOnConflict(s, s1, contentvalues, 5);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_5        
	//    5    5:invokevirtual   #965 <Method long insertWithOnConflict(String, String, ContentValues, int)>
	//    6    8:lstore          4
		}
	//*   7   10:lload           4
	//*   8   12:lreturn         
		// Misplaced declaration of an exception variable
		catch(String s1)
	//*   9   13:astore_2        
		{
			Log.e("Database", (new StringBuilder()).append("Error inserting <redacted values> into ").append(s).toString(), ((Throwable) (s1)));
	//   10   14:ldc1            #69  <String "Database">
	//   11   16:new             #258 <Class StringBuilder>
	//   12   19:dup             
	//   13   20:invokespecial   #259 <Method void StringBuilder()>
	//   14   23:ldc2            #967 <String "Error inserting <redacted values> into ">
	//   15   26:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   16   29:aload_1         
	//   17   30:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   18   33:invokevirtual   #281 <Method String StringBuilder.toString()>
	//   19   36:aload_2         
	//   20   37:invokestatic    #597 <Method int Log.e(String, String, Throwable)>
	//   21   40:pop             
			return -1L;
	//   22   41:ldc2w           #968 <Long -1L>
	//   23   44:lreturn         
		}
		return l;
	}

	public long replaceOrThrow(String s, String s1, ContentValues contentvalues)
		throws SQLException
	{
		return insertWithOnConflict(s, s1, contentvalues, 5);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_5        
	//    5    5:invokevirtual   #965 <Method long insertWithOnConflict(String, String, ContentValues, int)>
	//    6    8:lreturn         
	}

	public void resetCompiledSqlCache()
	{
		synchronized(mCompiledQueries)
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field Map mCompiledQueries>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			mCompiledQueries.clear();
	//    5    7:aload_0         
	//    6    8:getfield        #184 <Field Map mCompiledQueries>
	//    7   11:invokeinterface #361 <Method void Map.clear()>
		}
	//    8   16:aload_1         
	//    9   17:monitorexit     
		return;
	//   10   18:return          
		exception;
	//   11   19:astore_2        
		map;
	//   12   20:aload_1         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		throw exception;
	//   14   22:aload_2         
	//   15   23:athrow          
	}

	void rowUpdated(String s, long l)
	{
		SyncUpdateInfo syncupdateinfo;
		synchronized(mSyncUpdateInfo)
	//*   0    0:aload_0         
	//*   1    1:getfield        #196 <Field Map mSyncUpdateInfo>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			syncupdateinfo = (SyncUpdateInfo)mSyncUpdateInfo.get(((Object) (s)));
	//    5    9:aload_0         
	//    6   10:getfield        #196 <Field Map mSyncUpdateInfo>
	//    7   13:aload_1         
	//    8   14:invokeinterface #817 <Method Object Map.get(Object)>
	//    9   19:checkcast       #8   <Class SQLiteDatabase$SyncUpdateInfo>
	//   10   22:astore          5
		}
	//   11   24:aload           4
	//   12   26:monitorexit     
		if(syncupdateinfo != null)
	//*  13   27:aload           5
	//*  14   29:ifnull          100
			execSQL((new StringBuilder()).append("UPDATE ").append(syncupdateinfo.masterTable).append(" SET _sync_dirty=1 WHERE _id=(SELECT ").append(syncupdateinfo.foreignKey).append(" FROM ").append(s).append(" WHERE _id=").append(l).append(")").toString());
	//   15   32:aload_0         
	//   16   33:new             #258 <Class StringBuilder>
	//   17   36:dup             
	//   18   37:invokespecial   #259 <Method void StringBuilder()>
	//   19   40:ldc2            #1125 <String "UPDATE ">
	//   20   43:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   21   46:aload           5
	//   22   48:getfield        #1128 <Field String SQLiteDatabase$SyncUpdateInfo.masterTable>
	//   23   51:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   24   54:ldc2            #1130 <String " SET _sync_dirty=1 WHERE _id=(SELECT ">
	//   25   57:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   26   60:aload           5
	//   27   62:getfield        #1133 <Field String SQLiteDatabase$SyncUpdateInfo.foreignKey>
	//   28   65:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   29   68:ldc2            #666 <String " FROM ">
	//   30   71:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   31   74:aload_1         
	//   32   75:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   33   78:ldc2            #1135 <String " WHERE _id=">
	//   34   81:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   35   84:lload_2         
	//   36   85:invokevirtual   #270 <Method StringBuilder StringBuilder.append(long)>
	//   37   88:ldc2            #1137 <String ")">
	//   38   91:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   39   94:invokevirtual   #281 <Method String StringBuilder.toString()>
	//   40   97:invokevirtual   #851 <Method void execSQL(String)>
		return;
	//   41  100:return          
		s;
	//   42  101:astore_1        
		map;
	//   43  102:aload           4
		JVM INSTR monitorexit ;
	//   44  104:monitorexit     
		throw s;
	//   45  105:aload_1         
	//   46  106:athrow          
	}

	public void setLocale(Locale locale)
	{
		lock();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #655 <Method void lock()>
		native_setLocale(locale.toString(), mFlags);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1138 <Method String Locale.toString()>
	//    5    9:aload_0         
	//    6   10:getfield        #205 <Field int mFlags>
	//    7   13:invokevirtual   #1140 <Method void native_setLocale(String, int)>
		unlock();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #669 <Method void unlock()>
		return;
	//   10   20:return          
		locale;
	//   11   21:astore_1        
		unlock();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #669 <Method void unlock()>
		throw locale;
	//   14   26:aload_1         
	//   15   27:athrow          
	}

	public void setLockingEnabled(boolean flag)
	{
		mLockingEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #194 <Field boolean mLockingEnabled>
	//    3    5:return          
	}

	public void setMaxSqlCacheSize(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(i <= 250 && i >= 0)
			break MISSING_BLOCK_LABEL_29;
	//    2    2:iload_1         
	//    3    3:sipush          250
	//    4    6:icmpgt          13
	//    5    9:iload_1         
	//    6   10:ifge            29
		throw new IllegalStateException("expected value between 0 and 250");
	//    7   13:new             #381 <Class IllegalStateException>
	//    8   16:dup             
	//    9   17:ldc2            #1144 <String "expected value between 0 and 250">
	//   10   20:invokespecial   #384 <Method void IllegalStateException(String)>
	//   11   23:athrow          
		Exception exception;
		exception;
	//   12   24:astore_2        
		this;
	//   13   25:aload_0         
		JVM INSTR monitorexit ;
	//   14   26:monitorexit     
		throw exception;
	//   15   27:aload_2         
	//   16   28:athrow          
		if(i < mMaxSqlCacheSize)
	//*  17   29:iload_1         
	//*  18   30:aload_0         
	//*  19   31:getfield        #186 <Field int mMaxSqlCacheSize>
	//*  20   34:icmpge          48
			throw new IllegalStateException("cannot set cacheSize to a value less than the value set with previous setMaxSqlCacheSize() call.");
	//   21   37:new             #381 <Class IllegalStateException>
	//   22   40:dup             
	//   23   41:ldc2            #1146 <String "cannot set cacheSize to a value less than the value set with previous setMaxSqlCacheSize() call.">
	//   24   44:invokespecial   #384 <Method void IllegalStateException(String)>
	//   25   47:athrow          
		mMaxSqlCacheSize = i;
	//   26   48:aload_0         
	//   27   49:iload_1         
	//   28   50:putfield        #186 <Field int mMaxSqlCacheSize>
		this;
	//   29   53:aload_0         
		JVM INSTR monitorexit ;
	//   30   54:monitorexit     
	//   31   55:return          
	}

	public long setMaximumSize(long l)
	{
		SQLiteStatement sqlitestatement;
		sqlitestatement = null;
	//    0    0:aconst_null     
	//    1    1:astore          9
		lock();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #655 <Method void lock()>
		if(!isOpen())
	//*   4    7:aload_0         
	//*   5    8:invokevirtual   #403 <Method boolean isOpen()>
	//*   6   11:ifne            25
			throw new IllegalStateException("database not open");
	//    7   14:new             #381 <Class IllegalStateException>
	//    8   17:dup             
	//    9   18:ldc2            #838 <String "database not open">
	//   10   21:invokespecial   #384 <Method void IllegalStateException(String)>
	//   11   24:athrow          
		long l2;
		long l3;
		l3 = getPageSize();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #474 <Method long getPageSize()>
	//   14   29:lstore          7
		l2 = l / l3;
	//   15   31:lload_1         
	//   16   32:lload           7
	//   17   34:ldiv            
	//   18   35:lstore          5
		long l1;
		l1 = l2;
	//   19   37:lload           5
	//   20   39:lstore_3        
		if(l % l3 != 0L)
	//*  21   40:lload_1         
	//*  22   41:lload           7
	//*  23   43:lrem            
	//*  24   44:lconst_0        
	//*  25   45:lcmp            
	//*  26   46:ifeq            54
			l1 = l2 + 1L;
	//   27   49:lload           5
	//   28   51:lconst_1        
	//   29   52:ladd            
	//   30   53:lstore_3        
		SQLiteStatement sqlitestatement1 = new SQLiteStatement(this, (new StringBuilder()).append("PRAGMA max_page_count = ").append(l1).toString());
	//   31   54:new             #505 <Class SQLiteStatement>
	//   32   57:dup             
	//   33   58:aload_0         
	//   34   59:new             #258 <Class StringBuilder>
	//   35   62:dup             
	//   36   63:invokespecial   #259 <Method void StringBuilder()>
	//   37   66:ldc2            #1150 <String "PRAGMA max_page_count = ">
	//   38   69:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   39   72:lload_3         
	//   40   73:invokevirtual   #270 <Method StringBuilder StringBuilder.append(long)>
	//   41   76:invokevirtual   #281 <Method String StringBuilder.toString()>
	//   42   79:invokespecial   #510 <Method void SQLiteStatement(SQLiteDatabase, String)>
	//   43   82:astore          11
		l = sqlitestatement1.simpleQueryForLong();
	//   44   84:aload           11
	//   45   86:invokevirtual   #513 <Method long SQLiteStatement.simpleQueryForLong()>
	//   46   89:lstore_1        
		if(sqlitestatement1 != null)
	//*  47   90:aload           11
	//*  48   92:ifnull          100
			sqlitestatement1.close();
	//   49   95:aload           11
	//   50   97:invokevirtual   #514 <Method void SQLiteStatement.close()>
		unlock();
	//   51  100:aload_0         
	//   52  101:invokevirtual   #669 <Method void unlock()>
		return l * l3;
	//   53  104:lload_1         
	//   54  105:lload           7
	//   55  107:lmul            
	//   56  108:lreturn         
		Exception exception;
		exception;
	//   57  109:astore          10
_L2:
		if(sqlitestatement != null)
	//*  58  111:aload           9
	//*  59  113:ifnull          121
			sqlitestatement.close();
	//   60  116:aload           9
	//   61  118:invokevirtual   #514 <Method void SQLiteStatement.close()>
		unlock();
	//   62  121:aload_0         
	//   63  122:invokevirtual   #669 <Method void unlock()>
		throw exception;
	//   64  125:aload           10
	//   65  127:athrow          
		exception;
	//   66  128:astore          10
		sqlitestatement = sqlitestatement1;
	//   67  130:aload           11
	//   68  132:astore          9
		if(true) goto _L2; else goto _L1
	//   69  134:goto            111
_L1:
	}

	public void setPageSize(long l)
	{
		execSQL((new StringBuilder()).append("PRAGMA page_size = ").append(l).toString());
	//    0    0:aload_0         
	//    1    1:new             #258 <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #259 <Method void StringBuilder()>
	//    4    8:ldc2            #1153 <String "PRAGMA page_size = ">
	//    5   11:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:lload_1         
	//    7   15:invokevirtual   #270 <Method StringBuilder StringBuilder.append(long)>
	//    8   18:invokevirtual   #281 <Method String StringBuilder.toString()>
	//    9   21:invokevirtual   #851 <Method void execSQL(String)>
	//   10   24:return          
	}

	public void setTransactionSuccessful()
	{
		if(!isOpen())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #403 <Method boolean isOpen()>
	//*   2    4:ifne            18
			throw new IllegalStateException("database not open");
	//    3    7:new             #381 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #838 <String "database not open">
	//    6   14:invokespecial   #384 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(!mLock.isHeldByCurrentThread())
	//*   8   18:aload_0         
	//*   9   19:getfield        #160 <Field ReentrantLock mLock>
	//*  10   22:invokevirtual   #900 <Method boolean ReentrantLock.isHeldByCurrentThread()>
	//*  11   25:ifne            39
			throw new IllegalStateException("no transaction pending");
	//   12   28:new             #381 <Class IllegalStateException>
	//   13   31:dup             
	//   14   32:ldc2            #902 <String "no transaction pending">
	//   15   35:invokespecial   #384 <Method void IllegalStateException(String)>
	//   16   38:athrow          
		if(mInnerTransactionIsSuccessful)
	//*  17   39:aload_0         
	//*  18   40:getfield        #840 <Field boolean mInnerTransactionIsSuccessful>
	//*  19   43:ifeq            57
		{
			throw new IllegalStateException("setTransactionSuccessful may only be called once per call to beginTransaction");
	//   20   46:new             #381 <Class IllegalStateException>
	//   21   49:dup             
	//   22   50:ldc2            #1155 <String "setTransactionSuccessful may only be called once per call to beginTransaction">
	//   23   53:invokespecial   #384 <Method void IllegalStateException(String)>
	//   24   56:athrow          
		} else
		{
			mInnerTransactionIsSuccessful = true;
	//   25   57:aload_0         
	//   26   58:iconst_1        
	//   27   59:putfield        #840 <Field boolean mInnerTransactionIsSuccessful>
			return;
	//   28   62:return          
		}
	}

	public void setVersion(int i)
	{
		execSQL((new StringBuilder()).append("PRAGMA user_version = ").append(i).toString());
	//    0    0:aload_0         
	//    1    1:new             #258 <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #259 <Method void StringBuilder()>
	//    4    8:ldc2            #1158 <String "PRAGMA user_version = ">
	//    5   11:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:iload_1         
	//    7   15:invokevirtual   #275 <Method StringBuilder StringBuilder.append(int)>
	//    8   18:invokevirtual   #281 <Method String StringBuilder.toString()>
	//    9   21:invokevirtual   #851 <Method void execSQL(String)>
	//   10   24:return          
	}

	public int status(int i, boolean flag)
	{
		return native_status(i, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #1161 <Method int native_status(int, boolean)>
	//    4    6:ireturn         
	}

	void unlock()
	{
		if(!mLockingEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #194 <Field boolean mLockingEnabled>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && mLock.getHoldCount() == 1)
	//*   4    8:getstatic       #649 <Field boolean SQLiteDebug.DEBUG_LOCK_TIME_TRACKING>
	//*   5   11:ifeq            29
	//*   6   14:aload_0         
	//*   7   15:getfield        #160 <Field ReentrantLock mLock>
	//*   8   18:invokevirtual   #652 <Method int ReentrantLock.getHoldCount()>
	//*   9   21:iconst_1        
	//*  10   22:icmpne          29
			checkLockHoldTime();
	//   11   25:aload_0         
	//   12   26:invokespecial   #767 <Method void checkLockHoldTime()>
		mLock.unlock();
	//   13   29:aload_0         
	//   14   30:getfield        #160 <Field ReentrantLock mLock>
	//   15   33:invokevirtual   #768 <Method void ReentrantLock.unlock()>
	//   16   36:return          
	}

	public int update(String s, ContentValues contentvalues, String s1, String as[])
	{
		return updateWithOnConflict(s, contentvalues, s1, as, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iconst_0        
	//    6    7:invokevirtual   #1167 <Method int updateWithOnConflict(String, ContentValues, String, String[], int)>
	//    7   10:ireturn         
	}

	public int updateWithOnConflict(String s, ContentValues contentvalues, String s1, String as[], int i)
	{
		SQLiteStatement sqlitestatement;
		Object obj;
		Object obj1;
		if(contentvalues == null || contentvalues.size() == 0)
	//*   0    0:aload_2         
	//*   1    1:ifnull          11
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #980 <Method int ContentValues.size()>
	//*   4    8:ifne            22
			throw new IllegalArgumentException("Empty values");
	//    5   11:new             #198 <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:ldc2            #1169 <String "Empty values">
	//    8   18:invokespecial   #203 <Method void IllegalArgumentException(String)>
	//    9   21:athrow          
		obj = ((Object) (new StringBuilder(120)));
	//   10   22:new             #258 <Class StringBuilder>
	//   11   25:dup             
	//   12   26:bipush          120
	//   13   28:invokespecial   #973 <Method void StringBuilder(int)>
	//   14   31:astore          9
		((StringBuilder) (obj)).append("UPDATE ");
	//   15   33:aload           9
	//   16   35:ldc2            #1125 <String "UPDATE ">
	//   17   38:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
		((StringBuilder) (obj)).append(CONFLICT_VALUES[i]);
	//   19   42:aload           9
	//   20   44:getstatic       #138 <Field String[] CONFLICT_VALUES>
	//   21   47:iload           5
	//   22   49:aaload          
	//   23   50:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   24   53:pop             
		((StringBuilder) (obj)).append(s);
	//   25   54:aload           9
	//   26   56:aload_1         
	//   27   57:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:pop             
		((StringBuilder) (obj)).append(" SET ");
	//   29   61:aload           9
	//   30   63:ldc2            #1171 <String " SET ">
	//   31   66:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   32   69:pop             
		obj1 = ((Object) (contentvalues.valueSet()));
	//   33   70:aload_2         
	//   34   71:invokevirtual   #983 <Method Set ContentValues.valueSet()>
	//   35   74:astore          10
		contentvalues = ((ContentValues) (((Set) (obj1)).iterator()));
	//   36   76:aload           10
	//   37   78:invokeinterface #310 <Method Iterator Set.iterator()>
	//   38   83:astore_2        
		do
		{
			if(!((Iterator) (contentvalues)).hasNext())
				break;
	//   39   84:aload_2         
	//   40   85:invokeinterface #316 <Method boolean Iterator.hasNext()>
	//   41   90:ifeq            146
			((StringBuilder) (obj)).append((String)((java.util.Map.Entry)((Iterator) (contentvalues)).next()).getKey());
	//   42   93:aload           9
	//   43   95:aload_2         
	//   44   96:invokeinterface #320 <Method Object Iterator.next()>
	//   45  101:checkcast       #322 <Class java.util.Map$Entry>
	//   46  104:invokeinterface #325 <Method Object java.util.Map$Entry.getKey()>
	//   47  109:checkcast       #124 <Class String>
	//   48  112:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   49  115:pop             
			((StringBuilder) (obj)).append("=?");
	//   50  116:aload           9
	//   51  118:ldc2            #1173 <String "=?">
	//   52  121:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   53  124:pop             
			if(((Iterator) (contentvalues)).hasNext())
	//*  54  125:aload_2         
	//*  55  126:invokeinterface #316 <Method boolean Iterator.hasNext()>
	//*  56  131:ifeq            84
				((StringBuilder) (obj)).append(", ");
	//   57  134:aload           9
	//   58  136:ldc2            #988 <String ", ">
	//   59  139:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   60  142:pop             
		} while(true);
	//   61  143:goto            84
		if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*  62  146:aload_3         
	//*  63  147:invokestatic    #371 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  64  150:ifne            169
		{
			((StringBuilder) (obj)).append(" WHERE ");
	//   65  153:aload           9
	//   66  155:ldc2            #881 <String " WHERE ">
	//   67  158:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   68  161:pop             
			((StringBuilder) (obj)).append(s1);
	//   69  162:aload           9
	//   70  164:aload_3         
	//   71  165:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//   72  168:pop             
		}
		lock();
	//   73  169:aload_0         
	//   74  170:invokevirtual   #655 <Method void lock()>
		if(!isOpen())
	//*  75  173:aload_0         
	//*  76  174:invokevirtual   #403 <Method boolean isOpen()>
	//*  77  177:ifne            191
			throw new IllegalStateException("database not open");
	//   78  180:new             #381 <Class IllegalStateException>
	//   79  183:dup             
	//   80  184:ldc2            #838 <String "database not open">
	//   81  187:invokespecial   #384 <Method void IllegalStateException(String)>
	//   82  190:athrow          
		contentvalues = null;
	//   83  191:aconst_null     
	//   84  192:astore_2        
		sqlitestatement = null;
	//   85  193:aconst_null     
	//   86  194:astore          8
		s1 = null;
	//   87  196:aconst_null     
	//   88  197:astore_3        
		obj = ((Object) (compileStatement(((StringBuilder) (obj)).toString())));
	//   89  198:aload_0         
	//   90  199:aload           9
	//   91  201:invokevirtual   #281 <Method String StringBuilder.toString()>
	//   92  204:invokevirtual   #883 <Method SQLiteStatement compileStatement(String)>
	//   93  207:astore          9
		s1 = ((String) (obj));
	//   94  209:aload           9
	//   95  211:astore_3        
		contentvalues = ((ContentValues) (obj));
	//   96  212:aload           9
	//   97  214:astore_2        
		sqlitestatement = ((SQLiteStatement) (obj));
	//   98  215:aload           9
	//   99  217:astore          8
		int k = ((Set) (obj1)).size();
	//  100  219:aload           10
	//  101  221:invokeinterface #996 <Method int Set.size()>
	//  102  226:istore          7
		s1 = ((String) (obj));
	//  103  228:aload           9
	//  104  230:astore_3        
		contentvalues = ((ContentValues) (obj));
	//  105  231:aload           9
	//  106  233:astore_2        
		sqlitestatement = ((SQLiteStatement) (obj));
	//  107  234:aload           9
	//  108  236:astore          8
		obj1 = ((Object) (((Set) (obj1)).iterator()));
	//  109  238:aload           10
	//  110  240:invokeinterface #310 <Method Iterator Set.iterator()>
	//  111  245:astore          10
		int j;
		i = 1;
	//  112  247:iconst_1        
	//  113  248:istore          5
		j = 0;
	//  114  250:iconst_0        
	//  115  251:istore          6
_L2:
		if(j >= k)
			break; /* Loop/switch isn't completed */
	//  116  253:iload           6
	//  117  255:iload           7
	//  118  257:icmpge          307
		s1 = ((String) (obj));
	//  119  260:aload           9
	//  120  262:astore_3        
		contentvalues = ((ContentValues) (obj));
	//  121  263:aload           9
	//  122  265:astore_2        
		sqlitestatement = ((SQLiteStatement) (obj));
	//  123  266:aload           9
	//  124  268:astore          8
		DatabaseUtils.bindObjectToProgram(((SQLiteProgram) (obj)), i, ((java.util.Map.Entry)((Iterator) (obj1)).next()).getValue());
	//  125  270:aload           9
	//  126  272:iload           5
	//  127  274:aload           10
	//  128  276:invokeinterface #320 <Method Object Iterator.next()>
	//  129  281:checkcast       #322 <Class java.util.Map$Entry>
	//  130  284:invokeinterface #999 <Method Object java.util.Map$Entry.getValue()>
	//  131  289:invokestatic    #889 <Method void DatabaseUtils.bindObjectToProgram(SQLiteProgram, int, Object)>
		i++;
	//  132  292:iload           5
	//  133  294:iconst_1        
	//  134  295:iadd            
	//  135  296:istore          5
		j++;
	//  136  298:iload           6
	//  137  300:iconst_1        
	//  138  301:iadd            
	//  139  302:istore          6
		if(true) goto _L2; else goto _L1
	//  140  304:goto            253
_L1:
		if(as == null) goto _L4; else goto _L3
	//  141  307:aload           4
	//  142  309:ifnull          374
_L3:
		s1 = ((String) (obj));
	//  143  312:aload           9
	//  144  314:astore_3        
		contentvalues = ((ContentValues) (obj));
	//  145  315:aload           9
	//  146  317:astore_2        
		sqlitestatement = ((SQLiteStatement) (obj));
	//  147  318:aload           9
	//  148  320:astore          8
		k = as.length;
	//  149  322:aload           4
	//  150  324:arraylength     
	//  151  325:istore          7
		j = 0;
	//  152  327:iconst_0        
	//  153  328:istore          6
_L5:
		if(j >= k)
			break; /* Loop/switch isn't completed */
	//  154  330:iload           6
	//  155  332:iload           7
	//  156  334:icmpge          374
		s1 = ((String) (obj));
	//  157  337:aload           9
	//  158  339:astore_3        
		contentvalues = ((ContentValues) (obj));
	//  159  340:aload           9
	//  160  342:astore_2        
		sqlitestatement = ((SQLiteStatement) (obj));
	//  161  343:aload           9
	//  162  345:astore          8
		((SQLiteStatement) (obj)).bindString(i, as[j]);
	//  163  347:aload           9
	//  164  349:iload           5
	//  165  351:aload           4
	//  166  353:iload           6
	//  167  355:aaload          
	//  168  356:invokevirtual   #1177 <Method void SQLiteStatement.bindString(int, String)>
		i++;
	//  169  359:iload           5
	//  170  361:iconst_1        
	//  171  362:iadd            
	//  172  363:istore          5
		j++;
	//  173  365:iload           6
	//  174  367:iconst_1        
	//  175  368:iadd            
	//  176  369:istore          6
		if(true) goto _L5; else goto _L4
	//  177  371:goto            330
_L4:
		s1 = ((String) (obj));
	//  178  374:aload           9
	//  179  376:astore_3        
		contentvalues = ((ContentValues) (obj));
	//  180  377:aload           9
	//  181  379:astore_2        
		sqlitestatement = ((SQLiteStatement) (obj));
	//  182  380:aload           9
	//  183  382:astore          8
		((SQLiteStatement) (obj)).execute();
	//  184  384:aload           9
	//  185  386:invokevirtual   #892 <Method void SQLiteStatement.execute()>
		s1 = ((String) (obj));
	//  186  389:aload           9
	//  187  391:astore_3        
		contentvalues = ((ContentValues) (obj));
	//  188  392:aload           9
	//  189  394:astore_2        
		sqlitestatement = ((SQLiteStatement) (obj));
	//  190  395:aload           9
	//  191  397:astore          8
		i = lastChangeCount();
	//  192  399:aload_0         
	//  193  400:invokevirtual   #895 <Method int lastChangeCount()>
	//  194  403:istore          5
		s1 = ((String) (obj));
	//  195  405:aload           9
	//  196  407:astore_3        
		contentvalues = ((ContentValues) (obj));
	//  197  408:aload           9
	//  198  410:astore_2        
		sqlitestatement = ((SQLiteStatement) (obj));
	//  199  411:aload           9
	//  200  413:astore          8
		if(!Log.isLoggable("Database", 2))
			break MISSING_BLOCK_LABEL_471;
	//  201  415:ldc1            #69  <String "Database">
	//  202  417:iconst_2        
	//  203  418:invokestatic    #245 <Method boolean Log.isLoggable(String, int)>
	//  204  421:ifeq            471
		s1 = ((String) (obj));
	//  205  424:aload           9
	//  206  426:astore_3        
		contentvalues = ((ContentValues) (obj));
	//  207  427:aload           9
	//  208  429:astore_2        
		sqlitestatement = ((SQLiteStatement) (obj));
	//  209  430:aload           9
	//  210  432:astore          8
		Log.v("Database", (new StringBuilder()).append("Updated ").append(i).append(" rows using <redacted values> and <redacted sql> for ").append(s).toString());
	//  211  434:ldc1            #69  <String "Database">
	//  212  436:new             #258 <Class StringBuilder>
	//  213  439:dup             
	//  214  440:invokespecial   #259 <Method void StringBuilder()>
	//  215  443:ldc2            #1179 <String "Updated ">
	//  216  446:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  217  449:iload           5
	//  218  451:invokevirtual   #275 <Method StringBuilder StringBuilder.append(int)>
	//  219  454:ldc2            #1181 <String " rows using <redacted values> and <redacted sql> for ">
	//  220  457:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  221  460:aload_1         
	//  222  461:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  223  464:invokevirtual   #281 <Method String StringBuilder.toString()>
	//  224  467:invokestatic    #814 <Method int Log.v(String, String)>
	//  225  470:pop             
		if(obj != null)
	//* 226  471:aload           9
	//* 227  473:ifnull          481
			((SQLiteStatement) (obj)).close();
	//  228  476:aload           9
	//  229  478:invokevirtual   #514 <Method void SQLiteStatement.close()>
		unlock();
	//  230  481:aload_0         
	//  231  482:invokevirtual   #669 <Method void unlock()>
		return i;
	//  232  485:iload           5
	//  233  487:ireturn         
		s;
	//  234  488:astore_1        
		contentvalues = ((ContentValues) (s1));
	//  235  489:aload_3         
	//  236  490:astore_2        
		onCorruption();
	//  237  491:aload_0         
	//  238  492:invokevirtual   #897 <Method void onCorruption()>
		contentvalues = ((ContentValues) (s1));
	//  239  495:aload_3         
	//  240  496:astore_2        
		throw s;
	//  241  497:aload_1         
	//  242  498:athrow          
		s;
	//  243  499:astore_1        
		if(contentvalues != null)
	//* 244  500:aload_2         
	//* 245  501:ifnull          508
			((SQLiteStatement) (contentvalues)).close();
	//  246  504:aload_2         
	//  247  505:invokevirtual   #514 <Method void SQLiteStatement.close()>
		unlock();
	//  248  508:aload_0         
	//  249  509:invokevirtual   #669 <Method void unlock()>
		throw s;
	//  250  512:aload_1         
	//  251  513:athrow          
		s1;
	//  252  514:astore_3        
		contentvalues = ((ContentValues) (sqlitestatement));
	//  253  515:aload           8
	//  254  517:astore_2        
		Log.e("Database", (new StringBuilder()).append("Error updating <redacted values> using <redacted sql> for ").append(s).toString());
	//  255  518:ldc1            #69  <String "Database">
	//  256  520:new             #258 <Class StringBuilder>
	//  257  523:dup             
	//  258  524:invokespecial   #259 <Method void StringBuilder()>
	//  259  527:ldc2            #1183 <String "Error updating <redacted values> using <redacted sql> for ">
	//  260  530:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  261  533:aload_1         
	//  262  534:invokevirtual   #265 <Method StringBuilder StringBuilder.append(String)>
	//  263  537:invokevirtual   #281 <Method String StringBuilder.toString()>
	//  264  540:invokestatic    #1012 <Method int Log.e(String, String)>
	//  265  543:pop             
		contentvalues = ((ContentValues) (sqlitestatement));
	//  266  544:aload           8
	//  267  546:astore_2        
		throw s1;
	//  268  547:aload_3         
	//  269  548:athrow          
	}

	public boolean yieldIfContended()
	{
		if(!isOpen())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #403 <Method boolean isOpen()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return yieldIfContendedHelper(false, -1L);
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:ldc2w           #968 <Long -1L>
	//    8   14:invokespecial   #1187 <Method boolean yieldIfContendedHelper(boolean, long)>
	//    9   17:ireturn         
	}

	public boolean yieldIfContendedSafely()
	{
		if(!isOpen())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #403 <Method boolean isOpen()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return yieldIfContendedHelper(true, -1L);
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:ldc2w           #968 <Long -1L>
	//    8   14:invokespecial   #1187 <Method boolean yieldIfContendedHelper(boolean, long)>
	//    9   17:ireturn         
	}

	public boolean yieldIfContendedSafely(long l)
	{
		if(!isOpen())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #403 <Method boolean isOpen()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return yieldIfContendedHelper(true, l);
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:lload_1         
	//    8   12:invokespecial   #1187 <Method boolean yieldIfContendedHelper(boolean, long)>
	//    9   15:ireturn         
	}

	private static final String COMMIT_SQL = "COMMIT;";
	public static final int CONFLICT_ABORT = 2;
	public static final int CONFLICT_FAIL = 3;
	public static final int CONFLICT_IGNORE = 4;
	public static final int CONFLICT_NONE = 0;
	public static final int CONFLICT_REPLACE = 5;
	public static final int CONFLICT_ROLLBACK = 1;
	private static final String CONFLICT_VALUES[] = {
		"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "
	};
	public static final int CREATE_IF_NECESSARY = 0x10000000;
	private static final Pattern EMAIL_IN_DB_PATTERN = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");
	private static final int EVENT_DB_CORRUPT = 0x124fc;
	private static final int EVENT_DB_OPERATION = 52000;
	static final String GET_LOCK_LOG_PREFIX = "GETLOCK:";
	private static final int LOCK_ACQUIRED_WARNING_THREAD_TIME_IN_MS = 100;
	private static final int LOCK_ACQUIRED_WARNING_TIME_IN_MS = 300;
	private static final int LOCK_ACQUIRED_WARNING_TIME_IN_MS_ALWAYS_PRINT = 2000;
	private static final int LOCK_WARNING_WINDOW_IN_MS = 20000;
	private static final String LOG_SLOW_QUERIES_PROPERTY = "db.log.slow_query_threshold";
	public static final int MAX_SQL_CACHE_SIZE = 250;
	private static final int MAX_WARNINGS_ON_CACHESIZE_CONDITION = 1;
	public static final int NO_LOCALIZED_COLLATORS = 16;
	public static final int OPEN_READONLY = 1;
	public static final int OPEN_READWRITE = 0;
	private static final int OPEN_READ_MASK = 1;
	private static final int QUERY_LOG_SQL_LENGTH = 64;
	private static final int SLEEP_AFTER_YIELD_QUANTUM = 1000;
	public static final String SQLCIPHER_ANDROID_VERSION = "3.3.1-2";
	public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
	private static final String TAG = "Database";
	private static WeakHashMap sActiveDatabases = new WeakHashMap();
	private static int sQueryLogTimeInMillis = 0;
	private int mCacheFullWarnings;
	Map mCompiledQueries;
	private final DatabaseErrorHandler mErrorHandler;
	private CursorFactory mFactory;
	private int mFlags;
	private boolean mInnerTransactionIsSuccessful;
	private long mLastLockMessageTime;
	private String mLastSqlStatement;
	private final ReentrantLock mLock;
	private long mLockAcquiredThreadTime;
	private long mLockAcquiredWallTime;
	private boolean mLockingEnabled;
	private int mMaxSqlCacheSize;
	int mNativeHandle;
	private int mNumCacheHits;
	private int mNumCacheMisses;
	private String mPath;
	private String mPathForLogs;
	private WeakHashMap mPrograms;
	private final Random mRandom;
	private final int mSlowQueryThreshold;
	private Throwable mStackTrace;
	private final Map mSyncUpdateInfo;
	int mTempTableSequence;
	private String mTimeClosed;
	private String mTimeOpened;
	private boolean mTransactionIsSuccessful;
	private SQLiteTransactionListener mTransactionListener;

	static 
	{
	//    0    0:new             #117 <Class WeakHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void WeakHashMap()>
	//    3    7:putstatic       #122 <Field WeakHashMap sActiveDatabases>
	//    4   10:bipush          6
	//    5   12:anewarray       String[]
	//    6   15:dup             
	//    7   16:iconst_0        
	//    8   17:ldc1            #126 <String "">
	//    9   19:aastore         
	//   10   20:dup             
	//   11   21:iconst_1        
	//   12   22:ldc1            #128 <String " OR ROLLBACK ">
	//   13   24:aastore         
	//   14   25:dup             
	//   15   26:iconst_2        
	//   16   27:ldc1            #130 <String " OR ABORT ">
	//   17   29:aastore         
	//   18   30:dup             
	//   19   31:iconst_3        
	//   20   32:ldc1            #132 <String " OR FAIL ">
	//   21   34:aastore         
	//   22   35:dup             
	//   23   36:iconst_4        
	//   24   37:ldc1            #134 <String " OR IGNORE ">
	//   25   39:aastore         
	//   26   40:dup             
	//   27   41:iconst_5        
	//   28   42:ldc1            #136 <String " OR REPLACE ">
	//   29   44:aastore         
	//   30   45:putstatic       #138 <Field String[] CONFLICT_VALUES>
	//   31   48:ldc1            #140 <String "[\\w\\.\\-]+@[\\w\\.\\-]+">
	//   32   50:invokestatic    #146 <Method Pattern Pattern.compile(String)>
	//   33   53:putstatic       #148 <Field Pattern EMAIL_IN_DB_PATTERN>
	//   34   56:iconst_0        
	//   35   57:putstatic       #150 <Field int sQueryLogTimeInMillis>
	//*  36   60:return          
	}

	// Unreferenced inner class net/sqlcipher/database/SQLiteDatabase$CursorFactory
	/* block-local class not found */
	class CursorFactory {}

}
