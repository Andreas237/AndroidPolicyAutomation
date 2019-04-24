.class public Lnet/toddm/cache/MemoryCacheProvider;
.super Ljava/lang/Object;
.source "MemoryCacheProvider.java"

# interfaces
.implements Lnet/toddm/cache/CacheProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;
    }
.end annotation


# static fields
.field private static final _DefaultNamespace:Ljava/lang/String; = "e98fa3ee-cb8d-4e37-8b43-adb04036031a"

.field private static final _PriorityToWeight:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lnet/toddm/cache/CachePriority;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final _cacheEntryLastUseComparator:Lnet/toddm/cache/CacheEntryLastUseComparator;

.field private final _keyToEntry:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;",
            ">;"
        }
    .end annotation
.end field

.field private final _logger:Lnet/toddm/cache/LoggingProvider;

.field private _lruCap:I

.field private final _namespace:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 42
    new-instance v0, Lnet/toddm/cache/MemoryCacheProvider$1;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lnet/toddm/cache/MemoryCacheProvider$1;-><init>(I)V

    sput-object v0, Lnet/toddm/cache/MemoryCacheProvider;->_PriorityToWeight:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILnet/toddm/cache/LoggingProvider;)V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance v0, Lnet/toddm/cache/CacheEntryLastUseComparator;

    invoke-direct {v0}, Lnet/toddm/cache/CacheEntryLastUseComparator;-><init>()V

    iput-object v0, p0, Lnet/toddm/cache/MemoryCacheProvider;->_cacheEntryLastUseComparator:Lnet/toddm/cache/CacheEntryLastUseComparator;

    .line 50
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lnet/toddm/cache/MemoryCacheProvider;->_keyToEntry:Ljava/util/concurrent/ConcurrentHashMap;

    if-ltz p2, :cond_2

    if-eqz p1, :cond_0

    .line 68
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    const-string p1, "e98fa3ee-cb8d-4e37-8b43-adb04036031a"

    :cond_1
    iput-object p1, p0, Lnet/toddm/cache/MemoryCacheProvider;->_namespace:Ljava/lang/String;

    .line 69
    iput p2, p0, Lnet/toddm/cache/MemoryCacheProvider;->_lruCap:I

    .line 70
    iput-object p3, p0, Lnet/toddm/cache/MemoryCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    return-void

    .line 67
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'initialLruCap\' can not be negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic access$0(Lnet/toddm/cache/MemoryCacheProvider;)J
    .locals 2

    .line 257
    invoke-direct {p0}, Lnet/toddm/cache/MemoryCacheProvider;->getOldestUse()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic access$1()Ljava/util/Map;
    .locals 1

    .line 42
    sget-object v0, Lnet/toddm/cache/MemoryCacheProvider;->_PriorityToWeight:Ljava/util/Map;

    return-object v0
.end method

.method private getAll(ZZ)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)",
            "Ljava/util/List<",
            "Lnet/toddm/cache/CacheEntry;",
            ">;"
        }
    .end annotation

    .line 125
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 126
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lnet/toddm/cache/MemoryCacheProvider;->_keyToEntry:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 127
    iget-object v3, p0, Lnet/toddm/cache/MemoryCacheProvider;->_keyToEntry:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_2

    .line 136
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_1

    if-eqz p2, :cond_1

    .line 137
    invoke-direct {p0, v0, v1}, Lnet/toddm/cache/MemoryCacheProvider;->updateEvictionScores(J)V

    :cond_1
    return-object v2

    .line 127
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;

    if-eqz p1, :cond_4

    if-eqz p2, :cond_3

    .line 129
    invoke-virtual {v4, v0, v1}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->setTimestampUsed(J)V

    .line 130
    :cond_3
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 131
    :cond_4
    invoke-virtual {v4}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->hasExpired()Z

    move-result v5

    if-nez v5, :cond_0

    if-eqz p2, :cond_5

    .line 132
    invoke-virtual {v4, v0, v1}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->setTimestampUsed(J)V

    .line 133
    :cond_5
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method private getLookupKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 56
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "%1$s:%2$s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lnet/toddm/cache/MemoryCacheProvider;->_namespace:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getNewOrUpdatedCacheEntry(Ljava/lang/String;Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;
    .locals 18

    move-object/from16 v14, p0

    .line 232
    iget-object v0, v14, Lnet/toddm/cache/MemoryCacheProvider;->_keyToEntry:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct/range {p0 .. p1}, Lnet/toddm/cache/MemoryCacheProvider;->getLookupKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;

    if-eqz v1, :cond_1

    .line 235
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v15

    if-nez p3, :cond_0

    .line 237
    new-instance v17, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;

    move-object/from16 v0, v17

    invoke-virtual {v1}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->getTimestampCreated()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-wide v12, v15

    move-wide v14, v15

    move-object/from16 v16, p10

    invoke-direct/range {v0 .. v16}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;-><init>(Lnet/toddm/cache/MemoryCacheProvider;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;JJJLnet/toddm/cache/CachePriority;)V

    move-object/from16 v11, v17

    goto :goto_0

    .line 239
    :cond_0
    new-instance v17, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;

    move-object/from16 v0, v17

    invoke-virtual {v1}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->getTimestampCreated()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-wide v12, v15

    move-wide v14, v15

    move-object/from16 v16, p10

    invoke-direct/range {v0 .. v16}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;-><init>(Lnet/toddm/cache/MemoryCacheProvider;Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;JJJLnet/toddm/cache/CachePriority;)V

    move-object/from16 v11, v17

    goto :goto_0

    :cond_1
    if-nez p3, :cond_2

    .line 244
    new-instance v11, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;-><init>(Lnet/toddm/cache/MemoryCacheProvider;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)V

    goto :goto_0

    .line 246
    :cond_2
    new-instance v11, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;-><init>(Lnet/toddm/cache/MemoryCacheProvider;Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)V

    :goto_0
    return-object v11
.end method

.method private getOldestUse()J
    .locals 3

    .line 260
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 261
    iget-object v2, p0, Lnet/toddm/cache/MemoryCacheProvider;->_keyToEntry:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v2

    if-lez v2, :cond_0

    .line 262
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lnet/toddm/cache/MemoryCacheProvider;->_keyToEntry:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 263
    iget-object v1, p0, Lnet/toddm/cache/MemoryCacheProvider;->_cacheEntryLastUseComparator:Lnet/toddm/cache/CacheEntryLastUseComparator;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 264
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;

    invoke-virtual {v0}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->getTimestampUsed()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :cond_0
    return-wide v0
.end method

.method private updateEvictionScores(J)V
    .locals 11

    .line 270
    iget-object v0, p0, Lnet/toddm/cache/MemoryCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "######### UPDATING EVICTION SCORES #########"

    new-array v3, v1, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    :cond_0
    invoke-direct {p0}, Lnet/toddm/cache/MemoryCacheProvider;->getOldestUse()J

    move-result-wide v2

    .line 272
    iget-object v0, p0, Lnet/toddm/cache/MemoryCacheProvider;->_keyToEntry:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_2

    return-void

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;

    .line 273
    invoke-virtual {v4, p1, p2, v2, v3}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->updateEvictionScore(JJ)V

    .line 275
    iget-object v5, p0, Lnet/toddm/cache/MemoryCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v5, :cond_1

    const-string v6, "## %.12f = (%.12f * (1 + (%d / %d))) [key:%s]"

    const/4 v7, 0x5

    .line 276
    new-array v7, v7, [Ljava/lang/Object;

    .line 277
    invoke-virtual {v4}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->getEvictionScore()D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    aput-object v8, v7, v1

    const/4 v8, 0x1

    .line 278
    sget-object v9, Lnet/toddm/cache/MemoryCacheProvider;->_PriorityToWeight:Ljava/util/Map;

    invoke-virtual {v4}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->getPriority()Lnet/toddm/cache/CachePriority;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    aput-object v9, v7, v8

    const/4 v8, 0x2

    .line 279
    invoke-virtual {v4}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->getTimestampUsed()Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    sub-long/2addr v9, v2

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v7, v8

    const/4 v8, 0x3

    sub-long v9, p1, v2

    .line 280
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v7, v8

    const/4 v8, 0x4

    .line 281
    invoke-virtual {v4}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->getKey()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v7, v8

    .line 276
    invoke-interface {v5, v6, v7}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method


# virtual methods
.method public add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z
    .locals 12

    move-object v11, p0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v4, p3

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    .line 78
    invoke-direct/range {v0 .. v10}, Lnet/toddm/cache/MemoryCacheProvider;->getNewOrUpdatedCacheEntry(Ljava/lang/String;Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;

    move-result-object v0

    .line 79
    iget-object v1, v11, Lnet/toddm/cache/MemoryCacheProvider;->_keyToEntry:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p0, p1}, Lnet/toddm/cache/MemoryCacheProvider;->getLookupKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    invoke-virtual {v0}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->getTimestampUsed()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lnet/toddm/cache/MemoryCacheProvider;->updateEvictionScores(J)V

    .line 82
    iget-object v0, v11, Lnet/toddm/cache/MemoryCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const-string v2, "Cache entry added [key:%1$s ttl:%2$d maxStale:%3$d eTag:%4$s sourceUri:%5$s]"

    const/4 v3, 0x5

    .line 83
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-static/range {p3 .. p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v1

    const/4 v4, 0x2

    invoke-static/range {p5 .. p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x3

    aput-object p7, v3, v4

    const/4 v4, 0x4

    aput-object p8, v3, v4

    invoke-interface {v0, v2, v3}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return v1
.end method

.method public add(Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z
    .locals 12

    move-object v11, p0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-wide v4, p3

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    .line 93
    invoke-direct/range {v0 .. v10}, Lnet/toddm/cache/MemoryCacheProvider;->getNewOrUpdatedCacheEntry(Ljava/lang/String;Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;

    move-result-object v0

    .line 94
    iget-object v1, v11, Lnet/toddm/cache/MemoryCacheProvider;->_keyToEntry:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p0, p1}, Lnet/toddm/cache/MemoryCacheProvider;->getLookupKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    invoke-virtual {v0}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->getTimestampUsed()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lnet/toddm/cache/MemoryCacheProvider;->updateEvictionScores(J)V

    .line 97
    iget-object v0, v11, Lnet/toddm/cache/MemoryCacheProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const-string v2, "Cache entry added [key:%1$s ttl:%2$d maxStale:%3$d eTag:%4$s sourceUri:%5$s]"

    const/4 v3, 0x5

    .line 98
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-static/range {p3 .. p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v1

    const/4 v4, 0x2

    invoke-static/range {p5 .. p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x3

    aput-object p7, v3, v4

    const/4 v4, 0x4

    aput-object p8, v3, v4

    invoke-interface {v0, v2, v3}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return v1
.end method

.method public containsKey(Ljava/lang/String;Z)Z
    .locals 1

    if-eqz p1, :cond_2

    .line 155
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    if-eqz p2, :cond_0

    .line 157
    iget-object p2, p0, Lnet/toddm/cache/MemoryCacheProvider;->_keyToEntry:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p0, p1}, Lnet/toddm/cache/MemoryCacheProvider;->getLookupKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 159
    :cond_0
    iget-object p2, p0, Lnet/toddm/cache/MemoryCacheProvider;->_keyToEntry:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p0, p1}, Lnet/toddm/cache/MemoryCacheProvider;->getLookupKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;

    if-eqz p1, :cond_1

    .line 160
    invoke-virtual {p1}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->hasExpired()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1

    .line 155
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'key\' can not be NULL or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;
    .locals 2

    if-eqz p1, :cond_2

    .line 106
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 107
    iget-object v0, p0, Lnet/toddm/cache/MemoryCacheProvider;->_keyToEntry:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p0, p1}, Lnet/toddm/cache/MemoryCacheProvider;->getLookupKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    .line 109
    invoke-virtual {p1}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->hasExpired()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 112
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->setTimestampUsed(J)V

    .line 113
    invoke-virtual {p1}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->getTimestampUsed()Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lnet/toddm/cache/MemoryCacheProvider;->updateEvictionScores(J)V

    :cond_1
    return-object p1

    .line 106
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'key\' can not be NULL or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getAll(Z)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/List<",
            "Lnet/toddm/cache/CacheEntry;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 121
    invoke-direct {p0, p1, v0}, Lnet/toddm/cache/MemoryCacheProvider;->getAll(ZZ)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getLruCap()I
    .locals 1

    .line 213
    iget v0, p0, Lnet/toddm/cache/MemoryCacheProvider;->_lruCap:I

    return v0
.end method

.method public remove(Ljava/lang/String;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 167
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 168
    iget-object v0, p0, Lnet/toddm/cache/MemoryCacheProvider;->_keyToEntry:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p0, p1}, Lnet/toddm/cache/MemoryCacheProvider;->getLookupKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    .line 167
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'key\' can not be NULL or empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public removeAll()Z
    .locals 1

    .line 175
    iget-object v0, p0, Lnet/toddm/cache/MemoryCacheProvider;->_keyToEntry:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    const/4 v0, 0x1

    return v0
.end method

.method public setLruCap(I)V
    .locals 0

    .line 207
    iput p1, p0, Lnet/toddm/cache/MemoryCacheProvider;->_lruCap:I

    return-void
.end method

.method public size(Z)I
    .locals 1

    if-eqz p1, :cond_0

    .line 146
    iget-object p1, p0, Lnet/toddm/cache/MemoryCacheProvider;->_keyToEntry:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x0

    .line 148
    invoke-direct {p0, p1, v0}, Lnet/toddm/cache/MemoryCacheProvider;->getAll(ZZ)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    return p1
.end method

.method public trimLru()Z
    .locals 3

    .line 190
    iget-object v0, p0, Lnet/toddm/cache/MemoryCacheProvider;->_keyToEntry:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    iget v1, p0, Lnet/toddm/cache/MemoryCacheProvider;->_lruCap:I

    if-le v0, v1, :cond_1

    .line 193
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lnet/toddm/cache/MemoryCacheProvider;->_keyToEntry:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 194
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 197
    iget v1, p0, Lnet/toddm/cache/MemoryCacheProvider;->_lruCap:I

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lt v1, v2, :cond_0

    goto :goto_1

    .line 198
    :cond_0
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;

    invoke-virtual {v2}, Lnet/toddm/cache/MemoryCacheProvider$CacheEntryWithEvictionScore;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lnet/toddm/cache/MemoryCacheProvider;->remove(Ljava/lang/String;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 v0, 0x1

    return v0
.end method
