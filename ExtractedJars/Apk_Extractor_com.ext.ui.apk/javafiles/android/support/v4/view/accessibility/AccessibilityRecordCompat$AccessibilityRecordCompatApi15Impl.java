// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityRecord;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityRecordCompat

static class AccessibilityRecordCompat$AccessibilityRecordCompatApi15Impl extends AccessibilityRecordCompat.AccessibilityRecordCompatBaseImpl
{

	public int getMaxScrollX(AccessibilityRecord accessibilityrecord)
	{
		return accessibilityrecord.getMaxScrollX();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method int AccessibilityRecord.getMaxScrollX()>
	//    2    4:ireturn         
	}

	public int getMaxScrollY(AccessibilityRecord accessibilityrecord)
	{
		return accessibilityrecord.getMaxScrollY();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #25  <Method int AccessibilityRecord.getMaxScrollY()>
	//    2    4:ireturn         
	}

	public void setMaxScrollX(AccessibilityRecord accessibilityrecord, int i)
	{
		accessibilityrecord.setMaxScrollX(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #30  <Method void AccessibilityRecord.setMaxScrollX(int)>
	//    3    5:return          
	}

	public void setMaxScrollY(AccessibilityRecord accessibilityrecord, int i)
	{
		accessibilityrecord.setMaxScrollY(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #33  <Method void AccessibilityRecord.setMaxScrollY(int)>
	//    3    5:return          
	}

	AccessibilityRecordCompat$AccessibilityRecordCompatApi15Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AccessibilityRecordCompat$AccessibilityRecordCompatBaseImpl()>
	//    2    4:return          
	}
}
