.class public Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "EngagementRoutingPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingPresenter;"
    }
.end annotation


# instance fields
.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private offerId:I

.field private offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/api/helper/offer/OfferHelper;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 34
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 35
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

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

    .line 45
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 47
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingPresenterImpl;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 48
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createOfferCall()Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;

    move-result-object v1

    .line 49
    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingPresenterImpl;->offerId:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setOfferId(Ljava/lang/Integer;)V

    const/4 v2, 0x0

    .line 50
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setIgnoreTargeting(Ljava/lang/Boolean;)V

    .line 51
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setProducts(Ljava/lang/Boolean;)V

    .line 53
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingPresenterImpl;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 56
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingPresenterImpl;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 63
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingPresenterImpl;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 3

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingPresenterImpl;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingView;->finish()V

    return-void

    .line 73
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;

    .line 74
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;->getOfferAsModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 76
    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->isActivated()Z

    move-result v1

    if-nez v1, :cond_1

    .line 77
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {v1, v0}, Lcom/ibotta/api/helper/offer/OfferHelper;->isLocationPermissionRequiredForEngagement(Lcom/ibotta/api/model/OfferModel;)Z

    move-result v1

    .line 78
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingView;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v0

    invoke-interface {v2, v1, v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingView;->showEngagement(ZI)V

    .line 81
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingView;->finish()V

    return-void
.end method

.method public setOfferId(I)V
    .locals 0

    .line 40
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/engagement/routing/EngagementRoutingPresenterImpl;->offerId:I

    return-void
.end method
