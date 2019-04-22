// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.support.v4.widget.SwipeRefreshLayout;

// Referenced classes of package com.appboy.ui:
//			AppboyContentCardsFragment

class AppboyContentCardsFragment$1
	implements Runnable
{

	public void run()
	{
		AppboyContentCardsFragment.access$100(AppboyContentCardsFragment.this).setRefreshing(false);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AppboyContentCardsFragment this$0>
	//    2    4:invokestatic    #25  <Method SwipeRefreshLayout AppboyContentCardsFragment.access$100(AppboyContentCardsFragment)>
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #31  <Method void SwipeRefreshLayout.setRefreshing(boolean)>
	//    5   11:return          
	}

	final AppboyContentCardsFragment this$0;

	AppboyContentCardsFragment$1()
	{
		this$0 = AppboyContentCardsFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AppboyContentCardsFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
