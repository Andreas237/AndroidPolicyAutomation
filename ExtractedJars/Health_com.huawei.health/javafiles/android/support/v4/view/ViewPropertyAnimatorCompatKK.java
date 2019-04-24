// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v4.view:
//			ViewPropertyAnimatorUpdateListener

class ViewPropertyAnimatorCompatKK
{

	ViewPropertyAnimatorCompatKK()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public static void setUpdateListener(View view, ViewPropertyAnimatorUpdateListener viewpropertyanimatorupdatelistener)
	{
		android.animation.ValueAnimator.AnimatorUpdateListener animatorupdatelistener = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(viewpropertyanimatorupdatelistener != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          16
			animatorupdatelistener = new android.animation.ValueAnimator.AnimatorUpdateListener(viewpropertyanimatorupdatelistener, view) {

				public void onAnimationUpdate(ValueAnimator valueanimator)
				{
					listener.onAnimationUpdate(view);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field ViewPropertyAnimatorUpdateListener val$listener>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field View val$view>
				//    4    8:invokeinterface #32  <Method void ViewPropertyAnimatorUpdateListener.onAnimationUpdate(View)>
				//    5   13:return          
				}

				final ViewPropertyAnimatorUpdateListener val$listener;
				final View val$view;

			
			{
				listener = viewpropertyanimatorupdatelistener;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ViewPropertyAnimatorUpdateListener val$listener>
				view = view1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field View val$view>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
;
	//    4    6:new             #6   <Class ViewPropertyAnimatorCompatKK$1>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:invokespecial   #19  <Method void ViewPropertyAnimatorCompatKK$1(ViewPropertyAnimatorUpdateListener, View)>
	//    9   15:astore_2        
		view.animate().setUpdateListener(animatorupdatelistener);
	//   10   16:aload_0         
	//   11   17:invokevirtual   #25  <Method ViewPropertyAnimator View.animate()>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #30  <Method ViewPropertyAnimator ViewPropertyAnimator.setUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
	//   14   24:pop             
	//   15   25:return          
	}
}
