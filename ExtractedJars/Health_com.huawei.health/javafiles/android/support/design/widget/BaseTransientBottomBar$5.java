// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;
import android.support.v4.view.ViewCompat;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

class BaseTransientBottomBar$5
	implements android.animation.ateListener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		int i = ((Integer)valueanimator.getAnimatedValue()).intValue();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #33  <Method Object ValueAnimator.getAnimatedValue()>
	//    2    4:checkcast       #35  <Class Integer>
	//    3    7:invokevirtual   #39  <Method int Integer.intValue()>
	//    4   10:istore_2        
		if(BaseTransientBottomBar.access$100())
	//*   5   11:invokestatic    #43  <Method boolean BaseTransientBottomBar.access$100()>
	//*   6   14:ifeq            36
			ViewCompat.offsetTopAndBottom(((android.view.View) (a.mView)), i - b);
	//    7   17:aload_0         
	//    8   18:getfield        #19  <Field BaseTransientBottomBar a>
	//    9   21:getfield        #47  <Field BaseTransientBottomBar$c BaseTransientBottomBar.mView>
	//   10   24:iload_2         
	//   11   25:aload_0         
	//   12   26:getfield        #24  <Field int b>
	//   13   29:isub            
	//   14   30:invokestatic    #53  <Method void ViewCompat.offsetTopAndBottom(android.view.View, int)>
		else
	//*  15   33:goto            48
			a.mView.setTranslationY(i);
	//   16   36:aload_0         
	//   17   37:getfield        #19  <Field BaseTransientBottomBar a>
	//   18   40:getfield        #47  <Field BaseTransientBottomBar$c BaseTransientBottomBar.mView>
	//   19   43:iload_2         
	//   20   44:i2f             
	//   21   45:invokevirtual   #59  <Method void BaseTransientBottomBar$c.setTranslationY(float)>
		b = i;
	//   22   48:aload_0         
	//   23   49:iload_2         
	//   24   50:putfield        #24  <Field int b>
	//   25   53:return          
	}

	final BaseTransientBottomBar a;
	private int b;

	BaseTransientBottomBar$5(BaseTransientBottomBar basetransientbottombar)
	{
		a = basetransientbottombar;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BaseTransientBottomBar a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		b = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #24  <Field int b>
	//    8   14:return          
	}
}
