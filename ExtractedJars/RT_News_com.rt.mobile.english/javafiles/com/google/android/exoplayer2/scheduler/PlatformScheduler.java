// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.scheduler;

import android.app.job.*;
import android.content.*;
import android.os.PersistableBundle;
import com.google.android.exoplayer2.util.Util;

// Referenced classes of package com.google.android.exoplayer2.scheduler:
//			Scheduler, Requirements

public final class PlatformScheduler
	implements Scheduler
{
	public static final class PlatformSchedulerService extends JobService
	{

		public boolean onStartJob(JobParameters jobparameters)
		{
			PlatformScheduler.logd("PlatformSchedulerService started");
		//    0    0:ldc1            #16  <String "PlatformSchedulerService started">
		//    1    2:invokestatic    #20  <Method void PlatformScheduler.access$000(String)>
			Object obj = ((Object) (jobparameters.getExtras()));
		//    2    5:aload_1         
		//    3    6:invokevirtual   #26  <Method PersistableBundle JobParameters.getExtras()>
		//    4    9:astore_2        
			if((new Requirements(((PersistableBundle) (obj)).getInt("requirements"))).checkRequirements(((Context) (this))))
		//*   5   10:new             #28  <Class Requirements>
		//*   6   13:dup             
		//*   7   14:aload_2         
		//*   8   15:ldc1            #30  <String "requirements">
		//*   9   17:invokevirtual   #36  <Method int PersistableBundle.getInt(String)>
		//*  10   20:invokespecial   #39  <Method void Requirements(int)>
		//*  11   23:aload_0         
		//*  12   24:invokevirtual   #43  <Method boolean Requirements.checkRequirements(Context)>
		//*  13   27:ifeq            118
			{
				PlatformScheduler.logd("Requirements are met");
		//   14   30:ldc1            #45  <String "Requirements are met">
		//   15   32:invokestatic    #20  <Method void PlatformScheduler.access$000(String)>
				jobparameters = ((JobParameters) (((PersistableBundle) (obj)).getString("service_action")));
		//   16   35:aload_2         
		//   17   36:ldc1            #47  <String "service_action">
		//   18   38:invokevirtual   #51  <Method String PersistableBundle.getString(String)>
		//   19   41:astore_1        
				obj = ((Object) (((PersistableBundle) (obj)).getString("service_package")));
		//   20   42:aload_2         
		//   21   43:ldc1            #53  <String "service_package">
		//   22   45:invokevirtual   #51  <Method String PersistableBundle.getString(String)>
		//   23   48:astore_2        
				Intent intent = (new Intent(((String) (jobparameters)))).setPackage(((String) (obj)));
		//   24   49:new             #55  <Class Intent>
		//   25   52:dup             
		//   26   53:aload_1         
		//   27   54:invokespecial   #57  <Method void Intent(String)>
		//   28   57:aload_2         
		//   29   58:invokevirtual   #61  <Method Intent Intent.setPackage(String)>
		//   30   61:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
		//   31   62:new             #63  <Class StringBuilder>
		//   32   65:dup             
		//   33   66:invokespecial   #64  <Method void StringBuilder()>
		//   34   69:astore          4
				stringbuilder.append("Starting service action: ");
		//   35   71:aload           4
		//   36   73:ldc1            #66  <String "Starting service action: ">
		//   37   75:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
		//   38   78:pop             
				stringbuilder.append(((String) (jobparameters)));
		//   39   79:aload           4
		//   40   81:aload_1         
		//   41   82:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
		//   42   85:pop             
				stringbuilder.append(" package: ");
		//   43   86:aload           4
		//   44   88:ldc1            #72  <String " package: ">
		//   45   90:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
		//   46   93:pop             
				stringbuilder.append(((String) (obj)));
		//   47   94:aload           4
		//   48   96:aload_2         
		//   49   97:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
		//   50  100:pop             
				PlatformScheduler.logd(stringbuilder.toString());
		//   51  101:aload           4
		//   52  103:invokevirtual   #76  <Method String StringBuilder.toString()>
		//   53  106:invokestatic    #20  <Method void PlatformScheduler.access$000(String)>
				Util.startForegroundService(((Context) (this)), intent);
		//   54  109:aload_0         
		//   55  110:aload_3         
		//   56  111:invokestatic    #82  <Method ComponentName Util.startForegroundService(Context, Intent)>
		//   57  114:pop             
			} else
		//*  58  115:goto            129
			{
				PlatformScheduler.logd("Requirements are not met");
		//   59  118:ldc1            #84  <String "Requirements are not met">
		//   60  120:invokestatic    #20  <Method void PlatformScheduler.access$000(String)>
				jobFinished(jobparameters, true);
		//   61  123:aload_0         
		//   62  124:aload_1         
		//   63  125:iconst_1        
		//   64  126:invokevirtual   #88  <Method void jobFinished(JobParameters, boolean)>
			}
			return false;
		//   65  129:iconst_0        
		//   66  130:ireturn         
		}

		public boolean onStopJob(JobParameters jobparameters)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public PlatformSchedulerService()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void JobService()>
		//    2    4:return          
		}
	}


	public PlatformScheduler(Context context, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		jobId = i;
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:putfield        #40  <Field int jobId>
		jobServiceComponentName = new ComponentName(context, com/google/android/exoplayer2/scheduler/PlatformScheduler$PlatformSchedulerService);
	//    5    9:aload_0         
	//    6   10:new             #42  <Class ComponentName>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:ldc1            #8   <Class PlatformScheduler$PlatformSchedulerService>
	//   10   17:invokespecial   #45  <Method void ComponentName(Context, Class)>
	//   11   20:putfield        #47  <Field ComponentName jobServiceComponentName>
		jobScheduler = (JobScheduler)context.getSystemService("jobscheduler");
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:ldc1            #49  <String "jobscheduler">
	//   15   27:invokevirtual   #55  <Method Object Context.getSystemService(String)>
	//   16   30:checkcast       #57  <Class JobScheduler>
	//   17   33:putfield        #59  <Field JobScheduler jobScheduler>
	//   18   36:return          
	}

	private static JobInfo buildJobInfo(int i, ComponentName componentname, Requirements requirements, String s, String s1)
	{
		componentname = ((ComponentName) (new android.app.job.JobInfo.Builder(i, componentname)));
	//    0    0:new             #70  <Class android.app.job.JobInfo$Builder>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #73  <Method void android.app.job.JobInfo$Builder(int, ComponentName)>
	//    5    9:astore_1        
		switch(requirements.getRequiredNetworkType())
	//*   6   10:aload_2         
	//*   7   11:invokevirtual   #79  <Method int Requirements.getRequiredNetworkType()>
		{
	//*   8   14:tableswitch     0 4: default 48
	//	               0 108
	//	               1 103
	//	               2 98
	//	               3 77
	//	               4 56
		default:
			throw new UnsupportedOperationException();
	//    9   48:new             #81  <Class UnsupportedOperationException>
	//   10   51:dup             
	//   11   52:invokespecial   #82  <Method void UnsupportedOperationException()>
	//   12   55:athrow          

		case 4: // '\004'
			if(Util.SDK_INT >= 26)
	//*  13   56:getstatic       #87  <Field int Util.SDK_INT>
	//*  14   59:bipush          26
	//*  15   61:icmplt          69
				i = 4;
	//   16   64:iconst_4        
	//   17   65:istore_0        
			else
	//*  18   66:goto            110
				throw new UnsupportedOperationException();
	//   19   69:new             #81  <Class UnsupportedOperationException>
	//   20   72:dup             
	//   21   73:invokespecial   #82  <Method void UnsupportedOperationException()>
	//   22   76:athrow          
			break;

		case 3: // '\003'
			if(Util.SDK_INT >= 24)
	//*  23   77:getstatic       #87  <Field int Util.SDK_INT>
	//*  24   80:bipush          24
	//*  25   82:icmplt          90
				i = 3;
	//   26   85:iconst_3        
	//   27   86:istore_0        
			else
	//*  28   87:goto            110
				throw new UnsupportedOperationException();
	//   29   90:new             #81  <Class UnsupportedOperationException>
	//   30   93:dup             
	//   31   94:invokespecial   #82  <Method void UnsupportedOperationException()>
	//   32   97:athrow          
			break;

		case 2: // '\002'
			i = 2;
	//   33   98:iconst_2        
	//   34   99:istore_0        
			break;

	//*  35  100:goto            110
		case 1: // '\001'
			i = 1;
	//   36  103:iconst_1        
	//   37  104:istore_0        
			break;

	//*  38  105:goto            110
		case 0: // '\0'
			i = 0;
	//   39  108:iconst_0        
	//   40  109:istore_0        
			break;
		}
		((android.app.job.JobInfo.Builder) (componentname)).setRequiredNetworkType(i);
	//   41  110:aload_1         
	//   42  111:iload_0         
	//   43  112:invokevirtual   #91  <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setRequiredNetworkType(int)>
	//   44  115:pop             
		((android.app.job.JobInfo.Builder) (componentname)).setRequiresDeviceIdle(requirements.isIdleRequired());
	//   45  116:aload_1         
	//   46  117:aload_2         
	//   47  118:invokevirtual   #95  <Method boolean Requirements.isIdleRequired()>
	//   48  121:invokevirtual   #99  <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setRequiresDeviceIdle(boolean)>
	//   49  124:pop             
		((android.app.job.JobInfo.Builder) (componentname)).setRequiresCharging(requirements.isChargingRequired());
	//   50  125:aload_1         
	//   51  126:aload_2         
	//   52  127:invokevirtual   #102 <Method boolean Requirements.isChargingRequired()>
	//   53  130:invokevirtual   #105 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setRequiresCharging(boolean)>
	//   54  133:pop             
		((android.app.job.JobInfo.Builder) (componentname)).setPersisted(true);
	//   55  134:aload_1         
	//   56  135:iconst_1        
	//   57  136:invokevirtual   #108 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setPersisted(boolean)>
	//   58  139:pop             
		PersistableBundle persistablebundle = new PersistableBundle();
	//   59  140:new             #110 <Class PersistableBundle>
	//   60  143:dup             
	//   61  144:invokespecial   #111 <Method void PersistableBundle()>
	//   62  147:astore          5
		persistablebundle.putString("service_action", s);
	//   63  149:aload           5
	//   64  151:ldc1            #19  <String "service_action">
	//   65  153:aload_3         
	//   66  154:invokevirtual   #115 <Method void PersistableBundle.putString(String, String)>
		persistablebundle.putString("service_package", s1);
	//   67  157:aload           5
	//   68  159:ldc1            #22  <String "service_package">
	//   69  161:aload           4
	//   70  163:invokevirtual   #115 <Method void PersistableBundle.putString(String, String)>
		persistablebundle.putInt("requirements", requirements.getRequirementsData());
	//   71  166:aload           5
	//   72  168:ldc1            #16  <String "requirements">
	//   73  170:aload_2         
	//   74  171:invokevirtual   #118 <Method int Requirements.getRequirementsData()>
	//   75  174:invokevirtual   #122 <Method void PersistableBundle.putInt(String, int)>
		((android.app.job.JobInfo.Builder) (componentname)).setExtras(persistablebundle);
	//   76  177:aload_1         
	//   77  178:aload           5
	//   78  180:invokevirtual   #126 <Method android.app.job.JobInfo$Builder android.app.job.JobInfo$Builder.setExtras(PersistableBundle)>
	//   79  183:pop             
		return ((android.app.job.JobInfo.Builder) (componentname)).build();
	//   80  184:aload_1         
	//   81  185:invokevirtual   #130 <Method JobInfo android.app.job.JobInfo$Builder.build()>
	//   82  188:areturn         
	}

	private static void logd(String s)
	{
	//    0    0:return          
	}

	public boolean cancel()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #133 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #134 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Canceling job: ");
	//    4    8:aload_1         
	//    5    9:ldc1            #136 <String "Canceling job: ">
	//    6   11:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(jobId);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #40  <Field int jobId>
	//   11   20:invokevirtual   #143 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		logd(stringbuilder.toString());
	//   13   24:aload_1         
	//   14   25:invokevirtual   #147 <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #66  <Method void logd(String)>
		jobScheduler.cancel(jobId);
	//   16   31:aload_0         
	//   17   32:getfield        #59  <Field JobScheduler jobScheduler>
	//   18   35:aload_0         
	//   19   36:getfield        #40  <Field int jobId>
	//   20   39:invokevirtual   #150 <Method void JobScheduler.cancel(int)>
		return true;
	//   21   42:iconst_1        
	//   22   43:ireturn         
	}

	public boolean schedule(Requirements requirements, String s, String s1)
	{
		requirements = ((Requirements) (buildJobInfo(jobId, jobServiceComponentName, requirements, s1, s)));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int jobId>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field ComponentName jobServiceComponentName>
	//    4    8:aload_1         
	//    5    9:aload_3         
	//    6   10:aload_2         
	//    7   11:invokestatic    #154 <Method JobInfo buildJobInfo(int, ComponentName, Requirements, String, String)>
	//    8   14:astore_1        
		int i = jobScheduler.schedule(((JobInfo) (requirements)));
	//    9   15:aload_0         
	//   10   16:getfield        #59  <Field JobScheduler jobScheduler>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #157 <Method int JobScheduler.schedule(JobInfo)>
	//   13   23:istore          4
		requirements = ((Requirements) (new StringBuilder()));
	//   14   25:new             #133 <Class StringBuilder>
	//   15   28:dup             
	//   16   29:invokespecial   #134 <Method void StringBuilder()>
	//   17   32:astore_1        
		((StringBuilder) (requirements)).append("Scheduling job: ");
	//   18   33:aload_1         
	//   19   34:ldc1            #159 <String "Scheduling job: ">
	//   20   36:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		((StringBuilder) (requirements)).append(jobId);
	//   22   40:aload_1         
	//   23   41:aload_0         
	//   24   42:getfield        #40  <Field int jobId>
	//   25   45:invokevirtual   #143 <Method StringBuilder StringBuilder.append(int)>
	//   26   48:pop             
		((StringBuilder) (requirements)).append(" result: ");
	//   27   49:aload_1         
	//   28   50:ldc1            #161 <String " result: ">
	//   29   52:invokevirtual   #140 <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		((StringBuilder) (requirements)).append(i);
	//   31   56:aload_1         
	//   32   57:iload           4
	//   33   59:invokevirtual   #143 <Method StringBuilder StringBuilder.append(int)>
	//   34   62:pop             
		logd(((StringBuilder) (requirements)).toString());
	//   35   63:aload_1         
	//   36   64:invokevirtual   #147 <Method String StringBuilder.toString()>
	//   37   67:invokestatic    #66  <Method void logd(String)>
		return i == 1;
	//   38   70:iload           4
	//   39   72:iconst_1        
	//   40   73:icmpne          78
	//   41   76:iconst_1        
	//   42   77:ireturn         
	//   43   78:iconst_0        
	//   44   79:ireturn         
	}

	private static final String KEY_REQUIREMENTS = "requirements";
	private static final String KEY_SERVICE_ACTION = "service_action";
	private static final String KEY_SERVICE_PACKAGE = "service_package";
	private static final String TAG = "PlatformScheduler";
	private final int jobId;
	private final JobScheduler jobScheduler;
	private final ComponentName jobServiceComponentName;


/*
	static void access$000(String s)
	{
		logd(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method void logd(String)>
		return;
	//    2    4:return          
	}

*/
}
