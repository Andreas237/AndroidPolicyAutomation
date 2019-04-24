.class public Lcom/ibotta/android/api/pwi/BgcRetailersJob;
.super Lcom/ibotta/android/service/api/job/SingleApiJob;
.source "BgcRetailersJob.java"


# instance fields
.field private final pwiRetailersHolder:Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;Lcom/ibotta/android/graphql/GraphQLCallFactory;)V
    .locals 0

    .line 18
    invoke-interface {p2}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createBuyableGiftCardRetailersGraphQLCall()Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/api/pwi/BgcRetailersJob;->pwiRetailersHolder:Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;

    return-void
.end method


# virtual methods
.method protected onAfterApiCall()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 24
    invoke-super {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onAfterApiCall()V

    .line 26
    invoke-virtual {p0}, Lcom/ibotta/android/api/pwi/BgcRetailersJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    invoke-virtual {p0}, Lcom/ibotta/android/api/pwi/BgcRetailersJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlResponse;

    .line 28
    iget-object v1, p0, Lcom/ibotta/android/api/pwi/BgcRetailersJob;->pwiRetailersHolder:Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlResponse;->getBuyableGiftCardRetailerIds()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;->setPwiRetailers(Ljava/util/Set;)V

    :cond_0
    return-void
.end method

.method protected onHandleException(Lcom/ibotta/api/ApiException;)V
    .locals 0

    .line 34
    invoke-super {p0, p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onHandleException(Lcom/ibotta/api/ApiException;)V

    .line 38
    sget-object p1, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    iput-object p1, p0, Lcom/ibotta/android/api/pwi/BgcRetailersJob;->outcome:Lcom/ibotta/android/service/api/Outcome;

    .line 39
    new-instance p1, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlResponse;

    invoke-direct {p1}, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlResponse;-><init>()V

    invoke-virtual {p0, p1}, Lcom/ibotta/android/api/pwi/BgcRetailersJob;->setApiResponse(Lcom/ibotta/api/ApiResponse;)V

    return-void
.end method
