// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import android.os.Handler;
import android.os.Looper;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			DownloadService, DownloadManager

private final class DownloadService$ForegroundNotificationUpdater
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
		DownloadManager.TaskState ataskstate[] = DownloadService.access$500(DownloadService.this).getAllTaskStates();
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
	//   12   24:invokevirtual   #74  <Method android.app.Notification DownloadService.getForegroundNotification(DownloadManager$TaskState[])>
	//   13   27:invokevirtual   #78  <Method void DownloadService.startForeground(int, android.app.Notification)>
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

	public DownloadService$ForegroundNotificationUpdater(int i, long l)
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
