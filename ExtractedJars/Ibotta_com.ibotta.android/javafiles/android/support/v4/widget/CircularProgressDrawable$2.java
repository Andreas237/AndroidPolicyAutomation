// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.animation.Animator;

// Referenced classes of package android.support.v4.widget:
//			CircularProgressDrawable

class CircularProgressDrawable$2
	implements android.animation.Animator.AnimatorListener
{

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
		applyTransformation(1.0F, val$ring, true);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CircularProgressDrawable this$0>
	//    2    4:fconst_1        
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field CircularProgressDrawable$Ring val$ring>
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #32  <Method void CircularProgressDrawable.applyTransformation(float, CircularProgressDrawable$Ring, boolean)>
		val$ring.storeOriginals();
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field CircularProgressDrawable$Ring val$ring>
	//    9   17:invokevirtual   #37  <Method void CircularProgressDrawable$Ring.storeOriginals()>
		val$ring.goToNextColor();
	//   10   20:aload_0         
	//   11   21:getfield        #21  <Field CircularProgressDrawable$Ring val$ring>
	//   12   24:invokevirtual   #40  <Method void CircularProgressDrawable$Ring.goToNextColor()>
		if(mFinishing)
	//*  13   27:aload_0         
	//*  14   28:getfield        #19  <Field CircularProgressDrawable this$0>
	//*  15   31:getfield        #44  <Field boolean CircularProgressDrawable.mFinishing>
	//*  16   34:ifeq            70
		{
			mFinishing = false;
	//   17   37:aload_0         
	//   18   38:getfield        #19  <Field CircularProgressDrawable this$0>
	//   19   41:iconst_0        
	//   20   42:putfield        #44  <Field boolean CircularProgressDrawable.mFinishing>
			animator.cancel();
	//   21   45:aload_1         
	//   22   46:invokevirtual   #49  <Method void Animator.cancel()>
			animator.setDuration(1332L);
	//   23   49:aload_1         
	//   24   50:ldc2w           #50  <Long 1332L>
	//   25   53:invokevirtual   #55  <Method Animator Animator.setDuration(long)>
	//   26   56:pop             
			animator.start();
	//   27   57:aload_1         
	//   28   58:invokevirtual   #58  <Method void Animator.start()>
			val$ring.setShowArrow(false);
	//   29   61:aload_0         
	//   30   62:getfield        #21  <Field CircularProgressDrawable$Ring val$ring>
	//   31   65:iconst_0        
	//   32   66:invokevirtual   #62  <Method void CircularProgressDrawable$Ring.setShowArrow(boolean)>
			return;
	//   33   69:return          
		} else
		{
			animator = ((Animator) (CircularProgressDrawable.this));
	//   34   70:aload_0         
	//   35   71:getfield        #19  <Field CircularProgressDrawable this$0>
	//   36   74:astore_1        
			animator.mRotationCount = ((CircularProgressDrawable) (animator)).mRotationCount + 1.0F;
	//   37   75:aload_1         
	//   38   76:aload_1         
	//   39   77:getfield        #66  <Field float CircularProgressDrawable.mRotationCount>
	//   40   80:fconst_1        
	//   41   81:fadd            
	//   42   82:putfield        #66  <Field float CircularProgressDrawable.mRotationCount>
			return;
	//   43   85:return          
		}
	}

	public void onAnimationStart(Animator animator)
	{
		mRotationCount = 0.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CircularProgressDrawable this$0>
	//    2    4:fconst_0        
	//    3    5:putfield        #66  <Field float CircularProgressDrawable.mRotationCount>
	//    4    8:return          
	}

	final CircularProgressDrawable this$0;
	final ng val$ring;

	CircularProgressDrawable$2()
	{
		this$0 = final_circularprogressdrawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CircularProgressDrawable this$0>
		val$ring = ng.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field CircularProgressDrawable$Ring val$ring>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
