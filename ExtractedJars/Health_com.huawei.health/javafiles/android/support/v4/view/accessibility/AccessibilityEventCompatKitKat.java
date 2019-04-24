// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

class AccessibilityEventCompatKitKat
{

	AccessibilityEventCompatKitKat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static int getContentChangeTypes(AccessibilityEvent accessibilityevent)
	{
		return accessibilityevent.getContentChangeTypes();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method int AccessibilityEvent.getContentChangeTypes()>
	//    2    4:ireturn         
	}

	public static void setContentChangeTypes(AccessibilityEvent accessibilityevent, int i)
	{
		accessibilityevent.setContentChangeTypes(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #24  <Method void AccessibilityEvent.setContentChangeTypes(int)>
	//    3    5:return          
	}
}
