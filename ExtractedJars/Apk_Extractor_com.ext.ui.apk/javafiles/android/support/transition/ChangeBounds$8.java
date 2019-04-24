// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.view.View;

// Referenced classes of package android.support.transition:
//			ChangeBounds, ViewUtils

class ChangeBounds$8 extends AnimatorListenerAdapter
{

	public void onAnimationCancel(Animator animator)
	{
		mIsCanceled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #46  <Field boolean mIsCanceled>
	//    3    5:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		if(!mIsCanceled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field boolean mIsCanceled>
	//*   2    4:ifne            41
		{
			ViewCompat.setClipBounds(val$view, val$finalClip);
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field View val$view>
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field Rect val$finalClip>
	//    7   15:invokestatic    #53  <Method void ViewCompat.setClipBounds(View, Rect)>
			ViewUtils.setLeftTopRightBottom(val$view, val$endLeft, val$endTop, val$endRight, val$endBottom);
	//    8   18:aload_0         
	//    9   19:getfield        #28  <Field View val$view>
	//   10   22:aload_0         
	//   11   23:getfield        #32  <Field int val$endLeft>
	//   12   26:aload_0         
	//   13   27:getfield        #34  <Field int val$endTop>
	//   14   30:aload_0         
	//   15   31:getfield        #36  <Field int val$endRight>
	//   16   34:aload_0         
	//   17   35:getfield        #38  <Field int val$endBottom>
	//   18   38:invokestatic    #59  <Method void ViewUtils.setLeftTopRightBottom(View, int, int, int, int)>
		}
	//   19   41:return          
	}

	private boolean mIsCanceled;
	final ChangeBounds this$0;
	final int val$endBottom;
	final int val$endLeft;
	final int val$endRight;
	final int val$endTop;
	final Rect val$finalClip;
	final View val$view;

	ChangeBounds$8()
	{
		this$0 = final_changebounds;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field ChangeBounds this$0>
		val$view = view1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field View val$view>
		val$finalClip = rect;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field Rect val$finalClip>
		val$endLeft = i;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #32  <Field int val$endLeft>
		val$endTop = j;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #34  <Field int val$endTop>
		val$endRight = k;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #36  <Field int val$endRight>
		val$endBottom = I.this;
	//   18   33:aload_0         
	//   19   34:iload           7
	//   20   36:putfield        #38  <Field int val$endBottom>
		super();
	//   21   39:aload_0         
	//   22   40:invokespecial   #41  <Method void AnimatorListenerAdapter()>
	//   23   43:return          
	}
}
