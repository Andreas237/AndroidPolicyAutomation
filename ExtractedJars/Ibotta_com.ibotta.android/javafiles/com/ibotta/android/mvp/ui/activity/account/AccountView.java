// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account;

import com.ibotta.android.mvp.base.loading.LoadingMvpView;
import java.util.List;

public interface AccountView
	extends LoadingMvpView
{

	public abstract void linkAccount();

	public abstract void setAccountRows(List list);

	public abstract void showBonuses();

	public abstract void showFullscreenProfilePic(String s);

	public abstract void showGiftCards();

	public abstract void showHelp();

	public abstract void showHowTo();

	public abstract void showInviteFriends();

	public abstract void showMyEarnings();

	public abstract void showMyFavorites();

	public abstract void showPendingReceipts();

	public abstract void showSettings();

	public abstract void showTeamwork();

	public abstract void showWithdrawCash();
}
