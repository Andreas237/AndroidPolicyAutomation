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
		tempTopBottomOffset = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #16  <Field int tempTopBottomOffset>
		tempLeftRightOffset = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #18  <Field int tempLeftRightOffset>
	//    8   14:return          
	}

	public ViewOffsetBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #22  <Method void CoordinatorLayout$Behavior(Context, AttributeSet)>
		tempTopBottomOffset = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #16  <Field int tempTopBottomOffset>
		tempLeftRightOffset = 0;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #18  <Field int tempLeftRightOffset>
	//   10   16:return          
	}

	public int getLeftAndRightOffset()
	{
		ViewOffsetHelper viewoffsethelper = viewOffsetHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field ViewOffsetHelper viewOffsetHelper>
	//    2    4:astore_1        
		if(viewoffsethelper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return viewoffsethelper.getLeftAndRightOffset();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #30  <Method int ViewOffsetHelper.getLeftAndRightOffset()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public int getTopAndBottomOffset()
	{
		ViewOffsetHelper viewoffsethelper = viewOffsetHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field ViewOffsetHelper viewOffsetHelper>
	//    2    4:astore_1        
		if(viewoffsethelper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return viewoffsethelper.getTopAndBottomOffset();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #33  <Method int ViewOffsetHelper.getTopAndBottomOffset()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
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
		if(viewOffsetHelper == null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #26  <Field ViewOffsetHelper viewOffsetHelper>
	//*   7   11:ifnonnull       26
			viewOffsetHelper = new ViewOffsetHelper(view);
	//    8   14:aload_0         
	//    9   15:new             #28  <Class ViewOffsetHelper>
	//   10   18:dup             
	//   11   19:aload_2         
	//   12   20:invokespecial   #49  <Method void ViewOffsetHelper(View)>
	//   13   23:putfield        #26  <Field ViewOffsetHelper viewOffsetHelper>
		viewOffsetHelper.onViewLayout();
	//   14   26:aload_0         
	//   15   27:getfield        #26  <Field ViewOffsetHelper viewOffsetHelper>
	//   16   30:invokevirtual   #52  <Method void ViewOffsetHelper.onViewLayout()>
		i = tempTopBottomOffset;
	//   17   33:aload_0         
	//   18   34:getfield        #16  <Field int tempTopBottomOffset>
	//   19   37:istore_3        
		if(i != 0)
	//*  20   38:iload_3         
	//*  21   39:ifeq            56
		{
			viewOffsetHelper.setTopAndBottomOffset(i);
	//   22   42:aload_0         
	//   23   43:getfield        #26  <Field ViewOffsetHelper viewOffsetHelper>
	//   24   46:iload_3         
	//   25   47:invokevirtual   #56  <Method boolean ViewOffsetHelper.setTopAndBottomOffset(int)>
	//   26   50:pop             
			tempTopBottomOffset = 0;
	//   27   51:aload_0         
	//   28   52:iconst_0        
	//   29   53:putfield        #16  <Field int tempTopBottomOffset>
		}
		i = tempLeftRightOffset;
	//   30   56:aload_0         
	//   31   57:getfield        #18  <Field int tempLeftRightOffset>
	//   32   60:istore_3        
		if(i != 0)
	//*  33   61:iload_3         
	//*  34   62:ifeq            79
		{
			viewOffsetHelper.setLeftAndRightOffset(i);
	//   35   65:aload_0         
	//   36   66:getfield        #26  <Field ViewOffsetHelper viewOffsetHelper>
	//   37   69:iload_3         
	//   38   70:invokevirtual   #59  <Method boolean ViewOffsetHelper.setLeftAndRightOffset(int)>
	//   39   73:pop             
			tempLeftRightOffset = 0;
	//   40   74:aload_0         
	//   41   75:iconst_0        
	//   42   76:putfield        #18  <Field int tempLeftRightOffset>
		}
		return true;
	//   43   79:iconst_1        
	//   44   80:ireturn         
	}

	public boolean setLeftAndRightOffset(int i)
	{
		ViewOffsetHelper viewoffsethelper = viewOffsetHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field ViewOffsetHelper viewOffsetHelper>
	//    2    4:astore_2        
		if(viewoffsethelper != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
		{
			return viewoffsethelper.setLeftAndRightOffset(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #59  <Method boolean ViewOffsetHelper.setLeftAndRightOffset(int)>
	//    8   14:ireturn         
		} else
		{
			tempLeftRightOffset = i;
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:putfield        #18  <Field int tempLeftRightOffset>
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		}
	}

	public boolean setTopAndBottomOffset(int i)
	{
		ViewOffsetHelper viewoffsethelper = viewOffsetHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field ViewOffsetHelper viewOffsetHelper>
	//    2    4:astore_2        
		if(viewoffsethelper != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
		{
			return viewoffsethelper.setTopAndBottomOffset(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #56  <Method boolean ViewOffsetHelper.setTopAndBottomOffset(int)>
	//    8   14:ireturn         
		} else
		{
			tempTopBottomOffset = i;
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:putfield        #16  <Field int tempTopBottomOffset>
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		}
	}

	private int tempLeftRightOffset;
	private int tempTopBottomOffset;
	private ViewOffsetHelper viewOffsetHelper;
}
