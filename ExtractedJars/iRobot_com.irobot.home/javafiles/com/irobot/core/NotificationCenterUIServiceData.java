// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			NotificationCenterDataItem

public abstract class NotificationCenterUIServiceData
{
	private static final class CppProxy extends NotificationCenterUIServiceData
	{

		private native void nativeDestroy(long l);

		private native ArrayList native_getDataStateChangelist(long l);

		private native ArrayList native_getNotificationList(long l);

		private native int native_getNumberOfUnreadNotifications(long l);

		private native ArrayList native_getReadNotifications(long l);

		private native ArrayList native_getUnreadNotifications(long l);

		private native void native_setNotificationToUpdate(long l, NotificationCenterDataItem notificationcenterdataitem);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #50  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #52  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #55  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #59  <Method void Object.finalize()>
		//    4    8:return          
		}

		public ArrayList getDataStateChangelist()
		{
			return native_getDataStateChangelist(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #63  <Method ArrayList native_getDataStateChangelist(long)>
		//    4    8:areturn         
		}

		public ArrayList getNotificationList()
		{
			return native_getNotificationList(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #68  <Method ArrayList native_getNotificationList(long)>
		//    4    8:areturn         
		}

		public int getNumberOfUnreadNotifications()
		{
			return native_getNumberOfUnreadNotifications(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #73  <Method int native_getNumberOfUnreadNotifications(long)>
		//    4    8:ireturn         
		}

		public ArrayList getReadNotifications()
		{
			return native_getReadNotifications(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #76  <Method ArrayList native_getReadNotifications(long)>
		//    4    8:areturn         
		}

		public ArrayList getUnreadNotifications()
		{
			return native_getUnreadNotifications(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #79  <Method ArrayList native_getUnreadNotifications(long)>
		//    4    8:areturn         
		}

		public void setNotificationToUpdate(NotificationCenterDataItem notificationcenterdataitem)
		{
			native_setNotificationToUpdate(nativeRef, notificationcenterdataitem);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #83  <Method void native_setNotificationToUpdate(long, NotificationCenterDataItem)>
		//    5    9:return          
		}

		static final boolean $assertionsDisabled = false;
		private final AtomicBoolean destroyed = new AtomicBoolean(false);
		private final long nativeRef;

		static 
		{
		//    0    0:return          
		}

		private CppProxy(long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void NotificationCenterUIServiceData()>
		//    2    4:aload_0         
		//    3    5:new             #21  <Class AtomicBoolean>
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:invokespecial   #24  <Method void AtomicBoolean(boolean)>
		//    7   13:putfield        #26  <Field AtomicBoolean destroyed>
			if(l == 0L)
		//*   8   16:lload_1         
		//*   9   17:lconst_0        
		//*  10   18:lcmp            
		//*  11   19:ifne            32
			{
				throw new RuntimeException("nativeRef is zero");
		//   12   22:new             #28  <Class RuntimeException>
		//   13   25:dup             
		//   14   26:ldc1            #30  <String "nativeRef is zero">
		//   15   28:invokespecial   #33  <Method void RuntimeException(String)>
		//   16   31:athrow          
			} else
			{
				nativeRef = l;
		//   17   32:aload_0         
		//   18   33:lload_1         
		//   19   34:putfield        #35  <Field long nativeRef>
				return;
		//   20   37:return          
			}
		}
	}


	public NotificationCenterUIServiceData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static native NotificationCenterUIServiceData create();

	public abstract ArrayList getDataStateChangelist();

	public abstract ArrayList getNotificationList();

	public abstract int getNumberOfUnreadNotifications();

	public abstract ArrayList getReadNotifications();

	public abstract ArrayList getUnreadNotifications();

	public abstract void setNotificationToUpdate(NotificationCenterDataItem notificationcenterdataitem);
}
