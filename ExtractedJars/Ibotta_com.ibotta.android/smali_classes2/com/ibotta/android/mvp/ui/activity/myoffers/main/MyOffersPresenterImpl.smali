.class public Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "MyOffersPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenter;"
    }
.end annotation


# instance fields
.field private final accountTracking:Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

.field private customer:Lcom/ibotta/api/model/customer/Customer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

.field private final favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private final imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private myRebatesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private myRebatesRetailers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end field

.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private offersJob:Lcom/ibotta/android/service/api/job/WaitingApiJob;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private retailersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

.field private unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;Lcom/ibotta/android/title/TitleBarReducer;)V
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 92
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 93
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 94
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 95
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    .line 96
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    .line 97
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 98
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 99
    iput-object p9, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->accountTracking:Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    .line 100
    iput-object p10, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    return-void
.end method

.method private addRetailerSections(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;",
            ">;"
        }
    .end annotation

    .line 380
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 382
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 383
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;

    .line 384
    move-object v3, v2

    check-cast v3, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;

    .line 385
    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v3

    .line 388
    invoke-interface {v3}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v3

    sget-object v4, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-ne v3, v4, :cond_0

    .line 389
    sget-object v3, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->APPS:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    goto :goto_1

    .line 391
    :cond_0
    sget-object v3, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->STORES:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    .line 394
    :goto_1
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    if-nez v4, :cond_1

    .line 396
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 397
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    :cond_1
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 403
    :cond_2
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 404
    new-instance v2, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/TitleBarRow;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    .line 405
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    invoke-virtual {v4}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/TitleBarRow;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 407
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 408
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    :cond_3
    return-object v0
.end method

.method private applyTrackingDetails(Ljava/util/LinkedHashMap;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;",
            ">;>;)V"
        }
    .end annotation

    .line 415
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-le v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v3, 0x0

    .line 423
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v4, -0x1

    move-object v5, v3

    const/4 v3, -0x1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    add-int/2addr v4, v2

    .line 427
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    invoke-virtual {v7}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->getName()Ljava/lang/String;

    move-result-object v7

    .line 429
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-object v9, v5

    move v5, v3

    const/4 v3, 0x0

    :cond_1
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;

    .line 430
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    sget-object v12, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->ALL:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    if-ne v11, v12, :cond_2

    instance-of v11, v10, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/TitleBarRow;

    if-eqz v11, :cond_2

    .line 431
    check-cast v10, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/TitleBarRow;

    invoke-virtual {v10}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/TitleBarRow;->getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getTitle()Ljava/lang/String;

    move-result-object v9

    add-int/lit8 v5, v5, 0x1

    const/4 v3, 0x0

    goto :goto_2

    .line 434
    :cond_2
    instance-of v11, v10, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;

    if-eqz v11, :cond_1

    add-int/lit8 v11, v3, 0x1

    .line 435
    invoke-virtual {v10, v3}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;->setIndex(I)V

    if-eqz v0, :cond_4

    .line 438
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    sget-object v12, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->ALL:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    if-ne v3, v12, :cond_3

    .line 439
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v10, v3}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;->setModuleIndex(Ljava/lang/Integer;)V

    .line 440
    invoke-virtual {v10, v9}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;->setModuleName(Ljava/lang/String;)V

    goto :goto_3

    .line 442
    :cond_3
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v10, v3}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;->setModuleIndex(Ljava/lang/Integer;)V

    .line 443
    invoke-virtual {v10, v7}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;->setModuleName(Ljava/lang/String;)V

    :cond_4
    :goto_3
    move v3, v11

    goto :goto_2

    :cond_5
    move v3, v5

    move-object v5, v9

    goto :goto_1

    :cond_6
    return-void
.end method

.method private copy(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;)Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;
    .locals 2

    .line 353
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;-><init>()V

    .line 355
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V

    .line 356
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->getRebateCount()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->setRebateCount(I)V

    .line 357
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->isFavorited()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->setFavorited(Z)V

    return-object v0
.end method

.method private getConnectionStatusForRetailer(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/api/model/im/ImConnectionStatus;
    .locals 2

    .line 458
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->getCredentialIntegrations()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->getImConnectionStatusForRetailer(Lcom/ibotta/api/model/RetailerModel;Ljava/util/List;)Lcom/ibotta/api/model/im/ImConnectionStatus;

    move-result-object p1

    return-object p1
.end method

.method private getCredentialIntegrations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/im/CredentialIntegration;",
            ">;"
        }
    .end annotation

    .line 462
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getCredentialIntegrations()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    return-object v0
.end method

.method private getMoreStoresVisible(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)Z"
        }
    .end annotation

    .line 372
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/api/helper/offer/OfferHelper;->findActive(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method private getMyRebatesRetailers(Ljava/util/LinkedHashSet;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 230
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 232
    invoke-virtual {p1}, Ljava/util/LinkedHashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 233
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v2, p2, v1}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 236
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private getRetailerRows(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;",
            ">;"
        }
    .end annotation

    .line 268
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 270
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/RetailerModel;

    .line 273
    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v2

    sget-object v3, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-ne v2, v3, :cond_1

    .line 274
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v3

    invoke-interface {v2, p2, v3}, Lcom/ibotta/api/helper/offer/OfferHelper;->findByRetailer(Ljava/util/List;I)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    goto :goto_1

    .line 276
    :cond_1
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v3

    invoke-interface {v2, p2, v3}, Lcom/ibotta/api/helper/offer/OfferHelper;->findActiveByRetailer(Ljava/util/List;I)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    :goto_1
    if-lez v2, :cond_0

    .line 280
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v4

    invoke-interface {v3, v4}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->isFavorited(I)Z

    move-result v3

    .line 282
    new-instance v4, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;

    invoke-direct {v4}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;-><init>()V

    .line 283
    invoke-virtual {v4, v1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V

    .line 284
    invoke-virtual {v4, v2}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->setRebateCount(I)V

    .line 285
    invoke-virtual {v4, v3}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->setFavorited(Z)V

    .line 287
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private getRetailerRowsForAllTab(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;",
            ">;"
        }
    .end annotation

    .line 313
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 315
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;

    .line 316
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->copy(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;)Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;

    move-result-object v1

    .line 318
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private getRetailerRowsForAppsTab(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;",
            ">;"
        }
    .end annotation

    .line 339
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 341
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;

    .line 342
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->copy(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;)Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;

    move-result-object v1

    .line 344
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v2

    invoke-interface {v2}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v2

    sget-object v3, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-ne v2, v3, :cond_0

    .line 345
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private getRetailerRowsForStoresTab(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;",
            ">;"
        }
    .end annotation

    .line 325
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 327
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;

    .line 328
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->copy(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;)Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;

    move-result-object v1

    .line 330
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v2

    invoke-interface {v2}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v2

    sget-object v3, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-eq v2, v3, :cond_0

    .line 331
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private getRetailerRowsForTab(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;",
            ">;"
        }
    .end annotation

    .line 297
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$myoffers$main$MyOffersTab:[I

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    goto :goto_0

    .line 305
    :pswitch_0
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->getRetailerRowsForAppsTab(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    .line 302
    :pswitch_1
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->getRetailerRowsForStoresTab(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    .line 299
    :pswitch_2
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->getRetailerRowsForAllTab(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private getRetailersByTab(Ljava/util/List;Ljava/util/List;)Ljava/util/LinkedHashMap;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;",
            ">;>;"
        }
    .end annotation

    .line 245
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->getRetailerRows(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 246
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 248
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->values()[Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    .line 249
    invoke-direct {p0, v3, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->getRetailerRowsForTab(Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 251
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    .line 252
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 254
    sget-object v4, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->ALL:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    if-ne v3, v4, :cond_0

    .line 255
    invoke-direct {p0, v5}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->addRetailerSections(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 258
    :cond_0
    invoke-virtual {p2, v3, v5}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 262
    :cond_2
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->removeTabsIfNeeded(Ljava/util/LinkedHashMap;)V

    return-object p2
.end method

.method private initFavoritesManager(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 376
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->newInstance(Ljava/util/List;)Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    return-void
.end method

.method private removeTabsIfNeeded(Ljava/util/LinkedHashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;",
            ">;>;)V"
        }
    .end annotation

    .line 363
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 364
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->STORES:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    invoke-virtual {p1, v0}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->APPS:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    invoke-virtual {p1, v0}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->APPS:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    .line 365
    invoke-virtual {p1, v0}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->STORES:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    invoke-virtual {p1, v0}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 366
    :cond_1
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;->ALL:Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersTab;

    invoke-virtual {p1, v0}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
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

    .line 105
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 107
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->retailersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 111
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    invoke-static {}, Ljava9/util/Lists;->of()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;->create(Ljava/util/List;Z)Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;->getRetailersApiJob(Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->retailersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 114
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 115
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 118
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->myRebatesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_2

    .line 119
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/offer/MyRebatesCall;

    invoke-direct {v2}, Lcom/ibotta/api/call/offer/MyRebatesCall;-><init>()V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->myRebatesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 122
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_3

    .line 123
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v2}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createUnlockedOffersCall()Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 126
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/WaitingApiJob;

    if-nez v1, :cond_4

    .line 127
    new-instance v1, Lcom/ibotta/android/service/api/job/WaitingApiJob;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v2}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createOffersCall()Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/WaitingApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/WaitingApiJob;

    .line 130
    :cond_4
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->retailersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 131
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->myRebatesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 132
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 133
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 134
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/WaitingApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 141
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->retailersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 142
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 143
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->myRebatesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 144
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 145
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/WaitingApiJob;

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 5

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 200
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;

    .line 201
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/WaitingApiJob;

    invoke-virtual {v1}, Lcom/ibotta/android/service/api/job/WaitingApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    .line 202
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    .line 204
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->myRebatesRetailers:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 205
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->myRebatesRetailers:Ljava/util/List;

    invoke-direct {p0, v3}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->initFavoritesManager(Ljava/util/List;)V

    .line 207
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 208
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 209
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 211
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {v1, v3}, Lcom/ibotta/api/helper/offer/OfferHelper;->findUniqueOffers(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 213
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->myRebatesRetailers:Ljava/util/List;

    .line 214
    invoke-direct {p0, v3, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->getRetailersByTab(Ljava/util/List;Ljava/util/List;)Ljava/util/LinkedHashMap;

    move-result-object v1

    .line 216
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->applyTrackingDetails(Ljava/util/LinkedHashMap;)V

    .line 218
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v3, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;

    invoke-interface {v3, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;->setDataMap(Ljava/util/LinkedHashMap;)V

    .line 220
    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    goto :goto_0

    .line 222
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;->setDataMap(Ljava/util/LinkedHashMap;)V

    .line 225
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->getMoreStoresVisible(Ljava/util/List;)Z

    move-result v0

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;->setMoreMenuVisible(Z)V

    return-void
.end method

.method protected onFetchJobFailed(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 2

    .line 187
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onFetchJobFailed(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 188
    move-object v0, p1

    check-cast v0, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/offer/MyRebatesCall;

    .line 189
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    invoke-interface {v1, p1}, Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;->isRetailersApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)Z

    move-result p1

    if-nez v0, :cond_0

    if-eqz p1, :cond_1

    .line 193
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/WaitingApiJob;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/ibotta/android/service/api/job/WaitingApiJob;->signal(Z)V

    :cond_1
    return-void
.end method

.method protected onFetchJobSuccess(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 7

    .line 150
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onFetchJobSuccess(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 152
    move-object v0, p1

    check-cast v0, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/offer/MyRebatesCall;

    .line 153
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    invoke-interface {v1, p1}, Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;->isRetailersApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)Z

    move-result p1

    .line 155
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->myRebatesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object v1

    sget-object v4, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    if-ne v1, v4, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 156
    :goto_0
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->retailersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object v4

    sget-object v5, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    if-ne v4, v5, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    .line 157
    :goto_1
    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/WaitingApiJob;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lcom/ibotta/android/service/api/job/WaitingApiJob;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object v5

    sget-object v6, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    if-ne v5, v6, :cond_2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    if-nez v0, :cond_3

    if-eqz p1, :cond_6

    :cond_3
    if-eqz v1, :cond_6

    if-eqz v4, :cond_6

    if-nez v2, :cond_6

    const-string p1, "MyRebatesJob & RetailersJob finished."

    .line 161
    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->myRebatesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/offer/MyRebatesResponse;

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->retailersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    .line 168
    invoke-virtual {p1}, Lcom/ibotta/api/call/offer/MyRebatesResponse;->getActiveRetailers()Ljava/util/LinkedHashSet;

    move-result-object p1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    invoke-interface {v1, v0}, Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;->getRetailerModels(Lcom/ibotta/api/ApiResponse;)Ljava/util/List;

    move-result-object v0

    .line 167
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->getMyRebatesRetailers(Ljava/util/LinkedHashSet;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->myRebatesRetailers:Ljava/util/List;

    .line 172
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 173
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->myRebatesRetailers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/RetailerModel;

    .line 174
    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v2

    sget-object v4, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-ne v2, v4, :cond_4

    .line 175
    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    const-string v0, "Signaling UnlockedOffersGraphQLCall to stop waiting an run now."

    .line 179
    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/WaitingApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/WaitingApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->setRetailerIds(Ljava/util/Set;)V

    .line 181
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/WaitingApiJob;

    invoke-virtual {p1, v3}, Lcom/ibotta/android/service/api/job/WaitingApiJob;->signal(Z)V

    :cond_6
    return-void
.end method

.method public onFindRebatesClicked()V
    .locals 1

    .line 472
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;->showFindRebates()V

    return-void
.end method

.method public onMoreEllipsesClicked()V
    .locals 1

    .line 477
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;->showMoreMenu()V

    return-void
.end method

.method public onNavAccountClicked()V
    .locals 1

    .line 487
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->accountTracking:Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/account/AccountTracking;->trackAccountNavClick()V

    .line 488
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onNavAccountClicked()V

    return-void
.end method

.method public onRebatesRemoved()V
    .locals 1

    .line 467
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;->showRemovedRebatesSuccess()V

    return-void
.end method

.method public onRetailerCardClicked(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 453
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->getConnectionStatusForRetailer(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/api/model/im/ImConnectionStatus;

    move-result-object v0

    .line 454
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;

    invoke-interface {v1, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;->showMyOffersGallery(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/im/ImConnectionStatus;)V

    return-void
.end method

.method public onSeeMoreClicked()V
    .locals 1

    .line 482
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/main/MyOffersView;->showMoreStores()V

    return-void
.end method
