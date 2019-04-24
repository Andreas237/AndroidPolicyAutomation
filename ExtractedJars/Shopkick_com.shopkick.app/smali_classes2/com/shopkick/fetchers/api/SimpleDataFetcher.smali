.class public Lcom/shopkick/fetchers/api/SimpleDataFetcher;
.super Ljava/lang/Object;
.source "SimpleDataFetcher.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IDataFetcher;
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private baseRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

.field private cacheBehavior:Lnet/toddm/comm/CacheBehavior;

.field private cachePriority:Lnet/toddm/cache/CachePriority;

.field private callback:Lcom/shopkick/fetchers/api/IDataFetcherCallback;

.field private currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

.field private domainId:Lcom/shopkick/fetchers/api/RequestDomainId;

.field private initialFetchMade:Z

.field private pageKeyField:Ljava/lang/reflect/Field;

.field private previousPageKey:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IDataFetcherCallback;Lcom/shopkick/fetchers/api/APIManager;Lnet/toddm/comm/CacheBehavior;Lnet/toddm/cache/CachePriority;)V
    .locals 1
    .param p1    # Lcom/shopkick/fetchers/api/RequestDomainId;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/shopkick/app/fetchers/api/IAPIObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/shopkick/fetchers/api/APIManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_5

    if-eqz p2, :cond_4

    if-eqz p4, :cond_3

    const/4 v0, 0x0

    .line 61
    iput-boolean v0, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->initialFetchMade:Z

    .line 62
    iput-object p2, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->baseRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 63
    iput-object p3, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->callback:Lcom/shopkick/fetchers/api/IDataFetcherCallback;

    .line 64
    iput-object p1, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->domainId:Lcom/shopkick/fetchers/api/RequestDomainId;

    .line 65
    iput-object p4, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 66
    iput-object p5, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->cacheBehavior:Lnet/toddm/comm/CacheBehavior;

    .line 67
    iput-object p6, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->cachePriority:Lnet/toddm/cache/CachePriority;

    .line 68
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object p1

    array-length p2, p1

    :goto_0
    if-ge v0, p2, :cond_2

    aget-object p3, p1, v0

    .line 69
    invoke-virtual {p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p4

    const-string p5, "previousPageKey"

    invoke-virtual {p4, p5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p4

    if-nez p4, :cond_1

    .line 70
    invoke-virtual {p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p4

    const-string p5, "previousKickbateTilesPageKey"

    invoke-virtual {p4, p5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 71
    :cond_1
    :goto_1
    iput-object p3, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->pageKeyField:Ljava/lang/reflect/Field;

    :cond_2
    return-void

    .line 59
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'apiManager\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 58
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'request\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 57
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'domainId\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public cancel()V
    .locals 2

    .line 134
    iget-object v0, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz v0, :cond_0

    .line 135
    iget-object v1, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    const/4 v0, 0x0

    .line 136
    iput-object v0, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    :cond_0
    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 6

    .line 151
    iget-object v0, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 154
    iput-object v0, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 155
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    .line 156
    iput-boolean v0, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->initialFetchMade:Z

    .line 157
    iget-object v0, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, v0, v2

    .line 158
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "pageKey"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 159
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "kickbateTilesPageKey"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 161
    :cond_2
    :goto_1
    :try_start_0
    iget-object v0, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->previousPageKey:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 164
    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    .line 170
    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->callback:Lcom/shopkick/fetchers/api/IDataFetcherCallback;

    if-eqz v0, :cond_4

    .line 171
    invoke-interface {v0, p0, p1, p2}, Lcom/shopkick/fetchers/api/IDataFetcherCallback;->onPostFetch(Lcom/shopkick/fetchers/api/IDataFetcher;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V

    :cond_4
    return-void
.end method

.method public fetchMore()V
    .locals 10

    .line 104
    iget-object v0, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz v0, :cond_0

    return-void

    .line 107
    :cond_0
    iget-object v0, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->baseRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/IAPIObject;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 108
    iget-object v0, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->pageKeyField:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_1

    .line 110
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    iget-object v2, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->previousPageKey:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 113
    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    .line 116
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->callback:Lcom/shopkick/fetchers/api/IDataFetcherCallback;

    if-eqz v0, :cond_2

    .line 117
    iget-object v1, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    invoke-interface {v0, p0, v1}, Lcom/shopkick/fetchers/api/IDataFetcherCallback;->onPreFetch(Lcom/shopkick/fetchers/api/IDataFetcher;Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    .line 119
    :cond_2
    iget-object v2, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v3, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->domainId:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v4, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    const/4 v6, 0x1

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    iget-object v8, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->cachePriority:Lnet/toddm/cache/CachePriority;

    iget-object v9, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->cacheBehavior:Lnet/toddm/comm/CacheBehavior;

    move-object v5, p0

    invoke-virtual/range {v2 .. v9}, Lcom/shopkick/fetchers/api/APIManager;->fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method public hasMore()Z
    .locals 1

    .line 88
    iget-boolean v0, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->initialFetchMade:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->previousPageKey:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public isFetching()Z
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->currentRequest:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public reset()V
    .locals 1

    .line 95
    invoke-virtual {p0}, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->cancel()V

    const/4 v0, 0x0

    .line 96
    iput-object v0, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->previousPageKey:Ljava/lang/String;

    const/4 v0, 0x0

    .line 97
    iput-boolean v0, p0, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->initialFetchMade:Z

    return-void
.end method
