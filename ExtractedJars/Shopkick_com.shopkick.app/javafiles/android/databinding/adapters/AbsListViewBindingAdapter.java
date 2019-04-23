// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.widget.AbsListView;

public class AbsListViewBindingAdapter
{
	public static interface OnScroll
	{

		public abstract void onScroll(AbsListView abslistview, int i, int j, int k);
	}

	public static interface OnScrollStateChanged
	{

		public abstract void onScrollStateChanged(AbsListView abslistview, int i);
	}


	public AbsListViewBindingAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:return          
	}

	public static void setOnScroll(AbsListView abslistview, OnScroll onscroll, OnScrollStateChanged onscrollstatechanged)
	{
		abslistview.setOnScrollListener(new android.widget.AbsListView.OnScrollListener(onscrollstatechanged, onscroll) {

			public void onScroll(AbsListView abslistview1, int i, int j, int k)
			{
				OnScroll onscroll1 = scrollListener;
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field AbsListViewBindingAdapter$OnScroll val$scrollListener>
			//    2    4:astore          5
				if(onscroll1 != null)
			//*   3    6:aload           5
			//*   4    8:ifnull          23
					onscroll1.onScroll(abslistview1, i, j, k);
			//    5   11:aload           5
			//    6   13:aload_1         
			//    7   14:iload_2         
			//    8   15:iload_3         
			//    9   16:iload           4
			//   10   18:invokeinterface #31  <Method void AbsListViewBindingAdapter$OnScroll.onScroll(AbsListView, int, int, int)>
			//   11   23:return          
			}

			public void onScrollStateChanged(AbsListView abslistview1, int i)
			{
				OnScrollStateChanged onscrollstatechanged1 = scrollStateListener;
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field AbsListViewBindingAdapter$OnScrollStateChanged val$scrollStateListener>
			//    2    4:astore_3        
				if(onscrollstatechanged1 != null)
			//*   3    5:aload_3         
			//*   4    6:ifnull          17
					onscrollstatechanged1.onScrollStateChanged(abslistview1, i);
			//    5    9:aload_3         
			//    6   10:aload_1         
			//    7   11:iload_2         
			//    8   12:invokeinterface #37  <Method void AbsListViewBindingAdapter$OnScrollStateChanged.onScrollStateChanged(AbsListView, int)>
			//    9   17:return          
			}

			final OnScroll val$scrollListener;
			final OnScrollStateChanged val$scrollStateListener;

			
			{
				scrollStateListener = onscrollstatechanged;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AbsListViewBindingAdapter$OnScrollStateChanged val$scrollStateListener>
				scrollListener = onscroll;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field AbsListViewBindingAdapter$OnScroll val$scrollListener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #6   <Class AbsListViewBindingAdapter$1>
	//    2    4:dup             
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokespecial   #45  <Method void AbsListViewBindingAdapter$1(AbsListViewBindingAdapter$OnScrollStateChanged, AbsListViewBindingAdapter$OnScroll)>
	//    6   10:invokevirtual   #51  <Method void AbsListView.setOnScrollListener(android.widget.AbsListView$OnScrollListener)>
	//    7   13:return          
	}
}
