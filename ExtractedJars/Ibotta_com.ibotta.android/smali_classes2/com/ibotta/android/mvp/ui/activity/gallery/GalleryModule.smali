.class public Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "GalleryModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;",
        ">;"
    }
.end annotation


# instance fields
.field private final galleryView:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    .line 54
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;->galleryView:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    return-void
.end method

.method public static synthetic lambda$provideGalleryDetailEventContextProvider$0(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 0

    .line 145
    invoke-interface {p1, p2}, Lcom/ibotta/android/tracking/EventContextProvider;->provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 146
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;->galleryView:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->getRetailerId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setRetailerId(Ljava/lang/Integer;)V

    .line 147
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;->galleryView:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryView;->getRetailerCategoryId()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setRetailerCategoryId(Ljava/lang/Integer;)V

    return-void
.end method

.method public static provideGalleryPresenterHelper(Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;Lcom/ibotta/android/title/TitleBarReducer;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 125
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;-><init>(Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;Lcom/ibotta/android/title/TitleBarReducer;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V

    return-object v0
.end method


# virtual methods
.method provideGalleryDetailEventContextProvider(Lcom/ibotta/android/tracking/EventContextProvider;)Lcom/ibotta/android/tracking/EventContextProvider;
    .locals 1
    .param p1    # Lcom/ibotta/android/tracking/EventContextProvider;
        .annotation runtime Ljavax/inject/Named;
            value = "GalleryEventContextProvider"
        .end annotation
    .end param
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "GalleryDetailEventContextProvider"
    .end annotation

    .line 144
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$GalleryModule$0oeFgGXg8aA_Hkdk6SNwgOKnATE;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$GalleryModule$0oeFgGXg8aA_Hkdk6SNwgOKnATE;-><init>(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryModule;Lcom/ibotta/android/tracking/EventContextProvider;)V

    return-object v0
.end method

.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/search/async/SearchAsync;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;Lcom/ibotta/android/search/AsyncRecentSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/util/content/ContentHelper;Lcom/ibotta/android/search/SearchReducer;Lcom/ibotta/android/search/SuggestedSearchItemsReducer;Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;)Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenter;
    .locals 29
    .param p12    # Lcom/ibotta/android/search/AsyncSuggestedSearchService;
        .annotation runtime Ljavax/inject/Named;
            value = "AsyncUnifiedService"
        .end annotation
    .end param
    .param p15    # Lcom/ibotta/android/tracking/EventContextProvider;
        .annotation runtime Ljavax/inject/Named;
            value = "GalleryDetailEventContextProvider"
        .end annotation
    .end param
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v7, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    move-object/from16 v22, p22

    move-object/from16 v23, p23

    move-object/from16 v24, p24

    move-object/from16 v25, p25

    move-object/from16 v26, p26

    move-object/from16 v27, p27

    .line 87
    new-instance v28, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;

    move-object/from16 v0, v28

    invoke-direct/range {v0 .. v27}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/search/async/SearchAsync;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;Lcom/ibotta/android/search/AsyncRecentSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/mappers/ContentMapper;Lcom/ibotta/android/util/content/ContentHelper;Lcom/ibotta/android/search/SearchReducer;Lcom/ibotta/android/search/SuggestedSearchItemsReducer;Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;)V

    return-object v28
.end method

.method public provideOfferAnomalyDetector()Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 138
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector;-><init>()V

    return-object v0
.end method

.method public provideScrollingBottomSpace()Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;
    .locals 2
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 130
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;-><init>()V

    const/4 v1, 0x1

    .line 131
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;->bottomNavDisappears(Z)Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;

    move-result-object v0

    .line 132
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;->isGalleryPage(Z)Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;

    move-result-object v0

    .line 133
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace$Builder;->build()Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;

    move-result-object v0

    return-object v0
.end method

.method public providesAccountTracking(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;
    .locals 1
    .param p2    # Lcom/ibotta/android/tracking/EventContextProvider;
        .annotation runtime Ljavax/inject/Named;
            value = "GalleryDetailEventContextProvider"
        .end annotation
    .end param
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 156
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V

    return-object v0
.end method
