// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityRecord;

class AccessibilityRecordCompatIcsMr1
{

	AccessibilityRecordCompatIcsMr1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static int getMaxScrollX(Object obj)
	{
		return ((AccessibilityRecord)obj).getMaxScrollX();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #19  <Method int AccessibilityRecord.getMaxScrollX()>
	//    3    7:ireturn         
	}

	public static int getMaxScrollY(Object obj)
	{
		return ((AccessibilityRecord)obj).getMaxScrollY();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #22  <Method int AccessibilityRecord.getMaxScrollY()>
	//    3    7:ireturn         
	}

	public static void setMaxScrollX(Object obj, int i)
	{
		((AccessibilityRecord)obj).setMaxScrollX(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #27  <Method void AccessibilityRecord.setMaxScrollX(int)>
	//    4    8:return          
	}

	public static void setMaxScrollY(Object obj, int i)
	{
		((AccessibilityRecord)obj).setMaxScrollY(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #30  <Method void AccessibilityRecord.setMaxScrollY(int)>
	//    4    8:return          
	}
}
