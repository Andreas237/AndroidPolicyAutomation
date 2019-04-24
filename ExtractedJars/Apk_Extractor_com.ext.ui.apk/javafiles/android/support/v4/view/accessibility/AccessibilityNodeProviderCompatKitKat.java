// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

class AccessibilityNodeProviderCompatKitKat
{
	static interface AccessibilityNodeInfoBridge
	{

		public abstract Object createAccessibilityNodeInfo(int i);

		public abstract List findAccessibilityNodeInfosByText(String s, int i);

		public abstract Object findFocus(int i);

		public abstract boolean performAction(int i, int j, Bundle bundle);
	}


	AccessibilityNodeProviderCompatKitKat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static Object newAccessibilityNodeProviderBridge(AccessibilityNodeInfoBridge accessibilitynodeinfobridge)
	{
		return ((Object) (new AccessibilityNodeProvider(accessibilitynodeinfobridge) {

			public AccessibilityNodeInfo createAccessibilityNodeInfo(int i)
			{
				return (AccessibilityNodeInfo)bridge.createAccessibilityNodeInfo(i);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge val$bridge>
			//    2    4:iload_1         
			//    3    5:invokeinterface #26  <Method Object AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge.createAccessibilityNodeInfo(int)>
			//    4   10:checkcast       #28  <Class AccessibilityNodeInfo>
			//    5   13:areturn         
			}

			public List findAccessibilityNodeInfosByText(String s, int i)
			{
				return bridge.findAccessibilityNodeInfosByText(s, i);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge val$bridge>
			//    2    4:aload_1         
			//    3    5:iload_2         
			//    4    6:invokeinterface #32  <Method List AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge.findAccessibilityNodeInfosByText(String, int)>
			//    5   11:areturn         
			}

			public AccessibilityNodeInfo findFocus(int i)
			{
				return (AccessibilityNodeInfo)bridge.findFocus(i);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge val$bridge>
			//    2    4:iload_1         
			//    3    5:invokeinterface #37  <Method Object AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge.findFocus(int)>
			//    4   10:checkcast       #28  <Class AccessibilityNodeInfo>
			//    5   13:areturn         
			}

			public boolean performAction(int i, int j, Bundle bundle)
			{
				return bridge.performAction(i, j, bundle);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge val$bridge>
			//    2    4:iload_1         
			//    3    5:iload_2         
			//    4    6:aload_3         
			//    5    7:invokeinterface #41  <Method boolean AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge.performAction(int, int, Bundle)>
			//    6   12:ireturn         
			}

			final AccessibilityNodeInfoBridge val$bridge;

			
			{
				bridge = accessibilitynodeinfobridge;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge val$bridge>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void AccessibilityNodeProvider()>
			//    5    9:return          
			}
		}
));
	//    0    0:new             #6   <Class AccessibilityNodeProviderCompatKitKat$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #22  <Method void AccessibilityNodeProviderCompatKitKat$1(AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge)>
	//    4    8:areturn         
	}
}
