.class public Lcom/ibotta/api/call/offer/CombinedOffersResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "CombinedOffersResponse.java"


# instance fields
.field private categories:Lcom/fasterxml/jackson/databind/JsonNode;

.field private categorySettings:Lcom/fasterxml/jackson/databind/JsonNode;

.field private customerOffers:Lcom/fasterxml/jackson/databind/JsonNode;

.field private offers:Lcom/fasterxml/jackson/databind/JsonNode;

.field private promos:Lcom/fasterxml/jackson/databind/JsonNode;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    return-void
.end method

.method public static removeOffer(Lcom/ibotta/api/call/offer/CombinedOffersResponse;I)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 74
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->getCustomerOffers()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 75
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->getOffers()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p0

    if-eqz v0, :cond_1

    .line 77
    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JsonNode;->isObject()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 78
    check-cast v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->remove(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    :cond_1
    if-eqz p0, :cond_2

    .line 80
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/JsonNode;->isObject()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 81
    check-cast p0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->remove(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    :cond_2
    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 59
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 60
    instance-of v0, p1, Lcom/ibotta/api/call/offer/CombinedOffersResponse;

    if-eqz v0, :cond_1

    .line 61
    check-cast p1, Lcom/ibotta/api/call/offer/CombinedOffersResponse;

    iget-object v0, p0, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->categories:Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->setCategories(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 62
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->promos:Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->setPromos(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 63
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->customerOffers:Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->setCustomerOffers(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 64
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->offers:Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->setOffers(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 65
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->categorySettings:Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->setCategorySettings(Lcom/fasterxml/jackson/databind/JsonNode;)V

    :cond_1
    return-void
.end method

.method public getCategories()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->categories:Lcom/fasterxml/jackson/databind/JsonNode;

    return-object v0
.end method

.method public getCategorySettings()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->categorySettings:Lcom/fasterxml/jackson/databind/JsonNode;

    return-object v0
.end method

.method public getCustomerOffers()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->customerOffers:Lcom/fasterxml/jackson/databind/JsonNode;

    return-object v0
.end method

.method public getOffers()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->offers:Lcom/fasterxml/jackson/databind/JsonNode;

    return-object v0
.end method

.method public getPromos()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->promos:Lcom/fasterxml/jackson/databind/JsonNode;

    return-object v0
.end method

.method public setCategories(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->categories:Lcom/fasterxml/jackson/databind/JsonNode;

    return-void
.end method

.method public setCategorySettings(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->categorySettings:Lcom/fasterxml/jackson/databind/JsonNode;

    return-void
.end method

.method public setCustomerOffers(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->customerOffers:Lcom/fasterxml/jackson/databind/JsonNode;

    return-void
.end method

.method public setOffers(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->offers:Lcom/fasterxml/jackson/databind/JsonNode;

    return-void
.end method

.method public setPromos(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->promos:Lcom/fasterxml/jackson/databind/JsonNode;

    return-void
.end method
