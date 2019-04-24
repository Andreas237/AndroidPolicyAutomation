// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityEventCompat

static class AccessibilityEventCompat$AccessibilityEventCompatApi16Impl extends AccessibilityEventCompat.AccessibilityEventCompatBaseImpl
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

	AccessibilityEventCompat$AccessibilityEventCompatApi16Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AccessibilityEventCompat$AccessibilityEventCompatBaseImpl()>
	//    2    4:return          
	}
}
