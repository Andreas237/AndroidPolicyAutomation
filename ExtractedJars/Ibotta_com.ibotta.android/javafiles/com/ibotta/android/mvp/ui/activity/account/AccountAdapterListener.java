// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account;


// Referenced classes of package com.ibotta.android.mvp.ui.activity.account:
//			AccountMenu

public interface AccountAdapterListener
	extends com.ibotta.android.mvp.ui.view.account.AccountProfileView.AccountProfileListener
{

	public abstract void onRowClicked(AccountMenu accountmenu);
}
