.class public Lcom/ibotta/api/call/offer/CustomerOfferPostCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "CustomerOfferPostCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/EmptyResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private customerId:I

.field private email:Ljava/lang/String;

.field private retailerId:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(ILjava/lang/Integer;Ljava/lang/String;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 18
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/offer/CustomerOfferPostCall;->setRequiresAuthToken(Z)V

    .line 19
    iput p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferPostCall;->customerId:I

    .line 20
    iput-object p2, p0, Lcom/ibotta/api/call/offer/CustomerOfferPostCall;->retailerId:Ljava/lang/Integer;

    .line 21
    iput-object p3, p0, Lcom/ibotta/api/call/offer/CustomerOfferPostCall;->email:Ljava/lang/String;

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

    .line 41
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 43
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPostCall;->retailerId:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 44
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPostCall;->params:Ljava/util/Map;

    const-string v1, "retailer_id"

    iget-object v2, p0, Lcom/ibotta/api/call/offer/CustomerOfferPostCall;->retailerId:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPostCall;->email:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 47
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPostCall;->params:Ljava/util/Map;

    const-string v1, "email"

    iget-object v2, p0, Lcom/ibotta/api/call/offer/CustomerOfferPostCall;->email:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/offer/CustomerOfferPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 53
    new-instance p1, Lcom/ibotta/api/EmptyResponse;

    invoke-direct {p1}, Lcom/ibotta/api/EmptyResponse;-><init>()V

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/CustomerOfferPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/offers/email.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/offer/CustomerOfferPostCall;->customerId:I

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

    .line 31
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->POST:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/EmptyResponse;",
            ">;"
        }
    .end annotation

    .line 26
    const-class v0, Lcom/ibotta/api/EmptyResponse;

    return-object v0
.end method
