// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityEventCompat, AccessibilityEventCompatKitKat

static class AccessibilityEventCompat$AccessibilityEventKitKatImpl extends pl
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

	AccessibilityEventCompat$AccessibilityEventKitKatImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AccessibilityEventCompat$AccessibilityEventJellyBeanImpl()>
	//    2    4:return          
	}
}
