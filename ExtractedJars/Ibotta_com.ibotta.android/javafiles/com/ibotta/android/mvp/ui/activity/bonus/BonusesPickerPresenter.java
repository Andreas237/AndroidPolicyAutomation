// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import com.ibotta.android.mvp.base.loading.LoadingMvpPresenter;
import com.ibotta.api.model.BonusModel;

public interface BonusesPickerPresenter
	extends LoadingMvpPresenter
{

	public abstract void onBonusClicked(BonusModel bonusmodel);

	public abstract void onFindRebatesClicked();
}
