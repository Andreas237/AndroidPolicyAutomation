.class public Lcom/ibotta/api/call/paypal/PayPalLoginHttpExecution;
.super Lcom/ibotta/api/execution/ApiOkHttpExecution;
.source "PayPalLoginHttpExecution.java"


# static fields
.field private static final RESP_CODE_REDIRECT:I = 0x12e


# instance fields
.field private response:Lcom/ibotta/api/ApiResponse;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/ibotta/api/execution/ApiOkHttpExecution;-><init>()V

    return-void
.end method


# virtual methods
.method protected createClientBuilder()Lokhttp3/OkHttpClient$Builder;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 26
    invoke-super {p0}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->createClientBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 32
    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->followRedirects(Z)Lokhttp3/OkHttpClient$Builder;

    .line 33
    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->followSslRedirects(Z)Lokhttp3/OkHttpClient$Builder;

    return-object v0
.end method

.method protected processResponse(Lcom/ibotta/api/ApiCall;Lokhttp3/Response;)Lcom/ibotta/api/ApiResponse;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 40
    invoke-virtual {p2}, Lokhttp3/Response;->code()I

    move-result v0

    const-string v1, "Location"

    .line 41
    invoke-virtual {p2, v1}, Lokhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x12e

    if-ne v0, v2, :cond_0

    if-eqz v1, :cond_0

    .line 43
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 45
    invoke-static {v1}, Lcom/ibotta/api/call/paypal/PayPalLoginResponse;->create(Ljava/lang/String;)Lcom/ibotta/api/call/paypal/PayPalLoginResponse;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/call/paypal/PayPalLoginHttpExecution;->response:Lcom/ibotta/api/ApiResponse;

    goto :goto_0

    .line 47
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->processResponse(Lcom/ibotta/api/ApiCall;Lokhttp3/Response;)Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/call/paypal/PayPalLoginHttpExecution;->response:Lcom/ibotta/api/ApiResponse;

    .line 50
    :goto_0
    iget-object p1, p0, Lcom/ibotta/api/call/paypal/PayPalLoginHttpExecution;->response:Lcom/ibotta/api/ApiResponse;

    return-object p1
.end method
