// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.animation.*;

// Referenced classes of package android.support.v7.widget:
//			FastScroller

class FastScroller$AnimatorListener extends AnimatorListenerAdapter
{

	public void onAnimationCancel(Animator animator)
	{
		mCanceled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #20  <Field boolean mCanceled>
	//    3    5:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		if(mCanceled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field boolean mCanceled>
	//*   2    4:ifeq            13
		{
			mCanceled = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #20  <Field boolean mCanceled>
			return;
	//    6   12:return          
		}
		if(((Float)FastScroller.access$200(FastScroller.this).getAnimatedValue()).floatValue() == 0.0F)
	//*   7   13:aload_0         
	//*   8   14:getfield        #15  <Field FastScroller this$0>
	//*   9   17:invokestatic    #31  <Method ValueAnimator FastScroller.access$200(FastScroller)>
	//*  10   20:invokevirtual   #37  <Method Object ValueAnimator.getAnimatedValue()>
	//*  11   23:checkcast       #39  <Class Float>
	//*  12   26:invokevirtual   #43  <Method float Float.floatValue()>
	//*  13   29:fconst_0        
	//*  14   30:fcmpl           
	//*  15   31:ifne            52
		{
			FastScroller.access$302(FastScroller.this, 0);
	//   16   34:aload_0         
	//   17   35:getfield        #15  <Field FastScroller this$0>
	//   18   38:iconst_0        
	//   19   39:invokestatic    #47  <Method int FastScroller.access$302(FastScroller, int)>
	//   20   42:pop             
			FastScroller.access$400(FastScroller.this, 0);
	//   21   43:aload_0         
	//   22   44:getfield        #15  <Field FastScroller this$0>
	//   23   47:iconst_0        
	//   24   48:invokestatic    #51  <Method void FastScroller.access$400(FastScroller, int)>
			return;
	//   25   51:return          
		} else
		{
			FastScroller.access$302(FastScroller.this, 2);
	//   26   52:aload_0         
	//   27   53:getfield        #15  <Field FastScroller this$0>
	//   28   56:iconst_2        
	//   29   57:invokestatic    #47  <Method int FastScroller.access$302(FastScroller, int)>
	//   30   60:pop             
			FastScroller.access$500(FastScroller.this);
	//   31   61:aload_0         
	//   32   62:getfield        #15  <Field FastScroller this$0>
	//   33   65:invokestatic    #54  <Method void FastScroller.access$500(FastScroller)>
			return;
	//   34   68:return          
		}
	}

	private boolean mCanceled;
	final FastScroller this$0;

	private FastScroller$AnimatorListener()
	{
		this$0 = FastScroller.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field FastScroller this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
		mCanceled = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #20  <Field boolean mCanceled>
	//    8   14:return          
	}

	FastScroller$AnimatorListener(FastScroller._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void FastScroller$AnimatorListener(FastScroller)>
	//    3    5:return          
	}
}
