.class public Lcom/shopkick/app/util/BatchRequestHelper;
.super Ljava/lang/Object;
.source "BatchRequestHelper.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/util/BatchRequestHelper$IBatchRequestAPICallback;
    }
.end annotation


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private batchRequest:Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;

.field private callbackRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/util/BatchRequestHelper$IBatchRequestAPICallback;",
            ">;"
        }
    .end annotation
.end field

.field private requestStarted:Z

.field private requestToResponseClassMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;>;"
        }
    .end annotation
.end field

.field private requests:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 1

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requests:Ljava/util/ArrayList;

    .line 41
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requestToResponseClassMap:Ljava/util/HashMap;

    .line 43
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->batchRequest:Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;

    const/4 v0, 0x0

    .line 45
    iput-boolean v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requestStarted:Z

    .line 51
    iput-object p1, p0, Lcom/shopkick/app/util/BatchRequestHelper;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    return-void
.end method

.method private createApiRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;
    .locals 8

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 165
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/util/BatchRequestHelper;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v2, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    const/4 v4, 0x1

    sget-object v5, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v6, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v7, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v3, p1

    invoke-virtual/range {v1 .. v7}, Lcom/shopkick/fetchers/api/APIManager;->buildNetworkRequest(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/network/NetworkRequest;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v0

    .line 174
    :cond_1
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;-><init>()V

    .line 175
    iget-object v1, p1, Lcom/shopkick/fetchers/network/NetworkRequest;->requestPath:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;->requestPath:Ljava/lang/String;

    .line 176
    sget-object v1, Lnet/toddm/comm/Request$RequestMethod;->POST:Lnet/toddm/comm/Request$RequestMethod;

    iget-object v2, p1, Lcom/shopkick/fetchers/network/NetworkRequest;->requestMethod:Lnet/toddm/comm/Request$RequestMethod;

    invoke-virtual {v1, v2}, Lnet/toddm/comm/Request$RequestMethod;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;->usePost:Ljava/lang/Boolean;

    .line 177
    iget-object v1, p1, Lcom/shopkick/fetchers/network/NetworkRequest;->contentType:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;->contentType:Ljava/lang/String;

    .line 178
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;->usePost:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 179
    invoke-virtual {p1}, Lcom/shopkick/fetchers/network/NetworkRequest;->getPostBodyAsText()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;->requestBody:Ljava/lang/String;

    goto :goto_0

    .line 181
    :cond_2
    iget-object p1, p1, Lcom/shopkick/fetchers/network/NetworkRequest;->urlString:Ljava/lang/String;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 182
    invoke-virtual {p1}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;->requestBody:Ljava/lang/String;

    :goto_0
    return-object v0
.end method

.method private createDataResponse(Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;Ljava/lang/Class;)Lcom/shopkick/fetchers/DataResponse;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;)",
            "Lcom/shopkick/fetchers/DataResponse;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 191
    :try_start_0
    sget-object v1, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;->responseBody:Ljava/lang/String;

    invoke-virtual {v1, v2, p2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 192
    instance-of v1, p2, Lcom/shopkick/app/fetchers/api/PostProcessable;

    if-eqz v1, :cond_0

    .line 193
    move-object v1, p2

    check-cast v1, Lcom/shopkick/app/fetchers/api/PostProcessable;

    invoke-interface {v1}, Lcom/shopkick/app/fetchers/api/PostProcessable;->postProcess()V

    .line 195
    :cond_0
    new-instance v1, Lcom/shopkick/fetchers/DataResponse;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;->statusCode:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    move p1, v0

    :goto_0
    invoke-direct {v1, p1, v0, v0, p2}, Lcom/shopkick/fetchers/DataResponse;-><init>(ZIILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 197
    :catch_0
    new-instance p1, Lcom/shopkick/fetchers/DataResponse;

    const/4 p2, 0x0

    invoke-direct {p1, v0, v0, v0, p2}, Lcom/shopkick/fetchers/DataResponse;-><init>(ZIILjava/lang/Object;)V

    return-object p1
.end method


# virtual methods
.method public addRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 63
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requestStarted:Z

    if-eqz v0, :cond_1

    return-void

    .line 64
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requests:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public cancelBatchRequest()V
    .locals 2

    .line 119
    iget-object v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/util/BatchRequestHelper;->batchRequest:Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    const/4 v0, 0x0

    .line 120
    iput-boolean v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requestStarted:Z

    return-void
.end method

.method public clear()V
    .locals 1

    .line 55
    invoke-virtual {p0}, Lcom/shopkick/app/util/BatchRequestHelper;->cancelBatchRequest()V

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requests:Ljava/util/ArrayList;

    .line 57
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requestToResponseClassMap:Ljava/util/HashMap;

    .line 58
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->batchRequest:Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 5

    .line 211
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 213
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 214
    iget-object v0, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/BatchResponse;

    .line 215
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/BatchResponse;->apiResponses:Ljava/util/List;

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/BatchResponse;->apiResponses:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget-object v3, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requests:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v2, v3, :cond_0

    move v2, v1

    .line 216
    :goto_0
    iget-object v3, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requests:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 217
    iget-object v3, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requests:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 218
    iget-object v4, v0, Lcom/shopkick/app/fetchers/api/skapi/BatchResponse;->apiResponses:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;

    .line 219
    invoke-virtual {p0, v3}, Lcom/shopkick/app/util/BatchRequestHelper;->getResponseClassFromRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)Ljava/lang/Class;

    move-result-object v3

    .line 218
    invoke-direct {p0, v4, v3}, Lcom/shopkick/app/util/BatchRequestHelper;->createDataResponse(Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;Ljava/lang/Class;)Lcom/shopkick/fetchers/DataResponse;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 225
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    .line 226
    :goto_1
    iget-object v2, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requests:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 227
    new-instance v2, Lcom/shopkick/fetchers/DataResponse;

    iget v3, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    const/4 v4, 0x0

    invoke-direct {v2, v1, v1, v3, v4}, Lcom/shopkick/fetchers/DataResponse;-><init>(ZIILjava/lang/Object;)V

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 231
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->callbackRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    .line 232
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/util/BatchRequestHelper$IBatchRequestAPICallback;

    if-eqz v0, :cond_2

    .line 234
    iget-object v1, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requests:Ljava/util/ArrayList;

    invoke-interface {v0, p2, v1, p1}, Lcom/shopkick/app/util/BatchRequestHelper$IBatchRequestAPICallback;->completedResponse(Lcom/shopkick/fetchers/DataResponse;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_2
    return-void
.end method

.method public fetchBatchRequest()V
    .locals 11

    .line 124
    iget-object v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requests:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requestStarted:Z

    if-nez v0, :cond_3

    const/4 v0, 0x1

    .line 125
    iput-boolean v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requestStarted:Z

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->batchRequest:Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;->apiRequests:Ljava/util/List;

    .line 130
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 132
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requests:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 133
    iget-object v2, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requests:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 134
    invoke-direct {p0, v2}, Lcom/shopkick/app/util/BatchRequestHelper;->createApiRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 136
    iget-object v3, p0, Lcom/shopkick/app/util/BatchRequestHelper;->batchRequest:Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;->apiRequests:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 138
    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 144
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 145
    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 146
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 147
    iget-object v2, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requests:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_2

    .line 151
    :cond_2
    iget-object v3, p0, Lcom/shopkick/app/util/BatchRequestHelper;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v4, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v5, p0, Lcom/shopkick/app/util/BatchRequestHelper;->batchRequest:Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;

    const/4 v7, 0x1

    sget-object v8, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v10, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v6, p0

    invoke-virtual/range {v3 .. v10}, Lcom/shopkick/fetchers/api/APIManager;->fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_3
    return-void
.end method

.method public getBatchedRequestCount()I
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requests:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getResponseClassFromRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ")",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;"
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requestToResponseClassMap:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    iget-object v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requestToResponseClassMap:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    return-object p1

    .line 77
    :cond_0
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedRequest;

    if-eqz v0, :cond_1

    .line 78
    const-class p1, Lcom/shopkick/app/fetchers/api/skapi/GetNearbyCPGFeedResponse;

    return-object p1

    .line 80
    :cond_1
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedRequest;

    if-eqz v0, :cond_2

    .line 81
    const-class p1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGLocationFeedResponse;

    return-object p1

    .line 83
    :cond_2
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedRequest;

    if-eqz v0, :cond_3

    .line 84
    const-class p1, Lcom/shopkick/app/fetchers/api/skapi/GetCPGCategoryFeedResponse;

    return-object p1

    .line 86
    :cond_3
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListRequest;

    if-eqz v0, :cond_4

    .line 87
    const-class p1, Lcom/shopkick/app/fetchers/api/skapi/GetStoreListResponse;

    return-object p1

    .line 89
    :cond_4
    instance-of p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersRequest;

    if-eqz p1, :cond_5

    .line 90
    const-class p1, Lcom/shopkick/app/fetchers/api/skapi/GetOnlineOffersResponse;

    return-object p1

    :cond_5
    const/4 p1, 0x0

    return-object p1
.end method

.method public isRequestStarted()Z
    .locals 1

    .line 111
    iget-boolean v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requestStarted:Z

    return v0
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public registerResponseClass(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;)V"
        }
    .end annotation

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requestToResponseClassMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public removeRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 1

    .line 98
    iget-boolean v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requestStarted:Z

    if-eqz v0, :cond_0

    return-void

    .line 100
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requests:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_1

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->requests:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public setCallback(Lcom/shopkick/app/util/BatchRequestHelper$IBatchRequestAPICallback;)V
    .locals 1

    .line 107
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/util/BatchRequestHelper;->callbackRef:Ljava/lang/ref/WeakReference;

    return-void
.end method
