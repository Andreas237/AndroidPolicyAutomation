.class public Lcom/ibotta/api/execution/ApiOkHttpExecution;
.super Lcom/ibotta/api/BaseApiExecution;
.source "ApiOkHttpExecution.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field private static final API_PATH_FORMAT:Ljava/lang/String; = "%1$s/%2$s/%3$s"

.field private static final CONTENT_DISPOSITION_FORMAT:Ljava/lang/String; = "form-data; name=\"%1$s\"; filename=\"%2$s\""

.field private static final CONTENT_TYPE_JSON:Ljava/lang/String; = "application/json; charset=utf-8"


# instance fields
.field private final apiCache:Lcom/ibotta/api/ApiCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/api/ApiCache<",
            "Lcom/ibotta/api/CacheableApiCall;",
            "Lcom/ibotta/api/CacheableApiResponse;",
            ">;"
        }
    .end annotation
.end field

.field private endTime:J

.field private httpCall:Lokhttp3/Call;

.field private httpClient:Lokhttp3/OkHttpClient;

.field private startTime:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 67
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiExecution;-><init>()V

    .line 68
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getApiCache()Lcom/ibotta/api/ApiCache;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/execution/ApiOkHttpExecution;->apiCache:Lcom/ibotta/api/ApiCache;

    return-void
.end method

.method private addRequestHeaders(Lcom/ibotta/api/ApiCall;Lokhttp3/Request$Builder;)V
    .locals 6

    .line 170
    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getHeaders()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    .line 172
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    :cond_0
    const-string v1, "User-Agent"

    .line 176
    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getUserAgent()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    invoke-virtual {p0, p1}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->getLastModified(Lcom/ibotta/api/ApiCall;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v1, "If-Modified-Since"

    .line 180
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    :cond_1
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 185
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 186
    sget-object v1, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v2, "Writing header: %1$s: %2$s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-interface {v1, v2, v3}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v1, v0}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    goto :goto_0

    :cond_3
    return-void
.end method

.method private createHttpCall(Lokhttp3/Request$Builder;)Lokhttp3/Call;
    .locals 2

    .line 216
    iget-object v0, p0, Lcom/ibotta/api/execution/ApiOkHttpExecution;->httpClient:Lokhttp3/OkHttpClient;

    instance-of v1, p1, Lokhttp3/Request$Builder;

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast p1, Lokhttp3/Request$Builder;

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;->build(Lokhttp3/Request$Builder;)Lokhttp3/Request;

    move-result-object p1

    :goto_0
    instance-of v1, v0, Lokhttp3/OkHttpClient;

    if-nez v1, :cond_1

    invoke-virtual {v0, p1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object p1

    goto :goto_1

    :cond_1
    check-cast v0, Lokhttp3/OkHttpClient;

    invoke-static {v0, p1}, Lcom/newrelic/agent/android/instrumentation/okhttp3/OkHttp3Instrumentation;->newCall(Lokhttp3/OkHttpClient;Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method private createRequestBuilder(Lcom/ibotta/api/ApiCall;Ljava/lang/String;)Lokhttp3/Request$Builder;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 147
    :try_start_0
    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->buildHeaders()V

    .line 148
    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->buildParams()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 153
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->isDebug()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getParams()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    .line 155
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 156
    sget-object v2, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v3, "Param: %1$s=%2$s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    aput-object v1, v4, v5

    invoke-interface {v2, v3, v4}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 160
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->pickRequestBuilder(Lcom/ibotta/api/ApiCall;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 150
    new-instance p2, Lcom/ibotta/api/ApiException;

    const-string v0, "Error building parameters."

    invoke-direct {p2, v0, p1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method private getContentDispositionHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers;
    .locals 4

    const-string v0, "form-data; name=\"%1$s\"; filename=\"%2$s\""

    const/4 v1, 0x2

    .line 537
    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object p2, v2, p1

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 538
    new-array v0, v1, [Ljava/lang/String;

    const-string v1, "Content-Disposition"

    aput-object v1, v0, v3

    aput-object p2, v0, p1

    invoke-static {v0}, Lokhttp3/Headers;->of([Ljava/lang/String;)Lokhttp3/Headers;

    move-result-object p1

    return-object p1
.end method

.method private newDeleteRequestBuilder(Lcom/ibotta/api/ApiCall;Ljava/lang/String;)Lokhttp3/Request$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 430
    :try_start_0
    instance-of v0, p1, Lcom/ibotta/api/JsonParamApiCall;

    if-eqz v0, :cond_0

    .line 431
    check-cast p1, Lcom/ibotta/api/JsonParamApiCall;

    invoke-virtual {p1}, Lcom/ibotta/api/JsonParamApiCall;->getJsonParam()Ljava/lang/Object;

    move-result-object p1

    .line 432
    invoke-direct {p0, p2}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->newRequestBuilder(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p2

    invoke-direct {p0, p1}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->newJsonRequestBody(Ljava/lang/Object;)Lokhttp3/RequestBody;

    move-result-object p1

    invoke-virtual {p2, p1}, Lokhttp3/Request$Builder;->delete(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object p1

    return-object p1

    .line 434
    :cond_0
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getApiUriBuilder()Lcom/ibotta/api/ApiUriBuilder;

    move-result-object v0

    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getParams()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p2, p1}, Lcom/ibotta/api/ApiUriBuilder;->toUri(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    .line 435
    invoke-direct {p0, p1}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->newRequestBuilder(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/Request$Builder;->delete()Lokhttp3/Request$Builder;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 438
    new-instance p2, Lcom/ibotta/api/ApiException;

    const-string v0, "Failed to build delete parameters."

    invoke-direct {p2, v0, p1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method private newFormBody(Ljava/util/Map;)Lokhttp3/RequestBody;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lokhttp3/RequestBody;"
        }
    .end annotation

    .line 459
    new-instance v0, Lokhttp3/FormBody$Builder;

    invoke-direct {v0}, Lokhttp3/FormBody$Builder;-><init>()V

    .line 461
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 462
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v3

    .line 464
    :goto_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    instance-of v4, v4, Ljava/util/Collection;

    if-eqz v4, :cond_3

    .line 465
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 466
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    :cond_2
    move-object v4, v3

    .line 467
    :goto_3
    invoke-virtual {v0, v2, v4}, Lokhttp3/FormBody$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/FormBody$Builder;

    goto :goto_2

    .line 470
    :cond_3
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 471
    :cond_4
    invoke-virtual {v0, v2, v3}, Lokhttp3/FormBody$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/FormBody$Builder;

    goto :goto_0

    .line 475
    :cond_5
    invoke-virtual {v0}, Lokhttp3/FormBody$Builder;->build()Lokhttp3/FormBody;

    move-result-object p1

    return-object p1
.end method

.method private newGetRequestBuilder(Lcom/ibotta/api/ApiCall;Ljava/lang/String;)Lokhttp3/Request$Builder;
    .locals 1

    .line 365
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getApiUriBuilder()Lcom/ibotta/api/ApiUriBuilder;

    move-result-object v0

    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getParams()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p2, p1}, Lcom/ibotta/api/ApiUriBuilder;->toUri(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    .line 366
    invoke-direct {p0, p1}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->newRequestBuilder(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/Request$Builder;->get()Lokhttp3/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method private newJsonRequestBody(Ljava/lang/Object;)Lokhttp3/RequestBody;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    const-string v0, "application/json; charset=utf-8"

    .line 549
    invoke-static {v0}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->getJson()Lcom/ibotta/android/json/IbottaJson;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/ibotta/android/json/IbottaJson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object p1

    return-object p1
.end method

.method private newMultipartFormBody(Lcom/ibotta/api/ApiCall;Ljava/util/Map;)Lokhttp3/RequestBody;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/ApiCall;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lokhttp3/RequestBody;"
        }
    .end annotation

    .line 487
    new-instance v0, Lokhttp3/MultipartBody$Builder;

    invoke-direct {v0}, Lokhttp3/MultipartBody$Builder;-><init>()V

    sget-object v1, Lokhttp3/MultipartBody;->FORM:Lokhttp3/MediaType;

    invoke-virtual {v0, v1}, Lokhttp3/MultipartBody$Builder;->setType(Lokhttp3/MediaType;)Lokhttp3/MultipartBody$Builder;

    move-result-object v0

    .line 490
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 491
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v3

    .line 493
    :goto_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    instance-of v4, v4, Ljava/util/Collection;

    if-eqz v4, :cond_3

    .line 494
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 495
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    :cond_2
    move-object v4, v3

    .line 496
    :goto_3
    invoke-virtual {v0, v2, v4}, Lokhttp3/MultipartBody$Builder;->addFormDataPart(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Builder;

    goto :goto_2

    .line 499
    :cond_3
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 500
    :cond_4
    invoke-virtual {v0, v2, v3}, Lokhttp3/MultipartBody$Builder;->addFormDataPart(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Builder;

    goto :goto_0

    .line 505
    :cond_5
    move-object p2, p1

    check-cast p2, Lcom/ibotta/api/FileUploadApiCall;

    invoke-virtual {p2}, Lcom/ibotta/api/FileUploadApiCall;->getUploadableFiles()Ljava/util/List;

    move-result-object p2

    .line 506
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/UploadableFile;

    .line 507
    invoke-virtual {v1}, Lcom/ibotta/api/UploadableFile;->getFile()Ljava/io/File;

    move-result-object v2

    .line 508
    invoke-virtual {v1}, Lcom/ibotta/api/UploadableFile;->getPartName()Ljava/lang/String;

    move-result-object v3

    .line 509
    invoke-virtual {v1}, Lcom/ibotta/api/UploadableFile;->getFileName()Ljava/lang/String;

    move-result-object v4

    .line 510
    invoke-virtual {v1}, Lcom/ibotta/api/UploadableFile;->getContentType()Ljava/lang/String;

    move-result-object v5

    .line 512
    invoke-static {v5}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v6

    .line 513
    invoke-virtual {v1}, Lcom/ibotta/api/UploadableFile;->getFile()Ljava/io/File;

    move-result-object v1

    invoke-static {v6, v1}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/io/File;)Lokhttp3/RequestBody;

    move-result-object v1

    .line 515
    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getProgressListener()Lcom/ibotta/api/execution/ApiUploadProgressListener;

    move-result-object v6

    if-eqz v6, :cond_6

    .line 516
    invoke-direct {p0, v3, v4}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->getContentDispositionHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers;

    move-result-object v1

    .line 517
    new-instance v3, Lcom/ibotta/api/execution/CountingFileRequestBody;

    .line 518
    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getProgressListener()Lcom/ibotta/api/execution/ApiUploadProgressListener;

    move-result-object v4

    invoke-direct {v3, v2, v5, v4}, Lcom/ibotta/api/execution/CountingFileRequestBody;-><init>(Ljava/io/File;Ljava/lang/String;Lcom/ibotta/api/execution/ApiUploadProgressListener;)V

    .line 520
    invoke-virtual {v0, v1, v3}, Lokhttp3/MultipartBody$Builder;->addPart(Lokhttp3/Headers;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Builder;

    goto :goto_4

    .line 522
    :cond_6
    invoke-virtual {v0, v3, v4, v1}, Lokhttp3/MultipartBody$Builder;->addFormDataPart(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Builder;

    goto :goto_4

    .line 526
    :cond_7
    invoke-virtual {v0}, Lokhttp3/MultipartBody$Builder;->build()Lokhttp3/MultipartBody;

    move-result-object p1

    return-object p1
.end method

.method private newPostRequestBuilder(Lcom/ibotta/api/ApiCall;Ljava/lang/String;)Lokhttp3/Request$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 378
    invoke-direct {p0, p2}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->newRequestBuilder(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p2

    .line 381
    :try_start_0
    instance-of v0, p1, Lcom/ibotta/api/FileUploadApiCall;

    if-eqz v0, :cond_0

    .line 382
    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getParams()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->newMultipartFormBody(Lcom/ibotta/api/ApiCall;Ljava/util/Map;)Lokhttp3/RequestBody;

    move-result-object p1

    invoke-virtual {p2, p1}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    goto :goto_0

    .line 383
    :cond_0
    instance-of v0, p1, Lcom/ibotta/api/JsonParamApiCall;

    if-eqz v0, :cond_1

    .line 384
    check-cast p1, Lcom/ibotta/api/JsonParamApiCall;

    invoke-virtual {p1}, Lcom/ibotta/api/JsonParamApiCall;->getJsonParam()Ljava/lang/Object;

    move-result-object p1

    .line 385
    invoke-direct {p0, p1}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->newJsonRequestBody(Ljava/lang/Object;)Lokhttp3/RequestBody;

    move-result-object p1

    invoke-virtual {p2, p1}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    goto :goto_0

    .line 387
    :cond_1
    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getParams()Ljava/util/Map;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->newFormBody(Ljava/util/Map;)Lokhttp3/RequestBody;

    move-result-object p1

    invoke-virtual {p2, p1}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object p2

    :catch_0
    move-exception p1

    .line 390
    new-instance p2, Lcom/ibotta/api/ApiException;

    const-string v0, "Failed to build post parameters."

    invoke-direct {p2, v0, p1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method private newPutRequestBuilder(Lcom/ibotta/api/ApiCall;Ljava/lang/String;)Lokhttp3/Request$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 405
    invoke-direct {p0, p2}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->newRequestBuilder(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p2

    .line 408
    :try_start_0
    instance-of v0, p1, Lcom/ibotta/api/JsonParamApiCall;

    if-eqz v0, :cond_0

    .line 409
    check-cast p1, Lcom/ibotta/api/JsonParamApiCall;

    invoke-virtual {p1}, Lcom/ibotta/api/JsonParamApiCall;->getJsonParam()Ljava/lang/Object;

    move-result-object p1

    .line 410
    invoke-direct {p0, p1}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->newJsonRequestBody(Ljava/lang/Object;)Lokhttp3/RequestBody;

    move-result-object p1

    invoke-virtual {p2, p1}, Lokhttp3/Request$Builder;->put(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    goto :goto_0

    .line 412
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getParams()Ljava/util/Map;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->newFormBody(Ljava/util/Map;)Lokhttp3/RequestBody;

    move-result-object p1

    invoke-virtual {p2, p1}, Lokhttp3/Request$Builder;->put(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object p2

    :catch_0
    move-exception p1

    .line 415
    new-instance p2, Lcom/ibotta/api/ApiException;

    const-string v0, "Failed to build put parameters."

    invoke-direct {p2, v0, p1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method private newRequestBuilder(Ljava/lang/String;)Lokhttp3/Request$Builder;
    .locals 1

    .line 449
    new-instance v0, Lokhttp3/Request$Builder;

    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p1

    return-object p1
.end method

.method private newStringRequestBody(Ljava/lang/String;)Lokhttp3/RequestBody;
    .locals 1

    const-string v0, "BaseContent-Type: text/html"

    .line 559
    invoke-static {v0}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    invoke-static {v0, p1}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object p1

    return-object p1
.end method

.method private pickRequestBuilder(Lcom/ibotta/api/ApiCall;Ljava/lang/String;)Lokhttp3/Request$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 337
    sget-object v0, Lcom/ibotta/api/execution/ApiOkHttpExecution$1;->$SwitchMap$com$ibotta$api$ApiCall$HttpMethod:[I

    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/ApiCall$HttpMethod;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 p1, 0x0

    goto :goto_0

    .line 348
    :pswitch_0
    invoke-direct {p0, p1, p2}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->newDeleteRequestBuilder(Lcom/ibotta/api/ApiCall;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p1

    goto :goto_0

    .line 345
    :pswitch_1
    invoke-direct {p0, p1, p2}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->newPutRequestBuilder(Lcom/ibotta/api/ApiCall;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p1

    goto :goto_0

    .line 342
    :pswitch_2
    invoke-direct {p0, p1, p2}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->newPostRequestBuilder(Lcom/ibotta/api/ApiCall;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p1

    goto :goto_0

    .line 339
    :pswitch_3
    invoke-direct {p0, p1, p2}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->newGetRequestBuilder(Lcom/ibotta/api/ApiCall;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p1

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private setTimeouts(Lcom/ibotta/api/ApiCall;Lokhttp3/OkHttpClient$Builder;)V
    .locals 3

    .line 200
    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getConnectionTimeout()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 201
    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getConnectionTimeout()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, v0, v1, v2}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 204
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getSocketTimeout()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 205
    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getSocketTimeout()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, v0, v1, p1}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    :cond_1
    return-void
.end method

.method private startClock(Lcom/ibotta/api/ApiCall;)V
    .locals 4

    .line 610
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->isDebug()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-wide/16 v0, 0x0

    .line 614
    iput-wide v0, p0, Lcom/ibotta/api/execution/ApiOkHttpExecution;->endTime:J

    .line 615
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/api/execution/ApiOkHttpExecution;->startTime:J

    .line 617
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    .line 618
    sget-object v0, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v1, "*** START: HTTP client call begin: %1$s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private stopClock(Lcom/ibotta/api/ApiCall;I)V
    .locals 6

    .line 627
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->isDebug()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 631
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/api/execution/ApiOkHttpExecution;->endTime:J

    .line 632
    iget-wide v0, p0, Lcom/ibotta/api/execution/ApiOkHttpExecution;->endTime:J

    iget-wide v2, p0, Lcom/ibotta/api/execution/ApiOkHttpExecution;->startTime:J

    sub-long/2addr v0, v2

    .line 634
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    .line 635
    sget-object v2, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v3, "*** FINISHED: HTTP client call end (timing): %1$s, responseCode=%2$d, duration=%3$d ms"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 p1, 0x1

    .line 638
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v4, p1

    const/4 p1, 0x2

    .line 639
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    aput-object p2, v4, p1

    .line 635
    invoke-interface {v2, v3, v4}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public abort()V
    .locals 1

    .line 296
    iget-object v0, p0, Lcom/ibotta/api/execution/ApiOkHttpExecution;->httpCall:Lokhttp3/Call;

    if-eqz v0, :cond_0

    .line 297
    invoke-interface {v0}, Lokhttp3/Call;->cancel()V

    :cond_0
    return-void
.end method

.method protected createClientBuilder()Lokhttp3/OkHttpClient$Builder;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 122
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getOkHttpClient()Lokhttp3/OkHttpClient;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 127
    :cond_0
    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    .line 129
    sget-object v1, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v1}, Lcom/ibotta/api/ApiContext;->getCookieJar()Lokhttp3/CookieJar;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 130
    sget-object v1, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v1}, Lcom/ibotta/api/ApiContext;->getCookieJar()Lokhttp3/CookieJar;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->cookieJar(Lokhttp3/CookieJar;)Lokhttp3/OkHttpClient$Builder;

    :cond_1
    return-object v0
.end method

.method public executeApiCall(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/api/ApiResponse;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 73
    sget-object v0, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v1, "Calling API for: %1$s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getApiFunction()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    invoke-virtual {p0}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->createClientBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 81
    invoke-direct {p0, p1, v0}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->setTimeouts(Lcom/ibotta/api/ApiCall;Lokhttp3/OkHttpClient$Builder;)V

    .line 83
    invoke-virtual {p0, p1}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->getEndpoint(Lcom/ibotta/api/ApiCall;)Ljava/lang/String;

    move-result-object v1

    .line 84
    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/execution/ApiOkHttpExecution;->httpClient:Lokhttp3/OkHttpClient;

    .line 90
    :try_start_0
    invoke-direct {p0, p1, v1}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->createRequestBuilder(Lcom/ibotta/api/ApiCall;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    .line 91
    invoke-direct {p0, p1, v0}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->addRequestHeaders(Lcom/ibotta/api/ApiCall;Lokhttp3/Request$Builder;)V

    .line 94
    invoke-direct {p0, v0}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->createHttpCall(Lokhttp3/Request$Builder;)Lokhttp3/Call;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/execution/ApiOkHttpExecution;->httpCall:Lokhttp3/Call;

    .line 97
    invoke-direct {p0, p1}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->startClock(Lcom/ibotta/api/ApiCall;)V

    .line 100
    iget-object v0, p0, Lcom/ibotta/api/execution/ApiOkHttpExecution;->httpCall:Lokhttp3/Call;

    invoke-interface {v0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    move-result-object v0

    .line 101
    invoke-virtual {v0}, Lokhttp3/Response;->code()I

    move-result v1

    .line 104
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->processResponse(Lcom/ibotta/api/ApiCall;Lokhttp3/Response;)Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    .line 107
    invoke-direct {p0, p1, v1}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->stopClock(Lcom/ibotta/api/ApiCall;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 109
    new-instance v0, Lcom/ibotta/api/ApiException;

    const-string v1, "Unexpected IO exception."

    invoke-direct {v0, v1, p1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 78
    :cond_0
    new-instance p1, Lcom/ibotta/api/ApiException;

    const-string v0, "OkHttpClient.Builder is null"

    invoke-direct {p1, v0}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getEndpoint(Lcom/ibotta/api/ApiCall;)Ljava/lang/String;
    .locals 4

    const-string v0, "%1$s/%2$s/%3$s"

    const/4 v1, 0x3

    .line 319
    new-array v1, v1, [Ljava/lang/Object;

    sget-object v2, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    .line 321
    invoke-virtual {v2}, Lcom/ibotta/api/ApiContext;->getApiUrl()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 322
    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getApiVersion()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 323
    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->getApiFunction()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x2

    aput-object p1, v1, v2

    .line 319
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getLastModified(Lcom/ibotta/api/ApiCall;)Ljava/lang/String;
    .locals 2

    .line 597
    iget-object v0, p0, Lcom/ibotta/api/execution/ApiOkHttpExecution;->apiCache:Lcom/ibotta/api/ApiCache;

    if-eqz v0, :cond_0

    instance-of v1, p1, Lcom/ibotta/api/CacheableApiCall;

    if-eqz v1, :cond_0

    .line 598
    check-cast p1, Lcom/ibotta/api/CacheableApiCall;

    invoke-interface {v0, p1}, Lcom/ibotta/api/ApiCache;->getLastModified(Lcom/ibotta/api/CacheableApiCall;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public isAborted()Z
    .locals 1

    .line 308
    iget-object v0, p0, Lcom/ibotta/api/execution/ApiOkHttpExecution;->httpCall:Lokhttp3/Call;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lokhttp3/Call;->isCanceled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected processResponse(Lcom/ibotta/api/ApiCall;Lokhttp3/Response;)Lcom/ibotta/api/ApiResponse;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "Last-Modified"

    .line 235
    invoke-virtual {p2, v2}, Lokhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 236
    invoke-virtual {p2}, Lokhttp3/Response;->code()I

    move-result v3

    .line 238
    sget-object v4, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v5, "Response code: %1$d"

    const/4 v6, 0x1

    new-array v7, v6, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v1

    invoke-interface {v4, v5, v7}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    invoke-virtual {p2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v4

    invoke-virtual {v4}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    move-result-object v4
    :try_end_0
    .catch Lcom/ibotta/api/ApiException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v5, 0x130

    if-ne v3, v5, :cond_1

    .line 248
    :try_start_1
    instance-of v5, p1, Lcom/ibotta/api/CacheableApiCall;

    if-eqz v5, :cond_1

    .line 250
    sget-object v5, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v7, "304 received for: %1$s"

    new-array v8, v6, [Ljava/lang/Object;

    aput-object p1, v8, v1

    invoke-interface {v5, v7, v8}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    iget-object v5, p0, Lcom/ibotta/api/execution/ApiOkHttpExecution;->apiCache:Lcom/ibotta/api/ApiCache;

    move-object v7, p1

    check-cast v7, Lcom/ibotta/api/CacheableApiCall;

    invoke-interface {v5, v7}, Lcom/ibotta/api/ApiCache;->extendExpiration(Lcom/ibotta/api/CacheableApiCall;)Lcom/ibotta/api/CacheableApiResponse;

    move-result-object v5

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :catch_0
    move-exception p1

    move-object v0, v4

    goto :goto_5

    :catch_1
    move-exception p1

    move-object v0, v4

    goto :goto_6

    :cond_1
    move-object v5, v0

    const/4 v6, 0x0

    :goto_0
    if-nez v6, :cond_6

    const/16 p2, 0xc8

    if-lt v3, p2, :cond_3

    const/16 p2, 0x12b

    if-le v3, p2, :cond_2

    goto :goto_1

    .line 270
    :cond_2
    invoke-virtual {p0, p1, v4, v2}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->readResponse(Lcom/ibotta/api/ApiCall;Ljava/io/InputStream;Ljava/lang/String;)Lcom/ibotta/api/ApiResponse;

    move-result-object v5

    .line 271
    invoke-virtual {v5, v3}, Lcom/ibotta/api/ApiResponse;->setResponseCode(I)V

    goto :goto_3

    :cond_3
    :goto_1
    if-eqz v4, :cond_5

    .line 262
    new-instance p1, Ljava/util/Scanner;

    const-string p2, "UTF-8"

    invoke-direct {p1, v4, p2}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    const-string p2, "\\A"

    invoke-virtual {p1, p2}, Ljava/util/Scanner;->useDelimiter(Ljava/lang/String;)Ljava/util/Scanner;

    move-result-object p1

    .line 263
    invoke-virtual {p1}, Ljava/util/Scanner;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p1}, Ljava/util/Scanner;->next()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_4
    const-string p1, ""

    :goto_2
    move-object v0, p1

    .line 265
    :cond_5
    new-instance p1, Lcom/ibotta/api/ApiException;

    invoke-direct {p1, v0}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;)V

    .line 266
    invoke-virtual {p1, v3}, Lcom/ibotta/api/ApiException;->setApiCode(I)V

    .line 267
    throw p1
    :try_end_1
    .catch Lcom/ibotta/api/ApiException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_6
    :goto_3
    if-eqz v4, :cond_7

    .line 281
    :try_start_2
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_4

    :catch_2
    move-exception p1

    .line 283
    sget-object p2, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v0, "Failed to close InputStream"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p2, p1, v0, v1}, Lcom/ibotta/android/logging/Logger;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_7
    :goto_4
    return-object v5

    :catchall_1
    move-exception p1

    move-object v4, v0

    goto :goto_7

    :catch_3
    move-exception p1

    .line 277
    :goto_5
    :try_start_3
    new-instance p2, Lcom/ibotta/api/ApiException;

    const-string v2, "Unexpected exception."

    invoke-direct {p2, v2, p1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_4
    move-exception p1

    .line 275
    :goto_6
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_7
    if-eqz v4, :cond_8

    .line 281
    :try_start_4
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5

    goto :goto_8

    :catch_5
    move-exception p2

    .line 283
    sget-object v0, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Failed to close InputStream"

    invoke-interface {v0, p2, v2, v1}, Lcom/ibotta/android/logging/Logger;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    :cond_8
    :goto_8
    throw p1
.end method

.method protected readResponse(Lcom/ibotta/api/ApiCall;Ljava/io/InputStream;Ljava/lang/String;)Lcom/ibotta/api/ApiResponse;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 572
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 574
    invoke-virtual {p0}, Lcom/ibotta/api/execution/ApiOkHttpExecution;->getJson()Lcom/ibotta/android/json/IbottaJson;

    move-result-object v2

    invoke-interface {p1, v2, p2}, Lcom/ibotta/api/ApiCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;

    move-result-object p2

    .line 576
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    .line 577
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    .line 578
    sget-object v0, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v1, "JSON parse of response took: %1$s, %2$d ms"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 v2, 0x1

    aput-object p1, v4, v2

    invoke-interface {v0, v1, v4}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 580
    instance-of p1, p2, Lcom/ibotta/api/CacheableApiResponse;

    if-eqz p1, :cond_0

    .line 581
    move-object p1, p2

    check-cast p1, Lcom/ibotta/api/CacheableApiResponse;

    invoke-virtual {p1, p3}, Lcom/ibotta/api/CacheableApiResponse;->setLastModified(Ljava/lang/String;)V

    :cond_0
    return-object p2
.end method
