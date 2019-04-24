.class public Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiCall;
.source "TypeAheadSuggestionGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseGraphQLApiCall<",
        "Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionResponse;",
        "Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data;",
        ">;"
    }
.end annotation


# static fields
.field private static final MAX_RESULTS:J = 0xfL


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private final retailerIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava9/util/Optional<",
            "Ljava/lang/Long;",
            ">;>;"
        }
    .end annotation
.end field

.field private final searchText:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            "Lcom/apollographql/apollo/ApolloClient;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava9/util/Optional<",
            "Ljava/lang/Long;",
            ">;>;)V"
        }
    .end annotation

    .line 39
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 40
    iput-object p2, p0, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 41
    iput-object p3, p0, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionGraphQLCall;->searchText:Ljava/lang/String;

    .line 42
    iput-object p4, p0, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionGraphQLCall;->retailerIds:Ljava/util/List;

    return-void
.end method

.method public static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionGraphQLCall;Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion;)Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestion;
    .locals 0

    .line 54
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion;->fragments()Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$TypeAheadSuggestion$Fragments;->typeAheadSuggestionFragment()Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionGraphQLCall;->mapToTypeAheadSuggestion(Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;)Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestion;

    move-result-object p1

    return-object p1
.end method

.method static synthetic lambda$mapToTypeAheadSuggestion$1(Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;)Lcom/ibotta/api/model/search/Highlight;
    .locals 4

    .line 65
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->offset()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {p0}, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment$Highlight;->length()J

    move-result-wide v2

    long-to-int p0, v2

    invoke-static {v1, p0}, Lcom/ibotta/api/model/search/Highlight;->create(II)Lcom/ibotta/api/model/search/Highlight;

    move-result-object p0

    return-object p0
.end method

.method private mapToTypeAheadSuggestion(Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;)Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestion;
    .locals 2

    .line 61
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->text()Ljava/lang/String;

    move-result-object v0

    .line 62
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/TypeAheadSuggestionFragment;->highlights()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/graphql/search/typeahead/-$$Lambda$lnpN99Q7KybQyzGDZRSLPMAPS4c;->INSTANCE:Lcom/ibotta/android/graphql/search/typeahead/-$$Lambda$lnpN99Q7KybQyzGDZRSLPMAPS4c;

    .line 63
    invoke-virtual {p1, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    .line 64
    invoke-static {}, Ljava9/util/stream/Stream$-CC;->empty()Ljava9/util/stream/Stream;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava9/util/stream/Stream;

    sget-object v1, Lcom/ibotta/android/graphql/search/typeahead/-$$Lambda$TypeAheadSuggestionGraphQLCall$vLXGsNCTZfdSlXfLgRGutzkXCyw;->INSTANCE:Lcom/ibotta/android/graphql/search/typeahead/-$$Lambda$TypeAheadSuggestionGraphQLCall$vLXGsNCTZfdSlXfLgRGutzkXCyw;

    .line 65
    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 66
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 61
    invoke-static {v0, p1}, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestion;->create(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestion;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public createApolloCall()Lcom/apollographql/apollo/ApolloCall;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/ApolloCall<",
            "Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data;",
            ">;"
        }
    .end annotation

    .line 71
    invoke-static {}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery;->builder()Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Builder;

    move-result-object v0

    const-wide/16 v1, 0xf

    .line 72
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Builder;->limit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Builder;

    .line 73
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionGraphQLCall;->searchText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Builder;->prefix(Ljava/lang/String;)Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Builder;

    .line 74
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionGraphQLCall;->retailerIds:Ljava/util/List;

    invoke-static {v1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/graphql/search/typeahead/-$$Lambda$fA7UtJe8fxkp4wBhKRfWLQWhNDg;->INSTANCE:Lcom/ibotta/android/graphql/search/typeahead/-$$Lambda$fA7UtJe8fxkp4wBhKRfWLQWhNDg;

    .line 75
    invoke-interface {v1, v2}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/graphql/search/typeahead/-$$Lambda$N0gGPji249cR1_yIQYwoeWwAmP0;->INSTANCE:Lcom/ibotta/android/graphql/search/typeahead/-$$Lambda$N0gGPji249cR1_yIQYwoeWwAmP0;

    .line 76
    invoke-interface {v1, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v1

    .line 77
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 74
    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Builder;->retailers(Ljava/util/List;)Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Builder;

    .line 79
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Builder;->build()Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/typeAheadSuggestion"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    iget-object v1, p0, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionGraphQLCall;->searchText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "typeAheadSuggestion"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionResponse;",
            ">;"
        }
    .end annotation

    .line 89
    const-class v0, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionResponse;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionResponse;"
        }
    .end annotation

    .line 48
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data;

    if-nez p1, :cond_0

    .line 51
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/TypeAheadSuggestionQuery$Data;->typeAheadSuggestion()Ljava/util/List;

    move-result-object p1

    .line 53
    :goto_0
    invoke-static {p1}, Lcom/ibotta/android/util/AppHelper$-CC;->getStreamOf(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/graphql/search/typeahead/-$$Lambda$TypeAheadSuggestionGraphQLCall$muOKs020De7eID8n2txKG5Y-e5k;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/search/typeahead/-$$Lambda$TypeAheadSuggestionGraphQLCall$muOKs020De7eID8n2txKG5Y-e5k;-><init>(Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionGraphQLCall;)V

    .line 54
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 55
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 57
    invoke-static {p1}, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionResponse;->create(Ljava/util/List;)Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionResponse;

    move-result-object p1

    return-object p1
.end method
