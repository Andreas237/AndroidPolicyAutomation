// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityRecordCompat

public final class AccessibilityEventCompat
{
	static class AccessibilityEventCompatApi16Impl extends AccessibilityEventCompatBaseImpl
	{

		public int getAction(AccessibilityEvent accessibilityevent)
		{
			return accessibilityevent.getAction();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method int AccessibilityEvent.getAction()>
		//    2    4:ireturn         
		}

		public int getMovementGranularity(AccessibilityEvent accessibilityevent)
		{
			return accessibilityevent.getMovementGranularity();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #25  <Method int AccessibilityEvent.getMovementGranularity()>
		//    2    4:ireturn         
		}

		public void setAction(AccessibilityEvent accessibilityevent, int i)
		{
			accessibilityevent.setAction(i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #30  <Method void AccessibilityEvent.setAction(int)>
		//    3    5:return          
		}

		public void setMovementGranularity(AccessibilityEvent accessibilityevent, int i)
		{
			accessibilityevent.setMovementGranularity(i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #33  <Method void AccessibilityEvent.setMovementGranularity(int)>
		//    3    5:return          
		}

		AccessibilityEventCompatApi16Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void AccessibilityEventCompat$AccessibilityEventCompatBaseImpl()>
		//    2    4:return          
		}
	}

	static class AccessibilityEventCompatApi19Impl extends AccessibilityEventCompatApi16Impl
	{

		public int getContentChangeTypes(AccessibilityEvent accessibilityevent)
		{
			return accessibilityevent.getContentChangeTypes();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method int AccessibilityEvent.getContentChangeTypes()>
		//    2    4:ireturn         
		}

		public void setContentChangeTypes(AccessibilityEvent accessibilityevent, int i)
		{
			accessibilityevent.setContentChangeTypes(i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #27  <Method void AccessibilityEvent.setContentChangeTypes(int)>
		//    3    5:return          
		}

		AccessibilityEventCompatApi19Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void AccessibilityEventCompat$AccessibilityEventCompatApi16Impl()>
		//    2    4:return          
		}
	}

	static class AccessibilityEventCompatBaseImpl
	{

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

		AccessibilityEventCompatBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	private AccessibilityEventCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void Object()>
	//    2    4:return          
	}

	public static void appendRecord(AccessibilityEvent accessibilityevent, AccessibilityRecordCompat accessibilityrecordcompat)
	{
		accessibilityevent.appendRecord((AccessibilityRecord)accessibilityrecordcompat.getImpl());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #87  <Method Object AccessibilityRecordCompat.getImpl()>
	//    3    5:checkcast       #89  <Class AccessibilityRecord>
	//    4    8:invokevirtual   #94  <Method void AccessibilityEvent.appendRecord(AccessibilityRecord)>
	//    5   11:return          
	}

	public static AccessibilityRecordCompat asRecord(AccessibilityEvent accessibilityevent)
	{
		return new AccessibilityRecordCompat(((Object) (accessibilityevent)));
	//    0    0:new             #83  <Class AccessibilityRecordCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #100 <Method void AccessibilityRecordCompat(Object)>
	//    4    8:areturn         
	}

	public static int getContentChangeTypes(AccessibilityEvent accessibilityevent)
	{
		return IMPL.getContentChangeTypes(accessibilityevent);
	//    0    0:getstatic       #75  <Field AccessibilityEventCompat$AccessibilityEventCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #104 <Method int AccessibilityEventCompat$AccessibilityEventCompatBaseImpl.getContentChangeTypes(AccessibilityEvent)>
	//    3    7:ireturn         
	}

	public static AccessibilityRecordCompat getRecord(AccessibilityEvent accessibilityevent, int i)
	{
		return new AccessibilityRecordCompat(((Object) (accessibilityevent.getRecord(i))));
	//    0    0:new             #83  <Class AccessibilityRecordCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #109 <Method AccessibilityRecord AccessibilityEvent.getRecord(int)>
	//    5    9:invokespecial   #100 <Method void AccessibilityRecordCompat(Object)>
	//    6   12:areturn         
	}

	public static int getRecordCount(AccessibilityEvent accessibilityevent)
	{
		return accessibilityevent.getRecordCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method int AccessibilityEvent.getRecordCount()>
	//    2    4:ireturn         
	}

	public static void setContentChangeTypes(AccessibilityEvent accessibilityevent, int i)
	{
		IMPL.setContentChangeTypes(accessibilityevent, i);
	//    0    0:getstatic       #75  <Field AccessibilityEventCompat$AccessibilityEventCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #117 <Method void AccessibilityEventCompat$AccessibilityEventCompatBaseImpl.setContentChangeTypes(AccessibilityEvent, int)>
	//    4    8:return          
	}

	public int getAction(AccessibilityEvent accessibilityevent)
	{
		return IMPL.getAction(accessibilityevent);
	//    0    0:getstatic       #75  <Field AccessibilityEventCompat$AccessibilityEventCompatBaseImpl IMPL>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #120 <Method int AccessibilityEventCompat$AccessibilityEventCompatBaseImpl.getAction(AccessibilityEvent)>
	//    3    7:ireturn         
	}

	public int getMovementGranularity(AccessibilityEvent accessibilityevent)
	{
		return IMPL.getMovementGranularity(accessibilityevent);
	//    0    0:getstatic       #75  <Field AccessibilityEventCompat$AccessibilityEventCompatBaseImpl IMPL>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #123 <Method int AccessibilityEventCompat$AccessibilityEventCompatBaseImpl.getMovementGranularity(AccessibilityEvent)>
	//    3    7:ireturn         
	}

	public void setAction(AccessibilityEvent accessibilityevent, int i)
	{
		IMPL.setAction(accessibilityevent, i);
	//    0    0:getstatic       #75  <Field AccessibilityEventCompat$AccessibilityEventCompatBaseImpl IMPL>
	//    1    3:aload_1         
	//    2    4:iload_2         
	//    3    5:invokevirtual   #126 <Method void AccessibilityEventCompat$AccessibilityEventCompatBaseImpl.setAction(AccessibilityEvent, int)>
	//    4    8:return          
	}

	public void setMovementGranularity(AccessibilityEvent accessibilityevent, int i)
	{
		IMPL.setMovementGranularity(accessibilityevent, i);
	//    0    0:getstatic       #75  <Field AccessibilityEventCompat$AccessibilityEventCompatBaseImpl IMPL>
	//    1    3:aload_1         
	//    2    4:iload_2         
	//    3    5:invokevirtual   #129 <Method void AccessibilityEventCompat$AccessibilityEventCompatBaseImpl.setMovementGranularity(AccessibilityEvent, int)>
	//    4    8:return          
	}

	public static final int CONTENT_CHANGE_TYPE_CONTENT_DESCRIPTION = 4;
	public static final int CONTENT_CHANGE_TYPE_SUBTREE = 1;
	public static final int CONTENT_CHANGE_TYPE_TEXT = 2;
	public static final int CONTENT_CHANGE_TYPE_UNDEFINED = 0;
	private static final AccessibilityEventCompatBaseImpl IMPL;
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
	//*   0    0:getstatic       #70  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          19
			IMPL = ((AccessibilityEventCompatBaseImpl) (new AccessibilityEventCompatApi19Impl()));
	//    3    8:new             #9   <Class AccessibilityEventCompat$AccessibilityEventCompatApi19Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #73  <Method void AccessibilityEventCompat$AccessibilityEventCompatApi19Impl()>
	//    6   15:putstatic       #75  <Field AccessibilityEventCompat$AccessibilityEventCompatBaseImpl IMPL>
	//    7   18:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   8   19:getstatic       #70  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   22:bipush          16
	//*  10   24:icmplt          38
			IMPL = ((AccessibilityEventCompatBaseImpl) (new AccessibilityEventCompatApi16Impl()));
	//   11   27:new             #6   <Class AccessibilityEventCompat$AccessibilityEventCompatApi16Impl>
	//   12   30:dup             
	//   13   31:invokespecial   #76  <Method void AccessibilityEventCompat$AccessibilityEventCompatApi16Impl()>
	//   14   34:putstatic       #75  <Field AccessibilityEventCompat$AccessibilityEventCompatBaseImpl IMPL>
	//   15   37:return          
		else
			IMPL = new AccessibilityEventCompatBaseImpl();
	//   16   38:new             #12  <Class AccessibilityEventCompat$AccessibilityEventCompatBaseImpl>
	//   17   41:dup             
	//   18   42:invokespecial   #77  <Method void AccessibilityEventCompat$AccessibilityEventCompatBaseImpl()>
	//   19   45:putstatic       #75  <Field AccessibilityEventCompat$AccessibilityEventCompatBaseImpl IMPL>
	//*  20   48:return          
	}
}
