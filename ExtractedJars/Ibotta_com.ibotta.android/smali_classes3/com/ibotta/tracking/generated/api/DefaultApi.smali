.class public Lcom/ibotta/tracking/generated/api/DefaultApi;
.super Ljava/lang/Object;
.source "DefaultApi.java"


# instance fields
.field private apiClient:Lcom/ibotta/tracking/generated/invoker/ApiClient;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 42
    invoke-static {}, Lcom/ibotta/tracking/generated/invoker/Configuration;->getDefaultApiClient()Lcom/ibotta/tracking/generated/invoker/ApiClient;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/tracking/generated/api/DefaultApi;-><init>(Lcom/ibotta/tracking/generated/invoker/ApiClient;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/tracking/generated/invoker/ApiClient;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/ibotta/tracking/generated/api/DefaultApi;->apiClient:Lcom/ibotta/tracking/generated/invoker/ApiClient;

    return-void
.end method

.method private eventsTrackPostValidateBeforeCall(Ljava/util/List;Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$ProgressRequestListener;)Lcom/squareup/okhttp/Call;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;",
            "Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;",
            "Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$ProgressRequestListener;",
            ")",
            "Lcom/squareup/okhttp/Call;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/tracking/generated/invoker/ApiException;
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 115
    invoke-virtual {p0, p1, p2, p3}, Lcom/ibotta/tracking/generated/api/DefaultApi;->eventsTrackPostCall(Ljava/util/List;Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$ProgressRequestListener;)Lcom/squareup/okhttp/Call;

    move-result-object p1

    return-object p1

    .line 111
    :cond_0
    new-instance p1, Lcom/ibotta/tracking/generated/invoker/ApiException;

    const-string p2, "Missing the required parameter \'body\' when calling eventsTrackPost(Async)"

    invoke-direct {p1, p2}, Lcom/ibotta/tracking/generated/invoker/ApiException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public eventsTrackPost(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/tracking/generated/invoker/ApiException;
        }
    .end annotation

    .line 127
    invoke-virtual {p0, p1}, Lcom/ibotta/tracking/generated/api/DefaultApi;->eventsTrackPostWithHttpInfo(Ljava/util/List;)Lcom/ibotta/tracking/generated/invoker/ApiResponse;

    return-void
.end method

.method public eventsTrackPostAsync(Ljava/util/List;Lcom/ibotta/tracking/generated/invoker/ApiCallback;)Lcom/squareup/okhttp/Call;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;",
            "Lcom/ibotta/tracking/generated/invoker/ApiCallback<",
            "Ljava/lang/Void;",
            ">;)",
            "Lcom/squareup/okhttp/Call;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/tracking/generated/invoker/ApiException;
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 156
    new-instance v0, Lcom/ibotta/tracking/generated/api/DefaultApi$2;

    invoke-direct {v0, p0, p2}, Lcom/ibotta/tracking/generated/api/DefaultApi$2;-><init>(Lcom/ibotta/tracking/generated/api/DefaultApi;Lcom/ibotta/tracking/generated/invoker/ApiCallback;)V

    .line 163
    new-instance v1, Lcom/ibotta/tracking/generated/api/DefaultApi$3;

    invoke-direct {v1, p0, p2}, Lcom/ibotta/tracking/generated/api/DefaultApi$3;-><init>(Lcom/ibotta/tracking/generated/api/DefaultApi;Lcom/ibotta/tracking/generated/invoker/ApiCallback;)V

    goto :goto_0

    :cond_0
    move-object v1, v0

    .line 171
    :goto_0
    invoke-direct {p0, p1, v0, v1}, Lcom/ibotta/tracking/generated/api/DefaultApi;->eventsTrackPostValidateBeforeCall(Ljava/util/List;Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$ProgressRequestListener;)Lcom/squareup/okhttp/Call;

    move-result-object p1

    .line 172
    iget-object v0, p0, Lcom/ibotta/tracking/generated/api/DefaultApi;->apiClient:Lcom/ibotta/tracking/generated/invoker/ApiClient;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->executeAsync(Lcom/squareup/okhttp/Call;Lcom/ibotta/tracking/generated/invoker/ApiCallback;)V

    return-object p1
.end method

.method public eventsTrackPostCall(Ljava/util/List;Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$ProgressRequestListener;)Lcom/squareup/okhttp/Call;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;",
            "Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;",
            "Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$ProgressRequestListener;",
            ")",
            "Lcom/squareup/okhttp/Call;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/tracking/generated/invoker/ApiException;
        }
    .end annotation

    const-string v1, "/events/track"

    .line 71
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 72
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 74
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 76
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const/4 v0, 0x0

    .line 78
    new-array v2, v0, [Ljava/lang/String;

    .line 81
    iget-object v5, p0, Lcom/ibotta/tracking/generated/api/DefaultApi;->apiClient:Lcom/ibotta/tracking/generated/invoker/ApiClient;

    invoke-virtual {v5, v2}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->selectHeaderAccept([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v5, "Accept"

    .line 82
    invoke-interface {v6, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string v2, "application/json"

    .line 84
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    .line 87
    iget-object v5, p0, Lcom/ibotta/tracking/generated/api/DefaultApi;->apiClient:Lcom/ibotta/tracking/generated/invoker/ApiClient;

    invoke-virtual {v5, v2}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->selectHeaderContentType([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "Content-Type"

    .line 88
    invoke-interface {v6, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_1

    .line 91
    iget-object v2, p0, Lcom/ibotta/tracking/generated/api/DefaultApi;->apiClient:Lcom/ibotta/tracking/generated/invoker/ApiClient;

    invoke-virtual {v2}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->getHttpClient()Lcom/squareup/okhttp/OkHttpClient;

    move-result-object v2

    invoke-virtual {v2}, Lcom/squareup/okhttp/OkHttpClient;->networkInterceptors()Ljava/util/List;

    move-result-object v2

    new-instance v5, Lcom/ibotta/tracking/generated/api/DefaultApi$1;

    invoke-direct {v5, p0, p2}, Lcom/ibotta/tracking/generated/api/DefaultApi$1;-><init>(Lcom/ibotta/tracking/generated/api/DefaultApi;Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;)V

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    :cond_1
    new-array v8, v0, [Ljava/lang/String;

    .line 103
    iget-object v0, p0, Lcom/ibotta/tracking/generated/api/DefaultApi;->apiClient:Lcom/ibotta/tracking/generated/invoker/ApiClient;

    const-string v2, "POST"

    move-object v5, p1

    move-object v9, p3

    invoke-virtual/range {v0 .. v9}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->buildCall(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$ProgressRequestListener;)Lcom/squareup/okhttp/Call;

    move-result-object p1

    return-object p1
.end method

.method public eventsTrackPostWithHttpInfo(Ljava/util/List;)Lcom/ibotta/tracking/generated/invoker/ApiResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;)",
            "Lcom/ibotta/tracking/generated/invoker/ApiResponse<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/tracking/generated/invoker/ApiException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 138
    invoke-direct {p0, p1, v0, v0}, Lcom/ibotta/tracking/generated/api/DefaultApi;->eventsTrackPostValidateBeforeCall(Ljava/util/List;Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$ProgressRequestListener;)Lcom/squareup/okhttp/Call;

    move-result-object p1

    .line 139
    iget-object v0, p0, Lcom/ibotta/tracking/generated/api/DefaultApi;->apiClient:Lcom/ibotta/tracking/generated/invoker/ApiClient;

    invoke-virtual {v0, p1}, Lcom/ibotta/tracking/generated/invoker/ApiClient;->execute(Lcom/squareup/okhttp/Call;)Lcom/ibotta/tracking/generated/invoker/ApiResponse;

    move-result-object p1

    return-object p1
.end method

.method public getApiClient()Lcom/ibotta/tracking/generated/invoker/ApiClient;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/ibotta/tracking/generated/api/DefaultApi;->apiClient:Lcom/ibotta/tracking/generated/invoker/ApiClient;

    return-object v0
.end method

.method public setApiClient(Lcom/ibotta/tracking/generated/invoker/ApiClient;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/ibotta/tracking/generated/api/DefaultApi;->apiClient:Lcom/ibotta/tracking/generated/invoker/ApiClient;

    return-void
.end method
