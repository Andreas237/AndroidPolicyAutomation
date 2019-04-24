.class public Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "RedeemRetailersPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenter;"
    }
.end annotation


# instance fields
.field private customer:Lcom/ibotta/api/model/customer/Customer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final imRedemptionAction:Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;

.field private final imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private offerModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation
.end field

.field private retailerModels:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end field

.field private final retailersReducer:Lcom/ibotta/android/redeem/RedeemRetailersReducer;

.field private selectedOption:Lcom/ibotta/android/view/retailer/RetailerFilterOption;

.field private unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/redeem/RedeemRetailersReducer;)V
    .locals 1

    .line 76
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 63
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->offerModels:Ljava/util/List;

    .line 64
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->retailerModels:Ljava/util/ArrayList;

    .line 65
    invoke-static {}, Lcom/ibotta/android/view/retailer/RetailerFilterOption;->values()[Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    move-result-object p1

    const/4 v0, 0x0

    aget-object p1, p1, v0

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->selectedOption:Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    .line 77
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 78
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 79
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 80
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->imRedemptionAction:Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;

    .line 81
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    .line 82
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 83
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->retailersReducer:Lcom/ibotta/android/redeem/RedeemRetailersReducer;

    return-void
.end method

.method private buildSortedList(Lcom/ibotta/android/view/retailer/RetailerFilterOption;Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/view/retailer/RetailerFilterOption;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 159
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 161
    sget-object p2, Lcom/ibotta/android/view/retailer/RetailerFilterOption;->NEARBY:Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    if-ne p1, p2, :cond_0

    .line 163
    new-instance p2, Lcom/ibotta/android/view/retailer/NearbyRetailerModelFilter;

    invoke-direct {p2}, Lcom/ibotta/android/view/retailer/NearbyRetailerModelFilter;-><init>()V

    invoke-virtual {p2, v0}, Lcom/ibotta/android/view/retailer/NearbyRetailerModelFilter;->filter(Ljava/util/List;)V

    .line 167
    :cond_0
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->createComparator(Lcom/ibotta/android/view/retailer/RetailerFilterOption;Ljava/util/List;)Ljava/util/Comparator;

    move-result-object p1

    .line 168
    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method

.method private createComparator(Lcom/ibotta/android/view/retailer/RetailerFilterOption;Ljava/util/List;)Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/view/retailer/RetailerFilterOption;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)",
            "Ljava/util/Comparator<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 178
    sget-object v0, Lcom/ibotta/android/view/retailer/RetailerFilterOption;->NEARBY:Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    if-ne p1, v0, :cond_0

    .line 179
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    .line 180
    invoke-virtual {p1, p2}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->newInstance(Ljava/util/List;)Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    move-result-object p1

    .line 181
    new-instance p2, Lcom/ibotta/android/collection/DefaultRetailerModelComparator;

    invoke-direct {p2, p1}, Lcom/ibotta/android/collection/DefaultRetailerModelComparator;-><init>(Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)V

    goto :goto_0

    .line 183
    :cond_0
    new-instance p2, Lcom/ibotta/android/collection/AlphaRetailerModelComparator;

    invoke-direct {p2}, Lcom/ibotta/android/collection/AlphaRetailerModelComparator;-><init>()V

    :goto_0
    return-object p2
.end method

.method private createViewStates(Ljava/util/List;)Lcom/ibotta/android/views/redeem/RedeemRetailerViewState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)",
            "Lcom/ibotta/android/views/redeem/RedeemRetailerViewState;"
        }
    .end annotation

    .line 190
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 191
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->retailersReducer:Lcom/ibotta/android/redeem/RedeemRetailersReducer;

    invoke-virtual {p1}, Lcom/ibotta/android/redeem/RedeemRetailersReducer;->createEmpty()Lcom/ibotta/android/views/redeem/RedeemRetailerViewState;

    move-result-object p1

    return-object p1

    .line 193
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->retailersReducer:Lcom/ibotta/android/redeem/RedeemRetailersReducer;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/redeem/RedeemRetailersReducer;->create(Ljava/util/List;)Lcom/ibotta/android/views/redeem/RedeemRetailerViewState;

    move-result-object p1

    return-object p1
.end method

.method private getRetailerModelForId(I)Lcom/ibotta/api/model/RetailerModel;
    .locals 2

    .line 219
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->retailerModels:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/-$$Lambda$RedeemRetailersPresenterImpl$l46DnREZWe_shIHjHqvVZDKLiqo;

    invoke-direct {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/-$$Lambda$RedeemRetailersPresenterImpl$l46DnREZWe_shIHjHqvVZDKLiqo;-><init>(I)V

    .line 220
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 221
    invoke-interface {p1}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object p1

    .line 222
    invoke-virtual {p1}, Ljava9/util/Optional;->orElseThrow()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/RetailerModel;

    return-object p1
.end method

.method static synthetic lambda$getRetailerModelForId$0(ILcom/ibotta/api/model/RetailerModel;)Z
    .locals 0

    .line 220
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p1

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private showRedeemScreen(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 226
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->offerModels:Ljava/util/List;

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;->showRedeemScreen(Lcom/ibotta/api/model/RetailerModel;Ljava/util/List;)V

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

    .line 88
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 90
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 91
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 94
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 95
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createUnlockedOffersCall()Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;

    move-result-object v1

    const v3, 0x7fffffff

    .line 96
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->setLimit(Ljava/lang/Integer;)V

    .line 97
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->setProducts(Ljava/lang/Boolean;)V

    .line 99
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 102
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_2

    .line 103
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 106
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 107
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 108
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 115
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 116
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 117
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 4

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    goto/16 :goto_0

    .line 128
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;

    .line 130
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;->showNoUnlocks()V

    return-void

    .line 135
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v1}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/call/home/HomeResponse;

    .line 136
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    .line 137
    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v2

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    .line 139
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v1}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->retailerModels:Ljava/util/ArrayList;

    .line 140
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->offerModels:Ljava/util/List;

    .line 142
    new-instance v0, Lcom/ibotta/android/view/retailer/UnlockedRetailerModelFilter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->offerModels:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/view/retailer/UnlockedRetailerModelFilter;-><init>(Lcom/ibotta/api/helper/offer/OfferHelper;Ljava/util/List;)V

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->retailerModels:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/retailer/UnlockedRetailerModelFilter;->filter(Ljava/util/List;)V

    .line 144
    sget-object v0, Lcom/ibotta/android/view/retailer/RetailerFilterOption;->NEARBY:Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->retailerModels:Ljava/util/ArrayList;

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->buildSortedList(Lcom/ibotta/android/view/retailer/RetailerFilterOption;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 145
    sget-object v1, Lcom/ibotta/android/view/retailer/RetailerFilterOption;->ALL:Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->retailerModels:Ljava/util/ArrayList;

    invoke-direct {p0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->buildSortedList(Lcom/ibotta/android/view/retailer/RetailerFilterOption;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 147
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->createViewStates(Ljava/util/List;)Lcom/ibotta/android/views/redeem/RedeemRetailerViewState;

    move-result-object v0

    .line 148
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->createViewStates(Ljava/util/List;)Lcom/ibotta/android/views/redeem/RedeemRetailerViewState;

    move-result-object v1

    .line 150
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;

    invoke-interface {v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;->removeAllTabs()V

    .line 151
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;

    const/4 v3, 0x0

    invoke-interface {v2, v3, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;->addTabViewState(ILcom/ibotta/android/views/redeem/RedeemRetailerViewState;)V

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;

    const/4 v2, 0x1

    invoke-interface {v0, v2, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;->addTabViewState(ILcom/ibotta/android/views/redeem/RedeemRetailerViewState;)V

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->selectedOption:Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;->selectTab(Lcom/ibotta/android/view/retailer/RetailerFilterOption;)V

    return-void

    .line 123
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;->finish()V

    return-void
.end method

.method public onNoUnlocksOkClicked()V
    .locals 1

    .line 231
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;->finish()V

    return-void
.end method

.method public onRetailerBound(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V
    .locals 0

    return-void
.end method

.method public onRetailerClicked(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V
    .locals 3

    .line 205
    invoke-virtual {p1}, Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;->getId()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->getRetailerModelForId(I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->shouldShowImRedeem(Lcom/ibotta/api/model/customer/Customer;Lcom/ibotta/api/model/RetailerModel;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->imRedemptionAction:Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->offerModels:Ljava/util/List;

    invoke-interface {v0, p1, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionAction;->onImRetailerTapped(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/customer/Customer;Ljava/util/List;)V

    goto :goto_0

    .line 209
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->showRedeemScreen(Lcom/ibotta/api/model/RetailerModel;)V

    :goto_0
    return-void
.end method

.method public onTabSelected(Lcom/ibotta/android/view/retailer/RetailerFilterOption;)V
    .locals 1

    .line 199
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->selectedOption:Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    .line 200
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPresenterImpl;->selectedOption:Lcom/ibotta/android/view/retailer/RetailerFilterOption;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersView;->selectTab(Lcom/ibotta/android/view/retailer/RetailerFilterOption;)V

    return-void
.end method
