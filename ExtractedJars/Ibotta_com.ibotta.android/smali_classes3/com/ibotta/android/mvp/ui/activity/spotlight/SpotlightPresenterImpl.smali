.class public Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "SpotlightPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/OfferShareAdviceFields;
.implements Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;",
        ">;",
        "Lcom/ibotta/android/aop/tracking/advice/OfferShareAdviceFields;",
        "Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenter;"
    }
.end annotation


# static fields
.field private static final PRODUCT_IMAGE_FILENAME:Ljava/lang/String; = "product_image.jpg"

.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private alsoBoughtViewedJob:Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;

.field private final alsoBoughtViewedVariant:Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;

.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private final barcodeScanHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;

.field private bonusesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

.field private final brazeTrackingDataFactory:Lcom/ibotta/android/braze/BrazeTrackingDataFactory;

.field private final contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

.field private final contentListReducerUtil:Lcom/ibotta/android/content/ContentListReducerUtil;

.field private customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

.field private final ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

.field private final ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private offersLoaded:Z

.field private final recentlyViewedOfferHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;

.field private final retailerIconOnOfferVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

.field private final scanRules:Lcom/ibotta/api/rules/ScanRules;

.field private final spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

.field private final spotlightReducer:Lcom/ibotta/android/content/spotlight/SpotlightReducer;

.field private final storageSilo:Lcom/ibotta/android/commons/disk/StorageSilo;

.field private final trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

.field private final userState:Lcom/ibotta/android/state/user/UserState;

.field private final verificationManager:Lcom/ibotta/android/verification/VerificationManager;

.field private viewedOfferJob:Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/rules/ScanRules;Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/commons/disk/StorageSilo;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/braze/BrazeTrackingDataFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;Lcom/ibotta/android/content/card/ContentCardReducer;Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/content/spotlight/SpotlightReducer;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)V
    .locals 2

    move-object v0, p0

    .line 127
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    move-object v1, p2

    .line 128
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->scanRules:Lcom/ibotta/api/rules/ScanRules;

    move-object v1, p3

    .line 129
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    move-object v1, p4

    .line 130
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->barcodeScanHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;

    move-object v1, p5

    .line 131
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    move-object v1, p6

    .line 132
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    move-object v1, p7

    .line 133
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    move-object v1, p8

    .line 134
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->storageSilo:Lcom/ibotta/android/commons/disk/StorageSilo;

    move-object v1, p9

    .line 135
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    move-object v1, p10

    .line 136
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    move-object v1, p11

    .line 137
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->brazeTrackingDataFactory:Lcom/ibotta/android/braze/BrazeTrackingDataFactory;

    move-object v1, p12

    .line 138
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    move-object v1, p13

    .line 139
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->alsoBoughtViewedVariant:Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;

    move-object/from16 v1, p14

    .line 140
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    move-object/from16 v1, p15

    .line 141
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->contentListReducerUtil:Lcom/ibotta/android/content/ContentListReducerUtil;

    move-object/from16 v1, p16

    .line 142
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    move-object/from16 v1, p17

    .line 143
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    move-object/from16 v1, p18

    .line 144
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->recentlyViewedOfferHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;

    move-object/from16 v1, p19

    .line 145
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    move-object/from16 v1, p20

    .line 146
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightReducer:Lcom/ibotta/android/content/spotlight/SpotlightReducer;

    move-object/from16 v1, p21

    .line 147
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->retailerIconOnOfferVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "SpotlightPresenterImpl.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "4"

    const-string v2, "onFetchFinishedWithFailures"

    const-string v3, "com.ibotta.android.mvp.ui.activity.spotlight.SpotlightPresenterImpl"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x149

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "1"

    const-string v2, "onShareClicked"

    const-string v3, "com.ibotta.android.mvp.ui.activity.spotlight.SpotlightPresenterImpl"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x169

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private createDefaultEventChain()Lcom/ibotta/android/tracking/proprietary/event/EventChain;
    .locals 2

    .line 646
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;-><init>()V

    .line 647
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->getEventContributor()Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->setEventContributor(Lcom/ibotta/android/tracking/proprietary/event/EventContributor;)V

    return-object v0
.end method

.method private initAlsoBoughtViewed()V
    .locals 4

    .line 287
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->alsoBoughtViewedJob:Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->isAlsoBoughtViewedJobValid(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 288
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->alsoBoughtViewedJob:Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getAlsoBoughtOffers(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;)Ljava/util/LinkedHashMap;

    move-result-object v0

    .line 289
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 290
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightReducer:Lcom/ibotta/android/content/spotlight/SpotlightReducer;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->alsoBoughtViewedVariant:Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;

    .line 291
    invoke-interface {v3}, Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;->getType()Lcom/ibotta/android/content/spotlight/VariantType;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/content/spotlight/SpotlightReducer;->createTitle(Lcom/ibotta/android/content/spotlight/VariantType;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v2

    .line 290
    invoke-interface {v1, v2, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->setupAlsoBoughtViewedOffers(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/util/LinkedHashMap;)V

    :cond_0
    return-void
.end method

.method private initAvailableAt(Lcom/ibotta/api/call/home/HomeResponse;)V
    .locals 7

    .line 263
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getAvailableAtRetailerList(Lcom/ibotta/api/call/home/HomeResponse;)Ljava/util/List;

    move-result-object p1

    .line 264
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    if-nez v0, :cond_0

    .line 265
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 v0, 0x0

    .line 266
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lcom/ibotta/api/model/RetailerModel;

    .line 267
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    move-object v3, p1

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v3, p1

    move-object v2, v0

    :goto_0
    if-eqz v2, :cond_1

    .line 272
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightReducer:Lcom/ibotta/android/content/spotlight/SpotlightReducer;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    .line 273
    invoke-interface {v2}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->getAvailableAtTitle(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2}, Lcom/ibotta/api/model/RetailerModel;->getModelCImageUrl()Ljava/lang/String;

    move-result-object v1

    .line 272
    invoke-virtual {p1, v0, v1}, Lcom/ibotta/android/content/spotlight/SpotlightReducer;->createTitle(Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    move-object v4, p1

    goto :goto_1

    .line 275
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightReducer:Lcom/ibotta/android/content/spotlight/SpotlightReducer;

    invoke-virtual {p1}, Lcom/ibotta/android/content/spotlight/SpotlightReducer;->getAvailableAtWithoutStoreTitle()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    move-object v4, p1

    .line 278
    :goto_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    .line 282
    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object p1

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->isHideAvailableAt()Z

    move-result v5

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    .line 283
    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->isHideCantFindItem()Z

    move-result v6

    .line 278
    invoke-interface/range {v1 .. v6}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->setAvailableAtRetailers(Lcom/ibotta/api/model/RetailerModel;Ljava/util/List;Lcom/ibotta/android/views/base/title/TitleBarViewState;ZZ)V

    return-void
.end method

.method private initRebateReward()V
    .locals 2

    .line 314
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->isRebateRewarded()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 318
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getCustomRebateRewardMessage()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 319
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getCustomRebateRewardMessage()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showRebateRewarded(Ljava/lang/String;)V

    goto :goto_0

    .line 320
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->isNewRebateRewarded()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 321
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showNewRebateRewarded()V

    goto :goto_0

    .line 323
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showRebateRewarded()V

    :goto_0
    return-void
.end method

.method private initRecentlyViewed()V
    .locals 8

    .line 297
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->recentlyViewedOfferHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->viewedOfferJob:Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->contentListReducerUtil:Lcom/ibotta/android/content/ContentListReducerUtil;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    .line 300
    invoke-interface {v3}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v3

    invoke-interface {v3}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v3

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    .line 301
    invoke-interface {v4}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v4

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v5, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    .line 302
    invoke-interface {v5}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    move-result-object v5

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v7, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    .line 304
    invoke-interface {v7}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->getRecentlyViewedTitle()Ljava/lang/String;

    move-result-object v7

    .line 297
    invoke-interface/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;->getRecentlyViewedOffers(Lcom/ibotta/android/service/api/job/SingleApiJob;Lcom/ibotta/android/content/ContentListReducerUtil;ILcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 306
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 307
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    new-instance v3, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    invoke-direct {v3}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;-><init>()V

    .line 308
    invoke-virtual {v3, v0}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->rows(Ljava/util/List;)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    move-result-object v0

    sget-object v3, Lcom/ibotta/android/ilv/ListType;->OFFER_SIDE_SCROLLER:Lcom/ibotta/android/ilv/ListType;

    .line 307
    invoke-virtual {v2, v0, v3}, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;->buildWithStyle(Lcom/ibotta/android/views/list/IbottaListViewState$Builder;Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showRecentlyViewedContent(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    :cond_0
    return-void
.end method

.method private initRelatedBonuses()V
    .locals 4

    .line 251
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->bonusesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;

    .line 252
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    .line 253
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;->getAllBonuses()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getRelatedBonuses(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 255
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->shouldTrackOfferBonuses(Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 256
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->brazeTrackingDataFactory:Lcom/ibotta/android/braze/BrazeTrackingDataFactory;

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v2, v3}, Lcom/ibotta/android/braze/BrazeTrackingDataFactory;->createBonusTrackingData(Lcom/ibotta/api/model/BonusModel;)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackMcommOfferBonus(Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;)V

    .line 259
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->setRelatedBonuses(Ljava/util/List;)V

    return-void
.end method

.method private initViewState()V
    .locals 8

    .line 223
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 224
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    invoke-virtual {v1}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v1

    .line 226
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v2, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->initDefaultRetailer(Lcom/ibotta/api/call/home/HomeResponse;)V

    .line 227
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v3}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getRetailerId()Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->setRetailerId(Ljava/lang/Integer;)V

    .line 228
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    new-instance v4, Lcom/ibotta/android/content/OfferDisplayContent;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    .line 229
    invoke-interface {v5}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v5

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    .line 230
    invoke-interface {v6}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v6

    sget-object v7, Lcom/ibotta/android/views/content/ContentStyle;->SPOTLIGHT:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-direct {v4, v5, v6, v1, v7}, Lcom/ibotta/android/content/OfferDisplayContent;-><init>(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/customer/Customer;Lcom/ibotta/android/views/content/ContentStyle;)V

    .line 228
    invoke-virtual {v3, v4}, Lcom/ibotta/android/content/card/ContentCardReducer;->create(Lcom/ibotta/android/content/DisplayContent;)Lcom/ibotta/android/content/card/ContentCardViewState;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->setupContentCard(Lcom/ibotta/android/content/card/ContentCardViewState;)V

    .line 233
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->setup(Lcom/ibotta/api/model/OfferModel;)V

    .line 234
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->scanRules:Lcom/ibotta/api/rules/ScanRules;

    invoke-interface {v2, v3}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getCheckProduct(Lcom/ibotta/api/rules/ScanRules;)Z

    move-result v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->setCheckProductAllowed(Z)V

    .line 235
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->shouldShowLocateStore()Z

    move-result v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->setupLocateStore(Z)V

    .line 237
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->offerHasAboutTitle()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 238
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    .line 239
    invoke-interface {v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightReducer:Lcom/ibotta/android/content/spotlight/SpotlightReducer;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    .line 240
    invoke-interface {v4}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v4

    invoke-interface {v4}, Lcom/ibotta/api/model/OfferModel;->getAboutTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/ibotta/android/content/spotlight/SpotlightReducer;->createTitle(Ljava/lang/String;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v3

    .line 238
    invoke-interface {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showAbout(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 243
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->initRelatedBonuses()V

    .line 244
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->initAvailableAt(Lcom/ibotta/api/call/home/HomeResponse;)V

    .line 245
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->initAlsoBoughtViewed()V

    .line 246
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->initRecentlyViewed()V

    .line 247
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->initRebateReward()V

    return-void
.end method

.method private trackBonusClick(I)V
    .locals 3

    .line 631
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->createDefaultEventChain()Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    move-result-object v0

    .line 633
    new-instance v1, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;

    invoke-direct {v1}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;-><init>()V

    .line 634
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 636
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;->setBonusId(Ljava/lang/Integer;)V

    const/4 p1, 0x1

    .line 637
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;->setClicked(Ljava/lang/Boolean;)V

    .line 638
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->BONUS:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    .line 639
    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;->setCounter(I)V

    const-string v0, "Tracking Bonus Click: %1$s"

    .line 641
    new-array p1, p1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v1, p1, v2

    invoke-static {v0, p1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 642
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p1, v1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackOfferShop(I)V
    .locals 2

    .line 614
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v0

    if-eq p1, v0, :cond_0

    return-void

    .line 618
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->createDefaultEventChain()Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    move-result-object p1

    .line 621
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;-><init>()V

    .line 622
    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 624
    sget-object p1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->SHOP:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const/4 p1, 0x1

    .line 625
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setClicked(Ljava/lang/Boolean;)V

    .line 626
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setCounter(I)V

    .line 627
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p1, v0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackOfferUnlock(I)V
    .locals 2

    .line 597
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v0

    if-eq p1, v0, :cond_0

    return-void

    .line 601
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->createDefaultEventChain()Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    move-result-object p1

    .line 604
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;-><init>()V

    .line 605
    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 607
    sget-object p1, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->UNLOCK:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const/4 p1, 0x1

    .line 608
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setClicked(Ljava/lang/Boolean;)V

    .line 609
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setCounter(I)V

    .line 610
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p1, v0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackOfferView()V
    .locals 2

    .line 586
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->createDefaultEventChain()Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    move-result-object v0

    .line 589
    new-instance v1, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    invoke-direct {v1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;-><init>()V

    .line 590
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    const/4 v0, 0x1

    .line 592
    invoke-virtual {v1, v0}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setCounter(I)V

    .line 593
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 152
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 154
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 155
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 156
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/service/api/job/HomeApiJob;->setName(Ljava/lang/String;)V

    .line 158
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 159
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v3, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v4}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v4

    invoke-direct {v3, v4}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    invoke-direct {v1, v3, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 161
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->bonusesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_2

    .line 162
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v2}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createBonusesCall()Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->bonusesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 165
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_3

    .line 166
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createOffersCall()Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;

    move-result-object v1

    .line 167
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferIdIntegers()[Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->setOfferIds([Ljava/lang/Integer;)V

    const/4 v2, 0x1

    .line 168
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->setLimit(Ljava/lang/Integer;)V

    .line 169
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->retailerIconOnOfferVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    invoke-interface {v2}, Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;->shouldShowRetailerStackView()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->setIncludeAvailableRetailers(Ljava/lang/Boolean;)V

    .line 171
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 174
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->alsoBoughtViewedJob:Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;

    if-nez v1, :cond_4

    .line 175
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->alsoBoughtViewedVariant:Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;

    invoke-interface {v1}, Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;->createOptionalWaitingApiJob()Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->alsoBoughtViewedJob:Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;

    .line 178
    :cond_4
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->viewedOfferJob:Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;

    if-nez v1, :cond_5

    .line 180
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->recentlyViewedOfferHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->retailerIconOnOfferVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    .line 181
    invoke-interface {v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;->createViewedOfferJob(Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->viewedOfferJob:Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;

    .line 184
    :cond_5
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 185
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 186
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->bonusesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 187
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 189
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->alsoBoughtViewedJob:Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;

    if-eqz v1, :cond_6

    .line 190
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 193
    :cond_6
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->viewedOfferJob:Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;

    if-eqz v1, :cond_7

    .line 194
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_7
    return-object v0
.end method

.method public getOfferId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 494
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getOfferSegmentId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 489
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getOfferSegmentId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 202
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 203
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 204
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->bonusesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 205
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 206
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->alsoBoughtViewedJob:Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;

    .line 207
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->viewedOfferJob:Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;

    return-void
.end method

.method public onAvailableAtCantFindThisItem()V
    .locals 2

    .line 410
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showCantFindItem(Lcom/ibotta/api/model/OfferModel;)V

    return-void
.end method

.method public onAvailableAtCantFindThisItem(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 415
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v1

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showCantFindItem(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;)V

    return-void
.end method

.method public onBonusClicked(Lcom/ibotta/api/model/BonusModel;)V
    .locals 1

    .line 404
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getId()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->trackBonusClick(I)V

    .line 405
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showBonus(Lcom/ibotta/api/model/BonusModel;)V

    return-void
.end method

.method public onCantFindItSuccess()V
    .locals 2

    .line 425
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightReducer:Lcom/ibotta/android/content/spotlight/SpotlightReducer;

    invoke-virtual {v1}, Lcom/ibotta/android/content/spotlight/SpotlightReducer;->getCantFindItSuccessTitle()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showCantFindItSuccessMessage(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method

.method public onCaptureProductImageNotPossible()V
    .locals 1

    .line 460
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showCaptureProductImageNotPossible()V

    return-void
.end method

.method public onCheckProductClicked()V
    .locals 2

    .line 379
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showProductBarcodeScanner(Lcom/ibotta/api/model/OfferModel;)V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 1

    .line 212
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v0

    if-nez v0, :cond_0

    .line 213
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showOfferNotFound()V

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 217
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->offersLoaded:Z

    .line 218
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->trackOfferView()V

    .line 219
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->initViewState()V

    return-void
.end method

.method protected onFetchFinishedWithFailures()V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingBefore;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->OFFER_DEAD_END:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 329
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onFetchFinishedWithFailures()V

    return-void
.end method

.method protected onFetchJobFailed(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 1

    .line 556
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onFetchJobFailed(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 558
    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;

    if-eqz p1, :cond_0

    .line 562
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->alsoBoughtViewedVariant:Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->alsoBoughtViewedJob:Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;

    invoke-interface {p1, v0}, Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;->cancelOptionalWaitingApiJob(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;)V

    .line 563
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->recentlyViewedOfferHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->viewedOfferJob:Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;->cancelOptionalWaitingApiJob(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;)V

    :cond_0
    return-void
.end method

.method protected onFetchJobSuccess(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 4

    .line 531
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onFetchJobSuccess(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 533
    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;

    .line 534
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v1

    instance-of v1, v1, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;

    .line 535
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccess()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v0, :cond_1

    if-eqz v2, :cond_1

    .line 539
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    .line 540
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->setOfferFromResponse(Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;)V

    .line 542
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->alsoBoughtViewedVariant:Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->alsoBoughtViewedJob:Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    .line 543
    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getRetailerId()Ljava/lang/Integer;

    move-result-object v2

    .line 542
    invoke-interface {p1, v0, v1, v2}, Lcom/ibotta/android/features/variant/alsoboughtviewed/AlsoBoughtViewedVariant;->onSpotlightOfferLoaded(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;)V

    .line 544
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->recentlyViewedOfferHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->viewedOfferJob:Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelper;->onSpotlightOfferLoaded(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;Lcom/ibotta/api/model/OfferModel;)V

    goto :goto_1

    :cond_1
    if-eqz v1, :cond_2

    .line 546
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->barcodeScanHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;

    .line 550
    invoke-interface {v3}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;->getPaddedBarcode()Ljava/lang/String;

    move-result-object v3

    .line 546
    invoke-interface {v0, p1, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->handleProductOffersResponse(Lcom/ibotta/android/service/api/job/SingleApiJob;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/appcache/AppCache;Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public onFixRebate()V
    .locals 1

    .line 442
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showFixRebateNotice()V

    return-void
.end method

.method public onFixRebateNoticeConfirmed()V
    .locals 3

    .line 447
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->storageSilo:Lcom/ibotta/android/commons/disk/StorageSilo;

    if-nez v0, :cond_0

    .line 448
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showNoPlaceToSaveImageError()V

    return-void

    .line 452
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->barcodeScanHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;

    const-string v2, "product_image.jpg"

    .line 453
    invoke-virtual {v0, v2}, Lcom/ibotta/android/commons/disk/StorageSilo;->file(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 452
    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;->setFailedVerificationProductImagePath(Ljava/lang/String;)V

    .line 455
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->barcodeScanHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;->getFailedVerificationProductImagePath()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->captureProductImage(Ljava/lang/String;)V

    return-void
.end method

.method public onLocateStoreMapClicked(Ljava/lang/Integer;)V
    .locals 1

    .line 420
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showRetailerLocationsMap(Ljava/lang/Integer;)V

    return-void
.end method

.method public onOfferNotFoundDisplayed()V
    .locals 1

    .line 484
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->finish()V

    return-void
.end method

.method public onProductImageCaptureFailed()V
    .locals 1

    .line 465
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showProductImageCaptureFailed()V

    return-void
.end method

.method public onProductImageCaptureSuccess(Ljava/lang/String;)V
    .locals 2

    .line 471
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->barcodeScanHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 472
    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v1

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v1

    .line 471
    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;->getCustomerOffersUpcsPostCall(II)Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;

    move-result-object p1

    .line 474
    new-instance v0, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v0, p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method public onProductVerificationFailed()V
    .locals 1

    .line 389
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showProductVerificationFailed()V

    return-void
.end method

.method public onProductVerificationGaveUp(Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 398
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->barcodeScanHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;->setFailedVerificationBarcode(Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;)V

    .line 399
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v1

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v1

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showProductNotMatched(ILcom/ibotta/android/apiandroid/barcode/BarcodeParcel;)V

    return-void
.end method

.method public onProductVerified()V
    .locals 1

    .line 384
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showProductVerifiedSuccessfully()V

    return-void
.end method

.method public onRebateImageCardClicked()V
    .locals 2

    .line 430
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 437
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showFullScreenImage(Ljava/lang/String;)V

    return-void
.end method

.method public onRetryAddProduct()V
    .locals 1

    .line 479
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->barcodeScanHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;->getFailedVerificationProductImagePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->onProductImageCaptureSuccess(Ljava/lang/String;)V

    return-void
.end method

.method public onShareClicked()V
    .locals 4
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingBefore;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->OFFER_SHARE:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 361
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->offersLoaded:Z

    if-nez v0, :cond_0

    return-void

    .line 365
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    .line 366
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v0

    .line 368
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getRetailerId()Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v3}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v3

    invoke-interface {v1, v0, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->shareRebate(Lcom/ibotta/api/model/customer/Customer;Ljava/lang/Integer;Lcom/ibotta/api/model/OfferModel;)V

    return-void
.end method

.method public onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 654
    invoke-interface {p1}, Lcom/ibotta/api/model/ContentModel;->getId()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->trackOfferShop(I)V

    .line 655
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method protected onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 516
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 518
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;

    if-eqz v0, :cond_1

    .line 519
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    .line 520
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getException()Lcom/ibotta/api/ApiException;

    move-result-object p1

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ibotta/api/ApiResponse;->getResponseCode()I

    move-result p1

    const/16 v0, 0x199

    if-ne p1, v0, :cond_0

    .line 522
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showAddProductUpcRejected()V

    goto :goto_0

    .line 524
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showAddProductUpcFail()V

    :cond_1
    :goto_0
    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 499
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 501
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;

    if-eqz v0, :cond_1

    .line 502
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/ApiResponse;->getResponseCode()I

    move-result p1

    const/16 v0, 0xc9

    if-ne p1, v0, :cond_0

    .line 506
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showAddProductUpcPending()V

    goto :goto_0

    .line 509
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showAddProductUpcApproved()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 580
    invoke-interface {p1}, Lcom/ibotta/api/model/ContentModel;->getId()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->trackOfferUnlock(I)V

    .line 582
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onUnlockClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public onUnlockCompleted()V
    .locals 1

    .line 373
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->reload()V

    .line 374
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightView;->showUnlockAnimation()V

    return-void
.end method

.method public onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 573
    invoke-interface {p1}, Lcom/ibotta/api/model/ContentModel;->getId()I

    move-result v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v1

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 574
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onUnlockedClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    :cond_0
    return-void
.end method

.method public setFailedVerificationBarcode(Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;)V
    .locals 1

    .line 356
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->barcodeScanHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;->setFailedVerificationBarcode(Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;)V

    return-void
.end method

.method public setFailedVerificationProductImagePath(Ljava/lang/String;)V
    .locals 1

    .line 351
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->barcodeScanHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/BarcodeScanHelper;->setFailedVerificationProductImagePath(Ljava/lang/String;)V

    return-void
.end method

.method public setOfferIds([I)V
    .locals 1

    .line 334
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->setOfferIds([I)V

    return-void
.end method

.method public setRebateRewarded(ZZLjava/lang/String;)V
    .locals 1

    .line 344
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->setRebateRewarded(Z)V

    .line 345
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->setNewRebateRewarded(Z)V

    .line 346
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {p1, p3}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->setCustomRebateRewardMessage(Ljava/lang/String;)V

    return-void
.end method

.method public setRetailerId(Ljava/lang/Integer;)V
    .locals 1
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 339
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightPresenterImpl;->spotlightHelper:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;->setRetailerId(Ljava/lang/Integer;)V

    return-void
.end method
