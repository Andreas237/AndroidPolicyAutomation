// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerViewAccessibilityDelegate;
import android.view.View;

// Referenced classes of package android.support.v7.preference:
//			PreferenceGroupAdapter, Preference

public class PreferenceRecyclerViewAccessibilityDelegate extends RecyclerViewAccessibilityDelegate
{

	public PreferenceRecyclerViewAccessibilityDelegate(RecyclerView recyclerview)
	{
		super(recyclerview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void RecyclerViewAccessibilityDelegate(RecyclerView)>
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokespecial   #23  <Method AccessibilityDelegateCompat RecyclerViewAccessibilityDelegate.getItemDelegate()>
	//    6   10:putfield        #25  <Field AccessibilityDelegateCompat mDefaultItemDelegate>
	//    7   13:aload_0         
	//    8   14:new             #6   <Class PreferenceRecyclerViewAccessibilityDelegate$1>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokespecial   #28  <Method void PreferenceRecyclerViewAccessibilityDelegate$1(PreferenceRecyclerViewAccessibilityDelegate)>
	//   12   22:putfield        #30  <Field AccessibilityDelegateCompat mItemDelegate>
		mRecyclerView = recyclerview;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #32  <Field RecyclerView mRecyclerView>
	//   16   30:return          
	}

	public AccessibilityDelegateCompat getItemDelegate()
	{
		return mItemDelegate;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field AccessibilityDelegateCompat mItemDelegate>
	//    2    4:areturn         
	}

	final AccessibilityDelegateCompat mDefaultItemDelegate = super.getItemDelegate();
	final AccessibilityDelegateCompat mItemDelegate = new AccessibilityDelegateCompat() {

		public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
		{
			mDefaultItemDelegate.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field PreferenceRecyclerViewAccessibilityDelegate this$0>
		//    2    4:getfield        #22  <Field AccessibilityDelegateCompat PreferenceRecyclerViewAccessibilityDelegate.mDefaultItemDelegate>
		//    3    7:aload_1         
		//    4    8:aload_2         
		//    5    9:invokevirtual   #24  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
			int i = mRecyclerView.getChildAdapterPosition(view);
		//    6   12:aload_0         
		//    7   13:getfield        #12  <Field PreferenceRecyclerViewAccessibilityDelegate this$0>
		//    8   16:getfield        #28  <Field RecyclerView PreferenceRecyclerViewAccessibilityDelegate.mRecyclerView>
		//    9   19:aload_1         
		//   10   20:invokevirtual   #34  <Method int RecyclerView.getChildAdapterPosition(View)>
		//   11   23:istore_3        
			view = ((View) (mRecyclerView.getAdapter()));
		//   12   24:aload_0         
		//   13   25:getfield        #12  <Field PreferenceRecyclerViewAccessibilityDelegate this$0>
		//   14   28:getfield        #28  <Field RecyclerView PreferenceRecyclerViewAccessibilityDelegate.mRecyclerView>
		//   15   31:invokevirtual   #38  <Method android.support.v7.widget.RecyclerView$Adapter RecyclerView.getAdapter()>
		//   16   34:astore_1        
			if(view instanceof PreferenceGroupAdapter)
		//*  17   35:aload_1         
		//*  18   36:instanceof      #40  <Class PreferenceGroupAdapter>
		//*  19   39:ifne            43
		//*  20   42:return          
		//*  21   43:aload_1         
		//*  22   44:checkcast       #40  <Class PreferenceGroupAdapter>
		//*  23   47:iload_3         
		//*  24   48:invokevirtual   #44  <Method Preference PreferenceGroupAdapter.getItem(int)>
		//*  25   51:astore_1        
				if((view = ((View) (((PreferenceGroupAdapter)view).getItem(i)))) != null)
		//*  26   52:aload_1         
		//*  27   53:ifnull          42
				{
					((Preference) (view)).onInitializeAccessibilityNodeInfo(accessibilitynodeinfocompat);
		//   28   56:aload_1         
		//   29   57:aload_2         
		//   30   58:invokevirtual   #49  <Method void Preference.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat)>
					return;
		//   31   61:return          
				}
		}

		public boolean performAccessibilityAction(View view, int i, Bundle bundle)
		{
			return mDefaultItemDelegate.performAccessibilityAction(view, i, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field PreferenceRecyclerViewAccessibilityDelegate this$0>
		//    2    4:getfield        #22  <Field AccessibilityDelegateCompat PreferenceRecyclerViewAccessibilityDelegate.mDefaultItemDelegate>
		//    3    7:aload_1         
		//    4    8:iload_2         
		//    5    9:aload_3         
		//    6   10:invokevirtual   #53  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
		//    7   13:ireturn         
		}

		final PreferenceRecyclerViewAccessibilityDelegate this$0;

			
			{
				this$0 = PreferenceRecyclerViewAccessibilityDelegate.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field PreferenceRecyclerViewAccessibilityDelegate this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void AccessibilityDelegateCompat()>
			//    5    9:return          
			}
	}
;
	final RecyclerView mRecyclerView;
}
