// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			ViewOffsetHelper, CoordinatorLayout

class ViewOffsetBehavior extends CoordinatorLayout.Behavior
{

	public ViewOffsetBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void CoordinatorLayout$Behavior()>
		mTempTopBottomOffset = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #16  <Field int mTempTopBottomOffset>
		mTempLeftRightOffset = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #18  <Field int mTempLeftRightOffset>
	//    8   14:return          
	}

	public ViewOffsetBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #22  <Method void CoordinatorLayout$Behavior(Context, AttributeSet)>
		mTempTopBottomOffset = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #16  <Field int mTempTopBottomOffset>
		mTempLeftRightOffset = 0;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #18  <Field int mTempLeftRightOffset>
	//   10   16:return          
	}

	public int getLeftAndRightOffset()
	{
		if(mViewOffsetHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field ViewOffsetHelper mViewOffsetHelper>
	//*   2    4:ifnull          15
			return mViewOffsetHelper.getLeftAndRightOffset();
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field ViewOffsetHelper mViewOffsetHelper>
	//    5   11:invokevirtual   #30  <Method int ViewOffsetHelper.getLeftAndRightOffset()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int getTopAndBottomOffset()
	{
		if(mViewOffsetHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field ViewOffsetHelper mViewOffsetHelper>
	//*   2    4:ifnull          15
			return mViewOffsetHelper.getTopAndBottomOffset();
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field ViewOffsetHelper mViewOffsetHelper>
	//    5   11:invokevirtual   #33  <Method int ViewOffsetHelper.getTopAndBottomOffset()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	protected void layoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		coordinatorlayout.onLayoutChild(view, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #41  <Method void CoordinatorLayout.onLayoutChild(View, int)>
	//    4    6:return          
	}

	public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		layoutChild(coordinatorlayout, view, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #46  <Method void layoutChild(CoordinatorLayout, View, int)>
		if(mViewOffsetHelper == null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #26  <Field ViewOffsetHelper mViewOffsetHelper>
	//*   7   11:ifnonnull       26
			mViewOffsetHelper = new ViewOffsetHelper(view);
	//    8   14:aload_0         
	//    9   15:new             #28  <Class ViewOffsetHelper>
	//   10   18:dup             
	//   11   19:aload_2         
	//   12   20:invokespecial   #49  <Method void ViewOffsetHelper(View)>
	//   13   23:putfield        #26  <Field ViewOffsetHelper mViewOffsetHelper>
		mViewOffsetHelper.onViewLayout();
	//   14   26:aload_0         
	//   15   27:getfield        #26  <Field ViewOffsetHelper mViewOffsetHelper>
	//   16   30:invokevirtual   #52  <Method void ViewOffsetHelper.onViewLayout()>
		if(mTempTopBottomOffset != 0)
	//*  17   33:aload_0         
	//*  18   34:getfield        #16  <Field int mTempTopBottomOffset>
	//*  19   37:ifeq            57
		{
			mViewOffsetHelper.setTopAndBottomOffset(mTempTopBottomOffset);
	//   20   40:aload_0         
	//   21   41:getfield        #26  <Field ViewOffsetHelper mViewOffsetHelper>
	//   22   44:aload_0         
	//   23   45:getfield        #16  <Field int mTempTopBottomOffset>
	//   24   48:invokevirtual   #56  <Method boolean ViewOffsetHelper.setTopAndBottomOffset(int)>
	//   25   51:pop             
			mTempTopBottomOffset = 0;
	//   26   52:aload_0         
	//   27   53:iconst_0        
	//   28   54:putfield        #16  <Field int mTempTopBottomOffset>
		}
		if(mTempLeftRightOffset != 0)
	//*  29   57:aload_0         
	//*  30   58:getfield        #18  <Field int mTempLeftRightOffset>
	//*  31   61:ifeq            81
		{
			mViewOffsetHelper.setLeftAndRightOffset(mTempLeftRightOffset);
	//   32   64:aload_0         
	//   33   65:getfield        #26  <Field ViewOffsetHelper mViewOffsetHelper>
	//   34   68:aload_0         
	//   35   69:getfield        #18  <Field int mTempLeftRightOffset>
	//   36   72:invokevirtual   #59  <Method boolean ViewOffsetHelper.setLeftAndRightOffset(int)>
	//   37   75:pop             
			mTempLeftRightOffset = 0;
	//   38   76:aload_0         
	//   39   77:iconst_0        
	//   40   78:putfield        #18  <Field int mTempLeftRightOffset>
		}
		return true;
	//   41   81:iconst_1        
	//   42   82:ireturn         
	}

	public boolean setLeftAndRightOffset(int i)
	{
		if(mViewOffsetHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field ViewOffsetHelper mViewOffsetHelper>
	//*   2    4:ifnull          16
		{
			return mViewOffsetHelper.setLeftAndRightOffset(i);
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field ViewOffsetHelper mViewOffsetHelper>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #59  <Method boolean ViewOffsetHelper.setLeftAndRightOffset(int)>
	//    7   15:ireturn         
		} else
		{
			mTempLeftRightOffset = i;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #18  <Field int mTempLeftRightOffset>
			return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
		}
	}

	public boolean setTopAndBottomOffset(int i)
	{
		if(mViewOffsetHelper != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field ViewOffsetHelper mViewOffsetHelper>
	//*   2    4:ifnull          16
		{
			return mViewOffsetHelper.setTopAndBottomOffset(i);
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field ViewOffsetHelper mViewOffsetHelper>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #56  <Method boolean ViewOffsetHelper.setTopAndBottomOffset(int)>
	//    7   15:ireturn         
		} else
		{
			mTempTopBottomOffset = i;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #16  <Field int mTempTopBottomOffset>
			return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
		}
	}

	private int mTempLeftRightOffset;
	private int mTempTopBottomOffset;
	private ViewOffsetHelper mViewOffsetHelper;
}
