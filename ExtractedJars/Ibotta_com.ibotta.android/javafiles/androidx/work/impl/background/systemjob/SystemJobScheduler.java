// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.*;
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
	//    4    4:ldc1            #25  <String "jobscheduler">
	//    5    6:invokevirtual   #31  <Method Object Context.getSystemService(String)>
	//    6    9:checkcast       #33  <Class JobScheduler>
	//    7   12:new             #35  <Class SystemJobInfoConverter>
	//    8   15:dup             
	//    9   16:aload_1         
	//   10   17:invokespecial   #38  <Method void SystemJobInfoConverter(Context)>
	//   11   20:invokespecial   #41  <Method void SystemJobScheduler(Context, WorkManagerImpl, JobScheduler, SystemJobInfoConverter)>
	//   12   23:return          
	}

	public SystemJobScheduler(Context context, WorkManagerImpl workmanagerimpl, JobScheduler jobscheduler, SystemJobInfoConverter systemjobinfoconverter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		mWorkManager = workmanagerimpl;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #49  <Field WorkManagerImpl mWorkManager>
		mJobScheduler = jobscheduler;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #51  <Field JobScheduler mJobScheduler>
		mIdGenerator = new IdGenerator(context);
	//    8   14:aload_0         
	//    9   15:new             #53  <Class IdGenerator>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:invokespecial   #54  <Method void IdGenerator(Context)>
	//   13   23:putfield        #56  <Field IdGenerator mIdGenerator>
		mSystemJobInfoConverter = systemjobinfoconverter;
	//   14   26:aload_0         
	//   15   27:aload           4
	//   16   29:putfield        #58  <Field SystemJobInfoConverter mSystemJobInfoConverter>
	//   17   32:return          
	}

	public static void jobSchedulerCancelAll(Context context)
	{
		context = ((Context) ((JobScheduler)context.getSystemService("jobscheduler")));
	//    0    0:aload_0         
	//    1    1:ldc1            #25  <String "jobscheduler">
	//    2    3:invokevirtual   #31  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #33  <Class JobScheduler>
	//    4    9:astore_0        
		if(context != null)
	//*   5   10:aload_0         
	//*   6   11:ifnull          72
		{
			Object obj = ((Object) (((JobScheduler) (context)).getAllPendingJobs()));
	//    7   14:aload_0         
	//    8   15:invokevirtual   #64  <Method List JobScheduler.getAllPendingJobs()>
	//    9   18:astore_1        
			if(obj != null)
	//*  10   19:aload_1         
	//*  11   20:ifnull          72
			{
				obj = ((Object) (((List) (obj)).iterator()));
	//   12   23:aload_1         
	//   13   24:invokeinterface #70  <Method Iterator List.iterator()>
	//   14   29:astore_1        
				do
				{
					if(!((Iterator) (obj)).hasNext())
						break;
	//   15   30:aload_1         
	//   16   31:invokeinterface #76  <Method boolean Iterator.hasNext()>
	//   17   36:ifeq            72
					JobInfo jobinfo = (JobInfo)((Iterator) (obj)).next();
	//   18   39:aload_1         
	//   19   40:invokeinterface #80  <Method Object Iterator.next()>
	//   20   45:checkcast       #82  <Class JobInfo>
	//   21   48:astore_2        
					if(jobinfo.getExtras().containsKey("EXTRA_WORK_SPEC_ID"))
	//*  22   49:aload_2         
	//*  23   50:invokevirtual   #86  <Method PersistableBundle JobInfo.getExtras()>
	//*  24   53:ldc1            #88  <String "EXTRA_WORK_SPEC_ID">
	//*  25   55:invokevirtual   #94  <Method boolean PersistableBundle.containsKey(String)>
	//*  26   58:ifeq            30
						((JobScheduler) (context)).cancel(jobinfo.getId());
	//   27   61:aload_0         
	//   28   62:aload_2         
	//   29   63:invokevirtual   #98  <Method int JobInfo.getId()>
	//   30   66:invokevirtual   #102 <Method void JobScheduler.cancel(int)>
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
	//    1    1:getfield        #51  <Field JobScheduler mJobScheduler>
	//    2    4:invokevirtual   #64  <Method List JobScheduler.getAllPendingJobs()>
	//    3    7:astore_2        
			if(obj == null)
				break label0;
	//    4    8:aload_2         
	//    5    9:ifnull          90
			obj = ((Object) (((List) (obj)).iterator()));
	//    6   12:aload_2         
	//    7   13:invokeinterface #70  <Method Iterator List.iterator()>
	//    8   18:astore_2        
			do
			{
				JobInfo jobinfo;
				do
				{
					if(!((Iterator) (obj)).hasNext())
						break label0;
	//    9   19:aload_2         
	//   10   20:invokeinterface #76  <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            90
					jobinfo = (JobInfo)((Iterator) (obj)).next();
	//   12   28:aload_2         
	//   13   29:invokeinterface #80  <Method Object Iterator.next()>
	//   14   34:checkcast       #82  <Class JobInfo>
	//   15   37:astore_3        
				} while(!s.equals(((Object) (jobinfo.getExtras().getString("EXTRA_WORK_SPEC_ID")))));
	//   16   38:aload_1         
	//   17   39:aload_3         
	//   18   40:invokevirtual   #86  <Method PersistableBundle JobInfo.getExtras()>
	//   19   43:ldc1            #88  <String "EXTRA_WORK_SPEC_ID">
	//   20   45:invokevirtual   #107 <Method String PersistableBundle.getString(String)>
	//   21   48:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   22   51:ifeq            19
				mWorkManager.getWorkDatabase().systemIdInfoDao().removeSystemIdInfo(s);
	//   23   54:aload_0         
	//   24   55:getfield        #49  <Field WorkManagerImpl mWorkManager>
	//   25   58:invokevirtual   #119 <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//   26   61:invokevirtual   #125 <Method SystemIdInfoDao WorkDatabase.systemIdInfoDao()>
	//   27   64:aload_1         
	//   28   65:invokeinterface #130 <Method void SystemIdInfoDao.removeSystemIdInfo(String)>
				mJobScheduler.cancel(jobinfo.getId());
	//   29   70:aload_0         
	//   30   71:getfield        #51  <Field JobScheduler mJobScheduler>
	//   31   74:aload_3         
	//   32   75:invokevirtual   #98  <Method int JobInfo.getId()>
	//   33   78:invokevirtual   #102 <Method void JobScheduler.cancel(int)>
			} while(android.os.Build.VERSION.SDK_INT == 23);
	//   34   81:getstatic       #136 <Field int android.os.Build$VERSION.SDK_INT>
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
	//    1    1:getfield        #49  <Field WorkManagerImpl mWorkManager>
	//    2    4:invokevirtual   #119 <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
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
	//   11   18:icmpge          344
		workspec = aworkspec[i];
	//   12   21:aload_1         
	//   13   22:iload_2         
	//   14   23:aaload          
	//   15   24:astore          6
		workdatabase.beginTransaction();
	//   16   26:aload           5
	//   17   28:invokevirtual   #141 <Method void WorkDatabase.beginTransaction()>
		Object obj = ((Object) (workdatabase.workSpecDao().getWorkSpec(workspec.id)));
	//   18   31:aload           5
	//   19   33:invokevirtual   #145 <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//   20   36:aload           6
	//   21   38:getfield        #151 <Field String WorkSpec.id>
	//   22   41:invokeinterface #157 <Method WorkSpec WorkSpecDao.getWorkSpec(String)>
	//   23   46:astore          7
		if(obj != null)
			break MISSING_BLOCK_LABEL_111;
	//   24   48:aload           7
	//   25   50:ifnonnull       111
		obj = ((Object) (new StringBuilder()));
	//   26   53:new             #159 <Class StringBuilder>
	//   27   56:dup             
	//   28   57:invokespecial   #160 <Method void StringBuilder()>
	//   29   60:astore          7
		((StringBuilder) (obj)).append("Skipping scheduling ");
	//   30   62:aload           7
	//   31   64:ldc1            #162 <String "Skipping scheduling ">
	//   32   66:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   33   69:pop             
		((StringBuilder) (obj)).append(workspec.id);
	//   34   70:aload           7
	//   35   72:aload           6
	//   36   74:getfield        #151 <Field String WorkSpec.id>
	//   37   77:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   38   80:pop             
		((StringBuilder) (obj)).append(" because it's no longer in the DB");
	//   39   81:aload           7
	//   40   83:ldc1            #168 <String " because it's no longer in the DB">
	//   41   85:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   42   88:pop             
		Logger.warning("SystemJobScheduler", ((StringBuilder) (obj)).toString(), new Throwable[0]);
	//   43   89:ldc1            #170 <String "SystemJobScheduler">
	//   44   91:aload           7
	//   45   93:invokevirtual   #174 <Method String StringBuilder.toString()>
	//   46   96:iconst_0        
	//   47   97:anewarray       Throwable[]
	//   48  100:invokestatic    #182 <Method void Logger.warning(String, String, Throwable[])>
_L1:
		workdatabase.endTransaction();
	//   49  103:aload           5
	//   50  105:invokevirtual   #185 <Method void WorkDatabase.endTransaction()>
		break MISSING_BLOCK_LABEL_329;
	//   51  108:goto            329
label0:
		{
			if(((WorkSpec) (obj)).state == State.ENQUEUED)
				break label0;
	//   52  111:aload           7
	//   53  113:getfield        #189 <Field State WorkSpec.state>
	//   54  116:getstatic       #194 <Field State State.ENQUEUED>
	//   55  119:if_acmpeq       175
			obj = ((Object) (new StringBuilder()));
	//   56  122:new             #159 <Class StringBuilder>
	//   57  125:dup             
	//   58  126:invokespecial   #160 <Method void StringBuilder()>
	//   59  129:astore          7
			((StringBuilder) (obj)).append("Skipping scheduling ");
	//   60  131:aload           7
	//   61  133:ldc1            #162 <String "Skipping scheduling ">
	//   62  135:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   63  138:pop             
			((StringBuilder) (obj)).append(workspec.id);
	//   64  139:aload           7
	//   65  141:aload           6
	//   66  143:getfield        #151 <Field String WorkSpec.id>
	//   67  146:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   68  149:pop             
			((StringBuilder) (obj)).append(" because it is no longer enqueued");
	//   69  150:aload           7
	//   70  152:ldc1            #196 <String " because it is no longer enqueued">
	//   71  154:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   72  157:pop             
			Logger.warning("SystemJobScheduler", ((StringBuilder) (obj)).toString(), new Throwable[0]);
	//   73  158:ldc1            #170 <String "SystemJobScheduler">
	//   74  160:aload           7
	//   75  162:invokevirtual   #174 <Method String StringBuilder.toString()>
	//   76  165:iconst_0        
	//   77  166:anewarray       Throwable[]
	//   78  169:invokestatic    #182 <Method void Logger.warning(String, String, Throwable[])>
		}
		  goto _L1
	//*  79  172:goto            103
		obj = ((Object) (workdatabase.systemIdInfoDao().getSystemIdInfo(workspec.id)));
	//   80  175:aload           5
	//   81  177:invokevirtual   #125 <Method SystemIdInfoDao WorkDatabase.systemIdInfoDao()>
	//   82  180:aload           6
	//   83  182:getfield        #151 <Field String WorkSpec.id>
	//   84  185:invokeinterface #200 <Method SystemIdInfo SystemIdInfoDao.getSystemIdInfo(String)>
	//   85  190:astore          7
		if(obj == null)
			break MISSING_BLOCK_LABEL_206;
	//   86  192:aload           7
	//   87  194:ifnull          206
		int j;
		j = ((SystemIdInfo) (obj)).systemId;
	//   88  197:aload           7
	//   89  199:getfield        #205 <Field int SystemIdInfo.systemId>
	//   90  202:istore_3        
		break MISSING_BLOCK_LABEL_234;
	//   91  203:goto            234
		j = mIdGenerator.nextJobSchedulerIdWithRange(mWorkManager.getConfiguration().getMinJobSchedulerID(), mWorkManager.getConfiguration().getMaxJobSchedulerID());
	//   92  206:aload_0         
	//   93  207:getfield        #56  <Field IdGenerator mIdGenerator>
	//   94  210:aload_0         
	//   95  211:getfield        #49  <Field WorkManagerImpl mWorkManager>
	//   96  214:invokevirtual   #209 <Method Configuration WorkManagerImpl.getConfiguration()>
	//   97  217:invokevirtual   #214 <Method int Configuration.getMinJobSchedulerID()>
	//   98  220:aload_0         
	//   99  221:getfield        #49  <Field WorkManagerImpl mWorkManager>
	//  100  224:invokevirtual   #209 <Method Configuration WorkManagerImpl.getConfiguration()>
	//  101  227:invokevirtual   #217 <Method int Configuration.getMaxJobSchedulerID()>
	//  102  230:invokevirtual   #221 <Method int IdGenerator.nextJobSchedulerIdWithRange(int, int)>
	//  103  233:istore_3        
		if(obj != null)
			break MISSING_BLOCK_LABEL_271;
	//  104  234:aload           7
	//  105  236:ifnonnull       271
		SystemIdInfo systemidinfo = new SystemIdInfo(workspec.id, j);
	//  106  239:new             #202 <Class SystemIdInfo>
	//  107  242:dup             
	//  108  243:aload           6
	//  109  245:getfield        #151 <Field String WorkSpec.id>
	//  110  248:iload_3         
	//  111  249:invokespecial   #224 <Method void SystemIdInfo(String, int)>
	//  112  252:astore          7
		mWorkManager.getWorkDatabase().systemIdInfoDao().insertSystemIdInfo(systemidinfo);
	//  113  254:aload_0         
	//  114  255:getfield        #49  <Field WorkManagerImpl mWorkManager>
	//  115  258:invokevirtual   #119 <Method WorkDatabase WorkManagerImpl.getWorkDatabase()>
	//  116  261:invokevirtual   #125 <Method SystemIdInfoDao WorkDatabase.systemIdInfoDao()>
	//  117  264:aload           7
	//  118  266:invokeinterface #228 <Method void SystemIdInfoDao.insertSystemIdInfo(SystemIdInfo)>
		scheduleInternal(workspec, j);
	//  119  271:aload_0         
	//  120  272:aload           6
	//  121  274:iload_3         
	//  122  275:invokevirtual   #232 <Method void scheduleInternal(WorkSpec, int)>
		if(android.os.Build.VERSION.SDK_INT == 23)
	//* 123  278:getstatic       #136 <Field int android.os.Build$VERSION.SDK_INT>
	//* 124  281:bipush          23
	//* 125  283:icmpne          319
			scheduleInternal(workspec, mIdGenerator.nextJobSchedulerIdWithRange(mWorkManager.getConfiguration().getMinJobSchedulerID(), mWorkManager.getConfiguration().getMaxJobSchedulerID()));
	//  126  286:aload_0         
	//  127  287:aload           6
	//  128  289:aload_0         
	//  129  290:getfield        #56  <Field IdGenerator mIdGenerator>
	//  130  293:aload_0         
	//  131  294:getfield        #49  <Field WorkManagerImpl mWorkManager>
	//  132  297:invokevirtual   #209 <Method Configuration WorkManagerImpl.getConfiguration()>
	//  133  300:invokevirtual   #214 <Method int Configuration.getMinJobSchedulerID()>
	//  134  303:aload_0         
	//  135  304:getfield        #49  <Field WorkManagerImpl mWorkManager>
	//  136  307:invokevirtual   #209 <Method Configuration WorkManagerImpl.getConfiguration()>
	//  137  310:invokevirtual   #217 <Method int Configuration.getMaxJobSchedulerID()>
	//  138  313:invokevirtual   #221 <Method int IdGenerator.nextJobSchedulerIdWithRange(int, int)>
	//  139  316:invokevirtual   #232 <Method void scheduleInternal(WorkSpec, int)>
		workdatabase.setTransactionSuccessful();
	//  140  319:aload           5
	//  141  321:invokevirtual   #235 <Method void WorkDatabase.setTransactionSuccessful()>
		workdatabase.endTransaction();
	//  142  324:aload           5
	//  143  326:invokevirtual   #185 <Method void WorkDatabase.endTransaction()>
		i++;
	//  144  329:iload_2         
	//  145  330:iconst_1        
	//  146  331:iadd            
	//  147  332:istore_2        
		if(true) goto _L3; else goto _L2
	//  148  333:goto            15
		aworkspec;
	//  149  336:astore_1        
		workdatabase.endTransaction();
	//  150  337:aload           5
	//  151  339:invokevirtual   #185 <Method void WorkDatabase.endTransaction()>
		throw aworkspec;
	//  152  342:aload_1         
	//  153  343:athrow          
_L2:
	//  154  344:return          
	}

	public void scheduleInternal(WorkSpec workspec, int i)
	{
		JobInfo jobinfo = mSystemJobInfoConverter.convert(workspec, i);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field SystemJobInfoConverter mSystemJobInfoConverter>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #239 <Method JobInfo SystemJobInfoConverter.convert(WorkSpec, int)>
	//    5    9:astore_3        
		Logger.debug("SystemJobScheduler", String.format("Scheduling work ID %s Job ID %s", new Object[] {
			workspec.id, Integer.valueOf(i)
		}), new Throwable[0]);
	//    6   10:ldc1            #170 <String "SystemJobScheduler">
	//    7   12:ldc1            #241 <String "Scheduling work ID %s Job ID %s">
	//    8   14:iconst_2        
	//    9   15:anewarray       Object[]
	//   10   18:dup             
	//   11   19:iconst_0        
	//   12   20:aload_1         
	//   13   21:getfield        #151 <Field String WorkSpec.id>
	//   14   24:aastore         
	//   15   25:dup             
	//   16   26:iconst_1        
	//   17   27:iload_2         
	//   18   28:invokestatic    #247 <Method Integer Integer.valueOf(int)>
	//   19   31:aastore         
	//   20   32:invokestatic    #251 <Method String String.format(String, Object[])>
	//   21   35:iconst_0        
	//   22   36:anewarray       Throwable[]
	//   23   39:invokestatic    #254 <Method void Logger.debug(String, String, Throwable[])>
		mJobScheduler.schedule(jobinfo);
	//   24   42:aload_0         
	//   25   43:getfield        #51  <Field JobScheduler mJobScheduler>
	//   26   46:aload_3         
	//   27   47:invokevirtual   #257 <Method int JobScheduler.schedule(JobInfo)>
	//   28   50:pop             
	//   29   51:return          
	}

	private final IdGenerator mIdGenerator;
	private final JobScheduler mJobScheduler;
	private final SystemJobInfoConverter mSystemJobInfoConverter;
	private final WorkManagerImpl mWorkManager;
}
