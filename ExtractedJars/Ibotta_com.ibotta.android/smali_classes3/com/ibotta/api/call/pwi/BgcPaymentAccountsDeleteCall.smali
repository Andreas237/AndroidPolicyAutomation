.class public Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall;
.super Lcom/ibotta/api/JsonParamApiCall;
.source "BgcPaymentAccountsDeleteCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall$CallParams;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/JsonParamApiCall<",
        "Lcom/ibotta/api/EmptyResponse;",
        ">;"
    }
.end annotation


# static fields
.field public static final API_FUNCTION:Ljava/lang/String; = "customers/%1s/paymentaccounts.json"


# instance fields
.field private final callParams:Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall$CallParams;

.field private final customerId:I


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall$CallParams;I)V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/ibotta/api/JsonParamApiCall;-><init>()V

    const/4 v0, 0x1

    .line 21
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall;->setRequiresAuthToken(Z)V

    .line 22
    iput-object p1, p0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall;->callParams:Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall$CallParams;

    .line 23
    iput p2, p0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall;->customerId:I

    return-void
.end method


# virtual methods
.method public buildApiExecution()V
    .locals 1

    .line 47
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getApiExecutionFactory()Lcom/ibotta/api/execution/ApiExecutionFactory;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/execution/ApiExecutionFactory;->newIbottaPwiInstance()Lcom/ibotta/api/execution/ApiExecution;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall;->apiExecution:Lcom/ibotta/api/execution/ApiExecution;

    return-void
.end method

.method public buildParams()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 57
    invoke-super {p0}, Lcom/ibotta/api/JsonParamApiCall;->buildParams()V

    .line 58
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall;->callParams:Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall$CallParams;

    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall;->setJsonParam(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 14
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 52
    new-instance p1, Lcom/ibotta/api/EmptyResponse;

    invoke-direct {p1}, Lcom/ibotta/api/EmptyResponse;-><init>()V

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1s/paymentaccounts.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall;->customerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCallParams()Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall$CallParams;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall;->callParams:Lcom/ibotta/api/call/pwi/BgcPaymentAccountsDeleteCall$CallParams;

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 33
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->DELETE:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/EmptyResponse;",
            ">;"
        }
    .end annotation

    .line 28
    const-class v0, Lcom/ibotta/api/EmptyResponse;

    return-object v0
.end method
