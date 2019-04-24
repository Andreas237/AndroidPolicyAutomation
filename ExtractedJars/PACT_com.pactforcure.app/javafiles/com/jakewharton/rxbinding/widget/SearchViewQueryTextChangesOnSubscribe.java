// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.SearchView;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;

final class SearchViewQueryTextChangesOnSubscribe
	implements rx.Observable.OnSubscribe
{

	SearchViewQueryTextChangesOnSubscribe(SearchView searchview)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		view = searchview;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field SearchView view>
	//    5    9:return          
	}

	public volatile void call(Object obj)
	{
		call((Subscriber)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class Subscriber>
	//    3    5:invokevirtual   #30  <Method void call(Subscriber)>
	//    4    8:return          
	}

	public void call(final Subscriber subscriber)
	{
		Preconditions.checkUiThread();
	//    0    0:invokestatic    #35  <Method void Preconditions.checkUiThread()>
		android.widget.SearchView.OnQueryTextListener onquerytextlistener = new android.widget.SearchView.OnQueryTextListener() {

			public boolean onQueryTextChange(String s)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            20
				{
					subscriber.onNext(((Object) (s)));
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field Subscriber val$subscriber>
			//    6   14:aload_1         
			//    7   15:invokevirtual   #37  <Method void Subscriber.onNext(Object)>
					return true;
			//    8   18:iconst_1        
			//    9   19:ireturn         
				} else
				{
					return false;
			//   10   20:iconst_0        
			//   11   21:ireturn         
				}
			}

			public boolean onQueryTextSubmit(String s)
			{
				return false;
			//    0    0:iconst_0        
			//    1    1:ireturn         
			}

			final SearchViewQueryTextChangesOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = SearchViewQueryTextChangesOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field SearchViewQueryTextChangesOnSubscribe this$0>
				subscriber = subscriber1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Subscriber val$subscriber>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    1    3:new             #9   <Class SearchViewQueryTextChangesOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #38  <Method void SearchViewQueryTextChangesOnSubscribe$1(SearchViewQueryTextChangesOnSubscribe, Subscriber)>
	//    6   12:astore_2        
		view.setOnQueryTextListener(onquerytextlistener);
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field SearchView view>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #44  <Method void SearchView.setOnQueryTextListener(android.widget.SearchView$OnQueryTextListener)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.setOnQueryTextListener(((android.widget.SearchView.OnQueryTextListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SearchViewQueryTextChangesOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method SearchView SearchViewQueryTextChangesOnSubscribe.access$000(SearchViewQueryTextChangesOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void SearchView.setOnQueryTextListener(android.widget.SearchView$OnQueryTextListener)>
			//    5   11:return          
			}

			final SearchViewQueryTextChangesOnSubscribe this$0;

			
			{
				this$0 = SearchViewQueryTextChangesOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field SearchViewQueryTextChangesOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class SearchViewQueryTextChangesOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #47  <Method void SearchViewQueryTextChangesOnSubscribe$2(SearchViewQueryTextChangesOnSubscribe)>
	//   16   30:invokevirtual   #51  <Method void Subscriber.add(rx.Subscription)>
		subscriber.onNext(((Object) (view.getQuery())));
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #20  <Field SearchView view>
	//   20   38:invokevirtual   #55  <Method CharSequence SearchView.getQuery()>
	//   21   41:invokevirtual   #58  <Method void Subscriber.onNext(Object)>
	//   22   44:return          
	}

	private final SearchView view;


/*
	static SearchView access$000(SearchViewQueryTextChangesOnSubscribe searchviewquerytextchangesonsubscribe)
	{
		return searchviewquerytextchangesonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SearchView view>
	//    2    4:areturn         
	}

*/
}
