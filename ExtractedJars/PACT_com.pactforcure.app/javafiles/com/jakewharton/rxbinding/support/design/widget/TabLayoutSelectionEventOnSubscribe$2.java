// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.design.widget;

import android.support.design.widget.TabLayout;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;

// Referenced classes of package com.jakewharton.rxbinding.support.design.widget:
//			TabLayoutSelectionEventOnSubscribe

class TabLayoutSelectionEventOnSubscribe$2 extends MainThreadSubscription
{

	protected void onUnsubscribe()
	{
		TabLayoutSelectionEventOnSubscribe.access$000(TabLayoutSelectionEventOnSubscribe.this).setOnTabSelectedListener(((android.support.design.widget.TabLayout.OnTabSelectedListener) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field TabLayoutSelectionEventOnSubscribe this$0>
	//    2    4:invokestatic    #24  <Method TabLayout TabLayoutSelectionEventOnSubscribe.access$000(TabLayoutSelectionEventOnSubscribe)>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #30  <Method void TabLayout.setOnTabSelectedListener(android.support.design.widget.TabLayout$OnTabSelectedListener)>
	//    5   11:return          
	}

	final TabLayoutSelectionEventOnSubscribe this$0;

	TabLayoutSelectionEventOnSubscribe$2()
	{
		this$0 = TabLayoutSelectionEventOnSubscribe.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field TabLayoutSelectionEventOnSubscribe this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
	//    5    9:return          
	}
}
