// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.view.a.e;
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
	//    3    3:invokespecial   #18  <Method void android.view.View$AccessibilityDelegate.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfo)>
		e.a(accessibilitynodeinfo).e(true);
	//    4    6:aload_2         
	//    5    7:invokestatic    #24  <Method e e.a(AccessibilityNodeInfo)>
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #28  <Method void e.e(boolean)>
	//    8   14:return          
	}

	final ActivityChooserView this$0;

	ActivityChooserView$3()
	{
		this$0 = ActivityChooserView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field ActivityChooserView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void android.view.View$AccessibilityDelegate()>
	//    5    9:return          
	}
}
