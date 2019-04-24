.class public abstract Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;
.source "OfferTagSearchGraphQLResponse.java"

# interfaces
.implements Lcom/ibotta/android/api/ResponseOfferContainer;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;-><init>()V

    return-void
.end method

.method public static create(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)",
            "Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;"
        }
    .end annotation

    .line 30
    new-instance v0, Lcom/ibotta/android/graphql/search/offertag/AutoValue_OfferTagSearchGraphQLResponse;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/graphql/search/offertag/AutoValue_OfferTagSearchGraphQLResponse;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public getContainerOffers()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;->getOfferTagResults()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public abstract getOfferTagResults()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSearchedTerm()Ljava/lang/String;
.end method

.method public removeContainerOffer(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 26
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;->getOfferTagResults()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method
