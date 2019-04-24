// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;


// Referenced classes of package com.google.android.exoplayer2.offline:
//			DownloadService, DownloadManager

private final class DownloadService$DownloadManagerListener
	implements DownloadManager.Listener
{

	public final void onIdle(DownloadManager downloadmanager)
	{
		DownloadService.access$400(DownloadService.this);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DownloadService this$0>
	//    2    4:invokestatic    #27  <Method void DownloadService.access$400(DownloadService)>
	//    3    7:return          
	}

	public void onInitialized(DownloadManager downloadmanager)
	{
		DownloadService.access$200(DownloadService.this);
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
			DownloadService.access$300(DownloadService.this).startPeriodicUpdates();
	//    8   16:aload_0         
	//    9   17:getfield        #15  <Field DownloadService this$0>
	//   10   20:invokestatic    #46  <Method DownloadService$ForegroundNotificationUpdater DownloadService.access$300(DownloadService)>
	//   11   23:invokevirtual   #51  <Method void DownloadService$ForegroundNotificationUpdater.startPeriodicUpdates()>
			return;
	//   12   26:return          
		} else
		{
			DownloadService.access$300(DownloadService.this).update();
	//   13   27:aload_0         
	//   14   28:getfield        #15  <Field DownloadService this$0>
	//   15   31:invokestatic    #46  <Method DownloadService$ForegroundNotificationUpdater DownloadService.access$300(DownloadService)>
	//   16   34:invokevirtual   #54  <Method void DownloadService$ForegroundNotificationUpdater.update()>
			return;
	//   17   37:return          
		}
	}

	final DownloadService this$0;

	private DownloadService$DownloadManagerListener()
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

	DownloadService$DownloadManagerListener(DownloadService._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void DownloadService$DownloadManagerListener(DownloadService)>
	//    3    5:return          
	}
}
