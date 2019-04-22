// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import com.ibotta.android.mvp.base.loading.LoadingMvpView;
import com.ibotta.android.views.account.bonus.QuestToolbarViewState;
import com.ibotta.android.views.base.title.TitleBarViewState;
import com.ibotta.api.model.BonusModel;
import java.util.LinkedHashMap;

public interface BonusDetailView
	extends LoadingMvpView
{

	public abstract String getAdditionCashBackText(String s);

	public abstract void populateQuestAppBar(QuestToolbarViewState questtoolbarviewstate, int i);

	public abstract void setup(BonusModel bonusmodel, LinkedHashMap linkedhashmap, TitleBarViewState titlebarviewstate, TitleBarViewState titlebarviewstate1);

	public abstract void showBonusNotFound();

	public abstract void showQuestAppBar();
}
