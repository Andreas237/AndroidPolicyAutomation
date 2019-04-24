.class public Lcom/usebutton/sdk/internal/api/ActionCache;
.super Ljava/lang/Object;
.source "ActionCache.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/api/AppActionCache;


# static fields
.field private static final DEFAULT_CACHE_TIME_SECONDS:J

.field private static final DEFAULT_SHARED_EXECUTOR:Ljava/util/concurrent/Executor;

.field protected static final MAX_ENTRIES:I = 0x64

.field private static final TAG:Ljava/lang/String; = "ActionCache"


# instance fields
.field private final mCache:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Lcom/usebutton/sdk/internal/functional/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/usebutton/sdk/internal/util/TtlReference<",
            "Lcom/usebutton/sdk/internal/models/AppAction;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mGarbageMan:Ljava/util/concurrent/Executor;

.field private mHits:I

.field private mMisses:I

.field private final mTimeProvider:Lcom/usebutton/sdk/internal/util/TimeProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 35
    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    sput-wide v0, Lcom/usebutton/sdk/internal/api/ActionCache;->DEFAULT_CACHE_TIME_SECONDS:J

    .line 53
    new-instance v0, Lcom/usebutton/sdk/internal/util/ButtonThreadFactory;

    const-string v1, "ActionCache"

    invoke-direct {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonThreadFactory;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/usebutton/sdk/internal/api/ActionCache;->DEFAULT_SHARED_EXECUTOR:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 56
    sget-object v0, Lcom/usebutton/sdk/internal/util/TtlReference;->REALTIME_MILLIS_PROVIDER:Lcom/usebutton/sdk/internal/util/TimeProvider;

    sget-object v1, Lcom/usebutton/sdk/internal/api/ActionCache;->DEFAULT_SHARED_EXECUTOR:Ljava/util/concurrent/Executor;

    invoke-direct {p0, v0, v1}, Lcom/usebutton/sdk/internal/api/ActionCache;-><init>(Lcom/usebutton/sdk/internal/util/TimeProvider;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/util/TimeProvider;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Lcom/usebutton/sdk/internal/api/ActionCache$1;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/api/ActionCache$1;-><init>(Lcom/usebutton/sdk/internal/api/ActionCache;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mCache:Ljava/util/LinkedHashMap;

    const/4 v0, 0x0

    .line 50
    iput v0, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mHits:I

    .line 51
    iput v0, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mMisses:I

    .line 61
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mTimeProvider:Lcom/usebutton/sdk/internal/util/TimeProvider;

    .line 62
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mGarbageMan:Ljava/util/concurrent/Executor;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/api/ActionCache;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/ActionCache;->evictExpired()V

    return-void
.end method

.method private cacheKeyForContext(Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;)Lcom/usebutton/sdk/internal/functional/Pair;
    .locals 2
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/usebutton/sdk/action/ActionQuery;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 126
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz p3, :cond_0

    .line 128
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lcom/usebutton/sdk/action/ActionQuery;->key()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    if-eqz p2, :cond_1

    .line 131
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 133
    :cond_1
    new-instance p2, Lcom/usebutton/sdk/internal/functional/Pair;

    invoke-direct {p2, p1, v0}, Lcom/usebutton/sdk/internal/functional/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method

.method private declared-synchronized evictExpired()V
    .locals 2

    monitor-enter p0

    .line 115
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mCache:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 116
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 117
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 118
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/util/TtlReference;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/util/TtlReference;->isDead()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 119
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 122
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private scheduleCleanup()V
    .locals 2

    .line 93
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mGarbageMan:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/usebutton/sdk/internal/api/ActionCache$2;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/api/ActionCache$2;-><init>(Lcom/usebutton/sdk/internal/api/ActionCache;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized contains(Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;)Z
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    monitor-enter p0

    .line 75
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/ActionCache;->scheduleCleanup()V

    .line 76
    invoke-direct {p0, p1, p2, p3}, Lcom/usebutton/sdk/internal/api/ActionCache;->cacheKeyForContext(Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;)Lcom/usebutton/sdk/internal/functional/Pair;

    move-result-object p1

    .line 77
    iget-object p2, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mCache:Ljava/util/LinkedHashMap;

    invoke-virtual {p2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/util/TtlReference;

    const/4 p2, 0x1

    if-eqz p1, :cond_0

    .line 81
    iget p1, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mHits:I

    add-int/2addr p1, p2

    iput p1, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mHits:I

    move p1, p2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 84
    iget p3, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mMisses:I

    add-int/2addr p3, p2

    iput p3, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mMisses:I

    .line 86
    :goto_0
    iget p2, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mHits:I

    iget p3, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mMisses:I

    rem-int/lit8 p3, p3, 0xa

    add-int/2addr p2, p3

    if-nez p2, :cond_1

    const-string p2, "ActionCache"

    .line 87
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/api/ActionCache;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Lcom/usebutton/sdk/internal/util/ButtonLog;->info(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    :cond_1
    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized get(Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;)Lcom/usebutton/sdk/internal/models/AppAction;
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/usebutton/sdk/action/ActionQuery;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    monitor-enter p0

    .line 108
    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Lcom/usebutton/sdk/internal/api/ActionCache;->cacheKeyForContext(Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;)Lcom/usebutton/sdk/internal/functional/Pair;

    move-result-object p1

    .line 109
    iget-object p2, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mCache:Ljava/util/LinkedHashMap;

    invoke-virtual {p2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/util/TtlReference;

    if-eqz p1, :cond_0

    .line 110
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/util/TtlReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/models/AppAction;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized put(Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;Lcom/usebutton/sdk/internal/models/AppAction;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/usebutton/sdk/action/ActionQuery;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/usebutton/sdk/internal/models/AppAction;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    monitor-enter p0

    if-nez p4, :cond_0

    .line 145
    :try_start_0
    sget-wide v0, Lcom/usebutton/sdk/internal/api/ActionCache;->DEFAULT_CACHE_TIME_SECONDS:J

    goto :goto_0

    .line 147
    :cond_0
    invoke-virtual {p4}, Lcom/usebutton/sdk/internal/models/AppAction;->getMeta()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getMaxAgeSeconds()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long v0, v0

    :goto_0
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-gtz v2, :cond_1

    .line 150
    monitor-exit p0

    return-void

    .line 152
    :cond_1
    :try_start_1
    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mCache:Ljava/util/LinkedHashMap;

    invoke-direct {p0, p1, p2, p3}, Lcom/usebutton/sdk/internal/api/ActionCache;->cacheKeyForContext(Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;)Lcom/usebutton/sdk/internal/functional/Pair;

    move-result-object p1

    new-instance p2, Lcom/usebutton/sdk/internal/util/TtlReference;

    iget-object p3, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mTimeProvider:Lcom/usebutton/sdk/internal/util/TimeProvider;

    const-wide/16 v3, 0x3e8

    mul-long/2addr v0, v3

    invoke-direct {p2, p3, p4, v0, v1}, Lcom/usebutton/sdk/internal/util/TtlReference;-><init>(Lcom/usebutton/sdk/internal/util/TimeProvider;Ljava/lang/Object;J)V

    invoke-virtual {v2, p1, p2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 153
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized size()I
    .locals 1

    monitor-enter p0

    .line 156
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mCache:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .line 161
    iget v0, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mHits:I

    iget v1, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mMisses:I

    add-int/2addr v0, v1

    .line 162
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "ActionCache hits/misses/total: %d/%d/%d hit rate=%.2f"

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mHits:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    iget v4, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mMisses:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x2

    aput-object v4, v3, v5

    iget v4, p0, Lcom/usebutton/sdk/internal/api/ActionCache;->mHits:I

    int-to-double v4, v4

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v4, v6

    int-to-double v6, v0

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    const/4 v4, 0x3

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
