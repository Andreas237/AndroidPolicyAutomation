// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuView

public static class ActionMenuView$LayoutParams extends ams
{

	public int cellsUsed;
	public boolean expandable;
	boolean expanded;
	public int extraPixels;
	public boolean isOverflowButton;
	public boolean preventEdgeOffset;

	public ActionMenuView$LayoutParams(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #20  <Method void LinearLayoutCompat$LayoutParams(int, int)>
		isOverflowButton = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #22  <Field boolean isOverflowButton>
	//    7   11:return          
	}

	ActionMenuView$LayoutParams(int i, int j, boolean flag)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #20  <Method void LinearLayoutCompat$LayoutParams(int, int)>
		isOverflowButton = flag;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #22  <Field boolean isOverflowButton>
	//    7   11:return          
	}

	public ActionMenuView$LayoutParams(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void LinearLayoutCompat$LayoutParams(Context, AttributeSet)>
	//    4    6:return          
	}

	public ActionMenuView$LayoutParams(ActionMenuView$LayoutParams actionmenuview$layoutparams)
	{
		super(((android.view.ViewGroup.LayoutParams) (actionmenuview$layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void LinearLayoutCompat$LayoutParams(android.view.ViewGroup$LayoutParams)>
		isOverflowButton = actionmenuview$layoutparams.isOverflowButton;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #22  <Field boolean isOverflowButton>
	//    6   10:putfield        #22  <Field boolean isOverflowButton>
	//    7   13:return          
	}

	public ActionMenuView$LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		super(layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void LinearLayoutCompat$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:return          
	}
}
