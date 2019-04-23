// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.SystemAlarmScheduler;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.PackageManagerHelper;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package androidx.work.impl:
//			WorkDatabase, Scheduler, WorkManagerImpl

public class Schedulers
{

	private Schedulers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	static Scheduler createBestAvailableBackgroundScheduler(Context context, WorkManagerImpl workmanagerimpl)
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #37  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_2        
		boolean flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_3        
		if(i >= 23)
	//*   4    6:iload_2         
	//*   5    7:bipush          23
	//*   6    9:icmplt          49
		{
			workmanagerimpl = ((WorkManagerImpl) (new SystemJobScheduler(context, workmanagerimpl)));
	//    7   12:new             #39  <Class SystemJobScheduler>
	//    8   15:dup             
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:invokespecial   #42  <Method void SystemJobScheduler(Context, WorkManagerImpl)>
	//   12   21:astore_1        
			PackageManagerHelper.setComponentEnabled(context, androidx/work/impl/background/systemjob/SystemJobService, true);
	//   13   22:aload_0         
	//   14   23:ldc1            #44  <Class SystemJobService>
	//   15   25:iconst_1        
	//   16   26:invokestatic    #50  <Method void PackageManagerHelper.setComponentEnabled(Context, Class, boolean)>
			Logger.get().debug(TAG, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
	//   17   29:invokestatic    #54  <Method Logger Logger.get()>
	//   18   32:getstatic       #22  <Field String TAG>
	//   19   35:ldc1            #56  <String "Created SystemJobScheduler and enabled SystemJobService">
	//   20   37:iconst_0        
	//   21   38:anewarray       Throwable[]
	//   22   41:invokevirtual   #62  <Method void Logger.debug(String, String, Throwable[])>
			flag = false;
	//   23   44:iconst_0        
	//   24   45:istore_3        
		} else
	//*  25   46:goto            73
		{
			workmanagerimpl = ((WorkManagerImpl) (new SystemAlarmScheduler(context)));
	//   26   49:new             #64  <Class SystemAlarmScheduler>
	//   27   52:dup             
	//   28   53:aload_0         
	//   29   54:invokespecial   #67  <Method void SystemAlarmScheduler(Context)>
	//   30   57:astore_1        
			Logger.get().debug(TAG, "Created SystemAlarmScheduler", new Throwable[0]);
	//   31   58:invokestatic    #54  <Method Logger Logger.get()>
	//   32   61:getstatic       #22  <Field String TAG>
	//   33   64:ldc1            #69  <String "Created SystemAlarmScheduler">
	//   34   66:iconst_0        
	//   35   67:anewarray       Throwable[]
	//   36   70:invokevirtual   #62  <Method void Logger.debug(String, String, Throwable[])>
		}
		PackageManagerHelper.setComponentEnabled(context, androidx/work/impl/background/systemalarm/SystemAlarmService, flag);
	//   37   73:aload_0         
	//   38   74:ldc1            #71  <Class SystemAlarmService>
	//   39   76:iload_3         
	//   40   77:invokestatic    #50  <Method void PackageManagerHelper.setComponentEnabled(Context, Class, boolean)>
		return ((Scheduler) (workmanagerimpl));
	//   41   80:aload_1         
	//   42   81:areturn         
	}

	public static void schedule(Configuration configuration, WorkDatabase workdatabase, List list)
	{
		WorkSpecDao workspecdao;
		if(list == null)
			break MISSING_BLOCK_LABEL_173;
	//    0    0:aload_2         
	//    1    1:ifnull          173
		if(list.size() == 0)
	//*   2    4:aload_2         
	//*   3    5:invokeinterface #81  <Method int List.size()>
	//*   4   10:ifne            14
			return;
	//    5   13:return          
		workspecdao = workdatabase.workSpecDao();
	//    6   14:aload_1         
	//    7   15:invokevirtual   #87  <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//    8   18:astore          5
		workdatabase.beginTransaction();
	//    9   20:aload_1         
	//   10   21:invokevirtual   #90  <Method void WorkDatabase.beginTransaction()>
		configuration = ((Configuration) (workspecdao.getEligibleWorkForScheduling(configuration.getMaxSchedulerLimit())));
	//   11   24:aload           5
	//   12   26:aload_0         
	//   13   27:invokevirtual   #95  <Method int Configuration.getMaxSchedulerLimit()>
	//   14   30:invokeinterface #101 <Method List WorkSpecDao.getEligibleWorkForScheduling(int)>
	//   15   35:astore_0        
		if(configuration == null)
			break MISSING_BLOCK_LABEL_96;
	//   16   36:aload_0         
	//   17   37:ifnull          96
		if(((List) (configuration)).size() > 0)
	//*  18   40:aload_0         
	//*  19   41:invokeinterface #81  <Method int List.size()>
	//*  20   46:ifle            96
		{
			long l = System.currentTimeMillis();
	//   21   49:invokestatic    #107 <Method long System.currentTimeMillis()>
	//   22   52:lstore_3        
			for(Iterator iterator = ((List) (configuration)).iterator(); iterator.hasNext(); workspecdao.markWorkSpecScheduled(((WorkSpec)iterator.next()).id, l));
	//   23   53:aload_0         
	//   24   54:invokeinterface #111 <Method Iterator List.iterator()>
	//   25   59:astore          6
	//   26   61:aload           6
	//   27   63:invokeinterface #117 <Method boolean Iterator.hasNext()>
	//   28   68:ifeq            96
	//   29   71:aload           5
	//   30   73:aload           6
	//   31   75:invokeinterface #121 <Method Object Iterator.next()>
	//   32   80:checkcast       #123 <Class WorkSpec>
	//   33   83:getfield        #126 <Field String WorkSpec.id>
	//   34   86:lload_3         
	//   35   87:invokeinterface #130 <Method int WorkSpecDao.markWorkSpecScheduled(String, long)>
	//   36   92:pop             
		}
	//*  37   93:goto            61
		workdatabase.setTransactionSuccessful();
	//   38   96:aload_1         
	//   39   97:invokevirtual   #133 <Method void WorkDatabase.setTransactionSuccessful()>
		workdatabase.endTransaction();
	//   40  100:aload_1         
	//   41  101:invokevirtual   #136 <Method void WorkDatabase.endTransaction()>
		if(configuration != null && ((List) (configuration)).size() > 0)
	//*  42  104:aload_0         
	//*  43  105:ifnull          165
	//*  44  108:aload_0         
	//*  45  109:invokeinterface #81  <Method int List.size()>
	//*  46  114:ifle            165
		{
			configuration = ((Configuration) ((WorkSpec[])((List) (configuration)).toArray(((Object []) (new WorkSpec[0])))));
	//   47  117:aload_0         
	//   48  118:iconst_0        
	//   49  119:anewarray       WorkSpec[]
	//   50  122:invokeinterface #140 <Method Object[] List.toArray(Object[])>
	//   51  127:checkcast       #142 <Class WorkSpec[]>
	//   52  130:astore_0        
			for(workdatabase = ((WorkDatabase) (list.iterator())); ((Iterator) (workdatabase)).hasNext(); ((Scheduler)((Iterator) (workdatabase)).next()).schedule(((WorkSpec []) (configuration))));
	//   53  131:aload_2         
	//   54  132:invokeinterface #111 <Method Iterator List.iterator()>
	//   55  137:astore_1        
	//   56  138:aload_1         
	//   57  139:invokeinterface #117 <Method boolean Iterator.hasNext()>
	//   58  144:ifeq            165
	//   59  147:aload_1         
	//   60  148:invokeinterface #121 <Method Object Iterator.next()>
	//   61  153:checkcast       #144 <Class Scheduler>
	//   62  156:aload_0         
	//   63  157:invokeinterface #147 <Method void Scheduler.schedule(WorkSpec[])>
		}
	//*  64  162:goto            138
		return;
	//   65  165:return          
		configuration;
	//   66  166:astore_0        
		workdatabase.endTransaction();
	//   67  167:aload_1         
	//   68  168:invokevirtual   #136 <Method void WorkDatabase.endTransaction()>
		throw configuration;
	//   69  171:aload_0         
	//   70  172:athrow          
	//   71  173:return          
	}

	private static final String TAG = Logger.tagWithPrefix("Schedulers");

	static 
	{
	//    0    0:ldc1            #14  <String "Schedulers">
	//    1    2:invokestatic    #20  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #22  <Field String TAG>
	//*   3    8:return          
	}
}
