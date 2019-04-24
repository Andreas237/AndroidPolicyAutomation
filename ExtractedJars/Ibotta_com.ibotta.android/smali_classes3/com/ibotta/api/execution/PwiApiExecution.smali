.class public Lcom/ibotta/api/execution/PwiApiExecution;
.super Lcom/ibotta/api/execution/ApiOkHttpExecution;
.source "PwiApiExecution.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/execution/PwiApiExecution$Status;
    }
.end annotation


# static fields
.field private static final API_PATH_FORMAT:Ljava/lang/String; = "%1$s/%2$s"

.field private static final RESP_CODE_NOT_FOUND:I = 0x194


# instance fields
.field private paymentAccountsResponse:Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/ibotta/api/execution/ApiOkHttpExecution;-><init>()V

    return-void
.end method


# virtual methods
.method public getEndpoint(Lcom/ibotta/api/ApiCall;)Ljava/lang/String;
    .locals 4

    const-string v0, "%1$s/%2$s"

    const/4 v1, 0x2

    .line 36
    new-array v1, v1, [Ljava/lang/Object;

    sget-object v2, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v2}, Lcom/ibotta/api/ApiContext;->getPwiApiUrl()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getApiFunction()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected processResponse(Lcom/ibotta/api/ApiCall;Lokhttp3/Response;)Lcom/ibotta/api/ApiResponse;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 41
    instance-of v0, p1, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lokhttp3/Response;->code()I

    move-result v0

    const/16 v1, 0x194

    if-ne v0, v1, :cond_0

    .line 43
    check-cast p1, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsCall;->setSkipCacheSave(Z)V

    .line 44
    invoke-static {}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;->builder()Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;

    move-result-object p1

    const/4 v0, 0x0

    .line 45
    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;->bgcPaymentAccount(Lcom/ibotta/api/model/pwi/BgcPaymentAccount;)Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;

    move-result-object p1

    .line 46
    invoke-virtual {p1, p2}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;->response404(Z)Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;

    move-result-object p1

    .line 47
    invoke-virtual {p1}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;->build()Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/execution/PwiApiExecution;->paymentAccountsResponse:Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;

    .line 49
    iget-object p1, p0, Lcom/ibotta/api/execution/PwiApiExecution;->paymentAccountsResponse:Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;

    return-object p1

    .line 62
    :cond_0
    :try_start_0
    invoke-super {p0, p1, p2}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->processResponse(Lcom/ibotta/api/ApiCall;Lokhttp3/Response;)Lcom/ibotta/api/ApiResponse;

    move-result-object p1
    :try_end_0
    .catch Lcom/ibotta/api/ApiException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 67
    invoke-virtual {p1}, Lcom/ibotta/api/ApiException;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 69
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 79
    :try_start_1
    invoke-virtual {p0}, Lcom/ibotta/api/execution/PwiApiExecution;->getJson()Lcom/ibotta/android/json/IbottaJson;

    move-result-object v1

    const-class v2, Lcom/ibotta/api/model/pwi/PwiError;

    invoke-interface {v1, v0, v2}, Lcom/ibotta/android/json/IbottaJson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/pwi/PwiError;

    .line 80
    invoke-static {}, Lcom/ibotta/api/call/pwi/PwiErrorResponse;->builder()Lcom/ibotta/api/call/pwi/PwiErrorResponse$Builder;

    move-result-object v1

    .line 81
    invoke-virtual {v1, v0}, Lcom/ibotta/api/call/pwi/PwiErrorResponse$Builder;->pwiError(Lcom/ibotta/api/model/pwi/PwiError;)Lcom/ibotta/api/call/pwi/PwiErrorResponse$Builder;

    move-result-object v0

    .line 82
    invoke-virtual {v0}, Lcom/ibotta/api/call/pwi/PwiErrorResponse$Builder;->build()Lcom/ibotta/api/call/pwi/PwiErrorResponse;

    move-result-object v0

    .line 84
    invoke-virtual {p2}, Lokhttp3/Response;->code()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/ibotta/api/call/pwi/PwiErrorResponse;->setResponseCode(I)V
    :try_end_1
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    .line 89
    :catch_1
    throw p1

    .line 72
    :cond_1
    throw p1
.end method
