.class Lcom/shopkick/comm/FetchersCommCacheProvider;
.super Ljava/lang/Object;
.source "FetchersCommCacheProvider.java"

# interfaces
.implements Lnet/toddm/cache/CacheProvider;


# static fields
.field private static final DISK_CACHE_DB_VERSION:I = 0x2

.field private static final DISK_CACHE_LRU_CAP:I = 0x320

.field private static final DISK_CACHE_NAMESPACE:Ljava/lang/String; = "network_response_cache"

.field private static final MEMORY_CACHE_LRU_CAP:I = 0x64

.field private static final MEMORY_CACHE_NAMESPACE:Ljava/lang/String; = "network_response_cache"


# instance fields
.field private final diskCacheProvider:Lnet/toddm/cache/CacheProvider;

.field private final memoryCacheProvider:Lnet/toddm/cache/CacheProvider;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Lnet/toddm/cache/MemoryCacheProvider;

    const-string v1, "network_response_cache"

    .line 46
    invoke-static {}, Lcom/shopkick/utilities/DefaultCacheLoggingProvider;->getInstance()Lcom/shopkick/utilities/DefaultCacheLoggingProvider;

    move-result-object v2

    const/16 v3, 0x64

    invoke-direct {v0, v1, v3, v2}, Lnet/toddm/cache/MemoryCacheProvider;-><init>(Ljava/lang/String;ILnet/toddm/cache/LoggingProvider;)V

    iput-object v0, p0, Lcom/shopkick/comm/FetchersCommCacheProvider;->memoryCacheProvider:Lnet/toddm/cache/CacheProvider;

    .line 49
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "network_response_cache"

    .line 53
    invoke-static {}, Lcom/shopkick/utilities/DefaultCacheLoggingProvider;->getInstance()Lcom/shopkick/utilities/DefaultCacheLoggingProvider;

    move-result-object v1

    const/4 v2, 0x2

    const/16 v3, 0x320

    .line 49
    invoke-static {p1, v0, v2, v3, v1}, Lnet/toddm/cache/android/DBCacheProvider;->getInstance(Landroid/content/Context;Ljava/lang/String;IILnet/toddm/cache/LoggingProvider;)Lnet/toddm/cache/android/DBCacheProvider;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/comm/FetchersCommCacheProvider;->diskCacheProvider:Lnet/toddm/cache/CacheProvider;

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z
    .locals 14

    move-object v0, p0

    .line 63
    iget-object v1, v0, Lcom/shopkick/comm/FetchersCommCacheProvider;->memoryCacheProvider:Lnet/toddm/cache/CacheProvider;

    move-object v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-interface/range {v1 .. v10}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    move-result v1

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-nez v1, :cond_0

    .line 65
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->COMM:Lcom/shopkick/logging/Area;

    .line 66
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "FetchersCommCacheProvider.add(string) failed to add to in-memory cache [key:%1$s]"

    new-array v5, v11, [Ljava/lang/Object;

    aput-object p1, v5, v12

    .line 65
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    move v13, v12

    goto :goto_0

    :cond_0
    move v13, v11

    .line 70
    :goto_0
    iget-object v1, v0, Lcom/shopkick/comm/FetchersCommCacheProvider;->diskCacheProvider:Lnet/toddm/cache/CacheProvider;

    move-object v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-interface/range {v1 .. v10}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 72
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->COMM:Lcom/shopkick/logging/Area;

    .line 73
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "FetchersCommCacheProvider.add(string) failed to add to disk cache [key:%1$s]"

    new-array v5, v11, [Ljava/lang/Object;

    aput-object p1, v5, v12

    .line 72
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    move v12, v13

    :goto_1
    return v12
.end method

.method public add(Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z
    .locals 14

    move-object v0, p0

    .line 87
    iget-object v1, v0, Lcom/shopkick/comm/FetchersCommCacheProvider;->memoryCacheProvider:Lnet/toddm/cache/CacheProvider;

    move-object v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-interface/range {v1 .. v10}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    move-result v1

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-nez v1, :cond_0

    .line 89
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->COMM:Lcom/shopkick/logging/Area;

    .line 90
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "FetchersCommCacheProvider.add(bytes) failed to add to in-memory cache [key:%1$s]"

    new-array v5, v11, [Ljava/lang/Object;

    aput-object p1, v5, v12

    .line 89
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    move v13, v12

    goto :goto_0

    :cond_0
    move v13, v11

    .line 94
    :goto_0
    iget-object v1, v0, Lcom/shopkick/comm/FetchersCommCacheProvider;->diskCacheProvider:Lnet/toddm/cache/CacheProvider;

    move-object v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-interface/range {v1 .. v10}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 96
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->COMM:Lcom/shopkick/logging/Area;

    .line 97
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "FetchersCommCacheProvider.add(bytes) failed to add to disk cache [key:%1$s]"

    new-array v5, v11, [Ljava/lang/Object;

    aput-object p1, v5, v12

    .line 96
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    move v12, v13

    :goto_1
    return v12
.end method

.method public containsKey(Ljava/lang/String;Z)Z
    .locals 1

    .line 180
    iget-object v0, p0, Lcom/shopkick/comm/FetchersCommCacheProvider;->memoryCacheProvider:Lnet/toddm/cache/CacheProvider;

    invoke-interface {v0, p1, p2}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/comm/FetchersCommCacheProvider;->diskCacheProvider:Lnet/toddm/cache/CacheProvider;

    .line 181
    invoke-interface {v0, p1, p2}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    .line 111
    iget-object v3, v0, Lcom/shopkick/comm/FetchersCommCacheProvider;->memoryCacheProvider:Lnet/toddm/cache/CacheProvider;

    invoke-interface {v3, v1, v2}, Lnet/toddm/cache/CacheProvider;->get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;

    move-result-object v3

    .line 112
    iget-object v4, v0, Lcom/shopkick/comm/FetchersCommCacheProvider;->diskCacheProvider:Lnet/toddm/cache/CacheProvider;

    invoke-interface {v4, v1, v2}, Lnet/toddm/cache/CacheProvider;->get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;

    move-result-object v1

    if-nez v3, :cond_1

    if-eqz v1, :cond_1

    .line 117
    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getBytesValue()[B

    move-result-object v2

    if-eqz v2, :cond_0

    .line 120
    iget-object v4, v0, Lcom/shopkick/comm/FetchersCommCacheProvider;->memoryCacheProvider:Lnet/toddm/cache/CacheProvider;

    .line 121
    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getKey()Ljava/lang/String;

    move-result-object v5

    .line 122
    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getBytesValue()[B

    move-result-object v6

    .line 123
    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getTtl()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    .line 124
    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getMaxStale()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    .line 125
    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getEtag()Ljava/lang/String;

    move-result-object v11

    .line 126
    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getUri()Ljava/net/URI;

    move-result-object v12

    .line 127
    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getPriority()Lnet/toddm/cache/CachePriority;

    move-result-object v13

    .line 120
    invoke-interface/range {v4 .. v13}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    goto :goto_0

    .line 131
    :cond_0
    iget-object v14, v0, Lcom/shopkick/comm/FetchersCommCacheProvider;->memoryCacheProvider:Lnet/toddm/cache/CacheProvider;

    .line 132
    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getKey()Ljava/lang/String;

    move-result-object v15

    .line 133
    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getStringValue()Ljava/lang/String;

    move-result-object v16

    .line 134
    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getTtl()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    .line 135
    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getMaxStale()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v19

    .line 136
    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getEtag()Ljava/lang/String;

    move-result-object v21

    .line 137
    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getUri()Ljava/net/URI;

    move-result-object v22

    .line 138
    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getPriority()Lnet/toddm/cache/CachePriority;

    move-result-object v23

    .line 131
    invoke-interface/range {v14 .. v23}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    :cond_1
    :goto_0
    if-eqz v3, :cond_2

    move-object v1, v3

    :cond_2
    return-object v1
.end method

.method public getAll(Z)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/List<",
            "Lnet/toddm/cache/CacheEntry;",
            ">;"
        }
    .end annotation

    .line 152
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 153
    iget-object v1, p0, Lcom/shopkick/comm/FetchersCommCacheProvider;->memoryCacheProvider:Lnet/toddm/cache/CacheProvider;

    invoke-interface {v1, p1}, Lnet/toddm/cache/CacheProvider;->getAll(Z)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/toddm/cache/CacheEntry;

    .line 154
    invoke-virtual {v2}, Lnet/toddm/cache/CacheEntry;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 155
    invoke-virtual {v2}, Lnet/toddm/cache/CacheEntry;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 158
    :cond_1
    iget-object v1, p0, Lcom/shopkick/comm/FetchersCommCacheProvider;->diskCacheProvider:Lnet/toddm/cache/CacheProvider;

    invoke-interface {v1, p1}, Lnet/toddm/cache/CacheProvider;->getAll(Z)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/toddm/cache/CacheEntry;

    .line 159
    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 160
    invoke-virtual {v1}, Lnet/toddm/cache/CacheEntry;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 163
    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object p1
.end method

.method public getLruCap()I
    .locals 2

    .line 218
    iget-object v0, p0, Lcom/shopkick/comm/FetchersCommCacheProvider;->memoryCacheProvider:Lnet/toddm/cache/CacheProvider;

    invoke-interface {v0}, Lnet/toddm/cache/CacheProvider;->getLruCap()I

    move-result v0

    iget-object v1, p0, Lcom/shopkick/comm/FetchersCommCacheProvider;->diskCacheProvider:Lnet/toddm/cache/CacheProvider;

    invoke-interface {v1}, Lnet/toddm/cache/CacheProvider;->getLruCap()I

    move-result v1

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/shopkick/comm/FetchersCommCacheProvider;->memoryCacheProvider:Lnet/toddm/cache/CacheProvider;

    .line 219
    invoke-interface {v0}, Lnet/toddm/cache/CacheProvider;->getLruCap()I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/shopkick/comm/FetchersCommCacheProvider;->diskCacheProvider:Lnet/toddm/cache/CacheProvider;

    .line 220
    invoke-interface {v0}, Lnet/toddm/cache/CacheProvider;->getLruCap()I

    move-result v0

    :goto_0
    return v0
.end method

.method public remove(Ljava/lang/String;)Z
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/shopkick/comm/FetchersCommCacheProvider;->memoryCacheProvider:Lnet/toddm/cache/CacheProvider;

    invoke-interface {v0, p1}, Lnet/toddm/cache/CacheProvider;->remove(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/comm/FetchersCommCacheProvider;->diskCacheProvider:Lnet/toddm/cache/CacheProvider;

    invoke-interface {v0, p1}, Lnet/toddm/cache/CacheProvider;->remove(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public removeAll()Z
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/shopkick/comm/FetchersCommCacheProvider;->memoryCacheProvider:Lnet/toddm/cache/CacheProvider;

    invoke-interface {v0}, Lnet/toddm/cache/CacheProvider;->removeAll()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/comm/FetchersCommCacheProvider;->diskCacheProvider:Lnet/toddm/cache/CacheProvider;

    invoke-interface {v0}, Lnet/toddm/cache/CacheProvider;->removeAll()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setLruCap(I)V
    .locals 4

    .line 209
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->COMM:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string v2, "FetchersCommCacheProvider.setLruCap() called, but not supported"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public size(Z)I
    .locals 2

    .line 172
    iget-object v0, p0, Lcom/shopkick/comm/FetchersCommCacheProvider;->memoryCacheProvider:Lnet/toddm/cache/CacheProvider;

    invoke-interface {v0, p1}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result v0

    iget-object v1, p0, Lcom/shopkick/comm/FetchersCommCacheProvider;->diskCacheProvider:Lnet/toddm/cache/CacheProvider;

    invoke-interface {v1, p1}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result v1

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/shopkick/comm/FetchersCommCacheProvider;->memoryCacheProvider:Lnet/toddm/cache/CacheProvider;

    .line 173
    invoke-interface {v0, p1}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/shopkick/comm/FetchersCommCacheProvider;->diskCacheProvider:Lnet/toddm/cache/CacheProvider;

    .line 174
    invoke-interface {v0, p1}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result p1

    :goto_0
    return p1
.end method

.method public trimLru()Z
    .locals 1

    .line 199
    iget-object v0, p0, Lcom/shopkick/comm/FetchersCommCacheProvider;->memoryCacheProvider:Lnet/toddm/cache/CacheProvider;

    invoke-interface {v0}, Lnet/toddm/cache/CacheProvider;->trimLru()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/comm/FetchersCommCacheProvider;->diskCacheProvider:Lnet/toddm/cache/CacheProvider;

    invoke-interface {v0}, Lnet/toddm/cache/CacheProvider;->trimLru()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
