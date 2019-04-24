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
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	public static void setOnScroll(AbsListView abslistview, OnScroll onscroll, OnScrollStateChanged onscrollstatechanged)
	{
		abslistview.setOnScrollListener(new android.widget.AbsListView.OnScrollListener(onscrollstatechanged, onscroll) {

			public void onScroll(AbsListView abslistview1, int i, int j, int k)
			{
				if(scrollListener != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field AbsListViewBindingAdapter$OnScroll val$scrollListener>
			//*   2    4:ifnull          21
					scrollListener.onScroll(abslistview1, i, j, k);
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field AbsListViewBindingAdapter$OnScroll val$scrollListener>
			//    5   11:aload_1         
			//    6   12:iload_2         
			//    7   13:iload_3         
			//    8   14:iload           4
			//    9   16:invokeinterface #31  <Method void AbsListViewBindingAdapter$OnScroll.onScroll(AbsListView, int, int, int)>
			//   10   21:return          
			}

			public void onScrollStateChanged(AbsListView abslistview1, int i)
			{
				if(scrollStateListener != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field AbsListViewBindingAdapter$OnScrollStateChanged val$scrollStateListener>
			//*   2    4:ifnull          18
					scrollStateListener.onScrollStateChanged(abslistview1, i);
			//    3    7:aload_0         
			//    4    8:getfield        #19  <Field AbsListViewBindingAdapter$OnScrollStateChanged val$scrollStateListener>
			//    5   11:aload_1         
			//    6   12:iload_2         
			//    7   13:invokeinterface #37  <Method void AbsListViewBindingAdapter$OnScrollStateChanged.onScrollStateChanged(AbsListView, int)>
			//    8   18:return          
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
	//    5    7:invokespecial   #42  <Method void AbsListViewBindingAdapter$1(AbsListViewBindingAdapter$OnScrollStateChanged, AbsListViewBindingAdapter$OnScroll)>
	//    6   10:invokevirtual   #48  <Method void AbsListView.setOnScrollListener(android.widget.AbsListView$OnScrollListener)>
	//    7   13:return          
	}
}
