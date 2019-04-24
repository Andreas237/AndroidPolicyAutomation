.class public Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "ContentDetailPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;"
    }
.end annotation


# instance fields
.field private contentByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

.field private contentId:Lcom/ibotta/android/apiandroid/content/ContentId;

.field private contentModel:Lcom/ibotta/api/model/ContentModel;
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


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/content/card/ContentCardReducer;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 49
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 50
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 51
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    return-void
.end method

.method private getContentModelFromApiResponse(Lcom/ibotta/api/ApiResponse;)Lcom/ibotta/api/model/ContentModel;
    .locals 2

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->contentId:Lcom/ibotta/android/apiandroid/content/ContentId;

    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIdType()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 110
    check-cast p1, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;->getBuyableGiftCard()Lcom/ibotta/api/model/content/BuyableGiftCardContent;

    move-result-object p1

    return-object p1

    .line 114
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid ContentId Type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->contentId:Lcom/ibotta/android/apiandroid/content/ContentId;

    invoke-virtual {v1}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIdType()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private getRetailerModelForContentModel(Lcom/ibotta/api/call/home/HomeResponse;Lcom/ibotta/api/model/ContentModel;)Lcom/ibotta/api/model/RetailerModel;
    .locals 2

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->contentId:Lcom/ibotta/android/apiandroid/content/ContentId;

    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIdType()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 125
    check-cast p2, Lcom/ibotta/api/model/BuyableGiftCardModel;

    invoke-interface {p2}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRetailerId()I

    move-result p2

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-virtual {p1}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    return-object p1

    .line 129
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid ContentId Type: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->contentId:Lcom/ibotta/android/apiandroid/content/ContentId;

    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIdType()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public getContentId()Lcom/ibotta/android/apiandroid/content/ContentId;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->contentId:Lcom/ibotta/android/apiandroid/content/ContentId;

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
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->contentByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 59
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->contentId:Lcom/ibotta/android/apiandroid/content/ContentId;

    invoke-interface {v2, v3}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createContentByIdCall(Lcom/ibotta/android/apiandroid/content/ContentId;)Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->contentByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 62
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v1, :cond_1

    .line 63
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 66
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->contentByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 67
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

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
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->contentByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 75
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    return-void
.end method

.method public onContentImageCardClicked()V
    .locals 3

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->contentModel:Lcom/ibotta/api/model/ContentModel;

    if-nez v0, :cond_0

    return-void

    .line 163
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    const/4 v2, 0x1

    invoke-super {p0, v0, v1, v2}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onContentImageCardClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;Z)V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 5

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->contentByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_0

    .line 81
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->getContentModelFromApiResponse(Lcom/ibotta/api/ApiResponse;)Lcom/ibotta/api/model/ContentModel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->contentModel:Lcom/ibotta/api/model/ContentModel;

    .line 84
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->contentModel:Lcom/ibotta/api/model/ContentModel;

    if-eqz v1, :cond_1

    .line 85
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 86
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->contentModel:Lcom/ibotta/api/model/ContentModel;

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->getRetailerModelForContentModel(Lcom/ibotta/api/call/home/HomeResponse;Lcom/ibotta/api/model/ContentModel;)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    .line 89
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->contentModel:Lcom/ibotta/api/model/ContentModel;

    if-eqz v0, :cond_2

    .line 91
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->contentCardReducer:Lcom/ibotta/android/content/card/ContentCardReducer;

    new-instance v2, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;

    check-cast v0, Lcom/ibotta/api/model/BuyableGiftCardModel;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    sget-object v4, Lcom/ibotta/android/views/content/ContentStyle;->SPOTLIGHT:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-direct {v2, v0, v3, v4}, Lcom/ibotta/android/content/BuyableGiftCardDisplayContent;-><init>(Lcom/ibotta/api/model/BuyableGiftCardModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;)V

    invoke-virtual {v1, v2}, Lcom/ibotta/android/content/card/ContentCardReducer;->create(Lcom/ibotta/android/content/DisplayContent;)Lcom/ibotta/android/content/card/ContentCardViewState;

    move-result-object v0

    .line 95
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailView;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailView;->setupCard(Lcom/ibotta/android/content/card/ContentCardViewState;)V

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    if-eqz v0, :cond_3

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailView;->setupButton(Ljava/lang/String;)V

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->contentModel:Lcom/ibotta/api/model/ContentModel;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailView;->setupDetails(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    goto :goto_0

    .line 101
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailView;->finish()V

    :cond_3
    :goto_0
    return-void
.end method

.method public onPayAtRetailerClicked()V
    .locals 2

    .line 168
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->contentModel:Lcom/ibotta/api/model/ContentModel;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-super {p0, v0, v1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onShopClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public setContentId(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/apiandroid/content/ContentId;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 138
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->contentId:Lcom/ibotta/android/apiandroid/content/ContentId;

    goto :goto_0

    .line 140
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailView;->finish()V

    :goto_0
    return-void
.end method
