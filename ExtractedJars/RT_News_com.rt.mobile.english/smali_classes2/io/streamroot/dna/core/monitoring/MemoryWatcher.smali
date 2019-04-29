.class public final Lio/streamroot/dna/core/monitoring/MemoryWatcher;
.super Ljava/lang/Object;
.source "Watcher.kt"

# interfaces
.implements Lio/streamroot/dna/core/monitoring/Watcher;


# annotations
.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0008\u0010\u0018\u001a\u00020\u000cH\u0002J\u0008\u0010\u0019\u001a\u00020\u001aH\u0016J\u0008\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/streamroot/dna/core/monitoring/MemoryWatcher;",
        "Lio/streamroot/dna/core/monitoring/Watcher;",
        "memoryService",
        "Lio/streamroot/dna/core/system/MemoryService;",
        "lowMemoryPercentageThreshold",
        "",
        "highMemoryPercentageThreshold",
        "(Lio/streamroot/dna/core/system/MemoryService;DD)V",
        "averageUsableMemory",
        "Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;",
        "currentThreatLevel",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "Lio/streamroot/dna/core/monitoring/ThreatLevel;",
        "maxUsableMemory",
        "Ljava/util/concurrent/atomic/AtomicLong;",
        "minUsableMemory",
        "type",
        "Lio/streamroot/dna/core/monitoring/WatchType;",
        "getType",
        "()Lio/streamroot/dna/core/monitoring/WatchType;",
        "appendStatsAnalytics",
        "",
        "statsPayload",
        "Lorg/json/JSONObject;",
        "determineThreatLevelFromMemoryState",
        "statusPhrase",
        "",
        "watch",
        "Lio/streamroot/dna/core/monitoring/WatchResult;",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final averageUsableMemory:Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;

.field private currentThreatLevel:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lio/streamroot/dna/core/monitoring/ThreatLevel;",
            ">;"
        }
    .end annotation
.end field

.field private final highMemoryPercentageThreshold:D

.field private final lowMemoryPercentageThreshold:D

.field private final maxUsableMemory:Ljava/util/concurrent/atomic/AtomicLong;

.field private final memoryService:Lio/streamroot/dna/core/system/MemoryService;

.field private final minUsableMemory:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/system/MemoryService;DD)V
    .locals 6
    .param p1    # Lio/streamroot/dna/core/system/MemoryService;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "memoryService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->memoryService:Lio/streamroot/dna/core/system/MemoryService;

    iput-wide p2, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->lowMemoryPercentageThreshold:D

    iput-wide p4, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->highMemoryPercentageThreshold:D

    .line 51
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/high16 p2, -0x8000000000000000L

    invoke-direct {p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->maxUsableMemory:Ljava/util/concurrent/atomic/AtomicLong;

    .line 52
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide p2, 0x7fffffffffffffffL

    invoke-direct {p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->minUsableMemory:Ljava/util/concurrent/atomic/AtomicLong;

    .line 53
    new-instance p1, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;-><init>(JLio/streamroot/dna/core/utils/Clock;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->averageUsableMemory:Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;

    .line 56
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p0}, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->determineThreatLevelFromMemoryState()Lio/streamroot/dna/core/monitoring/ThreatLevel;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->currentThreatLevel:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method private final determineThreatLevelFromMemoryState()Lio/streamroot/dna/core/monitoring/ThreatLevel;
    .locals 12

    .line 82
    iget-object v0, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->memoryService:Lio/streamroot/dna/core/system/MemoryService;

    invoke-virtual {v0}, Lio/streamroot/dna/core/system/MemoryService;->freeMemory()J

    move-result-wide v0

    .line 83
    iget-object v2, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->memoryService:Lio/streamroot/dna/core/system/MemoryService;

    invoke-virtual {v2}, Lio/streamroot/dna/core/system/MemoryService;->maxMemory()J

    move-result-wide v2

    const/4 v4, 0x0

    .line 85
    :try_start_0
    iget-object v5, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->maxUsableMemory:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v5, v0, v1}, Lio/streamroot/dna/core/utils/AtomicExtensionsKt;->setIfBigger(Ljava/util/concurrent/atomic/AtomicLong;J)J

    .line 86
    iget-object v5, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->minUsableMemory:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v5, v0, v1}, Lio/streamroot/dna/core/utils/AtomicExtensionsKt;->setIfSmaller(Ljava/util/concurrent/atomic/AtomicLong;J)J

    .line 87
    iget-object v5, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->averageUsableMemory:Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;

    invoke-virtual {v5, v0, v1}, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->add(J)V

    .line 89
    iget-object v5, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->memoryService:Lio/streamroot/dna/core/system/MemoryService;

    invoke-virtual {v5}, Lio/streamroot/dna/core/system/MemoryService;->freeMemoryPercentage()D

    move-result-wide v5

    .line 91
    sget-object v7, Lio/streamroot/dna/core/log/Logger;->INSTANCE:Lio/streamroot/dna/core/log/Logger;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "[MEMORY] freeMemoryPercentage:"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-array v9, v4, [Ljava/lang/Object;

    invoke-virtual {v7, v8, v9}, Lio/streamroot/dna/core/log/Logger;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    sget-object v7, Lkotlin/jvm/internal/DoubleCompanionObject;->INSTANCE:Lkotlin/jvm/internal/DoubleCompanionObject;

    invoke-virtual {v7}, Lkotlin/jvm/internal/DoubleCompanionObject;->getMIN_VALUE()D

    move-result-wide v7

    iget-wide v9, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->lowMemoryPercentageThreshold:D

    cmpl-double v11, v5, v7

    if-ltz v11, :cond_0

    cmpg-double v7, v5, v9

    if-gtz v7, :cond_0

    sget-object v5, Lio/streamroot/dna/core/monitoring/ThreatLevel;->CRITICAL:Lio/streamroot/dna/core/monitoring/ThreatLevel;

    goto :goto_0

    .line 95
    :cond_0
    iget-wide v7, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->lowMemoryPercentageThreshold:D

    iget-wide v9, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->highMemoryPercentageThreshold:D

    cmpl-double v11, v5, v7

    if-ltz v11, :cond_1

    cmpg-double v7, v5, v9

    if-gtz v7, :cond_1

    sget-object v5, Lio/streamroot/dna/core/monitoring/ThreatLevel;->HIGH:Lio/streamroot/dna/core/monitoring/ThreatLevel;

    goto :goto_0

    .line 96
    :cond_1
    sget-object v5, Lio/streamroot/dna/core/monitoring/ThreatLevel;->LOW:Lio/streamroot/dna/core/monitoring/ThreatLevel;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v5

    :catch_0
    move-exception v5

    .line 99
    sget-object v6, Lio/streamroot/dna/core/log/Logger;->INSTANCE:Lio/streamroot/dna/core/log/Logger;

    check-cast v5, Ljava/lang/Throwable;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "MemoryWatcher : "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " / "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v4, [Ljava/lang/Object;

    invoke-virtual {v6, v5, v0, v1}, Lio/streamroot/dna/core/log/Logger;->error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    sget-object v0, Lio/streamroot/dna/core/monitoring/ThreatLevel;->CRITICAL:Lio/streamroot/dna/core/monitoring/ThreatLevel;

    return-object v0
.end method


# virtual methods
.method public appendControlAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "controlPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-static {p0, p1}, Lio/streamroot/dna/core/monitoring/Watcher$DefaultImpls;->appendControlAnalytics(Lio/streamroot/dna/core/monitoring/Watcher;Lorg/json/JSONObject;)V

    return-void
.end method

.method public appendStatsAnalytics(Lorg/json/JSONObject;)V
    .locals 4
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "statsPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    .line 74
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "native"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "watchdog"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "memoryWatcher"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {p1, v0}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->getOrInsertJSONObject(Lorg/json/JSONObject;[Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "threatLevel"

    .line 75
    iget-object v1, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->currentThreatLevel:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "maxFreeMemory"

    .line 76
    iget-object v1, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->maxUsableMemory:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/high16 v2, -0x8000000000000000L

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "minFreeMemory"

    .line 77
    iget-object v1, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->minUsableMemory:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide v2, 0x7fffffffffffffffL

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "avgFreeMemory"

    .line 78
    iget-object v1, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->averageUsableMemory:Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;

    invoke-virtual {v1}, Lio/streamroot/dna/core/analytics/AtomicStaircaseLong;->get()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    return-void
.end method

.method public appendSupportAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "supportPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-static {p0, p1}, Lio/streamroot/dna/core/monitoring/Watcher$DefaultImpls;->appendSupportAnalytics(Lio/streamroot/dna/core/monitoring/Watcher;Lorg/json/JSONObject;)V

    return-void
.end method

.method public appendTrafficAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "trafficPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-static {p0, p1}, Lio/streamroot/dna/core/monitoring/Watcher$DefaultImpls;->appendTrafficAnalytics(Lio/streamroot/dna/core/monitoring/Watcher;Lorg/json/JSONObject;)V

    return-void
.end method

.method public getType()Lio/streamroot/dna/core/monitoring/WatchType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 60
    sget-object v0, Lio/streamroot/dna/core/monitoring/WatchType;->MEMORY:Lio/streamroot/dna/core/monitoring/WatchType;

    return-object v0
.end method

.method public priority()I
    .locals 1

    .line 45
    invoke-static {p0}, Lio/streamroot/dna/core/monitoring/Watcher$DefaultImpls;->priority(Lio/streamroot/dna/core/monitoring/Watcher;)I

    move-result v0

    return v0
.end method

.method public statusPhrase()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[MemoryWatch: type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->getType()Lio/streamroot/dna/core/monitoring/WatchType;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " threatLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->currentThreatLevel:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/streamroot/dna/core/monitoring/ThreatLevel;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " maxMemory:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->memoryService:Lio/streamroot/dna/core/system/MemoryService;

    invoke-virtual {v1}, Lio/streamroot/dna/core/system/MemoryService;->maxMemory()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " allocatedMemory:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->memoryService:Lio/streamroot/dna/core/system/MemoryService;

    invoke-virtual {v1}, Lio/streamroot/dna/core/system/MemoryService;->allocatedMemory()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " freeAllocatedMemory:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->memoryService:Lio/streamroot/dna/core/system/MemoryService;

    invoke-virtual {v1}, Lio/streamroot/dna/core/system/MemoryService;->freeAllocatedMemory()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " maxFreeMemory:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->memoryService:Lio/streamroot/dna/core/system/MemoryService;

    invoke-virtual {v1}, Lio/streamroot/dna/core/system/MemoryService;->maxFreeMemory()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public watch()Lio/streamroot/dna/core/monitoring/WatchResult;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 64
    invoke-direct {p0}, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->determineThreatLevelFromMemoryState()Lio/streamroot/dna/core/monitoring/ThreatLevel;

    move-result-object v0

    .line 66
    iget-object v1, p0, Lio/streamroot/dna/core/monitoring/MemoryWatcher;->currentThreatLevel:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 68
    new-instance v1, Lio/streamroot/dna/core/monitoring/WatchResult;

    sget-object v2, Lio/streamroot/dna/core/monitoring/WatchType;->MEMORY:Lio/streamroot/dna/core/monitoring/WatchType;

    invoke-direct {v1, v2, v0}, Lio/streamroot/dna/core/monitoring/WatchResult;-><init>(Lio/streamroot/dna/core/monitoring/WatchType;Lio/streamroot/dna/core/monitoring/ThreatLevel;)V

    return-object v1
.end method
