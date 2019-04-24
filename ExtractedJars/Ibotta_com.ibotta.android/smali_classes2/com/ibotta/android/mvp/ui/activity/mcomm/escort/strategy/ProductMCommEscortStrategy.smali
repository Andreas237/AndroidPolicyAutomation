.class public Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/ProductMCommEscortStrategy;
.super Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;
.source "ProductMCommEscortStrategy.java"


# instance fields
.field private final productId:Ljava/lang/String;

.field private productJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private productModel:Lcom/ibotta/api/model/ProductModel;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/App;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/AppActionCreator;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Ljava/lang/String;)V
    .locals 12

    const/4 v10, 0x0

    const/4 v11, 0x0

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

    .line 50
    invoke-direct/range {v0 .. v11}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;-><init>(Lcom/ibotta/android/App;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/AppActionCreator;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Ljava/lang/Integer;Ljava/lang/Integer;)V

    move-object/from16 v1, p10

    .line 62
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/ProductMCommEscortStrategy;->productId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected getButtonSdkAction()Ljava/lang/String;
    .locals 4
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/ProductMCommEscortStrategy;->productModel:Lcom/ibotta/api/model/ProductModel;

    if-eqz v0, :cond_0

    const-string v1, "Using Product deeplink URL: %1$s"

    const/4 v2, 0x1

    .line 129
    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0}, Lcom/ibotta/api/model/ProductModel;->getDeeplinkUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    new-instance v0, Lcom/ibotta/api/model/retailer/ButtonInfoDetails;

    invoke-direct {v0}, Lcom/ibotta/api/model/retailer/ButtonInfoDetails;-><init>()V

    .line 132
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/ProductMCommEscortStrategy;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/ProductModel;->getDeeplinkUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/ButtonInfoDetails;->setUrl(Ljava/lang/String;)V

    .line 134
    new-instance v1, Lcom/ibotta/api/model/retailer/ButtonInfo;

    invoke-direct {v1}, Lcom/ibotta/api/model/retailer/ButtonInfo;-><init>()V

    .line 135
    invoke-virtual {v1, v0}, Lcom/ibotta/api/model/retailer/ButtonInfo;->setAndroid(Lcom/ibotta/api/model/retailer/ButtonInfoDetails;)V

    .line 137
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/ProductMCommEscortStrategy;->getButtonSdkAction(Lcom/ibotta/api/model/retailer/ButtonInfo;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "Using Button Action from ProductModel"

    .line 140
    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 145
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->getButtonSdkAction()Ljava/lang/String;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public getFetchJobs()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 67
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->getFetchJobs()Ljava/util/Set;

    move-result-object v0

    .line 69
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/ProductMCommEscortStrategy;->productJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 70
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/ProductMCommEscortStrategy;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createProductCall()Lcom/ibotta/android/graphql/product/ProductGraphQLCall;

    move-result-object v1

    .line 71
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/ProductMCommEscortStrategy;->productId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/product/ProductGraphQLCall;->setProductId(Ljava/lang/String;)V

    .line 73
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/ProductMCommEscortStrategy;->productJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 76
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/ProductMCommEscortStrategy;->productJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public onAbandonFetchJobs()V
    .locals 1

    .line 83
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->onAbandonFetchJobs()V

    const/4 v0, 0x0

    .line 84
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/ProductMCommEscortStrategy;->productJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onFetchFinishedSuccessfully()V
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/ProductMCommEscortStrategy;->productJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/ProductMCommEscortStrategy;->productJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/product/ProductGraphQLResponse;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/product/ProductGraphQLResponse;->getProductAsModel()Lcom/ibotta/api/model/ProductModel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/ProductMCommEscortStrategy;->productModel:Lcom/ibotta/api/model/ProductModel;

    .line 121
    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->onFetchFinishedSuccessfully()V

    return-void
.end method

.method public onFetchJobFailed(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    .line 106
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->onFetchJobFailed(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 108
    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/android/graphql/product/ProductGraphQLCall;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 111
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/ProductMCommEscortStrategy;->setRetailerId(Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

.method public onFetchJobSuccess(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 1

    .line 89
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/BaseRetailerMCommEscortStrategy;->onFetchJobSuccess(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 91
    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/android/graphql/product/ProductGraphQLCall;

    if-eqz p1, :cond_0

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/ProductMCommEscortStrategy;->productJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/ProductMCommEscortStrategy;->productJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/product/ProductGraphQLResponse;

    .line 95
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/product/ProductGraphQLResponse;->getProductAsModel()Lcom/ibotta/api/model/ProductModel;

    move-result-object p1

    .line 96
    invoke-interface {p1}, Lcom/ibotta/api/model/ProductModel;->getRetailerId()I

    move-result p1

    .line 98
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/ProductMCommEscortStrategy;->setRetailerId(Ljava/lang/Integer;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    const/4 p1, 0x0

    .line 100
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/strategy/ProductMCommEscortStrategy;->setRetailerId(Ljava/lang/Integer;)V

    :cond_1
    :goto_0
    return-void
.end method
