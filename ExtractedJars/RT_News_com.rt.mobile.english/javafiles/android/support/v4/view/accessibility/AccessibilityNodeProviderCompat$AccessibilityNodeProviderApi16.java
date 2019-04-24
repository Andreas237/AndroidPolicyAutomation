// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeProviderCompat, AccessibilityNodeInfoCompat

static class AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi16 extends AccessibilityNodeProvider
{

	public AccessibilityNodeInfo createAccessibilityNodeInfo(int i)
	{
		AccessibilityNodeInfoCompat accessibilitynodeinfocompat = mCompat.createAccessibilityNodeInfo(i);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AccessibilityNodeProviderCompat mCompat>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #25  <Method AccessibilityNodeInfoCompat AccessibilityNodeProviderCompat.createAccessibilityNodeInfo(int)>
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
	//   10   16:invokevirtual   #31  <Method AccessibilityNodeInfo AccessibilityNodeInfoCompat.unwrap()>
	//   11   19:areturn         
	}

	public List findAccessibilityNodeInfosByText(String s, int i)
	{
		s = ((String) (mCompat.findAccessibilityNodeInfosByText(s, i)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AccessibilityNodeProviderCompat mCompat>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #35  <Method List AccessibilityNodeProviderCompat.findAccessibilityNodeInfosByText(String, int)>
	//    5    9:astore_1        
		if(s == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       16
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
		ArrayList arraylist = new ArrayList();
	//   10   16:new             #37  <Class ArrayList>
	//   11   19:dup             
	//   12   20:invokespecial   #38  <Method void ArrayList()>
	//   13   23:astore          4
		int j = ((List) (s)).size();
	//   14   25:aload_1         
	//   15   26:invokeinterface #44  <Method int List.size()>
	//   16   31:istore_3        
		for(i = 0; i < j; i++)
	//*  17   32:iconst_0        
	//*  18   33:istore_2        
	//*  19   34:iload_2         
	//*  20   35:iload_3         
	//*  21   36:icmpge          67
			((List) (arraylist)).add(((Object) (((AccessibilityNodeInfoCompat)((List) (s)).get(i)).unwrap())));
	//   22   39:aload           4
	//   23   41:aload_1         
	//   24   42:iload_2         
	//   25   43:invokeinterface #48  <Method Object List.get(int)>
	//   26   48:checkcast       #27  <Class AccessibilityNodeInfoCompat>
	//   27   51:invokevirtual   #31  <Method AccessibilityNodeInfo AccessibilityNodeInfoCompat.unwrap()>
	//   28   54:invokeinterface #52  <Method boolean List.add(Object)>
	//   29   59:pop             

	//   30   60:iload_2         
	//   31   61:iconst_1        
	//   32   62:iadd            
	//   33   63:istore_2        
	//*  34   64:goto            34
		return ((List) (arraylist));
	//   35   67:aload           4
	//   36   69:areturn         
	}

	public boolean performAction(int i, int j, Bundle bundle)
	{
		return mCompat.performAction(i, j, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AccessibilityNodeProviderCompat mCompat>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #58  <Method boolean AccessibilityNodeProviderCompat.performAction(int, int, Bundle)>
	//    6   10:ireturn         
	}

	final AccessibilityNodeProviderCompat mCompat;

	AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi16(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void AccessibilityNodeProvider()>
		mCompat = accessibilitynodeprovidercompat;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field AccessibilityNodeProviderCompat mCompat>
	//    5    9:return          
	}
}
