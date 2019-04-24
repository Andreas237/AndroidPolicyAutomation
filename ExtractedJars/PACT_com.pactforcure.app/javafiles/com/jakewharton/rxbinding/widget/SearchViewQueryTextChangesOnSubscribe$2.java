// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.SearchView;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			SearchViewQueryTextChangesOnSubscribe

class SearchViewQueryTextChangesOnSubscribe$2 extends MainThreadSubscription
{

	protected void onUnsubscribe()
	{
		SearchViewQueryTextChangesOnSubscribe.access$000(SearchViewQueryTextChangesOnSubscribe.this).setOnQueryTextListener(((android.widget.SearchView.OnQueryTextListener) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SearchViewQueryTextChangesOnSubscribe this$0>
	//    2    4:invokestatic    #24  <Method SearchView SearchViewQueryTextChangesOnSubscribe.access$000(SearchViewQueryTextChangesOnSubscribe)>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #30  <Method void SearchView.setOnQueryTextListener(android.widget.SearchView$OnQueryTextListener)>
	//    5   11:return          
	}

	final SearchViewQueryTextChangesOnSubscribe this$0;

	SearchViewQueryTextChangesOnSubscribe$2()
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
