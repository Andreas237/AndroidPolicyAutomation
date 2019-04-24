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
	static class AccessibilityDelegateApi16Impl extends AccessibilityDelegateBaseImpl
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

		public android.view.View.AccessibilityDelegate newAccessibilityDelegateBridge(AccessibilityDelegateCompat accessibilitydelegatecompat)
		{
			return ((android.view.View.AccessibilityDelegate) (((_cls1) (accessibilitydelegatecompat)). new android.view.View.AccessibilityDelegate() {

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
					compat.onInitializeAccessibilityNodeInfo(view, new AccessibilityNodeInfoCompat(((Object) (accessibilitynodeinfo))));
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
					compat.onPopulateAccessibilityEvent(view, accessibilityevent);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
				//    2    4:aload_1         
				//    3    5:aload_2         
				//    4    6:invokevirtual   #60  <Method void AccessibilityDelegateCompat.onPopulateAccessibilityEvent(View, AccessibilityEvent)>
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
				//    5    7:invokevirtual   #64  <Method boolean AccessibilityDelegateCompat.onRequestSendAccessibilityEvent(ViewGroup, View, AccessibilityEvent)>
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
				//    5    7:invokevirtual   #68  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
				//    6   10:ireturn         
				}

				public void sendAccessibilityEvent(View view, int i)
				{
					compat.sendAccessibilityEvent(view, i);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
				//    2    4:aload_1         
				//    3    5:iload_2         
				//    4    6:invokevirtual   #72  <Method void AccessibilityDelegateCompat.sendAccessibilityEvent(View, int)>
				//    5    9:return          
				}

				public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
				{
					compat.sendAccessibilityEventUnchecked(view, accessibilityevent);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field AccessibilityDelegateCompat val$compat>
				//    2    4:aload_1         
				//    3    5:aload_2         
				//    4    6:invokevirtual   #75  <Method void AccessibilityDelegateCompat.sendAccessibilityEventUnchecked(View, AccessibilityEvent)>
				//    5    9:return          
				}

				final AccessibilityDelegateApi16Impl this$0;
				final AccessibilityDelegateCompat val$compat;

			
			{
				this$0 = final_accessibilitydelegateapi16impl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AccessibilityDelegateCompat$AccessibilityDelegateApi16Impl this$0>
				compat = AccessibilityDelegateCompat.this;
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

		AccessibilityDelegateApi16Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void AccessibilityDelegateCompat$AccessibilityDelegateBaseImpl()>
		//    2    4:return          
		}
	}

	static class AccessibilityDelegateBaseImpl
	{

		public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(android.view.View.AccessibilityDelegate accessibilitydelegate, View view)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public android.view.View.AccessibilityDelegate newAccessibilityDelegateBridge(AccessibilityDelegateCompat accessibilitydelegatecompat)
		{
			return ((android.view.View.AccessibilityDelegate) (((_cls1) (accessibilitydelegatecompat)). new android.view.View.AccessibilityDelegate() {

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

				final AccessibilityDelegateBaseImpl this$0;
				final AccessibilityDelegateCompat val$compat;

			
			{
				this$0 = final_accessibilitydelegatebaseimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AccessibilityDelegateCompat$AccessibilityDelegateBaseImpl this$0>
				compat = AccessibilityDelegateCompat.this;
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

		AccessibilityDelegateBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	public AccessibilityDelegateCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		mBridge = IMPL.newAccessibilityDelegateBridge(this);
	//    2    4:aload_0         
	//    3    5:getstatic       #32  <Field AccessibilityDelegateCompat$AccessibilityDelegateBaseImpl IMPL>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #44  <Method android.view.View$AccessibilityDelegate AccessibilityDelegateCompat$AccessibilityDelegateBaseImpl.newAccessibilityDelegateBridge(AccessibilityDelegateCompat)>
	//    6   12:putfield        #46  <Field android.view.View$AccessibilityDelegate mBridge>
	//    7   15:return          
	}

	public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		return DEFAULT_DELEGATE.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
	//    0    0:getstatic       #38  <Field android.view.View$AccessibilityDelegate DEFAULT_DELEGATE>
	//    1    3:aload_1         
	//    2    4:aload_2         
	//    3    5:invokevirtual   #50  <Method boolean android.view.View$AccessibilityDelegate.dispatchPopulateAccessibilityEvent(View, AccessibilityEvent)>
	//    4    8:ireturn         
	}

	public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
	{
		return IMPL.getAccessibilityNodeProvider(DEFAULT_DELEGATE, view);
	//    0    0:getstatic       #32  <Field AccessibilityDelegateCompat$AccessibilityDelegateBaseImpl IMPL>
	//    1    3:getstatic       #38  <Field android.view.View$AccessibilityDelegate DEFAULT_DELEGATE>
	//    2    6:aload_1         
	//    3    7:invokevirtual   #55  <Method AccessibilityNodeProviderCompat AccessibilityDelegateCompat$AccessibilityDelegateBaseImpl.getAccessibilityNodeProvider(android.view.View$AccessibilityDelegate, View)>
	//    4   10:areturn         
	}

	android.view.View.AccessibilityDelegate getBridge()
	{
		return mBridge;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field android.view.View$AccessibilityDelegate mBridge>
	//    2    4:areturn         
	}

	public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		DEFAULT_DELEGATE.onInitializeAccessibilityEvent(view, accessibilityevent);
	//    0    0:getstatic       #38  <Field android.view.View$AccessibilityDelegate DEFAULT_DELEGATE>
	//    1    3:aload_1         
	//    2    4:aload_2         
	//    3    5:invokevirtual   #61  <Method void android.view.View$AccessibilityDelegate.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
	//    4    8:return          
	}

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		DEFAULT_DELEGATE.onInitializeAccessibilityNodeInfo(view, (AccessibilityNodeInfo)accessibilitynodeinfocompat.getInfo());
	//    0    0:getstatic       #38  <Field android.view.View$AccessibilityDelegate DEFAULT_DELEGATE>
	//    1    3:aload_1         
	//    2    4:aload_2         
	//    3    5:invokevirtual   #69  <Method Object AccessibilityNodeInfoCompat.getInfo()>
	//    4    8:checkcast       #71  <Class AccessibilityNodeInfo>
	//    5   11:invokevirtual   #74  <Method void android.view.View$AccessibilityDelegate.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfo)>
	//    6   14:return          
	}

	public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		DEFAULT_DELEGATE.onPopulateAccessibilityEvent(view, accessibilityevent);
	//    0    0:getstatic       #38  <Field android.view.View$AccessibilityDelegate DEFAULT_DELEGATE>
	//    1    3:aload_1         
	//    2    4:aload_2         
	//    3    5:invokevirtual   #77  <Method void android.view.View$AccessibilityDelegate.onPopulateAccessibilityEvent(View, AccessibilityEvent)>
	//    4    8:return          
	}

	public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
	{
		return DEFAULT_DELEGATE.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
	//    0    0:getstatic       #38  <Field android.view.View$AccessibilityDelegate DEFAULT_DELEGATE>
	//    1    3:aload_1         
	//    2    4:aload_2         
	//    3    5:aload_3         
	//    4    6:invokevirtual   #81  <Method boolean android.view.View$AccessibilityDelegate.onRequestSendAccessibilityEvent(ViewGroup, View, AccessibilityEvent)>
	//    5    9:ireturn         
	}

	public boolean performAccessibilityAction(View view, int i, Bundle bundle)
	{
		return IMPL.performAccessibilityAction(DEFAULT_DELEGATE, view, i, bundle);
	//    0    0:getstatic       #32  <Field AccessibilityDelegateCompat$AccessibilityDelegateBaseImpl IMPL>
	//    1    3:getstatic       #38  <Field android.view.View$AccessibilityDelegate DEFAULT_DELEGATE>
	//    2    6:aload_1         
	//    3    7:iload_2         
	//    4    8:aload_3         
	//    5    9:invokevirtual   #86  <Method boolean AccessibilityDelegateCompat$AccessibilityDelegateBaseImpl.performAccessibilityAction(android.view.View$AccessibilityDelegate, View, int, Bundle)>
	//    6   12:ireturn         
	}

	public void sendAccessibilityEvent(View view, int i)
	{
		DEFAULT_DELEGATE.sendAccessibilityEvent(view, i);
	//    0    0:getstatic       #38  <Field android.view.View$AccessibilityDelegate DEFAULT_DELEGATE>
	//    1    3:aload_1         
	//    2    4:iload_2         
	//    3    5:invokevirtual   #90  <Method void android.view.View$AccessibilityDelegate.sendAccessibilityEvent(View, int)>
	//    4    8:return          
	}

	public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityevent)
	{
		DEFAULT_DELEGATE.sendAccessibilityEventUnchecked(view, accessibilityevent);
	//    0    0:getstatic       #38  <Field android.view.View$AccessibilityDelegate DEFAULT_DELEGATE>
	//    1    3:aload_1         
	//    2    4:aload_2         
	//    3    5:invokevirtual   #93  <Method void android.view.View$AccessibilityDelegate.sendAccessibilityEventUnchecked(View, AccessibilityEvent)>
	//    4    8:return          
	}

	private static final android.view.View.AccessibilityDelegate DEFAULT_DELEGATE = new android.view.View.AccessibilityDelegate();
	private static final AccessibilityDelegateBaseImpl IMPL;
	final android.view.View.AccessibilityDelegate mBridge;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #27  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          21
			IMPL = ((AccessibilityDelegateBaseImpl) (new AccessibilityDelegateApi16Impl()));
	//    3    8:new             #6   <Class AccessibilityDelegateCompat$AccessibilityDelegateApi16Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #30  <Method void AccessibilityDelegateCompat$AccessibilityDelegateApi16Impl()>
	//    6   15:putstatic       #32  <Field AccessibilityDelegateCompat$AccessibilityDelegateBaseImpl IMPL>
		else
	//*   7   18:goto            31
			IMPL = new AccessibilityDelegateBaseImpl();
	//    8   21:new             #11  <Class AccessibilityDelegateCompat$AccessibilityDelegateBaseImpl>
	//    9   24:dup             
	//   10   25:invokespecial   #33  <Method void AccessibilityDelegateCompat$AccessibilityDelegateBaseImpl()>
	//   11   28:putstatic       #32  <Field AccessibilityDelegateCompat$AccessibilityDelegateBaseImpl IMPL>
	//   12   31:new             #35  <Class android.view.View$AccessibilityDelegate>
	//   13   34:dup             
	//   14   35:invokespecial   #36  <Method void android.view.View$AccessibilityDelegate()>
	//   15   38:putstatic       #38  <Field android.view.View$AccessibilityDelegate DEFAULT_DELEGATE>
	//*  16   41:return          
	}
}
