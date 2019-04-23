// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.app.PendingIntent;
import android.content.*;

// Referenced classes of package com.firebase.jobdispatcher:
//			Driver, GooglePlayJobWriter, DefaultJobValidator, GooglePlayReceiver, 
//			JobValidator, JobParameters, Job

public final class GooglePlayDriver
	implements Driver
{

	public GooglePlayDriver(Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #62  <Field boolean available>
		context = context1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #64  <Field Context context>
		token = PendingIntent.getBroadcast(context1, 0, new Intent(), 0);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:iconst_0        
	//   11   17:new             #66  <Class Intent>
	//   12   20:dup             
	//   13   21:invokespecial   #67  <Method void Intent()>
	//   14   24:iconst_0        
	//   15   25:invokestatic    #73  <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   16   28:putfield        #75  <Field PendingIntent token>
	//   17   31:aload_0         
	//   18   32:new             #77  <Class GooglePlayJobWriter>
	//   19   35:dup             
	//   20   36:invokespecial   #78  <Method void GooglePlayJobWriter()>
	//   21   39:putfield        #80  <Field GooglePlayJobWriter writer>
		validator = ((JobValidator) (new DefaultJobValidator(context1)));
	//   22   42:aload_0         
	//   23   43:new             #82  <Class DefaultJobValidator>
	//   24   46:dup             
	//   25   47:aload_1         
	//   26   48:invokespecial   #84  <Method void DefaultJobValidator(Context)>
	//   27   51:putfield        #86  <Field JobValidator validator>
	//   28   54:return          
	}

	private Intent createScheduleRequest(JobParameters jobparameters)
	{
		Intent intent = createSchedulerIntent("SCHEDULE_TASK");
	//    0    0:aload_0         
	//    1    1:ldc1            #45  <String "SCHEDULE_TASK">
	//    2    3:invokespecial   #94  <Method Intent createSchedulerIntent(String)>
	//    3    6:astore_2        
		intent.putExtras(writer.writeToBundle(jobparameters, intent.getExtras()));
	//    4    7:aload_2         
	//    5    8:aload_0         
	//    6    9:getfield        #80  <Field GooglePlayJobWriter writer>
	//    7   12:aload_1         
	//    8   13:aload_2         
	//    9   14:invokevirtual   #98  <Method android.os.Bundle Intent.getExtras()>
	//   10   17:invokevirtual   #102 <Method android.os.Bundle GooglePlayJobWriter.writeToBundle(JobParameters, android.os.Bundle)>
	//   11   20:invokevirtual   #106 <Method Intent Intent.putExtras(android.os.Bundle)>
	//   12   23:pop             
		return intent;
	//   13   24:aload_2         
	//   14   25:areturn         
	}

	private Intent createSchedulerIntent(String s)
	{
		Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
	//    0    0:new             #66  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #10  <String "com.google.android.gms.gcm.ACTION_SCHEDULE">
	//    3    6:invokespecial   #110 <Method void Intent(String)>
	//    4    9:astore_2        
		intent.setPackage("com.google.android.gms");
	//    5   10:aload_2         
	//    6   11:ldc1            #13  <String "com.google.android.gms">
	//    7   13:invokevirtual   #113 <Method Intent Intent.setPackage(String)>
	//    8   16:pop             
		intent.putExtra("scheduler_action", s);
	//    9   17:aload_2         
	//   10   18:ldc1            #19  <String "scheduler_action">
	//   11   20:aload_1         
	//   12   21:invokevirtual   #117 <Method Intent Intent.putExtra(String, String)>
	//   13   24:pop             
		intent.putExtra("app", ((android.os.Parcelable) (token)));
	//   14   25:aload_2         
	//   15   26:ldc1            #25  <String "app">
	//   16   28:aload_0         
	//   17   29:getfield        #75  <Field PendingIntent token>
	//   18   32:invokevirtual   #120 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   19   35:pop             
		intent.putExtra("source", 8);
	//   20   36:aload_2         
	//   21   37:ldc1            #28  <String "source">
	//   22   39:bipush          8
	//   23   41:invokevirtual   #123 <Method Intent Intent.putExtra(String, int)>
	//   24   44:pop             
		intent.putExtra("source_version", 1);
	//   25   45:aload_2         
	//   26   46:ldc1            #31  <String "source_version">
	//   27   48:iconst_1        
	//   28   49:invokevirtual   #123 <Method Intent Intent.putExtra(String, int)>
	//   29   52:pop             
		return intent;
	//   30   53:aload_2         
	//   31   54:areturn         
	}

	public int cancel(String s)
	{
		context.sendBroadcast(createCancelRequest(s));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Context context>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #128 <Method Intent createCancelRequest(String)>
	//    5    9:invokevirtual   #134 <Method void Context.sendBroadcast(Intent)>
		return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public int cancelAll()
	{
		context.sendBroadcast(createBatchCancelRequest());
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Context context>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #141 <Method Intent createBatchCancelRequest()>
	//    4    8:invokevirtual   #134 <Method void Context.sendBroadcast(Intent)>
		return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
	}

	protected Intent createBatchCancelRequest()
	{
		Intent intent = createSchedulerIntent("CANCEL_ALL");
	//    0    0:aload_0         
	//    1    1:ldc1            #39  <String "CANCEL_ALL">
	//    2    3:invokespecial   #94  <Method Intent createSchedulerIntent(String)>
	//    3    6:astore_1        
		intent.putExtra("component", ((android.os.Parcelable) (new ComponentName(context, getReceiverClass()))));
	//    4    7:aload_1         
	//    5    8:ldc1            #16  <String "component">
	//    6   10:new             #143 <Class ComponentName>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #64  <Field Context context>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #147 <Method Class getReceiverClass()>
	//   12   22:invokespecial   #150 <Method void ComponentName(Context, Class)>
	//   13   25:invokevirtual   #120 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   14   28:pop             
		return intent;
	//   15   29:aload_1         
	//   16   30:areturn         
	}

	protected Intent createCancelRequest(String s)
	{
		Intent intent = createSchedulerIntent("CANCEL_TASK");
	//    0    0:aload_0         
	//    1    1:ldc1            #42  <String "CANCEL_TASK">
	//    2    3:invokespecial   #94  <Method Intent createSchedulerIntent(String)>
	//    3    6:astore_2        
		intent.putExtra("tag", s);
	//    4    7:aload_2         
	//    5    8:ldc1            #22  <String "tag">
	//    6   10:aload_1         
	//    7   11:invokevirtual   #117 <Method Intent Intent.putExtra(String, String)>
	//    8   14:pop             
		intent.putExtra("component", ((android.os.Parcelable) (new ComponentName(context, getReceiverClass()))));
	//    9   15:aload_2         
	//   10   16:ldc1            #16  <String "component">
	//   11   18:new             #143 <Class ComponentName>
	//   12   21:dup             
	//   13   22:aload_0         
	//   14   23:getfield        #64  <Field Context context>
	//   15   26:aload_0         
	//   16   27:invokevirtual   #147 <Method Class getReceiverClass()>
	//   17   30:invokespecial   #150 <Method void ComponentName(Context, Class)>
	//   18   33:invokevirtual   #120 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   19   36:pop             
		return intent;
	//   20   37:aload_2         
	//   21   38:areturn         
	}

	protected Class getReceiverClass()
	{
		return com/firebase/jobdispatcher/GooglePlayReceiver;
	//    0    0:ldc1            #152 <Class GooglePlayReceiver>
	//    1    2:areturn         
	}

	public JobValidator getValidator()
	{
		return validator;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field JobValidator validator>
	//    2    4:areturn         
	}

	public boolean isAvailable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public int schedule(Job job)
	{
		GooglePlayReceiver.onSchedule(job);
	//    0    0:aload_1         
	//    1    1:invokestatic    #164 <Method void GooglePlayReceiver.onSchedule(Job)>
		context.sendBroadcast(createScheduleRequest(((JobParameters) (job))));
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field Context context>
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #166 <Method Intent createScheduleRequest(JobParameters)>
	//    7   13:invokevirtual   #134 <Method void Context.sendBroadcast(Intent)>
		return 0;
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	private static final String ACTION_SCHEDULE = "com.google.android.gms.gcm.ACTION_SCHEDULE";
	static final String BACKEND_PACKAGE = "com.google.android.gms";
	private static final String BUNDLE_PARAM_COMPONENT = "component";
	private static final String BUNDLE_PARAM_SCHEDULER_ACTION = "scheduler_action";
	private static final String BUNDLE_PARAM_TAG = "tag";
	private static final String BUNDLE_PARAM_TOKEN = "app";
	private static final String INTENT_PARAM_SOURCE = "source";
	private static final String INTENT_PARAM_SOURCE_VERSION = "source_version";
	private static final int JOB_DISPATCHER_SOURCE_CODE = 8;
	private static final int JOB_DISPATCHER_SOURCE_VERSION_CODE = 1;
	private static final String SCHEDULER_ACTION_CANCEL_ALL = "CANCEL_ALL";
	private static final String SCHEDULER_ACTION_CANCEL_TASK = "CANCEL_TASK";
	private static final String SCHEDULER_ACTION_SCHEDULE_TASK = "SCHEDULE_TASK";
	private final boolean available = true;
	private final Context context;
	private final PendingIntent token;
	private final JobValidator validator;
	private final GooglePlayJobWriter writer = new GooglePlayJobWriter();
}
