// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

// Referenced classes of package android.support.v4.view:
//			AccessibilityDelegateCompat

static class AccessibilityDelegateCompat$AccessibilityDelegateBaseImpl
{

	public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(android.view.View.AccessibilityDelegate accessibilitydelegate, View view)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
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

			public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
			{
				compat.onInitializeAccessibilityEvent(view, accessibilityevent);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokevirtual   #34  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
			//    5    9:return          
			}

			public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilitynodeinfo)
			{
				compat.onInitializeAccessibilityNodeInfo(view, new AccessibilityNodeInfoCompat(((Object) (accessibilitynodeinfo))));
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
			//    2    4:aload_1         
			//    3    5:new             #38  <Class AccessibilityNodeInfoCompat>
			//    4    8:dup             
			//    5    9:aload_2         
			//    6   10:invokespecial   #41  <Method void AccessibilityNodeInfoCompat(Object)>
			//    7   13:invokevirtual   #44  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
			//    8   16:return          
			}

			public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
			{
				compat.onPopulateAccessibilityEvent(view, accessibilityevent);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokevirtual   #47  <Method void AccessibilityDelegateCompat.onPopulateAccessibilityEvent(View, AccessibilityEvent)>
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
			//    5    7:invokevirtual   #51  <Method boolean AccessibilityDelegateCompat.onRequestSendAccessibilityEvent(ViewGroup, View, AccessibilityEvent)>
			//    6   10:ireturn         
			}

			public void sendAccessibilityEvent(View view, int i)
			{
				compat.sendAccessibilityEvent(view, i);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
			//    2    4:aload_1         
			//    3    5:iload_2         
			//    4    6:invokevirtual   #55  <Method void AccessibilityDelegateCompat.sendAccessibilityEvent(View, int)>
			//    5    9:return          
			}

			public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
			{
				compat.sendAccessibilityEventUnchecked(view, accessibilityevent);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokevirtual   #58  <Method void AccessibilityDelegateCompat.sendAccessibilityEventUnchecked(View, AccessibilityEvent)>
			//    5    9:return          
			}

			final AccessibilityDelegateCompat.AccessibilityDelegateBaseImpl this$0;
			final AccessibilityDelegateCompat val$compat;

			
			{
				this$0 = AccessibilityDelegateCompat.AccessibilityDelegateBaseImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AccessibilityDelegateCompat$AccessibilityDelegateBaseImpl this$0>
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
	//    0    0:new             #9   <Class AccessibilityDelegateCompat$AccessibilityDelegateBaseImpl$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #21  <Method void AccessibilityDelegateCompat$AccessibilityDelegateBaseImpl$1(AccessibilityDelegateCompat$AccessibilityDelegateBaseImpl, AccessibilityDelegateCompat)>
	//    5    9:areturn         
	}

	public boolean performAccessibilityAction(android.view.View.AccessibilityDelegate accessibilitydelegate, View view, int i, Bundle bundle)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	AccessibilityDelegateCompat$AccessibilityDelegateBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
