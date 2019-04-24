.class public Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiCall;
.source "ViewedRetailerGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseGraphQLApiCall<",
        "Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLResponse;",
        "Lcom/ibotta/android/graphql/ViewedRetailerMutation$Data;",
        ">;"
    }
.end annotation


# static fields
.field private static final LIMIT:J = 0x14L

.field private static final LIMIT_STRATEGY:Lcom/ibotta/android/graphql/type/LimitStrategy;


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private final mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

.field private final retailerId:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    sget-object v0, Lcom/ibotta/android/graphql/type/LimitStrategy;->Even:Lcom/ibotta/android/graphql/type/LimitStrategy;

    sput-object v0, Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCall;->LIMIT_STRATEGY:Lcom/ibotta/android/graphql/type/LimitStrategy;

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;I)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 39
    iput-object p2, p0, Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 40
    iput-object p3, p0, Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    .line 41
    iput p4, p0, Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCall;->retailerId:I

    return-void
.end method

.method static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/ViewedRetailerMutation$Retailer;)Z
    .locals 0

    .line 54
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/ViewedRetailerMutation$Retailer;->__typename()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/android/graphql/mapper/Mappers;->isRetailerType(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$mapResponse$1(Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCall;Lcom/ibotta/android/graphql/fragment/RetailerFragment;)Lcom/ibotta/api/model/content/RetailerContent;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/mapper/Mappers;->getRetailerMapper()Lcom/ibotta/android/graphql/mapper/RetailerMapper;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->map(Lcom/ibotta/android/graphql/fragment/RetailerFragment;)Lcom/ibotta/api/model/content/RetailerContent;

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
            "Lcom/ibotta/android/graphql/ViewedRetailerMutation$Data;",
            ">;"
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-static {}, Lcom/ibotta/android/graphql/ViewedRetailerMutation;->builder()Lcom/ibotta/android/graphql/ViewedRetailerMutation$Builder;

    move-result-object v1

    iget v2, p0, Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCall;->retailerId:I

    int-to-long v2, v2

    .line 64
    invoke-virtual {v1, v2, v3}, Lcom/ibotta/android/graphql/ViewedRetailerMutation$Builder;->id(J)Lcom/ibotta/android/graphql/ViewedRetailerMutation$Builder;

    move-result-object v1

    .line 65
    invoke-static {}, Lcom/ibotta/android/graphql/type/Limit;->builder()Lcom/ibotta/android/graphql/type/Limit$Builder;

    move-result-object v2

    const-wide/16 v3, 0x14

    .line 66
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/graphql/type/Limit$Builder;->limit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/type/Limit$Builder;

    move-result-object v2

    sget-object v3, Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCall;->LIMIT_STRATEGY:Lcom/ibotta/android/graphql/type/LimitStrategy;

    .line 67
    invoke-virtual {v2, v3}, Lcom/ibotta/android/graphql/type/Limit$Builder;->limitStrategy(Lcom/ibotta/android/graphql/type/LimitStrategy;)Lcom/ibotta/android/graphql/type/Limit$Builder;

    move-result-object v2

    .line 68
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/type/Limit$Builder;->build()Lcom/ibotta/android/graphql/type/Limit;

    move-result-object v2

    .line 65
    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/ViewedRetailerMutation$Builder;->limit(Lcom/ibotta/android/graphql/type/Limit;)Lcom/ibotta/android/graphql/ViewedRetailerMutation$Builder;

    move-result-object v1

    .line 69
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/ViewedRetailerMutation$Builder;->build()Lcom/ibotta/android/graphql/ViewedRetailerMutation;

    move-result-object v1

    .line 63
    invoke-virtual {v0, v1}, Lcom/apollographql/apollo/ApolloClient;->mutate(Lcom/apollographql/apollo/api/Mutation;)Lcom/apollographql/apollo/ApolloMutationCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "local/graphql/ViewedRetailer"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 3

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    iget v1, p0, Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCall;->retailerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-wide/16 v1, 0x14

    .line 93
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 94
    sget-object v1, Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCall;->LIMIT_STRATEGY:Lcom/ibotta/android/graphql/type/LimitStrategy;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "ViewedRetailer"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLResponse;",
            ">;"
        }
    .end annotation

    .line 79
    const-class v0, Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLResponse;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 24
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/ViewedRetailerMutation$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLResponse;"
        }
    .end annotation

    .line 47
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/ViewedRetailerMutation$Data;

    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/retailer/-$$Lambda$13w0l11_I6YRpg17o8yjV32abhE;->INSTANCE:Lcom/ibotta/android/graphql/retailer/-$$Lambda$13w0l11_I6YRpg17o8yjV32abhE;

    .line 48
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/retailer/-$$Lambda$Y8aRZihROsX1o9724qnhzDlu9Wc;->INSTANCE:Lcom/ibotta/android/graphql/retailer/-$$Lambda$Y8aRZihROsX1o9724qnhzDlu9Wc;

    .line 49
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    .line 50
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 53
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/retailer/-$$Lambda$ViewedRetailerGraphQLCall$_Jtwn4hyKw42R4YiBd3JbGdakyc;->INSTANCE:Lcom/ibotta/android/graphql/retailer/-$$Lambda$ViewedRetailerGraphQLCall$_Jtwn4hyKw42R4YiBd3JbGdakyc;

    .line 54
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/retailer/-$$Lambda$DSKQ2N8VfFzr4ecYDy1B36sQ5Vc;->INSTANCE:Lcom/ibotta/android/graphql/retailer/-$$Lambda$DSKQ2N8VfFzr4ecYDy1B36sQ5Vc;

    .line 55
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/retailer/-$$Lambda$SLuOaNAjR3XdMhMm3MePV7zjF2I;->INSTANCE:Lcom/ibotta/android/graphql/retailer/-$$Lambda$SLuOaNAjR3XdMhMm3MePV7zjF2I;

    .line 56
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/graphql/retailer/-$$Lambda$ViewedRetailerGraphQLCall$V2EP_qz9WgFa-HYX-2Q-xLdW6Lk;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/retailer/-$$Lambda$ViewedRetailerGraphQLCall$V2EP_qz9WgFa-HYX-2Q-xLdW6Lk;-><init>(Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLCall;)V

    .line 57
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 58
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 52
    invoke-static {p1}, Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLResponse;->create(Ljava/util/List;)Lcom/ibotta/android/graphql/retailer/ViewedRetailerGraphQLResponse;

    move-result-object p1

    return-object p1
.end method
