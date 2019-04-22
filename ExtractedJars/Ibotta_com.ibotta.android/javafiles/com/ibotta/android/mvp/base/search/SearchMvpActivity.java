// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.search;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.view.View;
import android.widget.EditText;
import com.ibotta.android.aop.tracking.TrackingAspect;
import com.ibotta.android.apiandroid.barcode.BarcodeParcel;
import com.ibotta.android.apiandroid.content.ContentId;
import com.ibotta.android.fragment.dialog.DialogFragmentHelper;
import com.ibotta.android.fragment.dialog.PromptDialogFragment;
import com.ibotta.android.mvp.base.MvpPresenter;
import com.ibotta.android.mvp.base.loading.PtrLoadingMvpActivity;
import com.ibotta.android.mvp.ui.activity.scan.any.AnyProductScanActivity;
import com.ibotta.android.mvp.ui.view.content.ContentCardViewEvents;
import com.ibotta.android.mvp.ui.view.nav.NavButtonType;
import com.ibotta.android.tracking.proprietary.TrackingQueue;
import com.ibotta.android.util.AppHelper;
import com.ibotta.android.views.base.info.InformationRowViewEvents;
import com.ibotta.android.views.base.info.InformationRowViewState;
import com.ibotta.android.views.content.row.ContentRowViewEvents;
import com.ibotta.android.views.empty.EmptyViewEvents;
import com.ibotta.android.views.list.IbottaListView;
import com.ibotta.android.views.list.IbottaListViewState;
import com.ibotta.android.views.retailers.RetailerSSCardViewEvents;
import com.ibotta.android.views.search.*;
import com.ibotta.android.views.search.suggested.*;
import com.ibotta.api.model.ContentModel;
import com.ibotta.api.model.RetailerModel;
import org.aspectj.runtime.reflect.Factory;

// Referenced classes of package com.ibotta.android.mvp.base.search:
//			SearchMvpView, SearchMvpPresenter

public abstract class SearchMvpActivity extends PtrLoadingMvpActivity
	implements SearchMvpView, ContentCardViewEvents, InformationRowViewEvents, ContentRowViewEvents, EmptyViewEvents, RetailerSSCardViewEvents, SuggestedSearchItemViewEvents, SuggestedSearchTitleViewEvents
{

	public SearchMvpActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void PtrLoadingMvpActivity()>
	//    2    4:return          
	}

	private static void ajc$preClinit()
	{
		Factory factory = new Factory("SearchMvpActivity.java", com/ibotta/android/mvp/base/search/SearchMvpActivity);
	//    0    0:new             #52  <Class Factory>
	//    1    3:dup             
	//    2    4:ldc1            #54  <String "SearchMvpActivity.java">
	//    3    6:ldc1            #2   <Class SearchMvpActivity>
	//    4    8:invokespecial   #57  <Method void Factory(String, Class)>
	//    5   11:astore_0        
		ajc$tjp_0 = factory.makeSJP("method-execution", ((org.aspectj.lang.Signature) (factory.makeMethodSig("1", "updateSearchListViewState", "com.ibotta.android.mvp.base.search.SearchMvpActivity", "com.ibotta.android.views.list.IbottaListViewState", "viewState", "", "void"))), 75);
	//    6   12:aload_0         
	//    7   13:ldc1            #59  <String "method-execution">
	//    8   15:aload_0         
	//    9   16:ldc1            #61  <String "1">
	//   10   18:ldc1            #63  <String "updateSearchListViewState">
	//   11   20:ldc1            #65  <String "com.ibotta.android.mvp.base.search.SearchMvpActivity">
	//   12   22:ldc1            #67  <String "com.ibotta.android.views.list.IbottaListViewState">
	//   13   24:ldc1            #69  <String "viewState">
	//   14   26:ldc1            #71  <String "">
	//   15   28:ldc1            #73  <String "void">
	//   16   30:invokevirtual   #77  <Method org.aspectj.lang.reflect.MethodSignature Factory.makeMethodSig(String, String, String, String, String, String, String)>
	//   17   33:bipush          75
	//   18   35:invokevirtual   #81  <Method org.aspectj.lang.JoinPoint$StaticPart Factory.makeSJP(String, org.aspectj.lang.Signature, int)>
	//   19   38:putstatic       #83  <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_0>
	//   20   41:return          
	}

	private void handleCollapsingToolbarScrollFlags(boolean flag)
	{
		android.support.design.widget.AppBarLayout.LayoutParams layoutparams = (android.support.design.widget.AppBarLayout.LayoutParams)ctlCollapsingSearch.getLayoutParams();
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field CollapsingToolbarLayout ctlCollapsingSearch>
	//    2    4:invokevirtual   #93  <Method android.view.ViewGroup$LayoutParams CollapsingToolbarLayout.getLayoutParams()>
	//    3    7:checkcast       #95  <Class android.support.design.widget.AppBarLayout$LayoutParams>
	//    4   10:astore_2        
		if(flag)
	//*   5   11:iload_1         
	//*   6   12:ifeq            21
		{
			layoutparams.setScrollFlags(0);
	//    7   15:aload_2         
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #99  <Method void android.support.design.widget.AppBarLayout$LayoutParams.setScrollFlags(int)>
			return;
	//   10   20:return          
		} else
		{
			layoutparams.setScrollFlags(5);
	//   11   21:aload_2         
	//   12   22:iconst_5        
	//   13   23:invokevirtual   #99  <Method void android.support.design.widget.AppBarLayout$LayoutParams.setScrollFlags(int)>
			return;
	//   14   26:return          
		}
	}

	public void bindView(SearchViewState searchviewstate)
	{
		getSearchView().updateViewState(searchviewstate);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method SearchView getSearchView()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #110 <Method void SearchView.updateViewState(SearchViewState)>
	//    4    8:return          
	}

	public void clearSearchFocus()
	{
		getSearchView().getSearchEditText().clearFocus();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method SearchView getSearchView()>
	//    2    4:invokevirtual   #115 <Method EditText SearchView.getSearchEditText()>
	//    3    7:invokevirtual   #120 <Method void EditText.clearFocus()>
	//    4   10:return          
	}

	protected abstract View getMainView();

	public NavButtonType getNavButtonType()
	{
		return NavButtonType.FIND_REBATES;
	//    0    0:getstatic       #131 <Field NavButtonType NavButtonType.FIND_REBATES>
	//    1    3:areturn         
	}

	public String getSearchHint()
	{
		return getString(0x7f1105bd);
	//    0    0:aload_0         
	//    1    1:ldc1            #134 <Int 0x7f1105bd>
	//    2    3:invokevirtual   #138 <Method String getString(int)>
	//    3    6:areturn         
	}

	protected abstract IbottaListView getSearchResultsView();

	protected abstract SearchView getSearchView();

	public void hideKeyboard()
	{
		appHelper.hideSoftKeyboard(((View) (getSearchView().getSearchEditText())));
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field AppHelper appHelper>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #105 <Method SearchView getSearchView()>
	//    4    8:invokevirtual   #115 <Method EditText SearchView.getSearchEditText()>
	//    5   11:invokeinterface #149 <Method void AppHelper.hideSoftKeyboard(View)>
	//    6   16:return          
	}

	public void hideMainView()
	{
		handleCollapsingToolbarScrollFlags(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #153 <Method void handleCollapsingToolbarScrollFlags(boolean)>
		if(getMainView() != null)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #155 <Method View getMainView()>
	//*   5    9:ifnull          21
			getMainView().setVisibility(8);
	//    6   12:aload_0         
	//    7   13:invokevirtual   #155 <Method View getMainView()>
	//    8   16:bipush          8
	//    9   18:invokevirtual   #160 <Method void View.setVisibility(int)>
	//   10   21:return          
	}

	public void hideSearchResultsView()
	{
		getSearchResultsView().setVisibility(8);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #164 <Method IbottaListView getSearchResultsView()>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #167 <Method void IbottaListView.setVisibility(int)>
	//    4    9:return          
	}

	public void onActionButtonClick()
	{
	//    0    0:return          
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		super.onActivityResult(i, j, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #172 <Method void PtrLoadingMvpActivity.onActivityResult(int, int, Intent)>
		if(4 == i && j == 1)
	//*   5    7:iconst_4        
	//*   6    8:iload_1         
	//*   7    9:icmpne          56
	//*   8   12:iload_2         
	//*   9   13:iconst_1        
	//*  10   14:icmpne          56
		{
			intent = ((Intent) ((BarcodeParcel)intent.getParcelableExtra("barcode")));
	//   11   17:aload_3         
	//   12   18:ldc1            #174 <String "barcode">
	//   13   20:invokevirtual   #180 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   14   23:checkcast       #182 <Class BarcodeParcel>
	//   15   26:astore_3        
			if(intent != null)
	//*  16   27:aload_3         
	//*  17   28:ifnull          39
				intent = ((Intent) (((BarcodeParcel) (intent)).getUpc()));
	//   18   31:aload_3         
	//   19   32:invokevirtual   #185 <Method String BarcodeParcel.getUpc()>
	//   20   35:astore_3        
			else
	//*  21   36:goto            42
				intent = "";
	//   22   39:ldc1            #71  <String "">
	//   23   41:astore_3        
			((SearchMvpPresenter)mvpPresenter).onAnyProductBarcodeScanned(((String) (intent)));
	//   24   42:aload_0         
	//   25   43:getfield        #50  <Field MvpPresenter mvpPresenter>
	//   26   46:checkcast       #187 <Class SearchMvpPresenter>
	//   27   49:aload_3         
	//   28   50:invokeinterface #191 <Method void SearchMvpPresenter.onAnyProductBarcodeScanned(String)>
			return;
	//   29   55:return          
		}
		if(i == 3 && j == 1)
	//*  30   56:iload_1         
	//*  31   57:iconst_3        
	//*  32   58:icmpne          78
	//*  33   61:iload_2         
	//*  34   62:iconst_1        
	//*  35   63:icmpne          78
			((SearchMvpPresenter)mvpPresenter).onUnlockCompleted();
	//   36   66:aload_0         
	//   37   67:getfield        #50  <Field MvpPresenter mvpPresenter>
	//   38   70:checkcast       #187 <Class SearchMvpPresenter>
	//   39   73:invokeinterface #194 <Method void SearchMvpPresenter.onUnlockCompleted()>
	//   40   78:return          
	}

	public void onBackPressed()
	{
		((SearchMvpPresenter)mvpPresenter).onBackPressed();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #187 <Class SearchMvpPresenter>
	//    3    7:invokeinterface #197 <Method void SearchMvpPresenter.onBackPressed()>
	//    4   12:return          
	}

	public void onBackWhenNotSearching()
	{
		super.onBackPressed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #199 <Method void PtrLoadingMvpActivity.onBackPressed()>
	//    2    4:return          
	}

	public void onClearAllClicked()
	{
		((SearchMvpPresenter)mvpPresenter).onClearAllSearchTerms();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #187 <Class SearchMvpPresenter>
	//    3    7:invokeinterface #203 <Method void SearchMvpPresenter.onClearAllSearchTerms()>
	//    4   12:return          
	}

	public void onContentActionClicked(ContentId contentid)
	{
		((SearchMvpPresenter)mvpPresenter).onMainButtonClicked(contentid);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #187 <Class SearchMvpPresenter>
	//    3    7:aload_1         
	//    4    8:invokeinterface #208 <Method void SearchMvpPresenter.onMainButtonClicked(ContentId)>
	//    5   13:return          
	}

	public void onContentClicked(ContentModel contentmodel, RetailerModel retailermodel)
	{
		((SearchMvpPresenter)mvpPresenter).onUnlockedClicked(contentmodel, retailermodel);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #187 <Class SearchMvpPresenter>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #213 <Method void SearchMvpPresenter.onUnlockedClicked(ContentModel, RetailerModel)>
	//    6   14:return          
	}

	public void onContentImageClicked()
	{
	//    0    0:return          
	}

	public void onCtaClicked(SuggestedSearchItemViewState suggestedsearchitemviewstate)
	{
		((SearchMvpPresenter)mvpPresenter).onClearSearchTerm(suggestedsearchitemviewstate.getSuggestionText().toUpperCase());
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #187 <Class SearchMvpPresenter>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #222 <Method String SuggestedSearchItemViewState.getSuggestionText()>
	//    5   11:invokevirtual   #227 <Method String String.toUpperCase()>
	//    6   14:invokeinterface #230 <Method void SearchMvpPresenter.onClearSearchTerm(String)>
	//    7   19:return          
	}

	public void onEmptyViewClicked()
	{
		((SearchMvpPresenter)mvpPresenter).onEmptyViewClicked();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #187 <Class SearchMvpPresenter>
	//    3    7:invokeinterface #234 <Method void SearchMvpPresenter.onEmptyViewClicked()>
	//    4   12:return          
	}

	public void onInformationRowClicked(InformationRowViewState informationrowviewstate)
	{
		((SearchMvpPresenter)mvpPresenter).onInformationRowViewClicked(informationrowviewstate);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #187 <Class SearchMvpPresenter>
	//    3    7:aload_1         
	//    4    8:invokeinterface #239 <Method void SearchMvpPresenter.onInformationRowViewClicked(InformationRowViewState)>
	//    5   13:return          
	}

	public void onListViewTouched()
	{
		((SearchMvpPresenter)mvpPresenter).onAnySuggestedViewTouch();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #187 <Class SearchMvpPresenter>
	//    3    7:invokeinterface #243 <Method void SearchMvpPresenter.onAnySuggestedViewTouch()>
	//    4   12:return          
	}

	protected void onPostCreate(Bundle bundle)
	{
		super.onPostCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #247 <Method void PtrLoadingMvpActivity.onPostCreate(Bundle)>
		getSearchView().bindViewEvents((SearchViewEvents)mvpPresenter);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #105 <Method SearchView getSearchView()>
	//    5    9:aload_0         
	//    6   10:getfield        #50  <Field MvpPresenter mvpPresenter>
	//    7   13:checkcast       #249 <Class SearchViewEvents>
	//    8   16:invokevirtual   #253 <Method void SearchView.bindViewEvents(SearchViewEvents)>
		((SearchMvpPresenter)mvpPresenter).initSearch();
	//    9   19:aload_0         
	//   10   20:getfield        #50  <Field MvpPresenter mvpPresenter>
	//   11   23:checkcast       #187 <Class SearchMvpPresenter>
	//   12   26:invokeinterface #256 <Method void SearchMvpPresenter.initSearch()>
		getSearchResultsView().bindViewEvents(((com.ibotta.android.views.list.IbottaListViewEvents) (this)));
	//   13   31:aload_0         
	//   14   32:invokevirtual   #164 <Method IbottaListView getSearchResultsView()>
	//   15   35:aload_0         
	//   16   36:invokevirtual   #259 <Method void IbottaListView.bindViewEvents(com.ibotta.android.views.list.IbottaListViewEvents)>
	//   17   39:return          
	}

	public void onRetailerClicked(ContentId contentid)
	{
		((SearchMvpPresenter)mvpPresenter).onRecentRetailerClicked(contentid);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #187 <Class SearchMvpPresenter>
	//    3    7:aload_1         
	//    4    8:invokeinterface #264 <Method void SearchMvpPresenter.onRecentRetailerClicked(ContentId)>
	//    5   13:return          
	}

	public void onRowClicked(ContentId contentid)
	{
		((SearchMvpPresenter)mvpPresenter).onRowClicked(contentid);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #187 <Class SearchMvpPresenter>
	//    3    7:aload_1         
	//    4    8:invokeinterface #267 <Method void SearchMvpPresenter.onRowClicked(ContentId)>
	//    5   13:return          
	}

	public void onRowClicked(SuggestedSearchItemViewState suggestedsearchitemviewstate)
	{
		((SearchMvpPresenter)mvpPresenter).onSuggestionRowClicked(suggestedsearchitemviewstate);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #187 <Class SearchMvpPresenter>
	//    3    7:aload_1         
	//    4    8:invokeinterface #270 <Method void SearchMvpPresenter.onSuggestionRowClicked(SuggestedSearchItemViewState)>
	//    5   13:return          
	}

	public void onRowRetailerImageClicked()
	{
	//    0    0:return          
	}

	public void onShopClicked(ContentModel contentmodel, RetailerModel retailermodel)
	{
		((SearchMvpPresenter)mvpPresenter).onShopClicked(contentmodel, retailermodel);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #187 <Class SearchMvpPresenter>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #274 <Method void SearchMvpPresenter.onShopClicked(ContentModel, RetailerModel)>
	//    6   14:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #277 <Method void PtrLoadingMvpActivity.onStart()>
		getSearchView().getSearchEditText().selectAll();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #105 <Method SearchView getSearchView()>
	//    4    8:invokevirtual   #115 <Method EditText SearchView.getSearchEditText()>
	//    5   11:invokevirtual   #280 <Method void EditText.selectAll()>
	//    6   14:return          
	}

	public void onUnlockClicked(ContentModel contentmodel, RetailerModel retailermodel)
	{
		((SearchMvpPresenter)mvpPresenter).onUnlockClicked(contentmodel, retailermodel);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #187 <Class SearchMvpPresenter>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #283 <Method void SearchMvpPresenter.onUnlockClicked(ContentModel, RetailerModel)>
	//    6   14:return          
	}

	public void onUnlockedClicked(ContentModel contentmodel, RetailerModel retailermodel)
	{
		((SearchMvpPresenter)mvpPresenter).onUnlockedClicked(contentmodel, retailermodel);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #187 <Class SearchMvpPresenter>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #213 <Method void SearchMvpPresenter.onUnlockedClicked(ContentModel, RetailerModel)>
	//    6   14:return          
	}

	public void requestSearchFocus()
	{
		getSearchView().getSearchEditText().requestFocus();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method SearchView getSearchView()>
	//    2    4:invokevirtual   #115 <Method EditText SearchView.getSearchEditText()>
	//    3    7:invokevirtual   #288 <Method boolean EditText.requestFocus()>
	//    4   10:pop             
	//    5   11:return          
	}

	public void showAnyProductBarcodeScan()
	{
		AnyProductScanActivity.startForResult(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #295 <Method void AnyProductScanActivity.startForResult(android.app.Activity)>
	//    2    4:return          
	}

	public void showConfirmClearAllSearchTermsDialog()
	{
		PromptDialogFragment promptdialogfragment = PromptDialogFragment.newInstance(getString(0x7f1100fd), getString(0x7f1100fe), new int[] {
			0x7f1101b9, 0x7f11020d
		});
	//    0    0:aload_0         
	//    1    1:ldc2            #297 <Int 0x7f1100fd>
	//    2    4:invokevirtual   #138 <Method String getString(int)>
	//    3    7:aload_0         
	//    4    8:ldc2            #298 <Int 0x7f1100fe>
	//    5   11:invokevirtual   #138 <Method String getString(int)>
	//    6   14:iconst_2        
	//    7   15:newarray        int[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:ldc2            #299 <Int 0x7f1101b9>
	//   11   22:iastore         
	//   12   23:dup             
	//   13   24:iconst_1        
	//   14   25:ldc2            #300 <Int 0x7f11020d>
	//   15   28:iastore         
	//   16   29:invokestatic    #306 <Method PromptDialogFragment PromptDialogFragment.newInstance(String, String, int[])>
	//   17   32:astore_1        
		DialogFragmentHelper.INSTANCE.show(((com.ibotta.android.activity.CompatSupplier) (this)), ((android.support.v4.app.DialogFragment) (promptdialogfragment)));
	//   18   33:getstatic       #312 <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//   19   36:aload_0         
	//   20   37:aload_1         
	//   21   38:invokevirtual   #316 <Method void DialogFragmentHelper.show(com.ibotta.android.activity.CompatSupplier, android.support.v4.app.DialogFragment)>
		promptdialogfragment.setListener(((com.ibotta.android.fragment.dialog.IbottaDialogFragment.IbottaDialogFragmentListener) (new com.ibotta.android.fragment.dialog.PromptDialogFragment.PromptDialogListener() )));
	//   22   41:aload_1         
	//   23   42:new             #23  <Class SearchMvpActivity$1>
	//   24   45:dup             
	//   25   46:aload_0         
	//   26   47:invokespecial   #319 <Method void SearchMvpActivity$1(SearchMvpActivity)>
	//   27   50:invokevirtual   #323 <Method void PromptDialogFragment.setListener(com.ibotta.android.fragment.dialog.IbottaDialogFragment$IbottaDialogFragmentListener)>
	//   28   53:return          
	}

	public void showKeyboard()
	{
		appHelper.showSoftKeyboard(((View) (getSearchView().getSearchEditText())));
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field AppHelper appHelper>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #105 <Method SearchView getSearchView()>
	//    4    8:invokevirtual   #115 <Method EditText SearchView.getSearchEditText()>
	//    5   11:invokeinterface #327 <Method void AppHelper.showSoftKeyboard(View)>
	//    6   16:return          
	}

	public void showMainView()
	{
		handleCollapsingToolbarScrollFlags(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #153 <Method void handleCollapsingToolbarScrollFlags(boolean)>
		if(getMainView() != null)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #155 <Method View getMainView()>
	//*   5    9:ifnull          20
			getMainView().setVisibility(0);
	//    6   12:aload_0         
	//    7   13:invokevirtual   #155 <Method View getMainView()>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #160 <Method void View.setVisibility(int)>
	//   10   20:return          
	}

	public void showSearchError(Exception exception)
	{
		showErrorMessage(0x7f1102c4, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:ldc2            #331 <Int 0x7f1102c4>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #335 <Method void showErrorMessage(int, String)>
	//    4    8:return          
	}

	public void showSearchLoading()
	{
		getSearchResultsView().updateViewState(IbottaListViewState.LOADING);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #164 <Method IbottaListView getSearchResultsView()>
	//    2    4:getstatic       #342 <Field IbottaListViewState IbottaListViewState.LOADING>
	//    3    7:invokevirtual   #345 <Method void IbottaListView.updateViewState(IbottaListViewState)>
	//    4   10:return          
	}

	public void showSearchResultsView()
	{
		getSearchResultsView().setVisibility(0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #164 <Method IbottaListView getSearchResultsView()>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #167 <Method void IbottaListView.setVisibility(int)>
	//    4    8:return          
	}

	public void showSearchView()
	{
		getSearchView().setVisibility(0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method SearchView getSearchView()>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #348 <Method void SearchView.setVisibility(int)>
	//    4    8:return          
	}

	public void updateSearchListViewState(IbottaListViewState ibottalistviewstate)
	{
		org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, ((Object) (this)), ((Object) (this)), ((Object) (ibottalistviewstate)));
	//    0    0:getstatic       #83  <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_0>
	//    1    3:aload_0         
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #355 <Method org.aspectj.lang.JoinPoint Factory.makeJP(org.aspectj.lang.JoinPoint$StaticPart, Object, Object, Object)>
	//    5    9:astore_2        
		TrackingAspect.aspectOf().before(joinpoint);
	//    6   10:invokestatic    #361 <Method TrackingAspect TrackingAspect.aspectOf()>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #365 <Method void TrackingAspect.before(org.aspectj.lang.JoinPoint)>
		getSearchResultsView().updateViewState(ibottalistviewstate);
	//    9   17:aload_0         
	//   10   18:invokevirtual   #164 <Method IbottaListView getSearchResultsView()>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #345 <Method void IbottaListView.updateViewState(IbottaListViewState)>
	//   13   25:return          
	}

	private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
	protected AppHelper appHelper;
	protected CollapsingToolbarLayout ctlCollapsingSearch;
	protected TrackingQueue trackingQueue;

	static 
	{
		ajc$preClinit();
	//    0    0:invokestatic    #40  <Method void ajc$preClinit()>
	//*   1    3:return          
	}


/*
	static MvpPresenter access$000(SearchMvpActivity searchmvpactivity)
	{
		return searchmvpactivity.mvpPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field MvpPresenter mvpPresenter>
	//    2    4:areturn         
	}

*/
}
