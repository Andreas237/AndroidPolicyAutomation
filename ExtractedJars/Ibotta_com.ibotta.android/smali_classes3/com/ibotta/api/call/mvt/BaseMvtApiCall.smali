.class public abstract Lcom/ibotta/api/call/mvt/BaseMvtApiCall;
.super Lcom/ibotta/api/BaseCacheableApiCall;
.source "BaseMvtApiCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/ibotta/api/CacheableApiResponse;",
        ">",
        "Lcom/ibotta/api/BaseCacheableApiCall<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    return-void
.end method


# virtual methods
.method public buildApiExecution()V
    .locals 1

    .line 23
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getApiExecutionFactory()Lcom/ibotta/api/execution/ApiExecutionFactory;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/execution/ApiExecutionFactory;->newIbottaMvtInstance()Lcom/ibotta/api/execution/ApiExecution;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/call/mvt/BaseMvtApiCall;->apiExecution:Lcom/ibotta/api/execution/ApiExecution;

    return-void
.end method

.method public buildHeaders()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 15
    sget-object v0, Lcom/ibotta/api/ApiModule;->INSTANCE:Lcom/ibotta/api/ApiModule;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiModule;->getHttpHeaders()Lcom/ibotta/api/HttpHeaders;

    move-result-object v0

    .line 17
    iget-object v1, p0, Lcom/ibotta/api/call/mvt/BaseMvtApiCall;->headers:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 18
    iget-object v1, p0, Lcom/ibotta/api/call/mvt/BaseMvtApiCall;->headers:Ljava/util/Map;

    const-string v2, "Authorization"

    invoke-virtual {v0}, Lcom/ibotta/api/HttpHeaders;->getBearer()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
