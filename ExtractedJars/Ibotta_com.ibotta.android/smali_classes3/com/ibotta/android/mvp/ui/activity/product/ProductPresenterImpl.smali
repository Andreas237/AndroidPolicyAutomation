.class public Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "ProductPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/product/ProductView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenter;"
    }
.end annotation


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private productId:Ljava/lang/String;

.field private productJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private productModel:Lcom/ibotta/api/model/ProductModel;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;

.field private final retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 50
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 51
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 52
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 53
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 54
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    return-void
.end method

.method private initProduct()V
    .locals 2

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/product/ProductView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/product/ProductView;->setProduct(Lcom/ibotta/api/model/ProductModel;)V

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

    .line 103
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 105
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->productJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 106
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createProductCall()Lcom/ibotta/android/graphql/product/ProductGraphQLCall;

    move-result-object v1

    .line 107
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->productId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/product/ProductGraphQLCall;->setProductId(Ljava/lang/String;)V

    .line 109
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->productJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 111
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v1, :cond_1

    .line 112
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 115
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->productJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 116
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 123
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->productJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 124
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 3

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->productJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/product/ProductGraphQLResponse;

    .line 130
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/product/ProductGraphQLResponse;->getProductAsModel()Lcom/ibotta/api/model/ProductModel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->productModel:Lcom/ibotta/api/model/ProductModel;

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->productModel:Lcom/ibotta/api/model/ProductModel;

    if-nez v0, :cond_0

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/product/ProductView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/product/ProductView;->showProductNotFound()V

    return-void

    .line 137
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 138
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 139
    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/ProductModel;->getRetailerId()I

    move-result v2

    .line 138
    invoke-interface {v1, v0, v2}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/product/ProductView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v1, v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;->toRetailerParcel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/product/ProductView;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 143
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->initProduct()V

    return-void
.end method

.method public onProductImageCardClicked()V
    .locals 3

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->productModel:Lcom/ibotta/api/model/ProductModel;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 90
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/api/model/ProductModel;->getImageUrlLarge()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/ProductModel;->getImageUrlLarge()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 92
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/ProductModel;->getImageUrlSmall()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->productModel:Lcom/ibotta/api/model/ProductModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/ProductModel;->getImageUrlSmall()Ljava/lang/String;

    move-result-object v1

    :cond_2
    :goto_0
    if-eqz v1, :cond_3

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/product/ProductView;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/product/ProductView;->showFullScreenImage(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public onProductNotFoundDisplayed()V
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/product/ProductView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/product/ProductView;->finish()V

    return-void
.end method

.method public onShopClicked()V
    .locals 2

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->productModel:Lcom/ibotta/api/model/ProductModel;

    if-nez v0, :cond_0

    return-void

    .line 68
    :cond_0
    instance-of v0, v0, Lcom/ibotta/api/model/content/ProductContent;

    if-eqz v0, :cond_1

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/product/ProductView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/product/ProductView;->trackProductShop()V

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->productModel:Lcom/ibotta/api/model/ProductModel;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-super {p0, v0, v1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    goto :goto_0

    :cond_1
    const-string v0, "Cannot support Shop action without a ProductModel that supports a String ID"

    const/4 v1, 0x0

    .line 73
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public setProductId(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/product/ProductPresenterImpl;->productId:Ljava/lang/String;

    return-void
.end method
