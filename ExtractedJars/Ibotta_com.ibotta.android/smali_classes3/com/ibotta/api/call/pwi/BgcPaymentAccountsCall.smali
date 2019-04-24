.class public Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;
.super Lcom/ibotta/api/BaseCacheableApiCall;
.source "BgcPaymentAccountsCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseCacheableApiCall<",
        "Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;",
        ">;"
    }
.end annotation


# static fields
.field private static final API_FUNCTION:Ljava/lang/String; = "customers/%1s/paymentaccounts.json"

.field private static final CACHE_FAMILY:Ljava/lang/String; = "bgc_payment_account"


# instance fields
.field private final customerId:I

.field private final isProduction:Z


# direct methods
.method public constructor <init>(IZ)V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    const/4 v0, 0x1

    .line 21
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;->setRequiresAuthToken(Z)V

    .line 22
    iput p1, p0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;->customerId:I

    .line 23
    iput-boolean p2, p0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;->isProduction:Z

    return-void
.end method


# virtual methods
.method public buildApiExecution()V
    .locals 1

    .line 53
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getApiExecutionFactory()Lcom/ibotta/api/execution/ApiExecutionFactory;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/execution/ApiExecutionFactory;->newIbottaPwiInstance()Lcom/ibotta/api/execution/ApiExecution;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;->apiExecution:Lcom/ibotta/api/execution/ApiExecution;

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
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 43
    const-class v0, Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    .line 45
    invoke-static {}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;->builder()Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;

    move-result-object p2

    .line 46
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;->bgcPaymentAccount(Lcom/ibotta/api/model/pwi/BgcPaymentAccount;)Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;

    move-result-object p1

    const/4 p2, 0x0

    .line 47
    invoke-virtual {p1, p2}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;->response404(Z)Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;

    move-result-object p1

    .line 48
    invoke-virtual {p1}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;->build()Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;

    move-result-object p1

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1s/paymentaccounts.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;->customerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCacheFamily()Ljava/lang/String;
    .locals 1

    const-string v0, "bgc_payment_account"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    invoke-virtual {p0}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    invoke-virtual {p0}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    iget v1, p0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;->customerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    iget-boolean v1, p0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;->isProduction:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 63
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 33
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;",
            ">;"
        }
    .end annotation

    .line 28
    const-class v0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;

    return-object v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
