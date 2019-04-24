// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityRecordCompat

static class AccessibilityRecordCompat$AccessibilityRecordCompatApi16Impl extends AccessibilityRecordCompat$AccessibilityRecordCompatApi15Impl
{

	public void setSource(AccessibilityRecord accessibilityrecord, View view, int i)
	{
		accessibilityrecord.setSource(view, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #22  <Method void AccessibilityRecord.setSource(View, int)>
	//    4    6:return          
	}

	AccessibilityRecordCompat$AccessibilityRecordCompatApi16Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AccessibilityRecordCompat$AccessibilityRecordCompatApi15Impl()>
	//    2    4:return          
	}
}
