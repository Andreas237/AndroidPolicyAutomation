// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

class RecyclerView$LayoutManager$1
	implements ViewBoundsCheck.Callback
{

	public View getChildAt(int i)
	{
		return RecyclerView.LayoutManager.this.getChildAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView$LayoutManager this$0>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #25  <Method View RecyclerView$LayoutManager.getChildAt(int)>
	//    4    8:areturn         
	}

	public int getChildCount()
	{
		return RecyclerView.LayoutManager.this.getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView$LayoutManager this$0>
	//    2    4:invokevirtual   #29  <Method int RecyclerView$LayoutManager.getChildCount()>
	//    3    7:ireturn         
	}

	public int getChildEnd(View view)
	{
		RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #37  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #39  <Class RecyclerView$LayoutParams>
	//    3    7:astore_3        
		int i = getDecoratedRight(view);
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field RecyclerView$LayoutManager this$0>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #42  <Method int RecyclerView$LayoutManager.getDecoratedRight(View)>
	//    8   16:istore_2        
		return layoutparams.rightMargin + i;
	//    9   17:aload_3         
	//   10   18:getfield        #46  <Field int RecyclerView$LayoutParams.rightMargin>
	//   11   21:iload_2         
	//   12   22:iadd            
	//   13   23:ireturn         
	}

	public int getChildStart(View view)
	{
		RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #37  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #39  <Class RecyclerView$LayoutParams>
	//    3    7:astore_2        
		return getDecoratedLeft(view) - layoutparams.leftMargin;
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field RecyclerView$LayoutManager this$0>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #50  <Method int RecyclerView$LayoutManager.getDecoratedLeft(View)>
	//    8   16:aload_2         
	//    9   17:getfield        #53  <Field int RecyclerView$LayoutParams.leftMargin>
	//   10   20:isub            
	//   11   21:ireturn         
	}

	public View getParent()
	{
		return ((View) (mRecyclerView));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView$LayoutManager this$0>
	//    2    4:getfield        #59  <Field RecyclerView RecyclerView$LayoutManager.mRecyclerView>
	//    3    7:areturn         
	}

	public int getParentEnd()
	{
		return getWidth() - getPaddingRight();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView$LayoutManager this$0>
	//    2    4:invokevirtual   #63  <Method int RecyclerView$LayoutManager.getWidth()>
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field RecyclerView$LayoutManager this$0>
	//    5   11:invokevirtual   #66  <Method int RecyclerView$LayoutManager.getPaddingRight()>
	//    6   14:isub            
	//    7   15:ireturn         
	}

	public int getParentStart()
	{
		return getPaddingLeft();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView$LayoutManager this$0>
	//    2    4:invokevirtual   #70  <Method int RecyclerView$LayoutManager.getPaddingLeft()>
	//    3    7:ireturn         
	}

	final RecyclerView.LayoutManager this$0;

	RecyclerView$LayoutManager$1()
	{
		this$0 = RecyclerView.LayoutManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field RecyclerView$LayoutManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
