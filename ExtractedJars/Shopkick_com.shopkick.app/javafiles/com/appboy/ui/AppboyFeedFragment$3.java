// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.support.v4.widget.SwipeRefreshLayout;
import android.widget.AbsListView;
import com.appboy.ui.adapters.AppboyListAdapter;

// Referenced classes of package com.appboy.ui:
//			AppboyFeedFragment

class AppboyFeedFragment$3
	implements android.widget.istener
{

	public void onScroll(AbsListView abslistview, int i, int j, int k)
	{
		abslistview = ((AbsListView) (AppboyFeedFragment.access$300(AppboyFeedFragment.this)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AppboyFeedFragment this$0>
	//    2    4:invokestatic    #27  <Method SwipeRefreshLayout AppboyFeedFragment.access$300(AppboyFeedFragment)>
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
		if(k > mPreviousVisibleHeadCardIndex)
	//*  21   37:iload           4
	//*  22   39:aload_0         
	//*  23   40:getfield        #17  <Field AppboyFeedFragment this$0>
	//*  24   43:getfield        #37  <Field int AppboyFeedFragment.mPreviousVisibleHeadCardIndex>
	//*  25   46:icmple          68
			AppboyFeedFragment.access$400(AppboyFeedFragment.this).batchSetCardsToRead(mPreviousVisibleHeadCardIndex, k);
	//   26   49:aload_0         
	//   27   50:getfield        #17  <Field AppboyFeedFragment this$0>
	//   28   53:invokestatic    #41  <Method AppboyListAdapter AppboyFeedFragment.access$400(AppboyFeedFragment)>
	//   29   56:aload_0         
	//   30   57:getfield        #17  <Field AppboyFeedFragment this$0>
	//   31   60:getfield        #37  <Field int AppboyFeedFragment.mPreviousVisibleHeadCardIndex>
	//   32   63:iload           4
	//   33   65:invokevirtual   #47  <Method void AppboyListAdapter.batchSetCardsToRead(int, int)>
		abslistview = ((AbsListView) (AppboyFeedFragment.this));
	//   34   68:aload_0         
	//   35   69:getfield        #17  <Field AppboyFeedFragment this$0>
	//   36   72:astore_1        
		abslistview.mPreviousVisibleHeadCardIndex = k;
	//   37   73:aload_1         
	//   38   74:iload           4
	//   39   76:putfield        #37  <Field int AppboyFeedFragment.mPreviousVisibleHeadCardIndex>
		abslistview.mCurrentCardIndexAtBottomOfScreen = i + j;
	//   40   79:aload_1         
	//   41   80:iload_2         
	//   42   81:iload_3         
	//   43   82:iadd            
	//   44   83:putfield        #50  <Field int AppboyFeedFragment.mCurrentCardIndexAtBottomOfScreen>
	//   45   86:return          
	}

	public void onScrollStateChanged(AbsListView abslistview, int i)
	{
	//    0    0:return          
	}

	final AppboyFeedFragment this$0;

	AppboyFeedFragment$3()
	{
		this$0 = AppboyFeedFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AppboyFeedFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
