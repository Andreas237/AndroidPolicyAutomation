.class public Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall;
.super Lcom/ibotta/api/JsonParamApiCall;
.source "BgcPaymentAccountsPostCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall$CallParams;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/JsonParamApiCall<",
        "Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;",
        ">;"
    }
.end annotation


# static fields
.field public static final API_FUNCTION:Ljava/lang/String; = "customers/%1s/paymentaccounts.json"


# instance fields
.field private final callParams:Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall$CallParams;

.field private final customerId:I


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall$CallParams;I)V
    .locals 1

    .line 18
    invoke-direct {p0}, Lcom/ibotta/api/JsonParamApiCall;-><init>()V

    const/4 v0, 0x1

    .line 19
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall;->setRequiresAuthToken(Z)V

    .line 20
    iput-object p1, p0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall;->callParams:Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall$CallParams;

    .line 21
    iput p2, p0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall;->customerId:I

    return-void
.end method


# virtual methods
.method public buildApiExecution()V
    .locals 1

    .line 45
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getApiExecutionFactory()Lcom/ibotta/api/execution/ApiExecutionFactory;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/execution/ApiExecutionFactory;->newIbottaPwiInstance()Lcom/ibotta/api/execution/ApiExecution;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall;->apiExecution:Lcom/ibotta/api/execution/ApiExecution;

    return-void
.end method

.method public buildParams()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 62
    invoke-super {p0}, Lcom/ibotta/api/JsonParamApiCall;->buildParams()V

    .line 63
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall;->callParams:Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall$CallParams;

    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall;->setJsonParam(Ljava/lang/Object;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;

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

    .line 50
    const-class v0, Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    .line 52
    invoke-static {}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;->builder()Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;

    move-result-object p2

    .line 53
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;->bgcPaymentAccount(Lcom/ibotta/api/model/pwi/BgcPaymentAccount;)Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;

    move-result-object p1

    const/4 p2, 0x0

    .line 54
    invoke-virtual {p1, p2}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;->response404(Z)Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;

    move-result-object p1

    .line 55
    invoke-virtual {p1}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;->build()Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;

    move-result-object p1

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1s/paymentaccounts.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall;->customerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCallParams()Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall$CallParams;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall;->callParams:Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPostCall$CallParams;

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
            "Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;",
            ">;"
        }
    .end annotation

    .line 26
    const-class v0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;

    return-object v0
.end method
