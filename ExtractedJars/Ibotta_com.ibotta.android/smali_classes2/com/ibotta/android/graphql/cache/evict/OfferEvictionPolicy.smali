.class public Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;
.super Ljava/lang/Object;
.source "OfferEvictionPolicy.java"

# interfaces
.implements Lcom/ibotta/android/graphql/cache/evict/EvictionPolicy;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field private static final CACHE_KEY_OFFER_PREFIX:Ljava/lang/String; = "Offer."

.field private static final FIELD_EXPIRATION:Ljava/lang/String; = "expiration"


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 35
    iput-object p2, p0, Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 36
    iput-object p3, p0, Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;->formatting:Lcom/ibotta/android/util/Formatting;

    return-void
.end method


# virtual methods
.method public evictContentIfNeeded(Lcom/ibotta/android/graphql/GraphQLApiResponse;)V
    .locals 6

    .line 69
    instance-of v0, p1, Lcom/ibotta/android/api/ResponseOfferContainer;

    if-nez v0, :cond_0

    return-void

    .line 73
    :cond_0
    check-cast p1, Lcom/ibotta/android/api/ResponseOfferContainer;

    .line 74
    invoke-interface {p1}, Lcom/ibotta/android/api/ResponseOfferContainer;->getContainerOffers()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 78
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 80
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OfferModel;

    .line 81
    iget-object v2, p0, Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {v2, v1}, Lcom/ibotta/api/helper/offer/OfferHelper;->isExpired(Lcom/ibotta/api/model/OfferModel;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "Evict expired Offer from Response: offerId=%1$d"

    const/4 v3, 0x1

    .line 82
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    invoke-interface {p1, v1}, Lcom/ibotta/android/api/ResponseOfferContainer;->removeContainerOffer(Lcom/ibotta/api/model/OfferModel;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public shouldEvict(Ljava/lang/String;Lcom/apollographql/apollo/cache/normalized/Record;)Z
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "Offer."

    .line 47
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    const-string v3, "expiration"

    .line 50
    invoke-virtual {p2, v3}, Lcom/apollographql/apollo/cache/normalized/Record;->hasField(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v1, "expiration"

    .line 51
    invoke-virtual {p2, v1}, Lcom/apollographql/apollo/cache/normalized/Record;->field(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 54
    :cond_1
    instance-of p2, v1, Ljava/lang/String;

    if-eqz p2, :cond_3

    .line 55
    iget-object p2, p0, Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;->formatting:Lcom/ibotta/android/util/Formatting;

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2, v1}, Lcom/ibotta/android/util/Formatting;->fromServerDateString(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 57
    iget-object v1, p0, Lcom/ibotta/android/graphql/cache/evict/OfferEvictionPolicy;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v3

    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    cmp-long p2, v3, v5

    if-lez p2, :cond_3

    :cond_2
    const-string p2, "Evict expired Offer from GraphQL Record: %1$s"

    .line 59
    new-array v1, v2, [Ljava/lang/Object;

    aput-object p1, v1, v0

    invoke-static {p2, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    :cond_3
    return v0

    :cond_4
    :goto_0
    return v0
.end method
