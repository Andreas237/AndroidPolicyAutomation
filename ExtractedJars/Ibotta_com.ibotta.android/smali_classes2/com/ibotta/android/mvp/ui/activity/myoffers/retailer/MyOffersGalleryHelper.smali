.class public Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryHelper;
.super Ljava/lang/Object;
.source "MyOffersGalleryHelper.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic lambda$getOffersCount$1(Lcom/ibotta/api/model/OfferCategoryModel;)I
    .locals 0

    .line 16
    invoke-interface {p0}, Lcom/ibotta/api/model/OfferCategoryModel;->getOffers()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method static synthetic lambda$hasOffers$0(Lcom/ibotta/api/model/OfferCategoryModel;)Z
    .locals 0

    .line 12
    invoke-interface {p0}, Lcom/ibotta/api/model/OfferCategoryModel;->getOffers()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method


# virtual methods
.method public getOffersCount(Ljava/util/List;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            ">;)I"
        }
    .end annotation

    .line 16
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryHelper$sN4zBEYZt84fkgGevmzVKBEkYDk;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryHelper$sN4zBEYZt84fkgGevmzVKBEkYDk;

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->mapToInt(Ljava9/util/function/ToIntFunction;)Ljava9/util/stream/IntStream;

    move-result-object p1

    invoke-interface {p1}, Ljava9/util/stream/IntStream;->sum()I

    move-result p1

    return p1
.end method

.method public hasOffers(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            ">;)Z"
        }
    .end annotation

    .line 12
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryHelper$_WmHwL0Xm0NdzlnTiboq_z4zSZ0;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryHelper$_WmHwL0Xm0NdzlnTiboq_z4zSZ0;

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->anyMatch(Ljava9/util/function/Predicate;)Z

    move-result p1

    return p1
.end method
