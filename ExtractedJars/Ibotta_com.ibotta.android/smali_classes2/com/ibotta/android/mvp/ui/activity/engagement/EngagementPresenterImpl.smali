.class public Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "EngagementPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/EngagementAdviceFields;
.implements Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;",
        ">;",
        "Lcom/ibotta/android/aop/tracking/advice/EngagementAdviceFields;",
        "Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenter;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

.field private static final synthetic ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private final apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

.field private bonusesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

.field private final brazeTrackingDataFactory:Lcom/ibotta/android/braze/BrazeTrackingDataFactory;

.field private final cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

.field private data:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

.field private final favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

.field private final ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

.field private lastEngagementSegmentIdSeen:Ljava/lang/Long;

.field private lastRewardIdSeen:Ljava/lang/Long;

.field private lastTask:Lcom/ibotta/api/model/TaskModel;

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private relayEngagementsJob:Lcom/ibotta/android/service/api/job/RelayApiJob;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private final retailerHelperParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

.field private state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

.field private submittingResponses:Z

.field private final taskHelper:Lcom/ibotta/api/helper/offer/TaskHelper;

.field private unlockStartTime:J

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/offer/TaskHelper;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/braze/BrazeTrackingDataFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V
    .locals 2

    move-object v0, p0

    .line 119
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 88
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-direct {v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;-><init>()V

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    .line 89
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->EMPTY:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->data:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    move-object v1, p3

    .line 120
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    move-object v1, p2

    .line 121
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    move-object v1, p4

    .line 122
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    move-object v1, p5

    .line 123
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->retailerHelperParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-object v1, p6

    .line 124
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    move-object v1, p7

    .line 125
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->taskHelper:Lcom/ibotta/api/helper/offer/TaskHelper;

    move-object v1, p8

    .line 126
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    move-object v1, p9

    .line 127
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->brazeTrackingDataFactory:Lcom/ibotta/android/braze/BrazeTrackingDataFactory;

    move-object v1, p10

    .line 128
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    move-object v1, p11

    .line 129
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    move-object v1, p12

    .line 130
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    move-object v1, p13

    .line 131
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    move-object/from16 v1, p14

    .line 132
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    move-object/from16 v1, p15

    .line 133
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    move-object/from16 v1, p16

    .line 134
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 69
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->lookForLinkedRebate()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;
    .locals 0

    .line 69
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;)Lcom/ibotta/android/graphql/cache/IbottaApolloCache;
    .locals 0

    .line 69
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    return-object p0
.end method

.method static synthetic access$300(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;)Lcom/ibotta/android/service/api/job/CacheClearJobFactory;
    .locals 0

    .line 69
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    return-object p0
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "EngagementPresenterImpl.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "2"

    const-string v2, "saveCurrentEngagementResponse"

    const-string v3, "com.ibotta.android.mvp.ui.activity.engagement.EngagementPresenterImpl"

    const-string v4, "java.lang.String"

    const-string v5, "response"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x166

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "2"

    const-string v2, "showEngagementInView"

    const-string v3, "com.ibotta.android.mvp.ui.activity.engagement.EngagementPresenterImpl"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x1e3

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    const-string v9, "method-execution"

    const-string v1, "2"

    const-string v2, "submitResponses"

    const-string v3, "com.ibotta.android.mvp.ui.activity.engagement.EngagementPresenterImpl"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x242

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private areAllRewardsInstantUnlocks()Z
    .locals 1

    .line 498
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->data:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getStandardTasks()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->data:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getInstantTasks()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private getCurrentTask()Lcom/ibotta/api/model/TaskModel;
    .locals 4

    .line 362
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->taskHelper:Lcom/ibotta/api/helper/offer/TaskHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->data:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getAllTasks()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getCurrentRewardId()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/ibotta/api/helper/offer/TaskHelper;->findTaskByRewardId(Ljava/util/List;J)Lcom/ibotta/api/model/TaskModel;

    move-result-object v0

    return-object v0
.end method

.method private getNextRewardId(Ljava/lang/Long;Ljava/util/List;)Ljava/lang/Long;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/TaskModel;",
            ">;)",
            "Ljava/lang/Long;"
        }
    .end annotation

    .line 503
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->getRewardIds(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    if-eqz p1, :cond_2

    .line 505
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_0

    .line 510
    :cond_0
    invoke-interface {p2, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_1

    .line 513
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge p1, v0, :cond_1

    add-int/lit8 p1, p1, 0x1

    .line 515
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 507
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    :goto_1
    if-eqz p1, :cond_3

    .line 520
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->lastRewardIdSeen:Ljava/lang/Long;

    :cond_3
    return-object p1
.end method

.method private getRewardIds(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/TaskModel;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 527
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 529
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/TaskModel;

    .line 530
    invoke-interface {v1}, Lcom/ibotta/api/model/TaskModel;->getRewardId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private initData(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/OfferModel;Ljava/util/List;)V
    .locals 6
    .param p1    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/RetailerModel;",
            "Lcom/ibotta/api/model/OfferModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/EngagementModel;",
            ">;)V"
        }
    .end annotation

    .line 383
    invoke-static {p3}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p3

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/engagement/-$$Lambda$iENK12lvhQVbXmTSAlfNC6L073w;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/engagement/-$$Lambda$iENK12lvhQVbXmTSAlfNC6L073w;

    .line 384
    invoke-static {}, Ljava9/util/function/Function$-CC;->identity()Ljava9/util/function/Function;

    move-result-object v1

    invoke-static {v0, v1}, Ljava9/util/stream/Collectors;->toUnmodifiableMap(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map;

    .line 386
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 387
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 389
    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->getRewards()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/model/TaskModel;

    .line 394
    invoke-interface {v3}, Lcom/ibotta/api/model/TaskModel;->getRewardId()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {p3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 395
    invoke-interface {v3}, Lcom/ibotta/api/model/TaskModel;->getRewardId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {p3, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/model/TaskModel;

    .line 398
    :cond_0
    invoke-interface {v3}, Lcom/ibotta/api/model/TaskModel;->getTypeEnum()Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ibotta/api/model/TaskModel$Type;->isInstantUnlock()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 399
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 401
    :cond_1
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 405
    :cond_2
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->builder()Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;

    move-result-object p3

    .line 406
    invoke-virtual {p3, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;->retailerModel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;

    move-result-object p1

    .line 407
    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;->offerModel(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;

    move-result-object p1

    .line 408
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;->standardTasks(Ljava/util/List;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;

    move-result-object p1

    .line 409
    invoke-virtual {p1, v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;->instantTasks(Ljava/util/List;)Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;

    move-result-object p1

    .line 410
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->data:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    return-void
.end method

.method private initDefaultRetailer(Lcom/ibotta/api/call/home/HomeResponse;Ljava/util/Set;)Lcom/ibotta/api/model/RetailerModel;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/call/home/HomeResponse;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/ibotta/api/model/RetailerModel;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 304
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getRetailerId()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 305
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-virtual {p1}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getRetailerId()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p2, p1, v0}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    goto :goto_0

    .line 306
    :cond_0
    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 307
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 308
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-virtual {p1}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    .line 312
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->setRetailerId(Ljava/lang/Integer;)V

    :cond_2
    return-object p1
.end method

.method private initEngagement()V
    .locals 3

    .line 426
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->areAllRewardsInstantUnlocks()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 427
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->submitResponses()V

    return-void

    .line 431
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getCurrentRewardId()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_1

    .line 432
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->data:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getStandardTasks()Ljava/util/List;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->getNextRewardId(Ljava/lang/Long;Ljava/util/List;)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->setCurrentRewardId(Ljava/lang/Long;)V

    .line 435
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getCurrentRewardId()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_2

    .line 437
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;->finish()V

    return-void

    .line 441
    :cond_2
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->showEngagementInView()V

    return-void
.end method

.method private initOfferState(Ljava/lang/String;IILjava/lang/String;)V
    .locals 1

    .line 371
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->setOfferName(Ljava/lang/String;)V

    .line 372
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->setSegmentId(I)V

    .line 373
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {p1, p3}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->setOfferSegmentId(I)V

    .line 374
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {p1, p4}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->setCurrentValue(Ljava/lang/String;)V

    return-void
.end method

.method private initRetailerSelector(Ljava/util/List;Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 445
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getRetailerId()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 446
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->showEngagement()V

    return-void

    .line 449
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;->hide()V

    .line 452
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailersByIds(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;

    move-result-object v0

    .line 453
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-interface {v1, v0}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findNearbyRetailers(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 455
    new-instance v1, Lcom/ibotta/android/collection/DefaultRetailerModelComparator;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    .line 456
    invoke-virtual {v2, v0}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->newInstance(Ljava/util/List;)Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/collection/DefaultRetailerModelComparator;-><init>(Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)V

    .line 457
    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 459
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 461
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailersByIds(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 462
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_2

    .line 464
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    const/4 p2, 0x0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->setRetailerId(Ljava/lang/Integer;)V

    .line 465
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->showEngagement()V

    return-void

    .line 469
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getOfferName()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 470
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getOfferName()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;->getDefaultOfferName()Ljava/lang/String;

    move-result-object p1

    .line 473
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_4

    .line 474
    sget-object p2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/engagement/EmptyRetailerModelsException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No Retailers found for offerID: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    .line 475
    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getOfferId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EmptyRetailerModelsException;-><init>(Ljava/lang/String;)V

    .line 474
    invoke-virtual {p2, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 478
    :cond_4
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;

    invoke-interface {p2, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;->showRetailerSelector(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private initVisibility()V
    .locals 1

    .line 419
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->areAllRewardsInstantUnlocks()Z

    move-result v0

    if-nez v0, :cond_0

    .line 420
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;->show()V

    :cond_0
    return-void
.end method

.method private isFirstEngagement(Ljava/lang/Long;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 537
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->data:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getStandardTasks()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 538
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->data:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getStandardTasks()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/TaskModel;

    invoke-interface {p1}, Lcom/ibotta/api/model/TaskModel;->getRewardId()J

    move-result-wide v3

    cmp-long p1, v1, v3

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method private isOffersJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Z
    .locals 0

    .line 688
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;

    return p1
.end method

.method private isPermissionPromptNeeded(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/TaskModel;",
            ">;)Z"
        }
    .end annotation

    .line 319
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->isPermissionsNeeded()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 323
    :cond_0
    new-instance v0, Lcom/ibotta/android/collection/TaskComparator;

    invoke-direct {v0}, Lcom/ibotta/android/collection/TaskComparator;-><init>()V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 326
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/TaskModel;

    .line 327
    invoke-interface {v0}, Lcom/ibotta/api/model/TaskModel;->getTypeEnum()Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object v0

    sget-object v2, Lcom/ibotta/api/model/TaskModel$Type;->STORE_LOCATOR:Lcom/ibotta/api/model/TaskModel$Type;

    if-ne v0, v2, :cond_1

    const/4 v1, 0x1

    :cond_2
    return v1

    :cond_3
    :goto_0
    return v1
.end method

.method static synthetic lambda$startEngagementsLoad$0(Lcom/ibotta/api/model/RewardModel;)Z
    .locals 4

    .line 707
    invoke-interface {p0}, Lcom/ibotta/api/model/RewardModel;->getEngagementId()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private lookForLinkedRebate()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 544
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->data:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getAllTasks()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->data:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getAllTasks()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 545
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->data:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getAllTasks()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/TaskModel;

    .line 548
    invoke-interface {v0}, Lcom/ibotta/api/model/TaskModel;->getRewardId()J

    move-result-wide v1

    .line 551
    invoke-interface {v0}, Lcom/ibotta/api/model/TaskModel;->getLinkedOfferIds()Ljava/util/Set;

    move-result-object v0

    .line 554
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v3}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createOffersCall()Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;

    move-result-object v3

    .line 555
    invoke-virtual {v3, v0}, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->setOfferIds(Ljava/util/Set;)V

    .line 556
    invoke-virtual {v3}, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->execute()Lcom/ibotta/api/ApiResponse;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    .line 559
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 560
    invoke-virtual {v3}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 563
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 564
    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-interface {v5, v4, v6}, Lcom/ibotta/api/helper/offer/OfferHelper;->findOfferById(Ljava/util/List;I)Lcom/ibotta/api/model/OfferModel;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 568
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->setLinkedRewardId(J)V

    .line 569
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v0, v3}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->setLinkedOfferId(Ljava/lang/Integer;)V

    :cond_1
    return-void
.end method

.method private saveCurrentEngagementResponse(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingBefore;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->ENGAGEMENT_COMPLETE:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 358
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getEngagementResponses()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getCurrentRewardId()Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private showEngagement()V
    .locals 0

    .line 414
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->initVisibility()V

    .line 415
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->initEngagement()V

    return-void
.end method

.method private showEngagementInView()V
    .locals 9
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingBefore;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->ENGAGEMENT_START:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->ajc$tjp_1:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 483
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->getCurrentTask()Lcom/ibotta/api/model/TaskModel;

    move-result-object v0

    .line 485
    invoke-interface {v0}, Lcom/ibotta/api/model/TaskModel;->getEngagementId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->lastEngagementSegmentIdSeen:Ljava/lang/Long;

    .line 487
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    move-object v1, v0

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->data:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    .line 488
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    .line 489
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getOfferName()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    .line 490
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getCurrentValue()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->data:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    .line 491
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getThumbUrl()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->data:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    .line 492
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->isActivated()Z

    move-result v6

    .line 493
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->getCurrentTask()Lcom/ibotta/api/model/TaskModel;

    move-result-object v7

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    .line 494
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getCurrentRewardId()Ljava/lang/Long;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->isFirstEngagement(Ljava/lang/Long;)Z

    move-result v8

    .line 487
    invoke-interface/range {v1 .. v8}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;->showEngagement(Lcom/ibotta/api/model/RetailerModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/ibotta/api/model/TaskModel;Z)V

    return-void
.end method

.method private startEngagementsLoad(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 2

    .line 699
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/engagement/-$$Lambda$eeYZ3JSiH3af6UB_YSiDk_hE7k4;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/engagement/-$$Lambda$eeYZ3JSiH3af6UB_YSiDk_hE7k4;

    .line 700
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/engagement/-$$Lambda$cQAGvRTYV9_SEbb_pXsNy0kJBjI;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/engagement/-$$Lambda$cQAGvRTYV9_SEbb_pXsNy0kJBjI;

    .line 701
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    .line 702
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 704
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/engagement/-$$Lambda$WFrxbHMxPazXGP733pjrtqshu-s;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/engagement/-$$Lambda$WFrxbHMxPazXGP733pjrtqshu-s;

    .line 705
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/engagement/-$$Lambda$lnpN99Q7KybQyzGDZRSLPMAPS4c;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/engagement/-$$Lambda$lnpN99Q7KybQyzGDZRSLPMAPS4c;

    .line 706
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->flatMap(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/engagement/-$$Lambda$EngagementPresenterImpl$sbtpqa-fNmS9NZRAwSDFr20znL0;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/engagement/-$$Lambda$EngagementPresenterImpl$sbtpqa-fNmS9NZRAwSDFr20znL0;

    .line 707
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/engagement/-$$Lambda$WFeYlvbodDzuc7107CDzEwcl4-M;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/engagement/-$$Lambda$WFeYlvbodDzuc7107CDzEwcl4-M;

    .line 708
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/engagement/-$$Lambda$QO1890hBJGfGog1T6o962pPczmQ;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/engagement/-$$Lambda$QO1890hBJGfGog1T6o962pPczmQ;

    .line 709
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 710
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableSet()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    .line 712
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 714
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->relayEngagementsJob:Lcom/ibotta/android/service/api/job/RelayApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/RelayApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;

    .line 715
    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;->setRewardIds(Ljava/util/Set;)V

    .line 717
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->relayEngagementsJob:Lcom/ibotta/android/service/api/job/RelayApiJob;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/service/api/job/RelayApiJob;->signal(Z)V

    goto :goto_0

    .line 720
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->relayEngagementsJob:Lcom/ibotta/android/service/api/job/RelayApiJob;

    sget-object v0, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    new-instance v1, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLResponse;

    invoke-direct {v1}, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLResponse;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/ibotta/android/service/api/job/RelayApiJob;->setResult(Lcom/ibotta/android/service/api/Outcome;Lcom/ibotta/api/ApiResponse;)V

    :goto_0
    return-void
.end method

.method private startEngagementsLoadIfReady(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 692
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->isOffersJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 693
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->startEngagementsLoad(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    :cond_0
    return-void
.end method

.method private submitResponses()V
    .locals 9
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAfter;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->UNLOCK_OFFER:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->ajc$tjp_2:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    const/4 v1, 0x1

    .line 578
    :try_start_0
    iput-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->submittingResponses:Z

    .line 580
    new-instance v2, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;

    invoke-direct {v2}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;-><init>()V

    .line 581
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getOfferId()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->setOfferId(I)V

    .line 582
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->setCustomerId(I)V

    .line 583
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getSegmentId()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->setSegmentId(I)V

    .line 584
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getOfferSegmentId()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->setOfferSegmentId(I)V

    .line 585
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getCurrentValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->setCurrentValue(Ljava/lang/String;)V

    .line 586
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getRetailerId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->setRetailerId(Ljava/lang/Integer;)V

    .line 588
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->data:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getAllTasks()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/api/model/TaskModel;

    .line 589
    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v5}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getEngagementResponses()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v4}, Lcom/ibotta/api/model/TaskModel;->getRewardId()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 591
    new-instance v6, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;

    invoke-direct {v6}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;-><init>()V

    .line 592
    invoke-interface {v4}, Lcom/ibotta/api/model/TaskModel;->getRewardId()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->setId(J)V

    .line 593
    invoke-interface {v4}, Lcom/ibotta/api/model/TaskModel;->getEngagementId()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->setEngagementId(J)V

    .line 594
    invoke-virtual {v6, v1}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->setFinished(Z)V

    .line 595
    invoke-virtual {v6, v5}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->setResponse(Ljava/lang/Object;)V

    .line 597
    invoke-virtual {v2}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->getRewards()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v4}, Lcom/ibotta/api/model/TaskModel;->getRewardId()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v5, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 600
    :cond_0
    new-instance v3, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;

    invoke-direct {v3, v2}, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;-><init>(Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;)V

    .line 602
    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl$1;

    invoke-direct {v2, p0, v3}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;Lcom/ibotta/api/ApiCall;)V

    .line 618
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v3}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->unlockStartTime:J

    .line 619
    invoke-virtual {p0, v2, v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;Z)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 620
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    return-void

    :catch_0
    move-exception v1

    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->after(Lorg/aspectj/lang/JoinPoint;)V

    throw v1
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 204
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 206
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v1, :cond_0

    .line 207
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 208
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;->setName(Ljava/lang/String;)V

    .line 211
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 212
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createOffersCall()Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;

    move-result-object v1

    .line 213
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 214
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getOfferId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 215
    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->setOfferIds(Ljava/util/Set;)V

    .line 217
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    invoke-interface {v2, v1}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 220
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->bonusesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_2

    .line 221
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v2}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createBonusesCall()Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->bonusesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 224
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->relayEngagementsJob:Lcom/ibotta/android/service/api/job/RelayApiJob;

    if-nez v1, :cond_3

    .line 225
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v2}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createEngagementsGraphQlCall()Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLCall;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createRelayApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/RelayApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->relayEngagementsJob:Lcom/ibotta/android/service/api/job/RelayApiJob;

    .line 228
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 229
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 230
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->bonusesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 231
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->relayEngagementsJob:Lcom/ibotta/android/service/api/job/RelayApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getLastEngagementSegmentIdSeen()Ljava/lang/Long;
    .locals 1

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->lastEngagementSegmentIdSeen:Ljava/lang/Long;

    return-object v0
.end method

.method public getLastRewardIdSeen()Ljava/lang/Long;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->lastRewardIdSeen:Ljava/lang/Long;

    return-object v0
.end method

.method public getOfferId()Ljava/lang/Integer;
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getOfferId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getPersistedState()Ljava/lang/Object;
    .locals 1

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    return-object v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getRetailerId()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getRewardId()Ljava/lang/Long;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 169
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->getCurrentTask()Lcom/ibotta/api/model/TaskModel;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 174
    :cond_0
    invoke-interface {v0}, Lcom/ibotta/api/model/TaskModel;->getRewardId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public getRewardType()Lcom/ibotta/api/model/TaskModel$Type;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 159
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->getCurrentTask()Lcom/ibotta/api/model/TaskModel;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 164
    :cond_0
    invoke-interface {v0}, Lcom/ibotta/api/model/TaskModel;->getTypeEnum()Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object v0

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 238
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 239
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 240
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->bonusesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 241
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->relayEngagementsJob:Lcom/ibotta/android/service/api/job/RelayApiJob;

    return-void
.end method

.method public onCurrentEngagementSuccess(Ljava/lang/String;)V
    .locals 2

    .line 338
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->submittingResponses:Z

    if-eqz v0, :cond_0

    return-void

    .line 342
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getCurrentRewardId()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 343
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->saveCurrentEngagementResponse(Ljava/lang/String;)V

    .line 347
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getCurrentRewardId()Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->data:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getStandardTasks()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->getNextRewardId(Ljava/lang/Long;Ljava/util/List;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->setCurrentRewardId(Ljava/lang/Long;)V

    .line 349
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getCurrentRewardId()Ljava/lang/Long;

    move-result-object p1

    if-nez p1, :cond_2

    .line 350
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->submitResponses()V

    goto :goto_0

    .line 352
    :cond_2
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->showEngagementInView()V

    :goto_0
    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 8

    .line 260
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 261
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    .line 262
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->relayEngagementsJob:Lcom/ibotta/android/service/api/job/RelayApiJob;

    .line 263
    invoke-virtual {v2}, Lcom/ibotta/android/service/api/job/RelayApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLResponse;

    .line 265
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 266
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 268
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v4}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getOfferId()I

    move-result v4

    invoke-interface {v1, v3, v4}, Lcom/ibotta/api/helper/offer/OfferHelper;->findOfferById(Ljava/util/List;I)Lcom/ibotta/api/model/OfferModel;

    move-result-object v1

    if-nez v1, :cond_0

    .line 271
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;->showOfferNotFound()V

    return-void

    .line 275
    :cond_0
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getRetailers()Ljava/util/Set;

    move-result-object v3

    invoke-direct {p0, v0, v3}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->initDefaultRetailer(Lcom/ibotta/api/call/home/HomeResponse;Ljava/util/Set;)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v3

    .line 277
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getName()Ljava/lang/String;

    move-result-object v4

    .line 278
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getSegmentId()I

    move-result v5

    .line 279
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getOfferSegmentId()I

    move-result v6

    .line 280
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getCurrentValue()Ljava/lang/String;

    move-result-object v7

    .line 276
    invoke-direct {p0, v4, v5, v6, v7}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->initOfferState(Ljava/lang/String;IILjava/lang/String;)V

    .line 284
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/engagement/EngagementsGraphQLResponse;->getEngagements()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object v2

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 281
    invoke-direct {p0, v3, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->initData(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/OfferModel;Ljava/util/List;)V

    .line 286
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->data:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getAllTasks()Ljava/util/List;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->isPermissionPromptNeeded(Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 287
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getRetailerId()Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;->promptForLocationPermissions(ILjava/lang/Integer;)V

    return-void

    .line 291
    :cond_1
    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getRetailers()Ljava/util/Set;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->initRetailerSelector(Ljava/util/List;Ljava/util/Set;)V

    return-void
.end method

.method protected onFetchFinishedWithFailures()V
    .locals 1

    .line 296
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onFetchFinishedWithFailures()V

    .line 297
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;->setTitleForLoadFailure()V

    return-void
.end method

.method protected onFetchJobFailed(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    .line 253
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onFetchJobFailed(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 255
    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->startEngagementsLoadIfReady(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-void
.end method

.method protected onFetchJobSuccess(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    .line 246
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onFetchJobSuccess(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 248
    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->startEngagementsLoadIfReady(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-void
.end method

.method public onRetailerPicked(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 682
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->setRetailerId(Ljava/lang/Integer;)V

    .line 683
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;->dismissRetailerPickerDialog()V

    .line 684
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->showEngagement()V

    return-void
.end method

.method public onRetailerPickerDialogDismissClicked()V
    .locals 1

    .line 669
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;->dismissRetailerPickerDialog()V

    return-void
.end method

.method public onRetailerPickerDialogDismissed()V
    .locals 1

    .line 675
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->getRetailerId()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_0

    .line 676
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;->finish()V

    :cond_0
    return-void
.end method

.method public onShareRequested(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 367
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;->share(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 0

    .line 660
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 662
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 663
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->submittingResponses:Z

    :cond_0
    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 8

    .line 624
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 626
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/api/call/offer/CustomerOfferPutCall;

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    .line 629
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->bonusesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_0

    .line 630
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;

    .line 634
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->unlockStartTime:J

    sub-long/2addr v0, v2

    .line 635
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    invoke-interface {v2, v0, v1}, Lcom/ibotta/android/tracking/timing/AppTimingTracker;->trackTimeToUnlock(J)V

    const/4 v0, 0x0

    .line 637
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->submittingResponses:Z

    .line 639
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->retailerHelperParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->data:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;->toRetailerParcel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v3

    .line 641
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->brazeTrackingDataFactory:Lcom/ibotta/android/braze/BrazeTrackingDataFactory;

    .line 642
    invoke-interface {v1, v3}, Lcom/ibotta/android/braze/BrazeTrackingDataFactory;->createRetailerTrackingData(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->brazeTrackingDataFactory:Lcom/ibotta/android/braze/BrazeTrackingDataFactory;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->data:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    .line 643
    invoke-virtual {v4}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v4

    invoke-interface {v2, v4}, Lcom/ibotta/android/braze/BrazeTrackingDataFactory;->createOfferTrackingData(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;

    move-result-object v2

    .line 641
    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackOfferUnlocked(Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;)V

    .line 645
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->brazeTrackingDataFactory:Lcom/ibotta/android/braze/BrazeTrackingDataFactory;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->data:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;

    .line 646
    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterData;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Lcom/ibotta/android/braze/BrazeTrackingDataFactory;->createBonusTrackingData(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;

    move-result-object p1

    .line 645
    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackSpotlightUnlockItemBonus(Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;)V

    .line 648
    invoke-static {}, Lcom/ibotta/android/LocalBroadcast;->broadcastRebateUnlocked()V

    .line 650
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    move-object v2, p1

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->lastTask:Lcom/ibotta/api/model/TaskModel;

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    .line 653
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getLinkedRewardId()J

    move-result-wide v5

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    .line 654
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->getLinkedOfferId()Ljava/lang/Integer;

    move-result-object v7

    .line 650
    invoke-interface/range {v2 .. v7}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;->showEngagementSuccess(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/TaskModel;JLjava/lang/Integer;)V

    :cond_1
    return-void
.end method

.method public setOfferId(I)V
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->setOfferId(I)V

    return-void
.end method

.method public setPermissionsNeeded(Z)V
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->setPermissionsNeeded(Z)V

    return-void
.end method

.method public setPersistedState(Ljava/lang/Object;)V
    .locals 0

    .line 199
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    return-void
.end method

.method public setRetailerId(Ljava/lang/Integer;)V
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementPresenterState;->setRetailerId(Ljava/lang/Integer;)V

    return-void
.end method
