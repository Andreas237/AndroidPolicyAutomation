// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			NotificationCenterDataItem

private static final class NotificationCenterDataItem$CppProxy extends NotificationCenterDataItem
{

	private native void nativeDestroy(long l);

	private native ArrayList native_getActionPayload(long l);

	private native String native_getActionType(long l);

	private native String native_getCategoryIconId(long l);

	private native String native_getCategoryTitleText(long l);

	private native String native_getCategoryTitleTextId(long l);

	private native int native_getDetailsContentId(long l);

	private native int native_getDetailsContentVersion(long l);

	private native String native_getDisplayType(long l);

	private native String native_getEventId(long l);

	private native int native_getEventState(long l);

	private native String native_getHeadlineText(long l);

	private native String native_getHeadlineTextId(long l);

	private native String native_getNotificationType(long l);

	private native boolean native_getReadStatus(long l);

	private native String native_getSchedulingVersion(long l);

	private native int native_getTimestamp(long l);

	private native HashMap native_getV1ScheduleDayMap(long l);

	private native void native_setNotificationAsRead(long l);

	public void destroy()
	{
		if(!destroyed.getAndSet(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #64  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            19
			nativeDestroy(nativeRef);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field long nativeRef>
	//    8   16:invokespecial   #66  <Method void nativeDestroy(long)>
	//    9   19:return          
	}

	protected void finalize()
	{
		destroy();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #69  <Method void destroy()>
		((Object)this).finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #73  <Method void Object.finalize()>
	//    4    8:return          
	}

	public ArrayList getActionPayload()
	{
		return native_getActionPayload(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #77  <Method ArrayList native_getActionPayload(long)>
	//    4    8:areturn         
	}

	public String getActionType()
	{
		return native_getActionType(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #83  <Method String native_getActionType(long)>
	//    4    8:areturn         
	}

	public String getCategoryIconId()
	{
		return native_getCategoryIconId(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #86  <Method String native_getCategoryIconId(long)>
	//    4    8:areturn         
	}

	public String getCategoryTitleText()
	{
		return native_getCategoryTitleText(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #89  <Method String native_getCategoryTitleText(long)>
	//    4    8:areturn         
	}

	public String getCategoryTitleTextId()
	{
		return native_getCategoryTitleTextId(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #92  <Method String native_getCategoryTitleTextId(long)>
	//    4    8:areturn         
	}

	public int getDetailsContentId()
	{
		return native_getDetailsContentId(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #96  <Method int native_getDetailsContentId(long)>
	//    4    8:ireturn         
	}

	public int getDetailsContentVersion()
	{
		return native_getDetailsContentVersion(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #99  <Method int native_getDetailsContentVersion(long)>
	//    4    8:ireturn         
	}

	public String getDisplayType()
	{
		return native_getDisplayType(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #102 <Method String native_getDisplayType(long)>
	//    4    8:areturn         
	}

	public String getEventId()
	{
		return native_getEventId(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #105 <Method String native_getEventId(long)>
	//    4    8:areturn         
	}

	public int getEventState()
	{
		return native_getEventState(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #108 <Method int native_getEventState(long)>
	//    4    8:ireturn         
	}

	public String getHeadlineText()
	{
		return native_getHeadlineText(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #111 <Method String native_getHeadlineText(long)>
	//    4    8:areturn         
	}

	public String getHeadlineTextId()
	{
		return native_getHeadlineTextId(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #114 <Method String native_getHeadlineTextId(long)>
	//    4    8:areturn         
	}

	public String getNotificationType()
	{
		return native_getNotificationType(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #117 <Method String native_getNotificationType(long)>
	//    4    8:areturn         
	}

	public boolean getReadStatus()
	{
		return native_getReadStatus(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #121 <Method boolean native_getReadStatus(long)>
	//    4    8:ireturn         
	}

	public String getSchedulingVersion()
	{
		return native_getSchedulingVersion(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #124 <Method String native_getSchedulingVersion(long)>
	//    4    8:areturn         
	}

	public int getTimestamp()
	{
		return native_getTimestamp(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #127 <Method int native_getTimestamp(long)>
	//    4    8:ireturn         
	}

	public HashMap getV1ScheduleDayMap()
	{
		return native_getV1ScheduleDayMap(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #131 <Method HashMap native_getV1ScheduleDayMap(long)>
	//    4    8:areturn         
	}

	public void setNotificationAsRead()
	{
		native_setNotificationAsRead(nativeRef);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field long nativeRef>
	//    3    5:invokespecial   #135 <Method void native_setNotificationAsRead(long)>
	//    4    8:return          
	}

	static final boolean $assertionsDisabled = false;
	private final AtomicBoolean destroyed = new AtomicBoolean(false);
	private final long nativeRef;

	static 
	{
	//    0    0:return          
	}

	private NotificationCenterDataItem$CppProxy(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void NotificationCenterDataItem()>
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
