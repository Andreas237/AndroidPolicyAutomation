.class public abstract Lio/streamroot/dna/core/binary/store/ChunkPool;
.super Ljava/lang/Object;
.source "ChunkPool.kt"

# interfaces
.implements Lio/streamroot/dna/core/analytics/AnalyticsReporter;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChunkPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChunkPool.kt\nio/streamroot/dna/core/binary/store/ChunkPool\n+ 2 IntrinsicArrayConstructors.kt\norg/jetbrains/kotlin/codegen/intrinsics/IntrinsicArrayConstructorsKt\n*L\n1#1,114:1\n42#2,5:115\n*E\n*S KotlinDebug\n*F\n+ 1 ChunkPool.kt\nio/streamroot/dna/core/binary/store/ChunkPool\n*L\n35#1,5:115\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0015\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J%\u0010\u0016\u001a\u0014\u0012\u000c\u0012\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e0\u0017j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\n\u0010\u001f\u001a\u00060\rj\u0002`\u000eJ@\u0010\u001f\u001a\u0014\u0012\u000c\u0012\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e0\u0017j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020 2\u0016\u0010!\u001a\u0012\u0012\u0008\u0012\u00060\rj\u0002`\u000e\u0012\u0004\u0012\u00020\u001c0\"H\u0086\u0008\u00a2\u0006\u0002\u0010#J\u0018\u0010$\u001a\u00060\rj\u0002`\u000e2\n\u0010%\u001a\u00060\rj\u0002`\u000eH\u0002J\u0008\u0010&\u001a\u00020\u0003H\u0002J\u000c\u0010\'\u001a\u00060\rj\u0002`\u000eH$J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u0003H\u0002J\u0012\u0010*\u001a\u00020\u001c2\n\u0010%\u001a\u00060\rj\u0002`\u000eJ!\u0010*\u001a\u00020\u001c2\u0014\u0010+\u001a\u0010\u0012\u000c\u0012\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e0\u0017\u00a2\u0006\u0002\u0010,J\u0010\u0010-\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0002J\u0014\u0010.\u001a\u00020/2\n\u00100\u001a\u00060\rj\u0002`\u000eH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u000c\u0012\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"
    }
    d2 = {
        "Lio/streamroot/dna/core/binary/store/ChunkPool;",
        "Lio/streamroot/dna/core/analytics/AnalyticsReporter;",
        "capacity",
        "",
        "chunkSize",
        "(II)V",
        "getCapacity",
        "()I",
        "getChunkSize",
        "failedReclaimedCount",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "instances",
        "Ljava/util/concurrent/atomic/AtomicReferenceArray;",
        "Ljava/nio/ByteBuffer;",
        "Lio/streamroot/dna/core/utils/Chunk;",
        "maxIndex",
        "next",
        "",
        "reclaimedCount",
        "shift",
        "top",
        "Ljava/util/concurrent/atomic/AtomicLong;",
        "allocate",
        "",
        "Lio/streamroot/dna/core/utils/ChunkArray;",
        "size",
        "(I)[Ljava/nio/ByteBuffer;",
        "appendStatsAnalytics",
        "",
        "statsPayload",
        "Lorg/json/JSONObject;",
        "borrow",
        "",
        "block",
        "Lkotlin/Function1;",
        "(JLkotlin/jvm/functions/Function1;)[Ljava/nio/ByteBuffer;",
        "clearInstance",
        "chunk",
        "popTop",
        "produceInstance",
        "pushTop",
        "index",
        "recycle",
        "chunks",
        "([Ljava/nio/ByteBuffer;)V",
        "tryPop",
        "tryPush",
        "",
        "instance",
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
.field private final capacity:I

.field private final chunkSize:I

.field private final failedReclaimedCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final instances:Ljava/util/concurrent/atomic/AtomicReferenceArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceArray<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation
.end field

.field private final maxIndex:I

.field private final next:[I

.field private final reclaimedCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final shift:I

.field private volatile top:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>(II)V
    .locals 2

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->capacity:I

    iput p2, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->chunkSize:I

    .line 19
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->reclaimedCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->failedReclaimedCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v0, 0x0

    invoke-direct {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->top:Ljava/util/concurrent/atomic/AtomicLong;

    .line 25
    iget p1, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->capacity:I

    mul-int/lit8 p1, p1, 0x4

    add-int/lit8 p1, p1, -0x1

    invoke-static {p1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    iput p1, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->maxIndex:I

    .line 26
    iget p1, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->maxIndex:I

    invoke-static {p1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->shift:I

    .line 29
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iget p2, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->maxIndex:I

    add-int/lit8 p2, p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    iput-object p1, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->instances:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 30
    iget p1, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->maxIndex:I

    add-int/lit8 p1, p1, 0x1

    new-array p1, p1, [I

    iput-object p1, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->next:[I

    return-void
.end method

.method private final clearInstance(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 0

    .line 59
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    return-object p1
.end method

.method private final popTop()I
    .locals 12

    .line 94
    :cond_0
    iget-object v0, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->top:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    const/4 v2, 0x0

    if-nez v4, :cond_1

    return v2

    :cond_1
    const/16 v3, 0x20

    shr-long v4, v0, v3

    const-wide v6, 0xffffffffL

    and-long v8, v4, v6

    const-wide/16 v4, 0x1

    add-long v10, v8, v4

    and-long v4, v0, v6

    long-to-int v4, v4

    if-nez v4, :cond_2

    return v2

    .line 99
    :cond_2
    iget-object v2, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->next:[I

    aget v2, v2, v4

    shl-long v5, v10, v3

    int-to-long v2, v2

    or-long v7, v5, v2

    .line 101
    iget-object v2, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->top:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2, v0, v1, v7, v8}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    return v4
.end method

.method private final pushTop(I)V
    .locals 11

    if-lez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string p1, "index should be positive"

    .line 81
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    .line 83
    :cond_1
    iget-object v0, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->top:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const/16 v2, 0x20

    shr-long v3, v0, v2

    const-wide v5, 0xffffffffL

    and-long v7, v3, v5

    const-wide/16 v3, 0x1

    add-long v9, v7, v3

    and-long v3, v0, v5

    long-to-int v3, v3

    shl-long v4, v9, v2

    int-to-long v6, p1

    or-long v8, v4, v6

    .line 87
    iget-object v2, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->next:[I

    aput v3, v2, p1

    .line 88
    iget-object v2, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->top:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2, v0, v1, v8, v9}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void
.end method

.method private final tryPop()Ljava/nio/ByteBuffer;
    .locals 3

    .line 76
    invoke-direct {p0}, Lio/streamroot/dna/core/binary/store/ChunkPool;->popTop()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 77
    :cond_0
    iget-object v2, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->instances:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/nio/ByteBuffer;

    :goto_0
    return-object v1
.end method

.method private final tryPush(Ljava/nio/ByteBuffer;)Z
    .locals 6

    .line 62
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    const v1, -0x61c88647

    mul-int/2addr v0, v1

    iget v1, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->shift:I

    ushr-int/2addr v0, v1

    const/4 v1, 0x1

    add-int/2addr v0, v1

    const/4 v2, 0x0

    move v3, v0

    move v0, v2

    :goto_0
    const/16 v4, 0x8

    if-ge v0, v4, :cond_2

    .line 64
    iget-object v4, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->instances:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    const/4 v5, 0x0

    invoke-virtual {v4, v3, v5, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 65
    iget-object p1, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->reclaimedCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 66
    invoke-direct {p0, v3}, Lio/streamroot/dna/core/binary/store/ChunkPool;->pushTop(I)V

    return v1

    :cond_0
    add-int/lit8 v3, v3, -0x1

    if-nez v3, :cond_1

    .line 69
    iget v3, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->maxIndex:I

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 71
    :cond_2
    iget-object p1, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->failedReclaimedCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    return v2
.end method


# virtual methods
.method public final allocate(I)[Ljava/nio/ByteBuffer;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    int-to-double v0, p1

    .line 32
    iget p1, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->chunkSize:I

    int-to-double v2, p1

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p1, v0

    new-array p1, p1, [Ljava/nio/ByteBuffer;

    return-object p1
.end method

.method public appendControlAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "controlPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
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

    .line 52
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "native"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "binaryData"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    invoke-static {p1, v0}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->getOrInsertJSONObject(Lorg/json/JSONObject;[Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "chunkFailedRecycledCount"

    .line 53
    iget-object v1, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->failedReclaimedCount:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "chunkRecycledCount"

    .line 54
    iget-object v1, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->reclaimedCount:Ljava/util/concurrent/atomic/AtomicInteger;

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

    .line 18
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

    .line 18
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendTrafficAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final borrow()Ljava/nio/ByteBuffer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 38
    invoke-direct {p0}, Lio/streamroot/dna/core/binary/store/ChunkPool;->tryPop()Ljava/nio/ByteBuffer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lio/streamroot/dna/core/binary/store/ChunkPool;->clearInstance(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lio/streamroot/dna/core/binary/store/ChunkPool;->produceInstance()Ljava/nio/ByteBuffer;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final borrow(JLkotlin/jvm/functions/Function1;)[Ljava/nio/ByteBuffer;
    .locals 2
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/nio/ByteBuffer;",
            "Lkotlin/Unit;",
            ">;)[",
            "Ljava/nio/ByteBuffer;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "block"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    long-to-double p1, p1

    .line 35
    invoke-virtual {p0}, Lio/streamroot/dna/core/binary/store/ChunkPool;->getChunkSize()I

    move-result v0

    int-to-double v0, v0

    div-double/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p1

    double-to-int p1, p1

    .line 115
    new-array p1, p1, [Ljava/nio/ByteBuffer;

    const/4 p2, 0x0

    .line 116
    array-length v0, p1

    :goto_0
    if-ge p2, v0, :cond_0

    .line 35
    invoke-virtual {p0}, Lio/streamroot/dna/core/binary/store/ChunkPool;->borrow()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-interface {p3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    aput-object v1, p1, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method public final getCapacity()I
    .locals 1

    .line 18
    iget v0, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->capacity:I

    return v0
.end method

.method public final getChunkSize()I
    .locals 1

    .line 18
    iget v0, p0, Lio/streamroot/dna/core/binary/store/ChunkPool;->chunkSize:I

    return v0
.end method

.method public priority()I
    .locals 1

    .line 18
    invoke-static {p0}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->priority(Lio/streamroot/dna/core/analytics/AnalyticsReporter;)I

    move-result v0

    return v0
.end method

.method protected abstract produceInstance()Ljava/nio/ByteBuffer;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public final recycle(Ljava/nio/ByteBuffer;)V
    .locals 1
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "chunk"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-direct {p0, p1}, Lio/streamroot/dna/core/binary/store/ChunkPool;->tryPush(Ljava/nio/ByteBuffer;)Z

    return-void
.end method

.method public final recycle([Ljava/nio/ByteBuffer;)V
    .locals 3
    .param p1    # [Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "chunks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 45
    array-length v1, p1

    :goto_0
    if-ge v0, v1, :cond_1

    .line 46
    aget-object v2, p1, v0

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, Lio/streamroot/dna/core/binary/store/ChunkPool;->recycle(Ljava/nio/ByteBuffer;)V

    :cond_0
    const/4 v2, 0x0

    .line 47
    check-cast v2, Ljava/nio/ByteBuffer;

    aput-object v2, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
