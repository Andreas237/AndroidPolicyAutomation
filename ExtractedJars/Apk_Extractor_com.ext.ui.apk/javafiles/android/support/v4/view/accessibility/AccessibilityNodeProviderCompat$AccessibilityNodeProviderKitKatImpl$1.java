// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeProviderCompat, AccessibilityNodeInfoCompat

class AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl$1
	implements AccessibilityNodeProviderCompatKitKat.AccessibilityNodeInfoBridge
{

	public Object createAccessibilityNodeInfo(int i)
	{
		AccessibilityNodeInfoCompat accessibilitynodeinfocompat = val$compat.createAccessibilityNodeInfo(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AccessibilityNodeProviderCompat val$compat>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #33  <Method AccessibilityNodeInfoCompat AccessibilityNodeProviderCompat.createAccessibilityNodeInfo(int)>
	//    4    8:astore_2        
		if(accessibilitynodeinfocompat == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return ((Object) (null));
	//    7   13:aconst_null     
	//    8   14:areturn         
		else
			return ((Object) (accessibilitynodeinfocompat.unwrap()));
	//    9   15:aload_2         
	//   10   16:invokevirtual   #39  <Method android.view.accessibility.AccessibilityNodeInfo AccessibilityNodeInfoCompat.unwrap()>
	//   11   19:areturn         
	}

	public List findAccessibilityNodeInfosByText(String s, int i)
	{
		s = ((String) (val$compat.findAccessibilityNodeInfosByText(s, i)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AccessibilityNodeProviderCompat val$compat>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #43  <Method List AccessibilityNodeProviderCompat.findAccessibilityNodeInfosByText(String, int)>
	//    5    9:astore_1        
		if(s == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       16
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
		ArrayList arraylist = new ArrayList();
	//   10   16:new             #45  <Class ArrayList>
	//   11   19:dup             
	//   12   20:invokespecial   #46  <Method void ArrayList()>
	//   13   23:astore          4
		int j = ((List) (s)).size();
	//   14   25:aload_1         
	//   15   26:invokeinterface #52  <Method int List.size()>
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
	//   25   43:invokeinterface #55  <Method Object List.get(int)>
	//   26   48:checkcast       #35  <Class AccessibilityNodeInfoCompat>
	//   27   51:invokevirtual   #39  <Method android.view.accessibility.AccessibilityNodeInfo AccessibilityNodeInfoCompat.unwrap()>
	//   28   54:invokeinterface #59  <Method boolean List.add(Object)>
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

	public Object findFocus(int i)
	{
		AccessibilityNodeInfoCompat accessibilitynodeinfocompat = val$compat.findFocus(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AccessibilityNodeProviderCompat val$compat>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #64  <Method AccessibilityNodeInfoCompat AccessibilityNodeProviderCompat.findFocus(int)>
	//    4    8:astore_2        
		if(accessibilitynodeinfocompat == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return ((Object) (null));
	//    7   13:aconst_null     
	//    8   14:areturn         
		else
			return ((Object) (accessibilitynodeinfocompat.unwrap()));
	//    9   15:aload_2         
	//   10   16:invokevirtual   #39  <Method android.view.accessibility.AccessibilityNodeInfo AccessibilityNodeInfoCompat.unwrap()>
	//   11   19:areturn         
	}

	public boolean performAction(int i, int j, Bundle bundle)
	{
		return val$compat.performAction(i, j, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AccessibilityNodeProviderCompat val$compat>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #68  <Method boolean AccessibilityNodeProviderCompat.performAction(int, int, Bundle)>
	//    6   10:ireturn         
	}

	final AccessibilityNodeProviderCompat.AccessibilityNodeProviderKitKatImpl this$0;
	final AccessibilityNodeProviderCompat val$compat;

	AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl$1()
	{
		this$0 = final_accessibilitynodeproviderkitkatimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl this$0>
		val$compat = AccessibilityNodeProviderCompat.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field AccessibilityNodeProviderCompat val$compat>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
