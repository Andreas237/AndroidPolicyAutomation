// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;

import android.arch.lifecycle.ComputableLiveData;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.*;
import android.arch.persistence.room.util.StringUtil;
import android.database.Cursor;
import android.support.v4.util.ArrayMap;
import androidx.work.Constraints;
import androidx.work.Data;
import java.util.*;

// Referenced classes of package androidx.work.impl.model:
//			WorkSpecDao, WorkTypeConverters, WorkSpec

public class WorkSpecDao_Impl
	implements WorkSpecDao
{

	public WorkSpecDao_Impl(RoomDatabase roomdatabase)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
		__db = roomdatabase;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #56  <Field RoomDatabase __db>
		__insertionAdapterOfWorkSpec = ((EntityInsertionAdapter) (new EntityInsertionAdapter(roomdatabase) {

			public void bind(SupportSQLiteStatement supportsqlitestatement, WorkSpec workspec)
			{
				throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:539)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
			//    0    0:new             #21  <Class RuntimeException>
			//    1    3:dup             
			//    2    4:ldc1            #23  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:539)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
			//    3    6:invokespecial   #28  <Method void Runtime(String)>
			//    4    9:athrow          
			}

			public volatile void bind(SupportSQLiteStatement supportsqlitestatement, Object obj)
			{
				bind(supportsqlitestatement, (WorkSpec)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #31  <Class WorkSpec>
			//    4    6:invokevirtual   #33  <Method void bind(SupportSQLiteStatement, WorkSpec)>
			//    5    9:return          
			}

			public String createQuery()
			{
				return "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			//    0    0:ldc1            #37  <String "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)">
			//    1    2:areturn         
			}

			final WorkSpecDao_Impl this$0;

			
			{
				this$0 = WorkSpecDao_Impl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field WorkSpecDao_Impl this$0>
				super(roomdatabase);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #16  <Method void EntityInsertionAdapter(RoomDatabase)>
			//    6   10:return          
			}
		}
));
	//    5    9:aload_0         
	//    6   10:new             #8   <Class WorkSpecDao_Impl$1>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #59  <Method void WorkSpecDao_Impl$1(WorkSpecDao_Impl, RoomDatabase)>
	//   11   19:putfield        #61  <Field EntityInsertionAdapter __insertionAdapterOfWorkSpec>
		__preparedStmtOfDelete = ((SharedSQLiteStatement) (new SharedSQLiteStatement(roomdatabase) {

			public String createQuery()
			{
				return "DELETE FROM workspec WHERE id=?";
			//    0    0:ldc1            #20  <String "DELETE FROM workspec WHERE id=?">
			//    1    2:areturn         
			}

			final WorkSpecDao_Impl this$0;

			
			{
				this$0 = WorkSpecDao_Impl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field WorkSpecDao_Impl this$0>
				super(roomdatabase);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #15  <Method void SharedSQLiteStatement(RoomDatabase)>
			//    6   10:return          
			}
		}
));
	//   12   22:aload_0         
	//   13   23:new             #22  <Class WorkSpecDao_Impl$2>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokespecial   #62  <Method void WorkSpecDao_Impl$2(WorkSpecDao_Impl, RoomDatabase)>
	//   18   32:putfield        #64  <Field SharedSQLiteStatement __preparedStmtOfDelete>
		__preparedStmtOfSetOutput = ((SharedSQLiteStatement) (new SharedSQLiteStatement(roomdatabase) {

			public String createQuery()
			{
				return "UPDATE workspec SET output=? WHERE id=?";
			//    0    0:ldc1            #20  <String "UPDATE workspec SET output=? WHERE id=?">
			//    1    2:areturn         
			}

			final WorkSpecDao_Impl this$0;

			
			{
				this$0 = WorkSpecDao_Impl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field WorkSpecDao_Impl this$0>
				super(roomdatabase);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #15  <Method void SharedSQLiteStatement(RoomDatabase)>
			//    6   10:return          
			}
		}
));
	//   19   35:aload_0         
	//   20   36:new             #24  <Class WorkSpecDao_Impl$3>
	//   21   39:dup             
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:invokespecial   #65  <Method void WorkSpecDao_Impl$3(WorkSpecDao_Impl, RoomDatabase)>
	//   25   45:putfield        #67  <Field SharedSQLiteStatement __preparedStmtOfSetOutput>
		__preparedStmtOfSetPeriodStartTime = ((SharedSQLiteStatement) (new SharedSQLiteStatement(roomdatabase) {

			public String createQuery()
			{
				return "UPDATE workspec SET period_start_time=? WHERE id=?";
			//    0    0:ldc1            #20  <String "UPDATE workspec SET period_start_time=? WHERE id=?">
			//    1    2:areturn         
			}

			final WorkSpecDao_Impl this$0;

			
			{
				this$0 = WorkSpecDao_Impl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field WorkSpecDao_Impl this$0>
				super(roomdatabase);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #15  <Method void SharedSQLiteStatement(RoomDatabase)>
			//    6   10:return          
			}
		}
));
	//   26   48:aload_0         
	//   27   49:new             #26  <Class WorkSpecDao_Impl$4>
	//   28   52:dup             
	//   29   53:aload_0         
	//   30   54:aload_1         
	//   31   55:invokespecial   #68  <Method void WorkSpecDao_Impl$4(WorkSpecDao_Impl, RoomDatabase)>
	//   32   58:putfield        #70  <Field SharedSQLiteStatement __preparedStmtOfSetPeriodStartTime>
		__preparedStmtOfIncrementWorkSpecRunAttemptCount = ((SharedSQLiteStatement) (new SharedSQLiteStatement(roomdatabase) {

			public String createQuery()
			{
				return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
			//    0    0:ldc1            #20  <String "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?">
			//    1    2:areturn         
			}

			final WorkSpecDao_Impl this$0;

			
			{
				this$0 = WorkSpecDao_Impl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field WorkSpecDao_Impl this$0>
				super(roomdatabase);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #15  <Method void SharedSQLiteStatement(RoomDatabase)>
			//    6   10:return          
			}
		}
));
	//   33   61:aload_0         
	//   34   62:new             #28  <Class WorkSpecDao_Impl$5>
	//   35   65:dup             
	//   36   66:aload_0         
	//   37   67:aload_1         
	//   38   68:invokespecial   #71  <Method void WorkSpecDao_Impl$5(WorkSpecDao_Impl, RoomDatabase)>
	//   39   71:putfield        #73  <Field SharedSQLiteStatement __preparedStmtOfIncrementWorkSpecRunAttemptCount>
		__preparedStmtOfResetWorkSpecRunAttemptCount = ((SharedSQLiteStatement) (new SharedSQLiteStatement(roomdatabase) {

			public String createQuery()
			{
				return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
			//    0    0:ldc1            #20  <String "UPDATE workspec SET run_attempt_count=0 WHERE id=?">
			//    1    2:areturn         
			}

			final WorkSpecDao_Impl this$0;

			
			{
				this$0 = WorkSpecDao_Impl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field WorkSpecDao_Impl this$0>
				super(roomdatabase);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #15  <Method void SharedSQLiteStatement(RoomDatabase)>
			//    6   10:return          
			}
		}
));
	//   40   74:aload_0         
	//   41   75:new             #30  <Class WorkSpecDao_Impl$6>
	//   42   78:dup             
	//   43   79:aload_0         
	//   44   80:aload_1         
	//   45   81:invokespecial   #74  <Method void WorkSpecDao_Impl$6(WorkSpecDao_Impl, RoomDatabase)>
	//   46   84:putfield        #76  <Field SharedSQLiteStatement __preparedStmtOfResetWorkSpecRunAttemptCount>
		__preparedStmtOfMarkWorkSpecScheduled = ((SharedSQLiteStatement) (new SharedSQLiteStatement(roomdatabase) {

			public String createQuery()
			{
				return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
			//    0    0:ldc1            #20  <String "UPDATE workspec SET schedule_requested_at=? WHERE id=?">
			//    1    2:areturn         
			}

			final WorkSpecDao_Impl this$0;

			
			{
				this$0 = WorkSpecDao_Impl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field WorkSpecDao_Impl this$0>
				super(roomdatabase);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #15  <Method void SharedSQLiteStatement(RoomDatabase)>
			//    6   10:return          
			}
		}
));
	//   47   87:aload_0         
	//   48   88:new             #32  <Class WorkSpecDao_Impl$7>
	//   49   91:dup             
	//   50   92:aload_0         
	//   51   93:aload_1         
	//   52   94:invokespecial   #77  <Method void WorkSpecDao_Impl$7(WorkSpecDao_Impl, RoomDatabase)>
	//   53   97:putfield        #79  <Field SharedSQLiteStatement __preparedStmtOfMarkWorkSpecScheduled>
		__preparedStmtOfResetScheduledState = ((SharedSQLiteStatement) (new SharedSQLiteStatement(roomdatabase) {

			public String createQuery()
			{
				return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
			//    0    0:ldc1            #20  <String "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)">
			//    1    2:areturn         
			}

			final WorkSpecDao_Impl this$0;

			
			{
				this$0 = WorkSpecDao_Impl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field WorkSpecDao_Impl this$0>
				super(roomdatabase);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #15  <Method void SharedSQLiteStatement(RoomDatabase)>
			//    6   10:return          
			}
		}
));
	//   54  100:aload_0         
	//   55  101:new             #34  <Class WorkSpecDao_Impl$8>
	//   56  104:dup             
	//   57  105:aload_0         
	//   58  106:aload_1         
	//   59  107:invokespecial   #80  <Method void WorkSpecDao_Impl$8(WorkSpecDao_Impl, RoomDatabase)>
	//   60  110:putfield        #82  <Field SharedSQLiteStatement __preparedStmtOfResetScheduledState>
		__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast = ((SharedSQLiteStatement) (new SharedSQLiteStatement(roomdatabase) {

			public String createQuery()
			{
				return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
			//    0    0:ldc1            #20  <String "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))">
			//    1    2:areturn         
			}

			final WorkSpecDao_Impl this$0;

			
			{
				this$0 = WorkSpecDao_Impl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field WorkSpecDao_Impl this$0>
				super(roomdatabase);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #15  <Method void SharedSQLiteStatement(RoomDatabase)>
			//    6   10:return          
			}
		}
));
	//   61  113:aload_0         
	//   62  114:new             #36  <Class WorkSpecDao_Impl$9>
	//   63  117:dup             
	//   64  118:aload_0         
	//   65  119:aload_1         
	//   66  120:invokespecial   #83  <Method void WorkSpecDao_Impl$9(WorkSpecDao_Impl, RoomDatabase)>
	//   67  123:putfield        #85  <Field SharedSQLiteStatement __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast>
	//   68  126:return          
	}

	private void __fetchRelationshipWorkTagAsjavaLangString(ArrayMap arraymap)
	{
		Object obj;
		Object obj1 = ((Object) (arraymap.keySet()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #94  <Method Set ArrayMap.keySet()>
	//    2    4:astore          8
		if(((Set) (obj1)).isEmpty())
	//*   3    6:aload           8
	//*   4    8:invokeinterface #100 <Method boolean Set.isEmpty()>
	//*   5   13:ifeq            17
			return;
	//    6   16:return          
		if(arraymap.size() > 999)
	//*   7   17:aload_1         
	//*   8   18:invokevirtual   #104 <Method int ArrayMap.size()>
	//*   9   21:sipush          999
	//*  10   24:icmple          132
		{
			ArrayMap arraymap1 = new ArrayMap(999);
	//   11   27:new             #90  <Class ArrayMap>
	//   12   30:dup             
	//   13   31:sipush          999
	//   14   34:invokespecial   #107 <Method void ArrayMap(int)>
	//   15   37:astore          7
			int l1 = arraymap.size();
	//   16   39:aload_1         
	//   17   40:invokevirtual   #104 <Method int ArrayMap.size()>
	//   18   43:istore          6
			int i1 = 0;
	//   19   45:iconst_0        
	//   20   46:istore_3        
			int i = i1;
	//   21   47:iload_3         
	//   22   48:istore_2        
			do
			{
				if(i1 >= l1)
					break;
	//   23   49:iload_3         
	//   24   50:iload           6
	//   25   52:icmpge          121
				arraymap1.put(arraymap.keyAt(i1), arraymap.valueAt(i1));
	//   26   55:aload           7
	//   27   57:aload_1         
	//   28   58:iload_3         
	//   29   59:invokevirtual   #111 <Method Object ArrayMap.keyAt(int)>
	//   30   62:aload_1         
	//   31   63:iload_3         
	//   32   64:invokevirtual   #114 <Method Object ArrayMap.valueAt(int)>
	//   33   67:invokevirtual   #118 <Method Object ArrayMap.put(Object, Object)>
	//   34   70:pop             
				int j1 = i1 + 1;
	//   35   71:iload_3         
	//   36   72:iconst_1        
	//   37   73:iadd            
	//   38   74:istore          4
				int k1 = i + 1;
	//   39   76:iload_2         
	//   40   77:iconst_1        
	//   41   78:iadd            
	//   42   79:istore          5
				i1 = j1;
	//   43   81:iload           4
	//   44   83:istore_3        
				i = k1;
	//   45   84:iload           5
	//   46   86:istore_2        
				if(k1 == 999)
	//*  47   87:iload           5
	//*  48   89:sipush          999
	//*  49   92:icmpne          49
				{
					__fetchRelationshipWorkTagAsjavaLangString(arraymap1);
	//   50   95:aload_0         
	//   51   96:aload           7
	//   52   98:invokespecial   #120 <Method void __fetchRelationshipWorkTagAsjavaLangString(ArrayMap)>
					arraymap1 = new ArrayMap(999);
	//   53  101:new             #90  <Class ArrayMap>
	//   54  104:dup             
	//   55  105:sipush          999
	//   56  108:invokespecial   #107 <Method void ArrayMap(int)>
	//   57  111:astore          7
					i = 0;
	//   58  113:iconst_0        
	//   59  114:istore_2        
					i1 = j1;
	//   60  115:iload           4
	//   61  117:istore_3        
				}
			} while(true);
	//   62  118:goto            49
			if(i > 0)
	//*  63  121:iload_2         
	//*  64  122:ifle            131
				__fetchRelationshipWorkTagAsjavaLangString(arraymap1);
	//   65  125:aload_0         
	//   66  126:aload           7
	//   67  128:invokespecial   #120 <Method void __fetchRelationshipWorkTagAsjavaLangString(ArrayMap)>
			return;
	//   68  131:return          
		}
		obj = ((Object) (StringUtil.newStringBuilder()));
	//   69  132:invokestatic    #126 <Method StringBuilder StringUtil.newStringBuilder()>
	//   70  135:astore          7
		((StringBuilder) (obj)).append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
	//   71  137:aload           7
	//   72  139:ldc1            #128 <String "SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (">
	//   73  141:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   74  144:pop             
		int j = ((Set) (obj1)).size();
	//   75  145:aload           8
	//   76  147:invokeinterface #135 <Method int Set.size()>
	//   77  152:istore_2        
		StringUtil.appendPlaceholders(((StringBuilder) (obj)), j);
	//   78  153:aload           7
	//   79  155:iload_2         
	//   80  156:invokestatic    #139 <Method void StringUtil.appendPlaceholders(StringBuilder, int)>
		((StringBuilder) (obj)).append(")");
	//   81  159:aload           7
	//   82  161:ldc1            #141 <String ")">
	//   83  163:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   84  166:pop             
		obj = ((Object) (RoomSQLiteQuery.acquire(((StringBuilder) (obj)).toString(), j + 0)));
	//   85  167:aload           7
	//   86  169:invokevirtual   #145 <Method String StringBuilder.toString()>
	//   87  172:iload_2         
	//   88  173:iconst_0        
	//   89  174:iadd            
	//   90  175:invokestatic    #151 <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//   91  178:astore          7
		obj1 = ((Object) (((Set) (obj1)).iterator()));
	//   92  180:aload           8
	//   93  182:invokeinterface #155 <Method Iterator Set.iterator()>
	//   94  187:astore          8
		for(int k = 1; ((Iterator) (obj1)).hasNext(); k++)
	//*  95  189:iconst_1        
	//*  96  190:istore_2        
	//*  97  191:aload           8
	//*  98  193:invokeinterface #160 <Method boolean Iterator.hasNext()>
	//*  99  198:ifeq            242
		{
			String s = (String)((Iterator) (obj1)).next();
	//  100  201:aload           8
	//  101  203:invokeinterface #164 <Method Object Iterator.next()>
	//  102  208:checkcast       #166 <Class String>
	//  103  211:astore          9
			if(s == null)
	//* 104  213:aload           9
	//* 105  215:ifnonnull       227
				((RoomSQLiteQuery) (obj)).bindNull(k);
	//  106  218:aload           7
	//  107  220:iload_2         
	//  108  221:invokevirtual   #169 <Method void RoomSQLiteQuery.bindNull(int)>
			else
	//* 109  224:goto            235
				((RoomSQLiteQuery) (obj)).bindString(k, s);
	//  110  227:aload           7
	//  111  229:iload_2         
	//  112  230:aload           9
	//  113  232:invokevirtual   #173 <Method void RoomSQLiteQuery.bindString(int, String)>
		}

	//  114  235:iload_2         
	//  115  236:iconst_1        
	//  116  237:iadd            
	//  117  238:istore_2        
	//* 118  239:goto            191
		obj = ((Object) (__db.query(((android.arch.persistence.db.SupportSQLiteQuery) (obj)))));
	//  119  242:aload_0         
	//  120  243:getfield        #56  <Field RoomDatabase __db>
	//  121  246:aload           7
	//  122  248:invokevirtual   #179 <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
	//  123  251:astore          7
		int l = ((Cursor) (obj)).getColumnIndex("work_spec_id");
	//  124  253:aload           7
	//  125  255:ldc1            #181 <String "work_spec_id">
	//  126  257:invokeinterface #187 <Method int Cursor.getColumnIndex(String)>
	//  127  262:istore_2        
		if(l == -1)
	//* 128  263:iload_2         
	//* 129  264:iconst_m1       
	//* 130  265:icmpne          276
		{
			((Cursor) (obj)).close();
	//  131  268:aload           7
	//  132  270:invokeinterface #190 <Method void Cursor.close()>
			return;
	//  133  275:return          
		}
_L2:
		ArrayList arraylist;
		if(!((Cursor) (obj)).moveToNext())
			break; /* Loop/switch isn't completed */
	//  134  276:aload           7
	//  135  278:invokeinterface #193 <Method boolean Cursor.moveToNext()>
	//  136  283:ifeq            336
		if(((Cursor) (obj)).isNull(l))
			continue; /* Loop/switch isn't completed */
	//  137  286:aload           7
	//  138  288:iload_2         
	//  139  289:invokeinterface #197 <Method boolean Cursor.isNull(int)>
	//  140  294:ifne            276
		arraylist = (ArrayList)arraymap.get(((Object) (((Cursor) (obj)).getString(l))));
	//  141  297:aload_1         
	//  142  298:aload           7
	//  143  300:iload_2         
	//  144  301:invokeinterface #201 <Method String Cursor.getString(int)>
	//  145  306:invokevirtual   #205 <Method Object ArrayMap.get(Object)>
	//  146  309:checkcast       #207 <Class ArrayList>
	//  147  312:astore          8
		if(arraylist == null)
			continue; /* Loop/switch isn't completed */
	//  148  314:aload           8
	//  149  316:ifnull          276
		arraylist.add(((Object) (((Cursor) (obj)).getString(0))));
	//  150  319:aload           8
	//  151  321:aload           7
	//  152  323:iconst_0        
	//  153  324:invokeinterface #201 <Method String Cursor.getString(int)>
	//  154  329:invokevirtual   #211 <Method boolean ArrayList.add(Object)>
	//  155  332:pop             
		if(true) goto _L2; else goto _L1
	//  156  333:goto            276
_L1:
		((Cursor) (obj)).close();
	//  157  336:aload           7
	//  158  338:invokeinterface #190 <Method void Cursor.close()>
		return;
	//  159  343:return          
		arraymap;
	//  160  344:astore_1        
		((Cursor) (obj)).close();
	//  161  345:aload           7
	//  162  347:invokeinterface #190 <Method void Cursor.close()>
		throw arraymap;
	//  163  352:aload_1         
	//  164  353:athrow          
	}

	public void delete(String s)
	{
		SupportSQLiteStatement supportsqlitestatement;
		supportsqlitestatement = __preparedStmtOfDelete.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field SharedSQLiteStatement __preparedStmtOfDelete>
	//    2    4:invokevirtual   #224 <Method SupportSQLiteStatement SharedSQLiteStatement.acquire()>
	//    3    7:astore_2        
		__db.beginTransaction();
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field RoomDatabase __db>
	//    6   12:invokevirtual   #227 <Method void RoomDatabase.beginTransaction()>
		if(s != null)
			break MISSING_BLOCK_LABEL_29;
	//    7   15:aload_1         
	//    8   16:ifnonnull       29
		supportsqlitestatement.bindNull(1);
	//    9   19:aload_2         
	//   10   20:iconst_1        
	//   11   21:invokeinterface #230 <Method void SupportSQLiteStatement.bindNull(int)>
		break MISSING_BLOCK_LABEL_37;
	//   12   26:goto            37
		supportsqlitestatement.bindString(1, s);
	//   13   29:aload_2         
	//   14   30:iconst_1        
	//   15   31:aload_1         
	//   16   32:invokeinterface #231 <Method void SupportSQLiteStatement.bindString(int, String)>
		supportsqlitestatement.executeUpdateDelete();
	//   17   37:aload_2         
	//   18   38:invokeinterface #234 <Method int SupportSQLiteStatement.executeUpdateDelete()>
	//   19   43:pop             
		__db.setTransactionSuccessful();
	//   20   44:aload_0         
	//   21   45:getfield        #56  <Field RoomDatabase __db>
	//   22   48:invokevirtual   #237 <Method void RoomDatabase.setTransactionSuccessful()>
		__db.endTransaction();
	//   23   51:aload_0         
	//   24   52:getfield        #56  <Field RoomDatabase __db>
	//   25   55:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		__preparedStmtOfDelete.release(supportsqlitestatement);
	//   26   58:aload_0         
	//   27   59:getfield        #64  <Field SharedSQLiteStatement __preparedStmtOfDelete>
	//   28   62:aload_2         
	//   29   63:invokevirtual   #244 <Method void SharedSQLiteStatement.release(SupportSQLiteStatement)>
		return;
	//   30   66:return          
		s;
	//   31   67:astore_1        
		__db.endTransaction();
	//   32   68:aload_0         
	//   33   69:getfield        #56  <Field RoomDatabase __db>
	//   34   72:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		__preparedStmtOfDelete.release(supportsqlitestatement);
	//   35   75:aload_0         
	//   36   76:getfield        #64  <Field SharedSQLiteStatement __preparedStmtOfDelete>
	//   37   79:aload_2         
	//   38   80:invokevirtual   #244 <Method void SharedSQLiteStatement.release(SupportSQLiteStatement)>
		throw s;
	//   39   83:aload_1         
	//   40   84:athrow          
	}

	public List getAllUnfinishedWork()
	{
		RoomSQLiteQuery roomsqlitequery;
		Cursor cursor;
		roomsqlitequery = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
	//    0    0:ldc1            #248 <String "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)">
	//    1    2:iconst_0        
	//    2    3:invokestatic    #151 <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//    3    6:astore_1        
		cursor = __db.query(((android.arch.persistence.db.SupportSQLiteQuery) (roomsqlitequery)));
	//    4    7:aload_0         
	//    5    8:getfield        #56  <Field RoomDatabase __db>
	//    6   11:aload_1         
	//    7   12:invokevirtual   #179 <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
	//    8   15:astore_2        
		ArrayList arraylist;
		arraylist = new ArrayList(cursor.getCount());
	//    9   16:new             #207 <Class ArrayList>
	//   10   19:dup             
	//   11   20:aload_2         
	//   12   21:invokeinterface #251 <Method int Cursor.getCount()>
	//   13   26:invokespecial   #252 <Method void ArrayList(int)>
	//   14   29:astore_3        
		for(; cursor.moveToNext(); ((List) (arraylist)).add(((Object) (cursor.getString(0)))));
	//   15   30:aload_2         
	//   16   31:invokeinterface #193 <Method boolean Cursor.moveToNext()>
	//   17   36:ifeq            56
	//   18   39:aload_3         
	//   19   40:aload_2         
	//   20   41:iconst_0        
	//   21   42:invokeinterface #201 <Method String Cursor.getString(int)>
	//   22   47:invokeinterface #255 <Method boolean List.add(Object)>
	//   23   52:pop             
	//*  24   53:goto            30
		cursor.close();
	//   25   56:aload_2         
	//   26   57:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//   27   62:aload_1         
	//   28   63:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		return ((List) (arraylist));
	//   29   66:aload_3         
	//   30   67:areturn         
		Exception exception;
		exception;
	//   31   68:astore_3        
		cursor.close();
	//   32   69:aload_2         
	//   33   70:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//   34   75:aload_1         
	//   35   76:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		throw exception;
	//   36   79:aload_3         
	//   37   80:athrow          
	}

	public List getAllWorkSpecIds()
	{
		RoomSQLiteQuery roomsqlitequery;
		Cursor cursor;
		roomsqlitequery = RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0);
	//    0    0:ldc2            #261 <String "SELECT id FROM workspec">
	//    1    3:iconst_0        
	//    2    4:invokestatic    #151 <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//    3    7:astore_1        
		cursor = __db.query(((android.arch.persistence.db.SupportSQLiteQuery) (roomsqlitequery)));
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field RoomDatabase __db>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #179 <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
	//    8   16:astore_2        
		ArrayList arraylist;
		arraylist = new ArrayList(cursor.getCount());
	//    9   17:new             #207 <Class ArrayList>
	//   10   20:dup             
	//   11   21:aload_2         
	//   12   22:invokeinterface #251 <Method int Cursor.getCount()>
	//   13   27:invokespecial   #252 <Method void ArrayList(int)>
	//   14   30:astore_3        
		for(; cursor.moveToNext(); ((List) (arraylist)).add(((Object) (cursor.getString(0)))));
	//   15   31:aload_2         
	//   16   32:invokeinterface #193 <Method boolean Cursor.moveToNext()>
	//   17   37:ifeq            57
	//   18   40:aload_3         
	//   19   41:aload_2         
	//   20   42:iconst_0        
	//   21   43:invokeinterface #201 <Method String Cursor.getString(int)>
	//   22   48:invokeinterface #255 <Method boolean List.add(Object)>
	//   23   53:pop             
	//*  24   54:goto            31
		cursor.close();
	//   25   57:aload_2         
	//   26   58:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//   27   63:aload_1         
	//   28   64:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		return ((List) (arraylist));
	//   29   67:aload_3         
	//   30   68:areturn         
		Exception exception;
		exception;
	//   31   69:astore_3        
		cursor.close();
	//   32   70:aload_2         
	//   33   71:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//   34   76:aload_1         
	//   35   77:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		throw exception;
	//   36   80:aload_3         
	//   37   81:athrow          
	}

	public List getEligibleWorkForScheduling(int i)
	{
		RoomSQLiteQuery roomsqlitequery;
		Cursor cursor;
		roomsqlitequery = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
	//    0    0:ldc2            #265 <String "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))">
	//    1    3:iconst_1        
	//    2    4:invokestatic    #151 <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//    3    7:astore          27
		roomsqlitequery.bindLong(1, i);
	//    4    9:aload           27
	//    5   11:iconst_1        
	//    6   12:iload_1         
	//    7   13:i2l             
	//    8   14:invokevirtual   #269 <Method void RoomSQLiteQuery.bindLong(int, long)>
		cursor = __db.query(((android.arch.persistence.db.SupportSQLiteQuery) (roomsqlitequery)));
	//    9   17:aload_0         
	//   10   18:getfield        #56  <Field RoomDatabase __db>
	//   11   21:aload           27
	//   12   23:invokevirtual   #179 <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
	//   13   26:astore          28
		int j;
		int k;
		int l;
		int i1;
		int k1;
		int i2;
		int j2;
		int l2;
		int i3;
		int k3;
		int l3;
		int i4;
		int k4;
		j2 = cursor.getColumnIndexOrThrow("id");
	//   14   28:aload           28
	//   15   30:ldc2            #271 <String "id">
	//   16   33:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   17   38:istore          10
		k4 = cursor.getColumnIndexOrThrow("state");
	//   18   40:aload           28
	//   19   42:ldc2            #276 <String "state">
	//   20   45:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   21   50:istore          19
		l2 = cursor.getColumnIndexOrThrow("worker_class_name");
	//   22   52:aload           28
	//   23   54:ldc2            #278 <String "worker_class_name">
	//   24   57:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   25   62:istore          12
		i3 = cursor.getColumnIndexOrThrow("input_merger_class_name");
	//   26   64:aload           28
	//   27   66:ldc2            #280 <String "input_merger_class_name">
	//   28   69:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   29   74:istore          13
		i2 = cursor.getColumnIndexOrThrow("input");
	//   30   76:aload           28
	//   31   78:ldc2            #282 <String "input">
	//   32   81:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   33   86:istore          9
		i4 = cursor.getColumnIndexOrThrow("output");
	//   34   88:aload           28
	//   35   90:ldc2            #284 <String "output">
	//   36   93:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   37   98:istore          17
		l = cursor.getColumnIndexOrThrow("initial_delay");
	//   38  100:aload           28
	//   39  102:ldc2            #286 <String "initial_delay">
	//   40  105:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   41  110:istore          4
		k = cursor.getColumnIndexOrThrow("interval_duration");
	//   42  112:aload           28
	//   43  114:ldc2            #288 <String "interval_duration">
	//   44  117:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   45  122:istore_3        
		i = cursor.getColumnIndexOrThrow("flex_duration");
	//   46  123:aload           28
	//   47  125:ldc2            #290 <String "flex_duration">
	//   48  128:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   49  133:istore_1        
		l3 = cursor.getColumnIndexOrThrow("run_attempt_count");
	//   50  134:aload           28
	//   51  136:ldc2            #292 <String "run_attempt_count">
	//   52  139:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   53  144:istore          16
		i1 = cursor.getColumnIndexOrThrow("backoff_policy");
	//   54  146:aload           28
	//   55  148:ldc2            #294 <String "backoff_policy">
	//   56  151:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   57  156:istore          5
		j = cursor.getColumnIndexOrThrow("backoff_delay_duration");
	//   58  158:aload           28
	//   59  160:ldc2            #296 <String "backoff_delay_duration">
	//   60  163:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   61  168:istore_2        
		k3 = cursor.getColumnIndexOrThrow("period_start_time");
	//   62  169:aload           28
	//   63  171:ldc2            #298 <String "period_start_time">
	//   64  174:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   65  179:istore          15
		k1 = cursor.getColumnIndexOrThrow("minimum_retention_duration");
	//   66  181:aload           28
	//   67  183:ldc2            #300 <String "minimum_retention_duration">
	//   68  186:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   69  191:istore          7
		int j1;
		int l1;
		int k2;
		int j4;
		int l4;
		int i5;
		int j5;
		int k5;
		int l5;
		ArrayList arraylist;
		j1 = cursor.getColumnIndexOrThrow("schedule_requested_at");
	//   70  193:aload           28
	//   71  195:ldc2            #302 <String "schedule_requested_at">
	//   72  198:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   73  203:istore          6
		l1 = cursor.getColumnIndexOrThrow("required_network_type");
	//   74  205:aload           28
	//   75  207:ldc2            #304 <String "required_network_type">
	//   76  210:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   77  215:istore          8
		j4 = cursor.getColumnIndexOrThrow("requires_charging");
	//   78  217:aload           28
	//   79  219:ldc2            #306 <String "requires_charging">
	//   80  222:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   81  227:istore          18
		k2 = cursor.getColumnIndexOrThrow("requires_device_idle");
	//   82  229:aload           28
	//   83  231:ldc2            #308 <String "requires_device_idle">
	//   84  234:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   85  239:istore          11
		l4 = cursor.getColumnIndexOrThrow("requires_battery_not_low");
	//   86  241:aload           28
	//   87  243:ldc2            #310 <String "requires_battery_not_low">
	//   88  246:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   89  251:istore          20
		i5 = cursor.getColumnIndexOrThrow("requires_storage_not_low");
	//   90  253:aload           28
	//   91  255:ldc2            #312 <String "requires_storage_not_low">
	//   92  258:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   93  263:istore          21
		j5 = cursor.getColumnIndexOrThrow("trigger_content_update_delay");
	//   94  265:aload           28
	//   95  267:ldc2            #314 <String "trigger_content_update_delay">
	//   96  270:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   97  275:istore          22
		k5 = cursor.getColumnIndexOrThrow("trigger_max_content_delay");
	//   98  277:aload           28
	//   99  279:ldc2            #316 <String "trigger_max_content_delay">
	//  100  282:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//  101  287:istore          23
		l5 = cursor.getColumnIndexOrThrow("content_uri_triggers");
	//  102  289:aload           28
	//  103  291:ldc2            #318 <String "content_uri_triggers">
	//  104  294:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//  105  299:istore          24
		arraylist = new ArrayList(cursor.getCount());
	//  106  301:new             #207 <Class ArrayList>
	//  107  304:dup             
	//  108  305:aload           28
	//  109  307:invokeinterface #251 <Method int Cursor.getCount()>
	//  110  312:invokespecial   #252 <Method void ArrayList(int)>
	//  111  315:astore          26
		int j3;
		j3 = k1;
	//  112  317:iload           7
	//  113  319:istore          14
		k1 = j4;
	//  114  321:iload           18
	//  115  323:istore          7
_L2:
		Constraints constraints;
		Object obj;
		String s;
		if(!cursor.moveToNext())
			break; /* Loop/switch isn't completed */
	//  116  325:aload           28
	//  117  327:invokeinterface #193 <Method boolean Cursor.moveToNext()>
	//  118  332:ifeq            756
		obj = ((Object) (cursor.getString(j2)));
	//  119  335:aload           28
	//  120  337:iload           10
	//  121  339:invokeinterface #201 <Method String Cursor.getString(int)>
	//  122  344:astore          30
		s = cursor.getString(l2);
	//  123  346:aload           28
	//  124  348:iload           12
	//  125  350:invokeinterface #201 <Method String Cursor.getString(int)>
	//  126  355:astore          31
		constraints = new Constraints();
	//  127  357:new             #320 <Class Constraints>
	//  128  360:dup             
	//  129  361:invokespecial   #321 <Method void Constraints()>
	//  130  364:astore          29
		constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(cursor.getInt(l1)));
	//  131  366:aload           29
	//  132  368:aload           28
	//  133  370:iload           8
	//  134  372:invokeinterface #325 <Method int Cursor.getInt(int)>
	//  135  377:invokestatic    #331 <Method androidx.work.NetworkType WorkTypeConverters.intToNetworkType(int)>
	//  136  380:invokevirtual   #335 <Method void Constraints.setRequiredNetworkType(androidx.work.NetworkType)>
		boolean flag;
		Exception exception;
		if(cursor.getInt(k1) != 0)
	//* 137  383:aload           28
	//* 138  385:iload           7
	//* 139  387:invokeinterface #325 <Method int Cursor.getInt(int)>
	//* 140  392:ifeq            793
			flag = true;
	//  141  395:iconst_1        
	//  142  396:istore          25
		else
	//* 143  398:goto            401
	//* 144  401:aload           29
	//* 145  403:iload           25
	//* 146  405:invokevirtual   #339 <Method void Constraints.setRequiresCharging(boolean)>
	//* 147  408:aload           28
	//* 148  410:iload           11
	//* 149  412:invokeinterface #325 <Method int Cursor.getInt(int)>
	//* 150  417:ifeq            799
	//* 151  420:iconst_1        
	//* 152  421:istore          25
	//* 153  423:goto            426
	//* 154  426:aload           29
	//* 155  428:iload           25
	//* 156  430:invokevirtual   #342 <Method void Constraints.setRequiresDeviceIdle(boolean)>
	//* 157  433:aload           28
	//* 158  435:iload           20
	//* 159  437:invokeinterface #325 <Method int Cursor.getInt(int)>
	//* 160  442:ifeq            805
	//* 161  445:iconst_1        
	//* 162  446:istore          25
	//* 163  448:goto            451
	//* 164  451:aload           29
	//* 165  453:iload           25
	//* 166  455:invokevirtual   #345 <Method void Constraints.setRequiresBatteryNotLow(boolean)>
	//* 167  458:aload           28
	//* 168  460:iload           21
	//* 169  462:invokeinterface #325 <Method int Cursor.getInt(int)>
	//* 170  467:ifeq            811
	//* 171  470:iconst_1        
	//* 172  471:istore          25
	//* 173  473:goto            476
	//* 174  476:aload           29
	//* 175  478:iload           25
	//* 176  480:invokevirtual   #348 <Method void Constraints.setRequiresStorageNotLow(boolean)>
	//* 177  483:aload           29
	//* 178  485:aload           28
	//* 179  487:iload           22
	//* 180  489:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 181  494:invokevirtual   #356 <Method void Constraints.setTriggerContentUpdateDelay(long)>
	//* 182  497:aload           29
	//* 183  499:aload           28
	//* 184  501:iload           23
	//* 185  503:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 186  508:invokevirtual   #359 <Method void Constraints.setTriggerMaxContentDelay(long)>
	//* 187  511:aload           29
	//* 188  513:aload           28
	//* 189  515:iload           24
	//* 190  517:invokeinterface #363 <Method byte[] Cursor.getBlob(int)>
	//* 191  522:invokestatic    #367 <Method androidx.work.ContentUriTriggers WorkTypeConverters.byteArrayToContentUriTriggers(byte[])>
	//* 192  525:invokevirtual   #371 <Method void Constraints.setContentUriTriggers(androidx.work.ContentUriTriggers)>
	//* 193  528:new             #373 <Class WorkSpec>
	//* 194  531:dup             
	//* 195  532:aload           30
	//* 196  534:aload           31
	//* 197  536:invokespecial   #376 <Method void WorkSpec(String, String)>
	//* 198  539:astore          30
	//* 199  541:aload           30
	//* 200  543:aload           28
	//* 201  545:iload           19
	//* 202  547:invokeinterface #325 <Method int Cursor.getInt(int)>
	//* 203  552:invokestatic    #380 <Method androidx.work.WorkInfo$State WorkTypeConverters.intToState(int)>
	//* 204  555:putfield        #383 <Field androidx.work.WorkInfo$State WorkSpec.state>
	//* 205  558:aload           30
	//* 206  560:aload           28
	//* 207  562:iload           13
	//* 208  564:invokeinterface #201 <Method String Cursor.getString(int)>
	//* 209  569:putfield        #387 <Field String WorkSpec.inputMergerClassName>
	//* 210  572:aload           30
	//* 211  574:aload           28
	//* 212  576:iload           9
	//* 213  578:invokeinterface #363 <Method byte[] Cursor.getBlob(int)>
	//* 214  583:invokestatic    #393 <Method Data Data.fromByteArray(byte[])>
	//* 215  586:putfield        #396 <Field Data WorkSpec.input>
	//* 216  589:aload           30
	//* 217  591:aload           28
	//* 218  593:iload           17
	//* 219  595:invokeinterface #363 <Method byte[] Cursor.getBlob(int)>
	//* 220  600:invokestatic    #393 <Method Data Data.fromByteArray(byte[])>
	//* 221  603:putfield        #398 <Field Data WorkSpec.output>
	//* 222  606:aload           30
	//* 223  608:aload           28
	//* 224  610:iload           4
	//* 225  612:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 226  617:putfield        #402 <Field long WorkSpec.initialDelay>
	//* 227  620:aload           30
	//* 228  622:aload           28
	//* 229  624:iload_3         
	//* 230  625:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 231  630:putfield        #405 <Field long WorkSpec.intervalDuration>
	//* 232  633:aload           30
	//* 233  635:aload           28
	//* 234  637:iload_1         
	//* 235  638:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 236  643:putfield        #408 <Field long WorkSpec.flexDuration>
	//* 237  646:aload           30
	//* 238  648:aload           28
	//* 239  650:iload           16
	//* 240  652:invokeinterface #325 <Method int Cursor.getInt(int)>
	//* 241  657:putfield        #412 <Field int WorkSpec.runAttemptCount>
	//* 242  660:aload           28
	//* 243  662:iload           5
	//* 244  664:invokeinterface #325 <Method int Cursor.getInt(int)>
	//* 245  669:istore          18
	//* 246  671:aload           30
	//* 247  673:iload           18
	//* 248  675:invokestatic    #416 <Method androidx.work.BackoffPolicy WorkTypeConverters.intToBackoffPolicy(int)>
	//* 249  678:putfield        #420 <Field androidx.work.BackoffPolicy WorkSpec.backoffPolicy>
	//* 250  681:aload           30
	//* 251  683:aload           28
	//* 252  685:iload_2         
	//* 253  686:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 254  691:putfield        #423 <Field long WorkSpec.backoffDelayDuration>
	//* 255  694:aload           30
	//* 256  696:aload           28
	//* 257  698:iload           15
	//* 258  700:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 259  705:putfield        #426 <Field long WorkSpec.periodStartTime>
	//* 260  708:aload           30
	//* 261  710:aload           28
	//* 262  712:iload           14
	//* 263  714:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 264  719:putfield        #429 <Field long WorkSpec.minimumRetentionDuration>
	//* 265  722:aload           30
	//* 266  724:aload           28
	//* 267  726:iload           6
	//* 268  728:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 269  733:putfield        #432 <Field long WorkSpec.scheduleRequestedAt>
	//* 270  736:aload           30
	//* 271  738:aload           29
	//* 272  740:putfield        #436 <Field Constraints WorkSpec.constraints>
	//* 273  743:aload           26
	//* 274  745:aload           30
	//* 275  747:invokeinterface #255 <Method boolean List.add(Object)>
	//* 276  752:pop             
	//* 277  753:goto            325
	//* 278  756:aload           28
	//* 279  758:invokeinterface #190 <Method void Cursor.close()>
	//* 280  763:aload           27
	//* 281  765:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
	//* 282  768:aload           26
	//* 283  770:areturn         
	//* 284  771:astore          26
	//* 285  773:goto            778
	//* 286  776:astore          26
	//* 287  778:aload           28
	//* 288  780:invokeinterface #190 <Method void Cursor.close()>
	//* 289  785:aload           27
	//* 290  787:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
	//* 291  790:aload           26
	//* 292  792:athrow          
			flag = false;
	//  293  793:iconst_0        
	//  294  794:istore          25
		constraints.setRequiresCharging(flag);
		if(cursor.getInt(k2) != 0)
			flag = true;
		else
	//* 295  796:goto            401
			flag = false;
	//  296  799:iconst_0        
	//  297  800:istore          25
		constraints.setRequiresDeviceIdle(flag);
		if(cursor.getInt(l4) != 0)
			flag = true;
		else
	//* 298  802:goto            426
			flag = false;
	//  299  805:iconst_0        
	//  300  806:istore          25
		constraints.setRequiresBatteryNotLow(flag);
		if(cursor.getInt(i5) != 0)
			flag = true;
		else
	//* 301  808:goto            451
			flag = false;
	//  302  811:iconst_0        
	//  303  812:istore          25
		constraints.setRequiresStorageNotLow(flag);
		constraints.setTriggerContentUpdateDelay(cursor.getLong(j5));
		constraints.setTriggerMaxContentDelay(cursor.getLong(k5));
		constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(cursor.getBlob(l5)));
		obj = ((Object) (new WorkSpec(((String) (obj)), s)));
		obj.state = WorkTypeConverters.intToState(cursor.getInt(k4));
		obj.inputMergerClassName = cursor.getString(i3);
		obj.input = Data.fromByteArray(cursor.getBlob(i2));
		obj.output = Data.fromByteArray(cursor.getBlob(i4));
		obj.initialDelay = cursor.getLong(l);
		obj.intervalDuration = cursor.getLong(k);
		obj.flexDuration = cursor.getLong(i);
		obj.runAttemptCount = cursor.getInt(l3);
		j4 = cursor.getInt(i1);
		obj.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(j4);
		obj.backoffDelayDuration = cursor.getLong(j);
		obj.periodStartTime = cursor.getLong(k3);
		obj.minimumRetentionDuration = cursor.getLong(j3);
		obj.scheduleRequestedAt = cursor.getLong(j1);
		obj.constraints = constraints;
		((List) (arraylist)).add(obj);
		if(true) goto _L2; else goto _L1
_L1:
		cursor.close();
		roomsqlitequery.release();
		return ((List) (arraylist));
		exception;
		break MISSING_BLOCK_LABEL_778;
		exception;
		cursor.close();
		roomsqlitequery.release();
		throw exception;
	//* 304  814:goto            476
	}

	public List getInputsFromPrerequisites(String s)
	{
		RoomSQLiteQuery roomsqlitequery;
		roomsqlitequery = RoomSQLiteQuery.acquire("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
	//    0    0:ldc2            #441 <String "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)">
	//    1    3:iconst_1        
	//    2    4:invokestatic    #151 <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//    3    7:astore_2        
		if(s == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       20
			roomsqlitequery.bindNull(1);
	//    6   12:aload_2         
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #169 <Method void RoomSQLiteQuery.bindNull(int)>
		else
	//*   9   17:goto            26
			roomsqlitequery.bindString(1, s);
	//   10   20:aload_2         
	//   11   21:iconst_1        
	//   12   22:aload_1         
	//   13   23:invokevirtual   #173 <Method void RoomSQLiteQuery.bindString(int, String)>
		s = ((String) (__db.query(((android.arch.persistence.db.SupportSQLiteQuery) (roomsqlitequery)))));
	//   14   26:aload_0         
	//   15   27:getfield        #56  <Field RoomDatabase __db>
	//   16   30:aload_2         
	//   17   31:invokevirtual   #179 <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
	//   18   34:astore_1        
		ArrayList arraylist;
		arraylist = new ArrayList(((Cursor) (s)).getCount());
	//   19   35:new             #207 <Class ArrayList>
	//   20   38:dup             
	//   21   39:aload_1         
	//   22   40:invokeinterface #251 <Method int Cursor.getCount()>
	//   23   45:invokespecial   #252 <Method void ArrayList(int)>
	//   24   48:astore_3        
		for(; ((Cursor) (s)).moveToNext(); ((List) (arraylist)).add(((Object) (Data.fromByteArray(((Cursor) (s)).getBlob(0))))));
	//   25   49:aload_1         
	//   26   50:invokeinterface #193 <Method boolean Cursor.moveToNext()>
	//   27   55:ifeq            78
	//   28   58:aload_3         
	//   29   59:aload_1         
	//   30   60:iconst_0        
	//   31   61:invokeinterface #363 <Method byte[] Cursor.getBlob(int)>
	//   32   66:invokestatic    #393 <Method Data Data.fromByteArray(byte[])>
	//   33   69:invokeinterface #255 <Method boolean List.add(Object)>
	//   34   74:pop             
	//*  35   75:goto            49
		((Cursor) (s)).close();
	//   36   78:aload_1         
	//   37   79:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//   38   84:aload_2         
	//   39   85:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		return ((List) (arraylist));
	//   40   88:aload_3         
	//   41   89:areturn         
		Exception exception;
		exception;
	//   42   90:astore_3        
		((Cursor) (s)).close();
	//   43   91:aload_1         
	//   44   92:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//   45   97:aload_2         
	//   46   98:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		throw exception;
	//   47  101:aload_3         
	//   48  102:athrow          
	}

	public androidx.work.WorkInfo.State getState(String s)
	{
		RoomSQLiteQuery roomsqlitequery;
		Cursor cursor;
		roomsqlitequery = RoomSQLiteQuery.acquire("SELECT state FROM workspec WHERE id=?", 1);
	//    0    0:ldc2            #446 <String "SELECT state FROM workspec WHERE id=?">
	//    1    3:iconst_1        
	//    2    4:invokestatic    #151 <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//    3    7:astore_2        
		if(s == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       20
			roomsqlitequery.bindNull(1);
	//    6   12:aload_2         
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #169 <Method void RoomSQLiteQuery.bindNull(int)>
		else
	//*   9   17:goto            26
			roomsqlitequery.bindString(1, s);
	//   10   20:aload_2         
	//   11   21:iconst_1        
	//   12   22:aload_1         
	//   13   23:invokevirtual   #173 <Method void RoomSQLiteQuery.bindString(int, String)>
		cursor = __db.query(((android.arch.persistence.db.SupportSQLiteQuery) (roomsqlitequery)));
	//   14   26:aload_0         
	//   15   27:getfield        #56  <Field RoomDatabase __db>
	//   16   30:aload_2         
	//   17   31:invokevirtual   #179 <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
	//   18   34:astore_3        
label0:
		{
			if(cursor.moveToFirst())
	//*  19   35:aload_3         
	//*  20   36:invokeinterface #449 <Method boolean Cursor.moveToFirst()>
	//*  21   41:ifeq            58
			{
				s = ((String) (WorkTypeConverters.intToState(cursor.getInt(0))));
	//   22   44:aload_3         
	//   23   45:iconst_0        
	//   24   46:invokeinterface #325 <Method int Cursor.getInt(int)>
	//   25   51:invokestatic    #380 <Method androidx.work.WorkInfo$State WorkTypeConverters.intToState(int)>
	//   26   54:astore_1        
				break label0;
	//   27   55:goto            60
			}
			s = null;
	//   28   58:aconst_null     
	//   29   59:astore_1        
		}
		cursor.close();
	//   30   60:aload_3         
	//   31   61:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//   32   66:aload_2         
	//   33   67:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		return ((androidx.work.WorkInfo.State) (s));
	//   34   70:aload_1         
	//   35   71:areturn         
		s;
	//   36   72:astore_1        
		cursor.close();
	//   37   73:aload_3         
	//   38   74:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//   39   79:aload_2         
	//   40   80:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		throw s;
	//   41   83:aload_1         
	//   42   84:athrow          
	}

	public List getUnfinishedWorkWithName(String s)
	{
		RoomSQLiteQuery roomsqlitequery;
		roomsqlitequery = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
	//    0    0:ldc2            #452 <String "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)">
	//    1    3:iconst_1        
	//    2    4:invokestatic    #151 <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//    3    7:astore_2        
		if(s == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       20
			roomsqlitequery.bindNull(1);
	//    6   12:aload_2         
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #169 <Method void RoomSQLiteQuery.bindNull(int)>
		else
	//*   9   17:goto            26
			roomsqlitequery.bindString(1, s);
	//   10   20:aload_2         
	//   11   21:iconst_1        
	//   12   22:aload_1         
	//   13   23:invokevirtual   #173 <Method void RoomSQLiteQuery.bindString(int, String)>
		s = ((String) (__db.query(((android.arch.persistence.db.SupportSQLiteQuery) (roomsqlitequery)))));
	//   14   26:aload_0         
	//   15   27:getfield        #56  <Field RoomDatabase __db>
	//   16   30:aload_2         
	//   17   31:invokevirtual   #179 <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
	//   18   34:astore_1        
		ArrayList arraylist;
		arraylist = new ArrayList(((Cursor) (s)).getCount());
	//   19   35:new             #207 <Class ArrayList>
	//   20   38:dup             
	//   21   39:aload_1         
	//   22   40:invokeinterface #251 <Method int Cursor.getCount()>
	//   23   45:invokespecial   #252 <Method void ArrayList(int)>
	//   24   48:astore_3        
		for(; ((Cursor) (s)).moveToNext(); ((List) (arraylist)).add(((Object) (((Cursor) (s)).getString(0)))));
	//   25   49:aload_1         
	//   26   50:invokeinterface #193 <Method boolean Cursor.moveToNext()>
	//   27   55:ifeq            75
	//   28   58:aload_3         
	//   29   59:aload_1         
	//   30   60:iconst_0        
	//   31   61:invokeinterface #201 <Method String Cursor.getString(int)>
	//   32   66:invokeinterface #255 <Method boolean List.add(Object)>
	//   33   71:pop             
	//*  34   72:goto            49
		((Cursor) (s)).close();
	//   35   75:aload_1         
	//   36   76:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//   37   81:aload_2         
	//   38   82:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		return ((List) (arraylist));
	//   39   85:aload_3         
	//   40   86:areturn         
		Exception exception;
		exception;
	//   41   87:astore_3        
		((Cursor) (s)).close();
	//   42   88:aload_1         
	//   43   89:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//   44   94:aload_2         
	//   45   95:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		throw exception;
	//   46   98:aload_3         
	//   47   99:athrow          
	}

	public List getUnfinishedWorkWithTag(String s)
	{
		RoomSQLiteQuery roomsqlitequery;
		roomsqlitequery = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
	//    0    0:ldc2            #456 <String "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)">
	//    1    3:iconst_1        
	//    2    4:invokestatic    #151 <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//    3    7:astore_2        
		if(s == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       20
			roomsqlitequery.bindNull(1);
	//    6   12:aload_2         
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #169 <Method void RoomSQLiteQuery.bindNull(int)>
		else
	//*   9   17:goto            26
			roomsqlitequery.bindString(1, s);
	//   10   20:aload_2         
	//   11   21:iconst_1        
	//   12   22:aload_1         
	//   13   23:invokevirtual   #173 <Method void RoomSQLiteQuery.bindString(int, String)>
		s = ((String) (__db.query(((android.arch.persistence.db.SupportSQLiteQuery) (roomsqlitequery)))));
	//   14   26:aload_0         
	//   15   27:getfield        #56  <Field RoomDatabase __db>
	//   16   30:aload_2         
	//   17   31:invokevirtual   #179 <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
	//   18   34:astore_1        
		ArrayList arraylist;
		arraylist = new ArrayList(((Cursor) (s)).getCount());
	//   19   35:new             #207 <Class ArrayList>
	//   20   38:dup             
	//   21   39:aload_1         
	//   22   40:invokeinterface #251 <Method int Cursor.getCount()>
	//   23   45:invokespecial   #252 <Method void ArrayList(int)>
	//   24   48:astore_3        
		for(; ((Cursor) (s)).moveToNext(); ((List) (arraylist)).add(((Object) (((Cursor) (s)).getString(0)))));
	//   25   49:aload_1         
	//   26   50:invokeinterface #193 <Method boolean Cursor.moveToNext()>
	//   27   55:ifeq            75
	//   28   58:aload_3         
	//   29   59:aload_1         
	//   30   60:iconst_0        
	//   31   61:invokeinterface #201 <Method String Cursor.getString(int)>
	//   32   66:invokeinterface #255 <Method boolean List.add(Object)>
	//   33   71:pop             
	//*  34   72:goto            49
		((Cursor) (s)).close();
	//   35   75:aload_1         
	//   36   76:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//   37   81:aload_2         
	//   38   82:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		return ((List) (arraylist));
	//   39   85:aload_3         
	//   40   86:areturn         
		Exception exception;
		exception;
	//   41   87:astore_3        
		((Cursor) (s)).close();
	//   42   88:aload_1         
	//   43   89:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//   44   94:aload_2         
	//   45   95:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		throw exception;
	//   46   98:aload_3         
	//   47   99:athrow          
	}

	public WorkSpec getWorkSpec(String s)
	{
		RoomSQLiteQuery roomsqlitequery;
		Cursor cursor;
		roomsqlitequery = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE id=?", 1);
	//    0    0:ldc2            #460 <String "SELECT * FROM workspec WHERE id=?">
	//    1    3:iconst_1        
	//    2    4:invokestatic    #151 <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//    3    7:astore          27
		if(s == null)
	//*   4    9:aload_1         
	//*   5   10:ifnonnull       22
			roomsqlitequery.bindNull(1);
	//    6   13:aload           27
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #169 <Method void RoomSQLiteQuery.bindNull(int)>
		else
	//*   9   19:goto            29
			roomsqlitequery.bindString(1, s);
	//   10   22:aload           27
	//   11   24:iconst_1        
	//   12   25:aload_1         
	//   13   26:invokevirtual   #173 <Method void RoomSQLiteQuery.bindString(int, String)>
		cursor = __db.query(((android.arch.persistence.db.SupportSQLiteQuery) (roomsqlitequery)));
	//   14   29:aload_0         
	//   15   30:getfield        #56  <Field RoomDatabase __db>
	//   16   33:aload           27
	//   17   35:invokevirtual   #179 <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
	//   18   38:astore          28
		int i;
		int j;
		int k;
		int l;
		int i1;
		int j1;
		int k1;
		int l1;
		int i2;
		int j2;
		int k2;
		int l2;
		int l4;
		int i5;
		l4 = cursor.getColumnIndexOrThrow("id");
	//   19   40:aload           28
	//   20   42:ldc2            #271 <String "id">
	//   21   45:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   22   50:istore          21
		i = cursor.getColumnIndexOrThrow("state");
	//   23   52:aload           28
	//   24   54:ldc2            #276 <String "state">
	//   25   57:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   26   62:istore_2        
		i5 = cursor.getColumnIndexOrThrow("worker_class_name");
	//   27   63:aload           28
	//   28   65:ldc2            #278 <String "worker_class_name">
	//   29   68:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   30   73:istore          22
		j = cursor.getColumnIndexOrThrow("input_merger_class_name");
	//   31   75:aload           28
	//   32   77:ldc2            #280 <String "input_merger_class_name">
	//   33   80:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   34   85:istore_3        
		k = cursor.getColumnIndexOrThrow("input");
	//   35   86:aload           28
	//   36   88:ldc2            #282 <String "input">
	//   37   91:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   38   96:istore          4
		l = cursor.getColumnIndexOrThrow("output");
	//   39   98:aload           28
	//   40  100:ldc2            #284 <String "output">
	//   41  103:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   42  108:istore          5
		i1 = cursor.getColumnIndexOrThrow("initial_delay");
	//   43  110:aload           28
	//   44  112:ldc2            #286 <String "initial_delay">
	//   45  115:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   46  120:istore          6
		j1 = cursor.getColumnIndexOrThrow("interval_duration");
	//   47  122:aload           28
	//   48  124:ldc2            #288 <String "interval_duration">
	//   49  127:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   50  132:istore          7
		k1 = cursor.getColumnIndexOrThrow("flex_duration");
	//   51  134:aload           28
	//   52  136:ldc2            #290 <String "flex_duration">
	//   53  139:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   54  144:istore          8
		l1 = cursor.getColumnIndexOrThrow("run_attempt_count");
	//   55  146:aload           28
	//   56  148:ldc2            #292 <String "run_attempt_count">
	//   57  151:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   58  156:istore          9
		i2 = cursor.getColumnIndexOrThrow("backoff_policy");
	//   59  158:aload           28
	//   60  160:ldc2            #294 <String "backoff_policy">
	//   61  163:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   62  168:istore          10
		j2 = cursor.getColumnIndexOrThrow("backoff_delay_duration");
	//   63  170:aload           28
	//   64  172:ldc2            #296 <String "backoff_delay_duration">
	//   65  175:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   66  180:istore          11
		k2 = cursor.getColumnIndexOrThrow("period_start_time");
	//   67  182:aload           28
	//   68  184:ldc2            #298 <String "period_start_time">
	//   69  187:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   70  192:istore          12
		l2 = cursor.getColumnIndexOrThrow("minimum_retention_duration");
	//   71  194:aload           28
	//   72  196:ldc2            #300 <String "minimum_retention_duration">
	//   73  199:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   74  204:istore          13
		int i3;
		int j3;
		int k3;
		int l3;
		int i4;
		int j4;
		int k4;
		Constraints constraints;
		String s1;
		i3 = cursor.getColumnIndexOrThrow("schedule_requested_at");
	//   75  206:aload           28
	//   76  208:ldc2            #302 <String "schedule_requested_at">
	//   77  211:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   78  216:istore          14
		int j5 = cursor.getColumnIndexOrThrow("required_network_type");
	//   79  218:aload           28
	//   80  220:ldc2            #304 <String "required_network_type">
	//   81  223:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   82  228:istore          23
		int k5 = cursor.getColumnIndexOrThrow("requires_charging");
	//   83  230:aload           28
	//   84  232:ldc2            #306 <String "requires_charging">
	//   85  235:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   86  240:istore          24
		j3 = cursor.getColumnIndexOrThrow("requires_device_idle");
	//   87  242:aload           28
	//   88  244:ldc2            #308 <String "requires_device_idle">
	//   89  247:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   90  252:istore          15
		k3 = cursor.getColumnIndexOrThrow("requires_battery_not_low");
	//   91  254:aload           28
	//   92  256:ldc2            #310 <String "requires_battery_not_low">
	//   93  259:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   94  264:istore          16
		l3 = cursor.getColumnIndexOrThrow("requires_storage_not_low");
	//   95  266:aload           28
	//   96  268:ldc2            #312 <String "requires_storage_not_low">
	//   97  271:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   98  276:istore          17
		i4 = cursor.getColumnIndexOrThrow("trigger_content_update_delay");
	//   99  278:aload           28
	//  100  280:ldc2            #314 <String "trigger_content_update_delay">
	//  101  283:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//  102  288:istore          18
		j4 = cursor.getColumnIndexOrThrow("trigger_max_content_delay");
	//  103  290:aload           28
	//  104  292:ldc2            #316 <String "trigger_max_content_delay">
	//  105  295:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//  106  300:istore          19
		k4 = cursor.getColumnIndexOrThrow("content_uri_triggers");
	//  107  302:aload           28
	//  108  304:ldc2            #318 <String "content_uri_triggers">
	//  109  307:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//  110  312:istore          20
		if(!cursor.moveToFirst())
			break MISSING_BLOCK_LABEL_723;
	//  111  314:aload           28
	//  112  316:invokeinterface #449 <Method boolean Cursor.moveToFirst()>
	//  113  321:ifeq            723
		s = cursor.getString(l4);
	//  114  324:aload           28
	//  115  326:iload           21
	//  116  328:invokeinterface #201 <Method String Cursor.getString(int)>
	//  117  333:astore_1        
		s1 = cursor.getString(i5);
	//  118  334:aload           28
	//  119  336:iload           22
	//  120  338:invokeinterface #201 <Method String Cursor.getString(int)>
	//  121  343:astore          30
		constraints = new Constraints();
	//  122  345:new             #320 <Class Constraints>
	//  123  348:dup             
	//  124  349:invokespecial   #321 <Method void Constraints()>
	//  125  352:astore          29
		constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(cursor.getInt(j5)));
	//  126  354:aload           29
	//  127  356:aload           28
	//  128  358:iload           23
	//  129  360:invokeinterface #325 <Method int Cursor.getInt(int)>
	//  130  365:invokestatic    #331 <Method androidx.work.NetworkType WorkTypeConverters.intToNetworkType(int)>
	//  131  368:invokevirtual   #335 <Method void Constraints.setRequiredNetworkType(androidx.work.NetworkType)>
		l4 = cursor.getInt(k5);
	//  132  371:aload           28
	//  133  373:iload           24
	//  134  375:invokeinterface #325 <Method int Cursor.getInt(int)>
	//  135  380:istore          21
		boolean flag;
		boolean flag1 = false;
	//  136  382:iconst_0        
	//  137  383:istore          26
		if(l4 != 0)
	//* 138  385:iload           21
	//* 139  387:ifeq            758
			flag = true;
	//  140  390:iconst_1        
	//  141  391:istore          25
		else
	//* 142  393:goto            396
	//* 143  396:aload           29
	//* 144  398:iload           25
	//* 145  400:invokevirtual   #339 <Method void Constraints.setRequiresCharging(boolean)>
	//* 146  403:aload           28
	//* 147  405:iload           15
	//* 148  407:invokeinterface #325 <Method int Cursor.getInt(int)>
	//* 149  412:ifeq            764
	//* 150  415:iconst_1        
	//* 151  416:istore          25
	//* 152  418:goto            421
	//* 153  421:aload           29
	//* 154  423:iload           25
	//* 155  425:invokevirtual   #342 <Method void Constraints.setRequiresDeviceIdle(boolean)>
	//* 156  428:aload           28
	//* 157  430:iload           16
	//* 158  432:invokeinterface #325 <Method int Cursor.getInt(int)>
	//* 159  437:ifeq            770
	//* 160  440:iconst_1        
	//* 161  441:istore          25
	//* 162  443:goto            446
	//* 163  446:aload           29
	//* 164  448:iload           25
	//* 165  450:invokevirtual   #345 <Method void Constraints.setRequiresBatteryNotLow(boolean)>
	//* 166  453:iload           26
	//* 167  455:istore          25
	//* 168  457:aload           28
	//* 169  459:iload           17
	//* 170  461:invokeinterface #325 <Method int Cursor.getInt(int)>
	//* 171  466:ifeq            472
	//* 172  469:iconst_1        
	//* 173  470:istore          25
	//* 174  472:aload           29
	//* 175  474:iload           25
	//* 176  476:invokevirtual   #348 <Method void Constraints.setRequiresStorageNotLow(boolean)>
	//* 177  479:aload           29
	//* 178  481:aload           28
	//* 179  483:iload           18
	//* 180  485:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 181  490:invokevirtual   #356 <Method void Constraints.setTriggerContentUpdateDelay(long)>
	//* 182  493:aload           29
	//* 183  495:aload           28
	//* 184  497:iload           19
	//* 185  499:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 186  504:invokevirtual   #359 <Method void Constraints.setTriggerMaxContentDelay(long)>
	//* 187  507:aload           29
	//* 188  509:aload           28
	//* 189  511:iload           20
	//* 190  513:invokeinterface #363 <Method byte[] Cursor.getBlob(int)>
	//* 191  518:invokestatic    #367 <Method androidx.work.ContentUriTriggers WorkTypeConverters.byteArrayToContentUriTriggers(byte[])>
	//* 192  521:invokevirtual   #371 <Method void Constraints.setContentUriTriggers(androidx.work.ContentUriTriggers)>
	//* 193  524:new             #373 <Class WorkSpec>
	//* 194  527:dup             
	//* 195  528:aload_1         
	//* 196  529:aload           30
	//* 197  531:invokespecial   #376 <Method void WorkSpec(String, String)>
	//* 198  534:astore_1        
	//* 199  535:aload_1         
	//* 200  536:aload           28
	//* 201  538:iload_2         
	//* 202  539:invokeinterface #325 <Method int Cursor.getInt(int)>
	//* 203  544:invokestatic    #380 <Method androidx.work.WorkInfo$State WorkTypeConverters.intToState(int)>
	//* 204  547:putfield        #383 <Field androidx.work.WorkInfo$State WorkSpec.state>
	//* 205  550:aload_1         
	//* 206  551:aload           28
	//* 207  553:iload_3         
	//* 208  554:invokeinterface #201 <Method String Cursor.getString(int)>
	//* 209  559:putfield        #387 <Field String WorkSpec.inputMergerClassName>
	//* 210  562:aload_1         
	//* 211  563:aload           28
	//* 212  565:iload           4
	//* 213  567:invokeinterface #363 <Method byte[] Cursor.getBlob(int)>
	//* 214  572:invokestatic    #393 <Method Data Data.fromByteArray(byte[])>
	//* 215  575:putfield        #396 <Field Data WorkSpec.input>
	//* 216  578:aload_1         
	//* 217  579:aload           28
	//* 218  581:iload           5
	//* 219  583:invokeinterface #363 <Method byte[] Cursor.getBlob(int)>
	//* 220  588:invokestatic    #393 <Method Data Data.fromByteArray(byte[])>
	//* 221  591:putfield        #398 <Field Data WorkSpec.output>
	//* 222  594:aload_1         
	//* 223  595:aload           28
	//* 224  597:iload           6
	//* 225  599:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 226  604:putfield        #402 <Field long WorkSpec.initialDelay>
	//* 227  607:aload_1         
	//* 228  608:aload           28
	//* 229  610:iload           7
	//* 230  612:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 231  617:putfield        #405 <Field long WorkSpec.intervalDuration>
	//* 232  620:aload_1         
	//* 233  621:aload           28
	//* 234  623:iload           8
	//* 235  625:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 236  630:putfield        #408 <Field long WorkSpec.flexDuration>
	//* 237  633:aload_1         
	//* 238  634:aload           28
	//* 239  636:iload           9
	//* 240  638:invokeinterface #325 <Method int Cursor.getInt(int)>
	//* 241  643:putfield        #412 <Field int WorkSpec.runAttemptCount>
	//* 242  646:aload_1         
	//* 243  647:aload           28
	//* 244  649:iload           10
	//* 245  651:invokeinterface #325 <Method int Cursor.getInt(int)>
	//* 246  656:invokestatic    #416 <Method androidx.work.BackoffPolicy WorkTypeConverters.intToBackoffPolicy(int)>
	//* 247  659:putfield        #420 <Field androidx.work.BackoffPolicy WorkSpec.backoffPolicy>
	//* 248  662:aload_1         
	//* 249  663:aload           28
	//* 250  665:iload           11
	//* 251  667:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 252  672:putfield        #423 <Field long WorkSpec.backoffDelayDuration>
	//* 253  675:aload_1         
	//* 254  676:aload           28
	//* 255  678:iload           12
	//* 256  680:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 257  685:putfield        #426 <Field long WorkSpec.periodStartTime>
	//* 258  688:aload_1         
	//* 259  689:aload           28
	//* 260  691:iload           13
	//* 261  693:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 262  698:putfield        #429 <Field long WorkSpec.minimumRetentionDuration>
	//* 263  701:aload_1         
	//* 264  702:aload           28
	//* 265  704:iload           14
	//* 266  706:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 267  711:putfield        #432 <Field long WorkSpec.scheduleRequestedAt>
	//* 268  714:aload_1         
	//* 269  715:aload           29
	//* 270  717:putfield        #436 <Field Constraints WorkSpec.constraints>
	//* 271  720:goto            725
	//* 272  723:aconst_null     
	//* 273  724:astore_1        
	//* 274  725:aload           28
	//* 275  727:invokeinterface #190 <Method void Cursor.close()>
	//* 276  732:aload           27
	//* 277  734:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
	//* 278  737:aload_1         
	//* 279  738:areturn         
	//* 280  739:astore_1        
	//* 281  740:goto            744
	//* 282  743:astore_1        
	//* 283  744:aload           28
	//* 284  746:invokeinterface #190 <Method void Cursor.close()>
	//* 285  751:aload           27
	//* 286  753:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
	//* 287  756:aload_1         
	//* 288  757:athrow          
			flag = false;
	//  289  758:iconst_0        
	//  290  759:istore          25
		constraints.setRequiresCharging(flag);
		if(cursor.getInt(j3) != 0)
			flag = true;
		else
	//* 291  761:goto            396
			flag = false;
	//  292  764:iconst_0        
	//  293  765:istore          25
		constraints.setRequiresDeviceIdle(flag);
		if(cursor.getInt(k3) != 0)
			flag = true;
		else
	//* 294  767:goto            421
			flag = false;
	//  295  770:iconst_0        
	//  296  771:istore          25
		constraints.setRequiresBatteryNotLow(flag);
		flag = flag1;
		if(cursor.getInt(l3) != 0)
			flag = true;
		constraints.setRequiresStorageNotLow(flag);
		constraints.setTriggerContentUpdateDelay(cursor.getLong(i4));
		constraints.setTriggerMaxContentDelay(cursor.getLong(j4));
		constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(cursor.getBlob(k4)));
		s = ((String) (new WorkSpec(s, s1)));
		s.state = WorkTypeConverters.intToState(cursor.getInt(i));
		s.inputMergerClassName = cursor.getString(j);
		s.input = Data.fromByteArray(cursor.getBlob(k));
		s.output = Data.fromByteArray(cursor.getBlob(l));
		s.initialDelay = cursor.getLong(i1);
		s.intervalDuration = cursor.getLong(j1);
		s.flexDuration = cursor.getLong(k1);
		s.runAttemptCount = cursor.getInt(l1);
		s.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursor.getInt(i2));
		s.backoffDelayDuration = cursor.getLong(j2);
		s.periodStartTime = cursor.getLong(k2);
		s.minimumRetentionDuration = cursor.getLong(l2);
		s.scheduleRequestedAt = cursor.getLong(i3);
		s.constraints = constraints;
		break MISSING_BLOCK_LABEL_725;
		s = null;
		cursor.close();
		roomsqlitequery.release();
		return ((WorkSpec) (s));
		s;
		break MISSING_BLOCK_LABEL_744;
		s;
		cursor.close();
		roomsqlitequery.release();
		throw s;
	//* 297  773:goto            446
	}

	public List getWorkSpecIdAndStatesForName(String s)
	{
		RoomSQLiteQuery roomsqlitequery;
		roomsqlitequery = RoomSQLiteQuery.acquire("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
	//    0    0:ldc2            #463 <String "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)">
	//    1    3:iconst_1        
	//    2    4:invokestatic    #151 <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//    3    7:astore          4
		if(s == null)
	//*   4    9:aload_1         
	//*   5   10:ifnonnull       22
			roomsqlitequery.bindNull(1);
	//    6   13:aload           4
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #169 <Method void RoomSQLiteQuery.bindNull(int)>
		else
	//*   9   19:goto            29
			roomsqlitequery.bindString(1, s);
	//   10   22:aload           4
	//   11   24:iconst_1        
	//   12   25:aload_1         
	//   13   26:invokevirtual   #173 <Method void RoomSQLiteQuery.bindString(int, String)>
		s = ((String) (__db.query(((android.arch.persistence.db.SupportSQLiteQuery) (roomsqlitequery)))));
	//   14   29:aload_0         
	//   15   30:getfield        #56  <Field RoomDatabase __db>
	//   16   33:aload           4
	//   17   35:invokevirtual   #179 <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
	//   18   38:astore_1        
		ArrayList arraylist;
		int i = ((Cursor) (s)).getColumnIndexOrThrow("id");
	//   19   39:aload_1         
	//   20   40:ldc2            #271 <String "id">
	//   21   43:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   22   48:istore_2        
		int j = ((Cursor) (s)).getColumnIndexOrThrow("state");
	//   23   49:aload_1         
	//   24   50:ldc2            #276 <String "state">
	//   25   53:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   26   58:istore_3        
		arraylist = new ArrayList(((Cursor) (s)).getCount());
	//   27   59:new             #207 <Class ArrayList>
	//   28   62:dup             
	//   29   63:aload_1         
	//   30   64:invokeinterface #251 <Method int Cursor.getCount()>
	//   31   69:invokespecial   #252 <Method void ArrayList(int)>
	//   32   72:astore          5
		WorkSpec.IdAndState idandstate;
		for(; ((Cursor) (s)).moveToNext(); ((List) (arraylist)).add(((Object) (idandstate))))
	//*  33   74:aload_1         
	//*  34   75:invokeinterface #193 <Method boolean Cursor.moveToNext()>
	//*  35   80:ifeq            132
		{
			idandstate = new WorkSpec.IdAndState();
	//   36   83:new             #465 <Class WorkSpec$IdAndState>
	//   37   86:dup             
	//   38   87:invokespecial   #466 <Method void WorkSpec$IdAndState()>
	//   39   90:astore          6
			idandstate.id = ((Cursor) (s)).getString(i);
	//   40   92:aload           6
	//   41   94:aload_1         
	//   42   95:iload_2         
	//   43   96:invokeinterface #201 <Method String Cursor.getString(int)>
	//   44  101:putfield        #468 <Field String WorkSpec$IdAndState.id>
			idandstate.state = WorkTypeConverters.intToState(((Cursor) (s)).getInt(j));
	//   45  104:aload           6
	//   46  106:aload_1         
	//   47  107:iload_3         
	//   48  108:invokeinterface #325 <Method int Cursor.getInt(int)>
	//   49  113:invokestatic    #380 <Method androidx.work.WorkInfo$State WorkTypeConverters.intToState(int)>
	//   50  116:putfield        #469 <Field androidx.work.WorkInfo$State WorkSpec$IdAndState.state>
		}

	//   51  119:aload           5
	//   52  121:aload           6
	//   53  123:invokeinterface #255 <Method boolean List.add(Object)>
	//   54  128:pop             
	//*  55  129:goto            74
		((Cursor) (s)).close();
	//   56  132:aload_1         
	//   57  133:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//   58  138:aload           4
	//   59  140:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		return ((List) (arraylist));
	//   60  143:aload           5
	//   61  145:areturn         
		Exception exception;
		exception;
	//   62  146:astore          5
		((Cursor) (s)).close();
	//   63  148:aload_1         
	//   64  149:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//   65  154:aload           4
	//   66  156:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		throw exception;
	//   67  159:aload           5
	//   68  161:athrow          
	}

	public WorkSpec[] getWorkSpecs(List list)
	{
		Object obj;
		Cursor cursor;
		obj = ((Object) (StringUtil.newStringBuilder()));
	//    0    0:invokestatic    #126 <Method StringBuilder StringUtil.newStringBuilder()>
	//    1    3:astore          28
		((StringBuilder) (obj)).append("SELECT * FROM workspec WHERE id IN (");
	//    2    5:aload           28
	//    3    7:ldc2            #474 <String "SELECT * FROM workspec WHERE id IN (">
	//    4   10:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:pop             
		int i = list.size();
	//    6   14:aload_1         
	//    7   15:invokeinterface #475 <Method int List.size()>
	//    8   20:istore_2        
		StringUtil.appendPlaceholders(((StringBuilder) (obj)), i);
	//    9   21:aload           28
	//   10   23:iload_2         
	//   11   24:invokestatic    #139 <Method void StringUtil.appendPlaceholders(StringBuilder, int)>
		((StringBuilder) (obj)).append(")");
	//   12   27:aload           28
	//   13   29:ldc1            #141 <String ")">
	//   14   31:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   15   34:pop             
		obj = ((Object) (RoomSQLiteQuery.acquire(((StringBuilder) (obj)).toString(), i + 0)));
	//   16   35:aload           28
	//   17   37:invokevirtual   #145 <Method String StringBuilder.toString()>
	//   18   40:iload_2         
	//   19   41:iconst_0        
	//   20   42:iadd            
	//   21   43:invokestatic    #151 <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//   22   46:astore          28
		list = ((List) (list.iterator()));
	//   23   48:aload_1         
	//   24   49:invokeinterface #476 <Method Iterator List.iterator()>
	//   25   54:astore_1        
		for(int j = 1; ((Iterator) (list)).hasNext(); j++)
	//*  26   55:iconst_1        
	//*  27   56:istore_2        
	//*  28   57:aload_1         
	//*  29   58:invokeinterface #160 <Method boolean Iterator.hasNext()>
	//*  30   63:ifeq            106
		{
			String s = (String)((Iterator) (list)).next();
	//   31   66:aload_1         
	//   32   67:invokeinterface #164 <Method Object Iterator.next()>
	//   33   72:checkcast       #166 <Class String>
	//   34   75:astore          29
			if(s == null)
	//*  35   77:aload           29
	//*  36   79:ifnonnull       91
				((RoomSQLiteQuery) (obj)).bindNull(j);
	//   37   82:aload           28
	//   38   84:iload_2         
	//   39   85:invokevirtual   #169 <Method void RoomSQLiteQuery.bindNull(int)>
			else
	//*  40   88:goto            99
				((RoomSQLiteQuery) (obj)).bindString(j, s);
	//   41   91:aload           28
	//   42   93:iload_2         
	//   43   94:aload           29
	//   44   96:invokevirtual   #173 <Method void RoomSQLiteQuery.bindString(int, String)>
		}

	//   45   99:iload_2         
	//   46  100:iconst_1        
	//   47  101:iadd            
	//   48  102:istore_2        
	//*  49  103:goto            57
		cursor = __db.query(((android.arch.persistence.db.SupportSQLiteQuery) (obj)));
	//   50  106:aload_0         
	//   51  107:getfield        #56  <Field RoomDatabase __db>
	//   52  110:aload           28
	//   53  112:invokevirtual   #179 <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
	//   54  115:astore          29
		int k;
		int l;
		int i1;
		int j1;
		int k1;
		int l1;
		int k2;
		int l2;
		int i3;
		int j4;
		int k4;
		int l4;
		int i5;
		int j5;
		i3 = cursor.getColumnIndexOrThrow("id");
	//   55  117:aload           29
	//   56  119:ldc2            #271 <String "id">
	//   57  122:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   58  127:istore          12
		i5 = cursor.getColumnIndexOrThrow("state");
	//   59  129:aload           29
	//   60  131:ldc2            #276 <String "state">
	//   61  134:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   62  139:istore          20
		k2 = cursor.getColumnIndexOrThrow("worker_class_name");
	//   63  141:aload           29
	//   64  143:ldc2            #278 <String "worker_class_name">
	//   65  146:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   66  151:istore          10
		l2 = cursor.getColumnIndexOrThrow("input_merger_class_name");
	//   67  153:aload           29
	//   68  155:ldc2            #280 <String "input_merger_class_name">
	//   69  158:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   70  163:istore          11
		l1 = cursor.getColumnIndexOrThrow("input");
	//   71  165:aload           29
	//   72  167:ldc2            #282 <String "input">
	//   73  170:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   74  175:istore          7
		j5 = cursor.getColumnIndexOrThrow("output");
	//   75  177:aload           29
	//   76  179:ldc2            #284 <String "output">
	//   77  182:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   78  187:istore          21
		l4 = cursor.getColumnIndexOrThrow("initial_delay");
	//   79  189:aload           29
	//   80  191:ldc2            #286 <String "initial_delay">
	//   81  194:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   82  199:istore          19
		k = cursor.getColumnIndexOrThrow("interval_duration");
	//   83  201:aload           29
	//   84  203:ldc2            #288 <String "interval_duration">
	//   85  206:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   86  211:istore_2        
		i1 = cursor.getColumnIndexOrThrow("flex_duration");
	//   87  212:aload           29
	//   88  214:ldc2            #290 <String "flex_duration">
	//   89  217:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   90  222:istore          4
		k4 = cursor.getColumnIndexOrThrow("run_attempt_count");
	//   91  224:aload           29
	//   92  226:ldc2            #292 <String "run_attempt_count">
	//   93  229:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   94  234:istore          18
		j1 = cursor.getColumnIndexOrThrow("backoff_policy");
	//   95  236:aload           29
	//   96  238:ldc2            #294 <String "backoff_policy">
	//   97  241:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   98  246:istore          5
		l = cursor.getColumnIndexOrThrow("backoff_delay_duration");
	//   99  248:aload           29
	//  100  250:ldc2            #296 <String "backoff_delay_duration">
	//  101  253:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//  102  258:istore_3        
		k1 = cursor.getColumnIndexOrThrow("period_start_time");
	//  103  259:aload           29
	//  104  261:ldc2            #298 <String "period_start_time">
	//  105  264:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//  106  269:istore          6
		j4 = cursor.getColumnIndexOrThrow("minimum_retention_duration");
	//  107  271:aload           29
	//  108  273:ldc2            #300 <String "minimum_retention_duration">
	//  109  276:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//  110  281:istore          17
		int i2;
		int j3;
		int k3;
		int l3;
		int i4;
		int k5;
		int l5;
		int i6;
		int j6;
		i4 = cursor.getColumnIndexOrThrow("schedule_requested_at");
	//  111  283:aload           29
	//  112  285:ldc2            #302 <String "schedule_requested_at">
	//  113  288:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//  114  293:istore          16
		j3 = cursor.getColumnIndexOrThrow("required_network_type");
	//  115  295:aload           29
	//  116  297:ldc2            #304 <String "required_network_type">
	//  117  300:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//  118  305:istore          13
		i2 = cursor.getColumnIndexOrThrow("requires_charging");
	//  119  307:aload           29
	//  120  309:ldc2            #306 <String "requires_charging">
	//  121  312:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//  122  317:istore          8
		l3 = cursor.getColumnIndexOrThrow("requires_device_idle");
	//  123  319:aload           29
	//  124  321:ldc2            #308 <String "requires_device_idle">
	//  125  324:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//  126  329:istore          15
		k3 = cursor.getColumnIndexOrThrow("requires_battery_not_low");
	//  127  331:aload           29
	//  128  333:ldc2            #310 <String "requires_battery_not_low">
	//  129  336:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//  130  341:istore          14
		k5 = cursor.getColumnIndexOrThrow("requires_storage_not_low");
	//  131  343:aload           29
	//  132  345:ldc2            #312 <String "requires_storage_not_low">
	//  133  348:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//  134  353:istore          22
		l5 = cursor.getColumnIndexOrThrow("trigger_content_update_delay");
	//  135  355:aload           29
	//  136  357:ldc2            #314 <String "trigger_content_update_delay">
	//  137  360:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//  138  365:istore          23
		i6 = cursor.getColumnIndexOrThrow("trigger_max_content_delay");
	//  139  367:aload           29
	//  140  369:ldc2            #316 <String "trigger_max_content_delay">
	//  141  372:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//  142  377:istore          24
		j6 = cursor.getColumnIndexOrThrow("content_uri_triggers");
	//  143  379:aload           29
	//  144  381:ldc2            #318 <String "content_uri_triggers">
	//  145  384:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//  146  389:istore          25
		list = ((List) (new WorkSpec[cursor.getCount()]));
	//  147  391:aload           29
	//  148  393:invokeinterface #251 <Method int Cursor.getCount()>
	//  149  398:anewarray       WorkSpec[]
	//  150  401:astore_1        
		int j2 = 0;
	//  151  402:iconst_0        
	//  152  403:istore          9
_L2:
		Constraints constraints;
		Object obj1;
		String s1;
		if(!cursor.moveToNext())
			break; /* Loop/switch isn't completed */
	//  153  405:aload           29
	//  154  407:invokeinterface #193 <Method boolean Cursor.moveToNext()>
	//  155  412:ifeq            839
		obj1 = ((Object) (cursor.getString(i3)));
	//  156  415:aload           29
	//  157  417:iload           12
	//  158  419:invokeinterface #201 <Method String Cursor.getString(int)>
	//  159  424:astore          31
		s1 = cursor.getString(k2);
	//  160  426:aload           29
	//  161  428:iload           10
	//  162  430:invokeinterface #201 <Method String Cursor.getString(int)>
	//  163  435:astore          32
		constraints = new Constraints();
	//  164  437:new             #320 <Class Constraints>
	//  165  440:dup             
	//  166  441:invokespecial   #321 <Method void Constraints()>
	//  167  444:astore          30
		constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(cursor.getInt(j3)));
	//  168  446:aload           30
	//  169  448:aload           29
	//  170  450:iload           13
	//  171  452:invokeinterface #325 <Method int Cursor.getInt(int)>
	//  172  457:invokestatic    #331 <Method androidx.work.NetworkType WorkTypeConverters.intToNetworkType(int)>
	//  173  460:invokevirtual   #335 <Method void Constraints.setRequiredNetworkType(androidx.work.NetworkType)>
		int k6;
		boolean flag;
		if(cursor.getInt(i2) != 0)
	//* 174  463:aload           29
	//* 175  465:iload           8
	//* 176  467:invokeinterface #325 <Method int Cursor.getInt(int)>
	//* 177  472:ifeq            872
			flag = true;
	//  178  475:iconst_1        
	//  179  476:istore          27
		else
	//* 180  478:goto            481
	//* 181  481:aload           30
	//* 182  483:iload           27
	//* 183  485:invokevirtual   #339 <Method void Constraints.setRequiresCharging(boolean)>
	//* 184  488:aload           29
	//* 185  490:iload           15
	//* 186  492:invokeinterface #325 <Method int Cursor.getInt(int)>
	//* 187  497:ifeq            878
	//* 188  500:iconst_1        
	//* 189  501:istore          27
	//* 190  503:goto            506
	//* 191  506:aload           30
	//* 192  508:iload           27
	//* 193  510:invokevirtual   #342 <Method void Constraints.setRequiresDeviceIdle(boolean)>
	//* 194  513:aload           29
	//* 195  515:iload           14
	//* 196  517:invokeinterface #325 <Method int Cursor.getInt(int)>
	//* 197  522:ifeq            884
	//* 198  525:iconst_1        
	//* 199  526:istore          27
	//* 200  528:goto            531
	//* 201  531:aload           30
	//* 202  533:iload           27
	//* 203  535:invokevirtual   #345 <Method void Constraints.setRequiresBatteryNotLow(boolean)>
	//* 204  538:aload           29
	//* 205  540:iload           22
	//* 206  542:invokeinterface #325 <Method int Cursor.getInt(int)>
	//* 207  547:ifeq            890
	//* 208  550:iconst_1        
	//* 209  551:istore          27
	//* 210  553:goto            556
	//* 211  556:aload           30
	//* 212  558:iload           27
	//* 213  560:invokevirtual   #348 <Method void Constraints.setRequiresStorageNotLow(boolean)>
	//* 214  563:aload           30
	//* 215  565:aload           29
	//* 216  567:iload           23
	//* 217  569:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 218  574:invokevirtual   #356 <Method void Constraints.setTriggerContentUpdateDelay(long)>
	//* 219  577:aload           30
	//* 220  579:aload           29
	//* 221  581:iload           24
	//* 222  583:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 223  588:invokevirtual   #359 <Method void Constraints.setTriggerMaxContentDelay(long)>
	//* 224  591:aload           30
	//* 225  593:aload           29
	//* 226  595:iload           25
	//* 227  597:invokeinterface #363 <Method byte[] Cursor.getBlob(int)>
	//* 228  602:invokestatic    #367 <Method androidx.work.ContentUriTriggers WorkTypeConverters.byteArrayToContentUriTriggers(byte[])>
	//* 229  605:invokevirtual   #371 <Method void Constraints.setContentUriTriggers(androidx.work.ContentUriTriggers)>
	//* 230  608:new             #373 <Class WorkSpec>
	//* 231  611:dup             
	//* 232  612:aload           31
	//* 233  614:aload           32
	//* 234  616:invokespecial   #376 <Method void WorkSpec(String, String)>
	//* 235  619:astore          31
	//* 236  621:aload           31
	//* 237  623:aload           29
	//* 238  625:iload           20
	//* 239  627:invokeinterface #325 <Method int Cursor.getInt(int)>
	//* 240  632:invokestatic    #380 <Method androidx.work.WorkInfo$State WorkTypeConverters.intToState(int)>
	//* 241  635:putfield        #383 <Field androidx.work.WorkInfo$State WorkSpec.state>
	//* 242  638:aload           31
	//* 243  640:aload           29
	//* 244  642:iload           11
	//* 245  644:invokeinterface #201 <Method String Cursor.getString(int)>
	//* 246  649:putfield        #387 <Field String WorkSpec.inputMergerClassName>
	//* 247  652:aload           31
	//* 248  654:aload           29
	//* 249  656:iload           7
	//* 250  658:invokeinterface #363 <Method byte[] Cursor.getBlob(int)>
	//* 251  663:invokestatic    #393 <Method Data Data.fromByteArray(byte[])>
	//* 252  666:putfield        #396 <Field Data WorkSpec.input>
	//* 253  669:aload           31
	//* 254  671:aload           29
	//* 255  673:iload           21
	//* 256  675:invokeinterface #363 <Method byte[] Cursor.getBlob(int)>
	//* 257  680:invokestatic    #393 <Method Data Data.fromByteArray(byte[])>
	//* 258  683:putfield        #398 <Field Data WorkSpec.output>
	//* 259  686:aload           31
	//* 260  688:aload           29
	//* 261  690:iload           19
	//* 262  692:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 263  697:putfield        #402 <Field long WorkSpec.initialDelay>
	//* 264  700:aload           31
	//* 265  702:aload           29
	//* 266  704:iload_2         
	//* 267  705:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 268  710:putfield        #405 <Field long WorkSpec.intervalDuration>
	//* 269  713:aload           31
	//* 270  715:aload           29
	//* 271  717:iload           4
	//* 272  719:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 273  724:putfield        #408 <Field long WorkSpec.flexDuration>
	//* 274  727:aload           31
	//* 275  729:aload           29
	//* 276  731:iload           18
	//* 277  733:invokeinterface #325 <Method int Cursor.getInt(int)>
	//* 278  738:putfield        #412 <Field int WorkSpec.runAttemptCount>
	//* 279  741:aload           29
	//* 280  743:iload           5
	//* 281  745:invokeinterface #325 <Method int Cursor.getInt(int)>
	//* 282  750:istore          26
	//* 283  752:aload           31
	//* 284  754:iload           26
	//* 285  756:invokestatic    #416 <Method androidx.work.BackoffPolicy WorkTypeConverters.intToBackoffPolicy(int)>
	//* 286  759:putfield        #420 <Field androidx.work.BackoffPolicy WorkSpec.backoffPolicy>
	//* 287  762:aload           31
	//* 288  764:aload           29
	//* 289  766:iload_3         
	//* 290  767:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 291  772:putfield        #423 <Field long WorkSpec.backoffDelayDuration>
	//* 292  775:aload           31
	//* 293  777:aload           29
	//* 294  779:iload           6
	//* 295  781:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 296  786:putfield        #426 <Field long WorkSpec.periodStartTime>
	//* 297  789:aload           31
	//* 298  791:aload           29
	//* 299  793:iload           17
	//* 300  795:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 301  800:putfield        #429 <Field long WorkSpec.minimumRetentionDuration>
	//* 302  803:aload           31
	//* 303  805:aload           29
	//* 304  807:iload           16
	//* 305  809:invokeinterface #352 <Method long Cursor.getLong(int)>
	//* 306  814:putfield        #432 <Field long WorkSpec.scheduleRequestedAt>
	//* 307  817:aload           31
	//* 308  819:aload           30
	//* 309  821:putfield        #436 <Field Constraints WorkSpec.constraints>
	//* 310  824:aload_1         
	//* 311  825:iload           9
	//* 312  827:aload           31
	//* 313  829:aastore         
	//* 314  830:iload           9
	//* 315  832:iconst_1        
	//* 316  833:iadd            
	//* 317  834:istore          9
	//* 318  836:goto            405
	//* 319  839:aload           29
	//* 320  841:invokeinterface #190 <Method void Cursor.close()>
	//* 321  846:aload           28
	//* 322  848:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
	//* 323  851:aload_1         
	//* 324  852:areturn         
	//* 325  853:astore_1        
	//* 326  854:goto            858
	//* 327  857:astore_1        
	//* 328  858:aload           29
	//* 329  860:invokeinterface #190 <Method void Cursor.close()>
	//* 330  865:aload           28
	//* 331  867:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
	//* 332  870:aload_1         
	//* 333  871:athrow          
			flag = false;
	//  334  872:iconst_0        
	//  335  873:istore          27
		constraints.setRequiresCharging(flag);
		if(cursor.getInt(l3) != 0)
			flag = true;
		else
	//* 336  875:goto            481
			flag = false;
	//  337  878:iconst_0        
	//  338  879:istore          27
		constraints.setRequiresDeviceIdle(flag);
		if(cursor.getInt(k3) != 0)
			flag = true;
		else
	//* 339  881:goto            506
			flag = false;
	//  340  884:iconst_0        
	//  341  885:istore          27
		constraints.setRequiresBatteryNotLow(flag);
		if(cursor.getInt(k5) != 0)
			flag = true;
		else
	//* 342  887:goto            531
			flag = false;
	//  343  890:iconst_0        
	//  344  891:istore          27
		constraints.setRequiresStorageNotLow(flag);
		constraints.setTriggerContentUpdateDelay(cursor.getLong(l5));
		constraints.setTriggerMaxContentDelay(cursor.getLong(i6));
		constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(cursor.getBlob(j6)));
		obj1 = ((Object) (new WorkSpec(((String) (obj1)), s1)));
		obj1.state = WorkTypeConverters.intToState(cursor.getInt(i5));
		obj1.inputMergerClassName = cursor.getString(l2);
		obj1.input = Data.fromByteArray(cursor.getBlob(l1));
		obj1.output = Data.fromByteArray(cursor.getBlob(j5));
		obj1.initialDelay = cursor.getLong(l4);
		obj1.intervalDuration = cursor.getLong(k);
		obj1.flexDuration = cursor.getLong(i1);
		obj1.runAttemptCount = cursor.getInt(k4);
		k6 = cursor.getInt(j1);
		obj1.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(k6);
		obj1.backoffDelayDuration = cursor.getLong(l);
		obj1.periodStartTime = cursor.getLong(k1);
		obj1.minimumRetentionDuration = cursor.getLong(j4);
		obj1.scheduleRequestedAt = cursor.getLong(i4);
		obj1.constraints = constraints;
		list[j2] = ((/*<invalid signature>*/java.lang.Object) (obj1));
		j2++;
		if(true) goto _L2; else goto _L1
_L1:
		cursor.close();
		((RoomSQLiteQuery) (obj)).release();
		return ((WorkSpec []) (list));
		list;
		break MISSING_BLOCK_LABEL_858;
		list;
		cursor.close();
		((RoomSQLiteQuery) (obj)).release();
		throw list;
	//* 345  893:goto            556
	}

	public WorkSpec.WorkInfoPojo getWorkStatusPojoForId(String s)
	{
		RoomSQLiteQuery roomsqlitequery;
		roomsqlitequery = RoomSQLiteQuery.acquire("SELECT id, state, output FROM workspec WHERE id=?", 1);
	//    0    0:ldc2            #481 <String "SELECT id, state, output FROM workspec WHERE id=?">
	//    1    3:iconst_1        
	//    2    4:invokestatic    #151 <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//    3    7:astore          7
		if(s == null)
	//*   4    9:aload_1         
	//*   5   10:ifnonnull       22
			roomsqlitequery.bindNull(1);
	//    6   13:aload           7
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #169 <Method void RoomSQLiteQuery.bindNull(int)>
		else
	//*   9   19:goto            29
			roomsqlitequery.bindString(1, s);
	//   10   22:aload           7
	//   11   24:iconst_1        
	//   12   25:aload_1         
	//   13   26:invokevirtual   #173 <Method void RoomSQLiteQuery.bindString(int, String)>
		__db.beginTransaction();
	//   14   29:aload_0         
	//   15   30:getfield        #56  <Field RoomDatabase __db>
	//   16   33:invokevirtual   #227 <Method void RoomDatabase.beginTransaction()>
		Cursor cursor = __db.query(((android.arch.persistence.db.SupportSQLiteQuery) (roomsqlitequery)));
	//   17   36:aload_0         
	//   18   37:getfield        #56  <Field RoomDatabase __db>
	//   19   40:aload           7
	//   20   42:invokevirtual   #179 <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
	//   21   45:astore          8
		int i;
		int j;
		int k;
		ArrayMap arraymap;
		arraymap = new ArrayMap();
	//   22   47:new             #90  <Class ArrayMap>
	//   23   50:dup             
	//   24   51:invokespecial   #482 <Method void ArrayMap()>
	//   25   54:astore          9
		i = cursor.getColumnIndexOrThrow("id");
	//   26   56:aload           8
	//   27   58:ldc2            #271 <String "id">
	//   28   61:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   29   66:istore_2        
		j = cursor.getColumnIndexOrThrow("state");
	//   30   67:aload           8
	//   31   69:ldc2            #276 <String "state">
	//   32   72:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   33   77:istore_3        
		k = cursor.getColumnIndexOrThrow("output");
	//   34   78:aload           8
	//   35   80:ldc2            #284 <String "output">
	//   36   83:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   37   88:istore          4
		if(!cursor.moveToFirst()) goto _L2; else goto _L1
	//   38   90:aload           8
	//   39   92:invokeinterface #449 <Method boolean Cursor.moveToFirst()>
	//   40   97:ifeq            287
_L1:
		WorkSpec.WorkInfoPojo workinfopojo;
		workinfopojo = new WorkSpec.WorkInfoPojo();
	//   41  100:new             #484 <Class WorkSpec$WorkInfoPojo>
	//   42  103:dup             
	//   43  104:invokespecial   #485 <Method void WorkSpec$WorkInfoPojo()>
	//   44  107:astore          5
		workinfopojo.id = cursor.getString(i);
	//   45  109:aload           5
	//   46  111:aload           8
	//   47  113:iload_2         
	//   48  114:invokeinterface #201 <Method String Cursor.getString(int)>
	//   49  119:putfield        #486 <Field String WorkSpec$WorkInfoPojo.id>
		workinfopojo.state = WorkTypeConverters.intToState(cursor.getInt(j));
	//   50  122:aload           5
	//   51  124:aload           8
	//   52  126:iload_3         
	//   53  127:invokeinterface #325 <Method int Cursor.getInt(int)>
	//   54  132:invokestatic    #380 <Method androidx.work.WorkInfo$State WorkTypeConverters.intToState(int)>
	//   55  135:putfield        #487 <Field androidx.work.WorkInfo$State WorkSpec$WorkInfoPojo.state>
		workinfopojo.output = Data.fromByteArray(cursor.getBlob(k));
	//   56  138:aload           5
	//   57  140:aload           8
	//   58  142:iload           4
	//   59  144:invokeinterface #363 <Method byte[] Cursor.getBlob(int)>
	//   60  149:invokestatic    #393 <Method Data Data.fromByteArray(byte[])>
	//   61  152:putfield        #488 <Field Data WorkSpec$WorkInfoPojo.output>
		s = ((String) (workinfopojo));
	//   62  155:aload           5
	//   63  157:astore_1        
		ArrayList arraylist;
		String s1;
		if(cursor.isNull(i))
			break MISSING_BLOCK_LABEL_228;
	//   64  158:aload           8
	//   65  160:iload_2         
	//   66  161:invokeinterface #197 <Method boolean Cursor.isNull(int)>
	//   67  166:ifne            228
		s1 = cursor.getString(i);
	//   68  169:aload           8
	//   69  171:iload_2         
	//   70  172:invokeinterface #201 <Method String Cursor.getString(int)>
	//   71  177:astore          10
		arraylist = (ArrayList)arraymap.get(((Object) (s1)));
	//   72  179:aload           9
	//   73  181:aload           10
	//   74  183:invokevirtual   #205 <Method Object ArrayMap.get(Object)>
	//   75  186:checkcast       #207 <Class ArrayList>
	//   76  189:astore          6
		s = ((String) (arraylist));
	//   77  191:aload           6
	//   78  193:astore_1        
		if(arraylist != null)
			break MISSING_BLOCK_LABEL_216;
	//   79  194:aload           6
	//   80  196:ifnonnull       216
		s = ((String) (new ArrayList()));
	//   81  199:new             #207 <Class ArrayList>
	//   82  202:dup             
	//   83  203:invokespecial   #489 <Method void ArrayList()>
	//   84  206:astore_1        
		arraymap.put(((Object) (s1)), ((Object) (s)));
	//   85  207:aload           9
	//   86  209:aload           10
	//   87  211:aload_1         
	//   88  212:invokevirtual   #118 <Method Object ArrayMap.put(Object, Object)>
	//   89  215:pop             
		workinfopojo.tags = ((List) (s));
	//   90  216:aload           5
	//   91  218:aload_1         
	//   92  219:putfield        #493 <Field List WorkSpec$WorkInfoPojo.tags>
		s = ((String) (workinfopojo));
	//   93  222:aload           5
	//   94  224:astore_1        
	//*  95  225:goto            228
_L4:
		__fetchRelationshipWorkTagAsjavaLangString(arraymap);
	//   96  228:aload_0         
	//   97  229:aload           9
	//   98  231:invokespecial   #120 <Method void __fetchRelationshipWorkTagAsjavaLangString(ArrayMap)>
		__db.setTransactionSuccessful();
	//   99  234:aload_0         
	//  100  235:getfield        #56  <Field RoomDatabase __db>
	//  101  238:invokevirtual   #237 <Method void RoomDatabase.setTransactionSuccessful()>
		cursor.close();
	//  102  241:aload           8
	//  103  243:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//  104  248:aload           7
	//  105  250:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		__db.endTransaction();
	//  106  253:aload_0         
	//  107  254:getfield        #56  <Field RoomDatabase __db>
	//  108  257:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		return ((WorkSpec.WorkInfoPojo) (s));
	//  109  260:aload_1         
	//  110  261:areturn         
		s;
	//  111  262:astore_1        
		cursor.close();
	//  112  263:aload           8
	//  113  265:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//  114  270:aload           7
	//  115  272:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		throw s;
	//  116  275:aload_1         
	//  117  276:athrow          
		s;
	//  118  277:astore_1        
		__db.endTransaction();
	//  119  278:aload_0         
	//  120  279:getfield        #56  <Field RoomDatabase __db>
	//  121  282:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		throw s;
	//  122  285:aload_1         
	//  123  286:athrow          
_L2:
		s = null;
	//  124  287:aconst_null     
	//  125  288:astore_1        
		if(true) goto _L4; else goto _L3
	//  126  289:goto            228
_L3:
	}

	public List getWorkStatusPojoForIds(List list)
	{
		RoomSQLiteQuery roomsqlitequery;
		StringBuilder stringbuilder = StringUtil.newStringBuilder();
	//    0    0:invokestatic    #126 <Method StringBuilder StringUtil.newStringBuilder()>
	//    1    3:astore          5
		stringbuilder.append("SELECT id, state, output FROM workspec WHERE id IN (");
	//    2    5:aload           5
	//    3    7:ldc2            #497 <String "SELECT id, state, output FROM workspec WHERE id IN (">
	//    4   10:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:pop             
		int i = list.size();
	//    6   14:aload_1         
	//    7   15:invokeinterface #475 <Method int List.size()>
	//    8   20:istore_2        
		StringUtil.appendPlaceholders(stringbuilder, i);
	//    9   21:aload           5
	//   10   23:iload_2         
	//   11   24:invokestatic    #139 <Method void StringUtil.appendPlaceholders(StringBuilder, int)>
		stringbuilder.append(")");
	//   12   27:aload           5
	//   13   29:ldc1            #141 <String ")">
	//   14   31:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   15   34:pop             
		roomsqlitequery = RoomSQLiteQuery.acquire(stringbuilder.toString(), i + 0);
	//   16   35:aload           5
	//   17   37:invokevirtual   #145 <Method String StringBuilder.toString()>
	//   18   40:iload_2         
	//   19   41:iconst_0        
	//   20   42:iadd            
	//   21   43:invokestatic    #151 <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//   22   46:astore          6
		list = ((List) (list.iterator()));
	//   23   48:aload_1         
	//   24   49:invokeinterface #476 <Method Iterator List.iterator()>
	//   25   54:astore_1        
		for(int j = 1; ((Iterator) (list)).hasNext(); j++)
	//*  26   55:iconst_1        
	//*  27   56:istore_2        
	//*  28   57:aload_1         
	//*  29   58:invokeinterface #160 <Method boolean Iterator.hasNext()>
	//*  30   63:ifeq            106
		{
			String s = (String)((Iterator) (list)).next();
	//   31   66:aload_1         
	//   32   67:invokeinterface #164 <Method Object Iterator.next()>
	//   33   72:checkcast       #166 <Class String>
	//   34   75:astore          5
			if(s == null)
	//*  35   77:aload           5
	//*  36   79:ifnonnull       91
				roomsqlitequery.bindNull(j);
	//   37   82:aload           6
	//   38   84:iload_2         
	//   39   85:invokevirtual   #169 <Method void RoomSQLiteQuery.bindNull(int)>
			else
	//*  40   88:goto            99
				roomsqlitequery.bindString(j, s);
	//   41   91:aload           6
	//   42   93:iload_2         
	//   43   94:aload           5
	//   44   96:invokevirtual   #173 <Method void RoomSQLiteQuery.bindString(int, String)>
		}

	//   45   99:iload_2         
	//   46  100:iconst_1        
	//   47  101:iadd            
	//   48  102:istore_2        
	//*  49  103:goto            57
		__db.beginTransaction();
	//   50  106:aload_0         
	//   51  107:getfield        #56  <Field RoomDatabase __db>
	//   52  110:invokevirtual   #227 <Method void RoomDatabase.beginTransaction()>
		Cursor cursor = __db.query(((android.arch.persistence.db.SupportSQLiteQuery) (roomsqlitequery)));
	//   53  113:aload_0         
	//   54  114:getfield        #56  <Field RoomDatabase __db>
	//   55  117:aload           6
	//   56  119:invokevirtual   #179 <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
	//   57  122:astore          7
		int k;
		int l;
		int i1;
		ArrayMap arraymap;
		ArrayList arraylist1;
		arraymap = new ArrayMap();
	//   58  124:new             #90  <Class ArrayMap>
	//   59  127:dup             
	//   60  128:invokespecial   #482 <Method void ArrayMap()>
	//   61  131:astore          8
		k = cursor.getColumnIndexOrThrow("id");
	//   62  133:aload           7
	//   63  135:ldc2            #271 <String "id">
	//   64  138:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   65  143:istore_2        
		l = cursor.getColumnIndexOrThrow("state");
	//   66  144:aload           7
	//   67  146:ldc2            #276 <String "state">
	//   68  149:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   69  154:istore_3        
		i1 = cursor.getColumnIndexOrThrow("output");
	//   70  155:aload           7
	//   71  157:ldc2            #284 <String "output">
	//   72  160:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   73  165:istore          4
		arraylist1 = new ArrayList(cursor.getCount());
	//   74  167:new             #207 <Class ArrayList>
	//   75  170:dup             
	//   76  171:aload           7
	//   77  173:invokeinterface #251 <Method int Cursor.getCount()>
	//   78  178:invokespecial   #252 <Method void ArrayList(int)>
	//   79  181:astore          9
_L1:
		ArrayList arraylist;
		WorkSpec.WorkInfoPojo workinfopojo;
		String s1;
		if(!cursor.moveToNext())
			break MISSING_BLOCK_LABEL_325;
	//   80  183:aload           7
	//   81  185:invokeinterface #193 <Method boolean Cursor.moveToNext()>
	//   82  190:ifeq            325
		workinfopojo = new WorkSpec.WorkInfoPojo();
	//   83  193:new             #484 <Class WorkSpec$WorkInfoPojo>
	//   84  196:dup             
	//   85  197:invokespecial   #485 <Method void WorkSpec$WorkInfoPojo()>
	//   86  200:astore          10
		workinfopojo.id = cursor.getString(k);
	//   87  202:aload           10
	//   88  204:aload           7
	//   89  206:iload_2         
	//   90  207:invokeinterface #201 <Method String Cursor.getString(int)>
	//   91  212:putfield        #486 <Field String WorkSpec$WorkInfoPojo.id>
		workinfopojo.state = WorkTypeConverters.intToState(cursor.getInt(l));
	//   92  215:aload           10
	//   93  217:aload           7
	//   94  219:iload_3         
	//   95  220:invokeinterface #325 <Method int Cursor.getInt(int)>
	//   96  225:invokestatic    #380 <Method androidx.work.WorkInfo$State WorkTypeConverters.intToState(int)>
	//   97  228:putfield        #487 <Field androidx.work.WorkInfo$State WorkSpec$WorkInfoPojo.state>
		workinfopojo.output = Data.fromByteArray(cursor.getBlob(i1));
	//   98  231:aload           10
	//   99  233:aload           7
	//  100  235:iload           4
	//  101  237:invokeinterface #363 <Method byte[] Cursor.getBlob(int)>
	//  102  242:invokestatic    #393 <Method Data Data.fromByteArray(byte[])>
	//  103  245:putfield        #488 <Field Data WorkSpec$WorkInfoPojo.output>
		if(cursor.isNull(k))
			break MISSING_BLOCK_LABEL_312;
	//  104  248:aload           7
	//  105  250:iload_2         
	//  106  251:invokeinterface #197 <Method boolean Cursor.isNull(int)>
	//  107  256:ifne            312
		s1 = cursor.getString(k);
	//  108  259:aload           7
	//  109  261:iload_2         
	//  110  262:invokeinterface #201 <Method String Cursor.getString(int)>
	//  111  267:astore          11
		arraylist = (ArrayList)arraymap.get(((Object) (s1)));
	//  112  269:aload           8
	//  113  271:aload           11
	//  114  273:invokevirtual   #205 <Method Object ArrayMap.get(Object)>
	//  115  276:checkcast       #207 <Class ArrayList>
	//  116  279:astore          5
		list = ((List) (arraylist));
	//  117  281:aload           5
	//  118  283:astore_1        
		if(arraylist != null)
			break MISSING_BLOCK_LABEL_306;
	//  119  284:aload           5
	//  120  286:ifnonnull       306
		list = ((List) (new ArrayList()));
	//  121  289:new             #207 <Class ArrayList>
	//  122  292:dup             
	//  123  293:invokespecial   #489 <Method void ArrayList()>
	//  124  296:astore_1        
		arraymap.put(((Object) (s1)), ((Object) (list)));
	//  125  297:aload           8
	//  126  299:aload           11
	//  127  301:aload_1         
	//  128  302:invokevirtual   #118 <Method Object ArrayMap.put(Object, Object)>
	//  129  305:pop             
		workinfopojo.tags = list;
	//  130  306:aload           10
	//  131  308:aload_1         
	//  132  309:putfield        #493 <Field List WorkSpec$WorkInfoPojo.tags>
		((List) (arraylist1)).add(((Object) (workinfopojo)));
	//  133  312:aload           9
	//  134  314:aload           10
	//  135  316:invokeinterface #255 <Method boolean List.add(Object)>
	//  136  321:pop             
		  goto _L1
	//* 137  322:goto            183
		__fetchRelationshipWorkTagAsjavaLangString(arraymap);
	//  138  325:aload_0         
	//  139  326:aload           8
	//  140  328:invokespecial   #120 <Method void __fetchRelationshipWorkTagAsjavaLangString(ArrayMap)>
		__db.setTransactionSuccessful();
	//  141  331:aload_0         
	//  142  332:getfield        #56  <Field RoomDatabase __db>
	//  143  335:invokevirtual   #237 <Method void RoomDatabase.setTransactionSuccessful()>
		cursor.close();
	//  144  338:aload           7
	//  145  340:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//  146  345:aload           6
	//  147  347:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		__db.endTransaction();
	//  148  350:aload_0         
	//  149  351:getfield        #56  <Field RoomDatabase __db>
	//  150  354:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		return ((List) (arraylist1));
	//  151  357:aload           9
	//  152  359:areturn         
		list;
	//  153  360:astore_1        
		cursor.close();
	//  154  361:aload           7
	//  155  363:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//  156  368:aload           6
	//  157  370:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		throw list;
	//  158  373:aload_1         
	//  159  374:athrow          
		list;
	//  160  375:astore_1        
		__db.endTransaction();
	//  161  376:aload_0         
	//  162  377:getfield        #56  <Field RoomDatabase __db>
	//  163  380:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		throw list;
	//  164  383:aload_1         
	//  165  384:athrow          
	}

	public List getWorkStatusPojoForName(String s)
	{
		RoomSQLiteQuery roomsqlitequery;
		roomsqlitequery = RoomSQLiteQuery.acquire("SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
	//    0    0:ldc2            #501 <String "SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)">
	//    1    3:iconst_1        
	//    2    4:invokestatic    #151 <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//    3    7:astore          6
		if(s == null)
	//*   4    9:aload_1         
	//*   5   10:ifnonnull       22
			roomsqlitequery.bindNull(1);
	//    6   13:aload           6
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #169 <Method void RoomSQLiteQuery.bindNull(int)>
		else
	//*   9   19:goto            29
			roomsqlitequery.bindString(1, s);
	//   10   22:aload           6
	//   11   24:iconst_1        
	//   12   25:aload_1         
	//   13   26:invokevirtual   #173 <Method void RoomSQLiteQuery.bindString(int, String)>
		__db.beginTransaction();
	//   14   29:aload_0         
	//   15   30:getfield        #56  <Field RoomDatabase __db>
	//   16   33:invokevirtual   #227 <Method void RoomDatabase.beginTransaction()>
		Cursor cursor = __db.query(((android.arch.persistence.db.SupportSQLiteQuery) (roomsqlitequery)));
	//   17   36:aload_0         
	//   18   37:getfield        #56  <Field RoomDatabase __db>
	//   19   40:aload           6
	//   20   42:invokevirtual   #179 <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
	//   21   45:astore          7
		int i;
		int j;
		int k;
		ArrayMap arraymap;
		ArrayList arraylist1;
		arraymap = new ArrayMap();
	//   22   47:new             #90  <Class ArrayMap>
	//   23   50:dup             
	//   24   51:invokespecial   #482 <Method void ArrayMap()>
	//   25   54:astore          8
		i = cursor.getColumnIndexOrThrow("id");
	//   26   56:aload           7
	//   27   58:ldc2            #271 <String "id">
	//   28   61:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   29   66:istore_2        
		j = cursor.getColumnIndexOrThrow("state");
	//   30   67:aload           7
	//   31   69:ldc2            #276 <String "state">
	//   32   72:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   33   77:istore_3        
		k = cursor.getColumnIndexOrThrow("output");
	//   34   78:aload           7
	//   35   80:ldc2            #284 <String "output">
	//   36   83:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   37   88:istore          4
		arraylist1 = new ArrayList(cursor.getCount());
	//   38   90:new             #207 <Class ArrayList>
	//   39   93:dup             
	//   40   94:aload           7
	//   41   96:invokeinterface #251 <Method int Cursor.getCount()>
	//   42  101:invokespecial   #252 <Method void ArrayList(int)>
	//   43  104:astore          9
_L1:
		ArrayList arraylist;
		WorkSpec.WorkInfoPojo workinfopojo;
		String s1;
		if(!cursor.moveToNext())
			break MISSING_BLOCK_LABEL_248;
	//   44  106:aload           7
	//   45  108:invokeinterface #193 <Method boolean Cursor.moveToNext()>
	//   46  113:ifeq            248
		workinfopojo = new WorkSpec.WorkInfoPojo();
	//   47  116:new             #484 <Class WorkSpec$WorkInfoPojo>
	//   48  119:dup             
	//   49  120:invokespecial   #485 <Method void WorkSpec$WorkInfoPojo()>
	//   50  123:astore          10
		workinfopojo.id = cursor.getString(i);
	//   51  125:aload           10
	//   52  127:aload           7
	//   53  129:iload_2         
	//   54  130:invokeinterface #201 <Method String Cursor.getString(int)>
	//   55  135:putfield        #486 <Field String WorkSpec$WorkInfoPojo.id>
		workinfopojo.state = WorkTypeConverters.intToState(cursor.getInt(j));
	//   56  138:aload           10
	//   57  140:aload           7
	//   58  142:iload_3         
	//   59  143:invokeinterface #325 <Method int Cursor.getInt(int)>
	//   60  148:invokestatic    #380 <Method androidx.work.WorkInfo$State WorkTypeConverters.intToState(int)>
	//   61  151:putfield        #487 <Field androidx.work.WorkInfo$State WorkSpec$WorkInfoPojo.state>
		workinfopojo.output = Data.fromByteArray(cursor.getBlob(k));
	//   62  154:aload           10
	//   63  156:aload           7
	//   64  158:iload           4
	//   65  160:invokeinterface #363 <Method byte[] Cursor.getBlob(int)>
	//   66  165:invokestatic    #393 <Method Data Data.fromByteArray(byte[])>
	//   67  168:putfield        #488 <Field Data WorkSpec$WorkInfoPojo.output>
		if(cursor.isNull(i))
			break MISSING_BLOCK_LABEL_235;
	//   68  171:aload           7
	//   69  173:iload_2         
	//   70  174:invokeinterface #197 <Method boolean Cursor.isNull(int)>
	//   71  179:ifne            235
		s1 = cursor.getString(i);
	//   72  182:aload           7
	//   73  184:iload_2         
	//   74  185:invokeinterface #201 <Method String Cursor.getString(int)>
	//   75  190:astore          11
		arraylist = (ArrayList)arraymap.get(((Object) (s1)));
	//   76  192:aload           8
	//   77  194:aload           11
	//   78  196:invokevirtual   #205 <Method Object ArrayMap.get(Object)>
	//   79  199:checkcast       #207 <Class ArrayList>
	//   80  202:astore          5
		s = ((String) (arraylist));
	//   81  204:aload           5
	//   82  206:astore_1        
		if(arraylist != null)
			break MISSING_BLOCK_LABEL_229;
	//   83  207:aload           5
	//   84  209:ifnonnull       229
		s = ((String) (new ArrayList()));
	//   85  212:new             #207 <Class ArrayList>
	//   86  215:dup             
	//   87  216:invokespecial   #489 <Method void ArrayList()>
	//   88  219:astore_1        
		arraymap.put(((Object) (s1)), ((Object) (s)));
	//   89  220:aload           8
	//   90  222:aload           11
	//   91  224:aload_1         
	//   92  225:invokevirtual   #118 <Method Object ArrayMap.put(Object, Object)>
	//   93  228:pop             
		workinfopojo.tags = ((List) (s));
	//   94  229:aload           10
	//   95  231:aload_1         
	//   96  232:putfield        #493 <Field List WorkSpec$WorkInfoPojo.tags>
		((List) (arraylist1)).add(((Object) (workinfopojo)));
	//   97  235:aload           9
	//   98  237:aload           10
	//   99  239:invokeinterface #255 <Method boolean List.add(Object)>
	//  100  244:pop             
		  goto _L1
	//* 101  245:goto            106
		__fetchRelationshipWorkTagAsjavaLangString(arraymap);
	//  102  248:aload_0         
	//  103  249:aload           8
	//  104  251:invokespecial   #120 <Method void __fetchRelationshipWorkTagAsjavaLangString(ArrayMap)>
		__db.setTransactionSuccessful();
	//  105  254:aload_0         
	//  106  255:getfield        #56  <Field RoomDatabase __db>
	//  107  258:invokevirtual   #237 <Method void RoomDatabase.setTransactionSuccessful()>
		cursor.close();
	//  108  261:aload           7
	//  109  263:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//  110  268:aload           6
	//  111  270:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		__db.endTransaction();
	//  112  273:aload_0         
	//  113  274:getfield        #56  <Field RoomDatabase __db>
	//  114  277:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		return ((List) (arraylist1));
	//  115  280:aload           9
	//  116  282:areturn         
		s;
	//  117  283:astore_1        
		cursor.close();
	//  118  284:aload           7
	//  119  286:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//  120  291:aload           6
	//  121  293:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		throw s;
	//  122  296:aload_1         
	//  123  297:athrow          
		s;
	//  124  298:astore_1        
		__db.endTransaction();
	//  125  299:aload_0         
	//  126  300:getfield        #56  <Field RoomDatabase __db>
	//  127  303:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		throw s;
	//  128  306:aload_1         
	//  129  307:athrow          
	}

	public List getWorkStatusPojoForTag(String s)
	{
		RoomSQLiteQuery roomsqlitequery;
		roomsqlitequery = RoomSQLiteQuery.acquire("SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
	//    0    0:ldc2            #505 <String "SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)">
	//    1    3:iconst_1        
	//    2    4:invokestatic    #151 <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//    3    7:astore          6
		if(s == null)
	//*   4    9:aload_1         
	//*   5   10:ifnonnull       22
			roomsqlitequery.bindNull(1);
	//    6   13:aload           6
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #169 <Method void RoomSQLiteQuery.bindNull(int)>
		else
	//*   9   19:goto            29
			roomsqlitequery.bindString(1, s);
	//   10   22:aload           6
	//   11   24:iconst_1        
	//   12   25:aload_1         
	//   13   26:invokevirtual   #173 <Method void RoomSQLiteQuery.bindString(int, String)>
		__db.beginTransaction();
	//   14   29:aload_0         
	//   15   30:getfield        #56  <Field RoomDatabase __db>
	//   16   33:invokevirtual   #227 <Method void RoomDatabase.beginTransaction()>
		Cursor cursor = __db.query(((android.arch.persistence.db.SupportSQLiteQuery) (roomsqlitequery)));
	//   17   36:aload_0         
	//   18   37:getfield        #56  <Field RoomDatabase __db>
	//   19   40:aload           6
	//   20   42:invokevirtual   #179 <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
	//   21   45:astore          7
		int i;
		int j;
		int k;
		ArrayMap arraymap;
		ArrayList arraylist1;
		arraymap = new ArrayMap();
	//   22   47:new             #90  <Class ArrayMap>
	//   23   50:dup             
	//   24   51:invokespecial   #482 <Method void ArrayMap()>
	//   25   54:astore          8
		i = cursor.getColumnIndexOrThrow("id");
	//   26   56:aload           7
	//   27   58:ldc2            #271 <String "id">
	//   28   61:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   29   66:istore_2        
		j = cursor.getColumnIndexOrThrow("state");
	//   30   67:aload           7
	//   31   69:ldc2            #276 <String "state">
	//   32   72:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   33   77:istore_3        
		k = cursor.getColumnIndexOrThrow("output");
	//   34   78:aload           7
	//   35   80:ldc2            #284 <String "output">
	//   36   83:invokeinterface #274 <Method int Cursor.getColumnIndexOrThrow(String)>
	//   37   88:istore          4
		arraylist1 = new ArrayList(cursor.getCount());
	//   38   90:new             #207 <Class ArrayList>
	//   39   93:dup             
	//   40   94:aload           7
	//   41   96:invokeinterface #251 <Method int Cursor.getCount()>
	//   42  101:invokespecial   #252 <Method void ArrayList(int)>
	//   43  104:astore          9
_L1:
		ArrayList arraylist;
		WorkSpec.WorkInfoPojo workinfopojo;
		String s1;
		if(!cursor.moveToNext())
			break MISSING_BLOCK_LABEL_248;
	//   44  106:aload           7
	//   45  108:invokeinterface #193 <Method boolean Cursor.moveToNext()>
	//   46  113:ifeq            248
		workinfopojo = new WorkSpec.WorkInfoPojo();
	//   47  116:new             #484 <Class WorkSpec$WorkInfoPojo>
	//   48  119:dup             
	//   49  120:invokespecial   #485 <Method void WorkSpec$WorkInfoPojo()>
	//   50  123:astore          10
		workinfopojo.id = cursor.getString(i);
	//   51  125:aload           10
	//   52  127:aload           7
	//   53  129:iload_2         
	//   54  130:invokeinterface #201 <Method String Cursor.getString(int)>
	//   55  135:putfield        #486 <Field String WorkSpec$WorkInfoPojo.id>
		workinfopojo.state = WorkTypeConverters.intToState(cursor.getInt(j));
	//   56  138:aload           10
	//   57  140:aload           7
	//   58  142:iload_3         
	//   59  143:invokeinterface #325 <Method int Cursor.getInt(int)>
	//   60  148:invokestatic    #380 <Method androidx.work.WorkInfo$State WorkTypeConverters.intToState(int)>
	//   61  151:putfield        #487 <Field androidx.work.WorkInfo$State WorkSpec$WorkInfoPojo.state>
		workinfopojo.output = Data.fromByteArray(cursor.getBlob(k));
	//   62  154:aload           10
	//   63  156:aload           7
	//   64  158:iload           4
	//   65  160:invokeinterface #363 <Method byte[] Cursor.getBlob(int)>
	//   66  165:invokestatic    #393 <Method Data Data.fromByteArray(byte[])>
	//   67  168:putfield        #488 <Field Data WorkSpec$WorkInfoPojo.output>
		if(cursor.isNull(i))
			break MISSING_BLOCK_LABEL_235;
	//   68  171:aload           7
	//   69  173:iload_2         
	//   70  174:invokeinterface #197 <Method boolean Cursor.isNull(int)>
	//   71  179:ifne            235
		s1 = cursor.getString(i);
	//   72  182:aload           7
	//   73  184:iload_2         
	//   74  185:invokeinterface #201 <Method String Cursor.getString(int)>
	//   75  190:astore          11
		arraylist = (ArrayList)arraymap.get(((Object) (s1)));
	//   76  192:aload           8
	//   77  194:aload           11
	//   78  196:invokevirtual   #205 <Method Object ArrayMap.get(Object)>
	//   79  199:checkcast       #207 <Class ArrayList>
	//   80  202:astore          5
		s = ((String) (arraylist));
	//   81  204:aload           5
	//   82  206:astore_1        
		if(arraylist != null)
			break MISSING_BLOCK_LABEL_229;
	//   83  207:aload           5
	//   84  209:ifnonnull       229
		s = ((String) (new ArrayList()));
	//   85  212:new             #207 <Class ArrayList>
	//   86  215:dup             
	//   87  216:invokespecial   #489 <Method void ArrayList()>
	//   88  219:astore_1        
		arraymap.put(((Object) (s1)), ((Object) (s)));
	//   89  220:aload           8
	//   90  222:aload           11
	//   91  224:aload_1         
	//   92  225:invokevirtual   #118 <Method Object ArrayMap.put(Object, Object)>
	//   93  228:pop             
		workinfopojo.tags = ((List) (s));
	//   94  229:aload           10
	//   95  231:aload_1         
	//   96  232:putfield        #493 <Field List WorkSpec$WorkInfoPojo.tags>
		((List) (arraylist1)).add(((Object) (workinfopojo)));
	//   97  235:aload           9
	//   98  237:aload           10
	//   99  239:invokeinterface #255 <Method boolean List.add(Object)>
	//  100  244:pop             
		  goto _L1
	//* 101  245:goto            106
		__fetchRelationshipWorkTagAsjavaLangString(arraymap);
	//  102  248:aload_0         
	//  103  249:aload           8
	//  104  251:invokespecial   #120 <Method void __fetchRelationshipWorkTagAsjavaLangString(ArrayMap)>
		__db.setTransactionSuccessful();
	//  105  254:aload_0         
	//  106  255:getfield        #56  <Field RoomDatabase __db>
	//  107  258:invokevirtual   #237 <Method void RoomDatabase.setTransactionSuccessful()>
		cursor.close();
	//  108  261:aload           7
	//  109  263:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//  110  268:aload           6
	//  111  270:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		__db.endTransaction();
	//  112  273:aload_0         
	//  113  274:getfield        #56  <Field RoomDatabase __db>
	//  114  277:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		return ((List) (arraylist1));
	//  115  280:aload           9
	//  116  282:areturn         
		s;
	//  117  283:astore_1        
		cursor.close();
	//  118  284:aload           7
	//  119  286:invokeinterface #190 <Method void Cursor.close()>
		roomsqlitequery.release();
	//  120  291:aload           6
	//  121  293:invokevirtual   #257 <Method void RoomSQLiteQuery.release()>
		throw s;
	//  122  296:aload_1         
	//  123  297:athrow          
		s;
	//  124  298:astore_1        
		__db.endTransaction();
	//  125  299:aload_0         
	//  126  300:getfield        #56  <Field RoomDatabase __db>
	//  127  303:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		throw s;
	//  128  306:aload_1         
	//  129  307:athrow          
	}

	public LiveData getWorkStatusPojoLiveDataForIds(List list)
	{
		final RoomSQLiteQuery _statement = ((RoomSQLiteQuery) (StringUtil.newStringBuilder()));
	//    0    0:invokestatic    #126 <Method StringBuilder StringUtil.newStringBuilder()>
	//    1    3:astore_3        
		((StringBuilder) (_statement)).append("SELECT id, state, output FROM workspec WHERE id IN (");
	//    2    4:aload_3         
	//    3    5:ldc2            #497 <String "SELECT id, state, output FROM workspec WHERE id IN (">
	//    4    8:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//    5   11:pop             
		int i = list.size();
	//    6   12:aload_1         
	//    7   13:invokeinterface #475 <Method int List.size()>
	//    8   18:istore_2        
		StringUtil.appendPlaceholders(((StringBuilder) (_statement)), i);
	//    9   19:aload_3         
	//   10   20:iload_2         
	//   11   21:invokestatic    #139 <Method void StringUtil.appendPlaceholders(StringBuilder, int)>
		((StringBuilder) (_statement)).append(")");
	//   12   24:aload_3         
	//   13   25:ldc1            #141 <String ")">
	//   14   27:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
		_statement = RoomSQLiteQuery.acquire(((StringBuilder) (_statement)).toString(), i + 0);
	//   16   31:aload_3         
	//   17   32:invokevirtual   #145 <Method String StringBuilder.toString()>
	//   18   35:iload_2         
	//   19   36:iconst_0        
	//   20   37:iadd            
	//   21   38:invokestatic    #151 <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//   22   41:astore_3        
		list = ((List) (list.iterator()));
	//   23   42:aload_1         
	//   24   43:invokeinterface #476 <Method Iterator List.iterator()>
	//   25   48:astore_1        
		for(int j = 1; ((Iterator) (list)).hasNext(); j++)
	//*  26   49:iconst_1        
	//*  27   50:istore_2        
	//*  28   51:aload_1         
	//*  29   52:invokeinterface #160 <Method boolean Iterator.hasNext()>
	//*  30   57:ifeq            98
		{
			String s = (String)((Iterator) (list)).next();
	//   31   60:aload_1         
	//   32   61:invokeinterface #164 <Method Object Iterator.next()>
	//   33   66:checkcast       #166 <Class String>
	//   34   69:astore          4
			if(s == null)
	//*  35   71:aload           4
	//*  36   73:ifnonnull       84
				_statement.bindNull(j);
	//   37   76:aload_3         
	//   38   77:iload_2         
	//   39   78:invokevirtual   #169 <Method void RoomSQLiteQuery.bindNull(int)>
			else
	//*  40   81:goto            91
				_statement.bindString(j, s);
	//   41   84:aload_3         
	//   42   85:iload_2         
	//   43   86:aload           4
	//   44   88:invokevirtual   #173 <Method void RoomSQLiteQuery.bindString(int, String)>
		}

	//   45   91:iload_2         
	//   46   92:iconst_1        
	//   47   93:iadd            
	//   48   94:istore_2        
	//*  49   95:goto            51
		return ((_cls10) (new ComputableLiveData() {

			protected volatile Object compute()
			{
				return ((Object) (compute()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #33  <Method List compute()>
			//    2    4:areturn         
			}

			protected List compute()
			{
				if(_observer == null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #35  <Field android.arch.persistence.room.InvalidationTracker$Observer _observer>
			//*   2    4:ifnonnull       47
				{
					_observer = ((android.arch.persistence.room.InvalidationTracker.Observer) (new android.arch.persistence.room.InvalidationTracker.Observer("WorkTag", new String[] {
						"workspec"
					}) {

						public void onInvalidated(Set set)
						{
							invalidate();
						//    0    0:aload_0         
						//    1    1:getfield        #15  <Field WorkSpecDao_Impl$10 this$1>
						//    2    4:invokevirtual   #26  <Method void WorkSpecDao_Impl$10.invalidate()>
						//    3    7:return          
						}

						final _cls10 this$1;

			transient 
			{
				this$1 = _cls10.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field WorkSpecDao_Impl$10 this$1>
				super(s, as);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:aload_3         
			//    6    8:invokespecial   #18  <Method void android.arch.persistence.room.InvalidationTracker$Observer(String, String[])>
			//    7   11:return          
			}
					}
));
			//    3    7:aload_0         
			//    4    8:new             #12  <Class WorkSpecDao_Impl$10$1>
			//    5   11:dup             
			//    6   12:aload_0         
			//    7   13:ldc1            #37  <String "WorkTag">
			//    8   15:iconst_1        
			//    9   16:anewarray       String[]
			//   10   19:dup             
			//   11   20:iconst_0        
			//   12   21:ldc1            #41  <String "workspec">
			//   13   23:aastore         
			//   14   24:invokespecial   #44  <Method void WorkSpecDao_Impl$10$1(WorkSpecDao_Impl$10, String, String[])>
			//   15   27:putfield        #35  <Field android.arch.persistence.room.InvalidationTracker$Observer _observer>
					__db.getInvalidationTracker().addWeakObserver(_observer);
			//   16   30:aload_0         
			//   17   31:getfield        #22  <Field WorkSpecDao_Impl this$0>
			//   18   34:invokestatic    #48  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
			//   19   37:invokevirtual   #54  <Method InvalidationTracker RoomDatabase.getInvalidationTracker()>
			//   20   40:aload_0         
			//   21   41:getfield        #35  <Field android.arch.persistence.room.InvalidationTracker$Observer _observer>
			//   22   44:invokevirtual   #60  <Method void InvalidationTracker.addWeakObserver(android.arch.persistence.room.InvalidationTracker$Observer)>
				}
				__db.beginTransaction();
			//   23   47:aload_0         
			//   24   48:getfield        #22  <Field WorkSpecDao_Impl this$0>
			//   25   51:invokestatic    #48  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
			//   26   54:invokevirtual   #63  <Method void RoomDatabase.beginTransaction()>
				Cursor cursor = __db.query(((android.arch.persistence.db.SupportSQLiteQuery) (_statement)));
			//   27   57:aload_0         
			//   28   58:getfield        #22  <Field WorkSpecDao_Impl this$0>
			//   29   61:invokestatic    #48  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
			//   30   64:aload_0         
			//   31   65:getfield        #24  <Field RoomSQLiteQuery val$_statement>
			//   32   68:invokevirtual   #67  <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
			//   33   71:astore          6
				int k;
				int l;
				int i1;
				ArrayMap arraymap;
				ArrayList arraylist2;
				arraymap = new ArrayMap();
			//   34   73:new             #69  <Class ArrayMap>
			//   35   76:dup             
			//   36   77:invokespecial   #70  <Method void ArrayMap()>
			//   37   80:astore          7
				k = cursor.getColumnIndexOrThrow("id");
			//   38   82:aload           6
			//   39   84:ldc1            #72  <String "id">
			//   40   86:invokeinterface #78  <Method int Cursor.getColumnIndexOrThrow(String)>
			//   41   91:istore_1        
				l = cursor.getColumnIndexOrThrow("state");
			//   42   92:aload           6
			//   43   94:ldc1            #80  <String "state">
			//   44   96:invokeinterface #78  <Method int Cursor.getColumnIndexOrThrow(String)>
			//   45  101:istore_2        
				i1 = cursor.getColumnIndexOrThrow("output");
			//   46  102:aload           6
			//   47  104:ldc1            #82  <String "output">
			//   48  106:invokeinterface #78  <Method int Cursor.getColumnIndexOrThrow(String)>
			//   49  111:istore_3        
				arraylist2 = new ArrayList(cursor.getCount());
			//   50  112:new             #84  <Class ArrayList>
			//   51  115:dup             
			//   52  116:aload           6
			//   53  118:invokeinterface #88  <Method int Cursor.getCount()>
			//   54  123:invokespecial   #91  <Method void ArrayList(int)>
			//   55  126:astore          8
_L1:
				ArrayList arraylist1;
				WorkSpec.WorkInfoPojo workinfopojo;
				String s1;
				if(!cursor.moveToNext())
					break MISSING_BLOCK_LABEL_273;
			//   56  128:aload           6
			//   57  130:invokeinterface #95  <Method boolean Cursor.moveToNext()>
			//   58  135:ifeq            273
				workinfopojo = new WorkSpec.WorkInfoPojo();
			//   59  138:new             #97  <Class WorkSpec$WorkInfoPojo>
			//   60  141:dup             
			//   61  142:invokespecial   #98  <Method void WorkSpec$WorkInfoPojo()>
			//   62  145:astore          9
				workinfopojo.id = cursor.getString(k);
			//   63  147:aload           9
			//   64  149:aload           6
			//   65  151:iload_1         
			//   66  152:invokeinterface #102 <Method String Cursor.getString(int)>
			//   67  157:putfield        #105 <Field String WorkSpec$WorkInfoPojo.id>
				workinfopojo.state = WorkTypeConverters.intToState(cursor.getInt(l));
			//   68  160:aload           9
			//   69  162:aload           6
			//   70  164:iload_2         
			//   71  165:invokeinterface #109 <Method int Cursor.getInt(int)>
			//   72  170:invokestatic    #115 <Method androidx.work.WorkInfo$State WorkTypeConverters.intToState(int)>
			//   73  173:putfield        #118 <Field androidx.work.WorkInfo$State WorkSpec$WorkInfoPojo.state>
				workinfopojo.output = Data.fromByteArray(cursor.getBlob(i1));
			//   74  176:aload           9
			//   75  178:aload           6
			//   76  180:iload_3         
			//   77  181:invokeinterface #122 <Method byte[] Cursor.getBlob(int)>
			//   78  186:invokestatic    #128 <Method Data Data.fromByteArray(byte[])>
			//   79  189:putfield        #131 <Field Data WorkSpec$WorkInfoPojo.output>
				if(cursor.isNull(k))
					break MISSING_BLOCK_LABEL_260;
			//   80  192:aload           6
			//   81  194:iload_1         
			//   82  195:invokeinterface #135 <Method boolean Cursor.isNull(int)>
			//   83  200:ifne            260
				s1 = cursor.getString(k);
			//   84  203:aload           6
			//   85  205:iload_1         
			//   86  206:invokeinterface #102 <Method String Cursor.getString(int)>
			//   87  211:astore          10
				arraylist1 = (ArrayList)arraymap.get(((Object) (s1)));
			//   88  213:aload           7
			//   89  215:aload           10
			//   90  217:invokevirtual   #139 <Method Object ArrayMap.get(Object)>
			//   91  220:checkcast       #84  <Class ArrayList>
			//   92  223:astore          5
				ArrayList arraylist;
				arraylist = arraylist1;
			//   93  225:aload           5
			//   94  227:astore          4
				if(arraylist1 != null)
					break MISSING_BLOCK_LABEL_253;
			//   95  229:aload           5
			//   96  231:ifnonnull       253
				arraylist = new ArrayList();
			//   97  234:new             #84  <Class ArrayList>
			//   98  237:dup             
			//   99  238:invokespecial   #140 <Method void ArrayList()>
			//  100  241:astore          4
				arraymap.put(((Object) (s1)), ((Object) (arraylist)));
			//  101  243:aload           7
			//  102  245:aload           10
			//  103  247:aload           4
			//  104  249:invokevirtual   #144 <Method Object ArrayMap.put(Object, Object)>
			//  105  252:pop             
				workinfopojo.tags = ((List) (arraylist));
			//  106  253:aload           9
			//  107  255:aload           4
			//  108  257:putfield        #148 <Field List WorkSpec$WorkInfoPojo.tags>
				((List) (arraylist2)).add(((Object) (workinfopojo)));
			//  109  260:aload           8
			//  110  262:aload           9
			//  111  264:invokeinterface #154 <Method boolean List.add(Object)>
			//  112  269:pop             
				  goto _L1
			//* 113  270:goto            128
				__fetchRelationshipWorkTagAsjavaLangString(arraymap);
			//  114  273:aload_0         
			//  115  274:getfield        #22  <Field WorkSpecDao_Impl this$0>
			//  116  277:aload           7
			//  117  279:invokestatic    #158 <Method void WorkSpecDao_Impl.access$100(WorkSpecDao_Impl, ArrayMap)>
				__db.setTransactionSuccessful();
			//  118  282:aload_0         
			//  119  283:getfield        #22  <Field WorkSpecDao_Impl this$0>
			//  120  286:invokestatic    #48  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
			//  121  289:invokevirtual   #161 <Method void RoomDatabase.setTransactionSuccessful()>
				cursor.close();
			//  122  292:aload           6
			//  123  294:invokeinterface #164 <Method void Cursor.close()>
				__db.endTransaction();
			//  124  299:aload_0         
			//  125  300:getfield        #22  <Field WorkSpecDao_Impl this$0>
			//  126  303:invokestatic    #48  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
			//  127  306:invokevirtual   #167 <Method void RoomDatabase.endTransaction()>
				return ((List) (arraylist2));
			//  128  309:aload           8
			//  129  311:areturn         
				Exception exception;
				exception;
			//  130  312:astore          4
				cursor.close();
			//  131  314:aload           6
			//  132  316:invokeinterface #164 <Method void Cursor.close()>
				throw exception;
			//  133  321:aload           4
			//  134  323:athrow          
				exception;
			//  135  324:astore          4
				__db.endTransaction();
			//  136  326:aload_0         
			//  137  327:getfield        #22  <Field WorkSpecDao_Impl this$0>
			//  138  330:invokestatic    #48  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
			//  139  333:invokevirtual   #167 <Method void RoomDatabase.endTransaction()>
				throw exception;
			//  140  336:aload           4
			//  141  338:athrow          
			}

			protected void finalize()
			{
				_statement.release();
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field RoomSQLiteQuery val$_statement>
			//    2    4:invokevirtual   #175 <Method void RoomSQLiteQuery.release()>
			//    3    7:return          
			}

			private android.arch.persistence.room.InvalidationTracker.Observer _observer;
			final WorkSpecDao_Impl this$0;
			final RoomSQLiteQuery val$_statement;

			
			{
				this$0 = WorkSpecDao_Impl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field WorkSpecDao_Impl this$0>
				_statement = roomsqlitequery;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field RoomSQLiteQuery val$_statement>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void ComputableLiveData()>
			//    8   14:return          
			}
		}
)).getLiveData();
	//   50   98:new             #10  <Class WorkSpecDao_Impl$10>
	//   51  101:dup             
	//   52  102:aload_0         
	//   53  103:aload_3         
	//   54  104:invokespecial   #510 <Method void WorkSpecDao_Impl$10(WorkSpecDao_Impl, RoomSQLiteQuery)>
	//   55  107:invokevirtual   #514 <Method LiveData WorkSpecDao_Impl$10.getLiveData()>
	//   56  110:areturn         
	}

	public LiveData getWorkStatusPojoLiveDataForName(String s)
	{
		final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire("SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
	//    0    0:ldc2            #501 <String "SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)">
	//    1    3:iconst_1        
	//    2    4:invokestatic    #151 <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//    3    7:astore_2        
		if(s == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       20
			_statement.bindNull(1);
	//    6   12:aload_2         
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #169 <Method void RoomSQLiteQuery.bindNull(int)>
		else
	//*   9   17:goto            26
			_statement.bindString(1, s);
	//   10   20:aload_2         
	//   11   21:iconst_1        
	//   12   22:aload_1         
	//   13   23:invokevirtual   #173 <Method void RoomSQLiteQuery.bindString(int, String)>
		return ((_cls12) (new ComputableLiveData() {

			protected volatile Object compute()
			{
				return ((Object) (compute()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #33  <Method List compute()>
			//    2    4:areturn         
			}

			protected List compute()
			{
				if(_observer == null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #35  <Field android.arch.persistence.room.InvalidationTracker$Observer _observer>
			//*   2    4:ifnonnull       52
				{
					_observer = ((android.arch.persistence.room.InvalidationTracker.Observer) (new android.arch.persistence.room.InvalidationTracker.Observer("WorkTag", new String[] {
						"workspec", "workname"
					}) {

						public void onInvalidated(Set set)
						{
							invalidate();
						//    0    0:aload_0         
						//    1    1:getfield        #15  <Field WorkSpecDao_Impl$12 this$1>
						//    2    4:invokevirtual   #26  <Method void WorkSpecDao_Impl$12.invalidate()>
						//    3    7:return          
						}

						final _cls12 this$1;

			transient 
			{
				this$1 = _cls12.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field WorkSpecDao_Impl$12 this$1>
				super(s, as);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:aload_3         
			//    6    8:invokespecial   #18  <Method void android.arch.persistence.room.InvalidationTracker$Observer(String, String[])>
			//    7   11:return          
			}
					}
));
			//    3    7:aload_0         
			//    4    8:new             #12  <Class WorkSpecDao_Impl$12$1>
			//    5   11:dup             
			//    6   12:aload_0         
			//    7   13:ldc1            #37  <String "WorkTag">
			//    8   15:iconst_2        
			//    9   16:anewarray       String[]
			//   10   19:dup             
			//   11   20:iconst_0        
			//   12   21:ldc1            #41  <String "workspec">
			//   13   23:aastore         
			//   14   24:dup             
			//   15   25:iconst_1        
			//   16   26:ldc1            #43  <String "workname">
			//   17   28:aastore         
			//   18   29:invokespecial   #46  <Method void WorkSpecDao_Impl$12$1(WorkSpecDao_Impl$12, String, String[])>
			//   19   32:putfield        #35  <Field android.arch.persistence.room.InvalidationTracker$Observer _observer>
					__db.getInvalidationTracker().addWeakObserver(_observer);
			//   20   35:aload_0         
			//   21   36:getfield        #22  <Field WorkSpecDao_Impl this$0>
			//   22   39:invokestatic    #50  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
			//   23   42:invokevirtual   #56  <Method InvalidationTracker RoomDatabase.getInvalidationTracker()>
			//   24   45:aload_0         
			//   25   46:getfield        #35  <Field android.arch.persistence.room.InvalidationTracker$Observer _observer>
			//   26   49:invokevirtual   #62  <Method void InvalidationTracker.addWeakObserver(android.arch.persistence.room.InvalidationTracker$Observer)>
				}
				__db.beginTransaction();
			//   27   52:aload_0         
			//   28   53:getfield        #22  <Field WorkSpecDao_Impl this$0>
			//   29   56:invokestatic    #50  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
			//   30   59:invokevirtual   #65  <Method void RoomDatabase.beginTransaction()>
				Cursor cursor = __db.query(((android.arch.persistence.db.SupportSQLiteQuery) (_statement)));
			//   31   62:aload_0         
			//   32   63:getfield        #22  <Field WorkSpecDao_Impl this$0>
			//   33   66:invokestatic    #50  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
			//   34   69:aload_0         
			//   35   70:getfield        #24  <Field RoomSQLiteQuery val$_statement>
			//   36   73:invokevirtual   #69  <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
			//   37   76:astore          6
				int i;
				int j;
				int k;
				ArrayMap arraymap;
				ArrayList arraylist2;
				arraymap = new ArrayMap();
			//   38   78:new             #71  <Class ArrayMap>
			//   39   81:dup             
			//   40   82:invokespecial   #72  <Method void ArrayMap()>
			//   41   85:astore          7
				i = cursor.getColumnIndexOrThrow("id");
			//   42   87:aload           6
			//   43   89:ldc1            #74  <String "id">
			//   44   91:invokeinterface #80  <Method int Cursor.getColumnIndexOrThrow(String)>
			//   45   96:istore_1        
				j = cursor.getColumnIndexOrThrow("state");
			//   46   97:aload           6
			//   47   99:ldc1            #82  <String "state">
			//   48  101:invokeinterface #80  <Method int Cursor.getColumnIndexOrThrow(String)>
			//   49  106:istore_2        
				k = cursor.getColumnIndexOrThrow("output");
			//   50  107:aload           6
			//   51  109:ldc1            #84  <String "output">
			//   52  111:invokeinterface #80  <Method int Cursor.getColumnIndexOrThrow(String)>
			//   53  116:istore_3        
				arraylist2 = new ArrayList(cursor.getCount());
			//   54  117:new             #86  <Class ArrayList>
			//   55  120:dup             
			//   56  121:aload           6
			//   57  123:invokeinterface #90  <Method int Cursor.getCount()>
			//   58  128:invokespecial   #93  <Method void ArrayList(int)>
			//   59  131:astore          8
_L1:
				ArrayList arraylist1;
				WorkSpec.WorkInfoPojo workinfopojo;
				String s1;
				if(!cursor.moveToNext())
					break MISSING_BLOCK_LABEL_278;
			//   60  133:aload           6
			//   61  135:invokeinterface #97  <Method boolean Cursor.moveToNext()>
			//   62  140:ifeq            278
				workinfopojo = new WorkSpec.WorkInfoPojo();
			//   63  143:new             #99  <Class WorkSpec$WorkInfoPojo>
			//   64  146:dup             
			//   65  147:invokespecial   #100 <Method void WorkSpec$WorkInfoPojo()>
			//   66  150:astore          9
				workinfopojo.id = cursor.getString(i);
			//   67  152:aload           9
			//   68  154:aload           6
			//   69  156:iload_1         
			//   70  157:invokeinterface #104 <Method String Cursor.getString(int)>
			//   71  162:putfield        #107 <Field String WorkSpec$WorkInfoPojo.id>
				workinfopojo.state = WorkTypeConverters.intToState(cursor.getInt(j));
			//   72  165:aload           9
			//   73  167:aload           6
			//   74  169:iload_2         
			//   75  170:invokeinterface #111 <Method int Cursor.getInt(int)>
			//   76  175:invokestatic    #117 <Method androidx.work.WorkInfo$State WorkTypeConverters.intToState(int)>
			//   77  178:putfield        #120 <Field androidx.work.WorkInfo$State WorkSpec$WorkInfoPojo.state>
				workinfopojo.output = Data.fromByteArray(cursor.getBlob(k));
			//   78  181:aload           9
			//   79  183:aload           6
			//   80  185:iload_3         
			//   81  186:invokeinterface #124 <Method byte[] Cursor.getBlob(int)>
			//   82  191:invokestatic    #130 <Method Data Data.fromByteArray(byte[])>
			//   83  194:putfield        #133 <Field Data WorkSpec$WorkInfoPojo.output>
				if(cursor.isNull(i))
					break MISSING_BLOCK_LABEL_265;
			//   84  197:aload           6
			//   85  199:iload_1         
			//   86  200:invokeinterface #137 <Method boolean Cursor.isNull(int)>
			//   87  205:ifne            265
				s1 = cursor.getString(i);
			//   88  208:aload           6
			//   89  210:iload_1         
			//   90  211:invokeinterface #104 <Method String Cursor.getString(int)>
			//   91  216:astore          10
				arraylist1 = (ArrayList)arraymap.get(((Object) (s1)));
			//   92  218:aload           7
			//   93  220:aload           10
			//   94  222:invokevirtual   #141 <Method Object ArrayMap.get(Object)>
			//   95  225:checkcast       #86  <Class ArrayList>
			//   96  228:astore          5
				ArrayList arraylist;
				arraylist = arraylist1;
			//   97  230:aload           5
			//   98  232:astore          4
				if(arraylist1 != null)
					break MISSING_BLOCK_LABEL_258;
			//   99  234:aload           5
			//  100  236:ifnonnull       258
				arraylist = new ArrayList();
			//  101  239:new             #86  <Class ArrayList>
			//  102  242:dup             
			//  103  243:invokespecial   #142 <Method void ArrayList()>
			//  104  246:astore          4
				arraymap.put(((Object) (s1)), ((Object) (arraylist)));
			//  105  248:aload           7
			//  106  250:aload           10
			//  107  252:aload           4
			//  108  254:invokevirtual   #146 <Method Object ArrayMap.put(Object, Object)>
			//  109  257:pop             
				workinfopojo.tags = ((List) (arraylist));
			//  110  258:aload           9
			//  111  260:aload           4
			//  112  262:putfield        #150 <Field List WorkSpec$WorkInfoPojo.tags>
				((List) (arraylist2)).add(((Object) (workinfopojo)));
			//  113  265:aload           8
			//  114  267:aload           9
			//  115  269:invokeinterface #156 <Method boolean List.add(Object)>
			//  116  274:pop             
				  goto _L1
			//* 117  275:goto            133
				__fetchRelationshipWorkTagAsjavaLangString(arraymap);
			//  118  278:aload_0         
			//  119  279:getfield        #22  <Field WorkSpecDao_Impl this$0>
			//  120  282:aload           7
			//  121  284:invokestatic    #160 <Method void WorkSpecDao_Impl.access$100(WorkSpecDao_Impl, ArrayMap)>
				__db.setTransactionSuccessful();
			//  122  287:aload_0         
			//  123  288:getfield        #22  <Field WorkSpecDao_Impl this$0>
			//  124  291:invokestatic    #50  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
			//  125  294:invokevirtual   #163 <Method void RoomDatabase.setTransactionSuccessful()>
				cursor.close();
			//  126  297:aload           6
			//  127  299:invokeinterface #166 <Method void Cursor.close()>
				__db.endTransaction();
			//  128  304:aload_0         
			//  129  305:getfield        #22  <Field WorkSpecDao_Impl this$0>
			//  130  308:invokestatic    #50  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
			//  131  311:invokevirtual   #169 <Method void RoomDatabase.endTransaction()>
				return ((List) (arraylist2));
			//  132  314:aload           8
			//  133  316:areturn         
				Exception exception;
				exception;
			//  134  317:astore          4
				cursor.close();
			//  135  319:aload           6
			//  136  321:invokeinterface #166 <Method void Cursor.close()>
				throw exception;
			//  137  326:aload           4
			//  138  328:athrow          
				exception;
			//  139  329:astore          4
				__db.endTransaction();
			//  140  331:aload_0         
			//  141  332:getfield        #22  <Field WorkSpecDao_Impl this$0>
			//  142  335:invokestatic    #50  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
			//  143  338:invokevirtual   #169 <Method void RoomDatabase.endTransaction()>
				throw exception;
			//  144  341:aload           4
			//  145  343:athrow          
			}

			protected void finalize()
			{
				_statement.release();
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field RoomSQLiteQuery val$_statement>
			//    2    4:invokevirtual   #177 <Method void RoomSQLiteQuery.release()>
			//    3    7:return          
			}

			private android.arch.persistence.room.InvalidationTracker.Observer _observer;
			final WorkSpecDao_Impl this$0;
			final RoomSQLiteQuery val$_statement;

			
			{
				this$0 = WorkSpecDao_Impl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field WorkSpecDao_Impl this$0>
				_statement = roomsqlitequery;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field RoomSQLiteQuery val$_statement>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void ComputableLiveData()>
			//    8   14:return          
			}
		}
)).getLiveData();
	//   14   26:new             #18  <Class WorkSpecDao_Impl$12>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:invokespecial   #518 <Method void WorkSpecDao_Impl$12(WorkSpecDao_Impl, RoomSQLiteQuery)>
	//   19   35:invokevirtual   #519 <Method LiveData WorkSpecDao_Impl$12.getLiveData()>
	//   20   38:areturn         
	}

	public LiveData getWorkStatusPojoLiveDataForTag(String s)
	{
		final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire("SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
	//    0    0:ldc2            #505 <String "SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)">
	//    1    3:iconst_1        
	//    2    4:invokestatic    #151 <Method RoomSQLiteQuery RoomSQLiteQuery.acquire(String, int)>
	//    3    7:astore_2        
		if(s == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       20
			_statement.bindNull(1);
	//    6   12:aload_2         
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #169 <Method void RoomSQLiteQuery.bindNull(int)>
		else
	//*   9   17:goto            26
			_statement.bindString(1, s);
	//   10   20:aload_2         
	//   11   21:iconst_1        
	//   12   22:aload_1         
	//   13   23:invokevirtual   #173 <Method void RoomSQLiteQuery.bindString(int, String)>
		return ((_cls11) (new ComputableLiveData() {

			protected volatile Object compute()
			{
				return ((Object) (compute()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #33  <Method List compute()>
			//    2    4:areturn         
			}

			protected List compute()
			{
				if(_observer == null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #35  <Field android.arch.persistence.room.InvalidationTracker$Observer _observer>
			//*   2    4:ifnonnull       52
				{
					_observer = ((android.arch.persistence.room.InvalidationTracker.Observer) (new android.arch.persistence.room.InvalidationTracker.Observer("WorkTag", new String[] {
						"workspec", "worktag"
					}) {

						public void onInvalidated(Set set)
						{
							invalidate();
						//    0    0:aload_0         
						//    1    1:getfield        #15  <Field WorkSpecDao_Impl$11 this$1>
						//    2    4:invokevirtual   #26  <Method void WorkSpecDao_Impl$11.invalidate()>
						//    3    7:return          
						}

						final _cls11 this$1;

			transient 
			{
				this$1 = _cls11.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field WorkSpecDao_Impl$11 this$1>
				super(s, as);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:aload_3         
			//    6    8:invokespecial   #18  <Method void android.arch.persistence.room.InvalidationTracker$Observer(String, String[])>
			//    7   11:return          
			}
					}
));
			//    3    7:aload_0         
			//    4    8:new             #12  <Class WorkSpecDao_Impl$11$1>
			//    5   11:dup             
			//    6   12:aload_0         
			//    7   13:ldc1            #37  <String "WorkTag">
			//    8   15:iconst_2        
			//    9   16:anewarray       String[]
			//   10   19:dup             
			//   11   20:iconst_0        
			//   12   21:ldc1            #41  <String "workspec">
			//   13   23:aastore         
			//   14   24:dup             
			//   15   25:iconst_1        
			//   16   26:ldc1            #43  <String "worktag">
			//   17   28:aastore         
			//   18   29:invokespecial   #46  <Method void WorkSpecDao_Impl$11$1(WorkSpecDao_Impl$11, String, String[])>
			//   19   32:putfield        #35  <Field android.arch.persistence.room.InvalidationTracker$Observer _observer>
					__db.getInvalidationTracker().addWeakObserver(_observer);
			//   20   35:aload_0         
			//   21   36:getfield        #22  <Field WorkSpecDao_Impl this$0>
			//   22   39:invokestatic    #50  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
			//   23   42:invokevirtual   #56  <Method InvalidationTracker RoomDatabase.getInvalidationTracker()>
			//   24   45:aload_0         
			//   25   46:getfield        #35  <Field android.arch.persistence.room.InvalidationTracker$Observer _observer>
			//   26   49:invokevirtual   #62  <Method void InvalidationTracker.addWeakObserver(android.arch.persistence.room.InvalidationTracker$Observer)>
				}
				__db.beginTransaction();
			//   27   52:aload_0         
			//   28   53:getfield        #22  <Field WorkSpecDao_Impl this$0>
			//   29   56:invokestatic    #50  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
			//   30   59:invokevirtual   #65  <Method void RoomDatabase.beginTransaction()>
				Cursor cursor = __db.query(((android.arch.persistence.db.SupportSQLiteQuery) (_statement)));
			//   31   62:aload_0         
			//   32   63:getfield        #22  <Field WorkSpecDao_Impl this$0>
			//   33   66:invokestatic    #50  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
			//   34   69:aload_0         
			//   35   70:getfield        #24  <Field RoomSQLiteQuery val$_statement>
			//   36   73:invokevirtual   #69  <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
			//   37   76:astore          6
				int i;
				int j;
				int k;
				ArrayMap arraymap;
				ArrayList arraylist2;
				arraymap = new ArrayMap();
			//   38   78:new             #71  <Class ArrayMap>
			//   39   81:dup             
			//   40   82:invokespecial   #72  <Method void ArrayMap()>
			//   41   85:astore          7
				i = cursor.getColumnIndexOrThrow("id");
			//   42   87:aload           6
			//   43   89:ldc1            #74  <String "id">
			//   44   91:invokeinterface #80  <Method int Cursor.getColumnIndexOrThrow(String)>
			//   45   96:istore_1        
				j = cursor.getColumnIndexOrThrow("state");
			//   46   97:aload           6
			//   47   99:ldc1            #82  <String "state">
			//   48  101:invokeinterface #80  <Method int Cursor.getColumnIndexOrThrow(String)>
			//   49  106:istore_2        
				k = cursor.getColumnIndexOrThrow("output");
			//   50  107:aload           6
			//   51  109:ldc1            #84  <String "output">
			//   52  111:invokeinterface #80  <Method int Cursor.getColumnIndexOrThrow(String)>
			//   53  116:istore_3        
				arraylist2 = new ArrayList(cursor.getCount());
			//   54  117:new             #86  <Class ArrayList>
			//   55  120:dup             
			//   56  121:aload           6
			//   57  123:invokeinterface #90  <Method int Cursor.getCount()>
			//   58  128:invokespecial   #93  <Method void ArrayList(int)>
			//   59  131:astore          8
_L1:
				ArrayList arraylist1;
				WorkSpec.WorkInfoPojo workinfopojo;
				String s1;
				if(!cursor.moveToNext())
					break MISSING_BLOCK_LABEL_278;
			//   60  133:aload           6
			//   61  135:invokeinterface #97  <Method boolean Cursor.moveToNext()>
			//   62  140:ifeq            278
				workinfopojo = new WorkSpec.WorkInfoPojo();
			//   63  143:new             #99  <Class WorkSpec$WorkInfoPojo>
			//   64  146:dup             
			//   65  147:invokespecial   #100 <Method void WorkSpec$WorkInfoPojo()>
			//   66  150:astore          9
				workinfopojo.id = cursor.getString(i);
			//   67  152:aload           9
			//   68  154:aload           6
			//   69  156:iload_1         
			//   70  157:invokeinterface #104 <Method String Cursor.getString(int)>
			//   71  162:putfield        #107 <Field String WorkSpec$WorkInfoPojo.id>
				workinfopojo.state = WorkTypeConverters.intToState(cursor.getInt(j));
			//   72  165:aload           9
			//   73  167:aload           6
			//   74  169:iload_2         
			//   75  170:invokeinterface #111 <Method int Cursor.getInt(int)>
			//   76  175:invokestatic    #117 <Method androidx.work.WorkInfo$State WorkTypeConverters.intToState(int)>
			//   77  178:putfield        #120 <Field androidx.work.WorkInfo$State WorkSpec$WorkInfoPojo.state>
				workinfopojo.output = Data.fromByteArray(cursor.getBlob(k));
			//   78  181:aload           9
			//   79  183:aload           6
			//   80  185:iload_3         
			//   81  186:invokeinterface #124 <Method byte[] Cursor.getBlob(int)>
			//   82  191:invokestatic    #130 <Method Data Data.fromByteArray(byte[])>
			//   83  194:putfield        #133 <Field Data WorkSpec$WorkInfoPojo.output>
				if(cursor.isNull(i))
					break MISSING_BLOCK_LABEL_265;
			//   84  197:aload           6
			//   85  199:iload_1         
			//   86  200:invokeinterface #137 <Method boolean Cursor.isNull(int)>
			//   87  205:ifne            265
				s1 = cursor.getString(i);
			//   88  208:aload           6
			//   89  210:iload_1         
			//   90  211:invokeinterface #104 <Method String Cursor.getString(int)>
			//   91  216:astore          10
				arraylist1 = (ArrayList)arraymap.get(((Object) (s1)));
			//   92  218:aload           7
			//   93  220:aload           10
			//   94  222:invokevirtual   #141 <Method Object ArrayMap.get(Object)>
			//   95  225:checkcast       #86  <Class ArrayList>
			//   96  228:astore          5
				ArrayList arraylist;
				arraylist = arraylist1;
			//   97  230:aload           5
			//   98  232:astore          4
				if(arraylist1 != null)
					break MISSING_BLOCK_LABEL_258;
			//   99  234:aload           5
			//  100  236:ifnonnull       258
				arraylist = new ArrayList();
			//  101  239:new             #86  <Class ArrayList>
			//  102  242:dup             
			//  103  243:invokespecial   #142 <Method void ArrayList()>
			//  104  246:astore          4
				arraymap.put(((Object) (s1)), ((Object) (arraylist)));
			//  105  248:aload           7
			//  106  250:aload           10
			//  107  252:aload           4
			//  108  254:invokevirtual   #146 <Method Object ArrayMap.put(Object, Object)>
			//  109  257:pop             
				workinfopojo.tags = ((List) (arraylist));
			//  110  258:aload           9
			//  111  260:aload           4
			//  112  262:putfield        #150 <Field List WorkSpec$WorkInfoPojo.tags>
				((List) (arraylist2)).add(((Object) (workinfopojo)));
			//  113  265:aload           8
			//  114  267:aload           9
			//  115  269:invokeinterface #156 <Method boolean List.add(Object)>
			//  116  274:pop             
				  goto _L1
			//* 117  275:goto            133
				__fetchRelationshipWorkTagAsjavaLangString(arraymap);
			//  118  278:aload_0         
			//  119  279:getfield        #22  <Field WorkSpecDao_Impl this$0>
			//  120  282:aload           7
			//  121  284:invokestatic    #160 <Method void WorkSpecDao_Impl.access$100(WorkSpecDao_Impl, ArrayMap)>
				__db.setTransactionSuccessful();
			//  122  287:aload_0         
			//  123  288:getfield        #22  <Field WorkSpecDao_Impl this$0>
			//  124  291:invokestatic    #50  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
			//  125  294:invokevirtual   #163 <Method void RoomDatabase.setTransactionSuccessful()>
				cursor.close();
			//  126  297:aload           6
			//  127  299:invokeinterface #166 <Method void Cursor.close()>
				__db.endTransaction();
			//  128  304:aload_0         
			//  129  305:getfield        #22  <Field WorkSpecDao_Impl this$0>
			//  130  308:invokestatic    #50  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
			//  131  311:invokevirtual   #169 <Method void RoomDatabase.endTransaction()>
				return ((List) (arraylist2));
			//  132  314:aload           8
			//  133  316:areturn         
				Exception exception;
				exception;
			//  134  317:astore          4
				cursor.close();
			//  135  319:aload           6
			//  136  321:invokeinterface #166 <Method void Cursor.close()>
				throw exception;
			//  137  326:aload           4
			//  138  328:athrow          
				exception;
			//  139  329:astore          4
				__db.endTransaction();
			//  140  331:aload_0         
			//  141  332:getfield        #22  <Field WorkSpecDao_Impl this$0>
			//  142  335:invokestatic    #50  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
			//  143  338:invokevirtual   #169 <Method void RoomDatabase.endTransaction()>
				throw exception;
			//  144  341:aload           4
			//  145  343:athrow          
			}

			protected void finalize()
			{
				_statement.release();
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field RoomSQLiteQuery val$_statement>
			//    2    4:invokevirtual   #177 <Method void RoomSQLiteQuery.release()>
			//    3    7:return          
			}

			private android.arch.persistence.room.InvalidationTracker.Observer _observer;
			final WorkSpecDao_Impl this$0;
			final RoomSQLiteQuery val$_statement;

			
			{
				this$0 = WorkSpecDao_Impl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field WorkSpecDao_Impl this$0>
				_statement = roomsqlitequery;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field RoomSQLiteQuery val$_statement>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void ComputableLiveData()>
			//    8   14:return          
			}
		}
)).getLiveData();
	//   14   26:new             #14  <Class WorkSpecDao_Impl$11>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:invokespecial   #522 <Method void WorkSpecDao_Impl$11(WorkSpecDao_Impl, RoomSQLiteQuery)>
	//   19   35:invokevirtual   #523 <Method LiveData WorkSpecDao_Impl$11.getLiveData()>
	//   20   38:areturn         
	}

	public int incrementWorkSpecRunAttemptCount(String s)
	{
		SupportSQLiteStatement supportsqlitestatement;
		supportsqlitestatement = __preparedStmtOfIncrementWorkSpecRunAttemptCount.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field SharedSQLiteStatement __preparedStmtOfIncrementWorkSpecRunAttemptCount>
	//    2    4:invokevirtual   #224 <Method SupportSQLiteStatement SharedSQLiteStatement.acquire()>
	//    3    7:astore_3        
		__db.beginTransaction();
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field RoomDatabase __db>
	//    6   12:invokevirtual   #227 <Method void RoomDatabase.beginTransaction()>
		if(s != null)
			break MISSING_BLOCK_LABEL_29;
	//    7   15:aload_1         
	//    8   16:ifnonnull       29
		supportsqlitestatement.bindNull(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokeinterface #230 <Method void SupportSQLiteStatement.bindNull(int)>
		break MISSING_BLOCK_LABEL_37;
	//   12   26:goto            37
		supportsqlitestatement.bindString(1, s);
	//   13   29:aload_3         
	//   14   30:iconst_1        
	//   15   31:aload_1         
	//   16   32:invokeinterface #231 <Method void SupportSQLiteStatement.bindString(int, String)>
		int i;
		i = supportsqlitestatement.executeUpdateDelete();
	//   17   37:aload_3         
	//   18   38:invokeinterface #234 <Method int SupportSQLiteStatement.executeUpdateDelete()>
	//   19   43:istore_2        
		__db.setTransactionSuccessful();
	//   20   44:aload_0         
	//   21   45:getfield        #56  <Field RoomDatabase __db>
	//   22   48:invokevirtual   #237 <Method void RoomDatabase.setTransactionSuccessful()>
		__db.endTransaction();
	//   23   51:aload_0         
	//   24   52:getfield        #56  <Field RoomDatabase __db>
	//   25   55:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		__preparedStmtOfIncrementWorkSpecRunAttemptCount.release(supportsqlitestatement);
	//   26   58:aload_0         
	//   27   59:getfield        #73  <Field SharedSQLiteStatement __preparedStmtOfIncrementWorkSpecRunAttemptCount>
	//   28   62:aload_3         
	//   29   63:invokevirtual   #244 <Method void SharedSQLiteStatement.release(SupportSQLiteStatement)>
		return i;
	//   30   66:iload_2         
	//   31   67:ireturn         
		s;
	//   32   68:astore_1        
		__db.endTransaction();
	//   33   69:aload_0         
	//   34   70:getfield        #56  <Field RoomDatabase __db>
	//   35   73:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		__preparedStmtOfIncrementWorkSpecRunAttemptCount.release(supportsqlitestatement);
	//   36   76:aload_0         
	//   37   77:getfield        #73  <Field SharedSQLiteStatement __preparedStmtOfIncrementWorkSpecRunAttemptCount>
	//   38   80:aload_3         
	//   39   81:invokevirtual   #244 <Method void SharedSQLiteStatement.release(SupportSQLiteStatement)>
		throw s;
	//   40   84:aload_1         
	//   41   85:athrow          
	}

	public void insertWorkSpec(WorkSpec workspec)
	{
		__db.beginTransaction();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field RoomDatabase __db>
	//    2    4:invokevirtual   #227 <Method void RoomDatabase.beginTransaction()>
		__insertionAdapterOfWorkSpec.insert(((Object) (workspec)));
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field EntityInsertionAdapter __insertionAdapterOfWorkSpec>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #532 <Method void EntityInsertionAdapter.insert(Object)>
		__db.setTransactionSuccessful();
	//    7   15:aload_0         
	//    8   16:getfield        #56  <Field RoomDatabase __db>
	//    9   19:invokevirtual   #237 <Method void RoomDatabase.setTransactionSuccessful()>
		__db.endTransaction();
	//   10   22:aload_0         
	//   11   23:getfield        #56  <Field RoomDatabase __db>
	//   12   26:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		return;
	//   13   29:return          
		workspec;
	//   14   30:astore_1        
		__db.endTransaction();
	//   15   31:aload_0         
	//   16   32:getfield        #56  <Field RoomDatabase __db>
	//   17   35:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		throw workspec;
	//   18   38:aload_1         
	//   19   39:athrow          
	}

	public int markWorkSpecScheduled(String s, long l)
	{
		SupportSQLiteStatement supportsqlitestatement;
		supportsqlitestatement = __preparedStmtOfMarkWorkSpecScheduled.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field SharedSQLiteStatement __preparedStmtOfMarkWorkSpecScheduled>
	//    2    4:invokevirtual   #224 <Method SupportSQLiteStatement SharedSQLiteStatement.acquire()>
	//    3    7:astore          5
		__db.beginTransaction();
	//    4    9:aload_0         
	//    5   10:getfield        #56  <Field RoomDatabase __db>
	//    6   13:invokevirtual   #227 <Method void RoomDatabase.beginTransaction()>
		supportsqlitestatement.bindLong(1, l);
	//    7   16:aload           5
	//    8   18:iconst_1        
	//    9   19:lload_2         
	//   10   20:invokeinterface #535 <Method void SupportSQLiteStatement.bindLong(int, long)>
		if(s != null)
			break MISSING_BLOCK_LABEL_40;
	//   11   25:aload_1         
	//   12   26:ifnonnull       40
		supportsqlitestatement.bindNull(2);
	//   13   29:aload           5
	//   14   31:iconst_2        
	//   15   32:invokeinterface #230 <Method void SupportSQLiteStatement.bindNull(int)>
		break MISSING_BLOCK_LABEL_49;
	//   16   37:goto            49
		supportsqlitestatement.bindString(2, s);
	//   17   40:aload           5
	//   18   42:iconst_2        
	//   19   43:aload_1         
	//   20   44:invokeinterface #231 <Method void SupportSQLiteStatement.bindString(int, String)>
		int i;
		i = supportsqlitestatement.executeUpdateDelete();
	//   21   49:aload           5
	//   22   51:invokeinterface #234 <Method int SupportSQLiteStatement.executeUpdateDelete()>
	//   23   56:istore          4
		__db.setTransactionSuccessful();
	//   24   58:aload_0         
	//   25   59:getfield        #56  <Field RoomDatabase __db>
	//   26   62:invokevirtual   #237 <Method void RoomDatabase.setTransactionSuccessful()>
		__db.endTransaction();
	//   27   65:aload_0         
	//   28   66:getfield        #56  <Field RoomDatabase __db>
	//   29   69:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		__preparedStmtOfMarkWorkSpecScheduled.release(supportsqlitestatement);
	//   30   72:aload_0         
	//   31   73:getfield        #79  <Field SharedSQLiteStatement __preparedStmtOfMarkWorkSpecScheduled>
	//   32   76:aload           5
	//   33   78:invokevirtual   #244 <Method void SharedSQLiteStatement.release(SupportSQLiteStatement)>
		return i;
	//   34   81:iload           4
	//   35   83:ireturn         
		s;
	//   36   84:astore_1        
		__db.endTransaction();
	//   37   85:aload_0         
	//   38   86:getfield        #56  <Field RoomDatabase __db>
	//   39   89:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		__preparedStmtOfMarkWorkSpecScheduled.release(supportsqlitestatement);
	//   40   92:aload_0         
	//   41   93:getfield        #79  <Field SharedSQLiteStatement __preparedStmtOfMarkWorkSpecScheduled>
	//   42   96:aload           5
	//   43   98:invokevirtual   #244 <Method void SharedSQLiteStatement.release(SupportSQLiteStatement)>
		throw s;
	//   44  101:aload_1         
	//   45  102:athrow          
	}

	public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast()
	{
		SupportSQLiteStatement supportsqlitestatement;
		supportsqlitestatement = __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field SharedSQLiteStatement __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast>
	//    2    4:invokevirtual   #224 <Method SupportSQLiteStatement SharedSQLiteStatement.acquire()>
	//    3    7:astore_1        
		__db.beginTransaction();
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field RoomDatabase __db>
	//    6   12:invokevirtual   #227 <Method void RoomDatabase.beginTransaction()>
		supportsqlitestatement.executeUpdateDelete();
	//    7   15:aload_1         
	//    8   16:invokeinterface #234 <Method int SupportSQLiteStatement.executeUpdateDelete()>
	//    9   21:pop             
		__db.setTransactionSuccessful();
	//   10   22:aload_0         
	//   11   23:getfield        #56  <Field RoomDatabase __db>
	//   12   26:invokevirtual   #237 <Method void RoomDatabase.setTransactionSuccessful()>
		__db.endTransaction();
	//   13   29:aload_0         
	//   14   30:getfield        #56  <Field RoomDatabase __db>
	//   15   33:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast.release(supportsqlitestatement);
	//   16   36:aload_0         
	//   17   37:getfield        #85  <Field SharedSQLiteStatement __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast>
	//   18   40:aload_1         
	//   19   41:invokevirtual   #244 <Method void SharedSQLiteStatement.release(SupportSQLiteStatement)>
		return;
	//   20   44:return          
		Exception exception;
		exception;
	//   21   45:astore_2        
		__db.endTransaction();
	//   22   46:aload_0         
	//   23   47:getfield        #56  <Field RoomDatabase __db>
	//   24   50:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast.release(supportsqlitestatement);
	//   25   53:aload_0         
	//   26   54:getfield        #85  <Field SharedSQLiteStatement __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast>
	//   27   57:aload_1         
	//   28   58:invokevirtual   #244 <Method void SharedSQLiteStatement.release(SupportSQLiteStatement)>
		throw exception;
	//   29   61:aload_2         
	//   30   62:athrow          
	}

	public int resetScheduledState()
	{
		SupportSQLiteStatement supportsqlitestatement;
		supportsqlitestatement = __preparedStmtOfResetScheduledState.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field SharedSQLiteStatement __preparedStmtOfResetScheduledState>
	//    2    4:invokevirtual   #224 <Method SupportSQLiteStatement SharedSQLiteStatement.acquire()>
	//    3    7:astore_2        
		__db.beginTransaction();
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field RoomDatabase __db>
	//    6   12:invokevirtual   #227 <Method void RoomDatabase.beginTransaction()>
		int i;
		i = supportsqlitestatement.executeUpdateDelete();
	//    7   15:aload_2         
	//    8   16:invokeinterface #234 <Method int SupportSQLiteStatement.executeUpdateDelete()>
	//    9   21:istore_1        
		__db.setTransactionSuccessful();
	//   10   22:aload_0         
	//   11   23:getfield        #56  <Field RoomDatabase __db>
	//   12   26:invokevirtual   #237 <Method void RoomDatabase.setTransactionSuccessful()>
		__db.endTransaction();
	//   13   29:aload_0         
	//   14   30:getfield        #56  <Field RoomDatabase __db>
	//   15   33:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		__preparedStmtOfResetScheduledState.release(supportsqlitestatement);
	//   16   36:aload_0         
	//   17   37:getfield        #82  <Field SharedSQLiteStatement __preparedStmtOfResetScheduledState>
	//   18   40:aload_2         
	//   19   41:invokevirtual   #244 <Method void SharedSQLiteStatement.release(SupportSQLiteStatement)>
		return i;
	//   20   44:iload_1         
	//   21   45:ireturn         
		Exception exception;
		exception;
	//   22   46:astore_3        
		__db.endTransaction();
	//   23   47:aload_0         
	//   24   48:getfield        #56  <Field RoomDatabase __db>
	//   25   51:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		__preparedStmtOfResetScheduledState.release(supportsqlitestatement);
	//   26   54:aload_0         
	//   27   55:getfield        #82  <Field SharedSQLiteStatement __preparedStmtOfResetScheduledState>
	//   28   58:aload_2         
	//   29   59:invokevirtual   #244 <Method void SharedSQLiteStatement.release(SupportSQLiteStatement)>
		throw exception;
	//   30   62:aload_3         
	//   31   63:athrow          
	}

	public int resetWorkSpecRunAttemptCount(String s)
	{
		SupportSQLiteStatement supportsqlitestatement;
		supportsqlitestatement = __preparedStmtOfResetWorkSpecRunAttemptCount.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field SharedSQLiteStatement __preparedStmtOfResetWorkSpecRunAttemptCount>
	//    2    4:invokevirtual   #224 <Method SupportSQLiteStatement SharedSQLiteStatement.acquire()>
	//    3    7:astore_3        
		__db.beginTransaction();
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field RoomDatabase __db>
	//    6   12:invokevirtual   #227 <Method void RoomDatabase.beginTransaction()>
		if(s != null)
			break MISSING_BLOCK_LABEL_29;
	//    7   15:aload_1         
	//    8   16:ifnonnull       29
		supportsqlitestatement.bindNull(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokeinterface #230 <Method void SupportSQLiteStatement.bindNull(int)>
		break MISSING_BLOCK_LABEL_37;
	//   12   26:goto            37
		supportsqlitestatement.bindString(1, s);
	//   13   29:aload_3         
	//   14   30:iconst_1        
	//   15   31:aload_1         
	//   16   32:invokeinterface #231 <Method void SupportSQLiteStatement.bindString(int, String)>
		int i;
		i = supportsqlitestatement.executeUpdateDelete();
	//   17   37:aload_3         
	//   18   38:invokeinterface #234 <Method int SupportSQLiteStatement.executeUpdateDelete()>
	//   19   43:istore_2        
		__db.setTransactionSuccessful();
	//   20   44:aload_0         
	//   21   45:getfield        #56  <Field RoomDatabase __db>
	//   22   48:invokevirtual   #237 <Method void RoomDatabase.setTransactionSuccessful()>
		__db.endTransaction();
	//   23   51:aload_0         
	//   24   52:getfield        #56  <Field RoomDatabase __db>
	//   25   55:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		__preparedStmtOfResetWorkSpecRunAttemptCount.release(supportsqlitestatement);
	//   26   58:aload_0         
	//   27   59:getfield        #76  <Field SharedSQLiteStatement __preparedStmtOfResetWorkSpecRunAttemptCount>
	//   28   62:aload_3         
	//   29   63:invokevirtual   #244 <Method void SharedSQLiteStatement.release(SupportSQLiteStatement)>
		return i;
	//   30   66:iload_2         
	//   31   67:ireturn         
		s;
	//   32   68:astore_1        
		__db.endTransaction();
	//   33   69:aload_0         
	//   34   70:getfield        #56  <Field RoomDatabase __db>
	//   35   73:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		__preparedStmtOfResetWorkSpecRunAttemptCount.release(supportsqlitestatement);
	//   36   76:aload_0         
	//   37   77:getfield        #76  <Field SharedSQLiteStatement __preparedStmtOfResetWorkSpecRunAttemptCount>
	//   38   80:aload_3         
	//   39   81:invokevirtual   #244 <Method void SharedSQLiteStatement.release(SupportSQLiteStatement)>
		throw s;
	//   40   84:aload_1         
	//   41   85:athrow          
	}

	public void setOutput(String s, Data data)
	{
		SupportSQLiteStatement supportsqlitestatement;
		supportsqlitestatement = __preparedStmtOfSetOutput.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field SharedSQLiteStatement __preparedStmtOfSetOutput>
	//    2    4:invokevirtual   #224 <Method SupportSQLiteStatement SharedSQLiteStatement.acquire()>
	//    3    7:astore_3        
		__db.beginTransaction();
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field RoomDatabase __db>
	//    6   12:invokevirtual   #227 <Method void RoomDatabase.beginTransaction()>
		data = ((Data) (Data.toByteArray(data)));
	//    7   15:aload_2         
	//    8   16:invokestatic    #544 <Method byte[] Data.toByteArray(Data)>
	//    9   19:astore_2        
		if(data != null)
			break MISSING_BLOCK_LABEL_34;
	//   10   20:aload_2         
	//   11   21:ifnonnull       34
		supportsqlitestatement.bindNull(1);
	//   12   24:aload_3         
	//   13   25:iconst_1        
	//   14   26:invokeinterface #230 <Method void SupportSQLiteStatement.bindNull(int)>
		break MISSING_BLOCK_LABEL_42;
	//   15   31:goto            42
		supportsqlitestatement.bindBlob(1, ((byte []) (data)));
	//   16   34:aload_3         
	//   17   35:iconst_1        
	//   18   36:aload_2         
	//   19   37:invokeinterface #548 <Method void SupportSQLiteStatement.bindBlob(int, byte[])>
		if(s != null)
			break MISSING_BLOCK_LABEL_56;
	//   20   42:aload_1         
	//   21   43:ifnonnull       56
		supportsqlitestatement.bindNull(2);
	//   22   46:aload_3         
	//   23   47:iconst_2        
	//   24   48:invokeinterface #230 <Method void SupportSQLiteStatement.bindNull(int)>
		break MISSING_BLOCK_LABEL_64;
	//   25   53:goto            64
		supportsqlitestatement.bindString(2, s);
	//   26   56:aload_3         
	//   27   57:iconst_2        
	//   28   58:aload_1         
	//   29   59:invokeinterface #231 <Method void SupportSQLiteStatement.bindString(int, String)>
		supportsqlitestatement.executeUpdateDelete();
	//   30   64:aload_3         
	//   31   65:invokeinterface #234 <Method int SupportSQLiteStatement.executeUpdateDelete()>
	//   32   70:pop             
		__db.setTransactionSuccessful();
	//   33   71:aload_0         
	//   34   72:getfield        #56  <Field RoomDatabase __db>
	//   35   75:invokevirtual   #237 <Method void RoomDatabase.setTransactionSuccessful()>
		__db.endTransaction();
	//   36   78:aload_0         
	//   37   79:getfield        #56  <Field RoomDatabase __db>
	//   38   82:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		__preparedStmtOfSetOutput.release(supportsqlitestatement);
	//   39   85:aload_0         
	//   40   86:getfield        #67  <Field SharedSQLiteStatement __preparedStmtOfSetOutput>
	//   41   89:aload_3         
	//   42   90:invokevirtual   #244 <Method void SharedSQLiteStatement.release(SupportSQLiteStatement)>
		return;
	//   43   93:return          
		s;
	//   44   94:astore_1        
		__db.endTransaction();
	//   45   95:aload_0         
	//   46   96:getfield        #56  <Field RoomDatabase __db>
	//   47   99:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		__preparedStmtOfSetOutput.release(supportsqlitestatement);
	//   48  102:aload_0         
	//   49  103:getfield        #67  <Field SharedSQLiteStatement __preparedStmtOfSetOutput>
	//   50  106:aload_3         
	//   51  107:invokevirtual   #244 <Method void SharedSQLiteStatement.release(SupportSQLiteStatement)>
		throw s;
	//   52  110:aload_1         
	//   53  111:athrow          
	}

	public void setPeriodStartTime(String s, long l)
	{
		SupportSQLiteStatement supportsqlitestatement;
		supportsqlitestatement = __preparedStmtOfSetPeriodStartTime.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field SharedSQLiteStatement __preparedStmtOfSetPeriodStartTime>
	//    2    4:invokevirtual   #224 <Method SupportSQLiteStatement SharedSQLiteStatement.acquire()>
	//    3    7:astore          4
		__db.beginTransaction();
	//    4    9:aload_0         
	//    5   10:getfield        #56  <Field RoomDatabase __db>
	//    6   13:invokevirtual   #227 <Method void RoomDatabase.beginTransaction()>
		supportsqlitestatement.bindLong(1, l);
	//    7   16:aload           4
	//    8   18:iconst_1        
	//    9   19:lload_2         
	//   10   20:invokeinterface #535 <Method void SupportSQLiteStatement.bindLong(int, long)>
		if(s != null)
			break MISSING_BLOCK_LABEL_40;
	//   11   25:aload_1         
	//   12   26:ifnonnull       40
		supportsqlitestatement.bindNull(2);
	//   13   29:aload           4
	//   14   31:iconst_2        
	//   15   32:invokeinterface #230 <Method void SupportSQLiteStatement.bindNull(int)>
		break MISSING_BLOCK_LABEL_49;
	//   16   37:goto            49
		supportsqlitestatement.bindString(2, s);
	//   17   40:aload           4
	//   18   42:iconst_2        
	//   19   43:aload_1         
	//   20   44:invokeinterface #231 <Method void SupportSQLiteStatement.bindString(int, String)>
		supportsqlitestatement.executeUpdateDelete();
	//   21   49:aload           4
	//   22   51:invokeinterface #234 <Method int SupportSQLiteStatement.executeUpdateDelete()>
	//   23   56:pop             
		__db.setTransactionSuccessful();
	//   24   57:aload_0         
	//   25   58:getfield        #56  <Field RoomDatabase __db>
	//   26   61:invokevirtual   #237 <Method void RoomDatabase.setTransactionSuccessful()>
		__db.endTransaction();
	//   27   64:aload_0         
	//   28   65:getfield        #56  <Field RoomDatabase __db>
	//   29   68:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		__preparedStmtOfSetPeriodStartTime.release(supportsqlitestatement);
	//   30   71:aload_0         
	//   31   72:getfield        #70  <Field SharedSQLiteStatement __preparedStmtOfSetPeriodStartTime>
	//   32   75:aload           4
	//   33   77:invokevirtual   #244 <Method void SharedSQLiteStatement.release(SupportSQLiteStatement)>
		return;
	//   34   80:return          
		s;
	//   35   81:astore_1        
		__db.endTransaction();
	//   36   82:aload_0         
	//   37   83:getfield        #56  <Field RoomDatabase __db>
	//   38   86:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		__preparedStmtOfSetPeriodStartTime.release(supportsqlitestatement);
	//   39   89:aload_0         
	//   40   90:getfield        #70  <Field SharedSQLiteStatement __preparedStmtOfSetPeriodStartTime>
	//   41   93:aload           4
	//   42   95:invokevirtual   #244 <Method void SharedSQLiteStatement.release(SupportSQLiteStatement)>
		throw s;
	//   43   98:aload_1         
	//   44   99:athrow          
	}

	public transient int setState(androidx.work.WorkInfo.State state, String as[])
	{
		Object obj;
		obj = ((Object) (StringUtil.newStringBuilder()));
	//    0    0:invokestatic    #126 <Method StringBuilder StringUtil.newStringBuilder()>
	//    1    3:astore          6
		((StringBuilder) (obj)).append("UPDATE workspec SET state=");
	//    2    5:aload           6
	//    3    7:ldc2            #554 <String "UPDATE workspec SET state=">
	//    4   10:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:pop             
		((StringBuilder) (obj)).append("?");
	//    6   14:aload           6
	//    7   16:ldc2            #556 <String "?">
	//    8   19:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:pop             
		((StringBuilder) (obj)).append(" WHERE id IN (");
	//   10   23:aload           6
	//   11   25:ldc2            #558 <String " WHERE id IN (">
	//   12   28:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   13   31:pop             
		StringUtil.appendPlaceholders(((StringBuilder) (obj)), as.length);
	//   14   32:aload           6
	//   15   34:aload_2         
	//   16   35:arraylength     
	//   17   36:invokestatic    #139 <Method void StringUtil.appendPlaceholders(StringBuilder, int)>
		((StringBuilder) (obj)).append(")");
	//   18   39:aload           6
	//   19   41:ldc1            #141 <String ")">
	//   20   43:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   21   46:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   22   47:aload           6
	//   23   49:invokevirtual   #145 <Method String StringBuilder.toString()>
	//   24   52:astore          6
		obj = ((Object) (__db.compileStatement(((String) (obj)))));
	//   25   54:aload_0         
	//   26   55:getfield        #56  <Field RoomDatabase __db>
	//   27   58:aload           6
	//   28   60:invokevirtual   #562 <Method SupportSQLiteStatement RoomDatabase.compileStatement(String)>
	//   29   63:astore          6
		((SupportSQLiteStatement) (obj)).bindLong(1, WorkTypeConverters.stateToInt(state));
	//   30   65:aload           6
	//   31   67:iconst_1        
	//   32   68:aload_1         
	//   33   69:invokestatic    #566 <Method int WorkTypeConverters.stateToInt(androidx.work.WorkInfo$State)>
	//   34   72:i2l             
	//   35   73:invokeinterface #535 <Method void SupportSQLiteStatement.bindLong(int, long)>
		int l = as.length;
	//   36   78:aload_2         
	//   37   79:arraylength     
	//   38   80:istore          5
		int k = 2;
	//   39   82:iconst_2        
	//   40   83:istore          4
		for(int i = 0; i < l; i++)
	//*  41   85:iconst_0        
	//*  42   86:istore_3        
	//*  43   87:iload_3         
	//*  44   88:iload           5
	//*  45   90:icmpge          136
		{
			state = ((androidx.work.WorkInfo.State) (as[i]));
	//   46   93:aload_2         
	//   47   94:iload_3         
	//   48   95:aaload          
	//   49   96:astore_1        
			if(state == null)
	//*  50   97:aload_1         
	//*  51   98:ifnonnull       113
				((SupportSQLiteStatement) (obj)).bindNull(k);
	//   52  101:aload           6
	//   53  103:iload           4
	//   54  105:invokeinterface #230 <Method void SupportSQLiteStatement.bindNull(int)>
			else
	//*  55  110:goto            123
				((SupportSQLiteStatement) (obj)).bindString(k, ((String) (state)));
	//   56  113:aload           6
	//   57  115:iload           4
	//   58  117:aload_1         
	//   59  118:invokeinterface #231 <Method void SupportSQLiteStatement.bindString(int, String)>
			k++;
	//   60  123:iload           4
	//   61  125:iconst_1        
	//   62  126:iadd            
	//   63  127:istore          4
		}

	//   64  129:iload_3         
	//   65  130:iconst_1        
	//   66  131:iadd            
	//   67  132:istore_3        
	//*  68  133:goto            87
		__db.beginTransaction();
	//   69  136:aload_0         
	//   70  137:getfield        #56  <Field RoomDatabase __db>
	//   71  140:invokevirtual   #227 <Method void RoomDatabase.beginTransaction()>
		int j;
		j = ((SupportSQLiteStatement) (obj)).executeUpdateDelete();
	//   72  143:aload           6
	//   73  145:invokeinterface #234 <Method int SupportSQLiteStatement.executeUpdateDelete()>
	//   74  150:istore_3        
		__db.setTransactionSuccessful();
	//   75  151:aload_0         
	//   76  152:getfield        #56  <Field RoomDatabase __db>
	//   77  155:invokevirtual   #237 <Method void RoomDatabase.setTransactionSuccessful()>
		__db.endTransaction();
	//   78  158:aload_0         
	//   79  159:getfield        #56  <Field RoomDatabase __db>
	//   80  162:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		return j;
	//   81  165:iload_3         
	//   82  166:ireturn         
		state;
	//   83  167:astore_1        
		__db.endTransaction();
	//   84  168:aload_0         
	//   85  169:getfield        #56  <Field RoomDatabase __db>
	//   86  172:invokevirtual   #240 <Method void RoomDatabase.endTransaction()>
		throw state;
	//   87  175:aload_1         
	//   88  176:athrow          
	}

	private final RoomDatabase __db;
	private final EntityInsertionAdapter __insertionAdapterOfWorkSpec;
	private final SharedSQLiteStatement __preparedStmtOfDelete;
	private final SharedSQLiteStatement __preparedStmtOfIncrementWorkSpecRunAttemptCount;
	private final SharedSQLiteStatement __preparedStmtOfMarkWorkSpecScheduled;
	private final SharedSQLiteStatement __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast;
	private final SharedSQLiteStatement __preparedStmtOfResetScheduledState;
	private final SharedSQLiteStatement __preparedStmtOfResetWorkSpecRunAttemptCount;
	private final SharedSQLiteStatement __preparedStmtOfSetOutput;
	private final SharedSQLiteStatement __preparedStmtOfSetPeriodStartTime;


/*
	static RoomDatabase access$000(WorkSpecDao_Impl workspecdao_impl)
	{
		return workspecdao_impl.__db;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field RoomDatabase __db>
	//    2    4:areturn         
	}

*/


/*
	static void access$100(WorkSpecDao_Impl workspecdao_impl, ArrayMap arraymap)
	{
		workspecdao_impl.__fetchRelationshipWorkTagAsjavaLangString(arraymap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #120 <Method void __fetchRelationshipWorkTagAsjavaLangString(ArrayMap)>
		return;
	//    3    5:return          
	}

*/
}
