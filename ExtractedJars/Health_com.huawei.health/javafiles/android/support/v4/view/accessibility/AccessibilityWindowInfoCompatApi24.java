// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityWindowInfo;

class AccessibilityWindowInfoCompatApi24
{

	AccessibilityWindowInfoCompatApi24()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static Object getAnchor(Object obj)
	{
		return ((Object) (((AccessibilityWindowInfo)obj).getAnchor()));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityWindowInfo>
	//    2    4:invokevirtual   #19  <Method android.view.accessibility.AccessibilityNodeInfo AccessibilityWindowInfo.getAnchor()>
	//    3    7:areturn         
	}

	public static CharSequence getTitle(Object obj)
	{
		return ((AccessibilityWindowInfo)obj).getTitle();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityWindowInfo>
	//    2    4:invokevirtual   #24  <Method CharSequence AccessibilityWindowInfo.getTitle()>
	//    3    7:areturn         
	}
}
