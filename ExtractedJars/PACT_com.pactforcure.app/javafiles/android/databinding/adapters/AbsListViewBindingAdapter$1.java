// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.widget.AbsListView;

// Referenced classes of package android.databinding.adapters:
//			AbsListViewBindingAdapter

static final class AbsListViewBindingAdapter$1
	implements android.widget.
{

	public void onScroll(AbsListView abslistview, int i, int j, int k)
	{
		if(val$scrollListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field AbsListViewBindingAdapter$OnScroll val$scrollListener>
	//*   2    4:ifnull          21
			val$scrollListener.onScroll(abslistview, i, j, k);
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field AbsListViewBindingAdapter$OnScroll val$scrollListener>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:iload           4
	//    9   16:invokeinterface #31  <Method void AbsListViewBindingAdapter$OnScroll.onScroll(AbsListView, int, int, int)>
	//   10   21:return          
	}

	public void onScrollStateChanged(AbsListView abslistview, int i)
	{
		if(val$scrollStateListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field AbsListViewBindingAdapter$OnScrollStateChanged val$scrollStateListener>
	//*   2    4:ifnull          18
			val$scrollStateListener.onScrollStateChanged(abslistview, i);
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field AbsListViewBindingAdapter$OnScrollStateChanged val$scrollStateListener>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:invokeinterface #37  <Method void AbsListViewBindingAdapter$OnScrollStateChanged.onScrollStateChanged(AbsListView, int)>
	//    8   18:return          
	}

	final Scroll val$scrollListener;
	final ScrollStateChanged val$scrollStateListener;

	AbsListViewBindingAdapter$1(ScrollStateChanged scrollstatechanged, Scroll scroll)
	{
		val$scrollStateListener = scrollstatechanged;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AbsListViewBindingAdapter$OnScrollStateChanged val$scrollStateListener>
		val$scrollListener = scroll;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field AbsListViewBindingAdapter$OnScroll val$scrollListener>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
