// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;


class AccessibilityNodeInfoCompatKitKat
{
	static class RangeInfo
	{

		static float getCurrent(Object obj)
		{
			return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo)obj).getCurrent();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$RangeInfo>
		//    2    4:invokevirtual   #19  <Method float android.view.accessibility.AccessibilityNodeInfo$RangeInfo.getCurrent()>
		//    3    7:freturn         
		}

		static float getMax(Object obj)
		{
			return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo)obj).getMax();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$RangeInfo>
		//    2    4:invokevirtual   #22  <Method float android.view.accessibility.AccessibilityNodeInfo$RangeInfo.getMax()>
		//    3    7:freturn         
		}

		static float getMin(Object obj)
		{
			return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo)obj).getMin();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$RangeInfo>
		//    2    4:invokevirtual   #25  <Method float android.view.accessibility.AccessibilityNodeInfo$RangeInfo.getMin()>
		//    3    7:freturn         
		}

		static int getType(Object obj)
		{
			return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo)obj).getType();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$RangeInfo>
		//    2    4:invokevirtual   #30  <Method int android.view.accessibility.AccessibilityNodeInfo$RangeInfo.getType()>
		//    3    7:ireturn         
		}

		RangeInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	AccessibilityNodeInfoCompatKitKat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
