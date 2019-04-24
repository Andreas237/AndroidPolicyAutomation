.class public Lcom/ibotta/api/call/offer/CustomerOffersResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "CustomerOffersResponse.java"


# instance fields
.field private offers:Lcom/fasterxml/jackson/databind/JsonNode;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 22
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 23
    instance-of v0, p1, Lcom/ibotta/api/call/offer/CustomerOffersResponse;

    if-eqz v0, :cond_1

    .line 24
    check-cast p1, Lcom/ibotta/api/call/offer/CustomerOffersResponse;

    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOffersResponse;->offers:Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/offer/CustomerOffersResponse;->setOffers(Lcom/fasterxml/jackson/databind/JsonNode;)V

    :cond_1
    return-void
.end method

.method public getOffers()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOffersResponse;->offers:Lcom/fasterxml/jackson/databind/JsonNode;

    return-object v0
.end method

.method public setOffers(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerOffersResponse;->offers:Lcom/fasterxml/jackson/databind/JsonNode;

    return-void
.end method
