// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.widget:
//			StaggeredGridLayoutManager

public static class StaggeredGridLayoutManager$LayoutParams extends RecyclerView.LayoutParams
{

	public boolean a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field boolean b>
	//    2    4:ireturn         
	}

	public final int b()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field StaggeredGridLayoutManager$b a>
	//*   2    4:ifnonnull       9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		else
			return a.e;
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field StaggeredGridLayoutManager$b a>
	//    7   13:getfield        #37  <Field int StaggeredGridLayoutManager$b.e>
	//    8   16:ireturn         
	}

	StaggeredGridLayoutManager.b a;
	boolean b;

	public StaggeredGridLayoutManager$LayoutParams(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #15  <Method void RecyclerView$LayoutParams(int, int)>
	//    4    6:return          
	}

	public StaggeredGridLayoutManager$LayoutParams(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #19  <Method void RecyclerView$LayoutParams(Context, AttributeSet)>
	//    4    6:return          
	}

	public StaggeredGridLayoutManager$LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		super(layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void RecyclerView$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:return          
	}

	public StaggeredGridLayoutManager$LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		super(marginlayoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void RecyclerView$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//    3    5:return          
	}
}
