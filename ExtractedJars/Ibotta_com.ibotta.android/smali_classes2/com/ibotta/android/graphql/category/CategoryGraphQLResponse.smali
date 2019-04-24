.class public Lcom/ibotta/android/graphql/category/CategoryGraphQLResponse;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;
.source "CategoryGraphQLResponse.java"

# interfaces
.implements Lcom/ibotta/android/api/ResponseOfferContainer;


# instance fields
.field private category:Lcom/ibotta/api/model/content/OfferCategoryContent;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getCategory()Lcom/ibotta/api/model/content/OfferCategoryContent;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLResponse;->category:Lcom/ibotta/api/model/content/OfferCategoryContent;

    return-object v0
.end method

.method public getCategoryAsModel()Lcom/ibotta/api/model/OfferCategoryModel;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLResponse;->category:Lcom/ibotta/api/model/content/OfferCategoryContent;

    return-object v0
.end method

.method public getContainerOffers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLResponse;->category:Lcom/ibotta/api/model/content/OfferCategoryContent;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ibotta/api/model/content/OfferCategoryContent;->getOffers()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 37
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLResponse;->category:Lcom/ibotta/api/model/content/OfferCategoryContent;

    invoke-virtual {v0}, Lcom/ibotta/api/model/content/OfferCategoryContent;->getOffers()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 34
    :cond_1
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public removeContainerOffer(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLResponse;->category:Lcom/ibotta/api/model/content/OfferCategoryContent;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ibotta/api/model/content/OfferCategoryContent;->getOffers()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 46
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLResponse;->category:Lcom/ibotta/api/model/content/OfferCategoryContent;

    invoke-virtual {v0}, Lcom/ibotta/api/model/content/OfferCategoryContent;->getOffers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public setCategory(Lcom/ibotta/api/model/content/OfferCategoryContent;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/graphql/category/CategoryGraphQLResponse;->category:Lcom/ibotta/api/model/content/OfferCategoryContent;

    return-void
.end method
