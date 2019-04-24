// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v4.view:
//			ViewPropertyAnimatorListener

class ViewPropertyAnimatorCompatICS
{

	ViewPropertyAnimatorCompatICS()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public static void setListener(View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener)
	{
		if(viewpropertyanimatorlistener != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
		{
			view.animate().setListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter(viewpropertyanimatorlistener, view) {

				public void onAnimationCancel(Animator animator)
				{
					listener.onAnimationCancel(view);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field ViewPropertyAnimatorListener val$listener>
				//    2    4:aload_0         
				//    3    5:getfield        #19  <Field View val$view>
				//    4    8:invokeinterface #30  <Method void ViewPropertyAnimatorListener.onAnimationCancel(View)>
				//    5   13:return          
				}

				public void onAnimationEnd(Animator animator)
				{
					listener.onAnimationEnd(view);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field ViewPropertyAnimatorListener val$listener>
				//    2    4:aload_0         
				//    3    5:getfield        #19  <Field View val$view>
				//    4    8:invokeinterface #33  <Method void ViewPropertyAnimatorListener.onAnimationEnd(View)>
				//    5   13:return          
				}

				public void onAnimationStart(Animator animator)
				{
					listener.onAnimationStart(view);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field ViewPropertyAnimatorListener val$listener>
				//    2    4:aload_0         
				//    3    5:getfield        #19  <Field View val$view>
				//    4    8:invokeinterface #36  <Method void ViewPropertyAnimatorListener.onAnimationStart(View)>
				//    5   13:return          
				}

				final ViewPropertyAnimatorListener val$listener;
				final View val$view;

			
			{
				listener = viewpropertyanimatorlistener;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ViewPropertyAnimatorListener val$listener>
				view = view1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field View val$view>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void AnimatorListenerAdapter()>
			//    8   14:return          
			}
			}
)));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #22  <Method ViewPropertyAnimator View.animate()>
	//    4    8:new             #6   <Class ViewPropertyAnimatorCompatICS$1>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokespecial   #25  <Method void ViewPropertyAnimatorCompatICS$1(ViewPropertyAnimatorListener, View)>
	//    9   17:invokevirtual   #30  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   10   20:pop             
			return;
	//   11   21:return          
		} else
		{
			view.animate().setListener(((android.animation.Animator.AnimatorListener) (null)));
	//   12   22:aload_0         
	//   13   23:invokevirtual   #22  <Method ViewPropertyAnimator View.animate()>
	//   14   26:aconst_null     
	//   15   27:invokevirtual   #30  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   16   30:pop             
			return;
	//   17   31:return          
		}
	}
}
