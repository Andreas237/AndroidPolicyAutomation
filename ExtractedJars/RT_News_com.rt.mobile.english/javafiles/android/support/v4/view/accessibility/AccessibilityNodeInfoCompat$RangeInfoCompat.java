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
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          23
			return new AccessibilityNodeInfoCompat$RangeInfoCompat(((Object) (android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(i, f, f1, f2))));
	//    3    8:new             #2   <Class AccessibilityNodeInfoCompat$RangeInfoCompat>
	//    4   11:dup             
	//    5   12:iload_0         
	//    6   13:fload_1         
	//    7   14:fload_2         
	//    8   15:fload_3         
	//    9   16:invokestatic    #36  <Method android.view.accessibility.AccessibilityNodeInfo$RangeInfo android.view.accessibility.AccessibilityNodeInfo$RangeInfo.obtain(int, float, float, float)>
	//   10   19:invokespecial   #38  <Method void AccessibilityNodeInfoCompat$RangeInfoCompat(Object)>
	//   11   22:areturn         
		else
			return new AccessibilityNodeInfoCompat$RangeInfoCompat(((Object) (null)));
	//   12   23:new             #2   <Class AccessibilityNodeInfoCompat$RangeInfoCompat>
	//   13   26:dup             
	//   14   27:aconst_null     
	//   15   28:invokespecial   #38  <Method void AccessibilityNodeInfoCompat$RangeInfoCompat(Object)>
	//   16   31:areturn         
	}

	public float getCurrent()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          19
			return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo)mInfo).getCurrent();
	//    3    8:aload_0         
	//    4    9:getfield        #23  <Field Object mInfo>
	//    5   12:checkcast       #33  <Class android.view.accessibility.AccessibilityNodeInfo$RangeInfo>
	//    6   15:invokevirtual   #42  <Method float android.view.accessibility.AccessibilityNodeInfo$RangeInfo.getCurrent()>
	//    7   18:freturn         
		else
			return 0.0F;
	//    8   19:fconst_0        
	//    9   20:freturn         
	}

	public float getMax()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          19
			return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo)mInfo).getMax();
	//    3    8:aload_0         
	//    4    9:getfield        #23  <Field Object mInfo>
	//    5   12:checkcast       #33  <Class android.view.accessibility.AccessibilityNodeInfo$RangeInfo>
	//    6   15:invokevirtual   #45  <Method float android.view.accessibility.AccessibilityNodeInfo$RangeInfo.getMax()>
	//    7   18:freturn         
		else
			return 0.0F;
	//    8   19:fconst_0        
	//    9   20:freturn         
	}

	public float getMin()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          19
			return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo)mInfo).getMin();
	//    3    8:aload_0         
	//    4    9:getfield        #23  <Field Object mInfo>
	//    5   12:checkcast       #33  <Class android.view.accessibility.AccessibilityNodeInfo$RangeInfo>
	//    6   15:invokevirtual   #48  <Method float android.view.accessibility.AccessibilityNodeInfo$RangeInfo.getMin()>
	//    7   18:freturn         
		else
			return 0.0F;
	//    8   19:fconst_0        
	//    9   20:freturn         
	}

	public int getType()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          19
			return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo)mInfo).getType();
	//    3    8:aload_0         
	//    4    9:getfield        #23  <Field Object mInfo>
	//    5   12:checkcast       #33  <Class android.view.accessibility.AccessibilityNodeInfo$RangeInfo>
	//    6   15:invokevirtual   #52  <Method int android.view.accessibility.AccessibilityNodeInfo$RangeInfo.getType()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
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
