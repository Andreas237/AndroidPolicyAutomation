// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.scheduling;

import android.content.Context;
import android.os.Bundle;
import com.birbit.android.jobqueue.log.JqLog;
import com.google.android.gms.gcm.GcmNetworkManager;
import com.google.android.gms.gcm.TaskParams;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.birbit.android.jobqueue.scheduling:
//			Scheduler, SchedulerConstraint

class GcmScheduler extends Scheduler
{
	private static class ResultCallback
	{

		public boolean get()
		{
			try
			{
				latch.await(600L, TimeUnit.SECONDS);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field CountDownLatch latch>
		//    2    4:ldc2w           #30  <Long 600L>
		//    3    7:getstatic       #37  <Field TimeUnit TimeUnit.SECONDS>
		//    4   10:invokevirtual   #41  <Method boolean CountDownLatch.await(long, TimeUnit)>
		//    5   13:pop             
			}
		//*   6   14:aload_0         
		//*   7   15:getfield        #24  <Field boolean reschedule>
		//*   8   18:ireturn         
			catch(InterruptedException interruptedexception)
		//*   9   19:astore_1        
			{
				JqLog.e("job did not finish in 10 minutes :/", new Object[0]);
		//   10   20:ldc1            #43  <String "job did not finish in 10 minutes :/">
		//   11   22:iconst_0        
		//   12   23:anewarray       Object[]
		//   13   26:invokestatic    #49  <Method void JqLog.e(String, Object[])>
			}
			return reschedule;
		//*  14   29:goto            14
		}

		void onDone(boolean flag)
		{
			reschedule = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #24  <Field boolean reschedule>
			latch.countDown();
		//    3    5:aload_0         
		//    4    6:getfield        #22  <Field CountDownLatch latch>
		//    5    9:invokevirtual   #54  <Method void CountDownLatch.countDown()>
		//    6   12:return          
		}

		CountDownLatch latch;
		volatile boolean reschedule;

		ResultCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			latch = new CountDownLatch(1);
		//    2    4:aload_0         
		//    3    5:new             #17  <Class CountDownLatch>
		//    4    8:dup             
		//    5    9:iconst_1        
		//    6   10:invokespecial   #20  <Method void CountDownLatch(int)>
		//    7   13:putfield        #22  <Field CountDownLatch latch>
			reschedule = false;
		//    8   16:aload_0         
		//    9   17:iconst_0        
		//   10   18:putfield        #24  <Field boolean reschedule>
		//   11   21:return          
		}
	}


	GcmScheduler(Context context, Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Scheduler()>
		serviceClass = class1;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #32  <Field Class serviceClass>
		gcmNetworkManager = GcmNetworkManager.getInstance(context.getApplicationContext());
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #38  <Method Context Context.getApplicationContext()>
	//    8   14:invokestatic    #44  <Method GcmNetworkManager GcmNetworkManager.getInstance(Context)>
	//    9   17:putfield        #46  <Field GcmNetworkManager gcmNetworkManager>
	//   10   20:return          
	}

	static SchedulerConstraint fromBundle(Bundle bundle)
		throws Exception
	{
		SchedulerConstraint schedulerconstraint = new SchedulerConstraint(bundle.getString("uuid"));
	//    0    0:new             #55  <Class SchedulerConstraint>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #20  <String "uuid">
	//    4    7:invokevirtual   #61  <Method String Bundle.getString(String)>
	//    5   10:invokespecial   #64  <Method void SchedulerConstraint(String)>
	//    6   13:astore_1        
		if(schedulerconstraint.getUuid() == null)
	//*   7   14:aload_1         
	//*   8   15:invokevirtual   #68  <Method String SchedulerConstraint.getUuid()>
	//*   9   18:ifnonnull       31
			schedulerconstraint.setUuid(UUID.randomUUID().toString());
	//   10   21:aload_1         
	//   11   22:invokestatic    #74  <Method UUID UUID.randomUUID()>
	//   12   25:invokevirtual   #77  <Method String UUID.toString()>
	//   13   28:invokevirtual   #80  <Method void SchedulerConstraint.setUuid(String)>
		schedulerconstraint.setNetworkStatus(bundle.getInt("networkStatus", 0));
	//   14   31:aload_1         
	//   15   32:aload_0         
	//   16   33:ldc1            #14  <String "networkStatus">
	//   17   35:iconst_0        
	//   18   36:invokevirtual   #84  <Method int Bundle.getInt(String, int)>
	//   19   39:invokevirtual   #88  <Method void SchedulerConstraint.setNetworkStatus(int)>
		schedulerconstraint.setDelayInMs(bundle.getLong("delay", 0L));
	//   20   42:aload_1         
	//   21   43:aload_0         
	//   22   44:ldc1            #11  <String "delay">
	//   23   46:lconst_0        
	//   24   47:invokevirtual   #92  <Method long Bundle.getLong(String, long)>
	//   25   50:invokevirtual   #96  <Method void SchedulerConstraint.setDelayInMs(long)>
		if(bundle.containsKey("deadline"))
	//*  26   53:aload_0         
	//*  27   54:ldc1            #17  <String "deadline">
	//*  28   56:invokevirtual   #100 <Method boolean Bundle.containsKey(String)>
	//*  29   59:ifeq            75
			schedulerconstraint.setOverrideDeadlineInMs(Long.valueOf(bundle.getLong("deadline")));
	//   30   62:aload_1         
	//   31   63:aload_0         
	//   32   64:ldc1            #17  <String "deadline">
	//   33   66:invokevirtual   #103 <Method long Bundle.getLong(String)>
	//   34   69:invokestatic    #109 <Method Long Long.valueOf(long)>
	//   35   72:invokevirtual   #113 <Method void SchedulerConstraint.setOverrideDeadlineInMs(Long)>
		return schedulerconstraint;
	//   36   75:aload_1         
	//   37   76:areturn         
	}

	static Bundle toBundle(SchedulerConstraint schedulerconstraint)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #57  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #117 <Method void Bundle()>
	//    3    7:astore_1        
		if(schedulerconstraint.getUuid() != null)
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #68  <Method String SchedulerConstraint.getUuid()>
	//*   6   12:ifnull          25
			bundle.putString("uuid", schedulerconstraint.getUuid());
	//    7   15:aload_1         
	//    8   16:ldc1            #20  <String "uuid">
	//    9   18:aload_0         
	//   10   19:invokevirtual   #68  <Method String SchedulerConstraint.getUuid()>
	//   11   22:invokevirtual   #121 <Method void Bundle.putString(String, String)>
		bundle.putInt("networkStatus", schedulerconstraint.getNetworkStatus());
	//   12   25:aload_1         
	//   13   26:ldc1            #14  <String "networkStatus">
	//   14   28:aload_0         
	//   15   29:invokevirtual   #125 <Method int SchedulerConstraint.getNetworkStatus()>
	//   16   32:invokevirtual   #129 <Method void Bundle.putInt(String, int)>
		bundle.putLong("delay", schedulerconstraint.getDelayInMs());
	//   17   35:aload_1         
	//   18   36:ldc1            #11  <String "delay">
	//   19   38:aload_0         
	//   20   39:invokevirtual   #133 <Method long SchedulerConstraint.getDelayInMs()>
	//   21   42:invokevirtual   #137 <Method void Bundle.putLong(String, long)>
		if(schedulerconstraint.getOverrideDeadlineInMs() != null)
	//*  22   45:aload_0         
	//*  23   46:invokevirtual   #141 <Method Long SchedulerConstraint.getOverrideDeadlineInMs()>
	//*  24   49:ifnull          65
			bundle.putLong("deadline", schedulerconstraint.getOverrideDeadlineInMs().longValue());
	//   25   52:aload_1         
	//   26   53:ldc1            #17  <String "deadline">
	//   27   55:aload_0         
	//   28   56:invokevirtual   #141 <Method Long SchedulerConstraint.getOverrideDeadlineInMs()>
	//   29   59:invokevirtual   #144 <Method long Long.longValue()>
	//   30   62:invokevirtual   #137 <Method void Bundle.putLong(String, long)>
		return bundle;
	//   31   65:aload_1         
	//   32   66:areturn         
	}

	private static int toNetworkState(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 46
	//	               1 44
	//	               2 48
		default:
			JqLog.e("unknown network status %d. Defaulting to CONNECTED", new Object[] {
				Integer.valueOf(i)
			});
	//    2   28:ldc1            #148 <String "unknown network status %d. Defaulting to CONNECTED">
	//    3   30:iconst_1        
	//    4   31:anewarray       Object[]
	//    5   34:dup             
	//    6   35:iconst_0        
	//    7   36:iload_0         
	//    8   37:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//    9   40:aastore         
	//   10   41:invokestatic    #161 <Method void JqLog.e(String, Object[])>
			// fall through

		case 1: // '\001'
			return 0;
	//   11   44:iconst_0        
	//   12   45:ireturn         

		case 0: // '\0'
			return 2;
	//   13   46:iconst_2        
	//   14   47:ireturn         

		case 2: // '\002'
			return 1;
	//   15   48:iconst_1        
	//   16   49:ireturn         
		}
	}

	public void cancelAll()
	{
		gcmNetworkManager.cancelAllTasks(serviceClass);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field GcmNetworkManager gcmNetworkManager>
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field Class serviceClass>
	//    4    8:invokevirtual   #166 <Method void GcmNetworkManager.cancelAllTasks(Class)>
	//    5   11:return          
	}

	long getExecutionWindowSizeInSeconds()
	{
		return TimeUnit.DAYS.toSeconds(7L);
	//    0    0:getstatic       #173 <Field TimeUnit TimeUnit.DAYS>
	//    1    3:ldc2w           #174 <Long 7L>
	//    2    6:invokevirtual   #179 <Method long TimeUnit.toSeconds(long)>
	//    3    9:lreturn         
	}

	public void onFinished(SchedulerConstraint schedulerconstraint, boolean flag)
	{
		Object obj = schedulerconstraint.getData();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #185 <Method Object SchedulerConstraint.getData()>
	//    2    4:astore_3        
		if(JqLog.isDebugEnabled())
	//*   3    5:invokestatic    #189 <Method boolean JqLog.isDebugEnabled()>
	//*   4    8:ifeq            24
			JqLog.d("finished job %s", new Object[] {
				schedulerconstraint
			});
	//    5   11:ldc1            #191 <String "finished job %s">
	//    6   13:iconst_1        
	//    7   14:anewarray       Object[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:aload_1         
	//   11   20:aastore         
	//   12   21:invokestatic    #194 <Method void JqLog.d(String, Object[])>
		if(obj instanceof ResultCallback)
	//*  13   24:aload_3         
	//*  14   25:instanceof      #6   <Class GcmScheduler$ResultCallback>
	//*  15   28:ifeq            39
			((ResultCallback)obj).onDone(flag);
	//   16   31:aload_3         
	//   17   32:checkcast       #6   <Class GcmScheduler$ResultCallback>
	//   18   35:iload_2         
	//   19   36:invokevirtual   #198 <Method void GcmScheduler$ResultCallback.onDone(boolean)>
	//   20   39:return          
	}

	int onStartJob(TaskParams taskparams)
	{
		ResultCallback resultcallback;
		try
		{
			taskparams = ((TaskParams) (fromBundle(taskparams.getExtras())));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #206 <Method Bundle TaskParams.getExtras()>
	//    2    4:invokestatic    #208 <Method SchedulerConstraint fromBundle(Bundle)>
	//    3    7:astore_1        
		}
	//*   4    8:invokestatic    #189 <Method boolean JqLog.isDebugEnabled()>
	//*   5   11:ifeq            27
	//*   6   14:ldc1            #210 <String "starting job %s">
	//*   7   16:iconst_1        
	//*   8   17:anewarray       Object[]
	//*   9   20:dup             
	//*  10   21:iconst_0        
	//*  11   22:aload_1         
	//*  12   23:aastore         
	//*  13   24:invokestatic    #194 <Method void JqLog.d(String, Object[])>
	//*  14   27:new             #6   <Class GcmScheduler$ResultCallback>
	//*  15   30:dup             
	//*  16   31:invokespecial   #211 <Method void GcmScheduler$ResultCallback()>
	//*  17   34:astore_2        
	//*  18   35:aload_1         
	//*  19   36:aload_2         
	//*  20   37:invokevirtual   #215 <Method void SchedulerConstraint.setData(Object)>
	//*  21   40:aload_0         
	//*  22   41:aload_1         
	//*  23   42:invokevirtual   #219 <Method boolean start(SchedulerConstraint)>
	//*  24   45:pop             
	//*  25   46:aload_2         
	//*  26   47:invokevirtual   #222 <Method boolean GcmScheduler$ResultCallback.get()>
	//*  27   50:ifeq            68
	//*  28   53:iconst_1        
	//*  29   54:ireturn         
		// Misplaced declaration of an exception variable
		catch(TaskParams taskparams)
	//*  30   55:astore_1        
		{
			JqLog.e(((Throwable) (taskparams)), "bad bundle from GcmScheduler. Ignoring the call", new Object[0]);
	//   31   56:aload_1         
	//   32   57:ldc1            #224 <String "bad bundle from GcmScheduler. Ignoring the call">
	//   33   59:iconst_0        
	//   34   60:anewarray       Object[]
	//   35   63:invokestatic    #227 <Method void JqLog.e(Throwable, String, Object[])>
			return 0;
	//   36   66:iconst_0        
	//   37   67:ireturn         
		}
		if(JqLog.isDebugEnabled())
			JqLog.d("starting job %s", new Object[] {
				taskparams
			});
		resultcallback = new ResultCallback();
		((SchedulerConstraint) (taskparams)).setData(((Object) (resultcallback)));
		start(((SchedulerConstraint) (taskparams)));
		return !resultcallback.get() ? 0 : 1;
	//   38   68:iconst_0        
	//   39   69:ireturn         
	}

	public void request(SchedulerConstraint schedulerconstraint)
	{
		if(JqLog.isDebugEnabled())
	//*   0    0:invokestatic    #189 <Method boolean JqLog.isDebugEnabled()>
	//*   1    3:ifeq            19
			JqLog.d("creating gcm wake up request for %s", new Object[] {
				schedulerconstraint
			});
	//    2    6:ldc1            #231 <String "creating gcm wake up request for %s">
	//    3    8:iconst_1        
	//    4    9:anewarray       Object[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:aload_1         
	//    8   15:aastore         
	//    9   16:invokestatic    #194 <Method void JqLog.d(String, Object[])>
		com.google.android.gms.gcm.OneoffTask.Builder builder = (new com.google.android.gms.gcm.OneoffTask.Builder()).setRequiredNetwork(toNetworkState(schedulerconstraint.getNetworkStatus())).setPersisted(true).setService(serviceClass).setTag(schedulerconstraint.getUuid()).setExtras(toBundle(schedulerconstraint));
	//   10   19:new             #233 <Class com.google.android.gms.gcm.OneoffTask$Builder>
	//   11   22:dup             
	//   12   23:invokespecial   #234 <Method void com.google.android.gms.gcm.OneoffTask$Builder()>
	//   13   26:aload_1         
	//   14   27:invokevirtual   #125 <Method int SchedulerConstraint.getNetworkStatus()>
	//   15   30:invokestatic    #236 <Method int toNetworkState(int)>
	//   16   33:invokevirtual   #240 <Method com.google.android.gms.gcm.OneoffTask$Builder com.google.android.gms.gcm.OneoffTask$Builder.setRequiredNetwork(int)>
	//   17   36:iconst_1        
	//   18   37:invokevirtual   #244 <Method com.google.android.gms.gcm.OneoffTask$Builder com.google.android.gms.gcm.OneoffTask$Builder.setPersisted(boolean)>
	//   19   40:aload_0         
	//   20   41:getfield        #32  <Field Class serviceClass>
	//   21   44:invokevirtual   #248 <Method com.google.android.gms.gcm.OneoffTask$Builder com.google.android.gms.gcm.OneoffTask$Builder.setService(Class)>
	//   22   47:aload_1         
	//   23   48:invokevirtual   #68  <Method String SchedulerConstraint.getUuid()>
	//   24   51:invokevirtual   #252 <Method com.google.android.gms.gcm.OneoffTask$Builder com.google.android.gms.gcm.OneoffTask$Builder.setTag(String)>
	//   25   54:aload_1         
	//   26   55:invokestatic    #254 <Method Bundle toBundle(SchedulerConstraint)>
	//   27   58:invokevirtual   #258 <Method com.google.android.gms.gcm.OneoffTask$Builder com.google.android.gms.gcm.OneoffTask$Builder.setExtras(Bundle)>
	//   28   61:astore          8
		long l;
		long l1;
		long l2;
		if(schedulerconstraint.getOverrideDeadlineInMs() == null)
	//*  29   63:aload_1         
	//*  30   64:invokevirtual   #141 <Method Long SchedulerConstraint.getOverrideDeadlineInMs()>
	//*  31   67:ifnonnull       145
			l = schedulerconstraint.getDelayInMs() + TimeUnit.SECONDS.toMillis(getExecutionWindowSizeInSeconds());
	//   32   70:aload_1         
	//   33   71:invokevirtual   #133 <Method long SchedulerConstraint.getDelayInMs()>
	//   34   74:getstatic       #261 <Field TimeUnit TimeUnit.SECONDS>
	//   35   77:aload_0         
	//   36   78:invokevirtual   #263 <Method long getExecutionWindowSizeInSeconds()>
	//   37   81:invokevirtual   #266 <Method long TimeUnit.toMillis(long)>
	//   38   84:ladd            
	//   39   85:lstore_2        
		else
	//*  40   86:getstatic       #269 <Field TimeUnit TimeUnit.MILLISECONDS>
	//*  41   89:aload_1         
	//*  42   90:invokevirtual   #133 <Method long SchedulerConstraint.getDelayInMs()>
	//*  43   93:invokevirtual   #179 <Method long TimeUnit.toSeconds(long)>
	//*  44   96:lstore          6
	//*  45   98:getstatic       #269 <Field TimeUnit TimeUnit.MILLISECONDS>
	//*  46  101:lload_2         
	//*  47  102:invokevirtual   #179 <Method long TimeUnit.toSeconds(long)>
	//*  48  105:lstore          4
	//*  49  107:lload           4
	//*  50  109:lstore_2        
	//*  51  110:lload           4
	//*  52  112:lload           6
	//*  53  114:lcmp            
	//*  54  115:ifgt            123
	//*  55  118:lload           6
	//*  56  120:lconst_1        
	//*  57  121:ladd            
	//*  58  122:lstore_2        
	//*  59  123:aload           8
	//*  60  125:lload           6
	//*  61  127:lload_2         
	//*  62  128:invokevirtual   #273 <Method com.google.android.gms.gcm.OneoffTask$Builder com.google.android.gms.gcm.OneoffTask$Builder.setExecutionWindow(long, long)>
	//*  63  131:pop             
	//*  64  132:aload_0         
	//*  65  133:getfield        #46  <Field GcmNetworkManager gcmNetworkManager>
	//*  66  136:aload           8
	//*  67  138:invokevirtual   #277 <Method com.google.android.gms.gcm.OneoffTask com.google.android.gms.gcm.OneoffTask$Builder.build()>
	//*  68  141:invokevirtual   #281 <Method void GcmNetworkManager.schedule(com.google.android.gms.gcm.Task)>
	//*  69  144:return          
			l = schedulerconstraint.getOverrideDeadlineInMs().longValue();
	//   70  145:aload_1         
	//   71  146:invokevirtual   #141 <Method Long SchedulerConstraint.getOverrideDeadlineInMs()>
	//   72  149:invokevirtual   #144 <Method long Long.longValue()>
	//   73  152:lstore_2        
		l2 = TimeUnit.MILLISECONDS.toSeconds(schedulerconstraint.getDelayInMs());
		l1 = TimeUnit.MILLISECONDS.toSeconds(l);
		l = l1;
		if(l1 <= l2)
			l = l2 + 1L;
		builder.setExecutionWindow(l2, l);
		gcmNetworkManager.schedule(((com.google.android.gms.gcm.Task) (builder.build())));
	//*  74  153:goto            86
	}

	private static final String KEY_DELAY = "delay";
	private static final String KEY_NETWORK_STATUS = "networkStatus";
	private static final String KEY_OVERRIDE_DEADLINE = "deadline";
	private static final String KEY_UUID = "uuid";
	GcmNetworkManager gcmNetworkManager;
	final Class serviceClass;
}
