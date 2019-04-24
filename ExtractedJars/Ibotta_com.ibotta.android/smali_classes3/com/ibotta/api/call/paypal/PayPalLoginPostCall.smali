.class public Lcom/ibotta/api/call/paypal/PayPalLoginPostCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "PayPalLoginPostCall.java"

# interfaces
.implements Lcom/ibotta/api/PasswordContainer;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/call/paypal/PayPalAccountResponse;",
        ">;",
        "Lcom/ibotta/api/PasswordContainer;"
    }
.end annotation


# static fields
.field private static final API_FUNCTION:Ljava/lang/String; = "paypal/accounts/login"


# instance fields
.field private final customerPassword:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 25
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/paypal/PayPalLoginPostCall;->setRequiresAuthToken(Z)V

    .line 26
    iput-object p1, p0, Lcom/ibotta/api/call/paypal/PayPalLoginPostCall;->customerPassword:Ljava/lang/String;

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

    .line 51
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 52
    iget-object v0, p0, Lcom/ibotta/api/call/paypal/PayPalLoginPostCall;->params:Ljava/util/Map;

    const-string v1, "password"

    iget-object v2, p0, Lcom/ibotta/api/call/paypal/PayPalLoginPostCall;->customerPassword:Ljava/lang/String;

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
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/paypal/PayPalLoginPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/paypal/PayPalAccountResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/paypal/PayPalAccountResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public getApiExecution()Lcom/ibotta/api/execution/ApiExecution;
    .locals 1

    .line 46
    new-instance v0, Lcom/ibotta/api/call/paypal/PayPalLoginHttpExecution;

    invoke-direct {v0}, Lcom/ibotta/api/call/paypal/PayPalLoginHttpExecution;-><init>()V

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "paypal/accounts/login"

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 36
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

    .line 31
    const-class v0, Lcom/ibotta/api/call/paypal/PayPalAccountResponse;

    return-object v0
.end method
