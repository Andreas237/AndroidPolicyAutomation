// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

// Referenced classes of package android.support.v7.widget:
//			ActivityChooserView

class ActivityChooserView$3 extends android.view.gate
{

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilitynodeinfo)
	{
		super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #22  <Method void android.view.View$AccessibilityDelegate.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfo)>
		AccessibilityNodeInfoCompat.wrap(accessibilitynodeinfo).setCanOpenPopup(true);
	//    4    6:aload_2         
	//    5    7:invokestatic    #28  <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.wrap(AccessibilityNodeInfo)>
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #32  <Method void AccessibilityNodeInfoCompat.setCanOpenPopup(boolean)>
	//    8   14:return          
	}

	final ActivityChooserView this$0;

	ActivityChooserView$3()
	{
		this$0 = ActivityChooserView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ActivityChooserView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void android.view.View$AccessibilityDelegate()>
	//    5    9:return          
	}
}
