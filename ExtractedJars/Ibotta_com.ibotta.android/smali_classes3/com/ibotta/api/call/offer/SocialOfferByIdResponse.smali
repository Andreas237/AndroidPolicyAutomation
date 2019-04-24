.class public Lcom/ibotta/api/call/offer/SocialOfferByIdResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "SocialOfferByIdResponse.java"


# instance fields
.field private socialOffer:Lcom/ibotta/api/model/offer/SocialOffer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 23
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 24
    instance-of v0, p1, Lcom/ibotta/api/call/offer/SocialOfferByIdResponse;

    if-eqz v0, :cond_1

    .line 25
    check-cast p1, Lcom/ibotta/api/call/offer/SocialOfferByIdResponse;

    iget-object v0, p0, Lcom/ibotta/api/call/offer/SocialOfferByIdResponse;->socialOffer:Lcom/ibotta/api/model/offer/SocialOffer;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/offer/SocialOfferByIdResponse;->setSocialOffer(Lcom/ibotta/api/model/offer/SocialOffer;)V

    :cond_1
    return-void
.end method

.method public getSocialOffer()Lcom/ibotta/api/model/offer/SocialOffer;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/ibotta/api/call/offer/SocialOfferByIdResponse;->socialOffer:Lcom/ibotta/api/model/offer/SocialOffer;

    return-object v0
.end method

.method public setSocialOffer(Lcom/ibotta/api/model/offer/SocialOffer;)V
    .locals 0

    .line 15
    iput-object p1, p0, Lcom/ibotta/api/call/offer/SocialOfferByIdResponse;->socialOffer:Lcom/ibotta/api/model/offer/SocialOffer;

    return-void
.end method
