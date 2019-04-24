.class public Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;
.super Lcom/ibotta/api/BaseCacheableApiCall;
.source "BgcTransactionByIdCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseCacheableApiCall<",
        "Lcom/ibotta/api/call/pwi/BgcTransactionResponse;",
        ">;"
    }
.end annotation


# static fields
.field public static final API_FUNCTION:Ljava/lang/String; = "customers/%1d/transactions/%s.json"

.field private static final CACHE_FAMILY:Ljava/lang/String; = "bgc_transactions"

.field private static final cacheableStatus:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final customerId:I

.field private final transactionId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "CAPTURED"

    const-string v1, "COMPLETE"

    .line 20
    invoke-static {v0, v1}, Ljava9/util/Sets;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;->cacheableStatus:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    const/4 v0, 0x1

    .line 27
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;->setRequiresAuthToken(Z)V

    .line 28
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;->setSkipCacheSave(Z)V

    .line 29
    iput p1, p0, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;->customerId:I

    .line 30
    iput-object p2, p0, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;->transactionId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public buildApiExecution()V
    .locals 1

    .line 75
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getApiExecutionFactory()Lcom/ibotta/api/execution/ApiExecutionFactory;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/execution/ApiExecutionFactory;->newIbottaPwiInstance()Lcom/ibotta/api/execution/ApiExecution;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;->apiExecution:Lcom/ibotta/api/execution/ApiExecution;

    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 18
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/pwi/BgcTransactionResponse;

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

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/pwi/BgcTransaction;

    .line 53
    sget-object p2, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;->cacheableStatus:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getStatus()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    .line 54
    invoke-virtual {p0, p2}, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;->setSkipCacheSave(Z)V

    .line 57
    :cond_0
    new-instance p2, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;-><init>()V

    .line 58
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;->setBgcTransaction(Lcom/ibotta/api/model/pwi/BgcTransaction;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 45
    invoke-virtual {p0}, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1d/transactions/%s.json"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;->customerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;->transactionId:Ljava/lang/String;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCacheFamily()Ljava/lang/String;
    .locals 1

    const-string v0, "bgc_transactions"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    invoke-virtual {p0}, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    invoke-virtual {p0}, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    iget v1, p0, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;->customerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    iget-object v1, p0, Lcom/ibotta/api/call/pwi/BgcTransactionByIdCall;->transactionId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 40
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

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

    .line 35
    const-class v0, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;

    return-object v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
