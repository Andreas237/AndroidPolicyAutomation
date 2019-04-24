.class public Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "DebugRoutesPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;"
    }
.end annotation


# instance fields
.field private bonusesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final debugRoutes:Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutes;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private routeItem:Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutes;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 56
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 57
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->debugRoutes:Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutes;

    .line 58
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 59
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 60
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    return-void
.end method

.method private buildBonusRouteItems()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;",
            ">;"
        }
    .end annotation

    .line 232
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->bonusesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    .line 233
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 236
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;->getAllBonuses()Ljava/util/List;

    move-result-object v0

    .line 238
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 239
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/BonusModel;

    .line 240
    new-instance v3, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    invoke-interface {v2}, Lcom/ibotta/api/model/BonusModel;->getId()I

    move-result v4

    invoke-interface {v2}, Lcom/ibotta/api/model/BonusModel;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;-><init>(ILjava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 243
    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-object v1
.end method

.method private buildOfferCategoryRouteItems()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;",
            ">;"
        }
    .end annotation

    .line 282
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    .line 283
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 286
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    .line 287
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object v0

    .line 289
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 290
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/OfferModel;

    .line 291
    check-cast v2, Lcom/ibotta/api/model/content/OfferContent;

    invoke-virtual {v2}, Lcom/ibotta/api/model/content/OfferContent;->getCategoryIds()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 294
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 295
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 297
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 299
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    .line 300
    new-instance v3, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;-><init>(ILjava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v1
.end method

.method private buildOfferRouteItems(I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;",
            ">;"
        }
    .end annotation

    .line 249
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->routeItem:Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->getRoute()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    goto :goto_2

    .line 253
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    .line 256
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->routeItem:Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->getRoute()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->routeItem:Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->getRoute()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->isRetailer()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 257
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v1, :cond_1

    .line 258
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    .line 261
    :cond_1
    invoke-virtual {v1}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/call/home/HomeResponse;

    .line 263
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 264
    invoke-virtual {v1}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v1

    .line 263
    invoke-interface {v2, v1, p1}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    .line 265
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0, p1}, Lcom/ibotta/api/helper/offer/OfferHelper;->findByRetailer(Ljava/util/List;Lcom/ibotta/api/model/RetailerModel;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    .line 267
    :cond_2
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object p1

    .line 270
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 272
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OfferModel;

    .line 273
    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v3

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 276
    :cond_3
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-object v0

    .line 250
    :cond_4
    :goto_2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method private buildRetailerCategoryRouteItems()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;",
            ">;"
        }
    .end annotation

    .line 196
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v0, :cond_0

    .line 197
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 200
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 201
    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getCategories()Ljava/util/List;

    move-result-object v0

    .line 203
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 204
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/retailer/Category;

    .line 205
    new-instance v3, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    invoke-virtual {v2}, Lcom/ibotta/api/model/retailer/Category;->getId()I

    move-result v4

    invoke-virtual {v2}, Lcom/ibotta/api/model/retailer/Category;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;-><init>(ILjava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 208
    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-object v1
.end method

.method private buildRetailerRouteItems()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;",
            ">;"
        }
    .end annotation

    .line 214
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v0, :cond_0

    .line 215
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 218
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 219
    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v0

    .line 221
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 222
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/RetailerModel;

    .line 223
    new-instance v3, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    invoke-interface {v2}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v4

    invoke-interface {v2}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;-><init>(ILjava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 226
    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-object v1
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

    .line 71
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 73
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->bonusesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 74
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v2}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createBonusesCall()Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->bonusesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 76
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    .line 77
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 79
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_2

    .line 83
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createOffersCall()Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;

    move-result-object v1

    const v3, 0x7fffffff

    .line 84
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->setLimit(Ljava/lang/Integer;)V

    .line 85
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->setProducts(Ljava/lang/Boolean;)V

    .line 87
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 90
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 91
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->bonusesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 92
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 99
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->bonusesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 100
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 101
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onBonusSelected()V
    .locals 2

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->routeItem:Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;->updateUiForCurrentState(Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;)V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 6

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->debugRoutes:Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutes;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutes;->getDebugRoutes()Ljava/util/List;

    move-result-object v0

    .line 107
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    .line 109
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 110
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    .line 111
    new-instance v4, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v2, v5, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;-><init>(ILjava/lang/String;Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 114
    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;->setRouteItems(Ljava/util/List;)V

    return-void
.end method

.method public onGoClicked()V
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;->startRouteScreen()V

    return-void
.end method

.method public onNotifyClicked()V
    .locals 2

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->routeItem:Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    if-nez v0, :cond_0

    return-void

    .line 187
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->routeItem:Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;->showStatusBarRouteNotification(Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;)V

    return-void
.end method

.method public onOfferCategorySelected()V
    .locals 2

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->routeItem:Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;->updateUiForCurrentState(Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;)V

    return-void
.end method

.method public onOfferSelected()V
    .locals 2

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->routeItem:Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;->updateUiForCurrentState(Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;)V

    return-void
.end method

.method public onRetailerCategorySelected()V
    .locals 2

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->routeItem:Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;->updateUiForCurrentState(Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;)V

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->routeItem:Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->getRoute()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 171
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->routeItem:Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->getRoute()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->isRetailer()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->buildRetailerRouteItems()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;->setRetailerRouteItems(Ljava/util/List;)V

    :cond_1
    return-void

    :cond_2
    :goto_0
    return-void
.end method

.method public onRetailerSelected(I)V
    .locals 2

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->routeItem:Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;->updateUiForCurrentState(Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;)V

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->routeItem:Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->getRoute()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->routeItem:Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->getRoute()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->isOffer()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->buildOfferRouteItems(I)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;->setOfferRouteItems(Ljava/util/List;)V

    goto :goto_0

    .line 147
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->routeItem:Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->getRoute()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->isCategory()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 148
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->buildOfferCategoryRouteItems()Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;->setOfferCategoryRouteItems(Ljava/util/List;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onRouteSelected(Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;I)V
    .locals 1

    .line 121
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->routeItem:Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;->updateUiForCurrentState(Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;)V

    .line 125
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->getRoute()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 128
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->isRetailerCategory()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 129
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->buildRetailerCategoryRouteItems()Ljava/util/List;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;->setRetailerCategoryRouteItems(Ljava/util/List;)V

    goto :goto_0

    .line 130
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->isRetailer()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 131
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->buildRetailerRouteItems()Ljava/util/List;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;->setRetailerRouteItems(Ljava/util/List;)V

    goto :goto_0

    .line 132
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->isBonuses()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 133
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->buildBonusRouteItems()Ljava/util/List;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;->setBonusRouteItems(Ljava/util/List;)V

    goto :goto_0

    .line 134
    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->isOffer()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 135
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;

    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->buildOfferRouteItems(I)Ljava/util/List;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;->setOfferRouteItems(Ljava/util/List;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public onStart()V
    .locals 2

    .line 65
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onStart()V

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;->updateUiForCurrentState(Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;)V

    return-void
.end method
