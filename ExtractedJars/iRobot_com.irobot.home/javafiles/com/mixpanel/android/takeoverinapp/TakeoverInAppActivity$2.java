// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.takeoverinapp;

import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import com.mixpanel.android.mpmetrics.InAppButton;

// Referenced classes of package com.mixpanel.android.takeoverinapp:
//			TakeoverInAppActivity

class TakeoverInAppActivity$2
	implements android.view.View.OnTouchListener
{

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		if(motionevent.getAction() == 0)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #40  <Method int MotionEvent.getAction()>
	//*   2    4:ifne            23
		{
			int i = a;
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field int a>
	//    5   11:istore_3        
			b.setColor(i);
	//    6   12:aload_0         
	//    7   13:getfield        #26  <Field GradientDrawable b>
	//    8   16:iload_3         
	//    9   17:invokevirtual   #46  <Method void GradientDrawable.setColor(int)>
		} else
	//*  10   20:goto            37
		{
			b.setColor(c.c());
	//   11   23:aload_0         
	//   12   24:getfield        #26  <Field GradientDrawable b>
	//   13   27:aload_0         
	//   14   28:getfield        #28  <Field InAppButton c>
	//   15   31:invokevirtual   #50  <Method int InAppButton.c()>
	//   16   34:invokevirtual   #46  <Method void GradientDrawable.setColor(int)>
		}
		return false;
	//   17   37:iconst_0        
	//   18   38:ireturn         
	}

	final int a;
	final GradientDrawable b;
	final InAppButton c;
	final TakeoverInAppActivity d;

	TakeoverInAppActivity$2(TakeoverInAppActivity takeoverinappactivity, int i, GradientDrawable gradientdrawable, InAppButton inappbutton)
	{
		d = takeoverinappactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field TakeoverInAppActivity d>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #24  <Field int a>
		b = gradientdrawable;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field GradientDrawable b>
		c = inappbutton;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #28  <Field InAppButton c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
