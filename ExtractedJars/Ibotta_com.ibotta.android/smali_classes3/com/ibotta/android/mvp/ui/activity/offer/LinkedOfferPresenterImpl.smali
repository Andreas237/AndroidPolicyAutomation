.class public Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "LinkedOfferPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenter;"
    }
.end annotation


# instance fields
.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private offerId:I

.field private offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private offerModel:Lcom/ibotta/api/model/OfferModel;

.field private originRetailerId:Ljava/lang/Integer;

.field private rewardId:J

.field private final trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    const/4 p1, -0x1

    .line 33
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->offerId:I

    .line 42
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 43
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    return-void
.end method

.method private trackOfferImpression()V
    .locals 3

    .line 85
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;-><init>()V

    .line 86
    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->LINKED_OFFER:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    .line 87
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->originRetailerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setRetailerId(Ljava/lang/Integer;)V

    .line 88
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setOfferId(Ljava/lang/Integer;)V

    .line 89
    iget-wide v1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->rewardId:J

    long-to-int v2, v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setOfferRewardId(Ljava/lang/Integer;)V

    .line 90
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getOfferSegmentId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setOfferSegmentId(Ljava/lang/Integer;)V

    const/4 v1, 0x1

    .line 91
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;->setCounter(I)V

    .line 92
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

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

    .line 48
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 50
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 51
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createOfferCall()Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;

    move-result-object v1

    .line 52
    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->offerId:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setOfferId(Ljava/lang/Integer;)V

    const/4 v2, 0x0

    .line 53
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setIgnoreTargeting(Ljava/lang/Boolean;)V

    .line 54
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setProducts(Ljava/lang/Boolean;)V

    .line 56
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 59
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getOfferModel()Lcom/ibotta/api/model/OfferModel;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    return-object v0
.end method

.method public getRetailerParcelIfAvailableAtOrigin()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 3

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->originRetailerId:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getRetailers()Ljava/util/Set;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->originRetailerId:Ljava/lang/Integer;

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 103
    new-instance v1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;-><init>()V

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->originRetailerId:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setId(I)V

    :cond_1
    return-object v1
.end method

.method protected onAbandonFetchJobs()V
    .locals 2

    const-string v0, "onAbandonApiJobs"

    const/4 v1, 0x0

    .line 66
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 67
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onCloseClicked()V
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferView;->finishWithCancel()V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 2

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;

    .line 73
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;->getOfferAsModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    if-eqz v0, :cond_0

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferView;->initForOffer(Lcom/ibotta/api/model/OfferModel;)V

    .line 78
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->trackOfferImpression()V

    :cond_0
    return-void
.end method

.method public onNoThanksClicked()V
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferView;->finishWithSuccess()V

    return-void
.end method

.method public onViewRebateClicked()V
    .locals 3

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->getRetailerParcelIfAvailableAtOrigin()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferView;->launchNewOffer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferView;->finishWithSuccess()V

    return-void
.end method

.method public setOfferInfo(Ljava/lang/Integer;IJ)V
    .locals 1

    .line 117
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->originRetailerId:Ljava/lang/Integer;

    .line 118
    iput p2, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->offerId:I

    .line 119
    iput-wide p3, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->rewardId:J

    const/4 p1, -0x1

    if-eq p2, p1, :cond_0

    const-wide/16 p1, -0x1

    cmp-long v0, p3, p1

    if-nez v0, :cond_1

    :cond_0
    const-string p1, "State lost."

    const/4 p2, 0x0

    .line 124
    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferView;->finishWithError()V

    :cond_1
    return-void
.end method
