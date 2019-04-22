// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base;


// Referenced classes of package com.ibotta.android.mvp.base:
//			MvpView

public interface MvpPresenter
{

	public abstract Object getPersistedState();

	public abstract boolean isExpectingActivityResult();

	public abstract void onAttach(MvpView mvpview);

	public abstract void onDetach();

	public abstract void onNavAccountClicked();

	public abstract void onNavFeaturedClicked();

	public abstract void onNavFindRebatesClicked();

	public abstract void onNavMyRebatesClicked();

	public abstract void onNavRedeemClicked();

	public abstract void onPause();

	public abstract void onResume();

	public abstract void onStart();

	public abstract void onStop();

	public abstract void onUpgradeClicked();

	public abstract void onViewsBound();

	public abstract void setIsExpectingActivityResult(boolean flag);

	public abstract void setPersistedState(Object obj);
}
