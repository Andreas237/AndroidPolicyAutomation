.class public Lcom/ibotta/api/call/problem/LogErrorPostCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "LogErrorPostCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/EmptyResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private customerId:Ljava/lang/Integer;

.field private errorStr:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 16
    invoke-direct {p0, p1, v0}, Lcom/ibotta/api/call/problem/LogErrorPostCall;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/problem/LogErrorPostCall;->setRequiresAuthToken(Z)V

    .line 21
    iput-object p1, p0, Lcom/ibotta/api/call/problem/LogErrorPostCall;->errorStr:Ljava/lang/String;

    .line 22
    iput-object p2, p0, Lcom/ibotta/api/call/problem/LogErrorPostCall;->customerId:Ljava/lang/Integer;

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

    .line 42
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 44
    iget-object v0, p0, Lcom/ibotta/api/call/problem/LogErrorPostCall;->params:Ljava/util/Map;

    const-string v1, "error_str"

    iget-object v2, p0, Lcom/ibotta/api/call/problem/LogErrorPostCall;->errorStr:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    iget-object v0, p0, Lcom/ibotta/api/call/problem/LogErrorPostCall;->customerId:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 46
    iget-object v0, p0, Lcom/ibotta/api/call/problem/LogErrorPostCall;->params:Ljava/util/Map;

    const-string v1, "customer_id"

    iget-object v2, p0, Lcom/ibotta/api/call/problem/LogErrorPostCall;->customerId:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/problem/LogErrorPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;

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
    .locals 1

    const-string v0, "problems/log_error.json"

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
            "Lcom/ibotta/api/EmptyResponse;",
            ">;"
        }
    .end annotation

    .line 27
    const-class v0, Lcom/ibotta/api/EmptyResponse;

    return-object v0
.end method
