.class public Lcom/ibotta/android/graphql/search/SearchGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;
.source "SearchGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall<",
        "Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;",
        "Lcom/ibotta/android/graphql/SearchQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private final mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

.field private final params:Lcom/ibotta/android/graphql/search/SearchGraphQLParams;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Lcom/ibotta/android/graphql/search/SearchGraphQLParams;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 39
    iput-object p2, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 40
    iput-object p3, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    .line 41
    iput-object p4, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->params:Lcom/ibotta/android/graphql/search/SearchGraphQLParams;

    return-void
.end method

.method private getMisspelling(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/api/model/search/Misspelling;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/SearchQuery$Data;",
            ">;)",
            "Lcom/ibotta/api/model/search/Misspelling;"
        }
    .end annotation

    .line 60
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/SearchQuery$Data;

    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/search/-$$Lambda$Jd-xH6Y1Lxox6i6odVz0hH-TDKk;->INSTANCE:Lcom/ibotta/android/graphql/search/-$$Lambda$Jd-xH6Y1Lxox6i6odVz0hH-TDKk;

    .line 61
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/search/-$$Lambda$gSoSHK_DFZA8mIaBw3TjeSFU1BE;->INSTANCE:Lcom/ibotta/android/graphql/search/-$$Lambda$gSoSHK_DFZA8mIaBw3TjeSFU1BE;

    .line 62
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/graphql/search/-$$Lambda$SearchGraphQLCall$PCsJOJLYvfmWzCKkR3y0_e_wwcw;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/search/-$$Lambda$SearchGraphQLCall$PCsJOJLYvfmWzCKkR3y0_e_wwcw;-><init>(Lcom/ibotta/android/graphql/search/SearchGraphQLCall;)V

    .line 63
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/api/model/search/Misspelling;->EMPTY:Lcom/ibotta/api/model/search/Misspelling;

    .line 64
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/search/Misspelling;

    return-object p1
.end method

.method private getRelatedOffers(Lcom/apollographql/apollo/api/Response;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/SearchQuery$Data;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 69
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/SearchQuery$Data;

    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/search/-$$Lambda$G5P3rlYYxAkXm_92GpWlbsGLh2k;->INSTANCE:Lcom/ibotta/android/graphql/search/-$$Lambda$G5P3rlYYxAkXm_92GpWlbsGLh2k;

    .line 70
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    .line 71
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    .line 69
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/search/-$$Lambda$SearchGraphQLCall$7v9Cg_-TwSTOALpPElPVpmkOcTQ;->INSTANCE:Lcom/ibotta/android/graphql/search/-$$Lambda$SearchGraphQLCall$7v9Cg_-TwSTOALpPElPVpmkOcTQ;

    .line 73
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/search/-$$Lambda$eg06IxspPHmmAaeHUjNY4KZl1YE;->INSTANCE:Lcom/ibotta/android/graphql/search/-$$Lambda$eg06IxspPHmmAaeHUjNY4KZl1YE;

    .line 74
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/search/-$$Lambda$zWJ7fV9mNZnvtOG4RVO7Q8EIWzU;->INSTANCE:Lcom/ibotta/android/graphql/search/-$$Lambda$zWJ7fV9mNZnvtOG4RVO7Q8EIWzU;

    .line 76
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/graphql/search/-$$Lambda$SearchGraphQLCall$0kCH2tIGcPpcPQ50Op6_mo6dgDw;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/search/-$$Lambda$SearchGraphQLCall$0kCH2tIGcPpcPQ50Op6_mo6dgDw;-><init>(Lcom/ibotta/android/graphql/search/SearchGraphQLCall;)V

    .line 78
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 80
    invoke-static {}, Ljava9/util/stream/Collectors;->toList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method private getSearchModules(Lcom/apollographql/apollo/api/Response;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/SearchQuery$Data;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/Module;",
            ">;"
        }
    .end annotation

    .line 84
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->getSearchStream(Lcom/apollographql/apollo/api/Response;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/search/-$$Lambda$SearchGraphQLCall$SDXeJnzFW_7aRekGqJGECNG8W6g;->INSTANCE:Lcom/ibotta/android/graphql/search/-$$Lambda$SearchGraphQLCall$SDXeJnzFW_7aRekGqJGECNG8W6g;

    .line 86
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/search/-$$Lambda$Ve3Q_AziFQAEOcuyczxHzCg9T3U;->INSTANCE:Lcom/ibotta/android/graphql/search/-$$Lambda$Ve3Q_AziFQAEOcuyczxHzCg9T3U;

    .line 87
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/search/-$$Lambda$rjbH2F8ToSg26TJDNOPA29kfIK8;->INSTANCE:Lcom/ibotta/android/graphql/search/-$$Lambda$rjbH2F8ToSg26TJDNOPA29kfIK8;

    .line 88
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/graphql/search/-$$Lambda$SearchGraphQLCall$YcLbfpYTyZiP3bpoTCbkyGErYA8;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/search/-$$Lambda$SearchGraphQLCall$YcLbfpYTyZiP3bpoTCbkyGErYA8;-><init>(Lcom/ibotta/android/graphql/search/SearchGraphQLCall;)V

    .line 89
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 90
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method private getSearchStream(Lcom/apollographql/apollo/api/Response;)Ljava9/util/stream/Stream;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/SearchQuery$Data;",
            ">;)",
            "Ljava9/util/stream/Stream<",
            "Lcom/ibotta/android/graphql/SearchQuery$Result;",
            ">;"
        }
    .end annotation

    .line 94
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/SearchQuery$Data;

    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/search/-$$Lambda$Jd-xH6Y1Lxox6i6odVz0hH-TDKk;->INSTANCE:Lcom/ibotta/android/graphql/search/-$$Lambda$Jd-xH6Y1Lxox6i6odVz0hH-TDKk;

    .line 95
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/search/-$$Lambda$FeZJAOHW2eBFwxcUGlLUYTc1xUk;->INSTANCE:Lcom/ibotta/android/graphql/search/-$$Lambda$FeZJAOHW2eBFwxcUGlLUYTc1xUk;

    .line 96
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    .line 97
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    .line 94
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic lambda$PCsJOJLYvfmWzCKkR3y0_e_wwcw(Lcom/ibotta/android/graphql/search/SearchGraphQLCall;Lcom/ibotta/android/graphql/SearchQuery$Misspelling;)Lcom/ibotta/api/model/search/Misspelling;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->mapToMisspelling(Lcom/ibotta/android/graphql/SearchQuery$Misspelling;)Lcom/ibotta/api/model/search/Misspelling;

    move-result-object p0

    return-object p0
.end method

.method static synthetic lambda$getRelatedOffers$0(Lcom/ibotta/android/graphql/SearchQuery$RelatedOffer;)Z
    .locals 0

    .line 73
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/SearchQuery$RelatedOffer;->__typename()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/android/graphql/mapper/Mappers;->isOfferType(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$getRelatedOffers$1(Lcom/ibotta/android/graphql/search/SearchGraphQLCall;Lcom/ibotta/android/graphql/fragment/OfferFragment;)Lcom/ibotta/api/model/content/OfferContent;
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/mapper/Mappers;->getOfferMapper()Lcom/ibotta/android/graphql/mapper/OfferMapper;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->map(Lcom/ibotta/android/graphql/fragment/OfferFragment;)Lcom/ibotta/api/model/content/OfferContent;

    move-result-object p1

    return-object p1
.end method

.method static synthetic lambda$getSearchModules$2(Lcom/ibotta/android/graphql/SearchQuery$Result;)Z
    .locals 0

    .line 86
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/SearchQuery$Result;->__typename()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/android/graphql/mapper/Mappers;->isSimpleModuleDisplayType(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$getSearchModules$3(Lcom/ibotta/android/graphql/search/SearchGraphQLCall;Lcom/ibotta/android/graphql/fragment/ModuleFragment;)Lcom/ibotta/api/model/base/Module;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/mapper/Mappers;->getModuleMapper()Lcom/ibotta/android/graphql/mapper/ModuleMapper;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->map(Lcom/ibotta/android/graphql/fragment/ModuleFragment;)Lcom/ibotta/api/model/base/Module;

    move-result-object p1

    return-object p1
.end method

.method private mapToMisspelling(Lcom/ibotta/android/graphql/SearchQuery$Misspelling;)Lcom/ibotta/api/model/search/Misspelling;
    .locals 2

    .line 101
    invoke-static {}, Lcom/ibotta/api/model/search/Misspelling;->builder()Lcom/ibotta/api/model/search/Misspelling$Builder;

    move-result-object v0

    .line 102
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->original()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/search/Misspelling$Builder;->original(Ljava/lang/String;)Lcom/ibotta/api/model/search/Misspelling$Builder;

    move-result-object v0

    .line 103
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->suggested()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/search/Misspelling$Builder;->suggested(Ljava/lang/String;)Lcom/ibotta/api/model/search/Misspelling$Builder;

    move-result-object v0

    .line 104
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/SearchQuery$Misspelling;->confidence()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/search/Misspelling$Builder;->confidence(Ljava/lang/String;)Lcom/ibotta/api/model/search/Misspelling$Builder;

    move-result-object p1

    .line 105
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/Misspelling$Builder;->build()Lcom/ibotta/api/model/search/Misspelling;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public createApolloCall()Lcom/apollographql/apollo/ApolloCall;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/ApolloCall<",
            "Lcom/ibotta/android/graphql/SearchQuery$Data;",
            ">;"
        }
    .end annotation

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->params:Lcom/ibotta/android/graphql/search/SearchGraphQLParams;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->getSearchContentType()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/graphql/search/-$$Lambda$P_B5jkJTzEX2q6hDQgJh2XxCiCI;->INSTANCE:Lcom/ibotta/android/graphql/search/-$$Lambda$P_B5jkJTzEX2q6hDQgJh2XxCiCI;

    .line 112
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 113
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 115
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-static {}, Lcom/ibotta/android/graphql/SearchQuery;->builder()Lcom/ibotta/android/graphql/SearchQuery$Builder;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->params:Lcom/ibotta/android/graphql/search/SearchGraphQLParams;

    .line 116
    invoke-virtual {v3}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->getSearchResultLimit()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/ibotta/android/graphql/SearchQuery$Builder;->searchLimit(J)Lcom/ibotta/android/graphql/SearchQuery$Builder;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->params:Lcom/ibotta/android/graphql/search/SearchGraphQLParams;

    .line 117
    invoke-virtual {v3}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->getRelatedOfferResultLimit()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/ibotta/android/graphql/SearchQuery$Builder;->relatedLimit(J)Lcom/ibotta/android/graphql/SearchQuery$Builder;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->params:Lcom/ibotta/android/graphql/search/SearchGraphQLParams;

    .line 118
    invoke-virtual {v3}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->getRetailerId()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/graphql/SearchQuery$Builder;->retailerId(Ljava/lang/Long;)Lcom/ibotta/android/graphql/SearchQuery$Builder;

    move-result-object v2

    .line 119
    invoke-virtual {v2, v0}, Lcom/ibotta/android/graphql/SearchQuery$Builder;->contentTypes(Ljava/util/List;)Lcom/ibotta/android/graphql/SearchQuery$Builder;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->params:Lcom/ibotta/android/graphql/search/SearchGraphQLParams;

    .line 120
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->getTerm()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/ibotta/android/graphql/SearchQuery$Builder;->term(Ljava/lang/String;)Lcom/ibotta/android/graphql/SearchQuery$Builder;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->products:Ljava/lang/Boolean;

    .line 121
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/ibotta/android/graphql/SearchQuery$Builder;->products(Z)Lcom/ibotta/android/graphql/SearchQuery$Builder;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    .line 122
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/ibotta/android/graphql/SearchQuery$Builder;->includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/SearchQuery$Builder;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->params:Lcom/ibotta/android/graphql/search/SearchGraphQLParams;

    .line 123
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->getFetchRelatedOffers()Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/ibotta/android/graphql/SearchQuery$Builder;->fetchRelatedOffers(Z)Lcom/ibotta/android/graphql/SearchQuery$Builder;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->params:Lcom/ibotta/android/graphql/search/SearchGraphQLParams;

    .line 124
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->getCorrectSpelling()Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/ibotta/android/graphql/SearchQuery$Builder;->correctSpelling(Z)Lcom/ibotta/android/graphql/SearchQuery$Builder;

    move-result-object v0

    .line 125
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/SearchQuery$Builder;->build()Lcom/ibotta/android/graphql/SearchQuery;

    move-result-object v0

    .line 115
    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "local/graphql/Search"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 3

    .line 144
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 147
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->params:Lcom/ibotta/android/graphql/search/SearchGraphQLParams;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->getTerm()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->params:Lcom/ibotta/android/graphql/search/SearchGraphQLParams;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->getRetailerId()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 149
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->params:Lcom/ibotta/android/graphql/search/SearchGraphQLParams;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->getSearchResultLimit()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 150
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->params:Lcom/ibotta/android/graphql/search/SearchGraphQLParams;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->getRelatedOfferResultLimit()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 152
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->params:Lcom/ibotta/android/graphql/search/SearchGraphQLParams;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->getSearchContentType()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/graphql/search/SearchContentType;

    .line 153
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 156
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 157
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "search"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1

    .line 134
    const-class v0, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 27
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/SearchQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;"
        }
    .end annotation

    .line 47
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->getSearchModules(Lcom/apollographql/apollo/api/Response;)Ljava/util/List;

    move-result-object v0

    .line 48
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->getRelatedOffers(Lcom/apollographql/apollo/api/Response;)Ljava/util/List;

    move-result-object v1

    .line 49
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->getMisspelling(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/api/model/search/Misspelling;

    move-result-object p1

    .line 51
    invoke-static {}, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;->builder()Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/graphql/search/SearchGraphQLCall;->params:Lcom/ibotta/android/graphql/search/SearchGraphQLParams;

    .line 52
    invoke-virtual {v3}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->getTerm()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;->searchedTerm(Ljava/lang/String;)Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;

    move-result-object v2

    .line 53
    invoke-virtual {v2, p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;->misspelling(Lcom/ibotta/api/model/search/Misspelling;)Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;

    move-result-object p1

    .line 54
    invoke-virtual {p1, v0}, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;->modules(Ljava/util/List;)Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;

    move-result-object p1

    .line 55
    invoke-virtual {p1, v1}, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;->relatedOffers(Ljava/util/List;)Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;

    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse$Builder;->build()Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;

    move-result-object p1

    return-object p1
.end method
