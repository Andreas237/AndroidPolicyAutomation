// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.researchstack.backbone.storage.database.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import co.touchlab.squeaky.dao.Dao;
import co.touchlab.squeaky.db.sqlite.SQLiteDatabaseImpl;
import co.touchlab.squeaky.db.sqlite.SqueakyOpenHelper;
import co.touchlab.squeaky.table.TableUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.sql.SQLException;
import java.util.*;
import org.researchstack.backbone.result.StepResult;
import org.researchstack.backbone.result.TaskResult;
import org.researchstack.backbone.storage.database.*;
import org.researchstack.backbone.utils.LogExt;

public class DatabaseHelper extends SqueakyOpenHelper
	implements AppDatabase
{

	public DatabaseHelper(Context context, String s, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory, int i)
	{
		super(context, s, cursorfactory, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #17  <Method void SqueakyOpenHelper(Context, String, android.database.sqlite.SQLiteDatabase$CursorFactory, int)>
	//    6    9:return          
	}

	public TaskResult loadLatestTaskResult(String s)
	{
		LogExt.d(((Object)this).getClass(), (new StringBuilder()).append("loadTaskResults() id: ").append(s).toString());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method Class Object.getClass()>
	//    2    4:new             #30  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #33  <Method void StringBuilder()>
	//    5   11:ldc1            #35  <String "loadTaskResults() id: ">
	//    6   13:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_1         
	//    8   17:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   10   23:invokestatic    #49  <Method void LogExt.d(Class, String)>
		s = ((String) (getDao(org/researchstack/backbone/storage/database/TaskRecord).queryForEq("taskId", ((Object) (s))).orderBy("completed DESC").limit(Integer.valueOf(1)).list()));
	//   11   26:aload_0         
	//   12   27:ldc1            #51  <Class TaskRecord>
	//   13   29:invokevirtual   #55  <Method Dao getDao(Class)>
	//   14   32:ldc1            #57  <String "taskId">
	//   15   34:aload_1         
	//   16   35:invokeinterface #63  <Method co.touchlab.squeaky.dao.Dao$QueryModifiers Dao.queryForEq(String, Object)>
	//   17   40:ldc1            #65  <String "completed DESC">
	//   18   42:invokeinterface #71  <Method co.touchlab.squeaky.dao.Dao$QueryModifiers co.touchlab.squeaky.dao.Dao$QueryModifiers.orderBy(String)>
	//   19   47:iconst_1        
	//   20   48:invokestatic    #77  <Method Integer Integer.valueOf(int)>
	//   21   51:invokeinterface #81  <Method co.touchlab.squeaky.dao.Dao$QueryModifiers co.touchlab.squeaky.dao.Dao$QueryModifiers.limit(Integer)>
	//   22   56:invokeinterface #85  <Method List co.touchlab.squeaky.dao.Dao$QueryModifiers.list()>
	//   23   61:astore_1        
		if(((List) (s)).isEmpty())
	//*  24   62:aload_1         
	//*  25   63:invokeinterface #91  <Method boolean List.isEmpty()>
	//*  26   68:ifeq            73
			return null;
	//   27   71:aconst_null     
	//   28   72:areturn         
		try
		{
			s = ((String) ((TaskRecord)((List) (s)).get(0)));
	//   29   73:aload_1         
	//   30   74:iconst_0        
	//   31   75:invokeinterface #95  <Method Object List.get(int)>
	//   32   80:checkcast       #51  <Class TaskRecord>
	//   33   83:astore_1        
			s = ((String) (TaskRecord.toTaskResult(((TaskRecord) (s)), getDao(org/researchstack/backbone/storage/database/StepRecord).queryForEq("taskRecordId", ((Object) (Integer.valueOf(((TaskRecord) (s)).id)))).list())));
	//   34   84:aload_1         
	//   35   85:aload_0         
	//   36   86:ldc1            #97  <Class StepRecord>
	//   37   88:invokevirtual   #55  <Method Dao getDao(Class)>
	//   38   91:ldc1            #99  <String "taskRecordId">
	//   39   93:aload_1         
	//   40   94:getfield        #102 <Field int TaskRecord.id>
	//   41   97:invokestatic    #77  <Method Integer Integer.valueOf(int)>
	//   42  100:invokeinterface #63  <Method co.touchlab.squeaky.dao.Dao$QueryModifiers Dao.queryForEq(String, Object)>
	//   43  105:invokeinterface #85  <Method List co.touchlab.squeaky.dao.Dao$QueryModifiers.list()>
	//   44  110:invokestatic    #106 <Method TaskResult TaskRecord.toTaskResult(TaskRecord, List)>
	//   45  113:astore_1        
		}
	//*  46  114:aload_1         
	//*  47  115:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  48  116:astore_1        
		{
			throw new RuntimeException(((Throwable) (s)));
	//   49  117:new             #108 <Class RuntimeException>
	//   50  120:dup             
	//   51  121:aload_1         
	//   52  122:invokespecial   #111 <Method void RuntimeException(Throwable)>
	//   53  125:athrow          
		}
		return ((TaskResult) (s));
	}

	public List loadStepResults(String s)
	{
		LogExt.d(((Object)this).getClass(), (new StringBuilder()).append("loadStepResults() id: ").append(s).toString());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method Class Object.getClass()>
	//    2    4:new             #30  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #33  <Method void StringBuilder()>
	//    5   11:ldc1            #115 <String "loadStepResults() id: ">
	//    6   13:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_1         
	//    8   17:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   10   23:invokestatic    #49  <Method void LogExt.d(Class, String)>
		ArrayList arraylist;
		try
		{
			arraylist = new ArrayList();
	//   11   26:new             #117 <Class ArrayList>
	//   12   29:dup             
	//   13   30:invokespecial   #118 <Method void ArrayList()>
	//   14   33:astore_2        
			for(s = ((String) (getDao(org/researchstack/backbone/storage/database/StepRecord).queryForEq("stepId", ((Object) (s))).list().iterator())); ((Iterator) (s)).hasNext(); ((List) (arraylist)).add(((Object) (StepRecord.toStepResult((StepRecord)((Iterator) (s)).next())))));
	//   15   34:aload_0         
	//   16   35:ldc1            #97  <Class StepRecord>
	//   17   37:invokevirtual   #55  <Method Dao getDao(Class)>
	//   18   40:ldc1            #120 <String "stepId">
	//   19   42:aload_1         
	//   20   43:invokeinterface #63  <Method co.touchlab.squeaky.dao.Dao$QueryModifiers Dao.queryForEq(String, Object)>
	//   21   48:invokeinterface #85  <Method List co.touchlab.squeaky.dao.Dao$QueryModifiers.list()>
	//   22   53:invokeinterface #124 <Method Iterator List.iterator()>
	//   23   58:astore_1        
	//   24   59:aload_1         
	//   25   60:invokeinterface #129 <Method boolean Iterator.hasNext()>
	//   26   65:ifeq            100
	//   27   68:aload_2         
	//   28   69:aload_1         
	//   29   70:invokeinterface #133 <Method Object Iterator.next()>
	//   30   75:checkcast       #97  <Class StepRecord>
	//   31   78:invokestatic    #137 <Method StepResult StepRecord.toStepResult(StepRecord)>
	//   32   81:invokeinterface #141 <Method boolean List.add(Object)>
	//   33   86:pop             
		}
	//*  34   87:goto            59
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  35   90:astore_1        
		{
			throw new RuntimeException(((Throwable) (s)));
	//   36   91:new             #108 <Class RuntimeException>
	//   37   94:dup             
	//   38   95:aload_1         
	//   39   96:invokespecial   #111 <Method void RuntimeException(Throwable)>
	//   40   99:athrow          
		}
		return ((List) (arraylist));
	//   41  100:aload_2         
	//   42  101:areturn         
	}

	public List loadTaskResults(String s)
	{
		LogExt.d(((Object)this).getClass(), (new StringBuilder()).append("loadTaskResults() id: ").append(s).toString());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method Class Object.getClass()>
	//    2    4:new             #30  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #33  <Method void StringBuilder()>
	//    5   11:ldc1            #35  <String "loadTaskResults() id: ">
	//    6   13:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_1         
	//    8   17:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   10   23:invokestatic    #49  <Method void LogExt.d(Class, String)>
		ArrayList arraylist;
		try
		{
			arraylist = new ArrayList();
	//   11   26:new             #117 <Class ArrayList>
	//   12   29:dup             
	//   13   30:invokespecial   #118 <Method void ArrayList()>
	//   14   33:astore_2        
			TaskRecord taskrecord;
			for(s = ((String) (getDao(org/researchstack/backbone/storage/database/TaskRecord).queryForEq("taskId", ((Object) (s))).list().iterator())); ((Iterator) (s)).hasNext(); ((List) (arraylist)).add(((Object) (TaskRecord.toTaskResult(taskrecord, getDao(org/researchstack/backbone/storage/database/StepRecord).queryForEq("taskRecordId", ((Object) (Integer.valueOf(taskrecord.id)))).list())))))
	//*  15   34:aload_0         
	//*  16   35:ldc1            #51  <Class TaskRecord>
	//*  17   37:invokevirtual   #55  <Method Dao getDao(Class)>
	//*  18   40:ldc1            #57  <String "taskId">
	//*  19   42:aload_1         
	//*  20   43:invokeinterface #63  <Method co.touchlab.squeaky.dao.Dao$QueryModifiers Dao.queryForEq(String, Object)>
	//*  21   48:invokeinterface #85  <Method List co.touchlab.squeaky.dao.Dao$QueryModifiers.list()>
	//*  22   53:invokeinterface #124 <Method Iterator List.iterator()>
	//*  23   58:astore_1        
	//*  24   59:aload_1         
	//*  25   60:invokeinterface #129 <Method boolean Iterator.hasNext()>
	//*  26   65:ifeq            127
				taskrecord = (TaskRecord)((Iterator) (s)).next();
	//   27   68:aload_1         
	//   28   69:invokeinterface #133 <Method Object Iterator.next()>
	//   29   74:checkcast       #51  <Class TaskRecord>
	//   30   77:astore_3        

	//   31   78:aload_2         
	//   32   79:aload_3         
	//   33   80:aload_0         
	//   34   81:ldc1            #97  <Class StepRecord>
	//   35   83:invokevirtual   #55  <Method Dao getDao(Class)>
	//   36   86:ldc1            #99  <String "taskRecordId">
	//   37   88:aload_3         
	//   38   89:getfield        #102 <Field int TaskRecord.id>
	//   39   92:invokestatic    #77  <Method Integer Integer.valueOf(int)>
	//   40   95:invokeinterface #63  <Method co.touchlab.squeaky.dao.Dao$QueryModifiers Dao.queryForEq(String, Object)>
	//   41  100:invokeinterface #85  <Method List co.touchlab.squeaky.dao.Dao$QueryModifiers.list()>
	//   42  105:invokestatic    #106 <Method TaskResult TaskRecord.toTaskResult(TaskRecord, List)>
	//   43  108:invokeinterface #141 <Method boolean List.add(Object)>
	//   44  113:pop             
		}
	//*  45  114:goto            59
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  46  117:astore_1        
		{
			throw new RuntimeException(((Throwable) (s)));
	//   47  118:new             #108 <Class RuntimeException>
	//   48  121:dup             
	//   49  122:aload_1         
	//   50  123:invokespecial   #111 <Method void RuntimeException(Throwable)>
	//   51  126:athrow          
		}
		return ((List) (arraylist));
	//   52  127:aload_2         
	//   53  128:areturn         
	}

	public void onCreate(SQLiteDatabase sqlitedatabase)
	{
		try
		{
			TableUtils.createTables(((co.touchlab.squeaky.db.SQLiteDatabase) (new SQLiteDatabaseImpl(sqlitedatabase))), new Class[] {
				org/researchstack/backbone/storage/database/TaskRecord, org/researchstack/backbone/storage/database/StepRecord
			});
	//    0    0:new             #149 <Class SQLiteDatabaseImpl>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #151 <Method void SQLiteDatabaseImpl(SQLiteDatabase)>
	//    4    8:iconst_2        
	//    5    9:anewarray       Class[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:ldc1            #51  <Class TaskRecord>
	//    9   16:aastore         
	//   10   17:dup             
	//   11   18:iconst_1        
	//   12   19:ldc1            #97  <Class StepRecord>
	//   13   21:aastore         
	//   14   22:invokestatic    #159 <Method int TableUtils.createTables(co.touchlab.squeaky.db.SQLiteDatabase, Class[])>
	//   15   25:pop             
			return;
	//   16   26:return          
		}
		// Misplaced declaration of an exception variable
		catch(SQLiteDatabase sqlitedatabase)
	//*  17   27:astore_1        
		{
			throw new RuntimeException(((Throwable) (sqlitedatabase)));
	//   18   28:new             #108 <Class RuntimeException>
	//   19   31:dup             
	//   20   32:aload_1         
	//   21   33:invokespecial   #111 <Method void RuntimeException(Throwable)>
	//   22   36:athrow          
		}
	}

	public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
	{
	//    0    0:return          
	}

	public void saveTaskResult(TaskResult taskresult)
	{
		LogExt.d(((Object)this).getClass(), (new StringBuilder()).append("saveTaskResult() id: ").append(taskresult.getIdentifier()).toString());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method Class Object.getClass()>
	//    2    4:new             #30  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #33  <Method void StringBuilder()>
	//    5   11:ldc1            #165 <String "saveTaskResult() id: ">
	//    6   13:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_1         
	//    8   17:invokevirtual   #170 <Method String TaskResult.getIdentifier()>
	//    9   20:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   11   26:invokestatic    #49  <Method void LogExt.d(Class, String)>
		TaskRecord taskrecord;
		Gson gson;
		Dao dao;
		Iterator iterator;
		taskrecord = new TaskRecord();
	//   12   29:new             #51  <Class TaskRecord>
	//   13   32:dup             
	//   14   33:invokespecial   #171 <Method void TaskRecord()>
	//   15   36:astore_2        
		taskrecord.taskId = taskresult.getIdentifier();
	//   16   37:aload_2         
	//   17   38:aload_1         
	//   18   39:invokevirtual   #170 <Method String TaskResult.getIdentifier()>
	//   19   42:putfield        #173 <Field String TaskRecord.taskId>
		taskrecord.started = taskresult.getStartDate();
	//   20   45:aload_2         
	//   21   46:aload_1         
	//   22   47:invokevirtual   #177 <Method java.util.Date TaskResult.getStartDate()>
	//   23   50:putfield        #181 <Field java.util.Date TaskRecord.started>
		taskrecord.completed = taskresult.getEndDate();
	//   24   53:aload_2         
	//   25   54:aload_1         
	//   26   55:invokevirtual   #184 <Method java.util.Date TaskResult.getEndDate()>
	//   27   58:putfield        #187 <Field java.util.Date TaskRecord.completed>
		getDao(org/researchstack/backbone/storage/database/TaskRecord).create(((Object) (taskrecord)));
	//   28   61:aload_0         
	//   29   62:ldc1            #51  <Class TaskRecord>
	//   30   64:invokevirtual   #55  <Method Dao getDao(Class)>
	//   31   67:aload_2         
	//   32   68:invokeinterface #191 <Method void Dao.create(Object)>
		gson = (new GsonBuilder()).setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();
	//   33   73:new             #193 <Class GsonBuilder>
	//   34   76:dup             
	//   35   77:invokespecial   #194 <Method void GsonBuilder()>
	//   36   80:ldc1            #196 <String "yyyy-MM-dd'T'HH:mm:ss.SSSZ">
	//   37   82:invokevirtual   #200 <Method GsonBuilder GsonBuilder.setDateFormat(String)>
	//   38   85:invokevirtual   #203 <Method Gson GsonBuilder.create()>
	//   39   88:astore_3        
		dao = getDao(org/researchstack/backbone/storage/database/StepRecord);
	//   40   89:aload_0         
	//   41   90:ldc1            #97  <Class StepRecord>
	//   42   92:invokevirtual   #55  <Method Dao getDao(Class)>
	//   43   95:astore          4
		iterator = taskresult.getResults().values().iterator();
	//   44   97:aload_1         
	//   45   98:invokevirtual   #207 <Method Map TaskResult.getResults()>
	//   46  101:invokeinterface #213 <Method Collection Map.values()>
	//   47  106:invokeinterface #216 <Method Iterator Collection.iterator()>
	//   48  111:astore          5
_L1:
		StepResult stepresult;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_236;
	//   49  113:aload           5
	//   50  115:invokeinterface #129 <Method boolean Iterator.hasNext()>
	//   51  120:ifeq            236
		stepresult = (StepResult)iterator.next();
	//   52  123:aload           5
	//   53  125:invokeinterface #133 <Method Object Iterator.next()>
	//   54  130:checkcast       #218 <Class StepResult>
	//   55  133:astore          6
		if(stepresult != null)
	//*  56  135:aload           6
	//*  57  137:ifnull          113
			try
			{
				StepRecord steprecord = new StepRecord();
	//   58  140:new             #97  <Class StepRecord>
	//   59  143:dup             
	//   60  144:invokespecial   #219 <Method void StepRecord()>
	//   61  147:astore          7
				steprecord.taskRecordId = taskrecord.id;
	//   62  149:aload           7
	//   63  151:aload_2         
	//   64  152:getfield        #102 <Field int TaskRecord.id>
	//   65  155:putfield        #221 <Field int StepRecord.taskRecordId>
				steprecord.taskId = taskresult.getIdentifier();
	//   66  158:aload           7
	//   67  160:aload_1         
	//   68  161:invokevirtual   #170 <Method String TaskResult.getIdentifier()>
	//   69  164:putfield        #222 <Field String StepRecord.taskId>
				steprecord.stepId = stepresult.getIdentifier();
	//   70  167:aload           7
	//   71  169:aload           6
	//   72  171:invokevirtual   #223 <Method String StepResult.getIdentifier()>
	//   73  174:putfield        #225 <Field String StepRecord.stepId>
				steprecord.completed = stepresult.getEndDate();
	//   74  177:aload           7
	//   75  179:aload           6
	//   76  181:invokevirtual   #226 <Method java.util.Date StepResult.getEndDate()>
	//   77  184:putfield        #227 <Field java.util.Date StepRecord.completed>
				if(!stepresult.getResults().isEmpty())
	//*  78  187:aload           6
	//*  79  189:invokevirtual   #228 <Method Map StepResult.getResults()>
	//*  80  192:invokeinterface #229 <Method boolean Map.isEmpty()>
	//*  81  197:ifne            214
					steprecord.result = gson.toJson(((Object) (stepresult.getResults())));
	//   82  200:aload           7
	//   83  202:aload_3         
	//   84  203:aload           6
	//   85  205:invokevirtual   #228 <Method Map StepResult.getResults()>
	//   86  208:invokevirtual   #235 <Method String Gson.toJson(Object)>
	//   87  211:putfield        #238 <Field String StepRecord.result>
				dao.createOrUpdate(((Object) (steprecord)));
	//   88  214:aload           4
	//   89  216:aload           7
	//   90  218:invokeinterface #241 <Method void Dao.createOrUpdate(Object)>
			}
	//*  91  223:goto            113
			// Misplaced declaration of an exception variable
			catch(TaskResult taskresult)
	//*  92  226:astore_1        
			{
				throw new RuntimeException(((Throwable) (taskresult)));
	//   93  227:new             #108 <Class RuntimeException>
	//   94  230:dup             
	//   95  231:aload_1         
	//   96  232:invokespecial   #111 <Method void RuntimeException(Throwable)>
	//   97  235:athrow          
			}
		  goto _L1
	//   98  236:return          
	}

	public void setEncryptionKey(String s)
	{
		LogExt.w(((Object)this).getClass(), "No-op, this db implementation is not encrypted");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method Class Object.getClass()>
	//    2    4:ldc1            #245 <String "No-op, this db implementation is not encrypted">
	//    3    6:invokestatic    #248 <Method void LogExt.w(Class, String)>
	//    4    9:return          
	}

	public static final String DEFAULT_NAME = "appdb";
	public static final int DEFAULT_VERSION = 1;
}
