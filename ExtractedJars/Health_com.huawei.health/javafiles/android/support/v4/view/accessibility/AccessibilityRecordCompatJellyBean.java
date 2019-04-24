// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

class AccessibilityRecordCompatJellyBean
{

	AccessibilityRecordCompatJellyBean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static void setSource(Object obj, View view, int i)
	{
		((AccessibilityRecord)obj).setSource(view, i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #19  <Method void AccessibilityRecord.setSource(View, int)>
	//    5    9:return          
	}
}
