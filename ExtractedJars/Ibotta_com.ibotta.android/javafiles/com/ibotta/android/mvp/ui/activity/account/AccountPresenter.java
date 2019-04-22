// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account;

import com.ibotta.android.mvp.base.loading.LoadingMvpPresenter;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account:
//			AccountMenu

public interface AccountPresenter
	extends LoadingMvpPresenter
{

	public abstract void onEarningsProgressBarClicked();

	public abstract void onLinkAccountClicked();

	public abstract void onPendingReceiptsClicked();

	public abstract void onProfileImageClicked();

	public abstract void onQuestionMarkClicked();

	public abstract void onRowClicked(AccountMenu accountmenu);

	public abstract void onWithdrawCashClicked();
}
