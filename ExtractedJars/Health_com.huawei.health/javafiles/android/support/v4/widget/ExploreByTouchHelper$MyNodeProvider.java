// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;

// Referenced classes of package android.support.v4.widget:
//			ExploreByTouchHelper

class ExploreByTouchHelper$MyNodeProvider extends AccessibilityNodeProviderCompat
{

	public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i)
	{
		return AccessibilityNodeInfoCompat.obtain(obtainAccessibilityNodeInfo(i));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ExploreByTouchHelper this$0>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #22  <Method AccessibilityNodeInfoCompat ExploreByTouchHelper.obtainAccessibilityNodeInfo(int)>
	//    4    8:invokestatic    #28  <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain(AccessibilityNodeInfoCompat)>
	//    5   11:areturn         
	}

	public AccessibilityNodeInfoCompat findFocus(int i)
	{
		if(i == 2)
	//*   0    0:iload_1         
	//*   1    1:iconst_2        
	//*   2    2:icmpne          16
			i = ExploreByTouchHelper.access$000(ExploreByTouchHelper.this);
	//    3    5:aload_0         
	//    4    6:getfield        #13  <Field ExploreByTouchHelper this$0>
	//    5    9:invokestatic    #33  <Method int ExploreByTouchHelper.access$000(ExploreByTouchHelper)>
	//    6   12:istore_1        
		else
	//*   7   13:goto            24
			i = ExploreByTouchHelper.access$100(ExploreByTouchHelper.this);
	//    8   16:aload_0         
	//    9   17:getfield        #13  <Field ExploreByTouchHelper this$0>
	//   10   20:invokestatic    #36  <Method int ExploreByTouchHelper.access$100(ExploreByTouchHelper)>
	//   11   23:istore_1        
		if(i == 0x80000000)
	//*  12   24:iload_1         
	//*  13   25:ldc1            #37  <Int 0x80000000>
	//*  14   27:icmpne          32
			return null;
	//   15   30:aconst_null     
	//   16   31:areturn         
		else
			return createAccessibilityNodeInfo(i);
	//   17   32:aload_0         
	//   18   33:iload_1         
	//   19   34:invokevirtual   #39  <Method AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int)>
	//   20   37:areturn         
	}

	public boolean performAction(int i, int j, Bundle bundle)
	{
		return ExploreByTouchHelper.this.performAction(i, j, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ExploreByTouchHelper this$0>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #43  <Method boolean ExploreByTouchHelper.performAction(int, int, Bundle)>
	//    6   10:ireturn         
	}

	final ExploreByTouchHelper this$0;

	ExploreByTouchHelper$MyNodeProvider()
	{
		this$0 = ExploreByTouchHelper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field ExploreByTouchHelper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void AccessibilityNodeProviderCompat()>
	//    5    9:return          
	}
}
