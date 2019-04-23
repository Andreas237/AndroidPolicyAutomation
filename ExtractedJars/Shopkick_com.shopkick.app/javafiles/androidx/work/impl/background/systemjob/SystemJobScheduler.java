// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.*;
import androidx.work.impl.model.*;
import androidx.work.impl.utils.IdGenerator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package androidx.work.impl.background.systemjob:
//			SystemJobInfoConverter

public class SystemJobScheduler
	implements Scheduler
{

	public SystemJobScheduler(Context context, WorkManagerImpl workmanagerimpl)
	{
		this(context, workmanagerimpl, (JobScheduler)context.getSystemService("jobscheduler"), new SystemJobInfoConverter(context));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:ldc1            #40  <String "jobscheduler">
	//    5    6:invokevirtual   #46  <Method Object Context.getSystemService(String)>
	//    6    9:checkcast       #48  <Class JobScheduler>
	//    7   12:new             #50  <Class SystemJobInfoConverter>
	//    8   15:dup             
	//    9   16:aload_1         
	//   10   17:invokespecial   #53  <Method void SystemJobInfoConverter(Context)>
	//   11   20:invokespecial   #56  <Method void SystemJobScheduler(Context, WorkManagerImpl, JobScheduler, SystemJobInfoConverter)>
	//   12   23:return          
	}

	public SystemJobScheduler(Context context, WorkManagerImpl workmanagerimpl, JobScheduler jobscheduler, SystemJobInfoConverter systemjobinfoconverter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void Object()>
		mWorkManager = workmanagerimpl;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #62  <Field WorkManagerImpl mWorkManager>
		mJobScheduler = jobscheduler;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #64  <Field JobScheduler mJobScheduler>
		mIdGenerator = new IdGenerator(context);
	//    8   14:aload_0         
	//    9   15:new             #66  <Class IdGenerator>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:invokespecial   #67  <Method void IdGenerator(Context)>
	//   13   23:putfield        #69  <Field IdGenerator mIdGenerator>
		mSystemJobInfoConverter = systemjobinfoconverter;
	//   14   26:aload_0         
	//   15   27:aload           4
	//   16   29:putfield        #71  <Field SystemJobInfoConverter mSystemJobInfoConverter>
	//   17   32:return          
	}

	public static void jobSchedulerCancelAll(Context context)
	{
		context = ((Context) ((JobScheduler)context.getSystemService("jobscheduler")));
	//    0    0:aload_0         
	//    1    1:ldc1            #40  <String "jobscheduler">
	//    2    3:invokevirtual   #46  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #48  <Class JobScheduler>
	//    4    9:astore_0        
		if(context != null)
	//*   5   10:aload_0         
	//*   6   11:ifnull          72
		{
			Object obj = ((Object) (((JobScheduler) (context)).getAllPendingJobs()));
	//    7   14:aload_0         
	//    8   15:invokevirtual   #77  <Method List JobScheduler.getAllPendingJobs()>
	//    9   18:astore_1        
			if(obj != null)
	//*  10   19:aload_1         
	//*  11   20:ifnull          72
			{
				obj = ((Object) (((List) (obj)).iterator()));
	//   12   23:aload_1         
	//   13   24:invokeinterface #83  <Method Iterator List.iterator()>
	//   14   29:astore_1        
				do
				{
					if(!((Iterator) (obj)).hasNext())
						break;
	//   15   30:aload_1         
	//   16   31:invokeinterface #89  <Method boolean Iterator.hasNext()>
	//   17   36:ifeq            72
					JobInfo jobinfo = (JobInfo)((Iterator) (obj)).next();
	//   18   39:aload_1         
	//   19   40:invokeinterface #93  <Method Object Iterator.next()>
	//   20   45:checkcast       #95  <Class JobInfo>
	//   21   48:astore_2        
					if(jobinfo.getExtras().containsKey("EXTRA_WORK_SPEC_ID"))
	//*  22   49:aload_2         
	//*  23   50:invokevirtual   #99  <Method PersistableBundle JobInfo.getExtras()>
	//*  24   53:ldc1            #101 <String "EXTRA_WORK_SPEC_ID">
	//*  25   55:invokevirtual   #107 <Method boolean PersistableBundle.containsKey(String)>
	//*  26   58:ifeq            30
						((JobScheduler) (context)).cancel(jobinfo.getId());
	//   27   61:aload_0         
	//   28   62:aload_2         
	//   29   63:invokevirtual   #111 <Method int JobInfo.getId()>
	//   30   66:invokevirtual   #115 <Method void JobScheduler.cancel(int)>
				} while(true);
	//   31   69:goto            30
			}
		}
	//   32   72:return          
	}

	public void cancel(String s)
	{
label0:
		{
			Object obj = ((Object) (mJobScheduler.getAllPendingJobs()));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field JobScheduler mJobScheduler>
	//    2    4:invokevirtual   #77  <Method List JobScheduler.getAllPendingJobs()>
	//    3    7:astore_2        
			if(obj == null)
				break label0;
	//    4    8:aload_2         
	//    5    9:ifnull          90
			obj = ((Object) (((List) (obj)).iterator()));
	//    6   12:aload_2         
	//    7   13:invokeinterface #83  <Method Iterator List.iterator()>
	//    8   18:astore_2        
			do
			{
				JobInfo jobinfo;
				do
				{
					if(!((Iterator) (obj)).hasNext())
						break label0;
	//    9   19:aload_2         
	//   10   20:invokeinterface #89  <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            90
					jobinfo = (JobInfo)((Iterator) (obj)).next();
	//   12   28:aload_2         
	//   13   29:invokeinterface #93  <Method Object Iterator.next()>
	//   14   34:checkcast       #95  <Class JobInfo>
	//   15   37:astore_3        
				} while(!s.equals(((Object) (jobinfo.getExtras().getString("EXTRA_WORK_SPEC_ID")))));
	//   16   38:aload_1         
	//   17   39:aload_3         
	//   18   40:invokevirtual   #99  <Method PersistableBundle JobInfo.getExtras()>
	//   19   43:ldc1            #101 <String "EXTRA_WORK_SPEC_ID">
	//   20   45:invokevirtual   #119 <Method String PersistableBundle.getString(String)>
	//   21   48:invokevirtual   #125 <Method boolean String.equals(Object)>
	//   22   51:ifeq            19
				mWorkManager.getWorkDatabase().systemIdInfoDao().removeSystemIdInfo(s);
	//   23   54:aload_0         
	//   24   55:getfield        #62  <Field WorkManagerImpl mWorkManager>
	//   25   58:invokevirtual   #131 <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//   26   61:invokevirtual   #137 <Method SystemIdInfoDao WorkDatabase.systemIdInfoDao()>
	//   27   64:aload_1         
	//   28   65:invokeinterface #142 <Method void SystemIdInfoDao.removeSystemIdInfo(String)>
				mJobScheduler.cancel(jobinfo.getId());
	//   29   70:aload_0         
	//   30   71:getfield        #64  <Field JobScheduler mJobScheduler>
	//   31   74:aload_3         
	//   32   75:invokevirtual   #111 <Method int JobInfo.getId()>
	//   33   78:invokevirtual   #115 <Method void JobScheduler.cancel(int)>
			} while(android.os.Build.VERSION.SDK_INT == 23);
	//   34   81:getstatic       #148 <Field int android.os.Build$VERSION.SDK_INT>
	//   35   84:bipush          23
	//   36   86:icmpeq          19
			return;
	//   37   89:return          
		}
	//   38   90:return          
	}

	public transient void schedule(WorkSpec aworkspec[])
	{
		int i;
		int k;
		WorkDatabase workdatabase;
		workdatabase = mWorkManager.getWorkDatabase();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field WorkManagerImpl mWorkManager>
	//    2    4:invokevirtual   #131 <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//    3    7:astore          5
		k = aworkspec.length;
	//    4    9:aload_1         
	//    5   10:arraylength     
	//    6   11:istore          4
		i = 0;
	//    7   13:iconst_0        
	//    8   14:istore_2        
_L3:
		WorkSpec workspec;
		if(i >= k)
			break; /* Loop/switch isn't completed */
	//    9   15:iload_2         
	//   10   16:iload           4
	//   11   18:icmpge          368
		workspec = aworkspec[i];
	//   12   21:aload_1         
	//   13   22:iload_2         
	//   14   23:aaload          
	//   15   24:astore          6
		workdatabase.beginTransaction();
	//   16   26:aload           5
	//   17   28:invokevirtual   #153 <Method void WorkDatabase.beginTransaction()>
		Object obj = ((Object) (workdatabase.workSpecDao().getWorkSpec(workspec.id)));
	//   18   31:aload           5
	//   19   33:invokevirtual   #157 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//   20   36:aload           6
	//   21   38:getfield        #162 <Field String WorkSpec.id>
	//   22   41:invokeinterface #168 <Method WorkSpec WorkSpecDao.getWorkSpec(String)>
	//   23   46:astore          7
		if(obj != null)
			break MISSING_BLOCK_LABEL_123;
	//   24   48:aload           7
	//   25   50:ifnonnull       123
		obj = ((Object) (Logger.get()));
	//   26   53:invokestatic    #172 <Method Logger Logger.get()>
	//   27   56:astore          7
		String s = TAG;
	//   28   58:getstatic       #34  <Field String TAG>
	//   29   61:astore          8
		StringBuilder stringbuilder = new StringBuilder();
	//   30   63:new             #174 <Class StringBuilder>
	//   31   66:dup             
	//   32   67:invokespecial   #175 <Method void StringBuilder()>
	//   33   70:astore          9
		stringbuilder.append("Skipping scheduling ");
	//   34   72:aload           9
	//   35   74:ldc1            #177 <String "Skipping scheduling ">
	//   36   76:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   37   79:pop             
		stringbuilder.append(workspec.id);
	//   38   80:aload           9
	//   39   82:aload           6
	//   40   84:getfield        #162 <Field String WorkSpec.id>
	//   41   87:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   42   90:pop             
		stringbuilder.append(" because it's no longer in the DB");
	//   43   91:aload           9
	//   44   93:ldc1            #183 <String " because it's no longer in the DB">
	//   45   95:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   46   98:pop             
		((Logger) (obj)).warning(s, stringbuilder.toString(), new Throwable[0]);
	//   47   99:aload           7
	//   48  101:aload           8
	//   49  103:aload           9
	//   50  105:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   51  108:iconst_0        
	//   52  109:anewarray       Throwable[]
	//   53  112:invokevirtual   #193 <Method void Logger.warning(String, String, Throwable[])>
_L1:
		workdatabase.endTransaction();
	//   54  115:aload           5
	//   55  117:invokevirtual   #196 <Method void WorkDatabase.endTransaction()>
		break MISSING_BLOCK_LABEL_353;
	//   56  120:goto            353
label0:
		{
			if(((WorkSpec) (obj)).state == androidx.work.WorkInfo.State.ENQUEUED)
				break label0;
	//   57  123:aload           7
	//   58  125:getfield        #200 <Field androidx.work.WorkInfo$State WorkSpec.state>
	//   59  128:getstatic       #205 <Field androidx.work.WorkInfo$State androidx.work.WorkInfo$State.ENQUEUED>
	//   60  131:if_acmpeq       199
			obj = ((Object) (Logger.get()));
	//   61  134:invokestatic    #172 <Method Logger Logger.get()>
	//   62  137:astore          7
			String s1 = TAG;
	//   63  139:getstatic       #34  <Field String TAG>
	//   64  142:astore          8
			StringBuilder stringbuilder1 = new StringBuilder();
	//   65  144:new             #174 <Class StringBuilder>
	//   66  147:dup             
	//   67  148:invokespecial   #175 <Method void StringBuilder()>
	//   68  151:astore          9
			stringbuilder1.append("Skipping scheduling ");
	//   69  153:aload           9
	//   70  155:ldc1            #177 <String "Skipping scheduling ">
	//   71  157:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   72  160:pop             
			stringbuilder1.append(workspec.id);
	//   73  161:aload           9
	//   74  163:aload           6
	//   75  165:getfield        #162 <Field String WorkSpec.id>
	//   76  168:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   77  171:pop             
			stringbuilder1.append(" because it is no longer enqueued");
	//   78  172:aload           9
	//   79  174:ldc1            #207 <String " because it is no longer enqueued">
	//   80  176:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   81  179:pop             
			((Logger) (obj)).warning(s1, stringbuilder1.toString(), new Throwable[0]);
	//   82  180:aload           7
	//   83  182:aload           8
	//   84  184:aload           9
	//   85  186:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   86  189:iconst_0        
	//   87  190:anewarray       Throwable[]
	//   88  193:invokevirtual   #193 <Method void Logger.warning(String, String, Throwable[])>
		}
		  goto _L1
	//*  89  196:goto            115
		obj = ((Object) (workdatabase.systemIdInfoDao().getSystemIdInfo(workspec.id)));
	//   90  199:aload           5
	//   91  201:invokevirtual   #137 <Method SystemIdInfoDao WorkDatabase.systemIdInfoDao()>
	//   92  204:aload           6
	//   93  206:getfield        #162 <Field String WorkSpec.id>
	//   94  209:invokeinterface #211 <Method SystemIdInfo SystemIdInfoDao.getSystemIdInfo(String)>
	//   95  214:astore          7
		if(obj == null)
			break MISSING_BLOCK_LABEL_230;
	//   96  216:aload           7
	//   97  218:ifnull          230
		int j;
		j = ((SystemIdInfo) (obj)).systemId;
	//   98  221:aload           7
	//   99  223:getfield        #216 <Field int SystemIdInfo.systemId>
	//  100  226:istore_3        
		break MISSING_BLOCK_LABEL_258;
	//  101  227:goto            258
		j = mIdGenerator.nextJobSchedulerIdWithRange(mWorkManager.getConfiguration().getMinJobSchedulerId(), mWorkManager.getConfiguration().getMaxJobSchedulerId());
	//  102  230:aload_0         
	//  103  231:getfield        #69  <Field IdGenerator mIdGenerator>
	//  104  234:aload_0         
	//  105  235:getfield        #62  <Field WorkManagerImpl mWorkManager>
	//  106  238:invokevirtual   #220 <Method Configuration WorkManagerImpl.getConfiguration()>
	//  107  241:invokevirtual   #225 <Method int Configuration.getMinJobSchedulerId()>
	//  108  244:aload_0         
	//  109  245:getfield        #62  <Field WorkManagerImpl mWorkManager>
	//  110  248:invokevirtual   #220 <Method Configuration WorkManagerImpl.getConfiguration()>
	//  111  251:invokevirtual   #228 <Method int Configuration.getMaxJobSchedulerId()>
	//  112  254:invokevirtual   #232 <Method int IdGenerator.nextJobSchedulerIdWithRange(int, int)>
	//  113  257:istore_3        
		if(obj != null)
			break MISSING_BLOCK_LABEL_295;
	//  114  258:aload           7
	//  115  260:ifnonnull       295
		SystemIdInfo systemidinfo = new SystemIdInfo(workspec.id, j);
	//  116  263:new             #213 <Class SystemIdInfo>
	//  117  266:dup             
	//  118  267:aload           6
	//  119  269:getfield        #162 <Field String WorkSpec.id>
	//  120  272:iload_3         
	//  121  273:invokespecial   #235 <Method void SystemIdInfo(String, int)>
	//  122  276:astore          7
		mWorkManager.getWorkDatabase().systemIdInfoDao().insertSystemIdInfo(systemidinfo);
	//  123  278:aload_0         
	//  124  279:getfield        #62  <Field WorkManagerImpl mWorkManager>
	//  125  282:invokevirtual   #131 <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//  126  285:invokevirtual   #137 <Method SystemIdInfoDao WorkDatabase.systemIdInfoDao()>
	//  127  288:aload           7
	//  128  290:invokeinterface #239 <Method void SystemIdInfoDao.insertSystemIdInfo(SystemIdInfo)>
		scheduleInternal(workspec, j);
	//  129  295:aload_0         
	//  130  296:aload           6
	//  131  298:iload_3         
	//  132  299:invokevirtual   #243 <Method void scheduleInternal(WorkSpec, int)>
		if(android.os.Build.VERSION.SDK_INT == 23)
	//* 133  302:getstatic       #148 <Field int android.os.Build$VERSION.SDK_INT>
	//* 134  305:bipush          23
	//* 135  307:icmpne          343
			scheduleInternal(workspec, mIdGenerator.nextJobSchedulerIdWithRange(mWorkManager.getConfiguration().getMinJobSchedulerId(), mWorkManager.getConfiguration().getMaxJobSchedulerId()));
	//  136  310:aload_0         
	//  137  311:aload           6
	//  138  313:aload_0         
	//  139  314:getfield        #69  <Field IdGenerator mIdGenerator>
	//  140  317:aload_0         
	//  141  318:getfield        #62  <Field WorkManagerImpl mWorkManager>
	//  142  321:invokevirtual   #220 <Method Configuration WorkManagerImpl.getConfiguration()>
	//  143  324:invokevirtual   #225 <Method int Configuration.getMinJobSchedulerId()>
	//  144  327:aload_0         
	//  145  328:getfield        #62  <Field WorkManagerImpl mWorkManager>
	//  146  331:invokevirtual   #220 <Method Configuration WorkManagerImpl.getConfiguration()>
	//  147  334:invokevirtual   #228 <Method int Configuration.getMaxJobSchedulerId()>
	//  148  337:invokevirtual   #232 <Method int IdGenerator.nextJobSchedulerIdWithRange(int, int)>
	//  149  340:invokevirtual   #243 <Method void scheduleInternal(WorkSpec, int)>
		workdatabase.setTransactionSuccessful();
	//  150  343:aload           5
	//  151  345:invokevirtual   #246 <Method void WorkDatabase.setTransactionSuccessful()>
		workdatabase.endTransaction();
	//  152  348:aload           5
	//  153  350:invokevirtual   #196 <Method void WorkDatabase.endTransaction()>
		i++;
	//  154  353:iload_2         
	//  155  354:iconst_1        
	//  156  355:iadd            
	//  157  356:istore_2        
		if(true) goto _L3; else goto _L2
	//  158  357:goto            15
		aworkspec;
	//  159  360:astore_1        
		workdatabase.endTransaction();
	//  160  361:aload           5
	//  161  363:invokevirtual   #196 <Method void WorkDatabase.endTransaction()>
		throw aworkspec;
	//  162  366:aload_1         
	//  163  367:athrow          
_L2:
	//  164  368:return          
	}

	public void scheduleInternal(WorkSpec workspec, int i)
	{
		JobInfo jobinfo = mSystemJobInfoConverter.convert(workspec, i);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field SystemJobInfoConverter mSystemJobInfoConverter>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #250 <Method JobInfo SystemJobInfoConverter.convert(WorkSpec, int)>
	//    5    9:astore_3        
		Logger.get().debug(TAG, String.format("Scheduling work ID %s Job ID %s", new Object[] {
			workspec.id, Integer.valueOf(i)
		}), new Throwable[0]);
	//    6   10:invokestatic    #172 <Method Logger Logger.get()>
	//    7   13:getstatic       #34  <Field String TAG>
	//    8   16:ldc1            #252 <String "Scheduling work ID %s Job ID %s">
	//    9   18:iconst_2        
	//   10   19:anewarray       Object[]
	//   11   22:dup             
	//   12   23:iconst_0        
	//   13   24:aload_1         
	//   14   25:getfield        #162 <Field String WorkSpec.id>
	//   15   28:aastore         
	//   16   29:dup             
	//   17   30:iconst_1        
	//   18   31:iload_2         
	//   19   32:invokestatic    #258 <Method Integer Integer.valueOf(int)>
	//   20   35:aastore         
	//   21   36:invokestatic    #262 <Method String String.format(String, Object[])>
	//   22   39:iconst_0        
	//   23   40:anewarray       Throwable[]
	//   24   43:invokevirtual   #265 <Method void Logger.debug(String, String, Throwable[])>
		mJobScheduler.schedule(jobinfo);
	//   25   46:aload_0         
	//   26   47:getfield        #64  <Field JobScheduler mJobScheduler>
	//   27   50:aload_3         
	//   28   51:invokevirtual   #268 <Method int JobScheduler.schedule(JobInfo)>
	//   29   54:pop             
	//   30   55:return          
	}

	private static final String TAG = Logger.tagWithPrefix("SystemJobScheduler");
	private final IdGenerator mIdGenerator;
	private final JobScheduler mJobScheduler;
	private final SystemJobInfoConverter mSystemJobInfoConverter;
	private final WorkManagerImpl mWorkManager;

	static 
	{
	//    0    0:ldc1            #26  <String "SystemJobScheduler">
	//    1    2:invokestatic    #32  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #34  <Field String TAG>
	//*   3    8:return          
	}
}
