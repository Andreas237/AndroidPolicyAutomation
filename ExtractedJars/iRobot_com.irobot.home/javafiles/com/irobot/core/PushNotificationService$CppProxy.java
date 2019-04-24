// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			PushNotificationService, PushPlatformType, PushNotificationHandler, PushNotificationType

private static final class PushNotificationService$CppProxy extends PushNotificationService
{

	private native void nativeDestroy(long l);

	private native void native_queryNotificationSettings(long l);

	private native void native_registerForPushNotifications(long l);

	private native void native_registerPushNotificationToken(long l, String s, PushPlatformType pushplatformtype);

	private native void native_setPushNotificationHandler(long l, PushNotificationHandler pushnotificationhandler);

	private native void native_updatePushNotificationSetting(long l, PushNotificationType pushnotificationtype, boolean flag);

	public void destroy()
	{
		if(!destroyed.getAndSet(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #49  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            19
			nativeDestroy(nativeRef);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field long nativeRef>
	//    8   16:invokespecial   #51  <Method void nativeDestroy(long)>
	//    9   19:return          
	}

	protected void finalize()
	{
		destroy();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #54  <Method void destroy()>
		((Object)this).finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #58  <Method void Object.finalize()>
	//    4    8:return          
	}

	public void queryNotificationSettings()
	{
		native_queryNotificationSettings(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #61  <Method void native_queryNotificationSettings(long)>
	//    4    8:return          
	}

	public void registerForPushNotifications()
	{
		native_registerForPushNotifications(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #64  <Method void native_registerForPushNotifications(long)>
	//    4    8:return          
	}

	public void registerPushNotificationToken(String s, PushPlatformType pushplatformtype)
	{
		native_registerPushNotificationToken(nativeRef, s, pushplatformtype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #68  <Method void native_registerPushNotificationToken(long, String, PushPlatformType)>
	//    6   10:return          
	}

	public void setPushNotificationHandler(PushNotificationHandler pushnotificationhandler)
	{
		native_setPushNotificationHandler(nativeRef, pushnotificationhandler);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:invokespecial   #72  <Method void native_setPushNotificationHandler(long, PushNotificationHandler)>
	//    5    9:return          
	}

	public void updatePushNotificationSetting(PushNotificationType pushnotificationtype, boolean flag)
	{
		native_updatePushNotificationSetting(nativeRef, pushnotificationtype, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #76  <Method void native_updatePushNotificationSetting(long, PushNotificationType, boolean)>
	//    6   10:return          
	}

	static final boolean $assertionsDisabled = false;
	private final AtomicBoolean destroyed = new AtomicBoolean(false);
	private final long nativeRef;

	static 
	{
	//    0    0:return          
	}

	private PushNotificationService$CppProxy(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void PushNotificationService()>
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
