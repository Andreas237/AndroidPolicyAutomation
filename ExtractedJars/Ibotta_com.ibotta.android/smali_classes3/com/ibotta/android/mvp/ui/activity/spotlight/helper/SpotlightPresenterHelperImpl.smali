.class public Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;
.super Ljava/lang/Object;
.source "SpotlightPresenterHelperImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final bonusBucketedComparator:Lcom/ibotta/android/collection/BonusBucketedComparator;

.field private final bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;

.field private customRebateRewardMessage:Ljava/lang/String;

.field private newRebateRewarded:Z

.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private offerIds:[I

.field private offerModel:Lcom/ibotta/api/model/OfferModel;

.field private rebateRewarded:Z

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private retailerId:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/bonus/BonusHelper;Lcom/ibotta/android/collection/BonusBucketedComparator;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 53
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 54
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 55
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;

    .line 56
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->bonusBucketedComparator:Lcom/ibotta/android/collection/BonusBucketedComparator;

    return-void
.end method

.method public static synthetic lambda$LlFzzPU_r1AgWSgkz8GmCNn7Q1c(Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;Lcom/ibotta/api/model/RetailerModel;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerAvailableAtRetailerAndNearby(Lcom/ibotta/api/model/RetailerModel;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$getRelatedBonuses$0(Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;Ljava/util/List;Ljava/lang/Integer;)Lcom/ibotta/api/model/BonusModel;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {v0, p1, p2}, Lcom/ibotta/api/helper/bonus/BonusHelper;->findBonusById(Ljava/util/List;I)Lcom/ibotta/api/model/BonusModel;

    move-result-object p1

    return-object p1
.end method

.method static synthetic lambda$getRelatedBonuses$1(Lcom/ibotta/api/model/BonusModel;)Z
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private offerAvailableAtRetailerAndNearby(Lcom/ibotta/api/model/RetailerModel;)Z
    .locals 6

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v0

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v3

    if-ne v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 136
    :goto_0
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v5

    invoke-interface {v3, v4, v5}, Lcom/ibotta/api/helper/offer/OfferHelper;->isAvailableAt(Lcom/ibotta/api/model/OfferModel;I)Z

    move-result v3

    .line 137
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-interface {v4, p1}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->isWithinReach(Lcom/ibotta/api/model/RetailerModel;)Z

    move-result p1

    if-nez v0, :cond_1

    if-eqz v3, :cond_1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1
.end method


# virtual methods
.method public getAlsoBoughtOffers(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;)Ljava/util/LinkedHashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;",
            ")",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/api/model/OfferModel;",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 86
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    .line 87
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 89
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OfferModel;

    .line 90
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-virtual {v0, v1, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public getAvailableAtRetailerList(Lcom/ibotta/api/call/home/HomeResponse;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/call/home/HomeResponse;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 116
    invoke-virtual {p1}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object p1

    .line 117
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 119
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->isHideAvailableAt()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->isNonItem()Z

    move-result v1

    if-nez v1, :cond_0

    .line 120
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/-$$Lambda$SpotlightPresenterHelperImpl$LlFzzPU_r1AgWSgkz8GmCNn7Q1c;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/-$$Lambda$SpotlightPresenterHelperImpl$LlFzzPU_r1AgWSgkz8GmCNn7Q1c;-><init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;)V

    .line 121
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/collection/RetailerWeightComparator;

    invoke-direct {v0}, Lcom/ibotta/android/collection/RetailerWeightComparator;-><init>()V

    .line 122
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->sorted(Ljava/util/Comparator;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 123
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/List;

    :cond_0
    return-object v0
.end method

.method public getCheckProduct(Lcom/ibotta/api/rules/ScanRules;)Z
    .locals 2

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {v1, v0}, Lcom/ibotta/api/helper/offer/OfferHelper;->isPercentBackType(Lcom/ibotta/api/model/OfferModel;)Z

    move-result v1

    invoke-interface {p1, v0, v1}, Lcom/ibotta/api/rules/ScanRules;->isCheckProductSupported(Lcom/ibotta/api/model/OfferModel;Z)Z

    move-result p1

    return p1
.end method

.method public getCustomRebateRewardMessage()Ljava/lang/String;
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->customRebateRewardMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getOfferIdIntegers()[Ljava/lang/Integer;
    .locals 4

    .line 212
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerIds:[I

    array-length v0, v0

    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, 0x0

    .line 213
    :goto_0
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerIds:[I

    array-length v3, v2

    if-ge v1, v3, :cond_0

    .line 214
    aget v2, v2, v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public getOfferIds()[I
    .locals 1

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerIds:[I

    return-object v0
.end method

.method public getOfferImageUrl()Ljava/lang/String;
    .locals 2

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getLargeUrl()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getLargeUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 181
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/AppHelper;->getBestOfferImgUrl(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOfferModel()Lcom/ibotta/api/model/OfferModel;
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    return-object v0
.end method

.method public getRelatedBonuses(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getBonusIds()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getBonusIds()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/-$$Lambda$SpotlightPresenterHelperImpl$-6Fz7lvu4n6c7PqDb5krtt3265Y;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/-$$Lambda$SpotlightPresenterHelperImpl$-6Fz7lvu4n6c7PqDb5krtt3265Y;-><init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;Ljava/util/List;)V

    .line 103
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/-$$Lambda$SpotlightPresenterHelperImpl$UWZHmXe7E26COW67_Hws3b3GnxE;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/-$$Lambda$SpotlightPresenterHelperImpl$UWZHmXe7E26COW67_Hws3b3GnxE;

    .line 104
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->bonusBucketedComparator:Lcom/ibotta/android/collection/BonusBucketedComparator;

    .line 105
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->sorted(Ljava/util/Comparator;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 106
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->retailerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
    .locals 1

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-object v0
.end method

.method public handleProductOffersResponse(Lcom/ibotta/android/service/api/job/SingleApiJob;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/appcache/AppCache;Ljava/lang/String;)V
    .locals 2

    .line 158
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/offer/OfferProductsResponse;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 160
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/offer/OfferProductsResponse;

    invoke-virtual {p1}, Lcom/ibotta/api/call/offer/OfferProductsResponse;->getOfferProducts()Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/offer/OfferProducts;

    if-eqz p1, :cond_0

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v0

    invoke-virtual {p1}, Lcom/ibotta/api/model/offer/OfferProducts;->getProducts()Ljava/util/Set;

    move-result-object v1

    invoke-interface {p3, v0, v1}, Lcom/ibotta/android/appcache/AppCache;->replaceOfferProductsUpcs(ILjava/util/Set;)V

    .line 164
    iget-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    if-eqz p3, :cond_0

    invoke-interface {p3}, Lcom/ibotta/api/model/OfferModel;->isStandard()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 167
    iget-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-virtual {p1}, Lcom/ibotta/api/model/offer/OfferProducts;->getProducts()Ljava/util/Set;

    move-result-object v0

    invoke-interface {p3, v0}, Lcom/ibotta/api/model/OfferModel;->setProducts(Ljava/util/Set;)V

    .line 168
    iget-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-virtual {p1}, Lcom/ibotta/api/model/offer/OfferProducts;->getProductGroups()Ljava/util/List;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/ibotta/api/model/OfferModel;->setProductGroups(Ljava/util/List;)V

    .line 170
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    const/4 p3, 0x0

    invoke-interface {p2, p1, p3, p4}, Lcom/ibotta/android/verification/VerificationManager;->saveCheckProductScannedVerification(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;Ljava/lang/String;)Lcom/ibotta/android/verification/OfferVerification;

    :cond_0
    return-void
.end method

.method public initDefaultRetailer(Lcom/ibotta/api/call/home/HomeResponse;)V
    .locals 2

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->retailerId:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-virtual {p1}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->retailerId:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, p1, v1}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    :cond_0
    return-void
.end method

.method public isAlsoBoughtViewedJobValid(Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;)Z
    .locals 0

    if-eqz p1, :cond_0

    .line 81
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/OptionalWaitingApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isHideCantFindItem()Z
    .locals 2

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v1}, Lcom/ibotta/api/helper/offer/OfferHelper;->isShopNow(Lcom/ibotta/api/model/OfferModel;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->isNonItem()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public isNewRebateRewarded()Z
    .locals 1

    .line 236
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->newRebateRewarded:Z

    return v0
.end method

.method public isRebateRewarded()Z
    .locals 1

    .line 226
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->rebateRewarded:Z

    return v0
.end method

.method public offerHasAboutTitle()Z
    .locals 2

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getAboutTitle()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getAbout()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setCustomRebateRewardMessage(Ljava/lang/String;)V
    .locals 0

    .line 251
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->customRebateRewardMessage:Ljava/lang/String;

    return-void
.end method

.method public setNewRebateRewarded(Z)V
    .locals 0

    .line 241
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->newRebateRewarded:Z

    return-void
.end method

.method public setOfferFromResponse(Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;)V
    .locals 1

    const/4 v0, 0x0

    .line 61
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    .line 62
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 63
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/OfferModel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    :cond_0
    return-void
.end method

.method public setOfferIds([I)V
    .locals 0

    .line 221
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerIds:[I

    return-void
.end method

.method public setRebateRewarded(Z)V
    .locals 0

    .line 231
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->rebateRewarded:Z

    return-void
.end method

.method public setRetailerId(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 192
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->retailerId:Ljava/lang/Integer;

    return-void
.end method

.method public shouldShowLocateStore()Z
    .locals 2

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->isNonItem()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v1}, Lcom/ibotta/api/helper/offer/OfferHelper;->isShopNow(Lcom/ibotta/api/model/OfferModel;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public shouldTrackOfferBonuses(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;)Z"
        }
    .end annotation

    .line 111
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->retailerId:Ljava/lang/Integer;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {p1, v0}, Lcom/ibotta/api/helper/offer/OfferHelper;->isShopNow(Lcom/ibotta/api/model/OfferModel;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
