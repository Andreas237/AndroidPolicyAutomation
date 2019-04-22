// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.*;

// Referenced classes of package android.support.v4.view:
//			AccessibilityDelegateCompat

private static final class AccessibilityDelegateCompat$AccessibilityDelegateAdapter extends android.view.View.AccessibilityDelegate
{

	public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		return mCompat.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field AccessibilityDelegateCompat mCompat>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #21  <Method boolean AccessibilityDelegateCompat.dispatchPopulateAccessibilityEvent(View, AccessibilityEvent)>
	//    5    9:ireturn         
	}

	public AccessibilityNodeProvider getAccessibilityNodeProvider(View view)
	{
		view = ((View) (mCompat.getAccessibilityNodeProvider(view)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field AccessibilityDelegateCompat mCompat>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #29  <Method AccessibilityNodeProviderCompat AccessibilityDelegateCompat.getAccessibilityNodeProvider(View)>
	//    4    8:astore_1        
		if(view != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          21
			return (AccessibilityNodeProvider)((AccessibilityNodeProviderCompat) (view)).getProvider();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #35  <Method Object AccessibilityNodeProviderCompat.getProvider()>
	//    9   17:checkcast       #37  <Class AccessibilityNodeProvider>
	//   10   20:areturn         
		else
			return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
	}

	public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		mCompat.onInitializeAccessibilityEvent(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field AccessibilityDelegateCompat mCompat>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #42  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
	//    5    9:return          
	}

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilitynodeinfo)
	{
		mCompat.onInitializeAccessibilityNodeInfo(view, AccessibilityNodeInfoCompat.wrap(accessibilitynodeinfo));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field AccessibilityDelegateCompat mCompat>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #50  <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.wrap(AccessibilityNodeInfo)>
	//    5    9:invokevirtual   #53  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
	//    6   12:return          
	}

	public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		mCompat.onPopulateAccessibilityEvent(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field AccessibilityDelegateCompat mCompat>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #56  <Method void AccessibilityDelegateCompat.onPopulateAccessibilityEvent(View, AccessibilityEvent)>
	//    5    9:return          
	}

	public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
	{
		return mCompat.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field AccessibilityDelegateCompat mCompat>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #60  <Method boolean AccessibilityDelegateCompat.onRequestSendAccessibilityEvent(ViewGroup, View, AccessibilityEvent)>
	//    6   10:ireturn         
	}

	public boolean performAccessibilityAction(View view, int i, Bundle bundle)
	{
		return mCompat.performAccessibilityAction(view, i, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field AccessibilityDelegateCompat mCompat>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #64  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
	//    6   10:ireturn         
	}

	public void sendAccessibilityEvent(View view, int i)
	{
		mCompat.sendAccessibilityEvent(view, i);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field AccessibilityDelegateCompat mCompat>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #68  <Method void AccessibilityDelegateCompat.sendAccessibilityEvent(View, int)>
	//    5    9:return          
	}

	public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
	{
		mCompat.sendAccessibilityEventUnchecked(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field AccessibilityDelegateCompat mCompat>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #71  <Method void AccessibilityDelegateCompat.sendAccessibilityEventUnchecked(View, AccessibilityEvent)>
	//    5    9:return          
	}

	private final AccessibilityDelegateCompat mCompat;

	AccessibilityDelegateCompat$AccessibilityDelegateAdapter(AccessibilityDelegateCompat accessibilitydelegatecompat)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void android.view.View$AccessibilityDelegate()>
		mCompat = accessibilitydelegatecompat;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field AccessibilityDelegateCompat mCompat>
	//    5    9:return          
	}
}
