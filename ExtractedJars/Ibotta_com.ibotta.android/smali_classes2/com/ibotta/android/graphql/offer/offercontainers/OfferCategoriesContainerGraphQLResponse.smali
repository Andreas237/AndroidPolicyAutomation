.class public Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;
.source "OfferCategoriesContainerGraphQLResponse.java"

# interfaces
.implements Lcom/ibotta/android/api/ResponseOfferContainer;


# instance fields
.field private buyableGiftCards:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/BuyableGiftCardContent;",
            ">;"
        }
    .end annotation
.end field

.field private deals:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/DealContent;",
            ">;"
        }
    .end annotation
.end field

.field private offerCategoryContents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/OfferCategoryContent;",
            ">;"
        }
    .end annotation
.end field

.field private offers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/OfferContent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;-><init>()V

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->offerCategoryContents:Ljava/util/List;

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->offers:Ljava/util/List;

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->deals:Ljava/util/List;

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->buyableGiftCards:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getBuyableGiftCards()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/BuyableGiftCardContent;",
            ">;"
        }
    .end annotation

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->buyableGiftCards:Ljava/util/List;

    return-object v0
.end method

.method public getBuyableGiftCardsAsModels()Ljava/util/List;
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;"
        }
    .end annotation

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->buyableGiftCards:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getContainerOffers()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 82
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 84
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 86
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->offerCategoryContents:Ljava/util/List;

    if-eqz v1, :cond_1

    .line 87
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/content/OfferCategoryContent;

    .line 88
    invoke-virtual {v2}, Lcom/ibotta/api/model/content/OfferCategoryContent;->getOffers()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 89
    invoke-virtual {v2}, Lcom/ibotta/api/model/content/OfferCategoryContent;->getOffers()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public getDeals()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/DealContent;",
            ">;"
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->deals:Ljava/util/List;

    return-object v0
.end method

.method public getDealsAsModels()Ljava/util/List;
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/DealModel;",
            ">;"
        }
    .end annotation

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->deals:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getOfferCategoriesAsModels()Ljava/util/List;
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            ">;"
        }
    .end annotation

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->offerCategoryContents:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getOfferCategoryContents()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/OfferCategoryContent;",
            ">;"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->offerCategoryContents:Ljava/util/List;

    return-object v0
.end method

.method public getOffers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/OfferContent;",
            ">;"
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->offers:Ljava/util/List;

    return-object v0
.end method

.method public getOffersAsModels()Ljava/util/List;
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->offers:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public removeContainerOffer(Lcom/ibotta/api/model/OfferModel;)V
    .locals 3

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->offers:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 100
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 103
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->offerCategoryContents:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 104
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/content/OfferCategoryContent;

    .line 105
    invoke-virtual {v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->getOffers()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 106
    invoke-virtual {v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->getOffers()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-void
.end method

.method public setBuyableGiftCards(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/BuyableGiftCardContent;",
            ">;)V"
        }
    .end annotation

    .line 77
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->buyableGiftCards:Ljava/util/List;

    return-void
.end method

.method public setDeals(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/DealContent;",
            ">;)V"
        }
    .end annotation

    .line 69
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->deals:Ljava/util/List;

    return-void
.end method

.method public setOfferCategoryContents(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/OfferCategoryContent;",
            ">;)V"
        }
    .end annotation

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->offerCategoryContents:Ljava/util/List;

    return-void
.end method

.method public setOffers(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/OfferContent;",
            ">;)V"
        }
    .end annotation

    .line 61
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->offers:Ljava/util/List;

    return-void
.end method
