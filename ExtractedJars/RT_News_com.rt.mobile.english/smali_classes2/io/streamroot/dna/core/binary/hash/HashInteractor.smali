.class public final Lio/streamroot/dna/core/binary/hash/HashInteractor;
.super Ljava/lang/Object;
.source "HashInteractor.kt"

# interfaces
.implements Lio/streamroot/dna/core/js/PanamaInteractor;
.implements Lio/streamroot/dna/core/analytics/AnalyticsReporter;
.implements Ljava/lang/AutoCloseable;


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
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0008\u0010\u0018\u001a\u00020\u0015H\u0016J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0008\u0010\u001e\u001a\u00020\u001bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lio/streamroot/dna/core/binary/hash/HashInteractor;",
        "Lio/streamroot/dna/core/js/PanamaInteractor;",
        "Lio/streamroot/dna/core/analytics/AnalyticsReporter;",
        "Ljava/lang/AutoCloseable;",
        "hashHandler",
        "Lio/streamroot/dna/core/binary/hash/HashHandler;",
        "binaryDataStore",
        "Lio/streamroot/dna/core/binary/store/BinaryDataStore;",
        "dnaCoroutineContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "dispatcher",
        "Lkotlinx/coroutines/CoroutineDispatcher;",
        "(Lio/streamroot/dna/core/binary/hash/HashHandler;Lio/streamroot/dna/core/binary/store/BinaryDataStore;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineDispatcher;)V",
        "byteHashed",
        "Ljava/util/concurrent/atomic/AtomicLong;",
        "hashCheckCounter",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "supervisor",
        "Lkotlinx/coroutines/Job;",
        "timeSpentHashing",
        "appendStatsAnalytics",
        "",
        "statsPayload",
        "Lorg/json/JSONObject;",
        "close",
        "forge",
        "binaryDataId",
        "",
        "size",
        "",
        "name",
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
.field private final binaryDataStore:Lio/streamroot/dna/core/binary/store/BinaryDataStore;

.field private final byteHashed:Ljava/util/concurrent/atomic/AtomicLong;

.field private final dispatcher:Lkotlinx/coroutines/CoroutineDispatcher;

.field private final dnaCoroutineContext:Lkotlin/coroutines/CoroutineContext;

.field private final hashCheckCounter:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final hashHandler:Lio/streamroot/dna/core/binary/hash/HashHandler;

.field private final supervisor:Lkotlinx/coroutines/Job;

.field private final timeSpentHashing:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/binary/hash/HashHandler;Lio/streamroot/dna/core/binary/store/BinaryDataStore;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineDispatcher;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/binary/hash/HashHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/binary/store/BinaryDataStore;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlinx/coroutines/CoroutineDispatcher;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "hashHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binaryDataStore"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dnaCoroutineContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcher"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/binary/hash/HashInteractor;->hashHandler:Lio/streamroot/dna/core/binary/hash/HashHandler;

    iput-object p2, p0, Lio/streamroot/dna/core/binary/hash/HashInteractor;->binaryDataStore:Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    iput-object p3, p0, Lio/streamroot/dna/core/binary/hash/HashInteractor;->dnaCoroutineContext:Lkotlin/coroutines/CoroutineContext;

    iput-object p4, p0, Lio/streamroot/dna/core/binary/hash/HashInteractor;->dispatcher:Lkotlinx/coroutines/CoroutineDispatcher;

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 29
    invoke-static {p1, p2, p1}, Lkotlinx/coroutines/SupervisorKt;->SupervisorJob$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/binary/hash/HashInteractor;->supervisor:Lkotlinx/coroutines/Job;

    .line 30
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lio/streamroot/dna/core/binary/hash/HashInteractor;->hashCheckCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 31
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 p2, 0x0

    invoke-direct {p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lio/streamroot/dna/core/binary/hash/HashInteractor;->byteHashed:Ljava/util/concurrent/atomic/AtomicLong;

    .line 32
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lio/streamroot/dna/core/binary/hash/HashInteractor;->timeSpentHashing:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public synthetic constructor <init>(Lio/streamroot/dna/core/binary/hash/HashHandler;Lio/streamroot/dna/core/binary/store/BinaryDataStore;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineDispatcher;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 27
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getDefault()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p4

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lio/streamroot/dna/core/binary/hash/HashInteractor;-><init>(Lio/streamroot/dna/core/binary/hash/HashHandler;Lio/streamroot/dna/core/binary/store/BinaryDataStore;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineDispatcher;)V

    return-void
.end method

.method public static final synthetic access$getBinaryDataStore$p(Lio/streamroot/dna/core/binary/hash/HashInteractor;)Lio/streamroot/dna/core/binary/store/BinaryDataStore;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 23
    iget-object p0, p0, Lio/streamroot/dna/core/binary/hash/HashInteractor;->binaryDataStore:Lio/streamroot/dna/core/binary/store/BinaryDataStore;

    return-object p0
.end method

.method public static final synthetic access$getByteHashed$p(Lio/streamroot/dna/core/binary/hash/HashInteractor;)Ljava/util/concurrent/atomic/AtomicLong;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 23
    iget-object p0, p0, Lio/streamroot/dna/core/binary/hash/HashInteractor;->byteHashed:Ljava/util/concurrent/atomic/AtomicLong;

    return-object p0
.end method

.method public static final synthetic access$getHashCheckCounter$p(Lio/streamroot/dna/core/binary/hash/HashInteractor;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 23
    iget-object p0, p0, Lio/streamroot/dna/core/binary/hash/HashInteractor;->hashCheckCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static final synthetic access$getHashHandler$p(Lio/streamroot/dna/core/binary/hash/HashInteractor;)Lio/streamroot/dna/core/binary/hash/HashHandler;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 23
    iget-object p0, p0, Lio/streamroot/dna/core/binary/hash/HashInteractor;->hashHandler:Lio/streamroot/dna/core/binary/hash/HashHandler;

    return-object p0
.end method

.method public static final synthetic access$getTimeSpentHashing$p(Lio/streamroot/dna/core/binary/hash/HashInteractor;)Ljava/util/concurrent/atomic/AtomicLong;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 23
    iget-object p0, p0, Lio/streamroot/dna/core/binary/hash/HashInteractor;->timeSpentHashing:Ljava/util/concurrent/atomic/AtomicLong;

    return-object p0
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

    .line 23
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendControlAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public appendStatsAnalytics(Lorg/json/JSONObject;)V
    .locals 7
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "statsPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    .line 59
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "native"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "binaryData"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const-string v1, "hash"

    const/4 v3, 0x2

    aput-object v1, v0, v3

    invoke-static {p1, v0}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->getOrInsertJSONObject(Lorg/json/JSONObject;[Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "timeSpentHashing"

    .line 60
    iget-object v1, p0, Lio/streamroot/dna/core/binary/hash/HashInteractor;->timeSpentHashing:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v3, 0x0

    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    move-result-wide v5

    invoke-virtual {p1, v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "byteHashed"

    .line 61
    iget-object v1, p0, Lio/streamroot/dna/core/binary/hash/HashInteractor;->byteHashed:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    move-result-wide v3

    invoke-virtual {p1, v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "hashCheckCount"

    .line 62
    iget-object v1, p0, Lio/streamroot/dna/core/binary/hash/HashInteractor;->hashCheckCounter:Ljava/util/concurrent/atomic/AtomicInteger;

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

    .line 23
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

    .line 23
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendTrafficAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public close()V
    .locals 1

    .line 66
    iget-object v0, p0, Lio/streamroot/dna/core/binary/hash/HashInteractor;->supervisor:Lkotlinx/coroutines/Job;

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->cancel()V

    return-void
.end method

.method public final forge(Ljava/lang/String;I)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "binaryDataId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    sget-object v0, Lkotlinx/coroutines/GlobalScope;->INSTANCE:Lkotlinx/coroutines/GlobalScope;

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    iget-object v0, p0, Lio/streamroot/dna/core/binary/hash/HashInteractor;->dnaCoroutineContext:Lkotlin/coroutines/CoroutineContext;

    iget-object v2, p0, Lio/streamroot/dna/core/binary/hash/HashInteractor;->supervisor:Lkotlinx/coroutines/Job;

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    iget-object v2, p0, Lio/streamroot/dna/core/binary/hash/HashInteractor;->dispatcher:Lkotlinx/coroutines/CoroutineDispatcher;

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    new-instance v0, Lio/streamroot/dna/core/binary/hash/HashInteractor$forge$1;

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, p2, v3}, Lio/streamroot/dna/core/binary/hash/HashInteractor$forge$1;-><init>(Lio/streamroot/dna/core/binary/hash/HashInteractor;Ljava/lang/String;ILkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public name()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "HashInteractor"

    return-object v0
.end method

.method public priority()I
    .locals 1

    .line 23
    invoke-static {p0}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->priority(Lio/streamroot/dna/core/analytics/AnalyticsReporter;)I

    move-result v0

    return v0
.end method
