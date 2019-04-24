// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityEventCompat, AccessibilityEventCompatJellyBean

static class AccessibilityEventCompat$AccessibilityEventJellyBeanImpl extends AccessibilityEventCompat.AccessibilityEventIcsImpl
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

	AccessibilityEventCompat$AccessibilityEventJellyBeanImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AccessibilityEventCompat$AccessibilityEventIcsImpl()>
	//    2    4:return          
	}
}
