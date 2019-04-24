// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.widget:
//			GridLayoutManager

public static class GridLayoutManager$LayoutParams extends RecyclerView.LayoutParams
{

	public int getSpanIndex()
	{
		return mSpanIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int mSpanIndex>
	//    2    4:ireturn         
	}

	public int getSpanSize()
	{
		return mSpanSize;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int mSpanSize>
	//    2    4:ireturn         
	}

	public static final int INVALID_SPAN_ID = -1;
	int mSpanIndex;
	int mSpanSize;

	public GridLayoutManager$LayoutParams(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #16  <Method void RecyclerView$LayoutParams(int, int)>
		mSpanIndex = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #18  <Field int mSpanIndex>
		mSpanSize = 0;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #20  <Field int mSpanSize>
	//   10   16:return          
	}

	public GridLayoutManager$LayoutParams(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #24  <Method void RecyclerView$LayoutParams(Context, AttributeSet)>
		mSpanIndex = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #18  <Field int mSpanIndex>
		mSpanSize = 0;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #20  <Field int mSpanSize>
	//   10   16:return          
	}

	public GridLayoutManager$LayoutParams(RecyclerView.LayoutParams layoutparams)
	{
		super(layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void RecyclerView$LayoutParams(RecyclerView$LayoutParams)>
		mSpanIndex = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #18  <Field int mSpanIndex>
		mSpanSize = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #20  <Field int mSpanSize>
	//    9   15:return          
	}

	public GridLayoutManager$LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		super(layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void RecyclerView$LayoutParams(android.view.ViewGroup$LayoutParams)>
		mSpanIndex = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #18  <Field int mSpanIndex>
		mSpanSize = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #20  <Field int mSpanSize>
	//    9   15:return          
	}

	public GridLayoutManager$LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
	{
		super(marginlayoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #33  <Method void RecyclerView$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		mSpanIndex = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #18  <Field int mSpanIndex>
		mSpanSize = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #20  <Field int mSpanSize>
	//    9   15:return          
	}
}
