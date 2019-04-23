// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

class RecyclerView$LayoutManager$2
	implements ViewBoundsCheck.Callback
{

	public View getChildAt(int i)
	{
		return RecyclerView.LayoutManager.this.getChildAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field RecyclerView$LayoutManager this$0>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #22  <Method View RecyclerView$LayoutManager.getChildAt(int)>
	//    4    8:areturn         
	}

	public int getChildCount()
	{
		return RecyclerView.LayoutManager.this.getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field RecyclerView$LayoutManager this$0>
	//    2    4:invokevirtual   #26  <Method int RecyclerView$LayoutManager.getChildCount()>
	//    3    7:ireturn         
	}

	public int getChildEnd(View view)
	{
		RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #34  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #36  <Class RecyclerView$LayoutParams>
	//    3    7:astore_2        
		return getDecoratedBottom(view) + layoutparams.bottomMargin;
	//    4    8:aload_0         
	//    5    9:getfield        #12  <Field RecyclerView$LayoutManager this$0>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #39  <Method int RecyclerView$LayoutManager.getDecoratedBottom(View)>
	//    8   16:aload_2         
	//    9   17:getfield        #43  <Field int RecyclerView$LayoutParams.bottomMargin>
	//   10   20:iadd            
	//   11   21:ireturn         
	}

	public int getChildStart(View view)
	{
		RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #34  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #36  <Class RecyclerView$LayoutParams>
	//    3    7:astore_2        
		return getDecoratedTop(view) - layoutparams.topMargin;
	//    4    8:aload_0         
	//    5    9:getfield        #12  <Field RecyclerView$LayoutManager this$0>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #47  <Method int RecyclerView$LayoutManager.getDecoratedTop(View)>
	//    8   16:aload_2         
	//    9   17:getfield        #50  <Field int RecyclerView$LayoutParams.topMargin>
	//   10   20:isub            
	//   11   21:ireturn         
	}

	public View getParent()
	{
		return ((View) (mRecyclerView));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field RecyclerView$LayoutManager this$0>
	//    2    4:getfield        #56  <Field RecyclerView RecyclerView$LayoutManager.mRecyclerView>
	//    3    7:areturn         
	}

	public int getParentEnd()
	{
		return getHeight() - getPaddingBottom();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field RecyclerView$LayoutManager this$0>
	//    2    4:invokevirtual   #60  <Method int RecyclerView$LayoutManager.getHeight()>
	//    3    7:aload_0         
	//    4    8:getfield        #12  <Field RecyclerView$LayoutManager this$0>
	//    5   11:invokevirtual   #63  <Method int RecyclerView$LayoutManager.getPaddingBottom()>
	//    6   14:isub            
	//    7   15:ireturn         
	}

	public int getParentStart()
	{
		return getPaddingTop();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field RecyclerView$LayoutManager this$0>
	//    2    4:invokevirtual   #67  <Method int RecyclerView$LayoutManager.getPaddingTop()>
	//    3    7:ireturn         
	}

	final RecyclerView.LayoutManager this$0;

	RecyclerView$LayoutManager$2()
	{
		this$0 = RecyclerView.LayoutManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field RecyclerView$LayoutManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
