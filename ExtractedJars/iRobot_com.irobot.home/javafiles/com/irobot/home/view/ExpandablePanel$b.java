// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.irobot.home.view:
//			ExpandablePanel

private class ExpandablePanel$b extends Animation
{

	protected void applyTransformation(float f, Transformation transformation)
	{
		transformation = ((Transformation) (ExpandablePanel.e(a).getLayoutParams()));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ExpandablePanel a>
	//    2    4:invokestatic    #29  <Method View ExpandablePanel.e(ExpandablePanel)>
	//    3    7:invokevirtual   #35  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    4   10:astore_2        
		transformation.height = (int)((float)b + (float)c * f);
	//    5   11:aload_2         
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field int b>
	//    8   16:i2f             
	//    9   17:aload_0         
	//   10   18:getfield        #22  <Field int c>
	//   11   21:i2f             
	//   12   22:fload_1         
	//   13   23:fmul            
	//   14   24:fadd            
	//   15   25:f2i             
	//   16   26:putfield        #40  <Field int android.view.ViewGroup$LayoutParams.height>
		ExpandablePanel.e(a).setLayoutParams(((android.view.rams) (transformation)));
	//   17   29:aload_0         
	//   18   30:getfield        #15  <Field ExpandablePanel a>
	//   19   33:invokestatic    #29  <Method View ExpandablePanel.e(ExpandablePanel)>
	//   20   36:aload_2         
	//   21   37:invokevirtual   #44  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		ExpandablePanel.e(a).requestLayout();
	//   22   40:aload_0         
	//   23   41:getfield        #15  <Field ExpandablePanel a>
	//   24   44:invokestatic    #29  <Method View ExpandablePanel.e(ExpandablePanel)>
	//   25   47:invokevirtual   #47  <Method void View.requestLayout()>
	//   26   50:return          
	}

	public boolean willChangeBounds()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	final ExpandablePanel a;
	private final int b;
	private final int c;

	public ExpandablePanel$b(ExpandablePanel expandablepanel, int i, int j)
	{
		a = expandablepanel;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ExpandablePanel a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Animation()>
		b = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field int b>
		c = j - i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:iload_2         
	//   11   17:isub            
	//   12   18:putfield        #22  <Field int c>
	//   13   21:return          
	}
}
