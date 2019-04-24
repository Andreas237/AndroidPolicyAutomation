// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static class RecyclerView$ItemAnimator$ItemHolderInfo
{

	public RecyclerView$ItemAnimator$ItemHolderInfo setFrom(RecyclerView.ViewHolder viewholder)
	{
		return setFrom(viewholder, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #26  <Method RecyclerView$ItemAnimator$ItemHolderInfo setFrom(RecyclerView$ViewHolder, int)>
	//    4    6:areturn         
	}

	public RecyclerView$ItemAnimator$ItemHolderInfo setFrom(RecyclerView.ViewHolder viewholder, int i)
	{
		viewholder = ((RecyclerView.ViewHolder) (viewholder.itemView));
	//    0    0:aload_1         
	//    1    1:getfield        #32  <Field View RecyclerView$ViewHolder.itemView>
	//    2    4:astore_1        
		left = ((View) (viewholder)).getLeft();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #38  <Method int View.getLeft()>
	//    6   10:putfield        #40  <Field int left>
		top = ((View) (viewholder)).getTop();
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #43  <Method int View.getTop()>
	//   10   18:putfield        #45  <Field int top>
		right = ((View) (viewholder)).getRight();
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #48  <Method int View.getRight()>
	//   14   26:putfield        #50  <Field int right>
		bottom = ((View) (viewholder)).getBottom();
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #53  <Method int View.getBottom()>
	//   18   34:putfield        #55  <Field int bottom>
		return this;
	//   19   37:aload_0         
	//   20   38:areturn         
	}

	public int bottom;
	public int changeFlags;
	public int left;
	public int right;
	public int top;

	public RecyclerView$ItemAnimator$ItemHolderInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}
}
