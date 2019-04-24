// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeProviderCompatJellyBean

static final class AccessibilityNodeProviderCompatJellyBean$1 extends AccessibilityNodeProvider
{

	public AccessibilityNodeInfo createAccessibilityNodeInfo(int i)
	{
		return (AccessibilityNodeInfo)val$bridge.createAccessibilityNodeInfo(i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AccessibilityNodeProviderCompatJellyBean$AccessibilityNodeInfoBridge val$bridge>
	//    2    4:iload_1         
	//    3    5:invokeinterface #26  <Method Object AccessibilityNodeProviderCompatJellyBean$AccessibilityNodeInfoBridge.createAccessibilityNodeInfo(int)>
	//    4   10:checkcast       #28  <Class AccessibilityNodeInfo>
	//    5   13:areturn         
	}

	public List findAccessibilityNodeInfosByText(String s, int i)
	{
		return val$bridge.findAccessibilityNodeInfosByText(s, i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AccessibilityNodeProviderCompatJellyBean$AccessibilityNodeInfoBridge val$bridge>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #32  <Method List AccessibilityNodeProviderCompatJellyBean$AccessibilityNodeInfoBridge.findAccessibilityNodeInfosByText(String, int)>
	//    5   11:areturn         
	}

	public boolean performAction(int i, int j, Bundle bundle)
	{
		return val$bridge.performAction(i, j, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AccessibilityNodeProviderCompatJellyBean$AccessibilityNodeInfoBridge val$bridge>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #38  <Method boolean AccessibilityNodeProviderCompatJellyBean$AccessibilityNodeInfoBridge.performAction(int, int, Bundle)>
	//    6   12:ireturn         
	}

	final cessibilityNodeInfoBridge val$bridge;

	AccessibilityNodeProviderCompatJellyBean$1(cessibilityNodeInfoBridge cessibilitynodeinfobridge)
	{
		val$bridge = cessibilitynodeinfobridge;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AccessibilityNodeProviderCompatJellyBean$AccessibilityNodeInfoBridge val$bridge>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void AccessibilityNodeProvider()>
	//    5    9:return          
	}
}
