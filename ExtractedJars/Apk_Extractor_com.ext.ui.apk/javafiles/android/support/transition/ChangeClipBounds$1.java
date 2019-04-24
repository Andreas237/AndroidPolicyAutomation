// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.view.ViewCompat;
import android.view.View;

// Referenced classes of package android.support.transition:
//			ChangeClipBounds

class ChangeClipBounds$1 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		ViewCompat.setClipBounds(val$endView, ((android.graphics.Rect) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field View val$endView>
	//    2    4:aconst_null     
	//    3    5:invokestatic    #31  <Method void ViewCompat.setClipBounds(View, android.graphics.Rect)>
	//    4    8:return          
	}

	final ChangeClipBounds this$0;
	final View val$endView;

	ChangeClipBounds$1()
	{
		this$0 = final_changeclipbounds;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ChangeClipBounds this$0>
		val$endView = View.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field View val$endView>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void AnimatorListenerAdapter()>
	//    8   14:return          
	}
}
