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
		CircularProgressDrawable.access$100(CircularProgressDrawable.this, 1.0F, val$ring, true);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CircularProgressDrawable this$0>
	//    2    4:fconst_1        
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field CircularProgressDrawable$Ring val$ring>
	//    5    9:iconst_1        
	//    6   10:invokestatic    #32  <Method void CircularProgressDrawable.access$100(CircularProgressDrawable, float, CircularProgressDrawable$Ring, boolean)>
		val$ring.storeOriginals();
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field CircularProgressDrawable$Ring val$ring>
	//    9   17:invokevirtual   #37  <Method void CircularProgressDrawable$Ring.storeOriginals()>
		val$ring.goToNextColor();
	//   10   20:aload_0         
	//   11   21:getfield        #21  <Field CircularProgressDrawable$Ring val$ring>
	//   12   24:invokevirtual   #40  <Method void CircularProgressDrawable$Ring.goToNextColor()>
		if(CircularProgressDrawable.access$300(CircularProgressDrawable.this))
	//*  13   27:aload_0         
	//*  14   28:getfield        #19  <Field CircularProgressDrawable this$0>
	//*  15   31:invokestatic    #44  <Method boolean CircularProgressDrawable.access$300(CircularProgressDrawable)>
	//*  16   34:ifeq            71
		{
			CircularProgressDrawable.access$302(CircularProgressDrawable.this, false);
	//   17   37:aload_0         
	//   18   38:getfield        #19  <Field CircularProgressDrawable this$0>
	//   19   41:iconst_0        
	//   20   42:invokestatic    #48  <Method boolean CircularProgressDrawable.access$302(CircularProgressDrawable, boolean)>
	//   21   45:pop             
			animator.cancel();
	//   22   46:aload_1         
	//   23   47:invokevirtual   #53  <Method void Animator.cancel()>
			animator.setDuration(1332L);
	//   24   50:aload_1         
	//   25   51:ldc2w           #54  <Long 1332L>
	//   26   54:invokevirtual   #59  <Method Animator Animator.setDuration(long)>
	//   27   57:pop             
			animator.start();
	//   28   58:aload_1         
	//   29   59:invokevirtual   #62  <Method void Animator.start()>
			val$ring.setShowArrow(false);
	//   30   62:aload_0         
	//   31   63:getfield        #21  <Field CircularProgressDrawable$Ring val$ring>
	//   32   66:iconst_0        
	//   33   67:invokevirtual   #66  <Method void CircularProgressDrawable$Ring.setShowArrow(boolean)>
			return;
	//   34   70:return          
		} else
		{
			CircularProgressDrawable.access$202(CircularProgressDrawable.this, CircularProgressDrawable.access$200(CircularProgressDrawable.this) + 1.0F);
	//   35   71:aload_0         
	//   36   72:getfield        #19  <Field CircularProgressDrawable this$0>
	//   37   75:aload_0         
	//   38   76:getfield        #19  <Field CircularProgressDrawable this$0>
	//   39   79:invokestatic    #70  <Method float CircularProgressDrawable.access$200(CircularProgressDrawable)>
	//   40   82:fconst_1        
	//   41   83:fadd            
	//   42   84:invokestatic    #74  <Method float CircularProgressDrawable.access$202(CircularProgressDrawable, float)>
	//   43   87:pop             
			return;
	//   44   88:return          
		}
	}

	public void onAnimationStart(Animator animator)
	{
		CircularProgressDrawable.access$202(CircularProgressDrawable.this, 0.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CircularProgressDrawable this$0>
	//    2    4:fconst_0        
	//    3    5:invokestatic    #74  <Method float CircularProgressDrawable.access$202(CircularProgressDrawable, float)>
	//    4    8:pop             
	//    5    9:return          
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
