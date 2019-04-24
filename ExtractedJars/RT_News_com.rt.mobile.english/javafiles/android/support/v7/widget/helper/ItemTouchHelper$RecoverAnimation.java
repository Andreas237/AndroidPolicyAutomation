// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package android.support.v7.widget.helper:
//			ItemTouchHelper

private static class ItemTouchHelper$RecoverAnimation
	implements android.animation.Animator.AnimatorListener
{

	public void cancel()
	{
		mValueAnimator.cancel();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ValueAnimator mValueAnimator>
	//    2    4:invokevirtual   #90  <Method void ValueAnimator.cancel()>
	//    3    7:return          
	}

	public void onAnimationCancel(Animator animator)
	{
		setFraction(1.0F);
	//    0    0:aload_0         
	//    1    1:fconst_1        
	//    2    2:invokevirtual   #86  <Method void setFraction(float)>
	//    3    5:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		if(!mEnded)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field boolean mEnded>
	//*   2    4:ifne            15
			mViewHolder.setIsRecyclable(true);
	//    3    7:aload_0         
	//    4    8:getfield        #45  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
	//    5   11:iconst_1        
	//    6   12:invokevirtual   #97  <Method void android.support.v7.widget.RecyclerView$ViewHolder.setIsRecyclable(boolean)>
		mEnded = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #39  <Field boolean mEnded>
	//   10   20:return          
	}

	public void onAnimationRepeat(Animator animator)
	{
	//    0    0:return          
	}

	public void onAnimationStart(Animator animator)
	{
	//    0    0:return          
	}

	public void setDuration(long l)
	{
		mValueAnimator.setDuration(l);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ValueAnimator mValueAnimator>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #104 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setFraction(float f)
	{
		mFraction = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #106 <Field float mFraction>
	//    3    5:return          
	}

	public void start()
	{
		mViewHolder.setIsRecyclable(false);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #97  <Method void android.support.v7.widget.RecyclerView$ViewHolder.setIsRecyclable(boolean)>
		mValueAnimator.start();
	//    4    8:aload_0         
	//    5    9:getfield        #61  <Field ValueAnimator mValueAnimator>
	//    6   12:invokevirtual   #109 <Method void ValueAnimator.start()>
	//    7   15:return          
	}

	public void update()
	{
		if(mStartDx == mTargetX)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field float mStartDx>
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field float mTargetX>
	//*   4    8:fcmpl           
	//*   5    9:ifne            29
			mX = mViewHolder.itemView.getTranslationX();
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #45  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
	//    9   17:getfield        #74  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   10   20:invokevirtual   #116 <Method float View.getTranslationX()>
	//   11   23:putfield        #118 <Field float mX>
		else
	//*  12   26:goto            52
			mX = mStartDx + mFraction * (mTargetX - mStartDx);
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:getfield        #47  <Field float mStartDx>
	//   16   34:aload_0         
	//   17   35:getfield        #106 <Field float mFraction>
	//   18   38:aload_0         
	//   19   39:getfield        #51  <Field float mTargetX>
	//   20   42:aload_0         
	//   21   43:getfield        #47  <Field float mStartDx>
	//   22   46:fsub            
	//   23   47:fmul            
	//   24   48:fadd            
	//   25   49:putfield        #118 <Field float mX>
		if(mStartDy == mTargetY)
	//*  26   52:aload_0         
	//*  27   53:getfield        #49  <Field float mStartDy>
	//*  28   56:aload_0         
	//*  29   57:getfield        #53  <Field float mTargetY>
	//*  30   60:fcmpl           
	//*  31   61:ifne            79
		{
			mY = mViewHolder.itemView.getTranslationY();
	//   32   64:aload_0         
	//   33   65:aload_0         
	//   34   66:getfield        #45  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
	//   35   69:getfield        #74  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   36   72:invokevirtual   #121 <Method float View.getTranslationY()>
	//   37   75:putfield        #123 <Field float mY>
			return;
	//   38   78:return          
		} else
		{
			mY = mStartDy + mFraction * (mTargetY - mStartDy);
	//   39   79:aload_0         
	//   40   80:aload_0         
	//   41   81:getfield        #49  <Field float mStartDy>
	//   42   84:aload_0         
	//   43   85:getfield        #106 <Field float mFraction>
	//   44   88:aload_0         
	//   45   89:getfield        #53  <Field float mTargetY>
	//   46   92:aload_0         
	//   47   93:getfield        #49  <Field float mStartDy>
	//   48   96:fsub            
	//   49   97:fmul            
	//   50   98:fadd            
	//   51   99:putfield        #123 <Field float mY>
			return;
	//   52  102:return          
		}
	}

	final int mActionState;
	final int mAnimationType;
	boolean mEnded;
	private float mFraction;
	public boolean mIsPendingCleanup;
	boolean mOverridden;
	final float mStartDx;
	final float mStartDy;
	final float mTargetX;
	final float mTargetY;
	private final ValueAnimator mValueAnimator = ValueAnimator.ofFloat(new float[] {
		0.0F, 1.0F
	});
	final android.support.v7.widget.RecyclerView.ViewHolder mViewHolder;
	float mX;
	float mY;

	ItemTouchHelper$RecoverAnimation(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i, int j, float f, float f1, float f2, float f3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		mOverridden = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #37  <Field boolean mOverridden>
		mEnded = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #39  <Field boolean mEnded>
		mActionState = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #41  <Field int mActionState>
		mAnimationType = i;
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:putfield        #43  <Field int mAnimationType>
		mViewHolder = viewholder;
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:putfield        #45  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
		mStartDx = f;
	//   17   29:aload_0         
	//   18   30:fload           4
	//   19   32:putfield        #47  <Field float mStartDx>
		mStartDy = f1;
	//   20   35:aload_0         
	//   21   36:fload           5
	//   22   38:putfield        #49  <Field float mStartDy>
		mTargetX = f2;
	//   23   41:aload_0         
	//   24   42:fload           6
	//   25   44:putfield        #51  <Field float mTargetX>
		mTargetY = f3;
	//   26   47:aload_0         
	//   27   48:fload           7
	//   28   50:putfield        #53  <Field float mTargetY>
	//   29   53:aload_0         
	//   30   54:iconst_2        
	//   31   55:newarray        float[]
	//   32   57:dup             
	//   33   58:iconst_0        
	//   34   59:fconst_0        
	//   35   60:fastore         
	//   36   61:dup             
	//   37   62:iconst_1        
	//   38   63:fconst_1        
	//   39   64:fastore         
	//   40   65:invokestatic    #59  <Method ValueAnimator ValueAnimator.ofFloat(float[])>
	//   41   68:putfield        #61  <Field ValueAnimator mValueAnimator>
		mValueAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

			public void onAnimationUpdate(ValueAnimator valueanimator)
			{
				setFraction(valueanimator.getAnimatedFraction());
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field ItemTouchHelper$RecoverAnimation this$0>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #31  <Method float ValueAnimator.getAnimatedFraction()>
			//    4    8:invokevirtual   #35  <Method void ItemTouchHelper$RecoverAnimation.setFraction(float)>
			//    5   11:return          
			}

			final ItemTouchHelper.RecoverAnimation this$0;

			
			{
				this$0 = ItemTouchHelper.RecoverAnimation.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ItemTouchHelper$RecoverAnimation this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   42   71:aload_0         
	//   43   72:getfield        #61  <Field ValueAnimator mValueAnimator>
	//   44   75:new             #11  <Class ItemTouchHelper$RecoverAnimation$1>
	//   45   78:dup             
	//   46   79:aload_0         
	//   47   80:invokespecial   #64  <Method void ItemTouchHelper$RecoverAnimation$1(ItemTouchHelper$RecoverAnimation)>
	//   48   83:invokevirtual   #68  <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		mValueAnimator.setTarget(((Object) (viewholder.itemView)));
	//   49   86:aload_0         
	//   50   87:getfield        #61  <Field ValueAnimator mValueAnimator>
	//   51   90:aload_1         
	//   52   91:getfield        #74  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   53   94:invokevirtual   #78  <Method void ValueAnimator.setTarget(Object)>
		mValueAnimator.addListener(((android.animation.Animator.AnimatorListener) (this)));
	//   54   97:aload_0         
	//   55   98:getfield        #61  <Field ValueAnimator mValueAnimator>
	//   56  101:aload_0         
	//   57  102:invokevirtual   #82  <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
		setFraction(0.0F);
	//   58  105:aload_0         
	//   59  106:fconst_0        
	//   60  107:invokevirtual   #86  <Method void setFraction(float)>
	//   61  110:return          
	}
}
