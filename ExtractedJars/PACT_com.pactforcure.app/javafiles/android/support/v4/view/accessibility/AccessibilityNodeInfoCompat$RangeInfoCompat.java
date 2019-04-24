// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat

public static class AccessibilityNodeInfoCompat$RangeInfoCompat
{

	public static AccessibilityNodeInfoCompat$RangeInfoCompat obtain(int i, float f, float f1, float f2)
	{
		return new AccessibilityNodeInfoCompat$RangeInfoCompat(AccessibilityNodeInfoCompat.IMPL.obtainRangeInfo(i, f, f1, f2));
	//    0    0:new             #2   <Class AccessibilityNodeInfoCompat$RangeInfoCompat>
	//    1    3:dup             
	//    2    4:getstatic       #30  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//    3    7:iload_0         
	//    4    8:fload_1         
	//    5    9:fload_2         
	//    6   10:fload_3         
	//    7   11:invokevirtual   #36  <Method Object AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.obtainRangeInfo(int, float, float, float)>
	//    8   14:invokespecial   #38  <Method void AccessibilityNodeInfoCompat$RangeInfoCompat(Object)>
	//    9   17:areturn         
	}

	public float getCurrent()
	{
		return AccessibilityNodeInfoCompatKitKat$RangeInfo.getCurrent(mInfo);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Object mInfo>
	//    2    4:invokestatic    #45  <Method float AccessibilityNodeInfoCompatKitKat$RangeInfo.getCurrent(Object)>
	//    3    7:freturn         
	}

	public float getMax()
	{
		return AccessibilityNodeInfoCompatKitKat$RangeInfo.getMax(mInfo);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Object mInfo>
	//    2    4:invokestatic    #48  <Method float AccessibilityNodeInfoCompatKitKat$RangeInfo.getMax(Object)>
	//    3    7:freturn         
	}

	public float getMin()
	{
		return AccessibilityNodeInfoCompatKitKat$RangeInfo.getMin(mInfo);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Object mInfo>
	//    2    4:invokestatic    #51  <Method float AccessibilityNodeInfoCompatKitKat$RangeInfo.getMin(Object)>
	//    3    7:freturn         
	}

	public int getType()
	{
		return AccessibilityNodeInfoCompatKitKat$RangeInfo.getType(mInfo);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Object mInfo>
	//    2    4:invokestatic    #56  <Method int AccessibilityNodeInfoCompatKitKat$RangeInfo.getType(Object)>
	//    3    7:ireturn         
	}

	public static final int RANGE_TYPE_FLOAT = 1;
	public static final int RANGE_TYPE_INT = 0;
	public static final int RANGE_TYPE_PERCENT = 2;
	final Object mInfo;

	AccessibilityNodeInfoCompat$RangeInfoCompat(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mInfo = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Object mInfo>
	//    5    9:return          
	}
}
