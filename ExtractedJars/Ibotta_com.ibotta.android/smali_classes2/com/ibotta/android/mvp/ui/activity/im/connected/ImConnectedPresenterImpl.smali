.class public Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "ImConnectedPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenter;"
    }
.end annotation


# instance fields
.field private final apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final contentModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/ContentModel;",
            ">;"
        }
    .end annotation
.end field

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final reducer:Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private retailerId:I

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

.field private final vc:Lcom/ibotta/android/views/components/ViewComponent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewEvents;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/views/components/ViewComponent;Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewEvents;",
            ">;",
            "Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            "Lcom/ibotta/android/service/api/job/ApiJobFactory;",
            ")V"
        }
    .end annotation

    .line 62
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 63
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->vc:Lcom/ibotta/android/views/components/ViewComponent;

    .line 64
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->reducer:Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;

    .line 65
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 66
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 67
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 68
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 69
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    .line 70
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->contentModels:Ljava/util/List;

    return-void
.end method

.method private getOffersFromContents()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->contentModels:Ljava/util/List;

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    const-class v1, Lcom/ibotta/api/model/OfferModel;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/im/connected/-$$Lambda$nYZv83cll07Tbe7gx7zUhqAUC2w;

    invoke-direct {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/-$$Lambda$nYZv83cll07Tbe7gx7zUhqAUC2w;-><init>(Ljava/lang/Class;)V

    .line 166
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    const-class v1, Lcom/ibotta/api/model/OfferModel;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/im/connected/-$$Lambda$elHEw8NfYf6GuXpfd9TiSXebkqw;

    invoke-direct {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/-$$Lambda$elHEw8NfYf6GuXpfd9TiSXebkqw;-><init>(Ljava/lang/Class;)V

    .line 167
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 168
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private updateViewState()V
    .locals 2

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->reducer:Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedReducer;->create(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;

    move-result-object v0

    .line 160
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->vc:Lcom/ibotta/android/views/components/ViewComponent;

    invoke-interface {v1, v0}, Lcom/ibotta/android/views/components/ViewComponent;->updateViewState(Lcom/ibotta/android/views/components/ViewState;)V

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

    .line 82
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 84
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v1, :cond_0

    .line 85
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createHomeApiJob(I)Lcom/ibotta/android/service/api/job/HomeApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 87
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 88
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createOffersCall()Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;

    move-result-object v1

    .line 89
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    invoke-interface {v2, v1}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 92
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 93
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 100
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 101
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onContactIbottaCareTapped()V
    .locals 2
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/config/AppConfig;->getLoyaltyCardLink()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;->showWebView(Ljava/lang/String;)V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 3

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v0, :cond_0

    .line 107
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v2, "homeJob should not be null"

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;->finish()V

    return-void

    .line 111
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 112
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v2, "offersJob should not be null"

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;->finish()V

    return-void

    .line 118
    :cond_1
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 120
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v0

    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->retailerId:I

    invoke-interface {v1, v0, v2}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    .line 121
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    invoke-interface {v1, v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;->toRetailerParcel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 124
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    .line 125
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->contentModels:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 126
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->contentModels:Ljava/util/List;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->getOffers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 128
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->updateViewState()V

    return-void
.end method

.method public onUploadReceiptTapped()V
    .locals 3
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 133
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 137
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-nez v0, :cond_1

    .line 138
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "retailerParcel should not be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    return-void

    .line 145
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->getOffersFromContents()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedView;->showRedeem(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)V

    return-void
.end method

.method public onViewsBound()V
    .locals 1

    .line 75
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onViewsBound()V

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->vc:Lcom/ibotta/android/views/components/ViewComponent;

    invoke-interface {v0, p0}, Lcom/ibotta/android/views/components/ViewComponent;->bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V

    .line 77
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->updateViewState()V

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 155
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedPresenterImpl;->retailerId:I

    return-void
.end method
