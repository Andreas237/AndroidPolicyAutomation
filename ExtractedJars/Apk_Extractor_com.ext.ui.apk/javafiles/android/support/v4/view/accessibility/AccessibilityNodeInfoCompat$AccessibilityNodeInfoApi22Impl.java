// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat

static class AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi22Impl extends AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi21Impl
{

	public Object getTraversalAfter(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return ((Object) (accessibilitynodeinfo.getTraversalAfter()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method AccessibilityNodeInfo AccessibilityNodeInfo.getTraversalAfter()>
	//    2    4:areturn         
	}

	public Object getTraversalBefore(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return ((Object) (accessibilitynodeinfo.getTraversalBefore()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #25  <Method AccessibilityNodeInfo AccessibilityNodeInfo.getTraversalBefore()>
	//    2    4:areturn         
	}

	public void setTraversalAfter(AccessibilityNodeInfo accessibilitynodeinfo, View view)
	{
		accessibilitynodeinfo.setTraversalAfter(view);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #30  <Method void AccessibilityNodeInfo.setTraversalAfter(View)>
	//    3    5:return          
	}

	public void setTraversalAfter(AccessibilityNodeInfo accessibilitynodeinfo, View view, int i)
	{
		accessibilitynodeinfo.setTraversalAfter(view, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #34  <Method void AccessibilityNodeInfo.setTraversalAfter(View, int)>
	//    4    6:return          
	}

	public void setTraversalBefore(AccessibilityNodeInfo accessibilitynodeinfo, View view)
	{
		accessibilitynodeinfo.setTraversalBefore(view);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #37  <Method void AccessibilityNodeInfo.setTraversalBefore(View)>
	//    3    5:return          
	}

	public void setTraversalBefore(AccessibilityNodeInfo accessibilitynodeinfo, View view, int i)
	{
		accessibilitynodeinfo.setTraversalBefore(view, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #39  <Method void AccessibilityNodeInfo.setTraversalBefore(View, int)>
	//    4    6:return          
	}

	AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi22Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi21Impl()>
	//    2    4:return          
	}
}
