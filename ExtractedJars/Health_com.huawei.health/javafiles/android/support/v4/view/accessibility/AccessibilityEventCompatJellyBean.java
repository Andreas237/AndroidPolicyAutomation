// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

class AccessibilityEventCompatJellyBean
{

	AccessibilityEventCompatJellyBean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static int getAction(AccessibilityEvent accessibilityevent)
	{
		return accessibilityevent.getAction();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method int AccessibilityEvent.getAction()>
	//    2    4:ireturn         
	}

	public static int getMovementGranularity(AccessibilityEvent accessibilityevent)
	{
		return accessibilityevent.getMovementGranularity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method int AccessibilityEvent.getMovementGranularity()>
	//    2    4:ireturn         
	}

	public static void setAction(AccessibilityEvent accessibilityevent, int i)
	{
		accessibilityevent.setAction(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #27  <Method void AccessibilityEvent.setAction(int)>
	//    3    5:return          
	}

	public static void setMovementGranularity(AccessibilityEvent accessibilityevent, int i)
	{
		accessibilityevent.setMovementGranularity(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #30  <Method void AccessibilityEvent.setMovementGranularity(int)>
	//    3    5:return          
	}
}
