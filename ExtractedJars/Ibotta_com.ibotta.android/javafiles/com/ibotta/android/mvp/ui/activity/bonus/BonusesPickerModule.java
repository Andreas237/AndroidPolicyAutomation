// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import com.ibotta.android.account.bonus.BonusPickerReducer;
import com.ibotta.android.graphql.GraphQLCallFactory;
import com.ibotta.android.mvp.base.AbstractMvpModule;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.mvp.ui.view.bonus.picker.BonusPickerRowCreator;
import com.ibotta.android.mvp.ui.view.bonus.picker.GraphQlBonusPickerRowCreator;
import com.ibotta.android.title.TitleBarReducer;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.bonus:
//			BonusesPickerPresenterImpl, BonusesPickerView, BonusesPickerPresenter

public class BonusesPickerModule extends AbstractMvpModule
{

	public BonusesPickerModule(BonusesPickerView bonusespickerview)
	{
		super(((com.ibotta.android.mvp.base.MvpView) (bonusespickerview)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void AbstractMvpModule(com.ibotta.android.mvp.base.MvpView)>
	//    3    5:return          
	}

	public static BonusPickerReducer provideBonusPickerReducer(TitleBarReducer titlebarreducer)
	{
		return new BonusPickerReducer(titlebarreducer);
	//    0    0:new             #17  <Class BonusPickerReducer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void BonusPickerReducer(TitleBarReducer)>
	//    4    8:areturn         
	}

	public BonusPickerRowCreator provideBonusPickerRowCreator(GraphQLCallFactory graphqlcallfactory, BonusPickerReducer bonuspickerreducer)
	{
		return ((BonusPickerRowCreator) (new GraphQlBonusPickerRowCreator(graphqlcallfactory, bonuspickerreducer)));
	//    0    0:new             #26  <Class GraphQlBonusPickerRowCreator>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #29  <Method void GraphQlBonusPickerRowCreator(GraphQLCallFactory, BonusPickerReducer)>
	//    5    9:areturn         
	}

	public BonusesPickerPresenter provideMvpPresenter(MvpPresenterActions mvppresenteractions, BonusPickerRowCreator bonuspickerrowcreator)
	{
		return ((BonusesPickerPresenter) (new BonusesPickerPresenterImpl(mvppresenteractions, bonuspickerrowcreator)));
	//    0    0:new             #33  <Class BonusesPickerPresenterImpl>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #36  <Method void BonusesPickerPresenterImpl(MvpPresenterActions, BonusPickerRowCreator)>
	//    5    9:areturn         
	}
}
