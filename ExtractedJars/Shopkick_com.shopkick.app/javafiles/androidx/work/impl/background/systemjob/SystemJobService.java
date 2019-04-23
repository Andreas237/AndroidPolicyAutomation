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
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.*;

public class SystemJobService extends JobService
	implements ExecutionListener
{

	public SystemJobService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void JobService()>
	//    2    4:aload_0         
	//    3    5:new             #39  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #40  <Method void HashMap()>
	//    6   12:putfield        #42  <Field Map mJobParameters>
	//    7   15:return          
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void JobService.onCreate()>
		mWorkManagerImpl = WorkManagerImpl.getInstance();
	//    2    4:aload_0         
	//    3    5:invokestatic    #51  <Method WorkManagerImpl WorkManagerImpl.getInstance()>
	//    4    8:putfield        #53  <Field WorkManagerImpl mWorkManagerImpl>
		WorkManagerImpl workmanagerimpl = mWorkManagerImpl;
	//    5   11:aload_0         
	//    6   12:getfield        #53  <Field WorkManagerImpl mWorkManagerImpl>
	//    7   15:astore_1        
		if(workmanagerimpl == null)
	//*   8   16:aload_1         
	//*   9   17:ifnonnull       61
		{
			if(((Object) (android/app/Application)).equals(((Object) (((Object) (getApplication())).getClass()))))
	//*  10   20:ldc1            #55  <Class Application>
	//*  11   22:aload_0         
	//*  12   23:invokevirtual   #59  <Method Application getApplication()>
	//*  13   26:invokevirtual   #65  <Method Class Object.getClass()>
	//*  14   29:invokevirtual   #69  <Method boolean Object.equals(Object)>
	//*  15   32:ifeq            51
			{
				Logger.get().warning(TAG, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
	//   16   35:invokestatic    #73  <Method Logger Logger.get()>
	//   17   38:getstatic       #33  <Field String TAG>
	//   18   41:ldc1            #75  <String "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.">
	//   19   43:iconst_0        
	//   20   44:anewarray       Throwable[]
	//   21   47:invokevirtual   #81  <Method void Logger.warning(String, String, Throwable[])>
				return;
	//   22   50:return          
			} else
			{
				throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
	//   23   51:new             #83  <Class IllegalStateException>
	//   24   54:dup             
	//   25   55:ldc1            #85  <String "WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().">
	//   26   57:invokespecial   #88  <Method void IllegalStateException(String)>
	//   27   60:athrow          
			}
		} else
		{
			workmanagerimpl.getProcessor().addExecutionListener(((ExecutionListener) (this)));
	//   28   61:aload_1         
	//   29   62:invokevirtual   #92  <Method Processor WorkManagerImpl.getProcessor()>
	//   30   65:aload_0         
	//   31   66:invokevirtual   #98  <Method void Processor.addExecutionListener(ExecutionListener)>
			return;
	//   32   69:return          
		}
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #101 <Method void JobService.onDestroy()>
		WorkManagerImpl workmanagerimpl = mWorkManagerImpl;
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field WorkManagerImpl mWorkManagerImpl>
	//    4    8:astore_1        
		if(workmanagerimpl != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          21
			workmanagerimpl.getProcessor().removeExecutionListener(((ExecutionListener) (this)));
	//    7   13:aload_1         
	//    8   14:invokevirtual   #92  <Method Processor WorkManagerImpl.getProcessor()>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #104 <Method void Processor.removeExecutionListener(ExecutionListener)>
	//   11   21:return          
	}

	public void onExecuted(String s, boolean flag)
	{
		Logger.get().debug(TAG, String.format("%s executed on JobScheduler", new Object[] {
			s
		}), new Throwable[0]);
	//    0    0:invokestatic    #73  <Method Logger Logger.get()>
	//    1    3:getstatic       #33  <Field String TAG>
	//    2    6:ldc1            #109 <String "%s executed on JobScheduler">
	//    3    8:iconst_1        
	//    4    9:anewarray       Object[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:aload_1         
	//    8   15:aastore         
	//    9   16:invokestatic    #115 <Method String String.format(String, Object[])>
	//   10   19:iconst_0        
	//   11   20:anewarray       Throwable[]
	//   12   23:invokevirtual   #118 <Method void Logger.debug(String, String, Throwable[])>
		synchronized(mJobParameters)
	//*  13   26:aload_0         
	//*  14   27:getfield        #42  <Field Map mJobParameters>
	//*  15   30:astore_3        
	//*  16   31:aload_3         
	//*  17   32:monitorenter    
		{
			s = ((String) ((JobParameters)mJobParameters.remove(((Object) (s)))));
	//   18   33:aload_0         
	//   19   34:getfield        #42  <Field Map mJobParameters>
	//   20   37:aload_1         
	//   21   38:invokeinterface #124 <Method Object Map.remove(Object)>
	//   22   43:checkcast       #126 <Class JobParameters>
	//   23   46:astore_1        
		}
	//   24   47:aload_3         
	//   25   48:monitorexit     
		if(s != null)
	//*  26   49:aload_1         
	//*  27   50:ifnull          59
			jobFinished(((JobParameters) (s)), flag);
	//   28   53:aload_0         
	//   29   54:aload_1         
	//   30   55:iload_2         
	//   31   56:invokevirtual   #130 <Method void jobFinished(JobParameters, boolean)>
		return;
	//   32   59:return          
		s;
	//   33   60:astore_1        
		map;
	//   34   61:aload_3         
		JVM INSTR monitorexit ;
	//   35   62:monitorexit     
		throw s;
	//   36   63:aload_1         
	//   37   64:athrow          
	}

	public boolean onStartJob(final JobParameters enqueuedFuture)
	{
		final String workSpecId;
label0:
		{
			if(mWorkManagerImpl == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field WorkManagerImpl mWorkManagerImpl>
	//*   2    4:ifnonnull       30
			{
				Logger.get().debug(TAG, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
	//    3    7:invokestatic    #73  <Method Logger Logger.get()>
	//    4   10:getstatic       #33  <Field String TAG>
	//    5   13:ldc1            #135 <String "WorkManager is not initialized; requesting retry.">
	//    6   15:iconst_0        
	//    7   16:anewarray       Throwable[]
	//    8   19:invokevirtual   #118 <Method void Logger.debug(String, String, Throwable[])>
				jobFinished(enqueuedFuture, true);
	//    9   22:aload_0         
	//   10   23:aload_1         
	//   11   24:iconst_1        
	//   12   25:invokevirtual   #130 <Method void jobFinished(JobParameters, boolean)>
				return false;
	//   13   28:iconst_0        
	//   14   29:ireturn         
			}
			workSpecId = enqueuedFuture.getExtras().getString("EXTRA_WORK_SPEC_ID");
	//   15   30:aload_1         
	//   16   31:invokevirtual   #139 <Method PersistableBundle JobParameters.getExtras()>
	//   17   34:ldc1            #141 <String "EXTRA_WORK_SPEC_ID">
	//   18   36:invokevirtual   #146 <Method String PersistableBundle.getString(String)>
	//   19   39:astore          4
			if(TextUtils.isEmpty(((CharSequence) (workSpecId))))
	//*  20   41:aload           4
	//*  21   43:invokestatic    #152 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  22   46:ifeq            66
			{
				Logger.get().error(TAG, "WorkSpec id not found!", new Throwable[0]);
	//   23   49:invokestatic    #73  <Method Logger Logger.get()>
	//   24   52:getstatic       #33  <Field String TAG>
	//   25   55:ldc1            #154 <String "WorkSpec id not found!">
	//   26   57:iconst_0        
	//   27   58:anewarray       Throwable[]
	//   28   61:invokevirtual   #157 <Method void Logger.error(String, String, Throwable[])>
				return false;
	//   29   64:iconst_0        
	//   30   65:ireturn         
			}
			synchronized(mJobParameters)
	//*  31   66:aload_0         
	//*  32   67:getfield        #42  <Field Map mJobParameters>
	//*  33   70:astore_2        
	//*  34   71:aload_2         
	//*  35   72:monitorenter    
			{
				if(!mJobParameters.containsKey(((Object) (workSpecId))))
					break label0;
	//   36   73:aload_0         
	//   37   74:getfield        #42  <Field Map mJobParameters>
	//   38   77:aload           4
	//   39   79:invokeinterface #160 <Method boolean Map.containsKey(Object)>
	//   40   84:ifeq            118
				Logger.get().debug(TAG, String.format("Job is already being executed by SystemJobService: %s", new Object[] {
					workSpecId
				}), new Throwable[0]);
	//   41   87:invokestatic    #73  <Method Logger Logger.get()>
	//   42   90:getstatic       #33  <Field String TAG>
	//   43   93:ldc1            #162 <String "Job is already being executed by SystemJobService: %s">
	//   44   95:iconst_1        
	//   45   96:anewarray       Object[]
	//   46   99:dup             
	//   47  100:iconst_0        
	//   48  101:aload           4
	//   49  103:aastore         
	//   50  104:invokestatic    #115 <Method String String.format(String, Object[])>
	//   51  107:iconst_0        
	//   52  108:anewarray       Throwable[]
	//   53  111:invokevirtual   #118 <Method void Logger.debug(String, String, Throwable[])>
			}
	//   54  114:aload_2         
	//   55  115:monitorexit     
			return false;
	//   56  116:iconst_0        
	//   57  117:ireturn         
		}
		Logger.get().debug(TAG, String.format("onStartJob for %s", new Object[] {
			workSpecId
		}), new Throwable[0]);
	//   58  118:invokestatic    #73  <Method Logger Logger.get()>
	//   59  121:getstatic       #33  <Field String TAG>
	//   60  124:ldc1            #164 <String "onStartJob for %s">
	//   61  126:iconst_1        
	//   62  127:anewarray       Object[]
	//   63  130:dup             
	//   64  131:iconst_0        
	//   65  132:aload           4
	//   66  134:aastore         
	//   67  135:invokestatic    #115 <Method String String.format(String, Object[])>
	//   68  138:iconst_0        
	//   69  139:anewarray       Throwable[]
	//   70  142:invokevirtual   #118 <Method void Logger.debug(String, String, Throwable[])>
		mJobParameters.put(((Object) (workSpecId)), ((Object) (enqueuedFuture)));
	//   71  145:aload_0         
	//   72  146:getfield        #42  <Field Map mJobParameters>
	//   73  149:aload           4
	//   74  151:aload_1         
	//   75  152:invokeinterface #168 <Method Object Map.put(Object, Object)>
	//   76  157:pop             
		obj;
	//   77  158:aload_2         
		JVM INSTR monitorexit ;
	//   78  159:monitorexit     
		obj = null;
	//   79  160:aconst_null     
	//   80  161:astore_2        
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  81  162:getstatic       #174 <Field int android.os.Build$VERSION.SDK_INT>
	//*  82  165:bipush          24
	//*  83  167:icmplt          234
		{
			androidx.work.WorkerParameters.RuntimeExtras runtimeextras = new androidx.work.WorkerParameters.RuntimeExtras();
	//   84  170:new             #176 <Class androidx.work.WorkerParameters$RuntimeExtras>
	//   85  173:dup             
	//   86  174:invokespecial   #177 <Method void androidx.work.WorkerParameters$RuntimeExtras()>
	//   87  177:astore_3        
			if(enqueuedFuture.getTriggeredContentUris() != null)
	//*  88  178:aload_1         
	//*  89  179:invokevirtual   #181 <Method android.net.Uri[] JobParameters.getTriggeredContentUris()>
	//*  90  182:ifnull          196
				runtimeextras.triggeredContentUris = Arrays.asList(((Object []) (enqueuedFuture.getTriggeredContentUris())));
	//   91  185:aload_3         
	//   92  186:aload_1         
	//   93  187:invokevirtual   #181 <Method android.net.Uri[] JobParameters.getTriggeredContentUris()>
	//   94  190:invokestatic    #187 <Method java.util.List Arrays.asList(Object[])>
	//   95  193:putfield        #191 <Field java.util.List androidx.work.WorkerParameters$RuntimeExtras.triggeredContentUris>
			if(enqueuedFuture.getTriggeredContentAuthorities() != null)
	//*  96  196:aload_1         
	//*  97  197:invokevirtual   #195 <Method String[] JobParameters.getTriggeredContentAuthorities()>
	//*  98  200:ifnull          214
				runtimeextras.triggeredContentAuthorities = Arrays.asList(((Object []) (enqueuedFuture.getTriggeredContentAuthorities())));
	//   99  203:aload_3         
	//  100  204:aload_1         
	//  101  205:invokevirtual   #195 <Method String[] JobParameters.getTriggeredContentAuthorities()>
	//  102  208:invokestatic    #187 <Method java.util.List Arrays.asList(Object[])>
	//  103  211:putfield        #198 <Field java.util.List androidx.work.WorkerParameters$RuntimeExtras.triggeredContentAuthorities>
			obj = ((Object) (runtimeextras));
	//  104  214:aload_3         
	//  105  215:astore_2        
			if(android.os.Build.VERSION.SDK_INT >= 28)
	//* 106  216:getstatic       #174 <Field int android.os.Build$VERSION.SDK_INT>
	//* 107  219:bipush          28
	//* 108  221:icmplt          234
			{
				runtimeextras.network = enqueuedFuture.getNetwork();
	//  109  224:aload_3         
	//  110  225:aload_1         
	//  111  226:invokevirtual   #202 <Method android.net.Network JobParameters.getNetwork()>
	//  112  229:putfield        #206 <Field android.net.Network androidx.work.WorkerParameters$RuntimeExtras.network>
				obj = ((Object) (runtimeextras));
	//  113  232:aload_3         
	//  114  233:astore_2        
			}
		}
		enqueuedFuture = ((JobParameters) (mWorkManagerImpl.startWork(workSpecId, ((androidx.work.WorkerParameters.RuntimeExtras) (obj)))));
	//  115  234:aload_0         
	//  116  235:getfield        #53  <Field WorkManagerImpl mWorkManagerImpl>
	//  117  238:aload           4
	//  118  240:aload_2         
	//  119  241:invokevirtual   #210 <Method ListenableFuture WorkManagerImpl.startWork(String, androidx.work.WorkerParameters$RuntimeExtras)>
	//  120  244:astore_1        
		((ListenableFuture) (enqueuedFuture)).addListener(new Runnable() {

			public void run()
			{
				Throwable throwable;
				boolean flag;
				try
				{
					flag = ((Boolean)enqueuedFuture.get()).booleanValue();
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field ListenableFuture val$enqueuedFuture>
			//    2    4:invokeinterface #38  <Method Object ListenableFuture.get()>
			//    3    9:checkcast       #40  <Class Boolean>
			//    4   12:invokevirtual   #44  <Method boolean Boolean.booleanValue()>
			//    5   15:istore_1        
				}
			//*   6   16:goto            21
			//*   7   19:iconst_0        
			//*   8   20:istore_1        
			//*   9   21:iload_1         
			//*  10   22:ifne            66
			//*  11   25:invokestatic    #49  <Method Logger Logger.get()>
			//*  12   28:getstatic       #52  <Field String SystemJobService.TAG>
			//*  13   31:ldc1            #54  <String "De-duping request to process WorkSpec %s">
			//*  14   33:iconst_1        
			//*  15   34:anewarray       Object[]
			//*  16   37:dup             
			//*  17   38:iconst_0        
			//*  18   39:aload_0         
			//*  19   40:getfield        #25  <Field String val$workSpecId>
			//*  20   43:aastore         
			//*  21   44:invokestatic    #60  <Method String String.format(String, Object[])>
			//*  22   47:iconst_0        
			//*  23   48:anewarray       Throwable[]
			//*  24   51:invokevirtual   #64  <Method void Logger.debug(String, String, Throwable[])>
			//*  25   54:aload_0         
			//*  26   55:getfield        #21  <Field SystemJobService this$0>
			//*  27   58:aload_0         
			//*  28   59:getfield        #25  <Field String val$workSpecId>
			//*  29   62:iconst_0        
			//*  30   63:invokevirtual   #68  <Method void SystemJobService.onExecuted(String, boolean)>
			//*  31   66:return          
				// Misplaced declaration of an exception variable
				catch(Throwable throwable)
				{
					flag = false;
				}
				if(!flag)
				{
					Logger.get().debug(SystemJobService.TAG, String.format("De-duping request to process WorkSpec %s", new Object[] {
						workSpecId
					}), new Throwable[0]);
					onExecuted(workSpecId, false);
				}
			//*  32   67:astore_2        
			//*  33   68:goto            19
			}

			final SystemJobService this$0;
			final ListenableFuture val$enqueuedFuture;
			final String val$workSpecId;

			
			{
				this$0 = SystemJobService.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field SystemJobService this$0>
				enqueuedFuture = listenablefuture;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field ListenableFuture val$enqueuedFuture>
				workSpecId = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field String val$workSpecId>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
, mWorkManagerImpl.getWorkTaskExecutor().getMainThreadExecutor());
	//  121  245:aload_1         
	//  122  246:new             #8   <Class SystemJobService$1>
	//  123  249:dup             
	//  124  250:aload_0         
	//  125  251:aload_1         
	//  126  252:aload           4
	//  127  254:invokespecial   #213 <Method void SystemJobService$1(SystemJobService, ListenableFuture, String)>
	//  128  257:aload_0         
	//  129  258:getfield        #53  <Field WorkManagerImpl mWorkManagerImpl>
	//  130  261:invokevirtual   #217 <Method TaskExecutor WorkManagerImpl.getWorkTaskExecutor()>
	//  131  264:invokeinterface #223 <Method java.util.concurrent.Executor TaskExecutor.getMainThreadExecutor()>
	//  132  269:invokeinterface #229 <Method void ListenableFuture.addListener(Runnable, java.util.concurrent.Executor)>
		return true;
	//  133  274:iconst_1        
	//  134  275:ireturn         
		enqueuedFuture;
	//  135  276:astore_1        
		obj;
	//  136  277:aload_2         
		JVM INSTR monitorexit ;
	//  137  278:monitorexit     
		throw enqueuedFuture;
	//  138  279:aload_1         
	//  139  280:athrow          
	}

	public boolean onStopJob(JobParameters jobparameters)
	{
		if(mWorkManagerImpl == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field WorkManagerImpl mWorkManagerImpl>
	//*   2    4:ifnonnull       24
		{
			Logger.get().debug(TAG, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
	//    3    7:invokestatic    #73  <Method Logger Logger.get()>
	//    4   10:getstatic       #33  <Field String TAG>
	//    5   13:ldc1            #135 <String "WorkManager is not initialized; requesting retry.">
	//    6   15:iconst_0        
	//    7   16:anewarray       Throwable[]
	//    8   19:invokevirtual   #118 <Method void Logger.debug(String, String, Throwable[])>
			return true;
	//    9   22:iconst_1        
	//   10   23:ireturn         
		}
		String s = jobparameters.getExtras().getString("EXTRA_WORK_SPEC_ID");
	//   11   24:aload_1         
	//   12   25:invokevirtual   #139 <Method PersistableBundle JobParameters.getExtras()>
	//   13   28:ldc1            #141 <String "EXTRA_WORK_SPEC_ID">
	//   14   30:invokevirtual   #146 <Method String PersistableBundle.getString(String)>
	//   15   33:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  16   34:aload_2         
	//*  17   35:invokestatic    #152 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  18   38:ifeq            58
		{
			Logger.get().error(TAG, "WorkSpec id not found!", new Throwable[0]);
	//   19   41:invokestatic    #73  <Method Logger Logger.get()>
	//   20   44:getstatic       #33  <Field String TAG>
	//   21   47:ldc1            #154 <String "WorkSpec id not found!">
	//   22   49:iconst_0        
	//   23   50:anewarray       Throwable[]
	//   24   53:invokevirtual   #157 <Method void Logger.error(String, String, Throwable[])>
			return false;
	//   25   56:iconst_0        
	//   26   57:ireturn         
		}
		Logger.get().debug(TAG, String.format("onStopJob for %s", new Object[] {
			s
		}), new Throwable[0]);
	//   27   58:invokestatic    #73  <Method Logger Logger.get()>
	//   28   61:getstatic       #33  <Field String TAG>
	//   29   64:ldc1            #232 <String "onStopJob for %s">
	//   30   66:iconst_1        
	//   31   67:anewarray       Object[]
	//   32   70:dup             
	//   33   71:iconst_0        
	//   34   72:aload_2         
	//   35   73:aastore         
	//   36   74:invokestatic    #115 <Method String String.format(String, Object[])>
	//   37   77:iconst_0        
	//   38   78:anewarray       Throwable[]
	//   39   81:invokevirtual   #118 <Method void Logger.debug(String, String, Throwable[])>
		synchronized(mJobParameters)
	//*  40   84:aload_0         
	//*  41   85:getfield        #42  <Field Map mJobParameters>
	//*  42   88:astore_1        
	//*  43   89:aload_1         
	//*  44   90:monitorenter    
		{
			mJobParameters.remove(((Object) (s)));
	//   45   91:aload_0         
	//   46   92:getfield        #42  <Field Map mJobParameters>
	//   47   95:aload_2         
	//   48   96:invokeinterface #124 <Method Object Map.remove(Object)>
	//   49  101:pop             
		}
	//   50  102:aload_1         
	//   51  103:monitorexit     
		mWorkManagerImpl.stopWork(s);
	//   52  104:aload_0         
	//   53  105:getfield        #53  <Field WorkManagerImpl mWorkManagerImpl>
	//   54  108:aload_2         
	//   55  109:invokevirtual   #235 <Method void WorkManagerImpl.stopWork(String)>
		return mWorkManagerImpl.getProcessor().isCancelled(s) ^ true;
	//   56  112:aload_0         
	//   57  113:getfield        #53  <Field WorkManagerImpl mWorkManagerImpl>
	//   58  116:invokevirtual   #92  <Method Processor WorkManagerImpl.getProcessor()>
	//   59  119:aload_2         
	//   60  120:invokevirtual   #239 <Method boolean Processor.isCancelled(String)>
	//   61  123:iconst_1        
	//   62  124:ixor            
	//   63  125:ireturn         
		exception;
	//   64  126:astore_2        
		jobparameters;
	//   65  127:aload_1         
		JVM INSTR monitorexit ;
	//   66  128:monitorexit     
		throw exception;
	//   67  129:aload_2         
	//   68  130:athrow          
	}

	static final String TAG = Logger.tagWithPrefix("SystemJobService");
	private final Map mJobParameters = new HashMap();
	private WorkManagerImpl mWorkManagerImpl;

	static 
	{
	//    0    0:ldc1            #25  <String "SystemJobService">
	//    1    2:invokestatic    #31  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #33  <Field String TAG>
	//*   3    8:return          
	}
}
