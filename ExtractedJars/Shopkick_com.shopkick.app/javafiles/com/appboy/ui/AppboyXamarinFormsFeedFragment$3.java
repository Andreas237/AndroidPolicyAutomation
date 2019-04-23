// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.support.v4.widget.SwipeRefreshLayout;
import android.widget.AbsListView;
import com.appboy.ui.adapters.AppboyListAdapter;

// Referenced classes of package com.appboy.ui:
//			AppboyXamarinFormsFeedFragment

class AppboyXamarinFormsFeedFragment$3
	implements android.widget.AbsListView.OnScrollListener
{

	public void onScroll(AbsListView abslistview, int i, int j, int k)
	{
		abslistview = ((AbsListView) (AppboyXamarinFormsFeedFragment.access$300(AppboyXamarinFormsFeedFragment.this)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AppboyXamarinFormsFeedFragment this$0>
	//    2    4:invokestatic    #27  <Method SwipeRefreshLayout AppboyXamarinFormsFeedFragment.access$300(AppboyXamarinFormsFeedFragment)>
	//    3    7:astore_1        
		boolean flag;
		if(i == 0)
	//*   4    8:iload_2         
	//*   5    9:ifne            18
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore          5
		else
	//*   8   15:goto            21
			flag = false;
	//    9   18:iconst_0        
	//   10   19:istore          5
		((SwipeRefreshLayout) (abslistview)).setEnabled(flag);
	//   11   21:aload_1         
	//   12   22:iload           5
	//   13   24:invokevirtual   #33  <Method void SwipeRefreshLayout.setEnabled(boolean)>
		if(j == 0)
	//*  14   27:iload_3         
	//*  15   28:ifne            32
			return;
	//   16   31:return          
		k = i - 1;
	//   17   32:iload_2         
	//   18   33:iconst_1        
	//   19   34:isub            
	//   20   35:istore          4
		if(k > AppboyXamarinFormsFeedFragment.access$400(AppboyXamarinFormsFeedFragment.this))
	//*  21   37:iload           4
	//*  22   39:aload_0         
	//*  23   40:getfield        #17  <Field AppboyXamarinFormsFeedFragment this$0>
	//*  24   43:invokestatic    #37  <Method int AppboyXamarinFormsFeedFragment.access$400(AppboyXamarinFormsFeedFragment)>
	//*  25   46:icmple          68
			AppboyXamarinFormsFeedFragment.access$500(AppboyXamarinFormsFeedFragment.this).batchSetCardsToRead(AppboyXamarinFormsFeedFragment.access$400(AppboyXamarinFormsFeedFragment.this), k);
	//   26   49:aload_0         
	//   27   50:getfield        #17  <Field AppboyXamarinFormsFeedFragment this$0>
	//   28   53:invokestatic    #41  <Method AppboyListAdapter AppboyXamarinFormsFeedFragment.access$500(AppboyXamarinFormsFeedFragment)>
	//   29   56:aload_0         
	//   30   57:getfield        #17  <Field AppboyXamarinFormsFeedFragment this$0>
	//   31   60:invokestatic    #37  <Method int AppboyXamarinFormsFeedFragment.access$400(AppboyXamarinFormsFeedFragment)>
	//   32   63:iload           4
	//   33   65:invokevirtual   #47  <Method void AppboyListAdapter.batchSetCardsToRead(int, int)>
		AppboyXamarinFormsFeedFragment.access$402(AppboyXamarinFormsFeedFragment.this, k);
	//   34   68:aload_0         
	//   35   69:getfield        #17  <Field AppboyXamarinFormsFeedFragment this$0>
	//   36   72:iload           4
	//   37   74:invokestatic    #51  <Method int AppboyXamarinFormsFeedFragment.access$402(AppboyXamarinFormsFeedFragment, int)>
	//   38   77:pop             
		AppboyXamarinFormsFeedFragment.access$602(AppboyXamarinFormsFeedFragment.this, i + j);
	//   39   78:aload_0         
	//   40   79:getfield        #17  <Field AppboyXamarinFormsFeedFragment this$0>
	//   41   82:iload_2         
	//   42   83:iload_3         
	//   43   84:iadd            
	//   44   85:invokestatic    #54  <Method int AppboyXamarinFormsFeedFragment.access$602(AppboyXamarinFormsFeedFragment, int)>
	//   45   88:pop             
	//   46   89:return          
	}

	public void onScrollStateChanged(AbsListView abslistview, int i)
	{
	//    0    0:return          
	}

	final AppboyXamarinFormsFeedFragment this$0;

	AppboyXamarinFormsFeedFragment$3()
	{
		this$0 = AppboyXamarinFormsFeedFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AppboyXamarinFormsFeedFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
