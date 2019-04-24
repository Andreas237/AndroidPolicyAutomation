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

	private AccessibilityEventCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
	//    2    4:return          
	}

	public static void appendRecord(AccessibilityEvent accessibilityevent, AccessibilityRecordCompat accessibilityrecordcompat)
	{
		accessibilityevent.appendRecord((AccessibilityRecord)accessibilityrecordcompat.getImpl());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #65  <Method Object AccessibilityRecordCompat.getImpl()>
	//    3    5:checkcast       #67  <Class AccessibilityRecord>
	//    4    8:invokevirtual   #72  <Method void AccessibilityEvent.appendRecord(AccessibilityRecord)>
	//    5   11:return          
	}

	public static AccessibilityRecordCompat asRecord(AccessibilityEvent accessibilityevent)
	{
		return new AccessibilityRecordCompat(((Object) (accessibilityevent)));
	//    0    0:new             #61  <Class AccessibilityRecordCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #78  <Method void AccessibilityRecordCompat(Object)>
	//    4    8:areturn         
	}

	public static int getAction(AccessibilityEvent accessibilityevent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #85  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
			return accessibilityevent.getAction();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #88  <Method int AccessibilityEvent.getAction()>
	//    5   12:ireturn         
		else
			return 0;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static int getContentChangeTypes(AccessibilityEvent accessibilityevent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #85  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return accessibilityevent.getContentChangeTypes();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #91  <Method int AccessibilityEvent.getContentChangeTypes()>
	//    5   12:ireturn         
		else
			return 0;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static int getMovementGranularity(AccessibilityEvent accessibilityevent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #85  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
			return accessibilityevent.getMovementGranularity();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #94  <Method int AccessibilityEvent.getMovementGranularity()>
	//    5   12:ireturn         
		else
			return 0;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static AccessibilityRecordCompat getRecord(AccessibilityEvent accessibilityevent, int i)
	{
		return new AccessibilityRecordCompat(((Object) (accessibilityevent.getRecord(i))));
	//    0    0:new             #61  <Class AccessibilityRecordCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #99  <Method AccessibilityRecord AccessibilityEvent.getRecord(int)>
	//    5    9:invokespecial   #78  <Method void AccessibilityRecordCompat(Object)>
	//    6   12:areturn         
	}

	public static int getRecordCount(AccessibilityEvent accessibilityevent)
	{
		return accessibilityevent.getRecordCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method int AccessibilityEvent.getRecordCount()>
	//    2    4:ireturn         
	}

	public static void setAction(AccessibilityEvent accessibilityevent, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #85  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
			accessibilityevent.setAction(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #107 <Method void AccessibilityEvent.setAction(int)>
	//    6   13:return          
	}

	public static void setContentChangeTypes(AccessibilityEvent accessibilityevent, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #85  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			accessibilityevent.setContentChangeTypes(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #110 <Method void AccessibilityEvent.setContentChangeTypes(int)>
	//    6   13:return          
	}

	public static void setMovementGranularity(AccessibilityEvent accessibilityevent, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #85  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
			accessibilityevent.setMovementGranularity(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #113 <Method void AccessibilityEvent.setMovementGranularity(int)>
	//    6   13:return          
	}

	public static final int CONTENT_CHANGE_TYPE_CONTENT_DESCRIPTION = 4;
	public static final int CONTENT_CHANGE_TYPE_SUBTREE = 1;
	public static final int CONTENT_CHANGE_TYPE_TEXT = 2;
	public static final int CONTENT_CHANGE_TYPE_UNDEFINED = 0;
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
}
