.class public Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "MyOffersGalleryPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;
.implements Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewEvents;"
    }
.end annotation


# instance fields
.field private final apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

.field private final apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

.field private final cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

.field private customer:Lcom/ibotta/api/model/customer/Customer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private editing:Z

.field private final eventChain:Lcom/ibotta/android/tracking/proprietary/event/EventChain;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

.field private final ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

.field private imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

.field private final imRedemptionAction:Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;

.field private final imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

.field private mobileOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final myOffersGalleryReducer:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;

.field private offerCategoryModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field private final retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

.field private selectedCategoryId:Ljava/lang/Integer;

.field private selectedOfferModelIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private unlockedOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final userState:Lcom/ibotta/android/state/user/UserState;

.field private final verificationManager:Lcom/ibotta/android/verification/VerificationManager;

.field private final viewComponent:Lcom/ibotta/android/views/components/ViewComponent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewEvents;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/views/components/ViewComponent;Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/api/call/ApiCallFactory;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewEvents;",
            ">;",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;",
            "Lcom/ibotta/android/state/user/UserState;",
            "Lcom/ibotta/android/verification/VerificationManager;",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            "Lcom/ibotta/android/service/api/job/ApiJobFactory;",
            "Lcom/ibotta/api/call/ApiCallFactory;",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
            "Lcom/ibotta/android/service/api/job/CacheClearJobFactory;",
            ")V"
        }
    .end annotation

    .line 100
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 79
    new-instance p1, Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    invoke-direct {p1}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->eventChain:Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    .line 82
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->selectedOfferModelIds:Ljava/util/Set;

    .line 83
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->offerCategoryModels:Ljava/util/List;

    .line 101
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 102
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 103
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->viewComponent:Lcom/ibotta/android/views/components/ViewComponent;

    .line 104
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->myOffersGalleryReducer:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;

    .line 105
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 106
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    .line 107
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    .line 108
    iput-object p9, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    .line 109
    iput-object p10, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

    .line 110
    iput-object p11, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 111
    iput-object p12, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->imRedemptionAction:Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;

    .line 112
    iput-object p13, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 113
    iput-object p14, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;)Ljava/util/Set;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->selectedOfferModelIds:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;)Lcom/ibotta/android/graphql/cache/IbottaApolloCache;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;)Lcom/ibotta/android/service/api/job/CacheClearJobFactory;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    return-object p0
.end method

.method static synthetic access$300(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;)Lcom/ibotta/android/verification/VerificationManager;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    return-object p0
.end method

.method static synthetic access$400(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;)Lcom/ibotta/android/mvp/base/MvpView;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    return-object p0
.end method

.method static synthetic access$500(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;)Lcom/ibotta/android/mvp/base/MvpView;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    return-object p0
.end method

.method static synthetic access$600(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;)Lcom/ibotta/android/mvp/base/MvpView;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    return-object p0
.end method

.method static synthetic access$700(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;)V
    .locals 0

    .line 53
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->reload()V

    return-void
.end method

.method static synthetic access$800(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;)Lcom/ibotta/android/mvp/base/MvpView;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    return-object p0
.end method

.method private getAllOfferModels()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 225
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 226
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->offerCategoryModels:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/OfferCategoryModel;

    .line 227
    invoke-interface {v2}, Lcom/ibotta/api/model/OfferCategoryModel;->getOffers()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private getCredentialIntegrations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/im/CredentialIntegration;",
            ">;"
        }
    .end annotation

    .line 237
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getCredentialIntegrations()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    return-object v0
.end method

.method private getImConnectionStatusForRetailer()Lcom/ibotta/api/model/im/ImConnectionStatus;
    .locals 3

    .line 233
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->getCredentialIntegrations()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->getImConnectionStatusForRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)Lcom/ibotta/api/model/im/ImConnectionStatus;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$onRemoveConfirmed$0(Lcom/ibotta/api/model/OfferCategoryModel;)I
    .locals 0

    .line 296
    invoke-interface {p0}, Lcom/ibotta/api/model/OfferCategoryModel;->getOffers()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method private showRedemptionFlow()V
    .locals 4

    .line 217
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->shouldShowImRedeem(Lcom/ibotta/api/model/customer/Customer;Lcom/ibotta/api/model/RetailerModel;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->imRedemptionAction:Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->getAllOfferModels()Ljava/util/List;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;->onImRetailerTapped(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/customer/Customer;Ljava/util/List;)V

    goto :goto_0

    .line 220
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->getAllOfferModels()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;->showRedeem(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method private updateViewState()V
    .locals 8

    .line 404
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->myOffersGalleryReducer:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->offerCategoryModels:Ljava/util/List;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->selectedCategoryId:Ljava/lang/Integer;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->eventChain:Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    invoke-virtual/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->create(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/customer/Customer;Lcom/ibotta/api/model/im/ImConnectionStatus;Ljava/util/List;Ljava/lang/Integer;Lcom/ibotta/android/tracking/proprietary/event/EventChain;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;

    move-result-object v0

    .line 413
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->viewComponent:Lcom/ibotta/android/views/components/ViewComponent;

    invoke-interface {v1, v0}, Lcom/ibotta/android/views/components/ViewComponent;->updateViewState(Lcom/ibotta/android/views/components/ViewState;)V

    return-void
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 125
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 127
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v1, :cond_0

    .line 128
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createHomeApiJob(I)Lcom/ibotta/android/service/api/job/HomeApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 131
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 132
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 133
    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    invoke-interface {v2, v3}, Lcom/ibotta/api/call/ApiCallFactory;->createCustomerByIdCall(I)Lcom/ibotta/api/call/customer/CustomerByIdCall;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 136
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->unlockedOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    const/4 v2, 0x1

    const v3, 0x7fffffff

    if-nez v1, :cond_2

    .line 137
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createUnlockedOfferCategoriesCall()Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;

    move-result-object v1

    .line 138
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v4}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->setRetailerId(Ljava/lang/Integer;)V

    .line 139
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->setLimit(Ljava/lang/Integer;)V

    .line 140
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->setContentMin(Ljava/lang/Integer;)V

    .line 141
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->setContentMax(Ljava/lang/Integer;)V

    .line 142
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->setProducts(Ljava/lang/Boolean;)V

    .line 144
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    invoke-interface {v4, v1}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->unlockedOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 147
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mobileOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_3

    .line 148
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createMobileOffersByCategoriesCall()Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;

    move-result-object v1

    .line 149
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v4}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->setRetailerId(Ljava/lang/Integer;)V

    .line 150
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->setCategoryLimit(Ljava/lang/Integer;)V

    .line 151
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->setContentMax(Ljava/lang/Integer;)V

    .line 152
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->setProducts(Ljava/lang/Boolean;)V

    .line 154
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    invoke-interface {v2, v1}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mobileOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 157
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 158
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 160
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v1

    sget-object v2, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-ne v1, v2, :cond_4

    .line 161
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mobileOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 163
    :cond_4
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->unlockedOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :goto_0
    return-object v0
.end method

.method public getSelectedItemsList()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 395
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->selectedOfferModelIds:Ljava/util/Set;

    return-object v0
.end method

.method public getSelectedItemsListSize()I
    .locals 1

    .line 390
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->selectedOfferModelIds:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    return v0
.end method

.method public isEditing()Z
    .locals 1

    .line 400
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->editing:Z

    return v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 171
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 172
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 173
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mobileOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 174
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->unlockedOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onBackClicked()V
    .locals 1

    .line 428
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->editing:Z

    if-eqz v0, :cond_0

    .line 429
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->onCancelEditing()V

    goto :goto_0

    .line 431
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;->navigateBack()V

    :goto_0
    return-void
.end method

.method public onCancelEditing()V
    .locals 2

    .line 288
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->selectedOfferModelIds:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    const/4 v0, 0x0

    .line 289
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->editing:Z

    .line 290
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->editing:Z

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;->setEditing(Z)V

    return-void
.end method

.method public onEditClicked()V
    .locals 2

    const/4 v0, 0x1

    .line 257
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->editing:Z

    .line 258
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->editing:Z

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;->setEditing(Z)V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 4

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 180
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->customerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    .line 182
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->offerCategoryModels:Ljava/util/List;

    .line 184
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v2

    sget-object v3, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-ne v2, v3, :cond_0

    .line 185
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mobileOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 186
    invoke-virtual {v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLResponse;

    .line 187
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->offerCategoryModels:Ljava/util/List;

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLResponse;->getOfferCategoriesAsModels()Ljava/util/List;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 189
    :cond_0
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->unlockedOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 190
    invoke-virtual {v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLResponse;

    .line 191
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->offerCategoryModels:Ljava/util/List;

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLResponse;->getOfferCategoriesAsModels()Ljava/util/List;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 194
    :goto_0
    invoke-virtual {v1}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    .line 196
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v2

    invoke-interface {v1, v0, v2}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;->toRetailerParcel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 198
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->getImConnectionStatusForRetailer()Lcom/ibotta/api/model/im/ImConnectionStatus;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v1

    sget-object v2, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-eq v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;->setEditAllowed(Z)V

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->editing:Z

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;->setEditing(Z)V

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->eventChain:Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->setEventContributor(Lcom/ibotta/android/tracking/proprietary/event/EventContributor;)V

    .line 204
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->updateViewState()V

    return-void
.end method

.method public onFindRebatesClicked()V
    .locals 1

    .line 351
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;->showFindRebates()V

    return-void
.end method

.method public onHeaderBuyIgcClicked()V
    .locals 3

    .line 369
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;->showPwiFlow(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/android/apiandroid/content/ContentId;)V

    return-void
.end method

.method public onHeaderImCardClicked()V
    .locals 4

    .line 381
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    if-nez v0, :cond_0

    return-void

    .line 385
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->imRedemptionAction:Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->getAllOfferModels()Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v2, v0, v3}, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;->onImRetailerTapped(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/customer/Customer;Ljava/util/List;)V

    return-void
.end method

.method public onHeaderLoyaltyCardClicked()V
    .locals 3

    .line 374
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/common/VerificationType;->isLoyalty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 375
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->getAllOfferModels()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;->showRedeem(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public onHeaderRedeemClicked()V
    .locals 3

    .line 356
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 360
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/common/VerificationType;->isLoyalty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 361
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->getAllOfferModels()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;->showRedeemLoyaltyReceipt(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)V

    goto :goto_0

    .line 363
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->getAllOfferModels()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;->showRedeem(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public onMyRebatesSelectionChanged(Ljava/lang/Integer;)V
    .locals 1

    .line 279
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->selectedOfferModelIds:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 280
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->selectedOfferModelIds:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 282
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->selectedOfferModelIds:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public onNavRedeemClicked()V
    .locals 1

    .line 209
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->isLoading()Z

    move-result v0

    if-nez v0, :cond_0

    .line 210
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->showRedemptionFlow()V

    goto :goto_0

    .line 212
    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onNavRedeemClicked()V

    :goto_0
    return-void
.end method

.method public onOptionsItemSelected()Z
    .locals 1

    .line 418
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->editing:Z

    if-eqz v0, :cond_0

    .line 419
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->onCancelEditing()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onRemoveClicked()V
    .locals 2

    const/4 v0, 0x0

    .line 263
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->editing:Z

    .line 265
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->selectedOfferModelIds:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 266
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->selectedOfferModelIds:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;->showRemoveConfirmation(I)V

    goto :goto_0

    .line 268
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->editing:Z

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;->setEditing(Z)V

    :goto_0
    return-void
.end method

.method public onRemoveConfirmed()V
    .locals 5

    .line 296
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->offerCategoryModels:Ljava/util/List;

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryPresenterImpl$l3ja0ca4mnro0vJPH6o9hOWz_K4;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryPresenterImpl$l3ja0ca4mnro0vJPH6o9hOWz_K4;

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->mapToInt(Ljava9/util/function/ToIntFunction;)Ljava9/util/stream/IntStream;

    move-result-object v0

    invoke-interface {v0}, Ljava9/util/stream/IntStream;->sum()I

    move-result v0

    .line 298
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->selectedOfferModelIds:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 299
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    .line 300
    new-instance v2, Lcom/ibotta/api/call/offer/CustomerOffersDeactivateManyCall;

    new-instance v3, Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->selectedOfferModelIds:Ljava/util/Set;

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {v2, v1, v3}, Lcom/ibotta/api/call/offer/CustomerOffersDeactivateManyCall;-><init>(ILjava/util/List;)V

    .line 303
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$1;

    invoke-direct {v1, p0, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;Lcom/ibotta/api/ApiCall;)V

    .line 327
    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$2;

    invoke-direct {v2, p0, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;Z)V

    invoke-virtual {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 346
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method public onViewMyRebateClicked(ILjava/lang/Integer;)V
    .locals 3
    .param p2    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 274
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;

    const/4 v1, 0x1

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput p1, v1, v2

    const/4 p1, 0x0

    invoke-interface {v0, p2, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryView;->showOfferSpotlight(Ljava/lang/Integer;Ljava/lang/Integer;[I)V

    return-void
.end method

.method public onViewsBound()V
    .locals 1

    .line 118
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onViewsBound()V

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->viewComponent:Lcom/ibotta/android/views/components/ViewComponent;

    invoke-interface {v0, p0}, Lcom/ibotta/android/views/components/ViewComponent;->bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V

    .line 120
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->updateViewState()V

    return-void
.end method

.method public setImConnectionStatus(Lcom/ibotta/api/model/im/ImConnectionStatus;)V
    .locals 0

    .line 247
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

    return-void
.end method

.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    .line 242
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-void
.end method

.method public setSelectedCategoryId(Ljava/lang/Integer;)V
    .locals 0

    .line 252
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPresenterImpl;->selectedCategoryId:Ljava/lang/Integer;

    return-void
.end method
