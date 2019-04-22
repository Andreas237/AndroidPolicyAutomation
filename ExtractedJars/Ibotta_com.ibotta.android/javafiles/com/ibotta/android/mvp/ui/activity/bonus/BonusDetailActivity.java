// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import butterknife.ButterKnife;
import com.ibotta.android.di.MainComponent;
import com.ibotta.android.mvp.base.MvpComponent;
import com.ibotta.android.mvp.base.loading.LoadingMvpActivity;
import com.ibotta.android.mvp.ui.view.bonus.BonusDetailView;
import com.ibotta.android.mvp.ui.view.bonus.BonusView;
import com.ibotta.android.mvp.ui.view.content.ContentCardViewEvents;
import com.ibotta.android.mvp.ui.view.spotlight.RelatedOffersList;
import com.ibotta.android.tracking.proprietary.TrackingQueue;
import com.ibotta.android.tracking.proprietary.event.*;
import com.ibotta.android.tracking.proprietary.event.enums.EventContext;
import com.ibotta.android.views.account.bonus.QuestCollapsingToolbarLayout;
import com.ibotta.android.views.account.bonus.QuestToolbarViewState;
import com.ibotta.android.views.base.title.TitleBarViewState;
import com.ibotta.api.model.*;
import java.util.LinkedHashMap;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.bonus:
//			BonusDetailView, BonusDetailPresenter, DaggerBonusDetailComponent, BonusDetailModule, 
//			BonusDetailComponent

public class BonusDetailActivity extends LoadingMvpActivity
	implements com.ibotta.android.mvp.ui.activity.bonus.BonusDetailView, ContentCardViewEvents, EventContributor
{

	public BonusDetailActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void LoadingMvpActivity()>
	//    2    4:return          
	}

	private void initBonusDetailView(BonusModel bonusmodel, TitleBarViewState titlebarviewstate)
	{
		bdvBonusDetail.setup(bonusmodel, titlebarviewstate);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field BonusDetailView bdvBonusDetail>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #51  <Method void BonusDetailView.setup(BonusModel, TitleBarViewState)>
	//    5    9:return          
	}

	private void initBonusView()
	{
		int i = bvBonus.getContext().getResources().getDimensionPixelSize(0x7f0701d6);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field BonusView bvBonus>
	//    2    4:invokevirtual   #60  <Method Context BonusView.getContext()>
	//    3    7:invokevirtual   #66  <Method Resources Context.getResources()>
	//    4   10:ldc1            #67  <Int 0x7f0701d6>
	//    5   12:invokevirtual   #73  <Method int Resources.getDimensionPixelSize(int)>
	//    6   15:istore_1        
		bvBonus.setSize(i);
	//    7   16:aload_0         
	//    8   17:getfield        #54  <Field BonusView bvBonus>
	//    9   20:iload_1         
	//   10   21:invokevirtual   #77  <Method void BonusView.setSize(int)>
		bvBonus.setAmountFontSize(20F);
	//   11   24:aload_0         
	//   12   25:getfield        #54  <Field BonusView bvBonus>
	//   13   28:ldc1            #78  <Float 20F>
	//   14   30:invokevirtual   #82  <Method void BonusView.setAmountFontSize(float)>
	//   15   33:return          
	}

	private void initBonusView(BonusModel bonusmodel)
	{
		bvBonus.setBonusModel(bonusmodel);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field BonusView bvBonus>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #86  <Method void BonusView.setBonusModel(BonusModel)>
		bvBonus.toggleNameVisibility(false);
	//    4    8:aload_0         
	//    5    9:getfield        #54  <Field BonusView bvBonus>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #90  <Method void BonusView.toggleNameVisibility(boolean)>
	//    8   16:return          
	}

	private void initQuestCollapsingToolbarLayout()
	{
		questHeader = new QuestCollapsingToolbarLayout(((Context) (this)));
	//    0    0:aload_0         
	//    1    1:new             #93  <Class QuestCollapsingToolbarLayout>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #96  <Method void QuestCollapsingToolbarLayout(Context)>
	//    5    9:putfield        #98  <Field QuestCollapsingToolbarLayout questHeader>
		appBarLayout.removeAllViews();
	//    6   12:aload_0         
	//    7   13:getfield        #100 <Field AppBarLayout appBarLayout>
	//    8   16:invokevirtual   #105 <Method void AppBarLayout.removeAllViews()>
		appBarLayout.addView(((android.view.View) (questHeader)));
	//    9   19:aload_0         
	//   10   20:getfield        #100 <Field AppBarLayout appBarLayout>
	//   11   23:aload_0         
	//   12   24:getfield        #98  <Field QuestCollapsingToolbarLayout questHeader>
	//   13   27:invokevirtual   #109 <Method void AppBarLayout.addView(android.view.View)>
		invalidateOptionsMenu();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #112 <Method void invalidateOptionsMenu()>
	//   16   34:return          
	}

	private void initQuestToolbar()
	{
		setSupportActionBar((Toolbar)findViewById(0x7f09043a));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:ldc1            #114 <Int 0x7f09043a>
	//    3    4:invokevirtual   #118 <Method android.view.View findViewById(int)>
	//    4    7:checkcast       #120 <Class Toolbar>
	//    5   10:invokevirtual   #124 <Method void setSupportActionBar(Toolbar)>
		if(getSupportActionBar() != null)
	//*   6   13:aload_0         
	//*   7   14:invokevirtual   #128 <Method ActionBar getSupportActionBar()>
	//*   8   17:ifnull          36
		{
			getSupportActionBar().setDisplayHomeAsUpEnabled(false);
	//    9   20:aload_0         
	//   10   21:invokevirtual   #128 <Method ActionBar getSupportActionBar()>
	//   11   24:iconst_0        
	//   12   25:invokevirtual   #133 <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
			getSupportActionBar().setDisplayShowTitleEnabled(false);
	//   13   28:aload_0         
	//   14   29:invokevirtual   #128 <Method ActionBar getSupportActionBar()>
	//   15   32:iconst_0        
	//   16   33:invokevirtual   #136 <Method void ActionBar.setDisplayShowTitleEnabled(boolean)>
		}
	//   17   36:return          
	}

	private void initRelatedRebates(LinkedHashMap linkedhashmap, TitleBarViewState titlebarviewstate)
	{
		if(linkedhashmap.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #144 <Method boolean LinkedHashMap.isEmpty()>
	//*   2    4:ifeq            17
		{
			srrvRelatedRebates.setVisibility(8);
	//    3    7:aload_0         
	//    4    8:getfield        #146 <Field RelatedOffersList srrvRelatedRebates>
	//    5   11:bipush          8
	//    6   13:invokevirtual   #151 <Method void RelatedOffersList.setVisibility(int)>
			return;
	//    7   16:return          
		} else
		{
			srrvRelatedRebates.setContentCardViewEvents(((ContentCardViewEvents) (this)));
	//    8   17:aload_0         
	//    9   18:getfield        #146 <Field RelatedOffersList srrvRelatedRebates>
	//   10   21:aload_0         
	//   11   22:invokevirtual   #155 <Method void RelatedOffersList.setContentCardViewEvents(ContentCardViewEvents)>
			srrvRelatedRebates.setup(titlebarviewstate, linkedhashmap);
	//   12   25:aload_0         
	//   13   26:getfield        #146 <Field RelatedOffersList srrvRelatedRebates>
	//   14   29:aload_2         
	//   15   30:aload_1         
	//   16   31:invokevirtual   #158 <Method void RelatedOffersList.setup(TitleBarViewState, LinkedHashMap)>
			srrvRelatedRebates.setVisibility(0);
	//   17   34:aload_0         
	//   18   35:getfield        #146 <Field RelatedOffersList srrvRelatedRebates>
	//   19   38:iconst_0        
	//   20   39:invokevirtual   #151 <Method void RelatedOffersList.setVisibility(int)>
			return;
	//   21   42:return          
		}
	}

	private void loadState(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          49
		{
			bonusName = bundle.getString("bonus_name");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #164 <String "bonus_name">
	//    5    8:invokevirtual   #170 <Method String Bundle.getString(String)>
	//    6   11:putfield        #172 <Field String bonusName>
			bonusIds = bundle.getIntArray("bonus_ids");
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:ldc1            #174 <String "bonus_ids">
	//   10   18:invokevirtual   #178 <Method int[] Bundle.getIntArray(String)>
	//   11   21:putfield        #180 <Field int[] bonusIds>
			explicitRequest = bundle.getBoolean("explicit_request", false);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:ldc1            #182 <String "explicit_request">
	//   15   28:iconst_0        
	//   16   29:invokevirtual   #186 <Method boolean Bundle.getBoolean(String, boolean)>
	//   17   32:putfield        #188 <Field boolean explicitRequest>
			isQuest = bundle.getBoolean("is_quest", false);
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:ldc1            #190 <String "is_quest">
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #186 <Method boolean Bundle.getBoolean(String, boolean)>
	//   23   43:putfield        #192 <Field boolean isQuest>
		} else
	//*  24   46:goto            110
		if(getIntent() != null)
	//*  25   49:aload_0         
	//*  26   50:invokevirtual   #196 <Method Intent getIntent()>
	//*  27   53:ifnull          110
		{
			bonusName = getIntent().getStringExtra("bonus_name");
	//   28   56:aload_0         
	//   29   57:aload_0         
	//   30   58:invokevirtual   #196 <Method Intent getIntent()>
	//   31   61:ldc1            #164 <String "bonus_name">
	//   32   63:invokevirtual   #201 <Method String Intent.getStringExtra(String)>
	//   33   66:putfield        #172 <Field String bonusName>
			bonusIds = getIntent().getIntArrayExtra("bonus_ids");
	//   34   69:aload_0         
	//   35   70:aload_0         
	//   36   71:invokevirtual   #196 <Method Intent getIntent()>
	//   37   74:ldc1            #174 <String "bonus_ids">
	//   38   76:invokevirtual   #204 <Method int[] Intent.getIntArrayExtra(String)>
	//   39   79:putfield        #180 <Field int[] bonusIds>
			explicitRequest = getIntent().getBooleanExtra("explicit_request", false);
	//   40   82:aload_0         
	//   41   83:aload_0         
	//   42   84:invokevirtual   #196 <Method Intent getIntent()>
	//   43   87:ldc1            #182 <String "explicit_request">
	//   44   89:iconst_0        
	//   45   90:invokevirtual   #207 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   46   93:putfield        #188 <Field boolean explicitRequest>
			isQuest = getIntent().getBooleanExtra("explicit_request", false);
	//   47   96:aload_0         
	//   48   97:aload_0         
	//   49   98:invokevirtual   #196 <Method Intent getIntent()>
	//   50  101:ldc1            #182 <String "explicit_request">
	//   51  103:iconst_0        
	//   52  104:invokevirtual   #207 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   53  107:putfield        #192 <Field boolean isQuest>
		}
		((BonusDetailPresenter)mvpPresenter).setIsQuest(isQuest);
	//   54  110:aload_0         
	//   55  111:getfield        #211 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//   56  114:checkcast       #213 <Class BonusDetailPresenter>
	//   57  117:aload_0         
	//   58  118:getfield        #192 <Field boolean isQuest>
	//   59  121:invokeinterface #216 <Method void BonusDetailPresenter.setIsQuest(boolean)>
		((BonusDetailPresenter)mvpPresenter).setBonusIds(bonusIds);
	//   60  126:aload_0         
	//   61  127:getfield        #211 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//   62  130:checkcast       #213 <Class BonusDetailPresenter>
	//   63  133:aload_0         
	//   64  134:getfield        #180 <Field int[] bonusIds>
	//   65  137:invokeinterface #220 <Method void BonusDetailPresenter.setBonusIds(int[])>
		((BonusDetailPresenter)mvpPresenter).setExplicitRequest(explicitRequest);
	//   66  142:aload_0         
	//   67  143:getfield        #211 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//   68  146:checkcast       #213 <Class BonusDetailPresenter>
	//   69  149:aload_0         
	//   70  150:getfield        #188 <Field boolean explicitRequest>
	//   71  153:invokeinterface #223 <Method void BonusDetailPresenter.setExplicitRequest(boolean)>
	//   72  158:return          
	}

	private void trackBonusView()
	{
		EventChain eventchain = new EventChain();
	//    0    0:new             #226 <Class EventChain>
	//    1    3:dup             
	//    2    4:invokespecial   #227 <Method void EventChain()>
	//    3    7:astore_1        
		eventchain.setEventContributor(((EventContributor) (this)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #231 <Method void EventChain.setEventContributor(EventContributor)>
		BonusEvent bonusevent = new BonusEvent();
	//    7   13:new             #233 <Class BonusEvent>
	//    8   16:dup             
	//    9   17:invokespecial   #234 <Method void BonusEvent()>
	//   10   20:astore_2        
		eventchain.contributeTo(((AbstractEvent) (bonusevent)));
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #238 <Method void EventChain.contributeTo(AbstractEvent)>
		bonusevent.setCounter(1);
	//   14   26:aload_2         
	//   15   27:iconst_1        
	//   16   28:invokevirtual   #241 <Method void BonusEvent.setCounter(int)>
		trackingQueue.send(((AbstractEvent) (bonusevent)));
	//   17   31:aload_0         
	//   18   32:getfield        #243 <Field TrackingQueue trackingQueue>
	//   19   35:aload_2         
	//   20   36:invokeinterface #248 <Method void TrackingQueue.send(AbstractEvent)>
	//   21   41:return          
	}

	public void contributeTo(AbstractEvent abstractevent)
	{
		int ai[] = bonusIds;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field int[] bonusIds>
	//    2    4:astore_2        
		if(ai != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          36
		{
			if(ai.length <= 0)
	//*   5    9:aload_2         
	//*   6   10:arraylength     
	//*   7   11:ifgt            15
			{
				return;
	//    8   14:return          
			} else
			{
				abstractevent.setEventContext(EventContext.BONUS);
	//    9   15:aload_1         
	//   10   16:getstatic       #254 <Field EventContext EventContext.BONUS>
	//   11   19:invokevirtual   #260 <Method void AbstractEvent.setEventContext(EventContext)>
				abstractevent.setBonusId(Integer.valueOf(bonusIds[0]));
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #180 <Field int[] bonusIds>
	//   15   27:iconst_0        
	//   16   28:iaload          
	//   17   29:invokestatic    #266 <Method Integer Integer.valueOf(int)>
	//   18   32:invokevirtual   #270 <Method void AbstractEvent.setBonusId(Integer)>
				return;
	//   19   35:return          
			}
		} else
		{
			return;
	//   20   36:return          
		}
	}

	protected volatile MvpComponent createComponent(MainComponent maincomponent)
	{
		return ((MvpComponent) (createComponent(maincomponent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #275 <Method BonusDetailComponent createComponent(MainComponent)>
	//    3    5:areturn         
	}

	protected BonusDetailComponent createComponent(MainComponent maincomponent)
	{
		return DaggerBonusDetailComponent.builder().mainComponent(maincomponent).bonusDetailModule(new BonusDetailModule(((com.ibotta.android.mvp.ui.activity.bonus.BonusDetailView) (this)))).build();
	//    0    0:invokestatic    #281 <Method DaggerBonusDetailComponent$Builder DaggerBonusDetailComponent.builder()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #287 <Method DaggerBonusDetailComponent$Builder DaggerBonusDetailComponent$Builder.mainComponent(MainComponent)>
	//    3    7:new             #289 <Class BonusDetailModule>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #292 <Method void BonusDetailModule(com.ibotta.android.mvp.ui.activity.bonus.BonusDetailView)>
	//    7   15:invokevirtual   #296 <Method DaggerBonusDetailComponent$Builder DaggerBonusDetailComponent$Builder.bonusDetailModule(BonusDetailModule)>
	//    8   18:invokevirtual   #300 <Method BonusDetailComponent DaggerBonusDetailComponent$Builder.build()>
	//    9   21:areturn         
	}

	public String getAdditionCashBackText(String s)
	{
		return getResources().getString(0x7f1100a1, new Object[] {
			s
		});
	//    0    0:aload_0         
	//    1    1:invokevirtual   #302 <Method Resources getResources()>
	//    2    4:ldc2            #303 <Int 0x7f1100a1>
	//    3    7:iconst_1        
	//    4    8:anewarray       Object[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:aload_1         
	//    8   14:aastore         
	//    9   15:invokevirtual   #308 <Method String Resources.getString(int, Object[])>
	//   10   18:areturn         
	}

	public EventContext getEventContext()
	{
		return EventContext.BONUS;
	//    0    0:getstatic       #254 <Field EventContext EventContext.BONUS>
	//    1    3:areturn         
	}

	protected void initToolBar()
	{
		super.initToolBar();
	//    0    0:aload_0         
	//    1    1:invokespecial   #313 <Method void LoadingMvpActivity.initToolBar()>
		if(toolbar != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #317 <Field Toolbar toolbar>
	//*   4    8:ifnull          21
			toolbar.setBackgroundResource(0x7f060171);
	//    5   11:aload_0         
	//    6   12:getfield        #317 <Field Toolbar toolbar>
	//    7   15:ldc2            #318 <Int 0x7f060171>
	//    8   18:invokevirtual   #321 <Method void Toolbar.setBackgroundResource(int)>
	//    9   21:return          
	}

	protected volatile void inject(MvpComponent mvpcomponent)
	{
		inject((BonusDetailComponent)mvpcomponent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #325 <Class BonusDetailComponent>
	//    3    5:invokevirtual   #328 <Method void inject(BonusDetailComponent)>
	//    4    8:return          
	}

	protected void inject(BonusDetailComponent bonusdetailcomponent)
	{
		bonusdetailcomponent.inject(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #331 <Method void BonusDetailComponent.inject(BonusDetailActivity)>
	//    3    7:return          
	}

	public void onActivityResult(int i, int j, Intent intent)
	{
		if(i == 3 && j == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_3        
	//*   2    2:icmpne          22
	//*   3    5:iload_2         
	//*   4    6:iconst_1        
	//*   5    7:icmpne          22
			((BonusDetailPresenter)mvpPresenter).onUnlockCompleted();
	//    6   10:aload_0         
	//    7   11:getfield        #211 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    8   14:checkcast       #213 <Class BonusDetailPresenter>
	//    9   17:invokeinterface #336 <Method void BonusDetailPresenter.onUnlockCompleted()>
		super.onActivityResult(i, j, intent);
	//   10   22:aload_0         
	//   11   23:iload_1         
	//   12   24:iload_2         
	//   13   25:aload_3         
	//   14   26:invokespecial   #338 <Method void LoadingMvpActivity.onActivityResult(int, int, Intent)>
	//   15   29:return          
	}

	public void onContentClicked(ContentModel contentmodel, RetailerModel retailermodel)
	{
		((BonusDetailPresenter)mvpPresenter).onContentClicked(contentmodel, retailermodel);
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #213 <Class BonusDetailPresenter>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #342 <Method void BonusDetailPresenter.onContentClicked(ContentModel, RetailerModel)>
	//    6   14:return          
	}

	public void onContentImageClicked()
	{
	//    0    0:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #347 <Method void LoadingMvpActivity.onCreate(Bundle)>
		String s1 = bonusName;
	//    3    5:aload_0         
	//    4    6:getfield        #172 <Field String bonusName>
	//    5    9:astore_3        
		String s = s1;
	//    6   10:aload_3         
	//    7   11:astore_2        
		if(s1 == null)
	//*   8   12:aload_3         
	//*   9   13:ifnonnull       24
			s = getString(0x7f110140);
	//   10   16:aload_0         
	//   11   17:ldc2            #348 <Int 0x7f110140>
	//   12   20:invokevirtual   #351 <Method String getString(int)>
	//   13   23:astore_2        
		setTitle(((CharSequence) (s)));
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:invokevirtual   #355 <Method void setTitle(CharSequence)>
		setContentView(0x7f0c0020);
	//   17   29:aload_0         
	//   18   30:ldc2            #356 <Int 0x7f0c0020>
	//   19   33:invokevirtual   #359 <Method void setContentView(int)>
		setUnbinder(ButterKnife.bind(((android.app.Activity) (this))));
	//   20   36:aload_0         
	//   21   37:aload_0         
	//   22   38:invokestatic    #365 <Method butterknife.Unbinder ButterKnife.bind(android.app.Activity)>
	//   23   41:invokevirtual   #369 <Method void setUnbinder(butterknife.Unbinder)>
		loadState(bundle);
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:invokespecial   #371 <Method void loadState(Bundle)>
		initBonusView();
	//   27   49:aload_0         
	//   28   50:invokespecial   #373 <Method void initBonusView()>
	//   29   53:return          
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		if(isQuest)
	//*   0    0:aload_0         
	//*   1    1:getfield        #192 <Field boolean isQuest>
	//*   2    4:ifeq            18
			getMenuInflater().inflate(0x7f0d0015, menu);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #380 <Method MenuInflater getMenuInflater()>
	//    5   11:ldc2            #381 <Int 0x7f0d0015>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #387 <Method void MenuInflater.inflate(int, Menu)>
		return true;
	//    8   18:iconst_1        
	//    9   19:ireturn         
	}

	public void onListViewTouched()
	{
		com.ibotta.android.views.list.IbottaListViewEvents._2D_CC.$default$onListViewTouched(((com.ibotta.android.views.list.IbottaListViewEvents) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #395 <Method void com.ibotta.android.views.list.IbottaListViewEvents$_2D_CC.$default$onListViewTouched(com.ibotta.android.views.list.IbottaListViewEvents)>
	//    2    4:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #399 <Method void LoadingMvpActivity.onSaveInstanceState(Bundle)>
		bundle.putString("bonus_name", bonusName);
	//    3    5:aload_1         
	//    4    6:ldc1            #164 <String "bonus_name">
	//    5    8:aload_0         
	//    6    9:getfield        #172 <Field String bonusName>
	//    7   12:invokevirtual   #403 <Method void Bundle.putString(String, String)>
		bundle.putIntArray("bonus_ids", bonusIds);
	//    8   15:aload_1         
	//    9   16:ldc1            #174 <String "bonus_ids">
	//   10   18:aload_0         
	//   11   19:getfield        #180 <Field int[] bonusIds>
	//   12   22:invokevirtual   #407 <Method void Bundle.putIntArray(String, int[])>
		bundle.putBoolean("explicit_request", explicitRequest);
	//   13   25:aload_1         
	//   14   26:ldc1            #182 <String "explicit_request">
	//   15   28:aload_0         
	//   16   29:getfield        #188 <Field boolean explicitRequest>
	//   17   32:invokevirtual   #411 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putBoolean("is_quest", isQuest);
	//   18   35:aload_1         
	//   19   36:ldc1            #190 <String "is_quest">
	//   20   38:aload_0         
	//   21   39:getfield        #192 <Field boolean isQuest>
	//   22   42:invokevirtual   #411 <Method void Bundle.putBoolean(String, boolean)>
	//   23   45:return          
	}

	public void onShopClicked(ContentModel contentmodel, RetailerModel retailermodel)
	{
		((BonusDetailPresenter)mvpPresenter).onShopClicked(contentmodel, retailermodel);
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #213 <Class BonusDetailPresenter>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #414 <Method void BonusDetailPresenter.onShopClicked(ContentModel, RetailerModel)>
	//    6   14:return          
	}

	public void onUnlockClicked(ContentModel contentmodel, RetailerModel retailermodel)
	{
		((BonusDetailPresenter)mvpPresenter).onUnlockClicked(contentmodel, retailermodel);
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #213 <Class BonusDetailPresenter>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #417 <Method void BonusDetailPresenter.onUnlockClicked(ContentModel, RetailerModel)>
	//    6   14:return          
	}

	public void onUnlockedClicked(ContentModel contentmodel, RetailerModel retailermodel)
	{
		((BonusDetailPresenter)mvpPresenter).onUnlockedClicked(contentmodel, retailermodel);
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #213 <Class BonusDetailPresenter>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #420 <Method void BonusDetailPresenter.onUnlockedClicked(ContentModel, RetailerModel)>
	//    6   14:return          
	}

	public void populateQuestAppBar(QuestToolbarViewState questtoolbarviewstate, int i)
	{
		QuestCollapsingToolbarLayout questcollapsingtoolbarlayout = questHeader;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field QuestCollapsingToolbarLayout questHeader>
	//    2    4:astore_3        
		if(questcollapsingtoolbarlayout != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          14
			questcollapsingtoolbarlayout.updateViewState(questtoolbarviewstate);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #426 <Method void QuestCollapsingToolbarLayout.updateViewState(QuestToolbarViewState)>
	//    8   14:return          
	}

	public void setup(BonusModel bonusmodel, LinkedHashMap linkedhashmap, TitleBarViewState titlebarviewstate, TitleBarViewState titlebarviewstate1)
	{
		initBonusView(bonusmodel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #429 <Method void initBonusView(BonusModel)>
		initBonusDetailView(bonusmodel, titlebarviewstate);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_3         
	//    6    8:invokespecial   #431 <Method void initBonusDetailView(BonusModel, TitleBarViewState)>
		initRelatedRebates(linkedhashmap, titlebarviewstate1);
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:aload           4
	//   10   15:invokespecial   #433 <Method void initRelatedRebates(LinkedHashMap, TitleBarViewState)>
		trackBonusView();
	//   11   18:aload_0         
	//   12   19:invokespecial   #435 <Method void trackBonusView()>
	//   13   22:return          
	}

	public void showBonusNotFound()
	{
		showQuickMessage(0x7f1100b3, false, true);
	//    0    0:aload_0         
	//    1    1:ldc2            #438 <Int 0x7f1100b3>
	//    2    4:iconst_0        
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #442 <Method void showQuickMessage(int, boolean, boolean)>
	//    5    9:return          
	}

	public void showQuestAppBar()
	{
		initQuestCollapsingToolbarLayout();
	//    0    0:aload_0         
	//    1    1:invokespecial   #445 <Method void initQuestCollapsingToolbarLayout()>
		initQuestToolbar();
	//    2    4:aload_0         
	//    3    5:invokespecial   #447 <Method void initQuestToolbar()>
	//    4    8:return          
	}

	protected AppBarLayout appBarLayout;
	protected BonusDetailView bdvBonusDetail;
	private int bonusIds[];
	private String bonusName;
	protected BonusView bvBonus;
	private boolean explicitRequest;
	private boolean isQuest;
	private QuestCollapsingToolbarLayout questHeader;
	protected RelatedOffersList srrvRelatedRebates;
	TrackingQueue trackingQueue;
}
