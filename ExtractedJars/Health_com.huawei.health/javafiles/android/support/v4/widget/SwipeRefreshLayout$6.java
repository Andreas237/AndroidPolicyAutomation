// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//			SwipeRefreshLayout, CircleImageView, MaterialProgressDrawable

class SwipeRefreshLayout$6 extends Animation
{

	public void applyTransformation(float f, Transformation transformation)
	{
		int i;
		if(!mUsingCustomStart)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field SwipeRefreshLayout this$0>
	//*   2    4:getfield        #22  <Field boolean SwipeRefreshLayout.mUsingCustomStart>
	//*   3    7:ifne            32
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
	//*  13   29:goto            40
			i = mSpinnerOffsetEnd;
	//   14   32:aload_0         
	//   15   33:getfield        #12  <Field SwipeRefreshLayout this$0>
	//   16   36:getfield        #26  <Field int SwipeRefreshLayout.mSpinnerOffsetEnd>
	//   17   39:istore_3        
		int j = mFrom;
	//   18   40:aload_0         
	//   19   41:getfield        #12  <Field SwipeRefreshLayout this$0>
	//   20   44:getfield        #38  <Field int SwipeRefreshLayout.mFrom>
	//   21   47:istore          4
		i = (int)((float)(i - mFrom) * f);
	//   22   49:iload_3         
	//   23   50:aload_0         
	//   24   51:getfield        #12  <Field SwipeRefreshLayout this$0>
	//   25   54:getfield        #38  <Field int SwipeRefreshLayout.mFrom>
	//   26   57:isub            
	//   27   58:i2f             
	//   28   59:fload_1         
	//   29   60:fmul            
	//   30   61:f2i             
	//   31   62:istore_3        
		int k = mCircleView.getTop();
	//   32   63:aload_0         
	//   33   64:getfield        #12  <Field SwipeRefreshLayout this$0>
	//   34   67:getfield        #42  <Field CircleImageView SwipeRefreshLayout.mCircleView>
	//   35   70:invokevirtual   #48  <Method int CircleImageView.getTop()>
	//   36   73:istore          5
		setTargetOffsetTopAndBottom((j + i) - k);
	//   37   75:aload_0         
	//   38   76:getfield        #12  <Field SwipeRefreshLayout this$0>
	//   39   79:iload           4
	//   40   81:iload_3         
	//   41   82:iadd            
	//   42   83:iload           5
	//   43   85:isub            
	//   44   86:invokevirtual   #52  <Method void SwipeRefreshLayout.setTargetOffsetTopAndBottom(int)>
		mProgress.setArrowScale(1.0F - f);
	//   45   89:aload_0         
	//   46   90:getfield        #12  <Field SwipeRefreshLayout this$0>
	//   47   93:getfield        #56  <Field MaterialProgressDrawable SwipeRefreshLayout.mProgress>
	//   48   96:fconst_1        
	//   49   97:fload_1         
	//   50   98:fsub            
	//   51   99:invokevirtual   #62  <Method void MaterialProgressDrawable.setArrowScale(float)>
	//   52  102:return          
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
