.class public Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/OfferOnlyMCommEscortStrategy;
.super Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/RetailerOrOfferMCommEscortStrategy;
.source "OfferOnlyMCommEscortStrategy.java"


# instance fields
.field private offerByOfferIdGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/App;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/AppActionCreator;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;I)V
    .locals 12

    .line 55
    invoke-static/range {p10 .. p10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v10, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    .line 44
    invoke-direct/range {v0 .. v11}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/RetailerOrOfferMCommEscortStrategy;-><init>(Lcom/ibotta/android/App;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/AppActionCreator;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method public getFetchJobs()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 60
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/RetailerOrOfferMCommEscortStrategy;->getFetchJobs()Ljava/util/Set;

    move-result-object v0

    .line 62
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/OfferOnlyMCommEscortStrategy;->offerByOfferIdGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 63
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/OfferOnlyMCommEscortStrategy;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createOfferCall()Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;

    move-result-object v1

    .line 64
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/OfferOnlyMCommEscortStrategy;->getOfferId()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setOfferId(Ljava/lang/Integer;)V

    const/4 v2, 0x0

    .line 65
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setProducts(Ljava/lang/Boolean;)V

    .line 66
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setIgnoreTargeting(Ljava/lang/Boolean;)V

    .line 68
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/OfferOnlyMCommEscortStrategy;->offerByOfferIdGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 71
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/OfferOnlyMCommEscortStrategy;->offerByOfferIdGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public onAbandonFetchJobs()V
    .locals 1

    .line 78
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/RetailerOrOfferMCommEscortStrategy;->onAbandonFetchJobs()V

    const/4 v0, 0x0

    .line 80
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/OfferOnlyMCommEscortStrategy;->offerByOfferIdGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onFetchJobFailed(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    .line 104
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/RetailerOrOfferMCommEscortStrategy;->onFetchJobFailed(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 106
    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 109
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/OfferOnlyMCommEscortStrategy;->setRetailerId(Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

.method public onFetchJobSuccess(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 1

    .line 85
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/RetailerOrOfferMCommEscortStrategy;->onFetchJobSuccess(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 87
    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;

    if-eqz p1, :cond_0

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/OfferOnlyMCommEscortStrategy;->offerByOfferIdGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/OfferOnlyMCommEscortStrategy;->offerByOfferIdGraphQLJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 91
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;

    .line 93
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;->getOfferAsModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object p1

    .line 94
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getRetailers()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 96
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/OfferOnlyMCommEscortStrategy;->setRetailerId(Ljava/lang/Integer;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    const/4 p1, 0x0

    .line 98
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/OfferOnlyMCommEscortStrategy;->setRetailerId(Ljava/lang/Integer;)V

    :cond_1
    :goto_0
    return-void
.end method
