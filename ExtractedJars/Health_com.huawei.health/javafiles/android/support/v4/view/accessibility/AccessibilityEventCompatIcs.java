// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;

class AccessibilityEventCompatIcs
{

	AccessibilityEventCompatIcs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static void appendRecord(AccessibilityEvent accessibilityevent, Object obj)
	{
		accessibilityevent.appendRecord((AccessibilityRecord)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #16  <Class AccessibilityRecord>
	//    3    5:invokevirtual   #21  <Method void AccessibilityEvent.appendRecord(AccessibilityRecord)>
	//    4    8:return          
	}

	public static Object getRecord(AccessibilityEvent accessibilityevent, int i)
	{
		return ((Object) (accessibilityevent.getRecord(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #26  <Method AccessibilityRecord AccessibilityEvent.getRecord(int)>
	//    3    5:areturn         
	}

	public static int getRecordCount(AccessibilityEvent accessibilityevent)
	{
		return accessibilityevent.getRecordCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method int AccessibilityEvent.getRecordCount()>
	//    2    4:ireturn         
	}

	public static void setScrollable(AccessibilityEvent accessibilityevent, boolean flag)
	{
		accessibilityevent.setScrollable(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #36  <Method void AccessibilityEvent.setScrollable(boolean)>
	//    3    5:return          
	}
}
