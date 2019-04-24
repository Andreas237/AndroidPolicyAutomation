.class public Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "CustomerReceiptsCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private customerId:I

.field private scope:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 27
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 28
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall;->setRequiresAuthToken(Z)V

    .line 29
    iput p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall;->customerId:I

    return-void
.end method

.method public constructor <init>(ILcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall;-><init>(I)V

    .line 34
    iput-object p2, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall;->scope:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

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

    .line 54
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 56
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall;->scope:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

    if-eqz v0, :cond_0

    .line 57
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall;->params:Ljava/util/Map;

    const-string v1, "scope"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall;->scope:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall$Scope;->getApiName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 63
    const-class v0, Lcom/ibotta/api/model/receipt/Receipt;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall;->fromJsonToArrayList(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object p1

    .line 65
    new-instance p2, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsResponse;-><init>()V

    .line 66
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsResponse;->setReceipts(Ljava/util/List;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 49
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/receipts.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsCall;->customerId:I

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

    .line 44
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsResponse;",
            ">;"
        }
    .end annotation

    .line 39
    const-class v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsResponse;

    return-object v0
.end method
