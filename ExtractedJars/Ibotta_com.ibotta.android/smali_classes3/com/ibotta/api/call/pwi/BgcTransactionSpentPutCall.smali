.class public Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall;
.super Lcom/ibotta/api/JsonParamApiCall;
.source "BgcTransactionSpentPutCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/JsonParamApiCall<",
        "Lcom/ibotta/api/call/pwi/BgcTransactionResponse;",
        ">;"
    }
.end annotation


# static fields
.field private static final API_FUNCTION:Ljava/lang/String; = "customers/%d/transactions/%s.json"


# instance fields
.field private final callParams:Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;

.field private final customerId:I

.field private final txnId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;ILjava/lang/String;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Lcom/ibotta/api/JsonParamApiCall;-><init>()V

    const/4 v0, 0x1

    .line 20
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall;->setRequiresAuthToken(Z)V

    .line 21
    iput-object p1, p0, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall;->callParams:Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;

    .line 22
    iput p2, p0, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall;->customerId:I

    .line 23
    iput-object p3, p0, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall;->txnId:Ljava/lang/String;

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

    iput-object v0, p0, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall;->apiExecution:Lcom/ibotta/api/execution/ApiExecution;

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
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall;->callParams:Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;

    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall;->setJsonParam(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/pwi/BgcTransactionResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/pwi/BgcTransactionResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 52
    const-class v0, Lcom/ibotta/api/model/pwi/BgcTransaction;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/pwi/BgcTransaction;

    .line 54
    new-instance p2, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;-><init>()V

    .line 55
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;->setBgcTransaction(Lcom/ibotta/api/model/pwi/BgcTransaction;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%d/transactions/%s.json"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall;->customerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall;->txnId:Ljava/lang/String;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCallParams()Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall;->callParams:Lcom/ibotta/api/call/pwi/BgcTransactionSpentPutCall$CallParams;

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 33
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->PUT:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/pwi/BgcTransactionResponse;",
            ">;"
        }
    .end annotation

    .line 28
    const-class v0, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;

    return-object v0
.end method
