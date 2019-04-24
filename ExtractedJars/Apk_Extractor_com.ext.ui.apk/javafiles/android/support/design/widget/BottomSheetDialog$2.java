// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			BottomSheetDialog

class BottomSheetDialog$2 extends AccessibilityDelegateCompat
{

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #23  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
		if(mCancelable)
	//*   4    6:aload_0         
	//*   5    7:getfield        #15  <Field BottomSheetDialog this$0>
	//*   6   10:getfield        #27  <Field boolean BottomSheetDialog.mCancelable>
	//*   7   13:ifeq            28
		{
			accessibilitynodeinfocompat.addAction(0x100000);
	//    8   16:aload_2         
	//    9   17:ldc1            #28  <Int 0x100000>
	//   10   19:invokevirtual   #34  <Method void AccessibilityNodeInfoCompat.addAction(int)>
			accessibilitynodeinfocompat.setDismissable(true);
	//   11   22:aload_2         
	//   12   23:iconst_1        
	//   13   24:invokevirtual   #38  <Method void AccessibilityNodeInfoCompat.setDismissable(boolean)>
			return;
	//   14   27:return          
		} else
		{
			accessibilitynodeinfocompat.setDismissable(false);
	//   15   28:aload_2         
	//   16   29:iconst_0        
	//   17   30:invokevirtual   #38  <Method void AccessibilityNodeInfoCompat.setDismissable(boolean)>
			return;
	//   18   33:return          
		}
	}

	public boolean performAccessibilityAction(View view, int i, Bundle bundle)
	{
		if(i == 0x100000 && mCancelable)
	//*   0    0:iload_2         
	//*   1    1:ldc1            #28  <Int 0x100000>
	//*   2    3:icmpne          25
	//*   3    6:aload_0         
	//*   4    7:getfield        #15  <Field BottomSheetDialog this$0>
	//*   5   10:getfield        #27  <Field boolean BottomSheetDialog.mCancelable>
	//*   6   13:ifeq            25
		{
			cancel();
	//    7   16:aload_0         
	//    8   17:getfield        #15  <Field BottomSheetDialog this$0>
	//    9   20:invokevirtual   #43  <Method void BottomSheetDialog.cancel()>
			return true;
	//   10   23:iconst_1        
	//   11   24:ireturn         
		} else
		{
			return super.performAccessibilityAction(view, i, bundle);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:iload_2         
	//   15   28:aload_3         
	//   16   29:invokespecial   #45  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
	//   17   32:ireturn         
		}
	}

	final BottomSheetDialog this$0;

	BottomSheetDialog$2()
	{
		this$0 = BottomSheetDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field BottomSheetDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void AccessibilityDelegateCompat()>
	//    5    9:return          
	}
}
