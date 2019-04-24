// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.design.widget;

import android.support.design.widget.NavigationView;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;

// Referenced classes of package com.jakewharton.rxbinding.support.design.widget:
//			NavigationViewItemSelectionsOnSubscribe

class NavigationViewItemSelectionsOnSubscribe$2 extends MainThreadSubscription
{

	protected void onUnsubscribe()
	{
		NavigationViewItemSelectionsOnSubscribe.access$000(NavigationViewItemSelectionsOnSubscribe.this).setNavigationItemSelectedListener(((android.support.design.widget.tener) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field NavigationViewItemSelectionsOnSubscribe this$0>
	//    2    4:invokestatic    #24  <Method NavigationView NavigationViewItemSelectionsOnSubscribe.access$000(NavigationViewItemSelectionsOnSubscribe)>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #30  <Method void NavigationView.setNavigationItemSelectedListener(android.support.design.widget.NavigationView$OnNavigationItemSelectedListener)>
	//    5   11:return          
	}

	final NavigationViewItemSelectionsOnSubscribe this$0;

	NavigationViewItemSelectionsOnSubscribe$2()
	{
		this$0 = NavigationViewItemSelectionsOnSubscribe.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field NavigationViewItemSelectionsOnSubscribe this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
	//    5    9:return          
	}
}
