// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.*;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

// Referenced classes of package android.support.transition:
//			Visibility, ViewUtils, TransitionValues, TransitionListenerAdapter, 
//			Transition

public class Fade extends Visibility
{
	private static class FadeAnimatorListener extends AnimatorListenerAdapter
	{

		public void onAnimationEnd(Animator animator)
		{
			ViewUtils.setTransitionAlpha(mView, 1.0F);
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field View mView>
		//    2    4:fconst_1        
		//    3    5:invokestatic    #29  <Method void ViewUtils.setTransitionAlpha(View, float)>
			if(mLayerTypeChanged)
		//*   4    8:aload_0         
		//*   5    9:getfield        #18  <Field boolean mLayerTypeChanged>
		//*   6   12:ifeq            24
				mView.setLayerType(0, ((android.graphics.Paint) (null)));
		//    7   15:aload_0         
		//    8   16:getfield        #20  <Field View mView>
		//    9   19:iconst_0        
		//   10   20:aconst_null     
		//   11   21:invokevirtual   #35  <Method void View.setLayerType(int, android.graphics.Paint)>
		//   12   24:return          
		}

		public void onAnimationStart(Animator animator)
		{
			if(ViewCompat.hasOverlappingRendering(mView) && mView.getLayerType() == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field View mView>
		//*   2    4:invokestatic    #42  <Method boolean ViewCompat.hasOverlappingRendering(View)>
		//*   3    7:ifeq            34
		//*   4   10:aload_0         
		//*   5   11:getfield        #20  <Field View mView>
		//*   6   14:invokevirtual   #46  <Method int View.getLayerType()>
		//*   7   17:ifne            34
			{
				mLayerTypeChanged = true;
		//    8   20:aload_0         
		//    9   21:iconst_1        
		//   10   22:putfield        #18  <Field boolean mLayerTypeChanged>
				mView.setLayerType(2, ((android.graphics.Paint) (null)));
		//   11   25:aload_0         
		//   12   26:getfield        #20  <Field View mView>
		//   13   29:iconst_2        
		//   14   30:aconst_null     
		//   15   31:invokevirtual   #35  <Method void View.setLayerType(int, android.graphics.Paint)>
			}
		//   16   34:return          
		}

		private boolean mLayerTypeChanged;
		private final View mView;

		FadeAnimatorListener(View view)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void AnimatorListenerAdapter()>
			mLayerTypeChanged = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #18  <Field boolean mLayerTypeChanged>
			mView = view;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #20  <Field View mView>
		//    8   14:return          
		}
	}


	public Fade()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Visibility()>
	//    2    4:return          
	}

	public Fade(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Visibility()>
		setMode(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #18  <Method void setMode(int)>
	//    5    9:return          
	}

	private Animator createAnimation(final View view, float f, float f1)
	{
		if(f == f1)
	//*   0    0:fload_2         
	//*   1    1:fload_3         
	//*   2    2:fcmpl           
	//*   3    3:ifne            8
		{
			return null;
	//    4    6:aconst_null     
	//    5    7:areturn         
		} else
		{
			ViewUtils.setTransitionAlpha(view, f);
	//    6    8:aload_1         
	//    7    9:fload_2         
	//    8   10:invokestatic    #26  <Method void ViewUtils.setTransitionAlpha(View, float)>
			ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((Object) (view)), ViewUtils.TRANSITION_ALPHA, new float[] {
				f1
			});
	//    9   13:aload_1         
	//   10   14:getstatic       #30  <Field android.util.Property ViewUtils.TRANSITION_ALPHA>
	//   11   17:iconst_1        
	//   12   18:newarray        float[]
	//   13   20:dup             
	//   14   21:iconst_0        
	//   15   22:fload_3         
	//   16   23:fastore         
	//   17   24:invokestatic    #36  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//   18   27:astore          4
			objectanimator.addListener(((android.animation.Animator.AnimatorListener) (new FadeAnimatorListener(view))));
	//   19   29:aload           4
	//   20   31:new             #8   <Class Fade$FadeAnimatorListener>
	//   21   34:dup             
	//   22   35:aload_1         
	//   23   36:invokespecial   #39  <Method void Fade$FadeAnimatorListener(View)>
	//   24   39:invokevirtual   #43  <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
			addListener(((Transition.TransitionListener) (new TransitionListenerAdapter() {

				public void onTransitionEnd(Transition transition)
				{
					ViewUtils.setTransitionAlpha(view, 1.0F);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field View val$view>
				//    2    4:fconst_1        
				//    3    5:invokestatic    #32  <Method void ViewUtils.setTransitionAlpha(View, float)>
					ViewUtils.clearNonTransitionAlpha(view);
				//    4    8:aload_0         
				//    5    9:getfield        #19  <Field View val$view>
				//    6   12:invokestatic    #36  <Method void ViewUtils.clearNonTransitionAlpha(View)>
					transition.removeListener(((Transition.TransitionListener) (this)));
				//    7   15:aload_1         
				//    8   16:aload_0         
				//    9   17:invokevirtual   #42  <Method Transition Transition.removeListener(Transition$TransitionListener)>
				//   10   20:pop             
				//   11   21:return          
				}

				final Fade this$0;
				final View val$view;

			
			{
				this$0 = Fade.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Fade this$0>
				view = view1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field View val$view>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void TransitionListenerAdapter()>
			//    8   14:return          
			}
			}
)));
	//   25   42:aload_0         
	//   26   43:new             #6   <Class Fade$1>
	//   27   46:dup             
	//   28   47:aload_0         
	//   29   48:aload_1         
	//   30   49:invokespecial   #46  <Method void Fade$1(Fade, View)>
	//   31   52:invokevirtual   #49  <Method Transition addListener(Transition$TransitionListener)>
	//   32   55:pop             
			return ((Animator) (objectanimator));
	//   33   56:aload           4
	//   34   58:areturn         
		}
	}

	private static float getStartAlpha(TransitionValues transitionvalues, float f)
	{
		float f1 = f;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(transitionvalues != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          32
		{
			transitionvalues = ((TransitionValues) ((Float)transitionvalues.values.get("android:fade:transitionAlpha")));
	//    4    6:aload_0         
	//    5    7:getfield        #57  <Field Map TransitionValues.values>
	//    6   10:ldc1            #59  <String "android:fade:transitionAlpha">
	//    7   12:invokeinterface #65  <Method Object Map.get(Object)>
	//    8   17:checkcast       #67  <Class Float>
	//    9   20:astore_0        
			f1 = f;
	//   10   21:fload_1         
	//   11   22:fstore_2        
			if(transitionvalues != null)
	//*  12   23:aload_0         
	//*  13   24:ifnull          32
				f1 = ((Float) (transitionvalues)).floatValue();
	//   14   27:aload_0         
	//   15   28:invokevirtual   #71  <Method float Float.floatValue()>
	//   16   31:fstore_2        
		}
		return f1;
	//   17   32:fload_2         
	//   18   33:freturn         
	}

	public void captureStartValues(TransitionValues transitionvalues)
	{
		super.captureStartValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #76  <Method void Visibility.captureStartValues(TransitionValues)>
		transitionvalues.values.put("android:fade:transitionAlpha", ((Object) (Float.valueOf(ViewUtils.getTransitionAlpha(transitionvalues.view)))));
	//    3    5:aload_1         
	//    4    6:getfield        #57  <Field Map TransitionValues.values>
	//    5    9:ldc1            #59  <String "android:fade:transitionAlpha">
	//    6   11:aload_1         
	//    7   12:getfield        #80  <Field View TransitionValues.view>
	//    8   15:invokestatic    #84  <Method float ViewUtils.getTransitionAlpha(View)>
	//    9   18:invokestatic    #88  <Method Float Float.valueOf(float)>
	//   10   21:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//   11   26:pop             
	//   12   27:return          
	}

	public Animator onAppear(ViewGroup viewgroup, View view, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore          5
		float f1 = getStartAlpha(transitionvalues, 0.0F);
	//    2    3:aload_3         
	//    3    4:fconst_0        
	//    4    5:invokestatic    #97  <Method float getStartAlpha(TransitionValues, float)>
	//    5    8:fstore          6
		if(f1 != 1.0F)
	//*   6   10:fload           6
	//*   7   12:fconst_1        
	//*   8   13:fcmpl           
	//*   9   14:ifne            20
	//*  10   17:goto            24
			f = f1;
	//   11   20:fload           6
	//   12   22:fstore          5
		return createAnimation(view, f, 1.0F);
	//   13   24:aload_0         
	//   14   25:aload_2         
	//   15   26:fload           5
	//   16   28:fconst_1        
	//   17   29:invokespecial   #99  <Method Animator createAnimation(View, float, float)>
	//   18   32:areturn         
	}

	public Animator onDisappear(ViewGroup viewgroup, View view, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		ViewUtils.saveNonTransitionAlpha(view);
	//    0    0:aload_2         
	//    1    1:invokestatic    #103 <Method void ViewUtils.saveNonTransitionAlpha(View)>
		return createAnimation(view, getStartAlpha(transitionvalues, 1.0F), 0.0F);
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:fconst_1        
	//    6    8:invokestatic    #97  <Method float getStartAlpha(TransitionValues, float)>
	//    7   11:fconst_0        
	//    8   12:invokespecial   #99  <Method Animator createAnimation(View, float, float)>
	//    9   15:areturn         
	}
}
