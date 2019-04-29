.class public Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "CustomerAccountByIdCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private accountId:I

.field private customerId:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 15
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 16
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdCall;->setRequiresAuthToken(Z)V

    .line 17
    iput p1, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdCall;->customerId:I

    .line 18
    iput p2, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdCall;->accountId:I

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

    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 38
    const-class v0, Lcom/ibotta/api/model/customer/CustomerAccount;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/customer/CustomerAccount;

    .line 40
    new-instance p2, Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdResponse;-><init>()V

    .line 41
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdResponse;->setCustomerAccount(Lcom/ibotta/api/model/customer/CustomerAccount;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 33
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/accounts/%2$d.json"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdCall;->customerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdCall;->accountId:I

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

    .line 28
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 46
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdCall;->getApiFunction()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdResponse;",
            ">;"
        }
    .end annotation

    .line 23
    const-class v0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountByIdResponse;

    return-object v0
.end method