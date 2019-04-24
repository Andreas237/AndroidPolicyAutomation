.class public Lcom/ibotta/api/call/pwi/BgcPostTransactionCall;
.super Lcom/ibotta/api/JsonParamApiCall;
.source "BgcPostTransactionCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;
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
.field public static final API_FUNCTION:Ljava/lang/String; = "customers/%1d/transactions.json"


# instance fields
.field private final callParams:Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;

.field private final customerId:I


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;I)V
    .locals 1

    .line 18
    invoke-direct {p0}, Lcom/ibotta/api/JsonParamApiCall;-><init>()V

    const/4 v0, 0x1

    .line 19
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall;->setRequiresAuthToken(Z)V

    .line 20
    iput-object p1, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall;->callParams:Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;

    .line 21
    iput p2, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall;->customerId:I

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

    iput-object v0, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall;->apiExecution:Lcom/ibotta/api/execution/ApiExecution;

    return-void
.end method

.method public buildParams()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 60
    invoke-super {p0}, Lcom/ibotta/api/JsonParamApiCall;->buildParams()V

    .line 61
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall;->callParams:Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;

    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall;->setJsonParam(Ljava/lang/Object;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/pwi/BgcTransactionResponse;

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

    .line 50
    const-class v0, Lcom/ibotta/api/model/pwi/BgcTransaction;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/pwi/BgcTransaction;

    .line 52
    new-instance p2, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;-><init>()V

    .line 53
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;->setBgcTransaction(Lcom/ibotta/api/model/pwi/BgcTransaction;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1d/transactions.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall;->customerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCallParams()Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall;->callParams:Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;

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
            "Lcom/ibotta/api/call/pwi/BgcTransactionResponse;",
            ">;"
        }
    .end annotation

    .line 26
    const-class v0, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;

    return-object v0
.end method
