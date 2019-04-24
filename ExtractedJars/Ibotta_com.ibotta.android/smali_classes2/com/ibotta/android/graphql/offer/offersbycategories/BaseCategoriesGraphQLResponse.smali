.class public abstract Lcom/ibotta/android/graphql/offer/offersbycategories/BaseCategoriesGraphQLResponse;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;
.source "BaseCategoriesGraphQLResponse.java"

# interfaces
.implements Lcom/ibotta/android/api/ResponseOfferContainer;


# instance fields
.field private offerCategoryContents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/OfferCategoryContent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;-><init>()V

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/BaseCategoriesGraphQLResponse;->offerCategoryContents:Ljava/util/List;

    return-void
.end method


# virtual methods
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

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/BaseCategoriesGraphQLResponse;->offerCategoryContents:Ljava/util/List;

    if-nez v0, :cond_0

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 39
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/BaseCategoriesGraphQLResponse;->offerCategoryContents:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/content/OfferCategoryContent;

    if-eqz v2, :cond_1

    .line 41
    invoke-virtual {v2}, Lcom/ibotta/api/model/content/OfferCategoryContent;->getOffers()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 42
    invoke-virtual {v2}, Lcom/ibotta/api/model/content/OfferCategoryContent;->getOffers()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_2
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

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/BaseCategoriesGraphQLResponse;->offerCategoryContents:Ljava/util/List;

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

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/BaseCategoriesGraphQLResponse;->offerCategoryContents:Ljava/util/List;

    return-object v0
.end method

.method public removeContainerOffer(Lcom/ibotta/api/model/OfferModel;)V
    .locals 3

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/BaseCategoriesGraphQLResponse;->offerCategoryContents:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    .line 55
    :cond_0
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

    if-eqz v1, :cond_1

    .line 56
    invoke-virtual {v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->getOffers()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 57
    invoke-virtual {v1}, Lcom/ibotta/api/model/content/OfferCategoryContent;->getOffers()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
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

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/BaseCategoriesGraphQLResponse;->offerCategoryContents:Ljava/util/List;

    return-void
.end method
