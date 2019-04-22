// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.search;

import com.ibotta.android.apiandroid.content.ContentId;
import com.ibotta.android.favorites.FavoriteRetailersManagerFactory;
import com.ibotta.android.features.variant.retailers.LoadRetailersVariant;
import com.ibotta.android.mappers.ContentMapper;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.mvp.base.MvpView;
import com.ibotta.android.mvp.base.loading.AbstractLoadingMvpPresenter;
import com.ibotta.android.reducers.search.SearchResultsReducer;
import com.ibotta.android.search.*;
import com.ibotta.android.search.async.SearchAsync;
import com.ibotta.android.search.recent.Category;
import com.ibotta.android.search.recentlyviewed.RecentlyViewedRetailersService;
import com.ibotta.android.service.api.ApiWorkSubmitter;
import com.ibotta.android.service.api.Outcome;
import com.ibotta.android.service.api.job.*;
import com.ibotta.android.tracking.EventContextProvider;
import com.ibotta.android.tracking.content.ContentTrackingPayload;
import com.ibotta.android.tracking.proprietary.TrackingQueue;
import com.ibotta.android.tracking.proprietary.event.SearchEvent;
import com.ibotta.android.tracking.proprietary.event.enums.ClickType;
import com.ibotta.android.tracking.proprietary.event.enums.EventContext;
import com.ibotta.android.util.AppHelper;
import com.ibotta.android.util.content.ContentHelper;
import com.ibotta.android.views.base.button.IbottaButtonViewState;
import com.ibotta.android.views.base.info.InformationRowViewState;
import com.ibotta.android.views.base.info.MisspellingConfidenceLevel;
import com.ibotta.android.views.list.IbottaListViewState;
import com.ibotta.android.views.search.SearchViewState;
import com.ibotta.android.views.search.suggested.SuggestedSearchItemViewState;
import com.ibotta.api.call.home.HomeResponse;
import com.ibotta.api.helper.retailer.RetailerHelper;
import com.ibotta.api.model.*;
import com.ibotta.api.model.favorites.FavoriteRetailersManager;
import com.ibotta.api.model.search.*;
import java.util.*;
import java9.util.Optional;
import java9.util.stream.*;
import timber.log.Timber;

// Referenced classes of package com.ibotta.android.mvp.base.search:
//			SearchMvpPresenter, SearchMvpView

public abstract class AbstractSearchMvpPresenter extends AbstractLoadingMvpPresenter
	implements SearchMvpPresenter
{
	protected static final class SearchState extends Enum
	{

		public static SearchState valueOf(String s)
		{
			return (SearchState)Enum.valueOf(com/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter$SearchState, s);
		//    0    0:ldc1            #2   <Class AbstractSearchMvpPresenter$SearchState>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AbstractSearchMvpPresenter$SearchState>
		//    4    9:areturn         
		}

		public static SearchState[] values()
		{
			return (SearchState[])((SearchState []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field AbstractSearchMvpPresenter$SearchState[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.ibotta.android.mvp.base.search.AbstractSearchMvpPresenter$SearchState_3B_.clone()>
		//    2    6:checkcast       #42  <Class AbstractSearchMvpPresenter$SearchState[]>
		//    3    9:areturn         
		}

		private static final SearchState $VALUES[];
		public static final SearchState NOT_SEARCHING;
		public static final SearchState QUERYING;
		public static final SearchState VIEWING_RESULTS;

		static 
		{
			NOT_SEARCHING = new SearchState("NOT_SEARCHING", 0);
		//    0    0:new             #2   <Class AbstractSearchMvpPresenter$SearchState>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "NOT_SEARCHING">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void AbstractSearchMvpPresenter$SearchState(String, int)>
		//    5   10:putstatic       #23  <Field AbstractSearchMvpPresenter$SearchState NOT_SEARCHING>
			QUERYING = new SearchState("QUERYING", 1);
		//    6   13:new             #2   <Class AbstractSearchMvpPresenter$SearchState>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "QUERYING">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void AbstractSearchMvpPresenter$SearchState(String, int)>
		//   11   23:putstatic       #26  <Field AbstractSearchMvpPresenter$SearchState QUERYING>
			VIEWING_RESULTS = new SearchState("VIEWING_RESULTS", 2);
		//   12   26:new             #2   <Class AbstractSearchMvpPresenter$SearchState>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "VIEWING_RESULTS">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void AbstractSearchMvpPresenter$SearchState(String, int)>
		//   17   36:putstatic       #29  <Field AbstractSearchMvpPresenter$SearchState VIEWING_RESULTS>
			$VALUES = (new SearchState[] {
				NOT_SEARCHING, QUERYING, VIEWING_RESULTS
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       SearchState[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field AbstractSearchMvpPresenter$SearchState NOT_SEARCHING>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field AbstractSearchMvpPresenter$SearchState QUERYING>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field AbstractSearchMvpPresenter$SearchState VIEWING_RESULTS>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field AbstractSearchMvpPresenter$SearchState[] $VALUES>
		//*  33   64:return          
		}

		private SearchState(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public AbstractSearchMvpPresenter(MvpPresenterActions mvppresenteractions, AppHelper apphelper, ApiWorkSubmitter apiworksubmitter, RetailerHelper retailerhelper, SearchAsync searchasync, AsyncRecentSearchService asyncrecentsearchservice, AsyncSuggestedSearchService asyncsuggestedsearchservice, 
			LoadRetailersVariant loadretailersvariant, TrackingQueue trackingqueue, EventContextProvider eventcontextprovider, SearchResultsReducer searchresultsreducer, FavoriteRetailersManagerFactory favoriteretailersmanagerfactory, ContentMapper contentmapper, ContentHelper contenthelper, 
			SearchReducer searchreducer, SuggestedSearchItemsReducer suggestedsearchitemsreducer, RecentlyViewedRetailersService recentlyviewedretailersservice)
	{
		super(mvppresenteractions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #76  <Method void AbstractLoadingMvpPresenter(MvpPresenterActions)>
		lastTypedTerm = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #78  <String "">
	//    5    8:putfield        #80  <Field String lastTypedTerm>
		searchContentModels = Collections.emptyList();
	//    6   11:aload_0         
	//    7   12:invokestatic    #86  <Method List Collections.emptyList()>
	//    8   15:putfield        #88  <Field List searchContentModels>
		recentlyViewedRetailers = Collections.emptyList();
	//    9   18:aload_0         
	//   10   19:invokestatic    #86  <Method List Collections.emptyList()>
	//   11   22:putfield        #90  <Field List recentlyViewedRetailers>
		searchResults = SearchResults.EMPTY;
	//   12   25:aload_0         
	//   13   26:getstatic       #95  <Field SearchResults SearchResults.EMPTY>
	//   14   29:putfield        #97  <Field SearchResults searchResults>
		suggestedSearches = SuggestedSearches.EMPTY;
	//   15   32:aload_0         
	//   16   33:getstatic       #101 <Field SuggestedSearches SuggestedSearches.EMPTY>
	//   17   36:putfield        #103 <Field SuggestedSearches suggestedSearches>
		loading = true;
	//   18   39:aload_0         
	//   19   40:iconst_1        
	//   20   41:putfield        #105 <Field boolean loading>
		searchState = SearchState.NOT_SEARCHING;
	//   21   44:aload_0         
	//   22   45:getstatic       #108 <Field AbstractSearchMvpPresenter$SearchState AbstractSearchMvpPresenter$SearchState.NOT_SEARCHING>
	//   23   48:putfield        #110 <Field AbstractSearchMvpPresenter$SearchState searchState>
	//   24   51:aload_0         
	//   25   52:new             #9   <Class AbstractSearchMvpPresenter$1>
	//   26   55:dup             
	//   27   56:aload_0         
	//   28   57:invokespecial   #113 <Method void AbstractSearchMvpPresenter$1(AbstractSearchMvpPresenter)>
	//   29   60:putfield        #115 <Field ApiJobListener searchJobListener>
		appHelper = apphelper;
	//   30   63:aload_0         
	//   31   64:aload_2         
	//   32   65:putfield        #117 <Field AppHelper appHelper>
		apiWorkSubmitter = apiworksubmitter;
	//   33   68:aload_0         
	//   34   69:aload_3         
	//   35   70:putfield        #119 <Field ApiWorkSubmitter apiWorkSubmitter>
		retailerHelper = retailerhelper;
	//   36   73:aload_0         
	//   37   74:aload           4
	//   38   76:putfield        #121 <Field RetailerHelper retailerHelper>
		searchAsync = searchasync;
	//   39   79:aload_0         
	//   40   80:aload           5
	//   41   82:putfield        #123 <Field SearchAsync searchAsync>
		asyncRecentSearchService = asyncrecentsearchservice;
	//   42   85:aload_0         
	//   43   86:aload           6
	//   44   88:putfield        #125 <Field AsyncRecentSearchService asyncRecentSearchService>
		asyncSuggestedSearchService = asyncsuggestedsearchservice;
	//   45   91:aload_0         
	//   46   92:aload           7
	//   47   94:putfield        #127 <Field AsyncSuggestedSearchService asyncSuggestedSearchService>
		loadRetailersVariant = loadretailersvariant;
	//   48   97:aload_0         
	//   49   98:aload           8
	//   50  100:putfield        #129 <Field LoadRetailersVariant loadRetailersVariant>
		trackingQueue = trackingqueue;
	//   51  103:aload_0         
	//   52  104:aload           9
	//   53  106:putfield        #131 <Field TrackingQueue trackingQueue>
		eventContextProvider = eventcontextprovider;
	//   54  109:aload_0         
	//   55  110:aload           10
	//   56  112:putfield        #133 <Field EventContextProvider eventContextProvider>
		searchResultsReducer = searchresultsreducer;
	//   57  115:aload_0         
	//   58  116:aload           11
	//   59  118:putfield        #135 <Field SearchResultsReducer searchResultsReducer>
		favoriteRetailersManagerFactory = favoriteretailersmanagerfactory;
	//   60  121:aload_0         
	//   61  122:aload           12
	//   62  124:putfield        #137 <Field FavoriteRetailersManagerFactory favoriteRetailersManagerFactory>
		contentMapper = contentmapper;
	//   63  127:aload_0         
	//   64  128:aload           13
	//   65  130:putfield        #139 <Field ContentMapper contentMapper>
		contentHelper = contenthelper;
	//   66  133:aload_0         
	//   67  134:aload           14
	//   68  136:putfield        #141 <Field ContentHelper contentHelper>
		searchReducer = searchreducer;
	//   69  139:aload_0         
	//   70  140:aload           15
	//   71  142:putfield        #143 <Field SearchReducer searchReducer>
		suggestedSearchItemsReducer = suggestedsearchitemsreducer;
	//   72  145:aload_0         
	//   73  146:aload           16
	//   74  148:putfield        #145 <Field SuggestedSearchItemsReducer suggestedSearchItemsReducer>
		recentlyViewedRetailersService = recentlyviewedretailersservice;
	//   75  151:aload_0         
	//   76  152:aload           17
	//   77  154:putfield        #147 <Field RecentlyViewedRetailersService recentlyViewedRetailersService>
	//   78  157:return          
	}

	private boolean areAllJobsFinished()
	{
		HomeApiJob homeapijob = homeJob;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field HomeApiJob homeJob>
	//    2    4:astore_1        
		return homeapijob == null || homeapijob.getOutcome() != Outcome.UNKNOWN;
	//    3    5:aload_1         
	//    4    6:ifnull          24
	//    5    9:aload_1         
	//    6   10:invokevirtual   #179 <Method Outcome HomeApiJob.getOutcome()>
	//    7   13:getstatic       #185 <Field Outcome Outcome.UNKNOWN>
	//    8   16:if_acmpeq       22
	//    9   19:goto            24
	//   10   22:iconst_0        
	//   11   23:ireturn         
	//   12   24:iconst_1        
	//   13   25:ireturn         
	}

	private void checkIfLoadFinished(SearchMvpView searchmvpview)
	{
		if(!areAllJobsFinished())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #187 <Method boolean areAllJobsFinished()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		loading = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #105 <Field boolean loading>
		HomeApiJob homeapijob = homeJob;
	//    7   13:aload_0         
	//    8   14:getfield        #158 <Field HomeApiJob homeJob>
	//    9   17:astore_3        
		boolean flag;
		if(homeapijob != null && !homeapijob.isSuccessfullyLoaded())
	//*  10   18:aload_3         
	//*  11   19:ifnull          37
	//*  12   22:aload_3         
	//*  13   23:invokevirtual   #190 <Method boolean HomeApiJob.isSuccessfullyLoaded()>
	//*  14   26:ifeq            32
	//*  15   29:goto            37
			flag = false;
	//   16   32:iconst_0        
	//   17   33:istore_2        
		else
	//*  18   34:goto            39
			flag = true;
	//   19   37:iconst_1        
	//   20   38:istore_2        
		if(flag)
	//*  21   39:iload_2         
	//*  22   40:ifeq            48
		{
			onSearchDependencyJobsFinishedSuccessfully();
	//   23   43:aload_0         
	//   24   44:invokespecial   #194 <Method void onSearchDependencyJobsFinishedSuccessfully()>
			return;
	//   25   47:return          
		} else
		{
			onSearchDependencyJobsFinishedWithFailures(searchmvpview);
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:invokespecial   #197 <Method void onSearchDependencyJobsFinishedWithFailures(SearchMvpView)>
			Timber.w("Search dependency job failed: %1$s", new Object[] {
				homeJob
			});
	//   29   53:ldc1            #199 <String "Search dependency job failed: %1$s">
	//   30   55:iconst_1        
	//   31   56:anewarray       Object[]
	//   32   59:dup             
	//   33   60:iconst_0        
	//   34   61:aload_0         
	//   35   62:getfield        #158 <Field HomeApiJob homeJob>
	//   36   65:aastore         
	//   37   66:invokestatic    #207 <Method void Timber.w(String, Object[])>
			return;
	//   38   69:return          
		}
	}

	private SearchEvent getSearchEvent(String s, SearchType searchtype, ClickType clicktype)
	{
		SearchEvent searchevent = new SearchEvent();
	//    0    0:new             #213 <Class SearchEvent>
	//    1    3:dup             
	//    2    4:invokespecial   #215 <Method void SearchEvent()>
	//    3    7:astore          4
		searchevent.setCounter(1);
	//    4    9:aload           4
	//    5   11:iconst_1        
	//    6   12:invokevirtual   #219 <Method void SearchEvent.setCounter(int)>
		searchevent.setEventAt(appHelper.getCurrentTime());
	//    7   15:aload           4
	//    8   17:aload_0         
	//    9   18:getfield        #117 <Field AppHelper appHelper>
	//   10   21:invokeinterface #225 <Method long AppHelper.getCurrentTime()>
	//   11   26:invokevirtual   #229 <Method void SearchEvent.setEventAt(long)>
		searchevent.setTerm(s);
	//   12   29:aload           4
	//   13   31:aload_1         
	//   14   32:invokevirtual   #233 <Method void SearchEvent.setTerm(String)>
		searchevent.setSearchType(searchtype.toString());
	//   15   35:aload           4
	//   16   37:aload_2         
	//   17   38:invokevirtual   #239 <Method String SearchType.toString()>
	//   18   41:invokevirtual   #242 <Method void SearchEvent.setSearchType(String)>
		searchevent.setClicked(Boolean.valueOf(true));
	//   19   44:aload           4
	//   20   46:iconst_1        
	//   21   47:invokestatic    #248 <Method Boolean Boolean.valueOf(boolean)>
	//   22   50:invokevirtual   #252 <Method void SearchEvent.setClicked(Boolean)>
		searchevent.setClickType(clicktype);
	//   23   53:aload           4
	//   24   55:aload_3         
	//   25   56:invokevirtual   #256 <Method void SearchEvent.setClickType(ClickType)>
		eventContextProvider.provideContext(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (searchevent)));
	//   26   59:aload_0         
	//   27   60:getfield        #133 <Field EventContextProvider eventContextProvider>
	//   28   63:aload           4
	//   29   65:invokeinterface #262 <Method void EventContextProvider.provideContext(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
		return searchevent;
	//   30   70:aload           4
	//   31   72:areturn         
	}

	private void initFavoriteStoresManager(HomeResponse homeresponse)
	{
		favoriteRetailersManager = favoriteRetailersManagerFactory.newInstance(homeresponse.getRetailersAsModels());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #137 <Field FavoriteRetailersManagerFactory favoriteRetailersManagerFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #267 <Method List HomeResponse.getRetailersAsModels()>
	//    5    9:invokevirtual   #273 <Method FavoriteRetailersManager FavoriteRetailersManagerFactory.newInstance(List)>
	//    6   12:putfield        #275 <Field FavoriteRetailersManager favoriteRetailersManager>
	//    7   15:return          
	}

	private boolean isAlternativeSpellingSuggested(MisspellingConfidenceLevel misspellingconfidencelevel)
	{
		return misspellingconfidencelevel == MisspellingConfidenceLevel.MEDIUM || misspellingconfidencelevel == MisspellingConfidenceLevel.WEAK;
	//    0    0:aload_1         
	//    1    1:getstatic       #283 <Field MisspellingConfidenceLevel MisspellingConfidenceLevel.MEDIUM>
	//    2    4:if_acmpeq       19
	//    3    7:aload_1         
	//    4    8:getstatic       #286 <Field MisspellingConfidenceLevel MisspellingConfidenceLevel.WEAK>
	//    5   11:if_acmpne       17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	private boolean isMisspelled(SearchType searchtype)
	{
		return searchAsync.isMisspelled(searchtype);
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field SearchAsync searchAsync>
	//    2    4:aload_1         
	//    3    5:invokeinterface #292 <Method boolean SearchAsync.isMisspelled(SearchType)>
	//    4   10:ireturn         
	}

	public static void lambda$7oKDWkm1d3_1SRo47D1z8dTgGvI(AbstractSearchMvpPresenter abstractsearchmvppresenter, Exception exception)
	{
		abstractsearchmvppresenter.onSearchFailed(exception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #298 <Method void onSearchFailed(Exception)>
	//    3    5:return          
	}

	public static void lambda$fN0p4ygEjZBzvR7FQzn0FJKVv8g(AbstractSearchMvpPresenter abstractsearchmvppresenter, SearchResults searchresults)
	{
		abstractsearchmvppresenter.onSearchFinished(searchresults);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #304 <Method void onSearchFinished(SearchResults)>
	//    3    5:return          
	}

	public static void lambda$onQueryRecentSearches$1(AbstractSearchMvpPresenter abstractsearchmvppresenter, SuggestedSearchMode suggestedsearchmode, SuggestedSearches suggestedsearches)
	{
		if(abstractsearchmvppresenter.mvpView != null && abstractsearchmvppresenter.searchState == SearchState.QUERYING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #154 <Field MvpView mvpView>
	//*   2    4:ifnull          87
	//*   3    7:aload_0         
	//*   4    8:getfield        #110 <Field AbstractSearchMvpPresenter$SearchState searchState>
	//*   5   11:getstatic       #309 <Field AbstractSearchMvpPresenter$SearchState AbstractSearchMvpPresenter$SearchState.QUERYING>
	//*   6   14:if_acmpne       87
		{
			abstractsearchmvppresenter.suggestedSearches = suggestedsearches;
	//    7   17:aload_0         
	//    8   18:aload_2         
	//    9   19:putfield        #103 <Field SuggestedSearches suggestedSearches>
			((SearchMvpView)abstractsearchmvppresenter.mvpView).updateSearchListViewState(abstractsearchmvppresenter.suggestedSearchItemsReducer.create(suggestedsearchmode, abstractsearchmvppresenter.getRequestedSearchContent().contains(((Object) (com.ibotta.android.search.async.SearchAsync.SearchContent.RETAILERS))), suggestedsearches, abstractsearchmvppresenter.recentlyViewedRetailers, abstractsearchmvppresenter.getContentTrackingData()));
	//   10   22:aload_0         
	//   11   23:getfield        #154 <Field MvpView mvpView>
	//   12   26:checkcast       #311 <Class SearchMvpView>
	//   13   29:aload_0         
	//   14   30:getfield        #145 <Field SuggestedSearchItemsReducer suggestedSearchItemsReducer>
	//   15   33:aload_1         
	//   16   34:aload_0         
	//   17   35:invokevirtual   #315 <Method Set getRequestedSearchContent()>
	//   18   38:getstatic       #321 <Field com.ibotta.android.search.async.SearchAsync$SearchContent com.ibotta.android.search.async.SearchAsync$SearchContent.RETAILERS>
	//   19   41:invokeinterface #327 <Method boolean Set.contains(Object)>
	//   20   46:aload_2         
	//   21   47:aload_0         
	//   22   48:getfield        #90  <Field List recentlyViewedRetailers>
	//   23   51:aload_0         
	//   24   52:invokevirtual   #331 <Method ContentTrackingPayload getContentTrackingData()>
	//   25   55:invokevirtual   #337 <Method IbottaListViewState SuggestedSearchItemsReducer.create(SuggestedSearchMode, boolean, SuggestedSearches, List, ContentTrackingPayload)>
	//   26   58:invokeinterface #341 <Method void SearchMvpView.updateSearchListViewState(IbottaListViewState)>
			((SearchMvpView)abstractsearchmvppresenter.mvpView).showSearchResultsView();
	//   27   63:aload_0         
	//   28   64:getfield        #154 <Field MvpView mvpView>
	//   29   67:checkcast       #311 <Class SearchMvpView>
	//   30   70:invokeinterface #344 <Method void SearchMvpView.showSearchResultsView()>
			((SearchMvpView)abstractsearchmvppresenter.mvpView).hideMainView();
	//   31   75:aload_0         
	//   32   76:getfield        #154 <Field MvpView mvpView>
	//   33   79:checkcast       #311 <Class SearchMvpView>
	//   34   82:invokeinterface #347 <Method void SearchMvpView.hideMainView()>
		}
	//   35   87:return          
	}

	public static void lambda$onResume$0(AbstractSearchMvpPresenter abstractsearchmvppresenter, List list)
	{
		abstractsearchmvppresenter.checkIfLoadFinished((SearchMvpView)abstractsearchmvppresenter.mvpView);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #154 <Field MvpView mvpView>
	//    3    5:checkcast       #311 <Class SearchMvpView>
	//    4    8:invokespecial   #171 <Method void checkIfLoadFinished(SearchMvpView)>
		abstractsearchmvppresenter.recentlyViewedRetailers = list;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #90  <Field List recentlyViewedRetailers>
		if(abstractsearchmvppresenter.mvpView != null && abstractsearchmvppresenter.searchState == SearchState.QUERYING && abstractsearchmvppresenter.lastTypedTerm.isEmpty())
	//*   8   16:aload_0         
	//*   9   17:getfield        #154 <Field MvpView mvpView>
	//*  10   20:ifnull          51
	//*  11   23:aload_0         
	//*  12   24:getfield        #110 <Field AbstractSearchMvpPresenter$SearchState searchState>
	//*  13   27:getstatic       #309 <Field AbstractSearchMvpPresenter$SearchState AbstractSearchMvpPresenter$SearchState.QUERYING>
	//*  14   30:if_acmpne       51
	//*  15   33:aload_0         
	//*  16   34:getfield        #80  <Field String lastTypedTerm>
	//*  17   37:invokevirtual   #354 <Method boolean String.isEmpty()>
	//*  18   40:ifeq            51
			abstractsearchmvppresenter.onQueryRecentSearches(abstractsearchmvppresenter.lastTypedTerm);
	//   19   43:aload_0         
	//   20   44:aload_0         
	//   21   45:getfield        #80  <Field String lastTypedTerm>
	//   22   48:invokespecial   #357 <Method void onQueryRecentSearches(String)>
	//   23   51:return          
	}

	static boolean lambda$onSuggestionRowClicked$2(SuggestedSearchItemViewState suggestedsearchitemviewstate, SuggestedSearchItem suggestedsearchitem)
	{
		return suggestedsearchitem.getSearchTerm().trim().equalsIgnoreCase(suggestedsearchitemviewstate.getSuggestionText().trim());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #364 <Method String SuggestedSearchItem.getSearchTerm()>
	//    2    4:invokevirtual   #367 <Method String String.trim()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #372 <Method String SuggestedSearchItemViewState.getSuggestionText()>
	//    5   11:invokevirtual   #367 <Method String String.trim()>
	//    6   14:invokevirtual   #376 <Method boolean String.equalsIgnoreCase(String)>
	//    7   17:ireturn         
	}

	private void loadSearchDependencyJobs()
	{
		resetSearchDependencyJobs();
	//    0    0:aload_0         
	//    1    1:invokespecial   #380 <Method void resetSearchDependencyJobs()>
		loading = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #105 <Field boolean loading>
		HashSet hashset = new HashSet();
	//    5    9:new             #382 <Class HashSet>
	//    6   12:dup             
	//    7   13:invokespecial   #383 <Method void HashSet()>
	//    8   16:astore_1        
		if(getRequestedSearchContent().contains(((Object) (com.ibotta.android.search.async.SearchAsync.SearchContent.RETAILERS))))
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #315 <Method Set getRequestedSearchContent()>
	//*  11   21:getstatic       #321 <Field com.ibotta.android.search.async.SearchAsync$SearchContent com.ibotta.android.search.async.SearchAsync$SearchContent.RETAILERS>
	//*  12   24:invokeinterface #327 <Method boolean Set.contains(Object)>
	//*  13   29:ifeq            55
		{
			homeJob = new HomeApiJob(0);
	//   14   32:aload_0         
	//   15   33:new             #175 <Class HomeApiJob>
	//   16   36:dup             
	//   17   37:iconst_0        
	//   18   38:invokespecial   #385 <Method void HomeApiJob(int)>
	//   19   41:putfield        #158 <Field HomeApiJob homeJob>
			homeJob.addListener(searchJobListener);
	//   20   44:aload_0         
	//   21   45:getfield        #158 <Field HomeApiJob homeJob>
	//   22   48:aload_0         
	//   23   49:getfield        #115 <Field ApiJobListener searchJobListener>
	//   24   52:invokevirtual   #389 <Method void HomeApiJob.addListener(ApiJobListener)>
		}
		HomeApiJob homeapijob = homeJob;
	//   25   55:aload_0         
	//   26   56:getfield        #158 <Field HomeApiJob homeJob>
	//   27   59:astore_2        
		if(homeapijob != null)
	//*  28   60:aload_2         
	//*  29   61:ifnull          72
			((Set) (hashset)).add(((Object) (homeapijob)));
	//   30   64:aload_1         
	//   31   65:aload_2         
	//   32   66:invokeinterface #392 <Method boolean Set.add(Object)>
	//   33   71:pop             
		if(!((Set) (hashset)).isEmpty())
	//*  34   72:aload_1         
	//*  35   73:invokeinterface #393 <Method boolean Set.isEmpty()>
	//*  36   78:ifne            92
		{
			apiWorkSubmitter.submit(((java.util.Collection) (hashset)));
	//   37   81:aload_0         
	//   38   82:getfield        #119 <Field ApiWorkSubmitter apiWorkSubmitter>
	//   39   85:aload_1         
	//   40   86:invokeinterface #399 <Method void ApiWorkSubmitter.submit(java.util.Collection)>
			return;
	//   41   91:return          
		} else
		{
			loading = false;
	//   42   92:aload_0         
	//   43   93:iconst_0        
	//   44   94:putfield        #105 <Field boolean loading>
			refreshSearchResults();
	//   45   97:aload_0         
	//   46   98:invokespecial   #402 <Method void refreshSearchResults()>
			return;
	//   47  101:return          
		}
	}

	private void onQueryRecentSearches(String s)
	{
		SuggestedSearchMode suggestedsearchmode;
		if(appHelper.isEmpty(s))
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field AppHelper appHelper>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #404 <Method boolean AppHelper.isEmpty(String)>
	//*   4   10:ifeq            20
			suggestedsearchmode = SuggestedSearchMode.RECENT_ONLY;
	//    5   13:getstatic       #410 <Field SuggestedSearchMode SuggestedSearchMode.RECENT_ONLY>
	//    6   16:astore_2        
		else
	//*   7   17:goto            24
			suggestedsearchmode = SuggestedSearchMode.TYPE_AHEAD;
	//    8   20:getstatic       #413 <Field SuggestedSearchMode SuggestedSearchMode.TYPE_AHEAD>
	//    9   23:astore_2        
		asyncSuggestedSearchService.getSuggestedTerms(s, ((java9.util.function.Consumer) (new _2D_..Lambda.AbstractSearchMvpPresenter._cls6S8lYTvYWsgC0kBCf8TX94_2D_oQm4(this, suggestedsearchmode))), Optional.ofNullable(((Object) (retailerId))));
	//   10   24:aload_0         
	//   11   25:getfield        #127 <Field AsyncSuggestedSearchService asyncSuggestedSearchService>
	//   12   28:aload_1         
	//   13   29:new             #415 <Class _2D_$$Lambda$AbstractSearchMvpPresenter$6S8lYTvYWsgC0kBCf8TX94_2D_oQm4>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:aload_2         
	//   17   35:invokespecial   #418 <Method void _2D_$$Lambda$AbstractSearchMvpPresenter$6S8lYTvYWsgC0kBCf8TX94_2D_oQm4(AbstractSearchMvpPresenter, SuggestedSearchMode)>
	//   18   38:aload_0         
	//   19   39:getfield        #422 <Field Long retailerId>
	//   20   42:invokestatic    #428 <Method Optional Optional.ofNullable(Object)>
	//   21   45:invokeinterface #434 <Method void AsyncSuggestedSearchService.getSuggestedTerms(String, java9.util.function.Consumer, Optional)>
	//   22   50:return          
	}

	private void onSearch(String s, SearchType searchtype)
	{
		lastSearchTerm = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #438 <Field String lastSearchTerm>
		lastSearchType = searchtype;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #440 <Field SearchType lastSearchType>
		if(searchtype != SearchType.SCANNED && s != null && !appHelper.isEmpty(s.trim()))
	//*   6   10:aload_2         
	//*   7   11:getstatic       #443 <Field SearchType SearchType.SCANNED>
	//*   8   14:if_acmpeq       51
	//*   9   17:aload_1         
	//*  10   18:ifnull          51
	//*  11   21:aload_0         
	//*  12   22:getfield        #117 <Field AppHelper appHelper>
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #367 <Method String String.trim()>
	//*  15   29:invokeinterface #404 <Method boolean AppHelper.isEmpty(String)>
	//*  16   34:ifne            51
			asyncRecentSearchService.onTermSearched(s, provideSearchCategory());
	//   17   37:aload_0         
	//   18   38:getfield        #125 <Field AsyncRecentSearchService asyncRecentSearchService>
	//   19   41:aload_1         
	//   20   42:aload_0         
	//   21   43:invokevirtual   #447 <Method Category provideSearchCategory()>
	//   22   46:invokeinterface #453 <Method void AsyncRecentSearchService.onTermSearched(String, Category)>
		searchAsync.search(s, searchtype, retailerId, getRequestedSearchContent(), ((java9.util.function.Consumer) (new _2D_..Lambda.AbstractSearchMvpPresenter.fN0p4ygEjZBzvR7FQzn0FJKVv8g(this))), ((java9.util.function.Consumer) (new _2D_..Lambda.AbstractSearchMvpPresenter._cls7oKDWkm1d3_1SRo47D1z8dTgGvI(this))));
	//   23   51:aload_0         
	//   24   52:getfield        #123 <Field SearchAsync searchAsync>
	//   25   55:aload_1         
	//   26   56:aload_2         
	//   27   57:aload_0         
	//   28   58:getfield        #422 <Field Long retailerId>
	//   29   61:aload_0         
	//   30   62:invokevirtual   #315 <Method Set getRequestedSearchContent()>
	//   31   65:new             #455 <Class _2D_$$Lambda$AbstractSearchMvpPresenter$fN0p4ygEjZBzvR7FQzn0FJKVv8g>
	//   32   68:dup             
	//   33   69:aload_0         
	//   34   70:invokespecial   #456 <Method void _2D_$$Lambda$AbstractSearchMvpPresenter$fN0p4ygEjZBzvR7FQzn0FJKVv8g(AbstractSearchMvpPresenter)>
	//   35   73:new             #458 <Class _2D_$$Lambda$AbstractSearchMvpPresenter$7oKDWkm1d3_1SRo47D1z8dTgGvI>
	//   36   76:dup             
	//   37   77:aload_0         
	//   38   78:invokespecial   #459 <Method void _2D_$$Lambda$AbstractSearchMvpPresenter$7oKDWkm1d3_1SRo47D1z8dTgGvI(AbstractSearchMvpPresenter)>
	//   39   81:invokeinterface #463 <Method void SearchAsync.search(String, SearchType, Long, Set, java9.util.function.Consumer, java9.util.function.Consumer)>
		if(searchtype != SearchType.OFFER_TAG)
	//*  40   86:aload_2         
	//*  41   87:getstatic       #466 <Field SearchType SearchType.OFFER_TAG>
	//*  42   90:if_acmpeq       111
			trackingQueue.send(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (getSearchEvent(s, searchtype, ClickType.SEARCH))));
	//   43   93:aload_0         
	//   44   94:getfield        #131 <Field TrackingQueue trackingQueue>
	//   45   97:aload_0         
	//   46   98:aload_1         
	//   47   99:aload_2         
	//   48  100:getstatic       #472 <Field ClickType ClickType.SEARCH>
	//   49  103:invokespecial   #474 <Method SearchEvent getSearchEvent(String, SearchType, ClickType)>
	//   50  106:invokeinterface #479 <Method void TrackingQueue.send(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
		if(isMisspelled(searchtype))
	//*  51  111:aload_0         
	//*  52  112:aload_2         
	//*  53  113:invokespecial   #480 <Method boolean isMisspelled(SearchType)>
	//*  54  116:ifeq            137
			trackingQueue.send(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (getSearchEvent(s, searchtype, ClickType.MISSPELLING))));
	//   55  119:aload_0         
	//   56  120:getfield        #131 <Field TrackingQueue trackingQueue>
	//   57  123:aload_0         
	//   58  124:aload_1         
	//   59  125:aload_2         
	//   60  126:getstatic       #483 <Field ClickType ClickType.MISSPELLING>
	//   61  129:invokespecial   #474 <Method SearchEvent getSearchEvent(String, SearchType, ClickType)>
	//   62  132:invokeinterface #479 <Method void TrackingQueue.send(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
	//   63  137:return          
	}

	private void onSearchDependencyJobsFinishedSuccessfully()
	{
		Timber.d("Search dependencies loaded successfully.", new Object[0]);
	//    0    0:ldc2            #485 <String "Search dependencies loaded successfully.">
	//    1    3:iconst_0        
	//    2    4:anewarray       Object[]
	//    3    7:invokestatic    #488 <Method void Timber.d(String, Object[])>
		if(!isExpectingActivityResult())
	//*   4   10:aload_0         
	//*   5   11:invokevirtual   #491 <Method boolean isExpectingActivityResult()>
	//*   6   14:ifne            21
			refreshSearchResults();
	//    7   17:aload_0         
	//    8   18:invokespecial   #402 <Method void refreshSearchResults()>
		setIsExpectingActivityResult(false);
	//    9   21:aload_0         
	//   10   22:iconst_0        
	//   11   23:invokevirtual   #495 <Method void setIsExpectingActivityResult(boolean)>
	//   12   26:return          
	}

	private void onSearchDependencyJobsFinishedWithFailures(SearchMvpView searchmvpview)
	{
		Timber.d("Some search dependencies failed to load.", new Object[0]);
	//    0    0:ldc2            #497 <String "Some search dependencies failed to load.">
	//    1    3:iconst_0        
	//    2    4:anewarray       Object[]
	//    3    7:invokestatic    #488 <Method void Timber.d(String, Object[])>
		if(mvpPresenterActions.isNetworkConnected())
	//*   4   10:aload_0         
	//*   5   11:getfield        #501 <Field MvpPresenterActions mvpPresenterActions>
	//*   6   14:invokeinterface #506 <Method boolean MvpPresenterActions.isNetworkConnected()>
	//*   7   19:ifeq            29
		{
			searchmvpview.showScreenLoadFailed();
	//    8   22:aload_1         
	//    9   23:invokeinterface #509 <Method void SearchMvpView.showScreenLoadFailed()>
			return;
	//   10   28:return          
		} else
		{
			searchmvpview.showNetworkConnectionError();
	//   11   29:aload_1         
	//   12   30:invokeinterface #512 <Method void SearchMvpView.showNetworkConnectionError()>
			return;
	//   13   35:return          
		}
	}

	private void onSearchFailed(Exception exception)
	{
		if(mvpView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #154 <Field MvpView mvpView>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		((SearchMvpView)mvpView).updateSearchListViewState(IbottaListViewState.EMPTY);
	//    4    8:aload_0         
	//    5    9:getfield        #154 <Field MvpView mvpView>
	//    6   12:checkcast       #311 <Class SearchMvpView>
	//    7   15:getstatic       #517 <Field IbottaListViewState IbottaListViewState.EMPTY>
	//    8   18:invokeinterface #341 <Method void SearchMvpView.updateSearchListViewState(IbottaListViewState)>
		if(mvpPresenterActions.isNetworkConnected())
	//*   9   23:aload_0         
	//*  10   24:getfield        #501 <Field MvpPresenterActions mvpPresenterActions>
	//*  11   27:invokeinterface #506 <Method boolean MvpPresenterActions.isNetworkConnected()>
	//*  12   32:ifeq            49
		{
			((SearchMvpView)mvpView).showSearchError(exception);
	//   13   35:aload_0         
	//   14   36:getfield        #154 <Field MvpView mvpView>
	//   15   39:checkcast       #311 <Class SearchMvpView>
	//   16   42:aload_1         
	//   17   43:invokeinterface #520 <Method void SearchMvpView.showSearchError(Exception)>
			return;
	//   18   48:return          
		} else
		{
			((SearchMvpView)mvpView).showNetworkConnectionErrorDialog();
	//   19   49:aload_0         
	//   20   50:getfield        #154 <Field MvpView mvpView>
	//   21   53:checkcast       #311 <Class SearchMvpView>
	//   22   56:invokeinterface #523 <Method void SearchMvpView.showNetworkConnectionErrorDialog()>
			return;
	//   23   61:return          
		}
	}

	private void onSearchFinished(SearchResults searchresults)
	{
		trackReceivedMisspelledResults(searchresults);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #526 <Method void trackReceivedMisspelledResults(SearchResults)>
		searchResults = searchresults;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #97  <Field SearchResults searchResults>
		if(mvpView != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #154 <Field MvpView mvpView>
	//*   8   14:ifnull          81
		{
			if(loading)
	//*   9   17:aload_0         
	//*  10   18:getfield        #105 <Field boolean loading>
	//*  11   21:ifeq            25
			{
				return;
	//   12   24:return          
			} else
			{
				searchContentModels = (List)StreamSupport.stream(((java.util.Collection) (searchresults.getSearchModules()))).map(((java9.util.function.Function) (_2D_..Lambda.jnINpZkQYaosRLNHuYhy_2D_hZSw1A.INSTANCE))).flatMap(((java9.util.function.Function) (_2D_..Lambda.lnpN99Q7KybQyzGDZRSLPMAPS4c.INSTANCE))).collect(Collectors.toUnmodifiableList());
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #529 <Method List SearchResults.getSearchModules()>
	//   16   30:invokestatic    #535 <Method Stream StreamSupport.stream(java.util.Collection)>
	//   17   33:getstatic       #541 <Field _2D_$$Lambda$jnINpZkQYaosRLNHuYhy_2D_hZSw1A _2D_$$Lambda$jnINpZkQYaosRLNHuYhy_2D_hZSw1A.INSTANCE>
	//   18   36:invokeinterface #547 <Method Stream Stream.map(java9.util.function.Function)>
	//   19   41:getstatic       #552 <Field _2D_$$Lambda$lnpN99Q7KybQyzGDZRSLPMAPS4c _2D_$$Lambda$lnpN99Q7KybQyzGDZRSLPMAPS4c.INSTANCE>
	//   20   44:invokeinterface #555 <Method Stream Stream.flatMap(java9.util.function.Function)>
	//   21   49:invokestatic    #561 <Method java9.util.stream.Collector Collectors.toUnmodifiableList()>
	//   22   52:invokeinterface #565 <Method Object Stream.collect(java9.util.stream.Collector)>
	//   23   57:checkcast       #567 <Class List>
	//   24   60:putfield        #88  <Field List searchContentModels>
				((SearchMvpView)mvpView).updateSearchListViewState(getSearchResultsViewState(searchresults));
	//   25   63:aload_0         
	//   26   64:getfield        #154 <Field MvpView mvpView>
	//   27   67:checkcast       #311 <Class SearchMvpView>
	//   28   70:aload_0         
	//   29   71:aload_1         
	//   30   72:invokevirtual   #571 <Method IbottaListViewState getSearchResultsViewState(SearchResults)>
	//   31   75:invokeinterface #341 <Method void SearchMvpView.updateSearchListViewState(IbottaListViewState)>
				return;
	//   32   80:return          
			}
		} else
		{
			return;
	//   33   81:return          
		}
	}

	private void refreshSearchResults()
	{
		if(!appHelper.isEmpty(lastSearchTerm) && lastSearchType != null && searchState == SearchState.VIEWING_RESULTS)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field AppHelper appHelper>
	//*   2    4:aload_0         
	//*   3    5:getfield        #438 <Field String lastSearchTerm>
	//*   4    8:invokeinterface #404 <Method boolean AppHelper.isEmpty(String)>
	//*   5   13:ifne            45
	//*   6   16:aload_0         
	//*   7   17:getfield        #440 <Field SearchType lastSearchType>
	//*   8   20:ifnull          45
	//*   9   23:aload_0         
	//*  10   24:getfield        #110 <Field AbstractSearchMvpPresenter$SearchState searchState>
	//*  11   27:getstatic       #574 <Field AbstractSearchMvpPresenter$SearchState AbstractSearchMvpPresenter$SearchState.VIEWING_RESULTS>
	//*  12   30:if_acmpne       45
			onSearch(lastSearchTerm, lastSearchType);
	//   13   33:aload_0         
	//   14   34:aload_0         
	//   15   35:getfield        #438 <Field String lastSearchTerm>
	//   16   38:aload_0         
	//   17   39:getfield        #440 <Field SearchType lastSearchType>
	//   18   42:invokespecial   #576 <Method void onSearch(String, SearchType)>
	//   19   45:return          
	}

	private void resetSearchDependencyJobs()
	{
		HomeApiJob homeapijob = homeJob;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field HomeApiJob homeJob>
	//    2    4:astore_1        
		if(homeapijob != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          22
		{
			homeapijob.removeListener(searchJobListener);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #115 <Field ApiJobListener searchJobListener>
	//    8   14:invokevirtual   #579 <Method void HomeApiJob.removeListener(ApiJobListener)>
			homeJob = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #158 <Field HomeApiJob homeJob>
		}
		loading = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #105 <Field boolean loading>
	//   15   27:return          
	}

	private void setSearchState(SearchState searchstate)
	{
		if(searchstate == SearchState.VIEWING_RESULTS)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #574 <Field AbstractSearchMvpPresenter$SearchState AbstractSearchMvpPresenter$SearchState.VIEWING_RESULTS>
	//*   2    4:if_acmpne       19
			((SearchMvpView)mvpView).showSearchLoading();
	//    3    7:aload_0         
	//    4    8:getfield        #154 <Field MvpView mvpView>
	//    5   11:checkcast       #311 <Class SearchMvpView>
	//    6   14:invokeinterface #584 <Method void SearchMvpView.showSearchLoading()>
		if(searchState == searchstate)
	//*   7   19:aload_0         
	//*   8   20:getfield        #110 <Field AbstractSearchMvpPresenter$SearchState searchState>
	//*   9   23:aload_1         
	//*  10   24:if_acmpne       28
			return;
	//   11   27:return          
		static class _cls2
		{

			static final int $SwitchMap$com$ibotta$android$mvp$base$search$AbstractSearchMvpPresenter$SearchState[];
			static final int $SwitchMap$com$ibotta$android$views$base$info$MisspellingConfidenceLevel[];

			static 
			{
				$SwitchMap$com$ibotta$android$views$base$info$MisspellingConfidenceLevel = new int[MisspellingConfidenceLevel.values().length];
			//    0    0:invokestatic    #19  <Method MisspellingConfidenceLevel[] MisspellingConfidenceLevel.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$ibotta$android$views$base$info$MisspellingConfidenceLevel>
				try
				{
					$SwitchMap$com$ibotta$android$views$base$info$MisspellingConfidenceLevel[MisspellingConfidenceLevel.STRONG.ordinal()] = 1;
			//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$ibotta$android$views$base$info$MisspellingConfidenceLevel>
			//    5   12:getstatic       #25  <Field MisspellingConfidenceLevel MisspellingConfidenceLevel.STRONG>
			//    6   15:invokevirtual   #29  <Method int MisspellingConfidenceLevel.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$ibotta$android$views$base$info$MisspellingConfidenceLevel>
			//*  10   23:getstatic       #32  <Field MisspellingConfidenceLevel MisspellingConfidenceLevel.MEDIUM>
			//*  11   26:invokevirtual   #29  <Method int MisspellingConfidenceLevel.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$ibotta$android$views$base$info$MisspellingConfidenceLevel>
			//*  15   34:getstatic       #35  <Field MisspellingConfidenceLevel MisspellingConfidenceLevel.WEAK>
			//*  16   37:invokevirtual   #29  <Method int MisspellingConfidenceLevel.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:invokestatic    #40  <Method AbstractSearchMvpPresenter$SearchState[] AbstractSearchMvpPresenter$SearchState.values()>
			//*  20   45:arraylength     
			//*  21   46:newarray        int[]
			//*  22   48:putstatic       #42  <Field int[] $SwitchMap$com$ibotta$android$mvp$base$search$AbstractSearchMvpPresenter$SearchState>
			//*  23   51:getstatic       #42  <Field int[] $SwitchMap$com$ibotta$android$mvp$base$search$AbstractSearchMvpPresenter$SearchState>
			//*  24   54:getstatic       #46  <Field AbstractSearchMvpPresenter$SearchState AbstractSearchMvpPresenter$SearchState.NOT_SEARCHING>
			//*  25   57:invokevirtual   #47  <Method int AbstractSearchMvpPresenter$SearchState.ordinal()>
			//*  26   60:iconst_1        
			//*  27   61:iastore         
			//*  28   62:getstatic       #42  <Field int[] $SwitchMap$com$ibotta$android$mvp$base$search$AbstractSearchMvpPresenter$SearchState>
			//*  29   65:getstatic       #50  <Field AbstractSearchMvpPresenter$SearchState AbstractSearchMvpPresenter$SearchState.VIEWING_RESULTS>
			//*  30   68:invokevirtual   #47  <Method int AbstractSearchMvpPresenter$SearchState.ordinal()>
			//*  31   71:iconst_2        
			//*  32   72:iastore         
			//*  33   73:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   34   74:astore_0        
				try
				{
					$SwitchMap$com$ibotta$android$views$base$info$MisspellingConfidenceLevel[MisspellingConfidenceLevel.MEDIUM.ordinal()] = 2;
				}
			//*  35   75:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   36   78:astore_0        
				try
				{
					$SwitchMap$com$ibotta$android$views$base$info$MisspellingConfidenceLevel[MisspellingConfidenceLevel.WEAK.ordinal()] = 3;
				}
			//*  37   79:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   38   82:astore_0        
				$SwitchMap$com$ibotta$android$mvp$base$search$AbstractSearchMvpPresenter$SearchState = new int[SearchState.values().length];
				try
				{
					$SwitchMap$com$ibotta$android$mvp$base$search$AbstractSearchMvpPresenter$SearchState[SearchState.NOT_SEARCHING.ordinal()] = 1;
				}
			//*  39   83:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   40   86:astore_0        
				try
				{
					$SwitchMap$com$ibotta$android$mvp$base$search$AbstractSearchMvpPresenter$SearchState[SearchState.VIEWING_RESULTS.ordinal()] = 2;
				}
			//*  41   87:goto            62
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   42   90:astore_0        
			//*  43   91:return          
			}
		}

		switch(_cls2..SwitchMap.com.ibotta.android.mvp.base.search.AbstractSearchMvpPresenter.SearchState[searchstate.ordinal()])
	//*  12   28:getstatic       #588 <Field int[] AbstractSearchMvpPresenter$2.$SwitchMap$com$ibotta$android$mvp$base$search$AbstractSearchMvpPresenter$SearchState>
	//*  13   31:aload_1         
	//*  14   32:invokevirtual   #592 <Method int AbstractSearchMvpPresenter$SearchState.ordinal()>
	//*  15   35:iaload          
		{
	//*  16   36:tableswitch     1 2: default 60
	//	               1 102
	//	               2 63
	//*  17   60:goto            156
		case 2: // '\002'
			((SearchMvpView)mvpView).showSearchResultsView();
	//   18   63:aload_0         
	//   19   64:getfield        #154 <Field MvpView mvpView>
	//   20   67:checkcast       #311 <Class SearchMvpView>
	//   21   70:invokeinterface #344 <Method void SearchMvpView.showSearchResultsView()>
			((SearchMvpView)mvpView).hideMainView();
	//   22   75:aload_0         
	//   23   76:getfield        #154 <Field MvpView mvpView>
	//   24   79:checkcast       #311 <Class SearchMvpView>
	//   25   82:invokeinterface #347 <Method void SearchMvpView.hideMainView()>
			((SearchMvpView)mvpView).clearSearchFocus();
	//   26   87:aload_0         
	//   27   88:getfield        #154 <Field MvpView mvpView>
	//   28   91:checkcast       #311 <Class SearchMvpView>
	//   29   94:invokeinterface #595 <Method void SearchMvpView.clearSearchFocus()>
			break;

	//*  30   99:goto            156
		case 1: // '\001'
			((SearchMvpView)mvpView).hideKeyboard();
	//   31  102:aload_0         
	//   32  103:getfield        #154 <Field MvpView mvpView>
	//   33  106:checkcast       #311 <Class SearchMvpView>
	//   34  109:invokeinterface #598 <Method void SearchMvpView.hideKeyboard()>
			((SearchMvpView)mvpView).hideSearchResultsView();
	//   35  114:aload_0         
	//   36  115:getfield        #154 <Field MvpView mvpView>
	//   37  118:checkcast       #311 <Class SearchMvpView>
	//   38  121:invokeinterface #601 <Method void SearchMvpView.hideSearchResultsView()>
			((SearchMvpView)mvpView).showMainView();
	//   39  126:aload_0         
	//   40  127:getfield        #154 <Field MvpView mvpView>
	//   41  130:checkcast       #311 <Class SearchMvpView>
	//   42  133:invokeinterface #604 <Method void SearchMvpView.showMainView()>
			((SearchMvpView)mvpView).clearSearchFocus();
	//   43  138:aload_0         
	//   44  139:getfield        #154 <Field MvpView mvpView>
	//   45  142:checkcast       #311 <Class SearchMvpView>
	//   46  145:invokeinterface #595 <Method void SearchMvpView.clearSearchFocus()>
			lastSearchTerm = "";
	//   47  150:aload_0         
	//   48  151:ldc1            #78  <String "">
	//   49  153:putfield        #438 <Field String lastSearchTerm>
			break;
		}
		searchState = searchstate;
	//   50  156:aload_0         
	//   51  157:aload_1         
	//   52  158:putfield        #110 <Field AbstractSearchMvpPresenter$SearchState searchState>
	//   53  161:return          
	}

	private void trackReceivedMisspelledResults(SearchResults searchresults)
	{
		SearchType searchtype = getMisspellingWithConfidence(MisspellingConfidenceLevel.fromValue(searchresults.getMisspellingState().getConfidence()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #608 <Method Misspelling SearchResults.getMisspellingState()>
	//    3    5:invokevirtual   #613 <Method String Misspelling.getConfidence()>
	//    4    8:invokestatic    #617 <Method MisspellingConfidenceLevel MisspellingConfidenceLevel.fromValue(String)>
	//    5   11:invokevirtual   #621 <Method SearchType getMisspellingWithConfidence(MisspellingConfidenceLevel)>
	//    6   14:astore_2        
		if(isMisspelled(searchtype))
	//*   7   15:aload_0         
	//*   8   16:aload_2         
	//*   9   17:invokespecial   #480 <Method boolean isMisspelled(SearchType)>
	//*  10   20:ifeq            99
		{
			SearchEvent searchevent = new SearchEvent();
	//   11   23:new             #213 <Class SearchEvent>
	//   12   26:dup             
	//   13   27:invokespecial   #215 <Method void SearchEvent()>
	//   14   30:astore_3        
			searchevent.setCounter(1);
	//   15   31:aload_3         
	//   16   32:iconst_1        
	//   17   33:invokevirtual   #219 <Method void SearchEvent.setCounter(int)>
			searchevent.setEventAt(System.currentTimeMillis());
	//   18   36:aload_3         
	//   19   37:invokestatic    #626 <Method long System.currentTimeMillis()>
	//   20   40:invokevirtual   #229 <Method void SearchEvent.setEventAt(long)>
			searchevent.setTerm(searchresults.getSearchedTerm());
	//   21   43:aload_3         
	//   22   44:aload_1         
	//   23   45:invokevirtual   #629 <Method String SearchResults.getSearchedTerm()>
	//   24   48:invokevirtual   #233 <Method void SearchEvent.setTerm(String)>
			searchevent.setSearchType(searchtype.toString());
	//   25   51:aload_3         
	//   26   52:aload_2         
	//   27   53:invokevirtual   #239 <Method String SearchType.toString()>
	//   28   56:invokevirtual   #242 <Method void SearchEvent.setSearchType(String)>
			searchevent.setClicked(Boolean.valueOf(true));
	//   29   59:aload_3         
	//   30   60:iconst_1        
	//   31   61:invokestatic    #248 <Method Boolean Boolean.valueOf(boolean)>
	//   32   64:invokevirtual   #252 <Method void SearchEvent.setClicked(Boolean)>
			searchevent.setClickType(((ClickType) (null)));
	//   33   67:aload_3         
	//   34   68:aconst_null     
	//   35   69:invokevirtual   #256 <Method void SearchEvent.setClickType(ClickType)>
			if(mvpView != null)
	//*  36   72:aload_0         
	//*  37   73:getfield        #154 <Field MvpView mvpView>
	//*  38   76:ifnull          99
			{
				eventContextProvider.provideContext(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (searchevent)));
	//   39   79:aload_0         
	//   40   80:getfield        #133 <Field EventContextProvider eventContextProvider>
	//   41   83:aload_3         
	//   42   84:invokeinterface #262 <Method void EventContextProvider.provideContext(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
				trackingQueue.send(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (searchevent)));
	//   43   89:aload_0         
	//   44   90:getfield        #131 <Field TrackingQueue trackingQueue>
	//   45   93:aload_3         
	//   46   94:invokeinterface #479 <Method void TrackingQueue.send(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
			}
		}
	//   47   99:return          
	}

	protected void clearSearch()
	{
		setSearchState(SearchState.QUERYING);
	//    0    0:aload_0         
	//    1    1:getstatic       #309 <Field AbstractSearchMvpPresenter$SearchState AbstractSearchMvpPresenter$SearchState.QUERYING>
	//    2    4:invokespecial   #632 <Method void setSearchState(AbstractSearchMvpPresenter$SearchState)>
		((SearchMvpView)mvpView).bindView(searchReducer.create(SearchAction.CLEAR_SEARCH, ((SearchMvpView)mvpView).getSearchHint()));
	//    3    7:aload_0         
	//    4    8:getfield        #154 <Field MvpView mvpView>
	//    5   11:checkcast       #311 <Class SearchMvpView>
	//    6   14:aload_0         
	//    7   15:getfield        #143 <Field SearchReducer searchReducer>
	//    8   18:getstatic       #638 <Field SearchAction SearchAction.CLEAR_SEARCH>
	//    9   21:aload_0         
	//   10   22:getfield        #154 <Field MvpView mvpView>
	//   11   25:checkcast       #311 <Class SearchMvpView>
	//   12   28:invokeinterface #641 <Method String SearchMvpView.getSearchHint()>
	//   13   33:invokevirtual   #646 <Method SearchViewState SearchReducer.create(SearchAction, String)>
	//   14   36:invokeinterface #650 <Method void SearchMvpView.bindView(SearchViewState)>
		onQueryRecentSearches("");
	//   15   41:aload_0         
	//   16   42:ldc1            #78  <String "">
	//   17   44:invokespecial   #357 <Method void onQueryRecentSearches(String)>
		((SearchMvpView)mvpView).requestSearchFocus();
	//   18   47:aload_0         
	//   19   48:getfield        #154 <Field MvpView mvpView>
	//   20   51:checkcast       #311 <Class SearchMvpView>
	//   21   54:invokeinterface #653 <Method void SearchMvpView.requestSearchFocus()>
		((SearchMvpView)mvpView).showKeyboard();
	//   22   59:aload_0         
	//   23   60:getfield        #154 <Field MvpView mvpView>
	//   24   63:checkcast       #311 <Class SearchMvpView>
	//   25   66:invokeinterface #656 <Method void SearchMvpView.showKeyboard()>
	//   26   71:return          
	}

	protected void exitSearch()
	{
		((SearchMvpView)mvpView).bindView(searchReducer.create(SearchAction.EXIT_SEARCH, ((SearchMvpView)mvpView).getSearchHint()));
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field MvpView mvpView>
	//    2    4:checkcast       #311 <Class SearchMvpView>
	//    3    7:aload_0         
	//    4    8:getfield        #143 <Field SearchReducer searchReducer>
	//    5   11:getstatic       #660 <Field SearchAction SearchAction.EXIT_SEARCH>
	//    6   14:aload_0         
	//    7   15:getfield        #154 <Field MvpView mvpView>
	//    8   18:checkcast       #311 <Class SearchMvpView>
	//    9   21:invokeinterface #641 <Method String SearchMvpView.getSearchHint()>
	//   10   26:invokevirtual   #646 <Method SearchViewState SearchReducer.create(SearchAction, String)>
	//   11   29:invokeinterface #650 <Method void SearchMvpView.bindView(SearchViewState)>
		setSearchState(SearchState.NOT_SEARCHING);
	//   12   34:aload_0         
	//   13   35:getstatic       #108 <Field AbstractSearchMvpPresenter$SearchState AbstractSearchMvpPresenter$SearchState.NOT_SEARCHING>
	//   14   38:invokespecial   #632 <Method void setSearchState(AbstractSearchMvpPresenter$SearchState)>
	//   15   41:return          
	}

	protected void focusSearch()
	{
		setSearchState(SearchState.QUERYING);
	//    0    0:aload_0         
	//    1    1:getstatic       #309 <Field AbstractSearchMvpPresenter$SearchState AbstractSearchMvpPresenter$SearchState.QUERYING>
	//    2    4:invokespecial   #632 <Method void setSearchState(AbstractSearchMvpPresenter$SearchState)>
		((SearchMvpView)mvpView).bindView(searchReducer.create(SearchAction.FOCUS_SEARCH, ((SearchMvpView)mvpView).getSearchHint()));
	//    3    7:aload_0         
	//    4    8:getfield        #154 <Field MvpView mvpView>
	//    5   11:checkcast       #311 <Class SearchMvpView>
	//    6   14:aload_0         
	//    7   15:getfield        #143 <Field SearchReducer searchReducer>
	//    8   18:getstatic       #664 <Field SearchAction SearchAction.FOCUS_SEARCH>
	//    9   21:aload_0         
	//   10   22:getfield        #154 <Field MvpView mvpView>
	//   11   25:checkcast       #311 <Class SearchMvpView>
	//   12   28:invokeinterface #641 <Method String SearchMvpView.getSearchHint()>
	//   13   33:invokevirtual   #646 <Method SearchViewState SearchReducer.create(SearchAction, String)>
	//   14   36:invokeinterface #650 <Method void SearchMvpView.bindView(SearchViewState)>
		((SearchMvpView)mvpView).requestSearchFocus();
	//   15   41:aload_0         
	//   16   42:getfield        #154 <Field MvpView mvpView>
	//   17   45:checkcast       #311 <Class SearchMvpView>
	//   18   48:invokeinterface #653 <Method void SearchMvpView.requestSearchFocus()>
		((SearchMvpView)mvpView).showKeyboard();
	//   19   53:aload_0         
	//   20   54:getfield        #154 <Field MvpView mvpView>
	//   21   57:checkcast       #311 <Class SearchMvpView>
	//   22   60:invokeinterface #656 <Method void SearchMvpView.showKeyboard()>
	//   23   65:return          
	}

	protected ContentTrackingPayload getContentTrackingData()
	{
		com.ibotta.android.tracking.content.ContentTrackingPayload.Builder builder = ContentTrackingPayload.builder(((SearchMvpView)mvpView).getEventContext()).retailerCategoryId(retailerCategoryId);
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field MvpView mvpView>
	//    2    4:checkcast       #311 <Class SearchMvpView>
	//    3    7:invokeinterface #668 <Method EventContext SearchMvpView.getEventContext()>
	//    4   12:invokestatic    #674 <Method com.ibotta.android.tracking.content.ContentTrackingPayload$Builder ContentTrackingPayload.builder(EventContext)>
	//    5   15:aload_0         
	//    6   16:getfield        #678 <Field Integer retailerCategoryId>
	//    7   19:invokevirtual   #683 <Method com.ibotta.android.tracking.content.ContentTrackingPayload$Builder com.ibotta.android.tracking.content.ContentTrackingPayload$Builder.retailerCategoryId(Integer)>
	//    8   22:astore_2        
		Integer integer;
		if(retailerId != null)
	//*   9   23:aload_0         
	//*  10   24:getfield        #422 <Field Long retailerId>
	//*  11   27:ifnull          44
			integer = Integer.valueOf(retailerId.intValue());
	//   12   30:aload_0         
	//   13   31:getfield        #422 <Field Long retailerId>
	//   14   34:invokevirtual   #688 <Method int Long.intValue()>
	//   15   37:invokestatic    #693 <Method Integer Integer.valueOf(int)>
	//   16   40:astore_1        
		else
	//*  17   41:goto            46
			integer = null;
	//   18   44:aconst_null     
	//   19   45:astore_1        
		return builder.retailerId(integer).build();
	//   20   46:aload_2         
	//   21   47:aload_1         
	//   22   48:invokevirtual   #695 <Method com.ibotta.android.tracking.content.ContentTrackingPayload$Builder com.ibotta.android.tracking.content.ContentTrackingPayload$Builder.retailerId(Integer)>
	//   23   51:invokevirtual   #698 <Method ContentTrackingPayload com.ibotta.android.tracking.content.ContentTrackingPayload$Builder.build()>
	//   24   54:areturn         
	}

	protected HomeResponse getHomeResponse()
	{
		HomeApiJob homeapijob = homeJob;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field HomeApiJob homeJob>
	//    2    4:astore_1        
		if(homeapijob == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return (HomeResponse)homeapijob.getApiResponse();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #704 <Method com.ibotta.api.ApiResponse HomeApiJob.getApiResponse()>
	//    9   15:checkcast       #264 <Class HomeResponse>
	//   10   18:areturn         
	}

	public SearchType getMisspellingWithConfidence(MisspellingConfidenceLevel misspellingconfidencelevel)
	{
		SearchType searchtype = SearchType.MISSPELLING_EXACT;
	//    0    0:getstatic       #708 <Field SearchType SearchType.MISSPELLING_EXACT>
	//    1    3:astore_2        
		switch(_cls2..SwitchMap.com.ibotta.android.views.base.info.MisspellingConfidenceLevel[misspellingconfidencelevel.ordinal()])
	//*   2    4:getstatic       #711 <Field int[] AbstractSearchMvpPresenter$2.$SwitchMap$com$ibotta$android$views$base$info$MisspellingConfidenceLevel>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #712 <Method int MisspellingConfidenceLevel.ordinal()>
	//*   5   11:iaload          
		{
	//*   6   12:tableswitch     1 3: default 40
	//	               1 50
	//	               2 46
	//	               3 42
		default:
			return searchtype;
	//    7   40:aload_2         
	//    8   41:areturn         

		case 3: // '\003'
			return SearchType.MISSPELLING_WEAK;
	//    9   42:getstatic       #715 <Field SearchType SearchType.MISSPELLING_WEAK>
	//   10   45:areturn         

		case 2: // '\002'
			return SearchType.MISSPELLING_MEDIUM;
	//   11   46:getstatic       #718 <Field SearchType SearchType.MISSPELLING_MEDIUM>
	//   12   49:areturn         

		case 1: // '\001'
			return SearchType.MISSPELLING_STRONG;
	//   13   50:getstatic       #721 <Field SearchType SearchType.MISSPELLING_STRONG>
	//   14   53:areturn         
		}
	}

	protected abstract Set getRequestedSearchContent();

	protected RetailerModel getRetailerModel(Integer integer)
	{
		if(getHomeResponse() != null && integer != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #725 <Method HomeResponse getHomeResponse()>
	//*   2    4:ifnull          35
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       14
	//*   5   11:goto            35
			return retailerHelper.findRetailerById(getHomeResponse().getRetailersAsModels(), integer.intValue());
	//    6   14:aload_0         
	//    7   15:getfield        #121 <Field RetailerHelper retailerHelper>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #725 <Method HomeResponse getHomeResponse()>
	//   10   22:invokevirtual   #267 <Method List HomeResponse.getRetailersAsModels()>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #726 <Method int Integer.intValue()>
	//   13   29:invokeinterface #732 <Method RetailerModel RetailerHelper.findRetailerById(List, int)>
	//   14   34:areturn         
		else
			return null;
	//   15   35:aconst_null     
	//   16   36:areturn         
	}

	protected IbottaListViewState getSearchResultsViewState(SearchResults searchresults)
	{
		return searchResultsReducer.create(searchresults, favoriteRetailersManager, getContentTrackingData());
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field SearchResultsReducer searchResultsReducer>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #275 <Field FavoriteRetailersManager favoriteRetailersManager>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #331 <Method ContentTrackingPayload getContentTrackingData()>
	//    7   13:invokevirtual   #738 <Method IbottaListViewState SearchResultsReducer.create(SearchResults, FavoriteRetailersManager, ContentTrackingPayload)>
	//    8   16:areturn         
	}

	public void initSearch()
	{
		((SearchMvpView)mvpView).bindView(searchReducer.create(SearchAction.INIT_SEARCH, ((SearchMvpView)mvpView).getSearchHint()));
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field MvpView mvpView>
	//    2    4:checkcast       #311 <Class SearchMvpView>
	//    3    7:aload_0         
	//    4    8:getfield        #143 <Field SearchReducer searchReducer>
	//    5   11:getstatic       #742 <Field SearchAction SearchAction.INIT_SEARCH>
	//    6   14:aload_0         
	//    7   15:getfield        #154 <Field MvpView mvpView>
	//    8   18:checkcast       #311 <Class SearchMvpView>
	//    9   21:invokeinterface #641 <Method String SearchMvpView.getSearchHint()>
	//   10   26:invokevirtual   #646 <Method SearchViewState SearchReducer.create(SearchAction, String)>
	//   11   29:invokeinterface #650 <Method void SearchMvpView.bindView(SearchViewState)>
	//   12   34:return          
	}

	protected void onAbandonFetchJobs()
	{
		resetSearchDependencyJobs();
	//    0    0:aload_0         
	//    1    1:invokespecial   #380 <Method void resetSearchDependencyJobs()>
	//    2    4:return          
	}

	public void onAnyProductBarcodeScanned(String s)
	{
		search(s, SearchType.SCANNED);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #443 <Field SearchType SearchType.SCANNED>
	//    3    5:invokevirtual   #746 <Method void search(String, SearchType)>
	//    4    8:return          
	}

	public void onAnySuggestedViewTouch()
	{
		((SearchMvpView)mvpView).clearSearchFocus();
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field MvpView mvpView>
	//    2    4:checkcast       #311 <Class SearchMvpView>
	//    3    7:invokeinterface #595 <Method void SearchMvpView.clearSearchFocus()>
		((SearchMvpView)mvpView).hideKeyboard();
	//    4   12:aload_0         
	//    5   13:getfield        #154 <Field MvpView mvpView>
	//    6   16:checkcast       #311 <Class SearchMvpView>
	//    7   19:invokeinterface #598 <Method void SearchMvpView.hideKeyboard()>
	//    8   24:return          
	}

	public void onBackPressed()
	{
		if(searchState == SearchState.NOT_SEARCHING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field AbstractSearchMvpPresenter$SearchState searchState>
	//*   2    4:getstatic       #108 <Field AbstractSearchMvpPresenter$SearchState AbstractSearchMvpPresenter$SearchState.NOT_SEARCHING>
	//*   3    7:if_acmpne       23
		{
			((SearchMvpView)mvpView).onBackWhenNotSearching();
	//    4   10:aload_0         
	//    5   11:getfield        #154 <Field MvpView mvpView>
	//    6   14:checkcast       #311 <Class SearchMvpView>
	//    7   17:invokeinterface #751 <Method void SearchMvpView.onBackWhenNotSearching()>
			return;
	//    8   22:return          
		} else
		{
			exitSearch();
	//    9   23:aload_0         
	//   10   24:invokevirtual   #753 <Method void exitSearch()>
			return;
	//   11   27:return          
		}
	}

	public void onClearAllSearchTerms()
	{
		((SearchMvpView)mvpView).showConfirmClearAllSearchTermsDialog();
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field MvpView mvpView>
	//    2    4:checkcast       #311 <Class SearchMvpView>
	//    3    7:invokeinterface #757 <Method void SearchMvpView.showConfirmClearAllSearchTermsDialog()>
	//    4   12:return          
	}

	public void onClearSearchTerm(String s)
	{
		asyncRecentSearchService.clearSuggestedTerm(s, provideSearchCategory());
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field AsyncRecentSearchService asyncRecentSearchService>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #447 <Method Category provideSearchCategory()>
	//    5    9:invokeinterface #761 <Method void AsyncRecentSearchService.clearSuggestedTerm(String, Category)>
		onQueryRecentSearches("");
	//    6   14:aload_0         
	//    7   15:ldc1            #78  <String "">
	//    8   17:invokespecial   #357 <Method void onQueryRecentSearches(String)>
	//    9   20:return          
	}

	public void onConfirmClearAllSearchTerms()
	{
		asyncRecentSearchService.clearAllSuggestedTerms(provideSearchCategory());
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field AsyncRecentSearchService asyncRecentSearchService>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #447 <Method Category provideSearchCategory()>
	//    4    8:invokeinterface #766 <Method void AsyncRecentSearchService.clearAllSuggestedTerms(Category)>
		onQueryRecentSearches("");
	//    5   13:aload_0         
	//    6   14:ldc1            #78  <String "">
	//    7   16:invokespecial   #357 <Method void onQueryRecentSearches(String)>
	//    8   19:return          
	}

	public void onDetach()
	{
		super.onDetach();
	//    0    0:aload_0         
	//    1    1:invokespecial   #769 <Method void AbstractLoadingMvpPresenter.onDetach()>
		recentlyViewedRetailersService.cancel();
	//    2    4:aload_0         
	//    3    5:getfield        #147 <Field RecentlyViewedRetailersService recentlyViewedRetailersService>
	//    4    8:invokeinterface #774 <Method void RecentlyViewedRetailersService.cancel()>
	//    5   13:return          
	}

	public void onEmptyViewClicked()
	{
		Misspelling misspelling = searchResults.getMisspellingState();
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field SearchResults searchResults>
	//    2    4:invokevirtual   #608 <Method Misspelling SearchResults.getMisspellingState()>
	//    3    7:astore_1        
		MisspellingConfidenceLevel misspellingconfidencelevel = MisspellingConfidenceLevel.fromValue(searchResults.getMisspellingState().getConfidence());
	//    4    8:aload_0         
	//    5    9:getfield        #97  <Field SearchResults searchResults>
	//    6   12:invokevirtual   #608 <Method Misspelling SearchResults.getMisspellingState()>
	//    7   15:invokevirtual   #613 <Method String Misspelling.getConfidence()>
	//    8   18:invokestatic    #617 <Method MisspellingConfidenceLevel MisspellingConfidenceLevel.fromValue(String)>
	//    9   21:astore_2        
		if(misspellingconfidencelevel == MisspellingConfidenceLevel.WEAK)
	//*  10   22:aload_2         
	//*  11   23:getstatic       #286 <Field MisspellingConfidenceLevel MisspellingConfidenceLevel.WEAK>
	//*  12   26:if_acmpne       42
			search(misspelling.getSuggested(), getMisspellingWithConfidence(misspellingconfidencelevel));
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:invokevirtual   #778 <Method String Misspelling.getSuggested()>
	//   16   34:aload_0         
	//   17   35:aload_2         
	//   18   36:invokevirtual   #621 <Method SearchType getMisspellingWithConfidence(MisspellingConfidenceLevel)>
	//   19   39:invokevirtual   #746 <Method void search(String, SearchType)>
	//   20   42:return          
	}

	public void onExitSearch()
	{
		exitSearch();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #753 <Method void exitSearch()>
	//    2    4:return          
	}

	protected void onFetchFinishedSuccessfully()
	{
		loadSearchDependencyJobs();
	//    0    0:aload_0         
	//    1    1:invokespecial   #782 <Method void loadSearchDependencyJobs()>
		((SearchMvpView)mvpView).showSearchView();
	//    2    4:aload_0         
	//    3    5:getfield        #154 <Field MvpView mvpView>
	//    4    8:checkcast       #311 <Class SearchMvpView>
	//    5   11:invokeinterface #785 <Method void SearchMvpView.showSearchView()>
	//    6   16:return          
	}

	public void onInformationRowViewClicked(InformationRowViewState informationrowviewstate)
	{
		MisspellingConfidenceLevel misspellingconfidencelevel = informationrowviewstate.getConfidenceLevel();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #793 <Method MisspellingConfidenceLevel InformationRowViewState.getConfidenceLevel()>
	//    2    4:astore_2        
		if(isAlternativeSpellingSuggested(misspellingconfidencelevel))
	//*   3    5:aload_0         
	//*   4    6:aload_2         
	//*   5    7:invokespecial   #795 <Method boolean isAlternativeSpellingSuggested(MisspellingConfidenceLevel)>
	//*   6   10:ifeq            43
		{
			if(misspellingconfidencelevel == MisspellingConfidenceLevel.MEDIUM)
	//*   7   13:aload_2         
	//*   8   14:getstatic       #283 <Field MisspellingConfidenceLevel MisspellingConfidenceLevel.MEDIUM>
	//*   9   17:if_acmpne       28
				informationrowviewstate = ((InformationRowViewState) (informationrowviewstate.getOriginalTerm()));
	//   10   20:aload_1         
	//   11   21:invokevirtual   #798 <Method String InformationRowViewState.getOriginalTerm()>
	//   12   24:astore_1        
			else
	//*  13   25:goto            33
				informationrowviewstate = ((InformationRowViewState) (informationrowviewstate.getSuggestedTerm()));
	//   14   28:aload_1         
	//   15   29:invokevirtual   #801 <Method String InformationRowViewState.getSuggestedTerm()>
	//   16   32:astore_1        
			search(((String) (informationrowviewstate)), getMisspellingWithConfidence(misspellingconfidencelevel));
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:aload_2         
	//   21   37:invokevirtual   #621 <Method SearchType getMisspellingWithConfidence(MisspellingConfidenceLevel)>
	//   22   40:invokevirtual   #746 <Method void search(String, SearchType)>
		}
	//   23   43:return          
	}

	public void onLeftButtonClicked(SearchViewState searchviewstate)
	{
		if(SearchReducerKt.isLeftBack(searchviewstate))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #809 <Method boolean SearchReducerKt.isLeftBack(SearchViewState)>
	//*   2    4:ifeq            12
		{
			exitSearch();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #753 <Method void exitSearch()>
			return;
	//    5   11:return          
		}
		if(SearchReducerKt.isLeftSearch(searchviewstate))
	//*   6   12:aload_1         
	//*   7   13:invokestatic    #812 <Method boolean SearchReducerKt.isLeftSearch(SearchViewState)>
	//*   8   16:ifeq            24
			onSearchTextFocusChanged(true);
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #815 <Method void onSearchTextFocusChanged(boolean)>
	//   12   24:return          
	}

	public void onMainButtonClicked(ContentId contentid)
	{
		contentid = ((ContentId) (contentMapper.getContentModelByContentId(contentid, searchContentModels)));
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field ContentMapper contentMapper>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #88  <Field List searchContentModels>
	//    5    9:invokeinterface #823 <Method ContentModel ContentMapper.getContentModelByContentId(ContentId, List)>
	//    6   14:astore_1        
		RetailerModel retailermodel = getRetailerModel(searchResults.getRetailerId());
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #97  <Field SearchResults searchResults>
	//   10   20:invokevirtual   #827 <Method Integer SearchResults.getRetailerId()>
	//   11   23:invokevirtual   #829 <Method RetailerModel getRetailerModel(Integer)>
	//   12   26:astore_2        
		if(contentHelper.isShopNow(((ContentModel) (contentid))))
	//*  13   27:aload_0         
	//*  14   28:getfield        #141 <Field ContentHelper contentHelper>
	//*  15   31:aload_1         
	//*  16   32:invokeinterface #835 <Method boolean ContentHelper.isShopNow(ContentModel)>
	//*  17   37:ifeq            57
		{
			onShopClicked(((ContentModel) (contentid)), retailermodel, EventContext.SEARCH, searchResults.getSearchedTerm());
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:aload_2         
	//   21   43:getstatic       #840 <Field EventContext EventContext.SEARCH>
	//   22   46:aload_0         
	//   23   47:getfield        #97  <Field SearchResults searchResults>
	//   24   50:invokevirtual   #629 <Method String SearchResults.getSearchedTerm()>
	//   25   53:invokevirtual   #844 <Method void onShopClicked(ContentModel, RetailerModel, EventContext, String)>
			return;
	//   26   56:return          
		}
		if(((ContentModel) (contentid)).getTypeEnum() == com.ibotta.api.model.ContentModel.Type.OFFER)
	//*  27   57:aload_1         
	//*  28   58:invokeinterface #850 <Method com.ibotta.api.model.ContentModel$Type ContentModel.getTypeEnum()>
	//*  29   63:getstatic       #856 <Field com.ibotta.api.model.ContentModel$Type com.ibotta.api.model.ContentModel$Type.OFFER>
	//*  30   66:if_acmpne       95
			if(((OfferModel)contentid).isActivated())
	//*  31   69:aload_1         
	//*  32   70:checkcast       #858 <Class OfferModel>
	//*  33   73:invokeinterface #861 <Method boolean OfferModel.isActivated()>
	//*  34   78:ifeq            88
			{
				onUnlockedClicked(((ContentModel) (contentid)), retailermodel);
	//   35   81:aload_0         
	//   36   82:aload_1         
	//   37   83:aload_2         
	//   38   84:invokevirtual   #865 <Method void onUnlockedClicked(ContentModel, RetailerModel)>
				return;
	//   39   87:return          
			} else
			{
				onUnlockClicked(((ContentModel) (contentid)), retailermodel);
	//   40   88:aload_0         
	//   41   89:aload_1         
	//   42   90:aload_2         
	//   43   91:invokevirtual   #868 <Method void onUnlockClicked(ContentModel, RetailerModel)>
				return;
	//   44   94:return          
			}
		if(((ContentModel) (contentid)).getTypeEnum() == com.ibotta.api.model.ContentModel.Type.RETAILER)
	//*  45   95:aload_1         
	//*  46   96:invokeinterface #850 <Method com.ibotta.api.model.ContentModel$Type ContentModel.getTypeEnum()>
	//*  47  101:getstatic       #871 <Field com.ibotta.api.model.ContentModel$Type com.ibotta.api.model.ContentModel$Type.RETAILER>
	//*  48  104:if_acmpne       145
		{
			FavoriteRetailersManager favoriteretailersmanager = favoriteRetailersManager;
	//   49  107:aload_0         
	//   50  108:getfield        #275 <Field FavoriteRetailersManager favoriteRetailersManager>
	//   51  111:astore_2        
			if(favoriteretailersmanager != null)
	//*  52  112:aload_2         
	//*  53  113:ifnull          145
			{
				onFavoriteClicked((RetailerModel)contentid, favoriteretailersmanager);
	//   54  116:aload_0         
	//   55  117:aload_1         
	//   56  118:checkcast       #873 <Class RetailerModel>
	//   57  121:aload_2         
	//   58  122:invokevirtual   #877 <Method void onFavoriteClicked(RetailerModel, FavoriteRetailersManager)>
				((SearchMvpView)mvpView).updateSearchListViewState(getSearchResultsViewState(searchResults));
	//   59  125:aload_0         
	//   60  126:getfield        #154 <Field MvpView mvpView>
	//   61  129:checkcast       #311 <Class SearchMvpView>
	//   62  132:aload_0         
	//   63  133:aload_0         
	//   64  134:getfield        #97  <Field SearchResults searchResults>
	//   65  137:invokevirtual   #571 <Method IbottaListViewState getSearchResultsViewState(SearchResults)>
	//   66  140:invokeinterface #341 <Method void SearchMvpView.updateSearchListViewState(IbottaListViewState)>
			}
		}
	//   67  145:return          
	}

	public void onRecentRetailerClicked(ContentId contentid)
	{
		SearchEvent searchevent = new SearchEvent();
	//    0    0:new             #213 <Class SearchEvent>
	//    1    3:dup             
	//    2    4:invokespecial   #215 <Method void SearchEvent()>
	//    3    7:astore_2        
		searchevent.setCounter(1);
	//    4    8:aload_2         
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #219 <Method void SearchEvent.setCounter(int)>
		searchevent.setEventAt(System.currentTimeMillis());
	//    7   13:aload_2         
	//    8   14:invokestatic    #626 <Method long System.currentTimeMillis()>
	//    9   17:invokevirtual   #229 <Method void SearchEvent.setEventAt(long)>
		searchevent.setClicked(Boolean.valueOf(true));
	//   10   20:aload_2         
	//   11   21:iconst_1        
	//   12   22:invokestatic    #248 <Method Boolean Boolean.valueOf(boolean)>
	//   13   25:invokevirtual   #252 <Method void SearchEvent.setClicked(Boolean)>
		searchevent.setClickType(ClickType.RETAILER);
	//   14   28:aload_2         
	//   15   29:getstatic       #880 <Field ClickType ClickType.RETAILER>
	//   16   32:invokevirtual   #256 <Method void SearchEvent.setClickType(ClickType)>
		searchevent.setClickId(Integer.valueOf(contentid.getIntId()));
	//   17   35:aload_2         
	//   18   36:aload_1         
	//   19   37:invokevirtual   #885 <Method int ContentId.getIntId()>
	//   20   40:invokestatic    #693 <Method Integer Integer.valueOf(int)>
	//   21   43:invokevirtual   #889 <Method void SearchEvent.setClickId(Integer)>
		eventContextProvider.provideContext(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (searchevent)));
	//   22   46:aload_0         
	//   23   47:getfield        #133 <Field EventContextProvider eventContextProvider>
	//   24   50:aload_2         
	//   25   51:invokeinterface #262 <Method void EventContextProvider.provideContext(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
		trackingQueue.send(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (searchevent)));
	//   26   56:aload_0         
	//   27   57:getfield        #131 <Field TrackingQueue trackingQueue>
	//   28   60:aload_2         
	//   29   61:invokeinterface #479 <Method void TrackingQueue.send(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
		contentid = ((ContentId) (retailerHelper.findRetailerById(recentlyViewedRetailers, contentid.getIntId())));
	//   30   66:aload_0         
	//   31   67:getfield        #121 <Field RetailerHelper retailerHelper>
	//   32   70:aload_0         
	//   33   71:getfield        #90  <Field List recentlyViewedRetailers>
	//   34   74:aload_1         
	//   35   75:invokevirtual   #885 <Method int ContentId.getIntId()>
	//   36   78:invokeinterface #732 <Method RetailerModel RetailerHelper.findRetailerById(List, int)>
	//   37   83:astore_1        
		((SearchMvpView)mvpView).showRetailerGallery(((RetailerModel) (contentid)), ((com.ibotta.android.apiandroid.retailer.RetailerCategoryParcel) (null)));
	//   38   84:aload_0         
	//   39   85:getfield        #154 <Field MvpView mvpView>
	//   40   88:checkcast       #311 <Class SearchMvpView>
	//   41   91:aload_1         
	//   42   92:aconst_null     
	//   43   93:invokeinterface #893 <Method void SearchMvpView.showRetailerGallery(RetailerModel, com.ibotta.android.apiandroid.retailer.RetailerCategoryParcel)>
	//   44   98:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #896 <Method void AbstractLoadingMvpPresenter.onResume()>
		recentlyViewedRetailersService.loadRecentlyViewedRetailers(((java9.util.function.Consumer) (new _2D_..Lambda.AbstractSearchMvpPresenter.YMNS_2D_jAiIrU0KHbCYAQUcuZXW60(this))));
	//    2    4:aload_0         
	//    3    5:getfield        #147 <Field RecentlyViewedRetailersService recentlyViewedRetailersService>
	//    4    8:new             #898 <Class _2D_$$Lambda$AbstractSearchMvpPresenter$YMNS_2D_jAiIrU0KHbCYAQUcuZXW60>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #899 <Method void _2D_$$Lambda$AbstractSearchMvpPresenter$YMNS_2D_jAiIrU0KHbCYAQUcuZXW60(AbstractSearchMvpPresenter)>
	//    8   16:invokeinterface #903 <Method void RecentlyViewedRetailersService.loadRecentlyViewedRetailers(java9.util.function.Consumer)>
	//    9   21:return          
	}

	public void onRetailerRowClicked(RetailerModel retailermodel)
	{
		trackClick(((Object) (retailermodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #909 <Method void trackClick(Object)>
		((SearchMvpView)mvpView).showRetailerGallery(retailermodel, ((com.ibotta.android.apiandroid.retailer.RetailerCategoryParcel) (null)));
	//    3    5:aload_0         
	//    4    6:getfield        #154 <Field MvpView mvpView>
	//    5    9:checkcast       #311 <Class SearchMvpView>
	//    6   12:aload_1         
	//    7   13:aconst_null     
	//    8   14:invokeinterface #893 <Method void SearchMvpView.showRetailerGallery(RetailerModel, com.ibotta.android.apiandroid.retailer.RetailerCategoryParcel)>
	//    9   19:return          
	}

	public void onRightButtonClicked(SearchViewState searchviewstate)
	{
		if(SearchReducerKt.isRightBarcodeScan(searchviewstate))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #913 <Method boolean SearchReducerKt.isRightBarcodeScan(SearchViewState)>
	//*   2    4:ifeq            20
		{
			((SearchMvpView)mvpView).showAnyProductBarcodeScan();
	//    3    7:aload_0         
	//    4    8:getfield        #154 <Field MvpView mvpView>
	//    5   11:checkcast       #311 <Class SearchMvpView>
	//    6   14:invokeinterface #916 <Method void SearchMvpView.showAnyProductBarcodeScan()>
			return;
	//    7   19:return          
		}
		if(SearchReducerKt.isRightClear(searchviewstate))
	//*   8   20:aload_1         
	//*   9   21:invokestatic    #919 <Method boolean SearchReducerKt.isRightClear(SearchViewState)>
	//*  10   24:ifeq            31
			clearSearch();
	//   11   27:aload_0         
	//   12   28:invokevirtual   #921 <Method void clearSearch()>
	//   13   31:return          
	}

	public void onRowClicked(ContentId contentid)
	{
		ContentModel contentmodel = contentMapper.getContentModelByContentId(contentid, searchContentModels);
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field ContentMapper contentMapper>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #88  <Field List searchContentModels>
	//    5    9:invokeinterface #823 <Method ContentModel ContentMapper.getContentModelByContentId(ContentId, List)>
	//    6   14:astore_2        
		RetailerModel retailermodel = getRetailerModel(searchResults.getRetailerId());
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #97  <Field SearchResults searchResults>
	//   10   20:invokevirtual   #827 <Method Integer SearchResults.getRetailerId()>
	//   11   23:invokevirtual   #829 <Method RetailerModel getRetailerModel(Integer)>
	//   12   26:astore_3        
		if(contentid.getIdType() == 2)
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #926 <Method int ContentId.getIdType()>
	//*  15   31:iconst_2        
	//*  16   32:icmpne          44
		{
			onRetailerRowClicked((RetailerModel)contentmodel);
	//   17   35:aload_0         
	//   18   36:aload_2         
	//   19   37:checkcast       #873 <Class RetailerModel>
	//   20   40:invokevirtual   #928 <Method void onRetailerRowClicked(RetailerModel)>
			return;
	//   21   43:return          
		} else
		{
			onContentClicked(contentmodel, retailermodel);
	//   22   44:aload_0         
	//   23   45:aload_2         
	//   24   46:aload_3         
	//   25   47:invokevirtual   #931 <Method void onContentClicked(ContentModel, RetailerModel)>
			return;
	//   26   50:return          
		}
	}

	public void onScanSearchClicked()
	{
		setIsExpectingActivityResult(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #495 <Method void setIsExpectingActivityResult(boolean)>
		((SearchMvpView)mvpView).showAnyProductBarcodeScan();
	//    3    5:aload_0         
	//    4    6:getfield        #154 <Field MvpView mvpView>
	//    5    9:checkcast       #311 <Class SearchMvpView>
	//    6   12:invokeinterface #916 <Method void SearchMvpView.showAnyProductBarcodeScan()>
	//    7   17:return          
	}

	public void onSearch(String s)
	{
		search(s, SearchType.TYPED);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #935 <Field SearchType SearchType.TYPED>
	//    3    5:invokevirtual   #746 <Method void search(String, SearchType)>
	//    4    8:return          
	}

	public void onSearchTextChanged()
	{
		focusSearch();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #938 <Method void focusSearch()>
	//    2    4:return          
	}

	public void onSearchTextFocusChanged(boolean flag)
	{
		if(flag && searchState == SearchState.NOT_SEARCHING)
	//*   0    0:iload_1         
	//*   1    1:ifeq            22
	//*   2    4:aload_0         
	//*   3    5:getfield        #110 <Field AbstractSearchMvpPresenter$SearchState searchState>
	//*   4    8:getstatic       #108 <Field AbstractSearchMvpPresenter$SearchState AbstractSearchMvpPresenter$SearchState.NOT_SEARCHING>
	//*   5   11:if_acmpne       22
		{
			clearSearch();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #921 <Method void clearSearch()>
			focusSearch();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #938 <Method void focusSearch()>
		}
	//   10   22:return          
	}

	public void onSearchTextPostDelay(String s)
	{
		lastTypedTerm = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #80  <Field String lastTypedTerm>
		if(searchState == SearchState.QUERYING)
	//*   3    5:aload_0         
	//*   4    6:getfield        #110 <Field AbstractSearchMvpPresenter$SearchState searchState>
	//*   5    9:getstatic       #309 <Field AbstractSearchMvpPresenter$SearchState AbstractSearchMvpPresenter$SearchState.QUERYING>
	//*   6   12:if_acmpne       20
			onQueryRecentSearches(s);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #357 <Method void onQueryRecentSearches(String)>
	//   10   20:return          
	}

	public void onSuggestionRowClicked(SuggestedSearchItemViewState suggestedsearchitemviewstate)
	{
		if(suggestedsearchitemviewstate.getIbottaImageButtonViewState().getDrawableResource() == 0x7f080201)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #945 <Method IbottaButtonViewState SuggestedSearchItemViewState.getIbottaImageButtonViewState()>
	//*   2    4:invokevirtual   #950 <Method int IbottaButtonViewState.getDrawableResource()>
	//*   3    7:ldc2            #951 <Int 0x7f080201>
	//*   4   10:icmpne          18
		{
			onScanSearchClicked();
	//    5   13:aload_0         
	//    6   14:invokevirtual   #953 <Method void onScanSearchClicked()>
			return;
	//    7   17:return          
		} else
		{
			SearchType searchtype = ((SuggestedSearchItem)StreamSupport.stream(((java.util.Collection) (suggestedSearches.getSuggestedSearchItems()))).filter(((java9.util.function.Predicate) (new _2D_..Lambda.AbstractSearchMvpPresenter.CCjzNeqnwbWuzZCdiXeU1slTG_2D_g(suggestedsearchitemviewstate)))).findFirst().get()).getSearchType();
	//    8   18:aload_0         
	//    9   19:getfield        #103 <Field SuggestedSearches suggestedSearches>
	//   10   22:invokevirtual   #956 <Method List SuggestedSearches.getSuggestedSearchItems()>
	//   11   25:invokestatic    #535 <Method Stream StreamSupport.stream(java.util.Collection)>
	//   12   28:new             #958 <Class _2D_$$Lambda$AbstractSearchMvpPresenter$CCjzNeqnwbWuzZCdiXeU1slTG_2D_g>
	//   13   31:dup             
	//   14   32:aload_1         
	//   15   33:invokespecial   #960 <Method void _2D_$$Lambda$AbstractSearchMvpPresenter$CCjzNeqnwbWuzZCdiXeU1slTG_2D_g(SuggestedSearchItemViewState)>
	//   16   36:invokeinterface #964 <Method Stream Stream.filter(java9.util.function.Predicate)>
	//   17   41:invokeinterface #968 <Method Optional Stream.findFirst()>
	//   18   46:invokevirtual   #972 <Method Object Optional.get()>
	//   19   49:checkcast       #361 <Class SuggestedSearchItem>
	//   20   52:invokevirtual   #976 <Method SearchType SuggestedSearchItem.getSearchType()>
	//   21   55:astore_2        
			search(suggestedsearchitemviewstate.getSuggestionText(), searchtype);
	//   22   56:aload_0         
	//   23   57:aload_1         
	//   24   58:invokevirtual   #372 <Method String SuggestedSearchItemViewState.getSuggestionText()>
	//   25   61:aload_2         
	//   26   62:invokevirtual   #746 <Method void search(String, SearchType)>
			return;
	//   27   65:return          
		}
	}

	public void onUnlockCompleted()
	{
		((SearchMvpView)mvpView).showUnlockAnimation();
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field MvpView mvpView>
	//    2    4:checkcast       #311 <Class SearchMvpView>
	//    3    7:invokeinterface #980 <Method void SearchMvpView.showUnlockAnimation()>
		reload();
	//    4   12:aload_0         
	//    5   13:invokevirtual   #983 <Method void reload()>
	//    6   16:return          
	}

	public Category provideSearchCategory()
	{
		return Category.GLOBAL;
	//    0    0:getstatic       #989 <Field Category Category.GLOBAL>
	//    1    3:areturn         
	}

	public void search(String s, SearchType searchtype)
	{
		setSearchState(SearchState.VIEWING_RESULTS);
	//    0    0:aload_0         
	//    1    1:getstatic       #574 <Field AbstractSearchMvpPresenter$SearchState AbstractSearchMvpPresenter$SearchState.VIEWING_RESULTS>
	//    2    4:invokespecial   #632 <Method void setSearchState(AbstractSearchMvpPresenter$SearchState)>
		((SearchMvpView)mvpView).bindView(searchReducer.create(SearchAction.SEARCH, s, ((SearchMvpView)mvpView).getSearchHint()));
	//    3    7:aload_0         
	//    4    8:getfield        #154 <Field MvpView mvpView>
	//    5   11:checkcast       #311 <Class SearchMvpView>
	//    6   14:aload_0         
	//    7   15:getfield        #143 <Field SearchReducer searchReducer>
	//    8   18:getstatic       #991 <Field SearchAction SearchAction.SEARCH>
	//    9   21:aload_1         
	//   10   22:aload_0         
	//   11   23:getfield        #154 <Field MvpView mvpView>
	//   12   26:checkcast       #311 <Class SearchMvpView>
	//   13   29:invokeinterface #641 <Method String SearchMvpView.getSearchHint()>
	//   14   34:invokevirtual   #994 <Method SearchViewState SearchReducer.create(SearchAction, String, String)>
	//   15   37:invokeinterface #650 <Method void SearchMvpView.bindView(SearchViewState)>
		onSearch(s, searchtype);
	//   16   42:aload_0         
	//   17   43:aload_1         
	//   18   44:aload_2         
	//   19   45:invokespecial   #576 <Method void onSearch(String, SearchType)>
		((SearchMvpView)mvpView).hideKeyboard();
	//   20   48:aload_0         
	//   21   49:getfield        #154 <Field MvpView mvpView>
	//   22   52:checkcast       #311 <Class SearchMvpView>
	//   23   55:invokeinterface #598 <Method void SearchMvpView.hideKeyboard()>
	//   24   60:return          
	}

	protected void setRetailerId(Integer integer)
	{
		retailerId = Long.valueOf(integer.longValue());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #998 <Method long Integer.longValue()>
	//    3    5:invokestatic    #1001 <Method Long Long.valueOf(long)>
	//    4    8:putfield        #422 <Field Long retailerId>
	//    5   11:return          
	}

	public void trackClick(Object obj)
	{
		SearchEvent searchevent = new SearchEvent();
	//    0    0:new             #213 <Class SearchEvent>
	//    1    3:dup             
	//    2    4:invokespecial   #215 <Method void SearchEvent()>
	//    3    7:astore_2        
		searchevent.setCounter(1);
	//    4    8:aload_2         
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #219 <Method void SearchEvent.setCounter(int)>
		searchevent.setEventAt(System.currentTimeMillis());
	//    7   13:aload_2         
	//    8   14:invokestatic    #626 <Method long System.currentTimeMillis()>
	//    9   17:invokevirtual   #229 <Method void SearchEvent.setEventAt(long)>
		searchevent.setTerm(lastSearchTerm);
	//   10   20:aload_2         
	//   11   21:aload_0         
	//   12   22:getfield        #438 <Field String lastSearchTerm>
	//   13   25:invokevirtual   #233 <Method void SearchEvent.setTerm(String)>
		searchevent.setClicked(Boolean.valueOf(true));
	//   14   28:aload_2         
	//   15   29:iconst_1        
	//   16   30:invokestatic    #248 <Method Boolean Boolean.valueOf(boolean)>
	//   17   33:invokevirtual   #252 <Method void SearchEvent.setClicked(Boolean)>
		searchevent.setClickType(SearchTrackingHelper.fromType(obj));
	//   18   36:aload_2         
	//   19   37:aload_1         
	//   20   38:invokestatic    #1007 <Method ClickType SearchTrackingHelper.fromType(Object)>
	//   21   41:invokevirtual   #256 <Method void SearchEvent.setClickType(ClickType)>
		searchevent.setClickId(SearchTrackingHelper.getId(obj));
	//   22   44:aload_2         
	//   23   45:aload_1         
	//   24   46:invokestatic    #1011 <Method Integer SearchTrackingHelper.getId(Object)>
	//   25   49:invokevirtual   #889 <Method void SearchEvent.setClickId(Integer)>
		eventContextProvider.provideContext(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (searchevent)));
	//   26   52:aload_0         
	//   27   53:getfield        #133 <Field EventContextProvider eventContextProvider>
	//   28   56:aload_2         
	//   29   57:invokeinterface #262 <Method void EventContextProvider.provideContext(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
		trackingQueue.send(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (searchevent)));
	//   30   62:aload_0         
	//   31   63:getfield        #131 <Field TrackingQueue trackingQueue>
	//   32   66:aload_2         
	//   33   67:invokeinterface #479 <Method void TrackingQueue.send(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
	//   34   72:return          
	}

	protected final ApiWorkSubmitter apiWorkSubmitter;
	protected final AppHelper appHelper;
	private final AsyncRecentSearchService asyncRecentSearchService;
	private final AsyncSuggestedSearchService asyncSuggestedSearchService;
	private final ContentHelper contentHelper;
	private final ContentMapper contentMapper;
	private final EventContextProvider eventContextProvider;
	protected FavoriteRetailersManager favoriteRetailersManager;
	private final FavoriteRetailersManagerFactory favoriteRetailersManagerFactory;
	private HomeApiJob homeJob;
	private String lastSearchTerm;
	private SearchType lastSearchType;
	private String lastTypedTerm;
	private final LoadRetailersVariant loadRetailersVariant;
	private boolean loading;
	private List recentlyViewedRetailers;
	private final RecentlyViewedRetailersService recentlyViewedRetailersService;
	protected final RetailerHelper retailerHelper;
	private final SearchAsync searchAsync;
	private List searchContentModels;
	private final ApiJobListener searchJobListener = new ApiJobListener() ;
	private final SearchReducer searchReducer;
	private SearchResults searchResults;
	protected final SearchResultsReducer searchResultsReducer;
	private SearchState searchState;
	private final SuggestedSearchItemsReducer suggestedSearchItemsReducer;
	private SuggestedSearches suggestedSearches;
	private final TrackingQueue trackingQueue;


/*
	static MvpView access$000(AbstractSearchMvpPresenter abstractsearchmvppresenter)
	{
		return abstractsearchmvppresenter.mvpView;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field MvpView mvpView>
	//    2    4:areturn         
	}

*/


/*
	static HomeApiJob access$100(AbstractSearchMvpPresenter abstractsearchmvppresenter)
	{
		return abstractsearchmvppresenter.homeJob;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field HomeApiJob homeJob>
	//    2    4:areturn         
	}

*/


/*
	static void access$200(AbstractSearchMvpPresenter abstractsearchmvppresenter, HomeResponse homeresponse)
	{
		abstractsearchmvppresenter.initFavoriteStoresManager(homeresponse);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #164 <Method void initFavoriteStoresManager(HomeResponse)>
		return;
	//    3    5:return          
	}

*/


/*
	static MvpView access$300(AbstractSearchMvpPresenter abstractsearchmvppresenter)
	{
		return abstractsearchmvppresenter.mvpView;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field MvpView mvpView>
	//    2    4:areturn         
	}

*/


/*
	static void access$400(AbstractSearchMvpPresenter abstractsearchmvppresenter, SearchMvpView searchmvpview)
	{
		abstractsearchmvppresenter.checkIfLoadFinished(searchmvpview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #171 <Method void checkIfLoadFinished(SearchMvpView)>
		return;
	//    3    5:return          
	}

*/
}
