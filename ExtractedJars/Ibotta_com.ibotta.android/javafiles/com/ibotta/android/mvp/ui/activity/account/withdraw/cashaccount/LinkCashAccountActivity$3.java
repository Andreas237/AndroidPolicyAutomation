// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.cashaccount;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.cashaccount:
//			LinkCashAccountActivity, LinkCashAccountPresenter

class LinkCashAccountActivity$3
	implements TextWatcher
{

	public void afterTextChanged(Editable editable)
	{
		((LinkCashAccountPresenter)LinkCashAccountActivity.access$200(LinkCashAccountActivity.this)).onEmailChanged(((Object) (editable)).toString());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field LinkCashAccountActivity this$0>
	//    2    4:invokestatic    #26  <Method com.ibotta.android.mvp.base.MvpPresenter LinkCashAccountActivity.access$200(LinkCashAccountActivity)>
	//    3    7:checkcast       #28  <Class LinkCashAccountPresenter>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #32  <Method String Object.toString()>
	//    6   14:invokeinterface #36  <Method void LinkCashAccountPresenter.onEmailChanged(String)>
	//    7   19:return          
	}

	public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	public void onTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	final LinkCashAccountActivity this$0;

	LinkCashAccountActivity$3()
	{
		this$0 = LinkCashAccountActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field LinkCashAccountActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
