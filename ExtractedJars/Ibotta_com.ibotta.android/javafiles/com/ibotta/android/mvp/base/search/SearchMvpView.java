// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.search;

import com.ibotta.android.mvp.base.loading.LoadingMvpView;
import com.ibotta.android.views.list.IbottaListViewState;
import com.ibotta.android.views.search.SearchViewState;

public interface SearchMvpView
	extends LoadingMvpView
{

	public abstract void bindView(SearchViewState searchviewstate);

	public abstract void clearSearchFocus();

	public abstract String getSearchHint();

	public abstract void hideKeyboard();

	public abstract void hideMainView();

	public abstract void hideSearchResultsView();

	public abstract void onBackWhenNotSearching();

	public abstract void requestSearchFocus();

	public abstract void showAnyProductBarcodeScan();

	public abstract void showConfirmClearAllSearchTermsDialog();

	public abstract void showKeyboard();

	public abstract void showMainView();

	public abstract void showSearchError(Exception exception);

	public abstract void showSearchLoading();

	public abstract void showSearchResultsView();

	public abstract void showSearchView();

	public abstract void updateSearchListViewState(IbottaListViewState ibottalistviewstate);
}
