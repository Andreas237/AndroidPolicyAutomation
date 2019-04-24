// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.persistentQueue.sqlite;

import android.database.Cursor;
import android.database.sqlite.*;
import com.birbit.android.jobqueue.*;
import com.birbit.android.jobqueue.config.Configuration;
import com.birbit.android.jobqueue.log.JqLog;
import java.io.*;
import java.util.*;

// Referenced classes of package com.birbit.android.jobqueue.persistentQueue.sqlite:
//			FileStorage, WhereQueryCache, DbOpenHelper, SqlHelper, 
//			Where

public class SqliteJobQueue
	implements JobQueue
{
	static class InvalidJobException extends Exception
	{

		InvalidJobException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void Exception(String)>
		//    3    5:return          
		}

		InvalidJobException(String s, Throwable throwable)
		{
			super(s, throwable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #15  <Method void Exception(String, Throwable)>
		//    4    6:return          
		}
	}

	public static class JavaSerializer
		implements JobSerializer
	{

		public Job deserialize(byte abyte0[])
			throws IOException, ClassNotFoundException
		{
			if(abyte0 != null && abyte0.length != 0) goto _L2; else goto _L1
		//    0    0:aload_1         
		//    1    1:ifnull          9
		//    2    4:aload_1         
		//    3    5:arraylength     
		//    4    6:ifne            13
_L1:
			abyte0 = null;
		//    5    9:aconst_null     
		//    6   10:astore_1        
_L4:
			return ((Job) (abyte0));
		//    7   11:aload_1         
		//    8   12:areturn         
_L2:
			Job job = null;
		//    9   13:aconst_null     
		//   10   14:astore_3        
			Object obj = ((Object) (new ObjectInputStream(((java.io.InputStream) (new ByteArrayInputStream(abyte0))))));
		//   11   15:new             #22  <Class ObjectInputStream>
		//   12   18:dup             
		//   13   19:new             #24  <Class ByteArrayInputStream>
		//   14   22:dup             
		//   15   23:aload_1         
		//   16   24:invokespecial   #27  <Method void ByteArrayInputStream(byte[])>
		//   17   27:invokespecial   #30  <Method void ObjectInputStream(java.io.InputStream)>
		//   18   30:astore_2        
			job = (Job)((ObjectInputStream) (obj)).readObject();
		//   19   31:aload_2         
		//   20   32:invokevirtual   #34  <Method Object ObjectInputStream.readObject()>
		//   21   35:checkcast       #36  <Class Job>
		//   22   38:astore_3        
			abyte0 = ((byte []) (job));
		//   23   39:aload_3         
		//   24   40:astore_1        
			if(obj == null) goto _L4; else goto _L3
		//   25   41:aload_2         
		//   26   42:ifnull          11
_L3:
			((ObjectInputStream) (obj)).close();
		//   27   45:aload_2         
		//   28   46:invokevirtual   #39  <Method void ObjectInputStream.close()>
			return job;
		//   29   49:aload_3         
		//   30   50:areturn         
			obj;
		//   31   51:astore_2        
			abyte0 = ((byte []) (job));
		//   32   52:aload_3         
		//   33   53:astore_1        
_L6:
			if(abyte0 != null)
		//*  34   54:aload_1         
		//*  35   55:ifnull          62
				((ObjectInputStream) (abyte0)).close();
		//   36   58:aload_1         
		//   37   59:invokevirtual   #39  <Method void ObjectInputStream.close()>
			throw obj;
		//   38   62:aload_2         
		//   39   63:athrow          
			Exception exception;
			exception;
		//   40   64:astore_3        
			abyte0 = ((byte []) (obj));
		//   41   65:aload_2         
		//   42   66:astore_1        
			obj = ((Object) (exception));
		//   43   67:aload_3         
		//   44   68:astore_2        
			if(true) goto _L6; else goto _L5
		//   45   69:goto            54
_L5:
		}

		public byte[] serialize(Object obj)
			throws IOException
		{
			if(obj != null) goto _L2; else goto _L1
		//    0    0:aload_1         
		//    1    1:ifnonnull       8
_L1:
			obj = null;
		//    2    4:aconst_null     
		//    3    5:astore_1        
_L4:
			return ((byte []) (obj));
		//    4    6:aload_1         
		//    5    7:areturn         
_L2:
			Object obj1 = null;
		//    6    8:aconst_null     
		//    7    9:astore          4
			ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
		//    8   11:new             #46  <Class ByteArrayOutputStream>
		//    9   14:dup             
		//   10   15:invokespecial   #47  <Method void ByteArrayOutputStream()>
		//   11   18:astore_3        
			byte abyte0[];
			((ObjectOutput) (new ObjectOutputStream(((java.io.OutputStream) (bytearrayoutputstream))))).writeObject(obj);
		//   12   19:new             #49  <Class ObjectOutputStream>
		//   13   22:dup             
		//   14   23:aload_3         
		//   15   24:invokespecial   #52  <Method void ObjectOutputStream(java.io.OutputStream)>
		//   16   27:aload_1         
		//   17   28:invokeinterface #58  <Method void ObjectOutput.writeObject(Object)>
			abyte0 = bytearrayoutputstream.toByteArray();
		//   18   33:aload_3         
		//   19   34:invokevirtual   #62  <Method byte[] ByteArrayOutputStream.toByteArray()>
		//   20   37:astore_2        
			obj = ((Object) (abyte0));
		//   21   38:aload_2         
		//   22   39:astore_1        
			if(bytearrayoutputstream == null) goto _L4; else goto _L3
		//   23   40:aload_3         
		//   24   41:ifnull          6
_L3:
			bytearrayoutputstream.close();
		//   25   44:aload_3         
		//   26   45:invokevirtual   #63  <Method void ByteArrayOutputStream.close()>
			return abyte0;
		//   27   48:aload_2         
		//   28   49:areturn         
			Exception exception;
			exception;
		//   29   50:astore_2        
			obj = ((Object) (obj1));
		//   30   51:aload           4
		//   31   53:astore_1        
_L6:
			if(obj != null)
		//*  32   54:aload_1         
		//*  33   55:ifnull          62
				((ByteArrayOutputStream) (obj)).close();
		//   34   58:aload_1         
		//   35   59:invokevirtual   #63  <Method void ByteArrayOutputStream.close()>
			throw exception;
		//   36   62:aload_2         
		//   37   63:athrow          
			exception;
		//   38   64:astore_2        
			obj = ((Object) (bytearrayoutputstream));
		//   39   65:aload_3         
		//   40   66:astore_1        
			if(true) goto _L6; else goto _L5
		//   41   67:goto            54
_L5:
		}

		public JavaSerializer()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface JobSerializer
	{

		public abstract Job deserialize(byte abyte0[])
			throws IOException, ClassNotFoundException;

		public abstract byte[] serialize(Object obj)
			throws IOException;
	}


	public SqliteJobQueue(Configuration configuration, long l, JobSerializer jobserializer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #38  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void StringBuilder()>
	//    6   12:putfield        #41  <Field StringBuilder reusedStringBuilder>
		sessionId = l;
	//    7   15:aload_0         
	//    8   16:lload_2         
	//    9   17:putfield        #43  <Field long sessionId>
		jobStorage = new FileStorage(configuration.getAppContext(), (new StringBuilder()).append("jobs_").append(configuration.getId()).toString());
	//   10   20:aload_0         
	//   11   21:new             #45  <Class FileStorage>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokevirtual   #51  <Method android.content.Context Configuration.getAppContext()>
	//   15   29:new             #38  <Class StringBuilder>
	//   16   32:dup             
	//   17   33:invokespecial   #39  <Method void StringBuilder()>
	//   18   36:ldc1            #53  <String "jobs_">
	//   19   38:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:aload_1         
	//   21   42:invokevirtual   #61  <Method String Configuration.getId()>
	//   22   45:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   23   48:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   24   51:invokespecial   #67  <Method void FileStorage(android.content.Context, String)>
	//   25   54:putfield        #69  <Field FileStorage jobStorage>
		whereQueryCache = new WhereQueryCache(l);
	//   26   57:aload_0         
	//   27   58:new             #71  <Class WhereQueryCache>
	//   28   61:dup             
	//   29   62:lload_2         
	//   30   63:invokespecial   #74  <Method void WhereQueryCache(long)>
	//   31   66:putfield        #76  <Field WhereQueryCache whereQueryCache>
		android.content.Context context = configuration.getAppContext();
	//   32   69:aload_1         
	//   33   70:invokevirtual   #51  <Method android.content.Context Configuration.getAppContext()>
	//   34   73:astore          6
		String s;
		if(configuration.isInTestMode())
	//*  35   75:aload_1         
	//*  36   76:invokevirtual   #80  <Method boolean Configuration.isInTestMode()>
	//*  37   79:ifeq            172
			s = null;
	//   38   82:aconst_null     
	//   39   83:astore          5
		else
	//*  40   85:aload_0         
	//*  41   86:new             #82  <Class DbOpenHelper>
	//*  42   89:dup             
	//*  43   90:aload           6
	//*  44   92:aload           5
	//*  45   94:invokespecial   #83  <Method void DbOpenHelper(android.content.Context, String)>
	//*  46   97:putfield        #85  <Field DbOpenHelper dbOpenHelper>
	//*  47  100:aload_0         
	//*  48  101:aload_0         
	//*  49  102:getfield        #85  <Field DbOpenHelper dbOpenHelper>
	//*  50  105:invokevirtual   #89  <Method SQLiteDatabase DbOpenHelper.getWritableDatabase()>
	//*  51  108:putfield        #91  <Field SQLiteDatabase db>
	//*  52  111:aload_0         
	//*  53  112:new             #93  <Class SqlHelper>
	//*  54  115:dup             
	//*  55  116:aload_0         
	//*  56  117:getfield        #91  <Field SQLiteDatabase db>
	//*  57  120:ldc1            #95  <String "job_holder">
	//*  58  122:getstatic       #99  <Field SqlHelper$Property DbOpenHelper.ID_COLUMN>
	//*  59  125:getfield        #105 <Field String SqlHelper$Property.columnName>
	//*  60  128:bipush          12
	//*  61  130:ldc1            #107 <String "job_holder_tags">
	//*  62  132:iconst_3        
	//*  63  133:lload_2         
	//*  64  134:invokespecial   #110 <Method void SqlHelper(SQLiteDatabase, String, String, int, String, int, long)>
	//*  65  137:putfield        #112 <Field SqlHelper sqlHelper>
	//*  66  140:aload_0         
	//*  67  141:aload           4
	//*  68  143:putfield        #114 <Field SqliteJobQueue$JobSerializer jobSerializer>
	//*  69  146:aload_1         
	//*  70  147:invokevirtual   #117 <Method boolean Configuration.resetDelaysOnRestart()>
	//*  71  150:ifeq            163
	//*  72  153:aload_0         
	//*  73  154:getfield        #112 <Field SqlHelper sqlHelper>
	//*  74  157:ldc2w           #118 <Long 0x0L>
	//*  75  160:invokevirtual   #122 <Method void SqlHelper.resetDelayTimesTo(long)>
	//*  76  163:aload_0         
	//*  77  164:invokespecial   #125 <Method void reEnablePendingCancellations()>
	//*  78  167:aload_0         
	//*  79  168:invokespecial   #128 <Method void cleanupFiles()>
	//*  80  171:return          
			s = (new StringBuilder()).append("db_").append(configuration.getId()).toString();
	//   81  172:new             #38  <Class StringBuilder>
	//   82  175:dup             
	//   83  176:invokespecial   #39  <Method void StringBuilder()>
	//   84  179:ldc1            #130 <String "db_">
	//   85  181:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   86  184:aload_1         
	//   87  185:invokevirtual   #61  <Method String Configuration.getId()>
	//   88  188:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   89  191:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   90  194:astore          5
		dbOpenHelper = new DbOpenHelper(context, s);
		db = dbOpenHelper.getWritableDatabase();
		sqlHelper = new SqlHelper(db, "job_holder", DbOpenHelper.ID_COLUMN.columnName, 12, "job_holder_tags", 3, l);
		jobSerializer = jobserializer;
		if(configuration.resetDelaysOnRestart())
			sqlHelper.resetDelayTimesTo(0x0L);
		reEnablePendingCancellations();
		cleanupFiles();
	//*  91  196:goto            85
	}

	private void bindTag(SQLiteStatement sqlitestatement, String s, String s1)
	{
		sqlitestatement.bindString(DbOpenHelper.TAGS_JOB_ID_COLUMN.columnIndex + 1, s);
	//    0    0:aload_1         
	//    1    1:getstatic       #136 <Field SqlHelper$Property DbOpenHelper.TAGS_JOB_ID_COLUMN>
	//    2    4:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//    3    7:iconst_1        
	//    4    8:iadd            
	//    5    9:aload_2         
	//    6   10:invokevirtual   #146 <Method void SQLiteStatement.bindString(int, String)>
		sqlitestatement.bindString(DbOpenHelper.TAGS_NAME_COLUMN.columnIndex + 1, s1);
	//    7   13:aload_1         
	//    8   14:getstatic       #149 <Field SqlHelper$Property DbOpenHelper.TAGS_NAME_COLUMN>
	//    9   17:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:aload_3         
	//   13   23:invokevirtual   #146 <Method void SQLiteStatement.bindString(int, String)>
	//   14   26:return          
	}

	private void bindValues(SQLiteStatement sqlitestatement, JobHolder jobholder)
	{
		long l1 = 1L;
	//    0    0:lconst_1        
	//    1    1:lstore          6
		if(jobholder.getInsertionOrder() != null)
	//*   2    3:aload_2         
	//*   3    4:invokevirtual   #157 <Method Long JobHolder.getInsertionOrder()>
	//*   4    7:ifnull          29
			sqlitestatement.bindLong(DbOpenHelper.INSERTION_ORDER_COLUMN.columnIndex + 1, jobholder.getInsertionOrder().longValue());
	//    5   10:aload_1         
	//    6   11:getstatic       #160 <Field SqlHelper$Property DbOpenHelper.INSERTION_ORDER_COLUMN>
	//    7   14:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//    8   17:iconst_1        
	//    9   18:iadd            
	//   10   19:aload_2         
	//   11   20:invokevirtual   #157 <Method Long JobHolder.getInsertionOrder()>
	//   12   23:invokevirtual   #166 <Method long Long.longValue()>
	//   13   26:invokevirtual   #170 <Method void SQLiteStatement.bindLong(int, long)>
		sqlitestatement.bindString(DbOpenHelper.ID_COLUMN.columnIndex + 1, jobholder.getId());
	//   14   29:aload_1         
	//   15   30:getstatic       #99  <Field SqlHelper$Property DbOpenHelper.ID_COLUMN>
	//   16   33:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//   17   36:iconst_1        
	//   18   37:iadd            
	//   19   38:aload_2         
	//   20   39:invokevirtual   #171 <Method String JobHolder.getId()>
	//   21   42:invokevirtual   #146 <Method void SQLiteStatement.bindString(int, String)>
		sqlitestatement.bindLong(DbOpenHelper.PRIORITY_COLUMN.columnIndex + 1, jobholder.getPriority());
	//   22   45:aload_1         
	//   23   46:getstatic       #174 <Field SqlHelper$Property DbOpenHelper.PRIORITY_COLUMN>
	//   24   49:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//   25   52:iconst_1        
	//   26   53:iadd            
	//   27   54:aload_2         
	//   28   55:invokevirtual   #178 <Method int JobHolder.getPriority()>
	//   29   58:i2l             
	//   30   59:invokevirtual   #170 <Method void SQLiteStatement.bindLong(int, long)>
		if(jobholder.getGroupId() != null)
	//*  31   62:aload_2         
	//*  32   63:invokevirtual   #181 <Method String JobHolder.getGroupId()>
	//*  33   66:ifnull          85
			sqlitestatement.bindString(DbOpenHelper.GROUP_ID_COLUMN.columnIndex + 1, jobholder.getGroupId());
	//   34   69:aload_1         
	//   35   70:getstatic       #184 <Field SqlHelper$Property DbOpenHelper.GROUP_ID_COLUMN>
	//   36   73:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//   37   76:iconst_1        
	//   38   77:iadd            
	//   39   78:aload_2         
	//   40   79:invokevirtual   #181 <Method String JobHolder.getGroupId()>
	//   41   82:invokevirtual   #146 <Method void SQLiteStatement.bindString(int, String)>
		sqlitestatement.bindLong(DbOpenHelper.RUN_COUNT_COLUMN.columnIndex + 1, jobholder.getRunCount());
	//   42   85:aload_1         
	//   43   86:getstatic       #187 <Field SqlHelper$Property DbOpenHelper.RUN_COUNT_COLUMN>
	//   44   89:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//   45   92:iconst_1        
	//   46   93:iadd            
	//   47   94:aload_2         
	//   48   95:invokevirtual   #190 <Method int JobHolder.getRunCount()>
	//   49   98:i2l             
	//   50   99:invokevirtual   #170 <Method void SQLiteStatement.bindLong(int, long)>
		sqlitestatement.bindLong(DbOpenHelper.CREATED_NS_COLUMN.columnIndex + 1, jobholder.getCreatedNs());
	//   51  102:aload_1         
	//   52  103:getstatic       #193 <Field SqlHelper$Property DbOpenHelper.CREATED_NS_COLUMN>
	//   53  106:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//   54  109:iconst_1        
	//   55  110:iadd            
	//   56  111:aload_2         
	//   57  112:invokevirtual   #196 <Method long JobHolder.getCreatedNs()>
	//   58  115:invokevirtual   #170 <Method void SQLiteStatement.bindLong(int, long)>
		sqlitestatement.bindLong(DbOpenHelper.DELAY_UNTIL_NS_COLUMN.columnIndex + 1, jobholder.getDelayUntilNs());
	//   59  118:aload_1         
	//   60  119:getstatic       #199 <Field SqlHelper$Property DbOpenHelper.DELAY_UNTIL_NS_COLUMN>
	//   61  122:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//   62  125:iconst_1        
	//   63  126:iadd            
	//   64  127:aload_2         
	//   65  128:invokevirtual   #202 <Method long JobHolder.getDelayUntilNs()>
	//   66  131:invokevirtual   #170 <Method void SQLiteStatement.bindLong(int, long)>
		sqlitestatement.bindLong(DbOpenHelper.RUNNING_SESSION_ID_COLUMN.columnIndex + 1, jobholder.getRunningSessionId());
	//   67  134:aload_1         
	//   68  135:getstatic       #205 <Field SqlHelper$Property DbOpenHelper.RUNNING_SESSION_ID_COLUMN>
	//   69  138:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//   70  141:iconst_1        
	//   71  142:iadd            
	//   72  143:aload_2         
	//   73  144:invokevirtual   #208 <Method long JobHolder.getRunningSessionId()>
	//   74  147:invokevirtual   #170 <Method void SQLiteStatement.bindLong(int, long)>
		sqlitestatement.bindLong(DbOpenHelper.REQUIRED_NETWORK_TYPE_COLUMN.columnIndex + 1, jobholder.getRequiredNetworkType());
	//   75  150:aload_1         
	//   76  151:getstatic       #211 <Field SqlHelper$Property DbOpenHelper.REQUIRED_NETWORK_TYPE_COLUMN>
	//   77  154:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//   78  157:iconst_1        
	//   79  158:iadd            
	//   80  159:aload_2         
	//   81  160:invokevirtual   #214 <Method int JobHolder.getRequiredNetworkType()>
	//   82  163:i2l             
	//   83  164:invokevirtual   #170 <Method void SQLiteStatement.bindLong(int, long)>
		sqlitestatement.bindLong(DbOpenHelper.DEADLINE_COLUMN.columnIndex + 1, jobholder.getDeadlineNs());
	//   84  167:aload_1         
	//   85  168:getstatic       #217 <Field SqlHelper$Property DbOpenHelper.DEADLINE_COLUMN>
	//   86  171:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//   87  174:iconst_1        
	//   88  175:iadd            
	//   89  176:aload_2         
	//   90  177:invokevirtual   #220 <Method long JobHolder.getDeadlineNs()>
	//   91  180:invokevirtual   #170 <Method void SQLiteStatement.bindLong(int, long)>
		int i = DbOpenHelper.CANCEL_ON_DEADLINE_COLUMN.columnIndex;
	//   92  183:getstatic       #223 <Field SqlHelper$Property DbOpenHelper.CANCEL_ON_DEADLINE_COLUMN>
	//   93  186:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//   94  189:istore_3        
		long l;
		if(jobholder.shouldCancelOnDeadline())
	//*  95  190:aload_2         
	//*  96  191:invokevirtual   #226 <Method boolean JobHolder.shouldCancelOnDeadline()>
	//*  97  194:ifeq            237
			l = 1L;
	//   98  197:lconst_1        
	//   99  198:lstore          4
		else
	//* 100  200:aload_1         
	//* 101  201:iload_3         
	//* 102  202:iconst_1        
	//* 103  203:iadd            
	//* 104  204:lload           4
	//* 105  206:invokevirtual   #170 <Method void SQLiteStatement.bindLong(int, long)>
	//* 106  209:getstatic       #229 <Field SqlHelper$Property DbOpenHelper.CANCELLED_COLUMN>
	//* 107  212:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//* 108  215:istore_3        
	//* 109  216:aload_2         
	//* 110  217:invokevirtual   #232 <Method boolean JobHolder.isCancelled()>
	//* 111  220:ifeq            243
	//* 112  223:lload           6
	//* 113  225:lstore          4
	//* 114  227:aload_1         
	//* 115  228:iload_3         
	//* 116  229:iconst_1        
	//* 117  230:iadd            
	//* 118  231:lload           4
	//* 119  233:invokevirtual   #170 <Method void SQLiteStatement.bindLong(int, long)>
	//* 120  236:return          
			l = 0L;
	//  121  237:lconst_0        
	//  122  238:lstore          4
		sqlitestatement.bindLong(i + 1, l);
		i = DbOpenHelper.CANCELLED_COLUMN.columnIndex;
		if(jobholder.isCancelled())
			l = l1;
		else
	//* 123  240:goto            200
			l = 0L;
	//  124  243:lconst_0        
	//  125  244:lstore          4
		sqlitestatement.bindLong(i + 1, l);
	//* 126  246:goto            227
	}

	private void cleanupFiles()
	{
		Cursor cursor;
		Object obj;
		cursor = db.rawQuery(sqlHelper.LOAD_ALL_IDS_QUERY, ((String []) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field SQLiteDatabase db>
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field SqlHelper sqlHelper>
	//    4    8:getfield        #235 <Field String SqlHelper.LOAD_ALL_IDS_QUERY>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #241 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//    7   15:astore_1        
		obj = ((Object) (new HashSet()));
	//    8   16:new             #243 <Class HashSet>
	//    9   19:dup             
	//   10   20:invokespecial   #244 <Method void HashSet()>
	//   11   23:astore_2        
		for(; cursor.moveToNext(); ((Set) (obj)).add(((Object) (cursor.getString(0)))));
	//   12   24:aload_1         
	//   13   25:invokeinterface #249 <Method boolean Cursor.moveToNext()>
	//   14   30:ifeq            59
	//   15   33:aload_2         
	//   16   34:aload_1         
	//   17   35:iconst_0        
	//   18   36:invokeinterface #253 <Method String Cursor.getString(int)>
	//   19   41:invokeinterface #259 <Method boolean Set.add(Object)>
	//   20   46:pop             
		break MISSING_BLOCK_LABEL_59;
	//   21   47:goto            24
		obj;
	//   22   50:astore_2        
		cursor.close();
	//   23   51:aload_1         
	//   24   52:invokeinterface #262 <Method void Cursor.close()>
		throw obj;
	//   25   57:aload_2         
	//   26   58:athrow          
		cursor.close();
	//   27   59:aload_1         
	//   28   60:invokeinterface #262 <Method void Cursor.close()>
		jobStorage.truncateExcept(((Set) (obj)));
	//   29   65:aload_0         
	//   30   66:getfield        #69  <Field FileStorage jobStorage>
	//   31   69:aload_2         
	//   32   70:invokevirtual   #266 <Method void FileStorage.truncateExcept(Set)>
		return;
	//   33   73:return          
	}

	private JobHolder createJobHolderFromCursor(Cursor cursor)
		throws InvalidJobException
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		Object obj = ((Object) (cursor.getString(DbOpenHelper.ID_COLUMN.columnIndex)));
	//    2    2:aload_1         
	//    3    3:getstatic       #99  <Field SqlHelper$Property DbOpenHelper.ID_COLUMN>
	//    4    6:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//    5    9:invokeinterface #253 <Method String Cursor.getString(int)>
	//    6   14:astore          5
		Job job;
		try
		{
			job = safeDeserialize(jobStorage.load(((String) (obj))));
	//    7   16:aload_0         
	//    8   17:aload_0         
	//    9   18:getfield        #69  <Field FileStorage jobStorage>
	//   10   21:aload           5
	//   11   23:invokevirtual   #274 <Method byte[] FileStorage.load(String)>
	//   12   26:invokespecial   #278 <Method Job safeDeserialize(byte[])>
	//   13   29:astore          6
		}
	//*  14   31:aload           6
	//*  15   33:ifnonnull       60
	//*  16   36:new             #8   <Class SqliteJobQueue$InvalidJobException>
	//*  17   39:dup             
	//*  18   40:ldc2            #280 <String "null job">
	//*  19   43:invokespecial   #283 <Method void SqliteJobQueue$InvalidJobException(String)>
	//*  20   46:athrow          
		// Misplaced declaration of an exception variable
		catch(Cursor cursor)
	//*  21   47:astore_1        
		{
			throw new InvalidJobException("cannot load job from disk", ((Throwable) (cursor)));
	//   22   48:new             #8   <Class SqliteJobQueue$InvalidJobException>
	//   23   51:dup             
	//   24   52:ldc2            #285 <String "cannot load job from disk">
	//   25   55:aload_1         
	//   26   56:invokespecial   #288 <Method void SqliteJobQueue$InvalidJobException(String, Throwable)>
	//   27   59:athrow          
		}
		if(job == null)
			throw new InvalidJobException("null job");
		Set set = loadTags(((String) (obj)));
	//   28   60:aload_0         
	//   29   61:aload           5
	//   30   63:invokespecial   #292 <Method Set loadTags(String)>
	//   31   66:astore          7
		obj = ((Object) ((new com.birbit.android.jobqueue.JobHolder.Builder()).insertionOrder(cursor.getLong(DbOpenHelper.INSERTION_ORDER_COLUMN.columnIndex)).priority(cursor.getInt(DbOpenHelper.PRIORITY_COLUMN.columnIndex)).groupId(cursor.getString(DbOpenHelper.GROUP_ID_COLUMN.columnIndex)).runCount(cursor.getInt(DbOpenHelper.RUN_COUNT_COLUMN.columnIndex)).job(job).id(((String) (obj))).tags(set).persistent(true)));
	//   32   68:new             #294 <Class com.birbit.android.jobqueue.JobHolder$Builder>
	//   33   71:dup             
	//   34   72:invokespecial   #295 <Method void com.birbit.android.jobqueue.JobHolder$Builder()>
	//   35   75:aload_1         
	//   36   76:getstatic       #160 <Field SqlHelper$Property DbOpenHelper.INSERTION_ORDER_COLUMN>
	//   37   79:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//   38   82:invokeinterface #299 <Method long Cursor.getLong(int)>
	//   39   87:invokevirtual   #303 <Method com.birbit.android.jobqueue.JobHolder$Builder com.birbit.android.jobqueue.JobHolder$Builder.insertionOrder(long)>
	//   40   90:aload_1         
	//   41   91:getstatic       #174 <Field SqlHelper$Property DbOpenHelper.PRIORITY_COLUMN>
	//   42   94:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//   43   97:invokeinterface #307 <Method int Cursor.getInt(int)>
	//   44  102:invokevirtual   #311 <Method com.birbit.android.jobqueue.JobHolder$Builder com.birbit.android.jobqueue.JobHolder$Builder.priority(int)>
	//   45  105:aload_1         
	//   46  106:getstatic       #184 <Field SqlHelper$Property DbOpenHelper.GROUP_ID_COLUMN>
	//   47  109:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//   48  112:invokeinterface #253 <Method String Cursor.getString(int)>
	//   49  117:invokevirtual   #315 <Method com.birbit.android.jobqueue.JobHolder$Builder com.birbit.android.jobqueue.JobHolder$Builder.groupId(String)>
	//   50  120:aload_1         
	//   51  121:getstatic       #187 <Field SqlHelper$Property DbOpenHelper.RUN_COUNT_COLUMN>
	//   52  124:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//   53  127:invokeinterface #307 <Method int Cursor.getInt(int)>
	//   54  132:invokevirtual   #318 <Method com.birbit.android.jobqueue.JobHolder$Builder com.birbit.android.jobqueue.JobHolder$Builder.runCount(int)>
	//   55  135:aload           6
	//   56  137:invokevirtual   #322 <Method com.birbit.android.jobqueue.JobHolder$Builder com.birbit.android.jobqueue.JobHolder$Builder.job(Job)>
	//   57  140:aload           5
	//   58  142:invokevirtual   #325 <Method com.birbit.android.jobqueue.JobHolder$Builder com.birbit.android.jobqueue.JobHolder$Builder.id(String)>
	//   59  145:aload           7
	//   60  147:invokevirtual   #329 <Method com.birbit.android.jobqueue.JobHolder$Builder com.birbit.android.jobqueue.JobHolder$Builder.tags(Set)>
	//   61  150:iconst_1        
	//   62  151:invokevirtual   #333 <Method com.birbit.android.jobqueue.JobHolder$Builder com.birbit.android.jobqueue.JobHolder$Builder.persistent(boolean)>
	//   63  154:astore          5
		long l = cursor.getLong(DbOpenHelper.DEADLINE_COLUMN.columnIndex);
	//   64  156:aload_1         
	//   65  157:getstatic       #217 <Field SqlHelper$Property DbOpenHelper.DEADLINE_COLUMN>
	//   66  160:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//   67  163:invokeinterface #299 <Method long Cursor.getLong(int)>
	//   68  168:lstore_3        
		if(cursor.getInt(DbOpenHelper.CANCEL_ON_DEADLINE_COLUMN.columnIndex) != 1)
	//*  69  169:aload_1         
	//*  70  170:getstatic       #223 <Field SqlHelper$Property DbOpenHelper.CANCEL_ON_DEADLINE_COLUMN>
	//*  71  173:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//*  72  176:invokeinterface #307 <Method int Cursor.getInt(int)>
	//*  73  181:iconst_1        
	//*  74  182:icmpne          256
	//*  75  185:aload           5
	//*  76  187:lload_3         
	//*  77  188:iload_2         
	//*  78  189:invokevirtual   #337 <Method com.birbit.android.jobqueue.JobHolder$Builder com.birbit.android.jobqueue.JobHolder$Builder.deadline(long, boolean)>
	//*  79  192:aload_1         
	//*  80  193:getstatic       #193 <Field SqlHelper$Property DbOpenHelper.CREATED_NS_COLUMN>
	//*  81  196:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//*  82  199:invokeinterface #299 <Method long Cursor.getLong(int)>
	//*  83  204:invokevirtual   #340 <Method com.birbit.android.jobqueue.JobHolder$Builder com.birbit.android.jobqueue.JobHolder$Builder.createdNs(long)>
	//*  84  207:aload_1         
	//*  85  208:getstatic       #199 <Field SqlHelper$Property DbOpenHelper.DELAY_UNTIL_NS_COLUMN>
	//*  86  211:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//*  87  214:invokeinterface #299 <Method long Cursor.getLong(int)>
	//*  88  219:invokevirtual   #343 <Method com.birbit.android.jobqueue.JobHolder$Builder com.birbit.android.jobqueue.JobHolder$Builder.delayUntilNs(long)>
	//*  89  222:aload_1         
	//*  90  223:getstatic       #205 <Field SqlHelper$Property DbOpenHelper.RUNNING_SESSION_ID_COLUMN>
	//*  91  226:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//*  92  229:invokeinterface #299 <Method long Cursor.getLong(int)>
	//*  93  234:invokevirtual   #346 <Method com.birbit.android.jobqueue.JobHolder$Builder com.birbit.android.jobqueue.JobHolder$Builder.runningSessionId(long)>
	//*  94  237:aload_1         
	//*  95  238:getstatic       #211 <Field SqlHelper$Property DbOpenHelper.REQUIRED_NETWORK_TYPE_COLUMN>
	//*  96  241:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//*  97  244:invokeinterface #307 <Method int Cursor.getInt(int)>
	//*  98  249:invokevirtual   #349 <Method com.birbit.android.jobqueue.JobHolder$Builder com.birbit.android.jobqueue.JobHolder$Builder.requiredNetworkType(int)>
	//*  99  252:invokevirtual   #353 <Method JobHolder com.birbit.android.jobqueue.JobHolder$Builder.build()>
	//* 100  255:areturn         
			flag = false;
	//  101  256:iconst_0        
	//  102  257:istore_2        
		return ((com.birbit.android.jobqueue.JobHolder.Builder) (obj)).deadline(l, flag).createdNs(cursor.getLong(DbOpenHelper.CREATED_NS_COLUMN.columnIndex)).delayUntilNs(cursor.getLong(DbOpenHelper.DELAY_UNTIL_NS_COLUMN.columnIndex)).runningSessionId(cursor.getLong(DbOpenHelper.RUNNING_SESSION_ID_COLUMN.columnIndex)).requiredNetworkType(cursor.getInt(DbOpenHelper.REQUIRED_NETWORK_TYPE_COLUMN.columnIndex)).build();
	//* 103  258:goto            185
	}

	private Where createWhere(Constraint constraint)
	{
		return whereQueryCache.build(constraint, reusedStringBuilder);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field WhereQueryCache whereQueryCache>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #41  <Field StringBuilder reusedStringBuilder>
	//    5    9:invokevirtual   #359 <Method Where WhereQueryCache.build(Constraint, StringBuilder)>
	//    6   12:areturn         
	}

	private void delete(String s)
	{
		db.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field SQLiteDatabase db>
	//    2    4:invokevirtual   #363 <Method void SQLiteDatabase.beginTransaction()>
		SQLiteStatement sqlitestatement = sqlHelper.getDeleteStatement();
	//    3    7:aload_0         
	//    4    8:getfield        #112 <Field SqlHelper sqlHelper>
	//    5   11:invokevirtual   #367 <Method SQLiteStatement SqlHelper.getDeleteStatement()>
	//    6   14:astore_2        
		sqlitestatement.clearBindings();
	//    7   15:aload_2         
	//    8   16:invokevirtual   #370 <Method void SQLiteStatement.clearBindings()>
		sqlitestatement.bindString(1, s);
	//    9   19:aload_2         
	//   10   20:iconst_1        
	//   11   21:aload_1         
	//   12   22:invokevirtual   #146 <Method void SQLiteStatement.bindString(int, String)>
		sqlitestatement.execute();
	//   13   25:aload_2         
	//   14   26:invokevirtual   #373 <Method void SQLiteStatement.execute()>
		sqlitestatement = sqlHelper.getDeleteJobTagsStatement();
	//   15   29:aload_0         
	//   16   30:getfield        #112 <Field SqlHelper sqlHelper>
	//   17   33:invokevirtual   #376 <Method SQLiteStatement SqlHelper.getDeleteJobTagsStatement()>
	//   18   36:astore_2        
		sqlitestatement.bindString(1, s);
	//   19   37:aload_2         
	//   20   38:iconst_1        
	//   21   39:aload_1         
	//   22   40:invokevirtual   #146 <Method void SQLiteStatement.bindString(int, String)>
		sqlitestatement.execute();
	//   23   43:aload_2         
	//   24   44:invokevirtual   #373 <Method void SQLiteStatement.execute()>
		db.setTransactionSuccessful();
	//   25   47:aload_0         
	//   26   48:getfield        #91  <Field SQLiteDatabase db>
	//   27   51:invokevirtual   #379 <Method void SQLiteDatabase.setTransactionSuccessful()>
		jobStorage.delete(s);
	//   28   54:aload_0         
	//   29   55:getfield        #69  <Field FileStorage jobStorage>
	//   30   58:aload_1         
	//   31   59:invokevirtual   #381 <Method void FileStorage.delete(String)>
		db.endTransaction();
	//   32   62:aload_0         
	//   33   63:getfield        #91  <Field SQLiteDatabase db>
	//   34   66:invokevirtual   #384 <Method void SQLiteDatabase.endTransaction()>
		return;
	//   35   69:return          
		s;
	//   36   70:astore_1        
		db.endTransaction();
	//   37   71:aload_0         
	//   38   72:getfield        #91  <Field SQLiteDatabase db>
	//   39   75:invokevirtual   #384 <Method void SQLiteDatabase.endTransaction()>
		throw s;
	//   40   78:aload_1         
	//   41   79:athrow          
	}

	private boolean insertWithTags(JobHolder jobholder)
	{
		SQLiteStatement sqlitestatement;
		SQLiteStatement sqlitestatement1;
		sqlitestatement1 = sqlHelper.getInsertStatement();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field SqlHelper sqlHelper>
	//    2    4:invokevirtual   #391 <Method SQLiteStatement SqlHelper.getInsertStatement()>
	//    3    7:astore          6
		sqlitestatement = sqlHelper.getInsertTagsStatement();
	//    4    9:aload_0         
	//    5   10:getfield        #112 <Field SqlHelper sqlHelper>
	//    6   13:invokevirtual   #394 <Method SQLiteStatement SqlHelper.getInsertTagsStatement()>
	//    7   16:astore          5
		db.beginTransaction();
	//    8   18:aload_0         
	//    9   19:getfield        #91  <Field SQLiteDatabase db>
	//   10   22:invokevirtual   #363 <Method void SQLiteDatabase.beginTransaction()>
		long l;
		sqlitestatement1.clearBindings();
	//   11   25:aload           6
	//   12   27:invokevirtual   #370 <Method void SQLiteStatement.clearBindings()>
		bindValues(sqlitestatement1, jobholder);
	//   13   30:aload_0         
	//   14   31:aload           6
	//   15   33:aload_1         
	//   16   34:invokespecial   #396 <Method void bindValues(SQLiteStatement, JobHolder)>
		l = sqlitestatement1.executeInsert();
	//   17   37:aload           6
	//   18   39:invokevirtual   #399 <Method long SQLiteStatement.executeInsert()>
	//   19   42:lstore_3        
		boolean flag;
		if(l != -1L)
	//*  20   43:lload_3         
	//*  21   44:ldc2w           #400 <Long -1L>
	//*  22   47:lcmp            
	//*  23   48:ifeq            66
			flag = true;
	//   24   51:iconst_1        
	//   25   52:istore_2        
		else
	//*  26   53:iload_2         
	//*  27   54:ifne            71
	//*  28   57:aload_0         
	//*  29   58:getfield        #91  <Field SQLiteDatabase db>
	//*  30   61:invokevirtual   #384 <Method void SQLiteDatabase.endTransaction()>
	//*  31   64:iconst_0        
	//*  32   65:ireturn         
			flag = false;
	//   33   66:iconst_0        
	//   34   67:istore_2        
		if(!flag)
		{
			db.endTransaction();
			return false;
		}
	//*  35   68:goto            53
		try
		{
			for(Iterator iterator = jobholder.getTags().iterator(); iterator.hasNext(); sqlitestatement.executeInsert())
	//*  36   71:aload_1         
	//*  37   72:invokevirtual   #405 <Method Set JobHolder.getTags()>
	//*  38   75:invokeinterface #409 <Method Iterator Set.iterator()>
	//*  39   80:astore          6
	//*  40   82:aload           6
	//*  41   84:invokeinterface #414 <Method boolean Iterator.hasNext()>
	//*  42   89:ifeq            151
			{
				String s = (String)iterator.next();
	//   43   92:aload           6
	//   44   94:invokeinterface #418 <Method Object Iterator.next()>
	//   45   99:checkcast       #420 <Class String>
	//   46  102:astore          7
				sqlitestatement.clearBindings();
	//   47  104:aload           5
	//   48  106:invokevirtual   #370 <Method void SQLiteStatement.clearBindings()>
				bindTag(sqlitestatement, jobholder.getId(), s);
	//   49  109:aload_0         
	//   50  110:aload           5
	//   51  112:aload_1         
	//   52  113:invokevirtual   #171 <Method String JobHolder.getId()>
	//   53  116:aload           7
	//   54  118:invokespecial   #422 <Method void bindTag(SQLiteStatement, String, String)>
			}

	//   55  121:aload           5
	//   56  123:invokevirtual   #399 <Method long SQLiteStatement.executeInsert()>
	//   57  126:pop2            
			break MISSING_BLOCK_LABEL_151;
	//   58  127:goto            82
		}
		// Misplaced declaration of an exception variable
		catch(JobHolder jobholder) { }
	//   59  130:astore_1        
		JqLog.e(((Throwable) (jobholder)), "error while inserting job with tags", new Object[0]);
	//   60  131:aload_1         
	//   61  132:ldc2            #424 <String "error while inserting job with tags">
	//   62  135:iconst_0        
	//   63  136:anewarray       Object[]
	//   64  139:invokestatic    #430 <Method void JqLog.e(Throwable, String, Object[])>
		db.endTransaction();
	//   65  142:aload_0         
	//   66  143:getfield        #91  <Field SQLiteDatabase db>
	//   67  146:invokevirtual   #384 <Method void SQLiteDatabase.endTransaction()>
		return false;
	//   68  149:iconst_0        
	//   69  150:ireturn         
		db.setTransactionSuccessful();
	//   70  151:aload_0         
	//   71  152:getfield        #91  <Field SQLiteDatabase db>
	//   72  155:invokevirtual   #379 <Method void SQLiteDatabase.setTransactionSuccessful()>
		db.endTransaction();
	//   73  158:aload_0         
	//   74  159:getfield        #91  <Field SQLiteDatabase db>
	//   75  162:invokevirtual   #384 <Method void SQLiteDatabase.endTransaction()>
		return true;
	//   76  165:iconst_1        
	//   77  166:ireturn         
		jobholder;
	//   78  167:astore_1        
		db.endTransaction();
	//   79  168:aload_0         
	//   80  169:getfield        #91  <Field SQLiteDatabase db>
	//   81  172:invokevirtual   #384 <Method void SQLiteDatabase.endTransaction()>
		throw jobholder;
	//   82  175:aload_1         
	//   83  176:athrow          
	}

	private Set loadTags(String s)
	{
		s = ((String) (db.rawQuery(sqlHelper.LOAD_TAGS_QUERY, new String[] {
			s
		})));
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field SQLiteDatabase db>
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field SqlHelper sqlHelper>
	//    4    8:getfield        #433 <Field String SqlHelper.LOAD_TAGS_QUERY>
	//    5   11:iconst_1        
	//    6   12:anewarray       String[]
	//    7   15:dup             
	//    8   16:iconst_0        
	//    9   17:aload_1         
	//   10   18:aastore         
	//   11   19:invokevirtual   #241 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   12   22:astore_1        
		Object obj;
		if(((Cursor) (s)).getCount() != 0)
			break MISSING_BLOCK_LABEL_44;
	//   13   23:aload_1         
	//   14   24:invokeinterface #436 <Method int Cursor.getCount()>
	//   15   29:ifne            44
		obj = ((Object) (Collections.EMPTY_SET));
	//   16   32:getstatic       #442 <Field Set Collections.EMPTY_SET>
	//   17   35:astore_2        
		((Cursor) (s)).close();
	//   18   36:aload_1         
	//   19   37:invokeinterface #262 <Method void Cursor.close()>
		return ((Set) (obj));
	//   20   42:aload_2         
	//   21   43:areturn         
		obj = ((Object) (new HashSet()));
	//   22   44:new             #243 <Class HashSet>
	//   23   47:dup             
	//   24   48:invokespecial   #244 <Method void HashSet()>
	//   25   51:astore_2        
		for(; ((Cursor) (s)).moveToNext(); ((Set) (obj)).add(((Object) (((Cursor) (s)).getString(0)))));
	//   26   52:aload_1         
	//   27   53:invokeinterface #249 <Method boolean Cursor.moveToNext()>
	//   28   58:ifeq            87
	//   29   61:aload_2         
	//   30   62:aload_1         
	//   31   63:iconst_0        
	//   32   64:invokeinterface #253 <Method String Cursor.getString(int)>
	//   33   69:invokeinterface #259 <Method boolean Set.add(Object)>
	//   34   74:pop             
		break MISSING_BLOCK_LABEL_87;
	//   35   75:goto            52
		obj;
	//   36   78:astore_2        
		((Cursor) (s)).close();
	//   37   79:aload_1         
	//   38   80:invokeinterface #262 <Method void Cursor.close()>
		throw obj;
	//   39   85:aload_2         
	//   40   86:athrow          
		((Cursor) (s)).close();
	//   41   87:aload_1         
	//   42   88:invokeinterface #262 <Method void Cursor.close()>
		return ((Set) (obj));
	//   43   93:aload_2         
	//   44   94:areturn         
	}

	private void persistJobToDisk(JobHolder jobholder)
	{
		try
		{
			jobStorage.save(jobholder.getId(), jobSerializer.serialize(((Object) (jobholder.getJob()))));
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field FileStorage jobStorage>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #171 <Method String JobHolder.getId()>
	//    4    8:aload_0         
	//    5    9:getfield        #114 <Field SqliteJobQueue$JobSerializer jobSerializer>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #451 <Method Job JobHolder.getJob()>
	//    8   16:invokeinterface #455 <Method byte[] SqliteJobQueue$JobSerializer.serialize(Object)>
	//    9   21:invokevirtual   #459 <Method void FileStorage.save(String, byte[])>
			return;
	//   10   24:return          
		}
		// Misplaced declaration of an exception variable
		catch(JobHolder jobholder)
	//*  11   25:astore_1        
		{
			throw new RuntimeException("cannot save job to disk", ((Throwable) (jobholder)));
	//   12   26:new             #461 <Class RuntimeException>
	//   13   29:dup             
	//   14   30:ldc2            #463 <String "cannot save job to disk">
	//   15   33:aload_1         
	//   16   34:invokespecial   #464 <Method void RuntimeException(String, Throwable)>
	//   17   37:athrow          
		}
	}

	private void reEnablePendingCancellations()
	{
		db.execSQL(sqlHelper.RE_ENABLE_PENDING_CANCELLATIONS_QUERY);
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field SQLiteDatabase db>
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field SqlHelper sqlHelper>
	//    4    8:getfield        #468 <Field String SqlHelper.RE_ENABLE_PENDING_CANCELLATIONS_QUERY>
	//    5   11:invokevirtual   #471 <Method void SQLiteDatabase.execSQL(String)>
	//    6   14:return          
	}

	private Job safeDeserialize(byte abyte0[])
	{
		try
		{
			abyte0 = ((byte []) (jobSerializer.deserialize(abyte0)));
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field SqliteJobQueue$JobSerializer jobSerializer>
	//    2    4:aload_1         
	//    3    5:invokeinterface #474 <Method Job SqliteJobQueue$JobSerializer.deserialize(byte[])>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*   7   13:astore_1        
		{
			JqLog.e(((Throwable) (abyte0)), "error while deserializing job", new Object[0]);
	//    8   14:aload_1         
	//    9   15:ldc2            #476 <String "error while deserializing job">
	//   10   18:iconst_0        
	//   11   19:anewarray       Object[]
	//   12   22:invokestatic    #430 <Method void JqLog.e(Throwable, String, Object[])>
			return null;
	//   13   25:aconst_null     
	//   14   26:areturn         
		}
		return ((Job) (abyte0));
	}

	private void setSessionIdOnJob(JobHolder jobholder)
	{
		SQLiteStatement sqlitestatement = sqlHelper.getOnJobFetchedForRunningStatement();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field SqlHelper sqlHelper>
	//    2    4:invokevirtual   #480 <Method SQLiteStatement SqlHelper.getOnJobFetchedForRunningStatement()>
	//    3    7:astore_2        
		jobholder.setRunCount(jobholder.getRunCount() + 1);
	//    4    8:aload_1         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #190 <Method int JobHolder.getRunCount()>
	//    7   13:iconst_1        
	//    8   14:iadd            
	//    9   15:invokevirtual   #484 <Method void JobHolder.setRunCount(int)>
		jobholder.setRunningSessionId(sessionId);
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #43  <Field long sessionId>
	//   13   23:invokevirtual   #487 <Method void JobHolder.setRunningSessionId(long)>
		sqlitestatement.clearBindings();
	//   14   26:aload_2         
	//   15   27:invokevirtual   #370 <Method void SQLiteStatement.clearBindings()>
		sqlitestatement.bindLong(1, jobholder.getRunCount());
	//   16   30:aload_2         
	//   17   31:iconst_1        
	//   18   32:aload_1         
	//   19   33:invokevirtual   #190 <Method int JobHolder.getRunCount()>
	//   20   36:i2l             
	//   21   37:invokevirtual   #170 <Method void SQLiteStatement.bindLong(int, long)>
		sqlitestatement.bindLong(2, sessionId);
	//   22   40:aload_2         
	//   23   41:iconst_2        
	//   24   42:aload_0         
	//   25   43:getfield        #43  <Field long sessionId>
	//   26   46:invokevirtual   #170 <Method void SQLiteStatement.bindLong(int, long)>
		sqlitestatement.bindString(3, jobholder.getId());
	//   27   49:aload_2         
	//   28   50:iconst_3        
	//   29   51:aload_1         
	//   30   52:invokevirtual   #171 <Method String JobHolder.getId()>
	//   31   55:invokevirtual   #146 <Method void SQLiteStatement.bindString(int, String)>
		sqlitestatement.execute();
	//   32   58:aload_2         
	//   33   59:invokevirtual   #373 <Method void SQLiteStatement.execute()>
	//   34   62:return          
	}

	public void clear()
	{
		sqlHelper.truncate();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field SqlHelper sqlHelper>
	//    2    4:invokevirtual   #491 <Method void SqlHelper.truncate()>
		cleanupFiles();
	//    3    7:aload_0         
	//    4    8:invokespecial   #128 <Method void cleanupFiles()>
	//    5   11:return          
	}

	public int count()
	{
		SQLiteStatement sqlitestatement = sqlHelper.getCountStatement();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field SqlHelper sqlHelper>
	//    2    4:invokevirtual   #495 <Method SQLiteStatement SqlHelper.getCountStatement()>
	//    3    7:astore_1        
		sqlitestatement.clearBindings();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #370 <Method void SQLiteStatement.clearBindings()>
		sqlitestatement.bindLong(1, sessionId);
	//    6   12:aload_1         
	//    7   13:iconst_1        
	//    8   14:aload_0         
	//    9   15:getfield        #43  <Field long sessionId>
	//   10   18:invokevirtual   #170 <Method void SQLiteStatement.bindLong(int, long)>
		return (int)sqlitestatement.simpleQueryForLong();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #498 <Method long SQLiteStatement.simpleQueryForLong()>
	//   13   25:l2i             
	//   14   26:ireturn         
	}

	public int countReadyJobs(Constraint constraint)
	{
		return (int)createWhere(constraint).countReady(db, reusedStringBuilder).simpleQueryForLong();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #502 <Method Where createWhere(Constraint)>
	//    3    5:aload_0         
	//    4    6:getfield        #91  <Field SQLiteDatabase db>
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field StringBuilder reusedStringBuilder>
	//    7   13:invokevirtual   #508 <Method SQLiteStatement Where.countReady(SQLiteDatabase, StringBuilder)>
	//    8   16:invokevirtual   #498 <Method long SQLiteStatement.simpleQueryForLong()>
	//    9   19:l2i             
	//   10   20:ireturn         
	}

	public JobHolder findJobById(String s)
	{
		s = ((String) (db.rawQuery(sqlHelper.FIND_BY_ID_QUERY, new String[] {
			s
		})));
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field SQLiteDatabase db>
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field SqlHelper sqlHelper>
	//    4    8:getfield        #513 <Field String SqlHelper.FIND_BY_ID_QUERY>
	//    5   11:iconst_1        
	//    6   12:anewarray       String[]
	//    7   15:dup             
	//    8   16:iconst_0        
	//    9   17:aload_1         
	//   10   18:aastore         
	//   11   19:invokevirtual   #241 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   12   22:astore_1        
		boolean flag = ((Cursor) (s)).moveToFirst();
	//   13   23:aload_1         
	//   14   24:invokeinterface #516 <Method boolean Cursor.moveToFirst()>
	//   15   29:istore_2        
		if(!flag)
	//*  16   30:iload_2         
	//*  17   31:ifne            42
		{
			((Cursor) (s)).close();
	//   18   34:aload_1         
	//   19   35:invokeinterface #262 <Method void Cursor.close()>
			return null;
	//   20   40:aconst_null     
	//   21   41:areturn         
		}
		JobHolder jobholder = createJobHolderFromCursor(((Cursor) (s)));
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:invokespecial   #518 <Method JobHolder createJobHolderFromCursor(Cursor)>
	//   25   47:astore_3        
		((Cursor) (s)).close();
	//   26   48:aload_1         
	//   27   49:invokeinterface #262 <Method void Cursor.close()>
		return jobholder;
	//   28   54:aload_3         
	//   29   55:areturn         
		Object obj;
		obj;
	//   30   56:astore_3        
		JqLog.e(((Throwable) (obj)), "invalid job on findJobById", new Object[0]);
	//   31   57:aload_3         
	//   32   58:ldc2            #520 <String "invalid job on findJobById">
	//   33   61:iconst_0        
	//   34   62:anewarray       Object[]
	//   35   65:invokestatic    #430 <Method void JqLog.e(Throwable, String, Object[])>
		((Cursor) (s)).close();
	//   36   68:aload_1         
	//   37   69:invokeinterface #262 <Method void Cursor.close()>
		return null;
	//   38   74:aconst_null     
	//   39   75:areturn         
		obj;
	//   40   76:astore_3        
		((Cursor) (s)).close();
	//   41   77:aload_1         
	//   42   78:invokeinterface #262 <Method void Cursor.close()>
		throw obj;
	//   43   83:aload_3         
	//   44   84:athrow          
	}

	public Set findJobs(Constraint constraint)
	{
		Object obj;
		constraint = ((Constraint) (createWhere(constraint)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #502 <Method Where createWhere(Constraint)>
	//    3    5:astore_1        
		obj = ((Object) (((Where) (constraint)).findJobs(sqlHelper)));
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #112 <Field SqlHelper sqlHelper>
	//    7   11:invokevirtual   #525 <Method String Where.findJobs(SqlHelper)>
	//    8   14:astore_2        
		constraint = ((Constraint) (db.rawQuery(((String) (obj)), ((Where) (constraint)).args)));
	//    9   15:aload_0         
	//   10   16:getfield        #91  <Field SQLiteDatabase db>
	//   11   19:aload_2         
	//   12   20:aload_1         
	//   13   21:getfield        #529 <Field String[] Where.args>
	//   14   24:invokevirtual   #241 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   15   27:astore_1        
		obj = ((Object) (new HashSet()));
	//   16   28:new             #243 <Class HashSet>
	//   17   31:dup             
	//   18   32:invokespecial   #244 <Method void HashSet()>
	//   19   35:astore_2        
		for(; ((Cursor) (constraint)).moveToNext(); ((Set) (obj)).add(((Object) (createJobHolderFromCursor(((Cursor) (constraint)))))));
	//   20   36:aload_1         
	//   21   37:invokeinterface #249 <Method boolean Cursor.moveToNext()>
	//   22   42:ifeq            80
	//   23   45:aload_2         
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:invokespecial   #518 <Method JobHolder createJobHolderFromCursor(Cursor)>
	//   27   51:invokeinterface #259 <Method boolean Set.add(Object)>
	//   28   56:pop             
		break MISSING_BLOCK_LABEL_80;
	//   29   57:goto            36
		InvalidJobException invalidjobexception;
		invalidjobexception;
	//   30   60:astore_3        
		JqLog.e(((Throwable) (invalidjobexception)), "invalid job found by tags.", new Object[0]);
	//   31   61:aload_3         
	//   32   62:ldc2            #531 <String "invalid job found by tags.">
	//   33   65:iconst_0        
	//   34   66:anewarray       Object[]
	//   35   69:invokestatic    #430 <Method void JqLog.e(Throwable, String, Object[])>
		((Cursor) (constraint)).close();
	//   36   72:aload_1         
	//   37   73:invokeinterface #262 <Method void Cursor.close()>
		return ((Set) (obj));
	//   38   78:aload_2         
	//   39   79:areturn         
		((Cursor) (constraint)).close();
	//   40   80:aload_1         
	//   41   81:invokeinterface #262 <Method void Cursor.close()>
		return ((Set) (obj));
	//   42   86:aload_2         
	//   43   87:areturn         
		Exception exception;
		exception;
	//   44   88:astore_2        
		((Cursor) (constraint)).close();
	//   45   89:aload_1         
	//   46   90:invokeinterface #262 <Method void Cursor.close()>
		throw exception;
	//   47   95:aload_2         
	//   48   96:athrow          
	}

	public SQLiteDatabase getDb()
	{
		return db;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field SQLiteDatabase db>
	//    2    4:areturn         
	}

	public Long getNextJobDelayUntilNs(Constraint constraint)
	{
		constraint = ((Constraint) (createWhere(constraint)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #502 <Method Where createWhere(Constraint)>
	//    3    5:astore_1        
		long l;
		try
		{
			l = ((Where) (constraint)).nextJobDelayUntil(db, sqlHelper).simpleQueryForLong();
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #91  <Field SQLiteDatabase db>
	//    7   11:aload_0         
	//    8   12:getfield        #112 <Field SqlHelper sqlHelper>
	//    9   15:invokevirtual   #542 <Method SQLiteStatement Where.nextJobDelayUntil(SQLiteDatabase, SqlHelper)>
	//   10   18:invokevirtual   #498 <Method long SQLiteStatement.simpleQueryForLong()>
	//   11   21:lstore_2        
		}
	//*  12   22:lload_2         
	//*  13   23:ldc2w           #543 <Long 0xffffffffL>
	//*  14   26:lcmp            
	//*  15   27:ifne            32
	//*  16   30:aconst_null     
	//*  17   31:areturn         
	//*  18   32:lload_2         
	//*  19   33:invokestatic    #548 <Method Long Long.valueOf(long)>
	//*  20   36:areturn         
		// Misplaced declaration of an exception variable
		catch(Constraint constraint)
	//*  21   37:astore_1        
		{
			return null;
	//   22   38:aconst_null     
	//   23   39:areturn         
		}
		if(l == 0xffffffffL)
			return null;
		else
			return Long.valueOf(l);
	}

	public boolean insert(JobHolder jobholder)
	{
		persistJobToDisk(jobholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #551 <Method void persistJobToDisk(JobHolder)>
		if(jobholder.hasTags())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #554 <Method boolean JobHolder.hasTags()>
	//*   5    9:ifeq            18
			return insertWithTags(jobholder);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #556 <Method boolean insertWithTags(JobHolder)>
	//    9   17:ireturn         
		SQLiteStatement sqlitestatement = sqlHelper.getInsertStatement();
	//   10   18:aload_0         
	//   11   19:getfield        #112 <Field SqlHelper sqlHelper>
	//   12   22:invokevirtual   #391 <Method SQLiteStatement SqlHelper.getInsertStatement()>
	//   13   25:astore          4
		sqlitestatement.clearBindings();
	//   14   27:aload           4
	//   15   29:invokevirtual   #370 <Method void SQLiteStatement.clearBindings()>
		bindValues(sqlitestatement, jobholder);
	//   16   32:aload_0         
	//   17   33:aload           4
	//   18   35:aload_1         
	//   19   36:invokespecial   #396 <Method void bindValues(SQLiteStatement, JobHolder)>
		long l = sqlitestatement.executeInsert();
	//   20   39:aload           4
	//   21   41:invokevirtual   #399 <Method long SQLiteStatement.executeInsert()>
	//   22   44:lstore_2        
		jobholder.setInsertionOrder(l);
	//   23   45:aload_1         
	//   24   46:lload_2         
	//   25   47:invokevirtual   #559 <Method void JobHolder.setInsertionOrder(long)>
		return l != -1L;
	//   26   50:lload_2         
	//   27   51:ldc2w           #400 <Long -1L>
	//   28   54:lcmp            
	//   29   55:ifeq            60
	//   30   58:iconst_1        
	//   31   59:ireturn         
	//   32   60:iconst_0        
	//   33   61:ireturn         
	}

	public boolean insertOrReplace(JobHolder jobholder)
	{
		if(jobholder.getInsertionOrder() == null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #157 <Method Long JobHolder.getInsertionOrder()>
	//*   2    4:ifnonnull       13
			return insert(jobholder);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #562 <Method boolean insert(JobHolder)>
	//    6   12:ireturn         
		persistJobToDisk(jobholder);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #551 <Method void persistJobToDisk(JobHolder)>
		jobholder.setRunningSessionId(0x0L);
	//   10   18:aload_1         
	//   11   19:ldc2w           #118 <Long 0x0L>
	//   12   22:invokevirtual   #487 <Method void JobHolder.setRunningSessionId(long)>
		SQLiteStatement sqlitestatement = sqlHelper.getInsertOrReplaceStatement();
	//   13   25:aload_0         
	//   14   26:getfield        #112 <Field SqlHelper sqlHelper>
	//   15   29:invokevirtual   #565 <Method SQLiteStatement SqlHelper.getInsertOrReplaceStatement()>
	//   16   32:astore_3        
		sqlitestatement.clearBindings();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #370 <Method void SQLiteStatement.clearBindings()>
		bindValues(sqlitestatement, jobholder);
	//   19   37:aload_0         
	//   20   38:aload_3         
	//   21   39:aload_1         
	//   22   40:invokespecial   #396 <Method void bindValues(SQLiteStatement, JobHolder)>
		boolean flag;
		if(sqlitestatement.executeInsert() != -1L)
	//*  23   43:aload_3         
	//*  24   44:invokevirtual   #399 <Method long SQLiteStatement.executeInsert()>
	//*  25   47:ldc2w           #400 <Long -1L>
	//*  26   50:lcmp            
	//*  27   51:ifeq            75
			flag = true;
	//   28   54:iconst_1        
	//   29   55:istore_2        
		else
	//*  30   56:ldc2            #567 <String "reinsert job result %s">
	//*  31   59:iconst_1        
	//*  32   60:anewarray       Object[]
	//*  33   63:dup             
	//*  34   64:iconst_0        
	//*  35   65:iload_2         
	//*  36   66:invokestatic    #572 <Method Boolean Boolean.valueOf(boolean)>
	//*  37   69:aastore         
	//*  38   70:invokestatic    #576 <Method void JqLog.d(String, Object[])>
	//*  39   73:iload_2         
	//*  40   74:ireturn         
			flag = false;
	//   41   75:iconst_0        
	//   42   76:istore_2        
		JqLog.d("reinsert job result %s", new Object[] {
			Boolean.valueOf(flag)
		});
		return flag;
	//*  43   77:goto            56
	}

	public String logJobs()
	{
		Object obj;
		Object obj1;
		obj1 = ((Object) (new StringBuilder()));
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void StringBuilder()>
	//    3    7:astore_3        
		obj = ((Object) (sqlHelper.createSelect(((String) (null)), Integer.valueOf(100), new SqlHelper.Order[] {
			new SqlHelper.Order(DbOpenHelper.PRIORITY_COLUMN, SqlHelper.Order.Type.DESC), new SqlHelper.Order(DbOpenHelper.CREATED_NS_COLUMN, SqlHelper.Order.Type.ASC), new SqlHelper.Order(DbOpenHelper.INSERTION_ORDER_COLUMN, SqlHelper.Order.Type.ASC)
		})));
	//    4    8:aload_0         
	//    5    9:getfield        #112 <Field SqlHelper sqlHelper>
	//    6   12:aconst_null     
	//    7   13:bipush          100
	//    8   15:invokestatic    #582 <Method Integer Integer.valueOf(int)>
	//    9   18:iconst_3        
	//   10   19:anewarray       SqlHelper.Order[]
	//   11   22:dup             
	//   12   23:iconst_0        
	//   13   24:new             #584 <Class SqlHelper$Order>
	//   14   27:dup             
	//   15   28:getstatic       #174 <Field SqlHelper$Property DbOpenHelper.PRIORITY_COLUMN>
	//   16   31:getstatic       #590 <Field SqlHelper$Order$Type SqlHelper$Order$Type.DESC>
	//   17   34:invokespecial   #593 <Method void SqlHelper$Order(SqlHelper$Property, SqlHelper$Order$Type)>
	//   18   37:aastore         
	//   19   38:dup             
	//   20   39:iconst_1        
	//   21   40:new             #584 <Class SqlHelper$Order>
	//   22   43:dup             
	//   23   44:getstatic       #193 <Field SqlHelper$Property DbOpenHelper.CREATED_NS_COLUMN>
	//   24   47:getstatic       #596 <Field SqlHelper$Order$Type SqlHelper$Order$Type.ASC>
	//   25   50:invokespecial   #593 <Method void SqlHelper$Order(SqlHelper$Property, SqlHelper$Order$Type)>
	//   26   53:aastore         
	//   27   54:dup             
	//   28   55:iconst_2        
	//   29   56:new             #584 <Class SqlHelper$Order>
	//   30   59:dup             
	//   31   60:getstatic       #160 <Field SqlHelper$Property DbOpenHelper.INSERTION_ORDER_COLUMN>
	//   32   63:getstatic       #596 <Field SqlHelper$Order$Type SqlHelper$Order$Type.ASC>
	//   33   66:invokespecial   #593 <Method void SqlHelper$Order(SqlHelper$Property, SqlHelper$Order$Type)>
	//   34   69:aastore         
	//   35   70:invokevirtual   #600 <Method String SqlHelper.createSelect(String, Integer, SqlHelper$Order[])>
	//   36   73:astore_2        
		obj = ((Object) (db.rawQuery(((String) (obj)), new String[0])));
	//   37   74:aload_0         
	//   38   75:getfield        #91  <Field SQLiteDatabase db>
	//   39   78:aload_2         
	//   40   79:iconst_0        
	//   41   80:anewarray       String[]
	//   42   83:invokevirtual   #241 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   43   86:astore_2        
_L2:
		Object obj2;
		StringBuilder stringbuilder;
		if(!((Cursor) (obj)).moveToNext())
			break; /* Loop/switch isn't completed */
	//   44   87:aload_2         
	//   45   88:invokeinterface #249 <Method boolean Cursor.moveToNext()>
	//   46   93:ifeq            424
		obj2 = ((Object) (((Cursor) (obj)).getString(DbOpenHelper.ID_COLUMN.columnIndex)));
	//   47   96:aload_2         
	//   48   97:getstatic       #99  <Field SqlHelper$Property DbOpenHelper.ID_COLUMN>
	//   49  100:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//   50  103:invokeinterface #253 <Method String Cursor.getString(int)>
	//   51  108:astore          4
		stringbuilder = ((StringBuilder) (obj1)).append(((Cursor) (obj)).getLong(DbOpenHelper.INSERTION_ORDER_COLUMN.columnIndex)).append(" ").append(((String) (obj2))).append(" id:").append(((Cursor) (obj)).getString(DbOpenHelper.GROUP_ID_COLUMN.columnIndex)).append(" deadline:").append(((Cursor) (obj)).getLong(DbOpenHelper.DEADLINE_COLUMN.columnIndex)).append(" cancelled:");
	//   52  110:aload_3         
	//   53  111:aload_2         
	//   54  112:getstatic       #160 <Field SqlHelper$Property DbOpenHelper.INSERTION_ORDER_COLUMN>
	//   55  115:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//   56  118:invokeinterface #299 <Method long Cursor.getLong(int)>
	//   57  123:invokevirtual   #603 <Method StringBuilder StringBuilder.append(long)>
	//   58  126:ldc2            #605 <String " ">
	//   59  129:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   60  132:aload           4
	//   61  134:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   62  137:ldc2            #607 <String " id:">
	//   63  140:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   64  143:aload_2         
	//   65  144:getstatic       #184 <Field SqlHelper$Property DbOpenHelper.GROUP_ID_COLUMN>
	//   66  147:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//   67  150:invokeinterface #253 <Method String Cursor.getString(int)>
	//   68  155:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   69  158:ldc2            #609 <String " deadline:">
	//   70  161:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   71  164:aload_2         
	//   72  165:getstatic       #217 <Field SqlHelper$Property DbOpenHelper.DEADLINE_COLUMN>
	//   73  168:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//   74  171:invokeinterface #299 <Method long Cursor.getLong(int)>
	//   75  176:invokevirtual   #603 <Method StringBuilder StringBuilder.append(long)>
	//   76  179:ldc2            #611 <String " cancelled:">
	//   77  182:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   78  185:astore          5
		boolean flag;
		if(((Cursor) (obj)).getInt(DbOpenHelper.CANCELLED_COLUMN.columnIndex) == 1)
	//*  79  187:aload_2         
	//*  80  188:getstatic       #229 <Field SqlHelper$Property DbOpenHelper.CANCELLED_COLUMN>
	//*  81  191:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//*  82  194:invokeinterface #307 <Method int Cursor.getInt(int)>
	//*  83  199:iconst_1        
	//*  84  200:icmpne          401
			flag = true;
	//   85  203:iconst_1        
	//   86  204:istore_1        
		else
	//*  87  205:aload           5
	//*  88  207:iload_1         
	//*  89  208:invokevirtual   #614 <Method StringBuilder StringBuilder.append(boolean)>
	//*  90  211:ldc2            #616 <String " delay until:">
	//*  91  214:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//*  92  217:aload_2         
	//*  93  218:getstatic       #199 <Field SqlHelper$Property DbOpenHelper.DELAY_UNTIL_NS_COLUMN>
	//*  94  221:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//*  95  224:invokeinterface #299 <Method long Cursor.getLong(int)>
	//*  96  229:invokevirtual   #603 <Method StringBuilder StringBuilder.append(long)>
	//*  97  232:ldc2            #618 <String " sessionId:">
	//*  98  235:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//*  99  238:aload_2         
	//* 100  239:getstatic       #205 <Field SqlHelper$Property DbOpenHelper.RUNNING_SESSION_ID_COLUMN>
	//* 101  242:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//* 102  245:invokeinterface #299 <Method long Cursor.getLong(int)>
	//* 103  250:invokevirtual   #603 <Method StringBuilder StringBuilder.append(long)>
	//* 104  253:ldc2            #620 <String " reqNetworkType:">
	//* 105  256:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//* 106  259:aload_2         
	//* 107  260:getstatic       #211 <Field SqlHelper$Property DbOpenHelper.REQUIRED_NETWORK_TYPE_COLUMN>
	//* 108  263:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//* 109  266:invokeinterface #299 <Method long Cursor.getLong(int)>
	//* 110  271:invokevirtual   #603 <Method StringBuilder StringBuilder.append(long)>
	//* 111  274:pop             
	//* 112  275:aload_0         
	//* 113  276:getfield        #91  <Field SQLiteDatabase db>
	//* 114  279:new             #38  <Class StringBuilder>
	//* 115  282:dup             
	//* 116  283:invokespecial   #39  <Method void StringBuilder()>
	//* 117  286:ldc2            #622 <String "SELECT ">
	//* 118  289:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//* 119  292:getstatic       #149 <Field SqlHelper$Property DbOpenHelper.TAGS_NAME_COLUMN>
	//* 120  295:getfield        #105 <Field String SqlHelper$Property.columnName>
	//* 121  298:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//* 122  301:ldc2            #624 <String " FROM ">
	//* 123  304:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//* 124  307:ldc1            #107 <String "job_holder_tags">
	//* 125  309:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//* 126  312:ldc2            #626 <String " WHERE ">
	//* 127  315:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//* 128  318:getstatic       #136 <Field SqlHelper$Property DbOpenHelper.TAGS_JOB_ID_COLUMN>
	//* 129  321:getfield        #105 <Field String SqlHelper$Property.columnName>
	//* 130  324:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//* 131  327:ldc2            #628 <String " = ?">
	//* 132  330:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//* 133  333:invokevirtual   #64  <Method String StringBuilder.toString()>
	//* 134  336:iconst_1        
	//* 135  337:anewarray       String[]
	//* 136  340:dup             
	//* 137  341:iconst_0        
	//* 138  342:aload           4
	//* 139  344:aastore         
	//* 140  345:invokevirtual   #241 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//* 141  348:astore          4
	//* 142  350:aload           4
	//* 143  352:invokeinterface #249 <Method boolean Cursor.moveToNext()>
	//* 144  357:ifeq            406
	//* 145  360:aload_3         
	//* 146  361:ldc2            #630 <String ", ">
	//* 147  364:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//* 148  367:aload           4
	//* 149  369:iconst_0        
	//* 150  370:invokeinterface #253 <Method String Cursor.getString(int)>
	//* 151  375:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//* 152  378:pop             
	//* 153  379:goto            350
	//* 154  382:astore_3        
	//* 155  383:aload           4
	//* 156  385:invokeinterface #262 <Method void Cursor.close()>
	//* 157  390:aload_3         
	//* 158  391:athrow          
	//* 159  392:astore_3        
	//* 160  393:aload_2         
	//* 161  394:invokeinterface #262 <Method void Cursor.close()>
	//* 162  399:aload_3         
	//* 163  400:athrow          
			flag = false;
	//  164  401:iconst_0        
	//  165  402:istore_1        
		stringbuilder.append(flag).append(" delay until:").append(((Cursor) (obj)).getLong(DbOpenHelper.DELAY_UNTIL_NS_COLUMN.columnIndex)).append(" sessionId:").append(((Cursor) (obj)).getLong(DbOpenHelper.RUNNING_SESSION_ID_COLUMN.columnIndex)).append(" reqNetworkType:").append(((Cursor) (obj)).getLong(DbOpenHelper.REQUIRED_NETWORK_TYPE_COLUMN.columnIndex));
		obj2 = ((Object) (db.rawQuery((new StringBuilder()).append("SELECT ").append(DbOpenHelper.TAGS_NAME_COLUMN.columnName).append(" FROM ").append("job_holder_tags").append(" WHERE ").append(DbOpenHelper.TAGS_JOB_ID_COLUMN.columnName).append(" = ?").toString(), new String[] {
			obj2
		})));
		while(((Cursor) (obj2)).moveToNext()) 
			((StringBuilder) (obj1)).append(", ").append(((Cursor) (obj2)).getString(0));
		break MISSING_BLOCK_LABEL_406;
		obj1;
		((Cursor) (obj2)).close();
		throw obj1;
		obj1;
		((Cursor) (obj)).close();
		throw obj1;
	//* 166  403:goto            205
		((Cursor) (obj2)).close();
	//  167  406:aload           4
	//  168  408:invokeinterface #262 <Method void Cursor.close()>
		((StringBuilder) (obj1)).append("\n");
	//  169  413:aload_3         
	//  170  414:ldc2            #632 <String "\n">
	//  171  417:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  172  420:pop             
		if(true) goto _L2; else goto _L1
	//  173  421:goto            87
_L1:
		((Cursor) (obj)).close();
	//  174  424:aload_2         
	//  175  425:invokeinterface #262 <Method void Cursor.close()>
		return ((StringBuilder) (obj1)).toString();
	//  176  430:aload_3         
	//  177  431:invokevirtual   #64  <Method String StringBuilder.toString()>
	//  178  434:areturn         
	}

	public JobHolder nextJobAndIncRunCount(Constraint constraint)
	{
		Where where;
		String s;
		where = createWhere(constraint);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #502 <Method Where createWhere(Constraint)>
	//    3    5:astore_3        
		s = where.nextJob(sqlHelper);
	//    4    6:aload_3         
	//    5    7:aload_0         
	//    6    8:getfield        #112 <Field SqlHelper sqlHelper>
	//    7   11:invokevirtual   #637 <Method String Where.nextJob(SqlHelper)>
	//    8   14:astore          4
_L2:
		constraint = ((Constraint) (db.rawQuery(s, where.args)));
	//    9   16:aload_0         
	//   10   17:getfield        #91  <Field SQLiteDatabase db>
	//   11   20:aload           4
	//   12   22:aload_3         
	//   13   23:getfield        #529 <Field String[] Where.args>
	//   14   26:invokevirtual   #241 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   15   29:astore_1        
		boolean flag = ((Cursor) (constraint)).moveToNext();
	//   16   30:aload_1         
	//   17   31:invokeinterface #249 <Method boolean Cursor.moveToNext()>
	//   18   36:istore_2        
		if(!flag)
	//*  19   37:iload_2         
	//*  20   38:ifne            49
		{
			((Cursor) (constraint)).close();
	//   21   41:aload_1         
	//   22   42:invokeinterface #262 <Method void Cursor.close()>
			return null;
	//   23   47:aconst_null     
	//   24   48:areturn         
		}
		Object obj;
		obj = ((Object) (createJobHolderFromCursor(((Cursor) (constraint)))));
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:invokespecial   #518 <Method JobHolder createJobHolderFromCursor(Cursor)>
	//   28   54:astore          5
		setSessionIdOnJob(((JobHolder) (obj)));
	//   29   56:aload_0         
	//   30   57:aload           5
	//   31   59:invokespecial   #639 <Method void setSessionIdOnJob(JobHolder)>
		((Cursor) (constraint)).close();
	//   32   62:aload_1         
	//   33   63:invokeinterface #262 <Method void Cursor.close()>
		return ((JobHolder) (obj));
	//   34   68:aload           5
	//   35   70:areturn         
		InvalidJobException invalidjobexception;
		invalidjobexception;
	//   36   71:astore          5
		invalidjobexception = ((InvalidJobException) (((Cursor) (constraint)).getString(DbOpenHelper.ID_COLUMN.columnIndex)));
	//   37   73:aload_1         
	//   38   74:getstatic       #99  <Field SqlHelper$Property DbOpenHelper.ID_COLUMN>
	//   39   77:getfield        #140 <Field int SqlHelper$Property.columnIndex>
	//   40   80:invokeinterface #253 <Method String Cursor.getString(int)>
	//   41   85:astore          5
		if(invalidjobexception != null)
			break; /* Loop/switch isn't completed */
	//   42   87:aload           5
	//   43   89:ifnonnull       111
		JqLog.e("cannot find job id on a retrieved job", new Object[0]);
	//   44   92:ldc2            #641 <String "cannot find job id on a retrieved job">
	//   45   95:iconst_0        
	//   46   96:anewarray       Object[]
	//   47   99:invokestatic    #643 <Method void JqLog.e(String, Object[])>
_L3:
		((Cursor) (constraint)).close();
	//   48  102:aload_1         
	//   49  103:invokeinterface #262 <Method void Cursor.close()>
		if(true) goto _L2; else goto _L1
	//   50  108:goto            16
_L1:
		delete(((String) (invalidjobexception)));
	//   51  111:aload_0         
	//   52  112:aload           5
	//   53  114:invokespecial   #644 <Method void delete(String)>
		  goto _L3
	//*  54  117:goto            102
		Exception exception;
		exception;
	//   55  120:astore_3        
		((Cursor) (constraint)).close();
	//   56  121:aload_1         
	//   57  122:invokeinterface #262 <Method void Cursor.close()>
		throw exception;
	//   58  127:aload_3         
	//   59  128:athrow          
	}

	public void onJobCancelled(JobHolder jobholder)
	{
		SQLiteStatement sqlitestatement = sqlHelper.getMarkAsCancelledStatement();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field SqlHelper sqlHelper>
	//    2    4:invokevirtual   #648 <Method SQLiteStatement SqlHelper.getMarkAsCancelledStatement()>
	//    3    7:astore_2        
		sqlitestatement.clearBindings();
	//    4    8:aload_2         
	//    5    9:invokevirtual   #370 <Method void SQLiteStatement.clearBindings()>
		sqlitestatement.bindString(1, jobholder.getId());
	//    6   12:aload_2         
	//    7   13:iconst_1        
	//    8   14:aload_1         
	//    9   15:invokevirtual   #171 <Method String JobHolder.getId()>
	//   10   18:invokevirtual   #146 <Method void SQLiteStatement.bindString(int, String)>
		sqlitestatement.execute();
	//   11   21:aload_2         
	//   12   22:invokevirtual   #373 <Method void SQLiteStatement.execute()>
	//   13   25:return          
	}

	public void remove(JobHolder jobholder)
	{
		delete(jobholder.getId());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #171 <Method String JobHolder.getId()>
	//    3    5:invokespecial   #644 <Method void delete(String)>
	//    4    8:return          
	}

	public void substitute(JobHolder jobholder, JobHolder jobholder1)
	{
		db.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field SQLiteDatabase db>
	//    2    4:invokevirtual   #363 <Method void SQLiteDatabase.beginTransaction()>
		remove(jobholder1);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #653 <Method void remove(JobHolder)>
		insert(jobholder);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #562 <Method boolean insert(JobHolder)>
	//    9   17:pop             
		db.setTransactionSuccessful();
	//   10   18:aload_0         
	//   11   19:getfield        #91  <Field SQLiteDatabase db>
	//   12   22:invokevirtual   #379 <Method void SQLiteDatabase.setTransactionSuccessful()>
		db.endTransaction();
	//   13   25:aload_0         
	//   14   26:getfield        #91  <Field SQLiteDatabase db>
	//   15   29:invokevirtual   #384 <Method void SQLiteDatabase.endTransaction()>
		return;
	//   16   32:return          
		jobholder;
	//   17   33:astore_1        
		db.endTransaction();
	//   18   34:aload_0         
	//   19   35:getfield        #91  <Field SQLiteDatabase db>
	//   20   38:invokevirtual   #384 <Method void SQLiteDatabase.endTransaction()>
		throw jobholder;
	//   21   41:aload_1         
	//   22   42:athrow          
	}

	private SQLiteDatabase db;
	private DbOpenHelper dbOpenHelper;
	private JobSerializer jobSerializer;
	private FileStorage jobStorage;
	private final StringBuilder reusedStringBuilder = new StringBuilder();
	private final long sessionId;
	private SqlHelper sqlHelper;
	private final WhereQueryCache whereQueryCache;
}
