// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;

// Referenced classes of package com.firebase.jobdispatcher:
//			JobParameters, JobServiceConnection, JobInvocation, IJobCallback, 
//			GooglePlayReceiver, JobCoder

class ExecutionDelegator
{
	static interface JobFinishedCallback
	{

		public abstract void onJobFinished(JobInvocation jobinvocation, int i);
	}


	ExecutionDelegator(Context context1, JobFinishedCallback jobfinishedcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #6   <Class ExecutionDelegator$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #37  <Method void ExecutionDelegator$1(ExecutionDelegator)>
	//    7   13:putfield        #39  <Field IJobCallback execCallback>
		context = context1;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #41  <Field Context context>
		jobFinishedCallback = jobfinishedcallback;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #43  <Field ExecutionDelegator$JobFinishedCallback jobFinishedCallback>
	//   14   26:return          
	}

	static void cleanServiceConnections()
	{
		synchronized(serviceConnections)
	//*   0    0:getstatic       #31  <Field SimpleArrayMap serviceConnections>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			serviceConnections.clear();
	//    4    6:getstatic       #31  <Field SimpleArrayMap serviceConnections>
	//    5    9:invokevirtual   #54  <Method void SimpleArrayMap.clear()>
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

	private Intent createBindIntent(JobParameters jobparameters)
	{
		Intent intent = new Intent("com.firebase.jobdispatcher.ACTION_EXECUTE");
	//    0    0:new             #60  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #62  <String "com.firebase.jobdispatcher.ACTION_EXECUTE">
	//    3    6:invokespecial   #65  <Method void Intent(String)>
	//    4    9:astore_2        
		intent.setClassName(context, jobparameters.getService());
	//    5   10:aload_2         
	//    6   11:aload_0         
	//    7   12:getfield        #41  <Field Context context>
	//    8   15:aload_1         
	//    9   16:invokeinterface #71  <Method String JobParameters.getService()>
	//   10   21:invokevirtual   #75  <Method Intent Intent.setClassName(Context, String)>
	//   11   24:pop             
		return intent;
	//   12   25:aload_2         
	//   13   26:areturn         
	}

	static JobServiceConnection getJobServiceConnection(String s)
	{
		synchronized(serviceConnections)
	//*   0    0:getstatic       #31  <Field SimpleArrayMap serviceConnections>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			s = ((String) ((JobServiceConnection)serviceConnections.get(((Object) (s)))));
	//    4    6:getstatic       #31  <Field SimpleArrayMap serviceConnections>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #81  <Method Object SimpleArrayMap.get(Object)>
	//    7   13:checkcast       #83  <Class JobServiceConnection>
	//    8   16:astore_0        
		}
	//    9   17:aload_1         
	//   10   18:monitorexit     
		return ((JobServiceConnection) (s));
	//   11   19:aload_0         
	//   12   20:areturn         
		s;
	//   13   21:astore_0        
		simplearraymap;
	//   14   22:aload_1         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		throw s;
	//   16   24:aload_0         
	//   17   25:athrow          
	}

	private void onJobFinishedMessage(JobInvocation jobinvocation, int i)
	{
		SimpleArrayMap simplearraymap = serviceConnections;
	//    0    0:getstatic       #31  <Field SimpleArrayMap serviceConnections>
	//    1    3:astore_3        
		simplearraymap;
	//    2    4:aload_3         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		JobServiceConnection jobserviceconnection = (JobServiceConnection)serviceConnections.get(((Object) (jobinvocation.getService())));
	//    4    6:getstatic       #31  <Field SimpleArrayMap serviceConnections>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #86  <Method String JobInvocation.getService()>
	//    7   13:invokevirtual   #81  <Method Object SimpleArrayMap.get(Object)>
	//    8   16:checkcast       #83  <Class JobServiceConnection>
	//    9   19:astore          4
		if(jobserviceconnection == null)
			break MISSING_BLOCK_LABEL_51;
	//   10   21:aload           4
	//   11   23:ifnull          51
		jobserviceconnection.onJobFinished(jobinvocation);
	//   12   26:aload           4
	//   13   28:aload_1         
	//   14   29:invokevirtual   #90  <Method void JobServiceConnection.onJobFinished(JobInvocation)>
		if(jobserviceconnection.wasUnbound())
	//*  15   32:aload           4
	//*  16   34:invokevirtual   #94  <Method boolean JobServiceConnection.wasUnbound()>
	//*  17   37:ifeq            51
			serviceConnections.remove(((Object) (jobinvocation.getService())));
	//   18   40:getstatic       #31  <Field SimpleArrayMap serviceConnections>
	//   19   43:aload_1         
	//   20   44:invokevirtual   #86  <Method String JobInvocation.getService()>
	//   21   47:invokevirtual   #97  <Method Object SimpleArrayMap.remove(Object)>
	//   22   50:pop             
		simplearraymap;
	//   23   51:aload_3         
		JVM INSTR monitorexit ;
	//   24   52:monitorexit     
		jobFinishedCallback.onJobFinished(jobinvocation, i);
	//   25   53:aload_0         
	//   26   54:getfield        #43  <Field ExecutionDelegator$JobFinishedCallback jobFinishedCallback>
	//   27   57:aload_1         
	//   28   58:iload_2         
	//   29   59:invokeinterface #99  <Method void ExecutionDelegator$JobFinishedCallback.onJobFinished(JobInvocation, int)>
		return;
	//   30   64:return          
		jobinvocation;
	//   31   65:astore_1        
		simplearraymap;
	//   32   66:aload_3         
		JVM INSTR monitorexit ;
	//   33   67:monitorexit     
		throw jobinvocation;
	//   34   68:aload_1         
	//   35   69:athrow          
	}

	static void stopJob(JobInvocation jobinvocation, boolean flag)
	{
		SimpleArrayMap simplearraymap = serviceConnections;
	//    0    0:getstatic       #31  <Field SimpleArrayMap serviceConnections>
	//    1    3:astore_2        
		simplearraymap;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		JobServiceConnection jobserviceconnection = (JobServiceConnection)serviceConnections.get(((Object) (jobinvocation.getService())));
	//    4    6:getstatic       #31  <Field SimpleArrayMap serviceConnections>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #86  <Method String JobInvocation.getService()>
	//    7   13:invokevirtual   #81  <Method Object SimpleArrayMap.get(Object)>
	//    8   16:checkcast       #83  <Class JobServiceConnection>
	//    9   19:astore_3        
		if(jobserviceconnection == null)
			break MISSING_BLOCK_LABEL_48;
	//   10   20:aload_3         
	//   11   21:ifnull          48
		jobserviceconnection.onStop(jobinvocation, flag);
	//   12   24:aload_3         
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:invokevirtual   #104 <Method void JobServiceConnection.onStop(JobInvocation, boolean)>
		if(jobserviceconnection.wasUnbound())
	//*  16   30:aload_3         
	//*  17   31:invokevirtual   #94  <Method boolean JobServiceConnection.wasUnbound()>
	//*  18   34:ifeq            48
			serviceConnections.remove(((Object) (jobinvocation.getService())));
	//   19   37:getstatic       #31  <Field SimpleArrayMap serviceConnections>
	//   20   40:aload_0         
	//   21   41:invokevirtual   #86  <Method String JobInvocation.getService()>
	//   22   44:invokevirtual   #97  <Method Object SimpleArrayMap.remove(Object)>
	//   23   47:pop             
		simplearraymap;
	//   24   48:aload_2         
		JVM INSTR monitorexit ;
	//   25   49:monitorexit     
		return;
	//   26   50:return          
		jobinvocation;
	//   27   51:astore_0        
		simplearraymap;
	//   28   52:aload_2         
		JVM INSTR monitorexit ;
	//   29   53:monitorexit     
		throw jobinvocation;
	//   30   54:aload_0         
	//   31   55:athrow          
	}

	void executeJob(JobInvocation jobinvocation)
	{
		if(jobinvocation == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		SimpleArrayMap simplearraymap = serviceConnections;
	//    3    5:getstatic       #31  <Field SimpleArrayMap serviceConnections>
	//    4    8:astore          4
		simplearraymap;
	//    5   10:aload           4
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		JobServiceConnection jobserviceconnection1 = (JobServiceConnection)serviceConnections.get(((Object) (jobinvocation.getService())));
	//    7   13:getstatic       #31  <Field SimpleArrayMap serviceConnections>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #86  <Method String JobInvocation.getService()>
	//   10   20:invokevirtual   #81  <Method Object SimpleArrayMap.get(Object)>
	//   11   23:checkcast       #83  <Class JobServiceConnection>
	//   12   26:astore_3        
		if(jobserviceconnection1 == null)
			break MISSING_BLOCK_LABEL_61;
	//   13   27:aload_3         
	//   14   28:ifnull          61
		if(jobserviceconnection1.wasUnbound())
			break MISSING_BLOCK_LABEL_61;
	//   15   31:aload_3         
	//   16   32:invokevirtual   #94  <Method boolean JobServiceConnection.wasUnbound()>
	//   17   35:ifne            61
		JobServiceConnection jobserviceconnection = jobserviceconnection1;
	//   18   38:aload_3         
	//   19   39:astore_2        
		if(!jobserviceconnection1.hasJobInvocation(jobinvocation))
			break MISSING_BLOCK_LABEL_89;
	//   20   40:aload_3         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #109 <Method boolean JobServiceConnection.hasJobInvocation(JobInvocation)>
	//   23   45:ifeq            89
		jobserviceconnection = jobserviceconnection1;
	//   24   48:aload_3         
	//   25   49:astore_2        
		if(jobserviceconnection1.isConnected())
			break MISSING_BLOCK_LABEL_89;
	//   26   50:aload_3         
	//   27   51:invokevirtual   #112 <Method boolean JobServiceConnection.isConnected()>
	//   28   54:ifne            89
		simplearraymap;
	//   29   57:aload           4
		JVM INSTR monitorexit ;
	//   30   59:monitorexit     
		return;
	//   31   60:return          
		jobserviceconnection = new JobServiceConnection(execCallback, context);
	//   32   61:new             #83  <Class JobServiceConnection>
	//   33   64:dup             
	//   34   65:aload_0         
	//   35   66:getfield        #39  <Field IJobCallback execCallback>
	//   36   69:aload_0         
	//   37   70:getfield        #41  <Field Context context>
	//   38   73:invokespecial   #115 <Method void JobServiceConnection(IJobCallback, Context)>
	//   39   76:astore_2        
		serviceConnections.put(((Object) (jobinvocation.getService())), ((Object) (jobserviceconnection)));
	//   40   77:getstatic       #31  <Field SimpleArrayMap serviceConnections>
	//   41   80:aload_1         
	//   42   81:invokevirtual   #86  <Method String JobInvocation.getService()>
	//   43   84:aload_2         
	//   44   85:invokevirtual   #119 <Method Object SimpleArrayMap.put(Object, Object)>
	//   45   88:pop             
		if(!jobserviceconnection.startJob(jobinvocation) && !context.bindService(createBindIntent(((JobParameters) (jobinvocation))), ((android.content.ServiceConnection) (jobserviceconnection)), 1))
	//*  46   89:aload_2         
	//*  47   90:aload_1         
	//*  48   91:invokevirtual   #122 <Method boolean JobServiceConnection.startJob(JobInvocation)>
	//*  49   94:ifne            152
	//*  50   97:aload_0         
	//*  51   98:getfield        #41  <Field Context context>
	//*  52  101:aload_0         
	//*  53  102:aload_1         
	//*  54  103:invokespecial   #124 <Method Intent createBindIntent(JobParameters)>
	//*  55  106:aload_2         
	//*  56  107:iconst_1        
	//*  57  108:invokevirtual   #130 <Method boolean Context.bindService(Intent, android.content.ServiceConnection, int)>
	//*  58  111:ifne            152
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   59  114:new             #132 <Class StringBuilder>
	//   60  117:dup             
	//   61  118:invokespecial   #133 <Method void StringBuilder()>
	//   62  121:astore_3        
			stringbuilder.append("Unable to bind to ");
	//   63  122:aload_3         
	//   64  123:ldc1            #135 <String "Unable to bind to ">
	//   65  125:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   66  128:pop             
			stringbuilder.append(jobinvocation.getService());
	//   67  129:aload_3         
	//   68  130:aload_1         
	//   69  131:invokevirtual   #86  <Method String JobInvocation.getService()>
	//   70  134:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   71  137:pop             
			Log.e("FJD.ExternalReceiver", stringbuilder.toString());
	//   72  138:ldc1            #13  <String "FJD.ExternalReceiver">
	//   73  140:aload_3         
	//   74  141:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   75  144:invokestatic    #148 <Method int Log.e(String, String)>
	//   76  147:pop             
			jobserviceconnection.unbind();
	//   77  148:aload_2         
	//   78  149:invokevirtual   #151 <Method void JobServiceConnection.unbind()>
		}
		simplearraymap;
	//   79  152:aload           4
		JVM INSTR monitorexit ;
	//   80  154:monitorexit     
		return;
	//   81  155:return          
		jobinvocation;
	//   82  156:astore_1        
		simplearraymap;
	//   83  157:aload           4
		JVM INSTR monitorexit ;
	//   84  159:monitorexit     
		throw jobinvocation;
	//   85  160:aload_1         
	//   86  161:athrow          
	}

	static final String TAG = "FJD.ExternalReceiver";
	private static final SimpleArrayMap serviceConnections = new SimpleArrayMap();
	private final Context context;
	private final IJobCallback execCallback = new IJobCallback.Stub() {

		public void jobFinished(Bundle bundle, int i)
		{
			bundle = ((Bundle) (GooglePlayReceiver.getJobCoder().decode(bundle)));
		//    0    0:invokestatic    #24  <Method JobCoder GooglePlayReceiver.getJobCoder()>
		//    1    3:aload_1         
		//    2    4:invokevirtual   #30  <Method JobInvocation$Builder JobCoder.decode(Bundle)>
		//    3    7:astore_1        
			if(bundle == null)
		//*   4    8:aload_1         
		//*   5    9:ifnonnull       21
			{
				Log.wtf("FJD.ExternalReceiver", "jobFinished: unknown invocation provided");
		//    6   12:ldc1            #32  <String "FJD.ExternalReceiver">
		//    7   14:ldc1            #34  <String "jobFinished: unknown invocation provided">
		//    8   16:invokestatic    #40  <Method int Log.wtf(String, String)>
		//    9   19:pop             
				return;
		//   10   20:return          
			} else
			{
				onJobFinishedMessage(((JobInvocation.Builder) (bundle)).build(), i);
		//   11   21:aload_0         
		//   12   22:getfield        #12  <Field ExecutionDelegator this$0>
		//   13   25:aload_1         
		//   14   26:invokevirtual   #46  <Method JobInvocation JobInvocation$Builder.build()>
		//   15   29:iload_2         
		//   16   30:invokestatic    #50  <Method void ExecutionDelegator.access$000(ExecutionDelegator, JobInvocation, int)>
				return;
		//   17   33:return          
			}
		}

		final ExecutionDelegator this$0;

			
			{
				this$0 = ExecutionDelegator.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field ExecutionDelegator this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void IJobCallback$Stub()>
			//    5    9:return          
			}
	}
;
	private final JobFinishedCallback jobFinishedCallback;

	static 
	{
	//    0    0:new             #26  <Class SimpleArrayMap>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void SimpleArrayMap()>
	//    3    7:putstatic       #31  <Field SimpleArrayMap serviceConnections>
	//*   4   10:return          
	}


/*
	static void access$000(ExecutionDelegator executiondelegator, JobInvocation jobinvocation, int i)
	{
		executiondelegator.onJobFinishedMessage(jobinvocation, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #49  <Method void onJobFinishedMessage(JobInvocation, int)>
		return;
	//    4    6:return          
	}

*/
}
