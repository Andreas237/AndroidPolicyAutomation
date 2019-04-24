.class public Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;
.super Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;
.source "GalleryPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;"
    }
.end annotation


# instance fields
.field private final accountTracking:Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

.field private customer:Lcom/ibotta/api/model/customer/Customer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

.field private favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

.field private final favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

.field private final galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

.field private final imRedemptionAction:Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;

.field private loadStartTime:J

.field private final offerAnomalyDetector:Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;

.field private offerCategoriesContainerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

.field private final recentlyViewedRetailersService:Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;

.field private final retailerIconOnOfferVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field private search:Ljava/lang/String;

.field private selectedCategoryId:Ljava/lang/Integer;

.field private showBuyableGiftCardNav:Z

.field private final trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/search/async/SearchAsync;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;Lcom/ibotta/android/search/AsyncRecentSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/util/content/ContentHelper;Lcom/ibotta/android/search/SearchReducer;Lcom/ibotta/android/search/SuggestedSearchItemsReducer;Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;)V
    .locals 18

    move-object/from16 v15, p0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v12, p9

    move-object/from16 v6, p11

    move-object/from16 v7, p12

    move-object/from16 v8, p13

    move-object/from16 v9, p14

    move-object/from16 v10, p15

    move-object/from16 v11, p20

    move-object/from16 v13, p21

    move-object/from16 v14, p22

    move-object/from16 v15, p23

    move-object/from16 v16, p24

    move-object/from16 v17, p27

    .line 139
    invoke-direct/range {v0 .. v17}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/search/async/SearchAsync;Lcom/ibotta/android/search/AsyncRecentSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/util/content/ContentHelper;Lcom/ibotta/android/search/SearchReducer;Lcom/ibotta/android/search/SuggestedSearchItemsReducer;Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;)V

    const/4 v0, 0x0

    move-object/from16 v1, p0

    .line 109
    iput-boolean v0, v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->showBuyableGiftCardNav:Z

    move-object/from16 v0, p2

    .line 158
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    move-object/from16 v0, p3

    .line 159
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    move-object/from16 v0, p4

    .line 160
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    move-object/from16 v0, p8

    .line 161
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    move-object/from16 v0, p9

    .line 162
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    move-object/from16 v0, p10

    .line 163
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->offerAnomalyDetector:Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;

    move-object/from16 v0, p14

    .line 164
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    move-object/from16 v0, p15

    .line 165
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    move-object/from16 v0, p16

    .line 166
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    move-object/from16 v0, p17

    .line 167
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->imRedemptionAction:Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;

    move-object/from16 v0, p18

    .line 168
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->accountTracking:Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    move-object/from16 v0, p19

    .line 169
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    move-object/from16 v0, p25

    .line 170
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    move-object/from16 v0, p26

    .line 171
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerIconOnOfferVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    move-object/from16 v0, p27

    .line 172
    iput-object v0, v1, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->recentlyViewedRetailersService:Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;

    return-void
.end method

.method private adjustAllSubSectionForTracking(ILcom/ibotta/api/model/OfferCategoryModel;Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;",
            ">;"
        }
    .end annotation

    .line 429
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    invoke-interface {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->setupAllSubSections(ILcom/ibotta/api/model/OfferCategoryModel;Ljava/util/List;)V

    .line 430
    new-instance p1, Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    invoke-direct {p1}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;-><init>()V

    .line 431
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p3, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$7xOcmki2BnLqp96YJVftr9W7_Q0;

    invoke-direct {p3, p2}, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$7xOcmki2BnLqp96YJVftr9W7_Q0;-><init>(Lcom/ibotta/android/tracking/EventContextProvider;)V

    invoke-virtual {p1, p3}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->setEventContributor(Lcom/ibotta/android/tracking/proprietary/event/EventContributor;)V

    .line 432
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    invoke-interface {p2}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->getCustomGallerySection()Lcom/ibotta/android/view/model/GallerySection;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/ibotta/android/view/model/GallerySection;->setEventChain(Lcom/ibotta/android/tracking/proprietary/event/EventChain;)V

    .line 434
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->getCopyOfferCategoryItems()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private createAllTabData(Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;Lcom/ibotta/android/view/model/GallerySection;Ljava/util/LinkedHashMap;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            "Lcom/ibotta/android/view/model/GallerySection;",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;",
            ">;>;)V"
        }
    .end annotation

    .line 405
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    .line 406
    invoke-virtual {p2}, Lcom/ibotta/android/view/model/GallerySection;->getOfferCategoryItems()Ljava/util/List;

    move-result-object p2

    .line 405
    invoke-interface {v0, p2}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->createOffersMap(Ljava/util/List;)Ljava/util/LinkedHashMap;

    move-result-object p2

    .line 408
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 411
    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 412
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/model/OfferCategoryModel;

    .line 413
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 416
    invoke-direct {p0, v1, v3, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->adjustAllSubSectionForTracking(ILcom/ibotta/api/model/OfferCategoryModel;Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    .line 419
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    invoke-interface {v3}, Lcom/ibotta/api/model/OfferCategoryModel;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v0, v3}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->createTitleBarRow(Ljava/util/List;Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 420
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    invoke-interface {v3, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->createOffersRows(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 423
    :cond_0
    invoke-virtual {p3, p1, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private createDataMap(Ljava/util/List;Ljava/util/List;)Ljava/util/LinkedHashMap;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/GallerySection;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;)",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;",
            ">;>;"
        }
    .end annotation

    .line 369
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 371
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 372
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/view/model/GallerySection;

    .line 373
    new-instance v4, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    invoke-virtual {v3}, Lcom/ibotta/android/view/model/GallerySection;->getOfferCategoryModel()Lcom/ibotta/api/model/OfferCategoryModel;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;-><init>(Lcom/ibotta/api/model/OfferCategoryModel;)V

    .line 375
    invoke-virtual {v3}, Lcom/ibotta/android/view/model/GallerySection;->getOfferCategoryModel()Lcom/ibotta/api/model/OfferCategoryModel;

    move-result-object v5

    invoke-interface {v5}, Lcom/ibotta/api/model/OfferCategoryModel;->getId()I

    move-result v5

    sget-object v6, Lcom/ibotta/android/view/offer/category/OfferCategory;->ALL:Lcom/ibotta/android/view/offer/category/OfferCategory;

    invoke-virtual {v6}, Lcom/ibotta/android/view/offer/category/OfferCategory;->getId()I

    move-result v6

    if-ne v5, v6, :cond_0

    .line 376
    invoke-direct {p0, v4, v3, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->createAllTabData(Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;Lcom/ibotta/android/view/model/GallerySection;Ljava/util/LinkedHashMap;)V

    goto :goto_1

    .line 378
    :cond_0
    invoke-direct {p0, v4, v3, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->createStandardTabData(Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;Lcom/ibotta/android/view/model/GallerySection;Ljava/util/LinkedHashMap;)V

    :goto_1
    if-nez v2, :cond_1

    .line 382
    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-direct {p0, v3}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->createSpecialConditions(Ljava/util/List;)V

    :cond_1
    if-nez v2, :cond_2

    .line 385
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    .line 387
    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerCategoryId:Ljava/lang/Integer;

    invoke-interface {v5, p2, v6, v7}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->createBannersRow(Ljava/util/List;Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/Integer;)Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;

    move-result-object v5

    invoke-interface {v3, v1, v5}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 390
    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v5, 0x2

    if-lt v3, v5, :cond_2

    .line 391
    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/4 v5, 0x1

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;

    if-eqz v3, :cond_2

    .line 392
    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;

    invoke-virtual {v3, v5}, Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;->setUnderBannerOrCards(Z)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method private createSpecialConditions(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;",
            ">;)V"
        }
    .end annotation

    .line 449
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-eq v0, v1, :cond_0

    return-void

    .line 453
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getSpecialConditionsMessage()Ljava/lang/String;

    move-result-object v0

    .line 454
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getRetailerTerms()Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_1

    .line 456
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    if-eqz v1, :cond_1

    .line 457
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 459
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v1, p1, v0, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->createSpecialConditionsRows(Ljava/util/List;Ljava/lang/String;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/mvp/ui/view/gallery/row/SpecialConditionsRow;

    move-result-object v0

    .line 462
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method private createStandardTabData(Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;Lcom/ibotta/android/view/model/GallerySection;Ljava/util/LinkedHashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            "Lcom/ibotta/android/view/model/GallerySection;",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;",
            ">;>;)V"
        }
    .end annotation

    .line 442
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    .line 443
    invoke-virtual {p2}, Lcom/ibotta/android/view/model/GallerySection;->getOfferCategoryItems()Ljava/util/List;

    move-result-object p2

    .line 442
    invoke-interface {v0, p2}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->createOffersRows(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    .line 445
    invoke-virtual {p3, p1, p2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private getOffersFromContents()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 615
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->getContentModels()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    const-class v1, Lcom/ibotta/api/model/OfferModel;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$nYZv83cll07Tbe7gx7zUhqAUC2w;

    invoke-direct {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$nYZv83cll07Tbe7gx7zUhqAUC2w;-><init>(Ljava/lang/Class;)V

    .line 616
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    const-class v1, Lcom/ibotta/api/model/OfferModel;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$elHEw8NfYf6GuXpfd9TiSXebkqw;

    invoke-direct {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$elHEw8NfYf6GuXpfd9TiSXebkqw;-><init>(Ljava/lang/Class;)V

    .line 617
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 618
    invoke-static {}, Ljava9/util/stream/Collectors;->toList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private getSelectedCategory(Ljava/util/Set;)Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;"
        }
    .end annotation

    .line 483
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->selectedCategoryId:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 487
    :cond_0
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    .line 488
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;->getOfferCategoryModel()Lcom/ibotta/api/model/OfferCategoryModel;

    move-result-object v2

    invoke-interface {v2}, Lcom/ibotta/api/model/OfferCategoryModel;->getId()I

    move-result v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->selectedCategoryId:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v2, v3, :cond_1

    goto :goto_0

    :cond_2
    move-object v0, v1

    .line 494
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->selectedCategoryId:Ljava/lang/Integer;

    return-object v0
.end method

.method private initFavoriteRetailersManager(Lcom/ibotta/api/call/home/HomeResponse;)V
    .locals 1

    .line 360
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    .line 361
    invoke-virtual {p1}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->newInstance(Ljava/util/List;)Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    .line 362
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v0

    invoke-interface {p1, v0}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->isFavorited(I)Z

    move-result p1

    .line 363
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->setFavorited(Z)V

    return-void
.end method

.method private processActionParams(Ljava/util/LinkedHashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;",
            ">;>;)V"
        }
    .end annotation

    .line 468
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->getSelectedCategory(Ljava/util/Set;)Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 470
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->selectCategory(Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;)V

    .line 474
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->search:Ljava/lang/String;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 476
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->search:Ljava/lang/String;

    sget-object v0, Lcom/ibotta/api/model/search/SearchType;->MARKETING:Lcom/ibotta/api/model/search/SearchType;

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->search(Ljava/lang/String;Lcom/ibotta/api/model/search/SearchType;)V

    const/4 p1, 0x0

    .line 477
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->search:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method private setEventChain(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/GallerySection;",
            ">;)V"
        }
    .end annotation

    .line 500
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;-><init>()V

    .line 501
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$7xOcmki2BnLqp96YJVftr9W7_Q0;

    invoke-direct {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$7xOcmki2BnLqp96YJVftr9W7_Q0;-><init>(Lcom/ibotta/android/tracking/EventContextProvider;)V

    invoke-virtual {v0, v2}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->setEventContributor(Lcom/ibotta/android/tracking/proprietary/event/EventContributor;)V

    .line 503
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/view/model/GallerySection;

    .line 504
    invoke-virtual {v1, v0}, Lcom/ibotta/android/view/model/GallerySection;->setEventChain(Lcom/ibotta/android/tracking/proprietary/event/EventChain;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private trackOfferAnomalies(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/GallerySection;",
            ">;)V"
        }
    .end annotation

    .line 515
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 519
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->offerAnomalyDetector:Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;->start(ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public exitSearch()V
    .locals 1

    .line 553
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->hideSearch()V

    .line 554
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->exitSearch()V

    return-void
.end method

.method protected getFetchJobs()Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 199
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 201
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v1

    .line 203
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    .line 204
    new-instance v2, Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-direct {v2, v3}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 206
    :cond_0
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v2, :cond_1

    .line 207
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v4, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v5}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v5

    invoke-direct {v4, v5}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    invoke-direct {v2, v4}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 209
    :cond_1
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->offerCategoriesContainerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v2, :cond_2

    .line 210
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v2}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createOfferCategoriesContainerCall()Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;

    move-result-object v2

    .line 211
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->setRetailerId(Ljava/lang/Integer;)V

    const v1, 0x7fffffff

    .line 212
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->setLimit(Ljava/lang/Integer;)V

    .line 213
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->setProducts(Ljava/lang/Boolean;)V

    .line 214
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerIconOnOfferVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    invoke-interface {v1}, Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;->shouldShowRetailerStackView()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->setIncludeAvailableRetailers(Ljava/lang/Boolean;)V

    .line 216
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->offerCategoriesContainerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 219
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 220
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 221
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->offerCategoriesContainerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected getHomeResponse()Lcom/ibotta/api/call/home/HomeResponse;
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected getRequestedSearchContent()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/search/async/SearchAsync$SearchContent;",
            ">;"
        }
    .end annotation

    .line 183
    sget-object v0, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;->OFFERS:Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    sget-object v1, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;->PRODUCTS:Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    invoke-static {v0, v1}, Ljava9/util/Sets;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    .line 228
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->onAbandonFetchJobs()V

    const/4 v0, 0x0

    .line 229
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 230
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 231
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->offerCategoriesContainerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onCreateOptionsMenu()V
    .locals 2

    .line 600
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->isLoading()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->showMenuFavorited(Z)V

    return-void
.end method

.method public onDetach()V
    .locals 1

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->offerAnomalyDetector:Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;->stop()V

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->recentlyViewedRetailersService:Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;

    invoke-interface {v0}, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;->cancel()V

    .line 179
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->onDetach()V

    return-void
.end method

.method public onFavoriteClicked()V
    .locals 2

    .line 569
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    if-nez v0, :cond_0

    return-void

    .line 573
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->favorite(I)V

    .line 574
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->setFavorited(Z)V

    return-void
.end method

.method public onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V
    .locals 1

    .line 559
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    invoke-interface {p1}, Lcom/ibotta/api/model/base/Routable;->getLink()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->launchRoute(Ljava/lang/String;)V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 7

    .line 243
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->loadStartTime:J

    sub-long/2addr v0, v2

    .line 244
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v3}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v3

    invoke-interface {v2, v0, v1, v3}, Lcom/ibotta/android/tracking/timing/AppTimingTracker;->trackTimeToLoadGallery(JI)V

    .line 246
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 247
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    .line 249
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->offerCategoriesContainerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 250
    invoke-virtual {v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;

    .line 252
    invoke-virtual {v1}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    .line 253
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->initFavoriteRetailersManager(Lcom/ibotta/api/call/home/HomeResponse;)V

    .line 255
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 256
    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v0

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v3}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v3

    .line 255
    invoke-interface {v1, v0, v3}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    .line 257
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V

    .line 259
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    if-nez v0, :cond_0

    .line 260
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->showRetailerNotFound()V

    return-void

    .line 263
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->getRetailerParcelFromRetailerModel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 266
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    invoke-interface {v0, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->setModels(Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;)V

    .line 267
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->getContentModels()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    invoke-interface {v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->getBuyableGiftCardModels()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/features/variant/pwi/PwiVariant;->addBuyableGiftCards(Ljava/util/List;Ljava/util/List;)V

    .line 269
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->getGallerySections()Ljava/util/List;

    move-result-object v0

    .line 270
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->setEventChain(Ljava/util/List;)V

    .line 272
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    .line 274
    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->getGalleryParcelFeatures()Ljava/util/List;

    move-result-object v1

    .line 272
    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->createDataMap(Ljava/util/List;Ljava/util/List;)Ljava/util/LinkedHashMap;

    move-result-object v1

    .line 276
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    invoke-interface {v3}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->getContentModels()Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/ibotta/android/features/variant/pwi/PwiVariant;->shouldShowBuyableGiftCardNavButton(Ljava/util/List;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->showBuyableGiftCardNav:Z

    .line 278
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    invoke-interface {v3}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->getContentModels()Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v4}, Lcom/ibotta/android/state/app/config/AppConfig;->getGcsEnabled()Z

    move-result v4

    invoke-interface {v2, v3, v4}, Lcom/ibotta/android/features/variant/pwi/PwiVariant;->showFeatureDisabled(Ljava/util/List;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    .line 283
    iput-boolean v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->showBuyableGiftCardNav:Z

    .line 285
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    invoke-interface {v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->clearBuyableGiftCardModels()V

    .line 287
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    invoke-interface {v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->showGcsFeatureDisabled()V

    .line 289
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    .line 292
    :cond_1
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    .line 293
    invoke-interface {v5}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->getBuyableGiftCardModels()Ljava/util/List;

    move-result-object v5

    iget-boolean v6, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->showBuyableGiftCardNav:Z

    .line 292
    invoke-interface {v2, v3, v4, v5, v6}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/customer/Customer;Ljava/util/List;Z)V

    .line 294
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    invoke-interface {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->setDataMap(Ljava/util/LinkedHashMap;)V

    .line 296
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->processActionParams(Ljava/util/LinkedHashMap;)V

    .line 297
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->trackOfferAnomalies(Ljava/util/List;)V

    .line 299
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->recentlyViewedRetailersService:Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;->markRetailerAsViewed(I)V

    .line 301
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->onFetchFinishedSuccessfully()V

    return-void
.end method

.method protected onFetchStarted()V
    .locals 2

    .line 236
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->onFetchStarted()V

    .line 237
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->loadStartTime:J

    return-void
.end method

.method public onHeaderBuyIgcClicked()V
    .locals 3

    .line 340
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->showPwiFlow(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/android/apiandroid/content/ContentId;)V

    return-void
.end method

.method public onHeaderImCardClicked()V
    .locals 4

    .line 352
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    if-nez v0, :cond_0

    return-void

    .line 356
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->imRedemptionAction:Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->getOffersFromContents()Ljava/util/List;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;->onImRetailerTapped(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/customer/Customer;Ljava/util/List;)V

    return-void
.end method

.method public onHeaderLoyaltyCardClicked()V
    .locals 3

    .line 345
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/common/VerificationType;->isLoyalty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 346
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->getOffersFromContents()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->showRedeem(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public onHeaderRedeemClicked()V
    .locals 3

    .line 327
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 331
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/common/VerificationType;->isLoyalty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 332
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->getOffersFromContents()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->showRedeemLoyaltyReceipt(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)V

    goto :goto_0

    .line 334
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->getOffersFromContents()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->showRedeem(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public onNavAccountClicked()V
    .locals 1

    .line 321
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->accountTracking:Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;->trackAccountNavClick()V

    .line 322
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->onNavAccountClicked()V

    return-void
.end method

.method public onNavRedeemClicked()V
    .locals 4

    .line 306
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->isLoading()Z

    move-result v0

    if-nez v0, :cond_2

    .line 307
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->shouldShowImRedeem(Lcom/ibotta/api/model/customer/Customer;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 308
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->imRedemptionAction:Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->galleryHelper:Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->getOffersFromContents()Ljava/util/List;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;->onImRetailerTapped(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/customer/Customer;Ljava/util/List;)V

    goto :goto_0

    .line 309
    :cond_0
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->showBuyableGiftCardNav:Z

    if-eqz v0, :cond_1

    .line 310
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->showPwiFlow(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/android/apiandroid/content/ContentId;)V

    goto :goto_0

    .line 312
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->getOffersFromContents()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->showRedeem(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)V

    goto :goto_0

    .line 315
    :cond_2
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->onNavRedeemClicked()V

    :goto_0
    return-void
.end method

.method public onSearchClicked()V
    .locals 1

    .line 546
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->networkConnectionErrorViewShowing:Z

    if-nez v0, :cond_0

    .line 547
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->showSearch()V

    :cond_0
    return-void
.end method

.method public onSearchFeatureClicked(Ljava/lang/String;)V
    .locals 1

    .line 564
    sget-object v0, Lcom/ibotta/api/model/search/SearchType;->MARKETING:Lcom/ibotta/api/model/search/SearchType;

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->search(Ljava/lang/String;Lcom/ibotta/api/model/search/SearchType;)V

    return-void
.end method

.method public onSpecialConditionsLearnMoreClicked(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1

    .line 589
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->showSpecialConditionsLearnMore(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method public onUnfavoriteClicked()V
    .locals 2

    .line 579
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    if-nez v0, :cond_0

    return-void

    .line 583
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->unfavorite(I)V

    .line 584
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->setFavorited(Z)V

    return-void
.end method

.method public provideSearchCategory()Lcom/ibotta/android/search/recent/Category;
    .locals 1

    .line 594
    sget-object v0, Lcom/ibotta/android/search/recent/Category;->RETAILER:Lcom/ibotta/android/search/recent/Category;

    return-object v0
.end method

.method public search(Ljava/lang/String;Lcom/ibotta/api/model/search/SearchType;)V
    .locals 1

    .line 540
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->showSearch()V

    .line 541
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter;->search(Ljava/lang/String;Lcom/ibotta/api/model/search/SearchType;)V

    return-void
.end method

.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    .line 524
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 525
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->setRetailerId(Ljava/lang/Integer;)V

    return-void
.end method

.method public setSearch(Ljava/lang/String;)V
    .locals 0

    .line 535
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->search:Ljava/lang/String;

    return-void
.end method

.method public setSelectedCategoryId(Ljava/lang/Integer;)V
    .locals 0

    .line 530
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->selectedCategoryId:Ljava/lang/Integer;

    return-void
.end method

.method public trackRetailerView()V
    .locals 2

    .line 606
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;-><init>()V

    .line 607
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->eventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/EventContextProvider;->provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    const/4 v1, 0x1

    .line 609
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setCounter(I)V

    .line 610
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method
