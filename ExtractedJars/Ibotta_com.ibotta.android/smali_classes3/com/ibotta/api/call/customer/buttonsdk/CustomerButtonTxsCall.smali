.class public Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;
.super Lcom/ibotta/api/BaseCacheableApiCall;
.source "CustomerButtonTxsCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseCacheableApiCall<",
        "Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private final customerId:I

.field private final date:J

.field private final retailerId:I

.field private final srcToken:Ljava/lang/String;


# direct methods
.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    const/4 v0, 0x1

    .line 20
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->setRequiresAuthToken(Z)V

    .line 21
    iput p1, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->customerId:I

    .line 22
    iput p2, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->retailerId:I

    .line 23
    iput-wide p3, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->date:J

    .line 24
    iput-object p5, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->srcToken:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public buildParams()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 44
    invoke-super {p0}, Lcom/ibotta/api/BaseCacheableApiCall;->buildParams()V

    .line 47
    iget-object v0, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->params:Ljava/util/Map;

    const-string v1, "retailer_id"

    iget v2, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->retailerId:I

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    iget-object v0, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->params:Ljava/util/Map;

    const-string v1, "date"

    new-instance v2, Ljava/util/Date;

    iget-wide v3, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->date:J

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p0, v2}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->formatISO8601Date(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    iget-object v0, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->params:Ljava/util/Map;

    const-string v1, "src_token"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->srcToken:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 54
    new-instance v0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsResponse;

    invoke-direct {v0}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsResponse;-><init>()V

    .line 55
    const-class v1, Lcom/ibotta/api/model/buttonsdk/ButtonTx;

    invoke-static {p1, p2, v1}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->fromJsonToArrayList(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsResponse;->setButtonTxs(Ljava/util/List;)V

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 39
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/button_transactions.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->customerId:I

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

    const-string v0, "customer_button_txs"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 3

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    iget v1, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->customerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    iget v1, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->retailerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    iget-wide v1, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->date:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 77
    iget-object v1, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsCall;->srcToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 34
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsResponse;",
            ">;"
        }
    .end annotation

    .line 29
    const-class v0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerButtonTxsResponse;

    return-object v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
