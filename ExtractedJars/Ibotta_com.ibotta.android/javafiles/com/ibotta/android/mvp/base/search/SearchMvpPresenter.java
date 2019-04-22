// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.search;

import com.ibotta.android.apiandroid.content.ContentId;
import com.ibotta.android.mvp.base.loading.LoadingMvpPresenter;
import com.ibotta.android.views.base.info.InformationRowViewState;
import com.ibotta.android.views.base.info.MisspellingConfidenceLevel;
import com.ibotta.android.views.search.SearchViewEvents;
import com.ibotta.android.views.search.suggested.SuggestedSearchItemViewState;
import com.ibotta.api.model.RetailerModel;
import com.ibotta.api.model.search.SearchType;

public interface SearchMvpPresenter
	extends LoadingMvpPresenter, SearchViewEvents
{

	public abstract SearchType getMisspellingWithConfidence(MisspellingConfidenceLevel misspellingconfidencelevel);

	public abstract void initSearch();

	public abstract void onAnyProductBarcodeScanned(String s);

	public abstract void onAnySuggestedViewTouch();

	public abstract void onBackPressed();

	public abstract void onClearAllSearchTerms();

	public abstract void onClearSearchTerm(String s);

	public abstract void onConfirmClearAllSearchTerms();

	public abstract void onEmptyViewClicked();

	public abstract void onExitSearch();

	public abstract void onInformationRowViewClicked(InformationRowViewState informationrowviewstate);

	public abstract void onMainButtonClicked(ContentId contentid);

	public abstract void onRecentRetailerClicked(ContentId contentid);

	public abstract void onRetailerRowClicked(RetailerModel retailermodel);

	public abstract void onRowClicked(ContentId contentid);

	public abstract void onScanSearchClicked();

	public abstract void onSuggestionRowClicked(SuggestedSearchItemViewState suggestedsearchitemviewstate);

	public abstract void onUnlockCompleted();

	public abstract void search(String s, SearchType searchtype);

	public abstract void trackClick(Object obj);
}
