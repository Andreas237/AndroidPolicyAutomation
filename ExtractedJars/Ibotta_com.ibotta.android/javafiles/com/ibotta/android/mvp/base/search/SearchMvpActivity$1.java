// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.search;


// Referenced classes of package com.ibotta.android.mvp.base.search:
//			SearchMvpActivity, SearchMvpPresenter

class SearchMvpActivity$1
	implements com.ibotta.android.fragment.dialog..PromptDialogListener
{

	public void onChoice(String s, int i, String s1)
	{
		if(i == 0x7f11020d)
	//*   0    0:iload_2         
	//*   1    1:ldc1            #23  <Int 0x7f11020d>
	//*   2    3:icmpne          21
			((SearchMvpPresenter)SearchMvpActivity.access$000(SearchMvpActivity.this)).onConfirmClearAllSearchTerms();
	//    3    6:aload_0         
	//    4    7:getfield        #17  <Field SearchMvpActivity this$0>
	//    5   10:invokestatic    #27  <Method com.ibotta.android.mvp.base.MvpPresenter SearchMvpActivity.access$000(SearchMvpActivity)>
	//    6   13:checkcast       #29  <Class SearchMvpPresenter>
	//    7   16:invokeinterface #32  <Method void SearchMvpPresenter.onConfirmClearAllSearchTerms()>
	//    8   21:return          
	}

	public void onDialogFragmentCancelled(String s)
	{
	//    0    0:return          
	}

	public void onDialogFragmentDismissed(String s)
	{
	//    0    0:return          
	}

	final SearchMvpActivity this$0;

	SearchMvpActivity$1()
	{
		this$0 = SearchMvpActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field SearchMvpActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
