.class public Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "PwiRoutingPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/PwiRoutingAdviceFields;
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingView;",
        ">;",
        "Lcom/ibotta/android/aop/tracking/advice/PwiRoutingAdviceFields;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenter;"
    }
.end annotation


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private offerCategoriesContainerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private parentActivityClass:Ljava/lang/Class;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 44
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 45
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "PwiRoutingPresenterImpl.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "2"

    const-string v2, "showPwiHome"

    const-string v3, "com.ibotta.android.mvp.ui.activity.pwi.routing.PwiRoutingPresenterImpl"

    const-string v4, "int:int"

    const-string v5, "retailerId:bgcContentId"

    const-string v6, ""

    const-string v7, "void"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x62

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private showPwiHome(II)V
    .locals 2
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingBefore;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_PAY_AT_RETAILER:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {p1}, Lorg/aspectj/runtime/internal/Conversions;->intObject(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p2}, Lorg/aspectj/runtime/internal/Conversions;->intObject(I)Ljava/lang/Object;

    move-result-object p2

    invoke-static {v0, p0, p0, v1, p2}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object p2

    .line 98
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingView;

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingView;->showPwiHome(I)V

    return-void
.end method


# virtual methods
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

    .line 50
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 52
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->offerCategoriesContainerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 53
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createOfferCategoriesContainerCall()Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;

    move-result-object v1

    .line 54
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->setRetailerId(Ljava/lang/Integer;)V

    const v2, 0x7fffffff

    .line 55
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->setLimit(Ljava/lang/Integer;)V

    const/4 v2, 0x0

    .line 56
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->setProducts(Ljava/lang/Boolean;)V

    .line 58
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->offerCategoriesContainerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 61
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->offerCategoriesContainerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getParentActivityClass()Ljava/lang/Class;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->parentActivityClass:Ljava/lang/Class;

    return-object v0
.end method

.method public getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 68
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->offerCategoriesContainerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 5

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->offerCategoriesContainerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    .line 74
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v2, "offerCategoriesContainerJob is null!"

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingView;->finish()V

    return-void

    .line 80
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;

    .line 82
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->getBuyableGiftCards()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    .line 83
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->getOffers()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    .line 84
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->getDeals()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :cond_2
    :goto_0
    if-eqz v1, :cond_3

    if-nez v2, :cond_3

    .line 86
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->getGcsEnabled()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 88
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v1

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->getBuyableGiftCards()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/content/BuyableGiftCardContent;

    invoke-virtual {v0}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->getId()I

    move-result v0

    invoke-direct {p0, v1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->showPwiHome(II)V

    goto :goto_1

    .line 92
    :cond_3
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingView;->showRetailerGallery(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    :goto_1
    return-void
.end method

.method public setParentActivityClass(Ljava/lang/Class;)V
    .locals 0
    .param p1    # Ljava/lang/Class;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 119
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->parentActivityClass:Ljava/lang/Class;

    return-void
.end method

.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 2
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 104
    sget-object p1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "retailerParcel is null!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 105
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingView;->finish()V

    return-void

    .line 109
    :cond_0
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-void
.end method
