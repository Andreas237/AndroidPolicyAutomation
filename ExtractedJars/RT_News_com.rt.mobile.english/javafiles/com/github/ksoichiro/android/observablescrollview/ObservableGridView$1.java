// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.ksoichiro.android.observablescrollview;

import android.widget.AbsListView;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//			ObservableGridView

class ObservableGridView$1
	implements android.widget.istener
{

	public void onScroll(AbsListView abslistview, int i, int j, int k)
	{
		if(ObservableGridView.access$000(ObservableGridView.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field ObservableGridView this$0>
	//*   2    4:invokestatic    #24  <Method android.widget.AbsListView$OnScrollListener ObservableGridView.access$000(ObservableGridView)>
	//*   3    7:ifnull          27
			ObservableGridView.access$000(ObservableGridView.this).onScroll(abslistview, i, j, k);
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field ObservableGridView this$0>
	//    6   14:invokestatic    #24  <Method android.widget.AbsListView$OnScrollListener ObservableGridView.access$000(ObservableGridView)>
	//    7   17:aload_1         
	//    8   18:iload_2         
	//    9   19:iload_3         
	//   10   20:iload           4
	//   11   22:invokeinterface #26  <Method void android.widget.AbsListView$OnScrollListener.onScroll(AbsListView, int, int, int)>
		ObservableGridView.access$100(ObservableGridView.this);
	//   12   27:aload_0         
	//   13   28:getfield        #14  <Field ObservableGridView this$0>
	//   14   31:invokestatic    #29  <Method void ObservableGridView.access$100(ObservableGridView)>
	//   15   34:return          
	}

	public void onScrollStateChanged(AbsListView abslistview, int i)
	{
		if(ObservableGridView.access$000(ObservableGridView.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field ObservableGridView this$0>
	//*   2    4:invokestatic    #24  <Method android.widget.AbsListView$OnScrollListener ObservableGridView.access$000(ObservableGridView)>
	//*   3    7:ifnull          24
			ObservableGridView.access$000(ObservableGridView.this).onScrollStateChanged(abslistview, i);
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field ObservableGridView this$0>
	//    6   14:invokestatic    #24  <Method android.widget.AbsListView$OnScrollListener ObservableGridView.access$000(ObservableGridView)>
	//    7   17:aload_1         
	//    8   18:iload_2         
	//    9   19:invokeinterface #33  <Method void android.widget.AbsListView$OnScrollListener.onScrollStateChanged(AbsListView, int)>
	//   10   24:return          
	}

	final ObservableGridView this$0;

	ObservableGridView$1()
	{
		this$0 = ObservableGridView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ObservableGridView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
