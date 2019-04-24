// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.design.widget:
//			CheckableImageButton

class CheckableImageButton$1 extends a
{

	public void a(View view, b b1)
	{
		super.a(view, b1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void a.a(View, b)>
		b1.a(true);
	//    4    6:aload_2         
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #26  <Method void b.a(boolean)>
		b1.b(a.isChecked());
	//    7   11:aload_2         
	//    8   12:aload_0         
	//    9   13:getfield        #14  <Field CheckableImageButton a>
	//   10   16:invokevirtual   #30  <Method boolean CheckableImageButton.isChecked()>
	//   11   19:invokevirtual   #33  <Method void b.b(boolean)>
	//   12   22:return          
	}

	public void a(View view, AccessibilityEvent accessibilityevent)
	{
		super.a(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #36  <Method void a.a(View, AccessibilityEvent)>
		accessibilityevent.setChecked(a.isChecked());
	//    4    6:aload_2         
	//    5    7:aload_0         
	//    6    8:getfield        #14  <Field CheckableImageButton a>
	//    7   11:invokevirtual   #30  <Method boolean CheckableImageButton.isChecked()>
	//    8   14:invokevirtual   #41  <Method void AccessibilityEvent.setChecked(boolean)>
	//    9   17:return          
	}

	final CheckableImageButton a;

	CheckableImageButton$1(CheckableImageButton checkableimagebutton)
	{
		a = checkableimagebutton;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field CheckableImageButton a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void a()>
	//    5    9:return          
	}
}
