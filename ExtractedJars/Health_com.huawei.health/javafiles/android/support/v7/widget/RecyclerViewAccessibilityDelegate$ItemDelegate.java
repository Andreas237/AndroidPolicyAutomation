// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			RecyclerViewAccessibilityDelegate, RecyclerView

public static class RecyclerViewAccessibilityDelegate$ItemDelegate extends AccessibilityDelegateCompat
{

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
		if(!mRecyclerViewDelegate.shouldIgnore() && mRecyclerViewDelegate.mRecyclerView.getLayoutManager() != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #16  <Field RecyclerViewAccessibilityDelegate mRecyclerViewDelegate>
	//*   6   10:invokevirtual   #25  <Method boolean RecyclerViewAccessibilityDelegate.shouldIgnore()>
	//*   7   13:ifne            44
	//*   8   16:aload_0         
	//*   9   17:getfield        #16  <Field RecyclerViewAccessibilityDelegate mRecyclerViewDelegate>
	//*  10   20:getfield        #29  <Field RecyclerView RecyclerViewAccessibilityDelegate.mRecyclerView>
	//*  11   23:invokevirtual   #35  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//*  12   26:ifnull          44
			mRecyclerViewDelegate.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, accessibilitynodeinfocompat);
	//   13   29:aload_0         
	//   14   30:getfield        #16  <Field RecyclerViewAccessibilityDelegate mRecyclerViewDelegate>
	//   15   33:getfield        #29  <Field RecyclerView RecyclerViewAccessibilityDelegate.mRecyclerView>
	//   16   36:invokevirtual   #35  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//   17   39:aload_1         
	//   18   40:aload_2         
	//   19   41:invokevirtual   #40  <Method void RecyclerView$LayoutManager.onInitializeAccessibilityNodeInfoForItem(View, AccessibilityNodeInfoCompat)>
	//   20   44:return          
	}

	public boolean performAccessibilityAction(View view, int i, Bundle bundle)
	{
		if(super.performAccessibilityAction(view, i, bundle))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iload_2         
	//*   3    3:aload_3         
	//*   4    4:invokespecial   #44  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
	//*   5    7:ifeq            12
			return true;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		if(!mRecyclerViewDelegate.shouldIgnore() && mRecyclerViewDelegate.mRecyclerView.getLayoutManager() != null)
	//*   8   12:aload_0         
	//*   9   13:getfield        #16  <Field RecyclerViewAccessibilityDelegate mRecyclerViewDelegate>
	//*  10   16:invokevirtual   #25  <Method boolean RecyclerViewAccessibilityDelegate.shouldIgnore()>
	//*  11   19:ifne            52
	//*  12   22:aload_0         
	//*  13   23:getfield        #16  <Field RecyclerViewAccessibilityDelegate mRecyclerViewDelegate>
	//*  14   26:getfield        #29  <Field RecyclerView RecyclerViewAccessibilityDelegate.mRecyclerView>
	//*  15   29:invokevirtual   #35  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//*  16   32:ifnull          52
			return mRecyclerViewDelegate.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
	//   17   35:aload_0         
	//   18   36:getfield        #16  <Field RecyclerViewAccessibilityDelegate mRecyclerViewDelegate>
	//   19   39:getfield        #29  <Field RecyclerView RecyclerViewAccessibilityDelegate.mRecyclerView>
	//   20   42:invokevirtual   #35  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//   21   45:aload_1         
	//   22   46:iload_2         
	//   23   47:aload_3         
	//   24   48:invokevirtual   #47  <Method boolean RecyclerView$LayoutManager.performAccessibilityActionForItem(View, int, Bundle)>
	//   25   51:ireturn         
		else
			return false;
	//   26   52:iconst_0        
	//   27   53:ireturn         
	}

	final RecyclerViewAccessibilityDelegate mRecyclerViewDelegate;

	public RecyclerViewAccessibilityDelegate$ItemDelegate(RecyclerViewAccessibilityDelegate recyclerviewaccessibilitydelegate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AccessibilityDelegateCompat()>
		mRecyclerViewDelegate = recyclerviewaccessibilitydelegate;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field RecyclerViewAccessibilityDelegate mRecyclerViewDelegate>
	//    5    9:return          
	}
}
