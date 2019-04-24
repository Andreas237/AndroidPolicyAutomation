// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.SearchView;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			SearchViewQueryTextEvent

final class SearchViewQueryTextChangeEventsOnSubscribe
	implements rx.Observable.OnSubscribe
{

	SearchViewQueryTextChangeEventsOnSubscribe(SearchView searchview)
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
				boolean flag = false;
			//    0    0:iconst_0        
			//    1    1:istore_2        
				if(!subscriber.isUnsubscribed())
			//*   2    2:aload_0         
			//*   3    3:getfield        #21  <Field Subscriber val$subscriber>
			//*   4    6:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
			//*   5    9:ifne            33
				{
					subscriber.onNext(((Object) (SearchViewQueryTextEvent.create(view, ((CharSequence) (s)), false))));
			//    6   12:aload_0         
			//    7   13:getfield        #21  <Field Subscriber val$subscriber>
			//    8   16:aload_0         
			//    9   17:getfield        #19  <Field SearchViewQueryTextChangeEventsOnSubscribe this$0>
			//   10   20:invokestatic    #37  <Method SearchView SearchViewQueryTextChangeEventsOnSubscribe.access$000(SearchViewQueryTextChangeEventsOnSubscribe)>
			//   11   23:aload_1         
			//   12   24:iconst_0        
			//   13   25:invokestatic    #43  <Method SearchViewQueryTextEvent SearchViewQueryTextEvent.create(SearchView, CharSequence, boolean)>
			//   14   28:invokevirtual   #47  <Method void Subscriber.onNext(Object)>
					flag = true;
			//   15   31:iconst_1        
			//   16   32:istore_2        
				}
				return flag;
			//   17   33:iload_2         
			//   18   34:ireturn         
			}

			public boolean onQueryTextSubmit(String s)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            40
				{
					subscriber.onNext(((Object) (SearchViewQueryTextEvent.create(view, view.getQuery(), true))));
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field Subscriber val$subscriber>
			//    6   14:aload_0         
			//    7   15:getfield        #19  <Field SearchViewQueryTextChangeEventsOnSubscribe this$0>
			//    8   18:invokestatic    #37  <Method SearchView SearchViewQueryTextChangeEventsOnSubscribe.access$000(SearchViewQueryTextChangeEventsOnSubscribe)>
			//    9   21:aload_0         
			//   10   22:getfield        #19  <Field SearchViewQueryTextChangeEventsOnSubscribe this$0>
			//   11   25:invokestatic    #37  <Method SearchView SearchViewQueryTextChangeEventsOnSubscribe.access$000(SearchViewQueryTextChangeEventsOnSubscribe)>
			//   12   28:invokevirtual   #54  <Method CharSequence SearchView.getQuery()>
			//   13   31:iconst_1        
			//   14   32:invokestatic    #43  <Method SearchViewQueryTextEvent SearchViewQueryTextEvent.create(SearchView, CharSequence, boolean)>
			//   15   35:invokevirtual   #47  <Method void Subscriber.onNext(Object)>
					return true;
			//   16   38:iconst_1        
			//   17   39:ireturn         
				} else
				{
					return false;
			//   18   40:iconst_0        
			//   19   41:ireturn         
				}
			}

			final SearchViewQueryTextChangeEventsOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = SearchViewQueryTextChangeEventsOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field SearchViewQueryTextChangeEventsOnSubscribe this$0>
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
	//    1    3:new             #9   <Class SearchViewQueryTextChangeEventsOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #38  <Method void SearchViewQueryTextChangeEventsOnSubscribe$1(SearchViewQueryTextChangeEventsOnSubscribe, Subscriber)>
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
			//    1    1:getfield        #15  <Field SearchViewQueryTextChangeEventsOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method SearchView SearchViewQueryTextChangeEventsOnSubscribe.access$000(SearchViewQueryTextChangeEventsOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void SearchView.setOnQueryTextListener(android.widget.SearchView$OnQueryTextListener)>
			//    5   11:return          
			}

			final SearchViewQueryTextChangeEventsOnSubscribe this$0;

			
			{
				this$0 = SearchViewQueryTextChangeEventsOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field SearchViewQueryTextChangeEventsOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class SearchViewQueryTextChangeEventsOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #47  <Method void SearchViewQueryTextChangeEventsOnSubscribe$2(SearchViewQueryTextChangeEventsOnSubscribe)>
	//   16   30:invokevirtual   #51  <Method void Subscriber.add(rx.Subscription)>
		subscriber.onNext(((Object) (SearchViewQueryTextEvent.create(view, view.getQuery(), false))));
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #20  <Field SearchView view>
	//   20   38:aload_0         
	//   21   39:getfield        #20  <Field SearchView view>
	//   22   42:invokevirtual   #55  <Method CharSequence SearchView.getQuery()>
	//   23   45:iconst_0        
	//   24   46:invokestatic    #61  <Method SearchViewQueryTextEvent SearchViewQueryTextEvent.create(SearchView, CharSequence, boolean)>
	//   25   49:invokevirtual   #64  <Method void Subscriber.onNext(Object)>
	//   26   52:return          
	}

	private final SearchView view;


/*
	static SearchView access$000(SearchViewQueryTextChangeEventsOnSubscribe searchviewquerytextchangeeventsonsubscribe)
	{
		return searchviewquerytextchangeeventsonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SearchView view>
	//    2    4:areturn         
	}

*/
}
