// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.SearchView;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			SearchViewQueryTextChangeEventsOnSubscribe, SearchViewQueryTextChangesOnSubscribe

public final class RxSearchView
{

	private RxSearchView()
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

	public static Action1 query(SearchView searchview, boolean flag)
	{
		return new Action1(searchview, flag) {

			public void call(CharSequence charsequence)
			{
				view.setQuery(charsequence, submit);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field SearchView val$view>
			//    2    4:aload_1         
			//    3    5:aload_0         
			//    4    6:getfield        #22  <Field boolean val$submit>
			//    5    9:invokevirtual   #34  <Method void SearchView.setQuery(CharSequence, boolean)>
			//    6   12:return          
			}

			public volatile void call(Object obj)
			{
				call((CharSequence)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #37  <Class CharSequence>
			//    3    5:invokevirtual   #39  <Method void call(CharSequence)>
			//    4    8:return          
			}

			final boolean val$submit;
			final SearchView val$view;

			
			{
				view = searchview;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field SearchView val$view>
				submit = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field boolean val$submit>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    0    0:new             #6   <Class RxSearchView$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #25  <Method void RxSearchView$1(SearchView, boolean)>
	//    5    9:areturn         
	}

	public static Observable queryTextChangeEvents(SearchView searchview)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new SearchViewQueryTextChangeEventsOnSubscribe(searchview))));
	//    0    0:new             #33  <Class SearchViewQueryTextChangeEventsOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #36  <Method void SearchViewQueryTextChangeEventsOnSubscribe(SearchView)>
	//    4    8:invokestatic    #42  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}

	public static Observable queryTextChanges(SearchView searchview)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new SearchViewQueryTextChangesOnSubscribe(searchview))));
	//    0    0:new             #46  <Class SearchViewQueryTextChangesOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #47  <Method void SearchViewQueryTextChangesOnSubscribe(SearchView)>
	//    4    8:invokestatic    #42  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}
}
