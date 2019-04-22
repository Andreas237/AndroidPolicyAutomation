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
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package androidx.work.impl:
//			WorkDatabase, Scheduler, WorkManagerImpl

public class Schedulers
{

	static Scheduler createBestAvailableBackgroundScheduler(Context context, WorkManagerImpl workmanagerimpl)
	{
		int i;
		boolean flag1;
		i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_2        
		flag1 = false;
	//    2    4:iconst_0        
	//    3    5:istore          4
		if(i < 23) goto _L2; else goto _L1
	//    4    7:iload_2         
	//    5    8:bipush          23
	//    6   10:icmplt          46
_L1:
		boolean flag;
		workmanagerimpl = ((WorkManagerImpl) (new SystemJobScheduler(context, workmanagerimpl)));
	//    7   13:new             #25  <Class SystemJobScheduler>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokespecial   #29  <Method void SystemJobScheduler(Context, WorkManagerImpl)>
	//   12   22:astore_1        
		PackageManagerHelper.setComponentEnabled(context, androidx/work/impl/background/systemjob/SystemJobService, true);
	//   13   23:aload_0         
	//   14   24:ldc1            #31  <Class SystemJobService>
	//   15   26:iconst_1        
	//   16   27:invokestatic    #37  <Method void PackageManagerHelper.setComponentEnabled(Context, Class, boolean)>
		Logger.debug("Schedulers", "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
	//   17   30:ldc1            #39  <String "Schedulers">
	//   18   32:ldc1            #41  <String "Created SystemJobScheduler and enabled SystemJobService">
	//   19   34:iconst_0        
	//   20   35:anewarray       Throwable[]
	//   21   38:invokestatic    #49  <Method void Logger.debug(String, String, Throwable[])>
		flag = false;
	//   22   41:iconst_0        
	//   23   42:istore_3        
		  goto _L3
	//*  24   43:goto            97
_L2:
		workmanagerimpl = ((WorkManagerImpl) (tryCreateFirebaseJobScheduler(context)));
	//   25   46:aload_0         
	//   26   47:invokestatic    #53  <Method Scheduler tryCreateFirebaseJobScheduler(Context)>
	//   27   50:astore_1        
		Logger.debug("Schedulers", "Created FirebaseJobScheduler", new Throwable[0]);
	//   28   51:ldc1            #39  <String "Schedulers">
	//   29   53:ldc1            #55  <String "Created FirebaseJobScheduler">
	//   30   55:iconst_0        
	//   31   56:anewarray       Throwable[]
	//   32   59:invokestatic    #49  <Method void Logger.debug(String, String, Throwable[])>
		flag = true;
	//   33   62:iconst_1        
	//   34   63:istore_3        
		  goto _L3
	//*  35   64:goto            97
_L8:
		flag = true;
	//   36   67:iconst_1        
	//   37   68:istore_3        
		  goto _L4
	//*  38   69:goto            74
_L6:
		flag = false;
	//   39   72:iconst_0        
	//   40   73:istore_3        
_L4:
		workmanagerimpl = ((WorkManagerImpl) (new SystemAlarmScheduler(context)));
	//   41   74:new             #57  <Class SystemAlarmScheduler>
	//   42   77:dup             
	//   43   78:aload_0         
	//   44   79:invokespecial   #60  <Method void SystemAlarmScheduler(Context)>
	//   45   82:astore_1        
		Logger.debug("Schedulers", "Created SystemAlarmScheduler", new Throwable[0]);
	//   46   83:ldc1            #39  <String "Schedulers">
	//   47   85:ldc1            #62  <String "Created SystemAlarmScheduler">
	//   48   87:iconst_0        
	//   49   88:anewarray       Throwable[]
	//   50   91:invokestatic    #49  <Method void Logger.debug(String, String, Throwable[])>
		flag1 = true;
	//   51   94:iconst_1        
	//   52   95:istore          4
_L3:
		try
		{
			PackageManagerHelper.setComponentEnabled(context, Class.forName("androidx.work.impl.background.firebase.FirebaseJobService"), flag);
	//   53   97:aload_0         
	//   54   98:ldc1            #64  <String "androidx.work.impl.background.firebase.FirebaseJobService">
	//   55  100:invokestatic    #70  <Method Class Class.forName(String)>
	//   56  103:iload_3         
	//   57  104:invokestatic    #37  <Method void PackageManagerHelper.setComponentEnabled(Context, Class, boolean)>
		}
	//*  58  107:aload_0         
	//*  59  108:ldc1            #72  <Class SystemAlarmService>
	//*  60  110:iload           4
	//*  61  112:invokestatic    #37  <Method void PackageManagerHelper.setComponentEnabled(Context, Class, boolean)>
	//*  62  115:aload_1         
	//*  63  116:areturn         
	//*  64  117:astore_1        
	//*  65  118:goto            72
	//*  66  121:astore_1        
	//*  67  122:goto            67
		catch(ClassNotFoundException classnotfoundexception) { }
	//   68  125:astore          5
		PackageManagerHelper.setComponentEnabled(context, androidx/work/impl/background/systemalarm/SystemAlarmService, flag1);
		return ((Scheduler) (workmanagerimpl));
		workmanagerimpl;
		if(true) goto _L6; else goto _L5
_L5:
		workmanagerimpl;
		if(true) goto _L8; else goto _L7
_L7:
	//*  69  127:goto            107
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
	//*   3    5:invokeinterface #83  <Method int List.size()>
	//*   4   10:ifne            14
			return;
	//    5   13:return          
		workspecdao = workdatabase.workSpecDao();
	//    6   14:aload_1         
	//    7   15:invokevirtual   #89  <Method WorkSpecDao WorkDatabase.workSpecDao()>
	//    8   18:astore          5
		workdatabase.beginTransaction();
	//    9   20:aload_1         
	//   10   21:invokevirtual   #93  <Method void WorkDatabase.beginTransaction()>
		configuration = ((Configuration) (workspecdao.getEligibleWorkForScheduling(configuration.getMaxSchedulerLimit())));
	//   11   24:aload           5
	//   12   26:aload_0         
	//   13   27:invokevirtual   #98  <Method int Configuration.getMaxSchedulerLimit()>
	//   14   30:invokeinterface #104 <Method List WorkSpecDao.getEligibleWorkForScheduling(int)>
	//   15   35:astore_0        
		if(configuration == null)
			break MISSING_BLOCK_LABEL_96;
	//   16   36:aload_0         
	//   17   37:ifnull          96
		if(((List) (configuration)).size() > 0)
	//*  18   40:aload_0         
	//*  19   41:invokeinterface #83  <Method int List.size()>
	//*  20   46:ifle            96
		{
			long l = System.currentTimeMillis();
	//   21   49:invokestatic    #110 <Method long System.currentTimeMillis()>
	//   22   52:lstore_3        
			for(Iterator iterator = ((List) (configuration)).iterator(); iterator.hasNext(); workspecdao.markWorkSpecScheduled(((WorkSpec)iterator.next()).id, l));
	//   23   53:aload_0         
	//   24   54:invokeinterface #114 <Method Iterator List.iterator()>
	//   25   59:astore          6
	//   26   61:aload           6
	//   27   63:invokeinterface #120 <Method boolean Iterator.hasNext()>
	//   28   68:ifeq            96
	//   29   71:aload           5
	//   30   73:aload           6
	//   31   75:invokeinterface #124 <Method Object Iterator.next()>
	//   32   80:checkcast       #126 <Class WorkSpec>
	//   33   83:getfield        #130 <Field String WorkSpec.id>
	//   34   86:lload_3         
	//   35   87:invokeinterface #134 <Method int WorkSpecDao.markWorkSpecScheduled(String, long)>
	//   36   92:pop             
		}
	//*  37   93:goto            61
		workdatabase.setTransactionSuccessful();
	//   38   96:aload_1         
	//   39   97:invokevirtual   #137 <Method void WorkDatabase.setTransactionSuccessful()>
		workdatabase.endTransaction();
	//   40  100:aload_1         
	//   41  101:invokevirtual   #140 <Method void WorkDatabase.endTransaction()>
		if(configuration != null && ((List) (configuration)).size() > 0)
	//*  42  104:aload_0         
	//*  43  105:ifnull          165
	//*  44  108:aload_0         
	//*  45  109:invokeinterface #83  <Method int List.size()>
	//*  46  114:ifle            165
		{
			configuration = ((Configuration) ((WorkSpec[])((List) (configuration)).toArray(((Object []) (new WorkSpec[0])))));
	//   47  117:aload_0         
	//   48  118:iconst_0        
	//   49  119:anewarray       WorkSpec[]
	//   50  122:invokeinterface #144 <Method Object[] List.toArray(Object[])>
	//   51  127:checkcast       #146 <Class WorkSpec[]>
	//   52  130:astore_0        
			for(workdatabase = ((WorkDatabase) (list.iterator())); ((Iterator) (workdatabase)).hasNext(); ((Scheduler)((Iterator) (workdatabase)).next()).schedule(((WorkSpec []) (configuration))));
	//   53  131:aload_2         
	//   54  132:invokeinterface #114 <Method Iterator List.iterator()>
	//   55  137:astore_1        
	//   56  138:aload_1         
	//   57  139:invokeinterface #120 <Method boolean Iterator.hasNext()>
	//   58  144:ifeq            165
	//   59  147:aload_1         
	//   60  148:invokeinterface #124 <Method Object Iterator.next()>
	//   61  153:checkcast       #148 <Class Scheduler>
	//   62  156:aload_0         
	//   63  157:invokeinterface #151 <Method void Scheduler.schedule(WorkSpec[])>
		}
	//*  64  162:goto            138
		return;
	//   65  165:return          
		configuration;
	//   66  166:astore_0        
		workdatabase.endTransaction();
	//   67  167:aload_1         
	//   68  168:invokevirtual   #140 <Method void WorkDatabase.endTransaction()>
		throw configuration;
	//   69  171:aload_0         
	//   70  172:athrow          
	//   71  173:return          
	}

	private static Scheduler tryCreateFirebaseJobScheduler(Context context)
		throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException
	{
		return (Scheduler)Class.forName("androidx.work.impl.background.firebase.FirebaseJobScheduler").getConstructor(new Class[] {
			android/content/Context
		}).newInstance(new Object[] {
			context
		});
	//    0    0:ldc1            #163 <String "androidx.work.impl.background.firebase.FirebaseJobScheduler">
	//    1    2:invokestatic    #70  <Method Class Class.forName(String)>
	//    2    5:iconst_1        
	//    3    6:anewarray       Class[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:ldc1            #165 <Class Context>
	//    7   13:aastore         
	//    8   14:invokevirtual   #169 <Method Constructor Class.getConstructor(Class[])>
	//    9   17:iconst_1        
	//   10   18:anewarray       Object[]
	//   11   21:dup             
	//   12   22:iconst_0        
	//   13   23:aload_0         
	//   14   24:aastore         
	//   15   25:invokevirtual   #175 <Method Object Constructor.newInstance(Object[])>
	//   16   28:checkcast       #148 <Class Scheduler>
	//   17   31:areturn         
	}
}
