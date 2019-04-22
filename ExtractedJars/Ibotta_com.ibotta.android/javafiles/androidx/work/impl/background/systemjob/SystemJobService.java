// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.Logger;
import androidx.work.impl.*;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService
	implements ExecutionListener
{

	public SystemJobService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void JobService()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void HashMap()>
	//    6   12:putfield        #26  <Field Map mJobParameters>
	//    7   15:return          
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void JobService.onCreate()>
		mWorkManagerImpl = WorkManagerImpl.getInstance();
	//    2    4:aload_0         
	//    3    5:invokestatic    #36  <Method WorkManagerImpl WorkManagerImpl.getInstance()>
	//    4    8:putfield        #38  <Field WorkManagerImpl mWorkManagerImpl>
		WorkManagerImpl workmanagerimpl = mWorkManagerImpl;
	//    5   11:aload_0         
	//    6   12:getfield        #38  <Field WorkManagerImpl mWorkManagerImpl>
	//    7   15:astore_1        
		if(workmanagerimpl == null)
	//*   8   16:aload_1         
	//*   9   17:ifnonnull       57
		{
			if(((Object) (android/app/Application)).equals(((Object) (((Object) (getApplication())).getClass()))))
	//*  10   20:ldc1            #40  <Class Application>
	//*  11   22:aload_0         
	//*  12   23:invokevirtual   #44  <Method Application getApplication()>
	//*  13   26:invokevirtual   #50  <Method Class Object.getClass()>
	//*  14   29:invokevirtual   #54  <Method boolean Object.equals(Object)>
	//*  15   32:ifeq            47
			{
				Logger.warning("SystemJobService", "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
	//   16   35:ldc1            #56  <String "SystemJobService">
	//   17   37:ldc1            #58  <String "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.">
	//   18   39:iconst_0        
	//   19   40:anewarray       Throwable[]
	//   20   43:invokestatic    #66  <Method void Logger.warning(String, String, Throwable[])>
				return;
	//   21   46:return          
			} else
			{
				throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
	//   22   47:new             #68  <Class IllegalStateException>
	//   23   50:dup             
	//   24   51:ldc1            #70  <String "WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().">
	//   25   53:invokespecial   #73  <Method void IllegalStateException(String)>
	//   26   56:athrow          
			}
		} else
		{
			workmanagerimpl.getProcessor().addExecutionListener(((ExecutionListener) (this)));
	//   27   57:aload_1         
	//   28   58:invokevirtual   #77  <Method Processor WorkManagerImpl.getProcessor()>
	//   29   61:aload_0         
	//   30   62:invokevirtual   #83  <Method void Processor.addExecutionListener(ExecutionListener)>
			return;
	//   31   65:return          
		}
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method void JobService.onDestroy()>
		WorkManagerImpl workmanagerimpl = mWorkManagerImpl;
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field WorkManagerImpl mWorkManagerImpl>
	//    4    8:astore_1        
		if(workmanagerimpl != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          21
			workmanagerimpl.getProcessor().removeExecutionListener(((ExecutionListener) (this)));
	//    7   13:aload_1         
	//    8   14:invokevirtual   #77  <Method Processor WorkManagerImpl.getProcessor()>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #89  <Method void Processor.removeExecutionListener(ExecutionListener)>
	//   11   21:return          
	}

	public void onExecuted(String s, boolean flag)
	{
		Logger.debug("SystemJobService", String.format("%s executed on JobScheduler", new Object[] {
			s
		}), new Throwable[0]);
	//    0    0:ldc1            #56  <String "SystemJobService">
	//    1    2:ldc1            #94  <String "%s executed on JobScheduler">
	//    2    4:iconst_1        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:aastore         
	//    8   12:invokestatic    #100 <Method String String.format(String, Object[])>
	//    9   15:iconst_0        
	//   10   16:anewarray       Throwable[]
	//   11   19:invokestatic    #103 <Method void Logger.debug(String, String, Throwable[])>
		synchronized(mJobParameters)
	//*  12   22:aload_0         
	//*  13   23:getfield        #26  <Field Map mJobParameters>
	//*  14   26:astore_3        
	//*  15   27:aload_3         
	//*  16   28:monitorenter    
		{
			s = ((String) ((JobParameters)mJobParameters.remove(((Object) (s)))));
	//   17   29:aload_0         
	//   18   30:getfield        #26  <Field Map mJobParameters>
	//   19   33:aload_1         
	//   20   34:invokeinterface #109 <Method Object Map.remove(Object)>
	//   21   39:checkcast       #111 <Class JobParameters>
	//   22   42:astore_1        
		}
	//   23   43:aload_3         
	//   24   44:monitorexit     
		if(s != null)
	//*  25   45:aload_1         
	//*  26   46:ifnull          55
			jobFinished(((JobParameters) (s)), flag);
	//   27   49:aload_0         
	//   28   50:aload_1         
	//   29   51:iload_2         
	//   30   52:invokevirtual   #115 <Method void jobFinished(JobParameters, boolean)>
		return;
	//   31   55:return          
		s;
	//   32   56:astore_1        
		map;
	//   33   57:aload_3         
		JVM INSTR monitorexit ;
	//   34   58:monitorexit     
		throw s;
	//   35   59:aload_1         
	//   36   60:athrow          
	}

	public boolean onStartJob(JobParameters jobparameters)
	{
		String s;
label0:
		{
			if(mWorkManagerImpl == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field WorkManagerImpl mWorkManagerImpl>
	//*   2    4:ifnonnull       26
			{
				Logger.debug("SystemJobService", "WorkManager is not initialized; requesting retry.", new Throwable[0]);
	//    3    7:ldc1            #56  <String "SystemJobService">
	//    4    9:ldc1            #120 <String "WorkManager is not initialized; requesting retry.">
	//    5   11:iconst_0        
	//    6   12:anewarray       Throwable[]
	//    7   15:invokestatic    #103 <Method void Logger.debug(String, String, Throwable[])>
				jobFinished(jobparameters, true);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #115 <Method void jobFinished(JobParameters, boolean)>
				return false;
	//   12   24:iconst_0        
	//   13   25:ireturn         
			}
			s = jobparameters.getExtras().getString("EXTRA_WORK_SPEC_ID");
	//   14   26:aload_1         
	//   15   27:invokevirtual   #124 <Method PersistableBundle JobParameters.getExtras()>
	//   16   30:ldc1            #126 <String "EXTRA_WORK_SPEC_ID">
	//   17   32:invokevirtual   #132 <Method String PersistableBundle.getString(String)>
	//   18   35:astore          4
			if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  19   37:aload           4
	//*  20   39:invokestatic    #138 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  21   42:ifeq            58
			{
				Logger.error("SystemJobService", "WorkSpec id not found!", new Throwable[0]);
	//   22   45:ldc1            #56  <String "SystemJobService">
	//   23   47:ldc1            #140 <String "WorkSpec id not found!">
	//   24   49:iconst_0        
	//   25   50:anewarray       Throwable[]
	//   26   53:invokestatic    #143 <Method void Logger.error(String, String, Throwable[])>
				return false;
	//   27   56:iconst_0        
	//   28   57:ireturn         
			}
			synchronized(mJobParameters)
	//*  29   58:aload_0         
	//*  30   59:getfield        #26  <Field Map mJobParameters>
	//*  31   62:astore_2        
	//*  32   63:aload_2         
	//*  33   64:monitorenter    
			{
				if(!mJobParameters.containsKey(((Object) (s))))
					break label0;
	//   34   65:aload_0         
	//   35   66:getfield        #26  <Field Map mJobParameters>
	//   36   69:aload           4
	//   37   71:invokeinterface #146 <Method boolean Map.containsKey(Object)>
	//   38   76:ifeq            106
				Logger.debug("SystemJobService", String.format("Job is already being executed by SystemJobService: %s", new Object[] {
					s
				}), new Throwable[0]);
	//   39   79:ldc1            #56  <String "SystemJobService">
	//   40   81:ldc1            #148 <String "Job is already being executed by SystemJobService: %s">
	//   41   83:iconst_1        
	//   42   84:anewarray       Object[]
	//   43   87:dup             
	//   44   88:iconst_0        
	//   45   89:aload           4
	//   46   91:aastore         
	//   47   92:invokestatic    #100 <Method String String.format(String, Object[])>
	//   48   95:iconst_0        
	//   49   96:anewarray       Throwable[]
	//   50   99:invokestatic    #103 <Method void Logger.debug(String, String, Throwable[])>
			}
	//   51  102:aload_2         
	//   52  103:monitorexit     
			return false;
	//   53  104:iconst_0        
	//   54  105:ireturn         
		}
		Logger.debug("SystemJobService", String.format("onStartJob for %s", new Object[] {
			s
		}), new Throwable[0]);
	//   55  106:ldc1            #56  <String "SystemJobService">
	//   56  108:ldc1            #150 <String "onStartJob for %s">
	//   57  110:iconst_1        
	//   58  111:anewarray       Object[]
	//   59  114:dup             
	//   60  115:iconst_0        
	//   61  116:aload           4
	//   62  118:aastore         
	//   63  119:invokestatic    #100 <Method String String.format(String, Object[])>
	//   64  122:iconst_0        
	//   65  123:anewarray       Throwable[]
	//   66  126:invokestatic    #103 <Method void Logger.debug(String, String, Throwable[])>
		mJobParameters.put(((Object) (s)), ((Object) (jobparameters)));
	//   67  129:aload_0         
	//   68  130:getfield        #26  <Field Map mJobParameters>
	//   69  133:aload           4
	//   70  135:aload_1         
	//   71  136:invokeinterface #154 <Method Object Map.put(Object, Object)>
	//   72  141:pop             
		obj;
	//   73  142:aload_2         
		JVM INSTR monitorexit ;
	//   74  143:monitorexit     
		obj = null;
	//   75  144:aconst_null     
	//   76  145:astore_2        
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  77  146:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*  78  149:bipush          24
	//*  79  151:icmplt          212
		{
			androidx.work.WorkerParameters.RuntimeExtras runtimeextras = new androidx.work.WorkerParameters.RuntimeExtras();
	//   80  154:new             #162 <Class androidx.work.WorkerParameters$RuntimeExtras>
	//   81  157:dup             
	//   82  158:invokespecial   #163 <Method void androidx.work.WorkerParameters$RuntimeExtras()>
	//   83  161:astore_3        
			if(jobparameters.getTriggeredContentUris() != null || jobparameters.getTriggeredContentAuthorities() != null)
	//*  84  162:aload_1         
	//*  85  163:invokevirtual   #167 <Method android.net.Uri[] JobParameters.getTriggeredContentUris()>
	//*  86  166:ifnonnull       176
	//*  87  169:aload_1         
	//*  88  170:invokevirtual   #171 <Method String[] JobParameters.getTriggeredContentAuthorities()>
	//*  89  173:ifnull          192
			{
				runtimeextras.triggeredContentUris = jobparameters.getTriggeredContentUris();
	//   90  176:aload_3         
	//   91  177:aload_1         
	//   92  178:invokevirtual   #167 <Method android.net.Uri[] JobParameters.getTriggeredContentUris()>
	//   93  181:putfield        #175 <Field android.net.Uri[] androidx.work.WorkerParameters$RuntimeExtras.triggeredContentUris>
				runtimeextras.triggeredContentAuthorities = jobparameters.getTriggeredContentAuthorities();
	//   94  184:aload_3         
	//   95  185:aload_1         
	//   96  186:invokevirtual   #171 <Method String[] JobParameters.getTriggeredContentAuthorities()>
	//   97  189:putfield        #179 <Field String[] androidx.work.WorkerParameters$RuntimeExtras.triggeredContentAuthorities>
			}
			obj = ((Object) (runtimeextras));
	//   98  192:aload_3         
	//   99  193:astore_2        
			if(android.os.Build.VERSION.SDK_INT >= 28)
	//* 100  194:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//* 101  197:bipush          28
	//* 102  199:icmplt          212
			{
				runtimeextras.network = jobparameters.getNetwork();
	//  103  202:aload_3         
	//  104  203:aload_1         
	//  105  204:invokevirtual   #183 <Method android.net.Network JobParameters.getNetwork()>
	//  106  207:putfield        #187 <Field android.net.Network androidx.work.WorkerParameters$RuntimeExtras.network>
				obj = ((Object) (runtimeextras));
	//  107  210:aload_3         
	//  108  211:astore_2        
			}
		}
		mWorkManagerImpl.startWork(s, ((androidx.work.WorkerParameters.RuntimeExtras) (obj)));
	//  109  212:aload_0         
	//  110  213:getfield        #38  <Field WorkManagerImpl mWorkManagerImpl>
	//  111  216:aload           4
	//  112  218:aload_2         
	//  113  219:invokevirtual   #191 <Method void WorkManagerImpl.startWork(String, androidx.work.WorkerParameters$RuntimeExtras)>
		return true;
	//  114  222:iconst_1        
	//  115  223:ireturn         
		jobparameters;
	//  116  224:astore_1        
		obj;
	//  117  225:aload_2         
		JVM INSTR monitorexit ;
	//  118  226:monitorexit     
		throw jobparameters;
	//  119  227:aload_1         
	//  120  228:athrow          
	}

	public boolean onStopJob(JobParameters jobparameters)
	{
		if(mWorkManagerImpl == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field WorkManagerImpl mWorkManagerImpl>
	//*   2    4:ifnonnull       20
		{
			Logger.debug("SystemJobService", "WorkManager is not initialized; requesting retry.", new Throwable[0]);
	//    3    7:ldc1            #56  <String "SystemJobService">
	//    4    9:ldc1            #120 <String "WorkManager is not initialized; requesting retry.">
	//    5   11:iconst_0        
	//    6   12:anewarray       Throwable[]
	//    7   15:invokestatic    #103 <Method void Logger.debug(String, String, Throwable[])>
			return true;
	//    8   18:iconst_1        
	//    9   19:ireturn         
		}
		String s = jobparameters.getExtras().getString("EXTRA_WORK_SPEC_ID");
	//   10   20:aload_1         
	//   11   21:invokevirtual   #124 <Method PersistableBundle JobParameters.getExtras()>
	//   12   24:ldc1            #126 <String "EXTRA_WORK_SPEC_ID">
	//   13   26:invokevirtual   #132 <Method String PersistableBundle.getString(String)>
	//   14   29:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  15   30:aload_2         
	//*  16   31:invokestatic    #138 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   34:ifeq            50
		{
			Logger.error("SystemJobService", "WorkSpec id not found!", new Throwable[0]);
	//   18   37:ldc1            #56  <String "SystemJobService">
	//   19   39:ldc1            #140 <String "WorkSpec id not found!">
	//   20   41:iconst_0        
	//   21   42:anewarray       Throwable[]
	//   22   45:invokestatic    #143 <Method void Logger.error(String, String, Throwable[])>
			return false;
	//   23   48:iconst_0        
	//   24   49:ireturn         
		}
		Logger.debug("SystemJobService", String.format("onStopJob for %s", new Object[] {
			s
		}), new Throwable[0]);
	//   25   50:ldc1            #56  <String "SystemJobService">
	//   26   52:ldc1            #194 <String "onStopJob for %s">
	//   27   54:iconst_1        
	//   28   55:anewarray       Object[]
	//   29   58:dup             
	//   30   59:iconst_0        
	//   31   60:aload_2         
	//   32   61:aastore         
	//   33   62:invokestatic    #100 <Method String String.format(String, Object[])>
	//   34   65:iconst_0        
	//   35   66:anewarray       Throwable[]
	//   36   69:invokestatic    #103 <Method void Logger.debug(String, String, Throwable[])>
		synchronized(mJobParameters)
	//*  37   72:aload_0         
	//*  38   73:getfield        #26  <Field Map mJobParameters>
	//*  39   76:astore_1        
	//*  40   77:aload_1         
	//*  41   78:monitorenter    
		{
			mJobParameters.remove(((Object) (s)));
	//   42   79:aload_0         
	//   43   80:getfield        #26  <Field Map mJobParameters>
	//   44   83:aload_2         
	//   45   84:invokeinterface #109 <Method Object Map.remove(Object)>
	//   46   89:pop             
		}
	//   47   90:aload_1         
	//   48   91:monitorexit     
		mWorkManagerImpl.stopWork(s);
	//   49   92:aload_0         
	//   50   93:getfield        #38  <Field WorkManagerImpl mWorkManagerImpl>
	//   51   96:aload_2         
	//   52   97:invokevirtual   #197 <Method void WorkManagerImpl.stopWork(String)>
		return mWorkManagerImpl.getProcessor().isCancelled(s) ^ true;
	//   53  100:aload_0         
	//   54  101:getfield        #38  <Field WorkManagerImpl mWorkManagerImpl>
	//   55  104:invokevirtual   #77  <Method Processor WorkManagerImpl.getProcessor()>
	//   56  107:aload_2         
	//   57  108:invokevirtual   #201 <Method boolean Processor.isCancelled(String)>
	//   58  111:iconst_1        
	//   59  112:ixor            
	//   60  113:ireturn         
		exception;
	//   61  114:astore_2        
		jobparameters;
	//   62  115:aload_1         
		JVM INSTR monitorexit ;
	//   63  116:monitorexit     
		throw exception;
	//   64  117:aload_2         
	//   65  118:athrow          
	}

	private final Map mJobParameters = new HashMap();
	private WorkManagerImpl mWorkManagerImpl;
}
