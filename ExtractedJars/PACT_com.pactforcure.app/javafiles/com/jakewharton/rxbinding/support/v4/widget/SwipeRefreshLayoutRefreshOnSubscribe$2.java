// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.v4.widget;

import android.support.v4.widget.SwipeRefreshLayout;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;

// Referenced classes of package com.jakewharton.rxbinding.support.v4.widget:
//			SwipeRefreshLayoutRefreshOnSubscribe

class SwipeRefreshLayoutRefreshOnSubscribe$2 extends MainThreadSubscription
{

	protected void onUnsubscribe()
	{
		SwipeRefreshLayoutRefreshOnSubscribe.access$000(SwipeRefreshLayoutRefreshOnSubscribe.this).setOnRefreshListener(((android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SwipeRefreshLayoutRefreshOnSubscribe this$0>
	//    2    4:invokestatic    #24  <Method SwipeRefreshLayout SwipeRefreshLayoutRefreshOnSubscribe.access$000(SwipeRefreshLayoutRefreshOnSubscribe)>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #30  <Method void SwipeRefreshLayout.setOnRefreshListener(android.support.v4.widget.SwipeRefreshLayout$OnRefreshListener)>
	//    5   11:return          
	}

	final SwipeRefreshLayoutRefreshOnSubscribe this$0;

	SwipeRefreshLayoutRefreshOnSubscribe$2()
	{
		this$0 = SwipeRefreshLayoutRefreshOnSubscribe.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field SwipeRefreshLayoutRefreshOnSubscribe this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
	//    5    9:return          
	}
}
