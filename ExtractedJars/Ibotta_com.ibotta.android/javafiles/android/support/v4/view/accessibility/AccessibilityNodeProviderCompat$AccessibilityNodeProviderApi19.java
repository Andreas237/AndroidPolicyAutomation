// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeProviderCompat, AccessibilityNodeInfoCompat

static class AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi19 extends AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi16
{

	public AccessibilityNodeInfo findFocus(int i)
	{
		AccessibilityNodeInfoCompat accessibilitynodeinfocompat = mCompat.findFocus(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AccessibilityNodeProviderCompat mCompat>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #24  <Method AccessibilityNodeInfoCompat AccessibilityNodeProviderCompat.findFocus(int)>
	//    4    8:astore_2        
		if(accessibilitynodeinfocompat == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		else
			return accessibilitynodeinfocompat.unwrap();
	//    9   15:aload_2         
	//   10   16:invokevirtual   #30  <Method AccessibilityNodeInfo AccessibilityNodeInfoCompat.unwrap()>
	//   11   19:areturn         
	}

	AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi19(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat)
	{
		super(accessibilitynodeprovidercompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi16(AccessibilityNodeProviderCompat)>
	//    3    5:return          
	}
}
