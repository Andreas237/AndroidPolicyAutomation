// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.PointF;
import android.view.View;

// Referenced classes of package android.support.transition:
//			ChangeBounds, ViewUtils

private static class ChangeBounds$ViewBounds
{

	private void setLeftTopRightBottom()
	{
		ViewUtils.setLeftTopRightBottom(mView, mLeft, mTop, mRight, mBottom);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field View mView>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field int mLeft>
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field int mTop>
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field int mRight>
	//    8   16:aload_0         
	//    9   17:getfield        #33  <Field int mBottom>
	//   10   20:invokestatic    #38  <Method void ViewUtils.setLeftTopRightBottom(View, int, int, int, int)>
		mTopLeftCalls = 0;
	//   11   23:aload_0         
	//   12   24:iconst_0        
	//   13   25:putfield        #40  <Field int mTopLeftCalls>
		mBottomRightCalls = 0;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #42  <Field int mBottomRightCalls>
	//   17   33:return          
	}

	void setBottomRight(PointF pointf)
	{
		mRight = Math.round(pointf.x);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #50  <Field float PointF.x>
	//    3    5:invokestatic    #56  <Method int Math.round(float)>
	//    4    8:putfield        #31  <Field int mRight>
		mBottom = Math.round(pointf.y);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:getfield        #59  <Field float PointF.y>
	//    8   16:invokestatic    #56  <Method int Math.round(float)>
	//    9   19:putfield        #33  <Field int mBottom>
		mBottomRightCalls = mBottomRightCalls + 1;
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #42  <Field int mBottomRightCalls>
	//   13   27:iconst_1        
	//   14   28:iadd            
	//   15   29:putfield        #42  <Field int mBottomRightCalls>
		if(mTopLeftCalls == mBottomRightCalls)
	//*  16   32:aload_0         
	//*  17   33:getfield        #40  <Field int mTopLeftCalls>
	//*  18   36:aload_0         
	//*  19   37:getfield        #42  <Field int mBottomRightCalls>
	//*  20   40:icmpne          47
			setLeftTopRightBottom();
	//   21   43:aload_0         
	//   22   44:invokespecial   #61  <Method void setLeftTopRightBottom()>
	//   23   47:return          
	}

	void setTopLeft(PointF pointf)
	{
		mLeft = Math.round(pointf.x);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #50  <Field float PointF.x>
	//    3    5:invokestatic    #56  <Method int Math.round(float)>
	//    4    8:putfield        #27  <Field int mLeft>
		mTop = Math.round(pointf.y);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:getfield        #59  <Field float PointF.y>
	//    8   16:invokestatic    #56  <Method int Math.round(float)>
	//    9   19:putfield        #29  <Field int mTop>
		mTopLeftCalls = mTopLeftCalls + 1;
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #40  <Field int mTopLeftCalls>
	//   13   27:iconst_1        
	//   14   28:iadd            
	//   15   29:putfield        #40  <Field int mTopLeftCalls>
		if(mTopLeftCalls == mBottomRightCalls)
	//*  16   32:aload_0         
	//*  17   33:getfield        #40  <Field int mTopLeftCalls>
	//*  18   36:aload_0         
	//*  19   37:getfield        #42  <Field int mBottomRightCalls>
	//*  20   40:icmpne          47
			setLeftTopRightBottom();
	//   21   43:aload_0         
	//   22   44:invokespecial   #61  <Method void setLeftTopRightBottom()>
	//   23   47:return          
	}

	private int mBottom;
	private int mBottomRightCalls;
	private int mLeft;
	private int mRight;
	private int mTop;
	private int mTopLeftCalls;
	private View mView;

	ChangeBounds$ViewBounds(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mView = view;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field View mView>
	//    5    9:return          
	}
}
