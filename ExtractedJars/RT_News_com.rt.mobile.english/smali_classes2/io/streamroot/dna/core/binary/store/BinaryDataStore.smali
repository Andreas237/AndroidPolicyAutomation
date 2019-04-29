.class public final Lio/streamroot/dna/core/binary/store/BinaryDataStore;
.super Ljava/lang/Object;
.source "BinaryDataStore.kt"

# interfaces
.implements Lio/streamroot/dna/core/analytics/AnalyticsReporter;
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBinaryDataStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryDataStore.kt\nio/streamroot/dna/core/binary/store/BinaryDataStore\n+ 2 Chunk.kt\nio/streamroot/dna/core/utils/ChunkKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,80:1\n23#2,2:81\n25#2,6:85\n31#2:92\n10732#3,2:83\n10734#3:91\n*E\n*S KotlinDebug\n*F\n+ 1 BinaryDataStore.kt\nio/streamroot/dna/core/binary/store/BinaryDataStore\n*L\n54#1,2:81\n54#1,6:85\n54#1:92\n54#1,2:83\n54#1:91\n*E\n"
.end annotation

.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0008\u001a\u00020\tJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0008\u0010\u0017\u001a\u00020\u0014H\u0016J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u000eJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u000eJ\u001e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\tJ\u000e\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0008\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u001a\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lio/streamroot/dna/core/binary/store/BinaryDataStore;",
        "Lio/streamroot/dna/core/analytics/AnalyticsReporter;",
        "Ljava/lang/AutoCloseable;",
        "chunkPool",
        "Lio/streamroot/dna/core/binary/store/ChunkPool;",
        "(Lio/streamroot/dna/core/binary/store/ChunkPool;)V",
        "forceRemoveCounter",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "size",
        "",
        "getSize",
        "()I",
        "store",
        "Landroid/util/ArrayMap;",
        "",
        "Lio/streamroot/dna/core/binary/store/BinaryData;",
        "add",
        "binaryData",
        "allocate",
        "appendStatsAnalytics",
        "",
        "statsPayload",
        "Lorg/json/JSONObject;",
        "close",
        "get",
        "segmentId",
        "getAndRemove",
        "merge",
        "binaryDataIdSrc",
        "binaryDataIdDest",
        "offset",
        "recycle",
        "binaryDataId",
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
.field private final chunkPool:Lio/streamroot/dna/core/binary/store/ChunkPool;

.field private final forceRemoveCounter:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final store:Landroid/util/ArrayMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/ArrayMap<",
            "Ljava/lang/String;",
            "Lio/streamroot/dna/core/binary/store/BinaryData;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/binary/store/ChunkPool;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/binary/store/ChunkPool;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "chunkPool"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->chunkPool:Lio/streamroot/dna/core/binary/store/ChunkPool;

    .line 15
    new-instance p1, Landroid/util/ArrayMap;

    invoke-direct {p1}, Landroid/util/ArrayMap;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->store:Landroid/util/ArrayMap;

    .line 16
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->forceRemoveCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public final declared-synchronized add(Lio/streamroot/dna/core/binary/store/BinaryData;)Ljava/lang/String;
    .locals 2
    .param p1    # Lio/streamroot/dna/core/binary/store/BinaryData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "binaryData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    iget-object v0, p0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->store:Landroid/util/ArrayMap;

    invoke-virtual {p1}, Lio/streamroot/dna/core/binary/store/BinaryData;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/binary/store/BinaryData;

    if-eqz v0, :cond_0

    .line 35
    iget-object v1, p0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->chunkPool:Lio/streamroot/dna/core/binary/store/ChunkPool;

    invoke-virtual {v0}, Lio/streamroot/dna/core/binary/store/BinaryData;->getChunks()[Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lio/streamroot/dna/core/binary/store/ChunkPool;->recycle([Ljava/nio/ByteBuffer;)V

    .line 38
    :cond_0
    invoke-virtual {p1}, Lio/streamroot/dna/core/binary/store/BinaryData;->getId()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    .line 33
    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized allocate(I)Ljava/lang/String;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    monitor-enter p0

    .line 23
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->chunkPool:Lio/streamroot/dna/core/binary/store/ChunkPool;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/binary/store/ChunkPool;->allocate(I)[Ljava/nio/ByteBuffer;

    move-result-object v3

    .line 24
    new-instance v0, Lio/streamroot/dna/core/binary/store/BinaryData;

    const/4 v2, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, v0

    move v4, p1

    invoke-direct/range {v1 .. v6}, Lio/streamroot/dna/core/binary/store/BinaryData;-><init>(Ljava/lang/String;[Ljava/nio/ByteBuffer;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 26
    iget-object p1, p0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->store:Landroid/util/ArrayMap;

    invoke-virtual {v0}, Lio/streamroot/dna/core/binary/store/BinaryData;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/binary/store/BinaryData;

    if-eqz p1, :cond_0

    .line 27
    iget-object v1, p0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->chunkPool:Lio/streamroot/dna/core/binary/store/ChunkPool;

    invoke-virtual {p1}, Lio/streamroot/dna/core/binary/store/BinaryData;->getChunks()[Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {v1, p1}, Lio/streamroot/dna/core/binary/store/ChunkPool;->recycle([Ljava/nio/ByteBuffer;)V

    .line 29
    :cond_0
    invoke-virtual {v0}, Lio/streamroot/dna/core/binary/store/BinaryData;->getId()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    .line 22
    monitor-exit p0

    throw p1
.end method

.method public appendControlAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "controlPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendControlAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

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

    const/4 v0, 0x2

    .line 76
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "native"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "binaryData"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    invoke-static {p1, v0}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->getOrInsertJSONObject(Lorg/json/JSONObject;[Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "storeSizeSampled"

    .line 77
    iget-object v1, p0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->store:Landroid/util/ArrayMap;

    invoke-virtual {v1}, Landroid/util/ArrayMap;->size()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "forceRemoveCount"

    .line 78
    iget-object v1, p0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->forceRemoveCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

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

    .line 12
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendSupportAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

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

    .line 12
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendTrafficAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public declared-synchronized close()V
    .locals 1

    monitor-enter p0

    .line 72
    :try_start_0
    iget-object v0, p0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->store:Landroid/util/ArrayMap;

    invoke-virtual {v0}, Landroid/util/ArrayMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 71
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized get(Ljava/lang/String;)Lio/streamroot/dna/core/binary/store/BinaryData;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "segmentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    iget-object v0, p0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->store:Landroid/util/ArrayMap;

    invoke-virtual {v0, p1}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/binary/store/BinaryData;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized getAndRemove(Ljava/lang/String;)Lio/streamroot/dna/core/binary/store/BinaryData;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "segmentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    iget-object v0, p0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->forceRemoveCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 47
    iget-object v0, p0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->store:Landroid/util/ArrayMap;

    invoke-virtual {v0, p1}, Landroid/util/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/binary/store/BinaryData;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    .line 45
    monitor-exit p0

    throw p1
.end method

.method public final getSize()I
    .locals 1

    .line 19
    iget-object v0, p0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->store:Landroid/util/ArrayMap;

    invoke-virtual {v0}, Landroid/util/ArrayMap;->size()I

    move-result v0

    return v0
.end method

.method public final declared-synchronized merge(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "binaryDataIdSrc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binaryDataIdDest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    .line 54
    :cond_0
    :try_start_1
    iget-object v0, p0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->store:Landroid/util/ArrayMap;

    invoke-virtual {v0, p1}, Landroid/util/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/binary/store/BinaryData;

    if-eqz p1, :cond_5

    .line 55
    iget-object v0, p0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->store:Landroid/util/ArrayMap;

    invoke-virtual {v0, p2}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/streamroot/dna/core/binary/store/BinaryData;

    if-eqz p2, :cond_4

    .line 56
    invoke-virtual {p1}, Lio/streamroot/dna/core/binary/store/BinaryData;->getChunks()[Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p2}, Lio/streamroot/dna/core/binary/store/BinaryData;->getChunks()[Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 81
    invoke-static {v0}, Lio/streamroot/dna/core/utils/ChunkKt;->chunkCapacity([Ljava/nio/ByteBuffer;)I

    move-result v2

    div-int/2addr p3, v2

    .line 84
    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v5, v0, v3

    add-int/lit8 v6, v4, 0x1

    add-int/2addr v4, p3

    if-eqz v5, :cond_2

    .line 87
    aget-object v7, v1, v4

    if-eqz v7, :cond_1

    .line 58
    iget-object v8, p0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->chunkPool:Lio/streamroot/dna/core/binary/store/ChunkPool;

    invoke-virtual {v8, v7}, Lio/streamroot/dna/core/binary/store/ChunkPool;->recycle(Ljava/nio/ByteBuffer;)V

    .line 88
    :cond_1
    aput-object v5, v1, v4

    :cond_2
    add-int/lit8 v3, v3, 0x1

    move v4, v6

    goto :goto_0

    :cond_3
    if-eqz p2, :cond_4

    goto :goto_1

    .line 60
    :cond_4
    iget-object p2, p0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->chunkPool:Lio/streamroot/dna/core/binary/store/ChunkPool;

    invoke-virtual {p1}, Lio/streamroot/dna/core/binary/store/BinaryData;->getChunks()[Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/streamroot/dna/core/binary/store/ChunkPool;->recycle([Ljava/nio/ByteBuffer;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    :cond_5
    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 51
    monitor-exit p0

    throw p1
.end method

.method public priority()I
    .locals 1

    .line 12
    invoke-static {p0}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->priority(Lio/streamroot/dna/core/analytics/AnalyticsReporter;)I

    move-result v0

    return v0
.end method

.method public final declared-synchronized recycle(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "binaryDataId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    iget-object v0, p0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->store:Landroid/util/ArrayMap;

    invoke-virtual {v0, p1}, Landroid/util/ArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/streamroot/dna/core/binary/store/BinaryData;

    if-eqz p1, :cond_0

    .line 67
    iget-object v0, p0, Lio/streamroot/dna/core/binary/store/BinaryDataStore;->chunkPool:Lio/streamroot/dna/core/binary/store/ChunkPool;

    invoke-virtual {p1}, Lio/streamroot/dna/core/binary/store/BinaryData;->getChunks()[Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/binary/store/ChunkPool;->recycle([Ljava/nio/ByteBuffer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 65
    monitor-exit p0

    throw p1
.end method
