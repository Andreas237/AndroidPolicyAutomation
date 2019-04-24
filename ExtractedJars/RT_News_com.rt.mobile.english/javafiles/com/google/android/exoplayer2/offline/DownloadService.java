// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.*;
import android.util.Log;
import com.google.android.exoplayer2.scheduler.*;
import com.google.android.exoplayer2.util.NotificationUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.HashMap;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			DownloadAction, DownloadManager

public abstract class DownloadService extends Service
{
	private final class DownloadManagerListener
		implements DownloadManager.Listener
	{

		public final void onIdle(DownloadManager downloadmanager)
		{
			stop();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field DownloadService this$0>
		//    2    4:invokestatic    #27  <Method void DownloadService.access$400(DownloadService)>
		//    3    7:return          
		}

		public void onInitialized(DownloadManager downloadmanager)
		{
			maybeStartWatchingRequirements();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field DownloadService this$0>
		//    2    4:invokestatic    #31  <Method void DownloadService.access$200(DownloadService)>
		//    3    7:return          
		}

		public void onTaskStateChanged(DownloadManager downloadmanager, DownloadManager.TaskState taskstate)
		{
			DownloadService.this.onTaskStateChanged(taskstate);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field DownloadService this$0>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #36  <Method void DownloadService.onTaskStateChanged(DownloadManager$TaskState)>
			if(taskstate.state == 1)
		//*   4    8:aload_2         
		//*   5    9:getfield        #42  <Field int DownloadManager$TaskState.state>
		//*   6   12:iconst_1        
		//*   7   13:icmpne          27
			{
				foregroundNotificationUpdater.startPeriodicUpdates();
		//    8   16:aload_0         
		//    9   17:getfield        #15  <Field DownloadService this$0>
		//   10   20:invokestatic    #46  <Method DownloadService$ForegroundNotificationUpdater DownloadService.access$300(DownloadService)>
		//   11   23:invokevirtual   #51  <Method void DownloadService$ForegroundNotificationUpdater.startPeriodicUpdates()>
				return;
		//   12   26:return          
			} else
			{
				foregroundNotificationUpdater.update();
		//   13   27:aload_0         
		//   14   28:getfield        #15  <Field DownloadService this$0>
		//   15   31:invokestatic    #46  <Method DownloadService$ForegroundNotificationUpdater DownloadService.access$300(DownloadService)>
		//   16   34:invokevirtual   #54  <Method void DownloadService$ForegroundNotificationUpdater.update()>
				return;
		//   17   37:return          
			}
		}

		final DownloadService this$0;

		private DownloadManagerListener()
		{
			this$0 = DownloadService.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field DownloadService this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}

	private final class ForegroundNotificationUpdater
		implements Runnable
	{

		public void run()
		{
			update();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #49  <Method void update()>
		//    2    4:return          
		}

		public void showNotificationIfNotAlready()
		{
			if(!notificationDisplayed)
		//*   0    0:aload_0         
		//*   1    1:getfield        #52  <Field boolean notificationDisplayed>
		//*   2    4:ifne            11
				update();
		//    3    7:aload_0         
		//    4    8:invokevirtual   #49  <Method void update()>
		//    5   11:return          
		}

		public void startPeriodicUpdates()
		{
			periodicUpdatesStarted = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #55  <Field boolean periodicUpdatesStarted>
			update();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #49  <Method void update()>
		//    5    9:return          
		}

		public void stopPeriodicUpdates()
		{
			periodicUpdatesStarted = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #55  <Field boolean periodicUpdatesStarted>
			handler.removeCallbacks(((Runnable) (this)));
		//    3    5:aload_0         
		//    4    6:getfield        #44  <Field Handler handler>
		//    5    9:aload_0         
		//    6   10:invokevirtual   #60  <Method void Handler.removeCallbacks(Runnable)>
		//    7   13:return          
		}

		public void update()
		{
			DownloadManager.TaskState ataskstate[] = downloadManager.getAllTaskStates();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field DownloadService this$0>
		//    2    4:invokestatic    #64  <Method DownloadManager DownloadService.access$500(DownloadService)>
		//    3    7:invokevirtual   #70  <Method DownloadManager$TaskState[] DownloadManager.getAllTaskStates()>
		//    4   10:astore_1        
			startForeground(notificationId, getForegroundNotification(ataskstate));
		//    5   11:aload_0         
		//    6   12:getfield        #24  <Field DownloadService this$0>
		//    7   15:aload_0         
		//    8   16:getfield        #29  <Field int notificationId>
		//    9   19:aload_0         
		//   10   20:getfield        #24  <Field DownloadService this$0>
		//   11   23:aload_1         
		//   12   24:invokevirtual   #74  <Method Notification DownloadService.getForegroundNotification(DownloadManager$TaskState[])>
		//   13   27:invokevirtual   #78  <Method void DownloadService.startForeground(int, Notification)>
			notificationDisplayed = true;
		//   14   30:aload_0         
		//   15   31:iconst_1        
		//   16   32:putfield        #52  <Field boolean notificationDisplayed>
			if(periodicUpdatesStarted)
		//*  17   35:aload_0         
		//*  18   36:getfield        #55  <Field boolean periodicUpdatesStarted>
		//*  19   39:ifeq            63
			{
				handler.removeCallbacks(((Runnable) (this)));
		//   20   42:aload_0         
		//   21   43:getfield        #44  <Field Handler handler>
		//   22   46:aload_0         
		//   23   47:invokevirtual   #60  <Method void Handler.removeCallbacks(Runnable)>
				handler.postDelayed(((Runnable) (this)), updateInterval);
		//   24   50:aload_0         
		//   25   51:getfield        #44  <Field Handler handler>
		//   26   54:aload_0         
		//   27   55:aload_0         
		//   28   56:getfield        #31  <Field long updateInterval>
		//   29   59:invokevirtual   #82  <Method boolean Handler.postDelayed(Runnable, long)>
		//   30   62:pop             
			}
		//   31   63:return          
		}

		private final Handler handler = new Handler(Looper.getMainLooper());
		private boolean notificationDisplayed;
		private final int notificationId;
		private boolean periodicUpdatesStarted;
		final DownloadService this$0;
		private final long updateInterval;

		public ForegroundNotificationUpdater(int i, long l)
		{
			this$0 = DownloadService.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #24  <Field DownloadService this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #27  <Method void Object()>
			notificationId = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #29  <Field int notificationId>
			updateInterval = l;
		//    8   14:aload_0         
		//    9   15:lload_3         
		//   10   16:putfield        #31  <Field long updateInterval>
		//   11   19:aload_0         
		//   12   20:new             #33  <Class Handler>
		//   13   23:dup             
		//   14   24:invokestatic    #39  <Method Looper Looper.getMainLooper()>
		//   15   27:invokespecial   #42  <Method void Handler(Looper)>
		//   16   30:putfield        #44  <Field Handler handler>
		//   17   33:return          
		}
	}

	private static final class RequirementsHelper
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

		private RequirementsHelper(Context context1, Requirements requirements1, Scheduler scheduler1, Class class1)
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

	}


	protected DownloadService(int i)
	{
		this(i, 1000L);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ldc2w           #37  <Long 1000L>
	//    3    5:invokespecial   #78  <Method void DownloadService(int, long)>
	//    4    8:return          
	}

	protected DownloadService(int i, long l)
	{
		this(i, l, ((String) (null)), 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:aconst_null     
	//    4    4:iconst_0        
	//    5    5:invokespecial   #81  <Method void DownloadService(int, long, String, int)>
	//    6    8:return          
	}

	protected DownloadService(int i, long l, String s, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Service()>
		foregroundNotificationUpdater = new ForegroundNotificationUpdater(i, l);
	//    2    4:aload_0         
	//    3    5:new             #11  <Class DownloadService$ForegroundNotificationUpdater>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:lload_2         
	//    8   12:invokespecial   #85  <Method void DownloadService$ForegroundNotificationUpdater(DownloadService, int, long)>
	//    9   15:putfield        #87  <Field DownloadService$ForegroundNotificationUpdater foregroundNotificationUpdater>
		channelId = s;
	//   10   18:aload_0         
	//   11   19:aload           4
	//   12   21:putfield        #89  <Field String channelId>
		channelName = j;
	//   13   24:aload_0         
	//   14   25:iload           5
	//   15   27:putfield        #91  <Field int channelName>
	//   16   30:return          
	}

	public static Intent buildAddActionIntent(Context context, Class class1, DownloadAction downloadaction, boolean flag)
	{
		return (new Intent(context, class1)).setAction("com.google.android.exoplayer.downloadService.action.ADD").putExtra("download_action", downloadaction.toByteArray()).putExtra("foreground", flag);
	//    0    0:new             #111 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #114 <Method void Intent(Context, Class)>
	//    5    9:ldc1            #19  <String "com.google.android.exoplayer.downloadService.action.ADD">
	//    6   11:invokevirtual   #118 <Method Intent Intent.setAction(String)>
	//    7   14:ldc1            #41  <String "download_action">
	//    8   16:aload_2         
	//    9   17:invokevirtual   #124 <Method byte[] DownloadAction.toByteArray()>
	//   10   20:invokevirtual   #128 <Method Intent Intent.putExtra(String, byte[])>
	//   11   23:ldc1            #44  <String "foreground">
	//   12   25:iload_3         
	//   13   26:invokevirtual   #131 <Method Intent Intent.putExtra(String, boolean)>
	//   14   29:areturn         
	}

	private void logd(String s)
	{
	//    0    0:return          
	}

	private void maybeStartWatchingRequirements()
	{
		if(downloadManager.getDownloadCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field DownloadManager downloadManager>
	//*   2    4:invokevirtual   #141 <Method int DownloadManager.getDownloadCount()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		Class class1 = ((Object)this).getClass();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #147 <Method Class Object.getClass()>
	//    7   15:astore_1        
		if((RequirementsHelper)requirementsHelpers.get(((Object) (class1))) == null)
	//*   8   16:getstatic       #73  <Field HashMap requirementsHelpers>
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #151 <Method Object HashMap.get(Object)>
	//*  11   23:checkcast       #14  <Class DownloadService$RequirementsHelper>
	//*  12   26:ifnonnull       67
		{
			RequirementsHelper requirementshelper = new RequirementsHelper(((Context) (this)), getRequirements(), getScheduler(), class1);
	//   13   29:new             #14  <Class DownloadService$RequirementsHelper>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:invokevirtual   #155 <Method Requirements getRequirements()>
	//   18   38:aload_0         
	//   19   39:invokevirtual   #159 <Method Scheduler getScheduler()>
	//   20   42:aload_1         
	//   21   43:aconst_null     
	//   22   44:invokespecial   #162 <Method void DownloadService$RequirementsHelper(Context, Requirements, Scheduler, Class, DownloadService$1)>
	//   23   47:astore_2        
			requirementsHelpers.put(((Object) (class1)), ((Object) (requirementshelper)));
	//   24   48:getstatic       #73  <Field HashMap requirementsHelpers>
	//   25   51:aload_1         
	//   26   52:aload_2         
	//   27   53:invokevirtual   #166 <Method Object HashMap.put(Object, Object)>
	//   28   56:pop             
			requirementshelper.start();
	//   29   57:aload_2         
	//   30   58:invokevirtual   #169 <Method void DownloadService$RequirementsHelper.start()>
			logd("started watching requirements");
	//   31   61:aload_0         
	//   32   62:ldc1            #171 <String "started watching requirements">
	//   33   64:invokespecial   #173 <Method void logd(String)>
		}
	//   34   67:return          
	}

	private void maybeStopWatchingRequirements()
	{
		if(downloadManager.getDownloadCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field DownloadManager downloadManager>
	//*   2    4:invokevirtual   #141 <Method int DownloadManager.getDownloadCount()>
	//*   3    7:ifle            11
			return;
	//    4   10:return          
		RequirementsHelper requirementshelper = (RequirementsHelper)requirementsHelpers.remove(((Object) (((Object)this).getClass())));
	//    5   11:getstatic       #73  <Field HashMap requirementsHelpers>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #147 <Method Class Object.getClass()>
	//    8   18:invokevirtual   #177 <Method Object HashMap.remove(Object)>
	//    9   21:checkcast       #14  <Class DownloadService$RequirementsHelper>
	//   10   24:astore_1        
		if(requirementshelper != null)
	//*  11   25:aload_1         
	//*  12   26:ifnull          39
		{
			requirementshelper.stop();
	//   13   29:aload_1         
	//   14   30:invokevirtual   #178 <Method void DownloadService$RequirementsHelper.stop()>
			logd("stopped watching requirements");
	//   15   33:aload_0         
	//   16   34:ldc1            #180 <String "stopped watching requirements">
	//   17   36:invokespecial   #173 <Method void logd(String)>
		}
	//   18   39:return          
	}

	public static void start(Context context, Class class1)
	{
		context.startService((new Intent(context, class1)).setAction("com.google.android.exoplayer.downloadService.action.INIT"));
	//    0    0:aload_0         
	//    1    1:new             #111 <Class Intent>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #114 <Method void Intent(Context, Class)>
	//    6   10:ldc1            #22  <String "com.google.android.exoplayer.downloadService.action.INIT">
	//    7   12:invokevirtual   #118 <Method Intent Intent.setAction(String)>
	//    8   15:invokevirtual   #186 <Method android.content.ComponentName Context.startService(Intent)>
	//    9   18:pop             
	//   10   19:return          
	}

	public static void startForeground(Context context, Class class1)
	{
		Util.startForegroundService(context, (new Intent(context, class1)).setAction("com.google.android.exoplayer.downloadService.action.INIT").putExtra("foreground", true));
	//    0    0:aload_0         
	//    1    1:new             #111 <Class Intent>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #114 <Method void Intent(Context, Class)>
	//    6   10:ldc1            #22  <String "com.google.android.exoplayer.downloadService.action.INIT">
	//    7   12:invokevirtual   #118 <Method Intent Intent.setAction(String)>
	//    8   15:ldc1            #44  <String "foreground">
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #131 <Method Intent Intent.putExtra(String, boolean)>
	//   11   21:invokestatic    #194 <Method android.content.ComponentName Util.startForegroundService(Context, Intent)>
	//   12   24:pop             
	//   13   25:return          
	}

	public static void startWithAction(Context context, Class class1, DownloadAction downloadaction, boolean flag)
	{
		class1 = ((Class) (buildAddActionIntent(context, class1, downloadaction, flag)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokestatic    #198 <Method Intent buildAddActionIntent(Context, Class, DownloadAction, boolean)>
	//    5    7:astore_1        
		if(flag)
	//*   6    8:iload_3         
	//*   7    9:ifeq            19
		{
			Util.startForegroundService(context, ((Intent) (class1)));
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokestatic    #194 <Method android.content.ComponentName Util.startForegroundService(Context, Intent)>
	//   11   17:pop             
			return;
	//   12   18:return          
		} else
		{
			context.startService(((Intent) (class1)));
	//   13   19:aload_0         
	//   14   20:aload_1         
	//   15   21:invokevirtual   #186 <Method android.content.ComponentName Context.startService(Intent)>
	//   16   24:pop             
			return;
	//   17   25:return          
		}
	}

	private void stop()
	{
		foregroundNotificationUpdater.stopPeriodicUpdates();
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field DownloadService$ForegroundNotificationUpdater foregroundNotificationUpdater>
	//    2    4:invokevirtual   #202 <Method void DownloadService$ForegroundNotificationUpdater.stopPeriodicUpdates()>
		if(startedInForeground && Util.SDK_INT >= 26)
	//*   3    7:aload_0         
	//*   4    8:getfield        #204 <Field boolean startedInForeground>
	//*   5   11:ifeq            29
	//*   6   14:getstatic       #207 <Field int Util.SDK_INT>
	//*   7   17:bipush          26
	//*   8   19:icmplt          29
			foregroundNotificationUpdater.showNotificationIfNotAlready();
	//    9   22:aload_0         
	//   10   23:getfield        #87  <Field DownloadService$ForegroundNotificationUpdater foregroundNotificationUpdater>
	//   11   26:invokevirtual   #210 <Method void DownloadService$ForegroundNotificationUpdater.showNotificationIfNotAlready()>
		if(Util.SDK_INT < 28 && taskRemoved)
	//*  12   29:getstatic       #207 <Field int Util.SDK_INT>
	//*  13   32:bipush          28
	//*  14   34:icmpge          55
	//*  15   37:aload_0         
	//*  16   38:getfield        #212 <Field boolean taskRemoved>
	//*  17   41:ifeq            55
		{
			stopSelf();
	//   18   44:aload_0         
	//   19   45:invokevirtual   #215 <Method void stopSelf()>
			logd("stopSelf()");
	//   20   48:aload_0         
	//   21   49:ldc1            #217 <String "stopSelf()">
	//   22   51:invokespecial   #173 <Method void logd(String)>
			return;
	//   23   54:return          
		} else
		{
			boolean flag = stopSelfResult(lastStartId);
	//   24   55:aload_0         
	//   25   56:aload_0         
	//   26   57:getfield        #219 <Field int lastStartId>
	//   27   60:invokevirtual   #223 <Method boolean stopSelfResult(int)>
	//   28   63:istore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   29   64:new             #225 <Class StringBuilder>
	//   30   67:dup             
	//   31   68:invokespecial   #226 <Method void StringBuilder()>
	//   32   71:astore_2        
			stringbuilder.append("stopSelf(");
	//   33   72:aload_2         
	//   34   73:ldc1            #228 <String "stopSelf(">
	//   35   75:invokevirtual   #232 <Method StringBuilder StringBuilder.append(String)>
	//   36   78:pop             
			stringbuilder.append(lastStartId);
	//   37   79:aload_2         
	//   38   80:aload_0         
	//   39   81:getfield        #219 <Field int lastStartId>
	//   40   84:invokevirtual   #235 <Method StringBuilder StringBuilder.append(int)>
	//   41   87:pop             
			stringbuilder.append(") result: ");
	//   42   88:aload_2         
	//   43   89:ldc1            #237 <String ") result: ">
	//   44   91:invokevirtual   #232 <Method StringBuilder StringBuilder.append(String)>
	//   45   94:pop             
			stringbuilder.append(flag);
	//   46   95:aload_2         
	//   47   96:iload_1         
	//   48   97:invokevirtual   #240 <Method StringBuilder StringBuilder.append(boolean)>
	//   49  100:pop             
			logd(stringbuilder.toString());
	//   50  101:aload_0         
	//   51  102:aload_2         
	//   52  103:invokevirtual   #244 <Method String StringBuilder.toString()>
	//   53  106:invokespecial   #173 <Method void logd(String)>
			return;
	//   54  109:return          
		}
	}

	protected abstract DownloadManager getDownloadManager();

	protected abstract Notification getForegroundNotification(DownloadManager.TaskState ataskstate[]);

	protected Requirements getRequirements()
	{
		return new Requirements(1, false, false);
	//    0    0:new             #250 <Class Requirements>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:invokespecial   #253 <Method void Requirements(int, boolean, boolean)>
	//    6   10:areturn         
	}

	protected abstract Scheduler getScheduler();

	public IBinder onBind(Intent intent)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void onCreate()
	{
		logd("onCreate");
	//    0    0:aload_0         
	//    1    1:ldc2            #258 <String "onCreate">
	//    2    4:invokespecial   #173 <Method void logd(String)>
		if(channelId != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #89  <Field String channelId>
	//*   5   11:ifnull          27
			NotificationUtil.createNotificationChannel(((Context) (this)), channelId, channelName, 2);
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #89  <Field String channelId>
	//    9   19:aload_0         
	//   10   20:getfield        #91  <Field int channelName>
	//   11   23:iconst_2        
	//   12   24:invokestatic    #264 <Method void NotificationUtil.createNotificationChannel(Context, String, int, int)>
		downloadManager = getDownloadManager();
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:invokevirtual   #266 <Method DownloadManager getDownloadManager()>
	//   16   32:putfield        #107 <Field DownloadManager downloadManager>
		downloadManagerListener = new DownloadManagerListener();
	//   17   35:aload_0         
	//   18   36:new             #8   <Class DownloadService$DownloadManagerListener>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:aconst_null     
	//   22   42:invokespecial   #269 <Method void DownloadService$DownloadManagerListener(DownloadService, DownloadService$1)>
	//   23   45:putfield        #271 <Field DownloadService$DownloadManagerListener downloadManagerListener>
		downloadManager.addListener(((DownloadManager.Listener) (downloadManagerListener)));
	//   24   48:aload_0         
	//   25   49:getfield        #107 <Field DownloadManager downloadManager>
	//   26   52:aload_0         
	//   27   53:getfield        #271 <Field DownloadService$DownloadManagerListener downloadManagerListener>
	//   28   56:invokevirtual   #275 <Method void DownloadManager.addListener(DownloadManager$Listener)>
	//   29   59:return          
	}

	public void onDestroy()
	{
		logd("onDestroy");
	//    0    0:aload_0         
	//    1    1:ldc2            #277 <String "onDestroy">
	//    2    4:invokespecial   #173 <Method void logd(String)>
		foregroundNotificationUpdater.stopPeriodicUpdates();
	//    3    7:aload_0         
	//    4    8:getfield        #87  <Field DownloadService$ForegroundNotificationUpdater foregroundNotificationUpdater>
	//    5   11:invokevirtual   #202 <Method void DownloadService$ForegroundNotificationUpdater.stopPeriodicUpdates()>
		downloadManager.removeListener(((DownloadManager.Listener) (downloadManagerListener)));
	//    6   14:aload_0         
	//    7   15:getfield        #107 <Field DownloadManager downloadManager>
	//    8   18:aload_0         
	//    9   19:getfield        #271 <Field DownloadService$DownloadManagerListener downloadManagerListener>
	//   10   22:invokevirtual   #280 <Method void DownloadManager.removeListener(DownloadManager$Listener)>
		maybeStopWatchingRequirements();
	//   11   25:aload_0         
	//   12   26:invokespecial   #282 <Method void maybeStopWatchingRequirements()>
	//   13   29:return          
	}

	public int onStartCommand(Intent intent, int i, int j)
	{
		String s;
label0:
		{
			lastStartId = j;
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:putfield        #219 <Field int lastStartId>
			boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore          4
			taskRemoved = false;
	//    5    8:aload_0         
	//    6    9:iconst_0        
	//    7   10:putfield        #212 <Field boolean taskRemoved>
			Object obj;
			if(intent != null)
	//*   8   13:aload_1         
	//*   9   14:ifnull          70
			{
				obj = ((Object) (intent.getAction()));
	//   10   17:aload_1         
	//   11   18:invokevirtual   #289 <Method String Intent.getAction()>
	//   12   21:astore          6
				boolean flag1 = startedInForeground;
	//   13   23:aload_0         
	//   14   24:getfield        #204 <Field boolean startedInForeground>
	//   15   27:istore          5
				if(!intent.getBooleanExtra("foreground", false) && !"com.google.android.exoplayer.downloadService.action.RESTART".equals(obj))
	//*  16   29:aload_1         
	//*  17   30:ldc1            #44  <String "foreground">
	//*  18   32:iconst_0        
	//*  19   33:invokevirtual   #293 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*  20   36:ifne            57
	//*  21   39:ldc1            #25  <String "com.google.android.exoplayer.downloadService.action.RESTART">
	//*  22   41:aload           6
	//*  23   43:invokevirtual   #299 <Method boolean String.equals(Object)>
	//*  24   46:ifeq            52
	//*  25   49:goto            57
					i = 0;
	//   26   52:iconst_0        
	//   27   53:istore_2        
				else
	//*  28   54:goto            59
					i = 1;
	//   29   57:iconst_1        
	//   30   58:istore_2        
				startedInForeground = ((boolean) (flag1 | i));
	//   31   59:aload_0         
	//   32   60:iload           5
	//   33   62:iload_2         
	//   34   63:ior             
	//   35   64:putfield        #204 <Field boolean startedInForeground>
			} else
	//*  36   67:goto            73
			{
				obj = null;
	//   37   70:aconst_null     
	//   38   71:astore          6
			}
			s = ((String) (obj));
	//   39   73:aload           6
	//   40   75:astore          7
			if(obj == null)
	//*  41   77:aload           6
	//*  42   79:ifnonnull       86
				s = "com.google.android.exoplayer.downloadService.action.INIT";
	//   43   82:ldc1            #22  <String "com.google.android.exoplayer.downloadService.action.INIT">
	//   44   84:astore          7
			obj = ((Object) (new StringBuilder()));
	//   45   86:new             #225 <Class StringBuilder>
	//   46   89:dup             
	//   47   90:invokespecial   #226 <Method void StringBuilder()>
	//   48   93:astore          6
			((StringBuilder) (obj)).append("onStartCommand action: ");
	//   49   95:aload           6
	//   50   97:ldc2            #301 <String "onStartCommand action: ">
	//   51  100:invokevirtual   #232 <Method StringBuilder StringBuilder.append(String)>
	//   52  103:pop             
			((StringBuilder) (obj)).append(s);
	//   53  104:aload           6
	//   54  106:aload           7
	//   55  108:invokevirtual   #232 <Method StringBuilder StringBuilder.append(String)>
	//   56  111:pop             
			((StringBuilder) (obj)).append(" startId: ");
	//   57  112:aload           6
	//   58  114:ldc2            #303 <String " startId: ">
	//   59  117:invokevirtual   #232 <Method StringBuilder StringBuilder.append(String)>
	//   60  120:pop             
			((StringBuilder) (obj)).append(j);
	//   61  121:aload           6
	//   62  123:iload_3         
	//   63  124:invokevirtual   #235 <Method StringBuilder StringBuilder.append(int)>
	//   64  127:pop             
			logd(((StringBuilder) (obj)).toString());
	//   65  128:aload_0         
	//   66  129:aload           6
	//   67  131:invokevirtual   #244 <Method String StringBuilder.toString()>
	//   68  134:invokespecial   #173 <Method void logd(String)>
			switch(s.hashCode())
	//*  69  137:aload           7
	//*  70  139:invokevirtual   #306 <Method int String.hashCode()>
			{
			default:
				break;

	//*  71  142:lookupswitch    5: default 192
	//	               -871181424: 256
	//	               -382886238: 241
	//	               -337334865: 226
	//	               1015676687: 210
	//	               1286088717: 195
	//*  72  192:goto            271
			case 1286088717: 
				if(s.equals("com.google.android.exoplayer.downloadService.action.STOP_DOWNLOADS"))
	//*  73  195:aload           7
	//*  74  197:ldc1            #31  <String "com.google.android.exoplayer.downloadService.action.STOP_DOWNLOADS">
	//*  75  199:invokevirtual   #299 <Method boolean String.equals(Object)>
	//*  76  202:ifeq            271
				{
					i = 3;
	//   77  205:iconst_3        
	//   78  206:istore_2        
					break label0;
	//   79  207:goto            273
				}
				break;

			case 1015676687: 
				if(!s.equals("com.google.android.exoplayer.downloadService.action.INIT"))
					break;
	//   80  210:aload           7
	//   81  212:ldc1            #22  <String "com.google.android.exoplayer.downloadService.action.INIT">
	//   82  214:invokevirtual   #299 <Method boolean String.equals(Object)>
	//   83  217:ifeq            271
				i = ((int) (flag));
	//   84  220:iload           4
	//   85  222:istore_2        
				break label0;
	//   86  223:goto            273

			case -337334865: 
				if(!s.equals("com.google.android.exoplayer.downloadService.action.START_DOWNLOADS"))
					break;
	//   87  226:aload           7
	//   88  228:ldc1            #28  <String "com.google.android.exoplayer.downloadService.action.START_DOWNLOADS">
	//   89  230:invokevirtual   #299 <Method boolean String.equals(Object)>
	//   90  233:ifeq            271
				i = 4;
	//   91  236:iconst_4        
	//   92  237:istore_2        
				break label0;
	//   93  238:goto            273

			case -382886238: 
				if(!s.equals("com.google.android.exoplayer.downloadService.action.ADD"))
					break;
	//   94  241:aload           7
	//   95  243:ldc1            #19  <String "com.google.android.exoplayer.downloadService.action.ADD">
	//   96  245:invokevirtual   #299 <Method boolean String.equals(Object)>
	//   97  248:ifeq            271
				i = 2;
	//   98  251:iconst_2        
	//   99  252:istore_2        
				break label0;
	//  100  253:goto            273

			case -871181424: 
				if(!s.equals("com.google.android.exoplayer.downloadService.action.RESTART"))
					break;
	//  101  256:aload           7
	//  102  258:ldc1            #25  <String "com.google.android.exoplayer.downloadService.action.RESTART">
	//  103  260:invokevirtual   #299 <Method boolean String.equals(Object)>
	//  104  263:ifeq            271
				i = 1;
	//  105  266:iconst_1        
	//  106  267:istore_2        
				break label0;
	//  107  268:goto            273
			}
			i = -1;
	//  108  271:iconst_m1       
	//  109  272:istore_2        
		}
		switch(i)
	//* 110  273:iload_2         
		{
	//* 111  274:tableswitch     0 4: default 308
	//	               0 410
	//	               1 410
	//	               2 364
	//	               3 354
	//	               4 344
		default:
			intent = ((Intent) (new StringBuilder()));
	//  112  308:new             #225 <Class StringBuilder>
	//  113  311:dup             
	//  114  312:invokespecial   #226 <Method void StringBuilder()>
	//  115  315:astore_1        
			((StringBuilder) (intent)).append("Ignoring unrecognized action: ");
	//  116  316:aload_1         
	//  117  317:ldc2            #308 <String "Ignoring unrecognized action: ">
	//  118  320:invokevirtual   #232 <Method StringBuilder StringBuilder.append(String)>
	//  119  323:pop             
			((StringBuilder) (intent)).append(s);
	//  120  324:aload_1         
	//  121  325:aload           7
	//  122  327:invokevirtual   #232 <Method StringBuilder StringBuilder.append(String)>
	//  123  330:pop             
			Log.e("DownloadService", ((StringBuilder) (intent)).toString());
	//  124  331:ldc1            #47  <String "DownloadService">
	//  125  333:aload_1         
	//  126  334:invokevirtual   #244 <Method String StringBuilder.toString()>
	//  127  337:invokestatic    #314 <Method int Log.e(String, String)>
	//  128  340:pop             
			break;
	//  129  341:goto            410

		case 0: // '\0'
		case 1: // '\001'
			break;

		case 4: // '\004'
			downloadManager.startDownloads();
	//  130  344:aload_0         
	//  131  345:getfield        #107 <Field DownloadManager downloadManager>
	//  132  348:invokevirtual   #317 <Method void DownloadManager.startDownloads()>
			break;
	//  133  351:goto            410

		case 3: // '\003'
			downloadManager.stopDownloads();
	//  134  354:aload_0         
	//  135  355:getfield        #107 <Field DownloadManager downloadManager>
	//  136  358:invokevirtual   #320 <Method void DownloadManager.stopDownloads()>
			break;
	//  137  361:goto            410

		case 2: // '\002'
			intent = ((Intent) (intent.getByteArrayExtra("download_action")));
	//  138  364:aload_1         
	//  139  365:ldc1            #41  <String "download_action">
	//  140  367:invokevirtual   #324 <Method byte[] Intent.getByteArrayExtra(String)>
	//  141  370:astore_1        
			if(intent == null)
	//* 142  371:aload_1         
	//* 143  372:ifnonnull       387
			{
				Log.e("DownloadService", "Ignoring ADD action with no action data");
	//  144  375:ldc1            #47  <String "DownloadService">
	//  145  377:ldc2            #326 <String "Ignoring ADD action with no action data">
	//  146  380:invokestatic    #314 <Method int Log.e(String, String)>
	//  147  383:pop             
				break;
	//  148  384:goto            410
			}
			try
			{
				downloadManager.handleAction(((byte []) (intent)));
	//  149  387:aload_0         
	//  150  388:getfield        #107 <Field DownloadManager downloadManager>
	//  151  391:aload_1         
	//  152  392:invokevirtual   #330 <Method int DownloadManager.handleAction(byte[])>
	//  153  395:pop             
			}
	//* 154  396:goto            410
			// Misplaced declaration of an exception variable
			catch(Intent intent)
	//* 155  399:astore_1        
			{
				Log.e("DownloadService", "Failed to handle ADD action", ((Throwable) (intent)));
	//  156  400:ldc1            #47  <String "DownloadService">
	//  157  402:ldc2            #332 <String "Failed to handle ADD action">
	//  158  405:aload_1         
	//  159  406:invokestatic    #335 <Method int Log.e(String, String, Throwable)>
	//  160  409:pop             
			}
			break;
		}
		maybeStartWatchingRequirements();
	//  161  410:aload_0         
	//  162  411:invokespecial   #97  <Method void maybeStartWatchingRequirements()>
		if(downloadManager.isIdle())
	//* 163  414:aload_0         
	//* 164  415:getfield        #107 <Field DownloadManager downloadManager>
	//* 165  418:invokevirtual   #339 <Method boolean DownloadManager.isIdle()>
	//* 166  421:ifeq            428
			stop();
	//  167  424:aload_0         
	//  168  425:invokespecial   #103 <Method void stop()>
		return 1;
	//  169  428:iconst_1        
	//  170  429:ireturn         
	}

	public void onTaskRemoved(Intent intent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #225 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #226 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("onTaskRemoved rootIntent: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #343 <String "onTaskRemoved rootIntent: ">
	//    6   12:invokevirtual   #232 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(((Object) (intent)));
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #346 <Method StringBuilder StringBuilder.append(Object)>
	//   11   21:pop             
		logd(stringbuilder.toString());
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #244 <Method String StringBuilder.toString()>
	//   15   27:invokespecial   #173 <Method void logd(String)>
		taskRemoved = true;
	//   16   30:aload_0         
	//   17   31:iconst_1        
	//   18   32:putfield        #212 <Field boolean taskRemoved>
	//   19   35:return          
	}

	protected void onTaskStateChanged(DownloadManager.TaskState taskstate)
	{
	//    0    0:return          
	}

	public static final String ACTION_ADD = "com.google.android.exoplayer.downloadService.action.ADD";
	public static final String ACTION_INIT = "com.google.android.exoplayer.downloadService.action.INIT";
	private static final String ACTION_RESTART = "com.google.android.exoplayer.downloadService.action.RESTART";
	private static final String ACTION_START_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.START_DOWNLOADS";
	private static final String ACTION_STOP_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.STOP_DOWNLOADS";
	private static final boolean DEBUG = false;
	public static final long DEFAULT_FOREGROUND_NOTIFICATION_UPDATE_INTERVAL = 1000L;
	public static final String KEY_DOWNLOAD_ACTION = "download_action";
	public static final String KEY_FOREGROUND = "foreground";
	private static final String TAG = "DownloadService";
	private static final HashMap requirementsHelpers = new HashMap();
	private final String channelId;
	private final int channelName;
	private DownloadManager downloadManager;
	private DownloadManagerListener downloadManagerListener;
	private final ForegroundNotificationUpdater foregroundNotificationUpdater;
	private int lastStartId;
	private boolean startedInForeground;
	private boolean taskRemoved;

	static 
	{
	//    0    0:new             #68  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #71  <Method void HashMap()>
	//    3    7:putstatic       #73  <Field HashMap requirementsHelpers>
	//*   4   10:return          
	}


/*
	static void access$200(DownloadService downloadservice)
	{
		downloadservice.maybeStartWatchingRequirements();
	//    0    0:aload_0         
	//    1    1:invokespecial   #97  <Method void maybeStartWatchingRequirements()>
		return;
	//    2    4:return          
	}

*/


/*
	static ForegroundNotificationUpdater access$300(DownloadService downloadservice)
	{
		return downloadservice.foregroundNotificationUpdater;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field DownloadService$ForegroundNotificationUpdater foregroundNotificationUpdater>
	//    2    4:areturn         
	}

*/


/*
	static void access$400(DownloadService downloadservice)
	{
		downloadservice.stop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #103 <Method void stop()>
		return;
	//    2    4:return          
	}

*/


/*
	static DownloadManager access$500(DownloadService downloadservice)
	{
		return downloadservice.downloadManager;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field DownloadManager downloadManager>
	//    2    4:areturn         
	}

*/
}
