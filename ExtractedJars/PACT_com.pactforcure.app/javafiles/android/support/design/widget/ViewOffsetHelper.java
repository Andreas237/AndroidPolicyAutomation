// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.ViewCompat;
import android.view.View;

class ViewOffsetHelper
{

	public ViewOffsetHelper(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mView = view;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field View mView>
	//    5    9:return          
	}

	private void updateOffsets()
	{
		ViewCompat.offsetTopAndBottom(mView, mOffsetTop - (mView.getTop() - mLayoutTop));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field View mView>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field int mOffsetTop>
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field View mView>
	//    6   12:invokevirtual   #28  <Method int View.getTop()>
	//    7   15:aload_0         
	//    8   16:getfield        #30  <Field int mLayoutTop>
	//    9   19:isub            
	//   10   20:isub            
	//   11   21:invokestatic    #36  <Method void ViewCompat.offsetTopAndBottom(View, int)>
		ViewCompat.offsetLeftAndRight(mView, mOffsetLeft - (mView.getLeft() - mLayoutLeft));
	//   12   24:aload_0         
	//   13   25:getfield        #18  <Field View mView>
	//   14   28:aload_0         
	//   15   29:getfield        #38  <Field int mOffsetLeft>
	//   16   32:aload_0         
	//   17   33:getfield        #18  <Field View mView>
	//   18   36:invokevirtual   #41  <Method int View.getLeft()>
	//   19   39:aload_0         
	//   20   40:getfield        #43  <Field int mLayoutLeft>
	//   21   43:isub            
	//   22   44:isub            
	//   23   45:invokestatic    #46  <Method void ViewCompat.offsetLeftAndRight(View, int)>
	//   24   48:return          
	}

	public int getLayoutLeft()
	{
		return mLayoutLeft;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int mLayoutLeft>
	//    2    4:ireturn         
	}

	public int getLayoutTop()
	{
		return mLayoutTop;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int mLayoutTop>
	//    2    4:ireturn         
	}

	public int getLeftAndRightOffset()
	{
		return mOffsetLeft;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int mOffsetLeft>
	//    2    4:ireturn         
	}

	public int getTopAndBottomOffset()
	{
		return mOffsetTop;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int mOffsetTop>
	//    2    4:ireturn         
	}

	public void onViewLayout()
	{
		mLayoutTop = mView.getTop();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field View mView>
	//    3    5:invokevirtual   #28  <Method int View.getTop()>
	//    4    8:putfield        #30  <Field int mLayoutTop>
		mLayoutLeft = mView.getLeft();
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #18  <Field View mView>
	//    8   16:invokevirtual   #41  <Method int View.getLeft()>
	//    9   19:putfield        #43  <Field int mLayoutLeft>
		updateOffsets();
	//   10   22:aload_0         
	//   11   23:invokespecial   #53  <Method void updateOffsets()>
	//   12   26:return          
	}

	public boolean setLeftAndRightOffset(int i)
	{
		if(mOffsetLeft != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field int mOffsetLeft>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          19
		{
			mOffsetLeft = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #38  <Field int mOffsetLeft>
			updateOffsets();
	//    7   13:aload_0         
	//    8   14:invokespecial   #53  <Method void updateOffsets()>
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		} else
		{
			return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
		}
	}

	public boolean setTopAndBottomOffset(int i)
	{
		if(mOffsetTop != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field int mOffsetTop>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          19
		{
			mOffsetTop = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #22  <Field int mOffsetTop>
			updateOffsets();
	//    7   13:aload_0         
	//    8   14:invokespecial   #53  <Method void updateOffsets()>
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		} else
		{
			return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
		}
	}

	private int mLayoutLeft;
	private int mLayoutTop;
	private int mOffsetLeft;
	private int mOffsetTop;
	private final View mView;
}
