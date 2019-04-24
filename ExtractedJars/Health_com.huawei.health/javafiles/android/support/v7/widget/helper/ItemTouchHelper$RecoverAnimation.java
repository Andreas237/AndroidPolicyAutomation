// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package android.support.v7.widget.helper:
//			ItemTouchHelper

class ItemTouchHelper$RecoverAnimation
	implements android.animation.Animator.AnimatorListener
{

	public void cancel()
	{
		mValueAnimator.cancel();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field ValueAnimator mValueAnimator>
	//    2    4:invokevirtual   #94  <Method void ValueAnimator.cancel()>
	//    3    7:return          
	}

	public void onAnimationCancel(Animator animator)
	{
		setFraction(1.0F);
	//    0    0:aload_0         
	//    1    1:fconst_1        
	//    2    2:invokevirtual   #90  <Method void setFraction(float)>
	//    3    5:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		if(!mEnded)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field boolean mEnded>
	//*   2    4:ifne            15
			mViewHolder.setIsRecyclable(true);
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
	//    5   11:iconst_1        
	//    6   12:invokevirtual   #101 <Method void android.support.v7.widget.RecyclerView$ViewHolder.setIsRecyclable(boolean)>
		mEnded = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #43  <Field boolean mEnded>
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
	//    1    1:getfield        #65  <Field ValueAnimator mValueAnimator>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #108 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setFraction(float f)
	{
		mFraction = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #110 <Field float mFraction>
	//    3    5:return          
	}

	public void start()
	{
		mViewHolder.setIsRecyclable(false);
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #101 <Method void android.support.v7.widget.RecyclerView$ViewHolder.setIsRecyclable(boolean)>
		mValueAnimator.start();
	//    4    8:aload_0         
	//    5    9:getfield        #65  <Field ValueAnimator mValueAnimator>
	//    6   12:invokevirtual   #113 <Method void ValueAnimator.start()>
	//    7   15:return          
	}

	public void update()
	{
		if(mStartDx == mTargetX)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field float mStartDx>
	//*   2    4:aload_0         
	//*   3    5:getfield        #55  <Field float mTargetX>
	//*   4    8:fcmpl           
	//*   5    9:ifne            29
			mX = mViewHolder.itemView.getTranslationX();
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #49  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
	//    9   17:getfield        #78  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   10   20:invokevirtual   #120 <Method float View.getTranslationX()>
	//   11   23:putfield        #122 <Field float mX>
		else
	//*  12   26:goto            52
			mX = mStartDx + mFraction * (mTargetX - mStartDx);
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:getfield        #51  <Field float mStartDx>
	//   16   34:aload_0         
	//   17   35:getfield        #110 <Field float mFraction>
	//   18   38:aload_0         
	//   19   39:getfield        #55  <Field float mTargetX>
	//   20   42:aload_0         
	//   21   43:getfield        #51  <Field float mStartDx>
	//   22   46:fsub            
	//   23   47:fmul            
	//   24   48:fadd            
	//   25   49:putfield        #122 <Field float mX>
		if(mStartDy == mTargetY)
	//*  26   52:aload_0         
	//*  27   53:getfield        #53  <Field float mStartDy>
	//*  28   56:aload_0         
	//*  29   57:getfield        #57  <Field float mTargetY>
	//*  30   60:fcmpl           
	//*  31   61:ifne            79
		{
			mY = mViewHolder.itemView.getTranslationY();
	//   32   64:aload_0         
	//   33   65:aload_0         
	//   34   66:getfield        #49  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
	//   35   69:getfield        #78  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   36   72:invokevirtual   #125 <Method float View.getTranslationY()>
	//   37   75:putfield        #127 <Field float mY>
			return;
	//   38   78:return          
		} else
		{
			mY = mStartDy + mFraction * (mTargetY - mStartDy);
	//   39   79:aload_0         
	//   40   80:aload_0         
	//   41   81:getfield        #53  <Field float mStartDy>
	//   42   84:aload_0         
	//   43   85:getfield        #110 <Field float mFraction>
	//   44   88:aload_0         
	//   45   89:getfield        #57  <Field float mTargetY>
	//   46   92:aload_0         
	//   47   93:getfield        #53  <Field float mStartDy>
	//   48   96:fsub            
	//   49   97:fmul            
	//   50   98:fadd            
	//   51   99:putfield        #127 <Field float mY>
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
	final ItemTouchHelper this$0;

	ItemTouchHelper$RecoverAnimation(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i, int j, float f, float f1, float f2, 
			float f3)
	{
		this.this$0 = ItemTouchHelper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field ItemTouchHelper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #39  <Method void Object()>
		mOverridden = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #41  <Field boolean mOverridden>
		mEnded = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #43  <Field boolean mEnded>
		mActionState = j;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #45  <Field int mActionState>
		mAnimationType = i;
	//   14   25:aload_0         
	//   15   26:iload_3         
	//   16   27:putfield        #47  <Field int mAnimationType>
		mViewHolder = viewholder;
	//   17   30:aload_0         
	//   18   31:aload_2         
	//   19   32:putfield        #49  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
		mStartDx = f;
	//   20   35:aload_0         
	//   21   36:fload           5
	//   22   38:putfield        #51  <Field float mStartDx>
		mStartDy = f1;
	//   23   41:aload_0         
	//   24   42:fload           6
	//   25   44:putfield        #53  <Field float mStartDy>
		mTargetX = f2;
	//   26   47:aload_0         
	//   27   48:fload           7
	//   28   50:putfield        #55  <Field float mTargetX>
		mTargetY = f3;
	//   29   53:aload_0         
	//   30   54:fload           8
	//   31   56:putfield        #57  <Field float mTargetY>
	//   32   59:aload_0         
	//   33   60:iconst_2        
	//   34   61:newarray        float[]
	//   35   63:dup             
	//   36   64:iconst_0        
	//   37   65:fconst_0        
	//   38   66:fastore         
	//   39   67:dup             
	//   40   68:iconst_1        
	//   41   69:fconst_1        
	//   42   70:fastore         
	//   43   71:invokestatic    #63  <Method ValueAnimator ValueAnimator.ofFloat(float[])>
	//   44   74:putfield        #65  <Field ValueAnimator mValueAnimator>
		mValueAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

			public void onAnimationUpdate(ValueAnimator valueanimator)
			{
				setFraction(valueanimator.getAnimatedFraction());
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field ItemTouchHelper$RecoverAnimation this$1>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #35  <Method float ValueAnimator.getAnimatedFraction()>
			//    4    8:invokevirtual   #39  <Method void ItemTouchHelper$RecoverAnimation.setFraction(float)>
			//    5   11:return          
			}

			final ItemTouchHelper.RecoverAnimation this$1;
			final ItemTouchHelper val$this$0;

			
			{
				this$1 = ItemTouchHelper.RecoverAnimation.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ItemTouchHelper$RecoverAnimation this$1>
				this$0 = itemtouchhelper;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field ItemTouchHelper val$this$0>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   45   77:aload_0         
	//   46   78:getfield        #65  <Field ValueAnimator mValueAnimator>
	//   47   81:new             #11  <Class ItemTouchHelper$RecoverAnimation$1>
	//   48   84:dup             
	//   49   85:aload_0         
	//   50   86:aload_1         
	//   51   87:invokespecial   #68  <Method void ItemTouchHelper$RecoverAnimation$1(ItemTouchHelper$RecoverAnimation, ItemTouchHelper)>
	//   52   90:invokevirtual   #72  <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		mValueAnimator.setTarget(((Object) (viewholder.itemView)));
	//   53   93:aload_0         
	//   54   94:getfield        #65  <Field ValueAnimator mValueAnimator>
	//   55   97:aload_2         
	//   56   98:getfield        #78  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   57  101:invokevirtual   #82  <Method void ValueAnimator.setTarget(Object)>
		mValueAnimator.addListener(((android.animation.Animator.AnimatorListener) (this)));
	//   58  104:aload_0         
	//   59  105:getfield        #65  <Field ValueAnimator mValueAnimator>
	//   60  108:aload_0         
	//   61  109:invokevirtual   #86  <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
		setFraction(0.0F);
	//   62  112:aload_0         
	//   63  113:fconst_0        
	//   64  114:invokevirtual   #90  <Method void setFraction(float)>
	//   65  117:return          
	}
}
