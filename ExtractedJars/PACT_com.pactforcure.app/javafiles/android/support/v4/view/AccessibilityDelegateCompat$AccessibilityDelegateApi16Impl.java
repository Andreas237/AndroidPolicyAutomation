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

static class AccessibilityDelegateCompat$AccessibilityDelegateApi16Impl extends AccessibilityDelegateCompat.AccessibilityDelegateBaseImpl
{

	public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(android.view.View.AccessibilityDelegate accessibilitydelegate, View view)
	{
		accessibilitydelegate = ((android.view.View.AccessibilityDelegate) (accessibilitydelegate.getAccessibilityNodeProvider(view)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #24  <Method AccessibilityNodeProvider android.view.View$AccessibilityDelegate.getAccessibilityNodeProvider(View)>
	//    3    5:astore_1        
		if(accessibilitydelegate != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          19
			return new AccessibilityNodeProviderCompat(((Object) (accessibilitydelegate)));
	//    6   10:new             #26  <Class AccessibilityNodeProviderCompat>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #29  <Method void AccessibilityNodeProviderCompat(Object)>
	//   10   18:areturn         
		else
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
	}

	public android.view.View.AccessibilityDelegate newAccessibilityDelegateBridge(final AccessibilityDelegateCompat compat)
	{
		return ((android.view.View.AccessibilityDelegate) (new android.view.View.AccessibilityDelegate() {

			public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
			{
				return compat.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokevirtual   #30  <Method boolean AccessibilityDelegateCompat.dispatchPopulateAccessibilityEvent(View, AccessibilityEvent)>
			//    5    9:ireturn         
			}

			public AccessibilityNodeProvider getAccessibilityNodeProvider(View view)
			{
				view = ((View) (compat.getAccessibilityNodeProvider(view)));
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
				compat.onInitializeAccessibilityEvent(view, accessibilityevent);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokevirtual   #47  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
			//    5    9:return          
			}

			public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilitynodeinfo)
			{
				compat.onInitializeAccessibilityNodeInfo(view, AccessibilityNodeInfoCompat.wrap(accessibilitynodeinfo));
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokestatic    #55  <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.wrap(AccessibilityNodeInfo)>
			//    5    9:invokevirtual   #58  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
			//    6   12:return          
			}

			public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
			{
				compat.onPopulateAccessibilityEvent(view, accessibilityevent);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokevirtual   #61  <Method void AccessibilityDelegateCompat.onPopulateAccessibilityEvent(View, AccessibilityEvent)>
			//    5    9:return          
			}

			public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
			{
				return compat.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:aload_3         
			//    5    7:invokevirtual   #65  <Method boolean AccessibilityDelegateCompat.onRequestSendAccessibilityEvent(ViewGroup, View, AccessibilityEvent)>
			//    6   10:ireturn         
			}

			public boolean performAccessibilityAction(View view, int i, Bundle bundle)
			{
				return compat.performAccessibilityAction(view, i, bundle);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
			//    2    4:aload_1         
			//    3    5:iload_2         
			//    4    6:aload_3         
			//    5    7:invokevirtual   #69  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
			//    6   10:ireturn         
			}

			public void sendAccessibilityEvent(View view, int i)
			{
				compat.sendAccessibilityEvent(view, i);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
			//    2    4:aload_1         
			//    3    5:iload_2         
			//    4    6:invokevirtual   #73  <Method void AccessibilityDelegateCompat.sendAccessibilityEvent(View, int)>
			//    5    9:return          
			}

			public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
			{
				compat.sendAccessibilityEventUnchecked(view, accessibilityevent);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokevirtual   #76  <Method void AccessibilityDelegateCompat.sendAccessibilityEventUnchecked(View, AccessibilityEvent)>
			//    5    9:return          
			}

			final AccessibilityDelegateCompat.AccessibilityDelegateApi16Impl this$0;
			final AccessibilityDelegateCompat val$compat;

			
			{
				this$0 = AccessibilityDelegateCompat.AccessibilityDelegateApi16Impl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AccessibilityDelegateCompat$AccessibilityDelegateApi16Impl this$0>
				compat = accessibilitydelegatecompat;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field AccessibilityDelegateCompat val$compat>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void android.view.View$AccessibilityDelegate()>
			//    8   14:return          
			}
		}
));
	//    0    0:new             #9   <Class AccessibilityDelegateCompat$AccessibilityDelegateApi16Impl$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #34  <Method void AccessibilityDelegateCompat$AccessibilityDelegateApi16Impl$1(AccessibilityDelegateCompat$AccessibilityDelegateApi16Impl, AccessibilityDelegateCompat)>
	//    5    9:areturn         
	}

	public boolean performAccessibilityAction(android.view.View.AccessibilityDelegate accessibilitydelegate, View view, int i, Bundle bundle)
	{
		return accessibilitydelegate.performAccessibilityAction(view, i, bundle);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:aload           4
	//    4    5:invokevirtual   #39  <Method boolean android.view.View$AccessibilityDelegate.performAccessibilityAction(View, int, Bundle)>
	//    5    8:ireturn         
	}

	AccessibilityDelegateCompat$AccessibilityDelegateApi16Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void AccessibilityDelegateCompat$AccessibilityDelegateBaseImpl()>
	//    2    4:return          
	}
}
