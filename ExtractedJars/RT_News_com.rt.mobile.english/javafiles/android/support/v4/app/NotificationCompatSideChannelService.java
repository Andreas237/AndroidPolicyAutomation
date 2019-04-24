// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;

public abstract class NotificationCompatSideChannelService extends Service
{
	private class NotificationSideChannelStub extends INotificationSideChannel.Stub
	{

		public void cancel(String s, int i, String s1)
			throws RemoteException
		{
			long l;
			checkPermission(getCallingUid(), s);
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field NotificationCompatSideChannelService this$0>
		//    2    4:invokestatic    #25  <Method int getCallingUid()>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #29  <Method void NotificationCompatSideChannelService.checkPermission(int, String)>
			l = clearCallingIdentity();
		//    5   11:invokestatic    #33  <Method long clearCallingIdentity()>
		//    6   14:lstore          4
			NotificationCompatSideChannelService.this.cancel(s, i, s1);
		//    7   16:aload_0         
		//    8   17:getfield        #13  <Field NotificationCompatSideChannelService this$0>
		//    9   20:aload_1         
		//   10   21:iload_2         
		//   11   22:aload_3         
		//   12   23:invokevirtual   #35  <Method void NotificationCompatSideChannelService.cancel(String, int, String)>
			restoreCallingIdentity(l);
		//   13   26:lload           4
		//   14   28:invokestatic    #39  <Method void restoreCallingIdentity(long)>
			return;
		//   15   31:return          
			s;
		//   16   32:astore_1        
			restoreCallingIdentity(l);
		//   17   33:lload           4
		//   18   35:invokestatic    #39  <Method void restoreCallingIdentity(long)>
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
		//    2    4:invokestatic    #25  <Method int getCallingUid()>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #29  <Method void NotificationCompatSideChannelService.checkPermission(int, String)>
			l = clearCallingIdentity();
		//    5   11:invokestatic    #33  <Method long clearCallingIdentity()>
		//    6   14:lstore_2        
			NotificationCompatSideChannelService.this.cancelAll(s);
		//    7   15:aload_0         
		//    8   16:getfield        #13  <Field NotificationCompatSideChannelService this$0>
		//    9   19:aload_1         
		//   10   20:invokevirtual   #44  <Method void NotificationCompatSideChannelService.cancelAll(String)>
			restoreCallingIdentity(l);
		//   11   23:lload_2         
		//   12   24:invokestatic    #39  <Method void restoreCallingIdentity(long)>
			return;
		//   13   27:return          
			s;
		//   14   28:astore_1        
			restoreCallingIdentity(l);
		//   15   29:lload_2         
		//   16   30:invokestatic    #39  <Method void restoreCallingIdentity(long)>
			throw s;
		//   17   33:aload_1         
		//   18   34:athrow          
		}

		public void notify(String s, int i, String s1, Notification notification)
			throws RemoteException
		{
			long l;
			checkPermission(getCallingUid(), s);
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field NotificationCompatSideChannelService this$0>
		//    2    4:invokestatic    #25  <Method int getCallingUid()>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #29  <Method void NotificationCompatSideChannelService.checkPermission(int, String)>
			l = clearCallingIdentity();
		//    5   11:invokestatic    #33  <Method long clearCallingIdentity()>
		//    6   14:lstore          5
			NotificationCompatSideChannelService.this.notify(s, i, s1, notification);
		//    7   16:aload_0         
		//    8   17:getfield        #13  <Field NotificationCompatSideChannelService this$0>
		//    9   20:aload_1         
		//   10   21:iload_2         
		//   11   22:aload_3         
		//   12   23:aload           4
		//   13   25:invokevirtual   #48  <Method void NotificationCompatSideChannelService.notify(String, int, String, Notification)>
			restoreCallingIdentity(l);
		//   14   28:lload           5
		//   15   30:invokestatic    #39  <Method void restoreCallingIdentity(long)>
			return;
		//   16   33:return          
			s;
		//   17   34:astore_1        
			restoreCallingIdentity(l);
		//   18   35:lload           5
		//   19   37:invokestatic    #39  <Method void restoreCallingIdentity(long)>
			throw s;
		//   20   40:aload_1         
		//   21   41:athrow          
		}

		final NotificationCompatSideChannelService this$0;

		NotificationSideChannelStub()
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


	public NotificationCompatSideChannelService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Service()>
	//    2    4:return          
	}

	public abstract void cancel(String s, int i, String s1);

	public abstract void cancelAll(String s);

	void checkPermission(int i, String s)
	{
		String as[] = getPackageManager().getPackagesForUid(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method PackageManager getPackageManager()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #28  <Method String[] PackageManager.getPackagesForUid(int)>
	//    4    8:astore          5
		int j = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		for(int k = as.length; j < k; j++)
	//*   7   12:aload           5
	//*   8   14:arraylength     
	//*   9   15:istore          4
	//*  10   17:iload_3         
	//*  11   18:iload           4
	//*  12   20:icmpge          42
			if(as[j].equals(((Object) (s))))
	//*  13   23:aload           5
	//*  14   25:iload_3         
	//*  15   26:aaload          
	//*  16   27:aload_2         
	//*  17   28:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*  18   31:ifeq            35
				return;
	//   19   34:return          

	//   20   35:iload_3         
	//   21   36:iconst_1        
	//   22   37:iadd            
	//   23   38:istore_3        
	//*  24   39:goto            17
		StringBuilder stringbuilder = new StringBuilder();
	//   25   42:new             #36  <Class StringBuilder>
	//   26   45:dup             
	//   27   46:invokespecial   #37  <Method void StringBuilder()>
	//   28   49:astore          5
		stringbuilder.append("NotificationSideChannelService: Uid ");
	//   29   51:aload           5
	//   30   53:ldc1            #39  <String "NotificationSideChannelService: Uid ">
	//   31   55:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   32   58:pop             
		stringbuilder.append(i);
	//   33   59:aload           5
	//   34   61:iload_1         
	//   35   62:invokevirtual   #46  <Method StringBuilder StringBuilder.append(int)>
	//   36   65:pop             
		stringbuilder.append(" is not authorized for package ");
	//   37   66:aload           5
	//   38   68:ldc1            #48  <String " is not authorized for package ">
	//   39   70:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   40   73:pop             
		stringbuilder.append(s);
	//   41   74:aload           5
	//   42   76:aload_2         
	//   43   77:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   44   80:pop             
		throw new SecurityException(stringbuilder.toString());
	//   45   81:new             #50  <Class SecurityException>
	//   46   84:dup             
	//   47   85:aload           5
	//   48   87:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   49   90:invokespecial   #56  <Method void SecurityException(String)>
	//   50   93:athrow          
	}

	public abstract void notify(String s, int i, String s1, Notification notification);

	public IBinder onBind(Intent intent)
	{
		if(intent.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #65  <Method String Intent.getAction()>
	//*   2    4:ldc1            #67  <String "android.support.BIND_NOTIFICATION_SIDE_CHANNEL">
	//*   3    6:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*   4    9:ifeq            31
		{
			if(android.os.Build.VERSION.SDK_INT > 19)
	//*   5   12:getstatic       #73  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   15:bipush          19
	//*   7   17:icmple          22
				return null;
	//    8   20:aconst_null     
	//    9   21:areturn         
			else
				return ((IBinder) (new NotificationSideChannelStub()));
	//   10   22:new             #6   <Class NotificationCompatSideChannelService$NotificationSideChannelStub>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:invokespecial   #76  <Method void NotificationCompatSideChannelService$NotificationSideChannelStub(NotificationCompatSideChannelService)>
	//   14   30:areturn         
		} else
		{
			return null;
	//   15   31:aconst_null     
	//   16   32:areturn         
		}
	}
}
