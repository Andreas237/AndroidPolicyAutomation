.class public Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByIdGraphQlCall;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiCall;
.source "BuyableGiftCardByIdGraphQlCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseGraphQLApiCall<",
        "Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;",
        "Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private final buyableGiftCardMapper:Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;

.field private final contentId:Lcom/ibotta/android/apiandroid/content/ContentId;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByIdGraphQlCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 24
    invoke-virtual {p3}, Lcom/ibotta/android/graphql/mapper/Mappers;->getBuyableGiftCardMapper()Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByIdGraphQlCall;->buyableGiftCardMapper:Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;

    .line 25
    iput-object p4, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByIdGraphQlCall;->contentId:Lcom/ibotta/android/apiandroid/content/ContentId;

    return-void
.end method

.method public static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByIdGraphQlCall;Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$BuyableGiftCard;)Lcom/ibotta/api/model/content/BuyableGiftCardContent;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByIdGraphQlCall;->buyableGiftCardMapper:Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$BuyableGiftCard;->fragments()Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$BuyableGiftCard$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$BuyableGiftCard$Fragments;->buyableGiftCardFragment()Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

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
            "Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$Data;",
            ">;"
        }
    .end annotation

    .line 44
    invoke-static {}, Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery;->builder()Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByIdGraphQlCall;->contentId:Lcom/ibotta/android/apiandroid/content/ContentId;

    .line 45
    invoke-virtual {v1}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIntId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$Builder;->id(Ljava/lang/String;)Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$Builder;

    move-result-object v0

    .line 46
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$Builder;->build()Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery;

    move-result-object v0

    .line 48
    iget-object v1, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByIdGraphQlCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/buyableGiftCardById"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByIdGraphQlCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByIdGraphQlCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    iget-object v1, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByIdGraphQlCall;->contentId:Lcom/ibotta/android/apiandroid/content/ContentId;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getContentId()Lcom/ibotta/android/apiandroid/content/ContentId;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByIdGraphQlCall;->contentId:Lcom/ibotta/android/apiandroid/content/ContentId;

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "buyableGiftCardById"

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

    .line 34
    const-class v0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 15
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByIdGraphQlCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;"
        }
    .end annotation

    .line 58
    new-instance v0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;-><init>()V

    .line 61
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/graphql/buyablegiftcard/-$$Lambda$GoizrW1ywcwx8MmyQXNFy5SC9uQ;->INSTANCE:Lcom/ibotta/android/graphql/buyablegiftcard/-$$Lambda$GoizrW1ywcwx8MmyQXNFy5SC9uQ;

    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByIdGraphQlCall;->getDataSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/BuyableGiftCardByIdQuery$BuyableGiftCard;

    new-instance v1, Lcom/ibotta/android/graphql/buyablegiftcard/-$$Lambda$BuyableGiftCardByIdGraphQlCall$eA84DrBtw8Bif7Rh-VTFAC_1_Og;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/buyablegiftcard/-$$Lambda$BuyableGiftCardByIdGraphQlCall$eA84DrBtw8Bif7Rh-VTFAC_1_Og;-><init>(Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByIdGraphQlCall;)V

    .line 60
    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardByIdGraphQlCall;->getDataSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/content/BuyableGiftCardContent;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;->setBuyableGiftCardContent(Lcom/ibotta/api/model/content/BuyableGiftCardContent;)V

    return-object v0
.end method
