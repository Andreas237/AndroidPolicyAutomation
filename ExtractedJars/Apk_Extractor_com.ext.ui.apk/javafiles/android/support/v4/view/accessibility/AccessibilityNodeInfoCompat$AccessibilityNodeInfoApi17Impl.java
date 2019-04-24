// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat

static class AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi17Impl extends AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi16Impl
{

	public Object getLabelFor(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return ((Object) (accessibilitynodeinfo.getLabelFor()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method AccessibilityNodeInfo AccessibilityNodeInfo.getLabelFor()>
	//    2    4:areturn         
	}

	public Object getLabeledBy(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return ((Object) (accessibilitynodeinfo.getLabeledBy()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #25  <Method AccessibilityNodeInfo AccessibilityNodeInfo.getLabeledBy()>
	//    2    4:areturn         
	}

	public void setLabelFor(AccessibilityNodeInfo accessibilitynodeinfo, View view)
	{
		accessibilitynodeinfo.setLabelFor(view);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #30  <Method void AccessibilityNodeInfo.setLabelFor(View)>
	//    3    5:return          
	}

	public void setLabelFor(AccessibilityNodeInfo accessibilitynodeinfo, View view, int i)
	{
		accessibilitynodeinfo.setLabelFor(view, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #34  <Method void AccessibilityNodeInfo.setLabelFor(View, int)>
	//    4    6:return          
	}

	public void setLabeledBy(AccessibilityNodeInfo accessibilitynodeinfo, View view)
	{
		accessibilitynodeinfo.setLabeledBy(view);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #37  <Method void AccessibilityNodeInfo.setLabeledBy(View)>
	//    3    5:return          
	}

	public void setLabeledBy(AccessibilityNodeInfo accessibilitynodeinfo, View view, int i)
	{
		accessibilitynodeinfo.setLabeledBy(view, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #39  <Method void AccessibilityNodeInfo.setLabeledBy(View, int)>
	//    4    6:return          
	}

	AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi17Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi16Impl()>
	//    2    4:return          
	}
}
