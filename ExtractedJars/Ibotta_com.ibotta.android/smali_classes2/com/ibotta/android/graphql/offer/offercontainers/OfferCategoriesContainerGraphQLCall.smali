.class public Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;
.source "OfferCategoriesContainerGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall<",
        "Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;",
        "Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private contentMax:Ljava/lang/Integer;

.field private contentMin:Ljava/lang/Integer;

.field private limit:Ljava/lang/Integer;

.field private final mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

.field private retailerId:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    const p1, 0x7fffffff

    .line 38
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->limit:Ljava/lang/Integer;

    .line 44
    iput-object p2, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 45
    iput-object p3, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    return-void
.end method

.method private buildBuyableGiftCardMap(Lcom/apollographql/apollo/api/Response;)Ljava/util/LinkedHashMap;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data;",
            ">;)",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcom/ibotta/api/model/content/BuyableGiftCardContent;",
            ">;"
        }
    .end annotation

    .line 172
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 174
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data;->offerCategoriesContainer()Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer;->content()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content;

    .line 175
    iget-object v2, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    .line 176
    invoke-virtual {v2}, Lcom/ibotta/android/graphql/mapper/Mappers;->getBuyableGiftCardMapper()Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;

    move-result-object v2

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content;->fragments()Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->buyableGiftCardFragment()Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ibotta/android/graphql/mapper/BuyableGiftCardMapper;->map(Lcom/ibotta/android/graphql/fragment/BuyableGiftCardFragment;)Lcom/ibotta/api/model/content/BuyableGiftCardContent;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 178
    invoke-virtual {v1}, Lcom/ibotta/api/model/content/BuyableGiftCardContent;->getTypedId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private buildDealMap(Lcom/apollographql/apollo/api/Response;)Ljava/util/LinkedHashMap;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data;",
            ">;)",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcom/ibotta/api/model/content/DealContent;",
            ">;"
        }
    .end annotation

    .line 158
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 160
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data;->offerCategoriesContainer()Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer;->content()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content;

    .line 161
    iget-object v2, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/mapper/Mappers;->getDealMapper()Lcom/ibotta/android/graphql/mapper/DealMapper;

    move-result-object v2

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content;->fragments()Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->dealFragment()Lcom/ibotta/android/graphql/fragment/DealFragment;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ibotta/android/graphql/mapper/DealMapper;->map(Lcom/ibotta/android/graphql/fragment/DealFragment;)Lcom/ibotta/api/model/content/DealContent;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 163
    invoke-virtual {v1}, Lcom/ibotta/api/model/content/DealContent;->getTypedId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private buildOfferMap(Lcom/apollographql/apollo/api/Response;)Ljava/util/LinkedHashMap;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data;",
            ">;)",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcom/ibotta/api/model/content/OfferContent;",
            ">;"
        }
    .end annotation

    .line 144
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 146
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data;->offerCategoriesContainer()Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer;->content()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content;

    .line 147
    iget-object v2, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/mapper/Mappers;->getOfferMapper()Lcom/ibotta/android/graphql/mapper/OfferMapper;

    move-result-object v2

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content;->fragments()Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Content$Fragments;->offerFragment()Lcom/ibotta/android/graphql/fragment/OfferFragment;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->map(Lcom/ibotta/android/graphql/fragment/OfferFragment;)Lcom/ibotta/api/model/content/OfferContent;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 149
    invoke-virtual {v1}, Lcom/ibotta/api/model/content/OfferContent;->getTypedId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private swapContentReferencesWithFullContents(Lcom/apollographql/apollo/api/Response;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)Ljava/util/List;
    .locals 7
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data;",
            ">;",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcom/ibotta/api/model/content/OfferContent;",
            ">;",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcom/ibotta/api/model/content/DealContent;",
            ">;",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcom/ibotta/api/model/content/BuyableGiftCardContent;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/OfferCategoryContent;",
            ">;"
        }
    .end annotation

    .line 191
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 193
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data;->offerCategoriesContainer()Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$OfferCategoriesContainer;->containers()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container;

    .line 194
    iget-object v2, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->mappers:Lcom/ibotta/android/graphql/mapper/Mappers;

    invoke-virtual {v2}, Lcom/ibotta/android/graphql/mapper/Mappers;->getOfferCategoryWithReferencesMapper()Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;

    move-result-object v2

    .line 195
    invoke-virtual {v1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container;->fragments()Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container$Fragments;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Container$Fragments;->categoryWithReferencesFragment()Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;

    move-result-object v1

    .line 194
    invoke-virtual {v2, v1}, Lcom/ibotta/android/graphql/mapper/OfferCategoryWithReferencesMapper;->map(Lcom/ibotta/android/graphql/fragment/CategoryWithReferencesFragment;)Lcom/ibotta/api/model/content/OfferCategoryContent;

    move-result-object v1

    .line 197
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 198
    invoke-virtual {v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->getContentIds()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 199
    invoke-virtual {p2, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/api/model/OfferModel;

    if-eqz v4, :cond_0

    .line 202
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 206
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 207
    invoke-virtual {v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->getContentIds()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 208
    invoke-virtual {p3, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/api/model/DealModel;

    if-eqz v5, :cond_2

    .line 211
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 215
    :cond_3
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 216
    invoke-virtual {v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->getContentIds()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_4
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 217
    invoke-virtual {p4, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/api/model/BuyableGiftCardModel;

    if-eqz v6, :cond_4

    .line 220
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 224
    :cond_5
    invoke-virtual {v1, v2}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setOffers(Ljava/util/List;)V

    .line 225
    invoke-virtual {v1, v3}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setDeals(Ljava/util/List;)V

    .line 226
    invoke-virtual {v1, v4}, Lcom/ibotta/api/model/content/OfferCategoryContent;->setBuyableGiftCards(Ljava/util/List;)V

    .line 227
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_6
    return-object v0
.end method


# virtual methods
.method public createApolloCall()Lcom/apollographql/apollo/ApolloCall;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/ApolloCall<",
            "Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 92
    invoke-static {}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery;->builder()Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Builder;

    move-result-object v0

    .line 94
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->retailerId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 95
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Builder;->retailerId(Ljava/lang/Long;)Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Builder;

    .line 97
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->limit:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    .line 98
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Builder;->limit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Builder;

    .line 100
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->contentMin:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    .line 101
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Builder;->contentMin(Ljava/lang/Long;)Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Builder;

    .line 103
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->contentMax:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    .line 104
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Builder;->contentMax(Ljava/lang/Long;)Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Builder;

    .line 107
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Builder;->products(Z)Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Builder;

    .line 108
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Builder;->includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Builder;

    .line 110
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Builder;->build()Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/offer_categories_container"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 235
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 236
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 238
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->retailerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 239
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->limit:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 240
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->contentMin:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 241
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->contentMax:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 242
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 243
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 245
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getContentMax()Ljava/lang/Integer;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->contentMax:Ljava/lang/Integer;

    return-object v0
.end method

.method public getContentMin()Ljava/lang/Integer;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->contentMin:Ljava/lang/Integer;

    return-object v0
.end method

.method public getLimit()Ljava/lang/Integer;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->limit:Ljava/lang/Integer;

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "offerCategoriesContainer"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1

    .line 82
    const-class v0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;

    return-object v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->retailerId:Ljava/lang/Integer;

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 32
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/OfferCategoriesContainerGraphQLQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;"
        }
    .end annotation

    .line 120
    new-instance v0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;-><init>()V

    .line 123
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->buildOfferMap(Lcom/apollographql/apollo/api/Response;)Ljava/util/LinkedHashMap;

    move-result-object v1

    .line 124
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v2}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->setOffers(Ljava/util/List;)V

    .line 127
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->buildDealMap(Lcom/apollographql/apollo/api/Response;)Ljava/util/LinkedHashMap;

    move-result-object v2

    .line 128
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v3}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->setDeals(Ljava/util/List;)V

    .line 131
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->buildBuyableGiftCardMap(Lcom/apollographql/apollo/api/Response;)Ljava/util/LinkedHashMap;

    move-result-object v3

    .line 132
    new-instance v4, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v4}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->setBuyableGiftCards(Ljava/util/List;)V

    .line 134
    invoke-direct {p0, p1, v1, v2, v3}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->swapContentReferencesWithFullContents(Lcom/apollographql/apollo/api/Response;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)Ljava/util/List;

    move-result-object p1

    .line 137
    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->setOfferCategoryContents(Ljava/util/List;)V

    return-object v0
.end method

.method public setContentMax(Ljava/lang/Integer;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->contentMax:Ljava/lang/Integer;

    return-void
.end method

.method public setContentMin(Ljava/lang/Integer;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->contentMin:Ljava/lang/Integer;

    return-void
.end method

.method public setLimit(Ljava/lang/Integer;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->limit:Ljava/lang/Integer;

    return-void
.end method

.method public setRetailerId(Ljava/lang/Integer;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLCall;->retailerId:Ljava/lang/Integer;

    return-void
.end method
