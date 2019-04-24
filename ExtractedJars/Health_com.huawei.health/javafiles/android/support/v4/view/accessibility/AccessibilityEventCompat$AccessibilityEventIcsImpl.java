// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityEventCompat, AccessibilityEventCompatIcs

static class AccessibilityEventCompat$AccessibilityEventIcsImpl extends 
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

	AccessibilityEventCompat$AccessibilityEventIcsImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AccessibilityEventCompat$AccessibilityEventStubImpl()>
	//    2    4:return          
	}
}
