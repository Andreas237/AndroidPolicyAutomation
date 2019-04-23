// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.ViewCompat;
import android.view.View;

class ViewOffsetHelper
{

	public ViewOffsetHelper(View view1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		view = view1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field View view>
	//    5    9:return          
	}

	private void updateOffsets()
	{
		View view1 = view;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field View view>
	//    2    4:astore_1        
		ViewCompat.offsetTopAndBottom(view1, offsetTop - (view1.getTop() - layoutTop));
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #22  <Field int offsetTop>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #28  <Method int View.getTop()>
	//    8   14:aload_0         
	//    9   15:getfield        #30  <Field int layoutTop>
	//   10   18:isub            
	//   11   19:isub            
	//   12   20:invokestatic    #36  <Method void ViewCompat.offsetTopAndBottom(View, int)>
		view1 = view;
	//   13   23:aload_0         
	//   14   24:getfield        #18  <Field View view>
	//   15   27:astore_1        
		ViewCompat.offsetLeftAndRight(view1, offsetLeft - (view1.getLeft() - layoutLeft));
	//   16   28:aload_1         
	//   17   29:aload_0         
	//   18   30:getfield        #38  <Field int offsetLeft>
	//   19   33:aload_1         
	//   20   34:invokevirtual   #41  <Method int View.getLeft()>
	//   21   37:aload_0         
	//   22   38:getfield        #43  <Field int layoutLeft>
	//   23   41:isub            
	//   24   42:isub            
	//   25   43:invokestatic    #46  <Method void ViewCompat.offsetLeftAndRight(View, int)>
	//   26   46:return          
	}

	public int getLayoutLeft()
	{
		return layoutLeft;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int layoutLeft>
	//    2    4:ireturn         
	}

	public int getLayoutTop()
	{
		return layoutTop;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int layoutTop>
	//    2    4:ireturn         
	}

	public int getLeftAndRightOffset()
	{
		return offsetLeft;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int offsetLeft>
	//    2    4:ireturn         
	}

	public int getTopAndBottomOffset()
	{
		return offsetTop;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int offsetTop>
	//    2    4:ireturn         
	}

	public void onViewLayout()
	{
		layoutTop = view.getTop();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field View view>
	//    3    5:invokevirtual   #28  <Method int View.getTop()>
	//    4    8:putfield        #30  <Field int layoutTop>
		layoutLeft = view.getLeft();
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #18  <Field View view>
	//    8   16:invokevirtual   #41  <Method int View.getLeft()>
	//    9   19:putfield        #43  <Field int layoutLeft>
		updateOffsets();
	//   10   22:aload_0         
	//   11   23:invokespecial   #53  <Method void updateOffsets()>
	//   12   26:return          
	}

	public boolean setLeftAndRightOffset(int i)
	{
		if(offsetLeft != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field int offsetLeft>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          19
		{
			offsetLeft = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #38  <Field int offsetLeft>
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
		if(offsetTop != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field int offsetTop>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          19
		{
			offsetTop = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #22  <Field int offsetTop>
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

	private int layoutLeft;
	private int layoutTop;
	private int offsetLeft;
	private int offsetTop;
	private final View view;
}
