// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.integration.recyclerview;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public final class RecyclerToListViewScrollListener extends android.support.v7.widget.RecyclerView.OnScrollListener
{

	public RecyclerToListViewScrollListener(android.widget.AbsListView.OnScrollListener onscrolllistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void android.support.v7.widget.RecyclerView$OnScrollListener()>
		lastFirstVisible = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #20  <Field int lastFirstVisible>
		lastVisibleCount = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #22  <Field int lastVisibleCount>
		lastItemCount = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #24  <Field int lastItemCount>
		scrollListener = onscrolllistener;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #26  <Field android.widget.AbsListView$OnScrollListener scrollListener>
	//   14   24:return          
	}

	public void onScrollStateChanged(RecyclerView recyclerview, int i)
	{
		switch(i)
	//*   0    0:iload_2         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 44
	//	               1 39
	//	               2 34
		default:
			i = 0x80000000;
	//    2   28:ldc1            #7   <Int 0x80000000>
	//    3   30:istore_2        
			break;

	//*   4   31:goto            46
		case 2: // '\002'
			i = 2;
	//    5   34:iconst_2        
	//    6   35:istore_2        
			break;

	//*   7   36:goto            46
		case 1: // '\001'
			i = 1;
	//    8   39:iconst_1        
	//    9   40:istore_2        
			break;

	//*  10   41:goto            46
		case 0: // '\0'
			i = 0;
	//   11   44:iconst_0        
	//   12   45:istore_2        
			break;
		}
		scrollListener.onScrollStateChanged(((android.widget.AbsListView) (null)), i);
	//   13   46:aload_0         
	//   14   47:getfield        #26  <Field android.widget.AbsListView$OnScrollListener scrollListener>
	//   15   50:aconst_null     
	//   16   51:iload_2         
	//   17   52:invokeinterface #35  <Method void android.widget.AbsListView$OnScrollListener.onScrollStateChanged(android.widget.AbsListView, int)>
	//   18   57:return          
	}

	public void onScrolled(RecyclerView recyclerview, int i, int j)
	{
		LinearLayoutManager linearlayoutmanager = (LinearLayoutManager)recyclerview.getLayoutManager();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #43  <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//    2    4:checkcast       #45  <Class LinearLayoutManager>
	//    3    7:astore          5
		i = linearlayoutmanager.findFirstVisibleItemPosition();
	//    4    9:aload           5
	//    5   11:invokevirtual   #49  <Method int LinearLayoutManager.findFirstVisibleItemPosition()>
	//    6   14:istore_2        
		j = Math.abs(i - linearlayoutmanager.findLastVisibleItemPosition());
	//    7   15:iload_2         
	//    8   16:aload           5
	//    9   18:invokevirtual   #52  <Method int LinearLayoutManager.findLastVisibleItemPosition()>
	//   10   21:isub            
	//   11   22:invokestatic    #58  <Method int Math.abs(int)>
	//   12   25:istore_3        
		int k = recyclerview.getAdapter().getItemCount();
	//   13   26:aload_1         
	//   14   27:invokevirtual   #62  <Method android.support.v7.widget.RecyclerView$Adapter RecyclerView.getAdapter()>
	//   15   30:invokevirtual   #67  <Method int android.support.v7.widget.RecyclerView$Adapter.getItemCount()>
	//   16   33:istore          4
		if(i != lastFirstVisible || j != lastVisibleCount || k != lastItemCount)
	//*  17   35:iload_2         
	//*  18   36:aload_0         
	//*  19   37:getfield        #20  <Field int lastFirstVisible>
	//*  20   40:icmpne          60
	//*  21   43:iload_3         
	//*  22   44:aload_0         
	//*  23   45:getfield        #22  <Field int lastVisibleCount>
	//*  24   48:icmpne          60
	//*  25   51:iload           4
	//*  26   53:aload_0         
	//*  27   54:getfield        #24  <Field int lastItemCount>
	//*  28   57:icmpeq          90
		{
			scrollListener.onScroll(((android.widget.AbsListView) (null)), i, j, k);
	//   29   60:aload_0         
	//   30   61:getfield        #26  <Field android.widget.AbsListView$OnScrollListener scrollListener>
	//   31   64:aconst_null     
	//   32   65:iload_2         
	//   33   66:iload_3         
	//   34   67:iload           4
	//   35   69:invokeinterface #71  <Method void android.widget.AbsListView$OnScrollListener.onScroll(android.widget.AbsListView, int, int, int)>
			lastFirstVisible = i;
	//   36   74:aload_0         
	//   37   75:iload_2         
	//   38   76:putfield        #20  <Field int lastFirstVisible>
			lastVisibleCount = j;
	//   39   79:aload_0         
	//   40   80:iload_3         
	//   41   81:putfield        #22  <Field int lastVisibleCount>
			lastItemCount = k;
	//   42   84:aload_0         
	//   43   85:iload           4
	//   44   87:putfield        #24  <Field int lastItemCount>
		}
	//   45   90:return          
	}

	public static final int UNKNOWN_SCROLL_STATE = 0x80000000;
	private int lastFirstVisible;
	private int lastItemCount;
	private int lastVisibleCount;
	private final android.widget.AbsListView.OnScrollListener scrollListener;
}
