// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.exoplayer2.util.Util;

// Referenced classes of package com.google.android.exoplayer2.scheduler:
//			PlatformScheduler, Requirements

public static final class PlatformScheduler$PlatformSchedulerService extends JobService
{

	public boolean onStartJob(JobParameters jobparameters)
	{
		PlatformScheduler.access$000("PlatformSchedulerService started");
	//    0    0:ldc1            #16  <String "PlatformSchedulerService started">
	//    1    2:invokestatic    #20  <Method void PlatformScheduler.access$000(String)>
		Object obj = ((Object) (jobparameters.getExtras()));
	//    2    5:aload_1         
	//    3    6:invokevirtual   #26  <Method PersistableBundle JobParameters.getExtras()>
	//    4    9:astore_2        
		if((new Requirements(((PersistableBundle) (obj)).getInt("requirements"))).checkRequirements(((android.content.Context) (this))))
	//*   5   10:new             #28  <Class Requirements>
	//*   6   13:dup             
	//*   7   14:aload_2         
	//*   8   15:ldc1            #30  <String "requirements">
	//*   9   17:invokevirtual   #36  <Method int PersistableBundle.getInt(String)>
	//*  10   20:invokespecial   #39  <Method void Requirements(int)>
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #43  <Method boolean Requirements.checkRequirements(android.content.Context)>
	//*  13   27:ifeq            118
		{
			PlatformScheduler.access$000("Requirements are met");
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
			PlatformScheduler.access$000(stringbuilder.toString());
	//   51  101:aload           4
	//   52  103:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   53  106:invokestatic    #20  <Method void PlatformScheduler.access$000(String)>
			Util.startForegroundService(((android.content.Context) (this)), intent);
	//   54  109:aload_0         
	//   55  110:aload_3         
	//   56  111:invokestatic    #82  <Method android.content.ComponentName Util.startForegroundService(android.content.Context, Intent)>
	//   57  114:pop             
		} else
	//*  58  115:goto            129
		{
			PlatformScheduler.access$000("Requirements are not met");
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

	public PlatformScheduler$PlatformSchedulerService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void JobService()>
	//    2    4:return          
	}
}
