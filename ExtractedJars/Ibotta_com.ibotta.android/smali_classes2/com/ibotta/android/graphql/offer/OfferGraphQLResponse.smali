.class public Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;
.source "OfferGraphQLResponse.java"


# instance fields
.field private offer:Lcom/ibotta/api/model/content/OfferContent;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getOffer()Lcom/ibotta/api/model/content/OfferContent;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;->offer:Lcom/ibotta/api/model/content/OfferContent;

    return-object v0
.end method

.method public getOfferAsModel()Lcom/ibotta/api/model/OfferModel;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;->offer:Lcom/ibotta/api/model/content/OfferContent;

    return-object v0
.end method

.method public setOffer(Lcom/ibotta/api/model/content/OfferContent;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;->offer:Lcom/ibotta/api/model/content/OfferContent;

    return-void
.end method
