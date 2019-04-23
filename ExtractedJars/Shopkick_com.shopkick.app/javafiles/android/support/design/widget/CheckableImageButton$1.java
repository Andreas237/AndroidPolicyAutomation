// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.design.widget:
//			CheckableImageButton

class CheckableImageButton$1 extends AccessibilityDelegateCompat
{

	public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #22  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
		accessibilityevent.setChecked(isChecked());
	//    4    6:aload_2         
	//    5    7:aload_0         
	//    6    8:getfield        #14  <Field CheckableImageButton this$0>
	//    7   11:invokevirtual   #26  <Method boolean CheckableImageButton.isChecked()>
	//    8   14:invokevirtual   #32  <Method void AccessibilityEvent.setChecked(boolean)>
	//    9   17:return          
	}

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #36  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
		accessibilitynodeinfocompat.setCheckable(true);
	//    4    6:aload_2         
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #41  <Method void AccessibilityNodeInfoCompat.setCheckable(boolean)>
		accessibilitynodeinfocompat.setChecked(isChecked());
	//    7   11:aload_2         
	//    8   12:aload_0         
	//    9   13:getfield        #14  <Field CheckableImageButton this$0>
	//   10   16:invokevirtual   #26  <Method boolean CheckableImageButton.isChecked()>
	//   11   19:invokevirtual   #42  <Method void AccessibilityNodeInfoCompat.setChecked(boolean)>
	//   12   22:return          
	}

	final CheckableImageButton this$0;

	CheckableImageButton$1()
	{
		this$0 = CheckableImageButton.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field CheckableImageButton this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void AccessibilityDelegateCompat()>
	//    5    9:return          
	}
}
