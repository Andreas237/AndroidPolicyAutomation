// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.app.Service;
import android.content.Intent;
import android.os.*;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;
import android.util.Pair;

// Referenced classes of package com.firebase.jobdispatcher:
//			JobCoder, GooglePlayCallbackExtractor, GooglePlayDriver, GooglePlayMessageHandler, 
//			ValidationEnforcer, Driver, JobParameters, Job, 
//			JobCallback, ExecutionDelegator, JobInvocation

public class GooglePlayReceiver extends Service
	implements ExecutionDelegator.JobFinishedCallback
{

	public GooglePlayReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void Service()>
	//    2    4:aload_0         
	//    3    5:new             #67  <Class GooglePlayCallbackExtractor>
	//    4    8:dup             
	//    5    9:invokespecial   #68  <Method void GooglePlayCallbackExtractor()>
	//    6   12:putfield        #70  <Field GooglePlayCallbackExtractor callbackExtractor>
	//    7   15:return          
	}

	static void clearCallbacks()
	{
		synchronized(callbacks)
	//*   0    0:getstatic       #62  <Field SimpleArrayMap callbacks>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			callbacks.clear();
	//    4    6:getstatic       #62  <Field SimpleArrayMap callbacks>
	//    5    9:invokevirtual   #74  <Method void SimpleArrayMap.clear()>
		}
	//    6   12:aload_0         
	//    7   13:monitorexit     
		return;
	//    8   14:return          
		exception;
	//    9   15:astore_1        
		simplearraymap;
	//   10   16:aload_0         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		throw exception;
	//   12   18:aload_1         
	//   13   19:athrow          
	}

	private Driver getGooglePlayDriver()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Driver driver1;
		if(driver == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #80  <Field Driver driver>
	//*   4    6:ifnonnull       24
			driver = ((Driver) (new GooglePlayDriver(getApplicationContext())));
	//    5    9:aload_0         
	//    6   10:new             #82  <Class GooglePlayDriver>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokevirtual   #86  <Method android.content.Context getApplicationContext()>
	//   10   18:invokespecial   #89  <Method void GooglePlayDriver(android.content.Context)>
	//   11   21:putfield        #80  <Field Driver driver>
		driver1 = driver;
	//   12   24:aload_0         
	//   13   25:getfield        #80  <Field Driver driver>
	//   14   28:astore_1        
		this;
	//   15   29:aload_0         
		JVM INSTR monitorexit ;
	//   16   30:monitorexit     
		return driver1;
	//   17   31:aload_1         
	//   18   32:areturn         
		Exception exception;
		exception;
	//   19   33:astore_1        
	//*  20   34:aload_0         
		throw exception;
	//   21   35:monitorexit     
	//   22   36:aload_1         
	//   23   37:athrow          
	}

	static JobCoder getJobCoder()
	{
		return prefixedCoder;
	//    0    0:getstatic       #55  <Field JobCoder prefixedCoder>
	//    1    3:areturn         
	}

	private Messenger getServiceMessenger()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Messenger messenger;
		if(serviceMessenger == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #95  <Field Messenger serviceMessenger>
	//*   4    6:ifnonnull       31
			serviceMessenger = new Messenger(((android.os.Handler) (new GooglePlayMessageHandler(Looper.getMainLooper(), this))));
	//    5    9:aload_0         
	//    6   10:new             #97  <Class Messenger>
	//    7   13:dup             
	//    8   14:new             #99  <Class GooglePlayMessageHandler>
	//    9   17:dup             
	//   10   18:invokestatic    #105 <Method Looper Looper.getMainLooper()>
	//   11   21:aload_0         
	//   12   22:invokespecial   #108 <Method void GooglePlayMessageHandler(Looper, GooglePlayReceiver)>
	//   13   25:invokespecial   #111 <Method void Messenger(android.os.Handler)>
	//   14   28:putfield        #95  <Field Messenger serviceMessenger>
		messenger = serviceMessenger;
	//   15   31:aload_0         
	//   16   32:getfield        #95  <Field Messenger serviceMessenger>
	//   17   35:astore_1        
		this;
	//   18   36:aload_0         
		JVM INSTR monitorexit ;
	//   19   37:monitorexit     
		return messenger;
	//   20   38:aload_1         
	//   21   39:areturn         
		Exception exception;
		exception;
	//   22   40:astore_1        
	//*  23   41:aload_0         
		throw exception;
	//   24   42:monitorexit     
	//   25   43:aload_1         
	//   26   44:athrow          
	}

	private ValidationEnforcer getValidationEnforcer()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ValidationEnforcer validationenforcer;
		if(validationEnforcer == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #115 <Field ValidationEnforcer validationEnforcer>
	//*   4    6:ifnonnull       29
			validationEnforcer = new ValidationEnforcer(getGooglePlayDriver().getValidator());
	//    5    9:aload_0         
	//    6   10:new             #117 <Class ValidationEnforcer>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #119 <Method Driver getGooglePlayDriver()>
	//   10   18:invokeinterface #125 <Method JobValidator Driver.getValidator()>
	//   11   23:invokespecial   #128 <Method void ValidationEnforcer(JobValidator)>
	//   12   26:putfield        #115 <Field ValidationEnforcer validationEnforcer>
		validationenforcer = validationEnforcer;
	//   13   29:aload_0         
	//   14   30:getfield        #115 <Field ValidationEnforcer validationEnforcer>
	//   15   33:astore_1        
		this;
	//   16   34:aload_0         
		JVM INSTR monitorexit ;
	//   17   35:monitorexit     
		return validationenforcer;
	//   18   36:aload_1         
	//   19   37:areturn         
		Exception exception;
		exception;
	//   20   38:astore_1        
	//*  21   39:aload_0         
		throw exception;
	//   22   40:monitorexit     
	//   23   41:aload_1         
	//   24   42:athrow          
	}

	private static boolean needsToBeRescheduled(JobParameters jobparameters, int i)
	{
		return jobparameters.isRecurring() && (jobparameters.getTrigger() instanceof JobTrigger.ContentUriTrigger) && i != 1;
	//    0    0:aload_0         
	//    1    1:invokeinterface #136 <Method boolean JobParameters.isRecurring()>
	//    2    6:ifeq            28
	//    3    9:aload_0         
	//    4   10:invokeinterface #140 <Method JobTrigger JobParameters.getTrigger()>
	//    5   15:instanceof      #142 <Class JobTrigger$ContentUriTrigger>
	//    6   18:ifeq            28
	//    7   21:iload_1         
	//    8   22:iconst_1        
	//    9   23:icmpeq          28
	//   10   26:iconst_1        
	//   11   27:ireturn         
	//   12   28:iconst_0        
	//   13   29:ireturn         
	}

	static void onSchedule(Job job)
	{
		SimpleArrayMap simplearraymap = callbacks;
	//    0    0:getstatic       #62  <Field SimpleArrayMap callbacks>
	//    1    3:astore_1        
		simplearraymap;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		SimpleArrayMap simplearraymap1 = (SimpleArrayMap)callbacks.get(((Object) (job.getService())));
	//    4    6:getstatic       #62  <Field SimpleArrayMap callbacks>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #150 <Method String Job.getService()>
	//    7   13:invokevirtual   #154 <Method Object SimpleArrayMap.get(Object)>
	//    8   16:checkcast       #57  <Class SimpleArrayMap>
	//    9   19:astore_2        
		if(simplearraymap1 != null)
			break MISSING_BLOCK_LABEL_27;
	//   10   20:aload_2         
	//   11   21:ifnonnull       27
		simplearraymap;
	//   12   24:aload_1         
		JVM INSTR monitorexit ;
	//   13   25:monitorexit     
		return;
	//   14   26:return          
		if((JobCallback)simplearraymap1.get(((Object) (job.getTag()))) != null)
			break MISSING_BLOCK_LABEL_44;
	//   15   27:aload_2         
	//   16   28:aload_0         
	//   17   29:invokevirtual   #157 <Method String Job.getTag()>
	//   18   32:invokevirtual   #154 <Method Object SimpleArrayMap.get(Object)>
	//   19   35:checkcast       #159 <Class JobCallback>
	//   20   38:ifnonnull       44
		simplearraymap;
	//   21   41:aload_1         
		JVM INSTR monitorexit ;
	//   22   42:monitorexit     
		return;
	//   23   43:return          
		ExecutionDelegator.stopJob((new JobInvocation.Builder()).setTag(job.getTag()).setService(job.getService()).setTrigger(job.getTrigger()).build(), false);
	//   24   44:new             #161 <Class JobInvocation$Builder>
	//   25   47:dup             
	//   26   48:invokespecial   #162 <Method void JobInvocation$Builder()>
	//   27   51:aload_0         
	//   28   52:invokevirtual   #157 <Method String Job.getTag()>
	//   29   55:invokevirtual   #166 <Method JobInvocation$Builder JobInvocation$Builder.setTag(String)>
	//   30   58:aload_0         
	//   31   59:invokevirtual   #150 <Method String Job.getService()>
	//   32   62:invokevirtual   #169 <Method JobInvocation$Builder JobInvocation$Builder.setService(String)>
	//   33   65:aload_0         
	//   34   66:invokevirtual   #170 <Method JobTrigger Job.getTrigger()>
	//   35   69:invokevirtual   #174 <Method JobInvocation$Builder JobInvocation$Builder.setTrigger(JobTrigger)>
	//   36   72:invokevirtual   #178 <Method JobInvocation JobInvocation$Builder.build()>
	//   37   75:iconst_0        
	//   38   76:invokestatic    #184 <Method void ExecutionDelegator.stopJob(JobInvocation, boolean)>
		simplearraymap;
	//   39   79:aload_1         
		JVM INSTR monitorexit ;
	//   40   80:monitorexit     
		return;
	//   41   81:return          
		job;
	//   42   82:astore_0        
		simplearraymap;
	//   43   83:aload_1         
		JVM INSTR monitorexit ;
	//   44   84:monitorexit     
		throw job;
	//   45   85:aload_0         
	//   46   86:athrow          
	}

	private void reschedule(JobInvocation jobinvocation)
	{
		jobinvocation = ((JobInvocation) ((new Job.Builder(getValidationEnforcer(), ((JobParameters) (jobinvocation)))).setReplaceCurrent(true).build()));
	//    0    0:new             #188 <Class Job$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #190 <Method ValidationEnforcer getValidationEnforcer()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #193 <Method void Job$Builder(ValidationEnforcer, JobParameters)>
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #197 <Method Job$Builder Job$Builder.setReplaceCurrent(boolean)>
	//    8   16:invokevirtual   #200 <Method Job Job$Builder.build()>
	//    9   19:astore_1        
		getGooglePlayDriver().schedule(((Job) (jobinvocation)));
	//   10   20:aload_0         
	//   11   21:invokespecial   #119 <Method Driver getGooglePlayDriver()>
	//   12   24:aload_1         
	//   13   25:invokeinterface #204 <Method int Driver.schedule(Job)>
	//   14   30:pop             
	//   15   31:return          
	}

	private static void sendResultSafely(JobCallback jobcallback, int i)
	{
		try
		{
			jobcallback.jobFinished(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokeinterface #211 <Method void JobCallback.jobFinished(int)>
			return;
	//    3    7:return          
		}
		// Misplaced declaration of an exception variable
		catch(JobCallback jobcallback)
	//*   4    8:astore_0        
		{
			Log.e("FJD.GooglePlayReceiver", "Encountered error running callback", ((Throwable) (jobcallback)).getCause());
	//    5    9:ldc1            #26  <String "FJD.GooglePlayReceiver">
	//    6   11:ldc1            #213 <String "Encountered error running callback">
	//    7   13:aload_0         
	//    8   14:invokevirtual   #217 <Method Throwable Throwable.getCause()>
	//    9   17:invokestatic    #223 <Method int Log.e(String, String, Throwable)>
	//   10   20:pop             
		}
	//   11   21:return          
	}

	ExecutionDelegator getExecutionDelegator()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ExecutionDelegator executiondelegator;
		if(executionDelegator == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #227 <Field ExecutionDelegator executionDelegator>
	//*   4    6:ifnonnull       22
			executionDelegator = new ExecutionDelegator(((android.content.Context) (this)), ((ExecutionDelegator.JobFinishedCallback) (this)));
	//    5    9:aload_0         
	//    6   10:new             #180 <Class ExecutionDelegator>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokespecial   #230 <Method void ExecutionDelegator(android.content.Context, ExecutionDelegator$JobFinishedCallback)>
	//   11   19:putfield        #227 <Field ExecutionDelegator executionDelegator>
		executiondelegator = executionDelegator;
	//   12   22:aload_0         
	//   13   23:getfield        #227 <Field ExecutionDelegator executionDelegator>
	//   14   26:astore_1        
		this;
	//   15   27:aload_0         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		return executiondelegator;
	//   17   29:aload_1         
	//   18   30:areturn         
		Exception exception;
		exception;
	//   19   31:astore_1        
	//*  20   32:aload_0         
		throw exception;
	//   21   33:monitorexit     
	//   22   34:aload_1         
	//   23   35:athrow          
	}

	public IBinder onBind(Intent intent)
	{
		if(intent != null && android.os.Build.VERSION.SDK_INT >= 21 && "com.google.android.gms.gcm.ACTION_TASK_READY".equals(((Object) (intent.getAction()))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          35
	//*   2    4:getstatic       #238 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmplt          35
	//*   5   12:ldc1            #10  <String "com.google.android.gms.gcm.ACTION_TASK_READY">
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #243 <Method String Intent.getAction()>
	//*   8   18:invokevirtual   #249 <Method boolean String.equals(Object)>
	//*   9   21:ifne            27
	//*  10   24:goto            35
			return getServiceMessenger().getBinder();
	//   11   27:aload_0         
	//   12   28:invokespecial   #251 <Method Messenger getServiceMessenger()>
	//   13   31:invokevirtual   #255 <Method IBinder Messenger.getBinder()>
	//   14   34:areturn         
		else
			return null;
	//   15   35:aconst_null     
	//   16   36:areturn         
	}

	public void onJobFinished(JobInvocation jobinvocation, int i)
	{
		SimpleArrayMap simplearraymap = callbacks;
	//    0    0:getstatic       #62  <Field SimpleArrayMap callbacks>
	//    1    3:astore_3        
		simplearraymap;
	//    2    4:aload_3         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		SimpleArrayMap simplearraymap1 = (SimpleArrayMap)callbacks.get(((Object) (jobinvocation.getService())));
	//    4    6:getstatic       #62  <Field SimpleArrayMap callbacks>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #260 <Method String JobInvocation.getService()>
	//    7   13:invokevirtual   #154 <Method Object SimpleArrayMap.get(Object)>
	//    8   16:checkcast       #57  <Class SimpleArrayMap>
	//    9   19:astore          5
		if(simplearraymap1 != null)
			break MISSING_BLOCK_LABEL_46;
	//   10   21:aload           5
	//   11   23:ifnonnull       46
		if(callbacks.isEmpty())
	//*  12   26:getstatic       #62  <Field SimpleArrayMap callbacks>
	//*  13   29:invokevirtual   #263 <Method boolean SimpleArrayMap.isEmpty()>
	//*  14   32:ifeq            43
			stopSelf(latestStartId);
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:getfield        #265 <Field int latestStartId>
	//   18   40:invokevirtual   #268 <Method void stopSelf(int)>
		simplearraymap;
	//   19   43:aload_3         
		JVM INSTR monitorexit ;
	//   20   44:monitorexit     
		return;
	//   21   45:return          
		JobCallback jobcallback = (JobCallback)simplearraymap1.remove(((Object) (jobinvocation.getTag())));
	//   22   46:aload           5
	//   23   48:aload_1         
	//   24   49:invokevirtual   #269 <Method String JobInvocation.getTag()>
	//   25   52:invokevirtual   #272 <Method Object SimpleArrayMap.remove(Object)>
	//   26   55:checkcast       #159 <Class JobCallback>
	//   27   58:astore          4
		if(jobcallback != null)
			break MISSING_BLOCK_LABEL_85;
	//   28   60:aload           4
	//   29   62:ifnonnull       85
		if(callbacks.isEmpty())
	//*  30   65:getstatic       #62  <Field SimpleArrayMap callbacks>
	//*  31   68:invokevirtual   #263 <Method boolean SimpleArrayMap.isEmpty()>
	//*  32   71:ifeq            82
			stopSelf(latestStartId);
	//   33   74:aload_0         
	//   34   75:aload_0         
	//   35   76:getfield        #265 <Field int latestStartId>
	//   36   79:invokevirtual   #268 <Method void stopSelf(int)>
		simplearraymap;
	//   37   82:aload_3         
		JVM INSTR monitorexit ;
	//   38   83:monitorexit     
		return;
	//   39   84:return          
		if(simplearraymap1.isEmpty())
	//*  40   85:aload           5
	//*  41   87:invokevirtual   #263 <Method boolean SimpleArrayMap.isEmpty()>
	//*  42   90:ifeq            104
			callbacks.remove(((Object) (jobinvocation.getService())));
	//   43   93:getstatic       #62  <Field SimpleArrayMap callbacks>
	//   44   96:aload_1         
	//   45   97:invokevirtual   #260 <Method String JobInvocation.getService()>
	//   46  100:invokevirtual   #272 <Method Object SimpleArrayMap.remove(Object)>
	//   47  103:pop             
		if(needsToBeRescheduled(((JobParameters) (jobinvocation)), i))
	//*  48  104:aload_1         
	//*  49  105:iload_2         
	//*  50  106:invokestatic    #274 <Method boolean needsToBeRescheduled(JobParameters, int)>
	//*  51  109:ifeq            120
		{
			reschedule(jobinvocation);
	//   52  112:aload_0         
	//   53  113:aload_1         
	//   54  114:invokespecial   #276 <Method void reschedule(JobInvocation)>
			break MISSING_BLOCK_LABEL_190;
	//   55  117:goto            190
		}
		if(Log.isLoggable("FJD.GooglePlayReceiver", 2))
	//*  56  120:ldc1            #26  <String "FJD.GooglePlayReceiver">
	//*  57  122:iconst_2        
	//*  58  123:invokestatic    #280 <Method boolean Log.isLoggable(String, int)>
	//*  59  126:ifeq            184
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   60  129:new             #282 <Class StringBuilder>
	//   61  132:dup             
	//   62  133:invokespecial   #283 <Method void StringBuilder()>
	//   63  136:astore          5
			stringbuilder.append("sending jobFinished for ");
	//   64  138:aload           5
	//   65  140:ldc2            #285 <String "sending jobFinished for ">
	//   66  143:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   67  146:pop             
			stringbuilder.append(jobinvocation.getTag());
	//   68  147:aload           5
	//   69  149:aload_1         
	//   70  150:invokevirtual   #269 <Method String JobInvocation.getTag()>
	//   71  153:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   72  156:pop             
			stringbuilder.append(" = ");
	//   73  157:aload           5
	//   74  159:ldc2            #291 <String " = ">
	//   75  162:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   76  165:pop             
			stringbuilder.append(i);
	//   77  166:aload           5
	//   78  168:iload_2         
	//   79  169:invokevirtual   #294 <Method StringBuilder StringBuilder.append(int)>
	//   80  172:pop             
			Log.v("FJD.GooglePlayReceiver", stringbuilder.toString());
	//   81  173:ldc1            #26  <String "FJD.GooglePlayReceiver">
	//   82  175:aload           5
	//   83  177:invokevirtual   #297 <Method String StringBuilder.toString()>
	//   84  180:invokestatic    #301 <Method int Log.v(String, String)>
	//   85  183:pop             
		}
		sendResultSafely(jobcallback, i);
	//   86  184:aload           4
	//   87  186:iload_2         
	//   88  187:invokestatic    #303 <Method void sendResultSafely(JobCallback, int)>
		if(callbacks.isEmpty())
	//*  89  190:getstatic       #62  <Field SimpleArrayMap callbacks>
	//*  90  193:invokevirtual   #263 <Method boolean SimpleArrayMap.isEmpty()>
	//*  91  196:ifeq            207
			stopSelf(latestStartId);
	//   92  199:aload_0         
	//   93  200:aload_0         
	//   94  201:getfield        #265 <Field int latestStartId>
	//   95  204:invokevirtual   #268 <Method void stopSelf(int)>
		simplearraymap;
	//   96  207:aload_3         
		JVM INSTR monitorexit ;
	//   97  208:monitorexit     
		return;
	//   98  209:return          
		jobinvocation;
	//   99  210:astore_1        
		if(callbacks.isEmpty())
	//* 100  211:getstatic       #62  <Field SimpleArrayMap callbacks>
	//* 101  214:invokevirtual   #263 <Method boolean SimpleArrayMap.isEmpty()>
	//* 102  217:ifeq            228
			stopSelf(latestStartId);
	//  103  220:aload_0         
	//  104  221:aload_0         
	//  105  222:getfield        #265 <Field int latestStartId>
	//  106  225:invokevirtual   #268 <Method void stopSelf(int)>
		throw jobinvocation;
	//  107  228:aload_1         
	//  108  229:athrow          
		jobinvocation;
	//  109  230:astore_1        
		simplearraymap;
	//  110  231:aload_3         
		JVM INSTR monitorexit ;
	//  111  232:monitorexit     
		throw jobinvocation;
	//  112  233:aload_1         
	//  113  234:athrow          
	}

	public final int onStartCommand(Intent intent, int i, int j)
	{
		super.onStartCommand(intent, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #308 <Method int Service.onStartCommand(Intent, int, int)>
	//    5    7:pop             
		if(intent != null)
			break MISSING_BLOCK_LABEL_59;
	//    6    8:aload_1         
	//    7    9:ifnonnull       59
		Log.w("FJD.GooglePlayReceiver", "Null Intent passed, terminating");
	//    8   12:ldc1            #26  <String "FJD.GooglePlayReceiver">
	//    9   14:ldc1            #20  <String "Null Intent passed, terminating">
	//   10   16:invokestatic    #311 <Method int Log.w(String, String)>
	//   11   19:pop             
		synchronized(callbacks)
	//*  12   20:getstatic       #62  <Field SimpleArrayMap callbacks>
	//*  13   23:astore_1        
	//*  14   24:aload_1         
	//*  15   25:monitorenter    
		{
			latestStartId = j;
	//   16   26:aload_0         
	//   17   27:iload_3         
	//   18   28:putfield        #265 <Field int latestStartId>
			if(callbacks.isEmpty())
	//*  19   31:getstatic       #62  <Field SimpleArrayMap callbacks>
	//*  20   34:invokevirtual   #263 <Method boolean SimpleArrayMap.isEmpty()>
	//*  21   37:ifeq            48
				stopSelf(latestStartId);
	//   22   40:aload_0         
	//   23   41:aload_0         
	//   24   42:getfield        #265 <Field int latestStartId>
	//   25   45:invokevirtual   #268 <Method void stopSelf(int)>
		}
	//   26   48:aload_1         
	//   27   49:monitorexit     
		return 2;
	//   28   50:iconst_2        
	//   29   51:ireturn         
		exception;
	//   30   52:astore          5
		intent;
	//   31   54:aload_1         
		JVM INSTR monitorexit ;
	//   32   55:monitorexit     
		throw exception;
	//   33   56:aload           5
	//   34   58:athrow          
		obj = ((Object) (intent.getAction()));
	//   35   59:aload_1         
	//   36   60:invokevirtual   #243 <Method String Intent.getAction()>
	//   37   63:astore          5
		if(!"com.google.android.gms.gcm.ACTION_TASK_READY".equals(obj))
			break MISSING_BLOCK_LABEL_126;
	//   38   65:ldc1            #10  <String "com.google.android.gms.gcm.ACTION_TASK_READY">
	//   39   67:aload           5
	//   40   69:invokevirtual   #249 <Method boolean String.equals(Object)>
	//   41   72:ifeq            126
		getExecutionDelegator().executeJob(prepareJob(intent));
	//   42   75:aload_0         
	//   43   76:invokevirtual   #313 <Method ExecutionDelegator getExecutionDelegator()>
	//   44   79:aload_0         
	//   45   80:aload_1         
	//   46   81:invokevirtual   #317 <Method JobInvocation prepareJob(Intent)>
	//   47   84:invokevirtual   #320 <Method void ExecutionDelegator.executeJob(JobInvocation)>
		synchronized(callbacks)
	//*  48   87:getstatic       #62  <Field SimpleArrayMap callbacks>
	//*  49   90:astore_1        
	//*  50   91:aload_1         
	//*  51   92:monitorenter    
		{
			latestStartId = j;
	//   52   93:aload_0         
	//   53   94:iload_3         
	//   54   95:putfield        #265 <Field int latestStartId>
			if(callbacks.isEmpty())
	//*  55   98:getstatic       #62  <Field SimpleArrayMap callbacks>
	//*  56  101:invokevirtual   #263 <Method boolean SimpleArrayMap.isEmpty()>
	//*  57  104:ifeq            115
				stopSelf(latestStartId);
	//   58  107:aload_0         
	//   59  108:aload_0         
	//   60  109:getfield        #265 <Field int latestStartId>
	//   61  112:invokevirtual   #268 <Method void stopSelf(int)>
		}
	//   62  115:aload_1         
	//   63  116:monitorexit     
		return 2;
	//   64  117:iconst_2        
	//   65  118:ireturn         
		obj;
	//   66  119:astore          5
		intent;
	//   67  121:aload_1         
		JVM INSTR monitorexit ;
	//   68  122:monitorexit     
		throw obj;
	//   69  123:aload           5
	//   70  125:athrow          
		boolean flag = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(obj);
	//   71  126:ldc1            #14  <String "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE">
	//   72  128:aload           5
	//   73  130:invokevirtual   #249 <Method boolean String.equals(Object)>
	//   74  133:istore          4
		if(flag)
	//*  75  135:iload           4
	//*  76  137:ifeq            179
		{
			synchronized(callbacks)
	//*  77  140:getstatic       #62  <Field SimpleArrayMap callbacks>
	//*  78  143:astore_1        
	//*  79  144:aload_1         
	//*  80  145:monitorenter    
			{
				latestStartId = j;
	//   81  146:aload_0         
	//   82  147:iload_3         
	//   83  148:putfield        #265 <Field int latestStartId>
				if(callbacks.isEmpty())
	//*  84  151:getstatic       #62  <Field SimpleArrayMap callbacks>
	//*  85  154:invokevirtual   #263 <Method boolean SimpleArrayMap.isEmpty()>
	//*  86  157:ifeq            168
					stopSelf(latestStartId);
	//   87  160:aload_0         
	//   88  161:aload_0         
	//   89  162:getfield        #265 <Field int latestStartId>
	//   90  165:invokevirtual   #268 <Method void stopSelf(int)>
			}
	//   91  168:aload_1         
	//   92  169:monitorexit     
			return 2;
	//   93  170:iconst_2        
	//   94  171:ireturn         
		}
		break MISSING_BLOCK_LABEL_179;
		exception1;
	//   95  172:astore          5
		intent;
	//   96  174:aload_1         
		JVM INSTR monitorexit ;
	//   97  175:monitorexit     
		throw exception1;
	//   98  176:aload           5
	//   99  178:athrow          
		Log.e("FJD.GooglePlayReceiver", "Unknown action received, terminating");
	//  100  179:ldc1            #26  <String "FJD.GooglePlayReceiver">
	//  101  181:ldc1            #23  <String "Unknown action received, terminating">
	//  102  183:invokestatic    #322 <Method int Log.e(String, String)>
	//  103  186:pop             
		synchronized(callbacks)
	//* 104  187:getstatic       #62  <Field SimpleArrayMap callbacks>
	//* 105  190:astore_1        
	//* 106  191:aload_1         
	//* 107  192:monitorenter    
		{
			latestStartId = j;
	//  108  193:aload_0         
	//  109  194:iload_3         
	//  110  195:putfield        #265 <Field int latestStartId>
			if(callbacks.isEmpty())
	//* 111  198:getstatic       #62  <Field SimpleArrayMap callbacks>
	//* 112  201:invokevirtual   #263 <Method boolean SimpleArrayMap.isEmpty()>
	//* 113  204:ifeq            215
				stopSelf(latestStartId);
	//  114  207:aload_0         
	//  115  208:aload_0         
	//  116  209:getfield        #265 <Field int latestStartId>
	//  117  212:invokevirtual   #268 <Method void stopSelf(int)>
		}
	//  118  215:aload_1         
	//  119  216:monitorexit     
		return 2;
	//  120  217:iconst_2        
	//  121  218:ireturn         
		exception2;
	//  122  219:astore          5
		intent;
	//  123  221:aload_1         
		JVM INSTR monitorexit ;
	//  124  222:monitorexit     
		throw exception2;
	//  125  223:aload           5
	//  126  225:athrow          
		Exception exception3;
		exception3;
	//  127  226:astore          5
		synchronized(callbacks)
	//* 128  228:getstatic       #62  <Field SimpleArrayMap callbacks>
	//* 129  231:astore_1        
	//* 130  232:aload_1         
	//* 131  233:monitorenter    
		{
			latestStartId = j;
	//  132  234:aload_0         
	//  133  235:iload_3         
	//  134  236:putfield        #265 <Field int latestStartId>
			if(callbacks.isEmpty())
	//* 135  239:getstatic       #62  <Field SimpleArrayMap callbacks>
	//* 136  242:invokevirtual   #263 <Method boolean SimpleArrayMap.isEmpty()>
	//* 137  245:ifeq            256
				stopSelf(latestStartId);
	//  138  248:aload_0         
	//  139  249:aload_0         
	//  140  250:getfield        #265 <Field int latestStartId>
	//  141  253:invokevirtual   #268 <Method void stopSelf(int)>
		}
	//  142  256:aload_1         
	//  143  257:monitorexit     
		throw exception3;
	//  144  258:aload           5
	//  145  260:athrow          
		exception4;
	//  146  261:astore          5
		intent;
	//  147  263:aload_1         
		JVM INSTR monitorexit ;
	//  148  264:monitorexit     
		throw exception4;
	//  149  265:aload           5
	//  150  267:athrow          
	}

	JobInvocation prepareJob(Intent intent)
	{
		intent = ((Intent) (intent.getExtras()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #326 <Method Bundle Intent.getExtras()>
	//    2    4:astore_1        
		if(intent == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       19
		{
			Log.e("FJD.GooglePlayReceiver", "No data provided, terminating");
	//    5    9:ldc1            #26  <String "FJD.GooglePlayReceiver">
	//    6   11:ldc1            #17  <String "No data provided, terminating">
	//    7   13:invokestatic    #322 <Method int Log.e(String, String)>
	//    8   16:pop             
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		}
		intent = ((Intent) (callbackExtractor.extractCallback(((Bundle) (intent)))));
	//   11   19:aload_0         
	//   12   20:getfield        #70  <Field GooglePlayCallbackExtractor callbackExtractor>
	//   13   23:aload_1         
	//   14   24:invokevirtual   #330 <Method Pair GooglePlayCallbackExtractor.extractCallback(Bundle)>
	//   15   27:astore_1        
		if(intent == null)
	//*  16   28:aload_1         
	//*  17   29:ifnonnull       43
		{
			Log.i("FJD.GooglePlayReceiver", "no callback found");
	//   18   32:ldc1            #26  <String "FJD.GooglePlayReceiver">
	//   19   34:ldc2            #332 <String "no callback found">
	//   20   37:invokestatic    #335 <Method int Log.i(String, String)>
	//   21   40:pop             
			return null;
	//   22   41:aconst_null     
	//   23   42:areturn         
		} else
		{
			return prepareJob((JobCallback)((Pair) (intent)).first, (Bundle)((Pair) (intent)).second);
	//   24   43:aload_0         
	//   25   44:aload_1         
	//   26   45:getfield        #341 <Field Object Pair.first>
	//   27   48:checkcast       #159 <Class JobCallback>
	//   28   51:aload_1         
	//   29   52:getfield        #344 <Field Object Pair.second>
	//   30   55:checkcast       #346 <Class Bundle>
	//   31   58:invokevirtual   #349 <Method JobInvocation prepareJob(JobCallback, Bundle)>
	//   32   61:areturn         
		}
	}

	JobInvocation prepareJob(JobCallback jobcallback, Bundle bundle)
	{
		JobInvocation jobinvocation;
		jobinvocation = prefixedCoder.decodeIntentBundle(bundle);
	//    0    0:getstatic       #55  <Field JobCoder prefixedCoder>
	//    1    3:aload_2         
	//    2    4:invokevirtual   #353 <Method JobInvocation JobCoder.decodeIntentBundle(Bundle)>
	//    3    7:astore          5
		if(jobinvocation == null)
	//*   4    9:aload           5
	//*   5   11:ifnonnull       30
		{
			Log.e("FJD.GooglePlayReceiver", "unable to decode job");
	//    6   14:ldc1            #26  <String "FJD.GooglePlayReceiver">
	//    7   16:ldc2            #355 <String "unable to decode job">
	//    8   19:invokestatic    #322 <Method int Log.e(String, String)>
	//    9   22:pop             
			sendResultSafely(jobcallback, 2);
	//   10   23:aload_1         
	//   11   24:iconst_2        
	//   12   25:invokestatic    #303 <Method void sendResultSafely(JobCallback, int)>
			return null;
	//   13   28:aconst_null     
	//   14   29:areturn         
		}
		SimpleArrayMap simplearraymap1 = callbacks;
	//   15   30:getstatic       #62  <Field SimpleArrayMap callbacks>
	//   16   33:astore          4
		simplearraymap1;
	//   17   35:aload           4
		JVM INSTR monitorenter ;
	//   18   37:monitorenter    
		SimpleArrayMap simplearraymap = (SimpleArrayMap)callbacks.get(((Object) (jobinvocation.getService())));
	//   19   38:getstatic       #62  <Field SimpleArrayMap callbacks>
	//   20   41:aload           5
	//   21   43:invokevirtual   #260 <Method String JobInvocation.getService()>
	//   22   46:invokevirtual   #154 <Method Object SimpleArrayMap.get(Object)>
	//   23   49:checkcast       #57  <Class SimpleArrayMap>
	//   24   52:astore_3        
		bundle = ((Bundle) (simplearraymap));
	//   25   53:aload_3         
	//   26   54:astore_2        
		if(simplearraymap != null)
			break MISSING_BLOCK_LABEL_81;
	//   27   55:aload_3         
	//   28   56:ifnonnull       81
		bundle = ((Bundle) (new SimpleArrayMap(1)));
	//   29   59:new             #57  <Class SimpleArrayMap>
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:invokespecial   #60  <Method void SimpleArrayMap(int)>
	//   33   67:astore_2        
		callbacks.put(((Object) (jobinvocation.getService())), ((Object) (bundle)));
	//   34   68:getstatic       #62  <Field SimpleArrayMap callbacks>
	//   35   71:aload           5
	//   36   73:invokevirtual   #260 <Method String JobInvocation.getService()>
	//   37   76:aload_2         
	//   38   77:invokevirtual   #359 <Method Object SimpleArrayMap.put(Object, Object)>
	//   39   80:pop             
		((SimpleArrayMap) (bundle)).put(((Object) (jobinvocation.getTag())), ((Object) (jobcallback)));
	//   40   81:aload_2         
	//   41   82:aload           5
	//   42   84:invokevirtual   #269 <Method String JobInvocation.getTag()>
	//   43   87:aload_1         
	//   44   88:invokevirtual   #359 <Method Object SimpleArrayMap.put(Object, Object)>
	//   45   91:pop             
		simplearraymap1;
	//   46   92:aload           4
		JVM INSTR monitorexit ;
	//   47   94:monitorexit     
		return jobinvocation;
	//   48   95:aload           5
	//   49   97:areturn         
		jobcallback;
	//   50   98:astore_1        
		simplearraymap1;
	//   51   99:aload           4
		JVM INSTR monitorexit ;
	//   52  101:monitorexit     
		throw jobcallback;
	//   53  102:aload_1         
	//   54  103:athrow          
	}

	void setGooglePlayDriver(Driver driver1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		driver = driver1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #80  <Field Driver driver>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		driver1;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw driver1;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	void setValidationEnforcer(ValidationEnforcer validationenforcer)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		validationEnforcer = validationenforcer;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #115 <Field ValidationEnforcer validationEnforcer>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		validationenforcer;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw validationenforcer;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	static final String ACTION_EXECUTE = "com.google.android.gms.gcm.ACTION_TASK_READY";
	static final String ACTION_INITIALIZE = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
	private static final String ERROR_NO_DATA = "No data provided, terminating";
	private static final String ERROR_NULL_INTENT = "Null Intent passed, terminating";
	private static final String ERROR_UNKNOWN_ACTION = "Unknown action received, terminating";
	static final String TAG = "FJD.GooglePlayReceiver";
	private static final SimpleArrayMap callbacks = new SimpleArrayMap(1);
	private static final JobCoder prefixedCoder = new JobCoder("com.firebase.jobdispatcher.");
	private final GooglePlayCallbackExtractor callbackExtractor = new GooglePlayCallbackExtractor();
	Driver driver;
	private ExecutionDelegator executionDelegator;
	private int latestStartId;
	Messenger serviceMessenger;
	ValidationEnforcer validationEnforcer;

	static 
	{
	//    0    0:new             #47  <Class JobCoder>
	//    1    3:dup             
	//    2    4:ldc1            #49  <String "com.firebase.jobdispatcher.">
	//    3    6:invokespecial   #53  <Method void JobCoder(String)>
	//    4    9:putstatic       #55  <Field JobCoder prefixedCoder>
	//    5   12:new             #57  <Class SimpleArrayMap>
	//    6   15:dup             
	//    7   16:iconst_1        
	//    8   17:invokespecial   #60  <Method void SimpleArrayMap(int)>
	//    9   20:putstatic       #62  <Field SimpleArrayMap callbacks>
	//*  10   23:return          
	}
}
