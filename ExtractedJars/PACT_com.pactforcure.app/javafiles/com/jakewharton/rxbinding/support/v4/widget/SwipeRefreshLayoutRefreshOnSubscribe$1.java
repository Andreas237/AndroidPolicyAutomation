// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.v4.widget;

import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.support.v4.widget:
//			SwipeRefreshLayoutRefreshOnSubscribe

class SwipeRefreshLayoutRefreshOnSubscribe$1
	implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
{

	public void onRefresh()
	{
		val$subscriber.onNext(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Subscriber val$subscriber>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #32  <Method void Subscriber.onNext(Object)>
	//    4    8:return          
	}

	final SwipeRefreshLayoutRefreshOnSubscribe this$0;
	final Subscriber val$subscriber;

	SwipeRefreshLayoutRefreshOnSubscribe$1()
	{
		this$0 = final_swiperefreshlayoutrefreshonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field SwipeRefreshLayoutRefreshOnSubscribe this$0>
		val$subscriber = Subscriber.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Subscriber val$subscriber>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
