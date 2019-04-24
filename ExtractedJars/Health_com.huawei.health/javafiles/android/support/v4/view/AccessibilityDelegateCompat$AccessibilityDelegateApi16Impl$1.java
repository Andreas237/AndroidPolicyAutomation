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

class AccessibilityDelegateCompat$AccessibilityDelegateApi16Impl$1 extends android.view.View.AccessibilityDelegate
{

	public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		return val$compat.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #30  <Method boolean AccessibilityDelegateCompat.dispatchPopulateAccessibilityEvent(View, AccessibilityEvent)>
	//    5    9:ireturn         
	}

	public AccessibilityNodeProvider getAccessibilityNodeProvider(View view)
	{
		view = ((View) (val$compat.getAccessibilityNodeProvider(view)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #35  <Method AccessibilityNodeProviderCompat AccessibilityDelegateCompat.getAccessibilityNodeProvider(View)>
	//    4    8:astore_1        
		if(view != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          21
			return (AccessibilityNodeProvider)((AccessibilityNodeProviderCompat) (view)).getProvider();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #41  <Method Object AccessibilityNodeProviderCompat.getProvider()>
	//    9   17:checkcast       #43  <Class AccessibilityNodeProvider>
	//   10   20:areturn         
		else
			return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
	}

	public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		val$compat.onInitializeAccessibilityEvent(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #47  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
	//    5    9:return          
	}

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilitynodeinfo)
	{
		val$compat.onInitializeAccessibilityNodeInfo(view, new AccessibilityNodeInfoCompat(((Object) (accessibilitynodeinfo))));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
	//    2    4:aload_1         
	//    3    5:new             #51  <Class AccessibilityNodeInfoCompat>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #54  <Method void AccessibilityNodeInfoCompat(Object)>
	//    7   13:invokevirtual   #57  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
	//    8   16:return          
	}

	public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		val$compat.onPopulateAccessibilityEvent(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #60  <Method void AccessibilityDelegateCompat.onPopulateAccessibilityEvent(View, AccessibilityEvent)>
	//    5    9:return          
	}

	public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
	{
		return val$compat.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #64  <Method boolean AccessibilityDelegateCompat.onRequestSendAccessibilityEvent(ViewGroup, View, AccessibilityEvent)>
	//    6   10:ireturn         
	}

	public boolean performAccessibilityAction(View view, int i, Bundle bundle)
	{
		return val$compat.performAccessibilityAction(view, i, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #68  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
	//    6   10:ireturn         
	}

	public void sendAccessibilityEvent(View view, int i)
	{
		val$compat.sendAccessibilityEvent(view, i);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #72  <Method void AccessibilityDelegateCompat.sendAccessibilityEvent(View, int)>
	//    5    9:return          
	}

	public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
	{
		val$compat.sendAccessibilityEventUnchecked(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #75  <Method void AccessibilityDelegateCompat.sendAccessibilityEventUnchecked(View, AccessibilityEvent)>
	//    5    9:return          
	}

	final AccessibilityDelegateCompat.AccessibilityDelegateApi16Impl this$0;
	final AccessibilityDelegateCompat val$compat;

	AccessibilityDelegateCompat$AccessibilityDelegateApi16Impl$1()
	{
		this$0 = final_accessibilitydelegateapi16impl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field AccessibilityDelegateCompat$AccessibilityDelegateApi16Impl this$0>
		val$compat = AccessibilityDelegateCompat.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field AccessibilityDelegateCompat val$compat>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void android.view.View$AccessibilityDelegate()>
	//    8   14:return          
	}
}
