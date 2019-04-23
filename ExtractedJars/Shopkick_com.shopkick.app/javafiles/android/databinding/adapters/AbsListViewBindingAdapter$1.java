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
		Scroll scroll = val$scrollListener;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AbsListViewBindingAdapter$OnScroll val$scrollListener>
	//    2    4:astore          5
		if(scroll != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          23
			scroll.onScroll(abslistview, i, j, k);
	//    5   11:aload           5
	//    6   13:aload_1         
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:iload           4
	//   10   18:invokeinterface #31  <Method void AbsListViewBindingAdapter$OnScroll.onScroll(AbsListView, int, int, int)>
	//   11   23:return          
	}

	public void onScrollStateChanged(AbsListView abslistview, int i)
	{
		ScrollStateChanged scrollstatechanged = val$scrollStateListener;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AbsListViewBindingAdapter$OnScrollStateChanged val$scrollStateListener>
	//    2    4:astore_3        
		if(scrollstatechanged != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
			scrollstatechanged.onScrollStateChanged(abslistview, i);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:invokeinterface #37  <Method void AbsListViewBindingAdapter$OnScrollStateChanged.onScrollStateChanged(AbsListView, int)>
	//    9   17:return          
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
