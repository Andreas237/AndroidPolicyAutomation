.class public Lcom/ibotta/api/call/mvt/TestVariantsCall;
.super Lcom/ibotta/api/call/mvt/BaseMvtApiCall;
.source "TestVariantsCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/call/mvt/BaseMvtApiCall<",
        "Lcom/ibotta/api/call/mvt/TestVariantsResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private customerId:Ljava/lang/Integer;

.field private customerUuid:Ljava/lang/String;

.field private final includeTestId:Z


# direct methods
.method public constructor <init>(IZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/ibotta/api/call/mvt/BaseMvtApiCall;-><init>()V

    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/call/mvt/TestVariantsCall;->customerId:Ljava/lang/Integer;

    .line 19
    iput-boolean p2, p0, Lcom/ibotta/api/call/mvt/TestVariantsCall;->includeTestId:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/ibotta/api/call/mvt/BaseMvtApiCall;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/api/call/mvt/TestVariantsCall;->customerUuid:Ljava/lang/String;

    .line 24
    iput-boolean p2, p0, Lcom/ibotta/api/call/mvt/TestVariantsCall;->includeTestId:Z

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

    .line 44
    invoke-super {p0}, Lcom/ibotta/api/call/mvt/BaseMvtApiCall;->buildParams()V

    .line 46
    iget-object v0, p0, Lcom/ibotta/api/call/mvt/TestVariantsCall;->customerId:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 47
    iget-object v0, p0, Lcom/ibotta/api/call/mvt/TestVariantsCall;->params:Ljava/util/Map;

    const-string v1, "customer_id"

    iget-object v2, p0, Lcom/ibotta/api/call/mvt/TestVariantsCall;->customerId:Ljava/lang/Integer;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/call/mvt/TestVariantsCall;->customerUuid:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 50
    iget-object v0, p0, Lcom/ibotta/api/call/mvt/TestVariantsCall;->params:Ljava/util/Map;

    const-string v1, "uuid"

    iget-object v2, p0, Lcom/ibotta/api/call/mvt/TestVariantsCall;->customerUuid:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    :cond_1
    iget-object v0, p0, Lcom/ibotta/api/call/mvt/TestVariantsCall;->params:Ljava/util/Map;

    const-string v1, "include_test_id"

    iget-boolean v2, p0, Lcom/ibotta/api/call/mvt/TestVariantsCall;->includeTestId:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

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

    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/mvt/TestVariantsCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/mvt/TestVariantsResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/mvt/TestVariantsResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 57
    const-class v0, Lcom/ibotta/api/model/mvt/TestVariant;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/mvt/TestVariantsCall;->fromJsonToArrayList(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object p1

    .line 59
    new-instance p2, Lcom/ibotta/api/call/mvt/TestVariantsResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/mvt/TestVariantsResponse;-><init>()V

    .line 60
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/mvt/TestVariantsResponse;->setTestVariants(Ljava/util/List;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "test_variants"

    return-object v0
.end method

.method public getCacheFamily()Ljava/lang/String;
    .locals 1

    const-string v0, "mvt_test_variants"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    invoke-virtual {p0}, Lcom/ibotta/api/call/mvt/TestVariantsCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    invoke-virtual {p0}, Lcom/ibotta/api/call/mvt/TestVariantsCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
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
            "Lcom/ibotta/api/call/mvt/TestVariantsResponse;",
            ">;"
        }
    .end annotation

    .line 29
    const-class v0, Lcom/ibotta/api/call/mvt/TestVariantsResponse;

    return-object v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
