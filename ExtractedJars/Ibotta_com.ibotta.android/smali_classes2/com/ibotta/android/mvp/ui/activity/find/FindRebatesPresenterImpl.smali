.class public Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;
.super Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;
.source "FindRebatesPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenter;"
    }
.end annotation


# instance fields
.field private final accountTracking:Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

.field private apiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

.field private final findRebatesReducer:Lcom/ibotta/android/find/FindRebatesReducer;

.field private findRebatesRows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;",
            ">;"
        }
    .end annotation
.end field

.field private final loadRetailerCategoriesVariant:Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private final retailerCategoriesReducer:Lcom/ibotta/android/categories/RetailerCategoriesReducer;

.field private final retailerHorizListReducer:Lcom/ibotta/android/horiz/RetailerHorizListReducer;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/search/async/SearchAsync;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/search/AsyncRecentSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/util/content/ContentHelper;Lcom/ibotta/android/search/SearchReducer;Lcom/ibotta/android/search/SuggestedSearchItemsReducer;Lcom/ibotta/android/find/FindRebatesReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/categories/RetailerCategoriesReducer;Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;Lcom/ibotta/android/state/user/UserState;)V
    .locals 18

    move-object/from16 v15, p0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v12, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p11

    move-object/from16 v10, p12

    move-object/from16 v11, p14

    move-object/from16 v13, p15

    move-object/from16 v14, p16

    move-object/from16 v15, p17

    move-object/from16 v16, p18

    move-object/from16 v17, p22

    .line 106
    invoke-direct/range {v0 .. v17}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/search/async/SearchAsync;Lcom/ibotta/android/search/AsyncRecentSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/util/content/ContentHelper;Lcom/ibotta/android/search/SearchReducer;Lcom/ibotta/android/search/SuggestedSearchItemsReducer;Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;)V

    .line 79
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->findRebatesRows:Ljava/util/List;

    move-object/from16 v0, p6

    .line 125
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    move-object/from16 v0, p9

    .line 126
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    move-object/from16 v0, p10

    .line 127
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->loadRetailerCategoriesVariant:Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;

    move-object/from16 v0, p13

    .line 128
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->accountTracking:Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    move-object/from16 v0, p19

    .line 129
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->findRebatesReducer:Lcom/ibotta/android/find/FindRebatesReducer;

    move-object/from16 v0, p20

    .line 130
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->retailerHorizListReducer:Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    move-object/from16 v0, p21

    .line 131
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->retailerCategoriesReducer:Lcom/ibotta/android/categories/RetailerCategoriesReducer;

    move-object/from16 v0, p23

    .line 132
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    return-void
.end method

.method private createFavoriteRetailersRow(Ljava/util/List;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Ljava/util/concurrent/atomic/AtomicInteger;",
            ")V"
        }
    .end annotation

    .line 208
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->getFavoriteRetailerIds()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    invoke-interface {v0}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->getFavoriteRetailerIds()Ljava/util/Set;

    move-result-object v0

    .line 210
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 212
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    .line 213
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v3, p2, v2}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 215
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 219
    :cond_1
    invoke-direct {p0, v1, p3}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->initFavRetailersRow(Ljava/util/List;Ljava/util/concurrent/atomic/AtomicInteger;)Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 221
    :cond_2
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/find/row/EmptyFavoriteRetailersRow;

    invoke-direct {p2}, Lcom/ibotta/android/mvp/ui/activity/find/row/EmptyFavoriteRetailersRow;-><init>()V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    return-void
.end method

.method private createRetailerCategoryRows(Ljava/util/List;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;",
            "Ljava/util/concurrent/atomic/AtomicInteger;",
            ")V"
        }
    .end annotation

    .line 243
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->findRebatesReducer:Lcom/ibotta/android/find/FindRebatesReducer;

    invoke-virtual {v0}, Lcom/ibotta/android/find/FindRebatesReducer;->getBrowseByCategoryTitle()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v0

    .line 244
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->retailerCategoriesReducer:Lcom/ibotta/android/categories/RetailerCategoriesReducer;

    invoke-virtual {v1, v0, p2}, Lcom/ibotta/android/categories/RetailerCategoriesReducer;->createRetailerCategoriesViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/util/List;)Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;

    move-result-object p2

    .line 246
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/row/RetailerCategoriesRow;

    invoke-direct {v1, p2}, Lcom/ibotta/android/mvp/ui/activity/find/row/RetailerCategoriesRow;-><init>(Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;)V

    const/4 p2, 0x1

    .line 248
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/ibotta/android/mvp/ui/activity/find/row/RetailerCategoriesRow;->setModuleIndex(Ljava/lang/Integer;)V

    .line 249
    invoke-virtual {v0}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getTitle()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/ibotta/android/mvp/ui/activity/find/row/RetailerCategoriesRow;->setModuleName(Ljava/lang/String;)V

    .line 250
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p2

    invoke-virtual {v1, p2}, Lcom/ibotta/android/mvp/ui/activity/find/row/RetailerCategoriesRow;->setIndex(I)V

    .line 252
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private initFavRetailersRow(Ljava/util/List;Ljava/util/concurrent/atomic/AtomicInteger;)Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Ljava/util/concurrent/atomic/AtomicInteger;",
            ")",
            "Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;"
        }
    .end annotation

    .line 226
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->findRebatesReducer:Lcom/ibotta/android/find/FindRebatesReducer;

    invoke-virtual {v0}, Lcom/ibotta/android/find/FindRebatesReducer;->getMyFavoritesTitle()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v0

    .line 227
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->retailerHorizListReducer:Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/horiz/RetailerHorizListReducer;->create(Ljava/util/List;)Lcom/ibotta/android/horiz/RetailerSSCardListViewState;

    move-result-object p1

    .line 229
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;

    invoke-direct {v1, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;Lcom/ibotta/android/horiz/RetailerSSCardListViewState;)V

    const/4 p1, 0x0

    .line 231
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;->setModuleIndex(Ljava/lang/Integer;)V

    .line 232
    invoke-virtual {v0}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getTitle()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;->setModuleName(Ljava/lang/String;)V

    .line 233
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;->setIndex(I)V

    return-object v1
.end method

.method private initFavoriteStoresManager(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    .line 202
    invoke-virtual {v0, p1}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->newInstance(Ljava/util/List;)Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    return-void
.end method

.method static synthetic lambda$favoriteRetailerClicked$0(Lcom/ibotta/android/apiandroid/content/ContentId;Lcom/ibotta/api/model/RetailerModel;)Z
    .locals 0

    .line 268
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p1

    invoke-virtual {p0}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIntId()I

    move-result p0

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public favoriteRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 2

    .line 262
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->apiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    return-void

    .line 266
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->loadRetailerCategoriesVariant:Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;

    .line 267
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;->getFavoriteRetailers(Lcom/ibotta/api/ApiResponse;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/-$$Lambda$FindRebatesPresenterImpl$UougjrDBesKKPN5F63V8Byg5lrk;

    invoke-direct {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/find/-$$Lambda$FindRebatesPresenterImpl$UougjrDBesKKPN5F63V8Byg5lrk;-><init>(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    .line 268
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 269
    invoke-interface {p1}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesView;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/-$$Lambda$gD-i7OYjCGe0JZZU4TLjh3a8Hh4;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/-$$Lambda$gD-i7OYjCGe0JZZU4TLjh3a8Hh4;-><init>(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesView;)V

    .line 270
    invoke-virtual {p1, v1}, Ljava9/util/Optional;->ifPresent(Ljava9/util/function/Consumer;)V

    return-void
.end method

.method protected getFetchJobs()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 142
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 144
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->apiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 145
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->loadRetailerCategoriesVariant:Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;->getRetailerCategoriesJob(I)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->apiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 148
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->apiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected getRequestedSearchContent()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/search/async/SearchAsync$SearchContent;",
            ">;"
        }
    .end annotation

    .line 137
    sget-object v0, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;->OFFERS:Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    sget-object v1, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;->RETAILERS:Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    sget-object v2, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;->PRODUCTS:Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    invoke-static {v0, v1, v2}, Ljava9/util/Sets;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    .line 155
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->onAbandonFetchJobs()V

    const/4 v0, 0x0

    .line 156
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->apiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 4

    .line 161
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->onFetchFinishedSuccessfully()V

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->apiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    .line 164
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v2, "apiJob is null!"

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesView;->finish()V

    return-void

    .line 169
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->findRebatesRows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->apiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    .line 172
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->loadRetailerCategoriesVariant:Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;

    invoke-interface {v1, v0}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;->getFavoriteRetailers(Lcom/ibotta/api/ApiResponse;)Ljava/util/List;

    move-result-object v1

    .line 173
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->loadRetailerCategoriesVariant:Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;

    invoke-interface {v2, v0}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;->getCategories(Lcom/ibotta/api/ApiResponse;)Ljava/util/List;

    move-result-object v0

    .line 175
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->initFavoriteStoresManager(Ljava/util/List;)V

    .line 177
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 179
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->findRebatesRows:Ljava/util/List;

    invoke-direct {p0, v3, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->createFavoriteRetailersRow(Ljava/util/List;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicInteger;)V

    .line 180
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->findRebatesRows:Ljava/util/List;

    invoke-direct {p0, v1, v0, v2}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->createRetailerCategoryRows(Ljava/util/List;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicInteger;)V

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->findRebatesRows:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesView;->setFindRebatesRows(Ljava/util/List;)V

    return-void
.end method

.method protected onFetchFinishedWithFailures()V
    .locals 1

    .line 187
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->onFetchFinishedWithFailures()V

    .line 189
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->networkConnectionErrorViewShowing:Z

    if-eqz v0, :cond_0

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesView;->setTitleForLoadFailure()V

    :cond_0
    return-void
.end method

.method public onManageFavoritesClicked()V
    .locals 1

    .line 257
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesView;->launchManageFavorites()V

    return-void
.end method

.method public onNavAccountClicked()V
    .locals 1

    .line 196
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->accountTracking:Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;->trackAccountNavClick()V

    .line 197
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->onNavAccountClicked()V

    return-void
.end method

.method public onRetailerCategoryClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 2

    .line 275
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->apiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    return-void

    .line 279
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    .line 280
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->loadRetailerCategoriesVariant:Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;

    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIntId()I

    move-result p1

    invoke-interface {v1, v0, p1}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesVariant;->getCategoryById(Lcom/ibotta/api/ApiResponse;I)Lcom/ibotta/api/model/retailer/Category;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 283
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesView;

    invoke-static {p1}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->fromCategory(Lcom/ibotta/api/model/retailer/Category;)Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesView;->launchRetailerCategoryGallery(Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;)V

    :cond_1
    return-void
.end method
