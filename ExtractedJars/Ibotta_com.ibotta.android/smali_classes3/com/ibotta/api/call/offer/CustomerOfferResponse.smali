.class public Lcom/ibotta/api/call/offer/CustomerOfferResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "CustomerOfferResponse.java"


# instance fields
.field private bonuses:Lcom/fasterxml/jackson/databind/JsonNode;

.field private offers:Lcom/fasterxml/jackson/databind/JsonNode;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getBonuses()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferResponse;->bonuses:Lcom/fasterxml/jackson/databind/JsonNode;

    return-object v0
.end method

.method public getOffers()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferResponse;->offers:Lcom/fasterxml/jackson/databind/JsonNode;

    return-object v0
.end method

.method public setBonuses(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferResponse;->bonuses:Lcom/fasterxml/jackson/databind/JsonNode;

    return-void
.end method

.method public setOffers(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 0

    .line 15
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferResponse;->offers:Lcom/fasterxml/jackson/databind/JsonNode;

    return-void
.end method
