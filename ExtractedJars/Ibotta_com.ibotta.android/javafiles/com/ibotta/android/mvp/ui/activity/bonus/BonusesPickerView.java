// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import com.ibotta.android.mvp.base.loading.LoadingMvpView;
import com.ibotta.api.model.BonusModel;
import java.util.LinkedHashMap;

public interface BonusesPickerView
	extends LoadingMvpView
{

	public abstract void launchFindRebates();

	public abstract void setDataMap(LinkedHashMap linkedhashmap);

	public abstract void showBonusDetails(BonusModel bonusmodel);
}
