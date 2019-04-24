.class public Lcom/ibotta/api/call/paypal/PayPalLinkPostCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "PayPalLinkPostCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/call/paypal/PayPalAccountResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private final payPalCallbackUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/api/call/paypal/PayPalLinkPostCall;->payPalCallbackUrl:Ljava/lang/String;

    const/4 p1, 0x1

    .line 22
    invoke-virtual {p0, p1}, Lcom/ibotta/api/call/paypal/PayPalLinkPostCall;->setRequiresAuthToken(Z)V

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

    .line 17
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/paypal/PayPalLinkPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/paypal/PayPalAccountResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/paypal/PayPalAccountResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 49
    const-class v0, Lcom/ibotta/api/model/customer/CustomerAccount;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/paypal/PayPalLinkPostCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/customer/CustomerAccount;

    invoke-static {p1}, Lcom/ibotta/api/call/paypal/PayPalAccountResponse;->create(Lcom/ibotta/api/model/customer/CustomerAccount;)Lcom/ibotta/api/call/paypal/PayPalAccountResponse;

    move-result-object p1

    return-object p1
.end method

.method public getApiExecution()Lcom/ibotta/api/execution/ApiExecution;
    .locals 2

    .line 44
    new-instance v0, Lcom/ibotta/api/call/paypal/PayPalAccountCreateHttpExecution;

    iget-object v1, p0, Lcom/ibotta/api/call/paypal/PayPalLinkPostCall;->payPalCallbackUrl:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/ibotta/api/call/paypal/PayPalAccountCreateHttpExecution;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 32
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->POST:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/paypal/PayPalAccountResponse;",
            ">;"
        }
    .end annotation

    .line 27
    const-class v0, Lcom/ibotta/api/call/paypal/PayPalAccountResponse;

    return-object v0
.end method
