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

public class AccessibilityDelegateCompat
{
	private static final class AccessibilityDelegateAdapter extends android.view.View.AccessibilityDelegate
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

		AccessibilityDelegateAdapter(AccessibilityDelegateCompat accessibilitydelegatecompat)
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


	public AccessibilityDelegateCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #6   <Class AccessibilityDelegateCompat$AccessibilityDelegateAdapter>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #24  <Method void AccessibilityDelegateCompat$AccessibilityDelegateAdapter(AccessibilityDelegateCompat)>
	//    7   13:putfield        #26  <Field android.view.View$AccessibilityDelegate mBridge>
	//    8   16:return          
	}

	public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		return DEFAULT_DELEGATE.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
	//    0    0:getstatic       #19  <Field android.view.View$AccessibilityDelegate DEFAULT_DELEGATE>
	//    1    3:aload_1         
	//    2    4:aload_2         
	//    3    5:invokevirtual   #30  <Method boolean android.view.View$AccessibilityDelegate.dispatchPopulateAccessibilityEvent(View, AccessibilityEvent)>
	//    4    8:ireturn         
	}

	public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #38  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          29
		{
			view = ((View) (DEFAULT_DELEGATE.getAccessibilityNodeProvider(view)));
	//    3    8:getstatic       #19  <Field android.view.View$AccessibilityDelegate DEFAULT_DELEGATE>
	//    4   11:aload_1         
	//    5   12:invokevirtual   #41  <Method AccessibilityNodeProvider android.view.View$AccessibilityDelegate.getAccessibilityNodeProvider(View)>
	//    6   15:astore_1        
			if(view != null)
	//*   7   16:aload_1         
	//*   8   17:ifnull          29
				return new AccessibilityNodeProviderCompat(((Object) (view)));
	//    9   20:new             #43  <Class AccessibilityNodeProviderCompat>
	//   10   23:dup             
	//   11   24:aload_1         
	//   12   25:invokespecial   #46  <Method void AccessibilityNodeProviderCompat(Object)>
	//   13   28:areturn         
		}
		return null;
	//   14   29:aconst_null     
	//   15   30:areturn         
	}

	android.view.View.AccessibilityDelegate getBridge()
	{
		return mBridge;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field android.view.View$AccessibilityDelegate mBridge>
	//    2    4:areturn         
	}

	public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		DEFAULT_DELEGATE.onInitializeAccessibilityEvent(view, accessibilityevent);
	//    0    0:getstatic       #19  <Field android.view.View$AccessibilityDelegate DEFAULT_DELEGATE>
	//    1    3:aload_1         
	//    2    4:aload_2         
	//    3    5:invokevirtual   #52  <Method void android.view.View$AccessibilityDelegate.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
	//    4    8:return          
	}

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		DEFAULT_DELEGATE.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat.unwrap());
	//    0    0:getstatic       #19  <Field android.view.View$AccessibilityDelegate DEFAULT_DELEGATE>
	//    1    3:aload_1         
	//    2    4:aload_2         
	//    3    5:invokevirtual   #60  <Method AccessibilityNodeInfo AccessibilityNodeInfoCompat.unwrap()>
	//    4    8:invokevirtual   #63  <Method void android.view.View$AccessibilityDelegate.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfo)>
	//    5   11:return          
	}

	public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		DEFAULT_DELEGATE.onPopulateAccessibilityEvent(view, accessibilityevent);
	//    0    0:getstatic       #19  <Field android.view.View$AccessibilityDelegate DEFAULT_DELEGATE>
	//    1    3:aload_1         
	//    2    4:aload_2         
	//    3    5:invokevirtual   #66  <Method void android.view.View$AccessibilityDelegate.onPopulateAccessibilityEvent(View, AccessibilityEvent)>
	//    4    8:return          
	}

	public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
	{
		return DEFAULT_DELEGATE.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
	//    0    0:getstatic       #19  <Field android.view.View$AccessibilityDelegate DEFAULT_DELEGATE>
	//    1    3:aload_1         
	//    2    4:aload_2         
	//    3    5:aload_3         
	//    4    6:invokevirtual   #70  <Method boolean android.view.View$AccessibilityDelegate.onRequestSendAccessibilityEvent(ViewGroup, View, AccessibilityEvent)>
	//    5    9:ireturn         
	}

	public boolean performAccessibilityAction(View view, int i, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #38  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          18
			return DEFAULT_DELEGATE.performAccessibilityAction(view, i, bundle);
	//    3    8:getstatic       #19  <Field android.view.View$AccessibilityDelegate DEFAULT_DELEGATE>
	//    4   11:aload_1         
	//    5   12:iload_2         
	//    6   13:aload_3         
	//    7   14:invokevirtual   #74  <Method boolean android.view.View$AccessibilityDelegate.performAccessibilityAction(View, int, Bundle)>
	//    8   17:ireturn         
		else
			return false;
	//    9   18:iconst_0        
	//   10   19:ireturn         
	}

	public void sendAccessibilityEvent(View view, int i)
	{
		DEFAULT_DELEGATE.sendAccessibilityEvent(view, i);
	//    0    0:getstatic       #19  <Field android.view.View$AccessibilityDelegate DEFAULT_DELEGATE>
	//    1    3:aload_1         
	//    2    4:iload_2         
	//    3    5:invokevirtual   #78  <Method void android.view.View$AccessibilityDelegate.sendAccessibilityEvent(View, int)>
	//    4    8:return          
	}

	public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
	{
		DEFAULT_DELEGATE.sendAccessibilityEventUnchecked(view, accessibilityevent);
	//    0    0:getstatic       #19  <Field android.view.View$AccessibilityDelegate DEFAULT_DELEGATE>
	//    1    3:aload_1         
	//    2    4:aload_2         
	//    3    5:invokevirtual   #81  <Method void android.view.View$AccessibilityDelegate.sendAccessibilityEventUnchecked(View, AccessibilityEvent)>
	//    4    8:return          
	}

	private static final android.view.View.AccessibilityDelegate DEFAULT_DELEGATE = new android.view.View.AccessibilityDelegate();
	private final android.view.View.AccessibilityDelegate mBridge = new AccessibilityDelegateAdapter(this);

	static 
	{
	//    0    0:new             #14  <Class android.view.View$AccessibilityDelegate>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void android.view.View$AccessibilityDelegate()>
	//    3    7:putstatic       #19  <Field android.view.View$AccessibilityDelegate DEFAULT_DELEGATE>
	//*   4   10:return          
	}
}
