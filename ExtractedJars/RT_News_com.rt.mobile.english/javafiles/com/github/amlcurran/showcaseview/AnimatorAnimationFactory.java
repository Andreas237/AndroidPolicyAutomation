// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview;

import android.animation.*;
import android.graphics.Point;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

// Referenced classes of package com.github.amlcurran.showcaseview:
//			AnimationFactory, ShowcaseView

class AnimatorAnimationFactory
	implements AnimationFactory
{

	public AnimatorAnimationFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class AccelerateDecelerateInterpolator>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void AccelerateDecelerateInterpolator()>
	//    6   12:putfield        #30  <Field AccelerateDecelerateInterpolator interpolator>
	//    7   15:return          
	}

	public void animateTargetToPoint(ShowcaseView showcaseview, Point point)
	{
		AnimatorSet animatorset = new AnimatorSet();
	//    0    0:new             #35  <Class AnimatorSet>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void AnimatorSet()>
	//    3    7:astore_3        
		animatorset.playTogether(new Animator[] {
			ObjectAnimator.ofInt(((Object) (showcaseview)), "showcaseX", new int[] {
				point.x
			}), ObjectAnimator.ofInt(((Object) (showcaseview)), "showcaseY", new int[] {
				point.y
			})
		});
	//    4    8:aload_3         
	//    5    9:iconst_2        
	//    6   10:anewarray       Animator[]
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:aload_1         
	//   10   16:ldc1            #40  <String "showcaseX">
	//   11   18:iconst_1        
	//   12   19:newarray        int[]
	//   13   21:dup             
	//   14   22:iconst_0        
	//   15   23:aload_2         
	//   16   24:getfield        #46  <Field int Point.x>
	//   17   27:iastore         
	//   18   28:invokestatic    #52  <Method ObjectAnimator ObjectAnimator.ofInt(Object, String, int[])>
	//   19   31:aastore         
	//   20   32:dup             
	//   21   33:iconst_1        
	//   22   34:aload_1         
	//   23   35:ldc1            #54  <String "showcaseY">
	//   24   37:iconst_1        
	//   25   38:newarray        int[]
	//   26   40:dup             
	//   27   41:iconst_0        
	//   28   42:aload_2         
	//   29   43:getfield        #57  <Field int Point.y>
	//   30   46:iastore         
	//   31   47:invokestatic    #52  <Method ObjectAnimator ObjectAnimator.ofInt(Object, String, int[])>
	//   32   50:aastore         
	//   33   51:invokevirtual   #61  <Method void AnimatorSet.playTogether(Animator[])>
		animatorset.setInterpolator(((android.animation.TimeInterpolator) (interpolator)));
	//   34   54:aload_3         
	//   35   55:aload_0         
	//   36   56:getfield        #30  <Field AccelerateDecelerateInterpolator interpolator>
	//   37   59:invokevirtual   #65  <Method void AnimatorSet.setInterpolator(android.animation.TimeInterpolator)>
		animatorset.start();
	//   38   62:aload_3         
	//   39   63:invokevirtual   #68  <Method void AnimatorSet.start()>
	//   40   66:return          
	}

	public void fadeInView(View view, long l, final AnimationFactory.AnimationStartListener listener)
	{
		view = ((View) (ObjectAnimator.ofFloat(((Object) (view)), "alpha", new float[] {
			0.0F, 1.0F
		})));
	//    0    0:aload_1         
	//    1    1:ldc1            #14  <String "alpha">
	//    2    3:iconst_2        
	//    3    4:newarray        float[]
	//    4    6:dup             
	//    5    7:iconst_0        
	//    6    8:fconst_0        
	//    7    9:fastore         
	//    8   10:dup             
	//    9   11:iconst_1        
	//   10   12:fconst_1        
	//   11   13:fastore         
	//   12   14:invokestatic    #74  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   13   17:astore_1        
		((ObjectAnimator) (view)).setDuration(l).addListener(new android.animation.Animator.AnimatorListener() {

			public void onAnimationCancel(Animator animator)
			{
			//    0    0:return          
			}

			public void onAnimationEnd(Animator animator)
			{
			//    0    0:return          
			}

			public void onAnimationRepeat(Animator animator)
			{
			//    0    0:return          
			}

			public void onAnimationStart(Animator animator)
			{
				listener.onAnimationStart();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field AnimationFactory$AnimationStartListener val$listener>
			//    2    4:invokeinterface #34  <Method void AnimationFactory$AnimationStartListener.onAnimationStart()>
			//    3    9:return          
			}

			final AnimatorAnimationFactory this$0;
			final AnimationFactory.AnimationStartListener val$listener;

			
			{
				this$0 = AnimatorAnimationFactory.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AnimatorAnimationFactory this$0>
				listener = animationstartlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AnimationFactory$AnimationStartListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   14   18:aload_1         
	//   15   19:lload_2         
	//   16   20:invokevirtual   #78  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   17   23:new             #8   <Class AnimatorAnimationFactory$1>
	//   18   26:dup             
	//   19   27:aload_0         
	//   20   28:aload           4
	//   21   30:invokespecial   #81  <Method void AnimatorAnimationFactory$1(AnimatorAnimationFactory, AnimationFactory$AnimationStartListener)>
	//   22   33:invokevirtual   #85  <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
		((ObjectAnimator) (view)).start();
	//   23   36:aload_1         
	//   24   37:invokevirtual   #86  <Method void ObjectAnimator.start()>
	//   25   40:return          
	}

	public void fadeOutView(View view, long l, final AnimationFactory.AnimationEndListener listener)
	{
		view = ((View) (ObjectAnimator.ofFloat(((Object) (view)), "alpha", new float[] {
			0.0F
		})));
	//    0    0:aload_1         
	//    1    1:ldc1            #14  <String "alpha">
	//    2    3:iconst_1        
	//    3    4:newarray        float[]
	//    4    6:dup             
	//    5    7:iconst_0        
	//    6    8:fconst_0        
	//    7    9:fastore         
	//    8   10:invokestatic    #74  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//    9   13:astore_1        
		((ObjectAnimator) (view)).setDuration(l).addListener(new android.animation.Animator.AnimatorListener() {

			public void onAnimationCancel(Animator animator)
			{
			//    0    0:return          
			}

			public void onAnimationEnd(Animator animator)
			{
				listener.onAnimationEnd();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field AnimationFactory$AnimationEndListener val$listener>
			//    2    4:invokeinterface #32  <Method void AnimationFactory$AnimationEndListener.onAnimationEnd()>
			//    3    9:return          
			}

			public void onAnimationRepeat(Animator animator)
			{
			//    0    0:return          
			}

			public void onAnimationStart(Animator animator)
			{
			//    0    0:return          
			}

			final AnimatorAnimationFactory this$0;
			final AnimationFactory.AnimationEndListener val$listener;

			
			{
				this$0 = AnimatorAnimationFactory.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AnimatorAnimationFactory this$0>
				listener = animationendlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AnimationFactory$AnimationEndListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   10   14:aload_1         
	//   11   15:lload_2         
	//   12   16:invokevirtual   #78  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   13   19:new             #10  <Class AnimatorAnimationFactory$2>
	//   14   22:dup             
	//   15   23:aload_0         
	//   16   24:aload           4
	//   17   26:invokespecial   #91  <Method void AnimatorAnimationFactory$2(AnimatorAnimationFactory, AnimationFactory$AnimationEndListener)>
	//   18   29:invokevirtual   #85  <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
		((ObjectAnimator) (view)).start();
	//   19   32:aload_1         
	//   20   33:invokevirtual   #86  <Method void ObjectAnimator.start()>
	//   21   36:return          
	}

	private static final String ALPHA = "alpha";
	private static final float INVISIBLE = 0F;
	private static final float VISIBLE = 1F;
	private final AccelerateDecelerateInterpolator interpolator = new AccelerateDecelerateInterpolator();
}
