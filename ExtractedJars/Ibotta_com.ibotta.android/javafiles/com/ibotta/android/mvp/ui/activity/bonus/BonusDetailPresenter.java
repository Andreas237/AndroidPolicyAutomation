// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import com.ibotta.android.mvp.base.loading.LoadingMvpPresenter;
import com.ibotta.api.model.ContentModel;
import com.ibotta.api.model.RetailerModel;

public interface BonusDetailPresenter
	extends LoadingMvpPresenter
{

	public abstract void onBonusNotFoundDisplayed();

	public abstract void onShopClicked(ContentModel contentmodel, RetailerModel retailermodel);

	public abstract void onUnlockCompleted();

	public abstract void setBonusIds(int ai[]);

	public abstract void setExplicitRequest(boolean flag);

	public abstract void setIsQuest(boolean flag);
}
