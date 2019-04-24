// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.ksoichiro.android.observablescrollview;

import android.widget.AbsListView;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//			ObservableListView

class ObservableListView$1
	implements android.widget.istener
{

	public void onScroll(AbsListView abslistview, int i, int j, int k)
	{
		if(ObservableListView.access$000(ObservableListView.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field ObservableListView this$0>
	//*   2    4:invokestatic    #24  <Method android.widget.AbsListView$OnScrollListener ObservableListView.access$000(ObservableListView)>
	//*   3    7:ifnull          27
			ObservableListView.access$000(ObservableListView.this).onScroll(abslistview, i, j, k);
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field ObservableListView this$0>
	//    6   14:invokestatic    #24  <Method android.widget.AbsListView$OnScrollListener ObservableListView.access$000(ObservableListView)>
	//    7   17:aload_1         
	//    8   18:iload_2         
	//    9   19:iload_3         
	//   10   20:iload           4
	//   11   22:invokeinterface #26  <Method void android.widget.AbsListView$OnScrollListener.onScroll(AbsListView, int, int, int)>
		ObservableListView.access$100(ObservableListView.this);
	//   12   27:aload_0         
	//   13   28:getfield        #14  <Field ObservableListView this$0>
	//   14   31:invokestatic    #29  <Method void ObservableListView.access$100(ObservableListView)>
	//   15   34:return          
	}

	public void onScrollStateChanged(AbsListView abslistview, int i)
	{
		if(ObservableListView.access$000(ObservableListView.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field ObservableListView this$0>
	//*   2    4:invokestatic    #24  <Method android.widget.AbsListView$OnScrollListener ObservableListView.access$000(ObservableListView)>
	//*   3    7:ifnull          24
			ObservableListView.access$000(ObservableListView.this).onScrollStateChanged(abslistview, i);
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field ObservableListView this$0>
	//    6   14:invokestatic    #24  <Method android.widget.AbsListView$OnScrollListener ObservableListView.access$000(ObservableListView)>
	//    7   17:aload_1         
	//    8   18:iload_2         
	//    9   19:invokeinterface #33  <Method void android.widget.AbsListView$OnScrollListener.onScrollStateChanged(AbsListView, int)>
	//   10   24:return          
	}

	final ObservableListView this$0;

	ObservableListView$1()
	{
		this$0 = ObservableListView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ObservableListView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
