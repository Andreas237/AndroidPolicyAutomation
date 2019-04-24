.class public Lcom/ibotta/api/call/offer/CustomerOfferChoosePutCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "CustomerOfferChoosePutCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/call/offer/CustomerOfferChoosePutResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private final customerId:I

.field private final offerId:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 17
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 18
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/offer/CustomerOfferChoosePutCall;->setRequiresAuthToken(Z)V

    .line 19
    iput p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferChoosePutCall;->customerId:I

    .line 20
    iput p2, p0, Lcom/ibotta/api/call/offer/CustomerOfferChoosePutCall;->offerId:I

    return-void
.end method


# virtual methods
.method public buildParams()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 40
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 42
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferChoosePutCall;->params:Ljava/util/Map;

    const-string v1, "customer_id"

    iget v2, p0, Lcom/ibotta/api/call/offer/CustomerOfferChoosePutCall;->customerId:I

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferChoosePutCall;->params:Ljava/util/Map;

    const-string v1, "offer_id"

    iget v2, p0, Lcom/ibotta/api/call/offer/CustomerOfferChoosePutCall;->offerId:I

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/offer/CustomerOfferChoosePutCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/offer/CustomerOfferChoosePutResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/offer/CustomerOfferChoosePutResponse;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 48
    const-class v0, Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/offer/CustomerOfferChoosePutCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 50
    new-instance v0, Lcom/ibotta/api/call/offer/CustomerOfferChoosePutResponse;

    invoke-direct {v0}, Lcom/ibotta/api/call/offer/CustomerOfferChoosePutResponse;-><init>()V

    const-string v1, "offers"

    .line 51
    invoke-virtual {p2, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "offers"

    invoke-virtual {p2, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/fasterxml/jackson/databind/node/NullNode;->getInstance()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object v1

    :goto_0
    const-string v2, "bonuses"

    .line 52
    invoke-virtual {p2, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "bonuses"

    invoke-virtual {p2, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/fasterxml/jackson/databind/node/NullNode;->getInstance()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object v2

    :goto_1
    const-string v3, "customer"

    .line 53
    invoke-virtual {p2, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "customer"

    invoke-virtual {p2, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p2

    goto :goto_2

    :cond_2
    invoke-static {}, Lcom/fasterxml/jackson/databind/node/NullNode;->getInstance()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object p2

    .line 55
    :goto_2
    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/offer/CustomerOfferChoosePutResponse;->setOffers(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 56
    invoke-virtual {v0, v2}, Lcom/ibotta/api/call/offer/CustomerOfferChoosePutResponse;->setBonuses(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 57
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object p2

    const-class v1, Lcom/ibotta/api/model/customer/Customer;

    invoke-static {p1, p2, v1}, Lcom/ibotta/api/call/offer/CustomerOfferChoosePutCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/offer/CustomerOfferChoosePutResponse;->setCustomer(Lcom/ibotta/api/model/customer/Customer;)V

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/CustomerOfferChoosePutCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/offers/%2$d/choose.json"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/offer/CustomerOfferChoosePutCall;->customerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lcom/ibotta/api/call/offer/CustomerOfferChoosePutCall;->offerId:I

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

    .line 30
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->PUT:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/offer/CustomerOfferChoosePutResponse;",
            ">;"
        }
    .end annotation

    .line 25
    const-class v0, Lcom/ibotta/api/call/offer/CustomerOfferChoosePutResponse;

    return-object v0
.end method
