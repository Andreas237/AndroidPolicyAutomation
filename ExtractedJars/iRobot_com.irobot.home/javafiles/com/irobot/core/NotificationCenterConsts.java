// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class NotificationCenterConsts
{
	private static final class CppProxy extends NotificationCenterConsts
	{

		private native void nativeDestroy(long l);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #37  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #30  <Field long nativeRef>
		//    8   16:invokespecial   #39  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #42  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #46  <Method void Object.finalize()>
		//    4    8:return          
		}

		private final AtomicBoolean destroyed = new AtomicBoolean(false);
		private final long nativeRef;

		private CppProxy(long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void NotificationCenterConsts()>
		//    2    4:aload_0         
		//    3    5:new             #16  <Class AtomicBoolean>
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:invokespecial   #19  <Method void AtomicBoolean(boolean)>
		//    7   13:putfield        #21  <Field AtomicBoolean destroyed>
			if(l == 0L)
		//*   8   16:lload_1         
		//*   9   17:lconst_0        
		//*  10   18:lcmp            
		//*  11   19:ifne            32
			{
				throw new RuntimeException("nativeRef is zero");
		//   12   22:new             #23  <Class RuntimeException>
		//   13   25:dup             
		//   14   26:ldc1            #25  <String "nativeRef is zero">
		//   15   28:invokespecial   #28  <Method void RuntimeException(String)>
		//   16   31:athrow          
			} else
			{
				nativeRef = l;
		//   17   32:aload_0         
		//   18   33:lload_1         
		//   19   34:putfield        #30  <Field long nativeRef>
				return;
		//   20   37:return          
			}
		}
	}


	public NotificationCenterConsts()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method void Object()>
	//    2    4:return          
	}

	public static final String ACTION_PAYLOAD_CONTENT_ID = "content_id";
	public static final String ACTION_PAYLOAD_CONTENT_TEXT = "content_text";
	public static final String ACTION_PAYLOAD_DISPLAY_ORDER = "display_order";
	public static final String ACTION_PAYLOAD_HTML = "html";
	public static final String ACTION_PAYLOAD_IMAGE = "image";
	public static final String ACTION_PAYLOAD_IMAGE_ID = "image_id";
	public static final String ACTION_PAYLOAD_IMAGE_U_R_L = "image_url";
	public static final String ACTION_PAYLOAD_INTERNAL_VIDEO_U_R_L = "internal_video_url";
	public static final String ACTION_PAYLOAD_NUMBER_OF_SCHEDULES_TO_DISPLAY = "numberOfSchedulesToDisplay";
	public static final String ACTION_PAYLOAD_RESPONSE_TYPE = "response_type";
	public static final String ACTION_PAYLOAD_VIDEO_ID = "video_id";
	public static final String ACTION_PAYLOAD_VIDEO_U_R_L = "video_url";
	public static final String NOTIFICATION_ACTION_TYPE_CONTENT = "content";
	public static final String NOTIFICATION_ACTION_TYPE_SCHEDULE = "schedule-v1.0.0";
	public static final String NOTIFICATION_DISPLAY_TYPE_CARD_VIEW = "card_view";
	public static final String NOTIFICATION_DISPLAY_TYPE_INLINE = "inline";
	public static final String NOTIFICATION_DISPLAY_TYPE_SEPERATE_VIEW = "separate_view";
	public static final String NOTIFICATION_SCHEDULE_RECOMMENDATION_V1 = "1.0";
	public static final String NOTIFICATION_TYPE_NOTIFICATION = "Notification";
	public static final String NOTIFICATION_TYPE_SMART_SCHEDULE_RECOMMENDATION = "SmartScheduleRecommendation";
	public static final int SMART_RECOMMENDATION_ACCEPT_DELAY = 300;
	public static final int SMART_RECOMMENDATION_COLLAPSING_DURATION = 200;
	public static final int SMART_RECOMMENDATION_EXPANDING_DURATION = 300;
}
