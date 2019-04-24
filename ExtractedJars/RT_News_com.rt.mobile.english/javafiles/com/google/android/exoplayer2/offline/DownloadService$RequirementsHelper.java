// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.exoplayer2.scheduler.*;
import com.google.android.exoplayer2.util.Util;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			DownloadService

private static final class DownloadService$RequirementsHelper
	implements com.google.android.exoplayer2.scheduler.RequirementsWatcher.Listener
{

	private void startServiceWithAction(String s)
	{
		s = ((String) ((new Intent(context, serviceClass)).setAction(s).putExtra("foreground", true)));
	//    0    0:new             #52  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field Context context>
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field Class serviceClass>
	//    6   12:invokespecial   #55  <Method void Intent(Context, Class)>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #59  <Method Intent Intent.setAction(String)>
	//    9   19:ldc1            #61  <String "foreground">
	//   10   21:iconst_1        
	//   11   22:invokevirtual   #65  <Method Intent Intent.putExtra(String, boolean)>
	//   12   25:astore_1        
		Util.startForegroundService(context, ((Intent) (s)));
	//   13   26:aload_0         
	//   14   27:getfield        #28  <Field Context context>
	//   15   30:aload_1         
	//   16   31:invokestatic    #71  <Method android.content.ComponentName Util.startForegroundService(Context, Intent)>
	//   17   34:pop             
	//   18   35:return          
	}

	public void requirementsMet(RequirementsWatcher requirementswatcher)
	{
		startServiceWithAction("com.google.android.exoplayer.downloadService.action.START_DOWNLOADS");
	//    0    0:aload_0         
	//    1    1:ldc1            #75  <String "com.google.android.exoplayer.downloadService.action.START_DOWNLOADS">
	//    2    3:invokespecial   #77  <Method void startServiceWithAction(String)>
		if(scheduler != null)
	//*   3    6:aload_0         
	//*   4    7:getfield        #32  <Field Scheduler scheduler>
	//*   5   10:ifnull          23
			scheduler.cancel();
	//    6   13:aload_0         
	//    7   14:getfield        #32  <Field Scheduler scheduler>
	//    8   17:invokeinterface #83  <Method boolean Scheduler.cancel()>
	//    9   22:pop             
	//   10   23:return          
	}

	public void requirementsNotMet(RequirementsWatcher requirementswatcher)
	{
		startServiceWithAction("com.google.android.exoplayer.downloadService.action.STOP_DOWNLOADS");
	//    0    0:aload_0         
	//    1    1:ldc1            #86  <String "com.google.android.exoplayer.downloadService.action.STOP_DOWNLOADS">
	//    2    3:invokespecial   #77  <Method void startServiceWithAction(String)>
		if(scheduler != null)
	//*   3    6:aload_0         
	//*   4    7:getfield        #32  <Field Scheduler scheduler>
	//*   5   10:ifnull          48
		{
			requirementswatcher = ((RequirementsWatcher) (context.getPackageName()));
	//    6   13:aload_0         
	//    7   14:getfield        #28  <Field Context context>
	//    8   17:invokevirtual   #92  <Method String Context.getPackageName()>
	//    9   20:astore_1        
			if(!scheduler.schedule(requirements, ((String) (requirementswatcher)), "com.google.android.exoplayer.downloadService.action.RESTART"))
	//*  10   21:aload_0         
	//*  11   22:getfield        #32  <Field Scheduler scheduler>
	//*  12   25:aload_0         
	//*  13   26:getfield        #30  <Field Requirements requirements>
	//*  14   29:aload_1         
	//*  15   30:ldc1            #94  <String "com.google.android.exoplayer.downloadService.action.RESTART">
	//*  16   32:invokeinterface #98  <Method boolean Scheduler.schedule(Requirements, String, String)>
	//*  17   37:ifne            48
				Log.e("DownloadService", "Scheduling downloads failed.");
	//   18   40:ldc1            #100 <String "DownloadService">
	//   19   42:ldc1            #102 <String "Scheduling downloads failed.">
	//   20   44:invokestatic    #108 <Method int Log.e(String, String)>
	//   21   47:pop             
		}
	//   22   48:return          
	}

	public void start()
	{
		requirementsWatcher.start();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field RequirementsWatcher requirementsWatcher>
	//    2    4:invokevirtual   #111 <Method void RequirementsWatcher.start()>
	//    3    7:return          
	}

	public void stop()
	{
		requirementsWatcher.stop();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field RequirementsWatcher requirementsWatcher>
	//    2    4:invokevirtual   #114 <Method void RequirementsWatcher.stop()>
		if(scheduler != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #32  <Field Scheduler scheduler>
	//*   5   11:ifnull          24
			scheduler.cancel();
	//    6   14:aload_0         
	//    7   15:getfield        #32  <Field Scheduler scheduler>
	//    8   18:invokeinterface #83  <Method boolean Scheduler.cancel()>
	//    9   23:pop             
	//   10   24:return          
	}

	private final Context context;
	private final Requirements requirements;
	private final RequirementsWatcher requirementsWatcher;
	private final Scheduler scheduler;
	private final Class serviceClass;

	private DownloadService$RequirementsHelper(Context context1, Requirements requirements1, Scheduler scheduler1, Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field Context context>
		requirements = requirements1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field Requirements requirements>
		scheduler = scheduler1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #32  <Field Scheduler scheduler>
		serviceClass = class1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #34  <Field Class serviceClass>
		requirementsWatcher = new RequirementsWatcher(context1, ((com.google.android.exoplayer2.scheduler.RequirementsWatcher.Listener) (this)), requirements1);
	//   14   25:aload_0         
	//   15   26:new             #36  <Class RequirementsWatcher>
	//   16   29:dup             
	//   17   30:aload_1         
	//   18   31:aload_0         
	//   19   32:aload_2         
	//   20   33:invokespecial   #39  <Method void RequirementsWatcher(Context, com.google.android.exoplayer2.scheduler.RequirementsWatcher$Listener, Requirements)>
	//   21   36:putfield        #41  <Field RequirementsWatcher requirementsWatcher>
	//   22   39:return          
	}

	DownloadService$RequirementsHelper(Context context1, Requirements requirements1, Scheduler scheduler1, Class class1, DownloadService._cls1 _pcls1)
	{
		this(context1, requirements1, scheduler1, class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #48  <Method void DownloadService$RequirementsHelper(Context, Requirements, Scheduler, Class)>
	//    6    9:return          
	}
}
