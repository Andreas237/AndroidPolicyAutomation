.class public Lcom/ibotta/api/call/offer/CustomerOfferDeleteCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "CustomerOfferDeleteCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/call/offer/CustomerOfferResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private final customerId:I

.field private final offerId:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 16
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 17
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/offer/CustomerOfferDeleteCall;->setRequiresAuthToken(Z)V

    .line 18
    iput p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferDeleteCall;->customerId:I

    .line 19
    iput p2, p0, Lcom/ibotta/api/call/offer/CustomerOfferDeleteCall;->offerId:I

    return-void
.end method


# virtual methods
.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/offer/CustomerOfferDeleteCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/offer/CustomerOfferResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/offer/CustomerOfferResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 39
    const-class v0, Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/offer/CustomerOfferDeleteCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 41
    new-instance p2, Lcom/ibotta/api/call/offer/CustomerOfferResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/offer/CustomerOfferResponse;-><init>()V

    const-string v0, "offers"

    .line 42
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "offers"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/fasterxml/jackson/databind/node/NullNode;->getInstance()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object v0

    :goto_0
    const-string v1, "bonuses"

    .line 43
    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "bonuses"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/fasterxml/jackson/databind/node/NullNode;->getInstance()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object p1

    .line 45
    :goto_1
    invoke-virtual {p2, v0}, Lcom/ibotta/api/call/offer/CustomerOfferResponse;->setOffers(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 46
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/offer/CustomerOfferResponse;->setBonuses(Lcom/fasterxml/jackson/databind/JsonNode;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 34
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/CustomerOfferDeleteCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/offers/%2$d.json"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/offer/CustomerOfferDeleteCall;->customerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lcom/ibotta/api/call/offer/CustomerOfferDeleteCall;->offerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 29
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->DELETE:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/offer/CustomerOfferResponse;",
            ">;"
        }
    .end annotation

    .line 24
    const-class v0, Lcom/ibotta/api/call/offer/CustomerOfferResponse;

    return-object v0
.end method
