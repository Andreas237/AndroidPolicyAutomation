.class public abstract Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;
.source "SearchGraphQLResponse.java"

# interfaces
.implements Lcom/ibotta/android/api/ResponseOfferContainer;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;
    .locals 2

    .line 48
    new-instance v0, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse$Builder;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/search/AutoValue_SearchGraphQLResponse$Builder;->modules(Ljava/util/List;)Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$removeContainerOffer$0(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/base/Module;)V
    .locals 0

    .line 44
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public getContainerOffers()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 33
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;->getModules()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/graphql/search/-$$Lambda$jnINpZkQYaosRLNHuYhy-hZSw1A;->INSTANCE:Lcom/ibotta/android/graphql/search/-$$Lambda$jnINpZkQYaosRLNHuYhy-hZSw1A;

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/graphql/search/-$$Lambda$lnpN99Q7KybQyzGDZRSLPMAPS4c;->INSTANCE:Lcom/ibotta/android/graphql/search/-$$Lambda$lnpN99Q7KybQyzGDZRSLPMAPS4c;

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->flatMap(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    const-class v1, Lcom/ibotta/api/model/OfferModel;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/graphql/search/-$$Lambda$FByiZr1DR_RWLtIHmSsCycoe-pg;

    invoke-direct {v2, v1}, Lcom/ibotta/android/graphql/search/-$$Lambda$FByiZr1DR_RWLtIHmSsCycoe-pg;-><init>(Ljava/lang/Class;)V

    .line 34
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    const-class v1, Lcom/ibotta/api/model/OfferModel;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/graphql/search/-$$Lambda$CZAbKqRAvs47OG_2XwwtfYdouk0;

    invoke-direct {v2, v1}, Lcom/ibotta/android/graphql/search/-$$Lambda$CZAbKqRAvs47OG_2XwwtfYdouk0;-><init>(Ljava/lang/Class;)V

    .line 35
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;->getRelatedOffers()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v1

    .line 31
    invoke-static {v0, v1}, Ljava9/util/stream/Stream$-CC;->concat(Ljava9/util/stream/Stream;Ljava9/util/stream/Stream;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 37
    invoke-interface {v0}, Ljava9/util/stream/Stream;->distinct()Ljava9/util/stream/Stream;

    move-result-object v0

    .line 38
    invoke-static {}, Ljava9/util/stream/Collectors;->toList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public abstract getMisspelling()Lcom/ibotta/api/model/search/Misspelling;
.end method

.method public abstract getModules()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/Module;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRelatedOffers()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSearchedTerm()Ljava/lang/String;
.end method

.method public removeContainerOffer(Lcom/ibotta/api/model/OfferModel;)V
    .locals 2

    .line 43
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;->getRelatedOffers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 44
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;->getModules()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/graphql/search/-$$Lambda$SearchGraphQLResponse$IdlMXL69qCrt4haVs8d_OhKFgnQ;

    invoke-direct {v1, p1}, Lcom/ibotta/android/graphql/search/-$$Lambda$SearchGraphQLResponse$IdlMXL69qCrt4haVs8d_OhKFgnQ;-><init>(Lcom/ibotta/api/model/OfferModel;)V

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->forEach(Ljava9/util/function/Consumer;)V

    return-void
.end method
