.class public Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;
.super Ljava/lang/Object;
.source "GPSFailbackDataFetcher.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IDataFetcher;
.implements Lcom/shopkick/fetchers/api/IDataFetcherCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;
    }
.end annotation


# instance fields
.field private callback:Lcom/shopkick/fetchers/api/IDataFetcherCallback;

.field private mode:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

.field private offlineFetcher:Lcom/shopkick/fetchers/api/SimpleDataFetcher;

.field private onlineFetcher:Lcom/shopkick/fetchers/api/SimpleDataFetcher;

.field private prewarmFetcher:Lcom/shopkick/fetchers/api/SimpleDataFetcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IDataFetcherCallback;Lcom/shopkick/fetchers/api/APIManager;D)V
    .locals 12
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

    move-object v7, p0

    move-object v8, p2

    move-wide/from16 v9, p5

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_2

    if-eqz v8, :cond_1

    if-eqz p4, :cond_0

    move-object v0, p3

    .line 62
    iput-object v0, v7, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->callback:Lcom/shopkick/fetchers/api/IDataFetcherCallback;

    .line 63
    sget-object v0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;->Undetermined:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    iput-object v0, v7, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->mode:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    .line 64
    new-instance v11, Lcom/shopkick/fetchers/api/SimpleDataFetcher;

    sget-object v5, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    sget-object v6, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    move-object v0, v11

    move-object v1, p1

    move-object v2, p2

    move-object v3, p0

    move-object/from16 v4, p4

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/fetchers/api/SimpleDataFetcher;-><init>(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IDataFetcherCallback;Lcom/shopkick/fetchers/api/APIManager;Lnet/toddm/comm/CacheBehavior;Lnet/toddm/cache/CachePriority;)V

    iput-object v11, v7, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->onlineFetcher:Lcom/shopkick/fetchers/api/SimpleDataFetcher;

    .line 66
    new-instance v11, Lcom/shopkick/fetchers/api/SimpleDataFetcher;

    invoke-static {p2, v9, v10}, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->getBucketedRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;D)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v2

    sget-object v5, Lnet/toddm/comm/CacheBehavior;->GET_ONLY_FROM_CACHE:Lnet/toddm/comm/CacheBehavior;

    sget-object v6, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    move-object v0, v11

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/fetchers/api/SimpleDataFetcher;-><init>(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IDataFetcherCallback;Lcom/shopkick/fetchers/api/APIManager;Lnet/toddm/comm/CacheBehavior;Lnet/toddm/cache/CachePriority;)V

    iput-object v11, v7, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->offlineFetcher:Lcom/shopkick/fetchers/api/SimpleDataFetcher;

    .line 68
    new-instance v11, Lcom/shopkick/fetchers/api/SimpleDataFetcher;

    invoke-static {p2, v9, v10}, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->getBucketedRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;D)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v2

    const/4 v3, 0x0

    sget-object v5, Lnet/toddm/comm/CacheBehavior;->SERVER_DIRECTED_CACHE:Lnet/toddm/comm/CacheBehavior;

    sget-object v6, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    move-object v0, v11

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/fetchers/api/SimpleDataFetcher;-><init>(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IDataFetcherCallback;Lcom/shopkick/fetchers/api/APIManager;Lnet/toddm/comm/CacheBehavior;Lnet/toddm/cache/CachePriority;)V

    iput-object v11, v7, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->prewarmFetcher:Lcom/shopkick/fetchers/api/SimpleDataFetcher;

    return-void

    .line 61
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'apiManager\' must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 60
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'request\' must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 59
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'domainId\' must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static getBucketedRequest(Lcom/shopkick/app/fetchers/api/IAPIObject;D)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 8

    .line 179
    :try_start_0
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;->toJsonTree()Lcom/google/gson/JsonObject;

    move-result-object v0

    const-string v1, "latitude"

    .line 180
    invoke-virtual {v0, v1}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/JsonElement;->getAsDouble()D

    move-result-wide v2

    const-string v1, "longitude"

    .line 181
    invoke-virtual {v0, v1}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/JsonElement;->getAsDouble()D

    move-result-wide v4

    move-wide v6, p1

    .line 182
    invoke-static/range {v2 .. v7}, Lcom/shopkick/utilities/GeoUtilities;->roundLatLonForBucketedCaching(DDD)[D

    move-result-object p1

    const-string p2, "latitude"

    const/4 v1, 0x0

    .line 184
    aget-wide v1, p1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Lcom/google/gson/JsonObject;->addProperty(Ljava/lang/String;Ljava/lang/Number;)V

    const-string p2, "longitude"

    const/4 v1, 0x1

    .line 185
    aget-wide v1, p1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lcom/google/gson/JsonObject;->addProperty(Ljava/lang/String;Ljava/lang/Number;)V

    const-string/jumbo p1, "userLatitude"

    .line 188
    invoke-virtual {v0, p1}, Lcom/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string/jumbo p1, "userLatitude"

    .line 189
    invoke-virtual {v0, p1}, Lcom/google/gson/JsonObject;->remove(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    :cond_0
    const-string/jumbo p1, "userLongitude"

    .line 191
    invoke-virtual {v0, p1}, Lcom/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string/jumbo p1, "userLongitude"

    .line 192
    invoke-virtual {v0, p1}, Lcom/google/gson/JsonObject;->remove(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    .line 194
    :cond_1
    sget-object p1, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p1, v0, p0}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/IAPIObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 198
    :catch_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Bucketed request must have Latitude and Longitude"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->onlineFetcher:Lcom/shopkick/fetchers/api/SimpleDataFetcher;

    invoke-virtual {v0}, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->cancel()V

    .line 139
    iget-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->offlineFetcher:Lcom/shopkick/fetchers/api/SimpleDataFetcher;

    invoke-virtual {v0}, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->cancel()V

    .line 140
    iget-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->prewarmFetcher:Lcom/shopkick/fetchers/api/SimpleDataFetcher;

    invoke-virtual {v0}, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->cancel()V

    return-void
.end method

.method public fetchMore()V
    .locals 2

    .line 115
    invoke-virtual {p0}, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->isFetching()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 118
    :cond_0
    sget-object v0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$1;->$SwitchMap$com$shopkick$fetchers$api$GPSFailbackDataFetcher$GPSFailbackDataFetcherMode:[I

    iget-object v1, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->mode:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    invoke-virtual {v1}, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 125
    :pswitch_0
    iget-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->offlineFetcher:Lcom/shopkick/fetchers/api/SimpleDataFetcher;

    invoke-virtual {v0}, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->fetchMore()V

    goto :goto_0

    .line 121
    :pswitch_1
    iget-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->prewarmFetcher:Lcom/shopkick/fetchers/api/SimpleDataFetcher;

    invoke-virtual {v0}, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->fetchMore()V

    .line 122
    iget-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->onlineFetcher:Lcom/shopkick/fetchers/api/SimpleDataFetcher;

    invoke-virtual {v0}, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->fetchMore()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getMode()Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->mode:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    return-object v0
.end method

.method public hasMore()Z
    .locals 2

    .line 86
    sget-object v0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$1;->$SwitchMap$com$shopkick$fetchers$api$GPSFailbackDataFetcher$GPSFailbackDataFetcherMode:[I

    iget-object v1, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->mode:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    invoke-virtual {v1}, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    .line 92
    :pswitch_0
    iget-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->offlineFetcher:Lcom/shopkick/fetchers/api/SimpleDataFetcher;

    invoke-virtual {v0}, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->hasMore()Z

    move-result v0

    return v0

    .line 90
    :pswitch_1
    iget-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->onlineFetcher:Lcom/shopkick/fetchers/api/SimpleDataFetcher;

    invoke-virtual {v0}, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->hasMore()Z

    move-result v0

    return v0

    :pswitch_2
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public isFetching()Z
    .locals 2

    .line 77
    iget-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->mode:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    sget-object v1, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;->Online:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->mode:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    sget-object v1, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;->Undetermined:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    if-ne v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->onlineFetcher:Lcom/shopkick/fetchers/api/SimpleDataFetcher;

    .line 78
    invoke-virtual {v0}, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->isFetching()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    iget-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->mode:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    sget-object v1, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;->Offline:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->offlineFetcher:Lcom/shopkick/fetchers/api/SimpleDataFetcher;

    .line 79
    invoke-virtual {v0}, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->isFetching()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public onPostFetch(Lcom/shopkick/fetchers/api/IDataFetcher;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    .line 156
    sget-object v0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$1;->$SwitchMap$com$shopkick$fetchers$api$GPSFailbackDataFetcher$GPSFailbackDataFetcherMode:[I

    iget-object v1, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->mode:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    invoke-virtual {v1}, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 170
    :pswitch_0
    iget-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->callback:Lcom/shopkick/fetchers/api/IDataFetcherCallback;

    if-eqz v0, :cond_1

    .line 171
    invoke-interface {v0, p1, p2, p3}, Lcom/shopkick/fetchers/api/IDataFetcherCallback;->onPostFetch(Lcom/shopkick/fetchers/api/IDataFetcher;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V

    goto :goto_0

    .line 158
    :pswitch_1
    iget-boolean v0, p3, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_0

    .line 159
    sget-object v0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;->Online:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    iput-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->mode:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    .line 160
    iget-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->callback:Lcom/shopkick/fetchers/api/IDataFetcherCallback;

    if-eqz v0, :cond_1

    .line 161
    invoke-interface {v0, p1, p2, p3}, Lcom/shopkick/fetchers/api/IDataFetcherCallback;->onPostFetch(Lcom/shopkick/fetchers/api/IDataFetcher;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V

    goto :goto_0

    .line 164
    :cond_0
    sget-object p1, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;->Offline:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    iput-object p1, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->mode:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    .line 165
    invoke-virtual {p0}, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->fetchMore()V

    :cond_1
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public onPreFetch(Lcom/shopkick/fetchers/api/IDataFetcher;Lcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->onlineFetcher:Lcom/shopkick/fetchers/api/SimpleDataFetcher;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->callback:Lcom/shopkick/fetchers/api/IDataFetcherCallback;

    if-eqz p1, :cond_0

    .line 148
    invoke-interface {p1, p0, p2}, Lcom/shopkick/fetchers/api/IDataFetcherCallback;->onPreFetch(Lcom/shopkick/fetchers/api/IDataFetcher;Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    :cond_0
    return-void
.end method

.method public reset()V
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->onlineFetcher:Lcom/shopkick/fetchers/api/SimpleDataFetcher;

    invoke-virtual {v0}, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->reset()V

    .line 104
    iget-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->offlineFetcher:Lcom/shopkick/fetchers/api/SimpleDataFetcher;

    invoke-virtual {v0}, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->reset()V

    .line 105
    iget-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->prewarmFetcher:Lcom/shopkick/fetchers/api/SimpleDataFetcher;

    invoke-virtual {v0}, Lcom/shopkick/fetchers/api/SimpleDataFetcher;->reset()V

    .line 106
    sget-object v0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;->Undetermined:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    iput-object v0, p0, Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher;->mode:Lcom/shopkick/fetchers/api/GPSFailbackDataFetcher$GPSFailbackDataFetcherMode;

    return-void
.end method
