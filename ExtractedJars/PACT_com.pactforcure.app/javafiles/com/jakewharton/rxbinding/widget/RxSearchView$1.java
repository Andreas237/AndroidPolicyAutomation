// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.SearchView;
import rx.functions.Action1;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			RxSearchView

static final class RxSearchView$1
	implements Action1
{

	public void call(CharSequence charsequence)
	{
		val$view.setQuery(charsequence, val$submit);
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

	RxSearchView$1(SearchView searchview, boolean flag)
	{
		val$view = searchview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field SearchView val$view>
		val$submit = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field boolean val$submit>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
