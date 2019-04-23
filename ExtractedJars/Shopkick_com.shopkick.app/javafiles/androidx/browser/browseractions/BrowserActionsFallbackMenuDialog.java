// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.browser.browseractions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.view.*;

class BrowserActionsFallbackMenuDialog extends Dialog
{

	BrowserActionsFallbackMenuDialog(Context context, View view)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void Dialog(Context)>
		mContentView = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field View mContentView>
	//    6   10:return          
	}

	private void startAnimation(final boolean isEnterAnimation)
	{
		float f1 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_3        
		float f;
		if(isEnterAnimation)
	//*   2    2:iload_1         
	//*   3    3:ifeq            11
			f = 0.0F;
	//    4    6:fconst_0        
	//    5    7:fstore_2        
		else
	//*   6    8:goto            13
			f = 1.0F;
	//    7   11:fconst_1        
	//    8   12:fstore_2        
		if(isEnterAnimation)
	//*   9   13:iload_1         
	//*  10   14:ifeq            19
			f1 = 1.0F;
	//   11   17:fconst_1        
	//   12   18:fstore_3        
		long l;
		if(isEnterAnimation)
	//*  13   19:iload_1         
	//*  14   20:ifeq            31
			l = 250L;
	//   15   23:ldc2w           #9   <Long 250L>
	//   16   26:lstore          4
		else
	//*  17   28:goto            36
			l = 150L;
	//   18   31:ldc2w           #12  <Long 150L>
	//   19   34:lstore          4
		mContentView.setScaleX(f);
	//   20   36:aload_0         
	//   21   37:getfield        #22  <Field View mContentView>
	//   22   40:fload_2         
	//   23   41:invokevirtual   #37  <Method void View.setScaleX(float)>
		mContentView.setScaleY(f);
	//   24   44:aload_0         
	//   25   45:getfield        #22  <Field View mContentView>
	//   26   48:fload_2         
	//   27   49:invokevirtual   #40  <Method void View.setScaleY(float)>
		mContentView.animate().scaleX(f1).scaleY(f1).setDuration(l).setInterpolator(((android.animation.TimeInterpolator) (new LinearOutSlowInInterpolator()))).setListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

			public void onAnimationEnd(Animator animator)
			{
				if(!isEnterAnimation)
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field boolean val$isEnterAnimation>
			//*   2    4:ifne            14
					dismiss();
			//    3    7:aload_0         
			//    4    8:getfield        #17  <Field BrowserActionsFallbackMenuDialog this$0>
			//    5   11:invokestatic    #29  <Method void BrowserActionsFallbackMenuDialog.access$001(BrowserActionsFallbackMenuDialog)>
			//    6   14:return          
			}

			final BrowserActionsFallbackMenuDialog this$0;
			final boolean val$isEnterAnimation;

			
			{
				this$0 = BrowserActionsFallbackMenuDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BrowserActionsFallbackMenuDialog this$0>
				isEnterAnimation = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #19  <Field boolean val$isEnterAnimation>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void AnimatorListenerAdapter()>
			//    8   14:return          
			}
		}
))).start();
	//   28   52:aload_0         
	//   29   53:getfield        #22  <Field View mContentView>
	//   30   56:invokevirtual   #44  <Method ViewPropertyAnimator View.animate()>
	//   31   59:fload_3         
	//   32   60:invokevirtual   #50  <Method ViewPropertyAnimator ViewPropertyAnimator.scaleX(float)>
	//   33   63:fload_3         
	//   34   64:invokevirtual   #53  <Method ViewPropertyAnimator ViewPropertyAnimator.scaleY(float)>
	//   35   67:lload           4
	//   36   69:invokevirtual   #57  <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   37   72:new             #59  <Class LinearOutSlowInInterpolator>
	//   38   75:dup             
	//   39   76:invokespecial   #61  <Method void LinearOutSlowInInterpolator()>
	//   40   79:invokevirtual   #65  <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//   41   82:new             #6   <Class BrowserActionsFallbackMenuDialog$1>
	//   42   85:dup             
	//   43   86:aload_0         
	//   44   87:iload_1         
	//   45   88:invokespecial   #68  <Method void BrowserActionsFallbackMenuDialog$1(BrowserActionsFallbackMenuDialog, boolean)>
	//   46   91:invokevirtual   #72  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   47   94:invokevirtual   #75  <Method void ViewPropertyAnimator.start()>
	//   48   97:return          
	}

	public void dismiss()
	{
		startAnimation(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #77  <Method void startAnimation(boolean)>
	//    3    5:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(motionevent.getAction() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #85  <Method int MotionEvent.getAction()>
	//*   2    4:ifne            13
		{
			dismiss();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #86  <Method void dismiss()>
			return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
		} else
		{
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		}
	}

	public void show()
	{
		getWindow().setBackgroundDrawable(((android.graphics.drawable.Drawable) (new ColorDrawable(0))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #91  <Method Window getWindow()>
	//    2    4:new             #93  <Class ColorDrawable>
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:invokespecial   #96  <Method void ColorDrawable(int)>
	//    6   12:invokevirtual   #102 <Method void Window.setBackgroundDrawable(android.graphics.drawable.Drawable)>
		startAnimation(true);
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:invokespecial   #77  <Method void startAnimation(boolean)>
		super.show();
	//   10   20:aload_0         
	//   11   21:invokespecial   #104 <Method void Dialog.show()>
	//   12   24:return          
	}

	private static final long ENTER_ANIMATION_DURATION_MS = 250L;
	private static final long EXIT_ANIMATION_DURATION_MS = 150L;
	private final View mContentView;


/*
	static void access$001(BrowserActionsFallbackMenuDialog browseractionsfallbackmenudialog)
	{
		((Dialog) (browseractionsfallbackmenudialog)).Dialog.dismiss();
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Dialog.dismiss()>
		return;
	//    2    4:return          
	}

*/
}
