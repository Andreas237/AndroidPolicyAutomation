// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;

// Referenced classes of package android.support.design.internal:
//			NavigationMenuItemView

class NavigationMenuItemView$1 extends AccessibilityDelegateCompat
{

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #20  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
		accessibilitynodeinfocompat.setCheckable(mCheckable);
	//    4    6:aload_2         
	//    5    7:aload_0         
	//    6    8:getfield        #12  <Field NavigationMenuItemView this$0>
	//    7   11:getfield        #24  <Field boolean NavigationMenuItemView.mCheckable>
	//    8   14:invokevirtual   #30  <Method void AccessibilityNodeInfoCompat.setCheckable(boolean)>
	//    9   17:return          
	}

	final NavigationMenuItemView this$0;

	NavigationMenuItemView$1()
	{
		this$0 = NavigationMenuItemView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field NavigationMenuItemView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void AccessibilityDelegateCompat()>
	//    5    9:return          
	}
}
