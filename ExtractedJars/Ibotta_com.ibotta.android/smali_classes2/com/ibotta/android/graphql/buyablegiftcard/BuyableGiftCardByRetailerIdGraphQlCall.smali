.class public Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiCall;
.source "BuyableGiftCardByRetailerIdGraphQlCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseGraphQLApiCall<",
        "Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;",
        "Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private final buyableGiftCardMapper:Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;

.field private final retailerId:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Ljava/lang/Integer;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 23
    invoke-virtual {p3}, Lcom/ibotta/android/graphql/mapper/Mappers;->getBuyableGiftCardMapper()Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;->buyableGiftCardMapper:Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;

    .line 24
    iput-object p4, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;->retailerId:Ljava/lang/Integer;

    return-void
.end method

.method public static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$BuyableGiftCard;)Lcom/ibotta/api/model/content/BuyableGiftCardContent;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;->buyableGiftCardMapper:Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$BuyableGiftCard;->fragments()Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$BuyableGiftCard$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$BuyableGiftCard$Fragments;->buyableGiftCardFragment()Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;->map(Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;)Lcom/ibotta/api/model/content/BuyableGiftCardContent;

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
            "Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Data;",
            ">;"
        }
    .end annotation

    .line 43
    invoke-static {}, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery;->builder()Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;->retailerId:Ljava/lang/Integer;

    .line 44
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Builder;->retailerId(J)Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Builder;

    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Builder;->build()Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery;

    move-result-object v0

    .line 47
    iget-object v1, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/buyableGiftCardByRetailerId"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    iget-object v1, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;->retailerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "buyableGiftCardByRetailerId"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;",
            ">;"
        }
    .end annotation

    .line 33
    const-class v0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;

    return-object v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;->retailerId:Ljava/lang/Integer;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 14
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;"
        }
    .end annotation

    .line 57
    new-instance v0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;-><init>()V

    .line 63
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/graphql/buyablegiftcard/-$$Lambda$ErX41n8L7oniF3rpuvUJm8ppCvg;->INSTANCE:Lcom/ibotta/android/graphql/buyablegiftcard/-$$Lambda$ErX41n8L7oniF3rpuvUJm8ppCvg;

    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;->getListSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;->getDataFromListByFirst(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/BuyableGiftCardByRetailerIdQuery$BuyableGiftCard;

    new-instance v1, Lcom/ibotta/android/graphql/buyablegiftcard/-$$Lambda$BuyableGiftCardByRetailerIdGraphQlCall$8gaqNvtzPwnRaXPswbqSYQUtZQA;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/buyablegiftcard/-$$Lambda$BuyableGiftCardByRetailerIdGraphQlCall$8gaqNvtzPwnRaXPswbqSYQUtZQA;-><init>(Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;)V

    .line 62
    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByRetailerIdGraphQlCall;->getDataSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/content/BuyableGiftCardContent;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;->setBuyableGiftCardContent(Lcom/ibotta/api/model/content/BuyableGiftCardContent;)V

    return-object v0
.end method
