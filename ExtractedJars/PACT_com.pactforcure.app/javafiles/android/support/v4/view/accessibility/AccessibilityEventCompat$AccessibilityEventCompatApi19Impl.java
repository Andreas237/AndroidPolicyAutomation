// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityEventCompat

static class AccessibilityEventCompat$AccessibilityEventCompatApi19Impl extends AccessibilityEventCompat$AccessibilityEventCompatApi16Impl
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

	AccessibilityEventCompat$AccessibilityEventCompatApi19Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AccessibilityEventCompat$AccessibilityEventCompatApi16Impl()>
	//    2    4:return          
	}
}
