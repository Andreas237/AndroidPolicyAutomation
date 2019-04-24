.class public Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;
.super Lcom/ibotta/api/FileUploadApiCall;
.source "CustomerReceiptsVerifyPostCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/FileUploadApiCall<",
        "Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;)V
    .locals 1

    .line 23
    invoke-direct {p0}, Lcom/ibotta/api/FileUploadApiCall;-><init>()V

    const/4 v0, 0x1

    .line 24
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;->setRequiresAuthToken(Z)V

    .line 25
    iput-object p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;

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

    .line 45
    invoke-super {p0}, Lcom/ibotta/api/FileUploadApiCall;->buildParams()V

    .line 47
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;->params:Ljava/util/Map;

    const-string v1, "customer_id"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->getCustomerId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;->params:Ljava/util/Map;

    const-string v1, "submission_id"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->getSubmissionId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;->params:Ljava/util/Map;

    const-string v1, "receipt[retailer_id]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->getRetailerId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;->params:Ljava/util/Map;

    const-string v1, "receipt_data[source]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->getSource()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;->params:Ljava/util/Map;

    const-string v1, "receipt_data[data]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->getData()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;->params:Ljava/util/Map;

    const-string v1, "receipt_data[signature]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->getSignature()Ljava/lang/String;

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

    .line 19
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 56
    const-class v0, Lcom/ibotta/api/model/receipt/Receipt;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/receipt/Receipt;

    .line 58
    new-instance p2, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostResponse;-><init>()V

    .line 59
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostResponse;->setReceipt(Lcom/ibotta/api/model/receipt/Receipt;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 40
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/receipts/verify.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;

    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->getCustomerId()I

    move-result v3

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

    .line 35
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->POST:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostResponse;",
            ">;"
        }
    .end annotation

    .line 30
    const-class v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostResponse;

    return-object v0
.end method
