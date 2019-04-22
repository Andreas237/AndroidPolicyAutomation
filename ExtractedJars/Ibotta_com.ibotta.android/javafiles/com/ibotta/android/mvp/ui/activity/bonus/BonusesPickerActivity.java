// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBar;
import butterknife.ButterKnife;
import com.ibotta.android.di.MainComponent;
import com.ibotta.android.mvp.base.MvpComponent;
import com.ibotta.android.mvp.base.loading.PtrLoadingMvpActivity;
import com.ibotta.android.mvp.ui.view.IBSwipeRefreshLayout;
import com.ibotta.android.mvp.ui.view.bonus.picker.BonusPickerRecyclerListener;
import com.ibotta.android.mvp.ui.view.bonus.picker.row.FeaturedBonusRow;
import com.ibotta.android.routing.intent.BonusDetailIntentCreator;
import com.ibotta.android.tracking.braze.BrazeTracking;
import com.ibotta.android.tracking.proprietary.event.AbstractEvent;
import com.ibotta.android.tracking.proprietary.event.EventContributor;
import com.ibotta.android.tracking.proprietary.event.enums.EventContext;
import com.ibotta.android.view.common.TabSelectorView;
import com.ibotta.api.model.BonusModel;
import java.util.Arrays;
import java.util.LinkedHashMap;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.bonus:
//			BonusesPickerView, BonusPickerPagerAdapter, BonusPickerTab, DaggerBonusesPickerComponent, 
//			BonusesPickerModule, BonusesPickerComponent, BonusesPickerPresenter

public class BonusesPickerActivity extends PtrLoadingMvpActivity
	implements BonusesPickerView, BonusPickerRecyclerListener, EventContributor
{

	public BonusesPickerActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void PtrLoadingMvpActivity()>
	//    2    4:return          
	}

	private void initTabSelector()
	{
		adapter = new BonusPickerPagerAdapter();
	//    0    0:aload_0         
	//    1    1:new             #41  <Class BonusPickerPagerAdapter>
	//    2    4:dup             
	//    3    5:invokespecial   #42  <Method void BonusPickerPagerAdapter()>
	//    4    8:putfield        #38  <Field BonusPickerPagerAdapter adapter>
		adapter.setSwipeRefresh(((SwipeRefreshLayout) (getPtrView())));
	//    5   11:aload_0         
	//    6   12:getfield        #38  <Field BonusPickerPagerAdapter adapter>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #46  <Method IBSwipeRefreshLayout getPtrView()>
	//    9   19:invokevirtual   #50  <Method void BonusPickerPagerAdapter.setSwipeRefresh(SwipeRefreshLayout)>
		adapter.setListener(((BonusPickerRecyclerListener) (this)));
	//   10   22:aload_0         
	//   11   23:getfield        #38  <Field BonusPickerPagerAdapter adapter>
	//   12   26:aload_0         
	//   13   27:invokevirtual   #54  <Method void BonusPickerPagerAdapter.setListener(BonusPickerRecyclerListener)>
		vpPager.setAdapter(((android.support.v4.view.PagerAdapter) (adapter)));
	//   14   30:aload_0         
	//   15   31:getfield        #56  <Field ViewPager vpPager>
	//   16   34:aload_0         
	//   17   35:getfield        #38  <Field BonusPickerPagerAdapter adapter>
	//   18   38:invokevirtual   #62  <Method void ViewPager.setAdapter(android.support.v4.view.PagerAdapter)>
		tsvTabSelector.setOptions(Arrays.asList(((Object []) (BonusPickerTab.values()))));
	//   19   41:aload_0         
	//   20   42:getfield        #64  <Field TabSelectorView tsvTabSelector>
	//   21   45:invokestatic    #70  <Method BonusPickerTab[] BonusPickerTab.values()>
	//   22   48:invokestatic    #76  <Method java.util.List Arrays.asList(Object[])>
	//   23   51:invokevirtual   #82  <Method void TabSelectorView.setOptions(java.util.List)>
		tsvTabSelector.getTabAt(BonusPickerTab.AVAILABLE.ordinal()).select();
	//   24   54:aload_0         
	//   25   55:getfield        #64  <Field TabSelectorView tsvTabSelector>
	//   26   58:getstatic       #86  <Field BonusPickerTab BonusPickerTab.AVAILABLE>
	//   27   61:invokevirtual   #90  <Method int BonusPickerTab.ordinal()>
	//   28   64:invokevirtual   #94  <Method android.support.design.widget.TabLayout$Tab TabSelectorView.getTabAt(int)>
	//   29   67:invokevirtual   #99  <Method void android.support.design.widget.TabLayout$Tab.select()>
		tsvTabSelector.setupWithViewPager(vpPager, true);
	//   30   70:aload_0         
	//   31   71:getfield        #64  <Field TabSelectorView tsvTabSelector>
	//   32   74:aload_0         
	//   33   75:getfield        #56  <Field ViewPager vpPager>
	//   34   78:iconst_1        
	//   35   79:invokevirtual   #103 <Method void TabSelectorView.setupWithViewPager(ViewPager, boolean)>
		tsvTabSelector.addOnTabSelectedListener(((android.support.design.widget.TabLayout.BaseOnTabSelectedListener) (new android.support.design.widget.TabLayout.OnTabSelectedListener() {

			public void onTabReselected(android.support.design.widget.TabLayout.Tab tab)
			{
			//    0    0:return          
			}

			public void onTabSelected(android.support.design.widget.TabLayout.Tab tab)
			{
				adapter.setTabVisible(tab);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BonusesPickerActivity this$0>
			//    2    4:invokestatic    #27  <Method BonusPickerPagerAdapter BonusesPickerActivity.access$000(BonusesPickerActivity)>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #32  <Method void BonusPickerPagerAdapter.setTabVisible(android.support.design.widget.TabLayout$Tab)>
			//    5   11:return          
			}

			public void onTabUnselected(android.support.design.widget.TabLayout.Tab tab)
			{
				adapter.setTabHidden(tab);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BonusesPickerActivity this$0>
			//    2    4:invokestatic    #27  <Method BonusPickerPagerAdapter BonusesPickerActivity.access$000(BonusesPickerActivity)>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #36  <Method void BonusPickerPagerAdapter.setTabHidden(android.support.design.widget.TabLayout$Tab)>
			//    5   11:return          
			}

			final BonusesPickerActivity this$0;

			
			{
				this$0 = BonusesPickerActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BonusesPickerActivity this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
)));
	//   36   82:aload_0         
	//   37   83:getfield        #64  <Field TabSelectorView tsvTabSelector>
	//   38   86:new             #13  <Class BonusesPickerActivity$1>
	//   39   89:dup             
	//   40   90:aload_0         
	//   41   91:invokespecial   #106 <Method void BonusesPickerActivity$1(BonusesPickerActivity)>
	//   42   94:invokevirtual   #110 <Method void TabSelectorView.addOnTabSelectedListener(android.support.design.widget.TabLayout$BaseOnTabSelectedListener)>
	//   43   97:return          
	}

	private static Intent newIntent(Context context)
	{
		return new Intent(context, com/ibotta/android/mvp/ui/activity/bonus/BonusesPickerActivity);
	//    0    0:new             #114 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class BonusesPickerActivity>
	//    4    7:invokespecial   #117 <Method void Intent(Context, Class)>
	//    5   10:areturn         
	}

	public static void start(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			context.startActivity(newIntent(context));
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokestatic    #121 <Method Intent newIntent(Context)>
	//    6   10:invokevirtual   #127 <Method void Context.startActivity(Intent)>
			return;
	//    7   13:return          
		}
	}

	public void contributeTo(AbstractEvent abstractevent)
	{
		abstractevent.setEventContext(EventContext.BONUSES);
	//    0    0:aload_1         
	//    1    1:getstatic       #135 <Field EventContext EventContext.BONUSES>
	//    2    4:invokevirtual   #141 <Method void AbstractEvent.setEventContext(EventContext)>
	//    3    7:return          
	}

	protected volatile MvpComponent createComponent(MainComponent maincomponent)
	{
		return ((MvpComponent) (createComponent(maincomponent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #146 <Method BonusesPickerComponent createComponent(MainComponent)>
	//    3    5:areturn         
	}

	protected BonusesPickerComponent createComponent(MainComponent maincomponent)
	{
		return DaggerBonusesPickerComponent.builder().mainComponent(maincomponent).bonusesPickerModule(new BonusesPickerModule(((BonusesPickerView) (this)))).build();
	//    0    0:invokestatic    #152 <Method DaggerBonusesPickerComponent$Builder DaggerBonusesPickerComponent.builder()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #158 <Method DaggerBonusesPickerComponent$Builder DaggerBonusesPickerComponent$Builder.mainComponent(MainComponent)>
	//    3    7:new             #160 <Class BonusesPickerModule>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #163 <Method void BonusesPickerModule(BonusesPickerView)>
	//    7   15:invokevirtual   #167 <Method DaggerBonusesPickerComponent$Builder DaggerBonusesPickerComponent$Builder.bonusesPickerModule(BonusesPickerModule)>
	//    8   18:invokevirtual   #171 <Method BonusesPickerComponent DaggerBonusesPickerComponent$Builder.build()>
	//    9   21:areturn         
	}

	public volatile SwipeRefreshLayout getPtrView()
	{
		return ((SwipeRefreshLayout) (getPtrView()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #46  <Method IBSwipeRefreshLayout getPtrView()>
	//    2    4:areturn         
	}

	public IBSwipeRefreshLayout getPtrView()
	{
		return srlSwipeRefresh;
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field IBSwipeRefreshLayout srlSwipeRefresh>
	//    2    4:areturn         
	}

	protected void initToolBar()
	{
		super.initToolBar();
	//    0    0:aload_0         
	//    1    1:invokespecial   #177 <Method void PtrLoadingMvpActivity.initToolBar()>
		getSupportActionBar().setTitle(((CharSequence) (getString(0x7f110140))));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #181 <Method ActionBar getSupportActionBar()>
	//    4    8:aload_0         
	//    5    9:ldc1            #182 <Int 0x7f110140>
	//    6   11:invokevirtual   #186 <Method String getString(int)>
	//    7   14:invokevirtual   #192 <Method void ActionBar.setTitle(CharSequence)>
		getSupportActionBar().setSubtitle(((CharSequence) (null)));
	//    8   17:aload_0         
	//    9   18:invokevirtual   #181 <Method ActionBar getSupportActionBar()>
	//   10   21:aconst_null     
	//   11   22:invokevirtual   #195 <Method void ActionBar.setSubtitle(CharSequence)>
		getSupportActionBar().setLogo(((android.graphics.drawable.Drawable) (null)));
	//   12   25:aload_0         
	//   13   26:invokevirtual   #181 <Method ActionBar getSupportActionBar()>
	//   14   29:aconst_null     
	//   15   30:invokevirtual   #199 <Method void ActionBar.setLogo(android.graphics.drawable.Drawable)>
		getSupportActionBar().setDisplayUseLogoEnabled(false);
	//   16   33:aload_0         
	//   17   34:invokevirtual   #181 <Method ActionBar getSupportActionBar()>
	//   18   37:iconst_0        
	//   19   38:invokevirtual   #203 <Method void ActionBar.setDisplayUseLogoEnabled(boolean)>
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	//   20   41:aload_0         
	//   21   42:invokevirtual   #181 <Method ActionBar getSupportActionBar()>
	//   22   45:iconst_1        
	//   23   46:invokevirtual   #206 <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
	//   24   49:return          
	}

	protected volatile void inject(MvpComponent mvpcomponent)
	{
		inject((BonusesPickerComponent)mvpcomponent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #210 <Class BonusesPickerComponent>
	//    3    5:invokevirtual   #213 <Method void inject(BonusesPickerComponent)>
	//    4    8:return          
	}

	protected void inject(BonusesPickerComponent bonusespickercomponent)
	{
		bonusespickercomponent.inject(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #215 <Method void BonusesPickerComponent.inject(BonusesPickerActivity)>
	//    3    7:return          
	}

	public void launchFindRebates()
	{
		showFindRebates();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #219 <Method void showFindRebates()>
		finish();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #222 <Method void finish()>
	//    4    8:return          
	}

	public void onBonusClicked(BonusModel bonusmodel)
	{
		adapter.trackBonusClick(bonusmodel);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field BonusPickerPagerAdapter adapter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #227 <Method void BonusPickerPagerAdapter.trackBonusClick(BonusModel)>
		((BonusesPickerPresenter)mvpPresenter).onBonusClicked(bonusmodel);
	//    4    8:aload_0         
	//    5    9:getfield        #231 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    6   12:checkcast       #233 <Class BonusesPickerPresenter>
	//    7   15:aload_1         
	//    8   16:invokeinterface #235 <Method void BonusesPickerPresenter.onBonusClicked(BonusModel)>
	//    9   21:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #240 <Method void PtrLoadingMvpActivity.onCreate(Bundle)>
		setContentView(0x7f0c0021);
	//    3    5:aload_0         
	//    4    6:ldc1            #241 <Int 0x7f0c0021>
	//    5    8:invokevirtual   #245 <Method void setContentView(int)>
		setUnbinder(ButterKnife.bind(((android.app.Activity) (this))));
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:invokestatic    #251 <Method butterknife.Unbinder ButterKnife.bind(android.app.Activity)>
	//    9   16:invokevirtual   #255 <Method void setUnbinder(butterknife.Unbinder)>
		initTabSelector();
	//   10   19:aload_0         
	//   11   20:invokespecial   #257 <Method void initTabSelector()>
	//   12   23:return          
	}

	public void onFindRebatesClicked()
	{
		((BonusesPickerPresenter)mvpPresenter).onFindRebatesClicked();
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #233 <Class BonusesPickerPresenter>
	//    3    7:invokeinterface #261 <Method void BonusesPickerPresenter.onFindRebatesClicked()>
	//    4   12:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #264 <Method void PtrLoadingMvpActivity.onResume()>
		brazeTracking.trackBonusesView();
	//    2    4:aload_0         
	//    3    5:getfield        #266 <Field BrazeTracking brazeTracking>
	//    4    8:invokeinterface #271 <Method void BrazeTracking.trackBonusesView()>
	//    5   13:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #274 <Method void PtrLoadingMvpActivity.onStop()>
		for(int i = 0; i < tsvTabSelector.getTabCount(); i++)
	//*   2    4:iconst_0        
	//*   3    5:istore_1        
	//*   4    6:iload_1         
	//*   5    7:aload_0         
	//*   6    8:getfield        #64  <Field TabSelectorView tsvTabSelector>
	//*   7   11:invokevirtual   #277 <Method int TabSelectorView.getTabCount()>
	//*   8   14:icmpge          39
			adapter.setTabHidden(tsvTabSelector.getTabAt(i));
	//    9   17:aload_0         
	//   10   18:getfield        #38  <Field BonusPickerPagerAdapter adapter>
	//   11   21:aload_0         
	//   12   22:getfield        #64  <Field TabSelectorView tsvTabSelector>
	//   13   25:iload_1         
	//   14   26:invokevirtual   #94  <Method android.support.design.widget.TabLayout$Tab TabSelectorView.getTabAt(int)>
	//   15   29:invokevirtual   #281 <Method void BonusPickerPagerAdapter.setTabHidden(android.support.design.widget.TabLayout$Tab)>

	//   16   32:iload_1         
	//   17   33:iconst_1        
	//   18   34:iadd            
	//   19   35:istore_1        
	//*  20   36:goto            6
	//   21   39:return          
	}

	public void onSubListBonusClicked(FeaturedBonusRow featuredbonusrow, BonusModel bonusmodel, int i)
	{
		adapter.trackSubListContentClicked(featuredbonusrow, bonusmodel, i);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field BonusPickerPagerAdapter adapter>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #286 <Method void BonusPickerPagerAdapter.trackSubListContentClicked(FeaturedBonusRow, BonusModel, int)>
		((BonusesPickerPresenter)mvpPresenter).onBonusClicked(bonusmodel);
	//    6   10:aload_0         
	//    7   11:getfield        #231 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    8   14:checkcast       #233 <Class BonusesPickerPresenter>
	//    9   17:aload_2         
	//   10   18:invokeinterface #235 <Method void BonusesPickerPresenter.onBonusClicked(BonusModel)>
	//   11   23:return          
	}

	public void onSubListContentVisible(FeaturedBonusRow featuredbonusrow, BonusModel bonusmodel, int i)
	{
		adapter.trackSubListContentVisible(featuredbonusrow, bonusmodel, i);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field BonusPickerPagerAdapter adapter>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #290 <Method void BonusPickerPagerAdapter.trackSubListContentVisible(FeaturedBonusRow, BonusModel, int)>
	//    6   10:return          
	}

	public void setDataMap(LinkedHashMap linkedhashmap)
	{
		adapter.setDataMap(linkedhashmap);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field BonusPickerPagerAdapter adapter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #294 <Method void BonusPickerPagerAdapter.setDataMap(LinkedHashMap)>
	//    4    8:return          
	}

	public void showBonusDetails(BonusModel bonusmodel)
	{
		startActivity((new BonusDetailIntentCreator(((Context) (this)))).bonusName(bonusmodel.getName()).bonusIds(new int[] {
			bonusmodel.getId()
		}).create());
	//    0    0:aload_0         
	//    1    1:new             #299 <Class BonusDetailIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #301 <Method void BonusDetailIntentCreator(Context)>
	//    5    9:aload_1         
	//    6   10:invokeinterface #307 <Method String BonusModel.getName()>
	//    7   15:invokevirtual   #311 <Method BonusDetailIntentCreator BonusDetailIntentCreator.bonusName(String)>
	//    8   18:iconst_1        
	//    9   19:newarray        int[]
	//   10   21:dup             
	//   11   22:iconst_0        
	//   12   23:aload_1         
	//   13   24:invokeinterface #314 <Method int BonusModel.getId()>
	//   14   29:iastore         
	//   15   30:invokevirtual   #318 <Method BonusDetailIntentCreator BonusDetailIntentCreator.bonusIds(int[])>
	//   16   33:invokevirtual   #322 <Method Intent BonusDetailIntentCreator.create()>
	//   17   36:invokevirtual   #323 <Method void startActivity(Intent)>
	//   18   39:return          
	}

	private BonusPickerPagerAdapter adapter;
	protected BrazeTracking brazeTracking;
	protected IBSwipeRefreshLayout srlSwipeRefresh;
	protected TabSelectorView tsvTabSelector;
	protected ViewPager vpPager;


/*
	static BonusPickerPagerAdapter access$000(BonusesPickerActivity bonusespickeractivity)
	{
		return bonusespickeractivity.adapter;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field BonusPickerPagerAdapter adapter>
	//    2    4:areturn         
	}

*/
}
