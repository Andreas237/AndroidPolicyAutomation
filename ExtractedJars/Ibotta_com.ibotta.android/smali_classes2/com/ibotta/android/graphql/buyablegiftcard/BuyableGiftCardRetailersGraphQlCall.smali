.class public Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiCall;
.source "BuyableGiftCardRetailersGraphQlCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseGraphQLApiCall<",
        "Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlResponse;",
        "Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$Data;",
        ">;"
    }
.end annotation


# static fields
.field private static final RETAILERS_CACHE_KEY:Ljava/lang/String; = "retailers"


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private final buyableGiftCardRetailerMapper:Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 30
    invoke-virtual {p3}, Lcom/ibotta/android/graphql/mapper/Mappers;->getBuyableGiftCardRetailerMapper()Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;->buyableGiftCardRetailerMapper:Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;

    return-void
.end method

.method public static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$BuyableGiftCard;)Ljava/lang/Integer;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;->buyableGiftCardRetailerMapper:Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;

    .line 63
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$BuyableGiftCard;->fragments()Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$BuyableGiftCard$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$BuyableGiftCard$Fragments;->buyableGiftCardRetailersFragment()Lcom/ibotta/android/graphql/fragment/BuyableGiftCardRetailersFragment;

    move-result-object p1

    .line 62
    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardRetailerMapper;->map(Lcom/ibotta/android/graphql/fragment/BuyableGiftCardRetailersFragment;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public createApolloCall()Lcom/apollographql/apollo/ApolloCall;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/ApolloCall<",
            "Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$Data;",
            ">;"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-static {}, Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery;->builder()Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$Builder;->build()Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/buyableGiftCardRetailers"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "retailers"

    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "buyableGiftCardRetailers"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlResponse;",
            ">;"
        }
    .end annotation

    .line 35
    const-class v0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlResponse;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 20
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlResponse;"
        }
    .end annotation

    .line 55
    new-instance v0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlResponse;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlResponse;-><init>()V

    .line 61
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/graphql/buyablegiftcard/-$$Lambda$AVr-mz7NHx2F4hcgTgy6Zzpt9eE;->INSTANCE:Lcom/ibotta/android/graphql/buyablegiftcard/-$$Lambda$AVr-mz7NHx2F4hcgTgy6Zzpt9eE;

    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;->getListSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object p1

    new-instance v1, Lcom/ibotta/android/graphql/buyablegiftcard/-$$Lambda$BuyableGiftCardRetailersGraphQlCall$IIINj25MgvES9_nSxE615Z8e40k;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/buyablegiftcard/-$$Lambda$BuyableGiftCardRetailersGraphQlCall$IIINj25MgvES9_nSxE615Z8e40k;-><init>(Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;)V

    .line 60
    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;->translateList(Ljava/util/List;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object p1

    .line 59
    invoke-static {p1}, Ljava9/util/Sets;->copyOf(Ljava/util/Collection;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlResponse;->setBuyableGiftCardRetailerIds(Ljava/util/Set;)V

    return-object v0
.end method
