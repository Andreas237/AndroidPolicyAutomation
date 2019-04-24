.class public Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "CustomerLoyaltiesPutCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall$CallParams;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private callParams:Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall$CallParams;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall$CallParams;)V
    .locals 1

    .line 14
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 15
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall;->setRequiresAuthToken(Z)V

    .line 16
    iput-object p1, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall;->callParams:Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall$CallParams;

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

    .line 37
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 40
    iget-object v0, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall;->params:Ljava/util/Map;

    const-string v1, "entry_type"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall;->callParams:Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall$CallParams;->getType()Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->toApiName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    iget-object v0, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall;->params:Ljava/util/Map;

    const-string v1, "value"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall;->callParams:Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall$CallParams;->getValue()Ljava/lang/String;

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

    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 46
    const-class v0, Lcom/ibotta/api/model/customer/CustomerLoyalty;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/customer/CustomerLoyalty;

    .line 47
    new-instance p2, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutResponse;-><init>()V

    .line 48
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutResponse;->setCustomerLoyalty(Lcom/ibotta/api/model/customer/CustomerLoyalty;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 31
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/loyalties/%2$d.json"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall;->callParams:Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall$CallParams;

    .line 32
    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall$CallParams;->getCustomerId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall;->callParams:Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall$CallParams;

    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall$CallParams;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 31
    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 26
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->PUT:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutResponse;",
            ">;"
        }
    .end annotation

    .line 21
    const-class v0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutResponse;

    return-object v0
.end method
