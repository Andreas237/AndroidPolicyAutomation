// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

// Referenced classes of package android.support.graphics.drawable:
//			AnimatedVectorDrawableCompat

class AnimatedVectorDrawableCompat$2 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		animator = ((Animator) (new ArrayList(((java.util.Collection) (mAnimationCallbacks)))));
	//    0    0:new             #23  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field AnimatedVectorDrawableCompat this$0>
	//    4    8:getfield        #27  <Field ArrayList AnimatedVectorDrawableCompat.mAnimationCallbacks>
	//    5   11:invokespecial   #30  <Method void ArrayList(java.util.Collection)>
	//    6   14:astore_1        
		int j = ((ArrayList) (animator)).size();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #34  <Method int ArrayList.size()>
	//    9   19:istore_3        
		for(int i = 0; i < j; i++)
	//*  10   20:iconst_0        
	//*  11   21:istore_2        
	//*  12   22:iload_2         
	//*  13   23:iload_3         
	//*  14   24:icmpge          49
			((back)((ArrayList) (animator)).get(i)).onAnimationEnd(((android.graphics.drawable.Drawable) (AnimatedVectorDrawableCompat.this)));
	//   15   27:aload_1         
	//   16   28:iload_2         
	//   17   29:invokevirtual   #38  <Method Object ArrayList.get(int)>
	//   18   32:checkcast       #40  <Class Animatable2Compat$AnimationCallback>
	//   19   35:aload_0         
	//   20   36:getfield        #15  <Field AnimatedVectorDrawableCompat this$0>
	//   21   39:invokevirtual   #43  <Method void Animatable2Compat$AnimationCallback.onAnimationEnd(android.graphics.drawable.Drawable)>

	//   22   42:iload_2         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_2        
	//*  26   46:goto            22
	//   27   49:return          
	}

	public void onAnimationStart(Animator animator)
	{
		animator = ((Animator) (new ArrayList(((java.util.Collection) (mAnimationCallbacks)))));
	//    0    0:new             #23  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field AnimatedVectorDrawableCompat this$0>
	//    4    8:getfield        #27  <Field ArrayList AnimatedVectorDrawableCompat.mAnimationCallbacks>
	//    5   11:invokespecial   #30  <Method void ArrayList(java.util.Collection)>
	//    6   14:astore_1        
		int j = ((ArrayList) (animator)).size();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #34  <Method int ArrayList.size()>
	//    9   19:istore_3        
		for(int i = 0; i < j; i++)
	//*  10   20:iconst_0        
	//*  11   21:istore_2        
	//*  12   22:iload_2         
	//*  13   23:iload_3         
	//*  14   24:icmpge          49
			((back)((ArrayList) (animator)).get(i)).onAnimationStart(((android.graphics.drawable.Drawable) (AnimatedVectorDrawableCompat.this)));
	//   15   27:aload_1         
	//   16   28:iload_2         
	//   17   29:invokevirtual   #38  <Method Object ArrayList.get(int)>
	//   18   32:checkcast       #40  <Class Animatable2Compat$AnimationCallback>
	//   19   35:aload_0         
	//   20   36:getfield        #15  <Field AnimatedVectorDrawableCompat this$0>
	//   21   39:invokevirtual   #46  <Method void Animatable2Compat$AnimationCallback.onAnimationStart(android.graphics.drawable.Drawable)>

	//   22   42:iload_2         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_2        
	//*  26   46:goto            22
	//   27   49:return          
	}

	final AnimatedVectorDrawableCompat this$0;

	AnimatedVectorDrawableCompat$2()
	{
		this$0 = AnimatedVectorDrawableCompat.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AnimatedVectorDrawableCompat this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
	//    5    9:return          
	}
}
