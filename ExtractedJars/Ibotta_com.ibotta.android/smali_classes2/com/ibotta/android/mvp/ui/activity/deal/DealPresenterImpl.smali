.class public Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "DealPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/deal/DealView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;"
    }
.end annotation


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

.field private dealByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private dealId:Ljava/lang/String;

.field private dealModel:Lcom/ibotta/api/model/DealModel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/content/card/ContentCardReducer;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 48
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 49
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 50
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 51
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    return-void
.end method

.method private getDealImage(Lcom/ibotta/api/model/DealModel;)Ljava/lang/String;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p1}, Lcom/ibotta/api/model/DealModel;->getImageUrlLarge()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 141
    invoke-interface {p1}, Lcom/ibotta/api/model/DealModel;->getImageUrlLarge()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 142
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p1}, Lcom/ibotta/api/model/DealModel;->getImageUrlSmall()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 143
    invoke-interface {p1}, Lcom/ibotta/api/model/DealModel;->getImageUrlSmall()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 145
    :cond_1
    invoke-interface {p1}, Lcom/ibotta/api/model/DealModel;->getImageUrlThumbnail()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method


# virtual methods
.method public getDealId()Ljava/lang/String;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->dealId:Ljava/lang/String;

    return-object v0
.end method

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

    .line 56
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 58
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->dealByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 59
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->dealId:Ljava/lang/String;

    invoke-interface {v2, v3}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createDealCall(Ljava/lang/String;)Lcom/ibotta/android/graphql/deal/DealGraphQlCall;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->dealByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 62
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v1, :cond_1

    .line 63
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 66
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->dealByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 67
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 74
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->dealByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 75
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    return-void
.end method

.method public onContentImageCardClicked()V
    .locals 2

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->dealModel:Lcom/ibotta/api/model/DealModel;

    if-nez v0, :cond_0

    return-void

    .line 129
    :cond_0
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->getDealImage(Lcom/ibotta/api/model/DealModel;)Ljava/lang/String;

    move-result-object v0

    .line 131
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1, v0}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 132
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/deal/DealView;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/deal/DealView;->showFullScreenImage(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 5

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->dealByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_0

    .line 81
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/deal/DealGraphQlResponse;

    .line 82
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/deal/DealGraphQlResponse;->getDealModel()Lcom/ibotta/api/model/DealModel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->dealModel:Lcom/ibotta/api/model/DealModel;

    .line 85
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->dealModel:Lcom/ibotta/api/model/DealModel;

    if-eqz v1, :cond_1

    .line 86
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 87
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->dealModel:Lcom/ibotta/api/model/DealModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/DealModel;->getRetailerId()I

    move-result v2

    invoke-interface {v1, v0, v2}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    .line 90
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->dealModel:Lcom/ibotta/api/model/DealModel;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    if-eqz v1, :cond_2

    .line 91
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    new-instance v3, Lcom/ibotta/android/content/DealDisplayContent;

    sget-object v4, Lcom/ibotta/android/views/content/ContentStyle;->SPOTLIGHT:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-direct {v3, v0, v1, v4}, Lcom/ibotta/android/content/DealDisplayContent;-><init>(Lcom/ibotta/api/model/DealModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;)V

    .line 92
    invoke-virtual {v2, v3}, Lcom/ibotta/android/content/card/ContentCardReducer;->create(Lcom/ibotta/android/content/DisplayContent;)Lcom/ibotta/android/content/card/ContentCardViewState;

    move-result-object v0

    .line 94
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/deal/DealView;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/deal/DealView;->trackDealView()V

    .line 95
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/deal/DealView;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/deal/DealView;->setupCard(Lcom/ibotta/android/content/card/ContentCardViewState;)V

    goto :goto_0

    .line 97
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/deal/DealView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/deal/DealView;->finish()V

    :goto_0
    return-void
.end method

.method public setDealId(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 104
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->dealId:Ljava/lang/String;

    goto :goto_0

    .line 106
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/deal/DealView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/deal/DealView;->finish()V

    :goto_0
    return-void
.end method
