// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;

// Referenced classes of package com.irobot.home.fragments:
//			be

class be$8
	implements android.view.reeObserver.OnGlobalLayoutListener
{

	public void onGlobalLayout()
	{
		a.i.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.reeObserver.OnGlobalLayoutListener) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field be a>
	//    2    4:getfield        #25  <Field LinearLayout be.i>
	//    3    7:invokevirtual   #31  <Method ViewTreeObserver LinearLayout.getViewTreeObserver()>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #37  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		int i = a.i.getHeight();
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field be a>
	//    8   18:getfield        #25  <Field LinearLayout be.i>
	//    9   21:invokevirtual   #41  <Method int LinearLayout.getHeight()>
	//   10   24:istore_1        
		a.aq = ObjectAnimator.ofFloat(((Object) (a.i)), "translationY", new float[] {
			(float)(i * 2)
		});
	//   11   25:aload_0         
	//   12   26:getfield        #17  <Field be a>
	//   13   29:aload_0         
	//   14   30:getfield        #17  <Field be a>
	//   15   33:getfield        #25  <Field LinearLayout be.i>
	//   16   36:ldc1            #43  <String "translationY">
	//   17   38:iconst_1        
	//   18   39:newarray        float[]
	//   19   41:dup             
	//   20   42:iconst_0        
	//   21   43:iload_1         
	//   22   44:iconst_2        
	//   23   45:imul            
	//   24   46:i2f             
	//   25   47:fastore         
	//   26   48:invokestatic    #49  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   27   51:putfield        #53  <Field ObjectAnimator be.aq>
		a.aq.setDuration(a.getResources().getInteger(0x7f0a0005));
	//   28   54:aload_0         
	//   29   55:getfield        #17  <Field be a>
	//   30   58:getfield        #53  <Field ObjectAnimator be.aq>
	//   31   61:aload_0         
	//   32   62:getfield        #17  <Field be a>
	//   33   65:invokevirtual   #57  <Method Resources be.getResources()>
	//   34   68:ldc1            #58  <Int 0x7f0a0005>
	//   35   70:invokevirtual   #64  <Method int Resources.getInteger(int)>
	//   36   73:i2l             
	//   37   74:invokevirtual   #68  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   38   77:pop             
		a.am = new AnimatorSet();
	//   39   78:aload_0         
	//   40   79:getfield        #17  <Field be a>
	//   41   82:new             #70  <Class AnimatorSet>
	//   42   85:dup             
	//   43   86:invokespecial   #71  <Method void AnimatorSet()>
	//   44   89:putfield        #75  <Field AnimatorSet be.am>
		a.am.play(((android.animation.Animator) (a.aq)));
	//   45   92:aload_0         
	//   46   93:getfield        #17  <Field be a>
	//   47   96:getfield        #75  <Field AnimatorSet be.am>
	//   48   99:aload_0         
	//   49  100:getfield        #17  <Field be a>
	//   50  103:getfield        #53  <Field ObjectAnimator be.aq>
	//   51  106:invokevirtual   #79  <Method android.animation.AnimatorSet$Builder AnimatorSet.play(android.animation.Animator)>
	//   52  109:pop             
	//   53  110:return          
	}

	final be a;

	be$8(be be1)
	{
		a = be1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field be a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
