.class public Lcom/ibotta/api/call/offer/CustomerOffersDeactivateManyCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "CustomerOffersDeactivateManyCall.java"


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

.field private final offerIds:Ljava/lang/String;


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 17
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 18
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/offer/CustomerOffersDeactivateManyCall;->setRequiresAuthToken(Z)V

    .line 19
    iput p1, p0, Lcom/ibotta/api/call/offer/CustomerOffersDeactivateManyCall;->customerId:I

    .line 20
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerOffersDeactivateManyCall;->offerIds:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 24
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/offer/CustomerOffersDeactivateManyCall;->setRequiresAuthToken(Z)V

    .line 25
    iput p1, p0, Lcom/ibotta/api/call/offer/CustomerOffersDeactivateManyCall;->customerId:I

    if-eqz p2, :cond_2

    .line 27
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 29
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 30
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v3, v0

    if-ge v1, v3, :cond_0

    const-string v3, ","

    .line 32
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerOffersDeactivateManyCall;->offerIds:Ljava/lang/String;

    goto :goto_1

    :cond_2
    const-string p1, ""

    .line 39
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerOffersDeactivateManyCall;->offerIds:Ljava/lang/String;

    :goto_1
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

    .line 60
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 61
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOffersDeactivateManyCall;->params:Ljava/util/Map;

    const-string v1, "ids"

    iget-object v2, p0, Lcom/ibotta/api/call/offer/CustomerOffersDeactivateManyCall;->offerIds:Ljava/lang/String;

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
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/offer/CustomerOffersDeactivateManyCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/offer/CustomerOfferResponse;

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

    .line 66
    const-class v0, Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/offer/CustomerOffersDeactivateManyCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 68
    new-instance p2, Lcom/ibotta/api/call/offer/CustomerOfferResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/offer/CustomerOfferResponse;-><init>()V

    const-string v0, "offers"

    .line 69
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

    .line 70
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

    .line 72
    :goto_1
    invoke-virtual {p2, v0}, Lcom/ibotta/api/call/offer/CustomerOfferResponse;->setOffers(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 73
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/offer/CustomerOfferResponse;->setBonuses(Lcom/fasterxml/jackson/databind/JsonNode;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 55
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/CustomerOffersDeactivateManyCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/offers/deactivate_many.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/offer/CustomerOffersDeactivateManyCall;->customerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 50
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

    .line 45
    const-class v0, Lcom/ibotta/api/call/offer/CustomerOfferResponse;

    return-object v0
.end method
