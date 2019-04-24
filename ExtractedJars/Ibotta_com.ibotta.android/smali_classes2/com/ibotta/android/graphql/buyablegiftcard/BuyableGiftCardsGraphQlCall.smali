.class public Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlCall;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiCall;
.source "BuyableGiftCardsGraphQlCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseGraphQLApiCall<",
        "Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlResponse;",
        "Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private final buyableGiftCardMapper:Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 23
    invoke-virtual {p3}, Lcom/ibotta/android/graphql/mapper/Mappers;->getBuyableGiftCardMapper()Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlCall;->buyableGiftCardMapper:Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;

    return-void
.end method

.method public static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlCall;Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$BuyableGiftCard;)Lcom/ibotta/api/model/BuyableGiftCardModel;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlCall;->buyableGiftCardMapper:Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$BuyableGiftCard;->fragments()Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$BuyableGiftCard$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$BuyableGiftCard$Fragments;->buyableGiftCardFragment()Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;->map(Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;)Lcom/ibotta/api/model/content/BuyableGiftCardContent;

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
            "Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$Data;",
            ">;"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-static {}, Lcom/ibotta/android/graphql/BuyableGiftCardsQuery;->builder()Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$Builder;->build()Lcom/ibotta/android/graphql/BuyableGiftCardsQuery;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/buyableGiftCards"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "buyableGiftCards"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlResponse;",
            ">;"
        }
    .end annotation

    .line 28
    const-class v0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlResponse;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 15
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/BuyableGiftCardsQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlResponse;"
        }
    .end annotation

    .line 50
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/graphql/buyablegiftcard/-$$Lambda$vUd4d0WTxOeCKCOijY2FrWIX2so;->INSTANCE:Lcom/ibotta/android/graphql/buyablegiftcard/-$$Lambda$vUd4d0WTxOeCKCOijY2FrWIX2so;

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlCall;->getListSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/graphql/buyablegiftcard/-$$Lambda$BuyableGiftCardsGraphQlCall$wzdpO9DfGQl3LQyjQyVd9ZcInN4;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/buyablegiftcard/-$$Lambda$BuyableGiftCardsGraphQlCall$wzdpO9DfGQl3LQyjQyVd9ZcInN4;-><init>(Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlCall;)V

    .line 49
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlCall;->translateList(Ljava/util/List;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object p1

    .line 48
    invoke-static {p1}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlResponse;->create(Ljava/util/List;)Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlResponse;

    move-result-object p1

    return-object p1
.end method
