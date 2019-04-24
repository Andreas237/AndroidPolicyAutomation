// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//			NotificationCompatSideChannelService

private class NotificationCompatSideChannelService$NotificationSideChannelStub extends INotificationSideChannel.Stub
{

	public void cancel(String s, int i, String s1)
	{
		long l;
		checkPermission(getCallingUid(), s);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field NotificationCompatSideChannelService this$0>
	//    2    4:invokestatic    #23  <Method int getCallingUid()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #27  <Method void NotificationCompatSideChannelService.checkPermission(int, String)>
		l = clearCallingIdentity();
	//    5   11:invokestatic    #31  <Method long clearCallingIdentity()>
	//    6   14:lstore          4
		NotificationCompatSideChannelService.this.cancel(s, i, s1);
	//    7   16:aload_0         
	//    8   17:getfield        #13  <Field NotificationCompatSideChannelService this$0>
	//    9   20:aload_1         
	//   10   21:iload_2         
	//   11   22:aload_3         
	//   12   23:invokevirtual   #33  <Method void NotificationCompatSideChannelService.cancel(String, int, String)>
		restoreCallingIdentity(l);
	//   13   26:lload           4
	//   14   28:invokestatic    #37  <Method void restoreCallingIdentity(long)>
		return;
	//   15   31:return          
		s;
	//   16   32:astore_1        
		restoreCallingIdentity(l);
	//   17   33:lload           4
	//   18   35:invokestatic    #37  <Method void restoreCallingIdentity(long)>
		throw s;
	//   19   38:aload_1         
	//   20   39:athrow          
	}

	public void cancelAll(String s)
	{
		long l;
		checkPermission(getCallingUid(), s);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field NotificationCompatSideChannelService this$0>
	//    2    4:invokestatic    #23  <Method int getCallingUid()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #27  <Method void NotificationCompatSideChannelService.checkPermission(int, String)>
		l = clearCallingIdentity();
	//    5   11:invokestatic    #31  <Method long clearCallingIdentity()>
	//    6   14:lstore_2        
		NotificationCompatSideChannelService.this.cancelAll(s);
	//    7   15:aload_0         
	//    8   16:getfield        #13  <Field NotificationCompatSideChannelService this$0>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #41  <Method void NotificationCompatSideChannelService.cancelAll(String)>
		restoreCallingIdentity(l);
	//   11   23:lload_2         
	//   12   24:invokestatic    #37  <Method void restoreCallingIdentity(long)>
		return;
	//   13   27:return          
		s;
	//   14   28:astore_1        
		restoreCallingIdentity(l);
	//   15   29:lload_2         
	//   16   30:invokestatic    #37  <Method void restoreCallingIdentity(long)>
		throw s;
	//   17   33:aload_1         
	//   18   34:athrow          
	}

	public void notify(String s, int i, String s1, Notification notification)
	{
		long l;
		checkPermission(getCallingUid(), s);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field NotificationCompatSideChannelService this$0>
	//    2    4:invokestatic    #23  <Method int getCallingUid()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #27  <Method void NotificationCompatSideChannelService.checkPermission(int, String)>
		l = clearCallingIdentity();
	//    5   11:invokestatic    #31  <Method long clearCallingIdentity()>
	//    6   14:lstore          5
		NotificationCompatSideChannelService.this.notify(s, i, s1, notification);
	//    7   16:aload_0         
	//    8   17:getfield        #13  <Field NotificationCompatSideChannelService this$0>
	//    9   20:aload_1         
	//   10   21:iload_2         
	//   11   22:aload_3         
	//   12   23:aload           4
	//   13   25:invokevirtual   #45  <Method void NotificationCompatSideChannelService.notify(String, int, String, Notification)>
		restoreCallingIdentity(l);
	//   14   28:lload           5
	//   15   30:invokestatic    #37  <Method void restoreCallingIdentity(long)>
		return;
	//   16   33:return          
		s;
	//   17   34:astore_1        
		restoreCallingIdentity(l);
	//   18   35:lload           5
	//   19   37:invokestatic    #37  <Method void restoreCallingIdentity(long)>
		throw s;
	//   20   40:aload_1         
	//   21   41:athrow          
	}

	final NotificationCompatSideChannelService this$0;

	NotificationCompatSideChannelService$NotificationSideChannelStub()
	{
		this$0 = NotificationCompatSideChannelService.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field NotificationCompatSideChannelService this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void INotificationSideChannel$Stub()>
	//    5    9:return          
	}
}
