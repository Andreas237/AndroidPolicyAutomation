// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityRecordCompat, AccessibilityEventCompatIcs, AccessibilityEventCompatJellyBean, AccessibilityEventCompatKitKat

public final class AccessibilityEventCompat
{
	static class AccessibilityEventIcsImpl extends AccessibilityEventStubImpl
	{

		public void appendRecord(AccessibilityEvent accessibilityevent, Object obj)
		{
			AccessibilityEventCompatIcs.appendRecord(accessibilityevent, obj);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #18  <Method void AccessibilityEventCompatIcs.appendRecord(AccessibilityEvent, Object)>
		//    3    5:return          
		}

		public Object getRecord(AccessibilityEvent accessibilityevent, int i)
		{
			return AccessibilityEventCompatIcs.getRecord(accessibilityevent, i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokestatic    #22  <Method Object AccessibilityEventCompatIcs.getRecord(AccessibilityEvent, int)>
		//    3    5:areturn         
		}

		public int getRecordCount(AccessibilityEvent accessibilityevent)
		{
			return AccessibilityEventCompatIcs.getRecordCount(accessibilityevent);
		//    0    0:aload_1         
		//    1    1:invokestatic    #26  <Method int AccessibilityEventCompatIcs.getRecordCount(AccessibilityEvent)>
		//    2    4:ireturn         
		}

		AccessibilityEventIcsImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void AccessibilityEventCompat$AccessibilityEventStubImpl()>
		//    2    4:return          
		}
	}

	static class AccessibilityEventJellyBeanImpl extends AccessibilityEventIcsImpl
	{

		public int getAction(AccessibilityEvent accessibilityevent)
		{
			return AccessibilityEventCompatJellyBean.getAction(accessibilityevent);
		//    0    0:aload_1         
		//    1    1:invokestatic    #18  <Method int AccessibilityEventCompatJellyBean.getAction(AccessibilityEvent)>
		//    2    4:ireturn         
		}

		public int getMovementGranularity(AccessibilityEvent accessibilityevent)
		{
			return AccessibilityEventCompatJellyBean.getMovementGranularity(accessibilityevent);
		//    0    0:aload_1         
		//    1    1:invokestatic    #21  <Method int AccessibilityEventCompatJellyBean.getMovementGranularity(AccessibilityEvent)>
		//    2    4:ireturn         
		}

		public void setAction(AccessibilityEvent accessibilityevent, int i)
		{
			AccessibilityEventCompatJellyBean.setAction(accessibilityevent, i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokestatic    #25  <Method void AccessibilityEventCompatJellyBean.setAction(AccessibilityEvent, int)>
		//    3    5:return          
		}

		public void setMovementGranularity(AccessibilityEvent accessibilityevent, int i)
		{
			AccessibilityEventCompatJellyBean.setMovementGranularity(accessibilityevent, i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokestatic    #28  <Method void AccessibilityEventCompatJellyBean.setMovementGranularity(AccessibilityEvent, int)>
		//    3    5:return          
		}

		AccessibilityEventJellyBeanImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void AccessibilityEventCompat$AccessibilityEventIcsImpl()>
		//    2    4:return          
		}
	}

	static class AccessibilityEventKitKatImpl extends AccessibilityEventJellyBeanImpl
	{

		public int getContentChangeTypes(AccessibilityEvent accessibilityevent)
		{
			return AccessibilityEventCompatKitKat.getContentChangeTypes(accessibilityevent);
		//    0    0:aload_1         
		//    1    1:invokestatic    #18  <Method int AccessibilityEventCompatKitKat.getContentChangeTypes(AccessibilityEvent)>
		//    2    4:ireturn         
		}

		public void setContentChangeTypes(AccessibilityEvent accessibilityevent, int i)
		{
			AccessibilityEventCompatKitKat.setContentChangeTypes(accessibilityevent, i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokestatic    #22  <Method void AccessibilityEventCompatKitKat.setContentChangeTypes(AccessibilityEvent, int)>
		//    3    5:return          
		}

		AccessibilityEventKitKatImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void AccessibilityEventCompat$AccessibilityEventJellyBeanImpl()>
		//    2    4:return          
		}
	}

	static class AccessibilityEventStubImpl
		implements AccessibilityEventVersionImpl
	{

		public void appendRecord(AccessibilityEvent accessibilityevent, Object obj)
		{
		//    0    0:return          
		}

		public int getAction(AccessibilityEvent accessibilityevent)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getContentChangeTypes(AccessibilityEvent accessibilityevent)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getMovementGranularity(AccessibilityEvent accessibilityevent)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public Object getRecord(AccessibilityEvent accessibilityevent, int i)
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public int getRecordCount(AccessibilityEvent accessibilityevent)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void setAction(AccessibilityEvent accessibilityevent, int i)
		{
		//    0    0:return          
		}

		public void setContentChangeTypes(AccessibilityEvent accessibilityevent, int i)
		{
		//    0    0:return          
		}

		public void setMovementGranularity(AccessibilityEvent accessibilityevent, int i)
		{
		//    0    0:return          
		}

		AccessibilityEventStubImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static interface AccessibilityEventVersionImpl
	{

		public abstract void appendRecord(AccessibilityEvent accessibilityevent, Object obj);

		public abstract int getAction(AccessibilityEvent accessibilityevent);

		public abstract int getContentChangeTypes(AccessibilityEvent accessibilityevent);

		public abstract int getMovementGranularity(AccessibilityEvent accessibilityevent);

		public abstract Object getRecord(AccessibilityEvent accessibilityevent, int i);

		public abstract int getRecordCount(AccessibilityEvent accessibilityevent);

		public abstract void setAction(AccessibilityEvent accessibilityevent, int i);

		public abstract void setContentChangeTypes(AccessibilityEvent accessibilityevent, int i);

		public abstract void setMovementGranularity(AccessibilityEvent accessibilityevent, int i);
	}


	private AccessibilityEventCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void Object()>
	//    2    4:return          
	}

	public static void appendRecord(AccessibilityEvent accessibilityevent, AccessibilityRecordCompat accessibilityrecordcompat)
	{
		IMPL.appendRecord(accessibilityevent, accessibilityrecordcompat.getImpl());
	//    0    0:getstatic       #80  <Field AccessibilityEventCompat$AccessibilityEventVersionImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #93  <Method Object AccessibilityRecordCompat.getImpl()>
	//    4    8:invokeinterface #96  <Method void AccessibilityEventCompat$AccessibilityEventVersionImpl.appendRecord(AccessibilityEvent, Object)>
	//    5   13:return          
	}

	public static AccessibilityRecordCompat asRecord(AccessibilityEvent accessibilityevent)
	{
		return new AccessibilityRecordCompat(((Object) (accessibilityevent)));
	//    0    0:new             #89  <Class AccessibilityRecordCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #101 <Method void AccessibilityRecordCompat(Object)>
	//    4    8:areturn         
	}

	public static int getContentChangeTypes(AccessibilityEvent accessibilityevent)
	{
		return IMPL.getContentChangeTypes(accessibilityevent);
	//    0    0:getstatic       #80  <Field AccessibilityEventCompat$AccessibilityEventVersionImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #105 <Method int AccessibilityEventCompat$AccessibilityEventVersionImpl.getContentChangeTypes(AccessibilityEvent)>
	//    3    9:ireturn         
	}

	public static AccessibilityRecordCompat getRecord(AccessibilityEvent accessibilityevent, int i)
	{
		return new AccessibilityRecordCompat(IMPL.getRecord(accessibilityevent, i));
	//    0    0:new             #89  <Class AccessibilityRecordCompat>
	//    1    3:dup             
	//    2    4:getstatic       #80  <Field AccessibilityEventCompat$AccessibilityEventVersionImpl IMPL>
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokeinterface #110 <Method Object AccessibilityEventCompat$AccessibilityEventVersionImpl.getRecord(AccessibilityEvent, int)>
	//    6   14:invokespecial   #101 <Method void AccessibilityRecordCompat(Object)>
	//    7   17:areturn         
	}

	public static int getRecordCount(AccessibilityEvent accessibilityevent)
	{
		return IMPL.getRecordCount(accessibilityevent);
	//    0    0:getstatic       #80  <Field AccessibilityEventCompat$AccessibilityEventVersionImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #113 <Method int AccessibilityEventCompat$AccessibilityEventVersionImpl.getRecordCount(AccessibilityEvent)>
	//    3    9:ireturn         
	}

	public static void setContentChangeTypes(AccessibilityEvent accessibilityevent, int i)
	{
		IMPL.setContentChangeTypes(accessibilityevent, i);
	//    0    0:getstatic       #80  <Field AccessibilityEventCompat$AccessibilityEventVersionImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokeinterface #117 <Method void AccessibilityEventCompat$AccessibilityEventVersionImpl.setContentChangeTypes(AccessibilityEvent, int)>
	//    4   10:return          
	}

	public int getAction(AccessibilityEvent accessibilityevent)
	{
		return IMPL.getAction(accessibilityevent);
	//    0    0:getstatic       #80  <Field AccessibilityEventCompat$AccessibilityEventVersionImpl IMPL>
	//    1    3:aload_1         
	//    2    4:invokeinterface #120 <Method int AccessibilityEventCompat$AccessibilityEventVersionImpl.getAction(AccessibilityEvent)>
	//    3    9:ireturn         
	}

	public int getMovementGranularity(AccessibilityEvent accessibilityevent)
	{
		return IMPL.getMovementGranularity(accessibilityevent);
	//    0    0:getstatic       #80  <Field AccessibilityEventCompat$AccessibilityEventVersionImpl IMPL>
	//    1    3:aload_1         
	//    2    4:invokeinterface #123 <Method int AccessibilityEventCompat$AccessibilityEventVersionImpl.getMovementGranularity(AccessibilityEvent)>
	//    3    9:ireturn         
	}

	public void setAction(AccessibilityEvent accessibilityevent, int i)
	{
		IMPL.setAction(accessibilityevent, i);
	//    0    0:getstatic       #80  <Field AccessibilityEventCompat$AccessibilityEventVersionImpl IMPL>
	//    1    3:aload_1         
	//    2    4:iload_2         
	//    3    5:invokeinterface #126 <Method void AccessibilityEventCompat$AccessibilityEventVersionImpl.setAction(AccessibilityEvent, int)>
	//    4   10:return          
	}

	public void setMovementGranularity(AccessibilityEvent accessibilityevent, int i)
	{
		IMPL.setMovementGranularity(accessibilityevent, i);
	//    0    0:getstatic       #80  <Field AccessibilityEventCompat$AccessibilityEventVersionImpl IMPL>
	//    1    3:aload_1         
	//    2    4:iload_2         
	//    3    5:invokeinterface #129 <Method void AccessibilityEventCompat$AccessibilityEventVersionImpl.setMovementGranularity(AccessibilityEvent, int)>
	//    4   10:return          
	}

	public static final int CONTENT_CHANGE_TYPE_CONTENT_DESCRIPTION = 4;
	public static final int CONTENT_CHANGE_TYPE_SUBTREE = 1;
	public static final int CONTENT_CHANGE_TYPE_TEXT = 2;
	public static final int CONTENT_CHANGE_TYPE_UNDEFINED = 0;
	private static final AccessibilityEventVersionImpl IMPL;
	public static final int TYPES_ALL_MASK = -1;
	public static final int TYPE_ANNOUNCEMENT = 16384;
	public static final int TYPE_ASSIST_READING_CONTEXT = 0x1000000;
	public static final int TYPE_GESTURE_DETECTION_END = 0x80000;
	public static final int TYPE_GESTURE_DETECTION_START = 0x40000;
	public static final int TYPE_TOUCH_EXPLORATION_GESTURE_END = 1024;
	public static final int TYPE_TOUCH_EXPLORATION_GESTURE_START = 512;
	public static final int TYPE_TOUCH_INTERACTION_END = 0x200000;
	public static final int TYPE_TOUCH_INTERACTION_START = 0x100000;
	public static final int TYPE_VIEW_ACCESSIBILITY_FOCUSED = 32768;
	public static final int TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED = 0x10000;
	public static final int TYPE_VIEW_CONTEXT_CLICKED = 0x800000;
	public static final int TYPE_VIEW_HOVER_ENTER = 128;
	public static final int TYPE_VIEW_HOVER_EXIT = 256;
	public static final int TYPE_VIEW_SCROLLED = 4096;
	public static final int TYPE_VIEW_TEXT_SELECTION_CHANGED = 8192;
	public static final int TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY = 0x20000;
	public static final int TYPE_WINDOWS_CHANGED = 0x400000;
	public static final int TYPE_WINDOW_CONTENT_CHANGED = 2048;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #75  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          19
			IMPL = ((AccessibilityEventVersionImpl) (new AccessibilityEventKitKatImpl()));
	//    3    8:new             #12  <Class AccessibilityEventCompat$AccessibilityEventKitKatImpl>
	//    4   11:dup             
	//    5   12:invokespecial   #78  <Method void AccessibilityEventCompat$AccessibilityEventKitKatImpl()>
	//    6   15:putstatic       #80  <Field AccessibilityEventCompat$AccessibilityEventVersionImpl IMPL>
	//    7   18:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   8   19:getstatic       #75  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   22:bipush          16
	//*  10   24:icmplt          38
			IMPL = ((AccessibilityEventVersionImpl) (new AccessibilityEventJellyBeanImpl()));
	//   11   27:new             #9   <Class AccessibilityEventCompat$AccessibilityEventJellyBeanImpl>
	//   12   30:dup             
	//   13   31:invokespecial   #81  <Method void AccessibilityEventCompat$AccessibilityEventJellyBeanImpl()>
	//   14   34:putstatic       #80  <Field AccessibilityEventCompat$AccessibilityEventVersionImpl IMPL>
	//   15   37:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*  16   38:getstatic       #75  <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   41:bipush          14
	//*  18   43:icmplt          57
			IMPL = ((AccessibilityEventVersionImpl) (new AccessibilityEventIcsImpl()));
	//   19   46:new             #6   <Class AccessibilityEventCompat$AccessibilityEventIcsImpl>
	//   20   49:dup             
	//   21   50:invokespecial   #82  <Method void AccessibilityEventCompat$AccessibilityEventIcsImpl()>
	//   22   53:putstatic       #80  <Field AccessibilityEventCompat$AccessibilityEventVersionImpl IMPL>
	//   23   56:return          
		else
			IMPL = ((AccessibilityEventVersionImpl) (new AccessibilityEventStubImpl()));
	//   24   57:new             #15  <Class AccessibilityEventCompat$AccessibilityEventStubImpl>
	//   25   60:dup             
	//   26   61:invokespecial   #83  <Method void AccessibilityEventCompat$AccessibilityEventStubImpl()>
	//   27   64:putstatic       #80  <Field AccessibilityEventCompat$AccessibilityEventVersionImpl IMPL>
	//*  28   67:return          
	}
}
