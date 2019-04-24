.class public Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "CantFindItRetailerPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenter;"
    }
.end annotation


# instance fields
.field private final contentMapper:Lcom/ibotta/android/mappers/ContentMapper;

.field private final contentWithInfoRowReducer:Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;

.field private favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

.field private final favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private offerId:Ljava/lang/Integer;

.field private offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;Lcom/ibotta/android/mappers/ContentMapper;)V
    .locals 0

    .line 71
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 72
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 73
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 74
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    .line 75
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    .line 76
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->contentWithInfoRowReducer:Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;

    .line 77
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->contentMapper:Lcom/ibotta/android/mappers/ContentMapper;

    return-void
.end method

.method private getContentModels()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/ContentModel;",
            ">;"
        }
    .end annotation

    .line 180
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->getRetailerModels()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method private getOfferModel()Lcom/ibotta/api/model/OfferModel;
    .locals 3
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-static {v0}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$azKPsB1ctGZ3dvSzCUt-YIYgIl0;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$azKPsB1ctGZ3dvSzCUt-YIYgIl0;

    .line 186
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->filter(Ljava9/util/function/Predicate;)Ljava9/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$_ar0McGnjai_t8tzpfNAdGQKRcY;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$_ar0McGnjai_t8tzpfNAdGQKRcY;

    .line 187
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v0

    const-class v1, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$wnPK6a78utqLZmsFg-JSVtWLnJo;

    invoke-direct {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$wnPK6a78utqLZmsFg-JSVtWLnJo;-><init>(Ljava/lang/Class;)V

    .line 188
    invoke-virtual {v0, v2}, Ljava9/util/Optional;->filter(Ljava9/util/function/Predicate;)Ljava9/util/Optional;

    move-result-object v0

    const-class v1, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$AqtouhyQq8UcgpXEKZe4yAEaeUk;

    invoke-direct {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$AqtouhyQq8UcgpXEKZe4yAEaeUk;-><init>(Ljava/lang/Class;)V

    .line 189
    invoke-virtual {v0, v2}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$pc1SNbA-jnpUPkyjpo8kHd-ByP0;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$pc1SNbA-jnpUPkyjpo8kHd-ByP0;

    .line 190
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v0

    const/4 v1, 0x0

    .line 191
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/OfferModel;

    return-object v0
.end method

.method private getRetailerModels()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-static {v0}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$P1YgQU1mKq9ZIYqGQB23g03DYUc;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$P1YgQU1mKq9ZIYqGQB23g03DYUc;

    .line 172
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->filter(Ljava9/util/function/Predicate;)Ljava9/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$gH95tpsfqbutWyWoA3Y15RgVcwo;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$gH95tpsfqbutWyWoA3Y15RgVcwo;

    .line 173
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v0

    const-class v1, Lcom/ibotta/api/call/home/HomeResponse;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$1YuOX209RQL7t-K7hZ8tVZ4ChVY;

    invoke-direct {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$1YuOX209RQL7t-K7hZ8tVZ4ChVY;-><init>(Ljava/lang/Class;)V

    .line 174
    invoke-virtual {v0, v2}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$YhCBA8yIOCNo_41WZlcUh2mU_ik;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$YhCBA8yIOCNo_41WZlcUh2mU_ik;

    .line 175
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 176
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private initRetailerRows(Ljava/util/List;Lcom/ibotta/api/model/OfferModel;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Lcom/ibotta/api/model/OfferModel;",
            ")V"
        }
    .end annotation

    .line 117
    new-instance v0, Lcom/ibotta/android/view/retailer/NearbyOfferRetailerModelFilter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-direct {v0, v1, p2}, Lcom/ibotta/android/view/retailer/NearbyOfferRetailerModelFilter;-><init>(Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/model/OfferModel;)V

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/retailer/NearbyOfferRetailerModelFilter;->filter(Ljava/util/List;)V

    .line 120
    new-instance v0, Lcom/ibotta/android/collection/DefaultRetailerModelComparator;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    invoke-direct {v0, v1}, Lcom/ibotta/android/collection/DefaultRetailerModelComparator;-><init>(Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)V

    .line 122
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$CantFindItRetailerPresenterImpl$gBS5MtItiAKLUQQwjvsCbxMPheU;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$CantFindItRetailerPresenterImpl$gBS5MtItiAKLUQQwjvsCbxMPheU;

    .line 123
    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$CantFindItRetailerPresenterImpl$rq-bp_T3FWzrp5TYtnS4eYETYjA;

    invoke-direct {v1, p0, p2}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$CantFindItRetailerPresenterImpl$rq-bp_T3FWzrp5TYtnS4eYETYjA;-><init>(Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;Lcom/ibotta/api/model/OfferModel;)V

    .line 124
    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 125
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->sorted(Ljava/util/Comparator;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$CantFindItRetailerPresenterImpl$mY88dlOm6K3NU7gZobf0oZ4Jm_Y;

    invoke-direct {p2, p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$CantFindItRetailerPresenterImpl$mY88dlOm6K3NU7gZobf0oZ4Jm_Y;-><init>(Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;)V

    .line 126
    invoke-interface {p1, p2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 127
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 129
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->contentWithInfoRowReducer:Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerView;

    .line 130
    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerView;->getPickerInformationString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/ibotta/android/retailer/ContentWithInfoRowReducer;->create(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    .line 129
    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerView;->updateListViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    return-void
.end method

.method static synthetic lambda$initRetailerRows$0(Lcom/ibotta/api/model/RetailerModel;)Z
    .locals 1

    .line 123
    invoke-interface {p0}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object p0

    sget-object v0, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static synthetic lambda$initRetailerRows$1(Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)Z
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p2

    invoke-interface {v0, p1, p2}, Lcom/ibotta/api/helper/offer/OfferHelper;->isAvailableAt(Lcom/ibotta/api/model/OfferModel;I)Z

    move-result p1

    return p1
.end method

.method public static synthetic lambda$initRetailerRows$2(Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/content/RetailerDisplayContent;
    .locals 3

    .line 126
    new-instance v0, Lcom/ibotta/android/content/RetailerDisplayContent;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    sget-object v2, Lcom/ibotta/android/views/content/ContentStyle;->ROW:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-direct {v0, p1, v1, v2}, Lcom/ibotta/android/content/RetailerDisplayContent;-><init>(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/views/content/ContentStyle;)V

    return-object v0
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

    .line 82
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 84
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 85
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 88
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 89
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createOfferCall()Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;

    move-result-object v1

    .line 90
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->offerId:Ljava/lang/Integer;

    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setOfferId(Ljava/lang/Integer;)V

    .line 91
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setIgnoreTargeting(Ljava/lang/Boolean;)V

    .line 92
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setProducts(Ljava/lang/Boolean;)V

    .line 94
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 97
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 98
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 105
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->homeApiJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 106
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->offerJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onFeatureClicked(Lcom/ibotta/api/model/base/Routable;)V
    .locals 0

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 2

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->getRetailerModels()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->newInstance(Ljava/util/List;)Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    .line 112
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->getRetailerModels()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->initRetailerRows(Ljava/util/List;Lcom/ibotta/api/model/OfferModel;)V

    return-void
.end method

.method public onMainButtonClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->onFavoriteClicked(Lcom/ibotta/android/apiandroid/content/ContentId;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)V

    .line 167
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->getRetailerModels()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->initRetailerRows(Ljava/util/List;Lcom/ibotta/api/model/OfferModel;)V

    return-void
.end method

.method public onRetailerLocationsDataSuccess()V
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerView;->finishWithRetailerLocationsResult()V

    return-void
.end method

.method public onRetailerRowClicked(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 3

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerView;

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->offerId:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    invoke-interface {v0, p1, v2, v1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerView;->showRetailerLocationsMap(IZI)V

    return-void
.end method

.method public onRowClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 2

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->contentMapper:Lcom/ibotta/android/mappers/ContentMapper;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->getContentModels()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/mappers/ContentMapper;->getContentModelByContentId(Lcom/ibotta/android/apiandroid/content/ContentId;Ljava/util/List;)Lcom/ibotta/api/model/ContentModel;

    move-result-object v0

    .line 157
    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIdType()I

    move-result p1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    .line 158
    check-cast v0, Lcom/ibotta/api/model/RetailerModel;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->onRetailerRowClicked(Lcom/ibotta/api/model/RetailerModel;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 160
    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->onContentClicked(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;)V

    :goto_0
    return-void
.end method

.method public setOfferId(I)V
    .locals 0

    .line 135
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->offerId:Ljava/lang/Integer;

    return-void
.end method
