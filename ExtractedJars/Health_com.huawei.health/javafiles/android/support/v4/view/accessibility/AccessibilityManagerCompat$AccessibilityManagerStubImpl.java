// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityManager;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityManagerCompat

static class AccessibilityManagerCompat$AccessibilityManagerStubImpl
	implements pl
{

	public boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, ner ner)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean addTouchExplorationStateChangeListener(AccessibilityManager accessibilitymanager, stener stener)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public List getEnabledAccessibilityServiceList(AccessibilityManager accessibilitymanager, int i)
	{
		return Collections.emptyList();
	//    0    0:invokestatic    #26  <Method List Collections.emptyList()>
	//    1    3:areturn         
	}

	public List getInstalledAccessibilityServiceList(AccessibilityManager accessibilitymanager)
	{
		return Collections.emptyList();
	//    0    0:invokestatic    #26  <Method List Collections.emptyList()>
	//    1    3:areturn         
	}

	public boolean isTouchExplorationEnabled(AccessibilityManager accessibilitymanager)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public stenerWrapper newAccessibilityStateChangeListener(ner ner)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public angeListenerWrapper newTouchExplorationStateChangeListener(stener stener)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, ner ner)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean removeTouchExplorationStateChangeListener(AccessibilityManager accessibilitymanager, stener stener)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	AccessibilityManagerCompat$AccessibilityManagerStubImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
