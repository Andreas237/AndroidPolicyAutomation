.class public Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;
.source "OffersGraphQLResponse.java"

# interfaces
.implements Lcom/ibotta/android/api/ResponseOfferContainer;


# instance fields
.field protected offers:Ljava/util/List;
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

    .line 16
    invoke-direct {p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;-><init>()V

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->offers:Ljava/util/List;

    return-void
.end method


# virtual methods
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

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object v0

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

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->offers:Ljava/util/List;

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

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->offers:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public removeContainerOffer(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->offers:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 41
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
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

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->offers:Ljava/util/List;

    return-void
.end method
