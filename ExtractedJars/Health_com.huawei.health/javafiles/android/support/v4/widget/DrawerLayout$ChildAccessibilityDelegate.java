// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//			DrawerLayout

final class DrawerLayout$ChildAccessibilityDelegate extends AccessibilityDelegateCompat
{

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
		if(!DrawerLayout.includeChildForAccessibility(view))
	//*   4    6:aload_1         
	//*   5    7:invokestatic    #25  <Method boolean DrawerLayout.includeChildForAccessibility(View)>
	//*   6   10:ifne            18
			accessibilitynodeinfocompat.setParent(((View) (null)));
	//    7   13:aload_2         
	//    8   14:aconst_null     
	//    9   15:invokevirtual   #31  <Method void AccessibilityNodeInfoCompat.setParent(View)>
	//   10   18:return          
	}

	final DrawerLayout this$0;

	DrawerLayout$ChildAccessibilityDelegate()
	{
		this$0 = DrawerLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field DrawerLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void AccessibilityDelegateCompat()>
	//    5    9:return          
	}
}
