// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//			SwipeRefreshLayout, CircleImageView, CircularProgressDrawable

class SwipeRefreshLayout$6 extends Animation
{

	public void applyTransformation(float f, Transformation transformation)
	{
		int i;
		int j;
		int k;
		if(!mUsingCustomStart)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field SwipeRefreshLayout this$0>
	//*   2    4:getfield        #22  <Field boolean SwipeRefreshLayout.mUsingCustomStart>
	//*   3    7:ifne            92
			i = mSpinnerOffsetEnd - Math.abs(mOriginalOffsetTop);
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field SwipeRefreshLayout this$0>
	//    6   14:getfield        #26  <Field int SwipeRefreshLayout.mSpinnerOffsetEnd>
	//    7   17:aload_0         
	//    8   18:getfield        #12  <Field SwipeRefreshLayout this$0>
	//    9   21:getfield        #29  <Field int SwipeRefreshLayout.mOriginalOffsetTop>
	//   10   24:invokestatic    #35  <Method int Math.abs(int)>
	//   11   27:isub            
	//   12   28:istore_3        
		else
	//*  13   29:aload_0         
	//*  14   30:getfield        #12  <Field SwipeRefreshLayout this$0>
	//*  15   33:getfield        #38  <Field int SwipeRefreshLayout.mFrom>
	//*  16   36:istore          4
	//*  17   38:iload_3         
	//*  18   39:aload_0         
	//*  19   40:getfield        #12  <Field SwipeRefreshLayout this$0>
	//*  20   43:getfield        #38  <Field int SwipeRefreshLayout.mFrom>
	//*  21   46:isub            
	//*  22   47:i2f             
	//*  23   48:fload_1         
	//*  24   49:fmul            
	//*  25   50:f2i             
	//*  26   51:istore_3        
	//*  27   52:aload_0         
	//*  28   53:getfield        #12  <Field SwipeRefreshLayout this$0>
	//*  29   56:getfield        #42  <Field CircleImageView SwipeRefreshLayout.mCircleView>
	//*  30   59:invokevirtual   #48  <Method int CircleImageView.getTop()>
	//*  31   62:istore          5
	//*  32   64:aload_0         
	//*  33   65:getfield        #12  <Field SwipeRefreshLayout this$0>
	//*  34   68:iload           4
	//*  35   70:iload_3         
	//*  36   71:iadd            
	//*  37   72:iload           5
	//*  38   74:isub            
	//*  39   75:invokevirtual   #52  <Method void SwipeRefreshLayout.setTargetOffsetTopAndBottom(int)>
	//*  40   78:aload_0         
	//*  41   79:getfield        #12  <Field SwipeRefreshLayout this$0>
	//*  42   82:getfield        #56  <Field CircularProgressDrawable SwipeRefreshLayout.mProgress>
	//*  43   85:fconst_1        
	//*  44   86:fload_1         
	//*  45   87:fsub            
	//*  46   88:invokevirtual   #62  <Method void CircularProgressDrawable.setArrowScale(float)>
	//*  47   91:return          
			i = mSpinnerOffsetEnd;
	//   48   92:aload_0         
	//   49   93:getfield        #12  <Field SwipeRefreshLayout this$0>
	//   50   96:getfield        #26  <Field int SwipeRefreshLayout.mSpinnerOffsetEnd>
	//   51   99:istore_3        
		j = mFrom;
		i = (int)((float)(i - mFrom) * f);
		k = mCircleView.getTop();
		setTargetOffsetTopAndBottom((j + i) - k);
		mProgress.setArrowScale(1.0F - f);
	//*  52  100:goto            29
	}

	final SwipeRefreshLayout this$0;

	SwipeRefreshLayout$6()
	{
		this$0 = SwipeRefreshLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field SwipeRefreshLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Animation()>
	//    5    9:return          
	}
}
