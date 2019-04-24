// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.view.s;
import android.view.View;

// Referenced classes of package android.support.transition:
//			Fade, au

private static class Fade$a extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		au.a(a, 1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field View a>
	//    2    4:fconst_1        
	//    3    5:invokestatic    #27  <Method void au.a(View, float)>
		if(b)
	//*   4    8:aload_0         
	//*   5    9:getfield        #17  <Field boolean b>
	//*   6   12:ifeq            24
			a.setLayerType(0, ((android.graphics.Paint) (null)));
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field View a>
	//    9   19:iconst_0        
	//   10   20:aconst_null     
	//   11   21:invokevirtual   #33  <Method void View.setLayerType(int, android.graphics.Paint)>
	//   12   24:return          
	}

	public void onAnimationStart(Animator animator)
	{
		if(s.r(a) && a.getLayerType() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field View a>
	//*   2    4:invokestatic    #40  <Method boolean s.r(View)>
	//*   3    7:ifeq            34
	//*   4   10:aload_0         
	//*   5   11:getfield        #19  <Field View a>
	//*   6   14:invokevirtual   #44  <Method int View.getLayerType()>
	//*   7   17:ifne            34
		{
			b = true;
	//    8   20:aload_0         
	//    9   21:iconst_1        
	//   10   22:putfield        #17  <Field boolean b>
			a.setLayerType(2, ((android.graphics.Paint) (null)));
	//   11   25:aload_0         
	//   12   26:getfield        #19  <Field View a>
	//   13   29:iconst_2        
	//   14   30:aconst_null     
	//   15   31:invokevirtual   #33  <Method void View.setLayerType(int, android.graphics.Paint)>
		}
	//   16   34:return          
	}

	private final View a;
	private boolean b;

	Fade$a(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void AnimatorListenerAdapter()>
		b = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field boolean b>
		a = view;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #19  <Field View a>
	//    8   14:return          
	}
}
