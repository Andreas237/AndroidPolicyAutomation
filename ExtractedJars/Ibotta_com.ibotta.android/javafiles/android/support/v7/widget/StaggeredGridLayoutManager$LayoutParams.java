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

	public final int getSpanIndex()
	{
		StaggeredGridLayoutManager.Span span = mSpan;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field StaggeredGridLayoutManager$Span mSpan>
	//    2    4:astore_1        
		if(span == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		else
			return span.mIndex;
	//    7   11:aload_1         
	//    8   12:getfield        #35  <Field int StaggeredGridLayoutManager$Span.mIndex>
	//    9   15:ireturn         
	}

	public boolean isFullSpan()
	{
		return mFullSpan;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field boolean mFullSpan>
	//    2    4:ireturn         
	}

	boolean mFullSpan;
	StaggeredGridLayoutManager.Span mSpan;

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
