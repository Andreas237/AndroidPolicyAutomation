// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

class BaseTransientBottomBar$3 extends AccessibilityDelegateCompat
{

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #22  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
		accessibilitynodeinfocompat.addAction(0x100000);
	//    4    6:aload_2         
	//    5    7:ldc1            #23  <Int 0x100000>
	//    6    9:invokevirtual   #29  <Method void AccessibilityNodeInfoCompat.addAction(int)>
		accessibilitynodeinfocompat.setDismissable(true);
	//    7   12:aload_2         
	//    8   13:iconst_1        
	//    9   14:invokevirtual   #33  <Method void AccessibilityNodeInfoCompat.setDismissable(boolean)>
	//   10   17:return          
	}

	public boolean performAccessibilityAction(View view, int i, Bundle bundle)
	{
		if(i == 0x100000)
	//*   0    0:iload_2         
	//*   1    1:ldc1            #23  <Int 0x100000>
	//*   2    3:icmpne          15
		{
			dismiss();
	//    3    6:aload_0         
	//    4    7:getfield        #14  <Field BaseTransientBottomBar this$0>
	//    5   10:invokevirtual   #38  <Method void BaseTransientBottomBar.dismiss()>
			return true;
	//    6   13:iconst_1        
	//    7   14:ireturn         
		} else
		{
			return super.performAccessibilityAction(view, i, bundle);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:iload_2         
	//   11   18:aload_3         
	//   12   19:invokespecial   #40  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
	//   13   22:ireturn         
		}
	}

	final BaseTransientBottomBar this$0;

	BaseTransientBottomBar$3()
	{
		this$0 = BaseTransientBottomBar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field BaseTransientBottomBar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void AccessibilityDelegateCompat()>
	//    5    9:return          
	}
}
