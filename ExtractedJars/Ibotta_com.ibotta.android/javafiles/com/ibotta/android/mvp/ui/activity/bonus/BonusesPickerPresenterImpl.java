// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.mvp.base.loading.AbstractLoadingMvpPresenter;
import com.ibotta.android.mvp.ui.view.bonus.picker.BonusPickerRowCreator;
import com.ibotta.api.model.BonusModel;
import java.util.Set;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.bonus:
//			BonusesPickerPresenter, BonusesPickerView

public class BonusesPickerPresenterImpl extends AbstractLoadingMvpPresenter
	implements BonusesPickerPresenter
{

	public BonusesPickerPresenterImpl(MvpPresenterActions mvppresenteractions, BonusPickerRowCreator bonuspickerrowcreator)
	{
		super(mvppresenteractions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void AbstractLoadingMvpPresenter(MvpPresenterActions)>
		rowCreator = bonuspickerrowcreator;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field BonusPickerRowCreator rowCreator>
	//    6   10:return          
	}

	protected Set getFetchJobs()
	{
		return rowCreator.getFetchJobs();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field BonusPickerRowCreator rowCreator>
	//    2    4:invokeinterface #23  <Method Set BonusPickerRowCreator.getFetchJobs()>
	//    3    9:areturn         
	}

	protected void onAbandonFetchJobs()
	{
		rowCreator.onAbandonFetchJobs();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field BonusPickerRowCreator rowCreator>
	//    2    4:invokeinterface #29  <Method void BonusPickerRowCreator.onAbandonFetchJobs()>
	//    3    9:return          
	}

	public void onBonusClicked(BonusModel bonusmodel)
	{
		((BonusesPickerView)mvpView).showBonusDetails(bonusmodel);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #37  <Class BonusesPickerView>
	//    3    7:aload_1         
	//    4    8:invokeinterface #40  <Method void BonusesPickerView.showBonusDetails(BonusModel)>
	//    5   13:return          
	}

	protected void onFetchFinishedSuccessfully()
	{
		((BonusesPickerView)mvpView).setDataMap(rowCreator.buildDataMap());
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #37  <Class BonusesPickerView>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field BonusPickerRowCreator rowCreator>
	//    5   11:invokeinterface #45  <Method java.util.LinkedHashMap BonusPickerRowCreator.buildDataMap()>
	//    6   16:invokeinterface #49  <Method void BonusesPickerView.setDataMap(java.util.LinkedHashMap)>
	//    7   21:return          
	}

	public void onFindRebatesClicked()
	{
		((BonusesPickerView)mvpView).launchFindRebates();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #37  <Class BonusesPickerView>
	//    3    7:invokeinterface #53  <Method void BonusesPickerView.launchFindRebates()>
	//    4   12:return          
	}

	private final BonusPickerRowCreator rowCreator;
}
