// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import android.content.res.Resources;
import com.ibotta.android.account.bonus.BonusDetailReducer;
import com.ibotta.android.account.bonus.QuestToolbarReducer;
import com.ibotta.android.features.variant.retailers.LoadRetailersVariant;
import com.ibotta.android.graphql.GraphQLCallFactory;
import com.ibotta.android.mvp.base.AbstractMvpModule;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.state.app.config.AppConfig;
import com.ibotta.android.title.TitleBarReducer;
import com.ibotta.android.util.Formatting;
import com.ibotta.api.helper.bonus.BonusHelper;
import com.ibotta.api.helper.offer.OfferHelper;
import com.ibotta.api.helper.retailer.RetailerHelper;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.bonus:
//			BonusDetailPresenterImpl, BonusDetailView, BonusDetailPresenter

public class BonusDetailModule extends AbstractMvpModule
{

	public BonusDetailModule(BonusDetailView bonusdetailview)
	{
		super(((com.ibotta.android.mvp.base.MvpView) (bonusdetailview)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void AbstractMvpModule(com.ibotta.android.mvp.base.MvpView)>
	//    3    5:return          
	}

	public static BonusDetailReducer provideBonusDetailReducer(TitleBarReducer titlebarreducer, QuestToolbarReducer questtoolbarreducer)
	{
		return new BonusDetailReducer(titlebarreducer, questtoolbarreducer);
	//    0    0:new             #17  <Class BonusDetailReducer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #20  <Method void BonusDetailReducer(TitleBarReducer, QuestToolbarReducer)>
	//    5    9:areturn         
	}

	public static QuestToolbarReducer provideQuestToolbarReducer(AppConfig appconfig, Formatting formatting, Resources resources)
	{
		return new QuestToolbarReducer(appconfig, formatting, resources);
	//    0    0:new             #25  <Class QuestToolbarReducer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #28  <Method void QuestToolbarReducer(AppConfig, Formatting, Resources)>
	//    6   10:areturn         
	}

	public BonusDetailPresenter provideMvpPresenter(MvpPresenterActions mvppresenteractions, RetailerHelper retailerhelper, OfferHelper offerhelper, BonusHelper bonushelper, GraphQLCallFactory graphqlcallfactory, LoadRetailersVariant loadretailersvariant, BonusDetailReducer bonusdetailreducer)
	{
		return ((BonusDetailPresenter) (new BonusDetailPresenterImpl(mvppresenteractions, retailerhelper, offerhelper, bonushelper, graphqlcallfactory, loadretailersvariant, bonusdetailreducer)));
	//    0    0:new             #33  <Class BonusDetailPresenterImpl>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:aload           7
	//    9   15:invokespecial   #36  <Method void BonusDetailPresenterImpl(MvpPresenterActions, RetailerHelper, OfferHelper, BonusHelper, GraphQLCallFactory, LoadRetailersVariant, BonusDetailReducer)>
	//   10   18:areturn         
	}
}
