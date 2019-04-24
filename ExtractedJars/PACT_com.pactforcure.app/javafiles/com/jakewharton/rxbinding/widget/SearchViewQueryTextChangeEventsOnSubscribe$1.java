// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.SearchView;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			SearchViewQueryTextChangeEventsOnSubscribe, SearchViewQueryTextEvent

class SearchViewQueryTextChangeEventsOnSubscribe$1
	implements android.widget.SearchView.OnQueryTextListener
{

	public boolean onQueryTextChange(String s)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(!val$subscriber.isUnsubscribed())
	//*   2    2:aload_0         
	//*   3    3:getfield        #21  <Field Subscriber val$subscriber>
	//*   4    6:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
	//*   5    9:ifne            33
		{
			val$subscriber.onNext(((Object) (SearchViewQueryTextEvent.create(SearchViewQueryTextChangeEventsOnSubscribe.access$000(SearchViewQueryTextChangeEventsOnSubscribe.this), ((CharSequence) (s)), false))));
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
		if(!val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
	//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
	//*   3    7:ifne            40
		{
			val$subscriber.onNext(((Object) (SearchViewQueryTextEvent.create(SearchViewQueryTextChangeEventsOnSubscribe.access$000(SearchViewQueryTextChangeEventsOnSubscribe.this), SearchViewQueryTextChangeEventsOnSubscribe.access$000(SearchViewQueryTextChangeEventsOnSubscribe.this).getQuery(), true))));
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

	SearchViewQueryTextChangeEventsOnSubscribe$1()
	{
		this$0 = final_searchviewquerytextchangeeventsonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field SearchViewQueryTextChangeEventsOnSubscribe this$0>
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
