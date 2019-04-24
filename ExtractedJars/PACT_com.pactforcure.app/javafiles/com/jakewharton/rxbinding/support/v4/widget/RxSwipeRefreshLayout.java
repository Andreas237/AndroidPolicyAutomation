// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.v4.widget;

import android.support.v4.widget.SwipeRefreshLayout;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package com.jakewharton.rxbinding.support.v4.widget:
//			SwipeRefreshLayoutRefreshOnSubscribe

public final class RxSwipeRefreshLayout
{

	private RxSwipeRefreshLayout()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
		throw new AssertionError("No instances.");
	//    2    4:new             #12  <Class AssertionError>
	//    3    7:dup             
	//    4    8:ldc1            #14  <String "No instances.">
	//    5   10:invokespecial   #17  <Method void AssertionError(Object)>
	//    6   13:athrow          
	}

	public static Observable refreshes(SwipeRefreshLayout swiperefreshlayout)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new SwipeRefreshLayoutRefreshOnSubscribe(swiperefreshlayout))));
	//    0    0:new             #24  <Class SwipeRefreshLayoutRefreshOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #27  <Method void SwipeRefreshLayoutRefreshOnSubscribe(SwipeRefreshLayout)>
	//    4    8:invokestatic    #33  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}

	public static Action1 refreshing(SwipeRefreshLayout swiperefreshlayout)
	{
		return new Action1(swiperefreshlayout) {

			public void call(Boolean boolean1)
			{
				view.setRefreshing(boolean1.booleanValue());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field SwipeRefreshLayout val$view>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #30  <Method boolean Boolean.booleanValue()>
			//    4    8:invokevirtual   #36  <Method void SwipeRefreshLayout.setRefreshing(boolean)>
			//    5   11:return          
			}

			public volatile void call(Object obj)
			{
				call((Boolean)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class Boolean>
			//    3    5:invokevirtual   #39  <Method void call(Boolean)>
			//    4    8:return          
			}

			final SwipeRefreshLayout val$view;

			
			{
				view = swiperefreshlayout;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field SwipeRefreshLayout val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #6   <Class RxSwipeRefreshLayout$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #40  <Method void RxSwipeRefreshLayout$1(SwipeRefreshLayout)>
	//    4    8:areturn         
	}
}
