// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public class RecyclerViewAccessibilityDelegate extends AccessibilityDelegateCompat
{
	public static class ItemDelegate extends AccessibilityDelegateCompat
	{

		public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
		{
			super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #23  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
			if(!mRecyclerViewDelegate.shouldIgnore() && mRecyclerViewDelegate.mRecyclerView.getLayoutManager() != null)
		//*   4    6:aload_0         
		//*   5    7:getfield        #17  <Field RecyclerViewAccessibilityDelegate mRecyclerViewDelegate>
		//*   6   10:invokevirtual   #27  <Method boolean RecyclerViewAccessibilityDelegate.shouldIgnore()>
		//*   7   13:ifne            44
		//*   8   16:aload_0         
		//*   9   17:getfield        #17  <Field RecyclerViewAccessibilityDelegate mRecyclerViewDelegate>
		//*  10   20:getfield        #31  <Field RecyclerView RecyclerViewAccessibilityDelegate.mRecyclerView>
		//*  11   23:invokevirtual   #37  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
		//*  12   26:ifnull          44
				mRecyclerViewDelegate.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, accessibilitynodeinfocompat);
		//   13   29:aload_0         
		//   14   30:getfield        #17  <Field RecyclerViewAccessibilityDelegate mRecyclerViewDelegate>
		//   15   33:getfield        #31  <Field RecyclerView RecyclerViewAccessibilityDelegate.mRecyclerView>
		//   16   36:invokevirtual   #37  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
		//   17   39:aload_1         
		//   18   40:aload_2         
		//   19   41:invokevirtual   #42  <Method void RecyclerView$LayoutManager.onInitializeAccessibilityNodeInfoForItem(View, AccessibilityNodeInfoCompat)>
		//   20   44:return          
		}

		public boolean performAccessibilityAction(View view, int i, Bundle bundle)
		{
			if(super.performAccessibilityAction(view, i, bundle))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:iload_2         
		//*   3    3:aload_3         
		//*   4    4:invokespecial   #46  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
		//*   5    7:ifeq            12
				return true;
		//    6   10:iconst_1        
		//    7   11:ireturn         
			if(!mRecyclerViewDelegate.shouldIgnore() && mRecyclerViewDelegate.mRecyclerView.getLayoutManager() != null)
		//*   8   12:aload_0         
		//*   9   13:getfield        #17  <Field RecyclerViewAccessibilityDelegate mRecyclerViewDelegate>
		//*  10   16:invokevirtual   #27  <Method boolean RecyclerViewAccessibilityDelegate.shouldIgnore()>
		//*  11   19:ifne            52
		//*  12   22:aload_0         
		//*  13   23:getfield        #17  <Field RecyclerViewAccessibilityDelegate mRecyclerViewDelegate>
		//*  14   26:getfield        #31  <Field RecyclerView RecyclerViewAccessibilityDelegate.mRecyclerView>
		//*  15   29:invokevirtual   #37  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
		//*  16   32:ifnull          52
				return mRecyclerViewDelegate.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
		//   17   35:aload_0         
		//   18   36:getfield        #17  <Field RecyclerViewAccessibilityDelegate mRecyclerViewDelegate>
		//   19   39:getfield        #31  <Field RecyclerView RecyclerViewAccessibilityDelegate.mRecyclerView>
		//   20   42:invokevirtual   #37  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
		//   21   45:aload_1         
		//   22   46:iload_2         
		//   23   47:aload_3         
		//   24   48:invokevirtual   #49  <Method boolean RecyclerView$LayoutManager.performAccessibilityActionForItem(View, int, Bundle)>
		//   25   51:ireturn         
			else
				return false;
		//   26   52:iconst_0        
		//   27   53:ireturn         
		}

		final RecyclerViewAccessibilityDelegate mRecyclerViewDelegate;

		public ItemDelegate(RecyclerViewAccessibilityDelegate recyclerviewaccessibilitydelegate)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void AccessibilityDelegateCompat()>
			mRecyclerViewDelegate = recyclerviewaccessibilitydelegate;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field RecyclerViewAccessibilityDelegate mRecyclerViewDelegate>
		//    5    9:return          
		}
	}


	public RecyclerViewAccessibilityDelegate(RecyclerView recyclerview)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void AccessibilityDelegateCompat()>
		mRecyclerView = recyclerview;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field RecyclerView mRecyclerView>
	//    5    9:aload_0         
	//    6   10:new             #6   <Class RecyclerViewAccessibilityDelegate$ItemDelegate>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #22  <Method void RecyclerViewAccessibilityDelegate$ItemDelegate(RecyclerViewAccessibilityDelegate)>
	//   10   18:putfield        #24  <Field AccessibilityDelegateCompat mItemDelegate>
	//   11   21:return          
	}

	public AccessibilityDelegateCompat getItemDelegate()
	{
		return mItemDelegate;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AccessibilityDelegateCompat mItemDelegate>
	//    2    4:areturn         
	}

	public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #33  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
		accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v7/widget/RecyclerView)).getName())));
	//    4    6:aload_2         
	//    5    7:ldc1            #35  <Class RecyclerView>
	//    6    9:invokevirtual   #41  <Method String Class.getName()>
	//    7   12:invokevirtual   #47  <Method void AccessibilityEvent.setClassName(CharSequence)>
		if((view instanceof RecyclerView) && !shouldIgnore())
	//*   8   15:aload_1         
	//*   9   16:instanceof      #35  <Class RecyclerView>
	//*  10   19:ifeq            49
	//*  11   22:aload_0         
	//*  12   23:invokevirtual   #51  <Method boolean shouldIgnore()>
	//*  13   26:ifne            49
		{
			view = ((View) ((RecyclerView)view));
	//   14   29:aload_1         
	//   15   30:checkcast       #35  <Class RecyclerView>
	//   16   33:astore_1        
			if(((RecyclerView) (view)).getLayoutManager() != null)
	//*  17   34:aload_1         
	//*  18   35:invokevirtual   #55  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//*  19   38:ifnull          49
				((RecyclerView) (view)).getLayoutManager().onInitializeAccessibilityEvent(accessibilityevent);
	//   20   41:aload_1         
	//   21   42:invokevirtual   #55  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//   22   45:aload_2         
	//   23   46:invokevirtual   #60  <Method void RecyclerView$LayoutManager.onInitializeAccessibilityEvent(AccessibilityEvent)>
		}
	//   24   49:return          
	}

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #64  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
		accessibilitynodeinfocompat.setClassName(((CharSequence) (((Class) (android/support/v7/widget/RecyclerView)).getName())));
	//    4    6:aload_2         
	//    5    7:ldc1            #35  <Class RecyclerView>
	//    6    9:invokevirtual   #41  <Method String Class.getName()>
	//    7   12:invokevirtual   #67  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
		if(!shouldIgnore() && mRecyclerView.getLayoutManager() != null)
	//*   8   15:aload_0         
	//*   9   16:invokevirtual   #51  <Method boolean shouldIgnore()>
	//*  10   19:ifne            43
	//*  11   22:aload_0         
	//*  12   23:getfield        #19  <Field RecyclerView mRecyclerView>
	//*  13   26:invokevirtual   #55  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//*  14   29:ifnull          43
			mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(accessibilitynodeinfocompat);
	//   15   32:aload_0         
	//   16   33:getfield        #19  <Field RecyclerView mRecyclerView>
	//   17   36:invokevirtual   #55  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//   18   39:aload_2         
	//   19   40:invokevirtual   #70  <Method void RecyclerView$LayoutManager.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat)>
	//   20   43:return          
	}

	public boolean performAccessibilityAction(View view, int i, Bundle bundle)
	{
		if(super.performAccessibilityAction(view, i, bundle))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iload_2         
	//*   3    3:aload_3         
	//*   4    4:invokespecial   #74  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
	//*   5    7:ifeq            12
			return true;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		if(!shouldIgnore() && mRecyclerView.getLayoutManager() != null)
	//*   8   12:aload_0         
	//*   9   13:invokevirtual   #51  <Method boolean shouldIgnore()>
	//*  10   16:ifne            42
	//*  11   19:aload_0         
	//*  12   20:getfield        #19  <Field RecyclerView mRecyclerView>
	//*  13   23:invokevirtual   #55  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//*  14   26:ifnull          42
			return mRecyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
	//   15   29:aload_0         
	//   16   30:getfield        #19  <Field RecyclerView mRecyclerView>
	//   17   33:invokevirtual   #55  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//   18   36:iload_2         
	//   19   37:aload_3         
	//   20   38:invokevirtual   #77  <Method boolean RecyclerView$LayoutManager.performAccessibilityAction(int, Bundle)>
	//   21   41:ireturn         
		else
			return false;
	//   22   42:iconst_0        
	//   23   43:ireturn         
	}

	boolean shouldIgnore()
	{
		return mRecyclerView.hasPendingAdapterUpdates();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RecyclerView mRecyclerView>
	//    2    4:invokevirtual   #80  <Method boolean RecyclerView.hasPendingAdapterUpdates()>
	//    3    7:ireturn         
	}

	final AccessibilityDelegateCompat mItemDelegate = new ItemDelegate(this);
	final RecyclerView mRecyclerView;
}
