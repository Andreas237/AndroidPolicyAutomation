// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;
import android.support.v4.view.ViewCompat;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

class BaseTransientBottomBar$15
	implements android.animation.teListener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		int i = ((Integer)valueanimator.getAnimatedValue()).intValue();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #35  <Method Object ValueAnimator.getAnimatedValue()>
	//    2    4:checkcast       #37  <Class Integer>
	//    3    7:invokevirtual   #41  <Method int Integer.intValue()>
	//    4   10:istore_2        
		if(BaseTransientBottomBar.access$100())
	//*   5   11:invokestatic    #45  <Method boolean BaseTransientBottomBar.access$100()>
	//*   6   14:ifeq            36
			ViewCompat.offsetTopAndBottom(((android.view.View) (b.mView)), i - d);
	//    7   17:aload_0         
	//    8   18:getfield        #20  <Field BaseTransientBottomBar b>
	//    9   21:getfield        #49  <Field BaseTransientBottomBar$c BaseTransientBottomBar.mView>
	//   10   24:iload_2         
	//   11   25:aload_0         
	//   12   26:getfield        #26  <Field int d>
	//   13   29:isub            
	//   14   30:invokestatic    #55  <Method void ViewCompat.offsetTopAndBottom(android.view.View, int)>
		else
	//*  15   33:goto            48
			b.mView.setTranslationY(i);
	//   16   36:aload_0         
	//   17   37:getfield        #20  <Field BaseTransientBottomBar b>
	//   18   40:getfield        #49  <Field BaseTransientBottomBar$c BaseTransientBottomBar.mView>
	//   19   43:iload_2         
	//   20   44:i2f             
	//   21   45:invokevirtual   #61  <Method void BaseTransientBottomBar$c.setTranslationY(float)>
		d = i;
	//   22   48:aload_0         
	//   23   49:iload_2         
	//   24   50:putfield        #26  <Field int d>
	//   25   53:return          
	}

	final int a;
	final BaseTransientBottomBar b;
	private int d;

	BaseTransientBottomBar$15(BaseTransientBottomBar basetransientbottombar, int i)
	{
		b = basetransientbottombar;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field BaseTransientBottomBar b>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field int a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
		d = a;
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field int a>
	//   11   19:putfield        #26  <Field int d>
	//   12   22:return          
	}
}
